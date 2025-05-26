package com.sdk.application.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentApplicationApiList {

    @GET 
    Call<PaymentApplicationModels.AggregatorsConfigDetailResponse> getAggregatorsConfig(@Url String url1, @Header("x-api-token") String xApiToken, @Query("refresh") Boolean refresh, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.AttachCardsResponse> attachCardToCustomer(@Url String url1, @Body PaymentApplicationModels.AttachCardRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.ActiveCardPaymentGatewayResponse> getActiveCardAggregator(@Url String url1, @Query("refresh") Boolean refresh, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.ListCardsResponse> getActiveUserCards(@Url String url1, @Query("force_refresh") Boolean forceRefresh, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.DeleteCardsResponse> deleteUserCard(@Url String url1, @Body PaymentApplicationModels.DeletehCardRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ValidateCustomerResponse> verifyCustomerForPayment(@Url String url1, @Body PaymentApplicationModels.ValidateCustomerRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ChargeCustomerResponse> verifyAndChargePayment(@Url String url1, @Body PaymentApplicationModels.ChargeCustomerRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentInitializationResponse> initialisePayment(@Url String url1, @Body PaymentApplicationModels.PaymentInitializationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Url String url1, @Body PaymentApplicationModels.PaymentStatusUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("order_id") String orderId, @Query("card_reference") String cardReference, @Query("user_details") String userDetails, @Query("display_split") Boolean displaySplit, @Query("advance_payment") Boolean advancePayment, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPosPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("pincode") String pincode, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("card_reference") String cardReference, @Query("order_type") String orderType, @Query("user_details") String userDetails, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> walletLinkInitiate(@Url String url1, @Body PaymentApplicationModels.WalletLinkRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> linkWallet(@Url String url1, @Body PaymentApplicationModels.WalletVerifyRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> delinkWallet(@Url String url1, @Body PaymentApplicationModels.WalletDelinkRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.RupifiBannerResponse> getRupifiBannerDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.EpaylaterBannerResponse> getEpaylaterBannerDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ResendOrCancelPaymentResponse> resendOrCancelPayment(@Url String url1, @Body PaymentApplicationModels.ResendOrCancelPaymentRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.renderHTMLResponse> renderHTML(@Url String url1, @Body PaymentApplicationModels.renderHTMLRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ValidateVPAResponse> validateVPA(@Url String url1, @Body PaymentApplicationModels.ValidateVPARequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CardDetailsResponse> cardDetails(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.TransferModeResponse> getActiveRefundTransferModes(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<PaymentApplicationModels.UpdateRefundTransferModeResponse> enableOrDisableRefundTransferMode(@Url String url1, @Body PaymentApplicationModels.UpdateRefundTransferModeRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryResponse> getUserBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.IfscCodeResponse> verifyIfscCode(@Url String url1, @Query("ifsc_code") String ifscCode, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryResponse> getOrderBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationResponse> verifyOtpAndAddBeneficiaryForBank(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryViaOtpVerificationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.RefundAccountResponse> addBeneficiaryDetails(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryDetailsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryDetailsOTPRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletOtpResponse> verifyOtpAndAddBeneficiaryForWallet(@Url String url1, @Body PaymentApplicationModels.WalletOtpRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.SetDefaultBeneficiaryResponse> updateDefaultBeneficiary(@Url String url1, @Body PaymentApplicationModels.SetDefaultBeneficiaryRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.GetPaymentLinkResponse> getPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CreatePaymentLinkResponse> createPaymentLink(@Url String url1, @Body PaymentApplicationModels.CreatePaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ResendPaymentLinkResponse> resendPaymentLink(@Url String url1, @Body PaymentApplicationModels.CancelOrResendPaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CancelPaymentLinkResponse> cancelPaymentLink(@Url String url1, @Body PaymentApplicationModels.CancelOrResendPaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutesPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PollingPaymentLinkResponse> pollingPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CreateOrderUserResponse> createOrderHandlerPaymentLink(@Url String url1, @Body PaymentApplicationModels.CreateOrderUserRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentInitializationResponse> initialisePaymentPaymentLink(@Url String url1, @Body PaymentApplicationModels.PaymentInitializationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatusPaymentLink(@Url String url1, @Body PaymentApplicationModels.PaymentStatusUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CustomerCreditSummaryResponse> customerCreditSummary(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.RedirectToAggregatorResponse> redirectToAggregator(@Url String url1, @Query("source") String source, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CheckCreditResponse> checkCredit(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CustomerOnboardingResponse> customerOnboard(@Url String url1, @Body PaymentApplicationModels.CustomerOnboardingRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.OutstandingOrderDetailsResponse> outstandingOrderDetails(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaidOrderDetailsResponse> paidOrderDetails(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentOrderResponse> createPaymentOrder(@Url String url1, @Body PaymentApplicationModels.PaymentOrderRequest payload, @HeaderMap Map<String, String> requestHeaders);
}