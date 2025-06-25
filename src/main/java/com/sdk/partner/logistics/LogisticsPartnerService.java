package com.sdk.partner.logistics;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;


public class LogisticsPartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private LogisticsPartnerApiList logisticsPartnerApiList;

    public LogisticsPartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.partnerConfig.getOrganizationId();
        this.logisticsPartnerApiList = generateLogisticsPartnerApiList(this.partnerConfig.getPersistentCookieStore());
    }

    private LogisticsPartnerApiList generateLogisticsPartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(partnerConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(partnerConfig.getDomain(),LogisticsPartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResponseItemData sampleFileServiceability(LogisticsPartnerModels.BulkRegionServiceabilityTatRequest body) throws FDKServerResponseError, FDKException {
        return this.sampleFileServiceability(body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResponseItemData sampleFileServiceability(LogisticsPartnerModels.BulkRegionServiceabilityTatRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionServiceabilityTatResponseItemData> response = null;
            try {
                response = logisticsPartnerApiList.sampleFileServiceability(this.organizationId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResponse getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId) throws FDKServerResponseError, FDKException {
        return this.getSampleFileServiceabilityStatus(pageNo, pageSize, batchId, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResponse getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionServiceabilityTatResponse> response = null;
            try {
                response = logisticsPartnerApiList.getSampleFileServiceabilityStatus(this.organizationId, pageNo, pageSize, batchId, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResponseItemData bulkTat(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobSerializer body) throws FDKServerResponseError, FDKException {
        return this.bulkTat(extensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResponseItemData bulkTat(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResponseItemData> response = null;
            try {
                response = logisticsPartnerApiList.bulkTat(this.organizationId, extensionId, schemeId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResponse getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkTat(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResponse getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResponse> response = null;
            try {
                response = logisticsPartnerApiList.getBulkTat(this.organizationId, extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResponseItemData bulkServiceability(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobSerializer body) throws FDKServerResponseError, FDKException {
        return this.bulkServiceability(extensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResponseItemData bulkServiceability(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResponseItemData> response = null;
            try {
                response = logisticsPartnerApiList.bulkServiceability(this.organizationId, extensionId, schemeId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResponse getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkServiceability(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResponse getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResponse> response = null;
            try {
                response = logisticsPartnerApiList.getBulkServiceability(this.organizationId, extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccount createCourierPartnerAccount(Integer companyId, LogisticsPartnerModels.CourierAccountRequestBody body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerAccount(companyId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccount createCourierPartnerAccount(Integer companyId, LogisticsPartnerModels.CourierAccountRequestBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccount> response = null;
            try {
                response = logisticsPartnerApiList.createCourierPartnerAccount(this.organizationId, companyId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CompanyCourierPartnerAccountListResponse getCourierPartnerAccounts(Integer companyId, Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccounts(companyId, pageNo, pageSize, stage, paymentMode, transportType, new HashMap<>());
    }

    public LogisticsPartnerModels.CompanyCourierPartnerAccountListResponse getCourierPartnerAccounts(Integer companyId, Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CompanyCourierPartnerAccountListResponse> response = null;
            try {
                response = logisticsPartnerApiList.getCourierPartnerAccounts(this.organizationId, companyId, pageNo, pageSize, stage, paymentMode, transportType, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccountResponse updateCourierPartnerAccount(Integer companyId, String accountId, LogisticsPartnerModels.CourierAccount body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerAccount(companyId, accountId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccountResponse updateCourierPartnerAccount(Integer companyId, String accountId, LogisticsPartnerModels.CourierAccount body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccountResponse> response = null;
            try {
                response = logisticsPartnerApiList.updateCourierPartnerAccount(this.organizationId, companyId, accountId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccountResponse getCourierPartnerAccount(Integer companyId, String accountId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccount(companyId, accountId, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccountResponse getCourierPartnerAccount(Integer companyId, String accountId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccountResponse> response = null;
            try {
                response = logisticsPartnerApiList.getCourierPartnerAccount(this.organizationId, companyId, accountId, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerSchemeModel createCourierPartnerScheme(LogisticsPartnerModels.CourierPartnerSchemeRequestModel body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerScheme(body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerSchemeModel createCourierPartnerScheme(LogisticsPartnerModels.CourierPartnerSchemeRequestModel body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerSchemeModel> response = null;
            try {
                response = logisticsPartnerApiList.createCourierPartnerScheme(this.organizationId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest updateCourierPartnerScheme(String schemeId, LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerScheme(schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest updateCourierPartnerScheme(String schemeId, LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerSchemeUpdateRequest> response = null;
            try {
                response = logisticsPartnerApiList.updateCourierPartnerScheme(this.organizationId, schemeId, body, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getCountries(onboarding, pageNo, pageSize, q, new HashMap<>());
    }

    public LogisticsPartnerModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.GetCountries> response = null;
            try {
                response = logisticsPartnerApiList.getCountries(this.organizationId, onboarding, pageNo, pageSize, q, requestHeaders).execute();
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
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}