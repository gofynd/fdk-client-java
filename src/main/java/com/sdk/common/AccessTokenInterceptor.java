package com.sdk.common;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import com.sdk.platform.*;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.Base64;

public class AccessTokenInterceptor implements Interceptor {

    private PlatformConfig platformConfig;

    public AccessTokenInterceptor(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
    }

    @Value("${info.build.version}")
    String buildVersion;

    @Override
    public Response intercept(Chain chain) throws IOException {
        okhttp3.Request original = chain.request();
        okhttp3.Request.Builder builder = original.newBuilder()
                .addHeader("Authorization", "Bearer "+ platformConfig.getPlatformOauthClient().getToken())
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("x-fp-sdk-version", "0.1.26")
                .addHeader("x-ext-lib-version", "js/"+buildVersion);
        okhttp3.Request request = builder.build();
        return chain.proceed(request);
    }



}