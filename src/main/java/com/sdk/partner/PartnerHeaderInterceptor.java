package com.sdk.partner;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.*;

public class PartnerHeaderInterceptor implements Interceptor {

    private PartnerConfig partnerConfig;

    public PartnerHeaderInterceptor(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request);
        if (!partnerConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = partnerConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()){
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        return chain.proceed(builder.build());
    }

    private Request.Builder buildHeaders(Request request) {
        return request
                .newBuilder()
                .addHeader("x-fp-sdk-version", "1.1.2");
    }
}