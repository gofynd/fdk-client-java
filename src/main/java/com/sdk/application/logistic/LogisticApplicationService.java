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

        
        relativeUrls.put("getAllCountries","/service/application/logistics/v1.0/country-list".substring(1));
        relativeUrls.put("getCountries","/service/application/logistics/v2.0/countries".substring(1));
        relativeUrls.put("getCountry","/service/application/logistics/v1.0/countries/{country_iso_code}".substring(1));
        relativeUrls.put("getDeliveryPromise","/service/application/logistics/v1.0/delivery-promise".substring(1));
        relativeUrls.put("getLocalities","/service/application/logistics/v1.0/localities/{locality_type}".substring(1));
        relativeUrls.put("getLocality","/service/application/logistics/v1.0/localities/{locality_type}/{locality_value}".substring(1));
        relativeUrls.put("validateAddress","/service/application/logistics/v1.0/country/{country_iso_code}/address/templates/{template_name}/validate".substring(1));
        relativeUrls.put("getFulfillmentOptions","/service/application/logistics/v1.0/fulfillment-options".substring(1));
        relativeUrls.put("getFulfillmentOptionStores","/service/application/logistics/v1.0/fulfillment-options/{slug}/stores".substring(1)); 

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

    public LogisticApplicationModels.CountryResult getAllCountries() throws IOException {
        return this.getAllCountries(new HashMap<>());
    }

    public LogisticApplicationModels.CountryResult getAllCountries(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAllCountries");

        Response<LogisticApplicationModels.CountryResult> response = logisticApplicationApiList.getAllCountries(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, String hierarchy, String phoneCode) throws IOException {
        return this.getCountries(onboarding, pageNo, pageSize, q, hierarchy, phoneCode, new HashMap<>());
    }

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, String hierarchy, String phoneCode, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCountries");

        Response<LogisticApplicationModels.GetCountries> response = logisticApplicationApiList.getCountries(fullUrl, onboarding, pageNo, pageSize, q, hierarchy, phoneCode, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
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
    

    public LogisticApplicationModels.GetPromiseDetails getDeliveryPromise(String xLocationDetail, Integer pageNo, Integer pageSize) throws IOException {
        return this.getDeliveryPromise(xLocationDetail, pageNo, pageSize, new HashMap<>());
    }

    public LogisticApplicationModels.GetPromiseDetails getDeliveryPromise(String xLocationDetail, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getDeliveryPromise");

        Response<LogisticApplicationModels.GetPromiseDetails> response = logisticApplicationApiList.getDeliveryPromise(fullUrl, xLocationDetail, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetLocalitiesApp getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q, String sector) throws IOException {
        return this.getLocalities(localityType, country, state, city, pageNo, pageSize, q, sector, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocalitiesApp getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q, String sector, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocalities");
        fullUrl = fullUrl.replace("{" + "locality_type" + "}",localityType.toString());

        Response<LogisticApplicationModels.GetLocalitiesApp> response = logisticApplicationApiList.getLocalities(fullUrl, country, state, city, pageNo, pageSize, q, sector, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetLocalityApp getLocality(String localityType, String localityValue, String country, String state, String city, String sector) throws IOException {
        return this.getLocality(localityType, localityValue, country, state, city, sector, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocalityApp getLocality(String localityType, String localityValue, String country, String state, String city, String sector, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocality");
        fullUrl = fullUrl.replace("{" + "locality_type" + "}",localityType.toString());
        fullUrl = fullUrl.replace("{" + "locality_value" + "}",localityValue.toString());

        Response<LogisticApplicationModels.GetLocalityApp> response = logisticApplicationApiList.getLocality(fullUrl, country, state, city, sector, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.ValidateAddressDetails validateAddress(String countryIsoCode, String templateName, LogisticApplicationModels.ValidateAddressDetails body) throws IOException {
        return this.validateAddress(countryIsoCode, templateName, body, new HashMap<>());
    }

    public LogisticApplicationModels.ValidateAddressDetails validateAddress(String countryIsoCode, String templateName, LogisticApplicationModels.ValidateAddressDetails body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateAddress");
        fullUrl = fullUrl.replace("{" + "country_iso_code" + "}",countryIsoCode.toString());
        fullUrl = fullUrl.replace("{" + "template_name" + "}",templateName.toString());

        Response<LogisticApplicationModels.ValidateAddressDetails> response = logisticApplicationApiList.validateAddress(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.FulfillmentOptionsList getFulfillmentOptions(String xApplicationData, String productSlug, Integer storeId) throws IOException {
        return this.getFulfillmentOptions(xApplicationData, productSlug, storeId, new HashMap<>());
    }

    public LogisticApplicationModels.FulfillmentOptionsList getFulfillmentOptions(String xApplicationData, String productSlug, Integer storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFulfillmentOptions");

        Response<LogisticApplicationModels.FulfillmentOptionsList> response = logisticApplicationApiList.getFulfillmentOptions(fullUrl, xApplicationData, productSlug, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.FulfillmentOptionStores getFulfillmentOptionStores(String slug, Integer pageNo, Integer pageSize) throws IOException {
        return this.getFulfillmentOptionStores(slug, pageNo, pageSize, new HashMap<>());
    }

    public LogisticApplicationModels.FulfillmentOptionStores getFulfillmentOptionStores(String slug, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFulfillmentOptionStores");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<LogisticApplicationModels.FulfillmentOptionStores> response = logisticApplicationApiList.getFulfillmentOptionStores(fullUrl, pageNo, pageSize, requestHeaders).execute();
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