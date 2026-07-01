package com.sdk.platform.audittrail;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface AuditTrailPlatformApiList {

    @POST ("/service/platform/webhook/v1.0/company/{company_id}/audit/logs/create")
    Call<AuditTrailPlatformModels.CreateLogResp> createAuditLog(@Path("company_id") String companyId, @Body AuditTrailPlatformModels.RequestBodyAuditLog payload, @HeaderMap Map<String, String> requestHeaders);
}