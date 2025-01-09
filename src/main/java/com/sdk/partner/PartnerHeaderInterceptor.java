package com.sdk.partner;

import com.sdk.partner.PartnerConfig;
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
        String bearerToken = Base64.getEncoder().encodeToString((partnerConfig.getApiKey()+":"+ partnerConfig.getApiSecret()).getBytes());
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request, bearerToken);
        if (!partnerConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = partnerConfig.getExtraHeaders();
            for(Map.Entry<String,String> entry:extraHeaders.entrySet()){
                builder.addHeader(entry.getKey(),entry.getValue());
            }
        }
        return chain.proceed(builder.build());
    }

    private Request.Builder buildHeaders(Request request, String bearerToken) {
        return request
        .newBuilder()
                .addHeader("Accept-Language", "en-IN")
                .addHeader("Authorization", "Basic "+ bearerToken)
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .addHeader("x-fp-sdk-version", "1.6.1");
    }            

}
