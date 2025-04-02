package com.sdk.platform.lead;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface LeadPlatformApiList {

    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<LeadPlatformModels.TicketList> getPlatformTickets(@Path("company_id") String companyId, @Query("items") Boolean items, @Query("filters") Boolean filters, @Query("q") String q, @Query("status") String status, @Query("priority") String priority, @Query("category") String category, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<LeadPlatformModels.Ticket> createTicket(@Path("company_id") String companyId, @Body LeadPlatformModels.AddTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    Call<LeadPlatformModels.TicketList> getTickets(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("items") Boolean items, @Query("filters") Boolean filters, @Query("q") String q, @Query("status") String status, @Query("priority") String priority, @Query("category") String category, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> getPlatformTicket(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> editPlatformTicket(@Path("company_id") String companyId, @Path("id") String id, @Body LeadPlatformModels.EditTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> getTicket(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<LeadPlatformModels.Ticket> editTicket(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body LeadPlatformModels.EditTicketPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistory> createPlatformTicketHistory(@Path("company_id") String companyId, @Path("id") String id, @Body LeadPlatformModels.TicketHistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistoryList> getPlatformTicketHistory(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistory> createNewHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body LeadPlatformModels.TicketHistoryPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<LeadPlatformModels.TicketHistoryList> getTicketHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<LeadPlatformModels.CustomForm> getCustomForm(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<LeadPlatformModels.CustomForm> editCustomForm(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Body LeadPlatformModels.EditCustomFormPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<LeadPlatformModels.CustomForm> deleteCustomForm(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<LeadPlatformModels.CustomFormList> getCustomForms(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<LeadPlatformModels.CustomForm> createCustomForm(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body LeadPlatformModels.CreateCustomFormPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/lead/v1.0/company/{company_id}/general-config")
    Call<LeadPlatformModels.GeneralConfigResponse> getGeneralConfig(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);
}