package com.sdk.platform.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStoragePlatformApiList {

    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.StartResponse> startUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Body FileStoragePlatformModels.StartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.CompleteResponse> completeUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Body FileStoragePlatformModels.StartResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.StartResponse> appStartUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.StartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.CompleteResponse> appCompleteUpload(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.StartResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls")
    Call<FileStoragePlatformModels.SignUrlResponse> getSignUrls(@Path("company_id") String companyId, @Body FileStoragePlatformModels.SignUrlRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy")
    Call<Object> copyFiles(@Path("company_id") String companyId, @Query("sync") Boolean sync, @Body FileStoragePlatformModels.CopyFiles payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy")
    Call<Object> appCopyFiles(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("sync") Boolean sync, @Body FileStoragePlatformModels.CopyFiles payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    Call<Object> browse(@Path("namespace") String namespace, @Path("company_id") String companyId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<Object> appbrowse(@Path("namespace") String namespace, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page") Integer page, @Query("limit") Integer limit, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    Call<String> proxy(@Path("company_id") String companyId, @Query("url") String url, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types")
    Call<FileStoragePlatformModels.InvoiceTypesResponse> getPdfTypes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper")
    Call<FileStoragePlatformModels.DummyTemplateDataItems> getDefaultPdfData(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("pdf_type_id") Integer pdfTypeId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config/{id}")
    Call<FileStoragePlatformModels.PdfConfigSaveSuccess> updateHtmlTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body FileStoragePlatformModels.PdfConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    Call<FileStoragePlatformModels.PdfConfigSuccess> getDefaultHtmlTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("pdf_type_id") Integer pdfTypeId, @Query("format") String format, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    Call<FileStoragePlatformModels.PdfConfigSaveSuccess> saveHtmlTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.PdfConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template")
    Call<FileStoragePlatformModels.PdfDefaultTemplateSuccess> getDefaultPdfTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("pdf_type_id") Integer pdfTypeId, @Query("format") String format, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/payment-receipt")
    Call<Object> generatePaymentReceipt(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body FileStoragePlatformModels.PaymentReceiptRequestBody payload, @HeaderMap Map<String, String> requestHeaders);
}