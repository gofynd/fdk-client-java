package com.sdk.platform.order;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class OrderPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private OrderPlatformApiList orderPlatformApiList;

    public OrderPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.orderPlatformApiList = generateOrderPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private OrderPlatformApiList generateOrderPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),OrderPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.InvalidateShipmentCacheResponseSchema invalidateShipmentCache(OrderPlatformModels.InvalidateShipmentCachePayload body) throws FDKServerResponseError, FDKException {
        return this.invalidateShipmentCache(body, new HashMap<>());
    }

    public OrderPlatformModels.InvalidateShipmentCacheResponseSchema invalidateShipmentCache(OrderPlatformModels.InvalidateShipmentCachePayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.InvalidateShipmentCacheResponseSchema> response = null;
            try {
                response = orderPlatformApiList.invalidateShipmentCache(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.PostRefundStateConfigurationResponseSchema postRefundStateConfiguration(String appId, String paymentType, OrderPlatformModels.PostRefundStateConfiguration body) throws FDKServerResponseError, FDKException {
        return this.postRefundStateConfiguration(appId, paymentType, body, new HashMap<>());
    }

    public OrderPlatformModels.PostRefundStateConfigurationResponseSchema postRefundStateConfiguration(String appId, String paymentType, OrderPlatformModels.PostRefundStateConfiguration body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.PostRefundStateConfigurationResponseSchema> response = null;
            try {
                response = orderPlatformApiList.postRefundStateConfiguration(this.companyId, appId, paymentType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GetRefundStateConfigurationResponseSchema getRefundStateConfiguration(String appId, String paymentType) throws FDKServerResponseError, FDKException {
        return this.getRefundStateConfiguration(appId, paymentType, new HashMap<>());
    }

    public OrderPlatformModels.GetRefundStateConfigurationResponseSchema getRefundStateConfiguration(String appId, String paymentType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GetRefundStateConfigurationResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getRefundStateConfiguration(this.companyId, appId, paymentType, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GetRefundStates getRefundEnableStateList() throws FDKServerResponseError, FDKException {
        return this.getRefundEnableStateList(new HashMap<>());
    }

    public OrderPlatformModels.GetRefundStates getRefundEnableStateList(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GetRefundStates> response = null;
            try {
                response = orderPlatformApiList.getRefundEnableStateList(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema postRefundConfiguration(String appId, OrderPlatformModels.RefundStateConfigurationManualSchema body) throws FDKServerResponseError, FDKException {
        return this.postRefundConfiguration(appId, body, new HashMap<>());
    }

    public OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema postRefundConfiguration(String appId, OrderPlatformModels.RefundStateConfigurationManualSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema> response = null;
            try {
                response = orderPlatformApiList.postRefundConfiguration(this.companyId, appId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema getRefundConfiguration(String appId) throws FDKServerResponseError, FDKException {
        return this.getRefundConfiguration(appId, new HashMap<>());
    }

    public OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema getRefundConfiguration(String appId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RefundStateConfigurationManualSchemaResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getRefundConfiguration(this.companyId, appId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.StoreReassignResponseSchema reassignLocation(OrderPlatformModels.StoreReassign body) throws FDKServerResponseError, FDKException {
        return this.reassignLocation(body, new HashMap<>());
    }

    public OrderPlatformModels.StoreReassignResponseSchema reassignLocation(OrderPlatformModels.StoreReassign body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.StoreReassignResponseSchema> response = null;
            try {
                response = orderPlatformApiList.reassignLocation(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RefundOptionsSchemaResponseSchema getRefundOptions(String shipmentId, String bagIds, String state, String optinAppId, Integer optinCompanyId, String status) throws FDKServerResponseError, FDKException {
        return this.getRefundOptions(shipmentId, bagIds, state, optinAppId, optinCompanyId, status, new HashMap<>());
    }

    public OrderPlatformModels.RefundOptionsSchemaResponseSchema getRefundOptions(String shipmentId, String bagIds, String state, String optinAppId, Integer optinCompanyId, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RefundOptionsSchemaResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getRefundOptions(shipmentId, this.companyId, bagIds, state, optinAppId, optinCompanyId, status, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.AnnouncementsResponseSchema getAnnouncements(String date) throws FDKServerResponseError, FDKException {
        return this.getAnnouncements(date, new HashMap<>());
    }

    public OrderPlatformModels.AnnouncementsResponseSchema getAnnouncements(String date, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.AnnouncementsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getAnnouncements(this.companyId, date, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.Click2CallResponseSchema click2Call(String caller, String receiver, String bagId, String callerId, String method) throws FDKServerResponseError, FDKException {
        return this.click2Call(caller, receiver, bagId, callerId, method, new HashMap<>());
    }

    public OrderPlatformModels.Click2CallResponseSchema click2Call(String caller, String receiver, String bagId, String callerId, String method, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.Click2CallResponseSchema> response = null;
            try {
                response = orderPlatformApiList.click2Call(this.companyId, caller, receiver, bagId, callerId, method, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.UpdateShipmentStatusResponseBody updateShipmentStatus(OrderPlatformModels.UpdateShipmentStatusRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateShipmentStatus(body, new HashMap<>());
    }

    public OrderPlatformModels.UpdateShipmentStatusResponseBody updateShipmentStatus(OrderPlatformModels.UpdateShipmentStatusRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.UpdateShipmentStatusResponseBody> response = null;
            try {
                response = orderPlatformApiList.updateShipmentStatus(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentHistoryResponseSchema getShipmentHistory(String shipmentId, Integer bagId) throws FDKServerResponseError, FDKException {
        return this.getShipmentHistory(shipmentId, bagId, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentHistoryResponseSchema getShipmentHistory(String shipmentId, Integer bagId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentHistoryResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipmentHistory(this.companyId, shipmentId, bagId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentHistoryResponseSchema postShipmentHistory(OrderPlatformModels.PostShipmentHistory body) throws FDKServerResponseError, FDKException {
        return this.postShipmentHistory(body, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentHistoryResponseSchema postShipmentHistory(OrderPlatformModels.PostShipmentHistory body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentHistoryResponseSchema> response = null;
            try {
                response = orderPlatformApiList.postShipmentHistory(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.SendSmsResponseSchema sendSmsNinja(OrderPlatformModels.SendSmsPayload body) throws FDKServerResponseError, FDKException {
        return this.sendSmsNinja(body, new HashMap<>());
    }

    public OrderPlatformModels.SendSmsResponseSchema sendSmsNinja(OrderPlatformModels.SendSmsPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.SendSmsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.sendSmsNinja(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.UpdatePackagingDimensionsResponseSchema updatePackagingDimensions(OrderPlatformModels.UpdatePackagingDimensionsPayload body) throws FDKServerResponseError, FDKException {
        return this.updatePackagingDimensions(body, new HashMap<>());
    }

    public OrderPlatformModels.UpdatePackagingDimensionsResponseSchema updatePackagingDimensions(OrderPlatformModels.UpdatePackagingDimensionsPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.UpdatePackagingDimensionsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updatePackagingDimensions(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ResponseDetail orderUpdate(OrderPlatformModels.PlatformOrderUpdate body) throws FDKServerResponseError, FDKException {
        return this.orderUpdate(body, new HashMap<>());
    }

    public OrderPlatformModels.ResponseDetail orderUpdate(OrderPlatformModels.PlatformOrderUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ResponseDetail> response = null;
            try {
                response = orderPlatformApiList.orderUpdate(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BagStateTransitionMap getStateTransitionMap() throws FDKServerResponseError, FDKException {
        return this.getStateTransitionMap(new HashMap<>());
    }

    public OrderPlatformModels.BagStateTransitionMap getStateTransitionMap(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BagStateTransitionMap> response = null;
            try {
                response = orderPlatformApiList.getStateTransitionMap(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RoleBaseStateTransitionMapping getAllowedStateTransition(String orderingChannel, String status) throws FDKServerResponseError, FDKException {
        return this.getAllowedStateTransition(orderingChannel, status, new HashMap<>());
    }

    public OrderPlatformModels.RoleBaseStateTransitionMapping getAllowedStateTransition(String orderingChannel, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RoleBaseStateTransitionMapping> response = null;
            try {
                response = orderPlatformApiList.getAllowedStateTransition(this.companyId, orderingChannel, status, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FetchCreditBalanceResponsePayload fetchCreditBalanceDetail(OrderPlatformModels.FetchCreditBalanceRequestPayload body) throws FDKServerResponseError, FDKException {
        return this.fetchCreditBalanceDetail(body, new HashMap<>());
    }

    public OrderPlatformModels.FetchCreditBalanceResponsePayload fetchCreditBalanceDetail(OrderPlatformModels.FetchCreditBalanceRequestPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FetchCreditBalanceResponsePayload> response = null;
            try {
                response = orderPlatformApiList.fetchCreditBalanceDetail(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RefundModeConfigResponsePayload fetchRefundModeConfig(OrderPlatformModels.RefundModeConfigRequestPayload body) throws FDKServerResponseError, FDKException {
        return this.fetchRefundModeConfig(body, new HashMap<>());
    }

    public OrderPlatformModels.RefundModeConfigResponsePayload fetchRefundModeConfig(OrderPlatformModels.RefundModeConfigRequestPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RefundModeConfigResponsePayload> response = null;
            try {
                response = orderPlatformApiList.fetchRefundModeConfig(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.AttachOrderUserResponseSchema attachOrderUser(OrderPlatformModels.AttachOrderUser body) throws FDKServerResponseError, FDKException {
        return this.attachOrderUser(body, new HashMap<>());
    }

    public OrderPlatformModels.AttachOrderUserResponseSchema attachOrderUser(OrderPlatformModels.AttachOrderUser body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.AttachOrderUserResponseSchema> response = null;
            try {
                response = orderPlatformApiList.attachOrderUser(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.SendUserMobileOtpResponseSchema sendUserMobileOTP(OrderPlatformModels.SendUserMobileOTP body) throws FDKServerResponseError, FDKException {
        return this.sendUserMobileOTP(body, new HashMap<>());
    }

    public OrderPlatformModels.SendUserMobileOtpResponseSchema sendUserMobileOTP(OrderPlatformModels.SendUserMobileOTP body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.SendUserMobileOtpResponseSchema> response = null;
            try {
                response = orderPlatformApiList.sendUserMobileOTP(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.VerifyOtpResponseSchema verifyMobileOTP(OrderPlatformModels.VerifyMobileOTP body) throws FDKServerResponseError, FDKException {
        return this.verifyMobileOTP(body, new HashMap<>());
    }

    public OrderPlatformModels.VerifyOtpResponseSchema verifyMobileOTP(OrderPlatformModels.VerifyMobileOTP body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.VerifyOtpResponseSchema> response = null;
            try {
                response = orderPlatformApiList.verifyMobileOTP(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BulkReportsDownloadResponseSchema downloadLanesReport(OrderPlatformModels.BulkReportsDownloadRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.downloadLanesReport(body, new HashMap<>());
    }

    public OrderPlatformModels.BulkReportsDownloadResponseSchema downloadLanesReport(OrderPlatformModels.BulkReportsDownloadRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BulkReportsDownloadResponseSchema> response = null;
            try {
                response = orderPlatformApiList.downloadLanesReport(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BulkStateTransistionResponseSchema bulkStateTransistion(OrderPlatformModels.BulkStateTransistionRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.bulkStateTransistion(body, new HashMap<>());
    }

    public OrderPlatformModels.BulkStateTransistionResponseSchema bulkStateTransistion(OrderPlatformModels.BulkStateTransistionRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BulkStateTransistionResponseSchema> response = null;
            try {
                response = orderPlatformApiList.bulkStateTransistion(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BulkListingResponseSchema bulkListing(Integer pageSize, Integer pageNo, String startDate, String endDate, String status, String bulkActionType, String searchKey) throws FDKServerResponseError, FDKException {
        return this.bulkListing(pageSize, pageNo, startDate, endDate, status, bulkActionType, searchKey, new HashMap<>());
    }

    public OrderPlatformModels.BulkListingResponseSchema bulkListing(Integer pageSize, Integer pageNo, String startDate, String endDate, String status, String bulkActionType, String searchKey, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BulkListingResponseSchema> response = null;
            try {
                response = orderPlatformApiList.bulkListing(this.companyId, pageSize, pageNo, startDate, endDate, status, bulkActionType, searchKey, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.JobDetailsResponseSchema jobDetails(String batchId) throws FDKServerResponseError, FDKException {
        return this.jobDetails(batchId, new HashMap<>());
    }

    public OrderPlatformModels.JobDetailsResponseSchema jobDetails(String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.JobDetailsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.jobDetails(this.companyId, batchId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.JobFailedResponseSchema getFileByStatus(String batchId, String status, String fileType, String reportType) throws FDKServerResponseError, FDKException {
        return this.getFileByStatus(batchId, status, fileType, reportType, new HashMap<>());
    }

    public OrderPlatformModels.JobFailedResponseSchema getFileByStatus(String batchId, String status, String fileType, String reportType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.JobFailedResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getFileByStatus(this.companyId, batchId, status, fileType, reportType, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ManifestFiltersResponseSchema getManifestfilters(String view) throws FDKServerResponseError, FDKException {
        return this.getManifestfilters(view, new HashMap<>());
    }

    public OrderPlatformModels.ManifestFiltersResponseSchema getManifestfilters(String view, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ManifestFiltersResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getManifestfilters(this.companyId, view, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.EInvoiceRetryResponseSchema eInvoiceRetry(OrderPlatformModels.EInvoiceRetry body) throws FDKServerResponseError, FDKException {
        return this.eInvoiceRetry(body, new HashMap<>());
    }

    public OrderPlatformModels.EInvoiceRetryResponseSchema eInvoiceRetry(OrderPlatformModels.EInvoiceRetry body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.EInvoiceRetryResponseSchema> response = null;
            try {
                response = orderPlatformApiList.eInvoiceRetry(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FailedOrderLogs getFailedOrderLogs(Integer pageNo, Integer pageSize, String searchType, String searchValue) throws FDKServerResponseError, FDKException {
        return this.getFailedOrderLogs(pageNo, pageSize, searchType, searchValue, new HashMap<>());
    }

    public OrderPlatformModels.FailedOrderLogs getFailedOrderLogs(Integer pageNo, Integer pageSize, String searchType, String searchValue, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FailedOrderLogs> response = null;
            try {
                response = orderPlatformApiList.getFailedOrderLogs(this.companyId, pageNo, pageSize, searchType, searchValue, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FailedOrderLogDetails failedOrderLogDetails(String logId) throws FDKServerResponseError, FDKException {
        return this.failedOrderLogDetails(logId, new HashMap<>());
    }

    public OrderPlatformModels.FailedOrderLogDetails failedOrderLogDetails(String logId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FailedOrderLogDetails> response = null;
            try {
                response = orderPlatformApiList.failedOrderLogDetails(this.companyId, logId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GetActionsResponseSchema getRoleBasedActions() throws FDKServerResponseError, FDKException {
        return this.getRoleBasedActions(new HashMap<>());
    }

    public OrderPlatformModels.GetActionsResponseSchema getRoleBasedActions(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GetActionsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getRoleBasedActions(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderStatusResult checkOrderStatus(OrderPlatformModels.OrderStatus body) throws FDKServerResponseError, FDKException {
        return this.checkOrderStatus(body, new HashMap<>());
    }

    public OrderPlatformModels.OrderStatusResult checkOrderStatus(OrderPlatformModels.OrderStatus body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderStatusResult> response = null;
            try {
                response = orderPlatformApiList.checkOrderStatus(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.UpdateShipmentLockResponseSchema updateShipmentLock(OrderPlatformModels.UpdateShipmentLockPayload body) throws FDKServerResponseError, FDKException {
        return this.updateShipmentLock(body, new HashMap<>());
    }

    public OrderPlatformModels.UpdateShipmentLockResponseSchema updateShipmentLock(OrderPlatformModels.UpdateShipmentLockPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.UpdateShipmentLockResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updateShipmentLock(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateOrderResponseSchema createOrder(OrderPlatformModels.CreateOrderAPI body) throws FDKServerResponseError, FDKException {
        return this.createOrder(body, new HashMap<>());
    }

    public OrderPlatformModels.CreateOrderResponseSchema createOrder(OrderPlatformModels.CreateOrderAPI body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateOrderResponseSchema> response = null;
            try {
                response = orderPlatformApiList.createOrder(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.UpdateShipmentStatusResponseBody updateShipment(OrderPlatformModels.UpdateShipmentActionRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateShipment(body, new HashMap<>());
    }

    public OrderPlatformModels.UpdateShipmentStatusResponseBody updateShipment(OrderPlatformModels.UpdateShipmentActionRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.UpdateShipmentStatusResponseBody> response = null;
            try {
                response = orderPlatformApiList.updateShipment(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderUpdateResponseDetail updateOrder(String orderId, OrderPlatformModels.OrderUpdatePayload body) throws FDKServerResponseError, FDKException {
        return this.updateOrder(orderId, body, new HashMap<>());
    }

    public OrderPlatformModels.OrderUpdateResponseDetail updateOrder(String orderId, OrderPlatformModels.OrderUpdatePayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderUpdateResponseDetail> response = null;
            try {
                response = orderPlatformApiList.updateOrder(this.companyId, orderId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ConfigUpdatedResponseSchema addStateManagerConfig(OrderPlatformModels.TransitionConfigPayload body) throws FDKServerResponseError, FDKException {
        return this.addStateManagerConfig(body, new HashMap<>());
    }

    public OrderPlatformModels.ConfigUpdatedResponseSchema addStateManagerConfig(OrderPlatformModels.TransitionConfigPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ConfigUpdatedResponseSchema> response = null;
            try {
                response = orderPlatformApiList.addStateManagerConfig(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Object getStateManagerConfig(String appId, String orderingChannel, String entity) throws FDKServerResponseError, FDKException {
        return this.getStateManagerConfig(appId, orderingChannel, entity, new HashMap<>());
    }

    public Object getStateManagerConfig(String appId, String orderingChannel, String entity, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
                response = orderPlatformApiList.getStateManagerConfig(this.companyId, appId, orderingChannel, entity, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getShipments(String lane, String bagStatus, Boolean statusOverrideLane, Integer timeToDispatch, String searchType, String searchValue, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean fetchActiveShipment, Boolean allowInactive, Boolean excludeLockedShipments, String paymentMethods, String channelShipmentId, String channelOrderId, String customMeta, String orderingChannel, String companyAffiliateTag, Boolean myOrders, String platformUserId, String sortType, Boolean showCrossCompanyData, String tags, String customerId, String orderType, String operationalStatus, String financialStatus, String logisticsStatus, String parentViewSlug, String childViewSlug, String lockStatus, String groupEntity, Boolean enforceDateFilter) throws FDKServerResponseError, FDKException {
        return this.getShipments(lane, bagStatus, statusOverrideLane, timeToDispatch, searchType, searchValue, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, fetchActiveShipment, allowInactive, excludeLockedShipments, paymentMethods, channelShipmentId, channelOrderId, customMeta, orderingChannel, companyAffiliateTag, myOrders, platformUserId, sortType, showCrossCompanyData, tags, customerId, orderType, operationalStatus, financialStatus, logisticsStatus, parentViewSlug, childViewSlug, lockStatus, groupEntity, enforceDateFilter, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getShipments(String lane, String bagStatus, Boolean statusOverrideLane, Integer timeToDispatch, String searchType, String searchValue, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean fetchActiveShipment, Boolean allowInactive, Boolean excludeLockedShipments, String paymentMethods, String channelShipmentId, String channelOrderId, String customMeta, String orderingChannel, String companyAffiliateTag, Boolean myOrders, String platformUserId, String sortType, Boolean showCrossCompanyData, String tags, String customerId, String orderType, String operationalStatus, String financialStatus, String logisticsStatus, String parentViewSlug, String childViewSlug, String lockStatus, String groupEntity, Boolean enforceDateFilter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipments(this.companyId, lane, bagStatus, statusOverrideLane, timeToDispatch, searchType, searchValue, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, fetchActiveShipment, allowInactive, excludeLockedShipments, paymentMethods, channelShipmentId, channelOrderId, customMeta, orderingChannel, companyAffiliateTag, myOrders, platformUserId, sortType, showCrossCompanyData, tags, customerId, orderType, operationalStatus, financialStatus, logisticsStatus, parentViewSlug, childViewSlug, lockStatus, groupEntity, enforceDateFilter, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getShipments
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> getShipmentsPagination(
        String lane ,
        String bagStatus ,
        Boolean statusOverrideLane ,
        Integer timeToDispatch ,
        String searchType ,
        String searchValue ,
        String startDate ,
        String endDate ,
        String dpIds ,
        String stores ,
        String salesChannels ,
        Integer pageSize ,
        Boolean fetchActiveShipment ,
        Boolean allowInactive ,
        Boolean excludeLockedShipments ,
        String paymentMethods ,
        String channelShipmentId ,
        String channelOrderId ,
        String customMeta ,
        String orderingChannel ,
        String companyAffiliateTag ,
        Boolean myOrders ,
        String platformUserId ,
        String sortType ,
        Boolean showCrossCompanyData ,
        String tags ,
        String customerId ,
        String orderType ,
        String operationalStatus ,
        String financialStatus ,
        String logisticsStatus ,
        String parentViewSlug ,
        String childViewSlug ,
        String lockStatus ,
        String groupEntity ,
        Boolean enforceDateFilter 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema callback = this.getShipments(
                
                 
                 lane,
                 bagStatus,
                 statusOverrideLane,
                 timeToDispatch,
                 searchType,
                 searchValue,
                 startDate,
                 endDate,
                 dpIds,
                 stores,
                 salesChannels,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 fetchActiveShipment,
                 allowInactive,
                 excludeLockedShipments,
                 paymentMethods,
                 channelShipmentId,
                 channelOrderId,
                 customMeta,
                 orderingChannel,
                 companyAffiliateTag,
                 myOrders,
                 platformUserId,
                 sortType,
                 showCrossCompanyData,
                 tags,
                 customerId,
                 orderType,
                 operationalStatus,
                 financialStatus,
                 logisticsStatus,
                 parentViewSlug,
                 childViewSlug,
                 lockStatus,
                 groupEntity,
                 enforceDateFilter
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentInfoResponseSchema getShipmentById(String channelShipmentId, String shipmentId, Boolean fetchActiveShipment) throws FDKServerResponseError, FDKException {
        return this.getShipmentById(channelShipmentId, shipmentId, fetchActiveShipment, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInfoResponseSchema getShipmentById(String channelShipmentId, String shipmentId, Boolean fetchActiveShipment, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInfoResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipmentById(this.companyId, channelShipmentId, shipmentId, fetchActiveShipment, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderDetailsResponseSchema getOrderById(String orderId, Boolean myOrders, Boolean allowInactive) throws FDKServerResponseError, FDKException {
        return this.getOrderById(orderId, myOrders, allowInactive, new HashMap<>());
    }

    public OrderPlatformModels.OrderDetailsResponseSchema getOrderById(String orderId, Boolean myOrders, Boolean allowInactive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderDetailsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getOrderById(this.companyId, orderId, myOrders, allowInactive, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.LaneConfigResponseSchema getLaneConfig(String superLane, String groupEntity, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, String paymentMode, String bagStatus, String searchType, String searchValue, String tags, Integer timeToDispatch, String paymentMethods, Boolean myOrders, Boolean showCrossCompanyData, String orderType) throws FDKServerResponseError, FDKException {
        return this.getLaneConfig(superLane, groupEntity, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, paymentMode, bagStatus, searchType, searchValue, tags, timeToDispatch, paymentMethods, myOrders, showCrossCompanyData, orderType, new HashMap<>());
    }

    public OrderPlatformModels.LaneConfigResponseSchema getLaneConfig(String superLane, String groupEntity, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, String paymentMode, String bagStatus, String searchType, String searchValue, String tags, Integer timeToDispatch, String paymentMethods, Boolean myOrders, Boolean showCrossCompanyData, String orderType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.LaneConfigResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getLaneConfig(this.companyId, superLane, groupEntity, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, paymentMode, bagStatus, searchType, searchValue, tags, timeToDispatch, paymentMethods, myOrders, showCrossCompanyData, orderType, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderListingResponseSchema getOrders(String lane, String searchType, String bagStatus, Integer timeToDispatch, String paymentMethods, String tags, String searchValue, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean isPrioritySort, List<Object> customMeta, Boolean myOrders, Boolean showCrossCompanyData, String customerId, String orderType, String operationalStatus, String financialStatus, String logisticsStatus, String parentViewSlug, String childViewSlug, String groupEntity, Boolean enforceDateFilter) throws FDKServerResponseError, FDKException {
        return this.getOrders(lane, searchType, bagStatus, timeToDispatch, paymentMethods, tags, searchValue, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, isPrioritySort, customMeta, myOrders, showCrossCompanyData, customerId, orderType, operationalStatus, financialStatus, logisticsStatus, parentViewSlug, childViewSlug, groupEntity, enforceDateFilter, new HashMap<>());
    }

    public OrderPlatformModels.OrderListingResponseSchema getOrders(String lane, String searchType, String bagStatus, Integer timeToDispatch, String paymentMethods, String tags, String searchValue, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean isPrioritySort, List<Object> customMeta, Boolean myOrders, Boolean showCrossCompanyData, String customerId, String orderType, String operationalStatus, String financialStatus, String logisticsStatus, String parentViewSlug, String childViewSlug, String groupEntity, Boolean enforceDateFilter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderListingResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getOrders(this.companyId, lane, searchType, bagStatus, timeToDispatch, paymentMethods, tags, searchValue, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, isPrioritySort, customMeta, myOrders, showCrossCompanyData, customerId, orderType, operationalStatus, financialStatus, logisticsStatus, parentViewSlug, childViewSlug, groupEntity, enforceDateFilter, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrders
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<OrderPlatformModels.OrderListingResponseSchema> getOrdersPagination(
        String lane ,
        String searchType ,
        String bagStatus ,
        Integer timeToDispatch ,
        String paymentMethods ,
        String tags ,
        String searchValue ,
        String fromDate ,
        String toDate ,
        String startDate ,
        String endDate ,
        String dpIds ,
        String stores ,
        String salesChannels ,
        Integer pageSize ,
        Boolean isPrioritySort ,
        List<Object> customMeta ,
        Boolean myOrders ,
        Boolean showCrossCompanyData ,
        String customerId ,
        String orderType ,
        String operationalStatus ,
        String financialStatus ,
        String logisticsStatus ,
        String parentViewSlug ,
        String childViewSlug ,
        String groupEntity ,
        Boolean enforceDateFilter 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<OrderPlatformModels.OrderListingResponseSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            OrderPlatformModels.OrderListingResponseSchema callback = this.getOrders(
                
                 
                 lane,
                 searchType,
                 bagStatus,
                 timeToDispatch,
                 paymentMethods,
                 tags,
                 searchValue,
                 fromDate,
                 toDate,
                 startDate,
                 endDate,
                 dpIds,
                 stores,
                 salesChannels,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 isPrioritySort,
                 customMeta,
                 myOrders,
                 showCrossCompanyData,
                 customerId,
                 orderType,
                 operationalStatus,
                 financialStatus,
                 logisticsStatus,
                 parentViewSlug,
                 childViewSlug,
                 groupEntity,
                 enforceDateFilter
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateUserViewPosition(OrderPlatformModels.UserViewPosition body) throws FDKServerResponseError, FDKException {
        return this.updateUserViewPosition(body, new HashMap<>());
    }

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateUserViewPosition(OrderPlatformModels.UserViewPosition body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateUpdateDeleteResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updateUserViewPosition(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.UserViewsResponseSchema getUserViews(String showIn) throws FDKServerResponseError, FDKException {
        return this.getUserViews(showIn, new HashMap<>());
    }

    public OrderPlatformModels.UserViewsResponseSchema getUserViews(String showIn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.UserViewsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getUserViews(this.companyId, showIn, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema addUserViews(OrderPlatformModels.UserViewsResponseSchema body) throws FDKServerResponseError, FDKException {
        return this.addUserViews(body, new HashMap<>());
    }

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema addUserViews(OrderPlatformModels.UserViewsResponseSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateUpdateDeleteResponseSchema> response = null;
            try {
                response = orderPlatformApiList.addUserViews(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateUserViews(OrderPlatformModels.UserViewsResponseSchema body) throws FDKServerResponseError, FDKException {
        return this.updateUserViews(body, new HashMap<>());
    }

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateUserViews(OrderPlatformModels.UserViewsResponseSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateUpdateDeleteResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updateUserViews(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema deleteUserViews(String viewId) throws FDKServerResponseError, FDKException {
        return this.deleteUserViews(viewId, new HashMap<>());
    }

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema deleteUserViews(String viewId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateUpdateDeleteResponseSchema> response = null;
            try {
                response = orderPlatformApiList.deleteUserViews(this.companyId, viewId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GlobalFiltersResponseSchema getGlobalFilters(String showIn) throws FDKServerResponseError, FDKException {
        return this.getGlobalFilters(showIn, new HashMap<>());
    }

    public OrderPlatformModels.GlobalFiltersResponseSchema getGlobalFilters(String showIn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GlobalFiltersResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getGlobalFilters(this.companyId, showIn, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FiltersResponseSchema getfilters(String view, String groupEntity) throws FDKServerResponseError, FDKException {
        return this.getfilters(view, groupEntity, new HashMap<>());
    }

    public OrderPlatformModels.FiltersResponseSchema getfilters(String view, String groupEntity, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FiltersResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getfilters(this.companyId, view, groupEntity, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.TemplateDownloadResponseSchema getBulkShipmentExcelFile(String salesChannels, String dpIds, String startDate, String endDate, String stores, String tags, String bagStatus, String paymentMethods, String fileType, Integer timeToDispatch, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getBulkShipmentExcelFile(salesChannels, dpIds, startDate, endDate, stores, tags, bagStatus, paymentMethods, fileType, timeToDispatch, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.TemplateDownloadResponseSchema getBulkShipmentExcelFile(String salesChannels, String dpIds, String startDate, String endDate, String stores, String tags, String bagStatus, String paymentMethods, String fileType, Integer timeToDispatch, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.TemplateDownloadResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getBulkShipmentExcelFile(this.companyId, salesChannels, dpIds, startDate, endDate, stores, tags, bagStatus, paymentMethods, fileType, timeToDispatch, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BulkActionTemplateResponseSchema getBulkActionTemplate() throws FDKServerResponseError, FDKException {
        return this.getBulkActionTemplate(new HashMap<>());
    }

    public OrderPlatformModels.BulkActionTemplateResponseSchema getBulkActionTemplate(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BulkActionTemplateResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getBulkActionTemplate(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.TemplateDownloadResponseSchema downloadBulkActionTemplate(String templateSlug) throws FDKServerResponseError, FDKException {
        return this.downloadBulkActionTemplate(templateSlug, new HashMap<>());
    }

    public OrderPlatformModels.TemplateDownloadResponseSchema downloadBulkActionTemplate(String templateSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.TemplateDownloadResponseSchema> response = null;
            try {
                response = orderPlatformApiList.downloadBulkActionTemplate(this.companyId, templateSlug, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.PlatformShipmentReasonsResponseSchema getShipmentReasons(String shipmentId, String bagId, String state) throws FDKServerResponseError, FDKException {
        return this.getShipmentReasons(shipmentId, bagId, state, new HashMap<>());
    }

    public OrderPlatformModels.PlatformShipmentReasonsResponseSchema getShipmentReasons(String shipmentId, String bagId, String state, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.PlatformShipmentReasonsResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipmentReasons(this.companyId, shipmentId, bagId, state, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BagDetailsPlatformResponseSchema getBagById(String bagId, String channelBagId, String channelId) throws FDKServerResponseError, FDKException {
        return this.getBagById(bagId, channelBagId, channelId, new HashMap<>());
    }

    public OrderPlatformModels.BagDetailsPlatformResponseSchema getBagById(String bagId, String channelBagId, String channelId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BagDetailsPlatformResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getBagById(this.companyId, bagId, channelBagId, channelId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GetBagsPlatformResponseSchema getBags(String bagIds, String shipmentIds, String orderIds, String channelBagIds, String channelShipmentIds, String channelOrderIds, String channelId, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getBags(bagIds, shipmentIds, orderIds, channelBagIds, channelShipmentIds, channelOrderIds, channelId, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.GetBagsPlatformResponseSchema getBags(String bagIds, String shipmentIds, String orderIds, String channelBagIds, String channelShipmentIds, String channelOrderIds, String channelId, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GetBagsPlatformResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getBags(this.companyId, bagIds, shipmentIds, orderIds, channelBagIds, channelShipmentIds, channelOrderIds, channelId, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GeneratePosOrderReceiptResponseSchema generatePOSReceiptByOrderId(String orderId, String shipmentId, String documentType) throws FDKServerResponseError, FDKException {
        return this.generatePOSReceiptByOrderId(orderId, shipmentId, documentType, new HashMap<>());
    }

    public OrderPlatformModels.GeneratePosOrderReceiptResponseSchema generatePOSReceiptByOrderId(String orderId, String shipmentId, String documentType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GeneratePosOrderReceiptResponseSchema> response = null;
            try {
                response = orderPlatformApiList.generatePOSReceiptByOrderId(this.companyId, orderId, shipmentId, documentType, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.AllowedTemplatesResponseSchema getAllowedTemplatesForBulk() throws FDKServerResponseError, FDKException {
        return this.getAllowedTemplatesForBulk(new HashMap<>());
    }

    public OrderPlatformModels.AllowedTemplatesResponseSchema getAllowedTemplatesForBulk(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.AllowedTemplatesResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getAllowedTemplatesForBulk(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.TemplateDownloadResponseSchema getTemplate(String templateName) throws FDKServerResponseError, FDKException {
        return this.getTemplate(templateName, new HashMap<>());
    }

    public OrderPlatformModels.TemplateDownloadResponseSchema getTemplate(String templateName, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.TemplateDownloadResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getTemplate(this.companyId, templateName, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderConfig getOrderConfig(String appId) throws FDKServerResponseError, FDKException {
        return this.getOrderConfig(appId, new HashMap<>());
    }

    public OrderPlatformModels.OrderConfig getOrderConfig(String appId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderConfig> response = null;
            try {
                response = orderPlatformApiList.getOrderConfig(this.companyId, appId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateOrderConfig(String appId, OrderPlatformModels.ConfigData body) throws FDKServerResponseError, FDKException {
        return this.updateOrderConfig(appId, body, new HashMap<>());
    }

    public OrderPlatformModels.CreateUpdateDeleteResponseSchema updateOrderConfig(String appId, OrderPlatformModels.ConfigData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateUpdateDeleteResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updateOrderConfig(this.companyId, appId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public Object getQuestions(Integer pageNo, Integer pageSize, String q, Boolean isActive) throws FDKServerResponseError, FDKException {
        return this.getQuestions(pageNo, pageSize, q, isActive, new HashMap<>());
    }

    public Object getQuestions(Integer pageNo, Integer pageSize, String q, Boolean isActive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
            response = orderPlatformApiList.getQuestions(this.companyId, this.applicationId, pageNo, pageSize, q, isActive, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.LaneRuleConfigSchema getRuleLaneConfig(String searchValue) throws FDKServerResponseError, FDKException {
        return this.getRuleLaneConfig(searchValue, new HashMap<>());
    }

    public OrderPlatformModels.LaneRuleConfigSchema getRuleLaneConfig(String searchValue, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.LaneRuleConfigSchema> response = null;
            try {
            response = orderPlatformApiList.getRuleLaneConfig(this.companyId, this.applicationId, searchValue, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleSuccessResponseSchema createRule(OrderPlatformModels.RuleRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createRule(body, new HashMap<>());
    }

    public OrderPlatformModels.RuleSuccessResponseSchema createRule(OrderPlatformModels.RuleRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleSuccessResponseSchema> response = null;
            try {
            response = orderPlatformApiList.createRule(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleResponseSchema getRuleById(String ruleId) throws FDKServerResponseError, FDKException {
        return this.getRuleById(ruleId, new HashMap<>());
    }

    public OrderPlatformModels.RuleResponseSchema getRuleById(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getRuleById(this.companyId, this.applicationId, ruleId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleSuccessResponseSchema updateRule(String ruleId, OrderPlatformModels.RuleUpdateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateRule(ruleId, body, new HashMap<>());
    }

    public OrderPlatformModels.RuleSuccessResponseSchema updateRule(String ruleId, OrderPlatformModels.RuleUpdateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleSuccessResponseSchema> response = null;
            try {
            response = orderPlatformApiList.updateRule(this.companyId, this.applicationId, ruleId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleSuccessResponseSchema deleteRule(String ruleId) throws FDKServerResponseError, FDKException {
        return this.deleteRule(ruleId, new HashMap<>());
    }

    public OrderPlatformModels.RuleSuccessResponseSchema deleteRule(String ruleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleSuccessResponseSchema> response = null;
            try {
            response = orderPlatformApiList.deleteRule(this.companyId, this.applicationId, ruleId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleListResponseSchema updateRulePosition(OrderPlatformModels.UpdateRulePositionRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateRulePosition(body, new HashMap<>());
    }

    public OrderPlatformModels.RuleListResponseSchema updateRulePosition(OrderPlatformModels.UpdateRulePositionRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleListResponseSchema> response = null;
            try {
            response = orderPlatformApiList.updateRulePosition(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleParametersResponseSchema getRuleParameters() throws FDKServerResponseError, FDKException {
        return this.getRuleParameters(new HashMap<>());
    }

    public OrderPlatformModels.RuleParametersResponseSchema getRuleParameters(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleParametersResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getRuleParameters(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.RuleListResponseSchema getRuleList(OrderPlatformModels.RuleListRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.getRuleList(body, new HashMap<>());
    }

    public OrderPlatformModels.RuleListResponseSchema getRuleList(OrderPlatformModels.RuleListRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleListResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getRuleList(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId, Integer lineNumber, String bagId) throws FDKServerResponseError, FDKException {
        return this.getShipmentBagReasons(shipmentId, lineNumber, bagId, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId, Integer lineNumber, String bagId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentBagReasons> response = null;
            try {
            response = orderPlatformApiList.getShipmentBagReasons(this.companyId, this.applicationId, shipmentId, lineNumber, bagId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getApplicationShipments(String lane, String searchType, String searchId, String searchValue, String fromDate, String toDate, String dpIds, String orderingCompanyId, String stores, String salesChannel, String requestByExt, Integer pageNo, Integer pageSize, String customerId, Boolean isPrioritySort, Boolean excludeLockedShipments) throws FDKServerResponseError, FDKException {
        return this.getApplicationShipments(lane, searchType, searchId, searchValue, fromDate, toDate, dpIds, orderingCompanyId, stores, salesChannel, requestByExt, pageNo, pageSize, customerId, isPrioritySort, excludeLockedShipments, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getApplicationShipments(String lane, String searchType, String searchId, String searchValue, String fromDate, String toDate, String dpIds, String orderingCompanyId, String stores, String salesChannel, String requestByExt, Integer pageNo, Integer pageSize, String customerId, Boolean isPrioritySort, Boolean excludeLockedShipments, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getApplicationShipments(this.companyId, this.applicationId, lane, searchType, searchId, searchValue, fromDate, toDate, dpIds, orderingCompanyId, stores, salesChannel, requestByExt, pageNo, pageSize, customerId, isPrioritySort, excludeLockedShipments, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.PlatformShipmentTrack trackShipmentPlatform(String shipmentId) throws FDKServerResponseError, FDKException {
        return this.trackShipmentPlatform(shipmentId, new HashMap<>());
    }

    public OrderPlatformModels.PlatformShipmentTrack trackShipmentPlatform(String shipmentId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.PlatformShipmentTrack> response = null;
            try {
            response = orderPlatformApiList.trackShipmentPlatform(this.companyId, this.applicationId, shipmentId, requestHeaders).execute();
                if (!response.isSuccessful()) {
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

    public OrderPlatformModels.ShipmentReasonsResponseSchema getPlatformShipmentReasons(String action) throws FDKServerResponseError, FDKException {
        return this.getPlatformShipmentReasons(action, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentReasonsResponseSchema getPlatformShipmentReasons(String action, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentReasonsResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getPlatformShipmentReasons(this.companyId, this.applicationId, action, requestHeaders).execute();
                if (!response.isSuccessful()) {
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