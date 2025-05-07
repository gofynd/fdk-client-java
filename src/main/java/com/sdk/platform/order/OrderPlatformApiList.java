package com.sdk.platform.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface OrderPlatformApiList {

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/update-cache")
    Call<OrderPlatformModels.InvalidateShipmentCacheResponseSchema> invalidateShipmentCache(@Path("company_id") String companyId, @Body OrderPlatformModels.InvalidateShipmentCachePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    Call<OrderPlatformModels.PostRefundStateConfigurationResponseSchema> postRefundStateConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @Body OrderPlatformModels.PostRefundStateConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states/config")
    Call<OrderPlatformModels.GetRefundStateConfigurationResponseSchema> getRefundStateConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/states")
    Call<OrderPlatformModels.GetRefundStates> getRefundEnableStateList(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    Call<OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema> postRefundConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @Body OrderPlatformModels.RefundStateConfigurationManualSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/refund/config")
    Call<OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema> getRefundConfiguration(@Path("company_id") String companyId, @Query("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/store/reassign-internal")
    Call<OrderPlatformModels.StoreReassignResponseSchema> reassignLocation(@Path("company_id") String companyId, @Body OrderPlatformModels.StoreReassign payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/{shipment_id}/refund-options")
    Call<OrderPlatformModels.RefundOptionsSchemaResponseSchema> getRefundOptions(@Path("shipment_id") String shipmentId, @Path("company_id") String companyId, @Query("bag_ids") String bagIds, @Query("state") String state, @Query("optin_app_id") String optinAppId, @Query("optin_company_id") Integer optinCompanyId, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/announcements")
    Call<OrderPlatformModels.AnnouncementsResponseSchema> getAnnouncements(@Path("company_id") String companyId, @Query("date") String date, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/click2call")
    Call<OrderPlatformModels.Click2CallResponseSchema> click2Call(@Path("company_id") String companyId, @Query("caller") String caller, @Query("receiver") String receiver, @Query("bag_id") String bagId, @Query("caller_id") String callerId, @Query("method") String method, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/status-internal")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipmentStatus(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentStatusRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponseSchema> getShipmentHistory(@Path("company_id") String companyId, @Query("shipment_id") String shipmentId, @Query("bag_id") Integer bagId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/history")
    Call<OrderPlatformModels.ShipmentHistoryResponseSchema> postShipmentHistory(@Path("company_id") String companyId, @Body OrderPlatformModels.PostShipmentHistory payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/ninja/send-sms")
    Call<OrderPlatformModels.SendSmsResponseSchema> sendSmsNinja(@Path("company_id") String companyId, @Body OrderPlatformModels.SendSmsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/update-packaging-dimension")
    Call<OrderPlatformModels.UpdatePackagingDimensionsResponseSchema> updatePackagingDimensions(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdatePackagingDimensionsPayload payload, @HeaderMap Map<String, String> requestHeaders);

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
    Call<OrderPlatformModels.AttachOrderUserResponseSchema> attachOrderUser(@Path("company_id") String companyId, @Body OrderPlatformModels.AttachOrderUser payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/send/otp/mobile")
    Call<OrderPlatformModels.SendUserMobileOtpResponseSchema> sendUserMobileOTP(@Path("company_id") String companyId, @Body OrderPlatformModels.SendUserMobileOTP payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/user/verify/otp")
    Call<OrderPlatformModels.VerifyOtpResponseSchema> verifyMobileOTP(@Path("company_id") String companyId, @Body OrderPlatformModels.VerifyMobileOTP payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/reports/lanes/download")
    Call<OrderPlatformModels.BulkReportsDownloadResponseSchema> downloadLanesReport(@Path("company_id") String companyId, @Body OrderPlatformModels.BulkReportsDownloadRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/state-transition")
    Call<OrderPlatformModels.BulkStateTransistionResponseSchema> bulkStateTransistion(@Path("company_id") String companyId, @Body OrderPlatformModels.BulkStateTransistionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs")
    Call<OrderPlatformModels.BulkListingResponseSchema> bulkListing(@Path("company_id") String companyId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("status") String status, @Query("bulk_action_type") String bulkActionType, @Query("search_key") String searchKey, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}")
    Call<OrderPlatformModels.JobDetailsResponseSchema> jobDetails(@Path("company_id") String companyId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/jobs/{batch_id}/file")
    Call<OrderPlatformModels.JobFailedResponseSchema> getFileByStatus(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Query("status") String status, @Query("file_type") String fileType, @Query("report_type") String reportType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/filter/listing")
    Call<OrderPlatformModels.ManifestFiltersResponseSchema> getManifestfilters(@Path("company_id") String companyId, @Query("view") String view, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/einvoice/retry/irn")
    Call<OrderPlatformModels.EInvoiceRetryResponseSchema> eInvoiceRetry(@Path("company_id") String companyId, @Body OrderPlatformModels.EInvoiceRetry payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed")
    Call<OrderPlatformModels.FailedOrderLogs> getFailedOrderLogs(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search_type") String searchType, @Query("search_value") String searchValue, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/orders/failed/logs/{log_id}")
    Call<OrderPlatformModels.FailedOrderLogDetails> failedOrderLogDetails(@Path("company_id") String companyId, @Path("log_id") String logId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/question")
    Call<Object> getQuestions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-lane-config")
    Call<OrderPlatformModels.LaneRuleConfigSchema> getRuleLaneConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("search_value") String searchValue, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule")
    Call<OrderPlatformModels.RuleSuccessResponseSchema> createRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.RuleRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleResponseSchema> getRuleById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleSuccessResponseSchema> updateRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @Body OrderPlatformModels.RuleUpdateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule/{rule_id}")
    Call<OrderPlatformModels.RuleSuccessResponseSchema> deleteRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("rule_id") String ruleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-position")
    Call<OrderPlatformModels.RuleListResponseSchema> updateRulePosition(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.UpdateRulePositionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule-parameters")
    Call<OrderPlatformModels.RuleParametersResponseSchema> getRuleParameters(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/application/{application_id}/rule_list")
    Call<OrderPlatformModels.RuleListResponseSchema> getRuleList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body OrderPlatformModels.RuleListRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/roles")
    Call<OrderPlatformModels.GetActionsResponseSchema> getRoleBasedActions(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/debug/order_status")
    Call<OrderPlatformModels.OrderStatusResult> checkOrderStatus(@Path("company_id") String companyId, @Body OrderPlatformModels.OrderStatus payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/entity/lock-manager")
    Call<OrderPlatformModels.UpdateShipmentLockResponseSchema> updateShipmentLock(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentLockPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/create-order")
    Call<OrderPlatformModels.CreateOrderResponseSchema> createOrder(@Path("company_id") String companyId, @Body OrderPlatformModels.CreateOrderAPI payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/shipment/update")
    Call<OrderPlatformModels.UpdateShipmentStatusResponseBody> updateShipment(@Path("company_id") String companyId, @Body OrderPlatformModels.UpdateShipmentActionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order-manage/v1.0/company/{company_id}/order/{order_id}")
    Call<OrderPlatformModels.OrderUpdateResponseDetail> updateOrder(@Path("company_id") String companyId, @Path("order_id") String orderId, @Body OrderPlatformModels.OrderUpdatePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order-manage/v1.0/company/{company_id}/state/manager/config")
    Call<OrderPlatformModels.ConfigUpdatedResponseSchema> addStateManagerConfig(@Path("company_id") String companyId, @Body OrderPlatformModels.TransitionConfigPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order-manage/v1.0/company/{company_id}/state/manager/config")
    Call<Object> getStateManagerConfig(@Path("company_id") String companyId, @Query("app_id") String appId, @Query("ordering_channel") String orderingChannel, @Query("entity") String entity, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/line_number/{line_number}/reasons")
    Call<OrderPlatformModels.ShipmentBagReasons> getShipmentBagReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @Path("line_number") Integer lineNumber, @Query("bag_id") String bagId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments-listing")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> getShipments(@Path("company_id") String companyId, @Query("lane") String lane, @Query("bag_status") String bagStatus, @Query("status_override_lane") Boolean statusOverrideLane, @Query("time_to_dispatch") Integer timeToDispatch, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("fetch_active_shipment") Boolean fetchActiveShipment, @Query("allow_inactive") Boolean allowInactive, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @Query("payment_methods") String paymentMethods, @Query("channel_shipment_id") String channelShipmentId, @Query("channel_order_id") String channelOrderId, @Query("custom_meta") String customMeta, @Query("ordering_channel") String orderingChannel, @Query("company_affiliate_tag") String companyAffiliateTag, @Query("my_orders") Boolean myOrders, @Query("platform_user_id") String platformUserId, @Query("sort_type") String sortType, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("tags") String tags, @Query("customer_id") String customerId, @Query("order_type") String orderType, @Query("operational_status") String operationalStatus, @Query("financial_status") String financialStatus, @Query("logistics_status") String logisticsStatus, @Query("parent_view_slug") String parentViewSlug, @Query("child_view_slug") String childViewSlug, @Query("lock_status") String lockStatus, @Query("group_entity") String groupEntity, @Query("enforce_date_filter") Boolean enforceDateFilter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipment-details")
    Call<OrderPlatformModels.ShipmentInfoResponseSchema> getShipmentById(@Path("company_id") String companyId, @Query("channel_shipment_id") String channelShipmentId, @Query("shipment_id") String shipmentId, @Query("fetch_active_shipment") Boolean fetchActiveShipment, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/order-details")
    Call<OrderPlatformModels.OrderDetailsResponseSchema> getOrderById(@Path("company_id") String companyId, @Query("order_id") String orderId, @Query("my_orders") Boolean myOrders, @Query("allow_inactive") Boolean allowInactive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/lane-config")
    Call<OrderPlatformModels.LaneConfigResponseSchema> getLaneConfig(@Path("company_id") String companyId, @Query("super_lane") String superLane, @Query("group_entity") String groupEntity, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("payment_mode") String paymentMode, @Query("bag_status") String bagStatus, @Query("search_type") String searchType, @Query("search_value") String searchValue, @Query("tags") String tags, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders-listing")
    Call<OrderPlatformModels.OrderListingResponseSchema> getOrders(@Path("company_id") String companyId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("bag_status") String bagStatus, @Query("time_to_dispatch") Integer timeToDispatch, @Query("payment_methods") String paymentMethods, @Query("tags") String tags, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("dp_ids") String dpIds, @Query("stores") String stores, @Query("sales_channels") String salesChannels, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_priority_sort") Boolean isPrioritySort, @Query("custom_meta") List<Object> customMeta, @Query("my_orders") Boolean myOrders, @Query("show_cross_company_data") Boolean showCrossCompanyData, @Query("customer_id") String customerId, @Query("order_type") String orderType, @Query("operational_status") String operationalStatus, @Query("financial_status") String financialStatus, @Query("logistics_status") String logisticsStatus, @Query("parent_view_slug") String parentViewSlug, @Query("child_view_slug") String childViewSlug, @Query("group_entity") String groupEntity, @Query("enforce_date_filter") Boolean enforceDateFilter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/shipments")
    Call<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> getApplicationShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("lane") String lane, @Query("search_type") String searchType, @Query("search_id") String searchId, @Query("search_value") String searchValue, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("dp_ids") String dpIds, @Query("ordering_company_id") String orderingCompanyId, @Query("stores") String stores, @Query("sales_channel") String salesChannel, @Query("request_by_ext") String requestByExt, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("customer_id") String customerId, @Query("is_priority_sort") Boolean isPrioritySort, @Query("exclude_locked_shipments") Boolean excludeLockedShipments, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<OrderPlatformModels.PlatformShipmentTrack> trackShipmentPlatform(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order/v1.0/company/{company_id}/view/position")
    Call<OrderPlatformModels.CreateUpdateDeleteResponseSchema> updateUserViewPosition(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewPosition payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.UserViewsResponseSchema> getUserViews(@Path("company_id") String companyId, @Query("show_in") String showIn, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponseSchema> addUserViews(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewsResponseSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponseSchema> updateUserViews(@Path("company_id") String companyId, @Body OrderPlatformModels.UserViewsResponseSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/order/v1.0/company/{company_id}/views")
    Call<OrderPlatformModels.CreateUpdateDeleteResponseSchema> deleteUserViews(@Path("company_id") String companyId, @Query("view_id") String viewId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/filters")
    Call<OrderPlatformModels.GlobalFiltersResponseSchema> getGlobalFilters(@Path("company_id") String companyId, @Query("show_in") String showIn, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/filter-listing")
    Call<OrderPlatformModels.FiltersResponseSchema> getfilters(@Path("company_id") String companyId, @Query("view") String view, @Query("group_entity") String groupEntity, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/generate/file")
    Call<OrderPlatformModels.TemplateDownloadResponseSchema> getBulkShipmentExcelFile(@Path("company_id") String companyId, @Query("sales_channels") String salesChannels, @Query("dp_ids") String dpIds, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("stores") String stores, @Query("tags") String tags, @Query("bag_status") String bagStatus, @Query("payment_methods") String paymentMethods, @Query("file_type") String fileType, @Query("time_to_dispatch") Integer timeToDispatch, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/get-seller-templates")
    Call<OrderPlatformModels.BulkActionTemplateResponseSchema> getBulkActionTemplate(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bulk-action/download-seller-templates")
    Call<OrderPlatformModels.TemplateDownloadResponseSchema> downloadBulkActionTemplate(@Path("company_id") String companyId, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/shipments/{shipment_id}/bags/{bag_id}/state/{state}/reasons")
    Call<OrderPlatformModels.PlatformShipmentReasonsResponseSchema> getShipmentReasons(@Path("company_id") String companyId, @Path("shipment_id") String shipmentId, @Path("bag_id") String bagId, @Path("state") String state, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    Call<OrderPlatformModels.ShipmentReasonsResponseSchema> getPlatformShipmentReasons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("action") String action, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bag-details")
    Call<OrderPlatformModels.BagDetailsPlatformResponseSchema> getBagById(@Path("company_id") String companyId, @Query("bag_id") String bagId, @Query("channel_bag_id") String channelBagId, @Query("channel_id") String channelId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/bags")
    Call<OrderPlatformModels.GetBagsPlatformResponseSchema> getBags(@Path("company_id") String companyId, @Query("bag_ids") String bagIds, @Query("shipment_ids") String shipmentIds, @Query("order_ids") String orderIds, @Query("channel_bag_ids") String channelBagIds, @Query("channel_shipment_ids") String channelShipmentIds, @Query("channel_order_ids") String channelOrderIds, @Query("channel_id") String channelId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/{order_id}/generate/pos-receipt")
    Call<OrderPlatformModels.GeneratePosOrderReceiptResponseSchema> generatePOSReceiptByOrderId(@Path("company_id") String companyId, @Path("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("document_type") String documentType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates")
    Call<OrderPlatformModels.AllowedTemplatesResponseSchema> getAllowedTemplatesForBulk(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/jobs/templates/{template_name}")
    Call<OrderPlatformModels.TemplateDownloadResponseSchema> getTemplate(@Path("company_id") String companyId, @Path("template_name") String templateName, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/order/v1.0/company/{company_id}/order/config/{app_id}")
    Call<OrderPlatformModels.OrderConfig> getOrderConfig(@Path("company_id") String companyId, @Path("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/order/v1.0/company/{company_id}/order/config/{app_id}")
    Call<OrderPlatformModels.CreateUpdateDeleteResponseSchema> updateOrderConfig(@Path("company_id") String companyId, @Path("app_id") String appId, @Body OrderPlatformModels.ConfigData payload, @HeaderMap Map<String, String> requestHeaders);
}