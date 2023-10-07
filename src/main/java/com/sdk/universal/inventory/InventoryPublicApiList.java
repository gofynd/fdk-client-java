package com.sdk.universal.inventory;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface InventoryPublicApiList {

    @GET ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<InventoryPublicModels.ResponseEnvelopeObject> getJobCodesMetrics(@Query("daily_job") Boolean dailyJob, @Query("job_code") String jobCode, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<InventoryPublicModels.ResponseEnvelopeEmailJobMetrics> saveJobCodesMetrics(@Body InventoryPublicModels.EmailJobMetrics payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/common/inventory/v1.0/company/slingshot")
    Call<InventoryPublicModels.ResponseEnvelopeSlingshotConfigurationDetail> getConfigByApiKey(@Query("apikey") String apikey, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/common/inventory/v1.0/company/slingshot/apikey")
    Call<InventoryPublicModels.ResponseEnvelopeApikeyModel> getApiKey(@Query("user_name") String userName, @Query("password") String password, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/common/inventory/v1.0/company/jobs/code/{code}")
    Call<InventoryPublicModels.ResponseEnvelopeJobConfigDTO> getJobByCode(@Path("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/common/inventory/v1.0/company/job/config")
    Call<InventoryPublicModels.ResponseEnvelopeListJobConfigDTO> getJobConfigByIntegrationType(@Query("integration_type") String integrationType, @Query("disable") Boolean disable, @HeaderMap Map<String, String> requestHeaders);
}