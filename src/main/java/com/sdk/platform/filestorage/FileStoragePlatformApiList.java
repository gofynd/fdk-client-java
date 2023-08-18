package com.sdk.platform.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface FileStoragePlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.StartResponse> startUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId ,@Body FileStoragePlatformModels.StartRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.CompleteResponse> completeUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId ,@Body FileStoragePlatformModels.StartResponse payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start")
    Call<FileStoragePlatformModels.StartResponse> appStartUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.StartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete")
    Call<FileStoragePlatformModels.CompleteResponse> appCompleteUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.StartResponse payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls")
    Call<FileStoragePlatformModels.SignUrlResponse> getSignUrls(@Path("company_id")  String companyId ,@Body FileStoragePlatformModels.SignUrlRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy")
    Call<FileStoragePlatformModels.BulkUploadSyncMode> copyFiles(@Path("company_id")  String companyId , @Query("sync") Boolean  sync ,@Body FileStoragePlatformModels.CopyFiles payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy")
    Call<FileStoragePlatformModels.BulkUploadSyncMode> appCopyFiles(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("sync") Boolean  sync ,@Body FileStoragePlatformModels.CopyFiles payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse")
    Call<FileStoragePlatformModels.BrowseResponse> browse(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Query("page") Integer  page ,  @Query("limit") Integer  limit );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse")
    Call<FileStoragePlatformModels.BrowseResponse> appbrowse(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page") Integer  page ,  @Query("limit") Integer  limit );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy")
    Call<String> proxy(@Path("company_id")  String companyId , @Query("url") String  url );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/types")
    Call<List<FileStoragePlatformModels.InvoiceTypesResponse>> getPdfTypes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/mapper")
    Call<List<FileStoragePlatformModels.DummyTemplateDataItems>> getDefaultPdfData(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("pdf_type_id") Integer  pdfTypeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    Call<List<FileStoragePlatformModels.PdfConfigSuccess>> getDefaultHtmlTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("pdf_type_id") Integer  pdfTypeId ,  @Query("format") String  format );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/config")
    Call<List<FileStoragePlatformModels.PdfConfigSaveSuccess>> saveHtmlTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.pdfConfig payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/render")
    Call<String> previewTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.pdfRender payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/pdf/default-template")
    Call<List<FileStoragePlatformModels.PdfDefaultTemplateSuccess>> getDefaultPdfTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("pdf_type_id") Integer  pdfTypeId ,  @Query("format") String  format );
    
}