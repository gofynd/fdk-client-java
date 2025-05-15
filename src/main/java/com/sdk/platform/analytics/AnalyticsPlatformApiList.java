package com.sdk.platform.analytics;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface AnalyticsPlatformApiList {

    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/execute")
    Call<AnalyticsPlatformModels.JobExecutionResult> executeJobForProvidedParametersV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body AnalyticsPlatformModels.JobExecute payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/download")
    Call<Object> startDownloadForQueryV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("export_type") String exportType, @Body AnalyticsPlatformModels.FileDownloadRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/insights/v2.0/company/{company_id}/application/{application_id}/job/{file_name}/status")
    Call<AnalyticsPlatformModels.JobStatus> checkJobStatusByNameV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("file_name") String fileName, @HeaderMap Map<String, String> requestHeaders);
}