package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticApplicationApiList {
    
    
    @GET 
    Call<LogisticApplicationModels.PincodeApiResponse> getPincodeCity(@Url String url1);
    
    @POST 
    Call<LogisticApplicationModels.TATViewResponse> getTatProduct(@Url String url1 , @Body LogisticApplicationModels.TATViewRequest payload );
    
    @POST 
    Call<LogisticApplicationModels.GetZoneFromPincodeViewResponse> getPincodeZones(@Url String url1 , @Body LogisticApplicationModels.GetZoneFromPincodeViewRequest payload );
}