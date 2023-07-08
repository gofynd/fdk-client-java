package com.sdk.universal.configuration;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.PublicConfig;
import com.sdk.common.*;





@Getter
public class ConfigurationPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationPublicApiList configurationPublicApiList;

    public ConfigurationPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationPublicApiList = generateConfigurationPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private ConfigurationPublicApiList generateConfigurationPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),ConfigurationPublicApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public ConfigurationPublicModels.ApplicationResponse searchApplication(String authorization , String query ) throws IOException {
    
        Response<ConfigurationPublicModels.ApplicationResponse> response = configurationPublicApiList.searchApplication(authorization, query).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationPublicModels.Locations getLocations(String locationType , String id ) throws IOException {
    
        Response<ConfigurationPublicModels.Locations> response = configurationPublicApiList.getLocations(locationType, id).execute();
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
