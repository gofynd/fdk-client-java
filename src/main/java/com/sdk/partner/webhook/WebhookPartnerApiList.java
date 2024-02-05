package com.sdk.partner.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookPartnerApiList {

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_summary")
    Call<WebhookPartnerModels.DeliverySummaryResponse> fetchDeliverySummary(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_details")
    Call<WebhookPartnerModels.DeliveryDetailsResponse> getDeliveryDetailInsights(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.DeliveryDetailsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/delivery_ts")
    Call<WebhookPartnerModels.DeliveryTsResponse> fetchDeliveryTs(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/filters")
    Call<List<WebhookPartnerModels.FilterReportResponse>> fetchReportFilters(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/reports/cancel/file/{filename}")
    Call<WebhookPartnerModels.CancelDownloadResponse> cancelReportDownload(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("filename") String filename, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/history")
    Call<WebhookPartnerModels.HistoryResponse> getHistoricalReports(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.HistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/report/invalid_events")
    Call<List<WebhookPartnerModels.InvalidEventsResponse>> getInvalidEventList(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.InvalidEventsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/subscriber/")
    Call<WebhookPartnerModels.SubscriberConfigResponse> fetchSubscribers(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/subscriber/{subscriber_id}")
    Call<WebhookPartnerModels.UpdateSubscriberResponse> updateSubscriber(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("subscriber_id") Double subscriberId, @Body WebhookPartnerModels.UpdateSubscriberRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/kafka_config")
    Call<WebhookPartnerModels.KafkaConfigResponse> createKafkaConfiguration(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.KafkaConfigRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/kafka_config")
    Call<WebhookPartnerModels.KafkaConfigResponse> fetchKafkaConfiguration(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/kafka_config")
    Call<WebhookPartnerModels.KafkaConfigResponse> updateKafkaConfiguration(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.KafkaConfigUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/webhook/v1.0/organization/{organization_id}/extension/{extension_id}/kafka_config/validate")
    Call<WebhookPartnerModels.KafkaConfigValidateResponse> validateKafkaConfiguration(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body WebhookPartnerModels.KafkaConfigRequest payload, @HeaderMap Map<String, String> requestHeaders);
}