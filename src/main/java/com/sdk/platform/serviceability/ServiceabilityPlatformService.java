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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.EntityRegionView_Response getEntityRegionView(ServiceabilityPlatformModels.EntityRegionView_Request body) throws FDKServerResponseError, FDKException {
        return this.getEntityRegionView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.EntityRegionView_Response getEntityRegionView(ServiceabilityPlatformModels.EntityRegionView_Request body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.EntityRegionView_Response> response = null;
            try {
                response = serviceabilityPlatformApiList.getEntityRegionView(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ListViewResponse getListView(Integer pageNumber, Integer pageSize, String name, Boolean isActive, String channelIds, String q) throws FDKServerResponseError, FDKException {
        return this.getListView(pageNumber, pageSize, name, isActive, channelIds, q, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ListViewResponse getListView(Integer pageNumber, Integer pageSize, String name, Boolean isActive, String channelIds, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ListViewResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getListView(this.companyId, pageNumber, pageSize, name, isActive, channelIds, q, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyStoreView_Response getCompanyStoreView(Integer pageNumber, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getCompanyStoreView(pageNumber, pageSize, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyStoreView_Response getCompanyStoreView(Integer pageNumber, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyStoreView_Response> response = null;
            try {
                response = serviceabilityPlatformApiList.getCompanyStoreView(this.companyId, pageNumber, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneSuccessResponse updateZoneControllerView(String zoneId, ServiceabilityPlatformModels.ZoneUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.updateZoneControllerView(zoneId, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneSuccessResponse updateZoneControllerView(String zoneId, ServiceabilityPlatformModels.ZoneUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ZoneSuccessResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.updateZoneControllerView(zoneId, this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetSingleZoneDataViewResponse getZoneDataView(String zoneId) throws FDKServerResponseError, FDKException {
        return this.getZoneDataView(zoneId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetSingleZoneDataViewResponse getZoneDataView(String zoneId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetSingleZoneDataViewResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getZoneDataView(this.companyId, zoneId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ZoneResponse createZone(ServiceabilityPlatformModels.ZoneRequest body) throws FDKServerResponseError, FDKException {
        return this.createZone(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ZoneResponse createZone(ServiceabilityPlatformModels.ZoneRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.ListViewResponse getZoneListView(Integer pageNumber, Integer pageNo, Integer pageSize, String name, Boolean isActive, String channelIds, String q, List<String> zoneId) throws FDKServerResponseError, FDKException {
        return this.getZoneListView(pageNumber, pageNo, pageSize, name, isActive, channelIds, q, zoneId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ListViewResponse getZoneListView(Integer pageNumber, Integer pageNo, Integer pageSize, String name, Boolean isActive, String channelIds, String q, List<String> zoneId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ListViewResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getZoneListView(this.companyId, pageNumber, pageNo, pageSize, name, isActive, channelIds, q, zoneId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.GetStoresViewResponse getStore(Integer storeUid) throws FDKServerResponseError, FDKException {
        return this.getStore(storeUid, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetStoresViewResponse getStore(Integer storeUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetStoresViewResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getStore(this.companyId, storeUid, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyDpAccountResponse upsertDpAccount(ServiceabilityPlatformModels.CompanyDpAccountRequest body) throws FDKServerResponseError, FDKException {
        return this.upsertDpAccount(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyDpAccountResponse upsertDpAccount(ServiceabilityPlatformModels.CompanyDpAccountRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyDpAccountResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.upsertDpAccount(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.CompanyDpAccountListResponse getDpAccount(Integer pageNumber, Integer pageSize, String stage, String paymentMode, String transportType) throws FDKServerResponseError, FDKException {
        return this.getDpAccount(pageNumber, pageSize, stage, paymentMode, transportType, new HashMap<>());
    }

    public ServiceabilityPlatformModels.CompanyDpAccountListResponse getDpAccount(Integer pageNumber, Integer pageSize, String stage, String paymentMode, String transportType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.CompanyDpAccountListResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getDpAccount(this.companyId, pageNumber, pageSize, stage, paymentMode, transportType, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DpRuleUpdateSuccessResponse updateDpRule(String ruleUid, ServiceabilityPlatformModels.DpRulesUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.updateDpRule(ruleUid, body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DpRuleUpdateSuccessResponse updateDpRule(String ruleUid, ServiceabilityPlatformModels.DpRulesUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DpRuleUpdateSuccessResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.updateDpRule(this.companyId, ruleUid, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DpRuleSuccessResponse getDpRules(String ruleUid) throws FDKServerResponseError, FDKException {
        return this.getDpRules(ruleUid, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DpRuleSuccessResponse getDpRules(String ruleUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DpRuleSuccessResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getDpRules(this.companyId, ruleUid, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DpRuleSuccessResponse upsertDpRules(ServiceabilityPlatformModels.DpRuleRequest body) throws FDKServerResponseError, FDKException {
        return this.upsertDpRules(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DpRuleSuccessResponse upsertDpRules(ServiceabilityPlatformModels.DpRuleRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DpRuleSuccessResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.upsertDpRules(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DpMultipleRuleSuccessResponse getDpRuleInsert(Integer pageNumber, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getDpRuleInsert(pageNumber, pageSize, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DpMultipleRuleSuccessResponse getDpRuleInsert(Integer pageNumber, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DpMultipleRuleSuccessResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getDpRuleInsert(this.companyId, pageNumber, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DPCompanyRuleResponse upsertDpCompanyRules(ServiceabilityPlatformModels.DPCompanyRuleRequest body) throws FDKServerResponseError, FDKException {
        return this.upsertDpCompanyRules(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DPCompanyRuleResponse upsertDpCompanyRules(ServiceabilityPlatformModels.DPCompanyRuleRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DPCompanyRuleResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.upsertDpCompanyRules(this.companyId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ServiceabilityPlatformModels.DPCompanyRuleResponse getDpCompanyRules() throws FDKServerResponseError, FDKException {
        return this.getDpCompanyRules(new HashMap<>());
    }

    public ServiceabilityPlatformModels.DPCompanyRuleResponse getDpCompanyRules(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DPCompanyRuleResponse> response = null;
            try {
                response = serviceabilityPlatformApiList.getDpCompanyRules(this.companyId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse getApplicationServiceability() throws FDKServerResponseError, FDKException {
        return this.getApplicationServiceability(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse getApplicationServiceability(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.getApplicationServiceability(this.companyId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse updateApplicationServiceability(ServiceabilityPlatformModels.ServiceabilityPayloadSchema body) throws FDKServerResponseError, FDKException {
        return this.updateApplicationServiceability(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse updateApplicationServiceability(ServiceabilityPlatformModels.ServiceabilityPayloadSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationServiceabilityConfigResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.updateApplicationServiceability(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse getZoneFromPincodeView(ServiceabilityPlatformModels.GetZoneFromPincodeViewRequest body) throws FDKServerResponseError, FDKException {
        return this.getZoneFromPincodeView(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse getZoneFromPincodeView(ServiceabilityPlatformModels.GetZoneFromPincodeViewRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetZoneFromPincodeViewResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.getZoneFromPincodeView(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse getZonesFromApplicationIdView(Integer pageNo, Integer pageSize, List<String> zoneId, String q) throws FDKServerResponseError, FDKException {
        return this.getZonesFromApplicationIdView(pageNo, pageSize, zoneId, q, new HashMap<>());
    }

    public ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse getZonesFromApplicationIdView(Integer pageNo, Integer pageSize, List<String> zoneId, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.GetZoneFromApplicationIdViewResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.getZonesFromApplicationIdView(this.companyId, this.applicationId, pageNo, pageSize, zoneId, q, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse addAppDp(ServiceabilityPlatformModels.ApplicationCompanyDpViewRequest body) throws FDKServerResponseError, FDKException {
        return this.addAppDp(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse addAppDp(ServiceabilityPlatformModels.ApplicationCompanyDpViewRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.addAppDp(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse deleteAppDp(Integer courierPartnerId) throws FDKServerResponseError, FDKException {
        return this.deleteAppDp(courierPartnerId, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse deleteAppDp(Integer courierPartnerId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationCompanyDpViewResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.deleteAppDp(this.companyId, this.applicationId, courierPartnerId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.DPApplicationRuleResponse upsertDpApplicationRules(ServiceabilityPlatformModels.DPApplicationRuleRequest body) throws FDKServerResponseError, FDKException {
        return this.upsertDpApplicationRules(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.DPApplicationRuleResponse upsertDpApplicationRules(ServiceabilityPlatformModels.DPApplicationRuleRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DPApplicationRuleResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.upsertDpApplicationRules(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.DPApplicationRuleResponse getDpApplicationRules() throws FDKServerResponseError, FDKException {
        return this.getDpApplicationRules(new HashMap<>());
    }

    public ServiceabilityPlatformModels.DPApplicationRuleResponse getDpApplicationRules(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.DPApplicationRuleResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.getDpApplicationRules(this.companyId, this.applicationId, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse updateSelfShip(ServiceabilityPlatformModels.SelfShipResponse body) throws FDKServerResponseError, FDKException {
        return this.updateSelfShip(body, new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse updateSelfShip(ServiceabilityPlatformModels.SelfShipResponse body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.updateSelfShip(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse getSelfShip() throws FDKServerResponseError, FDKException {
        return this.getSelfShip(new HashMap<>());
    }

    public ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse getSelfShip(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ServiceabilityPlatformModels.ApplicationSelfShipConfigResponse> response = null;
            try {
            response = serviceabilityPlatformApiList.getSelfShip(this.companyId, this.applicationId, requestHeaders).execute();
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