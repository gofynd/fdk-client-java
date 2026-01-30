package com.sdk.common;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.util.Collections;
import java.util.List;

import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.JavaNetCookieJar;

/**
 * CookieJar that delegates to the current {@link FDKContext}'s CookieStore.
 * Used by the single shared client so cookies are isolated per config: when a
 * request runs with a given context, only that context's CookieStore is used.
 */
public final class ContextAwareCookieJar implements CookieJar {

    @Override
    public void saveFromResponse(HttpUrl url, List<okhttp3.Cookie> cookies) {
        FDKContext context = FDKContextHolder.get();
        if (context == null) {
            return;
        }
        CookieStore store = context.getCookieStore();
        if (store == null) {
            return;
        }
        CookieManager manager = new CookieManager(store, CookiePolicy.ACCEPT_ALL);
        JavaNetCookieJar jar = new JavaNetCookieJar(manager);
        jar.saveFromResponse(url, cookies);
    }

    @Override
    public List<okhttp3.Cookie> loadForRequest(HttpUrl url) {
        FDKContext context = FDKContextHolder.get();
        if (context == null) {
            return Collections.emptyList();
        }
        CookieStore store = context.getCookieStore();
        if (store == null) {
            return Collections.emptyList();
        }
        CookieManager manager = new CookieManager(store, CookiePolicy.ACCEPT_ALL);
        JavaNetCookieJar jar = new JavaNetCookieJar(manager);
        return jar.loadForRequest(url);
    }
}
