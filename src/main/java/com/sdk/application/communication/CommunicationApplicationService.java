package com.sdk.application.communication;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.ApplicationConfig;







@Getter
 public class CommunicationApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationApplicationApiList communicationApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public CommunicationApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.communicationApplicationApiList = generateCommunicationApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
            
                    relativeUrls.put("upsertCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
            
                    relativeUrls.put("upsertAppPushtoken","/service/application/communication/v1.0/pn-token".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private CommunicationApplicationApiList generateCommunicationApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CommunicationApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public CommunicationApplicationModels.CommunicationConsent getCommunicationConsent() throws IOException {
     
      String fullUrl = relativeUrls.get("getCommunicationConsent");
        

        Response<CommunicationApplicationModels.CommunicationConsent> response = communicationApplicationApiList.getCommunicationConsent(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CommunicationApplicationModels.CommunicationConsentRes upsertCommunicationConsent(CommunicationApplicationModels.CommunicationConsentReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("upsertCommunicationConsent");
        

        Response<CommunicationApplicationModels.CommunicationConsentRes> response = communicationApplicationApiList.upsertCommunicationConsent(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CommunicationApplicationModels.PushtokenRes upsertAppPushtoken(CommunicationApplicationModels.PushtokenReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("upsertAppPushtoken");
        

        Response<CommunicationApplicationModels.PushtokenRes> response = communicationApplicationApiList.upsertAppPushtoken(fullUrl , body).execute();
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
