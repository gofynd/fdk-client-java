package com.sdk.platform.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface FileStoragePlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    Call<FileStoragePlatformModels.StartResponse> startUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId ,@Body FileStoragePlatformModels.StartRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    Call<FileStoragePlatformModels.CompleteResponse> completeUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId ,@Body FileStoragePlatformModels.StartResponse payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start/")
    Call<FileStoragePlatformModels.StartResponse> appStartUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.StartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete/")
    Call<FileStoragePlatformModels.CompleteResponse> appCompleteUpload(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FileStoragePlatformModels.StartResponse payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls/")
    Call<FileStoragePlatformModels.SignUrlResponse> getSignUrls(@Path("company_id")  String companyId ,@Body FileStoragePlatformModels.SignUrlRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy/")
    Call<FileStoragePlatformModels.BulkUploadResponse> copyFiles(@Path("company_id")  String companyId , @Query("sync") Boolean  sync ,@Body FileStoragePlatformModels.BulkRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    Call<FileStoragePlatformModels.BulkUploadResponse> appCopyFiles(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("sync") Boolean  sync ,@Body FileStoragePlatformModels.BulkRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    Call<FileStoragePlatformModels.BrowseResponse> browse(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    Call<FileStoragePlatformModels.BrowseResponse> browse(@Path("namespace") String  namespace , @Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    Call<String> proxy(@Path("company_id")  String companyId , @Query("url") String  url );
    
}