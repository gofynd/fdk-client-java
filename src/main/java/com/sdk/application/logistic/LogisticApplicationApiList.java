package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticApplicationApiList {
    
    
    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1, @Query("country_code") String countryCode );
    
    @POST 
    Call<LogisticApplicationModels.TATViewResponse> getTatProduct(@Url String url1 , @Body LogisticApplicationModels.TATViewRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.EntityListResponse> getEntityList(@Url String url1, @Query("page") String page , @Query("limit") String limit  , @Body LogisticApplicationModels.EntityListRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResponse> getPincodeZones(@Url String url1 , @Body LogisticApplicationModels.GetZoneFromPincodeViewRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.AssignStoreResponse> assignLocations(@Url String url1 , @Body LogisticApplicationModels.AssignStoreRequest payload );
}