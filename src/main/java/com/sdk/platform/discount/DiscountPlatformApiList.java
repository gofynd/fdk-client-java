package com.sdk.platform.discount;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface DiscountPlatformApiList {

    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    Call<DiscountPlatformModels.ListOrCalender> getDiscounts(@Path("company_id") String companyId, @Query("view") String view, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("archived") Boolean archived, @Query("month") Integer month, @Query("year") Integer year, @Query("type") String type, @Query("app_ids") List<String> appIds, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    Call<DiscountPlatformModels.DiscountJob> createDiscount(@Path("company_id") String companyId, @Body DiscountPlatformModels.CreateUpdateDiscount payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    Call<DiscountPlatformModels.DiscountJob> getDiscount(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    Call<DiscountPlatformModels.DiscountJob> updateDiscount(@Path("company_id") String companyId, @Path("id") String id, @Body DiscountPlatformModels.CreateUpdateDiscount payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/items/")
    Call<Object> upsertDiscountItems(@Path("company_id") String companyId, @Path("id") String id, @Body DiscountPlatformModels.BulkDiscount payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    Call<DiscountPlatformModels.FileJobResponse> validateDiscountFile(@Path("company_id") String companyId, @Query("discount") String discount, @Body DiscountPlatformModels.FileJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    Call<DiscountPlatformModels.FileJobResponse> downloadDiscountFile(@Path("company_id") String companyId, @Path("type") String type, @Body DiscountPlatformModels.DownloadFileJob payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    Call<DiscountPlatformModels.FileJobResponse> getValidationJob(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    Call<DiscountPlatformModels.CancelJobResponse> cancelValidationJob(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    Call<DiscountPlatformModels.FileJobResponse> getDownloadJob(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    Call<DiscountPlatformModels.CancelJobResponse> cancelDownloadJob(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);
}