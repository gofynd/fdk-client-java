package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ServiceabilityPlatformApiList {

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.ZoneSchema> createZone(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CreateZoneDataSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewSchema> getZones(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("stage") String stage, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("pincode") String pincode, @Query("state") String state, @Query("city") String city, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.GetZoneByIdSchema> getZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneUpdateSuccessResult> updateZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.UpdateZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneDeleteSuccessResult> deleteZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export")
    Call<ServiceabilityPlatformModels.ZoneBulkExport> createBulkExport(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.BulkCreateZoneExport payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export/{batch_id}")
    Call<ServiceabilityPlatformModels.GetZoneBulkExport> getBulkExport(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    Call<ServiceabilityPlatformModels.GeoAreaResponseBody> createGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.GeoAreaRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    Call<ServiceabilityPlatformModels.GeoAreaGetResponseBody> getGeoAreas(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("page_no") Integer pageNo, @Query("type") String type, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("state") String state, @Query("city") String city, @Query("pincode") String pincode, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaDetails> getGeoArea(@Path("company_id") String companyId, @Path("geoarea_id") String geoareaId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaPutResponseBody> updateGeoArea(@Path("company_id") String companyId, @Path("geoarea_id") String geoareaId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.GeoAreaRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk")
    Call<ServiceabilityPlatformModels.BulkGeoAreaResult> createBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.BulkGeoAreaDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    Call<ServiceabilityPlatformModels.BulkGeoAreaGetResult> getBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    Call<ServiceabilityPlatformModels.BulkGeoAreaResult> updateBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @Body ServiceabilityPlatformModels.BulkGeoAreaDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaBulkCreationResult> createGeoAreaExportJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaBulkExportResult> getGeoAreaExportJobStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPResult> updatePincodeMopView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResult> updatePincodeBulkView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopBulkData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResult> updatePincodeCoDListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_number") Integer pageNumber, @Query("page_size") Integer pageSize, @Body ServiceabilityPlatformModels.PincodeCodStatusListingDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResultData> updatePincodeAuditHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_number") Integer pageNumber, @Query("page_size") Integer pageSize, @Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CourierAccountDetailsBody> createCourierPartnerAccount(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierAccountDetailsBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult> getCourierPartnerAccounts(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @Query("account_ids") List<String> accountIds, @Query("self_ship") Boolean selfShip, @Query("own_account") Boolean ownAccount, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountDetailsBody> updateCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @Body ServiceabilityPlatformModels.CourierAccountDetailsBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResult> getCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> updateCourierRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> getCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResult> createCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRulesListResult> getCourierPartnerRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/shipment/courier-partners")
    Call<ServiceabilityPlatformModels.ShipmentCourierPartnerResult> getCourierPartners(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ShipmentCourierPartnerDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> updateCompanyConfiguration(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CompanyConfigurationSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> getCompanyConfiguration(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigPut> updateApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfigPutDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigGetResult> getApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigPatchResult> patchApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfigPatch payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResultItemData> bulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<ServiceabilityPlatformModels.BulkRegionResult> getBulkTat(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

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

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResultItemData> bulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body ServiceabilityPlatformModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<ServiceabilityPlatformModels.BulkRegionResult> getBulkServiceability(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialResult> createPackageMaterial(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackagesListResult> getPackageMaterialList(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("size") String size, @Query("package_type") String packageType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageRuleResult> createPackageMaterialRule(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> getPackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> updatePackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.PackageRule payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResult> updatePackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageItem> getPackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResult> updateCourierPartnerRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResult> updateStoreRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    Call<ServiceabilityPlatformModels.OptimalLocationsResult> getOptimalLocations(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.OptimlLocationsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme")
    Call<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> createCourierPartnerScheme(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierPartnerSchemeDetailsModel payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme")
    Call<ServiceabilityPlatformModels.CourierPartnerSchemeList> getCourierPartnerSchemes(@Path("company_id") String companyId, @Query("scheme_type") String schemeType, @Query("payment_mode") String paymentMode, @Query("capabilities") List<String> capabilities, @Query("scheme_ids") List<String> schemeIds, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme/{scheme_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> updateCourierPartnerScheme(@Path("scheme_id") String schemeId, @Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierPartnerSchemeUpdateDetailsSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/courier-partner/scheme/{scheme_id}")
    Call<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> getCourierPartnerScheme(@Path("scheme_id") String schemeId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/localities/bulk-sample")
    Call<ServiceabilityPlatformModels.BulkRegionServiceabilityTatResultItemData> sampleFileServiceability(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.BulkRegionServiceabilityTatDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/localities/bulk-sample")
    Call<ServiceabilityPlatformModels.BulkRegionServiceabilityTatResult> getSampleFileServiceabilityStatus(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/countries")
    Call<ServiceabilityPlatformModels.GetCountries> getCountries(@Path("company_id") String companyId, @Query("onboard") Boolean onboard, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("hierarchy") String hierarchy, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/list")
    Call<ServiceabilityPlatformModels.InstallCourierPartnerResponseSchema> getInstalledCourierPartnerExtensions(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_installed") String isInstalled, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    Call<ServiceabilityPlatformModels.SelfshipSchema> getSelfShipDetails(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    Call<ServiceabilityPlatformModels.SelfshipSchema> updateSelfShipDetails(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.SelfshipSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/sample")
    Call<String> downloadGeoareaSampleFile(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);
}