package com.sdk.platform.audittrail;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface AuditTrailPlatformApiList {

    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    Call<AuditTrailPlatformModels.LogSchemaResponse> getAuditLogs(@Path("company_id") String companyId, @Query("qs") String qs, @Query("limit") Integer limit, @Query("sort") Object sort, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/")
    Call<AuditTrailPlatformModels.CreateLogResponse> createAuditLog(@Path("company_id") String companyId, @Body AuditTrailPlatformModels.RequestBodyAuditLog payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/logs/{id}")
    Call<AuditTrailPlatformModels.LogSchemaResponse> getAuditLog(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/audit-trail/v1.0/company/{company_id}/entity-types")
    Call<AuditTrailPlatformModels.EntityTypesResponse> getEntityTypes(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);
}