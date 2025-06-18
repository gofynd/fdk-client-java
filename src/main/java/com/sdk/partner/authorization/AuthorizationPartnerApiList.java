package com.sdk.partner.authorization;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface AuthorizationPartnerApiList {

    @POST ("/service/partner/authorization/v1.0/organization/{organization_id}/oauth/client")
    Call<AuthorizationPartnerModels.ClientResponseSchema> createOrganizationClient(@Path("organization_id") String organizationId, @Body AuthorizationPartnerModels.ClientData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/authorization/v1.0/organization/{organization_id}/oauth/client")
    Call<AuthorizationPartnerModels.ClientListSchema> getOrganizationClientList(@Path("organization_id") String organizationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/authorization/v1.0/organization/{organization_id}/oauth/client/{client_id}")
    Call<AuthorizationPartnerModels.ClientResponseSchema> getOrganizationClientById(@Path("organization_id") String organizationId, @Path("client_id") String clientId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/authorization/v1.0/organization/{organization_id}/oauth/client/{client_id}")
    Call<AuthorizationPartnerModels.ClientResponseSchema> updateOrganizationClientById(@Path("organization_id") String organizationId, @Path("client_id") String clientId, @Body AuthorizationPartnerModels.UpdateClient payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/authorization/v1.0/organization/{organization_id}/oauth/client/{client_id}")
    Call<AuthorizationPartnerModels.ClientResponseSchema> deleteOrganizationOAuthClientById(@Path("organization_id") String organizationId, @Path("client_id") String clientId, @HeaderMap Map<String, String> requestHeaders);
}