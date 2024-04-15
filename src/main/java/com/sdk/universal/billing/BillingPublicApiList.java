package com.sdk.universal.billing;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface BillingPublicApiList {

    @GET ("/service/public/billing/v1.0/plan/detailed-list")
    Call<BillingPublicModels.DetailList> getStandardPlans(@Query("platform") String platform, @HeaderMap Map<String, String> requestHeaders);
}