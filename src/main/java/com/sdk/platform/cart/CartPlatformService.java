package com.sdk.platform.cart;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class CartPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CartPlatformApiList cartPlatformApiList;

    public CartPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.cartPlatformApiList = generateCartPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CartPlatformApiList generateCartPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CartPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public CartPlatformModels.CouponDetailResponseObject createCoupon(CartPlatformModels.CouponAdd body) throws FDKServerResponseError, FDKException {
        return this.createCoupon(body, new HashMap<>());
    }

    public CartPlatformModels.CouponDetailResponseObject createCoupon(CartPlatformModels.CouponAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.createCoupon(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CouponsResponseObject getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code) throws FDKServerResponseError, FDKException {
        return this.getCoupons(pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code, new HashMap<>());
    }

    public CartPlatformModels.CouponsResponseObject getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponsResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCoupons(this.companyId, this.applicationId, pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getCoupons
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CartPlatformModels.CouponsResponseObject> getCouponsPagination(
        Integer pageSize,
        Boolean isArchived,
        String title,
        Boolean isPublic,
        Boolean isDisplay,
        String typeSlug,
        String code
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.CouponsResponseObject> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.CouponsResponseObject callback = this.getCoupons(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 isArchived,
                 title,
                 isPublic,
                 isDisplay,
                 typeSlug,
                 code
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CartPlatformModels.TagsViewResponseObject getCouponTags() throws FDKServerResponseError, FDKException {
        return this.getCouponTags(new HashMap<>());
    }

    public CartPlatformModels.TagsViewResponseObject getCouponTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.TagsViewResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCouponTags(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.TagsViewResponseObject getPromotionTags() throws FDKServerResponseError, FDKException {
        return this.getPromotionTags(new HashMap<>());
    }

    public CartPlatformModels.TagsViewResponseObject getPromotionTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.TagsViewResponseObject> response = null;
            try {
            response = cartPlatformApiList.getPromotionTags(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CouponUpdate getCouponById(String id) throws FDKServerResponseError, FDKException {
        return this.getCouponById(id, new HashMap<>());
    }

    public CartPlatformModels.CouponUpdate getCouponById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponUpdate> response = null;
            try {
            response = cartPlatformApiList.getCouponById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CouponDetailResponseObject updateCoupon(String id, CartPlatformModels.CouponUpdate body) throws FDKServerResponseError, FDKException {
        return this.updateCoupon(id, body, new HashMap<>());
    }

    public CartPlatformModels.CouponDetailResponseObject updateCoupon(String id, CartPlatformModels.CouponUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateCoupon(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SuccessMessage updateCouponPartially(String id, CartPlatformModels.CouponPartialUpdate body) throws FDKServerResponseError, FDKException {
        return this.updateCouponPartially(id, body, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage updateCouponPartially(String id, CartPlatformModels.CouponPartialUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.updateCouponPartially(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PromotionsResponseObject getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId) throws FDKServerResponseError, FDKException {
        return this.getPromotions(pageNo, pageSize, q, isActive, promoGroup, promotionType, fpPanel, promotionId, new HashMap<>());
    }

    public CartPlatformModels.PromotionsResponseObject getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionsResponseObject> response = null;
            try {
            response = cartPlatformApiList.getPromotions(this.companyId, this.applicationId, pageNo, pageSize, q, isActive, promoGroup, promotionType, fpPanel, promotionId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getPromotions
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CartPlatformModels.PromotionsResponseObject> getPromotionsPagination(
        Integer pageSize,
        String q,
        Boolean isActive,
        String promoGroup,
        String promotionType,
        String fpPanel,
        String promotionId
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.PromotionsResponseObject> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.PromotionsResponseObject callback = this.getPromotions(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 isActive,
                 promoGroup,
                 promotionType,
                 fpPanel,
                 promotionId
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CartPlatformModels.PromotionAddResult createPromotion(CartPlatformModels.PromotionAdd body) throws FDKServerResponseError, FDKException {
        return this.createPromotion(body, new HashMap<>());
    }

    public CartPlatformModels.PromotionAddResult createPromotion(CartPlatformModels.PromotionAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionAddResult> response = null;
            try {
            response = cartPlatformApiList.createPromotion(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PromotionUpdateResult getPromotionById(String id) throws FDKServerResponseError, FDKException {
        return this.getPromotionById(id, new HashMap<>());
    }

    public CartPlatformModels.PromotionUpdateResult getPromotionById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionUpdateResult> response = null;
            try {
            response = cartPlatformApiList.getPromotionById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PromotionUpdateResult updatePromotion(String id, CartPlatformModels.PromotionUpdate body) throws FDKServerResponseError, FDKException {
        return this.updatePromotion(id, body, new HashMap<>());
    }

    public CartPlatformModels.PromotionUpdateResult updatePromotion(String id, CartPlatformModels.PromotionUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionUpdateResult> response = null;
            try {
            response = cartPlatformApiList.updatePromotion(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SuccessMessage updatePromotionPartially(String id, CartPlatformModels.PromotionPartialUpdate body) throws FDKServerResponseError, FDKException {
        return this.updatePromotionPartially(id, body, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage updatePromotionPartially(String id, CartPlatformModels.PromotionPartialUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.updatePromotionPartially(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.ActivePromosResponseObject getPromosCouponConfig(String entityType, Boolean isHidden) throws FDKServerResponseError, FDKException {
        return this.getPromosCouponConfig(entityType, isHidden, new HashMap<>());
    }

    public CartPlatformModels.ActivePromosResponseObject getPromosCouponConfig(String entityType, Boolean isHidden, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.ActivePromosResponseObject> response = null;
            try {
            response = cartPlatformApiList.getPromosCouponConfig(this.companyId, this.applicationId, entityType, isHidden, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartMetaConfigDetailObject getCartMetaConfig(String cartMetaId) throws FDKServerResponseError, FDKException {
        return this.getCartMetaConfig(cartMetaId, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigDetailObject getCartMetaConfig(String cartMetaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigDetailObject> response = null;
            try {
            response = cartPlatformApiList.getCartMetaConfig(this.companyId, this.applicationId, cartMetaId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartMetaConfigUpdate updateCartMetaConfig(String cartMetaId, CartPlatformModels.CartMetaConfigUpdate body) throws FDKServerResponseError, FDKException {
        return this.updateCartMetaConfig(cartMetaId, body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigUpdate updateCartMetaConfig(String cartMetaId, CartPlatformModels.CartMetaConfigUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigUpdate> response = null;
            try {
            response = cartPlatformApiList.updateCartMetaConfig(this.companyId, this.applicationId, cartMetaId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SuccessMessage deleteCartMetaConfig(String cartMetaId) throws FDKServerResponseError, FDKException {
        return this.deleteCartMetaConfig(cartMetaId, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage deleteCartMetaConfig(String cartMetaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.deleteCartMetaConfig(this.companyId, this.applicationId, cartMetaId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartMetaConfigListResponseObject getCartMetaConfigs() throws FDKServerResponseError, FDKException {
        return this.getCartMetaConfigs(new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigListResponseObject getCartMetaConfigs(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigListResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCartMetaConfigs(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartMetaConfigAddResponseObject createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body) throws FDKServerResponseError, FDKException {
        return this.createCartMetaConfig(body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigAddResponseObject createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigAddResponseObject> response = null;
            try {
            response = cartPlatformApiList.createCartMetaConfig(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.AddPriceAdjustmentResponseObject addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body) throws FDKServerResponseError, FDKException {
        return this.addPriceAdjustment(body, new HashMap<>());
    }

    public CartPlatformModels.AddPriceAdjustmentResponseObject addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddPriceAdjustmentResponseObject> response = null;
            try {
            response = cartPlatformApiList.addPriceAdjustment(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PriceAdjustmentResponsObject getPriceAdjustments(String cartId) throws FDKServerResponseError, FDKException {
        return this.getPriceAdjustments(cartId, new HashMap<>());
    }

    public CartPlatformModels.PriceAdjustmentResponsObject getPriceAdjustments(String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PriceAdjustmentResponsObject> response = null;
            try {
            response = cartPlatformApiList.getPriceAdjustments(this.companyId, this.applicationId, cartId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.UpdatePriceAdjustmentResponseObject updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body) throws FDKServerResponseError, FDKException {
        return this.updatePriceAdjustment(id, body, new HashMap<>());
    }

    public CartPlatformModels.UpdatePriceAdjustmentResponseObject updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdatePriceAdjustmentResponseObject> response = null;
            try {
            response = cartPlatformApiList.updatePriceAdjustment(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SuccessMessage removePriceAdjustment(String id) throws FDKServerResponseError, FDKException {
        return this.removePriceAdjustment(id, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage removePriceAdjustment(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.removePriceAdjustment(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.OpenapiCartDetailsResponseObject fetchAndvalidateCartItems(CartPlatformModels.OpenapiCartDetailsRequestObject body) throws FDKServerResponseError, FDKException {
        return this.fetchAndvalidateCartItems(body, new HashMap<>());
    }

    public CartPlatformModels.OpenapiCartDetailsResponseObject fetchAndvalidateCartItems(CartPlatformModels.OpenapiCartDetailsRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenapiCartDetailsResponseObject> response = null;
            try {
            response = cartPlatformApiList.fetchAndvalidateCartItems(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.OpenApiCartServiceabilityResponseObject checkCartServiceability(CartPlatformModels.OpenApiCartServiceabilityRequestObject body) throws FDKServerResponseError, FDKException {
        return this.checkCartServiceability(body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCartServiceabilityResponseObject checkCartServiceability(CartPlatformModels.OpenApiCartServiceabilityRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCartServiceabilityResponseObject> response = null;
            try {
            response = cartPlatformApiList.checkCartServiceability(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.OpenApiCheckoutResponseObject checkoutCart(CartPlatformModels.OpenApiPlatformCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.checkoutCart(body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCheckoutResponseObject checkoutCart(CartPlatformModels.OpenApiPlatformCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCheckoutResponseObject> response = null;
            try {
            response = cartPlatformApiList.checkoutCart(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.AbandonedCartResponseObject getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCart(pageNo, pageSize, fromDate, toDate, anonymousCart, lastId, sortOn, new HashMap<>());
    }

    public CartPlatformModels.AbandonedCartResponseObject getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AbandonedCartResponseObject> response = null;
            try {
            response = cartPlatformApiList.getAbandonedCart(this.companyId, this.applicationId, pageNo, pageSize, fromDate, toDate, anonymousCart, lastId, sortOn, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAbandonedCart
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CartPlatformModels.AbandonedCartResponseObject> getAbandonedCartPagination(
        Integer pageSize,
        String fromDate,
        String toDate,
        Boolean anonymousCart,
        String lastId,
        String sortOn
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.AbandonedCartResponseObject> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.AbandonedCartResponseObject callback = this.getAbandonedCart(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 fromDate,
                 toDate,
                 anonymousCart,
                 lastId,
                 sortOn
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CartPlatformModels.CartDetailResponseObject getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCartDetails(id, i, b, c, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.getAbandonedCartDetails(this.companyId, this.applicationId, id, i, b, c, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.AddCartDetailResponseObject addItems(String cartId, Boolean b, CartPlatformModels.AddCartRequestObject body) throws FDKServerResponseError, FDKException {
        return this.addItems(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResponseObject addItems(String cartId, Boolean b, CartPlatformModels.AddCartRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.addItems(this.companyId, this.applicationId, cartId, b, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.UpdateCartDetailResponseObject updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartRequestObject body) throws FDKServerResponseError, FDKException {
        return this.updateCart(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResponseObject updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateCart(this.companyId, this.applicationId, cartId, b, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CouponOptions getCouponOptionValues() throws FDKServerResponseError, FDKException {
        return this.getCouponOptionValues(new HashMap<>());
    }

    public CartPlatformModels.CouponOptions getCouponOptionValues(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponOptions> response = null;
            try {
            response = cartPlatformApiList.getCouponOptionValues(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public Object getCouponCodeExists(String code) throws FDKServerResponseError, FDKException {
        return this.getCouponCodeExists(code, new HashMap<>());
    }

    public Object getCouponCodeExists(String code, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
            response = cartPlatformApiList.getCouponCodeExists(this.companyId, this.applicationId, code, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public Object getPromotionCodeExists(String code) throws FDKServerResponseError, FDKException {
        return this.getPromotionCodeExists(code, new HashMap<>());
    }

    public Object getPromotionCodeExists(String code, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
            response = cartPlatformApiList.getPromotionCodeExists(this.companyId, this.applicationId, code, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.OverrideCheckoutResponseObject overrideCart(CartPlatformModels.OverrideCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.overrideCart(body, new HashMap<>());
    }

    public CartPlatformModels.OverrideCheckoutResponseObject overrideCart(CartPlatformModels.OverrideCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OverrideCheckoutResponseObject> response = null;
            try {
            response = cartPlatformApiList.overrideCart(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.GetShareCartLinkResponseObject getCartShareLink(CartPlatformModels.GetShareCartLinkRequestObject body) throws FDKServerResponseError, FDKException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartPlatformModels.GetShareCartLinkResponseObject getCartShareLink(CartPlatformModels.GetShareCartLinkRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetShareCartLinkResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCartShareLink(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SharedCartResponseObject getCartSharedItems(String token) throws FDKServerResponseError, FDKException {
        return this.getCartSharedItems(token, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResponseObject getCartSharedItems(String token, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCartSharedItems(this.companyId, this.applicationId, token, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SharedCartResponseObject updateCartWithSharedItems(String token, String action, String cartId) throws FDKServerResponseError, FDKException {
        return this.updateCartWithSharedItems(token, action, cartId, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResponseObject updateCartWithSharedItems(String token, String action, String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateCartWithSharedItems(this.companyId, this.applicationId, token, action, cartId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.MultiCartResponseObject getCartList(String fromDate, String toDate, String filterOn) throws FDKServerResponseError, FDKException {
        return this.getCartList(fromDate, toDate, filterOn, new HashMap<>());
    }

    public CartPlatformModels.MultiCartResponseObject getCartList(String fromDate, String toDate, String filterOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.MultiCartResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCartList(this.companyId, this.applicationId, fromDate, toDate, filterOn, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.UserCartMappingResponseObject updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body) throws FDKServerResponseError, FDKException {
        return this.updateCartUser(id, body, new HashMap<>());
    }

    public CartPlatformModels.UserCartMappingResponseObject updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UserCartMappingResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateCartUser(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartItemCountResponseObject getItemCount(String id, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.getItemCount(id, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartItemCountResponseObject getItemCount(String id, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartItemCountResponseObject> response = null;
            try {
            response = cartPlatformApiList.getItemCount(this.companyId, this.applicationId, id, buyNow, cartType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.AddCartDetailResponseObject platformAddItems(Boolean i, Boolean b, Boolean buyNow, String id, String cartType, CartPlatformModels.PlatformAddCartRequestObject body) throws FDKServerResponseError, FDKException {
        return this.platformAddItems(i, b, buyNow, id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResponseObject platformAddItems(Boolean i, Boolean b, Boolean buyNow, String id, String cartType, CartPlatformModels.PlatformAddCartRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.platformAddItems(this.companyId, this.applicationId, i, b, buyNow, id, cartType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject getCart(String id, String userId, Boolean i, Boolean b, Double assignCardId, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.getCart(id, userId, i, b, assignCardId, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject getCart(String id, String userId, Boolean i, Boolean b, Double assignCardId, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.getCart(this.companyId, this.applicationId, id, userId, i, b, assignCardId, buyNow, cartType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.UpdateCartDetailResponseObject platformUpdateCart(String id, Boolean i, String orderType, Boolean b, Boolean buyNow, String cartType, CartPlatformModels.PlatformUpdateCartRequestObject body) throws FDKServerResponseError, FDKException {
        return this.platformUpdateCart(id, i, orderType, b, buyNow, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResponseObject platformUpdateCart(String id, Boolean i, String orderType, Boolean b, Boolean buyNow, String cartType, CartPlatformModels.PlatformUpdateCartRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.platformUpdateCart(this.companyId, this.applicationId, id, i, orderType, b, buyNow, cartType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.DeleteCartDetailResponseObject deleteCart(String id, String cartType, CartPlatformModels.DeleteCartRequestObject body) throws FDKServerResponseError, FDKException {
        return this.deleteCart(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.DeleteCartDetailResponseObject deleteCart(String id, String cartType, CartPlatformModels.DeleteCartRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteCartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.deleteCart(this.companyId, this.applicationId, id, cartType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.GetCouponResponseObject getAppCoupons(String id, Boolean buyNow, String slug, String storeId) throws FDKServerResponseError, FDKException {
        return this.getAppCoupons(id, buyNow, slug, storeId, new HashMap<>());
    }

    public CartPlatformModels.GetCouponResponseObject getAppCoupons(String id, Boolean buyNow, String slug, String storeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetCouponResponseObject> response = null;
            try {
            response = cartPlatformApiList.getAppCoupons(this.companyId, this.applicationId, id, buyNow, slug, storeId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponRequestObject body) throws FDKServerResponseError, FDKException {
        return this.applyCoupon(i, b, p, id, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.applyCoupon(this.companyId, this.applicationId, i, b, p, id, buyNow, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject removeCoupon(String uid, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.removeCoupon(uid, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject removeCoupon(String uid, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.removeCoupon(this.companyId, this.applicationId, uid, buyNow, cartType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.SaveAddressResponseObject addAddress(CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.addAddress(body, new HashMap<>());
    }

    public CartPlatformModels.SaveAddressResponseObject addAddress(CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SaveAddressResponseObject> response = null;
            try {
            response = cartPlatformApiList.addAddress(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PlatformGetAddressesResponseObject getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws FDKServerResponseError, FDKException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartPlatformModels.PlatformGetAddressesResponseObject getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformGetAddressesResponseObject> response = null;
            try {
            response = cartPlatformApiList.getAddresses(this.companyId, this.applicationId, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PlatformAddress getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws FDKServerResponseError, FDKException {
        return this.getAddressById(id, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartPlatformModels.PlatformAddress getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformAddress> response = null;
            try {
            response = cartPlatformApiList.getAddressById(this.companyId, this.applicationId, id, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.UpdateAddressResponseObject updateAddress(String id, CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.updateAddress(id, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateAddressResponseObject updateAddress(String id, CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateAddressResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateAddress(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.DeleteAddressResponseObject removeAddress(String id, String userId) throws FDKServerResponseError, FDKException {
        return this.removeAddress(id, userId, new HashMap<>());
    }

    public CartPlatformModels.DeleteAddressResponseObject removeAddress(String id, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteAddressResponseObject> response = null;
            try {
            response = cartPlatformApiList.removeAddress(this.companyId, this.applicationId, id, userId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddressRequestObject body) throws FDKServerResponseError, FDKException {
        return this.selectAddress(cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddressRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.selectAddress(this.companyId, this.applicationId, cartId, buyNow, i, b, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PlatformCartShipmentsResponseObject getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType) throws FDKServerResponseError, FDKException {
        return this.getShipments(pickAtStoreUid, orderingStoreId, i, p, id, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResponseObject getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResponseObject> response = null;
            try {
            response = cartPlatformApiList.getShipments(this.companyId, this.applicationId, pickAtStoreUid, orderingStoreId, i, p, id, addressId, areaCode, orderType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PlatformCartShipmentsResponseObject updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentRequestObject body) throws FDKServerResponseError, FDKException {
        return this.updateShipments(i, p, id, addressId, areaCode, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResponseObject updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateShipments(this.companyId, this.applicationId, i, p, id, addressId, areaCode, orderType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartMetaResponseObject updateCartMeta(String id, Boolean buyNow, String userId, CartPlatformModels.PlatformCartMetaRequestObject body) throws FDKServerResponseError, FDKException {
        return this.updateCartMeta(id, buyNow, userId, body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaResponseObject updateCartMeta(String id, Boolean buyNow, String userId, CartPlatformModels.PlatformCartMetaRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaResponseObject> response = null;
            try {
            response = cartPlatformApiList.updateCartMeta(this.companyId, this.applicationId, id, buyNow, userId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartCheckoutResponseObject platformCheckoutCart(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailRequestObject body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCart(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutResponseObject platformCheckoutCart(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutResponseObject> response = null;
            try {
            response = cartPlatformApiList.platformCheckoutCart(this.companyId, this.applicationId, id, cartType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDeliveryModesResponseObject getAvailableDeliveryModes(String areaCode, String id) throws FDKServerResponseError, FDKException {
        return this.getAvailableDeliveryModes(areaCode, id, new HashMap<>());
    }

    public CartPlatformModels.CartDeliveryModesResponseObject getAvailableDeliveryModes(String areaCode, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDeliveryModesResponseObject> response = null;
            try {
            response = cartPlatformApiList.getAvailableDeliveryModes(this.companyId, this.applicationId, areaCode, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.StoreDetailsResponseObject getStoreAddressByUid(Integer storeUid) throws FDKServerResponseError, FDKException {
        return this.getStoreAddressByUid(storeUid, new HashMap<>());
    }

    public CartPlatformModels.StoreDetailsResponseObject getStoreAddressByUid(Integer storeUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.StoreDetailsResponseObject> response = null;
            try {
            response = cartPlatformApiList.getStoreAddressByUid(this.companyId, this.applicationId, storeUid, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject selectPaymentMode(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestObject body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentMode(id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject selectPaymentMode(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.selectPaymentMode(this.companyId, this.applicationId, id, buyNow, orderType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType) throws FDKServerResponseError, FDKException {
        return this.validateCouponForPayment(id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, new HashMap<>());
    }

    public CartPlatformModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PaymentCouponValidate> response = null;
            try {
            response = cartPlatformApiList.validateCouponForPayment(this.companyId, this.applicationId, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartCheckoutResponseObject platformCheckoutCartV2(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailV2RequestObject body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCartV2(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutResponseObject platformCheckoutCartV2(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailV2RequestObject body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutResponseObject> response = null;
            try {
            response = cartPlatformApiList.platformCheckoutCartV2(this.companyId, this.applicationId, id, cartType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CartPlatformModels.CartDetailResponseObject selectPaymentModeV2(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentModeV2(id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponseObject selectPaymentModeV2(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponseObject> response = null;
            try {
            response = cartPlatformApiList.selectPaymentModeV2(this.companyId, this.applicationId, id, buyNow, orderType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}