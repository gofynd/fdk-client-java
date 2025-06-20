package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticApplicationApiList {

    @GET 
    Call<LogisticApplicationModels.PincodeDetailsResult> getPincodeCity(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.CountryResult> getAllCountries(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ShipmentCourierPartnerResult> getCourierPartners(@Url String url1, @Body LogisticApplicationModels.ShipmentCourierPartnerDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountries> getCountries(@Url String url1, @Query("onboarding") Boolean onboarding, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("hierarchy") String hierarchy, @Query("phone_code") String phoneCode, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetCountry> getCountry(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetPromiseDetails> getDeliveryPromise(@Url String url1, @Header("x-location-detail") String xLocationDetail, @Header("x-application-data") String xApplicationData, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalitiesApp> getLocalities(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.GetLocalityApp> getLocality(@Url String url1, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LogisticApplicationModels.ValidateAddressDetails> validateAddress(@Url String url1, @Body LogisticApplicationModels.ValidateAddressDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LogisticApplicationModels.FulfillmentOptionsList> getFulfillmentOptions(@Url String url1, @Header("x-application-data") String xApplicationData, @Query("product_slug") String productSlug, @Query("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);
}