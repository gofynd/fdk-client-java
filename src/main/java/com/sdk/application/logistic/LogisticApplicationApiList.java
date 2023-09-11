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
}