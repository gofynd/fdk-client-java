package com.sdk.application.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticApplicationApiList {
    
    
    @POST 
    Call<LogisticApplicationModels.GetTatProductResponse> getTatProduct(@Url String url1 , @Body LogisticApplicationModels.GetTatProductReqBody payload );
    
    @POST 
    Call<LogisticApplicationModels.GetPincodeZonesResponse> getPincodeZones(@Url String url1 , @Body LogisticApplicationModels.GetPincodeZonesReqBody payload );
    
    @GET 
    Call<LogisticApplicationModels.GetPincodeCityResponse> getPincodeCity(@Url String url1);
}