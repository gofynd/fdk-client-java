package com.sdk.platform.logistic;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LogisticPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/serviceability")
    Call<LogisticPlatformModels.ApplicationServiceabilityConfigResponse> getApplicationServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/regions")
    Call<LogisticPlatformModels.EntityRegionView_Response> getEntityRegionView(@Path("company_id")  String companyId ,@Body LogisticPlatformModels.EntityRegionView_Request payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zones")
    Call<LogisticPlatformModels.ListViewResponse> getListView(@Path("company_id")  String companyId , @Query("page_number") Integer  pageNumber ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("is_active") Boolean  isActive ,  @Query("channel_ids") String  channelIds );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/all-stores")
    Call<LogisticPlatformModels.CompanyStoreView_Response> getCompanyStoreView(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<LogisticPlatformModels.ZoneSuccessResponse> updateZoneControllerView(@Path("zone_id") String  zoneId , @Path("company_id")  String companyId ,@Body LogisticPlatformModels.ZoneUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/zone/{zone_id}")
    Call<LogisticPlatformModels.GetSingleZoneDataViewResponse> getZoneDataView(@Path("company_id")  String companyId , @Path("zone_id") String  zoneId );
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/zone/")
    Call<LogisticPlatformModels.ZoneResponse> insertZoneControllerView(@Path("company_id")  String companyId ,@Body LogisticPlatformModels.ZoneRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/zones")
    Call<LogisticPlatformModels.GetZoneFromPincodeViewResponse> upsertZoneControllerView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticPlatformModels.GetZoneFromPincodeViewRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/stores/{store_uid}")
    Call<LogisticPlatformModels.GetStoresViewResponse> getStore(@Path("company_id")  String companyId , @Path("store_uid") Integer  storeUid );
    
    
    
    
    
    
    
    @GET ("/service/platform/logistics/v1.0/company/{company_id}/logistics/stores")
    Call<LogisticPlatformModels.GetStoresViewResponse> getAllStores(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-update")
    Call<LogisticPlatformModels.PincodeMOPresponse> updatePincodeMopView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticPlatformModels.PincodeMopData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-bulk-update")
    Call<LogisticPlatformModels.PincodeBulkViewResponse> updatePincodeBulkView(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticPlatformModels.PincodeMopBulkData payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/pincode-mop-data")
    Call<LogisticPlatformModels.PincodeCodStatusListingResponse> updatePincodeCoDListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticPlatformModels.PincodeCodStatusListingRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/logistics/v1.0/company/{company_id}/application/{application_id}/history")
    Call<LogisticPlatformModels.PincodeMopUpdateAuditHistoryResponseData> updatePincodeAuditHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LogisticPlatformModels.PincodeMopUpdateAuditHistoryRequest payload);
    
}