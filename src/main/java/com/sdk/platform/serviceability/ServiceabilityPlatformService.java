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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ListViewResult getZones(Integer pageNo, Integer pageSize, Boolean isActive, String channelId, String q, String countryIsoCode, String state, String city, String pincode, String sector) throws FDKServerResponseError, FDKException {
        return this.getZones(pageNo, pageSize, isActive, channelId, q, countryIsoCode, state, city, pincode, sector, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ListViewResult getZones(Integer pageNo, Integer pageSize, Boolean isActive, String channelId, String q, String countryIsoCode, String state, String city, String pincode, String sector, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ListViewResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getZones(this.companyId, pageNo, pageSize, isActive, channelId, q, countryIsoCode, state, city, pincode, sector, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneResult createZone(ServiceabilityPlatformModels.CreateZoneData body) throws FDKServerResponseError, FDKException {
        return this.createZone(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneResult createZone(ServiceabilityPlatformModels.CreateZoneData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneResult> response = null;
            try {
                response = serviceabilityPlatformApiList.createZone(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneSuccessResult updateZoneById(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body) throws FDKServerResponseError, FDKException {
        return this.updateZoneById(zoneId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneSuccessResult updateZoneById(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneSuccessResult> response = null;
            try {
                response = serviceabilityPlatformApiList.updateZoneById(this.companyId, zoneId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetZoneByIdSchema getZoneById(String zoneId) throws FDKServerResponseError, FDKException {
        return this.getZoneById(zoneId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetZoneByIdSchema getZoneById(String zoneId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetZoneByIdSchema> response = null;
            try {
                response = serviceabilityPlatformApiList.getZoneById(this.companyId, zoneId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetStoresViewResult getAllStores() throws FDKServerResponseError, FDKException {
        return this.getAllStores(new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetStoresViewResult getAllStores(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetStoresViewResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getAllStores(this.companyId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccount createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccountDetailsBody body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerAccount(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccount createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccountDetailsBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccount> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccounts(pageNo, pageSize, stage, paymentMode, transportType, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResult> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerAccounts(this.companyId, pageNo, pageSize, stage, paymentMode, transportType, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountResult updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccountUpdateDetails body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerAccount(accountId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountResult updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccountUpdateDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyConfig updateCompanyConfiguration(ServiceabilityPlatformModels.CompanyConfig body) throws FDKServerResponseError, FDKException {
        return this.updateCompanyConfiguration(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyConfig updateCompanyConfiguration(ServiceabilityPlatformModels.CompanyConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyConfig> response = null;
            try {
                response = serviceabilityPlatformApiList.updateCompanyConfiguration(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ServiceabilityModel getServiceability(String extensionId, String schemeId, String regionId) throws FDKServerResponseError, FDKException {
        return this.getServiceability(extensionId, schemeId, regionId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ServiceabilityModel getServiceability(String extensionId, String schemeId, String regionId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ServiceabilityModel> response = null;
            try {
                response = serviceabilityPlatformApiList.getServiceability(this.companyId, extensionId, schemeId, regionId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ServiceabilityModel updateServiceability(String extensionId, String schemeId, String regionId, ServiceabilityPlatformModels.ServiceabilityModel body) throws FDKServerResponseError, FDKException {
        return this.updateServiceability(extensionId, schemeId, regionId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ServiceabilityModel updateServiceability(String extensionId, String schemeId, String regionId, ServiceabilityPlatformModels.ServiceabilityModel body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ServiceabilityModel> response = null;
            try {
                response = serviceabilityPlatformApiList.updateServiceability(this.companyId, extensionId, schemeId, regionId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResult createPackageMaterial(ServiceabilityPlatformModels.PackageMaterial body) throws FDKServerResponseError, FDKException {
        return this.createPackageMaterial(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResult createPackageMaterial(ServiceabilityPlatformModels.PackageMaterial body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResult> response = null;
            try {
                response = serviceabilityPlatformApiList.createPackageMaterial(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialList getPackageMaterialList(Integer pageNo, Integer pageSize, String q, String size, String packageType) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterialList(pageNo, pageSize, q, size, packageType, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialList getPackageMaterialList(Integer pageNo, Integer pageSize, String q, String size, String packageType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialList> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialRuleList getPackageMaterialRules(Integer pageNo, Integer pageSize, String isActive) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterialRules(pageNo, pageSize, isActive, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialRuleList getPackageMaterialRules(Integer pageNo, Integer pageSize, String isActive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialRuleList> response = null;
            try {
                response = serviceabilityPlatformApiList.getPackageMaterialRules(this.companyId, pageNo, pageSize, isActive, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResult getPackageMaterials(String packageMaterialId) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterials(packageMaterialId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResult getPackageMaterials(String packageMaterialId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.OptimalLocationsResult getOptimalLocations(ServiceabilityPlatformModels.OptimlLocationsDetailsSchema body) throws FDKServerResponseError, FDKException {
        return this.getOptimalLocations(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.OptimalLocationsResult getOptimalLocations(ServiceabilityPlatformModels.OptimlLocationsDetailsSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel createCourierPartnerScheme(ServiceabilityPlatformModels.CourierPartnerSchemeV2DetailsModel body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerScheme(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel createCourierPartnerScheme(ServiceabilityPlatformModels.CourierPartnerSchemeV2DetailsModel body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerV2SchemeModel> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.courierPartnerSchemeV2List getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerSchemes(schemeType, paymentMode, capabilities, schemeIds, new HashMap<>());
    }

    public ServiceabilityPlatformModels.courierPartnerSchemeV2List getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.courierPartnerSchemeV2List> response = null;
            try {
                response = serviceabilityPlatformApiList.getCourierPartnerSchemes(this.companyId, schemeType, paymentMode, capabilities, schemeIds, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel updateCourierPartnerScheme(String schemeId, ServiceabilityPlatformModels.CourierPartnerSchemeV2UpdateDetails body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerScheme(schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel updateCourierPartnerScheme(String schemeId, ServiceabilityPlatformModels.CourierPartnerSchemeV2UpdateDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerV2SchemeModel> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel getCourierPartnerScheme(String schemeId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerScheme(schemeId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerV2SchemeModel getCourierPartnerScheme(String schemeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerV2SchemeModel> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, String hierarchy) throws FDKServerResponseError, FDKException {
        return this.getCountries(onboarding, pageNo, pageSize, q, hierarchy, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetCountries getCountries(Boolean onboarding, Integer pageNo, Integer pageSize, String q, String hierarchy, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetCountries> response = null;
            try {
                response = serviceabilityPlatformApiList.getCountries(this.companyId, onboarding, pageNo, pageSize, q, hierarchy, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRuleResult updateCourierRule(String ruleId, ServiceabilityPlatformModels.CourierPartnerRule body) throws FDKServerResponseError, FDKException {
        return this.updateCourierRule(ruleId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRuleResult updateCourierRule(String ruleId, ServiceabilityPlatformModels.CourierPartnerRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRuleResult> response = null;
            try {
            response = serviceabilityPlatformApiList.updateCourierRule(this.companyId, this.applicationId, ruleId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRuleResult getCourierPartnerRule(String ruleId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerRule(ruleId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRuleResult getCourierPartnerRule(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRuleResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getCourierPartnerRule(this.companyId, this.applicationId, ruleId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationConfig updateApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfig body) throws FDKServerResponseError, FDKException {
        return this.updateApplicationConfiguration(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationConfig updateApplicationConfiguration(ServiceabilityPlatformModels.ApplicationConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationConfig> response = null;
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

    public ServiceabilityPlatformModels.ApplicationConfig getApplicationConfiguration() throws FDKServerResponseError, FDKException {
        return this.getApplicationConfiguration(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationConfig getApplicationConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationConfig> response = null;
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResult patchApplicationServiceabilitySelfShipment(ServiceabilityPlatformModels.SelfShipResult body) throws FDKServerResponseError, FDKException {
        return this.patchApplicationServiceabilitySelfShipment(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResult patchApplicationServiceabilitySelfShipment(ServiceabilityPlatformModels.SelfShipResult body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResult> response = null;
            try {
            response = serviceabilityPlatformApiList.patchApplicationServiceabilitySelfShipment(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResult getApplicationServiceabilitySelfShipment() throws FDKServerResponseError, FDKException {
        return this.getApplicationServiceabilitySelfShipment(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResult getApplicationServiceabilitySelfShipment(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResult> response = null;
            try {
            response = serviceabilityPlatformApiList.getApplicationServiceabilitySelfShipment(this.companyId, this.applicationId, requestHeaders).execute();
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

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}