package com.sdk.application;

import com.sdk.application.ApplicationConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.*;

public class ApplicationHeaderInterceptor implements Interceptor {

    private ApplicationConfig applicationConfig;

    public ApplicationHeaderInterceptor(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = Base64.getEncoder().encodeToString((applicationConfig.getApplicationId()+":"+applicationConfig.getApplicationToken()).getBytes());
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request, bearerToken);
         if (!applicationConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = applicationConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()) {
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        return chain.proceed(builder.build());
    }

    private Request.Builder buildHeaders(Request request, String bearerToken) {
        return request
                .newBuilder()
                .addHeader("x-application-id", applicationConfig.getApplicationId())
                .addHeader("x-application-token", applicationConfig.getApplicationToken())
                .addHeader("User-Agent", applicationConfig.getUserAgent())
                .addHeader("Accept-Language", "en-IN")
                .addHeader("Authorization", "Bearer "+bearerToken)
                .addHeader("x-fp-sdk-version", "1.5.2");
    }
}
