package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment-details/{shipment_id}")
    Call<OrderPlatformModels.ShipmentInfoResponse> getShipmentDetails(@Path("company_id")  String companyId , @Path("shipment_id") String  shipmentId , @Query("ordering_company_id") String  orderingCompanyId ,  @Query("request_by_ext") String  requestByExt );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/lane-config/")
    Call<OrderPlatformModels.LaneConfigResponse> getLaneConfig(@Path("company_id")  String companyId , @Query("super_lane") String  superLane ,  @Query("group_entity") String  groupEntity ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("payment_mode") String  paymentMode ,  @Query("bag_status") String  bagStatus );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/order-details")
    Call<OrderPlatformModels.ShipmentDetailsResponse> getOrderShipmentDetails(@Path("company_id")  String companyId , @Query("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-listing")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getShipmentList(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("customer_id") String  customerId ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/manifest-listing")
    Call<OrderPlatformModels.ManifestShipmentResponse> getShipmentToManifest(@Path("company_id")  String companyId , @Query("group_entity") String  groupEntity ,  @Query("sales_channel") String  salesChannel ,  @Query("dp_ids") String  dpIds );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/orders-listing")
    Call<OrderPlatformModels.OrderListingResponse> getOrders(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_value") String  searchValue ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment/metrics-count")
    Call<OrderPlatformModels.MetricCountResponse> getMetricCount(@Path("company_id")  String companyId , @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/filter-listing")
    Call<OrderPlatformModels.FiltersResponse> getfilters(@Path("company_id")  String companyId , @Query("view") String  view );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/shipments")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getApplicationShipments(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("customer_id") String  customerId ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment")
    Call<OrderPlatformModels.Success> createShipmentReport(@Path("company_id")  String companyId , @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment-listing")
    Call<OrderPlatformModels.OmsReports> getReportsShipmentListing(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/upsert/jiocode/article")
    Call<OrderPlatformModels.JioCodeUpsertResponse> upsertJioCode(@Path("company_id")  String companyId ,@Body OrderPlatformModels.JioCodeUpsertPayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    Call<OrderPlatformModels.ResponseDetail> statusInternalUpdate(@Path("company_id")  String companyId ,@Body OrderPlatformModels.PlatformShipmentStatusInternal payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> getShipmentHistory(@Path("company_id")  String companyId , @Query("bag_id") Integer  bagId );
    
    
    
    
    
    
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    Call<OrderPlatformModels.ResponseDetail> orderUpdate(@Path("company_id")  String companyId ,@Body OrderPlatformModels.PlatformOrderUpdate payload);
    
}