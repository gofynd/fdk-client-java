package com.sdk.platform.analytics;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.PlatformConfig;







public class AnalyticsPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private AnalyticsPlatformApiList analyticsPlatformApiList;

    public AnalyticsPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.analyticsPlatformApiList = generateAnalyticsPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private AnalyticsPlatformApiList generateAnalyticsPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),AnalyticsPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.ExportJobRes createExportJob(String exportType ,AnalyticsPlatformModels.ExportJobReq body) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.ExportJobRes> response = null;
            try {
                response = analyticsPlatformApiList.createExportJob(this.companyId , exportType  , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.ExportJobStatusRes getExportJobStatus(String exportType , String jobId ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.ExportJobStatusRes> response = null;
            try {
                response = analyticsPlatformApiList.getExportJobStatus(this.companyId , exportType  , jobId  ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.GetLogsListRes getLogsList(String logType , Integer pageNo , Integer pageSize ,AnalyticsPlatformModels.GetLogsListReq body) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.GetLogsListRes> response = null;
            try {
                response = analyticsPlatformApiList.getLogsList(this.companyId , logType  ,pageNo , pageSize , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getLogsList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<AnalyticsPlatformModels.GetLogsListRes> getLogsListPagination(
        String logType ,
        Integer pageSize ,
        
        AnalyticsPlatformModels.GetLogsListReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<AnalyticsPlatformModels.GetLogsListRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            AnalyticsPlatformModels.GetLogsListRes callback = this.getLogsList(
                
                 
                 logType,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.SearchLogRes searchLogs(Integer pageNo , Integer pageSize , String logType ,AnalyticsPlatformModels.SearchLogReq body) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.SearchLogRes> response = null;
            try {
                response = analyticsPlatformApiList.searchLogs(this.companyId , logType  ,pageNo , pageSize , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for searchLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<AnalyticsPlatformModels.SearchLogRes> searchLogsPagination(
        Integer pageSize ,
        String logType ,
        
        AnalyticsPlatformModels.SearchLogReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<AnalyticsPlatformModels.SearchLogRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            AnalyticsPlatformModels.SearchLogRes callback = this.searchLogs(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 logType,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    




public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.StatsGroups getStatiscticsGroups() throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.StatsGroups> response = null;
            try {
            response = analyticsPlatformApiList.getStatiscticsGroups(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.StatsGroupComponents getStatiscticsGroupComponents(String groupName ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.StatsGroupComponents> response = null;
            try {
            response = analyticsPlatformApiList.getStatiscticsGroupComponents(this.companyId , this.applicationId , groupName ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getComponentStatsCSV(String componentName ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
            response = analyticsPlatformApiList.getComponentStatsCSV(this.companyId , this.applicationId , componentName ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getComponentStatsPDF(String componentName ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
            response = analyticsPlatformApiList.getComponentStatsPDF(this.companyId , this.applicationId , componentName ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.StatsRes getComponentStats(String componentName ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.StatsRes> response = null;
            try {
            response = analyticsPlatformApiList.getComponentStats(this.companyId , this.applicationId , componentName ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.AbandonCartsList getAbandonCartList(String fromDate , String toDate , Integer pageNo , Integer pageSize ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.AbandonCartsList> response = null;
            try {
            response = analyticsPlatformApiList.getAbandonCartList(this.companyId , this.applicationId , fromDate , toDate ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAbandonCartList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<AnalyticsPlatformModels.AbandonCartsList> getAbandonCartListPagination(
        String fromDate,
        String toDate,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<AnalyticsPlatformModels.AbandonCartsList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            AnalyticsPlatformModels.AbandonCartsList callback = this.getAbandonCartList(
                
                 
                 
                 fromDate,
                 toDate,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getAbandonCartsCSV(String fromDate , String toDate ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
            response = analyticsPlatformApiList.getAbandonCartsCSV(this.companyId , this.applicationId , fromDate , toDate ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AnalyticsPlatformModels.AbandonCartDetail getAbandonCartDetail(String cartId ) throws FDKException, FDKServerResponseError {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AnalyticsPlatformModels.AbandonCartDetail> response = null;
            try {
            response = analyticsPlatformApiList.getAbandonCartDetail(this.companyId , this.applicationId , cartId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}