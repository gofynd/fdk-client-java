package com.sdk.platform;

import com.sdk.common.model.AccessTokenDto;
import lombok.Getter;
import lombok.Setter;

import java.net.CookieStore;
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

    public AccessTokenDto getAccessToken() {
        return this.platformOauthClient.getRawToken();
    }
}
