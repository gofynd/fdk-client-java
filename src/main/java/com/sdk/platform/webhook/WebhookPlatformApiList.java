package com.sdk.platform.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface WebhookPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberResponse> getSubscribersByCompany(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("extension_id") String  extensionId );
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfig> registerSubscriberToEvent(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.SubscriberConfig payload);
    
    
    
    
    
    
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfig> updateSubscriberConfig(@Path("company_id")  String companyId ,@Body WebhookPlatformModels.SubscriberConfig payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    Call<WebhookPlatformModels.SubscriberConfigList> getSubscribersByExtensionId(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    Call<WebhookPlatformModels.SubscriberResponse> getSubscriberById(@Path("company_id")  String companyId , @Path("subscriber_id") Integer  subscriberId );
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    Call<WebhookPlatformModels.EventConfigResponse> fetchAllEventConfigurations(@Path("company_id")  String companyId );
    
}