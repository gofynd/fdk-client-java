package com.sdk.partner.webhook;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;


public class WebhookPartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private WebhookPartnerApiList webhookPartnerApiList;

    public WebhookPartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.partnerConfig.getOrganizationId();
        this.webhookPartnerApiList = generateWebhookPartnerApiList(this.partnerConfig.getPersistentCookieStore());
    }

    private WebhookPartnerApiList generateWebhookPartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(partnerConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(partnerConfig.getDomain(),WebhookPartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.ResponseTimeTs responseTimeSummary(String extensionId, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.responseTimeSummary(extensionId, startDate, endDate, new HashMap<>());
    }

    public WebhookPartnerModels.ResponseTimeTs responseTimeSummary(String extensionId, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.ResponseTimeTs> response = null;
            try {
                response = webhookPartnerApiList.responseTimeSummary(this.organizationId, extensionId, startDate, endDate, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.DeliverySummaryResponse fetchDeliverySummary(String extensionId, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.fetchDeliverySummary(extensionId, startDate, endDate, new HashMap<>());
    }

    public WebhookPartnerModels.DeliverySummaryResponse fetchDeliverySummary(String extensionId, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.DeliverySummaryResponse> response = null;
            try {
                response = webhookPartnerApiList.fetchDeliverySummary(this.organizationId, extensionId, startDate, endDate, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.DeliveryDetailsResponse getDeliveryDetailInsights(String extensionId, WebhookPartnerModels.DeliveryDetailsRequest body) throws FDKServerResponseError, FDKException {
        return this.getDeliveryDetailInsights(extensionId, body, new HashMap<>());
    }

    public WebhookPartnerModels.DeliveryDetailsResponse getDeliveryDetailInsights(String extensionId, WebhookPartnerModels.DeliveryDetailsRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.DeliveryDetailsResponse> response = null;
            try {
                response = webhookPartnerApiList.getDeliveryDetailInsights(this.organizationId, extensionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.DeliveryTsResponse fetchDeliveryTs(String extensionId, String startDate, String endDate) throws FDKServerResponseError, FDKException {
        return this.fetchDeliveryTs(extensionId, startDate, endDate, new HashMap<>());
    }

    public WebhookPartnerModels.DeliveryTsResponse fetchDeliveryTs(String extensionId, String startDate, String endDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.DeliveryTsResponse> response = null;
            try {
                response = webhookPartnerApiList.fetchDeliveryTs(this.organizationId, extensionId, startDate, endDate, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public List<WebhookPartnerModels.FilterReportResponse> fetchReportFilters(String extensionId, String startDate, String endDate, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.fetchReportFilters(extensionId, startDate, endDate, pageNo, pageSize, new HashMap<>());
    }

    public List<WebhookPartnerModels.FilterReportResponse> fetchReportFilters(String extensionId, String startDate, String endDate, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<List<WebhookPartnerModels.FilterReportResponse>> response = null;
            try {
                response = webhookPartnerApiList.fetchReportFilters(this.organizationId, extensionId, startDate, endDate, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.CancelDownloadResponse cancelReportDownload(String extensionId, String filename) throws FDKServerResponseError, FDKException {
        return this.cancelReportDownload(extensionId, filename, new HashMap<>());
    }

    public WebhookPartnerModels.CancelDownloadResponse cancelReportDownload(String extensionId, String filename, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.CancelDownloadResponse> response = null;
            try {
                response = webhookPartnerApiList.cancelReportDownload(this.organizationId, extensionId, filename, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.HistoryResponse getHistoricalReports(String extensionId, WebhookPartnerModels.HistoryPayload body) throws FDKServerResponseError, FDKException {
        return this.getHistoricalReports(extensionId, body, new HashMap<>());
    }

    public WebhookPartnerModels.HistoryResponse getHistoricalReports(String extensionId, WebhookPartnerModels.HistoryPayload body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.HistoryResponse> response = null;
            try {
                response = webhookPartnerApiList.getHistoricalReports(this.organizationId, extensionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public List<WebhookPartnerModels.InvalidEventsResponse> getInvalidEventList(String extensionId, WebhookPartnerModels.InvalidEventsRequest body) throws FDKServerResponseError, FDKException {
        return this.getInvalidEventList(extensionId, body, new HashMap<>());
    }

    public List<WebhookPartnerModels.InvalidEventsResponse> getInvalidEventList(String extensionId, WebhookPartnerModels.InvalidEventsRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<List<WebhookPartnerModels.InvalidEventsResponse>> response = null;
            try {
                response = webhookPartnerApiList.getInvalidEventList(this.organizationId, extensionId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.SubscriberConfigResponse fetchSubscribers(String extensionId) throws FDKServerResponseError, FDKException {
        return this.fetchSubscribers(extensionId, new HashMap<>());
    }

    public WebhookPartnerModels.SubscriberConfigResponse fetchSubscribers(String extensionId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.SubscriberConfigResponse> response = null;
            try {
                response = webhookPartnerApiList.fetchSubscribers(this.organizationId, extensionId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public WebhookPartnerModels.UpdateSubscriberResponse updateSubscriber(String extensionId, Double subscriberId, WebhookPartnerModels.UpdateSubscriberRequest body) throws FDKServerResponseError, FDKException {
        return this.updateSubscriber(extensionId, subscriberId, body, new HashMap<>());
    }

    public WebhookPartnerModels.UpdateSubscriberResponse updateSubscriber(String extensionId, Double subscriberId, WebhookPartnerModels.UpdateSubscriberRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<WebhookPartnerModels.UpdateSubscriberResponse> response = null;
            try {
                response = webhookPartnerApiList.updateSubscriber(this.organizationId, extensionId, subscriberId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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