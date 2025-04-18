package com.sdk.partner.lead;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LeadPartnerApiList {

    @GET ("/service/partner/lead/v1.0/organization/{organization_id}/ticket")
    Call<LeadPartnerModels.TicketList> getTickets(@Path("organization_id") String organizationId, @Query("items") Boolean items, @Query("filters") Boolean filters, @Query("q") String q, @Query("status") String status, @Query("priority") String priority, @Query("category") String category, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/lead/v1.0/organization/{organization_id}/ticket")
    Call<LeadPartnerModels.Ticket> createTicket(@Path("organization_id") String organizationId, @Body LeadPartnerModels.AddTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/lead/v1.0/organization/{organization_id}/ticket/{id}")
    Call<LeadPartnerModels.Ticket> getTicket(@Path("organization_id") String organizationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/lead/v1.0/organization/{organization_id}/ticket/{id}")
    Call<LeadPartnerModels.Ticket> editTicket(@Path("organization_id") String organizationId, @Path("id") String id, @Body LeadPartnerModels.EditTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/lead/v1.0/organization/{organization_id}/ticket/{id}/history")
    Call<LeadPartnerModels.TicketHistory> createHistory(@Path("organization_id") String organizationId, @Path("id") String id, @Body LeadPartnerModels.TicketHistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/lead/v1.0/organization/{organization_id}/ticket/{id}/history")
    Call<LeadPartnerModels.TicketHistoryList> getTicketHistory(@Path("organization_id") String organizationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/lead/v1.0/organization/{organization_id}/general-config")
    Call<LeadPartnerModels.GeneralConfigResponse> getGeneralConfig(@Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);
}