package com.sdk.platform.logistics;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticsPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<LogisticsPlatformModels.ApplicationServiceabilityConfigResponse> getApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    Call<LogisticsPlatformModels.EntityRegionView_Response> getEntityRegionView(@Path("company_id")  String companyId ,@Body LogisticsPlatformModels.EntityRegionView_Request payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    Call<LogisticsPlatformModels.ListViewResponse> getListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds ,  @Query("q") String  q );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    Call<LogisticsPlatformModels.CompanyStoreView_Response> getCompanyStoreView(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<LogisticsPlatformModels.ZoneSuccessResponse> updateZoneControllerView(@Path("zone_id") String  zoneId , @Path("company_id")  String companyId ,@Body LogisticsPlatformModels.ZoneUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<LogisticsPlatformModels.GetSingleZoneDataViewResponse> getZoneDataView(@Path("company_id")  String companyId , @Path("zone_id") String  zoneId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone")
    Call<LogisticsPlatformModels.ZoneResponse> createZone(@Path("company_id")  String companyId ,@Body LogisticsPlatformModels.ZoneRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<LogisticsPlatformModels.GetZoneFromPincodeViewResponse> getZoneFromPincodeView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticsPlatformModels.GetZoneFromPincodeViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<LogisticsPlatformModels.GetZoneFromApplicationIdViewResponse> getZonesFromApplicationIdView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("zone_id") List<String>  zoneId ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    Call<LogisticsPlatformModels.GetStoresViewResponse> getStore(@Path("company_id")  String companyId , @Path("store_uid") Integer  storeUid );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<LogisticsPlatformModels.GetStoresViewResponse> getAllStores(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<LogisticsPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticsPlatformModels.PincodeMopData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<LogisticsPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticsPlatformModels.PincodeMopBulkData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<LogisticsPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticsPlatformModels.PincodeCodStatusListingRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<LogisticsPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticsPlatformModels.PincodeMopUpdateAuditHistoryRequest payload);
    
}