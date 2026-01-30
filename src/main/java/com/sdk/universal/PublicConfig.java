package com.sdk.universal;

import com.sdk.common.FDKContext;
import com.sdk.common.FDKContextImpl;
import com.sdk.common.FDKGlobalRetrofitFactory;
import com.sdk.common.FDKSharedClient;
import com.sdk.common.RetrofitServiceFactory;
import com.sdk.common.RequestSignerInterceptor;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class PublicConfig {
    private String applicationToken;

    private String domain = "https://api.fynd.com";

    private String userAgent = "google";

    private String language = "en-IN";

    private String currency = "INR";

    private Boolean debuggable = false;

    private CookieStore persistentCookieStore = new CookieManager().getCookieStore();
    private HashMap<String,String> extraHeaders = new HashMap<>();

    private volatile RetrofitServiceFactory retrofitServiceFactory;

    /**
     * Context for the single shared FDK client. Used when {@link FDKSharedClient#init(String)} has been called.
     */
    public FDKContext getFDKContext() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new PublicHeaderInterceptor(this));
        interceptors.add(new RequestSignerInterceptor());
        return new FDKContextImpl(getPersistentCookieStore(), interceptors);
    }

    /**
     * Returns a shared RetrofitServiceFactory. If {@link FDKSharedClient#init(String)} has been called,
     * returns a factory that uses the single global Retrofit/OkHttp client; otherwise uses one client per config.
     */
    public RetrofitServiceFactory getRetrofitServiceFactory() {
        if (FDKSharedClient.isInitialized()) {
            return new FDKGlobalRetrofitFactory(getFDKContext());
        }
        if (retrofitServiceFactory == null) {
            synchronized (this) {
                if (retrofitServiceFactory == null) {
                    retrofitServiceFactory = new RetrofitServiceFactory();
                    List<Interceptor> interceptors = new ArrayList<>();
                    interceptors.add(new PublicHeaderInterceptor(this));
                    interceptors.add(new RequestSignerInterceptor());
                    retrofitServiceFactory.initSharedRetrofit(getDomain(), getPersistentCookieStore(), interceptors);
                }
            }
        }
        return retrofitServiceFactory;
    }

    public PublicConfig(String applicationToken) {
        this.applicationToken = applicationToken;
    }

    public PublicConfig(String applicationToken, String domain) {
        this.applicationToken = applicationToken;
        this.domain = domain;
    }
}