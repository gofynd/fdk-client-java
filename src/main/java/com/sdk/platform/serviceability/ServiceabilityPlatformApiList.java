package com.sdk.platform.serviceability;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ServiceabilityPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> getApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    Call<ServiceabilityPlatformModels.EntityRegionView_Response> getEntityRegionView(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.EntityRegionView_Request payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    Call<ServiceabilityPlatformModels.ListViewResponse> getListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    Call<ServiceabilityPlatformModels.CompanyStoreView_Response> getCompanyStoreView(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.GetSingleZoneDataViewResponse> getZoneDataView(@Path("company_id")  String companyId , @Path("zone_id") String  zoneId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<ServiceabilityPlatformModels.ZoneSuccessResponse> updateZoneControllerView(@Path("zone_id") String  zoneId , @Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneUpdateRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    Call<ServiceabilityPlatformModels.ZoneResponse> createZone(@Path("company_id")  String companyId ,@Body ServiceabilityPlatformModels.ZoneRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse> getZonesFromApplicationIdView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("zone_id") List<String>  zoneId ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse> getZoneFromPincodeView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.GetZoneFromPincodeViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    Call<ServiceabilityPlatformModels.GetStoresViewResponse> getStore(@Path("company_id")  String companyId , @Path("store_uid") Integer  storeUid );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<ServiceabilityPlatformModels.GetStoresViewResponse> getAllStores(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<ServiceabilityPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<ServiceabilityPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopBulkData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<ServiceabilityPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeCodStatusListingRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest payload);
    
}