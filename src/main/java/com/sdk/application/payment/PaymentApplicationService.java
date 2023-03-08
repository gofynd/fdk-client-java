package com.sdk.application.payment;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.ApplicationConfig;







@Getter
 public class PaymentApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PaymentApplicationApiList paymentApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

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

    

     
    
    
    public PaymentApplicationModels.AggregatorsConfigDetailResponse getAggregatorsConfig(String xApiToken , Boolean refresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAggregatorsConfig");
        

        Response<PaymentApplicationModels.AggregatorsConfigDetailResponse> response = paymentApplicationApiList.getAggregatorsConfig(fullUrl  ,xApiToken, refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.AttachCardsResponse attachCardToCustomer(PaymentApplicationModels.AttachCardRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("attachCardToCustomer");
        

        Response<PaymentApplicationModels.AttachCardsResponse> response = paymentApplicationApiList.attachCardToCustomer(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ActiveCardPaymentGatewayResponse getActiveCardAggregator(Boolean refresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveCardAggregator");
        

        Response<PaymentApplicationModels.ActiveCardPaymentGatewayResponse> response = paymentApplicationApiList.getActiveCardAggregator(fullUrl  ,refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ListCardsResponse getActiveUserCards(Boolean forceRefresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveUserCards");
        

        Response<PaymentApplicationModels.ListCardsResponse> response = paymentApplicationApiList.getActiveUserCards(fullUrl  ,forceRefresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.DeleteCardsResponse deleteUserCard(PaymentApplicationModels.DeletehCardRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteUserCard");
        

        Response<PaymentApplicationModels.DeleteCardsResponse> response = paymentApplicationApiList.deleteUserCard(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ValidateCustomerResponse verifyCustomerForPayment(PaymentApplicationModels.ValidateCustomerRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyCustomerForPayment");
        

        Response<PaymentApplicationModels.ValidateCustomerResponse> response = paymentApplicationApiList.verifyCustomerForPayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ChargeCustomerResponse verifyAndChargePayment(PaymentApplicationModels.ChargeCustomerRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyAndChargePayment");
        

        Response<PaymentApplicationModels.ChargeCustomerResponse> response = paymentApplicationApiList.verifyAndChargePayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentInitializationResponse initialisePayment(PaymentApplicationModels.PaymentInitializationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("initialisePayment");
        

        Response<PaymentApplicationModels.PaymentInitializationResponse> response = paymentApplicationApiList.initialisePayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(PaymentApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatus");
        

        Response<PaymentApplicationModels.PaymentStatusUpdateResponse> response = paymentApplicationApiList.checkAndUpdatePaymentStatus(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String cardReference , String userDetails ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentModeRoutes");
        

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPaymentModeRoutes(fullUrl  ,amount, cartId, pincode, checkoutMode, refresh, cardReference, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentModeRouteResponse getPosPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String cardReference , String orderType , String userDetails ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPosPaymentModeRoutes");
        

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPosPaymentModeRoutes(fullUrl  ,amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.RupifiBannerResponse getRupifiBannerDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getRupifiBannerDetails");
        

        Response<PaymentApplicationModels.RupifiBannerResponse> response = paymentApplicationApiList.getRupifiBannerDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.EpaylaterBannerResponse getEpaylaterBannerDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getEpaylaterBannerDetails");
        

        Response<PaymentApplicationModels.EpaylaterBannerResponse> response = paymentApplicationApiList.getEpaylaterBannerDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ResendOrCancelPaymentResponse resendOrCancelPayment(PaymentApplicationModels.ResendOrCancelPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("resendOrCancelPayment");
        

        Response<PaymentApplicationModels.ResendOrCancelPaymentResponse> response = paymentApplicationApiList.resendOrCancelPayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.renderHTMLResponse renderHTML(PaymentApplicationModels.renderHTMLRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("renderHTML");
        

        Response<PaymentApplicationModels.renderHTMLResponse> response = paymentApplicationApiList.renderHTML(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ValidateVPAResponse validateVPA(PaymentApplicationModels.ValidateVPARequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("validateVPA");
        

        Response<PaymentApplicationModels.ValidateVPAResponse> response = paymentApplicationApiList.validateVPA(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CardDetailsResponse cardDetails(String cardInfo , String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("cardDetails");
        
        fullUrl = fullUrl.replace("{" + "card_info" +"}",cardInfo.toString());
        

        Response<PaymentApplicationModels.CardDetailsResponse> response = paymentApplicationApiList.cardDetails(fullUrl  ,aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.TransferModeResponse getActiveRefundTransferModes() throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveRefundTransferModes");
        

        Response<PaymentApplicationModels.TransferModeResponse> response = paymentApplicationApiList.getActiveRefundTransferModes(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.UpdateRefundTransferModeResponse enableOrDisableRefundTransferMode(PaymentApplicationModels.UpdateRefundTransferModeRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("enableOrDisableRefundTransferMode");
        

        Response<PaymentApplicationModels.UpdateRefundTransferModeResponse> response = paymentApplicationApiList.enableOrDisableRefundTransferMode(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.OrderBeneficiaryResponse getUserBeneficiariesDetail(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getUserBeneficiariesDetail");
        

        Response<PaymentApplicationModels.OrderBeneficiaryResponse> response = paymentApplicationApiList.getUserBeneficiariesDetail(fullUrl  ,orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.IfscCodeResponse verifyIfscCode(String ifscCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyIfscCode");
        

        Response<PaymentApplicationModels.IfscCodeResponse> response = paymentApplicationApiList.verifyIfscCode(fullUrl  ,ifscCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.OrderBeneficiaryResponse getOrderBeneficiariesDetail(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderBeneficiariesDetail");
        

        Response<PaymentApplicationModels.OrderBeneficiaryResponse> response = paymentApplicationApiList.getOrderBeneficiariesDetail(fullUrl  ,orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse verifyOtpAndAddBeneficiaryForBank(PaymentApplicationModels.AddBeneficiaryViaOtpVerificationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForBank");
        

        Response<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForBank(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.RefundAccountResponse addBeneficiaryDetails(PaymentApplicationModels.AddBeneficiaryDetailsRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addBeneficiaryDetails");
        

        Response<PaymentApplicationModels.RefundAccountResponse> response = paymentApplicationApiList.addBeneficiaryDetails(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.RefundAccountResponse addRefundBankAccountUsingOTP(PaymentApplicationModels.AddBeneficiaryDetailsOTPRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addRefundBankAccountUsingOTP");
        

        Response<PaymentApplicationModels.RefundAccountResponse> response = paymentApplicationApiList.addRefundBankAccountUsingOTP(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.WalletOtpResponse verifyOtpAndAddBeneficiaryForWallet(PaymentApplicationModels.WalletOtpRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForWallet");
        

        Response<PaymentApplicationModels.WalletOtpResponse> response = paymentApplicationApiList.verifyOtpAndAddBeneficiaryForWallet(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.SetDefaultBeneficiaryResponse updateDefaultBeneficiary(PaymentApplicationModels.SetDefaultBeneficiaryRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateDefaultBeneficiary");
        

        Response<PaymentApplicationModels.SetDefaultBeneficiaryResponse> response = paymentApplicationApiList.updateDefaultBeneficiary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentLink");
        

        Response<PaymentApplicationModels.GetPaymentLinkResponse> response = paymentApplicationApiList.getPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CreatePaymentLinkResponse createPaymentLink(PaymentApplicationModels.CreatePaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("createPaymentLink");
        

        Response<PaymentApplicationModels.CreatePaymentLinkResponse> response = paymentApplicationApiList.createPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.ResendPaymentLinkResponse resendPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("resendPaymentLink");
        

        Response<PaymentApplicationModels.ResendPaymentLinkResponse> response = paymentApplicationApiList.resendPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CancelPaymentLinkResponse cancelPaymentLink(PaymentApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("cancelPaymentLink");
        

        Response<PaymentApplicationModels.CancelPaymentLinkResponse> response = paymentApplicationApiList.cancelPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentModeRouteResponse getPaymentModeRoutesPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentModeRoutesPaymentLink");
        

        Response<PaymentApplicationModels.PaymentModeRouteResponse> response = paymentApplicationApiList.getPaymentModeRoutesPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("pollingPaymentLink");
        

        Response<PaymentApplicationModels.PollingPaymentLinkResponse> response = paymentApplicationApiList.pollingPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CreateOrderUserResponse createOrderHandlerPaymentLink(PaymentApplicationModels.CreateOrderUserRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("createOrderHandlerPaymentLink");
        

        Response<PaymentApplicationModels.CreateOrderUserResponse> response = paymentApplicationApiList.createOrderHandlerPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentInitializationResponse initialisePaymentPaymentLink(PaymentApplicationModels.PaymentInitializationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("initialisePaymentPaymentLink");
        

        Response<PaymentApplicationModels.PaymentInitializationResponse> response = paymentApplicationApiList.initialisePaymentPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatusPaymentLink(PaymentApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatusPaymentLink");
        

        Response<PaymentApplicationModels.PaymentStatusUpdateResponse> response = paymentApplicationApiList.checkAndUpdatePaymentStatusPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CustomerCreditSummaryResponse customerCreditSummary(String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("customerCreditSummary");
        

        Response<PaymentApplicationModels.CustomerCreditSummaryResponse> response = paymentApplicationApiList.customerCreditSummary(fullUrl  ,aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.RedirectToAggregatorResponse redirectToAggregator(String source , String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("redirectToAggregator");
        

        Response<PaymentApplicationModels.RedirectToAggregatorResponse> response = paymentApplicationApiList.redirectToAggregator(fullUrl  ,source, aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CheckCreditResponse checkCredit(String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("checkCredit");
        

        Response<PaymentApplicationModels.CheckCreditResponse> response = paymentApplicationApiList.checkCredit(fullUrl  ,aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PaymentApplicationModels.CustomerOnboardingResponse customerOnboard(PaymentApplicationModels.CustomerOnboardingRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("customerOnboard");
        

        Response<PaymentApplicationModels.CustomerOnboardingResponse> response = paymentApplicationApiList.customerOnboard(fullUrl , body).execute();
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
