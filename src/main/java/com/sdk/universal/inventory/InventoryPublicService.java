package com.sdk.universal.inventory;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;





@Getter
public class InventoryPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private InventoryPublicApiList inventoryPublicApiList;

    public InventoryPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.inventoryPublicApiList = generateInventoryPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private InventoryPublicApiList generateInventoryPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),InventoryPublicApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public InventoryPublicModels.ResponseEnvelopeObject getJobCodesMetrics(Boolean dailyJob , String jobCode ) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeObject> response = inventoryPublicApiList.getJobCodesMetrics(dailyJob, jobCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public InventoryPublicModels.ResponseEnvelopeEmailJobMetrics saveJobCodesMetrics(InventoryPublicModels.EmailJobMetrics body) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeEmailJobMetrics> response = inventoryPublicApiList.saveJobCodesMetrics( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail getConfigByApiKey(String apikey ) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail> response = inventoryPublicApiList.getConfigByApiKey(apikey).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public InventoryPublicModels.ResponseEnvelopeApikeyModel getApiKey(String userName , String password ) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeApikeyModel> response = inventoryPublicApiList.getApiKey(userName, password).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public InventoryPublicModels.ResponseEnvelopeJobConfigDTO getJobByCode(String code ) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeJobConfigDTO> response = inventoryPublicApiList.getJobByCode(code).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public InventoryPublicModels.ResponseEnvelopeListJobConfigDTO getJobConfigByIntegrationType(String integrationType , Boolean disable ) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeListJobConfigDTO> response = inventoryPublicApiList.getJobConfigByIntegrationType(integrationType, disable).execute();
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
