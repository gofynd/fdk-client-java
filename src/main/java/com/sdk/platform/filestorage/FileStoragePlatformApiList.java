package com.sdk.platform.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStoragePlatformApiList {

    @POST ("/service/platform/assets/v2.0/company/{company_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.FileUpload> startUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Body FileStoragePlatformModels.FileUploadStart payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v2.0/company/{company_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.FileUploadComplete> completeUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Body FileStoragePlatformModels.FileUpload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v2.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.FileUpload> appStartUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.FileUploadStart payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v2.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.FileUploadComplete> appCompleteUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.FileUpload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls")
    Call<FileStoragePlatformModels.SignUrlResult> getSignUrls(@Path("company_id") String companyId, @Body FileStoragePlatformModels.SignUrl payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy")
    Call<Object> copyFiles(@Path("company_id") String companyId, @Query("sync") Boolean sync, @Body FileStoragePlatformModels.CopyFiles payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    Call<Object> browse(@Path("namespace") String namespace, @Path("company_id") String companyId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<Object> appbrowse(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page") Integer page, @Query("limit") Integer limit, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<Object> browsefiles(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page") Integer page, @Query("limit") Integer limit, @Query("search") String search, @Body FileStoragePlatformModels.ExtensionSlug payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    Call<FileStoragePlatformModels.ProxyFileAccess> proxy(@Path("company_id") String companyId, @Query("url") String url, @HeaderMap Map<String, String> requestHeaders);
}