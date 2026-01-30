package com.sdk.common;

import lombok.RequiredArgsConstructor;
import okhttp3.Interceptor;
import okhttp3.Request;

import java.io.IOException;
import java.net.CookieStore;
import java.util.List;

/**
 * Default implementation of {@link FDKContext} that holds a cookie store and a composite
 * auth interceptor (e.g. access token + request signer). Interceptors run in order; each
 * receives a chain that runs the next interceptor or the real network call.
 */
@RequiredArgsConstructor
public final class FDKContextImpl implements FDKContext {

    private final CookieStore cookieStore;
    private final List<Interceptor> authInterceptors;

    @Override
    public CookieStore getCookieStore() {
        return cookieStore;
    }

    @Override
    public Interceptor getAuthInterceptor() {
        return chain -> {
            if (authInterceptors == null || authInterceptors.isEmpty()) {
                return chain.proceed(chain.request());
            }
            // Build chain so first interceptor runs with a chain that runs second, etc., then real chain.
            Interceptor.Chain inner = chain;
            for (int i = authInterceptors.size() - 1; i >= 0; i--) {
                final Interceptor interceptor = authInterceptors.get(i);
                final Interceptor.Chain next = inner;
                inner = new Interceptor.Chain() {
                    @Override
                    public Request request() {
                        return next.request();
                    }

                    @Override
                    public okhttp3.Response proceed(Request request) throws IOException {
                        return interceptor.intercept(next);
                    }
                };
            }
            return inner.proceed(inner.request());
        };
    }
}
