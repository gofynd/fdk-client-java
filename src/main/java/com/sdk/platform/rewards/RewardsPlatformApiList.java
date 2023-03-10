package com.sdk.platform.rewards;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface RewardsPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    Call<RewardsPlatformModels.GiveawayResponse> getGiveaways(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    Call<RewardsPlatformModels.Giveaway> createGiveaway(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body RewardsPlatformModels.Giveaway payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    Call<RewardsPlatformModels.Giveaway> getGiveawayByID(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    Call<RewardsPlatformModels.Giveaway> updateGiveaway(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body RewardsPlatformModels.Giveaway payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    Call<List<RewardsPlatformModels.Offer>> getOffers(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> getOfferByName(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("name") String  name );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<RewardsPlatformModels.Offer> updateOfferByName(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("name") String  name ,@Body RewardsPlatformModels.Offer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.UserRes> getUserAvailablePoints(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("user_id") String  userId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<RewardsPlatformModels.AppUser> updateUserStatus(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("user_id") String  userId ,@Body RewardsPlatformModels.AppUser payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    Call<RewardsPlatformModels.HistoryRes> getUserPointsHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("user_id") String  userId , @Query("page_id") String  pageId ,  @Query("page_limit") Integer  pageLimit ,  @Query("page_size") Integer  pageSize );
    
}