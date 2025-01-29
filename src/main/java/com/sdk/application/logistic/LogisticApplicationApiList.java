package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticApplicationApiList {

    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.CountryListResponse> getAllCountries(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.ListViewResponseV2> getZones(@Url String url1, @Query("stage") String stage, @Query("type") String type, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("pincode") String pincode, @Query("state") String state, @Query("city") String city, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GeoAreaGetResponseBody> getGeoAreas(@Url String url1, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("type") String type, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("state") String state, @Query("city") String city, @Query("pincode") String pincode, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountries> getCountries(@Url String url1, @Query("onboard") Boolean onboard, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("hierarchy") String hierarchy, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountry> getCountry(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalities> getLocalitiesByPrefix(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalities> getLocalities(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("name") String name, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocality> getLocality(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ValidateAddressRequest> validateAddress(@Url String url1, @Body LogisticApplicationModels.ValidateAddressRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.GenerateShipmentsAndCourierPartnerResponse> createShipments(@Url String url1, @Body LogisticApplicationModels.GenerateShipmentsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetPromiseDetails> getDeliveryPromise(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);
}