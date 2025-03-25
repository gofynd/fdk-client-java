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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BaseResponseSchema updateAddress(String shipmentId, OrderPlatformModels.UpdateAddressRequestBody body) throws FDKServerResponseError, FDKException {
        return this.updateAddress(shipmentId, body, new HashMap<>());
    }

    public OrderPlatformModels.BaseResponseSchema updateAddress(String shipmentId, OrderPlatformModels.UpdateAddressRequestBody body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BaseResponseSchema> response = null;
            try {
                response = orderPlatformApiList.updateAddress(this.companyId, shipmentId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.BaseResponseSchema sendSmsNinja(OrderPlatformModels.SendSmsPayload body) throws FDKServerResponseError, FDKException {
        return this.sendSmsNinja(body, new HashMap<>());
    }

    public OrderPlatformModels.BaseResponseSchema sendSmsNinja(OrderPlatformModels.SendSmsPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.BaseResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateOrderResponseSchema createOrder(String xOrderingSource, OrderPlatformModels.CreateOrderAPI body) throws FDKServerResponseError, FDKException {
        return this.createOrder(xOrderingSource, body, new HashMap<>());
    }

    public OrderPlatformModels.CreateOrderResponseSchema createOrder(String xOrderingSource, OrderPlatformModels.CreateOrderAPI body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateChannelConfigData getChannelConfig() throws FDKServerResponseError, FDKException {
        return this.getChannelConfig(new HashMap<>());
    }

    public OrderPlatformModels.CreateChannelConfigData getChannelConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateChannelConfigData> response = null;
            try {
                response = orderPlatformApiList.getChannelConfig(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CreateChannelConfigResponseSchema createChannelConfig(OrderPlatformModels.CreateChannelConfigData body) throws FDKServerResponseError, FDKException {
        return this.createChannelConfig(body, new HashMap<>());
    }

    public OrderPlatformModels.CreateChannelConfigResponseSchema createChannelConfig(OrderPlatformModels.CreateChannelConfigData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CreateChannelConfigResponseSchema> response = null;
            try {
                response = orderPlatformApiList.createChannelConfig(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.RoleBaseStateTransitionMapping getAllowedStateTransition(String orderingChannel, String orderingSource, String status) throws FDKServerResponseError, FDKException {
        return this.getAllowedStateTransition(orderingChannel, orderingSource, status, new HashMap<>());
    }

    public OrderPlatformModels.RoleBaseStateTransitionMapping getAllowedStateTransition(String orderingChannel, String orderingSource, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RoleBaseStateTransitionMapping> response = null;
            try {
                response = orderPlatformApiList.getAllowedStateTransition(this.companyId, orderingChannel, orderingSource, status, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ManifestShipmentListing getManifestShipments(String dpIds, Integer stores, String toDate, String fromDate, String dpName, String salesChannels, String searchType, String searchValue, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getManifestShipments(dpIds, stores, toDate, fromDate, dpName, salesChannels, searchType, searchValue, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.ManifestShipmentListing getManifestShipments(String dpIds, Integer stores, String toDate, String fromDate, String dpName, String salesChannels, String searchType, String searchValue, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ManifestShipmentListing> response = null;
            try {
                response = orderPlatformApiList.getManifestShipments(this.companyId, dpIds, stores, toDate, fromDate, dpName, salesChannels, searchType, searchValue, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ManifestList getManifests(String status, String startDate, String endDate, String searchType, Integer storeId, String searchValue, String dpIds, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getManifests(status, startDate, endDate, searchType, storeId, searchValue, dpIds, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.ManifestList getManifests(String status, String startDate, String endDate, String searchType, Integer storeId, String searchValue, String dpIds, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ManifestList> response = null;
            try {
                response = orderPlatformApiList.getManifests(this.companyId, status, startDate, endDate, searchType, storeId, searchValue, dpIds, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ManifestResponseSchema generateProcessManifest(OrderPlatformModels.ProcessManifestRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.generateProcessManifest(body, new HashMap<>());
    }

    public OrderPlatformModels.ManifestResponseSchema generateProcessManifest(OrderPlatformModels.ProcessManifestRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ManifestResponseSchema> response = null;
            try {
                response = orderPlatformApiList.generateProcessManifest(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ManifestDetails getManifestDetails(String manifestId, String dpIds, String endDate, String startDate, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getManifestDetails(manifestId, dpIds, endDate, startDate, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.ManifestDetails getManifestDetails(String manifestId, String dpIds, String endDate, String startDate, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ManifestDetails> response = null;
            try {
                response = orderPlatformApiList.getManifestDetails(this.companyId, manifestId, dpIds, endDate, startDate, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.SuccessResponseSchema dispatchManifests(OrderPlatformModels.DispatchManifest body) throws FDKServerResponseError, FDKException {
        return this.dispatchManifests(body, new HashMap<>());
    }

    public OrderPlatformModels.SuccessResponseSchema dispatchManifests(OrderPlatformModels.DispatchManifest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.SuccessResponseSchema> response = null;
            try {
                response = orderPlatformApiList.dispatchManifests(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.SuccessResponseSchema uploadConsents(OrderPlatformModels.UploadManifestConsent body) throws FDKServerResponseError, FDKException {
        return this.uploadConsents(body, new HashMap<>());
    }

    public OrderPlatformModels.SuccessResponseSchema uploadConsents(OrderPlatformModels.UploadManifestConsent body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.SuccessResponseSchema> response = null;
            try {
                response = orderPlatformApiList.uploadConsents(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CourierPartnerTrackingResponseSchema trackShipment(String shipmentId, String awb, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.trackShipment(shipmentId, awb, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.CourierPartnerTrackingResponseSchema trackShipment(String shipmentId, String awb, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CourierPartnerTrackingResponseSchema> response = null;
            try {
                response = orderPlatformApiList.trackShipment(this.companyId, shipmentId, awb, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.CourierPartnerTrackingDetails updateShipmentTracking(OrderPlatformModels.CourierPartnerTrackingDetails body) throws FDKServerResponseError, FDKException {
        return this.updateShipmentTracking(body, new HashMap<>());
    }

    public OrderPlatformModels.CourierPartnerTrackingDetails updateShipmentTracking(OrderPlatformModels.CourierPartnerTrackingDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.CourierPartnerTrackingDetails> response = null;
            try {
                response = orderPlatformApiList.updateShipmentTracking(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FailedOrderLogs failedOrderLogs(String applicationId, Integer pageNo, Integer pageSize, String searchType, String searchValue) throws FDKServerResponseError, FDKException {
        return this.failedOrderLogs(applicationId, pageNo, pageSize, searchType, searchValue, new HashMap<>());
    }

    public OrderPlatformModels.FailedOrderLogs failedOrderLogs(String applicationId, Integer pageNo, Integer pageSize, String searchType, String searchValue, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FailedOrderLogs> response = null;
            try {
                response = orderPlatformApiList.failedOrderLogs(this.companyId, applicationId, pageNo, pageSize, searchType, searchValue, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.GenerateInvoiceIDResponseSchema generateInvoiceID(String invoiceType, OrderPlatformModels.GenerateInvoiceIDRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.generateInvoiceID(invoiceType, body, new HashMap<>());
    }

    public OrderPlatformModels.GenerateInvoiceIDResponseSchema generateInvoiceID(String invoiceType, OrderPlatformModels.GenerateInvoiceIDRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.GenerateInvoiceIDResponseSchema> response = null;
            try {
                response = orderPlatformApiList.generateInvoiceID(this.companyId, invoiceType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Object getStateManagerConfig(String appId, String orderingChannel, String orderingSource, String entity) throws FDKServerResponseError, FDKException {
        return this.getStateManagerConfig(appId, orderingChannel, orderingSource, entity, new HashMap<>());
    }

    public Object getStateManagerConfig(String appId, String orderingChannel, String orderingSource, String entity, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
                response = orderPlatformApiList.getStateManagerConfig(this.companyId, appId, orderingChannel, orderingSource, entity, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Object updatePaymentInfo(OrderPlatformModels.UpdateShipmentPaymentMode body) throws FDKServerResponseError, FDKException {
        return this.updatePaymentInfo(body, new HashMap<>());
    }

    public Object updatePaymentInfo(OrderPlatformModels.UpdateShipmentPaymentMode body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
                response = orderPlatformApiList.updatePaymentInfo(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getShipments(String lane, String bagStatus, String statusAssigned, Boolean statusOverrideLane, Integer timeToDispatch, String searchType, String searchValue, String fromDate, String toDate, String startDate, String endDate, String statusAssignedStartDate, String statusAssignedEndDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean fetchActiveShipment, Boolean allowInactive, Boolean excludeLockedShipments, String paymentMethods, String channelShipmentId, String channelOrderId, String customMeta, String orderingChannel, String companyAffiliateTag, Boolean myOrders, String platformUserId, String sortType, Boolean showCrossCompanyData, String tags, String customerId, String orderType, String groupEntity, Boolean enforceDateFilter, String fulfillmentType) throws FDKServerResponseError, FDKException {
        return this.getShipments(lane, bagStatus, statusAssigned, statusOverrideLane, timeToDispatch, searchType, searchValue, fromDate, toDate, startDate, endDate, statusAssignedStartDate, statusAssignedEndDate, dpIds, stores, salesChannels, pageNo, pageSize, fetchActiveShipment, allowInactive, excludeLockedShipments, paymentMethods, channelShipmentId, channelOrderId, customMeta, orderingChannel, companyAffiliateTag, myOrders, platformUserId, sortType, showCrossCompanyData, tags, customerId, orderType, groupEntity, enforceDateFilter, fulfillmentType, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getShipments(String lane, String bagStatus, String statusAssigned, Boolean statusOverrideLane, Integer timeToDispatch, String searchType, String searchValue, String fromDate, String toDate, String startDate, String endDate, String statusAssignedStartDate, String statusAssignedEndDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean fetchActiveShipment, Boolean allowInactive, Boolean excludeLockedShipments, String paymentMethods, String channelShipmentId, String channelOrderId, String customMeta, String orderingChannel, String companyAffiliateTag, Boolean myOrders, String platformUserId, String sortType, Boolean showCrossCompanyData, String tags, String customerId, String orderType, String groupEntity, Boolean enforceDateFilter, String fulfillmentType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipments(this.companyId, lane, bagStatus, statusAssigned, statusOverrideLane, timeToDispatch, searchType, searchValue, fromDate, toDate, startDate, endDate, statusAssignedStartDate, statusAssignedEndDate, dpIds, stores, salesChannels, pageNo, pageSize, fetchActiveShipment, allowInactive, excludeLockedShipments, paymentMethods, channelShipmentId, channelOrderId, customMeta, orderingChannel, companyAffiliateTag, myOrders, platformUserId, sortType, showCrossCompanyData, tags, customerId, orderType, groupEntity, enforceDateFilter, fulfillmentType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
        String statusAssigned ,
        Boolean statusOverrideLane ,
        Integer timeToDispatch ,
        String searchType ,
        String searchValue ,
        String fromDate ,
        String toDate ,
        String startDate ,
        String endDate ,
        String statusAssignedStartDate ,
        String statusAssignedEndDate ,
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
        String groupEntity ,
        Boolean enforceDateFilter ,
        String fulfillmentType 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema callback = this.getShipments(
                
                 
                 lane,
                 bagStatus,
                 statusAssigned,
                 statusOverrideLane,
                 timeToDispatch,
                 searchType,
                 searchValue,
                 fromDate,
                 toDate,
                 startDate,
                 endDate,
                 statusAssignedStartDate,
                 statusAssignedEndDate,
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
                 groupEntity,
                 enforceDateFilter,
                 fulfillmentType
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.ShipmentInfoResponseSchema getShipmentById(String channelShipmentId, String shipmentId, Boolean fetchActiveShipment, Boolean allowInactive) throws FDKServerResponseError, FDKException {
        return this.getShipmentById(channelShipmentId, shipmentId, fetchActiveShipment, allowInactive, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInfoResponseSchema getShipmentById(String channelShipmentId, String shipmentId, Boolean fetchActiveShipment, Boolean allowInactive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInfoResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getShipmentById(this.companyId, channelShipmentId, shipmentId, fetchActiveShipment, allowInactive, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.OrderListingResponseSchema getOrders(String lane, String searchType, String bagStatus, Integer timeToDispatch, String paymentMethods, String tags, String searchValue, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean isPrioritySort, String customMeta, Boolean myOrders, Boolean showCrossCompanyData, String customerId, String orderType, Boolean allowInactive, String groupEntity, Boolean enforceDateFilter, String fulfillmentType) throws FDKServerResponseError, FDKException {
        return this.getOrders(lane, searchType, bagStatus, timeToDispatch, paymentMethods, tags, searchValue, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, isPrioritySort, customMeta, myOrders, showCrossCompanyData, customerId, orderType, allowInactive, groupEntity, enforceDateFilter, fulfillmentType, new HashMap<>());
    }

    public OrderPlatformModels.OrderListingResponseSchema getOrders(String lane, String searchType, String bagStatus, Integer timeToDispatch, String paymentMethods, String tags, String searchValue, String fromDate, String toDate, String startDate, String endDate, String dpIds, String stores, String salesChannels, Integer pageNo, Integer pageSize, Boolean isPrioritySort, String customMeta, Boolean myOrders, Boolean showCrossCompanyData, String customerId, String orderType, Boolean allowInactive, String groupEntity, Boolean enforceDateFilter, String fulfillmentType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.OrderListingResponseSchema> response = null;
            try {
                response = orderPlatformApiList.getOrders(this.companyId, lane, searchType, bagStatus, timeToDispatch, paymentMethods, tags, searchValue, fromDate, toDate, startDate, endDate, dpIds, stores, salesChannels, pageNo, pageSize, isPrioritySort, customMeta, myOrders, showCrossCompanyData, customerId, orderType, allowInactive, groupEntity, enforceDateFilter, fulfillmentType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
        String customMeta ,
        Boolean myOrders ,
        Boolean showCrossCompanyData ,
        String customerId ,
        String orderType ,
        Boolean allowInactive ,
        String groupEntity ,
        Boolean enforceDateFilter ,
        String fulfillmentType 
        
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
                 allowInactive,
                 groupEntity,
                 enforceDateFilter,
                 fulfillmentType
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FileResponseSchema getBulkShipmentExcelFile(String salesChannels, String dpIds, String startDate, String endDate, String stores, String tags, String bagStatus, String paymentMethods, String fileType, Integer timeToDispatch, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getBulkShipmentExcelFile(salesChannels, dpIds, startDate, endDate, stores, tags, bagStatus, paymentMethods, fileType, timeToDispatch, pageNo, pageSize, new HashMap<>());
    }

    public OrderPlatformModels.FileResponseSchema getBulkShipmentExcelFile(String salesChannels, String dpIds, String startDate, String endDate, String stores, String tags, String bagStatus, String paymentMethods, String fileType, Integer timeToDispatch, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FileResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public OrderPlatformModels.FileResponseSchema downloadBulkActionTemplate(String templateSlug) throws FDKServerResponseError, FDKException {
        return this.downloadBulkActionTemplate(templateSlug, new HashMap<>());
    }

    public OrderPlatformModels.FileResponseSchema downloadBulkActionTemplate(String templateSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.FileResponseSchema> response = null;
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
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public OrderPlatformModels.RuleListResponseSchema getRules(OrderPlatformModels.RuleListRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.getRules(body, new HashMap<>());
    }

    public OrderPlatformModels.RuleListResponseSchema getRules(OrderPlatformModels.RuleListRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.RuleListResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getRules(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public OrderPlatformModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId, Integer lineNumber) throws FDKServerResponseError, FDKException {
        return this.getShipmentBagReasons(shipmentId, lineNumber, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId, Integer lineNumber, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentBagReasons> response = null;
            try {
            response = orderPlatformApiList.getShipmentBagReasons(this.companyId, this.applicationId, shipmentId, lineNumber, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getApplicationShipments(String lane, String searchType, String searchId, String fromDate, String toDate, String dpIds, String orderingCompanyId, String stores, String salesChannel, String requestByExt, Integer pageNo, Integer pageSize, String customerId, Boolean isPrioritySort, Boolean excludeLockedShipments) throws FDKServerResponseError, FDKException {
        return this.getApplicationShipments(lane, searchType, searchId, fromDate, toDate, dpIds, orderingCompanyId, stores, salesChannel, requestByExt, pageNo, pageSize, customerId, isPrioritySort, excludeLockedShipments, new HashMap<>());
    }

    public OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema getApplicationShipments(String lane, String searchType, String searchId, String fromDate, String toDate, String dpIds, String orderingCompanyId, String stores, String salesChannel, String requestByExt, Integer pageNo, Integer pageSize, String customerId, Boolean isPrioritySort, Boolean excludeLockedShipments, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<OrderPlatformModels.ShipmentInternalPlatformViewResponseSchema> response = null;
            try {
            response = orderPlatformApiList.getApplicationShipments(this.companyId, this.applicationId, lane, searchType, searchId, fromDate, toDate, dpIds, orderingCompanyId, stores, salesChannel, requestByExt, pageNo, pageSize, customerId, isPrioritySort, excludeLockedShipments, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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