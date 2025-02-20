package com.sdk.platform.billing;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface BillingPlatformApiList {

    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/charge/{charge_id}")
    Call<BillingPlatformModels.ChargeDetails> getChargeDetails(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("charge_id") String chargeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    Call<BillingPlatformModels.SubscriptionChargeRes> getSubscriptionCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("subscription_id") String subscriptionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    Call<BillingPlatformModels.SubscriptionChargeRes> cancelSubscriptionCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Path("subscription_id") String subscriptionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/one_time_charge")
    Call<BillingPlatformModels.CreateOneTimeChargeResponseSchemas> createOneTimeCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Body BillingPlatformModels.CreateOneTimeCharge payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    Call<BillingPlatformModels.CreateSubscription> createSubscriptionCharge(@Path("company_id") String companyId, @Path("extension_id") String extensionId, @Body BillingPlatformModels.CreateSubscriptionCharge payload, @HeaderMap Map<String, String> requestHeaders);
}