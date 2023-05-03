package com.sdk.platform.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface RewardsPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    Call<RewardsPlatformModels.GiveawayResponse> showGiveaways(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways")
    Call<RewardsPlatformModels.Giveaway> saveGiveAway(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body RewardsPlatformModels.Giveaway payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    Call<RewardsPlatformModels.Giveaway> getGiveawayById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}")
    Call<RewardsPlatformModels.Giveaway> updateGiveAway(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body RewardsPlatformModels.Giveaway payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/:id/audience/{audience_id}/status")
    Call<RewardsPlatformModels.GiveawayAudience> getGiveawayAudienceStatus(@Path("id") String  id , @Path("audience_id") String  audienceId , @Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    Call<List<RewardsPlatformModels.Offer>> showOffers(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> getOfferByName(@Path("name") String  name , @Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> updateOfferByName(@Path("name") String  name , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body RewardsPlatformModels.Offer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.AppUser> updateUserStatus(@Path("user_id") String  userId , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body RewardsPlatformModels.AppUser payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.UserRes> getUserDetails(@Path("user_id") String  userId , @Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    Call<RewardsPlatformModels.HistoryRes> getUserPointsHistory(@Path("user_id") String  userId , @Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    Call<RewardsPlatformModels.ConfigurationRes> getRewardsConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/configuration/")
    Call<RewardsPlatformModels.SetConfigurationRes> setRewardsConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body RewardsPlatformModels.ConfigurationRequest payload);
    
}