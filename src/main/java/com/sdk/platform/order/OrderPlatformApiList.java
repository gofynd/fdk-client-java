package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments-listing")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getShipments(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("bag_status") String  bagStatus ,  @Query("status_override_lane") Boolean  statusOverrideLane ,  @Query("search_type") String  searchType ,  @Query("search_value") String  searchValue ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("is_priority_sort") Boolean  isPrioritySort ,  @Query("fetch_active_shipment") Boolean  fetchActiveShipment ,  @Query("exclude_locked_shipments") Boolean  excludeLockedShipments ,  @Query("payment_methods") String  paymentMethods ,  @Query("channel_shipment_id") String  channelShipmentId ,  @Query("channel_order_id") String  channelOrderId ,  @Query("custom_meta") String  customMeta ,  @Query("ordering_channel") String  orderingChannel ,  @Query("company_affiliate_tag") String  companyAffiliateTag );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment-details")
    Call<OrderPlatformModels.ShipmentInfoResponse> getShipmentById(@Path("company_id")  String companyId , @Query("channel_shipment_id") String  channelShipmentId ,  @Query("shipment_id") String  shipmentId ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("request_by_ext") String  requestByExt );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/order-details")
    Call<OrderPlatformModels.ShipmentDetailsResponse> getOrderById(@Path("company_id")  String companyId , @Query("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/lane-config/")
    Call<OrderPlatformModels.LaneConfigResponse> getLaneConfig(@Path("company_id")  String companyId , @Query("super_lane") String  superLane ,  @Query("group_entity") String  groupEntity ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("payment_mode") String  paymentMode ,  @Query("bag_status") String  bagStatus );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/shipments/")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getApplicationShipments(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("customer_id") String  customerId ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/orders-listing")
    Call<OrderPlatformModels.OrderListingResponse> getOrders(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("bag_status") String  bagStatus ,  @Query("time_to_dispatch") String  timeToDispatch ,  @Query("payment_methods") String  paymentMethods ,  @Query("tags") String  tags ,  @Query("search_value") String  searchValue ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("is_priority_sort") Boolean  isPrioritySort ,  @Query("custom_meta") String  customMeta );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipment/metrics-count/")
    Call<OrderPlatformModels.MetricCountResponse> getMetricCount(@Path("company_id")  String companyId , @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/order-details")
    Call<OrderPlatformModels.ShipmentDetailsResponse> getAppOrderShipmentDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.PlatformShipmentTrack> trackPlatformShipment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("shipment_id") String  shipmentId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/filter-listing")
    Call<OrderPlatformModels.FiltersResponse> getfilters(@Path("company_id")  String companyId , @Query("view") String  view ,  @Query("group_entity") String  groupEntity );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment")
    Call<OrderPlatformModels.Success> createShipmentReport(@Path("company_id")  String companyId , @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/reports/shipment-listing")
    Call<OrderPlatformModels.OmsReports> getReportsShipmentListing(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/orders/v1.0/company/{company_id}/upsert/jiocode/article")
    Call<OrderPlatformModels.JioCodeUpsertResponse> upsertJioCode(@Path("company_id")  String companyId ,@Body OrderPlatformModels.JioCodeUpsertPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/invoice")
    Call<OrderPlatformModels.BulkInvoicingResponse> getBulkInvoice(@Path("company_id")  String companyId , @Query("batch_id") String  batchId ,  @Query("doc_type") String  docType );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/invoice-label-external")
    Call<OrderPlatformModels.BulkInvoiceLabelResponse> getBulkInvoiceLabel(@Path("company_id")  String companyId , @Query("batch_id") String  batchId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/generate/file")
    Call<OrderPlatformModels.FileResponse> getBulkShipmentExcelFile(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("customer_id") String  customerId ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action/listing")
    Call<OrderPlatformModels.BulkListingResponse> getBulkList(@Path("company_id")  String companyId , @Query("lane") String  lane ,  @Query("search_type") String  searchType ,  @Query("search_id") String  searchId ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("dp_ids") String  dpIds ,  @Query("ordering_company_id") String  orderingCompanyId ,  @Query("stores") String  stores ,  @Query("sales_channel") String  salesChannel ,  @Query("request_by_ext") String  requestByExt ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("customer_id") String  customerId ,  @Query("is_priority_sort") Boolean  isPrioritySort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bulk-action-failed-report/")
    Call<OrderPlatformModels.FileResponse> getBulkActionFailedReport(@Path("company_id")  String companyId , @Query("batch_id") String  batchId ,  @Query("report_type") String  reportType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    Call<OrderPlatformModels.PlatformShipmentReasonsResponse> getShipmentReasons(@Path("company_id")  String companyId , @Path("shipment_id") String  shipmentId , @Path("bag_id") String  bagId , @Path("state") String  state );
    
    
    
    
    
    
    
    @POST ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/")
    Call<OrderPlatformModels.BulkActionResponse> bulkActionProcessXlsxFile(@Path("company_id")  String companyId ,@Body OrderPlatformModels.BulkActionPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v2.0/company/{company_id}/bulk-action/{batch_id}")
    Call<OrderPlatformModels.BulkActionDetailsResponse> bulkActionDetails(@Path("company_id")  String companyId , @Path("batch_id") String  batchId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bag-details/")
    Call<OrderPlatformModels.BagDetailsPlatformResponse> getBagById(@Path("company_id")  String companyId , @Query("bag_id") String  bagId ,  @Query("channel_bag_id") String  channelBagId ,  @Query("channel_id") String  channelId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/orders/v1.0/company/{company_id}/bags")
    Call<OrderPlatformModels.GetBagsPlatformResponse> getBags(@Path("company_id")  String companyId , @Query("bag_ids") String  bagIds ,  @Query("shipment_ids") String  shipmentIds ,  @Query("order_ids") String  orderIds ,  @Query("channel_bag_ids") String  channelBagIds ,  @Query("channel_shipment_ids") String  channelShipmentIds ,  @Query("channel_order_ids") String  channelOrderIds ,  @Query("channel_id") String  channelId ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    Call<OrderPlatformModels.InvalidateShipmentCacheResponse> invalidateShipmentCache(@Path("company_id")  String companyId ,@Body OrderPlatformModels.InvalidateShipmentCachePayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    Call<OrderPlatformModels.StoreReassignResponse> reassignLocation(@Path("company_id")  String companyId ,@Body OrderPlatformModels.StoreReassign payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    Call<OrderPlatformModels.UpdateShipmentLockResponse> updateShipmentLock(@Path("company_id")  String companyId ,@Body OrderPlatformModels.UpdateShipmentLockPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    Call<OrderPlatformModels.AnnouncementsResponse> getAnnouncements(@Path("company_id")  String companyId , @Query("date") String  date );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/delight/update-address")
    Call<OrderPlatformModels.BaseResponse> updateAddress(@Path("company_id")  String companyId , @Query("shipment_id") String  shipmentId ,  @Query("name") String  name ,  @Query("address") String  address ,  @Query("address_type") String  addressType ,  @Query("pincode") String  pincode ,  @Query("phone") String  phone ,  @Query("email") String  email ,  @Query("landmark") String  landmark ,  @Query("address_category") String  addressCategory ,  @Query("city") String  city ,  @Query("state") String  state ,  @Query("country") String  country );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    Call<OrderPlatformModels.Click2CallResponse> click2Call(@Path("company_id")  String companyId , @Query("caller") String  caller ,  @Query("receiver") String  receiver ,  @Query("bag_id") String  bagId ,  @Query("calling_to") String  callingTo ,  @Query("caller_id") String  callerId );
    
    
    
    
    
    
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipmentStatus(@Path("company_id")  String companyId ,@Body OrderPlatformModels.UpdateShipmentStatusRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/process-manifest")
    Call<OrderPlatformModels.CreateOrderResponse> processManifest(@Path("company_id")  String companyId ,@Body OrderPlatformModels.CreateOrderPayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/dispatch")
    Call<OrderPlatformModels.SuccessResponse> dispatchManifest(@Path("company_id")  String companyId ,@Body OrderPlatformModels.DispatchManifest payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    Call<OrderPlatformModels.GetActionsResponse> getRoleBasedActions(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> postShipmentHistory(@Path("company_id")  String companyId ,@Body OrderPlatformModels.PostShipmentHistory payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> getShipmentHistory(@Path("company_id")  String companyId , @Query("shipment_id") Integer  shipmentId ,  @Query("bag_id") Integer  bagId );
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    Call<OrderPlatformModels.OrderStatusResult> sendSmsNinja(@Path("company_id")  String companyId ,@Body OrderPlatformModels.SendSmsPayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/oms/manual-place-shipment")
    Call<OrderPlatformModels.ManualAssignDPToShipmentResponse> platformManualAssignDPToShipment(@Path("company_id")  String companyId ,@Body OrderPlatformModels.ManualAssignDPToShipment payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    Call<OrderPlatformModels.CreateOrderResponse> updatePackagingDimensions(@Path("company_id")  String companyId ,@Body OrderPlatformModels.CreateOrderPayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    Call<OrderPlatformModels.CreateOrderResponse> createOrder(@Path("company_id")  String companyId ,@Body OrderPlatformModels.CreateOrderAPI payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    Call<OrderPlatformModels.CreateChannelConfigResponse> createChannelConfig(@Path("company_id")  String companyId ,@Body OrderPlatformModels.CreateChannelConfigData payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    Call<OrderPlatformModels.CreateChannelConfigData> getChannelConfig(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/uploadConsent")
    Call<OrderPlatformModels.SuccessResponse> uploadConsent(@Path("company_id")  String companyId ,@Body OrderPlatformModels.UploadConsent payload);
    
    
    
    
    
    
    
    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    Call<OrderPlatformModels.ResponseDetail> orderUpdate(@Path("company_id")  String companyId ,@Body OrderPlatformModels.PlatformOrderUpdate payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    Call<OrderPlatformModels.OrderStatusResult> checkOrderStatus(@Path("company_id")  String companyId ,@Body OrderPlatformModels.OrderStatus payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/bag/state/transition")
    Call<OrderPlatformModels.OrderStatusResult> sendSmsNinjaPlatform(@Path("company_id")  String companyId );
    
}