package com.sdk.application.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface RewardsApplicationApiList {

    @GET 
    Call<RewardsApplicationModels.Offer> getOfferByName(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.CatalogueOrderResponse> catalogueOrder(@Url String url1, @Body RewardsApplicationModels.CatalogueOrderRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.PointsHistoryResponse> getUserPointsHistory(@Url String url1, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.PointsResponse> getUserPoints(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.ReferralDetailsResponse> getUserReferralDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.OrderDiscountResponse> getOrderDiscount(@Url String url1, @Body RewardsApplicationModels.OrderDiscountRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.RedeemReferralCodeResponse> redeemReferralCode(@Url String url1, @Body RewardsApplicationModels.RedeemReferralCodeRequest payload, @HeaderMap Map<String, String> requestHeaders);
}