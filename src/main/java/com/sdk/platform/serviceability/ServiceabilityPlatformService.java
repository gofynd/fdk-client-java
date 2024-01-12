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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ListViewResponse getZones(Integer pageNo, Integer pageSize, Boolean isActive, String channelId, String q, String country, String state, String city, String pincode, String sector) throws FDKServerResponseError, FDKException {
        return this.getZones(pageNo, pageSize, isActive, channelId, q, country, state, city, pincode, sector, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ListViewResponse getZones(Integer pageNo, Integer pageSize, Boolean isActive, String channelId, String q, String country, String state, String city, String pincode, String sector, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ListViewResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getZones(this.companyId, pageNo, pageSize, isActive, channelId, q, country, state, city, pincode, sector, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneResponse createZone(ServiceabilityPlatformModels.CreateZoneData body) throws FDKServerResponseError, FDKException {
        return this.createZone(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneResponse createZone(ServiceabilityPlatformModels.CreateZoneData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneSuccessResponse updateZoneById(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body) throws FDKServerResponseError, FDKException {
        return this.updateZoneById(zoneId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneSuccessResponse updateZoneById(String zoneId, ServiceabilityPlatformModels.UpdateZoneData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneSuccessResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetStoresViewResponse getAllStores() throws FDKServerResponseError, FDKException {
        return this.getAllStores(new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetStoresViewResponse getAllStores(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetStoresViewResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ReAssignStoreResponse getOptimalLocations(ServiceabilityPlatformModels.ReAssignStoreRequest body) throws FDKServerResponseError, FDKException {
        return this.getOptimalLocations(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ReAssignStoreResponse getOptimalLocations(ServiceabilityPlatformModels.ReAssignStoreRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ReAssignStoreResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccount createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccount body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerAccount(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccount createCourierPartnerAccount(ServiceabilityPlatformModels.CourierAccount body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResponse getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccounts(pageNo, pageSize, stage, paymentMode, transportType, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResponse getCourierPartnerAccounts(Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyCourierPartnerAccountListResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountResponse updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccount body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerAccount(accountId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountResponse updateCourierPartnerAccount(String accountId, ServiceabilityPlatformModels.CourierAccount body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CourierAccountResponse getCourierPartnerAccount(String accountId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccount(accountId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierAccountResponse getCourierPartnerAccount(String accountId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierAccountResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResponseItemData bulkTat(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobSerializer body) throws FDKServerResponseError, FDKException {
        return this.bulkTat(extensionId, schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResponseItemData bulkTat(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResponseItemData> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResponse getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkTat(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResponse getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResponseItemData bulkServiceability(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobSerializer body) throws FDKServerResponseError, FDKException {
        return this.bulkServiceability(extensionId, schemeId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResponseItemData bulkServiceability(String extensionId, String schemeId, ServiceabilityPlatformModels.BulkRegionJobSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResponseItemData> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.BulkRegionResponse getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkServiceability(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public ServiceabilityPlatformModels.BulkRegionResponse getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.BulkRegionResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResponse createPackageMaterial(ServiceabilityPlatformModels.PackageMaterial body) throws FDKServerResponseError, FDKException {
        return this.createPackageMaterial(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResponse createPackageMaterial(ServiceabilityPlatformModels.PackageMaterial body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResponse createPackageMaterialRule(ServiceabilityPlatformModels.PackageRule body) throws FDKServerResponseError, FDKException {
        return this.createPackageMaterialRule(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResponse createPackageMaterialRule(ServiceabilityPlatformModels.PackageRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResponse updatePackageMaterialRule(String ruleId, ServiceabilityPlatformModels.PackageRule body) throws FDKServerResponseError, FDKException {
        return this.updatePackageMaterialRule(ruleId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResponse updatePackageMaterialRule(String ruleId, ServiceabilityPlatformModels.PackageRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageRuleResponse getPackageMaterialRule(String ruleId) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterialRule(ruleId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageRuleResponse getPackageMaterialRule(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageRuleResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResponse updatePackageMaterials(String packageMaterialId, ServiceabilityPlatformModels.PackageMaterial body) throws FDKServerResponseError, FDKException {
        return this.updatePackageMaterials(packageMaterialId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResponse updatePackageMaterials(String packageMaterialId, ServiceabilityPlatformModels.PackageMaterial body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResponse> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.PackageMaterialResponse getPackageMaterials(String packageMaterialId) throws FDKServerResponseError, FDKException {
        return this.getPackageMaterials(packageMaterialId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PackageMaterialResponse getPackageMaterials(String packageMaterialId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PackageMaterialResponse> response = null;
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
    
    
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public ServiceabilityPlatformModels.PincodeMOPresponse updatePincodeMopView(ServiceabilityPlatformModels.PincodeMopData body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeMopView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeMOPresponse updatePincodeMopView(ServiceabilityPlatformModels.PincodeMopData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeMOPresponse> response = null;
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

    public ServiceabilityPlatformModels.PincodeBulkViewResponse updatePincodeBulkView(ServiceabilityPlatformModels.PincodeMopBulkData body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeBulkView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeBulkViewResponse updatePincodeBulkView(ServiceabilityPlatformModels.PincodeMopBulkData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeBulkViewResponse> response = null;
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

    public ServiceabilityPlatformModels.PincodeCodStatusListingResponse updatePincodeCoDListing(ServiceabilityPlatformModels.PincodeCodStatusListingRequest body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeCoDListing(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeCodStatusListingResponse updatePincodeCoDListing(ServiceabilityPlatformModels.PincodeCodStatusListingRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeCodStatusListingResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeCoDListing(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData updatePincodeAuditHistory(ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest body) throws FDKServerResponseError, FDKException {
        return this.updatePincodeAuditHistory(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData updatePincodeAuditHistory(ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.PincodeMopUpdateAuditHistoryResponseData> response = null;
            try {
            response = serviceabilityPlatformApiList.updatePincodeAuditHistory(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.CourierPartnerRule updateCourierRule(String ruleId, ServiceabilityPlatformModels.CourierPartnerRule body) throws FDKServerResponseError, FDKException {
        return this.updateCourierRule(ruleId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRule updateCourierRule(String ruleId, ServiceabilityPlatformModels.CourierPartnerRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRule> response = null;
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

    public ServiceabilityPlatformModels.CourierPartnerRule getCourierPartnerRule(String ruleId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerRule(ruleId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRule getCourierPartnerRule(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRule> response = null;
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

    public ServiceabilityPlatformModels.CourierPartnerRule createCourierPartnerRule(ServiceabilityPlatformModels.CourierPartnerRule body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerRule(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRule createCourierPartnerRule(ServiceabilityPlatformModels.CourierPartnerRule body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRule> response = null;
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

    public ServiceabilityPlatformModels.CourierPartnerRulesListResponse getCourierPartnerRules(Integer pageNo, Integer pageSize, String status) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerRules(pageNo, pageSize, status, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CourierPartnerRulesListResponse getCourierPartnerRules(Integer pageNo, Integer pageSize, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CourierPartnerRulesListResponse> response = null;
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse patchApplicationServiceabilitySelfShipment(ServiceabilityPlatformModels.SelfShipResponse body) throws FDKServerResponseError, FDKException {
        return this.patchApplicationServiceabilitySelfShipment(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse patchApplicationServiceabilitySelfShipment(ServiceabilityPlatformModels.SelfShipResponse body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> response = null;
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse getApplicationServiceabilitySelfShipment() throws FDKServerResponseError, FDKException {
        return this.getApplicationServiceabilitySelfShipment(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse getApplicationServiceabilitySelfShipment(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> response = null;
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

    public ServiceabilityPlatformModels.GetStoreRulesApiResponse getStoreRules(Integer pageNo, Integer pageSize, String status) throws FDKServerResponseError, FDKException {
        return this.getStoreRules(pageNo, pageSize, status, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetStoreRulesApiResponse getStoreRules(Integer pageNo, Integer pageSize, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetStoreRulesApiResponse> response = null;
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

    public ServiceabilityPlatformModels.StoreRuleResponseSchema createStoreRules(ServiceabilityPlatformModels.CreateStoreRuleRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createStoreRules(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleResponseSchema createStoreRules(ServiceabilityPlatformModels.CreateStoreRuleRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleResponseSchema> response = null;
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

    public ServiceabilityPlatformModels.StoreRuleUpdateResponseSchema updateStoreRules(String ruleUid, ServiceabilityPlatformModels.CreateStoreRuleRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateStoreRules(ruleUid, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.StoreRuleUpdateResponseSchema updateStoreRules(String ruleUid, ServiceabilityPlatformModels.CreateStoreRuleRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.StoreRuleUpdateResponseSchema> response = null;
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

    public ServiceabilityPlatformModels.RulePriorityResponse updateCourierPartnerRulePriority(ServiceabilityPlatformModels.RulePriorityRequest body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerRulePriority(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.RulePriorityResponse updateCourierPartnerRulePriority(ServiceabilityPlatformModels.RulePriorityRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.RulePriorityResponse> response = null;
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