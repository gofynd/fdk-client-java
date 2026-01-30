package com.sdk.universal.webhook;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class WebhookPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private WebhookPublicApiList webhookPublicApiList;

    public WebhookPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = publicConfig.getRetrofitServiceFactory();
        this.webhookPublicApiList = retrofitServiceFactory.getService(WebhookPublicApiList.class);
    }

    public WebhookPublicModels.EventDetails fetchAllWebhookEvents() throws IOException {
        return this.fetchAllWebhookEvents(new HashMap<>());
    }

    public WebhookPublicModels.EventDetails fetchAllWebhookEvents(Map<String, String> requestHeaders) throws IOException {
    
        Response<WebhookPublicModels.EventDetails> response = webhookPublicApiList.fetchAllWebhookEvents(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public WebhookPublicModels.EventDetails queryWebhookEventDetails(List<WebhookPublicModels.EventConfigBase> body) throws IOException {
        return this.queryWebhookEventDetails(body, new HashMap<>());
    }

    public WebhookPublicModels.EventDetails queryWebhookEventDetails(List<WebhookPublicModels.EventConfigBase> body, Map<String, String> requestHeaders) throws IOException {
    
        Response<WebhookPublicModels.EventDetails> response = webhookPublicApiList.queryWebhookEventDetails(body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public WebhookPublicModels.EventNotifier notifyDepricatedEvent() throws IOException {
        return this.notifyDepricatedEvent(new HashMap<>());
    }

    public WebhookPublicModels.EventNotifier notifyDepricatedEvent(Map<String, String> requestHeaders) throws IOException {
    
        Response<WebhookPublicModels.EventNotifier> response = webhookPublicApiList.notifyDepricatedEvent(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public WebhookPublicModels.TransformEventResult testHandlerTransformation(WebhookPublicModels.TransformEventPayload body) throws IOException {
        return this.testHandlerTransformation(body, new HashMap<>());
    }

    public WebhookPublicModels.TransformEventResult testHandlerTransformation(WebhookPublicModels.TransformEventPayload body, Map<String, String> requestHeaders) throws IOException {
    
        Response<WebhookPublicModels.TransformEventResult> response = webhookPublicApiList.testHandlerTransformation(body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public WebhookPublicModels.ValidateSchemaResult validateSchema(WebhookPublicModels.ValidateSchemaPayload body) throws IOException {
        return this.validateSchema(body, new HashMap<>());
    }

    public WebhookPublicModels.ValidateSchemaResult validateSchema(WebhookPublicModels.ValidateSchemaPayload body, Map<String, String> requestHeaders) throws IOException {
    
        Response<WebhookPublicModels.ValidateSchemaResult> response = webhookPublicApiList.validateSchema(body, requestHeaders).execute();
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