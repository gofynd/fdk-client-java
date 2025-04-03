package com.sdk.platform.companyprofile;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CompanyProfilePlatformApiList {

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.GetCompanyProfileSerializerResponse> cbsOnboardGet(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> updateCompany(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.UpdateCompany payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    Call<CompanyProfilePlatformModels.MetricsSerializer> getCompanyMetrics(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.GetBrandResponseSerializer> getBrand(@Path("company_id") String companyId, @Path("brand_id") String brandId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> editBrand(@Path("company_id") String companyId, @Path("brand_id") String brandId, @Body CompanyProfilePlatformModels.UpdateBrandRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createBrand(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.CreateBrandRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.CompanyBrandListSerializer> getBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createCompanyBrandMapping(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.CompanyBrandPostRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.LocationListSerializer> getLocations(@Path("company_id") String companyId, @Query("store_type") String storeType, @Query("q") String q, @Query("stage") String stage, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("location_ids") List<Integer> locationIds, @Query("types") List<String> types, @Query("tags") List<String> tags, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createLocation(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.LocationSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.GetLocationSerializer> getLocationDetail(@Path("company_id") String companyId, @Path("location_id") String locationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> updateLocation(@Path("company_id") String companyId, @Path("location_id") String locationId, @Body CompanyProfilePlatformModels.LocationSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createLocationBulk(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.BulkLocationSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/tags")
    Call<CompanyProfilePlatformModels.StoreTagsResponseSchema> getLocationTags(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);
}