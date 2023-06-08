package com.sdk.platform.companyprofile;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CompanyProfilePlatformApiList {
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.GetCompanyProfileSerializerResponse> cbsOnboardGet(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> updateCompany(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.UpdateCompany payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    Call<CompanyProfilePlatformModels.MetricsSerializer> getCompanyMetrics(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.GetBrandResponseSerializer> getBrand(@Path("company_id")  String companyId , @Path("brand_id") String  brandId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> editBrand(@Path("company_id")  String companyId , @Path("brand_id") String  brandId ,@Body CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand/")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createBrand(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.CompanyBrandListSerializer> getBrands(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createCompanyBrandMapping(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.CompanyBrandPostRequestSerializer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.LocationListSerializer> getLocations(@Path("company_id")  String companyId , @Query("store_type") String  storeType ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("location_ids") List<Integer>  locationIds );
    
    
    
    
    
    
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createLocation(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.LocationSerializer payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.GetLocationSerializer> getLocationDetail(@Path("company_id")  String companyId , @Path("location_id") String  locationId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> updateLocation(@Path("company_id")  String companyId , @Path("location_id") String  locationId ,@Body CompanyProfilePlatformModels.LocationSerializer payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    Call<CompanyProfilePlatformModels.ProfileSuccessResponse> createLocationBulk(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.BulkLocationSerializer payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/reassign")
    Call<CompanyProfilePlatformModels.AssignStoreResponseSerializer> getOptimalLocations(@Path("company_id")  String companyId ,@Body CompanyProfilePlatformModels.AssignStoreRequestValidator payload);
    
}