package com.sdk.universal.billing;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface BillingPublicApiList {

    @GET ("/service/public/billing/v1.0/plan/detailed-list/")
    Call<BillingPublicModels.DetailList> getStandardPlans(@Query("platform") String platform, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/billing/v1.0/plan/details/{plan_id}")
    Call<BillingPublicModels.PlanDetails> getPlanDetails(@Path("plan_id") String planId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/billing/v1.0/plan/list")
    Call<List<BillingPublicModels.PlanList>> planList(@HeaderMap Map<String, String> requestHeaders);
}