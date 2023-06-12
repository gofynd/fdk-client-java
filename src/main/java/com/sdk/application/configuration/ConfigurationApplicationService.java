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

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

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
     
      String fullUrl = relativeUrls.get("getApplication");
        

        Response<ConfigurationApplicationModels.Application> response = configurationApplicationApiList.getApplication(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.ApplicationAboutResponse getOwnerInfo() throws IOException {
     
      String fullUrl = relativeUrls.get("getOwnerInfo");
        

        Response<ConfigurationApplicationModels.ApplicationAboutResponse> response = configurationApplicationApiList.getOwnerInfo(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.ApplicationDetail getBasicDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getBasicDetails");
        

        Response<ConfigurationApplicationModels.ApplicationDetail> response = configurationApplicationApiList.getBasicDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.AppTokenResponse getIntegrationTokens() throws IOException {
     
      String fullUrl = relativeUrls.get("getIntegrationTokens");
        

        Response<ConfigurationApplicationModels.AppTokenResponse> response = configurationApplicationApiList.getIntegrationTokens(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.OrderingStores getOrderingStores(Integer pageNo , Integer pageSize , String q ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderingStores");
        

        Response<ConfigurationApplicationModels.OrderingStores> response = configurationApplicationApiList.getOrderingStores(fullUrl  ,pageNo, pageSize, q).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrderingStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationApplicationModels.OrderingStores> getOrderingStoresPagination(
        
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationApplicationModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationApplicationModels.OrderingStores callback = this.getOrderingStores(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    public ConfigurationApplicationModels.OrderingStore getStoreDetailById(Integer storeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getStoreDetailById");
        
        fullUrl = fullUrl.replace("{" + "store_id" +"}",storeId.toString());
        

        Response<ConfigurationApplicationModels.OrderingStore> response = configurationApplicationApiList.getStoreDetailById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.AppFeatureResponse getFeatures() throws IOException {
     
      String fullUrl = relativeUrls.get("getFeatures");
        

        Response<ConfigurationApplicationModels.AppFeatureResponse> response = configurationApplicationApiList.getFeatures(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.ApplicationInformation getContactInfo() throws IOException {
     
      String fullUrl = relativeUrls.get("getContactInfo");
        

        Response<ConfigurationApplicationModels.ApplicationInformation> response = configurationApplicationApiList.getContactInfo(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.CurrenciesResponse getCurrencies() throws IOException {
     
      String fullUrl = relativeUrls.get("getCurrencies");
        

        Response<ConfigurationApplicationModels.CurrenciesResponse> response = configurationApplicationApiList.getCurrencies(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.Currency getCurrencyById(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCurrencyById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ConfigurationApplicationModels.Currency> response = configurationApplicationApiList.getCurrencyById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.AppCurrencyResponse getAppCurrencies() throws IOException {
     
      String fullUrl = relativeUrls.get("getAppCurrencies");
        

        Response<ConfigurationApplicationModels.AppCurrencyResponse> response = configurationApplicationApiList.getAppCurrencies(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.LanguageResponse getLanguages() throws IOException {
     
      String fullUrl = relativeUrls.get("getLanguages");
        

        Response<ConfigurationApplicationModels.LanguageResponse> response = configurationApplicationApiList.getLanguages(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.SuccessMessageResponse getOrderingStoreCookie(ConfigurationApplicationModels.OrderingStoreSelectRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderingStoreCookie");
        

        Response<ConfigurationApplicationModels.SuccessMessageResponse> response = configurationApplicationApiList.getOrderingStoreCookie(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.SuccessMessageResponse removeOrderingStoreCookie() throws IOException {
     
      String fullUrl = relativeUrls.get("removeOrderingStoreCookie");
        

        Response<ConfigurationApplicationModels.SuccessMessageResponse> response = configurationApplicationApiList.removeOrderingStoreCookie(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ConfigurationApplicationModels.AppStaffListResponse getAppStaffList(Integer pageNo , Integer pageSize , Boolean orderIncent , Integer orderingStore , String user ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAppStaffList");
        

        Response<ConfigurationApplicationModels.AppStaffListResponse> response = configurationApplicationApiList.getAppStaffList(fullUrl  ,pageNo, pageSize, orderIncent, orderingStore, user).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppStaffList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationApplicationModels.AppStaffListResponse> getAppStaffListPagination(
        
        Integer pageSize,
        Boolean orderIncent,
        Integer orderingStore,
        String user
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationApplicationModels.AppStaffListResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationApplicationModels.AppStaffListResponse callback = this.getAppStaffList(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 orderIncent,
                 orderingStore,
                 user
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    public ConfigurationApplicationModels.AppStaffResponse getAppStaffs(Boolean orderIncent , Integer orderingStore , String user ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAppStaffs");
        

        Response<ConfigurationApplicationModels.AppStaffResponse> response = configurationApplicationApiList.getAppStaffs(fullUrl  ,orderIncent, orderingStore, user).execute();
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
