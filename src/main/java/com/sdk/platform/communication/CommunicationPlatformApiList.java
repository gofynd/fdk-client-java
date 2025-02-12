package com.sdk.platform.communication;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CommunicationPlatformApiList {

    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-sync")
    Call<CommunicationPlatformModels.SendInstantResponse> sendByCompanyCommunicationSynchronously(@Path("company_id") String companyId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-sync")
    Call<CommunicationPlatformModels.SendInstantResponse> sendEngineCommunicationSynchronously(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-async")
    Call<CommunicationPlatformModels.EngineResponse> senByCompanyCommunicationAsynchronously(@Path("company_id") String companyId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    Call<CommunicationPlatformModels.EngineResponse> sendCommunicationAsynchronously(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    Call<CommunicationPlatformModels.SendInstantResponse> sendCommunicationSynchronously(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/engine/send-instant")
    Call<CommunicationPlatformModels.SendInstantResponse> sendByCompanyCommunicationInstantly(@Path("company_id") String companyId, @Body CommunicationPlatformModels.EngineRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    Call<CommunicationPlatformModels.EventSubscriptions> getEventSubscriptions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("populate") String populate, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    Call<CommunicationPlatformModels.EventSubscriptionsBulkUpdateResponse> createEventSubscriptions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.SubscriptionsObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/bulkUpdate")
    Call<List<CommunicationPlatformModels.EventSubscriptionsBulkUpdateResponse>> createEventSubscriptionsByBulk(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EventSubscriptionsBulkUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    Call<CommunicationPlatformModels.EventSubscription> getEventSubscriptionsById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("populate") String populate, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    Call<CommunicationPlatformModels.EventSubscriptionsBulkUpdateResponse> editEventSubscriptions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.SubscriptionsObjectRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions/{id}")
    Call<CommunicationPlatformModels.EventSubscription> deleteEventSubscriptionsById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<CommunicationPlatformModels.EmailTemplates> getEmailTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<CommunicationPlatformModels.EmailTemplate> createEmailTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EmailTemplateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.EmailTemplate> getEmailTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.EmailTemplate> updateEmailTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.EmailTemplateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteEmailTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    Call<List<CommunicationPlatformModels.SystemEmailTemplate>> getSystemEmailTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/subscribedTemplates")
    Call<CommunicationPlatformModels.SubscribedEmailTemplates> getSubscribedEmailTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<CommunicationPlatformModels.EmailProviders> getEmailProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<CommunicationPlatformModels.EmailProvider> createEmailProvider(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.EmailProviderReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<CommunicationPlatformModels.EmailProvider> getEmailProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<CommunicationPlatformModels.EmailProvider> updateEmailProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.EmailProviderReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteEmailProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/default-providers")
    Call<List<CommunicationPlatformModels.DefaultEmailProviders>> getDefaultEmailProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<CommunicationPlatformModels.SmsProviders> getSmsProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<CommunicationPlatformModels.SmsProvider> createSmsProvider(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.SmsProviderReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<CommunicationPlatformModels.SmsProvider> getSmsProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<CommunicationPlatformModels.SmsProvider> updateSmsProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.SmsProviderReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteSmsProviderById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/default-providers")
    Call<List<CommunicationPlatformModels.DefaultSmsProviders>> getDefaultSmsProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<CommunicationPlatformModels.SmsTemplates> getSmsTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<CommunicationPlatformModels.SmsTemplate> createSmsTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.SmsTemplateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.SmsTemplate> getSmsTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.SmsTemplate> updateSmsTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.SmsTemplateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteSmsTemplateById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    Call<List<CommunicationPlatformModels.SystemSmsTemplates>> getSystemSmsTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/subscribedTemplates")
    Call<CommunicationPlatformModels.SubscribedSmsTemplates> getSubscribedSmsTemplates(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    Call<CommunicationPlatformModels.TriggerJobResponse> triggerCampaignJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.TriggerJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    Call<CommunicationPlatformModels.Jobs> getJobs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    Call<CommunicationPlatformModels.CreateJobsRes> createJobs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.CreateJobsReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    Call<CommunicationPlatformModels.JobLogs> getJobLogs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    Call<CommunicationPlatformModels.GlobalVariablesGetResponse> getGlobalVariables(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/global-variables")
    Call<CommunicationPlatformModels.GlobalVariablesPostResponse> postGlobalVariables(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.GlobalVariablesReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    Call<CommunicationPlatformModels.Logs> getCommunicationLogs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") Object query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/update-provider")
    Call<CommunicationPlatformModels.AppProvider> updateAppProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.AppProviderReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/get-provider")
    Call<CommunicationPlatformModels.AppProvider> getAppProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/global-providers")
    Call<CommunicationPlatformModels.GlobalProviders> getGlobalProviders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/app-provider/global-providers")
    Call<CommunicationPlatformModels.UpdateAppProvidersGlobalProviderResponse> updateAppProvidersGlobalProvider(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.AppProvidersGlobalProviderRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-source-meta")
    Call<CommunicationPlatformModels.DummyDatasourcesMeta> getDummyDatasourcesMeta(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") Integer id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasource/dummy-data-sources")
    Call<List<CommunicationPlatformModels.DummyDatasources>> getDummyDatasources(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<CommunicationPlatformModels.Audiences> getAudiences(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<CommunicationPlatformModels.Audience> createAudience(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.AudienceReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<CommunicationPlatformModels.Audience> getAudienceById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<CommunicationPlatformModels.Audience> updateAudienceById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.AudienceReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteAudienceById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.AudienceReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    Call<CommunicationPlatformModels.GetNRecordsCsvRes> getNSampleRecordsFromCsvByGet(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("count") Integer count, @Query("header") Boolean header, @Query("url") String url, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    Call<CommunicationPlatformModels.GetNRecordsCsvRes> getNSampleRecordsFromCsv(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.GetNRecordsCsvReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<CommunicationPlatformModels.Campaigns> getCampaigns(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("query") String query, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<CommunicationPlatformModels.Campaign> createCampaign(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.CampaignReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<CommunicationPlatformModels.Campaign> getCampaignById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<CommunicationPlatformModels.Campaign> updateCampaignById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CommunicationPlatformModels.CampaignReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<CommunicationPlatformModels.BasicDelete> deleteCampaignById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    Call<CommunicationPlatformModels.GetStats> getStatsOfCampaignById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications")
    Call<CommunicationPlatformModels.SystemNotifications> getSystemNotifications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("sort") String sort, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    Call<CommunicationPlatformModels.SendOtpCommsRes> sendOtp(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("ci") Boolean ci, @Body CommunicationPlatformModels.SendOtpCommsReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    Call<CommunicationPlatformModels.VerifyOtpCommsSuccessRes> verfiyOtp(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.VerifyOtpCommsReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    Call<CommunicationPlatformModels.OtpConfiguration> getOtpConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/otp-configuration")
    Call<CommunicationPlatformModels.OtpConfiguration> updateOtpConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.OtpConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/pn/tokens")
    Call<CommunicationPlatformModels.PushtokenRes> createAppPushtoken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CommunicationPlatformModels.PushtokenReq payload, @HeaderMap Map<String, String> requestHeaders);
}