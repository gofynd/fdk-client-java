package com.sdk.application.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PaymentApplicationApiList {
    
    
    @GET 
    Call<PaymentApplicationModels.AggregatorsConfigDetailResponse> getAggregatorsConfig(@Url String url1,@Header("x-api-token")String xApiToken , @Query("refresh") Boolean refresh );
    
    @POST 
    Call<PaymentApplicationModels.AttachCardsResponse> attachCardToCustomer(@Url String url1 , @Body PaymentApplicationModels.AttachCardRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.ActiveCardPaymentGatewayResponse> getActiveCardAggregator(@Url String url1, @Query("refresh") Boolean refresh );
    
    @GET 
    Call<PaymentApplicationModels.ListCardsResponse> getActiveUserCards(@Url String url1, @Query("force_refresh") Boolean forceRefresh );
    
    @POST 
    Call<PaymentApplicationModels.DeleteCardsResponse> deleteUserCard(@Url String url1 , @Body PaymentApplicationModels.DeletehCardRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.ValidateCustomerResponse> verifyCustomerForPayment(@Url String url1 , @Body PaymentApplicationModels.ValidateCustomerRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.ChargeCustomerResponse> verifyAndChargePayment(@Url String url1 , @Body PaymentApplicationModels.ChargeCustomerRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.PaymentInitializationResponse> initialisePayment(@Url String url1 , @Body PaymentApplicationModels.PaymentInitializationRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Url String url1 , @Body PaymentApplicationModels.PaymentStatusUpdateRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("user_details") String userDetails );
    
    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPosPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("order_type") String orderType , @Query("user_details") String userDetails );
    
    @GET 
    Call<PaymentApplicationModels.RupifiBannerResponse> getRupifiBannerDetails(@Url String url1);
    
    @GET 
    Call<PaymentApplicationModels.EpaylaterBannerResponse> getEpaylaterBannerDetails(@Url String url1);
    
    @POST 
    Call<PaymentApplicationModels.ResendOrCancelPaymentResponse> resendOrCancelPayment(@Url String url1 , @Body PaymentApplicationModels.ResendOrCancelPaymentRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.renderHTMLResponse> renderHTML(@Url String url1 , @Body PaymentApplicationModels.renderHTMLRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.ValidateVPAResponse> validateVPA(@Url String url1 , @Body PaymentApplicationModels.ValidateVPARequest payload );
    
    @GET 
    Call<PaymentApplicationModels.CardDetailsResponse> cardDetails(@Url String url1, @Query("aggregator") String aggregator );
    
    @GET 
    Call<PaymentApplicationModels.TransferModeResponse> getActiveRefundTransferModes(@Url String url1);
    
    @PUT 
    Call<PaymentApplicationModels.UpdateRefundTransferModeResponse> enableOrDisableRefundTransferMode(@Url String url1 , @Body PaymentApplicationModels.UpdateRefundTransferModeRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryResponse> getUserBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId );
    
    @GET 
    Call<PaymentApplicationModels.IfscCodeResponse> verifyIfscCode(@Url String url1, @Query("ifsc_code") String ifscCode );
    
    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryResponse> getOrderBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId );
    
    @POST 
    Call<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse> verifyOtpAndAddBeneficiaryForBank(@Url String url1 , @Body PaymentApplicationModels.AddBeneficiaryViaOtpVerificationRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.RefundAccountResponse> addBeneficiaryDetails(@Url String url1 , @Body PaymentApplicationModels.AddBeneficiaryDetailsRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Url String url1 , @Body PaymentApplicationModels.AddBeneficiaryDetailsOTPRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.WalletOtpResponse> verifyOtpAndAddBeneficiaryForWallet(@Url String url1 , @Body PaymentApplicationModels.WalletOtpRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.SetDefaultBeneficiaryResponse> updateDefaultBeneficiary(@Url String url1 , @Body PaymentApplicationModels.SetDefaultBeneficiaryRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.GetPaymentLinkResponse> getPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId );
    
    @POST 
    Call<PaymentApplicationModels.CreatePaymentLinkResponse> createPaymentLink(@Url String url1 , @Body PaymentApplicationModels.CreatePaymentLinkRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.ResendPaymentLinkResponse> resendPaymentLink(@Url String url1 , @Body PaymentApplicationModels.CancelOrResendPaymentLinkRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.CancelPaymentLinkResponse> cancelPaymentLink(@Url String url1 , @Body PaymentApplicationModels.CancelOrResendPaymentLinkRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutesPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId );
    
    @GET 
    Call<PaymentApplicationModels.PollingPaymentLinkResponse> pollingPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId );
    
    @POST 
    Call<PaymentApplicationModels.CreateOrderUserResponse> createOrderHandlerPaymentLink(@Url String url1 , @Body PaymentApplicationModels.CreateOrderUserRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.PaymentInitializationResponse> initialisePaymentPaymentLink(@Url String url1 , @Body PaymentApplicationModels.PaymentInitializationRequest payload );
    
    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatusPaymentLink(@Url String url1 , @Body PaymentApplicationModels.PaymentStatusUpdateRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.CustomerCreditSummaryResponse> customerCreditSummary(@Url String url1, @Query("aggregator") String aggregator );
    
    @GET 
    Call<PaymentApplicationModels.RedirectToAggregatorResponse> redirectToAggregator(@Url String url1, @Query("source") String source , @Query("aggregator") String aggregator );
    
    @GET 
    Call<PaymentApplicationModels.CheckCreditResponse> checkCredit(@Url String url1, @Query("aggregator") String aggregator );
    
    @POST 
    Call<PaymentApplicationModels.CustomerOnboardingResponse> customerOnboard(@Url String url1 , @Body PaymentApplicationModels.CustomerOnboardingRequest payload );
    
    @GET 
    Call<PaymentApplicationModels.OutstandingOrderDetailsResponse> outstandingOrderDetails(@Url String url1, @Query("aggregator") String aggregator );
    
    @GET 
    Call<PaymentApplicationModels.PaidOrderDetailsResponse> paidOrderDetails(@Url String url1, @Query("aggregator") String aggregator );
}