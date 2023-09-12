package com.sdk.platform.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PaymentPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayConfigResponse> getBrandPaymentGatewayConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("aggregator") String  aggregator ,  @Query("config_type") String  configType );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayToBeReviewed> saveBrandPaymentGatewayConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentGatewayConfigRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    Call<PaymentPlatformModels.PaymentOptionsResponse> getPaymentModeRoutes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("refresh") Boolean  refresh ,  @Query("request_type") String  requestType );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutsResponse> getAllPayouts(@Path("company_id")  String companyId , @Query("unique_external_id") String  uniqueExternalId );
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PaymentPlatformModels.PayoutResponse> savePayout(@Path("company_id")  String companyId ,@Body PaymentPlatformModels.PayoutRequest payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutResponse> updatePayout(@Path("company_id")  String companyId , @Path("unique_transfer_no") String  uniqueTransferNo ,@Body PaymentPlatformModels.PayoutRequest payload);
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.UpdatePayoutResponse> activateAndDectivatePayout(@Path("company_id")  String companyId , @Path("unique_transfer_no") String  uniqueTransferNo ,@Body PaymentPlatformModels.UpdatePayoutRequest payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PaymentPlatformModels.DeletePayoutResponse> deletePayout(@Path("company_id")  String companyId , @Path("unique_transfer_no") String  uniqueTransferNo );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.SubscriptionPaymentMethodResponse> getSubscriptionPaymentMethod(@Path("company_id")  String companyId , @Query("unique_external_id") String  uniqueExternalId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PaymentPlatformModels.DeleteSubscriptionPaymentMethodResponse> deleteSubscriptionPaymentMethod(@Path("company_id")  String companyId , @Query("unique_external_id") String  uniqueExternalId ,  @Query("payment_method_id") String  paymentMethodId );
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    Call<PaymentPlatformModels.SubscriptionConfigResponse> getSubscriptionConfig(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    Call<PaymentPlatformModels.SaveSubscriptionSetupIntentResponse> saveSubscriptionSetupIntent(@Path("company_id")  String companyId ,@Body PaymentPlatformModels.SaveSubscriptionSetupIntentRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountResponse> getBankAccountDetailsOpenAPI(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("order_id") String  orderId ,  @Query("request_hash") String  requestHash );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PaymentPlatformModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.AddBeneficiaryDetailsOTPRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    Call<PaymentPlatformModels.IfscCodeResponse> verifyIfscCode(@Path("company_id")  String companyId , @Query("ifsc_code") String  ifscCode );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    Call<PaymentPlatformModels.OrderBeneficiaryResponse> getUserOrderBeneficiaries(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    Call<PaymentPlatformModels.OrderBeneficiaryResponse> getUserBeneficiaries(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("order_id") String  orderId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    Call<PaymentPlatformModels.PaymentConfirmationResponse> confirmPayment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentConfirmationRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.GetUserCODLimitResponse> getUserCODlimitRoutes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("merchant_user_id") String  merchantUserId ,  @Query("mobile_no") String  mobileNo );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/user-cod")
    Call<PaymentPlatformModels.SetCODOptionResponse> setUserCODlimitRoutes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.SetCODForUserRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-aggregator-list")
    Call<PaymentPlatformModels.EdcAggregatorAndModelListResponse> edcAggregatorsAndModelList(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-stats")
    Call<PaymentPlatformModels.EdcDeviceStatsResponse> edcDeviceStats(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device")
    Call<PaymentPlatformModels.EdcDeviceAddResponse> updateEdcDevice(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.EdcAddRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceDetailsResponse> getEdcDevice(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("terminal_unique_identifier") String  terminalUniqueIdentifier );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device/{terminal_unique_identifier}")
    Call<PaymentPlatformModels.EdcDeviceUpdateResponse> addEdcDevice(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("terminal_unique_identifier") String  terminalUniqueIdentifier ,@Body PaymentPlatformModels.EdcUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/edc-device-list")
    Call<PaymentPlatformModels.EdcDeviceListResponse> edcDeviceList(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("is_active") Boolean  isActive ,  @Query("store_id") Integer  storeId ,  @Query("device_tag") String  deviceTag );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/pos")
    Call<PaymentPlatformModels.PaymentOptionsResponse> getPosPaymentModeRoutes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("amount") Integer  amount ,  @Query("cart_id") String  cartId ,  @Query("pincode") String  pincode ,  @Query("checkout_mode") String  checkoutMode ,  @Query("refresh") Boolean  refresh ,  @Query("card_reference") String  cardReference ,  @Query("order_type") String  orderType ,  @Query("user_details") String  userDetails );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/request")
    Call<PaymentPlatformModels.PaymentInitializationResponse> initialisePayment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentInitializationRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm/polling")
    Call<PaymentPlatformModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentStatusUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/cancel")
    Call<PaymentPlatformModels.ResendOrCancelPaymentResponse> resendOrCancelPayment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.ResendOrCancelPaymentRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/payment-status-bulk/")
    Call<PaymentPlatformModels.PaymentStatusBulkHandlerResponse> paymentStatusBulk(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentStatusBulkHandlerRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/onboard/{aggregator}/")
    Call<PaymentPlatformModels.GetOauthUrlResponse> oauthGetUrl(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("aggregator") String  aggregator , @Query("success_redirect_url") String  successRedirectUrl ,  @Query("failure_redirect_url") String  failureRedirectUrl );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/revoke/{aggregator}/")
    Call<PaymentPlatformModels.RevokeOAuthToken> revokeOauthToken(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("aggregator") String  aggregator );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/repayment-details")
    Call<PaymentPlatformModels.RepaymentResponse> repaymentDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.RepaymentDetailsSerialiserPayAll payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/merchant-onboarding")
    Call<PaymentPlatformModels.MerchantOnBoardingResponse> merchantOnBoarding(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.MerchantOnBoardingRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/customer/validation")
    Call<PaymentPlatformModels.ValidateCustomerResponse> verifyCustomerForPayment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.ValidateCustomerRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.GetPaymentLinkResponse> getPaymentLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("payment_link_id") String  paymentLinkId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/create-payment-link/")
    Call<PaymentPlatformModels.CreatePaymentLinkResponse> createPaymentLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.CreatePaymentLinkRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/polling-payment-link/")
    Call<PaymentPlatformModels.PollingPaymentLinkResponse> pollingPaymentLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("payment_link_id") String  paymentLinkId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/resend-payment-link/")
    Call<PaymentPlatformModels.ResendPaymentLinkResponse> resendPaymentLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.CancelOrResendPaymentLinkRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/cancel-payment-link/")
    Call<PaymentPlatformModels.CancelPaymentLinkResponse> cancelPaymentLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.CancelOrResendPaymentLinkRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    Call<PaymentPlatformModels.GetPaymentCodeResponse> getPaymentCodeOption(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/session/{gid}")
    Call<PaymentPlatformModels.PaymentSessionResponseSerializer> updatePaymentSession(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("gid") String  gid ,@Body PaymentPlatformModels.PaymentSessionRequestSerializer payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/{gid}/refund/session/{request_id}")
    Call<PaymentPlatformModels.RefundSessionResponseSerializer> updateRefundSession(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("gid") String  gid , @Path("request_id") String  requestId ,@Body PaymentPlatformModels.RefundSessionRequestSerializer payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.MerchnatPaymentModeResponse> getMerchantPaymentOption(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration")
    Call<PaymentPlatformModels.MerchnatPaymentModeResponse> patchMerchantPaymentOption(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.MerchnatPaymentModeRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.MerchnatPaymentModeResponse> getMerchantAggregatorPaymentModeDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("aggregator_id") Integer  aggregatorId , @Query("business_unit") String  businessUnit ,  @Query("device") String  device );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/aggregators/{aggregator_id}")
    Call<PaymentPlatformModels.MerchnatPaymentModeResponse> patchMerchantAggregatorPaymentModeDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("aggregator_id") Integer  aggregatorId ,@Body PaymentPlatformModels.MerchnatPaymentModeResponse payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options/configuration/aggregator")
    Call<PaymentPlatformModels.MerchnatPaymentModeResponse> getPGConfigAggregators(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
}