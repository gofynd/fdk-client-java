package com.sdk.platform.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentPlatformApiList {

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayConfigDetails> getBrandPaymentGatewayConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("aggregator") String aggregator, @Query("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayToBeReviewed> saveBrandPaymentGatewayConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentGatewayConfigCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    Call<PaymentPlatformModels.PaymentOptionsDetails> getPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("refresh") Boolean refresh, @Query("request_type") String requestType, @Query("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("amount") Integer amount, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutsDetails> getAllPayouts(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutDetails> savePayout(@Path("company_id") String companyId, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutDetails> updatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutDetails> activateAndDectivatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.UpdatePayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.DeletePayoutDetails> deletePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.SubscriptionPaymentMethodDetails> getSubscriptionPaymentMethod(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.DeleteSubscriptionPaymentMethodDetails> deleteSubscriptionPaymentMethod(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @Query("payment_method_id") String paymentMethodId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    Call<PaymentPlatformModels.SubscriptionConfigDetails> getSubscriptionConfig(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    Call<PaymentPlatformModels.SaveSubscriptionSetupIntentDetails> saveSubscriptionSetupIntent(@Path("company_id") String companyId, @Body PaymentPlatformModels.SaveSubscriptionSetupIntentCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountDetails> getBankAccountDetailsOpenAPI(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @Query("request_hash") String requestHash, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountDetails> addRefundBankAccountUsingOTP(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.AddBeneficiaryDetailsOTPCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    Call<PaymentPlatformModels.IfscCodeDetails> verifyIfscCode(@Path("company_id") String companyId, @Query("ifsc_code") String ifscCode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    Call<PaymentPlatformModels.OrderBeneficiaryFetchResults> getUserOrderBeneficiaries(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    Call<PaymentPlatformModels.OrderBeneficiaryFetchResults> getUserBeneficiaries(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    Call<PaymentPlatformModels.PaymentConfirmationDetails> confirmPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentConfirmationCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.GetUserCODLimitDetails> getUserCODlimitRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("merchant_user_id") String merchantUserId, @Query("mobile_no") String mobileNo, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.SetCODOptionDetails> setUserCODlimitRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.SetCODForUserCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    Call<PaymentPlatformModels.PaymentModeRouteDetails> getPosPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("pincode") String pincode, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("order_id") String orderId, @Query("card_reference") String cardReference, @Query("order_type") String orderType, @Query("user_details") String userDetails, @Query("display_split") Boolean displaySplit, @Query("advance_payment") Boolean advancePayment, @Query("shipment_id") String shipmentId, @Query("customer_id") String customerId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    Call<PaymentPlatformModels.PaymentInitializationDetails> initialisePayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentInitializationCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    Call<PaymentPlatformModels.PaymentStatusUpdateDetails> checkAndUpdatePaymentStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusUpdateCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    Call<PaymentPlatformModels.ResendOrCancelPaymentDetails> resendOrCancelPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ResendOrCancelPaymentCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    Call<PaymentPlatformModels.PaymentStatusBulkHandlerDetails> paymentStatusBulk(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusBulkHandlerCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    Call<PaymentPlatformModels.GetOauthUrlDetails> oauthGetUrl(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @Query("success_redirect_url") String successRedirectUrl, @Query("failure_redirect_url") String failureRedirectUrl, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    Call<PaymentPlatformModels.RevokeOAuthToken> revokeOauthToken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    Call<PaymentPlatformModels.RepaymentDetails> repaymentDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.RepaymentDetailsSerialiserPayAll payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    Call<PaymentPlatformModels.MerchantOnBoardingDetails> merchantOnBoarding(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchantOnBoardingCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    Call<PaymentPlatformModels.ValidateCustomerDetails> verifyCustomerForPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ValidateCustomerCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.GetPaymentLinkDetails> getPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.CreatePaymentLinkDetails> createPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CreatePaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    Call<PaymentPlatformModels.PollingPaymentLinkDetails> pollingPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    Call<PaymentPlatformModels.ResendPaymentLinkDetails> resendPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    Call<PaymentPlatformModels.CancelPaymentLinkDetails> cancelPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> getPaymentModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> setMerchantModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.MerchantPaymentModeCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> getPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> setPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.PaymentCustomConfigRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    Call<PaymentPlatformModels.GetPaymentCodeDetails> getPaymentCodeOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionFetchDetails> getPaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Query("line-item") Boolean lineItem, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionPutDetails> updatePaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Body PaymentPlatformModels.PaymentSessionCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    Call<PaymentPlatformModels.RefundSessionDetails> updateRefundSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Path("request_id") String requestId, @Body PaymentPlatformModels.RefundSessionCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> getMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> patchMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchnatPaymentModeCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> getMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> patchMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.PlatformPaymentModeDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> getPGConfigAggregators(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityDetails> getMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityDetails> createMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body PaymentPlatformModels.RefundPriorityCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityDetails> updateMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body PaymentPlatformModels.RefundPriorityCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders/")
    Call<PaymentPlatformModels.PaymentOrderDetails> createPaymentOrder(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentOrderCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.AggregatorVersionDetails> getMerchantAggregatorAppVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @Query("payment_mode_id") Integer paymentModeId, @Query("sub_payment_mode") String subPaymentMode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> patchMerchantPaymentOptionVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.PatchAggregatorControl payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/validate/customer-credits")
    Call<PaymentPlatformModels.ValidateCustomerCreditSchema> validateCustomerAndCreditSummary(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CustomerValidationSchema payload, @HeaderMap Map<String, String> requestHeaders);
}