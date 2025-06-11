package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface OrderPlatformApiList {

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    Call<OrderPlatformModels.InvalidateShipmentCacheResponse> invalidateShipmentCache(@Path("company_id") String companyId, @Body OrderPlatformModels.InvalidateShipmentCachePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    Call<OrderPlatformModels.PostRefundStateConfigurationResponse> postRefundStateConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @Body OrderPlatformModels.PostRefundStateConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    Call<OrderPlatformModels.GetRefundStateConfigurationResponse> getRefundStateConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states")
    Call<OrderPlatformModels.GetRefundStates> getRefundEnableStateList(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    Call<OrderPlatformModels.RefundStateConfigurationManualSchemaResponse> postRefundConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @Body OrderPlatformModels.RefundStateConfigurationManualSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    Call<OrderPlatformModels.RefundStateConfigurationManualSchemaResponse> getRefundConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    Call<OrderPlatformModels.StoreReassignResponse> reassignLocation(@Path("company_id") String companyId, @Body OrderPlatformModels.StoreReassign payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/{shipment_id}/refund-options")
    Call<OrderPlatformModels.RefundOptionsSchemaResponse> getRefundOptions(@Path("shipment_id") String shipmentId, @Path("company_id") String companyId, @Query("bag_ids") String bagIds, @Query("state") String state, @Query("optin_app_id") String optinAppId, @Query("optin_company_id") Integer optinCompanyId, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    Call<OrderPlatformModels.AnnouncementsResponse> getAnnouncements(@Path("company_id") String companyId, @Query("date") String date, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    Call<OrderPlatformModels.Click2CallResponse> click2Call(@Path("company_id") String companyId, @Query("caller") String caller, @Query("receiver") String receiver, @Query("bag_id") String bagId, @Query("caller_id") String callerId, @Query("method") String method, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipmentStatus(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentStatusRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> getShipmentHistory(@Path("company_id") String companyId, @Query("shipment_id") String shipmentId, @Query("bag_id") Integer bagId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponse> postShipmentHistory(@Path("company_id") String companyId, @Body OrderPlatformModels.PostShipmentHistory payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    Call<OrderPlatformModels.SendSmsResponse> sendSmsNinja(@Path("company_id") String companyId, @Body OrderPlatformModels.SendSmsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    Call<OrderPlatformModels.UpdatePackagingDimensionsResponse> updatePackagingDimensions(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdatePackagingDimensionsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/validation")
    Call<OrderPlatformModels.ResponseDetail> orderUpdate(@Path("company_id") String companyId, @Body OrderPlatformModels.PlatformOrderUpdate payload, @HeaderMap Map<String, String> requestHeaders);

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

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/state-transition")
    Call<OrderPlatformModels.BulkStateTransistionResponse> bulkStateTransistion(@Path("company_id") String companyId, @Body OrderPlatformModels.BulkStateTransistionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs")
    Call<OrderPlatformModels.BulkListingResponse> bulkListing(@Path("company_id") String companyId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("status") String status, @Query("bulk_action_type") String bulkActionType, @Query("search_key") String searchKey, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}")
    Call<OrderPlatformModels.JobDetailsResponse> jobDetails(@Path("company_id") String companyId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}/file")
    Call<OrderPlatformModels.JobFailedResponse> getFileByStatus(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Query("status") String status, @Query("file_type") String fileType, @Query("report_type") String reportType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/filter/listing")
    Call<OrderPlatformModels.ManifestFiltersResponse> getManifestfilters(@Path("company_id") String companyId, @Query("view") String view, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/einvoice/retry/irn")
    Call<OrderPlatformModels.EInvoiceRetryResponse> eInvoiceRetry(@Path("company_id") String companyId, @Body OrderPlatformModels.EInvoiceRetry payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed")
    Call<OrderPlatformModels.FailedOrderLogs> getFailedOrderLogs(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search_type") String searchType, @Query("search_value") String searchValue, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed/logs/{log_id}")
    Call<OrderPlatformModels.FailedOrderLogDetails> failedOrderLogDetails(@Path("company_id") String companyId, @Path("log_id") String logId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/question")
    Call<Object> getQuestions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-lane-config")
    Call<OrderPlatformModels.RuleLaneConfigResponse> getRuleLaneConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("search_value") String searchValue, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule")
    Call<OrderPlatformModels.RuleSuccessResponse> createRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.RuleRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleResponse> getRuleById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleSuccessResponse> updateRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @Body OrderPlatformModels.RuleUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleSuccessResponse> deleteRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-position")
    Call<OrderPlatformModels.RuleListResponse> updateRulePosition(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.UpdateRulePositionRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-parameters")
    Call<OrderPlatformModels.RuleParametersResponse> getRuleParameters(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule_list")
    Call<OrderPlatformModels.RuleListResponse> getRuleList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.RuleListRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    Call<OrderPlatformModels.GetActionsResponse> getRoleBasedActions(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    Call<OrderPlatformModels.UpdateShipmentLockResponse> updateShipmentLock(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentLockPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    Call<OrderPlatformModels.CreateOrderResponse> createOrder(@Path("company_id") String companyId, @Body OrderPlatformModels.CreateOrderAPI payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/update")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipment(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentActionRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/{order_id}")
    Call<OrderPlatformModels.OrderUpdateResponseDetail> updateOrder(@Path("company_id") String companyId, @Path("order_id") String orderId, @Body OrderPlatformModels.OrderUpdatePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipments/consolidate")
    Call<OrderPlatformModels.ConsolidateShipmentResponse> consolidateShipments(@Path("company_id") String companyId, @Body OrderPlatformModels.ConsolidateShipmentPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/line_number/{line_number}/reasons")
    Call<OrderPlatformModels.ShipmentBagReasons> getShipmentBagReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @Path("line_number") Integer lineNumber, @Query("bag_id") String bagId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments-listing")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getShipments(@Path("company_id") String companyId, @Query("lane") String lane, @Query("bag_status") String bagStatus, @Query("status_override_lane") Boolean statusOverrideLane, @Query("time_to_dispatch") Integer timeToDispatch, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("fetch_active_shipment") Boolean fetchActiveShipment, @Query("allow_inactive") Boolean allowInactive, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @Query("payment_methods") String paymentMethods, @Query("channel_shipment_id") String channelShipmentId, @Query("channel_order_id") String channelOrderId, @Query("custom_meta") String customMeta, @Query("ordering_channel") String orderingChannel, @Query("company_affiliate_tag") String companyAffiliateTag, @Query("my_orders") Boolean myOrders, @Query("platform_user_id") String platformUserId, @Query("sort_type") String sortType, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("tags") String tags, @Query("customer_id") String customerId, @Query("order_type") String orderType, @Query("operational_status") String operationalStatus, @Query("financial_status") String financialStatus, @Query("logistics_status") String logisticsStatus, @Query("parent_view_slug") String parentViewSlug, @Query("child_view_slug") String childViewSlug, @Query("lock_status") String lockStatus, @Query("group_entity") String groupEntity, @Query("enforce_date_filter") Boolean enforceDateFilter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipment-details")
    Call<OrderPlatformModels.ShipmentInfoResponse> getShipmentById(@Path("company_id") String companyId, @Query("channel_shipment_id") String channelShipmentId, @Query("shipment_id") String shipmentId, @Query("fetch_active_shipment") Boolean fetchActiveShipment, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/order-details")
    Call<OrderPlatformModels.OrderDetailsResponse> getOrderById(@Path("company_id") String companyId, @Query("order_id") String orderId, @Query("my_orders") Boolean myOrders, @Query("allow_inactive") Boolean allowInactive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/lane-config")
    Call<OrderPlatformModels.LaneConfigResponse> getLaneConfig(@Path("company_id") String companyId, @Query("super_lane") String superLane, @Query("group_entity") String groupEntity, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("payment_mode") String paymentMode, @Query("bag_status") String bagStatus, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("tags") String tags, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders-listing")
    Call<OrderPlatformModels.OrderListingResponse> getOrders(@Path("company_id") String companyId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("bag_status") String bagStatus, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("tags") String tags, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_priority_sort") Boolean isPrioritySort, @Query("custom_meta") List<Object> customMeta, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("customer_id") String customerId, @Query("order_type") String orderType, @Query("operational_status") String operationalStatus, @Query("financial_status") String financialStatus, @Query("logistics_status") String logisticsStatus, @Query("parent_view_slug") String parentViewSlug, @Query("child_view_slug") String childViewSlug, @Query("group_entity") String groupEntity, @Query("enforce_date_filter") Boolean enforceDateFilter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/shipments")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponse> getApplicationShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("search_id") String searchId, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("ordering_company_id") String orderingCompanyId, @Query("stores") String stores, @Query("sales_channel") String salesChannel, @Query("request_by_ext") String requestByExt, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("customer_id") String customerId, @Query("is_priority_sort") Boolean isPrioritySort, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.PlatformShipmentTrack> trackShipmentPlatform(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order/v1.0/company/{company_id}/view/position")
    Call<OrderPlatformModels.CreateUpdateDeleteResponse> updateUserViewPosition(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewPosition payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.UserViewsResponse> getUserViews(@Path("company_id") String companyId, @Query("show_in") String showIn, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponse> addUserViews(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewsResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponse> updateUserViews(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewsResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponse> deleteUserViews(@Path("company_id") String companyId, @Query("view_id") String viewId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/filters")
    Call<OrderPlatformModels.GlobalFiltersResponse> getGlobalFilters(@Path("company_id") String companyId, @Query("show_in") String showIn, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/filter-listing")
    Call<OrderPlatformModels.FiltersResponse> getfilters(@Path("company_id") String companyId, @Query("view") String view, @Query("group_entity") String groupEntity, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/generate/file")
    Call<OrderPlatformModels.TemplateDownloadResponse> getBulkShipmentExcelFile(@Path("company_id") String companyId, @Query("sales_channels") String salesChannels, @Query("dp_ids") String dpIds, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("stores") String stores, @Query("tags") String tags, @Query("bag_status") String bagStatus, @Query("payment_methods") String paymentMethods, @Query("file_type") String fileType, @Query("time_to_dispatch") Integer timeToDispatch, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/get-seller-templates")
    Call<OrderPlatformModels.BulkActionTemplateResponse> getBulkActionTemplate(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/download-seller-templates")
    Call<OrderPlatformModels.TemplateDownloadResponse> downloadBulkActionTemplate(@Path("company_id") String companyId, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    Call<OrderPlatformModels.PlatformShipmentReasonsResponse> getShipmentReasons(@Path("company_id") String companyId, @Path("shipment_id") String shipmentId, @Path("bag_id") String bagId, @Path("state") String state, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    Call<OrderPlatformModels.ShipmentReasonsResponse> getPlatformShipmentReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("action") String action, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bag-details")
    Call<OrderPlatformModels.BagDetailsPlatformResponse> getBagById(@Path("company_id") String companyId, @Query("bag_id") String bagId, @Query("channel_bag_id") String channelBagId, @Query("channel_id") String channelId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bags")
    Call<OrderPlatformModels.GetBagsPlatformResponse> getBags(@Path("company_id") String companyId, @Query("bag_ids") String bagIds, @Query("shipment_ids") String shipmentIds, @Query("order_ids") String orderIds, @Query("channel_bag_ids") String channelBagIds, @Query("channel_shipment_ids") String channelShipmentIds, @Query("channel_order_ids") String channelOrderIds, @Query("channel_id") String channelId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/{order_id}/generate/pos-receipt")
    Call<OrderPlatformModels.GeneratePosOrderReceiptResponse> generatePOSReceiptByOrderId(@Path("company_id") String companyId, @Path("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("document_type") String documentType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates")
    Call<OrderPlatformModels.AllowedTemplatesResponse> getAllowedTemplatesForBulk(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates/{template_name}")
    Call<OrderPlatformModels.TemplateDownloadResponse> getTemplate(@Path("company_id") String companyId, @Path("template_name") String templateName, @HeaderMap Map<String, String> requestHeaders);
}