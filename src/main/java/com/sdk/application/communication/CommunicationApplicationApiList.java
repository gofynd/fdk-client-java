package com.sdk.application.communication;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CommunicationApplicationApiList {

    @GET 
    Call<CommunicationApplicationModels.CommunicationConsent> getCommunicationConsent(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CommunicationApplicationModels.CommunicationConsentRes> upsertCommunicationConsent(@Url String url1, @Body CommunicationApplicationModels.CommunicationConsentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CommunicationApplicationModels.PushtokenRes> upsertAppPushtoken(@Url String url1, @Body CommunicationApplicationModels.PushtokenReq payload, @HeaderMap Map<String, String> requestHeaders);
}