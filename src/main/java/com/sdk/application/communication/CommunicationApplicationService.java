package com.sdk.application.communication;

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
 public class CommunicationApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationApplicationApiList communicationApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public CommunicationApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = applicationConfig.getRetrofitServiceFactory();
        this.communicationApplicationApiList = retrofitServiceFactory.getService(CommunicationApplicationApiList.class);

        
        relativeUrls.put("getCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
        relativeUrls.put("upsertCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
        relativeUrls.put("upsertAppPushtoken","/service/application/communication/v1.0/pn-token".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    public CommunicationApplicationModels.CommunicationConsent getCommunicationConsent() throws IOException {
        return this.getCommunicationConsent(new HashMap<>());
    }

    public CommunicationApplicationModels.CommunicationConsent getCommunicationConsent(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCommunicationConsent");

        Response<CommunicationApplicationModels.CommunicationConsent> response = communicationApplicationApiList.getCommunicationConsent(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CommunicationApplicationModels.CommunicationConsentRes upsertCommunicationConsent(CommunicationApplicationModels.CommunicationConsentReq body) throws IOException {
        return this.upsertCommunicationConsent(body, new HashMap<>());
    }

    public CommunicationApplicationModels.CommunicationConsentRes upsertCommunicationConsent(CommunicationApplicationModels.CommunicationConsentReq body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("upsertCommunicationConsent");

        Response<CommunicationApplicationModels.CommunicationConsentRes> response = communicationApplicationApiList.upsertCommunicationConsent(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CommunicationApplicationModels.PushtokenRes upsertAppPushtoken(CommunicationApplicationModels.PushtokenReq body) throws IOException {
        return this.upsertAppPushtoken(body, new HashMap<>());
    }

    public CommunicationApplicationModels.PushtokenRes upsertAppPushtoken(CommunicationApplicationModels.PushtokenReq body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("upsertAppPushtoken");

        Response<CommunicationApplicationModels.PushtokenRes> response = communicationApplicationApiList.upsertAppPushtoken(fullUrl, body, requestHeaders).execute();
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