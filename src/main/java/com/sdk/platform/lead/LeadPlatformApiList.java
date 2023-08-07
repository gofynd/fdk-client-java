package com.sdk.platform.lead;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface LeadPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<LeadPlatformModels.TicketList> getTickets(@Path("company_id")  String companyId , @Query("items") Boolean  items ,  @Query("filters") Boolean  filters ,  @Query("q") String  q ,  @Query("status") String  status ,  @Query("priority") LeadPlatformModels.PriorityEnum  priority ,  @Query("category") String  category ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<LeadPlatformModels.Ticket> createTicket(@Path("company_id")  String companyId ,@Body LeadPlatformModels.AddTicketPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    Call<LeadPlatformModels.TicketList> getNewTickets(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("items") Boolean  items ,  @Query("filters") Boolean  filters ,  @Query("q") String  q ,  @Query("status") String  status ,  @Query("priority") LeadPlatformModels.PriorityEnum  priority ,  @Query("category") String  category );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> getTicket(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> editTicket(@Path("company_id")  String companyId , @Path("id") String  id ,@Body LeadPlatformModels.EditTicketPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> getNewTicket(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> editNewTicket(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body LeadPlatformModels.EditTicketPayload payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistory> createHistory(@Path("company_id")  String companyId , @Path("id") String  id ,@Body LeadPlatformModels.TicketHistoryPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistoryList> getTicketHistory(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    Call<LeadPlatformModels.TicketFeedbackList> getFeedbacks(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    Call<LeadPlatformModels.TicketFeedback> submitFeedback(@Path("company_id")  String companyId , @Path("id") String  id ,@Body LeadPlatformModels.TicketFeedbackPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistory> createNewHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body LeadPlatformModels.TicketHistoryPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistoryList> getNewTicketHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<LeadPlatformModels.CustomForm> getCustomForm(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<LeadPlatformModels.CustomForm> editCustomForm(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug ,@Body LeadPlatformModels.EditCustomFormPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<LeadPlatformModels.CustomFormList> getCustomForms(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<LeadPlatformModels.CustomForm> createCustomForm(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LeadPlatformModels.CreateCustomFormPayload payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/token")
    Call<LeadPlatformModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Path("company_id")  String companyId , @Path("unique_name") String  uniqueName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    Call<LeadPlatformModels.GetTokenForVideoRoomResponse> getNewTokenForVideoRoom(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("unique_name") String  uniqueName );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/participants")
    Call<LeadPlatformModels.GetParticipantsInsideVideoRoomResponse> getVideoParticipants(@Path("company_id")  String companyId , @Path("unique_name") String  uniqueName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    Call<LeadPlatformModels.GetParticipantsInsideVideoRoomResponse> getNewVideoParticipants(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("unique_name") String  uniqueName );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    Call<LeadPlatformModels.CreateVideoRoomResponse> openVideoRoom(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body LeadPlatformModels.CreateVideoRoomPayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    Call<LeadPlatformModels.CloseVideoRoomResponse> closeVideoRoom(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("unique_name") String  uniqueName );
    
    
    
    
    
    
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    Call<LeadPlatformModels.CloseVideoRoomResponse> getGeneralConfig(@Path("company_id")  String companyId );
    
}