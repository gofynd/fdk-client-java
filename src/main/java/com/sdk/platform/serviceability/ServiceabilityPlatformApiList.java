package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ServiceabilityPlatformApiList {

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResult> getZones(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("application_id") String applicationId, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("state") String state, @Query("city") String city, @Query("pincode") String pincode, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ZoneResult> createZone(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CreateZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneSuccessResult> updateZoneById(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Body ServiceabilityPlatformModels.UpdateZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.GetZoneByIdSchema> getZoneById(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<ServiceabilityPlatformModels.GetStoresViewResult> getAllStores(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPResult> updatePincodeMopView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResult> updatePincodeBulkView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopBulkData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResult> updatePincodeCoDListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_number") Integer pageNumber, @Query("page_size") Integer pageSize, @Body ServiceabilityPlatformModels.PincodeCodStatusListingDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResultData> updatePincodeAuditHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_number") Integer pageNumber, @Query("page_size") Integer pageSize, @Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CourierAccount> createCourierPartnerAccount(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierAccountDetailsBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult> getCourierPartnerAccounts(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResult> updateCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @Body ServiceabilityPlatformModels.CourierAccountUpdateDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResult> getCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> updateCourierRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> getCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> createCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRulesListResult> getCourierPartnerRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/shipment/courier-partners")
    Call<ServiceabilityPlatformModels.ShipmentCourierPartnerResult> getCourierPartners(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ShipmentCourierPartnerDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> updateCompanyConfiguration(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CompanyConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> getCompanyConfiguration(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfig> updateApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfig> getApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResultItemData> bulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResult> getBulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResult> patchApplicationServiceabilitySelfShipment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.SelfShipResult payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/selfship")
    Call<ServiceabilityPlatformModels.ApplicationSelfShipConfigResult> getApplicationServiceabilitySelfShipment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> getApplicationConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> insertApplicationConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.StoreRuleConfigData payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/configuration")
    Call<ServiceabilityPlatformModels.StoreRuleConfigData> updateStoreRulesConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.StoreRuleConfigData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    Call<ServiceabilityPlatformModels.GetStoreRulesApiResult> getStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules")
    Call<ServiceabilityPlatformModels.StoreRuleResultSchema> createStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleDataSchema> getStoreRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleUpdateResultSchema> updateStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @Body ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResultItemData> bulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResult> getBulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    Call<ServiceabilityPlatformModels.ServiceabilityModel> getServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Path("region_id") String regionId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/region/{region_id}")
    Call<ServiceabilityPlatformModels.ServiceabilityModel> updateServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Path("region_id") String regionId, @Body ServiceabilityPlatformModels.ServiceabilityModel payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialResult> createPackageMaterial(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialList> getPackageMaterialList(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("size") String size, @Query("package_type") String packageType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageRuleResult> createPackageMaterialRule(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageMaterialRuleList> getPackageMaterialRules(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") String isActive, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> updatePackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> getPackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResult> updatePackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResult> getPackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResult> updateCourierPartnerRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    Call<ServiceabilityPlatformModels.OptimalLocationsResult> getOptimalLocations(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.OptimlLocationsDetailsSchema payload, @HeaderMap Map<String, String> requestHeaders);
}