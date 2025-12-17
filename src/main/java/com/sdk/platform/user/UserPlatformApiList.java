package com.sdk.platform.user;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface UserPlatformApiList {

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    Call<UserPlatformModels.CustomerListResponseSchema> getCustomers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    Call<UserPlatformModels.UserSearchResponseSchema> searchUsers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("query") List<String> query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    Call<UserPlatformModels.CreateUserResponseSchema> createUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("verified") Boolean verified, @Body UserPlatformModels.CreateUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/activation")
    Call<UserPlatformModels.BlockUserSuccess> blockOrUnblockUsers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.BlockUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/undelete")
    Call<UserPlatformModels.UnDeleteUserSuccess> unDeleteUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.UnDeleteUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}/timeline")
    Call<UserPlatformModels.GetUserTimeline> getUserTimeline(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    Call<UserPlatformModels.CreateUserResponseSchema> updateUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("user_id") String userId, @Body UserPlatformModels.UpdateUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    Call<UserPlatformModels.CreateUserSessionResponseSchema> createUserSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.CreateUserSessionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    Call<UserPlatformModels.SessionDeleteResponseSchema> deleteSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("session_id") String sessionId, @Query("reason") String reason, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    Call<UserPlatformModels.SessionListResponseSchema> getActiveSessions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/sessions")
    Call<UserPlatformModels.SessionsDeleteResponseSchema> deleteActiveSessions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("reason") String reason, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/archive")
    Call<UserPlatformModels.ArchiveUserSuccess> archiveUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.ArchiveUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<UserPlatformModels.PlatformSchema> getPlatformConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<UserPlatformModels.PlatformSchema> updatePlatformConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.PlatformSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    Call<UserPlatformModels.UserGroupResponseSchema> createUserGroup(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.CreateUserGroup payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group")
    Call<UserPlatformModels.UserGroupListResponseSchema> getUserGroups(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("name") String name, @Query("type") String type, @Query("status") String status, @Query("group_uid") Integer groupUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    Call<UserPlatformModels.UserGroupResponseSchema> updateUserGroup(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("group_id") String groupId, @Body UserPlatformModels.UpdateUserGroupSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    Call<UserPlatformModels.UserGroupResponseSchema> getUserGroupById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("group_id") String groupId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    Call<UserPlatformModels.UserGroupResponseSchema> updateUserGroupPartially(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("group_id") String groupId, @Body UserPlatformModels.PartialUserGroupUpdateSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_group/{group_id}")
    Call<UserPlatformModels.DeleteUserGroupSuccess> deleteUserGroup(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("group_id") String groupId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition")
    Call<UserPlatformModels.UserAttributeDefinitionDetails> createUserAttributeDefinition(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.CreateUserAttributeDefinition payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition")
    Call<UserPlatformModels.UserAttributeDefinitionList> getUserAttributeDefinitions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("excluding_ids") String excludingIds, @Query("slug") String slug, @Query("type") String type, @Query("customer_editable") Boolean customerEditable, @Query("encrypted") Boolean encrypted, @Query("pinned") Boolean pinned, @Query("pin_order") Integer pinOrder, @Query("is_locked") Boolean isLocked, @Query("name") String name, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    Call<UserPlatformModels.UserAttributeDefinition> updateUserAttributeDefinition(@Path("attribute_def_id") String attributeDefId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.CreateUserAttributeDefinition payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    Call<UserPlatformModels.SuccessMessage> deleteUserAttributeDefinitionById(@Path("attribute_def_id") String attributeDefId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}")
    Call<UserPlatformModels.UserAttributeDefinition> getUserAttributeDefinitionById(@Path("attribute_def_id") String attributeDefId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    Call<UserPlatformModels.UserAttribute> updateUserAttribute(@Path("attribute_def_id") String attributeDefId, @Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.CreateUserAttribute payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    Call<UserPlatformModels.UserAttribute> getUserAttribute(@Path("attribute_def_id") String attributeDefId, @Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/definition/{attribute_def_id}/user/{user_id}")
    Call<UserPlatformModels.SuccessMessage> deleteUserAttribute(@Path("attribute_def_id") String attributeDefId, @Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/user/{user_id}")
    Call<Object> getUserAttributesForUser(@Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/user/{user_id}")
    Call<UserPlatformModels.BulkUserAttribute> updateUserAttributes(@Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.CreateBulkUserAttribute payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/user/{user_id}")
    Call<UserPlatformModels.SuccessMessage> deleteUserAttributesInBulk(@Path("user_id") String userId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.DeleteBulkUserAttribute payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/attribute/{attribute_id}")
    Call<UserPlatformModels.UserAttribute> getUserAttributeById(@Path("attribute_id") String attributeId, @Path("application_id") String applicationId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/users/jobs/import")
    Call<UserPlatformModels.BulkActionModel> bulkImportStoreFrontUsers(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.CreateStoreFrontUsersPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/users/jobs/import")
    Call<UserPlatformModels.BulkActionPaginationSchema> getBulkImportUsersList(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("search") String search, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("status") String status, @Query("file_format") String fileFormat, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/users/jobs/export")
    Call<UserPlatformModels.BulkActionModel> createBulkExportUsers(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body UserPlatformModels.BulkUserExportSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/users/jobs/export")
    Call<UserPlatformModels.BulkActionPaginationSchema> getBulkExportUsersList(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("file_format") String fileFormat, @Query("search") String search, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/users/jobs/{job_id}")
    Call<UserPlatformModels.BulkActionModel> getUsersJobByJobId(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Path("job_id") String jobId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/user_attribute/users")
    Call<UserPlatformModels.UserAttributeFiltered> filterUsersByAttributes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body UserPlatformModels.UserAttributeFilter payload, @HeaderMap Map<String, String> requestHeaders);
}