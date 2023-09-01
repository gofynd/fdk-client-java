package com.sdk.platform.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface WebhookPlatformApiList {
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry")
    Call<WebhookPlatformModels.EventProcessedSuccessResponse> manualRetryOfFailedEvent(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.EventProcessRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/retry/events/counts")
    Call<WebhookPlatformModels.FailedEventsCountSuccessResponse> getEventCounts(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.EventProcessRequest payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/retry/status")
    Call<WebhookPlatformModels.RetryStatusResponse> getManualRetryStatus(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @DELETE ("/service/platform/webhook/v1.0/company/{company_id}/retry/cancel")
    Call<WebhookPlatformModels.EventSuccessResponse> manualRetryCancel(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/event_processed")
    Call<WebhookPlatformModels.EventProcessReports> getDeliveryReports(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.EventProcessRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/download")
    Call<Object> downloadDeliveryReport(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.EventProcessRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/ping")
    Call<WebhookPlatformModels.PingWebhookResponse> pingWebhook(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.PingWebhook payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    Call<WebhookPlatformModels.EventConfigResponse> fetchAllEventConfigurations(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/filters")
    Call<WebhookPlatformModels.ReportFilterResponse> getReportFilters(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.ReportFiltersPayload payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/reports/history")
    Call<WebhookPlatformModels.HistoryResponse> getHistoricalReports(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.HistoryPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/reports/cancel/file/{filename}")
    Call<WebhookPlatformModels.CancelResponse> cancelJobByName(@Path("company_id")  String companyId , @Path("filename") String  filename );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberResponse> getSubscribersByCompany(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("extension_id") String  extensionId );
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfig> registerSubscriberToEvent(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.SubscriberConfig payload);
    
    
    
    
    
    
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfig> updateSubscriberConfig(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.SubscriberConfig payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    Call<WebhookPlatformModels.SubscriberResponse> getSubscriberById(@Path("company_id")  String companyId , @Path("subscriber_id") Integer  subscriberId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByExtensionId(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
}