package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticApplicationApiList {
    
    
    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1);
    
    @POST 
    Call<LogisticApplicationModels.TATViewResponse> getTatProduct(@Url String url1 , @Body LogisticApplicationModels.TATViewRequest payload );
    
    @GET 
    Call<LogisticApplicationModels.CountryListResponse> getAllCountries(@Url String url1);
    
    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResponse> getPincodeZones(@Url String url1 , @Body LogisticApplicationModels.GetZoneFromPincodeViewRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.ReAssignStoreResponse> getOptimalLocations(@Url String url1 , @Body LogisticApplicationModels.ReAssignStoreRequest payload );
    
    @GET 
    Call<LogisticApplicationModels.GetCountries> getCountries(@Url String url1);
    
    @GET 
    Call<LogisticApplicationModels.GetCountry> getCountry(@Url String url1);
    
    @GET 
    Call<LogisticApplicationModels.GetLocalities> getLocalities(@Url String url1);
    
    @GET 
    Call<LogisticApplicationModels.GetLocality> getLocality(@Url String url1);
}