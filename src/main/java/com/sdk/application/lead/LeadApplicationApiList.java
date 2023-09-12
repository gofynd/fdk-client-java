package com.sdk.application.lead;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LeadApplicationApiList {
    
    
    @GET 
    Call<LeadApplicationModels.Ticket> getTicket(@Url String url1);
    
    @POST 
    Call<LeadApplicationModels.TicketHistory> createHistory(@Url String url1 , @Body LeadApplicationModels.TicketHistoryPayload payload );
    
    @POST 
    Call<LeadApplicationModels.Ticket> createTicket(@Url String url1 , @Body LeadApplicationModels.AddTicketPayload payload );
    
    @GET 
    Call<LeadApplicationModels.CustomForm> getCustomForm(@Url String url1);
    
    @POST 
    Call<LeadApplicationModels.SubmitCustomFormResponse> submitCustomForm(@Url String url1 , @Body LeadApplicationModels.CustomFormSubmissionPayload payload );
    
    @GET 
    Call<LeadApplicationModels.GetParticipantsInsideVideoRoomResponse> getParticipantsInsideVideoRoom(@Url String url1);
    
    @GET 
    Call<LeadApplicationModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Url String url1);
}