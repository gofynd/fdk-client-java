package com.sdk.application.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentApplicationApiList {

    @GET 
    Call<PaymentApplicationModels.AggregatorsConfigDetail> getAggregatorsConfig(@Url String url1, @Query("refresh") Boolean refresh, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.AttachCardsDetails> attachCardToCustomer(@Url String url1, @Body PaymentApplicationModels.AttachCard payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.ActiveCardPaymentGatewayDetails> getActiveCardAggregator(@Url String url1, @Query("refresh") Boolean refresh, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.ListCardsDetails> getActiveUserCards(@Url String url1, @Query("force_refresh") Boolean forceRefresh, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.DeleteCardsDetails> deleteUserCard(@Url String url1, @Body PaymentApplicationModels.DeleteCard payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ValidateCustomerDetails> verifyCustomerForPayment(@Url String url1, @Body PaymentApplicationModels.ValidateCustomer payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ChargeCustomerDetails> verifyAndChargePayment(@Url String url1, @Body PaymentApplicationModels.ChargeCustomer payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentInitializationDetails> initialisePayment(@Url String url1, @Body PaymentApplicationModels.PaymentInitialization payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateDetails> checkAndUpdatePaymentStatus(@Url String url1, @Body PaymentApplicationModels.PaymentStatusUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteDetails> getPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("order_id") String orderId, @Query("card_reference") String cardReference, @Query("user_details") String userDetails, @Query("display_split") Boolean displaySplit, @Query("advance_payment") Boolean advancePayment, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteDetails> getPosPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("pincode") String pincode, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("card_reference") String cardReference, @Query("order_type") String orderType, @Query("user_details") String userDetails, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> walletLinkInitiate(@Url String url1, @Body PaymentApplicationModels.WalletLinkRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> linkWallet(@Url String url1, @Body PaymentApplicationModels.WalletVerifyRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletResponseSchema> delinkWallet(@Url String url1, @Body PaymentApplicationModels.WalletDelinkRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.RupifiBannerDetails> getRupifiBannerDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.EpaylaterBannerDetails> getEpaylaterBannerDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ResendOrCancelPaymentDetails> resendOrCancelPayment(@Url String url1, @Body PaymentApplicationModels.ResendOrCancelPayment payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.RenderHTMLDetails> renderHTML(@Url String url1, @Body PaymentApplicationModels.RenderHTML payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ValidateVPADetails> validateVPA(@Url String url1, @Body PaymentApplicationModels.ValidateVPA payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CardDetailsFetchedDetails> cardDetails(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.TransferModeFetchDetails> getActiveRefundTransferModes(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<PaymentApplicationModels.RefundTransferModeUpdateDetails> enableOrDisableRefundTransferMode(@Url String url1, @Body PaymentApplicationModels.UpdateRefundTransferMode payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryFetchDetails> getUserBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.IfscCodeDetails> verifyIfscCode(@Url String url1, @Query("ifsc_code") String ifscCode, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.OrderBeneficiaryFetchDetails> getOrderBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.AddBeneficiaryViaOtpVerificationDetails> verifyOtpAndAddBeneficiaryForBank(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryViaOtpVerification payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.RefundAccountDetails> addBeneficiaryDetails(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.RefundAccountDetails> addRefundBankAccountUsingOTP(@Url String url1, @Body PaymentApplicationModels.AddBeneficiaryDetailsOTP payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.WalletOtpDetails> verifyOtpAndAddBeneficiaryForWallet(@Url String url1, @Body PaymentApplicationModels.WalletOtp payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.SetDefaultBeneficiaryDetails> updateDefaultBeneficiary(@Url String url1, @Body PaymentApplicationModels.SetDefaultBeneficiary payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.GetPaymentLinkDetails> getPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CreatePaymentLinkDetails> createPaymentLink(@Url String url1, @Body PaymentApplicationModels.CreatePaymentLink payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ResendPaymentLinkDetails> resendPaymentLink(@Url String url1, @Body PaymentApplicationModels.CancelOrResendPaymentLink payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CancelPaymentLinkDetails> cancelPaymentLink(@Url String url1, @Body PaymentApplicationModels.CancelOrResendPaymentLink payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaymentModeRouteDetails> getPaymentModeRoutesPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PollingPaymentLinkDetails> pollingPaymentLink(@Url String url1, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CreateOrderUserDetails> createOrderHandlerPaymentLink(@Url String url1, @Body PaymentApplicationModels.CreateOrderUser payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentInitializationDetails> initialisePaymentPaymentLink(@Url String url1, @Body PaymentApplicationModels.PaymentInitialization payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentStatusUpdateDetails> checkAndUpdatePaymentStatusPaymentLink(@Url String url1, @Body PaymentApplicationModels.PaymentStatusUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CustomerCreditSummaryDetails> customerCreditSummary(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.RedirectToAggregatorDetails> redirectToAggregator(@Url String url1, @Query("source") String source, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.CheckCreditDetails> checkCredit(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.CustomerOnboardingDetails> customerOnboard(@Url String url1, @Body PaymentApplicationModels.CustomerOnboarding payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<PaymentApplicationModels.PaidOrderDetails> paidOrderDetails(@Url String url1, @Query("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.PaymentOrderDetails> createPaymentOrder(@Url String url1, @Body PaymentApplicationModels.PaymentOrder payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<PaymentApplicationModels.ValidateCustomerCreditSchema> validateCustomerAndCreditSummary(@Url String url1, @Body PaymentApplicationModels.CustomerValidationSchema payload, @HeaderMap Map<String, String> requestHeaders);
}