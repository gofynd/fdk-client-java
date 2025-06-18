package com.sdk.application.communication;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CommunicationApplicationApiList {

    @GET 
    Call<CommunicationApplicationModels.CommunicationConsent> getCommunicationConsent(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CommunicationApplicationModels.CommunicationConsentRes> upsertCommunicationConsent(@Url String url1, @Body CommunicationApplicationModels.CommunicationConsentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CommunicationApplicationModels.CommunicationConsent> getCurrentCommunicationConsent(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CommunicationApplicationModels.CommunicationConsentRes> upsertCurrentCommunicationConsent(@Url String url1, @Body CommunicationApplicationModels.CommunicationConsentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CommunicationApplicationModels.OtpConfiguration> getOtpConfiguration(@Url String url1, @HeaderMap Map<String, String> requestHeaders);
}