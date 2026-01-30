package com.sdk.common;

/**
 * Thread-local holder for the current {@link FDKContext}. The shared Retrofit/OkHttp client
 * reads this when handling each request so the correct auth and cookie store are used.
 * <p>
 * <b>Caveat (async):</b> Context is thread-bound. If you use async APIs (CompletableFuture,
 * RxJava, callbacks on other threads), the context is not automatically propagated. You must
 * set the context in the async task or use the same thread for the request.
 */
public final class FDKContextHolder {

    private static final ThreadLocal<FDKContext> HOLDER = new ThreadLocal<>();

    private FDKContextHolder() {}

    public static void set(FDKContext context) {
        HOLDER.set(context);
    }

    public static FDKContext get() {
        return HOLDER.get();
    }

    public static void clear() {
        HOLDER.remove();
    }
}
