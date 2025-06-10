package com.sdk.platform.companyprofile;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CompanyProfilePlatformApiList {

    @GET ("/service/platform/company-profile/v2.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.GetCompanyProfileSerializerResponseSchema> cbsOnboardGet(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/company-profile/v2.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> updateCompany(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.UpdateCompany payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    Call<CompanyProfilePlatformModels.MetricsSchema> getCompanyMetrics(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.GetBrandResponseSchema> getBrand(@Path("company_id") String companyId, @Path("brand_id") String brandId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> editBrand(@Path("company_id") String companyId, @Path("brand_id") String brandId, @Body CompanyProfilePlatformModels.UpdateBrandRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> createBrand(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.CreateBrandRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v2.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.CompanyBrandListSchema> getBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v2.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> createCompanyBrandMapping(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.CompanyBrandPostRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v2.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.LocationListSchema> getLocations(@Path("company_id") String companyId, @Query("store_type") String storeType, @Query("q") String q, @Query("stage") String stage, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("location_ids") List<Integer> locationIds, @Query("types") List<String> types, @Query("tags") List<String> tags, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v2.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> createLocation(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.LocationSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v2.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.GetLocationSchema> getLocationDetail(@Path("company_id") String companyId, @Path("location_id") String locationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/company-profile/v2.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> updateLocation(@Path("company_id") String companyId, @Path("location_id") String locationId, @Body CompanyProfilePlatformModels.LocationSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponseSchema> createLocationBulk(@Path("company_id") String companyId, @Body CompanyProfilePlatformModels.BulkLocationSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/tags")
    Call<CompanyProfilePlatformModels.StoreTagsResponseSchema> getLocationTags(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);
}