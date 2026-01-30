package com.sdk.application.finance;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class FinanceApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FinanceApplicationApiList financeApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public FinanceApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = applicationConfig.getRetrofitServiceFactory();
        this.financeApplicationApiList = retrofitServiceFactory.getService(FinanceApplicationApiList.class);

        
        relativeUrls.put("customerCreditBalance","/service/application/finance/v1.0/customer-credit-balance".substring(1));
        relativeUrls.put("lockUnlockCreditNote","/service/application/finance/v1.0/lock-unlock-credit-note".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    public FinanceApplicationModels.CustomerCreditBalanceResponseSchema customerCreditBalance(FinanceApplicationModels.CustomerCreditBalanceRequestSchema body) throws IOException {
        return this.customerCreditBalance(body, new HashMap<>());
    }

    public FinanceApplicationModels.CustomerCreditBalanceResponseSchema customerCreditBalance(FinanceApplicationModels.CustomerCreditBalanceRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("customerCreditBalance");

        Response<FinanceApplicationModels.CustomerCreditBalanceResponseSchema> response = financeApplicationApiList.customerCreditBalance(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public FinanceApplicationModels.LockUnlockResponseSchema lockUnlockCreditNote(FinanceApplicationModels.LockUnlockRequestSchema body) throws IOException {
        return this.lockUnlockCreditNote(body, new HashMap<>());
    }

    public FinanceApplicationModels.LockUnlockResponseSchema lockUnlockCreditNote(FinanceApplicationModels.LockUnlockRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("lockUnlockCreditNote");

        Response<FinanceApplicationModels.LockUnlockResponseSchema> response = financeApplicationApiList.lockUnlockCreditNote(fullUrl, body, requestHeaders).execute();
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