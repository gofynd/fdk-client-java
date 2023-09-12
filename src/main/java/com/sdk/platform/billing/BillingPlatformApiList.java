package com.sdk.platform.billing;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface BillingPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/coupon/check-validity")
    Call<BillingPlatformModels.CheckValidityResponse> checkCouponValidity(@Path("company_id")  String companyId , @Query("plan") String  plan ,  @Query("coupon_code") String  couponCode );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    Call<BillingPlatformModels.CreateSubscriptionResponse> createSubscriptionCharge(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId ,@Body BillingPlatformModels.CreateSubscriptionCharge payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    Call<BillingPlatformModels.EntitySubscription> getSubscriptionCharge(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Path("subscription_id") String  subscriptionId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    Call<BillingPlatformModels.EntitySubscription> cancelSubscriptionCharge(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Path("subscription_id") String  subscriptionId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    Call<BillingPlatformModels.CreateOneTimeChargeResponse> createOneTimeCharge(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId ,@Body BillingPlatformModels.CreateOneTimeCharge payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    Call<BillingPlatformModels.OneTimeChargeEntity> getChargeDetails(@Path("company_id")  String companyId , @Path("extension_id") String  extensionId , @Path("charge_id") String  chargeId );
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    Call<BillingPlatformModels.Invoices> getInvoices(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    Call<BillingPlatformModels.Invoice> getInvoiceById(@Path("company_id")  String companyId , @Path("invoice_id") String  invoiceId );
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<BillingPlatformModels.SubscriptionCustomer> getCustomerDetail(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<BillingPlatformModels.SubscriptionCustomer> upsertCustomerDetail(@Path("company_id")  String companyId ,@Body BillingPlatformModels.SubscriptionCustomerCreate payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    Call<BillingPlatformModels.SubscriptionStatus> getSubscription(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    Call<BillingPlatformModels.SubscriptionLimit> getFeatureLimitConfig(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    Call<BillingPlatformModels.SubscriptionActivateRes> activateSubscriptionPlan(@Path("company_id")  String companyId ,@Body BillingPlatformModels.SubscriptionActivateReq payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    Call<BillingPlatformModels.CancelSubscriptionRes> cancelSubscriptionPlan(@Path("company_id")  String companyId ,@Body BillingPlatformModels.CancelSubscriptionReq payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/plans")
    Call<List<BillingPlatformModels.Plan>> getEnterprisePlans(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @PATCH ("/service/platform/billing/v1.0/company/{company_id}/plan/status")
    Call<BillingPlatformModels.Plan> planStatusUpdate(@Path("company_id")  String companyId ,@Body BillingPlatformModels.PlanStatusUpdateReq payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/payment/initiate")
    Call<BillingPlatformModels.SubscribePlanRes> subscripePlan(@Path("company_id")  String companyId ,@Body BillingPlatformModels.SunscribePlan payload);
    
}