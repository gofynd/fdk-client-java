package com.sdk.platform.inventory;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface InventoryPlatformApiList {
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/slingshot")
    Call<InventoryPlatformModels.ResponseEnvelopeListSlingshotConfigurationDetail> getConfigByCompany(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/kafka/suppressStore")
    Call<InventoryPlatformModels.ResponseEnvelopeKafkaResponse> suppressStores(@Path("company_id")  String companyId ,@Body InventoryPlatformModels.SuppressStorePayload payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<InventoryPlatformModels.ResponseEnvelopeListJobConfigRawDTO> getJobsByCompany(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @PUT ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<InventoryPlatformModels.ResponseEnvelopeString> updateJob(@Path("company_id")  String companyId ,@Body InventoryPlatformModels.JobConfigDTO payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<InventoryPlatformModels.ResponseEnvelopeString> createJob(@Path("company_id")  String companyId ,@Body InventoryPlatformModels.JobConfigDTO payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/steps/{job_id}")
    Call<InventoryPlatformModels.ResponseEnvelopeListJobStepsDTO> getJobSteps(@Path("company_id")  String companyId , @Path("job_id") Integer  jobId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/integration/{integration_id}")
    Call<InventoryPlatformModels.ResponseEnvelopeListJobConfigDTO> getJobByCompanyAndIntegration(@Path("company_id")  String companyId , @Path("integration_id") String  integrationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/disable/integration/{integration_id}")
    Call<InventoryPlatformModels.ResponseEnvelopeString> disable(@Path("company_id")  String companyId , @Path("integration_id") String  integrationId );
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/defaults")
    Call<InventoryPlatformModels.ResponseEnvelopeJobConfigDTO> getJobConfigDefaults(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}")
    Call<InventoryPlatformModels.ResponseEnvelopeJobConfigDTO> getJobByCode(@Path("company_id")  String companyId , @Path("code") String  code );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}/metrics")
    Call<InventoryPlatformModels.ResponseEnvelopeJobMetricsDto> getJobCodeMetrics(@Path("company_id")  String companyId , @Path("code") String  code , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("status") String  status ,  @Query("date") String  date );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/integration/{integration_id}")
    Call<InventoryPlatformModels.ResponseEnvelopeListJobConfigListDTO> getJobCodesByCompanyAndIntegration(@Path("company_id")  String companyId , @Path("integration_id") String  integrationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
}