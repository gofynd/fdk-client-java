package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ServiceabilityPlatformApiList {

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResponse> getZones(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("channel_id") String channelId, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("state") String state, @Query("city") String city, @Query("pincode") String pincode, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ZoneResponse> createZone(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CreateZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneSuccessResponse> updateZoneById(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Body ServiceabilityPlatformModels.UpdateZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.GetZoneByIdSchema> getZoneById(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<ServiceabilityPlatformModels.GetStoresViewResponse> getAllStores(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopBulkData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeCodStatusListingRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CourierAccount> createCourierPartnerAccount(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierAccountRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResponse> getCourierPartnerAccounts(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResponse> updateCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @Body ServiceabilityPlatformModels.CourierAccount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResponse> getCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponse> updateCourierRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponse> getCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponse> createCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRulesListResponse> getCourierPartnerRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> updateCompanyConfiguration(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CompanyConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> getCompanyConfiguration(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfig> updateApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfig> getApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResponseItemData> bulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResponse> getBulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> patchApplicationServiceabilitySelfShipment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.SelfShipResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> getApplicationServiceabilitySelfShipment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> getApplicationConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> insertApplicationConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.StoreRuleConfigData payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> updateStoreRulesConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.StoreRuleConfigData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    Call<ServiceabilityPlatformModels.GetStoreRulesApiResponse> getStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    Call<ServiceabilityPlatformModels.StoreRuleResponseSchema> createStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CreateStoreRuleRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleDataSchema> getStoreRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleUpdateResponseSchema> updateStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @Body ServiceabilityPlatformModels.CreateStoreRuleRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResponseItemData> bulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResponse> getBulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    Call<ServiceabilityPlatformModels.ServiceabilityModel> getServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Path("region_id") String regionId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    Call<ServiceabilityPlatformModels.ServiceabilityModel> updateServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Path("region_id") String regionId, @Body ServiceabilityPlatformModels.ServiceabilityModel payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> createPackageMaterial(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialList> getPackageMaterialList(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("size") String size, @Query("package_type") String packageType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageRuleResponse> createPackageMaterialRule(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageMaterialRuleList> getPackageMaterialRules(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") String isActive, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResponse> updatePackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResponse> getPackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> updatePackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> getPackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResponse> updateCourierPartnerRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    Call<ServiceabilityPlatformModels.OptimalLocationsResponse> getOptimalLocations(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.OptimlLocationsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);
}