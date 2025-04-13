package com.sdk.application.webhook;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class WebhookApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private WebhookApplicationApiList webhookApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public WebhookApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.webhookApplicationApiList = generateWebhookApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("saveClickEvent","/service/application/webhook/v1.0/click-analytics/events".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private WebhookApplicationApiList generateWebhookApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),WebhookApplicationApiList.class, interceptorList, cookieStore);
    }

    public WebhookApplicationModels.ClickEventResponse saveClickEvent(WebhookApplicationModels.ClickEventRequest body) throws IOException {
        return this.saveClickEvent(body, new HashMap<>());
    }

    public WebhookApplicationModels.ClickEventResponse saveClickEvent(WebhookApplicationModels.ClickEventRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("saveClickEvent");

        Response<WebhookApplicationModels.ClickEventResponse> response = webhookApplicationApiList.saveClickEvent(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}