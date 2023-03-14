package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ServiceabilityPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> postApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.ApplicationServiceabilityConfig payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> getApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/regions")
    Call<ServiceabilityPlatformModels.EntityRegionViewResponse> getEntityRegionView(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.EntityRegionViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResponse> getListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q ,  @Query("zone_id") List<String>  zoneId );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/all-stores")
    Call<ServiceabilityPlatformModels.CompanyStoreView_Response> getCompanyStoreView(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.GetSingleZoneDataViewResponse> getZoneDataView(@Path("company_id")  String companyId , @Path("zone_id") String  zoneId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneSuccessResponse> updateZoneControllerView(@Path("zone_id") String  zoneId , @Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneUpdateRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/zone")
    Call<ServiceabilityPlatformModels.ZoneResponse> upsertZoneControllerView(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse> getZoneFromPincodeView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.GetZoneFromPincodeViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse> getZonesFromApplicationIdView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("zone_id") List<String>  zoneId ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics-internal/v1.0/company/{company_id}/zones-list")
    Call<ServiceabilityPlatformModels.ListViewResponse> getZoneListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q ,  @Query("zone_id") List<String>  zoneId );
    
}