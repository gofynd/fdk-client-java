package com.sdk.partner.logistics;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LogisticsPartnerApiList {

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/localities/bulk-sample")
    Call<LogisticsPartnerModels.BulkRegionServiceabilityTatResponseItemData> sampleFileServiceability(@Path("organization_id") String organizationId, @Body LogisticsPartnerModels.BulkRegionServiceabilityTatRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/localities/bulk-sample")
    Call<LogisticsPartnerModels.BulkRegionServiceabilityTatResponse> getSampleFileServiceabilityStatus(@Path("organization_id") String organizationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<LogisticsPartnerModels.BulkRegionResponseItemData> bulkTat(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.BulkRegionJobSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/tat")
    Call<LogisticsPartnerModels.BulkRegionResponse> getBulkTat(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<LogisticsPartnerModels.BulkRegionResponseItemData> bulkServiceability(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.BulkRegionJobSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/{extension_id}/scheme/{scheme_id}/serviceability/bulk")
    Call<LogisticsPartnerModels.BulkRegionResponse> getBulkServiceability(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("scheme_id") String schemeId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("batch_id") String batchId, @Query("action") String action, @Query("status") String status, @Query("country") String country, @Query("region") String region, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account")
    Call<LogisticsPartnerModels.CourierAccount> createCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Body LogisticsPartnerModels.CourierAccount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account")
    Call<LogisticsPartnerModels.CompanyCourierPartnerAccountListResponse> getCourierPartnerAccounts(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("stage") String stage, @Query("payment_mode") String paymentMode, @Query("transport_type") String transportType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account/{account_id}")
    Call<LogisticsPartnerModels.CourierAccountResponse> updateCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("account_id") String accountId, @Body LogisticsPartnerModels.CourierAccount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v1.0/organization/{organization_id}/company/{company_id}/courier-partner/account/{account_id}")
    Call<LogisticsPartnerModels.CourierAccountResponse> getCourierPartnerAccount(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("account_id") String accountId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/scheme/")
    Call<LogisticsPartnerModels.CourierPartnerSchemeModel> createCourierPartnerScheme(@Path("organization_id") String organizationId, @Body LogisticsPartnerModels.CourierPartnerSchemeModel payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/logistics/v1.0/organization/{organization_id}/courier-partner/scheme/{scheme_id}")
    Call<LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest> updateCourierPartnerScheme(@Path("organization_id") String organizationId, @Path("scheme_id") String schemeId, @Body LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/logistics/v2.0/organization/{organization_id}/countries")
    Call<LogisticsPartnerModels.GetCountries> getCountries(@Path("organization_id") String organizationId, @Query("onboarding") Boolean onboarding, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);
}