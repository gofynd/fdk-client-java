package com.sdk.partner.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStoragePartnerApiList {

    @POST ("/service/partner/assets/v1.0/organization/{organization_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePartnerModels.StartResponse> startUpload(@Path("namespace") String namespace, @Path("organization_id") Integer organizationId, @Body FileStoragePartnerModels.StartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v1.0/organization/{organization_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePartnerModels.CompleteResponse> completeUpload(@Path("namespace") String namespace, @Path("organization_id") Integer organizationId, @Body FileStoragePartnerModels.StartResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<Object> browse(@Path("namespace") String namespace, @Path("organization_id") Integer organizationId, @Path("application_id") String applicationId, @Path("company_id") Integer companyId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);
}