package com.sdk.universal;

import com.sdk.universal.PublicConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.*;

public class PublicHeaderInterceptor implements Interceptor {

    private PublicConfig publicConfig;

    public PublicHeaderInterceptor(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = Base64.getEncoder().encodeToString((publicConfig.getApplicationToken()).getBytes());
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request, bearerToken);
        if (!publicConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = publicConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()){
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        return chain.proceed(builder.build());
    }

    private Request.Builder buildHeaders(Request request, String bearerToken) {
        return request
                .newBuilder()
                .addHeader("x-application-token", publicConfig.getApplicationToken())
                .addHeader("User-Agent", publicConfig.getUserAgent())
                .addHeader("Accept-Language", "en-IN")
                .addHeader("Authorization", "Bearer "+bearerToken)
                .addHeader("x-fp-sdk-version", "1.6.1");
    }
}