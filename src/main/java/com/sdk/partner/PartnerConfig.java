package com.sdk.partner;

import com.sdk.common.model.AccessTokenDto;
import lombok.Getter;
import lombok.Setter;

import java.net.CookieStore;
import java.util.Objects;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public final class PartnerConfig {
    private String organizationId;
    private String domain = "https://api.fynd.com";
    private String apiKey;
    private String apiSecret;
    private Boolean useAutoRenewTimer;
    private CookieStore persistentCookieStore;
    private PartnerOauthClient partnerOauthClient;
    private HashMap<String,String> extraHeaders = new HashMap<>();

    public PartnerConfig(String organizationId, String apiKey, String apiSecret, String domain, boolean useAutoRenewTimer) {
        if (Objects.isNull(organizationId)) {
            throw new IllegalArgumentException("Please enter Valid Organization ID");
        }
        this.organizationId = organizationId;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.domain = domain;
        this.useAutoRenewTimer = useAutoRenewTimer;
        this.partnerOauthClient = new PartnerOauthClient(this);
    }

    public PartnerConfig(String organizationId, String apiKey, String apiSecret, String domain) {
        if (Objects.isNull(organizationId)) {
            throw new IllegalArgumentException("Please enter Valid Organization ID");
        }
        this.organizationId = organizationId;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.domain = domain;
        this.partnerOauthClient = new PartnerOauthClient(this);
    }

    public AccessTokenDto getAccessToken() {
        return this.partnerOauthClient.getRawToken();
    }
}
