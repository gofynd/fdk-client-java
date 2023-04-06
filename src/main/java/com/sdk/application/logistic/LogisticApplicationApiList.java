package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticApplicationApiList {
    
    
    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1, @Query("country_code") String countryCode );
    
    @POST 
    Call<LogisticApplicationModels.TATViewResponse> getTatProduct(@Url String url1 , @Body LogisticApplicationModels.TATViewRequest payload );
    
    @GET 
    Call<LogisticApplicationModels.CountryListResponse> getAllCountries(@Url String url1);
    
    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResponse> getPincodeZones(@Url String url1 , @Body LogisticApplicationModels.GetZoneFromPincodeViewRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.AssignStoreResponse> assignLocations(@Url String url1 , @Body LogisticApplicationModels.AssignStoreRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.ReAssignStoreResponse> getOptimalLocations(@Url String url1 , @Body LogisticApplicationModels.ReAssignStoreRequest payload );
}