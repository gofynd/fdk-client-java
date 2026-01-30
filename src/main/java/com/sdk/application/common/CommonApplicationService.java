package com.sdk.application.common;

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
 public class CommonApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommonApplicationApiList commonApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public CommonApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = applicationConfig.getRetrofitServiceFactory();
        this.commonApplicationApiList = retrofitServiceFactory.getService(CommonApplicationApiList.class);

        
        relativeUrls.put("searchApplication","/service/common/configuration/v1.0/application/search-application".substring(1));
        relativeUrls.put("getLocations","/service/common/configuration/v1.0/location".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    public CommonApplicationModels.ApplicationResponseSchema searchApplication(String authorization, String query) throws IOException {
        return this.searchApplication(authorization, query, new HashMap<>());
    }

    public CommonApplicationModels.ApplicationResponseSchema searchApplication(String authorization, String query, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("searchApplication");

        Response<CommonApplicationModels.ApplicationResponseSchema> response = commonApplicationApiList.searchApplication(fullUrl, authorization, query, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CommonApplicationModels.Locations getLocations(String locationType, String id) throws IOException {
        return this.getLocations(locationType, id, new HashMap<>());
    }

    public CommonApplicationModels.Locations getLocations(String locationType, String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocations");

        Response<CommonApplicationModels.Locations> response = commonApplicationApiList.getLocations(fullUrl, locationType, id, requestHeaders).execute();
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