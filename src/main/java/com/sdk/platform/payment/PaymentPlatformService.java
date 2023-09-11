package com.sdk.platform.payment;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class PaymentPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private PaymentPlatformApiList paymentPlatformApiList;

    public PaymentPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.paymentPlatformApiList = generatePaymentPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private PaymentPlatformApiList generatePaymentPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),PaymentPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.PayoutsResponse getAllPayouts(String uniqueExternalId) throws FDKServerResponseError, FDKException {
        return this.getAllPayouts(uniqueExternalId, new HashMap<>());
    }

    public PaymentPlatformModels.PayoutsResponse getAllPayouts(String uniqueExternalId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PayoutsResponse> response = null;
            try {
                response = paymentPlatformApiList.getAllPayouts(this.companyId, uniqueExternalId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.PayoutResponse savePayout(PaymentPlatformModels.PayoutRequest body) throws FDKServerResponseError, FDKException {
        return this.savePayout(body, new HashMap<>());
    }

    public PaymentPlatformModels.PayoutResponse savePayout(PaymentPlatformModels.PayoutRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PayoutResponse> response = null;
            try {
                response = paymentPlatformApiList.savePayout(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.UpdatePayoutResponse updatePayout(String uniqueTransferNo, PaymentPlatformModels.PayoutRequest body) throws FDKServerResponseError, FDKException {
        return this.updatePayout(uniqueTransferNo, body, new HashMap<>());
    }

    public PaymentPlatformModels.UpdatePayoutResponse updatePayout(String uniqueTransferNo, PaymentPlatformModels.PayoutRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.UpdatePayoutResponse> response = null;
            try {
                response = paymentPlatformApiList.updatePayout(this.companyId, uniqueTransferNo, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.UpdatePayoutResponse activateAndDectivatePayout(String uniqueTransferNo, PaymentPlatformModels.UpdatePayoutRequest body) throws FDKServerResponseError, FDKException {
        return this.activateAndDectivatePayout(uniqueTransferNo, body, new HashMap<>());
    }

    public PaymentPlatformModels.UpdatePayoutResponse activateAndDectivatePayout(String uniqueTransferNo, PaymentPlatformModels.UpdatePayoutRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.UpdatePayoutResponse> response = null;
            try {
                response = paymentPlatformApiList.activateAndDectivatePayout(this.companyId, uniqueTransferNo, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.DeletePayoutResponse deletePayout(String uniqueTransferNo) throws FDKServerResponseError, FDKException {
        return this.deletePayout(uniqueTransferNo, new HashMap<>());
    }

    public PaymentPlatformModels.DeletePayoutResponse deletePayout(String uniqueTransferNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.DeletePayoutResponse> response = null;
            try {
                response = paymentPlatformApiList.deletePayout(this.companyId, uniqueTransferNo, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SubscriptionPaymentMethodResponse getSubscriptionPaymentMethod(String uniqueExternalId) throws FDKServerResponseError, FDKException {
        return this.getSubscriptionPaymentMethod(uniqueExternalId, new HashMap<>());
    }

    public PaymentPlatformModels.SubscriptionPaymentMethodResponse getSubscriptionPaymentMethod(String uniqueExternalId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SubscriptionPaymentMethodResponse> response = null;
            try {
                response = paymentPlatformApiList.getSubscriptionPaymentMethod(this.companyId, uniqueExternalId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.DeleteSubscriptionPaymentMethodResponse deleteSubscriptionPaymentMethod(String uniqueExternalId, String paymentMethodId) throws FDKServerResponseError, FDKException {
        return this.deleteSubscriptionPaymentMethod(uniqueExternalId, paymentMethodId, new HashMap<>());
    }

    public PaymentPlatformModels.DeleteSubscriptionPaymentMethodResponse deleteSubscriptionPaymentMethod(String uniqueExternalId, String paymentMethodId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.DeleteSubscriptionPaymentMethodResponse> response = null;
            try {
                response = paymentPlatformApiList.deleteSubscriptionPaymentMethod(this.companyId, uniqueExternalId, paymentMethodId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SubscriptionConfigResponse getSubscriptionConfig() throws FDKServerResponseError, FDKException {
        return this.getSubscriptionConfig(new HashMap<>());
    }

    public PaymentPlatformModels.SubscriptionConfigResponse getSubscriptionConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SubscriptionConfigResponse> response = null;
            try {
                response = paymentPlatformApiList.getSubscriptionConfig(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SaveSubscriptionSetupIntentResponse saveSubscriptionSetupIntent(PaymentPlatformModels.SaveSubscriptionSetupIntentRequest body) throws FDKServerResponseError, FDKException {
        return this.saveSubscriptionSetupIntent(body, new HashMap<>());
    }

    public PaymentPlatformModels.SaveSubscriptionSetupIntentResponse saveSubscriptionSetupIntent(PaymentPlatformModels.SaveSubscriptionSetupIntentRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SaveSubscriptionSetupIntentResponse> response = null;
            try {
                response = paymentPlatformApiList.saveSubscriptionSetupIntent(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.IfscCodeResponse verifyIfscCode(String ifscCode) throws FDKServerResponseError, FDKException {
        return this.verifyIfscCode(ifscCode, new HashMap<>());
    }

    public PaymentPlatformModels.IfscCodeResponse verifyIfscCode(String ifscCode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.IfscCodeResponse> response = null;
            try {
                response = paymentPlatformApiList.verifyIfscCode(this.companyId, ifscCode, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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

    public PaymentPlatformModels.PaymentGatewayConfigResponse getBrandPaymentGatewayConfig(String aggregator, String configType) throws FDKServerResponseError, FDKException {
        return this.getBrandPaymentGatewayConfig(aggregator, configType, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentGatewayConfigResponse getBrandPaymentGatewayConfig(String aggregator, String configType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentGatewayConfigResponse> response = null;
            try {
            response = paymentPlatformApiList.getBrandPaymentGatewayConfig(this.companyId, this.applicationId, aggregator, configType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(PaymentPlatformModels.PaymentGatewayConfigRequest body) throws FDKServerResponseError, FDKException {
        return this.saveBrandPaymentGatewayConfig(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(PaymentPlatformModels.PaymentGatewayConfigRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentGatewayToBeReviewed> response = null;
            try {
            response = paymentPlatformApiList.saveBrandPaymentGatewayConfig(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentOptionsResponse getPaymentModeRoutes(Boolean refresh, String requestType) throws FDKServerResponseError, FDKException {
        return this.getPaymentModeRoutes(refresh, requestType, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentOptionsResponse getPaymentModeRoutes(Boolean refresh, String requestType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentOptionsResponse> response = null;
            try {
            response = paymentPlatformApiList.getPaymentModeRoutes(this.companyId, this.applicationId, refresh, requestType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundAccountResponse getBankAccountDetailsOpenAPI(String orderId, String requestHash) throws FDKServerResponseError, FDKException {
        return this.getBankAccountDetailsOpenAPI(orderId, requestHash, new HashMap<>());
    }

    public PaymentPlatformModels.RefundAccountResponse getBankAccountDetailsOpenAPI(String orderId, String requestHash, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundAccountResponse> response = null;
            try {
            response = paymentPlatformApiList.getBankAccountDetailsOpenAPI(this.companyId, this.applicationId, orderId, requestHash, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundAccountResponse addRefundBankAccountUsingOTP(PaymentPlatformModels.AddBeneficiaryDetailsOTPRequest body) throws FDKServerResponseError, FDKException {
        return this.addRefundBankAccountUsingOTP(body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundAccountResponse addRefundBankAccountUsingOTP(PaymentPlatformModels.AddBeneficiaryDetailsOTPRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundAccountResponse> response = null;
            try {
            response = paymentPlatformApiList.addRefundBankAccountUsingOTP(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.OrderBeneficiaryResponse getUserOrderBeneficiaries(String orderId) throws FDKServerResponseError, FDKException {
        return this.getUserOrderBeneficiaries(orderId, new HashMap<>());
    }

    public PaymentPlatformModels.OrderBeneficiaryResponse getUserOrderBeneficiaries(String orderId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.OrderBeneficiaryResponse> response = null;
            try {
            response = paymentPlatformApiList.getUserOrderBeneficiaries(this.companyId, this.applicationId, orderId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.OrderBeneficiaryResponse getUserBeneficiaries(String orderId) throws FDKServerResponseError, FDKException {
        return this.getUserBeneficiaries(orderId, new HashMap<>());
    }

    public PaymentPlatformModels.OrderBeneficiaryResponse getUserBeneficiaries(String orderId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.OrderBeneficiaryResponse> response = null;
            try {
            response = paymentPlatformApiList.getUserBeneficiaries(this.companyId, this.applicationId, orderId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentConfirmationResponse confirmPayment(PaymentPlatformModels.PaymentConfirmationRequest body) throws FDKServerResponseError, FDKException {
        return this.confirmPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentConfirmationResponse confirmPayment(PaymentPlatformModels.PaymentConfirmationRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentConfirmationResponse> response = null;
            try {
            response = paymentPlatformApiList.confirmPayment(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.GetUserCODLimitResponse getUserCODlimitRoutes(String merchantUserId, String mobileNo) throws FDKServerResponseError, FDKException {
        return this.getUserCODlimitRoutes(merchantUserId, mobileNo, new HashMap<>());
    }

    public PaymentPlatformModels.GetUserCODLimitResponse getUserCODlimitRoutes(String merchantUserId, String mobileNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetUserCODLimitResponse> response = null;
            try {
            response = paymentPlatformApiList.getUserCODlimitRoutes(this.companyId, this.applicationId, merchantUserId, mobileNo, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.SetCODOptionResponse setUserCODlimitRoutes(PaymentPlatformModels.SetCODForUserRequest body) throws FDKServerResponseError, FDKException {
        return this.setUserCODlimitRoutes(body, new HashMap<>());
    }

    public PaymentPlatformModels.SetCODOptionResponse setUserCODlimitRoutes(PaymentPlatformModels.SetCODForUserRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SetCODOptionResponse> response = null;
            try {
            response = paymentPlatformApiList.setUserCODlimitRoutes(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcAggregatorAndModelListResponse edcAggregatorsAndModelList() throws FDKServerResponseError, FDKException {
        return this.edcAggregatorsAndModelList(new HashMap<>());
    }

    public PaymentPlatformModels.EdcAggregatorAndModelListResponse edcAggregatorsAndModelList(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcAggregatorAndModelListResponse> response = null;
            try {
            response = paymentPlatformApiList.edcAggregatorsAndModelList(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcDeviceStatsResponse edcDeviceStats() throws FDKServerResponseError, FDKException {
        return this.edcDeviceStats(new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceStatsResponse edcDeviceStats(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceStatsResponse> response = null;
            try {
            response = paymentPlatformApiList.edcDeviceStats(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcDeviceAddResponse updateEdcDevice(PaymentPlatformModels.EdcAddRequest body) throws FDKServerResponseError, FDKException {
        return this.updateEdcDevice(body, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceAddResponse updateEdcDevice(PaymentPlatformModels.EdcAddRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceAddResponse> response = null;
            try {
            response = paymentPlatformApiList.updateEdcDevice(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcDeviceDetailsResponse getEdcDevice(String terminalUniqueIdentifier) throws FDKServerResponseError, FDKException {
        return this.getEdcDevice(terminalUniqueIdentifier, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceDetailsResponse getEdcDevice(String terminalUniqueIdentifier, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceDetailsResponse> response = null;
            try {
            response = paymentPlatformApiList.getEdcDevice(this.companyId, this.applicationId, terminalUniqueIdentifier, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcDeviceUpdateResponse addEdcDevice(String terminalUniqueIdentifier, PaymentPlatformModels.EdcUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.addEdcDevice(terminalUniqueIdentifier, body, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceUpdateResponse addEdcDevice(String terminalUniqueIdentifier, PaymentPlatformModels.EdcUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceUpdateResponse> response = null;
            try {
            response = paymentPlatformApiList.addEdcDevice(this.companyId, this.applicationId, terminalUniqueIdentifier, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.EdcDeviceListResponse edcDeviceList(Integer pageNo, Integer pageSize, Boolean isActive, Integer storeId, String deviceTag) throws FDKServerResponseError, FDKException {
        return this.edcDeviceList(pageNo, pageSize, isActive, storeId, deviceTag, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceListResponse edcDeviceList(Integer pageNo, Integer pageSize, Boolean isActive, Integer storeId, String deviceTag, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceListResponse> response = null;
            try {
            response = paymentPlatformApiList.edcDeviceList(this.companyId, this.applicationId, pageNo, pageSize, isActive, storeId, deviceTag, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentOptionsResponse getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails) throws FDKServerResponseError, FDKException {
        return this.getPosPaymentModeRoutes(amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentOptionsResponse getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentOptionsResponse> response = null;
            try {
            response = paymentPlatformApiList.getPosPaymentModeRoutes(this.companyId, this.applicationId, amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentInitializationResponse initialisePayment(PaymentPlatformModels.PaymentInitializationRequest body) throws FDKServerResponseError, FDKException {
        return this.initialisePayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentInitializationResponse initialisePayment(PaymentPlatformModels.PaymentInitializationRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentInitializationResponse> response = null;
            try {
            response = paymentPlatformApiList.initialisePayment(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(PaymentPlatformModels.PaymentStatusUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.checkAndUpdatePaymentStatus(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(PaymentPlatformModels.PaymentStatusUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentStatusUpdateResponse> response = null;
            try {
            response = paymentPlatformApiList.checkAndUpdatePaymentStatus(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.ResendOrCancelPaymentResponse resendOrCancelPayment(PaymentPlatformModels.ResendOrCancelPaymentRequest body) throws FDKServerResponseError, FDKException {
        return this.resendOrCancelPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.ResendOrCancelPaymentResponse resendOrCancelPayment(PaymentPlatformModels.ResendOrCancelPaymentRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ResendOrCancelPaymentResponse> response = null;
            try {
            response = paymentPlatformApiList.resendOrCancelPayment(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentStatusBulkHandlerResponse paymentStatusBulk(PaymentPlatformModels.PaymentStatusBulkHandlerRequest body) throws FDKServerResponseError, FDKException {
        return this.paymentStatusBulk(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentStatusBulkHandlerResponse paymentStatusBulk(PaymentPlatformModels.PaymentStatusBulkHandlerRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentStatusBulkHandlerResponse> response = null;
            try {
            response = paymentPlatformApiList.paymentStatusBulk(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.GetOauthUrlResponse oauthGetUrl(String aggregator, String successRedirectUrl, String failureRedirectUrl) throws FDKServerResponseError, FDKException {
        return this.oauthGetUrl(aggregator, successRedirectUrl, failureRedirectUrl, new HashMap<>());
    }

    public PaymentPlatformModels.GetOauthUrlResponse oauthGetUrl(String aggregator, String successRedirectUrl, String failureRedirectUrl, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetOauthUrlResponse> response = null;
            try {
            response = paymentPlatformApiList.oauthGetUrl(this.companyId, this.applicationId, aggregator, successRedirectUrl, failureRedirectUrl, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RevokeOAuthToken revokeOauthToken(String aggregator) throws FDKServerResponseError, FDKException {
        return this.revokeOauthToken(aggregator, new HashMap<>());
    }

    public PaymentPlatformModels.RevokeOAuthToken revokeOauthToken(String aggregator, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RevokeOAuthToken> response = null;
            try {
            response = paymentPlatformApiList.revokeOauthToken(this.companyId, this.applicationId, aggregator, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RepaymentResponse repaymentDetails(PaymentPlatformModels.RepaymentDetailsSerialiserPayAll body) throws FDKServerResponseError, FDKException {
        return this.repaymentDetails(body, new HashMap<>());
    }

    public PaymentPlatformModels.RepaymentResponse repaymentDetails(PaymentPlatformModels.RepaymentDetailsSerialiserPayAll body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RepaymentResponse> response = null;
            try {
            response = paymentPlatformApiList.repaymentDetails(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchantOnBoardingResponse merchantOnBoarding(PaymentPlatformModels.MerchantOnBoardingRequest body) throws FDKServerResponseError, FDKException {
        return this.merchantOnBoarding(body, new HashMap<>());
    }

    public PaymentPlatformModels.MerchantOnBoardingResponse merchantOnBoarding(PaymentPlatformModels.MerchantOnBoardingRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchantOnBoardingResponse> response = null;
            try {
            response = paymentPlatformApiList.merchantOnBoarding(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.ValidateCustomerResponse verifyCustomerForPayment(PaymentPlatformModels.ValidateCustomerRequest body) throws FDKServerResponseError, FDKException {
        return this.verifyCustomerForPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.ValidateCustomerResponse verifyCustomerForPayment(PaymentPlatformModels.ValidateCustomerRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ValidateCustomerResponse> response = null;
            try {
            response = paymentPlatformApiList.verifyCustomerForPayment(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId) throws FDKServerResponseError, FDKException {
        return this.getPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentPlatformModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetPaymentLinkResponse> response = null;
            try {
            response = paymentPlatformApiList.getPaymentLink(this.companyId, this.applicationId, paymentLinkId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.CreatePaymentLinkResponse createPaymentLink(PaymentPlatformModels.CreatePaymentLinkRequest body) throws FDKServerResponseError, FDKException {
        return this.createPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.CreatePaymentLinkResponse createPaymentLink(PaymentPlatformModels.CreatePaymentLinkRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.CreatePaymentLinkResponse> response = null;
            try {
            response = paymentPlatformApiList.createPaymentLink(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId) throws FDKServerResponseError, FDKException {
        return this.pollingPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentPlatformModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PollingPaymentLinkResponse> response = null;
            try {
            response = paymentPlatformApiList.pollingPaymentLink(this.companyId, this.applicationId, paymentLinkId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.ResendPaymentLinkResponse resendPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkRequest body) throws FDKServerResponseError, FDKException {
        return this.resendPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.ResendPaymentLinkResponse resendPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ResendPaymentLinkResponse> response = null;
            try {
            response = paymentPlatformApiList.resendPaymentLink(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.CancelPaymentLinkResponse cancelPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkRequest body) throws FDKServerResponseError, FDKException {
        return this.cancelPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.CancelPaymentLinkResponse cancelPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.CancelPaymentLinkResponse> response = null;
            try {
            response = paymentPlatformApiList.cancelPaymentLink(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.GetPaymentCodeResponse getPaymentCodeOption() throws FDKServerResponseError, FDKException {
        return this.getPaymentCodeOption(new HashMap<>());
    }

    public PaymentPlatformModels.GetPaymentCodeResponse getPaymentCodeOption(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetPaymentCodeResponse> response = null;
            try {
            response = paymentPlatformApiList.getPaymentCodeOption(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentSessionResponseSerializer updatePaymentSession(String gid, PaymentPlatformModels.PaymentSessionRequestSerializer body) throws FDKServerResponseError, FDKException {
        return this.updatePaymentSession(gid, body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentSessionResponseSerializer updatePaymentSession(String gid, PaymentPlatformModels.PaymentSessionRequestSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentSessionResponseSerializer> response = null;
            try {
            response = paymentPlatformApiList.updatePaymentSession(this.companyId, this.applicationId, gid, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundSessionResponseSerializer updateRefundSession(String gid, String requestId, PaymentPlatformModels.RefundSessionRequestSerializer body) throws FDKServerResponseError, FDKException {
        return this.updateRefundSession(gid, requestId, body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundSessionResponseSerializer updateRefundSession(String gid, String requestId, PaymentPlatformModels.RefundSessionRequestSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundSessionResponseSerializer> response = null;
            try {
            response = paymentPlatformApiList.updateRefundSession(this.companyId, this.applicationId, gid, requestId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getMerchantPaymentOption() throws FDKServerResponseError, FDKException {
        return this.getMerchantPaymentOption(new HashMap<>());
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getMerchantPaymentOption(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchnatPaymentModeResponse> response = null;
            try {
            response = paymentPlatformApiList.getMerchantPaymentOption(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse patchMerchantPaymentOption(PaymentPlatformModels.MerchnatPaymentModeRequest body) throws FDKServerResponseError, FDKException {
        return this.patchMerchantPaymentOption(body, new HashMap<>());
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse patchMerchantPaymentOption(PaymentPlatformModels.MerchnatPaymentModeRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchnatPaymentModeResponse> response = null;
            try {
            response = paymentPlatformApiList.patchMerchantPaymentOption(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getMerchantAggregatorPaymentModeDetails(Integer aggregatorId, String businessUnit, String device) throws FDKServerResponseError, FDKException {
        return this.getMerchantAggregatorPaymentModeDetails(aggregatorId, businessUnit, device, new HashMap<>());
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getMerchantAggregatorPaymentModeDetails(Integer aggregatorId, String businessUnit, String device, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchnatPaymentModeResponse> response = null;
            try {
            response = paymentPlatformApiList.getMerchantAggregatorPaymentModeDetails(this.companyId, this.applicationId, aggregatorId, businessUnit, device, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse patchMerchantAggregatorPaymentModeDetails(Integer aggregatorId, PaymentPlatformModels.MerchnatPaymentModeResponse body) throws FDKServerResponseError, FDKException {
        return this.patchMerchantAggregatorPaymentModeDetails(aggregatorId, body, new HashMap<>());
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse patchMerchantAggregatorPaymentModeDetails(Integer aggregatorId, PaymentPlatformModels.MerchnatPaymentModeResponse body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchnatPaymentModeResponse> response = null;
            try {
            response = paymentPlatformApiList.patchMerchantAggregatorPaymentModeDetails(this.companyId, this.applicationId, aggregatorId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getPGConfigAggregators() throws FDKServerResponseError, FDKException {
        return this.getPGConfigAggregators(new HashMap<>());
    }

    public PaymentPlatformModels.MerchnatPaymentModeResponse getPGConfigAggregators(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchnatPaymentModeResponse> response = null;
            try {
            response = paymentPlatformApiList.getPGConfigAggregators(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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