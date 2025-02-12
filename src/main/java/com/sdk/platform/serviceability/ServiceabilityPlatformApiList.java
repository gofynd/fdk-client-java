package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ServiceabilityPlatformApiList {

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.ZoneResponseV2> createZone(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CreateZoneV2Data payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResponseV2> getZones(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("stage") String stage, @Query("type") String type, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("pincode") String pincode, @Query("state") String state, @Query("city") String city, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.GetZoneByIdSchema> getZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneUpdateSuccessResponse> updateZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.UpdateZoneDataV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneDeleteSuccessResponse> deleteZone(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/{zone_id}/details")
    Call<ServiceabilityPlatformModels.GetZoneByIdDetailsSchema> getZoneDetails(@Path("company_id") String companyId, @Path("zone_id") String zoneId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk")
    Call<ServiceabilityPlatformModels.CreateBulkZoneResponse> createBulkZone(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CreateBulkZoneData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/history")
    Call<ServiceabilityPlatformModels.GetBulkZoneHistory> getBulkZone(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export")
    Call<ServiceabilityPlatformModels.ZoneBulkExport> createBulkExport(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.BulkCreateZoneExport payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/export/{batch_id}")
    Call<ServiceabilityPlatformModels.GetZoneBulkExport> getBulkExport(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopBulkData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeCodStatusListingRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    Call<ServiceabilityPlatformModels.GeoAreaResponseBody> createGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.GeoAreaRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas")
    Call<ServiceabilityPlatformModels.GeoAreaGetResponseBody> getGeoAreas(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("page_no") Integer pageNo, @Query("type") String type, @Query("q") String q, @Query("country_iso_code") String countryIsoCode, @Query("state") String state, @Query("city") String city, @Query("pincode") String pincode, @Query("sector") String sector, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaResponse> getGeoArea(@Path("company_id") String companyId, @Path("geoarea_id") String geoareaId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaPutResponseBody> updateGeoArea(@Path("company_id") String companyId, @Path("geoarea_id") String geoareaId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.GeoAreaRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk")
    Call<ServiceabilityPlatformModels.BulkGeoAreaResult> createBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.BulkGeoAreaDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    Call<ServiceabilityPlatformModels.BulkGeoAreaGetResponse> getBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/{geoarea_id}")
    Call<ServiceabilityPlatformModels.BulkGeoAreaResult> updateBulkGeoArea(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @Body ServiceabilityPlatformModels.BulkGeoAreaDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaBulkCreationResult> createGeoAreaExportJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/bulk/export/{geoarea_id}")
    Call<ServiceabilityPlatformModels.GeoAreaBulkExportResult> getGeoAreaExportJobStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("geoarea_id") String geoareaId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    Call<ServiceabilityPlatformModels.CompanySelfShip> updateCompanySelfShip(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CompanySelfShip payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/selfship")
    Call<ServiceabilityPlatformModels.CompanySelfShip> getCompanySelfShip(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CourierAccount> createCourierPartnerAccount(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CourierAccount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account")
    Call<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResponse> getCourierPartnerAccounts(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @Query("account_ids") List<String> accountIds, @Query("self_ship") Boolean selfShip, @Query("own_account") Boolean ownAccount, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccount> updateCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @Body ServiceabilityPlatformModels.CourierAccount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/account/{account_id}")
    Call<ServiceabilityPlatformModels.CourierAccountResponse> getCourierPartnerAccount(@Path("company_id") String companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponseSchema> createCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules")
    Call<ServiceabilityPlatformModels.CourierPartnerRulesListResponse> getCourierPartnerRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponseSchema> updateCourierRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @Body ServiceabilityPlatformModels.CourierPartnerRule payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponseSchema> getCourierPartnerRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> updateCompanyConfiguration(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.CompanyConfigurationShema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/configuration")
    Call<ServiceabilityPlatformModels.CompanyConfig> getCompanyConfiguration(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigPutResponse> updateApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfigPutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigGetResponse> getApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ServiceabilityPlatformModels.ApplicationConfigPatchResponse> patchApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.ApplicationConfigPatchRequest payload, @HeaderMap Map<String, String> requestHeaders);

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

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResponse> updateStoreRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleDataSchema> getStoreRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}")
    Call<ServiceabilityPlatformModels.StoreRuleUpdateResponseSchema> updateStoreRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @Body ServiceabilityPlatformModels.CreateStoreRuleRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> createPackageMaterial(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-materials")
    Call<ServiceabilityPlatformModels.PackageMaterialList> getPackageMaterialList(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("size") String size, @Query("package_type") String packageType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules")
    Call<ServiceabilityPlatformModels.PackageRuleResult> createPackageMaterialRule(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.PackageRuleRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}/details")
    Call<ServiceabilityPlatformModels.PackageRuleResult> getPackageMaterialRuleDetails(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") String isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/details")
    Call<ServiceabilityPlatformModels.PackageMaterialRuleList> getListPackageMaterialRuleDetails(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") String isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> getPackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/rules/{rule_id}")
    Call<ServiceabilityPlatformModels.PackageRuleResult> updatePackageMaterialRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body ServiceabilityPlatformModels.PackageRuleRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> updatePackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @Body ServiceabilityPlatformModels.PackageMaterial payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/packaging-material/{package_material_id}")
    Call<ServiceabilityPlatformModels.PackageMaterialResponse> getPackageMaterials(@Path("company_id") String companyId, @Path("package_material_id") String packageMaterialId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/priority")
    Call<ServiceabilityPlatformModels.RulePriorityResponse> updateCourierPartnerRulePriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ServiceabilityPlatformModels.RulePriorityRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/courier-partner/list")
    Call<ServiceabilityPlatformModels.InstallCourierPartnerResponseSchema> getInstalledCourierPartnerExtensions(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_installed") String isInstalled, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/localities/{locality_type}/{locality_value}")
    Call<ServiceabilityPlatformModels.GetLocality> getLocality(@Path("company_id") String companyId, @Path("locality_type") String localityType, @Path("locality_value") String localityValue, @Query("country") String country, @Query("state") String state, @Query("city") String city, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/localities/{locality_type}")
    Call<ServiceabilityPlatformModels.GetLocalities> getLocalities(@Path("company_id") String companyId, @Path("locality_type") String localityType, @Query("country") String country, @Query("state") String state, @Query("city") String city, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("name") String name, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/countries/{country_iso_code}")
    Call<ServiceabilityPlatformModels.GetCountry> getCountry(@Path("company_id") String companyId, @Path("country_iso_code") String countryIsoCode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/countries")
    Call<ServiceabilityPlatformModels.GetCountries> getCountries(@Path("company_id") String companyId, @Query("onboard") Boolean onboard, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("hierarchy") String hierarchy, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/country/{country_iso_code}/address/templates/{template_name}/validate")
    Call<ServiceabilityPlatformModels.ValidateAddressRequest> validateAddress(@Path("company_id") String companyId, @Path("country_iso_code") String countryIsoCode, @Path("template_name") String templateName, @Body ServiceabilityPlatformModels.ValidateAddressRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/logistics/v1.0/company/{company_id}/optimal-locations")
    Call<ServiceabilityPlatformModels.OptimalLocationsResponse> getOptimalLocations(@Path("company_id") String companyId, @Body ServiceabilityPlatformModels.OptimlLocationsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/courier-partner/rules/{rule_uid}/details")
    Call<ServiceabilityPlatformModels.CourierPartnerRuleResponseDetailSchema> getCourierPartnerRuleDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/store/rules/{rule_uid}/details")
    Call<ServiceabilityPlatformModels.StoreRuleDataDetailsSchema> getStoreRuleDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_uid") String ruleUid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/geoareas/regions/bulk/sample")
    Call<String> downloadGeoareaSampleFile(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/logistics/v2.0/company/{company_id}/application/{application_id}/zones/bulk/sample/{product_type}")
    Call<String> downloadZoneSampleFile(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("product_type") String productType, @HeaderMap Map<String, String> requestHeaders);
}