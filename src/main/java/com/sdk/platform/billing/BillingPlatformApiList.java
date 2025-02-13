package com.sdk.platform.billing;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface BillingPlatformApiList {

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<BillingPlatformModels.SubscriptionCustomer> getCustomerDetail(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<BillingPlatformModels.SubscriptionCustomer> upsertCustomerDetail(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscriptionCustomerCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    Call<BillingPlatformModels.SubscriptionStatus> getSubscription(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-app-limit")
    Call<BillingPlatformModels.SubscriptionLimit> currentAppLimit(@Path("company_id") String companyId, @Query("product_suite") String productSuite, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    Call<BillingPlatformModels.SubscriptionLimit> getFeatureLimitConfig(@Path("company_id") String companyId, @Query("product_suite") String productSuite, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    Call<BillingPlatformModels.Invoices> getInvoices(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/global-settings")
    Call<BillingPlatformModels.GlobalSettings> globalSettings(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("query") Object query, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    Call<BillingPlatformModels.CheckValidityResponse> checkCouponValidity(@Path("company_id") String companyId, @Query("plan") String plan, @Query("coupon_code") String couponCode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/payment-status")
    Call<BillingPlatformModels.PaymentStatusResponse> paymentStatus(@Path("company_id") String companyId, @Query("order_id") String orderId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/credit-transaction")
    Call<BillingPlatformModels.CreditTransactionResponse> creditTransaction(@Path("company_id") String companyId, @Query("unique_id") Integer uniqueId, @Query("product_suite") String productSuite, @Query("type") String type, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("search_type") String searchType, @Query("search_value") String searchValue, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/consent")
    Call<BillingPlatformModels.StatusMessage> updateConsent(@Path("company_id") String companyId, @Query("subscriber_id") String subscriberId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/plans")
    Call<List<BillingPlatformModels.Plan>> getEnterprisePlans(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/configs")
    Call<BillingPlatformModels.ConfigRes> subscriptionConfigs(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/bank/list")
    Call<String> getBankList(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/transaction/{transaction_id}")
    Call<BillingPlatformModels.PaymentTransactionDetails> getPaymentTransaction(@Path("company_id") String companyId, @Path("transaction_id") String transactionId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/payment/options")
    Call<BillingPlatformModels.GetPaymentOptions> getPaymentOptions(@Path("company_id") String companyId, @Query("transaction_id") String transactionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/initiate")
    Call<BillingPlatformModels.SubscribePlanRes> paymentInitiate(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscribePlan payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/plan/status")
    Call<BillingPlatformModels.Plan> planStatusUpdate(@Path("company_id") String companyId, @Body BillingPlatformModels.PlanStatusUpdateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    Call<BillingPlatformModels.ChargeDetails> getChargeDetails(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("charge_id") String chargeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    Call<BillingPlatformModels.SubscriptionChargeRes> getSubscriptionCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("subscription_id") String subscriptionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    Call<BillingPlatformModels.SubscriptionChargeRes> cancelSubscriptionCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("subscription_id") String subscriptionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    Call<BillingPlatformModels.ResourceNotFound> upgradePlan(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscriptionMethodsReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    Call<BillingPlatformModels.SubscriptionMethods> subscriptionMethods(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/billing/v1.0/company/{company_id}/subscription/methods")
    Call<BillingPlatformModels.ResourceNotFound> subscriptionMethodsDelete(@Path("company_id") String companyId, @Query("unique_external_id") String uniqueExternalId, @Query("payment_method_id") String paymentMethodId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change/downgrade")
    Call<BillingPlatformModels.DowngradeRes> planDowngradeGet(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change/downgrade")
    Call<BillingPlatformModels.PostDowngradeRes> planDowngrade(@Path("company_id") String companyId, @Body BillingPlatformModels.DowngradePlanReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change")
    Call<BillingPlatformModels.PlanChangeDetails> subscriptionPlanChange(@Path("company_id") String companyId, @Query("product_suite") String productSuite, @Query("coupon") String coupon, @Query("unique_id") Integer uniqueId, @Query("platform") String platform, @Query("plan_id") String planId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/plan-change")
    Call<BillingPlatformModels.SubscriptionActivateRes> changePlan(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscriptionActivateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    Call<BillingPlatformModels.SubscriptionActivateRes> activateSubscriptionPlan(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscriptionActivateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/method/default")
    Call<BillingPlatformModels.Message> methodDefault(@Path("company_id") String companyId, @Body BillingPlatformModels.DefaultReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/topup")
    Call<BillingPlatformModels.TopupRes> topupCredit(@Path("company_id") String companyId, @Body BillingPlatformModels.TopupReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/topup/cancel")
    Call<BillingPlatformModels.CancelTopupRes> topupCancelCredit(@Path("company_id") String companyId, @Body BillingPlatformModels.CancelTopupReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/payment")
    Call<BillingPlatformModels.SetupPayment> setupPayment(@Path("company_id") String companyId, @Body BillingPlatformModels.SetupPaymentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/mandate")
    Call<BillingPlatformModels.Message> setupMandate(@Path("company_id") String companyId, @Body BillingPlatformModels.SetupMandateReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/intent")
    Call<BillingPlatformModels.SetupIntentRes> setupIntent(@Path("company_id") String companyId, @Body BillingPlatformModels.IntentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/billing/v1.0/company/{company_id}/subscription/setup/intent")
    Call<BillingPlatformModels.StatusMessage> updateSetupIntent(@Path("company_id") String companyId, @Body BillingPlatformModels.PutIntentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/renew")
    Call<BillingPlatformModels.SubscriptionRenewRes> subscriptionRenew(@Path("company_id") String companyId, @Body BillingPlatformModels.SubscriptionRenewReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/collect")
    Call<BillingPlatformModels.PaymentCollectRes> paymentCollect(@Path("company_id") String companyId, @Body BillingPlatformModels.PaymentCollectReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    Call<BillingPlatformModels.CreateOneTimeChargeResponse> createOneTimeCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Body BillingPlatformModels.CreateOneTimeCharge payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/entity/detail")
    Call<List<BillingPlatformModels.EntityDetail>> getentityDetail(@Path("company_id") String companyId, @Query("entity_name") String entityName, @Query("entity_id") String entityId, @Query("channel") String channel, @Query("component") String component, @Query("component_name") String componentName, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    Call<BillingPlatformModels.CancelSubscriptionRes> cancelSubscriptionPlan(@Path("company_id") String companyId, @Body BillingPlatformModels.CancelSubscriptionReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/payment-options")
    Call<BillingPlatformModels.PaymentOptions> paymentOptions(@Path("company_id") String companyId, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/verify-payment")
    Call<BillingPlatformModels.VerifyPaymentRes> verifyPayment(@Path("company_id") String companyId, @Body BillingPlatformModels.VerifyPaymentReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    Call<BillingPlatformModels.InvoiceData> getInvoiceById(@Path("company_id") String companyId, @Path("invoice_id") String invoiceId, @HeaderMap Map<String, String> requestHeaders);
}