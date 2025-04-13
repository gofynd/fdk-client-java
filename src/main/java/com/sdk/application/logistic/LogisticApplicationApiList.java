package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticApplicationApiList {

    @GET 
    Call<LogisticApplicationModels.PincodeDetails> getPincodeCity(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.TATViewResult> getTatProduct(@Url String url1, @Body LogisticApplicationModels.TATViewDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.CountryListResult> getAllCountries(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResult> getPincodeZones(@Url String url1, @Body LogisticApplicationModels.GetZoneFromPincodeViewDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ReAssignStoreResult> getOptimalLocations(@Url String url1, @Body LogisticApplicationModels.ReAssignStoreDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ShipmentCourierPartnerResult> getCourierPartners(@Url String url1, @Body LogisticApplicationModels.ShipmentCourierPartnerDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetStoreResult> getLocations(@Url String url1, @Query("x-application-id") String xApplicationId, @Query("x-application-data") String xApplicationData, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("pincode") Integer pincode, @Query("sector") String sector, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountries> getCountries(@Url String url1, @Query("onboarding") Boolean onboarding, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("hierarchy") String hierarchy, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountry> getCountry(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetPromiseDetails> getDeliveryPromise(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalities> getLocalities(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocality> getLocality(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ValidateAddressDetails> validateAddress(@Url String url1, @Body LogisticApplicationModels.ValidateAddressDetails payload, @HeaderMap Map<String, String> requestHeaders);
}