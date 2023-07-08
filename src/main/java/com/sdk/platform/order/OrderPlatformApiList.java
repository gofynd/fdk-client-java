package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderPlatformApiList {
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/status")
    Call<OrderPlatformModels.UpdateShipmentStatusResponse> shipmentStatusUpdate(@Path("company_id")  String companyId ,@Body OrderPlatformModels.UpdateShipmentStatusBody payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/activity/status")
    Call<OrderPlatformModels.GetActivityStatus> activityStatus(@Path("company_id")  String companyId , @Query("bag_id") String  bagId );
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/store/process-shipments")
    Call<OrderPlatformModels.UpdateProcessShipmenstRequestResponse> storeProcessShipmentUpdate(@Path("company_id")  String companyId ,@Body OrderPlatformModels.UpdateProcessShipmenstRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/check-refund/{shipment_id}")
    Call<Object> checkRefund(@Path("company_id")  String companyId , @Path("shipment_id") String  shipmentId );
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/can-break")
    Call<OrderPlatformModels.CanBreakResponse> shipmentBagsCanBreak(@Path("company_id")  String companyId ,@Body OrderPlatformModels.CanBreakRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders")
    Call<OrderPlatformModels.OrderListing> getOrdersByCompanyId(@Path("company_id")  String companyId , @Query("page_no") String  pageNo ,  @Query("page_size") String  pageSize ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("is_priority_sort") Boolean  isPrioritySort ,  @Query("lock_status") Boolean  lockStatus ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("sales_channels") String  salesChannels ,  @Query("order_id") String  orderId ,  @Query("stores") String  stores ,  @Query("deployment_stores") String  deploymentStores ,  @Query("status") String  status ,  @Query("dp") String  dp ,  @Query("shorten_urls") Boolean  shortenUrls ,  @Query("filter_type") String  filterType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/lane-count")
    Call<OrderPlatformModels.OrderLanesCount> getOrderLanesCountByCompanyId(@Path("company_id")  String companyId , @Query("page_no") String  pageNo ,  @Query("page_size") String  pageSize ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("sales_channels") String  salesChannels ,  @Query("order_id") String  orderId ,  @Query("stores") String  stores ,  @Query("status") String  status ,  @Query("shorten_urls") Boolean  shortenUrls ,  @Query("filter_type") String  filterType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/details")
    Call<OrderPlatformModels.OrderDetails> getOrderDetails(@Path("company_id")  String companyId , @Query("order_id") String  orderId ,  @Query("next") String  next ,  @Query("previous") String  previous );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/details")
    Call<OrderPlatformModels.OrderDetails> getOrderDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("order_id") String  orderId ,  @Query("next") String  next ,  @Query("previous") String  previous );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/picklist")
    Call<OrderPlatformModels.OrderPicklistListing> getPicklistOrdersByCompanyId(@Path("company_id")  String companyId , @Query("page_no") String  pageNo ,  @Query("page_size") String  pageSize ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("sales_channels") String  salesChannels ,  @Query("order_id") String  orderId ,  @Query("stores") String  stores ,  @Query("status") String  status ,  @Query("shorten_urls") Boolean  shortenUrls ,  @Query("filter_type") String  filterType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.PlatformShipmentTrack> trackShipmentPlatform(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("shipment_id") String  shipmentId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/track")
    Call<OrderPlatformModels.PlatformOrderTrack> trackOrder(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/failed")
    Call<OrderPlatformModels.FailedOrders> failedOrders(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/reprocess")
    Call<OrderPlatformModels.UpdateOrderReprocessResponse> reprocessOrder(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/update")
    Call<OrderPlatformModels.ShipmentUpdateResponse> updateShipment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("shipment_id") String  shipmentId ,@Body OrderPlatformModels.ShipmentUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    Call<OrderPlatformModels.ShipmentReasonsResponse> getPlatformShipmentReasons(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("action") String  action );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.ShipmentTrackResponse> getShipmentTrackDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("order_id") String  orderId , @Path("shipment_id") String  shipmentId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    Call<OrderPlatformModels.GetShipmentAddressResponse> getShipmentAddress(@Path("company_id")  String companyId , @Path("shipment_id") String  shipmentId , @Path("address_category") String  addressCategory );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    Call<OrderPlatformModels.UpdateShipmentAddressResponse> updateShipmentAddress(@Path("company_id")  String companyId , @Path("shipment_id") String  shipmentId , @Path("address_category") String  addressCategory ,@Body OrderPlatformModels.UpdateShipmentAddressRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders")
    Call<OrderPlatformModels.OrderListing> getOrdersByApplicationId(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") String  pageNo ,  @Query("page_size") String  pageSize ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("sales_channels") String  salesChannels ,  @Query("order_id") String  orderId ,  @Query("stores") String  stores ,  @Query("status") String  status ,  @Query("dp") String  dp ,  @Query("shorten_urls") Boolean  shortenUrls ,  @Query("filter_type") String  filterType );
    
}