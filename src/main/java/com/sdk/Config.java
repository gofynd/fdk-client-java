package com.sdk.;

import lombok.Getter;
import lombok.Setter;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.HashMap;

@Getter
@Setter
public class Config {
    private String domain = "https://api.fynd.com";

    private Boolean debuggable = false;

    private CookieStore persistentCookieStore = new CookieManager().getCookieStore();
    private HashMap<String,String> extraHeaders = new HashMap<>();

    public Config(String domain) {
        this.domain = domain;
    }
}