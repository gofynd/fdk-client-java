package com.sdk.common;

import okhttp3.Interceptor;

import java.net.CookieStore;

/**
 * Request context for the shared FDK client. Supplies the cookie store and auth interceptor
 * for the current config (Platform, Application, Partner, or Public). The shared client uses
 * this to apply the right auth and cookies per request.
 */
public interface FDKContext {

    /**
     * Cookie store for this context. Cookies are isolated per context so different
     * configs (e.g. different companies) do not share cookies.
     */
    CookieStore getCookieStore();

    /**
     * Interceptor that adds auth headers (OAuth, application token, etc.) for this context.
     */
    Interceptor getAuthInterceptor();
}
