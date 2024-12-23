package com.sdk.partner.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStoragePartnerApiList {

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/namespaces")
    Call<FileStoragePartnerModels.AllNamespaceDetails> getAllNamespaceDetails(@Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/namespaces/{namespace}")
    Call<FileStoragePartnerModels.NamespaceDetails> getNamespaceDetail(@Path("namespace") String namespace, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v2.0/organization/{organization_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePartnerModels.FileUploadComplete> completeUpload(@Path("namespace") String namespace, @Path("organization_id") String organizationId, @Body FileStoragePartnerModels.FileUpload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v2.0/organization/{organization_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePartnerModels.FileUpload> startUpload(@Path("namespace") String namespace, @Path("organization_id") String organizationId, @Body FileStoragePartnerModels.FileUploadStart payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<Object> browse(@Path("namespace") String namespace, @Path("organization_id") String organizationId, @Path("application_id") String applicationId, @Path("company_id") Integer companyId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/namespaces/{namespace}/browse")
    Call<Object> browseFiles(@Path("namespace") String namespace, @Path("organization_id") String organizationId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/proxy/fetch")
    Call<FileStoragePartnerModels.FetchProxyDetails> organizationLevelFetchProxy(@Path("organization_id") String organizationId, @Path("application_id") String applicationId, @Path("company_id") Integer companyId, @Query("url") String url, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/proxy/fetch")
    Call<FileStoragePartnerModels.SaveProxy> saveOrganizationLevelProxy(@Path("organization_id") String organizationId, @Path("application_id") String applicationId, @Path("company_id") Integer companyId, @Body FileStoragePartnerModels.ProxyFile payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/assets/v1.0/organization/{organization_id}/proxy/fetch")
    Call<FileStoragePartnerModels.FetchProxyDetails> fetchProxy(@Path("organization_id") String organizationId, @Query("url") String url, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v1.0/organization/{organization_id}/proxy/fetch")
    Call<FileStoragePartnerModels.SaveProxy> saveProxyDetails(@Path("organization_id") String organizationId, @Body FileStoragePartnerModels.ProxyFile payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/assets/v1.0/organization/{organization_id}/sign-urls")
    Call<FileStoragePartnerModels.SignUrlResult> signUrls(@Path("organization_id") String organizationId, @Body FileStoragePartnerModels.SignUrl payload, @HeaderMap Map<String, String> requestHeaders);
}