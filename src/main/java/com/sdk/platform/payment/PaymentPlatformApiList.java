package com.sdk.platform.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentPlatformApiList {

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayConfigResponse> getBrandPaymentGatewayConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("aggregator") String aggregator, @Query("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayToBeReviewed> saveBrandPaymentGatewayConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentGatewayConfigRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    Call<PaymentPlatformModels.PaymentOptionsResponse> getPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("refresh") Boolean refresh, @Query("request_type") String requestType, @Query("order_id") String orderId, @Query("shipment_id") String shipmentId, @Query("amount") Integer amount, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutsResponse> getAllPayouts(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutResponse> savePayout(@Path("company_id") String companyId, @Body PaymentPlatformModels.PayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutResponse> updatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.PayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutResponse> activateAndDectivatePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPlatformModels.UpdatePayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.DeletePayoutResponse> deletePayout(@Path("company_id") String companyId, @Path("unique_transfer_no") String uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.SubscriptionPaymentMethodResponse> getSubscriptionPaymentMethod(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.DeleteSubscriptionPaymentMethodResponse> deleteSubscriptionPaymentMethod(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @Query("payment_method_id") String paymentMethodId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    Call<PaymentPlatformModels.SubscriptionConfigResponse> getSubscriptionConfig(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    Call<PaymentPlatformModels.SaveSubscriptionSetupIntentResponse> saveSubscriptionSetupIntent(@Path("company_id") String companyId, @Body PaymentPlatformModels.SaveSubscriptionSetupIntentRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountResponse> getBankAccountDetailsOpenAPI(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @Query("request_hash") String requestHash, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.AddBeneficiaryDetailsOTPRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    Call<PaymentPlatformModels.IfscCodeResponse> verifyIfscCode(@Path("company_id") String companyId, @Query("ifsc_code") String ifscCode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    Call<PaymentPlatformModels.OrderBeneficiaryResponse> getUserOrderBeneficiaries(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    Call<PaymentPlatformModels.OrderBeneficiaryResponse> getUserBeneficiaries(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    Call<PaymentPlatformModels.PaymentConfirmationResponse> confirmPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentConfirmationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.GetUserCODLimitResponse> getUserCODlimitRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("merchant_user_id") String merchantUserId, @Query("mobile_no") String mobileNo, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.SetCODOptionResponse> setUserCODlimitRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.SetCODForUserRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    Call<PaymentPlatformModels.EdcAggregatorAndModelListResponse> edcAggregatorsAndModelList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    Call<PaymentPlatformModels.EdcDeviceStatsResponse> edcDeviceStats(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    Call<PaymentPlatformModels.EdcDeviceAddResponse> updateEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.EdcAddRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceDetailsResponse> getEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("terminal_unique_identifier") String terminalUniqueIdentifier, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceUpdateResponse> addEdcDevice(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("terminal_unique_identifier") String terminalUniqueIdentifier, @Body PaymentPlatformModels.EdcUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    Call<PaymentPlatformModels.EdcDeviceListResponse> edcDeviceList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_active") Boolean isActive, @Query("store_id") Integer storeId, @Query("device_tag") String deviceTag, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    Call<PaymentPlatformModels.PaymentModeRouteResponse> getPosPaymentModeRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("amount") Integer amount, @Query("cart_id") String cartId, @Query("pincode") String pincode, @Query("checkout_mode") String checkoutMode, @Query("refresh") Boolean refresh, @Query("order_id") String orderId, @Query("card_reference") String cardReference, @Query("order_type") String orderType, @Query("user_details") String userDetails, @Query("display_split") Boolean displaySplit, @Query("advance_payment") Boolean advancePayment, @Query("shipment_id") String shipmentId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    Call<PaymentPlatformModels.PaymentInitializationResponse> initialisePayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentInitializationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    Call<PaymentPlatformModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    Call<PaymentPlatformModels.ResendOrCancelPaymentResponse> resendOrCancelPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ResendOrCancelPaymentRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    Call<PaymentPlatformModels.PaymentStatusBulkHandlerResponse> paymentStatusBulk(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentStatusBulkHandlerRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    Call<PaymentPlatformModels.GetOauthUrlResponse> oauthGetUrl(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @Query("success_redirect_url") String successRedirectUrl, @Query("failure_redirect_url") String failureRedirectUrl, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    Call<PaymentPlatformModels.RevokeOAuthToken> revokeOauthToken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator") String aggregator, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    Call<PaymentPlatformModels.RepaymentResponse> repaymentDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.RepaymentDetailsSerialiserPayAll payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    Call<PaymentPlatformModels.MerchantOnBoardingResponse> merchantOnBoarding(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchantOnBoardingRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    Call<PaymentPlatformModels.ValidateCustomerResponse> verifyCustomerForPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.ValidateCustomerRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.GetPaymentLinkResponse> getPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.CreatePaymentLinkResponse> createPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CreatePaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    Call<PaymentPlatformModels.PollingPaymentLinkResponse> pollingPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("payment_link_id") String paymentLinkId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    Call<PaymentPlatformModels.ResendPaymentLinkResponse> resendPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    Call<PaymentPlatformModels.CancelPaymentLinkResponse> cancelPaymentLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.CancelOrResendPaymentLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> getPaymentModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> setMerchantModeControlRoutes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.MerchantPaymentModeRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> getPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/modes/{mode}/custom-config")
    Call<PaymentPlatformModels.PaymentCustomConfigResponseSchema> setPaymentModeCustomConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("mode") String mode, @Body PaymentPlatformModels.PaymentCustomConfigRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    Call<PaymentPlatformModels.GetPaymentCodeResponse> getPaymentCodeOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionSerializer> getPaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Query("line-item") Boolean lineItem, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionResponseSerializer> updatePaymentSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Body PaymentPlatformModels.PaymentSessionRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    Call<PaymentPlatformModels.RefundSessionResponseSerializer> updateRefundSession(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("gid") String gid, @Path("request_id") String requestId, @Body PaymentPlatformModels.RefundSessionRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> getMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> patchMerchantPaymentOption(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.MerchnatPaymentModeRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> getMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> patchMerchantAggregatorPaymentModeDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.PlatformPaymentModeResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> getPGConfigAggregators(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityResponseSerializer> getMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityResponseSerializer> createMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body PaymentPlatformModels.RefundPriorityRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund_priority/config/{config_type}")
    Call<PaymentPlatformModels.RefundPriorityResponseSerializer> updateMerchantRefundPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body PaymentPlatformModels.RefundPriorityRequestSerializer payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment-orders/")
    Call<PaymentPlatformModels.PaymentOrderResponse> createPaymentOrder(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body PaymentPlatformModels.PaymentOrderRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.AggregatorVersionResponse> getMerchantAggregatorAppVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Query("business_unit") String businessUnit, @Query("device") String device, @Query("payment_mode_id") Integer paymentModeId, @Query("sub_payment_mode") String subPaymentMode, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}/version")
    Call<PaymentPlatformModels.PlatformPaymentModeResponse> patchMerchantPaymentOptionVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("aggregator_id") Integer aggregatorId, @Body PaymentPlatformModels.AggregatorControlRequest payload, @HeaderMap Map<String, String> requestHeaders);
}