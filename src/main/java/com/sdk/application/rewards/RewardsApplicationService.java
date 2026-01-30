package com.sdk.application.rewards;

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
 public class RewardsApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private RewardsApplicationApiList rewardsApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public RewardsApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = applicationConfig.getRetrofitServiceFactory();
        this.rewardsApplicationApiList = retrofitServiceFactory.getService(RewardsApplicationApiList.class);

        
        relativeUrls.put("getOfferByName","/service/application/rewards/v1.0/offers/{name}/".substring(1));
        relativeUrls.put("catalogueOrder","/service/application/rewards/v1.0/catalogue/offer/order/".substring(1));
        relativeUrls.put("getUserPointsHistory","/service/application/rewards/v1.0/user/points/history/".substring(1));
        relativeUrls.put("getUserPoints","/service/application/rewards/v1.0/user/points/".substring(1));
        relativeUrls.put("getUserReferralDetails","/service/application/rewards/v1.0/user/referral/".substring(1));
        relativeUrls.put("getOrderDiscount","/service/application/rewards/v1.0/user/offer/order-discount/".substring(1));
        relativeUrls.put("redeemReferralCode","/service/application/rewards/v1.0/user/referral/redeem/".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    public RewardsApplicationModels.Offer getOfferByName(String name) throws IOException {
        return this.getOfferByName(name, new HashMap<>());
    }

    public RewardsApplicationModels.Offer getOfferByName(String name, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOfferByName");
        fullUrl = fullUrl.replace("{" + "name" + "}",name.toString());

        Response<RewardsApplicationModels.Offer> response = rewardsApplicationApiList.getOfferByName(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.CatalogueOrderDetails catalogueOrder(RewardsApplicationModels.CatalogueOrderCreation body) throws IOException {
        return this.catalogueOrder(body, new HashMap<>());
    }

    public RewardsApplicationModels.CatalogueOrderDetails catalogueOrder(RewardsApplicationModels.CatalogueOrderCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("catalogueOrder");

        Response<RewardsApplicationModels.CatalogueOrderDetails> response = rewardsApplicationApiList.catalogueOrder(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.PointsHistoryDetails getUserPointsHistory(String pageId, Integer pageSize) throws IOException {
        return this.getUserPointsHistory(pageId, pageSize, new HashMap<>());
    }

    public RewardsApplicationModels.PointsHistoryDetails getUserPointsHistory(String pageId, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserPointsHistory");

        Response<RewardsApplicationModels.PointsHistoryDetails> response = rewardsApplicationApiList.getUserPointsHistory(fullUrl, pageId, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.PointsDetails getUserPoints() throws IOException {
        return this.getUserPoints(new HashMap<>());
    }

    public RewardsApplicationModels.PointsDetails getUserPoints(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserPoints");

        Response<RewardsApplicationModels.PointsDetails> response = rewardsApplicationApiList.getUserPoints(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.ReferralDetails getUserReferralDetails() throws IOException {
        return this.getUserReferralDetails(new HashMap<>());
    }

    public RewardsApplicationModels.ReferralDetails getUserReferralDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserReferralDetails");

        Response<RewardsApplicationModels.ReferralDetails> response = rewardsApplicationApiList.getUserReferralDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.OrderDiscountDetails getOrderDiscount(RewardsApplicationModels.RetrieveOrderDiscount body) throws IOException {
        return this.getOrderDiscount(body, new HashMap<>());
    }

    public RewardsApplicationModels.OrderDiscountDetails getOrderDiscount(RewardsApplicationModels.RetrieveOrderDiscount body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderDiscount");

        Response<RewardsApplicationModels.OrderDiscountDetails> response = rewardsApplicationApiList.getOrderDiscount(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.RedeemReferralCodeDetails redeemReferralCode(RewardsApplicationModels.RedeemReferralCode body) throws IOException {
        return this.redeemReferralCode(body, new HashMap<>());
    }

    public RewardsApplicationModels.RedeemReferralCodeDetails redeemReferralCode(RewardsApplicationModels.RedeemReferralCode body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("redeemReferralCode");

        Response<RewardsApplicationModels.RedeemReferralCodeDetails> response = rewardsApplicationApiList.redeemReferralCode(fullUrl, body, requestHeaders).execute();
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