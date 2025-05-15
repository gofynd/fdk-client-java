package com.sdk.application.configuration;

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
 public class ConfigurationApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApplicationApiList configurationApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public ConfigurationApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApplicationApiList = generateConfigurationApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getApplication","/service/application/configuration/v1.0/application".substring(1));
        relativeUrls.put("getOwnerInfo","/service/application/configuration/v1.0/about".substring(1));
        relativeUrls.put("getBasicDetails","/service/application/configuration/v1.0/detail".substring(1));
        relativeUrls.put("getIntegrationTokens","/service/application/configuration/v1.0/token".substring(1));
        relativeUrls.put("getOrderingStores","/service/application/configuration/v1.0/ordering-store/stores".substring(1));
        relativeUrls.put("getStoreDetailById","/service/application/configuration/v1.0/ordering-store/stores/{store_id}".substring(1));
        relativeUrls.put("getFeatures","/service/application/configuration/v1.0/feature".substring(1));
        relativeUrls.put("getContactInfo","/service/application/configuration/v1.0/information".substring(1));
        relativeUrls.put("getCurrencies","/service/application/configuration/v1.0/currencies".substring(1));
        relativeUrls.put("getCurrencyById","/service/application/configuration/v1.0/currency/{id}".substring(1));
        relativeUrls.put("getAppCurrencies","/service/application/configuration/v1.0/currency".substring(1));
        relativeUrls.put("getLanguages","/service/application/configuration/v1.0/languages".substring(1));
        relativeUrls.put("getOrderingStoreCookie","/service/application/configuration/v1.0/ordering-store/select".substring(1));
        relativeUrls.put("removeOrderingStoreCookie","/service/application/configuration/v1.0/ordering-store/select".substring(1));
        relativeUrls.put("getAppStaffList","/service/application/configuration/v1.0/staff/list".substring(1));
        relativeUrls.put("getAppStaffs","/service/application/configuration/v1.0/staff".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private ConfigurationApplicationApiList generateConfigurationApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ConfigurationApplicationApiList.class, interceptorList, cookieStore);
    }

    public ConfigurationApplicationModels.Application getApplication() throws IOException {
        return this.getApplication(new HashMap<>());
    }

    public ConfigurationApplicationModels.Application getApplication(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getApplication");

        Response<ConfigurationApplicationModels.Application> response = configurationApplicationApiList.getApplication(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.ApplicationAboutResponseSchema getOwnerInfo() throws IOException {
        return this.getOwnerInfo(new HashMap<>());
    }

    public ConfigurationApplicationModels.ApplicationAboutResponseSchema getOwnerInfo(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOwnerInfo");

        Response<ConfigurationApplicationModels.ApplicationAboutResponseSchema> response = configurationApplicationApiList.getOwnerInfo(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.ApplicationDetail getBasicDetails() throws IOException {
        return this.getBasicDetails(new HashMap<>());
    }

    public ConfigurationApplicationModels.ApplicationDetail getBasicDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBasicDetails");

        Response<ConfigurationApplicationModels.ApplicationDetail> response = configurationApplicationApiList.getBasicDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.AppTokenResponseSchema getIntegrationTokens() throws IOException {
        return this.getIntegrationTokens(new HashMap<>());
    }

    public ConfigurationApplicationModels.AppTokenResponseSchema getIntegrationTokens(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getIntegrationTokens");

        Response<ConfigurationApplicationModels.AppTokenResponseSchema> response = configurationApplicationApiList.getIntegrationTokens(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.OrderingStores getOrderingStores(Integer pageNo, Integer pageSize, String q) throws IOException {
        return this.getOrderingStores(pageNo, pageSize, q, new HashMap<>());
    }

    public ConfigurationApplicationModels.OrderingStores getOrderingStores(Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderingStores");

        Response<ConfigurationApplicationModels.OrderingStores> response = configurationApplicationApiList.getOrderingStores(fullUrl, pageNo, pageSize, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.OrderingStore getStoreDetailById(Integer storeId) throws IOException {
        return this.getStoreDetailById(storeId, new HashMap<>());
    }

    public ConfigurationApplicationModels.OrderingStore getStoreDetailById(Integer storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getStoreDetailById");
        fullUrl = fullUrl.replace("{" + "store_id" + "}",storeId.toString());

        Response<ConfigurationApplicationModels.OrderingStore> response = configurationApplicationApiList.getStoreDetailById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.AppFeatureResponseSchema getFeatures() throws IOException {
        return this.getFeatures(new HashMap<>());
    }

    public ConfigurationApplicationModels.AppFeatureResponseSchema getFeatures(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFeatures");

        Response<ConfigurationApplicationModels.AppFeatureResponseSchema> response = configurationApplicationApiList.getFeatures(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.ApplicationInformation getContactInfo() throws IOException {
        return this.getContactInfo(new HashMap<>());
    }

    public ConfigurationApplicationModels.ApplicationInformation getContactInfo(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getContactInfo");

        Response<ConfigurationApplicationModels.ApplicationInformation> response = configurationApplicationApiList.getContactInfo(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.CurrenciesResponseSchema getCurrencies() throws IOException {
        return this.getCurrencies(new HashMap<>());
    }

    public ConfigurationApplicationModels.CurrenciesResponseSchema getCurrencies(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCurrencies");

        Response<ConfigurationApplicationModels.CurrenciesResponseSchema> response = configurationApplicationApiList.getCurrencies(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.Currency getCurrencyById(String id) throws IOException {
        return this.getCurrencyById(id, new HashMap<>());
    }

    public ConfigurationApplicationModels.Currency getCurrencyById(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCurrencyById");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<ConfigurationApplicationModels.Currency> response = configurationApplicationApiList.getCurrencyById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.AppCurrencyResponseSchema getAppCurrencies() throws IOException {
        return this.getAppCurrencies(new HashMap<>());
    }

    public ConfigurationApplicationModels.AppCurrencyResponseSchema getAppCurrencies(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAppCurrencies");

        Response<ConfigurationApplicationModels.AppCurrencyResponseSchema> response = configurationApplicationApiList.getAppCurrencies(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.LanguageResponseSchema getLanguages() throws IOException {
        return this.getLanguages(new HashMap<>());
    }

    public ConfigurationApplicationModels.LanguageResponseSchema getLanguages(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLanguages");

        Response<ConfigurationApplicationModels.LanguageResponseSchema> response = configurationApplicationApiList.getLanguages(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.SuccessMessageResponseSchema getOrderingStoreCookie(ConfigurationApplicationModels.OrderingStoreSelectRequestSchema body) throws IOException {
        return this.getOrderingStoreCookie(body, new HashMap<>());
    }

    public ConfigurationApplicationModels.SuccessMessageResponseSchema getOrderingStoreCookie(ConfigurationApplicationModels.OrderingStoreSelectRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderingStoreCookie");

        Response<ConfigurationApplicationModels.SuccessMessageResponseSchema> response = configurationApplicationApiList.getOrderingStoreCookie(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.SuccessMessageResponseSchema removeOrderingStoreCookie() throws IOException {
        return this.removeOrderingStoreCookie(new HashMap<>());
    }

    public ConfigurationApplicationModels.SuccessMessageResponseSchema removeOrderingStoreCookie(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeOrderingStoreCookie");

        Response<ConfigurationApplicationModels.SuccessMessageResponseSchema> response = configurationApplicationApiList.removeOrderingStoreCookie(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.AppStaffListResponseSchema getAppStaffList(Integer pageNo, Integer pageSize, Boolean orderIncent, Integer orderingStore, String user, String userName) throws IOException {
        return this.getAppStaffList(pageNo, pageSize, orderIncent, orderingStore, user, userName, new HashMap<>());
    }

    public ConfigurationApplicationModels.AppStaffListResponseSchema getAppStaffList(Integer pageNo, Integer pageSize, Boolean orderIncent, Integer orderingStore, String user, String userName, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAppStaffList");

        Response<ConfigurationApplicationModels.AppStaffListResponseSchema> response = configurationApplicationApiList.getAppStaffList(fullUrl, pageNo, pageSize, orderIncent, orderingStore, user, userName, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ConfigurationApplicationModels.AppStaffResponseSchema getAppStaffs(Boolean orderIncent, Integer orderingStore, String user) throws IOException {
        return this.getAppStaffs(orderIncent, orderingStore, user, new HashMap<>());
    }

    public ConfigurationApplicationModels.AppStaffResponseSchema getAppStaffs(Boolean orderIncent, Integer orderingStore, String user, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAppStaffs");

        Response<ConfigurationApplicationModels.AppStaffResponseSchema> response = configurationApplicationApiList.getAppStaffs(fullUrl, orderIncent, orderingStore, user, requestHeaders).execute();
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