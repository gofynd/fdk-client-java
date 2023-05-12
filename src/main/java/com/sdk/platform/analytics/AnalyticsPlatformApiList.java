package com.sdk.platform.analytics;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface AnalyticsPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group")
    Call<AnalyticsPlatformModels.StatsGroups> getStatiscticsGroups(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group/{group_name}")
    Call<AnalyticsPlatformModels.StatsGroupComponents> getStatiscticsGroupComponents(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("group_name") String  groupName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.csv")
    Call<String> getComponentStatsCSV(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("component_name") String  componentName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.pdf")
    Call<String> getComponentStatsPDF(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("component_name") String  componentName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}")
    Call<AnalyticsPlatformModels.StatsRes> getComponentStats(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("component_name") String  componentName );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/from/{from_date}/to/{to_date}/abandon-cart/")
    Call<AnalyticsPlatformModels.AbandonCartsList> getAbandonCartList(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("from_date") String  fromDate , @Path("to_date") String  toDate , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/{from_date}/to/{to_date}/abandon-cart.csv")
    Call<String> getAbandonCartsCSV(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("from_date") String  fromDate , @Path("to_date") String  toDate );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/abandon-cart/{cart_id}")
    Call<AnalyticsPlatformModels.AbandonCartDetail> getAbandonCartDetail(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("cart_id") String  cartId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}")
    Call<AnalyticsPlatformModels.ExportJobRes> createExportJob(@Path("company_id")  String companyId , @Path("export_type") String  exportType ,@Body AnalyticsPlatformModels.ExportJobReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}/job/{job_id}")
    Call<AnalyticsPlatformModels.ExportJobStatusRes> getExportJobStatus(@Path("company_id")  String companyId , @Path("export_type") String  exportType , @Path("job_id") String  jobId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}")
    Call<AnalyticsPlatformModels.GetLogsListRes> getLogsList(@Path("company_id")  String companyId , @Path("log_type") String  logType , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,@Body AnalyticsPlatformModels.GetLogsListReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}/search")
    Call<AnalyticsPlatformModels.SearchLogRes> searchLogs(@Path("company_id")  String companyId , @Path("log_type") String  logType , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,@Body AnalyticsPlatformModels.SearchLogReq payload);
    
}