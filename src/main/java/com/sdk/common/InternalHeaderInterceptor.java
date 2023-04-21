package com.sdk.common;

import com.sdk.internal.InternalConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.*;

public class InternalHeaderInterceptor implements Interceptor {

    private InternalConfig internalConfig;

    public InternalHeaderInterceptor(InternalConfig internalConfig) {
        this.internalConfig = internalConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request);
        if (!internalConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = internalConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()){
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        return chain.proceed(builder.build());
    }

    private Request.Builder buildHeaders(Request request) {
        return request
                .newBuilder()
                .addHeader("x-fp-sdk-version", "1.0.3");
    }
}