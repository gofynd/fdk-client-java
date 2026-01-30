package com.sdk.common;

import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.cert.CertificateException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.moczul.ok2curl.CurlInterceptor;
import retrofit2.Call;

/**
 * Single shared Retrofit and OkHttp client for all FDK clients (Platform, Application, Partner, Universal).
 * Use {@link #init(String)} once (e.g. with your base URL), then obtain services via
 * {@link #getService(Class, FDKContext)}. Auth and cookies are applied per request from the
 * supplied {@link FDKContext}.
 * <p>
 * <b>Caveats:</b>
 * <ul>
 *   <li><b>Same base URL:</b> All configs must use the same base URL (domain). If you need
 *       multiple domains, use one FDKSharedClient per domain or fall back to per-config clients.</li>
 *   <li><b>Thread-bound context:</b> Context is set around each synchronous {@link Call#execute()}.
 *       Async ({@link Call#enqueue}) runs on a different thread; context is not propagated, so
 *       async may not get the correct auth/cookies unless you set context in the callback thread.</li>
 *   <li><b>Cookies:</b> Each request uses the CookieStore from its FDKContext. Cookies are
 *       isolated per context (no cross-contamination between Platform, Application, Partner, etc.).</li>
 * </ul>
 */
public final class FDKSharedClient {

    private static final int READ_TIMEOUT = 15;
    private static final int CONNECT_TIMEOUT = 60;
    private static final int WRITE_TIMEOUT = 60;
    private static final int KEEP_ALIVE = 10;
    private static final int IDLE_CONNECTION = 1;

    private static volatile FDKSharedClient instance;
    private static final Object lock = new Object();

    private final Retrofit retrofit;
    private final OkHttpClient okHttpClient;

    private FDKSharedClient(String baseUrl) {
        this.okHttpClient = buildSharedOkHttpClient();
        HttpUrl url = HttpUrl.parse(baseUrl);
        if (url == null) {
            throw new IllegalArgumentException("Invalid base URL: " + baseUrl);
        }
        this.retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    /**
     * Initializes the global shared client with the given base URL. Idempotent: subsequent calls
     * are ignored (first base URL wins). Call this before any {@link #getService(Class, FDKContext)}.
     *
     * @param baseUrl base URL for all API calls (e.g. "https://api.fynd.com"). All configs
     *                should use this same domain for true single-client behavior.
     */
    public static void init(String baseUrl) {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new FDKSharedClient(baseUrl);
                }
            }
        }
    }

    /**
     * Returns the singleton shared client. {@link #init(String)} must have been called first.
     */
    public static FDKSharedClient get() {
        if (instance == null) {
            throw new IllegalStateException("FDKSharedClient.init(baseUrl) must be called first");
        }
        return instance;
    }

    /**
     * Returns true if the shared client has been initialized.
     */
    public static boolean isInitialized() {
        return instance != null;
    }

    /**
     * Returns a service that uses the shared Retrofit. Each call's request will use the given
     * context for auth and cookies. The returned proxy wraps every {@link Call} so that
     * {@link Call#execute()} runs with that context set in {@link FDKContextHolder}.
     *
     * @param serviceClass Retrofit API interface (e.g. AnalyticsPlatformApiList.class)
     * @param context      context supplying cookie store and auth interceptor for this config
     */
    @SuppressWarnings("unchecked")
    public <S> S getService(Class<S> serviceClass, FDKContext context) {
        Object delegate = retrofit.create(serviceClass);
        return (S) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class<?>[] { serviceClass },
                new ContextAwareInvocationHandler(delegate, context));
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    private static OkHttpClient buildSharedOkHttpClient() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
                                throws CertificateException {}

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
                                throws CertificateException {}

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[] {};
                        }
                    }
            };
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            FDKLogger fdkLogger = new FDKLogger();
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor(fdkLogger).setLevel(HttpLoggingInterceptor.Level.BODY);
            CurlInterceptor ok2Curl = new CurlInterceptor(s -> fdkLogger.log(s));

            List<Interceptor> interceptors = new ArrayList<>();
            interceptors.add(new ContextAwareInterceptor());
            interceptors.add(logging);
            interceptors.add(ok2Curl);

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier((hostname, session) -> true);
            interceptors.forEach(builder::addInterceptor);
            builder.cookieJar(new ContextAwareCookieJar());
            builder.readTimeout(Duration.ofMinutes(READ_TIMEOUT).toMinutes(), TimeUnit.MINUTES);
            builder.connectTimeout(Duration.ofSeconds(CONNECT_TIMEOUT).getSeconds(), TimeUnit.SECONDS);
            builder.writeTimeout(Duration.ofSeconds(WRITE_TIMEOUT).getSeconds(), TimeUnit.SECONDS);
            builder.retryOnConnectionFailure(true);
            builder.connectionPool(new ConnectionPool(IDLE_CONNECTION, KEEP_ALIVE, TimeUnit.MINUTES));
            return builder.build();
        } catch (Exception e) {
            throw new FDKError(e.getMessage());
        }
    }

    private static class ContextAwareInvocationHandler implements InvocationHandler {
        private final Object delegate;
        private final FDKContext context;

        ContextAwareInvocationHandler(Object delegate, FDKContext context) {
            this.delegate = delegate;
            this.context = context;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = method.invoke(delegate, args);
            if (result instanceof Call) {
                return new ContextAwareCall<>((Call<?>) result, context);
            }
            return result;
        }
    }
}
