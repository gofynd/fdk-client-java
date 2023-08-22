package com.sdk.platform.audittrail;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface AuditTrailPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/audit-trail/logs")
    Call<AuditTrailPlatformModels.LogSchemaResponse> getAuditLogs(@Path("company_id")  String companyId , @Query("qs") String  qs ,  @Query("limit") Integer  limit ,  @Query("sort") Object  sort );
    
    
    
    
    
    
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/audit-trail/logs")
    Call<AuditTrailPlatformModels.CreateLogResponse> createAuditLog(@Path("company_id")  String companyId ,@Body AuditTrailPlatformModels.RequestBodyAuditLog payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/audit-trail/logs/{id}")
    Call<AuditTrailPlatformModels.LogSchemaResponse> getAuditLog(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/audit-trail/entity-types")
    Call<AuditTrailPlatformModels.EntityTypesResponse> getEntityTypes(@Path("company_id")  String companyId );
    
}