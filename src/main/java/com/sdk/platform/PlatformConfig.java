package com.sdk.platform;

import com.sdk.common.RetrofitServiceFactory;
import com.sdk.common.RequestSignerInterceptor;
import com.sdk.common.model.AccessTokenDto;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;

import java.net.CookieStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public final class PlatformConfig {
    private String companyId;
    private String domain = "https://api.fynd.com";
    private String apiKey;
    private String apiSecret;
    private Boolean useAutoRenewTimer;
    private CookieStore persistentCookieStore;
    private PlatformOauthClient platformOauthClient;
    private HashMap<String,String> extraHeaders = new HashMap<>();

    private volatile RetrofitServiceFactory retrofitServiceFactory;

    /**
     * Returns a shared RetrofitServiceFactory with a single Retrofit and OkHttp client for this config.
     * Lazily initialized on first use.
     */
    public RetrofitServiceFactory getRetrofitServiceFactory() {
        if (retrofitServiceFactory == null) {
            synchronized (this) {
                if (retrofitServiceFactory == null) {
                    retrofitServiceFactory = new RetrofitServiceFactory();
                    List<Interceptor> interceptors = new ArrayList<>();
                    interceptors.add(new AccessTokenInterceptor(this));
                    interceptors.add(new RequestSignerInterceptor());
                    retrofitServiceFactory.initSharedRetrofit(getDomain(), getPersistentCookieStore(), interceptors);
                }
            }
        }
        return retrofitServiceFactory;
    }

    public PlatformConfig(String companyId, String apiKey, String apiSecret, String domain, boolean useAutoRenewTimer) {
        if (Objects.isNull(companyId)) {
            throw new IllegalArgumentException("Please enter Valid Company ID");
        }
        this.companyId = companyId;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.domain = domain;
        this.useAutoRenewTimer = useAutoRenewTimer;
        this.platformOauthClient = new PlatformOauthClient(this);
    }

    public PlatformConfig(String companyId, String apiKey, String apiSecret, String domain) {
        if (Objects.isNull(companyId)) {
            throw new IllegalArgumentException("Please enter Valid Company ID");
        }
        this.companyId = companyId;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.domain = domain;
        this.platformOauthClient = new PlatformOauthClient(this);
    }

    public PlatformConfig(String companyId, String apiKey, String apiSecret) {
        this(companyId, apiKey, apiSecret, "https://api.fynd.com");
    }

    public AccessTokenDto getAccessToken() {
        return this.platformOauthClient.getRawToken();
    }
}
