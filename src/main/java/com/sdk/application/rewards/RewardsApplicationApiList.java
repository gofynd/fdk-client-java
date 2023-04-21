package com.sdk.application.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface RewardsApplicationApiList {
    
    
    @GET 
    Call<RewardsApplicationModels.Offer> getOfferByName(@Url String url1);
    
    @POST 
    Call<RewardsApplicationModels.CatalogueOrderResponse> catalogueOrder(@Url String url1 , @Body RewardsApplicationModels.CatalogueOrderRequest payload );
    
    @GET 
    Call<RewardsApplicationModels.PointsHistoryResponse> getUserPointsHistory(@Url String url1, @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<RewardsApplicationModels.PointsResponse> getUserPoints(@Url String url1);
    
    @GET 
    Call<RewardsApplicationModels.ReferralDetailsResponse> getUserReferralDetails(@Url String url1);
    
    @POST 
    Call<RewardsApplicationModels.OrderDiscountResponse> getOrderDiscount(@Url String url1 , @Body RewardsApplicationModels.OrderDiscountRequest payload );
    
    @POST 
    Call<RewardsApplicationModels.RedeemReferralCodeResponse> redeemReferralCode(@Url String url1 , @Body RewardsApplicationModels.RedeemReferralCodeRequest payload );
}