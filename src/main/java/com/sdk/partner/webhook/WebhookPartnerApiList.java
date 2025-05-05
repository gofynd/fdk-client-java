package com.sdk.partner.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookPartnerApiList {

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/response_time_ts")
    Call<WebhookPartnerModels.ResponseTimeTs> responseTimeSummary(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_summary")
    Call<WebhookPartnerModels.DeliverySummaryResult> fetchDeliverySummary(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_details")
    Call<WebhookPartnerModels.DeliveryDetailsResult> getDeliveryDetailInsights(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.DeliveryDetailsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_ts")
    Call<WebhookPartnerModels.DeliveryTsResult> fetchDeliveryTs(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/filters")
    Call<List<WebhookPartnerModels.FilterReportResult>> fetchReportFilters(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/reports/cancel/file/{filename}")
    Call<WebhookPartnerModels.CancelDownloadResult> cancelReportDownload(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("filename") String filename, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/history")
    Call<WebhookPartnerModels.HistoryResult> getHistoricalReports(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.HistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/invalid_events")
    Call<List<WebhookPartnerModels.InvalidEventsResult>> getInvalidEventList(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.InvalidEventsPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/subscriber/")
    Call<WebhookPartnerModels.SubscriberConfigDetails> fetchSubscribers(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/subscriber/{subscriber_id}")
    Call<WebhookPartnerModels.SubscriberUpdateResult> updateSubscriber(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("subscriber_id") Double subscriberId, @Body WebhookPartnerModels.SubscriberUpdate payload, @HeaderMap Map<String, String> requestHeaders);
}