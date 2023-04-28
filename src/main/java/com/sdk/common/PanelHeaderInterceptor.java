package com.sdk.common;

import com.sdk.panel.PanelConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;
import java.util.*;

public class PanelHeaderInterceptor implements Interceptor {

    private PanelConfig panelConfig;

    public PanelHeaderInterceptor(PanelConfig panelConfig) {
        this.panelConfig = panelConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = buildHeaders(request);
        if (!panelConfig.getExtraHeaders().isEmpty()) {
            HashMap<String, String> extraHeaders = panelConfig.getExtraHeaders();
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