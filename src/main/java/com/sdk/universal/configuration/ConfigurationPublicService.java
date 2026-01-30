package com.sdk.universal.configuration;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class ConfigurationPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationPublicApiList configurationPublicApiList;

    public ConfigurationPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = publicConfig.getRetrofitServiceFactory();
        this.configurationPublicApiList = retrofitServiceFactory.getService(ConfigurationPublicApiList.class);
    }

    public ConfigurationPublicModels.ApplicationResponseSchema searchApplication(String authorization, String query) throws IOException {
        return this.searchApplication(authorization, query, new HashMap<>());
    }

    public ConfigurationPublicModels.ApplicationResponseSchema searchApplication(String authorization, String query, Map<String, String> requestHeaders) throws IOException {
    
        Response<ConfigurationPublicModels.ApplicationResponseSchema> response = configurationPublicApiList.searchApplication(authorization, query, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ConfigurationPublicModels.Locations getLocations(String locationType, String id) throws IOException {
        return this.getLocations(locationType, id, new HashMap<>());
    }

    public ConfigurationPublicModels.Locations getLocations(String locationType, String id, Map<String, String> requestHeaders) throws IOException {
    
        Response<ConfigurationPublicModels.Locations> response = configurationPublicApiList.getLocations(locationType, id, requestHeaders).execute();
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