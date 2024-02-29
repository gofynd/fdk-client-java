package com.sdk.partner;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import com.sdk.partner.*;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.Base64;
import java.util.*;


public class AccessTokenInterceptor implements Interceptor {

    private PartnerConfig partnerConfig;

    public AccessTokenInterceptor(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        okhttp3.Request original = chain.request();
        okhttp3.Request.Builder builder = original.newBuilder()
                .addHeader("Authorization", "Bearer "+ partnerConfig.getPartnerOauthClient().getToken())
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("x-fp-sdk-version", "1.4.2-beta.6");
        if (!partnerConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = partnerConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()){
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        okhttp3.Request request = builder.build();
        return chain.proceed(request);
    }



}