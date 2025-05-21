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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.PayoutsDetails getAllPayouts(String uniqueExternalId) throws FDKServerResponseError, FDKException {
        return this.getAllPayouts(uniqueExternalId, new HashMap<>());
    }

    public PaymentPlatformModels.PayoutsDetails getAllPayouts(String uniqueExternalId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PayoutsDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.PayoutDetails savePayout(PaymentPlatformModels.PayoutCreation body) throws FDKServerResponseError, FDKException {
        return this.savePayout(body, new HashMap<>());
    }

    public PaymentPlatformModels.PayoutDetails savePayout(PaymentPlatformModels.PayoutCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PayoutDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.UpdatePayoutDetails updatePayout(String uniqueTransferNo, PaymentPlatformModels.PayoutCreation body) throws FDKServerResponseError, FDKException {
        return this.updatePayout(uniqueTransferNo, body, new HashMap<>());
    }

    public PaymentPlatformModels.UpdatePayoutDetails updatePayout(String uniqueTransferNo, PaymentPlatformModels.PayoutCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.UpdatePayoutDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.UpdatePayoutDetails activateAndDectivatePayout(String uniqueTransferNo, PaymentPlatformModels.UpdatePayoutCreation body) throws FDKServerResponseError, FDKException {
        return this.activateAndDectivatePayout(uniqueTransferNo, body, new HashMap<>());
    }

    public PaymentPlatformModels.UpdatePayoutDetails activateAndDectivatePayout(String uniqueTransferNo, PaymentPlatformModels.UpdatePayoutCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.UpdatePayoutDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.DeletePayoutDetails deletePayout(String uniqueTransferNo) throws FDKServerResponseError, FDKException {
        return this.deletePayout(uniqueTransferNo, new HashMap<>());
    }

    public PaymentPlatformModels.DeletePayoutDetails deletePayout(String uniqueTransferNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.DeletePayoutDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SubscriptionPaymentMethodDetails getSubscriptionPaymentMethod(String uniqueExternalId) throws FDKServerResponseError, FDKException {
        return this.getSubscriptionPaymentMethod(uniqueExternalId, new HashMap<>());
    }

    public PaymentPlatformModels.SubscriptionPaymentMethodDetails getSubscriptionPaymentMethod(String uniqueExternalId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SubscriptionPaymentMethodDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.DeleteSubscriptionPaymentMethodDetails deleteSubscriptionPaymentMethod(String uniqueExternalId, String paymentMethodId) throws FDKServerResponseError, FDKException {
        return this.deleteSubscriptionPaymentMethod(uniqueExternalId, paymentMethodId, new HashMap<>());
    }

    public PaymentPlatformModels.DeleteSubscriptionPaymentMethodDetails deleteSubscriptionPaymentMethod(String uniqueExternalId, String paymentMethodId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.DeleteSubscriptionPaymentMethodDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SubscriptionConfigDetails getSubscriptionConfig() throws FDKServerResponseError, FDKException {
        return this.getSubscriptionConfig(new HashMap<>());
    }

    public PaymentPlatformModels.SubscriptionConfigDetails getSubscriptionConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SubscriptionConfigDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.SaveSubscriptionSetupIntentDetails saveSubscriptionSetupIntent(PaymentPlatformModels.SaveSubscriptionSetupIntentCreation body) throws FDKServerResponseError, FDKException {
        return this.saveSubscriptionSetupIntent(body, new HashMap<>());
    }

    public PaymentPlatformModels.SaveSubscriptionSetupIntentDetails saveSubscriptionSetupIntent(PaymentPlatformModels.SaveSubscriptionSetupIntentCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SaveSubscriptionSetupIntentDetails> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public PaymentPlatformModels.IfscCodeDetails verifyIfscCode(String ifscCode) throws FDKServerResponseError, FDKException {
        return this.verifyIfscCode(ifscCode, new HashMap<>());
    }

    public PaymentPlatformModels.IfscCodeDetails verifyIfscCode(String ifscCode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.IfscCodeDetails> response = null;
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

    public PaymentPlatformModels.PaymentGatewayConfigDetails getBrandPaymentGatewayConfig(String aggregator, String configType) throws FDKServerResponseError, FDKException {
        return this.getBrandPaymentGatewayConfig(aggregator, configType, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentGatewayConfigDetails getBrandPaymentGatewayConfig(String aggregator, String configType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentGatewayConfigDetails> response = null;
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

    public PaymentPlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(PaymentPlatformModels.PaymentGatewayConfigCreation body) throws FDKServerResponseError, FDKException {
        return this.saveBrandPaymentGatewayConfig(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(PaymentPlatformModels.PaymentGatewayConfigCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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

    public PaymentPlatformModels.PaymentOptionsDetails getPaymentModeRoutes(Boolean refresh, String requestType, String orderId, String shipmentId, Integer amount) throws FDKServerResponseError, FDKException {
        return this.getPaymentModeRoutes(refresh, requestType, orderId, shipmentId, amount, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentOptionsDetails getPaymentModeRoutes(Boolean refresh, String requestType, String orderId, String shipmentId, Integer amount, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentOptionsDetails> response = null;
            try {
            response = paymentPlatformApiList.getPaymentModeRoutes(this.companyId, this.applicationId, refresh, requestType, orderId, shipmentId, amount, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundAccountDetails getBankAccountDetailsOpenAPI(String orderId, String requestHash) throws FDKServerResponseError, FDKException {
        return this.getBankAccountDetailsOpenAPI(orderId, requestHash, new HashMap<>());
    }

    public PaymentPlatformModels.RefundAccountDetails getBankAccountDetailsOpenAPI(String orderId, String requestHash, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundAccountDetails> response = null;
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

    public PaymentPlatformModels.RefundAccountDetails addRefundBankAccountUsingOTP(PaymentPlatformModels.AddBeneficiaryDetailsOTPCreation body) throws FDKServerResponseError, FDKException {
        return this.addRefundBankAccountUsingOTP(body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundAccountDetails addRefundBankAccountUsingOTP(PaymentPlatformModels.AddBeneficiaryDetailsOTPCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundAccountDetails> response = null;
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

    public PaymentPlatformModels.OrderBeneficiaryFetchResults getUserOrderBeneficiaries(String orderId) throws FDKServerResponseError, FDKException {
        return this.getUserOrderBeneficiaries(orderId, new HashMap<>());
    }

    public PaymentPlatformModels.OrderBeneficiaryFetchResults getUserOrderBeneficiaries(String orderId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.OrderBeneficiaryFetchResults> response = null;
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

    public PaymentPlatformModels.OrderBeneficiaryFetchResults getUserBeneficiaries(String orderId) throws FDKServerResponseError, FDKException {
        return this.getUserBeneficiaries(orderId, new HashMap<>());
    }

    public PaymentPlatformModels.OrderBeneficiaryFetchResults getUserBeneficiaries(String orderId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.OrderBeneficiaryFetchResults> response = null;
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

    public PaymentPlatformModels.PaymentConfirmationDetails confirmPayment(PaymentPlatformModels.PaymentConfirmationCreation body) throws FDKServerResponseError, FDKException {
        return this.confirmPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentConfirmationDetails confirmPayment(PaymentPlatformModels.PaymentConfirmationCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentConfirmationDetails> response = null;
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

    public PaymentPlatformModels.GetUserCODLimitDetails getUserCODlimitRoutes(String merchantUserId, String mobileNo) throws FDKServerResponseError, FDKException {
        return this.getUserCODlimitRoutes(merchantUserId, mobileNo, new HashMap<>());
    }

    public PaymentPlatformModels.GetUserCODLimitDetails getUserCODlimitRoutes(String merchantUserId, String mobileNo, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetUserCODLimitDetails> response = null;
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

    public PaymentPlatformModels.SetCODOptionDetails setUserCODlimitRoutes(PaymentPlatformModels.SetCODForUserCreation body) throws FDKServerResponseError, FDKException {
        return this.setUserCODlimitRoutes(body, new HashMap<>());
    }

    public PaymentPlatformModels.SetCODOptionDetails setUserCODlimitRoutes(PaymentPlatformModels.SetCODForUserCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.SetCODOptionDetails> response = null;
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

    public PaymentPlatformModels.EdcAggregatorAndModelListDetails edcAggregatorsAndModelList() throws FDKServerResponseError, FDKException {
        return this.edcAggregatorsAndModelList(new HashMap<>());
    }

    public PaymentPlatformModels.EdcAggregatorAndModelListDetails edcAggregatorsAndModelList(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcAggregatorAndModelListDetails> response = null;
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

    public PaymentPlatformModels.EdcDeviceStatsDetails edcDeviceStats() throws FDKServerResponseError, FDKException {
        return this.edcDeviceStats(new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceStatsDetails edcDeviceStats(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceStatsDetails> response = null;
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

    public PaymentPlatformModels.EdcDeviceAddDetails updateEdcDevice(PaymentPlatformModels.EdcAddCreation body) throws FDKServerResponseError, FDKException {
        return this.updateEdcDevice(body, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceAddDetails updateEdcDevice(PaymentPlatformModels.EdcAddCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceAddDetails> response = null;
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

    public PaymentPlatformModels.EdcDeviceDetails getEdcDevice(String terminalUniqueIdentifier) throws FDKServerResponseError, FDKException {
        return this.getEdcDevice(terminalUniqueIdentifier, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceDetails getEdcDevice(String terminalUniqueIdentifier, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceDetails> response = null;
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

    public PaymentPlatformModels.EdcDeviceUpdateDetails addEdcDevice(String terminalUniqueIdentifier, PaymentPlatformModels.EdcUpdate body) throws FDKServerResponseError, FDKException {
        return this.addEdcDevice(terminalUniqueIdentifier, body, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceUpdateDetails addEdcDevice(String terminalUniqueIdentifier, PaymentPlatformModels.EdcUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceUpdateDetails> response = null;
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

    public PaymentPlatformModels.EdcDeviceListDetails edcDeviceList(Integer pageNo, Integer pageSize, Boolean isActive, Integer storeId, String deviceTag) throws FDKServerResponseError, FDKException {
        return this.edcDeviceList(pageNo, pageSize, isActive, storeId, deviceTag, new HashMap<>());
    }

    public PaymentPlatformModels.EdcDeviceListDetails edcDeviceList(Integer pageNo, Integer pageSize, Boolean isActive, Integer storeId, String deviceTag, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.EdcDeviceListDetails> response = null;
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

    public PaymentPlatformModels.PaymentModeRouteDetails getPosPaymentModeRoutes(String xOrderingSource, Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String orderId, String cardReference, String orderType, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId, String customerId) throws FDKServerResponseError, FDKException {
        return this.getPosPaymentModeRoutes(xOrderingSource, amount, cartId, pincode, checkoutMode, refresh, orderId, cardReference, orderType, userDetails, displaySplit, advancePayment, shipmentId, customerId, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentModeRouteDetails getPosPaymentModeRoutes(String xOrderingSource, Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String orderId, String cardReference, String orderType, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId, String customerId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentModeRouteDetails> response = null;
            try {
            response = paymentPlatformApiList.getPosPaymentModeRoutes(this.companyId, this.applicationId, amount, cartId, pincode, checkoutMode, refresh, orderId, cardReference, orderType, userDetails, displaySplit, advancePayment, shipmentId, customerId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentInitializationDetails initialisePayment(PaymentPlatformModels.PaymentInitializationCreation body) throws FDKServerResponseError, FDKException {
        return this.initialisePayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentInitializationDetails initialisePayment(PaymentPlatformModels.PaymentInitializationCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentInitializationDetails> response = null;
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

    public PaymentPlatformModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatus(PaymentPlatformModels.PaymentStatusUpdateCreation body) throws FDKServerResponseError, FDKException {
        return this.checkAndUpdatePaymentStatus(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatus(PaymentPlatformModels.PaymentStatusUpdateCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentStatusUpdateDetails> response = null;
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

    public PaymentPlatformModels.ResendOrCancelPaymentDetails resendOrCancelPayment(PaymentPlatformModels.ResendOrCancelPaymentCreation body) throws FDKServerResponseError, FDKException {
        return this.resendOrCancelPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.ResendOrCancelPaymentDetails resendOrCancelPayment(PaymentPlatformModels.ResendOrCancelPaymentCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ResendOrCancelPaymentDetails> response = null;
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

    public PaymentPlatformModels.PaymentStatusBulkHandlerDetails paymentStatusBulk(PaymentPlatformModels.PaymentStatusBulkHandlerCreation body) throws FDKServerResponseError, FDKException {
        return this.paymentStatusBulk(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentStatusBulkHandlerDetails paymentStatusBulk(PaymentPlatformModels.PaymentStatusBulkHandlerCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentStatusBulkHandlerDetails> response = null;
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

    public PaymentPlatformModels.GetOauthUrlDetails oauthGetUrl(String aggregator, String successRedirectUrl, String failureRedirectUrl) throws FDKServerResponseError, FDKException {
        return this.oauthGetUrl(aggregator, successRedirectUrl, failureRedirectUrl, new HashMap<>());
    }

    public PaymentPlatformModels.GetOauthUrlDetails oauthGetUrl(String aggregator, String successRedirectUrl, String failureRedirectUrl, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetOauthUrlDetails> response = null;
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

    public PaymentPlatformModels.RepaymentDetails repaymentDetails(PaymentPlatformModels.RepaymentDetailsSerialiserPayAll body) throws FDKServerResponseError, FDKException {
        return this.repaymentDetails(body, new HashMap<>());
    }

    public PaymentPlatformModels.RepaymentDetails repaymentDetails(PaymentPlatformModels.RepaymentDetailsSerialiserPayAll body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RepaymentDetails> response = null;
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

    public PaymentPlatformModels.MerchantOnBoardingDetails merchantOnBoarding(PaymentPlatformModels.MerchantOnBoardingCreation body) throws FDKServerResponseError, FDKException {
        return this.merchantOnBoarding(body, new HashMap<>());
    }

    public PaymentPlatformModels.MerchantOnBoardingDetails merchantOnBoarding(PaymentPlatformModels.MerchantOnBoardingCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.MerchantOnBoardingDetails> response = null;
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

    public PaymentPlatformModels.ValidateCustomerDetails verifyCustomerForPayment(PaymentPlatformModels.ValidateCustomerCreation body) throws FDKServerResponseError, FDKException {
        return this.verifyCustomerForPayment(body, new HashMap<>());
    }

    public PaymentPlatformModels.ValidateCustomerDetails verifyCustomerForPayment(PaymentPlatformModels.ValidateCustomerCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ValidateCustomerDetails> response = null;
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

    public PaymentPlatformModels.GetPaymentLinkDetails getPaymentLink(String paymentLinkId) throws FDKServerResponseError, FDKException {
        return this.getPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentPlatformModels.GetPaymentLinkDetails getPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetPaymentLinkDetails> response = null;
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

    public PaymentPlatformModels.CreatePaymentLinkDetails createPaymentLink(PaymentPlatformModels.CreatePaymentLinkCreation body) throws FDKServerResponseError, FDKException {
        return this.createPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.CreatePaymentLinkDetails createPaymentLink(PaymentPlatformModels.CreatePaymentLinkCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.CreatePaymentLinkDetails> response = null;
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

    public PaymentPlatformModels.PollingPaymentLinkDetails pollingPaymentLink(String paymentLinkId) throws FDKServerResponseError, FDKException {
        return this.pollingPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentPlatformModels.PollingPaymentLinkDetails pollingPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PollingPaymentLinkDetails> response = null;
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

    public PaymentPlatformModels.ResendPaymentLinkDetails resendPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkCreation body) throws FDKServerResponseError, FDKException {
        return this.resendPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.ResendPaymentLinkDetails resendPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ResendPaymentLinkDetails> response = null;
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

    public PaymentPlatformModels.CancelPaymentLinkDetails cancelPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkCreation body) throws FDKServerResponseError, FDKException {
        return this.cancelPaymentLink(body, new HashMap<>());
    }

    public PaymentPlatformModels.CancelPaymentLinkDetails cancelPaymentLink(PaymentPlatformModels.CancelOrResendPaymentLinkCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.CancelPaymentLinkDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails getPaymentModeControlRoutes(String mode) throws FDKServerResponseError, FDKException {
        return this.getPaymentModeControlRoutes(mode, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails getPaymentModeControlRoutes(String mode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
            try {
            response = paymentPlatformApiList.getPaymentModeControlRoutes(this.companyId, this.applicationId, mode, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails setMerchantModeControlRoutes(String mode, PaymentPlatformModels.MerchantPaymentModeCreation body) throws FDKServerResponseError, FDKException {
        return this.setMerchantModeControlRoutes(mode, body, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails setMerchantModeControlRoutes(String mode, PaymentPlatformModels.MerchantPaymentModeCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
            try {
            response = paymentPlatformApiList.setMerchantModeControlRoutes(this.companyId, this.applicationId, mode, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentCustomConfigResponseSchema getPaymentModeCustomConfig(String mode) throws FDKServerResponseError, FDKException {
        return this.getPaymentModeCustomConfig(mode, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentCustomConfigResponseSchema getPaymentModeCustomConfig(String mode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentCustomConfigResponseSchema> response = null;
            try {
            response = paymentPlatformApiList.getPaymentModeCustomConfig(this.companyId, this.applicationId, mode, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentCustomConfigResponseSchema setPaymentModeCustomConfig(String mode, PaymentPlatformModels.PaymentCustomConfigRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.setPaymentModeCustomConfig(mode, body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentCustomConfigResponseSchema setPaymentModeCustomConfig(String mode, PaymentPlatformModels.PaymentCustomConfigRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentCustomConfigResponseSchema> response = null;
            try {
            response = paymentPlatformApiList.setPaymentModeCustomConfig(this.companyId, this.applicationId, mode, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.GetPaymentCodeDetails getPaymentCodeOption() throws FDKServerResponseError, FDKException {
        return this.getPaymentCodeOption(new HashMap<>());
    }

    public PaymentPlatformModels.GetPaymentCodeDetails getPaymentCodeOption(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.GetPaymentCodeDetails> response = null;
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

    public PaymentPlatformModels.PaymentSessionFetchDetails getPaymentSession(String gid, Boolean lineItem) throws FDKServerResponseError, FDKException {
        return this.getPaymentSession(gid, lineItem, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentSessionFetchDetails getPaymentSession(String gid, Boolean lineItem, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentSessionFetchDetails> response = null;
            try {
            response = paymentPlatformApiList.getPaymentSession(this.companyId, this.applicationId, gid, lineItem, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentSessionPutDetails updatePaymentSession(String gid, PaymentPlatformModels.PaymentSessionCreation body) throws FDKServerResponseError, FDKException {
        return this.updatePaymentSession(gid, body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentSessionPutDetails updatePaymentSession(String gid, PaymentPlatformModels.PaymentSessionCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentSessionPutDetails> response = null;
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

    public PaymentPlatformModels.RefundSessionDetails updateRefundSession(String gid, String requestId, PaymentPlatformModels.RefundSessionCreation body) throws FDKServerResponseError, FDKException {
        return this.updateRefundSession(gid, requestId, body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundSessionDetails updateRefundSession(String gid, String requestId, PaymentPlatformModels.RefundSessionCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundSessionDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails getMerchantPaymentOption() throws FDKServerResponseError, FDKException {
        return this.getMerchantPaymentOption(new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails getMerchantPaymentOption(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantPaymentOption(PaymentPlatformModels.MerchnatPaymentModeCreation body) throws FDKServerResponseError, FDKException {
        return this.patchMerchantPaymentOption(body, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantPaymentOption(PaymentPlatformModels.MerchnatPaymentModeCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails getMerchantAggregatorPaymentModeDetails(Integer aggregatorId, String businessUnit, String device) throws FDKServerResponseError, FDKException {
        return this.getMerchantAggregatorPaymentModeDetails(aggregatorId, businessUnit, device, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails getMerchantAggregatorPaymentModeDetails(Integer aggregatorId, String businessUnit, String device, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantAggregatorPaymentModeDetails(Integer aggregatorId, PaymentPlatformModels.PlatformPaymentModeDetails body) throws FDKServerResponseError, FDKException {
        return this.patchMerchantAggregatorPaymentModeDetails(aggregatorId, body, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantAggregatorPaymentModeDetails(Integer aggregatorId, PaymentPlatformModels.PlatformPaymentModeDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
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

    public PaymentPlatformModels.PlatformPaymentModeDetails getPGConfigAggregators() throws FDKServerResponseError, FDKException {
        return this.getPGConfigAggregators(new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails getPGConfigAggregators(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
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

    public PaymentPlatformModels.RefundPriorityDetails getMerchantRefundPriority(String configType) throws FDKServerResponseError, FDKException {
        return this.getMerchantRefundPriority(configType, new HashMap<>());
    }

    public PaymentPlatformModels.RefundPriorityDetails getMerchantRefundPriority(String configType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundPriorityDetails> response = null;
            try {
            response = paymentPlatformApiList.getMerchantRefundPriority(this.companyId, this.applicationId, configType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundPriorityDetails createMerchantRefundPriority(String configType, PaymentPlatformModels.RefundPriorityCreation body) throws FDKServerResponseError, FDKException {
        return this.createMerchantRefundPriority(configType, body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundPriorityDetails createMerchantRefundPriority(String configType, PaymentPlatformModels.RefundPriorityCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundPriorityDetails> response = null;
            try {
            response = paymentPlatformApiList.createMerchantRefundPriority(this.companyId, this.applicationId, configType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.RefundPriorityDetails updateMerchantRefundPriority(String configType, PaymentPlatformModels.RefundPriorityCreation body) throws FDKServerResponseError, FDKException {
        return this.updateMerchantRefundPriority(configType, body, new HashMap<>());
    }

    public PaymentPlatformModels.RefundPriorityDetails updateMerchantRefundPriority(String configType, PaymentPlatformModels.RefundPriorityCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.RefundPriorityDetails> response = null;
            try {
            response = paymentPlatformApiList.updateMerchantRefundPriority(this.companyId, this.applicationId, configType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PaymentOrderDetails createPaymentOrder(PaymentPlatformModels.PaymentOrderCreation body) throws FDKServerResponseError, FDKException {
        return this.createPaymentOrder(body, new HashMap<>());
    }

    public PaymentPlatformModels.PaymentOrderDetails createPaymentOrder(PaymentPlatformModels.PaymentOrderCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PaymentOrderDetails> response = null;
            try {
            response = paymentPlatformApiList.createPaymentOrder(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.AggregatorVersionDetails getMerchantAggregatorAppVersion(Integer aggregatorId, String businessUnit, String device, Integer paymentModeId, String subPaymentMode) throws FDKServerResponseError, FDKException {
        return this.getMerchantAggregatorAppVersion(aggregatorId, businessUnit, device, paymentModeId, subPaymentMode, new HashMap<>());
    }

    public PaymentPlatformModels.AggregatorVersionDetails getMerchantAggregatorAppVersion(Integer aggregatorId, String businessUnit, String device, Integer paymentModeId, String subPaymentMode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.AggregatorVersionDetails> response = null;
            try {
            response = paymentPlatformApiList.getMerchantAggregatorAppVersion(this.companyId, this.applicationId, aggregatorId, businessUnit, device, paymentModeId, subPaymentMode, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantPaymentOptionVersion(Integer aggregatorId, PaymentPlatformModels.PatchAggregatorControl body) throws FDKServerResponseError, FDKException {
        return this.patchMerchantPaymentOptionVersion(aggregatorId, body, new HashMap<>());
    }

    public PaymentPlatformModels.PlatformPaymentModeDetails patchMerchantPaymentOptionVersion(Integer aggregatorId, PaymentPlatformModels.PatchAggregatorControl body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.PlatformPaymentModeDetails> response = null;
            try {
            response = paymentPlatformApiList.patchMerchantPaymentOptionVersion(this.companyId, this.applicationId, aggregatorId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public PaymentPlatformModels.ValidateCustomerCreditSchema validateCustomerAndCreditSummary(PaymentPlatformModels.CustomerValidationSchema body) throws FDKServerResponseError, FDKException {
        return this.validateCustomerAndCreditSummary(body, new HashMap<>());
    }

    public PaymentPlatformModels.ValidateCustomerCreditSchema validateCustomerAndCreditSummary(PaymentPlatformModels.CustomerValidationSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PaymentPlatformModels.ValidateCustomerCreditSchema> response = null;
            try {
            response = paymentPlatformApiList.validateCustomerAndCreditSummary(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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