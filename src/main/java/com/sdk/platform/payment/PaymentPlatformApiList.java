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
    Call<PaymentPlatformModels.PaymentOptionsDetails> getPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("refresh") Boolean refresh, @Query("amount") Integer amount, @Query("request_type") String requestType, @Query("order_id") String orderId, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutsDetails> getAllPayouts(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutDetails> savePayout(@Path("company_id") String companyId, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.UpdatePayoutDetails> updatePayouts(@Path("company_id") String companyId, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.UpdatePayoutDetails> activateAndDectivatePayouts(@Path("company_id") String companyId, @Body PaymentPlatformModels.UpdatePayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.DeletePayoutDetails> deletePayouts(@Path("company_id") String companyId, @Query("unique_transfer_no") String uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.PayoutsDetails> getAllPayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.PayoutDetails> savePayouts(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutDetails> updatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.PayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutDetails> activateAndDectivatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.UpdatePayoutCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.DeletePayoutDetails> deletePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.GetRefundAccountDetails> getBankAccountDetailsOpenAPI(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @Query("request_hash") String requestHash, @HeaderMap Map<String, String> requestHeaders);

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
    Call<PaymentPlatformModels.GetUserCODLimitDetails> setUserCODlimitRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.SetCODForUserCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    Call<PaymentPlatformModels.EdcAggregatorAndModelListDetails> edcAggregatorsAndModelList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    Call<PaymentPlatformModels.EdcDeviceStatsDetails> edcDeviceStats(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    Call<PaymentPlatformModels.EdcDeviceAddDetails> updateEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.EdcAddCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceDetails> getEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("terminal_unique_identifier") String terminalUniqueIdentifier, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceUpdateDetails> addEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("terminal_unique_identifier") String terminalUniqueIdentifier, @Body PaymentPlatformModels.EdcUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    Call<PaymentPlatformModels.EdcDeviceListDetails> edcDeviceList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("store_id") Integer storeId, @Query("device_tag") String deviceTag, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    Call<PaymentPlatformModels.PaymentModeRouteDetails> getPosPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("pincode") String pincode, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("order_id") String orderId, @Query("card_reference") String cardReference, @Query("order_type") String orderType, @Query("user_details") String userDetails, @Query("display_split") Boolean displaySplit, @Query("advance_payment") Boolean advancePayment, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    Call<PaymentPlatformModels.PaymentInitializationDetails> initialisePayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentInitializationCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    Call<PaymentPlatformModels.PaymentStatusUpdateDetails> checkAndUpdatePaymentStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusUpdateCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    Call<PaymentPlatformModels.ResendOrCancelPaymentDetails> resendOrCancelPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ResendOrCancelPaymentCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk")
    Call<PaymentPlatformModels.PaymentStatusBulkHandlerDetails> paymentStatusBulk(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusBulkHandlerCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}")
    Call<PaymentPlatformModels.GetOauthUrlDetails> oauthGetUrl(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @Query("success_redirect_url") String successRedirectUrl, @Query("failure_redirect_url") String failureRedirectUrl, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}")
    Call<PaymentPlatformModels.RevokeOAuthToken> revokeOauthToken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    Call<PaymentPlatformModels.RepaymentDetails> repaymentDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.RepaymentDetailsSerialiserPayAll payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    Call<PaymentPlatformModels.MerchantOnBoardingDetails> merchantOnBoarding(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchantOnBoardingCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    Call<PaymentPlatformModels.ValidateCustomerDetails> verifyCustomerForPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ValidateCustomerCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    Call<PaymentPlatformModels.GetPaymentLinkDetails> getPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link")
    Call<PaymentPlatformModels.CreatePaymentLinkDetails> createPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CreatePaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/{id}")
    Call<PaymentPlatformModels.GetPaymentLinkDetails> getPaymentLinkId(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link")
    Call<PaymentPlatformModels.PollingPaymentLinkDetails> pollingPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link")
    Call<PaymentPlatformModels.ResendPaymentLinkDetails> resendPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link")
    Call<PaymentPlatformModels.CancelPaymentLinkDetails> cancelPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    Call<PaymentPlatformModels.PaymentModeDetails> getPaymentModeSequencing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("business_unit") String businessUnit, @Query("device") String device, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing")
    Call<PaymentPlatformModels.AggregatorConfigDetails> patchPaymentModeSequencing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PlatformPaymentMode payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformOfflineAdvanceDetails> getPaymentModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformOfflineAdvanceDetails> setMerchantModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.PlatformOfflineAdvance payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> getPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> setPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.PaymentCustomConfigRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/payment/methods/configs")
    Call<PaymentPlatformModels.PaymentMethodConfigDetails> getPaymentMethodConfig(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    Call<PaymentPlatformModels.GetPaymentCodeDetails> getPaymentCodeOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.GetPaymentSessionDetails> getPaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Query("line-item") Boolean lineItem, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionPutDetails> updatePaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Body PaymentPlatformModels.PaymentSessionCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    Call<PaymentPlatformModels.RefundSessionDetails> updateRefundSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Path("request_id") String requestId, @Body PaymentPlatformModels.RefundSessionCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PlatformOnlineOfflinePaymentDetails> getMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_option_type") String paymentOptionType, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PatchPlatformOnlineOfflinePaymentDetails> patchMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchnatPaymentModeCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/all-devices")
    Call<PaymentPlatformModels.GetDevice> getDevices(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.AggregatorPlatformPaymentModeDetails> getMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.PlatformPaymentModeDetails> patchMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.PlatformPaymentMode payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    Call<PaymentPlatformModels.AggregatorConfigDetails> getPGConfigAggregators(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential/history")
    Call<PaymentPlatformModels.AggregatorHistoryDetails> getAggregatorCredentialHistory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("aggregator") String aggregator, @Query("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    Call<PaymentPlatformModels.AggregatorCredentialRes> getAggregatorCredential(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("aggregator") String aggregator, @Query("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator/credential")
    Call<PaymentPlatformModels.PatchAggregatorCredentialDetails> updateAggregatorCredential(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.AggregatorCredentialReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    Call<PaymentPlatformModels.RefundPriorityDetails> getMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("business_unit") String businessUnit, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    Call<PaymentPlatformModels.RefundPriorityDetails> createMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("business_unit") String businessUnit, @Body PaymentPlatformModels.RefundPriorityCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}/{business_unit}")
    Call<PaymentPlatformModels.RefundPriorityDetails> updateMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("business_unit") String businessUnit, @Body PaymentPlatformModels.RefundPriorityCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders")
    Call<PaymentPlatformModels.PaymentOrderDetails> createPaymentOrder(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentOrderCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment_modes/sequencing/copy-config")
    Call<PaymentPlatformModels.AggregatorConfigDetails> copyConfigPaymentModes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PlatformPaymentModeCopyConfigCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/copy-config")
    Call<PaymentPlatformModels.AggregatorConfigDetails> copyConfigAggPaymentModes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") String aggregatorId, @Body PaymentPlatformModels.PlatformPaymentModeCopyConfigCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.AggregatorVersionDetails> getMerchantAggregatorAppVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @Query("payment_mode_id") Integer paymentModeId, @Query("sub_payment_mode") String subPaymentMode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.AggregatorConfigDetails> patchMerchantPaymentOptionVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.PatchAggregatorControl payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account_create")
    Call<PaymentPlatformModels.RefundAccountDetails> addRefundBankAccount(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.AddBeneficiaryDetailsOTPCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account_create")
    Call<PaymentPlatformModels.DeleteRefundAccountDetails> deleteBeneficiaryDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.DeleteBeneficiary payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/refundoptions")
    Call<PaymentPlatformModels.ShipmentRefundRes> setRefundOptionforShipment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ShipmentRefundDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/selected_refund_options")
    Call<PaymentPlatformModels.SelectedRefundOptionDetails> getSelectedRefundOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("shipment_id") String shipmentId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v2.0/company/{company_id}/application/{application_id}/refund/user/beneficiary")
    Call<PaymentPlatformModels.OrderBeneficiaryResponseSchemaV2> getUserBeneficiariesDetailV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("mop") String mop, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/validate/beneficiary-address")
    Call<PaymentPlatformModels.ValidateValidateAddressDetails> validateBeneficiaryAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ValidateValidateAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/beneficiary/default")
    Call<PaymentPlatformModels.SetDefaultBeneficiaryDetails> updateDefaultBeneficiary(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.SetDefaultBeneficiary payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    Call<PaymentPlatformModels.PennyDropValidationDetails> getPennyDropValidation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/pennydrop/validation")
    Call<PaymentPlatformModels.PennyDropValidationDetails> updatePennyDropValidation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.UpdatePennyDropValidation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refunds/beneficiary-details/{shipment_id}")
    Call<PaymentPlatformModels.ShipmentBeneficiaryDetailsRes> getShipmentBeneficiary(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/transactions")
    Call<PaymentPlatformModels.TransactionsResponseSchema> getTransactions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("user_id") String userId, @Query("page_size") Integer pageSize, @Query("page_number") Integer pageNumber, @Query("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("transaction_id") String transactionId, @HeaderMap Map<String, String> requestHeaders);
}