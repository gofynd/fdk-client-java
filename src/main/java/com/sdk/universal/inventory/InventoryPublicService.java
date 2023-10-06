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

    public InventoryPublicModels.ResponseEnvelopeObject getJobCodesMetrics(Boolean dailyJob, String jobCode) throws IOException {
        return this.getJobCodesMetrics(dailyJob, jobCode, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeObject getJobCodesMetrics(Boolean dailyJob, String jobCode, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeObject> response = inventoryPublicApiList.getJobCodesMetrics(dailyJob, jobCode, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public InventoryPublicModels.ResponseEnvelopeEmailJobMetrics saveJobCodesMetrics(InventoryPublicModels.EmailJobMetrics body) throws IOException {
        return this.saveJobCodesMetrics(body, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeEmailJobMetrics saveJobCodesMetrics(InventoryPublicModels.EmailJobMetrics body, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeEmailJobMetrics> response = inventoryPublicApiList.saveJobCodesMetrics(body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail getConfigByApiKey(String apikey) throws IOException {
        return this.getConfigByApiKey(apikey, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail getConfigByApiKey(String apikey, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail> response = inventoryPublicApiList.getConfigByApiKey(apikey, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public InventoryPublicModels.ResponseEnvelopeApikeyModel getApiKey(String userName, String password) throws IOException {
        return this.getApiKey(userName, password, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeApikeyModel getApiKey(String userName, String password, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeApikeyModel> response = inventoryPublicApiList.getApiKey(userName, password, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public InventoryPublicModels.ResponseEnvelopeJobConfigDTO getJobByCode(String code) throws IOException {
        return this.getJobByCode(code, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeJobConfigDTO getJobByCode(String code, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeJobConfigDTO> response = inventoryPublicApiList.getJobByCode(code, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public InventoryPublicModels.ResponseEnvelopeListJobConfigDTO getJobConfigByIntegrationType(String integrationType, Boolean disable) throws IOException {
        return this.getJobConfigByIntegrationType(integrationType, disable, new HashMap<>());
    }

    public InventoryPublicModels.ResponseEnvelopeListJobConfigDTO getJobConfigByIntegrationType(String integrationType, Boolean disable, Map<String, String> requestHeaders) throws IOException {
    
        Response<InventoryPublicModels.ResponseEnvelopeListJobConfigDTO> response = inventoryPublicApiList.getJobConfigByIntegrationType(integrationType, disable, requestHeaders).execute();
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