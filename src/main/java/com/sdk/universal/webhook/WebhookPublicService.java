package com.sdk.universal.webhook;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.PublicConfig;
import com.sdk.common.*;





@Getter
public class WebhookPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private WebhookPublicApiList webhookPublicApiList;

    public WebhookPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.webhookPublicApiList = generateWebhookPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private WebhookPublicApiList generateWebhookPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),WebhookPublicApiList.class, interceptorList, cookieStore);
    }

    
    
    public WebhookPublicModels.EventConfigResponse fetchAllWebhookEvents() throws IOException {
    
        Response<WebhookPublicModels.EventConfigResponse> response = webhookPublicApiList.fetchAllWebhookEvents().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public WebhookPublicModels.EventConfigResponse queryWebhookEventDetails(List<WebhookPublicModels.EventConfigBase> body) throws IOException {
    
        Response<WebhookPublicModels.EventConfigResponse> response = webhookPublicApiList.queryWebhookEventDetails( body).execute();
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
