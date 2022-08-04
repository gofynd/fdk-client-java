package com.sdk.universal;

import com.sdk.common.*;
import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;


import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

public class PublicService {



@Getter
public static class ConfigurationService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApiList configurationApiList;

    ConfigurationService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApiList = generateConfigurationApiList(this.publicConfig.getPersistentCookieStore());
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    
    
    public PublicModels.ApplicationResponse searchApplication(String authorization , String query ) throws IOException {
    
        Response<PublicModels.ApplicationResponse> response = configurationApiList.searchApplication(authorization, query).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.Locations getLocations(String locationType , String id ) throws IOException {
    
        Response<PublicModels.Locations> response = configurationApiList.getLocations(locationType, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.EventConfigResponse fetchAllWebhookEvents() throws IOException {
    
        Response<PublicModels.EventConfigResponse> response = configurationApiList.fetchAllWebhookEvents().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.EventConfigResponse queryWebhookEventDetails(List<PublicModels.EventConfigBase> body) throws IOException {
    
        Response<PublicModels.EventConfigResponse> response = configurationApiList.queryWebhookEventDetails( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeListJobConfigDTO getJobConfigByIntegrationType(String integrationType , Boolean disable ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeListJobConfigDTO> response = configurationApiList.getJobConfigByIntegrationType(integrationType, disable).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeObject getJobCodesMetrics(Boolean dailyJob , String jobCode ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeObject> response = configurationApiList.getJobCodesMetrics(dailyJob, jobCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeEmailJobMetrics saveJobCodesMetrics(PublicModels.EmailJobMetrics body) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeEmailJobMetrics> response = configurationApiList.saveJobCodesMetrics( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}