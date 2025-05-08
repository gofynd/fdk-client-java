package com.sdk.application.lead;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LeadApplicationApiList {

    @GET 
    Call<LeadApplicationModels.Ticket> getTicket(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LeadApplicationModels.TicketHistory> createHistory(@Url String url1, @Body LeadApplicationModels.TicketHistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LeadApplicationModels.Ticket> createTicket(@Url String url1, @Body LeadApplicationModels.AddTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<LeadApplicationModels.CustomForm> getCustomForm(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<LeadApplicationModels.SubmitCustomFormDetails> submitCustomForm(@Url String url1, @Body LeadApplicationModels.CustomFormSubmissionPayload payload, @HeaderMap Map<String, String> requestHeaders);
}