package com.sdk.universal.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookPublicApiList {

    @GET ("/service/common/webhook/v1.0/events")
    Call<WebhookPublicModels.EventConfigResponse> fetchAllWebhookEvents(@HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/common/webhook/v1.0/events/query-event-details")
    Call<WebhookPublicModels.EventConfigResponse> queryWebhookEventDetails(@Body List<WebhookPublicModels.EventConfigBase> payload, @HeaderMap Map<String, String> requestHeaders);
}