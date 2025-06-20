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

    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResultItemData sampleFileServiceability(LogisticsPartnerModels.BulkRegionServiceabilityTatDetails body) throws FDKServerResponseError, FDKException {
        return this.sampleFileServiceability(body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResultItemData sampleFileServiceability(LogisticsPartnerModels.BulkRegionServiceabilityTatDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionServiceabilityTatResultItemData> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResult getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId) throws FDKServerResponseError, FDKException {
        return this.getSampleFileServiceabilityStatus(pageNo, pageSize, batchId, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionServiceabilityTatResult getSampleFileServiceabilityStatus(Integer pageNo, Integer pageSize, String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionServiceabilityTatResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResultItemData bulkTat(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobDetails body) throws FDKServerResponseError, FDKException {
        return this.bulkTat(extensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResultItemData bulkTat(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResultItemData> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResult getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkTat(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResult getBulkTat(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionTatResult createDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, LogisticsPartnerModels.RegionTatDetails body) throws FDKServerResponseError, FDKException {
        return this.createDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionTatResult createDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, LogisticsPartnerModels.RegionTatDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionTatResult> response = null;
            try {
                response = logisticsPartnerApiList.createDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionTatItemResult getDeliveryTimes(String partnerOrgId, String courierPartnerExtensionId, String schemeId, Integer pageNo, Integer pageSize, String fromCountryCode, String fromStateCode, String fromCityCode, String fromSectorCode, String fromPincode, String toCountryCode, String toStateCode, String toCityCode, String toSectorCode, String toPincode) throws FDKServerResponseError, FDKException {
        return this.getDeliveryTimes(partnerOrgId, courierPartnerExtensionId, schemeId, pageNo, pageSize, fromCountryCode, fromStateCode, fromCityCode, fromSectorCode, fromPincode, toCountryCode, toStateCode, toCityCode, toSectorCode, toPincode, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionTatItemResult getDeliveryTimes(String partnerOrgId, String courierPartnerExtensionId, String schemeId, Integer pageNo, Integer pageSize, String fromCountryCode, String fromStateCode, String fromCityCode, String fromSectorCode, String fromPincode, String toCountryCode, String toStateCode, String toCityCode, String toSectorCode, String toPincode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionTatItemResult> response = null;
            try {
                response = logisticsPartnerApiList.getDeliveryTimes(partnerOrgId, courierPartnerExtensionId, schemeId, pageNo, pageSize, fromCountryCode, fromStateCode, fromCityCode, fromSectorCode, fromPincode, toCountryCode, toStateCode, toCityCode, toSectorCode, toPincode, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionTatResult getDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id) throws FDKServerResponseError, FDKException {
        return this.getDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionTatResult getDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionTatResult> response = null;
            try {
                response = logisticsPartnerApiList.getDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionTatResult updateDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, LogisticsPartnerModels.TATUpdateDetails body) throws FDKServerResponseError, FDKException {
        return this.updateDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, body, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionTatResult updateDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, LogisticsPartnerModels.TATUpdateDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionTatResult> response = null;
            try {
                response = logisticsPartnerApiList.updateDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionTatResult deleteDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id) throws FDKServerResponseError, FDKException {
        return this.deleteDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionTatResult deleteDeliveryTime(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionTatResult> response = null;
            try {
                response = logisticsPartnerApiList.deleteDeliveryTime(partnerOrgId, courierPartnerExtensionId, schemeId, id, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionServiceabilityResult createServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, LogisticsPartnerModels.RegionServiceabilityDetails body) throws FDKServerResponseError, FDKException {
        return this.createServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionServiceabilityResult createServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, LogisticsPartnerModels.RegionServiceabilityDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionServiceabilityResult> response = null;
            try {
                response = logisticsPartnerApiList.createServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionServiceabilityItemResult getServiceabilities(String partnerOrgId, String courierPartnerExtensionId, String schemeId, Integer pageNo, Integer pageSize, String countryCode, String stateCode, String cityCode, String sectorCode, String pincode, Boolean firstMile, Boolean lastMile, Boolean doorstepReturn, Boolean doorstepQc, Boolean installation) throws FDKServerResponseError, FDKException {
        return this.getServiceabilities(partnerOrgId, courierPartnerExtensionId, schemeId, pageNo, pageSize, countryCode, stateCode, cityCode, sectorCode, pincode, firstMile, lastMile, doorstepReturn, doorstepQc, installation, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionServiceabilityItemResult getServiceabilities(String partnerOrgId, String courierPartnerExtensionId, String schemeId, Integer pageNo, Integer pageSize, String countryCode, String stateCode, String cityCode, String sectorCode, String pincode, Boolean firstMile, Boolean lastMile, Boolean doorstepReturn, Boolean doorstepQc, Boolean installation, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionServiceabilityItemResult> response = null;
            try {
                response = logisticsPartnerApiList.getServiceabilities(partnerOrgId, courierPartnerExtensionId, schemeId, pageNo, pageSize, countryCode, stateCode, cityCode, sectorCode, pincode, firstMile, lastMile, doorstepReturn, doorstepQc, installation, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionServiceabilityResult getServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id) throws FDKServerResponseError, FDKException {
        return this.getServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionServiceabilityResult getServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionServiceabilityResult> response = null;
            try {
                response = logisticsPartnerApiList.getServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.ServiceabilityDetailsResult updateServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, LogisticsPartnerModels.ServiceabilityDetails body) throws FDKServerResponseError, FDKException {
        return this.updateServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, body, new HashMap<>());
    }

    public LogisticsPartnerModels.ServiceabilityDetailsResult updateServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, LogisticsPartnerModels.ServiceabilityDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.ServiceabilityDetailsResult> response = null;
            try {
                response = logisticsPartnerApiList.updateServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.RegionServiceabilityResult deleteServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id) throws FDKServerResponseError, FDKException {
        return this.deleteServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, new HashMap<>());
    }

    public LogisticsPartnerModels.RegionServiceabilityResult deleteServiceability(String partnerOrgId, String courierPartnerExtensionId, String schemeId, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.RegionServiceabilityResult> response = null;
            try {
                response = logisticsPartnerApiList.deleteServiceability(partnerOrgId, courierPartnerExtensionId, schemeId, id, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResultItemData bulkServiceability(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobDetails body) throws FDKServerResponseError, FDKException {
        return this.bulkServiceability(extensionId, schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResultItemData bulkServiceability(String extensionId, String schemeId, LogisticsPartnerModels.BulkRegionJobDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResultItemData> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.BulkRegionResult getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.getBulkServiceability(extensionId, schemeId, pageNo, pageSize, batchId, action, status, country, region, startDate, endDate, new HashMap<>());
    }

    public LogisticsPartnerModels.BulkRegionResult getBulkServiceability(String extensionId, String schemeId, Integer pageNo, Integer pageSize, String batchId, String action, String status, String country, String region, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.BulkRegionResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccountDetailsBody createCourierPartnerAccount(Integer companyId, LogisticsPartnerModels.CourierAccountDetailsBody body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerAccount(companyId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccountDetailsBody createCourierPartnerAccount(Integer companyId, LogisticsPartnerModels.CourierAccountDetailsBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccountDetailsBody> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer companyId, Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, List<String> accountIds, Boolean selfShip, Boolean ownAccount, String q) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccounts(companyId, pageNo, pageSize, stage, paymentMode, transportType, accountIds, selfShip, ownAccount, q, new HashMap<>());
    }

    public LogisticsPartnerModels.CompanyCourierPartnerAccountListResult getCourierPartnerAccounts(Integer companyId, Integer pageNo, Integer pageSize, String stage, String paymentMode, String transportType, List<String> accountIds, Boolean selfShip, Boolean ownAccount, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CompanyCourierPartnerAccountListResult> response = null;
            try {
                response = logisticsPartnerApiList.getCourierPartnerAccounts(this.organizationId, companyId, pageNo, pageSize, stage, paymentMode, transportType, accountIds, selfShip, ownAccount, q, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccountDetailsBody updateCourierPartnerAccount(Integer companyId, String accountId, LogisticsPartnerModels.CourierAccountDetailsBody body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerAccount(companyId, accountId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccountDetailsBody updateCourierPartnerAccount(Integer companyId, String accountId, LogisticsPartnerModels.CourierAccountDetailsBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccountDetailsBody> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierAccountResult getCourierPartnerAccount(Integer companyId, String accountId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerAccount(companyId, accountId, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierAccountResult getCourierPartnerAccount(Integer companyId, String accountId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierAccountResult> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy) throws FDKServerResponseError, FDKException {
        return this.getCountries(onboard, pageNo, pageSize, q, hierarchy, new HashMap<>());
    }

    public LogisticsPartnerModels.GetCountries getCountries(Boolean onboard, Integer pageNo, Integer pageSize, String q, String hierarchy, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.GetCountries> response = null;
            try {
                response = logisticsPartnerApiList.getCountries(this.organizationId, onboard, pageNo, pageSize, q, hierarchy, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerSchemeModelSchema createCourierPartnerScheme(LogisticsPartnerModels.CourierPartnerSchemeDetailsModel body) throws FDKServerResponseError, FDKException {
        return this.createCourierPartnerScheme(body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerSchemeModelSchema createCourierPartnerScheme(LogisticsPartnerModels.CourierPartnerSchemeDetailsModel body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerSchemeModelSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerSchemeList getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerSchemes(schemeType, paymentMode, capabilities, schemeIds, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerSchemeList getCourierPartnerSchemes(String schemeType, String paymentMode, List<String> capabilities, List<String> schemeIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerSchemeList> response = null;
            try {
                response = logisticsPartnerApiList.getCourierPartnerSchemes(this.organizationId, schemeType, paymentMode, capabilities, schemeIds, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerPutSchema updateCourierPartnerScheme(String schemeId, LogisticsPartnerModels.CourierPartnerSchemeUpdateDetails body) throws FDKServerResponseError, FDKException {
        return this.updateCourierPartnerScheme(schemeId, body, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerPutSchema updateCourierPartnerScheme(String schemeId, LogisticsPartnerModels.CourierPartnerSchemeUpdateDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerPutSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public LogisticsPartnerModels.CourierPartnerSchemeModelSchema getCourierPartnerScheme(String schemeId) throws FDKServerResponseError, FDKException {
        return this.getCourierPartnerScheme(schemeId, new HashMap<>());
    }

    public LogisticsPartnerModels.CourierPartnerSchemeModelSchema getCourierPartnerScheme(String schemeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<LogisticsPartnerModels.CourierPartnerSchemeModelSchema> response = null;
            try {
                response = logisticsPartnerApiList.getCourierPartnerScheme(this.organizationId, schemeId, requestHeaders).execute();
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