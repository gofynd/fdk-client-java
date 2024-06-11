package com.sdk.platform.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookPlatformApiList {

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry")
    Call<WebhookPlatformModels.RetrySuccessResponse> manualRetryOfFailedEvent(@Path("company_id") String companyId, @Body WebhookPlatformModels.RetryEventRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry/events/counts")
    Call<WebhookPlatformModels.RetryCountResponse> getEventCounts(@Path("company_id") String companyId, @Body WebhookPlatformModels.RetryEventRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/retry/status")
    Call<WebhookPlatformModels.RetryStatusResponse> getManualRetryStatus(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/webhook/v1.0/company/{company_id}/retry/cancel")
    Call<String> manualRetryCancel(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/download")
    Call<WebhookPlatformModels.DownloadReportResponse> downloadDeliveryReport(@Path("company_id") String companyId, @Body WebhookPlatformModels.EventProcessRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/ping")
    Call<WebhookPlatformModels.PingWebhookResponse> pingWebhook(@Path("company_id") String companyId, @Body WebhookPlatformModels.PingWebhook payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/filters")
    Call<List<WebhookPlatformModels.ReportFilterResponse>> getReportFilters(@Path("company_id") String companyId, @Body WebhookPlatformModels.ReportFiltersPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/history")
    Call<WebhookPlatformModels.HistoryResponse> getHistoricalReports(@Path("company_id") String companyId, @Body WebhookPlatformModels.HistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/reports/cancel/file/{filename}")
    Call<WebhookPlatformModels.CancelResponse> cancelJobByName(@Path("company_id") String companyId, @Path("filename") String filename, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/event_processed")
    Call<WebhookPlatformModels.EventProcessReports> getDeliveryReports(@Path("company_id") String companyId, @Body WebhookPlatformModels.EventProcessRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    Call<WebhookPlatformModels.EventConfigResponse> fetchAllEventConfigurations(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResponse> registerSubscriberToEventV2(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResponse> updateSubscriberV2(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResponse> registerSubscriberToEvent(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByCompany(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("extension_id") String extensionId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResponse> updateSubscriberConfig(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    Call<WebhookPlatformModels.SubscriberResponse> getSubscriberById(@Path("company_id") String companyId, @Path("subscriber_id") Integer subscriberId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByExtensionId(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);
}