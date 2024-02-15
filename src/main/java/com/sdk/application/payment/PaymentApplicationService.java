package com.sdk.application.payment;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class PaymentApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PaymentApplicationApiList paymentApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public PaymentApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.paymentApplicationApiList = generatePaymentApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getAggregatorsConfig","/service/application/payment/v1.0/config/aggregators/key".substring(1));
        relativeUrls.put("attachCardToCustomer","/service/application/payment/v1.0/card/attach".substring(1));
        relativeUrls.put("getActiveCardAggregator","/service/application/payment/v1.0/card/aggregator".substring(1));
        relativeUrls.put("getActiveUserCards","/service/application/payment/v1.0/cards".substring(1));
        relativeUrls.put("deleteUserCard","/service/application/payment/v1.0/card/remove".substring(1));
        relativeUrls.put("verifyCustomerForPayment","/service/application/payment/v1.0/payment/customer/validation".substring(1));
        relativeUrls.put("verifyAndChargePayment","/service/application/payment/v1.0/payment/confirm/charge".substring(1));
        relativeUrls.put("initialisePayment","/service/application/payment/v1.0/payment/request".substring(1));
        relativeUrls.put("checkAndUpdatePaymentStatus","/service/application/payment/v1.0/payment/confirm/polling".substring(1));
        relativeUrls.put("getPaymentModeRoutes","/service/application/payment/v1.0/payment/options".substring(1));
        relativeUrls.put("getPosPaymentModeRoutes","/service/application/payment/v1.0/payment/options/pos".substring(1));
        relativeUrls.put("walletLinkInitate","/service/application/payment/v1.0/payment/options/wallet/link".substring(1));
        relativeUrls.put("linkWallet","/service/application/payment/v1.0/payment/options/wallet/verify".substring(1));
        relativeUrls.put("delinkWallet","/service/application/payment/v1.0/payment/options/wallet/delink".substring(1));
        relativeUrls.put("getRupifiBannerDetails","/service/application/payment/v1.0/rupifi/banner".substring(1));
        relativeUrls.put("getEpaylaterBannerDetails","/service/application/payment/v1.0/epaylater/banner".substring(1));
        relativeUrls.put("resendOrCancelPayment","/service/application/payment/v1.0/payment/resend_or_cancel".substring(1));
        relativeUrls.put("renderHTML","/service/application/payment/v1.0/payment/html/render/".substring(1));
        relativeUrls.put("validateVPA","/service/application/payment/v1.0/validate-vpa".substring(1));
        relativeUrls.put("cardDetails","/service/application/payment/v1.0/cards/info/{card_info}".substring(1));
        relativeUrls.put("getActiveRefundTransferModes","/service/application/payment/v1.0/refund/transfer-mode".substring(1));
        relativeUrls.put("enableOrDisableRefundTransferMode","/service/application/payment/v1.0/refund/transfer-mode".substring(1));
        relativeUrls.put("getUserBeneficiariesDetail","/service/application/payment/v1.0/refund/user/beneficiary".substring(1));
        relativeUrls.put("verifyIfscCode","/service/application/payment/v1.0/ifsc-code/verify".substring(1));
        relativeUrls.put("getOrderBeneficiariesDetail","/service/application/payment/v1.0/refund/order/beneficiaries".substring(1));
        relativeUrls.put("verifyOtpAndAddBeneficiaryForBank","/service/application/payment/v1.0/refund/verification/bank".substring(1));
        relativeUrls.put("addBeneficiaryDetails","/service/application/payment/v1.0/refund/account".substring(1));
        relativeUrls.put("addRefundBankAccountUsingOTP","/service/application/payment/v1.0/refund/account/otp".substring(1));
        relativeUrls.put("verifyOtpAndAddBeneficiaryForWallet","/service/application/payment/v1.0/refund/verification/wallet".substring(1));
        relativeUrls.put("updateDefaultBeneficiary","/service/application/payment/v1.0/refund/beneficiary/default".substring(1));
        relativeUrls.put("getPaymentLink","/service/application/payment/v1.0/create-payment-link/".substring(1));
        relativeUrls.put("createPaymentLink","/service/application/payment/v1.0/create-payment-link/".substring(1));
        relativeUrls.put("resendPaymentLink","/service/application/payment/v1.0/resend-payment-link/".substring(1));
        relativeUrls.put("cancelPaymentLink","/service/application/payment/v1.0/cancel-payment-link/".substring(1));
        relativeUrls.put("getPaymentModeRoutesPaymentLink","/service/application/payment/v1.0/payment/options/link/".substring(1));
        relativeUrls.put("pollingPaymentLink","/service/application/payment/v1.0/polling-payment-link/".substring(1));
        relativeUrls.put("createOrderHandlerPaymentLink","/service/application/payment/v1.0/create-order/link/".substring(1));
        relativeUrls.put("initialisePaymentPaymentLink","/service/application/payment/v1.0/payment/request/link/".substring(1));
        relativeUrls.put("checkAndUpdatePaymentStatusPaymentLink","/service/application/payment/v1.0/payment/confirm/polling/link/".substring(1));
        relativeUrls.put("customerCreditSummary","/service/application/payment/v1.0/payment/credit-summary/".substring(1));
        relativeUrls.put("redirectToAggregator","/service/application/payment/v1.0/payment/redirect-to-aggregator/".substring(1));
        relativeUrls.put("checkCredit","/service/application/payment/v1.0/check-credits/".substring(1));
        relativeUrls.put("customerOnboard","/service/application/payment/v1.0/credit-onboard/".substring(1));
        relativeUrls.put("outstandingOrderDetails","/service/application/payment/v1.0/payment/outstanding-orders/".substring(1));
        relativeUrls.put("paidOrderDetails","/service/application/payment/v1.0/payment/paid-orders/".substring(1));
        relativeUrls.put("createPaymentOrder","/service/application/payment/v1.0/payment-orders/".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private PaymentApplicationApiList generatePaymentApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PaymentApplicationApiList.class, interceptorList, cookieStore);
    }

    public PaymentApplicationModels.AggregatorsConfigDetailResponse getAggregatorsConfig(String xApiToken, Boolean refresh) throws IOException {
        return this.getAggregatorsConfig(xApiToken, refresh, new HashMap<>());
    }

    public PaymentApplicationModels.AggregatorsConfigDetailResponse getAggregatorsConfig(String xApiToken, Boolean refresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAggregatorsConfig");

        Response<PaymentApplicationModels.AggregatorsConfigDetailResponse> response = paymentApplicationApiList.getAggregatorsConfig(fullUrl, xApiToken, refresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.AttachCardsResponse attachCardToCustomer(PaymentApplicationModels.AttachCardRequest body) throws IOException {
        return this.attachCardToCustomer(body, new HashMap<>());
    }

    public PaymentApplicationModels.AttachCardsResponse attachCardToCustomer(PaymentApplicationModels.AttachCardRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("attachCardToCustomer");

        Response<PaymentApplicationModels.AttachCardsResponse> response = paymentApplicationApiList.attachCardToCustomer(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ActiveCardPaymentGatewayResponse getActiveCardAggregator(Boolean refresh) throws IOException {
        return this.getActiveCardAggregator(refresh, new HashMap<>());
    }

    public PaymentApplicationModels.ActiveCardPaymentGatewayResponse getActiveCardAggregator(Boolean refresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveCardAggregator");

        Response<PaymentApplicationModels.ActiveCardPaymentGatewayResponse> response = paymentApplicationApiList.getActiveCardAggregator(fullUrl, refresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ListCardsResponse getActiveUserCards(Boolean forceRefresh) throws IOException {
        return this.getActiveUserCards(forceRefresh, new HashMap<>());
    }

    public PaymentApplicationModels.ListCardsResponse getActiveUserCards(Boolean forceRefresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveUserCards");

        Response<PaymentApplicationModels.ListCardsResponse> response = paymentApplicationApiList.getActiveUserCards(fullUrl, forceRefresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.DeleteCardsResponse deleteUserCard(PaymentApplicationModels.DeletehCardRequest body) throws IOException {
        return this.deleteUserCard(body, new HashMap<>());
    }

    public PaymentApplicationModels.DeleteCardsResponse deleteUserCard(PaymentApplicationModels.DeletehCardRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteUserCard");

        Response<PaymentApplicationModels.DeleteCardsResponse> response = paymentApplicationApiList.deleteUserCard(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ValidateCustomerResponse verifyCustomerForPayment(PaymentApplicationModels.ValidateCustomerRequest body) throws IOException {
        return this.verifyCustomerForPayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ValidateCustomerResponse verifyCustomerForPayment(PaymentApplicationModels.ValidateCustomerRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyCustomerForPayment");

        Response<PaymentApplicationModels.ValidateCustomerResponse> response = paymentApplicationApiList.verifyCustomerForPayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ChargeCustomerResponse verifyAndChargePayment(PaymentApplicationModels.ChargeCustomerRequest body) throws IOException {
        return this.verifyAndChargePayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ChargeCustomerResponse verifyAndChargePayment(PaymentApplicationModels.ChargeCustomerRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyAndChargePayment");

        Response<PaymentApplicationModels.ChargeCustomerResponse> response = paymentApplicationApiList.verifyAndChargePayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentInitializationResponse initialisePayment(PaymentApplicationModels.PaymentInitializationRequest body) throws IOException {
        return this.initialisePayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentInitializationResponse initialisePayment(PaymentApplicationModels.PaymentInitializationRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("initialisePayment");

        Response<PaymentApplicationModels.PaymentInitializationResponse> response = paymentApplicationApiList.initialisePayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(PaymentApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
        return this.checkAndUpdatePaymentStatus(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(PaymentApplicationModels.PaymentStatusUpdateRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatus");

        Response<PaymentApplicationModels.PaymentStatusUpdateResponse> response = paymentApplicationApiList.checkAndUpdatePaymentStatus(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutes(Integer amount, String cartId, String checkoutMode, Boolean refresh, String orderId, String cardReference, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId) throws IOException {
        return this.getPaymentModeRoutes(amount, cartId, checkoutMode, refresh, orderId, cardReference, userDetails, displaySplit, advancePayment, shipmentId, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutes(Integer amount, String cartId, String checkoutMode, Boolean refresh, String orderId, String cardReference, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentModeRoutes");

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPaymentModeRoutes(fullUrl, amount, cartId, checkoutMode, refresh, orderId, cardReference, userDetails, displaySplit, advancePayment, shipmentId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteResponse getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails) throws IOException {
        return this.getPosPaymentModeRoutes(amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteResponse getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPosPaymentModeRoutes");

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPosPaymentModeRoutes(fullUrl, amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletResponseSchema walletLinkInitate(PaymentApplicationModels.WalletLinkRequestSchema body) throws IOException {
        return this.walletLinkInitate(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletResponseSchema walletLinkInitate(PaymentApplicationModels.WalletLinkRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("walletLinkInitate");

        Response<PaymentApplicationModels.WalletResponseSchema> response = paymentApplicationApiList.walletLinkInitate(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletResponseSchema linkWallet(PaymentApplicationModels.WalletVerifyRequestSchema body) throws IOException {
        return this.linkWallet(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletResponseSchema linkWallet(PaymentApplicationModels.WalletVerifyRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("linkWallet");

        Response<PaymentApplicationModels.WalletResponseSchema> response = paymentApplicationApiList.linkWallet(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletResponseSchema delinkWallet(PaymentApplicationModels.WalletDelinkRequestSchema body) throws IOException {
        return this.delinkWallet(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletResponseSchema delinkWallet(PaymentApplicationModels.WalletDelinkRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("delinkWallet");

        Response<PaymentApplicationModels.WalletResponseSchema> response = paymentApplicationApiList.delinkWallet(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RupifiBannerResponse getRupifiBannerDetails() throws IOException {
        return this.getRupifiBannerDetails(new HashMap<>());
    }

    public PaymentApplicationModels.RupifiBannerResponse getRupifiBannerDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getRupifiBannerDetails");

        Response<PaymentApplicationModels.RupifiBannerResponse> response = paymentApplicationApiList.getRupifiBannerDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.EpaylaterBannerResponse getEpaylaterBannerDetails() throws IOException {
        return this.getEpaylaterBannerDetails(new HashMap<>());
    }

    public PaymentApplicationModels.EpaylaterBannerResponse getEpaylaterBannerDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getEpaylaterBannerDetails");

        Response<PaymentApplicationModels.EpaylaterBannerResponse> response = paymentApplicationApiList.getEpaylaterBannerDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ResendOrCancelPaymentResponse resendOrCancelPayment(PaymentApplicationModels.ResendOrCancelPaymentRequest body) throws IOException {
        return this.resendOrCancelPayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ResendOrCancelPaymentResponse resendOrCancelPayment(PaymentApplicationModels.ResendOrCancelPaymentRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("resendOrCancelPayment");

        Response<PaymentApplicationModels.ResendOrCancelPaymentResponse> response = paymentApplicationApiList.resendOrCancelPayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.renderHTMLResponse renderHTML(PaymentApplicationModels.renderHTMLRequest body) throws IOException {
        return this.renderHTML(body, new HashMap<>());
    }

    public PaymentApplicationModels.renderHTMLResponse renderHTML(PaymentApplicationModels.renderHTMLRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("renderHTML");

        Response<PaymentApplicationModels.renderHTMLResponse> response = paymentApplicationApiList.renderHTML(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ValidateVPAResponse validateVPA(PaymentApplicationModels.ValidateVPARequest body) throws IOException {
        return this.validateVPA(body, new HashMap<>());
    }

    public PaymentApplicationModels.ValidateVPAResponse validateVPA(PaymentApplicationModels.ValidateVPARequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateVPA");

        Response<PaymentApplicationModels.ValidateVPAResponse> response = paymentApplicationApiList.validateVPA(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CardDetailsResponse cardDetails(String cardInfo, String aggregator) throws IOException {
        return this.cardDetails(cardInfo, aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CardDetailsResponse cardDetails(String cardInfo, String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("cardDetails");
        fullUrl = fullUrl.replace("{" + "card_info" + "}",cardInfo.toString());

        Response<PaymentApplicationModels.CardDetailsResponse> response = paymentApplicationApiList.cardDetails(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.TransferModeResponse getActiveRefundTransferModes() throws IOException {
        return this.getActiveRefundTransferModes(new HashMap<>());
    }

    public PaymentApplicationModels.TransferModeResponse getActiveRefundTransferModes(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveRefundTransferModes");

        Response<PaymentApplicationModels.TransferModeResponse> response = paymentApplicationApiList.getActiveRefundTransferModes(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.UpdateRefundTransferModeResponse enableOrDisableRefundTransferMode(PaymentApplicationModels.UpdateRefundTransferModeRequest body) throws IOException {
        return this.enableOrDisableRefundTransferMode(body, new HashMap<>());
    }

    public PaymentApplicationModels.UpdateRefundTransferModeResponse enableOrDisableRefundTransferMode(PaymentApplicationModels.UpdateRefundTransferModeRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("enableOrDisableRefundTransferMode");

        Response<PaymentApplicationModels.UpdateRefundTransferModeResponse> response = paymentApplicationApiList.enableOrDisableRefundTransferMode(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.OrderBeneficiaryResponse getUserBeneficiariesDetail(String orderId) throws IOException {
        return this.getUserBeneficiariesDetail(orderId, new HashMap<>());
    }

    public PaymentApplicationModels.OrderBeneficiaryResponse getUserBeneficiariesDetail(String orderId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserBeneficiariesDetail");

        Response<PaymentApplicationModels.OrderBeneficiaryResponse> response = paymentApplicationApiList.getUserBeneficiariesDetail(fullUrl, orderId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.IfscCodeResponse verifyIfscCode(String ifscCode) throws IOException {
        return this.verifyIfscCode(ifscCode, new HashMap<>());
    }

    public PaymentApplicationModels.IfscCodeResponse verifyIfscCode(String ifscCode, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyIfscCode");

        Response<PaymentApplicationModels.IfscCodeResponse> response = paymentApplicationApiList.verifyIfscCode(fullUrl, ifscCode, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.OrderBeneficiaryResponse getOrderBeneficiariesDetail(String orderId) throws IOException {
        return this.getOrderBeneficiariesDetail(orderId, new HashMap<>());
    }

    public PaymentApplicationModels.OrderBeneficiaryResponse getOrderBeneficiariesDetail(String orderId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderBeneficiariesDetail");

        Response<PaymentApplicationModels.OrderBeneficiaryResponse> response = paymentApplicationApiList.getOrderBeneficiariesDetail(fullUrl, orderId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse verifyOtpAndAddBeneficiaryForBank(PaymentApplicationModels.AddBeneficiaryViaOtpVerificationRequest body) throws IOException {
        return this.verifyOtpAndAddBeneficiaryForBank(body, new HashMap<>());
    }

    public PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse verifyOtpAndAddBeneficiaryForBank(PaymentApplicationModels.AddBeneficiaryViaOtpVerificationRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForBank");

        Response<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForBank(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RefundAccountResponse addBeneficiaryDetails(PaymentApplicationModels.AddBeneficiaryDetailsRequest body) throws IOException {
        return this.addBeneficiaryDetails(body, new HashMap<>());
    }

    public PaymentApplicationModels.RefundAccountResponse addBeneficiaryDetails(PaymentApplicationModels.AddBeneficiaryDetailsRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addBeneficiaryDetails");

        Response<PaymentApplicationModels.RefundAccountResponse> response = paymentApplicationApiList.addBeneficiaryDetails(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RefundAccountResponse addRefundBankAccountUsingOTP(PaymentApplicationModels.AddBeneficiaryDetailsOTPRequest body) throws IOException {
        return this.addRefundBankAccountUsingOTP(body, new HashMap<>());
    }

    public PaymentApplicationModels.RefundAccountResponse addRefundBankAccountUsingOTP(PaymentApplicationModels.AddBeneficiaryDetailsOTPRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addRefundBankAccountUsingOTP");

        Response<PaymentApplicationModels.RefundAccountResponse> response = paymentApplicationApiList.addRefundBankAccountUsingOTP(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletOtpResponse verifyOtpAndAddBeneficiaryForWallet(PaymentApplicationModels.WalletOtpRequest body) throws IOException {
        return this.verifyOtpAndAddBeneficiaryForWallet(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletOtpResponse verifyOtpAndAddBeneficiaryForWallet(PaymentApplicationModels.WalletOtpRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForWallet");

        Response<PaymentApplicationModels.WalletOtpResponse> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForWallet(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.SetDefaultBeneficiaryResponse updateDefaultBeneficiary(PaymentApplicationModels.SetDefaultBeneficiaryRequest body) throws IOException {
        return this.updateDefaultBeneficiary(body, new HashMap<>());
    }

    public PaymentApplicationModels.SetDefaultBeneficiaryResponse updateDefaultBeneficiary(PaymentApplicationModels.SetDefaultBeneficiaryRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateDefaultBeneficiary");

        Response<PaymentApplicationModels.SetDefaultBeneficiaryResponse> response = paymentApplicationApiList.updateDefaultBeneficiary(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId) throws IOException {
        return this.getPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentLink");

        Response<PaymentApplicationModels.GetPaymentLinkResponse> response = paymentApplicationApiList.getPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CreatePaymentLinkResponse createPaymentLink(PaymentApplicationModels.CreatePaymentLinkRequest body) throws IOException {
        return this.createPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CreatePaymentLinkResponse createPaymentLink(PaymentApplicationModels.CreatePaymentLinkRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createPaymentLink");

        Response<PaymentApplicationModels.CreatePaymentLinkResponse> response = paymentApplicationApiList.createPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ResendPaymentLinkResponse resendPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
        return this.resendPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.ResendPaymentLinkResponse resendPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("resendPaymentLink");

        Response<PaymentApplicationModels.ResendPaymentLinkResponse> response = paymentApplicationApiList.resendPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CancelPaymentLinkResponse cancelPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
        return this.cancelPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CancelPaymentLinkResponse cancelPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("cancelPaymentLink");

        Response<PaymentApplicationModels.CancelPaymentLinkResponse> response = paymentApplicationApiList.cancelPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutesPaymentLink(String paymentLinkId) throws IOException {
        return this.getPaymentModeRoutesPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutesPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentModeRoutesPaymentLink");

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPaymentModeRoutesPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId) throws IOException {
        return this.pollingPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("pollingPaymentLink");

        Response<PaymentApplicationModels.PollingPaymentLinkResponse> response = paymentApplicationApiList.pollingPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CreateOrderUserResponse createOrderHandlerPaymentLink(PaymentApplicationModels.CreateOrderUserRequest body) throws IOException {
        return this.createOrderHandlerPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CreateOrderUserResponse createOrderHandlerPaymentLink(PaymentApplicationModels.CreateOrderUserRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createOrderHandlerPaymentLink");

        Response<PaymentApplicationModels.CreateOrderUserResponse> response = paymentApplicationApiList.createOrderHandlerPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentInitializationResponse initialisePaymentPaymentLink(PaymentApplicationModels.PaymentInitializationRequest body) throws IOException {
        return this.initialisePaymentPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentInitializationResponse initialisePaymentPaymentLink(PaymentApplicationModels.PaymentInitializationRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("initialisePaymentPaymentLink");

        Response<PaymentApplicationModels.PaymentInitializationResponse> response = paymentApplicationApiList.initialisePaymentPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatusPaymentLink(PaymentApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
        return this.checkAndUpdatePaymentStatusPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatusPaymentLink(PaymentApplicationModels.PaymentStatusUpdateRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatusPaymentLink");

        Response<PaymentApplicationModels.PaymentStatusUpdateResponse> response = paymentApplicationApiList.checkAndUpdatePaymentStatusPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CustomerCreditSummaryResponse customerCreditSummary(String aggregator) throws IOException {
        return this.customerCreditSummary(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CustomerCreditSummaryResponse customerCreditSummary(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("customerCreditSummary");

        Response<PaymentApplicationModels.CustomerCreditSummaryResponse> response = paymentApplicationApiList.customerCreditSummary(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RedirectToAggregatorResponse redirectToAggregator(String source, String aggregator) throws IOException {
        return this.redirectToAggregator(source, aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.RedirectToAggregatorResponse redirectToAggregator(String source, String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("redirectToAggregator");

        Response<PaymentApplicationModels.RedirectToAggregatorResponse> response = paymentApplicationApiList.redirectToAggregator(fullUrl, source, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CheckCreditResponse checkCredit(String aggregator) throws IOException {
        return this.checkCredit(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CheckCreditResponse checkCredit(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkCredit");

        Response<PaymentApplicationModels.CheckCreditResponse> response = paymentApplicationApiList.checkCredit(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CustomerOnboardingResponse customerOnboard(PaymentApplicationModels.CustomerOnboardingRequest body) throws IOException {
        return this.customerOnboard(body, new HashMap<>());
    }

    public PaymentApplicationModels.CustomerOnboardingResponse customerOnboard(PaymentApplicationModels.CustomerOnboardingRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("customerOnboard");

        Response<PaymentApplicationModels.CustomerOnboardingResponse> response = paymentApplicationApiList.customerOnboard(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.OutstandingOrderDetailsResponse outstandingOrderDetails(String aggregator) throws IOException {
        return this.outstandingOrderDetails(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.OutstandingOrderDetailsResponse outstandingOrderDetails(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("outstandingOrderDetails");

        Response<PaymentApplicationModels.OutstandingOrderDetailsResponse> response = paymentApplicationApiList.outstandingOrderDetails(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaidOrderDetailsResponse paidOrderDetails(String aggregator) throws IOException {
        return this.paidOrderDetails(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.PaidOrderDetailsResponse paidOrderDetails(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("paidOrderDetails");

        Response<PaymentApplicationModels.PaidOrderDetailsResponse> response = paymentApplicationApiList.paidOrderDetails(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentOrderResponse createPaymentOrder(PaymentApplicationModels.PaymentOrderRequest body) throws IOException {
        return this.createPaymentOrder(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentOrderResponse createPaymentOrder(PaymentApplicationModels.PaymentOrderRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createPaymentOrder");

        Response<PaymentApplicationModels.PaymentOrderResponse> response = paymentApplicationApiList.createPaymentOrder(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}