package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticApplicationApiList {

    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.TATViewResponse> getTatProduct(@Url String url1, @Body LogisticApplicationModels.TATViewRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.CountryListResponse> getAllCountries(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResponse> getPincodeZones(@Url String url1, @Body LogisticApplicationModels.GetZoneFromPincodeViewRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ReAssignStoreResponse> getOptimalLocations(@Url String url1, @Body LogisticApplicationModels.ReAssignStoreRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetStoreResponse> getLocations(@Url String url1, @Query("x-application-id") String xApplicationId, @Query("x-application-data") String xApplicationData, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("pincode") Integer pincode, @Query("sector") String sector, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountries> getCountries(@Url String url1, @Query("onboarding") Boolean onboarding, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountry> getCountry(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalities> getLocalities(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocality> getLocality(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ValidateAddressRequest> validateAddress(@Url String url1, @Body LogisticApplicationModels.ValidateAddressRequest payload, @HeaderMap Map<String, String> requestHeaders);
}