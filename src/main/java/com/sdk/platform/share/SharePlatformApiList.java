package com.sdk.platform.share;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface SharePlatformApiList {

    @POST ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    Call<SharePlatformModels.ShortLinkRes> createShortLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body SharePlatformModels.ShortLinkReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    Call<SharePlatformModels.ShortLinkList> getShortLinks(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("created_by") String createdBy, @Query("active") String active, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{hash}/")
    Call<SharePlatformModels.ShortLinkRes> getShortLinkByHash(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("hash") String hash, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{id}/")
    Call<SharePlatformModels.ShortLinkRes> updateShortLinkById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body SharePlatformModels.ShortLinkReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/click-stats")
    Call<SharePlatformModels.ClickStatsResponse> getShortLinkClickStats(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("surl_id") String surlId, @HeaderMap Map<String, String> requestHeaders);
}