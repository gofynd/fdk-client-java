package com.sdk.application.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface RewardsApplicationApiList {

    @GET 
    Call<RewardsApplicationModels.Offer> getOfferByName(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.CatalogueOrderDetails> catalogueOrder(@Url String url1, @Body RewardsApplicationModels.CatalogueOrderCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.PointsHistoryDetails> getUserPointsHistory(@Url String url1, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.PointsDetails> getUserPoints(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<RewardsApplicationModels.ReferralDetails> getUserReferralDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.OrderDiscountDetails> getOrderDiscount(@Url String url1, @Body RewardsApplicationModels.RetrieveOrderDiscount payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<RewardsApplicationModels.RedeemReferralCodeDetails> redeemReferralCode(@Url String url1, @Body RewardsApplicationModels.RedeemReferralCode payload, @HeaderMap Map<String, String> requestHeaders);
}