package com.sdk.common;

import okhttp3.Interceptor;
import okhttp3.Response;

import java.io.IOException;

/**
 * OkHttp interceptor that applies the current {@link FDKContext}'s auth interceptor.
 * Used by the single shared client so one OkHttpClient can serve all config types.
 */
public final class ContextAwareInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        FDKContext context = FDKContextHolder.get();
        if (context == null) {
            return chain.proceed(chain.request());
        }
        Interceptor auth = context.getAuthInterceptor();
        return auth == null ? chain.proceed(chain.request()) : auth.intercept(chain);
    }
}
