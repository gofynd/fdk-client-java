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
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.rewardsApplicationApiList = generateRewardsApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
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

    private RewardsApplicationApiList generateRewardsApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),RewardsApplicationApiList.class, interceptorList, cookieStore);
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
    

    public RewardsApplicationModels.CatalogueOrderResponse catalogueOrder(RewardsApplicationModels.CatalogueOrderRequest body) throws IOException {
        return this.catalogueOrder(body, new HashMap<>());
    }

    public RewardsApplicationModels.CatalogueOrderResponse catalogueOrder(RewardsApplicationModels.CatalogueOrderRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("catalogueOrder");

        Response<RewardsApplicationModels.CatalogueOrderResponse> response = rewardsApplicationApiList.catalogueOrder(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.PointsHistoryResponse getUserPointsHistory(String pageId, Integer pageSize) throws IOException {
        return this.getUserPointsHistory(pageId, pageSize, new HashMap<>());
    }

    public RewardsApplicationModels.PointsHistoryResponse getUserPointsHistory(String pageId, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserPointsHistory");

        Response<RewardsApplicationModels.PointsHistoryResponse> response = rewardsApplicationApiList.getUserPointsHistory(fullUrl, pageId, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getUserPointsHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<RewardsApplicationModels.PointsHistoryResponse> getUserPointsHistoryPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<RewardsApplicationModels.PointsHistoryResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            RewardsApplicationModels.PointsHistoryResponse callback = this.getUserPointsHistory(
                
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public RewardsApplicationModels.PointsResponse getUserPoints() throws IOException {
        return this.getUserPoints(new HashMap<>());
    }

    public RewardsApplicationModels.PointsResponse getUserPoints(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserPoints");

        Response<RewardsApplicationModels.PointsResponse> response = rewardsApplicationApiList.getUserPoints(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.ReferralDetailsResponse getUserReferralDetails() throws IOException {
        return this.getUserReferralDetails(new HashMap<>());
    }

    public RewardsApplicationModels.ReferralDetailsResponse getUserReferralDetails(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserReferralDetails");

        Response<RewardsApplicationModels.ReferralDetailsResponse> response = rewardsApplicationApiList.getUserReferralDetails(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.OrderDiscountResponse getOrderDiscount(RewardsApplicationModels.OrderDiscountRequest body) throws IOException {
        return this.getOrderDiscount(body, new HashMap<>());
    }

    public RewardsApplicationModels.OrderDiscountResponse getOrderDiscount(RewardsApplicationModels.OrderDiscountRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getOrderDiscount");

        Response<RewardsApplicationModels.OrderDiscountResponse> response = rewardsApplicationApiList.getOrderDiscount(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public RewardsApplicationModels.RedeemReferralCodeResponse redeemReferralCode(RewardsApplicationModels.RedeemReferralCodeRequest body) throws IOException {
        return this.redeemReferralCode(body, new HashMap<>());
    }

    public RewardsApplicationModels.RedeemReferralCodeResponse redeemReferralCode(RewardsApplicationModels.RedeemReferralCodeRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("redeemReferralCode");

        Response<RewardsApplicationModels.RedeemReferralCodeResponse> response = rewardsApplicationApiList.redeemReferralCode(fullUrl, body, requestHeaders).execute();
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