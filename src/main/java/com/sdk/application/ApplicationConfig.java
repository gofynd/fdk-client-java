package com.sdk.application;

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
public class ApplicationConfig {

    private String applicationId;

    private String applicationToken;

    private String domain = "https://api.fynd.com";

    private String userAgent = "google";

    private HashMap<String,String> extraHeaders = new HashMap<>();

    private CookieStore persistentCookieStore = new CookieManager().getCookieStore();

    private volatile RetrofitServiceFactory retrofitServiceFactory;

    /**
     * Context for the single shared FDK client. Used when {@link FDKSharedClient#init(String)} has been called.
     */
    public FDKContext getFDKContext() {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new ApplicationHeaderInterceptor(this));
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
                    interceptors.add(new ApplicationHeaderInterceptor(this));
                    interceptors.add(new RequestSignerInterceptor());
                    retrofitServiceFactory.initSharedRetrofit(getDomain(), getPersistentCookieStore(), interceptors);
                }
            }
        }
        return retrofitServiceFactory;
    }

    public ApplicationConfig(String applicationId, String applicationToken, String domain) {
        this.applicationId = applicationId;
        this.applicationToken = applicationToken;
        this.domain = domain;
        var regex = "^[0-9a-fA-F]{24}$";
        if (!this.applicationId.matches(regex)) {
            throw new IllegalArgumentException("Invalid Application Id");
        }
    }

    public ApplicationConfig(String applicationId, String applicationToken) {
        this(applicationId, applicationToken, "https://api.fynd.com");
    }
}