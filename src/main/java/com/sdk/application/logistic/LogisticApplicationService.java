package com.sdk.application.logistic;

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
 public class LogisticApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LogisticApplicationApiList logisticApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public LogisticApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.logisticApplicationApiList = generateLogisticApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getPincodeCity","/service/application/logistics/v1.0/pincode/{pincode}".substring(1));
        relativeUrls.put("getAllCountries","/service/application/logistics/v1.0/country-list".substring(1));
        relativeUrls.put("getZones","/service/application/logistics/v2.0/company/{company_id}/application/{application_id}/zones".substring(1));
        relativeUrls.put("getGeoAreas","/service/application/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas".substring(1));
        relativeUrls.put("getCountries","/service/application/logistics/v2.0/countries".substring(1));
        relativeUrls.put("getCountry","/service/application/logistics/v1.0/countries/{country_iso_code}".substring(1));
        relativeUrls.put("getLocalitiesByPrefix","/service/application/logistics/v1.0/localities".substring(1));
        relativeUrls.put("getLocalities","/service/application/logistics/v1.0/localities/{locality_type}".substring(1));
        relativeUrls.put("getLocality","/service/application/logistics/v1.0/localities/{locality_type}/{locality_value}".substring(1));
        relativeUrls.put("validateAddress","/service/application/logistics/v1.0/country/{country_iso_code}/address/templates/{template_name}/validate".substring(1));
        relativeUrls.put("createShipments","/service/application/logistics/v1.0/company/{company_id}/application/{application_id}/shipments".substring(1));
        relativeUrls.put("getDeliveryPromise","/service/application/logistics/v1.0/delivery-promise".substring(1)); 

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

    public LogisticApplicationModels.PincodeApiResponse getPincodeCity(String pincode) throws IOException {
        return this.getPincodeCity(pincode, new HashMap<>());
    }

    public LogisticApplicationModels.PincodeApiResponse getPincodeCity(String pincode, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPincodeCity");
        fullUrl = fullUrl.replace("{" + "pincode" + "}",pincode.toString());

        Response<LogisticApplicationModels.PincodeApiResponse> response = logisticApplicationApiList.getPincodeCity(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.CountryListResponse getAllCountries() throws IOException {
        return this.getAllCountries(new HashMap<>());
    }

    public LogisticApplicationModels.CountryListResponse getAllCountries(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAllCountries");

        Response<LogisticApplicationModels.CountryListResponse> response = logisticApplicationApiList.getAllCountries(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.ListViewResponseV2 getZones(Integer companyId, String applicationId, String stage, String type, Integer pageSize, Integer pageNo, Boolean isActive, String q, String countryIsoCode, String pincode, String state, String city, String sector) throws IOException {
        return this.getZones(companyId, applicationId, stage, type, pageSize, pageNo, isActive, q, countryIsoCode, pincode, state, city, sector, new HashMap<>());
    }

    public LogisticApplicationModels.ListViewResponseV2 getZones(Integer companyId, String applicationId, String stage, String type, Integer pageSize, Integer pageNo, Boolean isActive, String q, String countryIsoCode, String pincode, String state, String city, String sector, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getZones");
        fullUrl = fullUrl.replace("{" + "company_id" + "}",companyId.toString());
        fullUrl = fullUrl.replace("{" + "application_id" + "}",applicationId.toString());

        Response<LogisticApplicationModels.ListViewResponseV2> response = logisticApplicationApiList.getZones(fullUrl, stage, type, pageSize, pageNo, isActive, q, countryIsoCode, pincode, state, city, sector, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GeoAreaGetResponseBody getGeoAreas(String applicationId, Integer companyId, Integer pageSize, Integer pageNo, String type, Boolean isActive, String q, String countryIsoCode, String state, String city, String pincode, String sector) throws IOException {
        return this.getGeoAreas(applicationId, companyId, pageSize, pageNo, type, isActive, q, countryIsoCode, state, city, pincode, sector, new HashMap<>());
    }

    public LogisticApplicationModels.GeoAreaGetResponseBody getGeoAreas(String applicationId, Integer companyId, Integer pageSize, Integer pageNo, String type, Boolean isActive, String q, String countryIsoCode, String state, String city, String pincode, String sector, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getGeoAreas");
        fullUrl = fullUrl.replace("{" + "application_id" + "}",applicationId.toString());
        fullUrl = fullUrl.replace("{" + "company_id" + "}",companyId.toString());

        Response<LogisticApplicationModels.GeoAreaGetResponseBody> response = logisticApplicationApiList.getGeoAreas(fullUrl, pageSize, pageNo, type, isActive, q, countryIsoCode, state, city, pincode, sector, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy) throws IOException {
        return this.getCountries(onboard, pageNo, pageSize, q, hierarchy, new HashMap<>());
    }

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCountries");

        Response<LogisticApplicationModels.GetCountries> response = logisticApplicationApiList.getCountries(fullUrl, onboard, pageNo, pageSize, q, hierarchy, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getCountries
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<LogisticApplicationModels.GetCountries> getCountriesPagination(
        
        Boolean onboard,
        Integer pageSize,
        String q,
        String hierarchy
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<LogisticApplicationModels.GetCountries> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            LogisticApplicationModels.GetCountries callback = this.getCountries(
                
                 onboard,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 hierarchy
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public LogisticApplicationModels.GetCountry getCountry(String countryIsoCode) throws IOException {
        return this.getCountry(countryIsoCode, new HashMap<>());
    }

    public LogisticApplicationModels.GetCountry getCountry(String countryIsoCode, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCountry");
        fullUrl = fullUrl.replace("{" + "country_iso_code" + "}",countryIsoCode.toString());

        Response<LogisticApplicationModels.GetCountry> response = logisticApplicationApiList.getCountry(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetLocalities getLocalitiesByPrefix(Integer companyId, Integer pageNo, Integer pageSize, String q) throws IOException {
        return this.getLocalitiesByPrefix(companyId, pageNo, pageSize, q, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocalities getLocalitiesByPrefix(Integer companyId, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocalitiesByPrefix");
        fullUrl = fullUrl.replace("{" + "company_id" + "}",companyId.toString());

        Response<LogisticApplicationModels.GetLocalities> response = logisticApplicationApiList.getLocalitiesByPrefix(fullUrl, pageNo, pageSize, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getLocalitiesByPrefix
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<LogisticApplicationModels.GetLocalities> getLocalitiesByPrefixPagination(
        
        Integer companyId,
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<LogisticApplicationModels.GetLocalities> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            LogisticApplicationModels.GetLocalities callback = this.getLocalitiesByPrefix(
                
                 companyId,
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
    return paginator;
    }
    

    public LogisticApplicationModels.GetLocalities getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q, String name) throws IOException {
        return this.getLocalities(localityType, country, state, city, pageNo, pageSize, q, name, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocalities getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q, String name, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocalities");
        fullUrl = fullUrl.replace("{" + "locality_type" + "}",localityType.toString());

        Response<LogisticApplicationModels.GetLocalities> response = logisticApplicationApiList.getLocalities(fullUrl, country, state, city, pageNo, pageSize, q, name, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getLocalities
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<LogisticApplicationModels.GetLocalities> getLocalitiesPagination(
        
        String localityType,
        String country,
        String state,
        String city,
        Integer pageSize,
        String q,
        String name
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<LogisticApplicationModels.GetLocalities> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            LogisticApplicationModels.GetLocalities callback = this.getLocalities(
                
                 localityType,
                 country,
                 state,
                 city,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 name
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public LogisticApplicationModels.GetLocality getLocality(String localityType, String localityValue, String country, String state, String city) throws IOException {
        return this.getLocality(localityType, localityValue, country, state, city, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocality getLocality(String localityType, String localityValue, String country, String state, String city, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocality");
        fullUrl = fullUrl.replace("{" + "locality_type" + "}",localityType.toString());
        fullUrl = fullUrl.replace("{" + "locality_value" + "}",localityValue.toString());

        Response<LogisticApplicationModels.GetLocality> response = logisticApplicationApiList.getLocality(fullUrl, country, state, city, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.ValidateAddressRequest validateAddress(String countryIsoCode, String templateName, LogisticApplicationModels.ValidateAddressRequest body) throws IOException {
        return this.validateAddress(countryIsoCode, templateName, body, new HashMap<>());
    }

    public LogisticApplicationModels.ValidateAddressRequest validateAddress(String countryIsoCode, String templateName, LogisticApplicationModels.ValidateAddressRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateAddress");
        fullUrl = fullUrl.replace("{" + "country_iso_code" + "}",countryIsoCode.toString());
        fullUrl = fullUrl.replace("{" + "template_name" + "}",templateName.toString());

        Response<LogisticApplicationModels.ValidateAddressRequest> response = logisticApplicationApiList.validateAddress(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GenerateShipmentsAndCourierPartnerResponse createShipments(Integer companyId, String applicationId, LogisticApplicationModels.GenerateShipmentsRequest body) throws IOException {
        return this.createShipments(companyId, applicationId, body, new HashMap<>());
    }

    public LogisticApplicationModels.GenerateShipmentsAndCourierPartnerResponse createShipments(Integer companyId, String applicationId, LogisticApplicationModels.GenerateShipmentsRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createShipments");
        fullUrl = fullUrl.replace("{" + "company_id" + "}",companyId.toString());
        fullUrl = fullUrl.replace("{" + "application_id" + "}",applicationId.toString());

        Response<LogisticApplicationModels.GenerateShipmentsAndCourierPartnerResponse> response = logisticApplicationApiList.createShipments(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetPromiseDetails getDeliveryPromise(Integer pageNo, Integer pageSize) throws IOException {
        return this.getDeliveryPromise(pageNo, pageSize, new HashMap<>());
    }

    public LogisticApplicationModels.GetPromiseDetails getDeliveryPromise(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getDeliveryPromise");

        Response<LogisticApplicationModels.GetPromiseDetails> response = logisticApplicationApiList.getDeliveryPromise(fullUrl, pageNo, pageSize, requestHeaders).execute();
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