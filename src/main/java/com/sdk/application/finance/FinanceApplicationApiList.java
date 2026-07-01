package com.sdk.application.finance;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FinanceApplicationApiList {

    @POST 
    Call<FinanceApplicationModels.CustomerCreditBalanceResponseSchema> customerCreditBalance(@Url String url1, @Body FinanceApplicationModels.CustomerCreditBalanceRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<FinanceApplicationModels.LockUnlockResponseSchema> lockUnlockCreditNote(@Url String url1, @Body FinanceApplicationModels.LockUnlockRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);
}