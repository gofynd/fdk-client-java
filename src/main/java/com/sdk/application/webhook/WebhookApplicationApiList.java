package com.sdk.application.webhook;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface WebhookApplicationApiList {

    @POST 
    Call<WebhookApplicationModels.ClickEventResponse> saveClickEvent(@Url String url1, @Body WebhookApplicationModels.ClickEventRequest payload, @HeaderMap Map<String, String> requestHeaders);
}