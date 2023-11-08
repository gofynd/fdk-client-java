package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface OrderPlatformApiList {

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    Call<OrderPlatformModels.InvalidateShipmentCacheResponse> invalidateShipmentCache(@Path("company_id") String companyId, @Body OrderPlatformModels.InvalidateShipmentCachePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    Call<OrderPlatformModels.StoreReassignResponse> reassignLocation(@Path("company_id") String companyId, @Body OrderPlatformModels.StoreReassign payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    Call<OrderPlatformModels.UpdateShipmentLockResponse> updateShipmentLock(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentLockPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    Call<OrderPlatformModels.AnnouncementsResponse> getAnnouncements(@Path("company_id") String companyId, @Query("date") String date, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/delight/update-address")
    Call<OrderPlatformModels.BaseResponse> updateAddress(@Path("company_id") String companyId, @Query("shipment_id") String shipmentId, @Query("name") String name, @Query("address") String address, @Query("address_type") String addressType, @Query("pincode") String pincode, @Query("phone") String phone, @Query("email") String email, @Query("landmark") String landmark, @Query("address_category") String addressCategory, @Query("city") String city, @Query("state") String state, @Query("country") String country, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    Call<OrderPlatformModels.Click2CallResponse> click2Call(@Path("company_id") String companyId, @Query("caller") String caller, @Query("receiver") String receiver, @Query("bag_id") String bagId, @Query("caller_id") String callerId, @Query("method") String method, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipmentStatus(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentStatusRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/process-manifest")
    Call<OrderPlatformModels.CreateOrderResponse> processManifest(@Path("company_id") String companyId, @Body OrderPlatformModels.CreateOrderPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/dispatch")
    Call<OrderPlatformModels.SuccessResponse> dispatchManifest(@Path("company_id") String companyId, @Body OrderPlatformModels.DispatchManifest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    Call<OrderPlatformModels.GetActionsResponse> getRoleBasedActions(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> getShipmentHistory(@Path("company_id") String companyId, @Query("shipment_id") String shipmentId, @Query("bag_id") Integer bagId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> postShipmentHistory(@Path("company_id") String companyId, @Body OrderPlatformModels.PostShipmentHistory payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    Call<OrderPlatformModels.OrderStatusResult> sendSmsNinja(@Path("company_id") String companyId, @Body OrderPlatformModels.SendSmsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    Call<OrderPlatformModels.UpdatePackagingDimensionsResponse> updatePackagingDimensions(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdatePackagingDimensionsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    Call<OrderPlatformModels.CreateOrderResponse> createOrder(@Path("company_id") String companyId, @Body OrderPlatformModels.CreateOrderAPI payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    Call<OrderPlatformModels.CreateChannelConfigData> getChannelConfig(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/order-config")
    Call<OrderPlatformModels.CreateChannelConfigResponse> createChannelConfig(@Path("company_id") String companyId, @Body OrderPlatformModels.CreateChannelConfigData payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/manifest/uploadConsent")
    Call<OrderPlatformModels.SuccessResponse> uploadConsent(@Path("company_id") String companyId, @Body OrderPlatformModels.UploadConsent payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    Call<OrderPlatformModels.ResponseDetail> orderUpdate(@Path("company_id") String companyId, @Body OrderPlatformModels.PlatformOrderUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    Call<OrderPlatformModels.OrderStatusResult> checkOrderStatus(@Path("company_id") String companyId, @Body OrderPlatformModels.OrderStatus payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/bag/state/transition")
    Call<OrderPlatformModels.BagStateTransitionMap> getStateTransitionMap(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/allowed/state/transition")
    Call<OrderPlatformModels.RoleBaseStateTransitionMapping> getAllowedStateTransition(@Path("company_id") String companyId, @Query("ordering_channel") String orderingChannel, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/customer-credit-balance")
    Call<OrderPlatformModels.FetchCreditBalanceResponsePayload> fetchCreditBalanceDetail(@Path("company_id") String companyId, @Body OrderPlatformModels.FetchCreditBalanceRequestPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund-mode-config")
    Call<OrderPlatformModels.RefundModeConfigResponsePayload> fetchRefundModeConfig(@Path("company_id") String companyId, @Body OrderPlatformModels.RefundModeConfigRequestPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/attach")
    Call<OrderPlatformModels.AttachOrderUserResponse> attachOrderUser(@Path("company_id") String companyId, @Body OrderPlatformModels.AttachOrderUser payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/send/otp/mobile")
    Call<OrderPlatformModels.SendUserMobileOtpResponse> sendUserMobileOTP(@Path("company_id") String companyId, @Body OrderPlatformModels.SendUserMobileOTP payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/verify/otp")
    Call<OrderPlatformModels.VerifyOtpResponse> verifyMobileOTP(@Path("company_id") String companyId, @Body OrderPlatformModels.VerifyMobileOTP payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/reports/lanes/download")
    Call<OrderPlatformModels.BulkReportsDownloadResponse> downloadLanesReport(@Path("company_id") String companyId, @Body OrderPlatformModels.BulkReportsDownloadRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/einvoice/retry/irn")
    Call<OrderPlatformModels.EInvoiceRetryResponse> eInvoiceRetry(@Path("company_id") String companyId, @Body OrderPlatformModels.EInvoiceRetry payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/tracking")
    Call<OrderPlatformModels.CourierPartnerTrackingResponse> trackShipment(@Path("company_id") String companyId, @Query("shipment_id") String shipmentId, @Query("awb") String awb, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/tracking")
    Call<OrderPlatformModels.CourierPartnerTrackingDetails> updateShipmentTracking(@Path("company_id") String companyId, @Body OrderPlatformModels.CourierPartnerTrackingDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/line_number/{line_number}/reasons")
    Call<OrderPlatformModels.ShipmentBagReasons> getShipmentBagReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @Path("line_number") Integer lineNumber, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments-listing")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getShipments(@Path("company_id") String companyId, @Query("lane") String lane, @Query("bag_status") String bagStatus, @Query("status_override_lane") Boolean statusOverrideLane, @Query("time_to_dispatch") Integer timeToDispatch, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("fetch_active_shipment") Boolean fetchActiveShipment, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @Query("payment_methods") String paymentMethods, @Query("channel_shipment_id") String channelShipmentId, @Query("channel_order_id") String channelOrderId, @Query("custom_meta") String customMeta, @Query("ordering_channel") String orderingChannel, @Query("company_affiliate_tag") String companyAffiliateTag, @Query("my_orders") Boolean myOrders, @Query("platform_user_id") String platformUserId, @Query("sort_type") String sortType, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("tags") String tags, @Query("customer_id") String customerId, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipment-details")
    Call<OrderPlatformModels.ShipmentInfoResponse> getShipmentById(@Path("company_id") String companyId, @Query("channel_shipment_id") String channelShipmentId, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/order-details")
    Call<OrderPlatformModels.OrderDetailsResponse> getOrderById(@Path("company_id") String companyId, @Query("order_id") String orderId, @Query("my_orders") Boolean myOrders, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/lane-config/")
    Call<OrderPlatformModels.LaneConfigResponse> getLaneConfig(@Path("company_id") String companyId, @Query("super_lane") String superLane, @Query("group_entity") String groupEntity, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("payment_mode") String paymentMode, @Query("bag_status") String bagStatus, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("tags") String tags, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders-listing")
    Call<OrderPlatformModels.OrderListingResponse> getOrders(@Path("company_id") String companyId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("bag_status") String bagStatus, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("tags") String tags, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_priority_sort") Boolean isPrioritySort, @Query("custom_meta") String customMeta, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("customer_id") String customerId, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/shipments/")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getApplicationShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("search_id") String searchId, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("ordering_company_id") String orderingCompanyId, @Query("stores") String stores, @Query("sales_channel") String salesChannel, @Query("request_by_ext") String requestByExt, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("customer_id") String customerId, @Query("is_priority_sort") Boolean isPrioritySort, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.PlatformShipmentTrack> trackShipmentPlatform(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/filter-listing")
    Call<OrderPlatformModels.FiltersResponse> getfilters(@Path("company_id") String companyId, @Query("view") String view, @Query("group_entity") String groupEntity, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/generate/file")
    Call<OrderPlatformModels.FileResponse> getBulkShipmentExcelFile(@Path("company_id") String companyId, @Query("sales_channels") String salesChannels, @Query("dp_ids") String dpIds, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("stores") String stores, @Query("tags") String tags, @Query("bag_status") String bagStatus, @Query("payment_methods") String paymentMethods, @Query("file_type") String fileType, @Query("time_to_dispatch") Integer timeToDispatch, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/get-seller-templates")
    Call<OrderPlatformModels.BulkActionTemplateResponse> getBulkActionTemplate(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/download-seller-templates")
    Call<OrderPlatformModels.FileResponse> downloadBulkActionTemplate(@Path("company_id") String companyId, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    Call<OrderPlatformModels.PlatformShipmentReasonsResponse> getShipmentReasons(@Path("company_id") String companyId, @Path("shipment_id") String shipmentId, @Path("bag_id") String bagId, @Path("state") String state, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    Call<OrderPlatformModels.ShipmentReasonsResponse> getPlatformShipmentReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("action") String action, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bag-details/")
    Call<OrderPlatformModels.BagDetailsPlatformResponse> getBagById(@Path("company_id") String companyId, @Query("bag_id") String bagId, @Query("channel_bag_id") String channelBagId, @Query("channel_id") String channelId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bags")
    Call<OrderPlatformModels.GetBagsPlatformResponse> getBags(@Path("company_id") String companyId, @Query("bag_ids") String bagIds, @Query("shipment_ids") String shipmentIds, @Query("order_ids") String orderIds, @Query("channel_bag_ids") String channelBagIds, @Query("channel_shipment_ids") String channelShipmentIds, @Query("channel_order_ids") String channelOrderIds, @Query("channel_id") String channelId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/{order_id}/generate/pos-receipt")
    Call<OrderPlatformModels.GeneratePosOrderReceiptResponse> generatePOSReceiptByOrderId(@Path("company_id") String companyId, @Path("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("document_type") String documentType, @HeaderMap Map<String, String> requestHeaders);
}