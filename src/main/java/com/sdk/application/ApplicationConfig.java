package com.sdk.application;

import lombok.Getter;
import lombok.Setter;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.HashMap;

@Getter
@Setter
public class ApplicationConfig {

    private String applicationId;

    private String applicationToken;

    private String domain = "https://api.fynd.com";

    private String userAgent = "google";

    private HashMap<String,String> extraHeaders = new HashMap<>();

    private CookieStore persistentCookieStore = new CookieManager().getCookieStore();

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