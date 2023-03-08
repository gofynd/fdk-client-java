package com.sdk.platform.documentengine;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface DocumentEnginePlatformApiList {
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-package-label")
    Call<DocumentEnginePlatformModels.SuccessResponseGenerateBulk> generateBulkPackageLabel(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.GenerateBulkPackageLabel payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-box-label")
    Call<DocumentEnginePlatformModels.SuccessResponseGenerateBulk> generateBulkBoxLabel(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.GenerateBulkBoxLabel payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-bulk-shipment-label")
    Call<DocumentEnginePlatformModels.SuccessResponseGenerateBulk> generateBulkShipmentLabel(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.GenerateBulkShipmentLabel payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/generate-noc")
    Call<DocumentEnginePlatformModels.SuccessResponseGenerateBulk> generateNoc(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.GenerateNoc payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-label-list")
    Call<DocumentEnginePlatformModels.StatusSuccessResponse> getLabelStatus(@Path("company_id")  String companyId , @Query("uid") String  uid );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-noc-status")
    Call<DocumentEnginePlatformModels.StatusSuccessResponse> getNocStatus(@Path("company_id")  String companyId , @Query("uid") String  uid );
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v1.0/company/{company_id}/get-single-presigned-url")
    Call<DocumentEnginePlatformModels.SignedSuccessResponse> getPresignedURL(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.InvoiceLabelPresignedRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-label-presigned-url")
    Call<DocumentEnginePlatformModels.SignedSuccessResponse> getLabelPresignedURL(@Path("company_id")  String companyId , @Query("uid") String  uid );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/document/v1.0/company/{company_id}/get-noc-presigned-url")
    Call<DocumentEnginePlatformModels.SignedSuccessResponse> getNocPresignedURL(@Path("company_id")  String companyId , @Query("uid") String  uid );
    
    
    
    
    
    
    
    @POST ("/service/platform/document/v2.0/company/{company_id}/pos/generate-receipt")
    Call<DocumentEnginePlatformModels.SuccessResponseGeneratePOSReceipts> generatePOSReceipts(@Path("company_id")  String companyId ,@Body DocumentEnginePlatformModels.GeneratePOSReceipts payload);
    
}