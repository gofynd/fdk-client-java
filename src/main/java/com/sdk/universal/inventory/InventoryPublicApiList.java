package com.sdk.universal.inventory;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface InventoryPublicApiList {
    
    @GET ("/service/common/inventory/v1.0/company/job/config")
    Call<InventoryPublicModels.ResponseEnvelopeListJobConfigDTO> getJobConfigByIntegrationType(@Query("integration_type") String integrationType , @Query("disable") Boolean disable );
    
    @GET ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<InventoryPublicModels.ResponseEnvelopeObject> getJobCodesMetrics(@Query("daily_job") Boolean dailyJob , @Query("job_code") String jobCode );
    
    @POST ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<InventoryPublicModels.ResponseEnvelopeEmailJobMetrics> saveJobCodesMetrics(@Body InventoryPublicModels.EmailJobMetrics payload);
    
}