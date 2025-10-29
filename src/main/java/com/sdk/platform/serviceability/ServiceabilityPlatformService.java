package com.sdk.platform.serviceability;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class ServiceabilityPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ServiceabilityPlatformApiList serviceabilityPlatformApiList;

    public ServiceabilityPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.serviceabilityPlatformApiList = generateServiceabilityPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ServiceabilityPlatformApiList generateServiceabilityPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ServiceabilityPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountDetailsBody createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccountDetailsBody body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerAccount(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountDetailsBody createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccountDetailsBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountDetailsBody> response = null;
            try {
                response = serviceabilityPlatformApiList.createCourierPartnerAccount(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, List<String> accountIds, Boolean selfShip, Boolean ownAccount, String q) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccounts(pageNo, pageSize, stage, paymentMode, transportType, accountIds, selfShip, ownAccount, q, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, List<String> accountIds, Boolean selfShip, Boolean ownAccount, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerAccounts(this.companyId, pageNo, pageSize, stage, paymentMode, transportType, accountIds, selfShip, ownAccount, q, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountDetailsBody updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccountDetailsBody body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerAccount(accountId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountDetailsBody updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccountDetailsBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountDetailsBody> response = null;
            try {
                response = serviceabilityPlatformApiList.updateCourierPartnerAccount(this.companyId, accountId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountResult getCourierPartnerAccount(String accountId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccount(accountId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountResult getCourierPartnerAccount(String accountId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerAccount(this.companyId, accountId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyConfig updateCompanyConfiguration(String fulfillmentOptionSlug, ServiceabilityPlatformModels.CompanyConfigurationSchema body) throws FDKServerResponseError, FDKException {
        return this.updateCompanyConfiguration(fulfillmentOptionSlug, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyConfig updateCompanyConfiguration(String fulfillmentOptionSlug, ServiceabilityPlatformModels.CompanyConfigurationSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyConfig> response = null;
            try {
                response = serviceabilityPlatformApiList.updateCompanyConfiguration(this.companyId, fulfillmentOptionSlug, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyConfig getCompanyConfiguration() throws FDKServerResponseError, FDKException {
        return this.getCompanyConfiguration(new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyConfig getCompanyConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyConfig> response = null;
            try {
                response = serviceabilityPlatformApiList.getCompanyConfiguration(this.companyId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResultItemData bulkTat(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobDetails body) throws FDKServerResponseError, FDKException {
        return this.bulkTat(extensionId, schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResultItemData bulkTat(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResultItemData> response = null;
            try {
                response = serviceabilityPlatformApiList.bulkTat(this.companyId, extensionId, schemeId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResult getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkTat(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResult getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getBulkTat(this.companyId, extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResultItemData bulkServiceability(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobDetails body) throws FDKServerResponseError, FDKException {
        return this.bulkServiceability(extensionId, schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResultItemData bulkServiceability(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResultItemData> response = null;
            try {
                response = serviceabilityPlatformApiList.bulkServiceability(this.companyId, extensionId, schemeId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResult getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkServiceability(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResult getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getBulkServiceability(this.companyId, extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResult createPackageMaterial(Integer pageNo, ServiceabilityPlatformModels.PackageMaterial body) throws FDKServerResponseError, FDKException {
        return this.createPackageMaterial(pageNo, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResult createPackageMaterial(Integer pageNo, ServiceabilityPlatformModels.PackageMaterial body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResult> response = null;
            try {
                response = serviceabilityPlatformApiList.createPackageMaterial(this.companyId, pageNo, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackagesListResult getPackageMaterialList(Integer pageNo, Integer pageSize, String q, String size, String packageType) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterialList(pageNo, pageSize, q, size, packageType, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackagesListResult getPackageMaterialList(Integer pageNo, Integer pageSize, String q, String size, String packageType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackagesListResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getPackageMaterialList(this.companyId, pageNo, pageSize, q, size, packageType, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResult createPackageMaterialRule(ServiceabilityPlatformModels.PackageRule body) throws FDKServerResponseError, FDKException {
        return this.createPackageMaterialRule(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResult createPackageMaterialRule(ServiceabilityPlatformModels.PackageRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResult> response = null;
            try {
                response = serviceabilityPlatformApiList.createPackageMaterialRule(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResult getPackageMaterialRule(String ruleId) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterialRule(ruleId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResult getPackageMaterialRule(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getPackageMaterialRule(this.companyId, ruleId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResult updatePackageMaterialRule(String ruleId, ServiceabilityPlatformModels.PackageRule body) throws FDKServerResponseError, FDKException {
        return this.updatePackageMaterialRule(ruleId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResult updatePackageMaterialRule(String ruleId, ServiceabilityPlatformModels.PackageRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResult> response = null;
            try {
                response = serviceabilityPlatformApiList.updatePackageMaterialRule(this.companyId, ruleId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResult updatePackageMaterials(String packageMaterialId, ServiceabilityPlatformModels.PackageMaterial body) throws FDKServerResponseError, FDKException {
        return this.updatePackageMaterials(packageMaterialId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResult updatePackageMaterials(String packageMaterialId, ServiceabilityPlatformModels.PackageMaterial body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResult> response = null;
            try {
                response = serviceabilityPlatformApiList.updatePackageMaterials(this.companyId, packageMaterialId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageItem getPackageMaterials(String packageMaterialId) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterials(packageMaterialId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageItem getPackageMaterials(String packageMaterialId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageItem> response = null;
            try {
                response = serviceabilityPlatformApiList.getPackageMaterials(this.companyId, packageMaterialId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.OptimalLocationsResult getOptimalLocations(ServiceabilityPlatformModels.OptimlLocationsRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.getOptimalLocations(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.OptimalLocationsResult getOptimalLocations(ServiceabilityPlatformModels.OptimlLocationsRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.OptimalLocationsResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getOptimalLocations(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema createCourierPartnerScheme(ServiceabilityPlatformModels.CourierPartnerSchemeDetailsModel body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerScheme(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema createCourierPartnerScheme(ServiceabilityPlatformModels.CourierPartnerSchemeDetailsModel body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.createCourierPartnerScheme(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerSchemeList getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds, String q) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerSchemes(schemeType, paymentMode, capabilities, schemeIds, q, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerSchemeList getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerSchemeList> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerSchemes(this.companyId, schemeType, paymentMode, capabilities, schemeIds, q, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema updateCourierPartnerScheme(String schemeId, ServiceabilityPlatformModels.CourierPartnerSchemeUpdateDetailsSchema body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerScheme(schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema updateCourierPartnerScheme(String schemeId, ServiceabilityPlatformModels.CourierPartnerSchemeUpdateDetailsSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.updateCourierPartnerScheme(schemeId, this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema getCourierPartnerScheme(String schemeId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerScheme(schemeId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema getCourierPartnerScheme(String schemeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerSchemeModelSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerScheme(schemeId, this.companyId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionServiceabilityTatResultItemData sampleFileServiceability(ServiceabilityPlatformModels.BulkRegionServiceabilityTatDetails body) throws FDKServerResponseError, FDKException {
        return this.sampleFileServiceability(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionServiceabilityTatResultItemData sampleFileServiceability(ServiceabilityPlatformModels.BulkRegionServiceabilityTatDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionServiceabilityTatResultItemData> response = null;
            try {
                response = serviceabilityPlatformApiList.sampleFileServiceability(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionServiceabilityTatResult getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId) throws FDKServerResponseError, FDKException {
        return this.getSampleFileServiceabilityStatus(pageNo, pageSize, batchId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionServiceabilityTatResult getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionServiceabilityTatResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getSampleFileServiceabilityStatus(this.companyId, pageNo, pageSize, batchId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy) throws FDKServerResponseError, FDKException {
        return this.getCountries(onboard, pageNo, pageSize, q, hierarchy, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetCountries> response = null;
            try {
                response = serviceabilityPlatformApiList.getCountries(this.companyId, onboard, pageNo, pageSize, q, hierarchy, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.InstallCourierPartnerResponseSchema getInstalledCourierPartnerExtensions(Integer pageNo, Integer pageSize, String isInstalled) throws FDKServerResponseError, FDKException {
        return this.getInstalledCourierPartnerExtensions(pageNo, pageSize, isInstalled, new HashMap<>());
    }

    public ServiceabilityPlatformModels.InstallCourierPartnerResponseSchema getInstalledCourierPartnerExtensions(Integer pageNo, Integer pageSize, String isInstalled, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.InstallCourierPartnerResponseSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.getInstalledCourierPartnerExtensions(this.companyId, pageNo, pageSize, isInstalled, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.SelfshipSchema getSelfShipDetails() throws FDKServerResponseError, FDKException {
        return this.getSelfShipDetails(new HashMap<>());
    }

    public ServiceabilityPlatformModels.SelfshipSchema getSelfShipDetails(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.SelfshipSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.getSelfShipDetails(this.companyId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.SelfshipSchema updateSelfShipDetails(ServiceabilityPlatformModels.SelfshipSchema body) throws FDKServerResponseError, FDKException {
        return this.updateSelfShipDetails(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.SelfshipSchema updateSelfShipDetails(ServiceabilityPlatformModels.SelfshipSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.SelfshipSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.updateSelfShipDetails(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public ServiceabilityPlatformModels.ZoneSchema createZone(ServiceabilityPlatformModels.CreateZoneDataSchema body) throws FDKServerResponseError, FDKException {
        return this.createZone(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneSchema createZone(ServiceabilityPlatformModels.CreateZoneDataSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.createZone(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ListViewSchema getZones(String stage, Integer pageSize, Integer pageNo, String fulfillmentOptionSlug, Boolean isActive, String q, String countryIsoCode, String pincode, String state, String city, String sector) throws FDKServerResponseError, FDKException {
        return this.getZones(stage, pageSize, pageNo, fulfillmentOptionSlug, isActive, q, countryIsoCode, pincode, state, city, sector, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ListViewSchema getZones(String stage, Integer pageSize, Integer pageNo, String fulfillmentOptionSlug, Boolean isActive, String q, String countryIsoCode, String pincode, String state, String city, String sector, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ListViewSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.getZones(this.companyId, this.applicationId, stage, pageSize, pageNo, fulfillmentOptionSlug, isActive, q, countryIsoCode, pincode, state, city, sector, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GetZoneByIdSchema getZone(String zoneId) throws FDKServerResponseError, FDKException {
        return this.getZone(zoneId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetZoneByIdSchema getZone(String zoneId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetZoneByIdSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.getZone(this.companyId, zoneId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ZoneUpdateSuccessResult updateZone(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body) throws FDKServerResponseError, FDKException {
        return this.updateZone(zoneId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneUpdateSuccessResult updateZone(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneUpdateSuccessResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateZone(this.companyId, zoneId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ZoneDeleteSuccessResult deleteZone(String zoneId) throws FDKServerResponseError, FDKException {
        return this.deleteZone(zoneId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneDeleteSuccessResult deleteZone(String zoneId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneDeleteSuccessResult> response = null;
            try {
            response = serviceabilityPlatformApiList.deleteZone(this.companyId, zoneId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ZoneBulkExport createBulkExport(ServiceabilityPlatformModels.BulkCreateZoneExport body) throws FDKServerResponseError, FDKException {
        return this.createBulkExport(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneBulkExport createBulkExport(ServiceabilityPlatformModels.BulkCreateZoneExport body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneBulkExport> response = null;
            try {
            response = serviceabilityPlatformApiList.createBulkExport(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GetZoneBulkExport getBulkExport(String batchId) throws FDKServerResponseError, FDKException {
        return this.getBulkExport(batchId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetZoneBulkExport getBulkExport(String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetZoneBulkExport> response = null;
            try {
            response = serviceabilityPlatformApiList.getBulkExport(this.companyId, this.applicationId, batchId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaResponseBody createGeoArea(ServiceabilityPlatformModels.GeoAreaRequestBody body) throws FDKServerResponseError, FDKException {
        return this.createGeoArea(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaResponseBody createGeoArea(ServiceabilityPlatformModels.GeoAreaRequestBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaResponseBody> response = null;
            try {
            response = serviceabilityPlatformApiList.createGeoArea(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaGetResponseBody getGeoAreas(Integer pageSize, Boolean isActive, Integer pageNo, String type, String q, String countryIsoCode, String state, String city, String pincode, String sector) throws FDKServerResponseError, FDKException {
        return this.getGeoAreas(pageSize, isActive, pageNo, type, q, countryIsoCode, state, city, pincode, sector, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaGetResponseBody getGeoAreas(Integer pageSize, Boolean isActive, Integer pageNo, String type, String q, String countryIsoCode, String state, String city, String pincode, String sector, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaGetResponseBody> response = null;
            try {
            response = serviceabilityPlatformApiList.getGeoAreas(this.applicationId, this.companyId, pageSize, isActive, pageNo, type, q, countryIsoCode, state, city, pincode, sector, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaDetails getGeoArea(String geoareaId) throws FDKServerResponseError, FDKException {
        return this.getGeoArea(geoareaId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaDetails getGeoArea(String geoareaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaDetails> response = null;
            try {
            response = serviceabilityPlatformApiList.getGeoArea(this.companyId, geoareaId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaPutResponseBody updateGeoArea(String geoareaId, ServiceabilityPlatformModels.GeoAreaRequestBody body) throws FDKServerResponseError, FDKException {
        return this.updateGeoArea(geoareaId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaPutResponseBody updateGeoArea(String geoareaId, ServiceabilityPlatformModels.GeoAreaRequestBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaPutResponseBody> response = null;
            try {
            response = serviceabilityPlatformApiList.updateGeoArea(this.companyId, geoareaId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.BulkGeoAreaResult createBulkGeoArea(ServiceabilityPlatformModels.BulkGeoAreaDetails body) throws FDKServerResponseError, FDKException {
        return this.createBulkGeoArea(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkGeoAreaResult createBulkGeoArea(ServiceabilityPlatformModels.BulkGeoAreaDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkGeoAreaResult> response = null;
            try {
            response = serviceabilityPlatformApiList.createBulkGeoArea(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.BulkGeoAreaGetResult getBulkGeoArea(String geoareaId) throws FDKServerResponseError, FDKException {
        return this.getBulkGeoArea(geoareaId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkGeoAreaGetResult getBulkGeoArea(String geoareaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkGeoAreaGetResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getBulkGeoArea(this.companyId, this.applicationId, geoareaId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.BulkGeoAreaResult updateBulkGeoArea(String geoareaId, ServiceabilityPlatformModels.BulkGeoAreaDetails body) throws FDKServerResponseError, FDKException {
        return this.updateBulkGeoArea(geoareaId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkGeoAreaResult updateBulkGeoArea(String geoareaId, ServiceabilityPlatformModels.BulkGeoAreaDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkGeoAreaResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateBulkGeoArea(this.companyId, this.applicationId, geoareaId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaBulkCreationResult createGeoAreaExportJob(String geoareaId) throws FDKServerResponseError, FDKException {
        return this.createGeoAreaExportJob(geoareaId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaBulkCreationResult createGeoAreaExportJob(String geoareaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaBulkCreationResult> response = null;
            try {
            response = serviceabilityPlatformApiList.createGeoAreaExportJob(this.companyId, this.applicationId, geoareaId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GeoAreaBulkExportResult getGeoAreaExportJobStatus(String geoareaId) throws FDKServerResponseError, FDKException {
        return this.getGeoAreaExportJobStatus(geoareaId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GeoAreaBulkExportResult getGeoAreaExportJobStatus(String geoareaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GeoAreaBulkExportResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getGeoAreaExportJobStatus(this.companyId, this.applicationId, geoareaId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PincodeMOPResult updatePincodeMopView(ServiceabilityPlatformModels.PincodeMopData body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeMopView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeMOPResult updatePincodeMopView(ServiceabilityPlatformModels.PincodeMopData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeMOPResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeMopView(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PincodeBulkViewResult updatePincodeBulkView(ServiceabilityPlatformModels.PincodeMopBulkData body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeBulkView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeBulkViewResult updatePincodeBulkView(ServiceabilityPlatformModels.PincodeMopBulkData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeBulkViewResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeBulkView(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PincodeCodStatusListingResult updatePincodeCoDListing(Integer pageNumber, Integer pageSize, ServiceabilityPlatformModels.PincodeCodStatusListingDetails body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeCoDListing(pageNumber, pageSize, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeCodStatusListingResult updatePincodeCoDListing(Integer pageNumber, Integer pageSize, ServiceabilityPlatformModels.PincodeCodStatusListingDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeCodStatusListingResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeCoDListing(this.companyId, this.applicationId, pageNumber, pageSize, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResultData updatePincodeAuditHistory(Integer pageNumber, Integer pageSize, ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryDetails body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeAuditHistory(pageNumber, pageSize, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResultData updatePincodeAuditHistory(Integer pageNumber, Integer pageSize, ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResultData> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeAuditHistory(this.companyId, this.applicationId, pageNumber, pageSize, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRuleResult updateCourierRule(String ruleUid, ServiceabilityPlatformModels.CourierPartnerRule body) throws FDKServerResponseError, FDKException {
        return this.updateCourierRule(ruleUid, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRuleResult updateCourierRule(String ruleUid, ServiceabilityPlatformModels.CourierPartnerRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRuleResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateCourierRule(this.companyId, this.applicationId, ruleUid, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRuleResult getCourierPartnerRule(String ruleUid) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerRule(ruleUid, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRuleResult getCourierPartnerRule(String ruleUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRuleResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getCourierPartnerRule(this.companyId, this.applicationId, ruleUid, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRuleResult createCourierPartnerRule(ServiceabilityPlatformModels.CourierPartnerRule body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerRule(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRuleResult createCourierPartnerRule(ServiceabilityPlatformModels.CourierPartnerRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRuleResult> response = null;
            try {
            response = serviceabilityPlatformApiList.createCourierPartnerRule(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRulesListResult getCourierPartnerRules(Integer pageNo, Integer pageSize, String status) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerRules(pageNo, pageSize, status, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRulesListResult getCourierPartnerRules(Integer pageNo, Integer pageSize, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRulesListResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getCourierPartnerRules(this.companyId, this.applicationId, pageNo, pageSize, status, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ShipmentCourierPartnerResult getCourierPartners(ServiceabilityPlatformModels.ShipmentCourierPartnerDetails body) throws FDKServerResponseError, FDKException {
        return this.getCourierPartners(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ShipmentCourierPartnerResult getCourierPartners(ServiceabilityPlatformModels.ShipmentCourierPartnerDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ShipmentCourierPartnerResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getCourierPartners(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationConfigPut updateApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfigPutDetail body) throws FDKServerResponseError, FDKException {
        return this.updateApplicationConfiguration(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationConfigPut updateApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfigPutDetail body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationConfigPut> response = null;
            try {
            response = serviceabilityPlatformApiList.updateApplicationConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationConfigGetResult getApplicationConfiguration() throws FDKServerResponseError, FDKException {
        return this.getApplicationConfiguration(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationConfigGetResult getApplicationConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationConfigGetResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getApplicationConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationConfigPatchResult patchApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfigPatch body) throws FDKServerResponseError, FDKException {
        return this.patchApplicationConfiguration(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationConfigPatchResult patchApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfigPatch body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationConfigPatchResult> response = null;
            try {
            response = serviceabilityPlatformApiList.patchApplicationConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleConfigData getApplicationConfig() throws FDKServerResponseError, FDKException {
        return this.getApplicationConfig(new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleConfigData getApplicationConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleConfigData> response = null;
            try {
            response = serviceabilityPlatformApiList.getApplicationConfig(this.companyId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleConfigData insertApplicationConfig(ServiceabilityPlatformModels.StoreRuleConfigData body) throws FDKServerResponseError, FDKException {
        return this.insertApplicationConfig(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleConfigData insertApplicationConfig(ServiceabilityPlatformModels.StoreRuleConfigData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleConfigData> response = null;
            try {
            response = serviceabilityPlatformApiList.insertApplicationConfig(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleConfigData updateStoreRulesConfig(ServiceabilityPlatformModels.StoreRuleConfigData body) throws FDKServerResponseError, FDKException {
        return this.updateStoreRulesConfig(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleConfigData updateStoreRulesConfig(ServiceabilityPlatformModels.StoreRuleConfigData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleConfigData> response = null;
            try {
            response = serviceabilityPlatformApiList.updateStoreRulesConfig(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GetStoreRulesApiResult getStoreRules(Integer pageNo, Integer pageSize, String status) throws FDKServerResponseError, FDKException {
        return this.getStoreRules(pageNo, pageSize, status, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetStoreRulesApiResult getStoreRules(Integer pageNo, Integer pageSize, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetStoreRulesApiResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getStoreRules(this.companyId, this.applicationId, pageNo, pageSize, status, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleResultSchema createStoreRules(ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema body) throws FDKServerResponseError, FDKException {
        return this.createStoreRules(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleResultSchema createStoreRules(ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleResultSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.createStoreRules(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleDataSchema getStoreRule(String ruleUid) throws FDKServerResponseError, FDKException {
        return this.getStoreRule(ruleUid, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleDataSchema getStoreRule(String ruleUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleDataSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.getStoreRule(this.companyId, this.applicationId, ruleUid, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.StoreRuleUpdateResultSchema updateStoreRules(String ruleUid, ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema body) throws FDKServerResponseError, FDKException {
        return this.updateStoreRules(ruleUid, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleUpdateResultSchema updateStoreRules(String ruleUid, ServiceabilityPlatformModels.CreateStoreRuleDetailsSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleUpdateResultSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.updateStoreRules(this.companyId, this.applicationId, ruleUid, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.RulePriorityResult updateCourierPartnerRulePriority(ServiceabilityPlatformModels.RulePriorityDetails body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerRulePriority(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.RulePriorityResult updateCourierPartnerRulePriority(ServiceabilityPlatformModels.RulePriorityDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.RulePriorityResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateCourierPartnerRulePriority(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.RulePriorityResult updateStoreRulePriority(ServiceabilityPlatformModels.RulePriorityDetails body) throws FDKServerResponseError, FDKException {
        return this.updateStoreRulePriority(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.RulePriorityResult updateStoreRulePriority(ServiceabilityPlatformModels.RulePriorityDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.RulePriorityResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateStoreRulePriority(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public String downloadGeoareaSampleFile() throws FDKServerResponseError, FDKException {
        return this.downloadGeoareaSampleFile(new HashMap<>());
    }

    public String downloadGeoareaSampleFile(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
            response = serviceabilityPlatformApiList.downloadGeoareaSampleFile(this.companyId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOption createFulfillmentOption(ServiceabilityPlatformModels.FulfillmentOption body) throws FDKServerResponseError, FDKException {
        return this.createFulfillmentOption(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOption createFulfillmentOption(ServiceabilityPlatformModels.FulfillmentOption body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOption> response = null;
            try {
            response = serviceabilityPlatformApiList.createFulfillmentOption(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionsList getFulfillmentOptionsList(String productSlug, Integer storeId, String status) throws FDKServerResponseError, FDKException {
        return this.getFulfillmentOptionsList(productSlug, storeId, status, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionsList getFulfillmentOptionsList(String productSlug, Integer storeId, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionsList> response = null;
            try {
            response = serviceabilityPlatformApiList.getFulfillmentOptionsList(this.companyId, this.applicationId, productSlug, storeId, status, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOption getFulfillmentOptions(String slug, Integer productId, Integer storeId) throws FDKServerResponseError, FDKException {
        return this.getFulfillmentOptions(slug, productId, storeId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOption getFulfillmentOptions(String slug, Integer productId, Integer storeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOption> response = null;
            try {
            response = serviceabilityPlatformApiList.getFulfillmentOptions(this.companyId, this.applicationId, slug, productId, storeId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.OperationResponseSchema deleteFulfillmentOptions(String slug) throws FDKServerResponseError, FDKException {
        return this.deleteFulfillmentOptions(slug, new HashMap<>());
    }

    public ServiceabilityPlatformModels.OperationResponseSchema deleteFulfillmentOptions(String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.OperationResponseSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.deleteFulfillmentOptions(this.companyId, this.applicationId, slug, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOption putFulfillmentOption(String slug, ServiceabilityPlatformModels.FulfillmentOption body) throws FDKServerResponseError, FDKException {
        return this.putFulfillmentOption(slug, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOption putFulfillmentOption(String slug, ServiceabilityPlatformModels.FulfillmentOption body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOption> response = null;
            try {
            response = serviceabilityPlatformApiList.putFulfillmentOption(this.companyId, this.applicationId, slug, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionProducts getFulfillmentOptionProducts(String slug, String q, Integer storeId) throws FDKServerResponseError, FDKException {
        return this.getFulfillmentOptionProducts(slug, q, storeId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionProducts getFulfillmentOptionProducts(String slug, String q, Integer storeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionProducts> response = null;
            try {
            response = serviceabilityPlatformApiList.getFulfillmentOptionProducts(this.companyId, this.applicationId, slug, q, storeId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionStores getFulfillmentOptionStores(String slug, String q) throws FDKServerResponseError, FDKException {
        return this.getFulfillmentOptionStores(slug, q, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionStores getFulfillmentOptionStores(String slug, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionStores> response = null;
            try {
            response = serviceabilityPlatformApiList.getFulfillmentOptionStores(this.companyId, this.applicationId, slug, q, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionBulkData uploadBulkFulfillmentOptions(ServiceabilityPlatformModels.FulfillmentOptionBulk body) throws FDKServerResponseError, FDKException {
        return this.uploadBulkFulfillmentOptions(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionBulkData uploadBulkFulfillmentOptions(ServiceabilityPlatformModels.FulfillmentOptionBulk body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionBulkData> response = null;
            try {
            response = serviceabilityPlatformApiList.uploadBulkFulfillmentOptions(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionBulkValidateData validateBulkFulfillmentOptions(String type, ServiceabilityPlatformModels.FulfillmentOptionBulkValidate body) throws FDKServerResponseError, FDKException {
        return this.validateBulkFulfillmentOptions(type, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionBulkValidateData validateBulkFulfillmentOptions(String type, ServiceabilityPlatformModels.FulfillmentOptionBulkValidate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionBulkValidateData> response = null;
            try {
            response = serviceabilityPlatformApiList.validateBulkFulfillmentOptions(this.companyId, this.applicationId, type, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.FulfillmentOptionBulkValidate getBulkFulfillmentValidationStatus(String bulkId) throws FDKServerResponseError, FDKException {
        return this.getBulkFulfillmentValidationStatus(bulkId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.FulfillmentOptionBulkValidate getBulkFulfillmentValidationStatus(String bulkId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.FulfillmentOptionBulkValidate> response = null;
            try {
            response = serviceabilityPlatformApiList.getBulkFulfillmentValidationStatus(this.companyId, this.applicationId, bulkId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PlatformShipmentsResponseSchema createShipments(String xOrderingSource, ServiceabilityPlatformModels.PlatformShipmentsRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createShipments(xOrderingSource, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PlatformShipmentsResponseSchema createShipments(String xOrderingSource, ServiceabilityPlatformModels.PlatformShipmentsRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PlatformShipmentsResponseSchema> response = null;
            try {
            response = serviceabilityPlatformApiList.createShipments(this.applicationId, this.companyId, body, requestHeaders).execute();
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

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}