package com.sdk.partner.logistics;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticsPartnerApiList {

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/localities/bulk-sample")
    Call<LogisticsPartnerModels.BulkRegionServiceabilityTatResultItemData> sampleFileServiceability(@Path("organization_id") String organizationId, @Body LogisticsPartnerModels.BulkRegionServiceabilityTatDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/localities/bulk-sample")
    Call<LogisticsPartnerModels.BulkRegionServiceabilityTatResult> getSampleFileServiceabilityStatus(@Path("organization_id") String organizationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<LogisticsPartnerModels.BulkRegionResultItemData> bulkTat(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<LogisticsPartnerModels.BulkRegionResult> getBulkTat(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/delivery-time")
    Call<LogisticsPartnerModels.RegionTatResult> createDeliveryTime(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.RegionTatDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/delivery-time")
    Call<LogisticsPartnerModels.RegionTatItemResult> getDeliveryTimes(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("from_country_code") String fromCountryCode, @Query("from_state_code") String fromStateCode, @Query("from_city_code") String fromCityCode, @Query("from_sector_code") String fromSectorCode, @Query("from_pincode") String fromPincode, @Query("to_country_code") String toCountryCode, @Query("to_state_code") String toStateCode, @Query("to_city_code") String toCityCode, @Query("to_sector_code") String toSectorCode, @Query("to_pincode") String toPincode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/delivery-time/{id}")
    Call<LogisticsPartnerModels.RegionTatResult> getDeliveryTime(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/delivery-time/{id}")
    Call<LogisticsPartnerModels.RegionTatResult> updateDeliveryTime(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @Body LogisticsPartnerModels.RegionTatUpdateDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/delivery-time/{id}")
    Call<LogisticsPartnerModels.RegionTatResult> deleteDeliveryTime(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/serviceability")
    Call<LogisticsPartnerModels.RegionServiceabilityResult> createServiceability(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.RegionServiceabilityDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/serviceability")
    Call<LogisticsPartnerModels.RegionServiceabilityItemResult> getServiceabilities(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("country_code") String countryCode, @Query("state_code") String stateCode, @Query("city_code") String cityCode, @Query("sector_code") String sectorCode, @Query("pincode") String pincode, @Query("first_mile") Boolean firstMile, @Query("last_mile") Boolean lastMile, @Query("doorstep_return") Boolean doorstepReturn, @Query("doorstep_qc") Boolean doorstepQc, @Query("installation") Boolean installation, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/serviceability/{id}")
    Call<LogisticsPartnerModels.RegionServiceabilityResult> getServiceability(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/serviceability/{id}")
    Call<LogisticsPartnerModels.ServiceabilityDetailsResult> updateServiceability(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @Body LogisticsPartnerModels.ServiceabilityDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/logistics/v2.0/organization/{partner_org_id}/courier-partner/{courier_partner_extension_id}/scheme/{scheme_id}/serviceability/{id}")
    Call<LogisticsPartnerModels.RegionServiceabilityResult> deleteServiceability(@Path("partner_org_id") String partnerOrgId, @Path("courier_partner_extension_id") String courierPartnerExtensionId, @Path("scheme_id") String schemeId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<LogisticsPartnerModels.BulkRegionResultItemData> bulkServiceability(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.BulkRegionJobDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<LogisticsPartnerModels.BulkRegionResult> getBulkServiceability(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account")
    Call<LogisticsPartnerModels.CourierAccount> createCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Body LogisticsPartnerModels.CourierAccountDetailsBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account")
    Call<LogisticsPartnerModels.CompanyCourierPartnerAccountListResult> getCourierPartnerAccounts(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account/{account_id}")
    Call<LogisticsPartnerModels.CourierAccountResult> updateCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("account_id") String accountId, @Body LogisticsPartnerModels.CourierAccountUpdateDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account/{account_id}")
    Call<LogisticsPartnerModels.CourierAccountResult> getCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/scheme/")
    Call<LogisticsPartnerModels.CourierPartnerSchemeModel> createCourierPartnerScheme(@Path("organization_id") String organizationId, @Body LogisticsPartnerModels.CourierPartnerSchemeDetailsModel payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/scheme/{scheme_id}")
    Call<LogisticsPartnerModels.CourierPartnerSchemeUpdateDetails> updateCourierPartnerScheme(@Path("organization_id") String organizationId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.CourierPartnerSchemeUpdateDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{organization_id}/countries")
    Call<LogisticsPartnerModels.GetCountries> getCountries(@Path("organization_id") String organizationId, @Query("onboarding") Boolean onboarding, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);
}