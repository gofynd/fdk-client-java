package com.sdk.application.logistic;

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
 public class LogisticApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LogisticApplicationApiList logisticApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public LogisticApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.logisticApplicationApiList = generateLogisticApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getPincodeCity","/service/application/logistics/v1.0/pincode/{pincode}".substring(1));
            
                    relativeUrls.put("getTatProduct","/service/application/logistics/v1.0/".substring(1));
            
                    relativeUrls.put("getAllCountries","/service/application/logistics/v1.0/country-list".substring(1));
            
                    relativeUrls.put("getPincodeZones","/service/application/logistics/v1.0/pincode/zones".substring(1));
            
                    relativeUrls.put("getOptimalLocations","/service/application/logistics/v1.0/reassign_stores".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private LogisticApplicationApiList generateLogisticApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LogisticApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public LogisticApplicationModels.PincodeApiResponse getPincodeCity(String pincode ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPincodeCity");
        
        fullUrl = fullUrl.replace("{" + "pincode" +"}",pincode.toString());
        

        Response<LogisticApplicationModels.PincodeApiResponse> response = logisticApplicationApiList.getPincodeCity(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public LogisticApplicationModels.TATViewResponse getTatProduct(LogisticApplicationModels.TATViewRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getTatProduct");
        

        Response<LogisticApplicationModels.TATViewResponse> response = logisticApplicationApiList.getTatProduct(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public LogisticApplicationModels.CountryListResponse getAllCountries() throws IOException {
     
      String fullUrl = relativeUrls.get("getAllCountries");
        

        Response<LogisticApplicationModels.CountryListResponse> response = logisticApplicationApiList.getAllCountries(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public LogisticApplicationModels.GetZoneFromPincodeViewResponse getPincodeZones(LogisticApplicationModels.GetZoneFromPincodeViewRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getPincodeZones");
        

        Response<LogisticApplicationModels.GetZoneFromPincodeViewResponse> response = logisticApplicationApiList.getPincodeZones(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public LogisticApplicationModels.ReAssignStoreResponse getOptimalLocations(LogisticApplicationModels.ReAssignStoreRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getOptimalLocations");
        

        Response<LogisticApplicationModels.ReAssignStoreResponse> response = logisticApplicationApiList.getOptimalLocations(fullUrl , body).execute();
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
