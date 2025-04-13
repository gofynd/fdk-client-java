package com.sdk.platform.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface RewardsPlatformApiList {

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    Call<RewardsPlatformModels.ListGiveaway> showGiveaways(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    Call<RewardsPlatformModels.Giveaway> saveGiveAway(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body RewardsPlatformModels.Giveaway payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    Call<RewardsPlatformModels.Giveaway> getGiveawayById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    Call<RewardsPlatformModels.Giveaway> updateGiveAway(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body RewardsPlatformModels.Giveaway payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    Call<List<RewardsPlatformModels.Offer>> showOffers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> getOfferByName(@Path("name") String name, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> updateOfferByName(@Path("name") String name, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body RewardsPlatformModels.Offer payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.AppUser> updateUserStatus(@Path("user_id") String userId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body RewardsPlatformModels.AppUser payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.UserRes> getUserDetails(@Path("user_id") String userId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    Call<RewardsPlatformModels.HistoryRes> getUserPointsHistory(@Path("user_id") String userId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    Call<RewardsPlatformModels.ConfigurationRes> getRewardsConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    Call<RewardsPlatformModels.SetConfigurationRes> setRewardsConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body RewardsPlatformModels.SetConfiguration payload, @HeaderMap Map<String, String> requestHeaders);
}