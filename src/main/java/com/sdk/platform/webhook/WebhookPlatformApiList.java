package com.sdk.platform.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookPlatformApiList {

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    Call<WebhookPlatformModels.EventConfigResult> fetchAllEventConfigurations(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResult> registerSubscriberToEventV2(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigPostRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/webhook/v2.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResult> updateSubscriberV2(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigUpdateRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResult> registerSubscriberToEvent(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigPost payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByCompany(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("extension_id") String extensionId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigResult> updateSubscriberConfig(@Path("company_id") String companyId, @Body WebhookPlatformModels.SubscriberConfigUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/webhook/v3.0/company/{company_id}/subscriber/")
    Call<WebhookPlatformModels.UpsertSubscriberConfigResult> upsertSubscriberEvent(@Path("company_id") String companyId, @Body WebhookPlatformModels.UpsertSubscriberConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    Call<WebhookPlatformModels.SubscriberDetails> getSubscriberById(@Path("company_id") String companyId, @Path("subscriber_id") Integer subscriberId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber/")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByExtensionId(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);
}