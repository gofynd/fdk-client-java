package com.sdk.common;

/**
 * Thin wrapper that delegates {@link #getService(Class)} to the global {@link FDKSharedClient}
 * with a fixed {@link FDKContext}. Use this when {@link FDKSharedClient#init(String)} has been
 * called so all clients share one Retrofit/OkHttp instance.
 */
public final class FDKGlobalRetrofitFactory extends RetrofitServiceFactory {

    private final FDKContext context;

    public FDKGlobalRetrofitFactory(FDKContext context) {
        super();
        this.context = context;
    }

    @Override
    public synchronized void initSharedRetrofit(String baseUrl, java.net.CookieStore cookieStore,
            java.util.List<okhttp3.Interceptor> interceptorList) {
        // No-op: global client is already initialized via FDKSharedClient.init(baseUrl).
    }

    @Override
    public <S> S getService(Class<S> serviceClass) {
        return FDKSharedClient.get().getService(serviceClass, context);
    }
}
