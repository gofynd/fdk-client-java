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
        relativeUrls.put("getPincodeZones","/service/application/logistics/v1.0/pincode/zones".substring(1));
        relativeUrls.put("getOptimalLocations","/service/application/logistics/v1.0/reassign_stores".substring(1));
        relativeUrls.put("getLocations","/service/application/logistics/v1.0/locations".substring(1));
        relativeUrls.put("getCountries","/service/application/logistics/v1.0/countries".substring(1));
        relativeUrls.put("getCountry","/service/application/logistics/v1.0/countries/{country_iso_code}".substring(1));
        relativeUrls.put("getLocalities","/service/application/logistics/v1.0/localities/{locality_type}".substring(1));
        relativeUrls.put("getLocality","/service/application/logistics/v1.0/localities/{locality_type}/{locality_value}".substring(1));
        relativeUrls.put("validateAddress","/service/application/logistics/v1.0/country/{country_iso_code}/address/templates/{template_name}/validate".substring(1)); 

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
    

    public LogisticApplicationModels.GetZoneFromPincodeViewResponse getPincodeZones(LogisticApplicationModels.GetZoneFromPincodeViewRequest body) throws IOException {
        return this.getPincodeZones(body, new HashMap<>());
    }

    public LogisticApplicationModels.GetZoneFromPincodeViewResponse getPincodeZones(LogisticApplicationModels.GetZoneFromPincodeViewRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPincodeZones");

        Response<LogisticApplicationModels.GetZoneFromPincodeViewResponse> response = logisticApplicationApiList.getPincodeZones(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.ReAssignStoreResponse getOptimalLocations(LogisticApplicationModels.ReAssignStoreRequest body) throws IOException {
        return this.getOptimalLocations(body, new HashMap<>());
    }

    public LogisticApplicationModels.ReAssignStoreResponse getOptimalLocations(LogisticApplicationModels.ReAssignStoreRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOptimalLocations");

        Response<LogisticApplicationModels.ReAssignStoreResponse> response = logisticApplicationApiList.getOptimalLocations(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetStoreResponse getLocations(String xApplicationId, String xApplicationData, String country, String state, String city, Integer pincode, String sector, Integer pageNo, Integer pageSize) throws IOException {
        return this.getLocations(xApplicationId, xApplicationData, country, state, city, pincode, sector, pageNo, pageSize, new HashMap<>());
    }

    public LogisticApplicationModels.GetStoreResponse getLocations(String xApplicationId, String xApplicationData, String country, String state, String city, Integer pincode, String sector, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocations");

        Response<LogisticApplicationModels.GetStoreResponse> response = logisticApplicationApiList.getLocations(fullUrl, xApplicationId, xApplicationData, country, state, city, pincode, sector, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q) throws IOException {
        return this.getCountries(onboarding, pageNo, pageSize, q, new HashMap<>());
    }

    public LogisticApplicationModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCountries");

        Response<LogisticApplicationModels.GetCountries> response = logisticApplicationApiList.getCountries(fullUrl, onboarding, pageNo, pageSize, q, requestHeaders).execute();
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
    

    public LogisticApplicationModels.GetLocalities getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q) throws IOException {
        return this.getLocalities(localityType, country, state, city, pageNo, pageSize, q, new HashMap<>());
    }

    public LogisticApplicationModels.GetLocalities getLocalities(String localityType, String country, String state, String city, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocalities");
        fullUrl = fullUrl.replace("{" + "locality_type" + "}",localityType.toString());

        Response<LogisticApplicationModels.GetLocalities> response = logisticApplicationApiList.getLocalities(fullUrl, country, state, city, pageNo, pageSize, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
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
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}