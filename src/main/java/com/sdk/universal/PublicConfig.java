package com.sdk.universal;
import lombok.Getter;
import lombok.Setter;

import java.net.CookieManager;
import java.net.CookieStore;

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

    public PublicConfig(String applicationToken) {
        this.applicationToken = applicationToken;
    }

    public PublicConfig(String applicationToken, String domain) {
        this.applicationToken = applicationToken;
        this.domain = domain;
    }
}