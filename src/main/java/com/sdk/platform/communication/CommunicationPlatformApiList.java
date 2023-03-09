package com.sdk.platform.communication;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CommunicationPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<CommunicationPlatformModels.Campaigns> getCampaigns(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<CommunicationPlatformModels.Campaign> createCampaign(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.CampaignReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<CommunicationPlatformModels.Campaign> getCampaignById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<CommunicationPlatformModels.Campaign> updateCampaignById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.CampaignReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    Call<CommunicationPlatformModels.GetStats> getStatsOfCampaignById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<CommunicationPlatformModels.Audiences> getAudiences(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<CommunicationPlatformModels.Audience> createAudience(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.AudienceReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/bigquery-headers")
    Call<CommunicationPlatformModels.BigqueryHeadersRes> getBigqueryHeaders(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.BigqueryHeadersReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<CommunicationPlatformModels.Audience> getAudienceById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<CommunicationPlatformModels.Audience> updateAudienceById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.AudienceReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    Call<CommunicationPlatformModels.GetNRecordsCsvRes> getNSampleRecordsFromCsv(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.GetNRecordsCsvReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<CommunicationPlatformModels.EmailProviders> getEmailProviders(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<CommunicationPlatformModels.EmailProvider> createEmailProvider(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.EmailProviderReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<CommunicationPlatformModels.EmailProvider> getEmailProviderById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<CommunicationPlatformModels.EmailProvider> updateEmailProviderById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.EmailProviderReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<CommunicationPlatformModels.EmailTemplates> getEmailTemplates(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<CommunicationPlatformModels.EmailTemplateRes> createEmailTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.EmailTemplateReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    Call<CommunicationPlatformModels.SystemEmailTemplates> getSystemEmailTemplates(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.EmailTemplate> getEmailTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.EmailTemplateRes> updateEmailTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.EmailTemplateReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<CommunicationPlatformModels.EmailTemplateDeleteSuccessRes> deleteEmailTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-instant")
    Call<CommunicationPlatformModels.EngineResponse> sendCommunicationSynchronously(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.EngineRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/engine/send-async")
    Call<CommunicationPlatformModels.EngineResponse> sendCommunicationAsynchronously(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.EngineRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    Call<CommunicationPlatformModels.EventSubscriptions> getEventSubscriptions(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("populate") String  populate );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    Call<CommunicationPlatformModels.Jobs> getJobs(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    Call<CommunicationPlatformModels.TriggerJobResponse> triggerCampaignJob(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.TriggerJobRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    Call<CommunicationPlatformModels.JobLogs> getJobLogs(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    Call<CommunicationPlatformModels.Logs> getCommunicationLogs(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort ,  @Query("query") Object  query );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications/")
    Call<CommunicationPlatformModels.SystemNotifications> getSystemNotifications(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/send-otp-comms")
    Call<CommunicationPlatformModels.SendOtpCommsRes> sendOtp(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.SendOtpCommsReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/otp/verify-otp-comms")
    Call<CommunicationPlatformModels.VerifyOtpCommsSuccessRes> verfiyOtp(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.VerifyOtpCommsReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<CommunicationPlatformModels.SmsProviders> getSmsProviders(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<CommunicationPlatformModels.SmsProvider> createSmsProvider(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.SmsProviderReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<CommunicationPlatformModels.SmsProvider> getSmsProviderById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<CommunicationPlatformModels.SmsProvider> updateSmsProviderById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.SmsProviderReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<CommunicationPlatformModels.SmsTemplates> getSmsTemplates(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<CommunicationPlatformModels.SmsTemplateRes> createSmsTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CommunicationPlatformModels.SmsTemplateReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.SmsTemplate> getSmsTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.SmsTemplateRes> updateSmsTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CommunicationPlatformModels.SmsTemplateReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<CommunicationPlatformModels.SmsTemplateDeleteSuccessRes> deleteSmsTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    Call<CommunicationPlatformModels.SystemSmsTemplates> getSystemSystemTemplates(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("sort") Object  sort );
    
}