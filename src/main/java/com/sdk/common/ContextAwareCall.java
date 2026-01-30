package com.sdk.common;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Wraps a Retrofit {@link Call} so that when {@link #execute()} is invoked,
 * the current thread's {@link FDKContextHolder} is set for the duration of the
 * request. This allows the shared OkHttp client to apply the correct auth and
 * cookie store per request.
 */
final class ContextAwareCall<T> implements Call<T> {

    private final Call<T> delegate;
    private final FDKContext context;

    ContextAwareCall(Call<T> delegate, FDKContext context) {
        this.delegate = delegate;
        this.context = context;
    }

    @Override
    public Response<T> execute() throws IOException {
        FDKContextHolder.set(context);
        try {
            return delegate.execute();
        } finally {
            FDKContextHolder.clear();
        }
    }

    @Override
    public void enqueue(Callback<T> callback) {
        FDKContext captured = context;
        delegate.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                callback.onResponse(call, response);
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                callback.onFailure(call, t);
            }
        });
        // Caveat: async runs on another thread - context is not set there.
        // So we'd need to set context inside the callback's thread if the
        // callback triggers more requests. For now async may not get correct context.
    }

    @Override
    public boolean isExecuted() {
        return delegate.isExecuted();
    }

    @Override
    public void cancel() {
        delegate.cancel();
    }

    @Override
    public boolean isCanceled() {
        return delegate.isCanceled();
    }

    @Override
    public Call<T> clone() {
        return new ContextAwareCall<>(delegate.clone(), context);
    }

    @Override
    public okhttp3.Request request() {
        return delegate.request();
    }
}
