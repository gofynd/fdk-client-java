package com.sdk.platform.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PaymentPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayConfigResponse> getBrandPaymentGatewayConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayToBeReviewed> saveBrandPaymentGatewayConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentGatewayConfigRequest payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PaymentPlatformModels.PaymentGatewayToBeReviewed> updateBrandPaymentGatewayConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body PaymentPlatformModels.PaymentGatewayConfigRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/codes")
    Call<PaymentPlatformModels.GetPaymentCodeResponse> getPaymentCodeOption(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
}