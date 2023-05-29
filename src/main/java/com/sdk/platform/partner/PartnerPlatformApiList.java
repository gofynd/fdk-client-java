package com.sdk.platform.partner;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PartnerPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}/{entity}/{entity_id}/charge_consent")
    Call<PartnerPlatformModels.SubscriptionRes> subscribeExtension(@Path("company_id")  String companyId , @Path("entity") String  entity , @Path("extension_id") String  extensionId , @Path("entity_id") String  entityId ,@Body PartnerPlatformModels.SubscriptionRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extensions")
    Call<PartnerPlatformModels.ExtensionList> getExtensionsForCompany(@Path("company_id")  String companyId , @Query("page_size") Double  pageSize ,  @Query("tag") String  tag ,  @Query("current_page") String  currentPage ,  @Query("page_no") Double  pageNo ,  @Query("filter_by") String  filterBy );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/public-extension/{extension_id}")
    Call<PartnerPlatformModels.PublicExtension> getPublicExtension(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    Call<PartnerPlatformModels.ExtensionCommon> getExtensionById(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/extension/{extension_id}")
    Call<PartnerPlatformModels.UninstallExtension> deleteExtensionById(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Query("message") String  message ,  @Query("uninstall_reason_type") String  uninstallReasonType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/private-extensions")
    Call<PartnerPlatformModels.ExtensionResponse> getPrivateExtensions(@Path("company_id")  String companyId , @Query("page_size") Double  pageSize ,  @Query("page_no") Double  pageNo ,  @Query("query") String  query );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/extension/suggestions")
    Call<PartnerPlatformModels.ExtensionSuggestionList> getExtensionsSuggestions(@Path("company_id")  String companyId , @Query("page_size") Double  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request")
    Call<PartnerPlatformModels.PartnerRequestList> getPartnerInvites(@Path("company_id")  String companyId , @Query("request_status") String  requestStatus ,  @Query("page_size") String  pageSize ,  @Query("page_no") String  pageNo );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    Call<PartnerPlatformModels.PartnerInviteDetails> getPartnerRequestDetails(@Path("company_id")  String companyId , @Path("invite_id") String  inviteId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/partners/v1.0/company/{company_id}/partner-request/{invite_id}")
    Call<PartnerPlatformModels.PartnerInviteDetails> modifyPartnerRequest(@Path("company_id")  String companyId , @Path("invite_id") String  inviteId ,@Body PartnerPlatformModels.ModifyPartnerReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/setup")
    Call<PartnerPlatformModels.SetupProductRes> setupProducts(@Path("company_id")  String companyId , @Query("request_id") String  requestId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    Call<PartnerPlatformModels.getProxyPathRes> getProxyPath(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("extension_id") String  extensionId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    Call<PartnerPlatformModels.AddProxyResponse> addProxyPath(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("extension_id") String  extensionId ,@Body PartnerPlatformModels.AddProxyReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    Call<PartnerPlatformModels.AddProxyResponse> getProxyPathAttachedPath(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("extension_id") String  extensionId , @Path("attached_path") String  attachedPath );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    Call<PartnerPlatformModels.RemoveProxyResponse> removeProxyPath(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("extension_id") String  extensionId , @Path("attached_path") String  attachedPath );
    
}