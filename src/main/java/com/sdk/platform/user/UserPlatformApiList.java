package com.sdk.platform.user;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface UserPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    Call<UserPlatformModels.CustomerListResponseSchema> getCustomers(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("q") Object  q ,  @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    Call<UserPlatformModels.UserSearchResponseSchema> searchUsers(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    Call<UserPlatformModels.CreateUserResponseSchema> createUser(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.CreateUserRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    Call<UserPlatformModels.BlockUserSuccess> blockOrUnblockUsers(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.BlockUserRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    Call<UserPlatformModels.ArchiveUserSuccess> archiveUser(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.ArchiveUserRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    Call<UserPlatformModels.UnDeleteUserSuccess> unDeleteUser(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.UnDeleteUserRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    Call<UserPlatformModels.CreateUserResponseSchema> updateUser(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("user_id") String  userId ,@Body UserPlatformModels.UpdateUserRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    Call<UserPlatformModels.CreateUserSessionResponseSchema> createUserSession(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.CreateUserSessionRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    Call<UserPlatformModels.SessionDeleteResponseSchema> deleteSession(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("session_id") String  sessionId ,  @Query("reason") String  reason );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    Call<UserPlatformModels.SessionListResponseSchema> getActiveSessions(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    Call<UserPlatformModels.SessionDeleteResponseSchema> deleteActiveSessions(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("reason") String  reason );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<UserPlatformModels.PlatformSchema> getPlatformConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<UserPlatformModels.PlatformSchema> updatePlatformConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body UserPlatformModels.PlatformSchema payload);
    
}