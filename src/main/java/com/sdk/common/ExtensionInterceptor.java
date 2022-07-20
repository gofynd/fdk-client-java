package com.sdk.common;

import com.sdk.platform.PlatformConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Base64;

@Component
public class ExtensionInterceptor implements Interceptor {

    private PlatformConfig platformConfig;

    public ExtensionInterceptor(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
    }

    @Value("${info.build.version}")
    String buildVersion;

    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = Base64.getEncoder().encodeToString((platformConfig.getApiKey()+":"+ platformConfig.getApiSecret()).getBytes());
        Request request = chain.request()
                               .newBuilder()
                               .addHeader("Authorization", "Bearer "+bearerToken)
                               .addHeader("Content-Type", "application/json")
                               .addHeader("x-ext-lib-version", "js/"+buildVersion)
                               .build();
        return chain.proceed(request);
    }
}
