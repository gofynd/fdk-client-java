package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ServiceabilityPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> getApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    Call<ServiceabilityPlatformModels.EntityRegionView_Response> getEntityRegionView(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.EntityRegionView_Request payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResponse> getListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    Call<ServiceabilityPlatformModels.CompanyStoreView_Response> getCompanyStoreView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneSuccessResponse> updateZoneControllerView(@Path("zone_id") String  zoneId , @Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.GetSingleZoneDataViewResponse> getZoneDataView(@Path("company_id")  String companyId , @Path("zone_id") String  zoneId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    Call<ServiceabilityPlatformModels.ZoneResponse> createZone(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse> getZoneFromPincodeView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.GetZoneFromPincodeViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse> getZonesFromApplicationIdView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("zone_id") List<String>  zoneId ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones-list")
    Call<ServiceabilityPlatformModels.ListViewResponse> getZoneListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q ,  @Query("zone_id") List<String>  zoneId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    Call<ServiceabilityPlatformModels.GetStoresViewResponse> getStore(@Path("company_id")  String companyId , @Path("store_uid") Integer  storeUid );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<ServiceabilityPlatformModels.GetStoresViewResponse> getAllStores(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/reassign")
    Call<ServiceabilityPlatformModels.ReAssignStoreResponse> getOptimalLocations(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ReAssignStoreRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}")
    Call<ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse> addAppDp(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.ApplicationCompanyDpViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/{courier_partner_id}")
    Call<ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse> deleteAppDp(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("courier_partner_id") Integer  courierPartnerId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopBulkData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeCodStatusListingRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk")
    Call<ServiceabilityPlatformModels.PostBulkRegionJobResponse> postRegionJobBulk(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.BulkRegionJobSerializer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk")
    Call<ServiceabilityPlatformModels.GetBulkRegionJobResponse> getRegionJobBulk(@Path("company_id")  String companyId , @Query("current_page_number") Integer  currentPageNumber ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/tat/bulk/{batch_id}")
    Call<ServiceabilityPlatformModels.GetBulkRegionJobResponse> getRegionJobBulkBatchId(@Path("batch_id") String  batchId , @Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    Call<ServiceabilityPlatformModels.CompanyDpAccountResponse> upsertDpAccount(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.CompanyDpAccountRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/account")
    Call<ServiceabilityPlatformModels.CompanyDpAccountListResponse> getDpAccount(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize ,  @Query("stage") String  stage ,  @Query("payment_mode") String  paymentMode ,  @Query("transport_type") String  transportType );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.DpRuleUpdateSuccessResponse> updateDpRule(@Path("company_id")  String companyId , @Path("rule_uid") String  ruleUid ,@Body ServiceabilityPlatformModels.DpRulesUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.DpRuleSuccessResponse> getDpRules(@Path("company_id")  String companyId , @Path("rule_uid") String  ruleUid );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    Call<ServiceabilityPlatformModels.DpRuleSuccessResponse> upsertDpRules(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.DpRuleRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/rules")
    Call<ServiceabilityPlatformModels.DpMultipleRuleSuccessResponse> getDpRuleInsert(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    Call<ServiceabilityPlatformModels.DPCompanyRuleResponse> upsertDpCompanyRules(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.DPCompanyRuleRequest payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier/priority")
    Call<ServiceabilityPlatformModels.DPCompanyRuleResponse> getDpCompanyRules(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    Call<ServiceabilityPlatformModels.DPApplicationRuleResponse> upsertDpApplicationRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.DPApplicationRuleRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier/priority")
    Call<ServiceabilityPlatformModels.DPApplicationRuleResponse> getDpApplicationRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> patchApplicationServiceabilitySelfShipment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.SelfShipResponse payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> getApplicationServiceabilitySelfShipment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
}