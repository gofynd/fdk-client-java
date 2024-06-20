package com.sdk.universal.billing;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class BillingPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private BillingPublicApiList billingPublicApiList;

    public BillingPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.billingPublicApiList = generateBillingPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private BillingPublicApiList generateBillingPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),BillingPublicApiList.class, interceptorList, cookieStore);
    }

    public BillingPublicModels.DetailList getStandardPlans(String platform) throws IOException {
        return this.getStandardPlans(platform, new HashMap<>());
    }

    public BillingPublicModels.DetailList getStandardPlans(String platform, Map<String, String> requestHeaders) throws IOException {
    
        Response<BillingPublicModels.DetailList> response = billingPublicApiList.getStandardPlans(platform, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public BillingPublicModels.PlanDetails getPlanDetails(String planId) throws IOException {
        return this.getPlanDetails(planId, new HashMap<>());
    }

    public BillingPublicModels.PlanDetails getPlanDetails(String planId, Map<String, String> requestHeaders) throws IOException {
    
        Response<BillingPublicModels.PlanDetails> response = billingPublicApiList.getPlanDetails(planId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public List<BillingPublicModels.PlanList> planList() throws IOException {
        return this.planList(new HashMap<>());
    }

    public List<BillingPublicModels.PlanList> planList(Map<String, String> requestHeaders) throws IOException {
    
        Response<List<BillingPublicModels.PlanList>> response = billingPublicApiList.planList(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }  

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}