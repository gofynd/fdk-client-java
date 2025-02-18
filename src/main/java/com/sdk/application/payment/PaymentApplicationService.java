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
        relativeUrls.put("walletLinkInitiate","/service/application/payment/v1.0/payment/options/wallet/link".substring(1));
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
        relativeUrls.put("paidOrderDetails","/service/application/payment/v1.0/payment/paid-orders/".substring(1));
        relativeUrls.put("createPaymentOrder","/service/application/payment/v1.0/payment-orders/".substring(1));
        relativeUrls.put("validateCustomerAndCreditSummary","/service/application/payment/v1.0/payment/validate/customer-credits-v2".substring(1)); 

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

    public PaymentApplicationModels.AggregatorsConfigDetail getAggregatorsConfig(Boolean refresh) throws IOException {
        return this.getAggregatorsConfig(refresh, new HashMap<>());
    }

    public PaymentApplicationModels.AggregatorsConfigDetail getAggregatorsConfig(Boolean refresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAggregatorsConfig");

        Response<PaymentApplicationModels.AggregatorsConfigDetail> response = paymentApplicationApiList.getAggregatorsConfig(fullUrl, refresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.AttachCardsDetails attachCardToCustomer(PaymentApplicationModels.AttachCard body) throws IOException {
        return this.attachCardToCustomer(body, new HashMap<>());
    }

    public PaymentApplicationModels.AttachCardsDetails attachCardToCustomer(PaymentApplicationModels.AttachCard body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("attachCardToCustomer");

        Response<PaymentApplicationModels.AttachCardsDetails> response = paymentApplicationApiList.attachCardToCustomer(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ActiveCardPaymentGatewayDetails getActiveCardAggregator(Boolean refresh) throws IOException {
        return this.getActiveCardAggregator(refresh, new HashMap<>());
    }

    public PaymentApplicationModels.ActiveCardPaymentGatewayDetails getActiveCardAggregator(Boolean refresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveCardAggregator");

        Response<PaymentApplicationModels.ActiveCardPaymentGatewayDetails> response = paymentApplicationApiList.getActiveCardAggregator(fullUrl, refresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ListCardsDetails getActiveUserCards(Boolean forceRefresh) throws IOException {
        return this.getActiveUserCards(forceRefresh, new HashMap<>());
    }

    public PaymentApplicationModels.ListCardsDetails getActiveUserCards(Boolean forceRefresh, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveUserCards");

        Response<PaymentApplicationModels.ListCardsDetails> response = paymentApplicationApiList.getActiveUserCards(fullUrl, forceRefresh, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.DeleteCardsDetails deleteUserCard(PaymentApplicationModels.DeleteCard body) throws IOException {
        return this.deleteUserCard(body, new HashMap<>());
    }

    public PaymentApplicationModels.DeleteCardsDetails deleteUserCard(PaymentApplicationModels.DeleteCard body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteUserCard");

        Response<PaymentApplicationModels.DeleteCardsDetails> response = paymentApplicationApiList.deleteUserCard(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ValidateCustomerDetails verifyCustomerForPayment(PaymentApplicationModels.ValidateCustomer body) throws IOException {
        return this.verifyCustomerForPayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ValidateCustomerDetails verifyCustomerForPayment(PaymentApplicationModels.ValidateCustomer body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyCustomerForPayment");

        Response<PaymentApplicationModels.ValidateCustomerDetails> response = paymentApplicationApiList.verifyCustomerForPayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ChargeCustomerDetails verifyAndChargePayment(PaymentApplicationModels.ChargeCustomer body) throws IOException {
        return this.verifyAndChargePayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ChargeCustomerDetails verifyAndChargePayment(PaymentApplicationModels.ChargeCustomer body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyAndChargePayment");

        Response<PaymentApplicationModels.ChargeCustomerDetails> response = paymentApplicationApiList.verifyAndChargePayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentInitializationDetails initialisePayment(PaymentApplicationModels.PaymentInitialization body) throws IOException {
        return this.initialisePayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentInitializationDetails initialisePayment(PaymentApplicationModels.PaymentInitialization body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("initialisePayment");

        Response<PaymentApplicationModels.PaymentInitializationDetails> response = paymentApplicationApiList.initialisePayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatus(PaymentApplicationModels.PaymentStatusUpdate body) throws IOException {
        return this.checkAndUpdatePaymentStatus(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatus(PaymentApplicationModels.PaymentStatusUpdate body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatus");

        Response<PaymentApplicationModels.PaymentStatusUpdateDetails> response = paymentApplicationApiList.checkAndUpdatePaymentStatus(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteDetails getPaymentModeRoutes(Integer amount, String cartId, String checkoutMode, Boolean refresh, String orderId, String cardReference, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId) throws IOException {
        return this.getPaymentModeRoutes(amount, cartId, checkoutMode, refresh, orderId, cardReference, userDetails, displaySplit, advancePayment, shipmentId, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteDetails getPaymentModeRoutes(Integer amount, String cartId, String checkoutMode, Boolean refresh, String orderId, String cardReference, String userDetails, Boolean displaySplit, Boolean advancePayment, String shipmentId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentModeRoutes");

        Response<PaymentApplicationModels.PaymentModeRouteDetails> response = paymentApplicationApiList.getPaymentModeRoutes(fullUrl, amount, cartId, checkoutMode, refresh, orderId, cardReference, userDetails, displaySplit, advancePayment, shipmentId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteDetails getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails) throws IOException {
        return this.getPosPaymentModeRoutes(amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteDetails getPosPaymentModeRoutes(Integer amount, String cartId, String pincode, String checkoutMode, Boolean refresh, String cardReference, String orderType, String userDetails, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPosPaymentModeRoutes");

        Response<PaymentApplicationModels.PaymentModeRouteDetails> response = paymentApplicationApiList.getPosPaymentModeRoutes(fullUrl, amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletResponseSchema walletLinkInitiate(PaymentApplicationModels.WalletLinkRequestSchema body) throws IOException {
        return this.walletLinkInitiate(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletResponseSchema walletLinkInitiate(PaymentApplicationModels.WalletLinkRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("walletLinkInitiate");

        Response<PaymentApplicationModels.WalletResponseSchema> response = paymentApplicationApiList.walletLinkInitiate(fullUrl, body, requestHeaders).execute();
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
    

    public PaymentApplicationModels.RupifiBannerDetails getRupifiBannerDetails() throws IOException {
        return this.getRupifiBannerDetails(new HashMap<>());
    }

    public PaymentApplicationModels.RupifiBannerDetails getRupifiBannerDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getRupifiBannerDetails");

        Response<PaymentApplicationModels.RupifiBannerDetails> response = paymentApplicationApiList.getRupifiBannerDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.EpaylaterBannerDetails getEpaylaterBannerDetails() throws IOException {
        return this.getEpaylaterBannerDetails(new HashMap<>());
    }

    public PaymentApplicationModels.EpaylaterBannerDetails getEpaylaterBannerDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getEpaylaterBannerDetails");

        Response<PaymentApplicationModels.EpaylaterBannerDetails> response = paymentApplicationApiList.getEpaylaterBannerDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ResendOrCancelPaymentDetails resendOrCancelPayment(PaymentApplicationModels.ResendOrCancelPayment body) throws IOException {
        return this.resendOrCancelPayment(body, new HashMap<>());
    }

    public PaymentApplicationModels.ResendOrCancelPaymentDetails resendOrCancelPayment(PaymentApplicationModels.ResendOrCancelPayment body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("resendOrCancelPayment");

        Response<PaymentApplicationModels.ResendOrCancelPaymentDetails> response = paymentApplicationApiList.resendOrCancelPayment(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RenderHTMLDetails renderHTML(PaymentApplicationModels.RenderHTML body) throws IOException {
        return this.renderHTML(body, new HashMap<>());
    }

    public PaymentApplicationModels.RenderHTMLDetails renderHTML(PaymentApplicationModels.RenderHTML body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("renderHTML");

        Response<PaymentApplicationModels.RenderHTMLDetails> response = paymentApplicationApiList.renderHTML(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ValidateVPADetails validateVPA(PaymentApplicationModels.ValidateVPA body) throws IOException {
        return this.validateVPA(body, new HashMap<>());
    }

    public PaymentApplicationModels.ValidateVPADetails validateVPA(PaymentApplicationModels.ValidateVPA body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateVPA");

        Response<PaymentApplicationModels.ValidateVPADetails> response = paymentApplicationApiList.validateVPA(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CardDetailsFetchedDetails cardDetails(String cardInfo, String aggregator) throws IOException {
        return this.cardDetails(cardInfo, aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CardDetailsFetchedDetails cardDetails(String cardInfo, String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("cardDetails");
        fullUrl = fullUrl.replace("{" + "card_info" + "}",cardInfo.toString());

        Response<PaymentApplicationModels.CardDetailsFetchedDetails> response = paymentApplicationApiList.cardDetails(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.TransferModeFetchDetails getActiveRefundTransferModes() throws IOException {
        return this.getActiveRefundTransferModes(new HashMap<>());
    }

    public PaymentApplicationModels.TransferModeFetchDetails getActiveRefundTransferModes(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getActiveRefundTransferModes");

        Response<PaymentApplicationModels.TransferModeFetchDetails> response = paymentApplicationApiList.getActiveRefundTransferModes(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RefundTransferModeUpdateDetails enableOrDisableRefundTransferMode(PaymentApplicationModels.UpdateRefundTransferMode body) throws IOException {
        return this.enableOrDisableRefundTransferMode(body, new HashMap<>());
    }

    public PaymentApplicationModels.RefundTransferModeUpdateDetails enableOrDisableRefundTransferMode(PaymentApplicationModels.UpdateRefundTransferMode body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("enableOrDisableRefundTransferMode");

        Response<PaymentApplicationModels.RefundTransferModeUpdateDetails> response = paymentApplicationApiList.enableOrDisableRefundTransferMode(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.OrderBeneficiaryFetchDetails getUserBeneficiariesDetail(String orderId) throws IOException {
        return this.getUserBeneficiariesDetail(orderId, new HashMap<>());
    }

    public PaymentApplicationModels.OrderBeneficiaryFetchDetails getUserBeneficiariesDetail(String orderId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserBeneficiariesDetail");

        Response<PaymentApplicationModels.OrderBeneficiaryFetchDetails> response = paymentApplicationApiList.getUserBeneficiariesDetail(fullUrl, orderId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.IfscCodeDetails verifyIfscCode(String ifscCode) throws IOException {
        return this.verifyIfscCode(ifscCode, new HashMap<>());
    }

    public PaymentApplicationModels.IfscCodeDetails verifyIfscCode(String ifscCode, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyIfscCode");

        Response<PaymentApplicationModels.IfscCodeDetails> response = paymentApplicationApiList.verifyIfscCode(fullUrl, ifscCode, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.OrderBeneficiaryFetchDetails getOrderBeneficiariesDetail(String orderId) throws IOException {
        return this.getOrderBeneficiariesDetail(orderId, new HashMap<>());
    }

    public PaymentApplicationModels.OrderBeneficiaryFetchDetails getOrderBeneficiariesDetail(String orderId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderBeneficiariesDetail");

        Response<PaymentApplicationModels.OrderBeneficiaryFetchDetails> response = paymentApplicationApiList.getOrderBeneficiariesDetail(fullUrl, orderId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.AddBeneficiaryViaOtpVerificationDetails verifyOtpAndAddBeneficiaryForBank(PaymentApplicationModels.AddBeneficiaryViaOtpVerification body) throws IOException {
        return this.verifyOtpAndAddBeneficiaryForBank(body, new HashMap<>());
    }

    public PaymentApplicationModels.AddBeneficiaryViaOtpVerificationDetails verifyOtpAndAddBeneficiaryForBank(PaymentApplicationModels.AddBeneficiaryViaOtpVerification body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForBank");

        Response<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationDetails> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForBank(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RefundAccountDetails addBeneficiaryDetails(PaymentApplicationModels.AddBeneficiaryDetails body) throws IOException {
        return this.addBeneficiaryDetails(body, new HashMap<>());
    }

    public PaymentApplicationModels.RefundAccountDetails addBeneficiaryDetails(PaymentApplicationModels.AddBeneficiaryDetails body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addBeneficiaryDetails");

        Response<PaymentApplicationModels.RefundAccountDetails> response = paymentApplicationApiList.addBeneficiaryDetails(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RefundAccountDetails addRefundBankAccountUsingOTP(PaymentApplicationModels.AddBeneficiaryDetailsOTP body) throws IOException {
        return this.addRefundBankAccountUsingOTP(body, new HashMap<>());
    }

    public PaymentApplicationModels.RefundAccountDetails addRefundBankAccountUsingOTP(PaymentApplicationModels.AddBeneficiaryDetailsOTP body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addRefundBankAccountUsingOTP");

        Response<PaymentApplicationModels.RefundAccountDetails> response = paymentApplicationApiList.addRefundBankAccountUsingOTP(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.WalletOtpDetails verifyOtpAndAddBeneficiaryForWallet(PaymentApplicationModels.WalletOtp body) throws IOException {
        return this.verifyOtpAndAddBeneficiaryForWallet(body, new HashMap<>());
    }

    public PaymentApplicationModels.WalletOtpDetails verifyOtpAndAddBeneficiaryForWallet(PaymentApplicationModels.WalletOtp body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForWallet");

        Response<PaymentApplicationModels.WalletOtpDetails> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForWallet(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.SetDefaultBeneficiaryDetails updateDefaultBeneficiary(PaymentApplicationModels.SetDefaultBeneficiary body) throws IOException {
        return this.updateDefaultBeneficiary(body, new HashMap<>());
    }

    public PaymentApplicationModels.SetDefaultBeneficiaryDetails updateDefaultBeneficiary(PaymentApplicationModels.SetDefaultBeneficiary body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateDefaultBeneficiary");

        Response<PaymentApplicationModels.SetDefaultBeneficiaryDetails> response = paymentApplicationApiList.updateDefaultBeneficiary(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.GetPaymentLinkDetails getPaymentLink(String paymentLinkId) throws IOException {
        return this.getPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.GetPaymentLinkDetails getPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentLink");

        Response<PaymentApplicationModels.GetPaymentLinkDetails> response = paymentApplicationApiList.getPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CreatePaymentLinkDetails createPaymentLink(PaymentApplicationModels.CreatePaymentLink body) throws IOException {
        return this.createPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CreatePaymentLinkDetails createPaymentLink(PaymentApplicationModels.CreatePaymentLink body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createPaymentLink");

        Response<PaymentApplicationModels.CreatePaymentLinkDetails> response = paymentApplicationApiList.createPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ResendPaymentLinkDetails resendPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLink body) throws IOException {
        return this.resendPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.ResendPaymentLinkDetails resendPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLink body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("resendPaymentLink");

        Response<PaymentApplicationModels.ResendPaymentLinkDetails> response = paymentApplicationApiList.resendPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CancelPaymentLinkDetails cancelPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLink body) throws IOException {
        return this.cancelPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CancelPaymentLinkDetails cancelPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLink body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("cancelPaymentLink");

        Response<PaymentApplicationModels.CancelPaymentLinkDetails> response = paymentApplicationApiList.cancelPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentModeRouteDetails getPaymentModeRoutesPaymentLink(String paymentLinkId) throws IOException {
        return this.getPaymentModeRoutesPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentModeRouteDetails getPaymentModeRoutesPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentModeRoutesPaymentLink");

        Response<PaymentApplicationModels.PaymentModeRouteDetails> response = paymentApplicationApiList.getPaymentModeRoutesPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PollingPaymentLinkDetails pollingPaymentLink(String paymentLinkId) throws IOException {
        return this.pollingPaymentLink(paymentLinkId, new HashMap<>());
    }

    public PaymentApplicationModels.PollingPaymentLinkDetails pollingPaymentLink(String paymentLinkId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("pollingPaymentLink");

        Response<PaymentApplicationModels.PollingPaymentLinkDetails> response = paymentApplicationApiList.pollingPaymentLink(fullUrl, paymentLinkId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CreateOrderUserDetails createOrderHandlerPaymentLink(PaymentApplicationModels.CreateOrderUser body) throws IOException {
        return this.createOrderHandlerPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.CreateOrderUserDetails createOrderHandlerPaymentLink(PaymentApplicationModels.CreateOrderUser body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createOrderHandlerPaymentLink");

        Response<PaymentApplicationModels.CreateOrderUserDetails> response = paymentApplicationApiList.createOrderHandlerPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentInitializationDetails initialisePaymentPaymentLink(PaymentApplicationModels.PaymentInitialization body) throws IOException {
        return this.initialisePaymentPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentInitializationDetails initialisePaymentPaymentLink(PaymentApplicationModels.PaymentInitialization body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("initialisePaymentPaymentLink");

        Response<PaymentApplicationModels.PaymentInitializationDetails> response = paymentApplicationApiList.initialisePaymentPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatusPaymentLink(PaymentApplicationModels.PaymentStatusUpdate body) throws IOException {
        return this.checkAndUpdatePaymentStatusPaymentLink(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentStatusUpdateDetails checkAndUpdatePaymentStatusPaymentLink(PaymentApplicationModels.PaymentStatusUpdate body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatusPaymentLink");

        Response<PaymentApplicationModels.PaymentStatusUpdateDetails> response = paymentApplicationApiList.checkAndUpdatePaymentStatusPaymentLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CustomerCreditSummaryDetails customerCreditSummary(String aggregator) throws IOException {
        return this.customerCreditSummary(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CustomerCreditSummaryDetails customerCreditSummary(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("customerCreditSummary");

        Response<PaymentApplicationModels.CustomerCreditSummaryDetails> response = paymentApplicationApiList.customerCreditSummary(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.RedirectToAggregatorDetails redirectToAggregator(String source, String aggregator) throws IOException {
        return this.redirectToAggregator(source, aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.RedirectToAggregatorDetails redirectToAggregator(String source, String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("redirectToAggregator");

        Response<PaymentApplicationModels.RedirectToAggregatorDetails> response = paymentApplicationApiList.redirectToAggregator(fullUrl, source, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CheckCreditDetails checkCredit(String aggregator) throws IOException {
        return this.checkCredit(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.CheckCreditDetails checkCredit(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkCredit");

        Response<PaymentApplicationModels.CheckCreditDetails> response = paymentApplicationApiList.checkCredit(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.CustomerOnboardingDetails customerOnboard(PaymentApplicationModels.CustomerOnboarding body) throws IOException {
        return this.customerOnboard(body, new HashMap<>());
    }

    public PaymentApplicationModels.CustomerOnboardingDetails customerOnboard(PaymentApplicationModels.CustomerOnboarding body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("customerOnboard");

        Response<PaymentApplicationModels.CustomerOnboardingDetails> response = paymentApplicationApiList.customerOnboard(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaidOrderDetails paidOrderDetails(String aggregator) throws IOException {
        return this.paidOrderDetails(aggregator, new HashMap<>());
    }

    public PaymentApplicationModels.PaidOrderDetails paidOrderDetails(String aggregator, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("paidOrderDetails");

        Response<PaymentApplicationModels.PaidOrderDetails> response = paymentApplicationApiList.paidOrderDetails(fullUrl, aggregator, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.PaymentOrderDetails createPaymentOrder(PaymentApplicationModels.PaymentOrder body) throws IOException {
        return this.createPaymentOrder(body, new HashMap<>());
    }

    public PaymentApplicationModels.PaymentOrderDetails createPaymentOrder(PaymentApplicationModels.PaymentOrder body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("createPaymentOrder");

        Response<PaymentApplicationModels.PaymentOrderDetails> response = paymentApplicationApiList.createPaymentOrder(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public PaymentApplicationModels.ValidateCustomerCreditSchema validateCustomerAndCreditSummary(PaymentApplicationModels.CustomerValidationSchema body) throws IOException {
        return this.validateCustomerAndCreditSummary(body, new HashMap<>());
    }

    public PaymentApplicationModels.ValidateCustomerCreditSchema validateCustomerAndCreditSummary(PaymentApplicationModels.CustomerValidationSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateCustomerAndCreditSummary");

        Response<PaymentApplicationModels.ValidateCustomerCreditSchema> response = paymentApplicationApiList.validateCustomerAndCreditSummary(fullUrl, body, requestHeaders).execute();
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