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

    public CartPlatformModels.CouponDetailResponse createCoupon(CartPlatformModels.CouponAdd body) throws FDKServerResponseError, FDKException {
        return this.createCoupon(body, new HashMap<>());
    }

    public CartPlatformModels.CouponDetailResponse createCoupon(CartPlatformModels.CouponAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponDetailResponse> response = null;
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

    public CartPlatformModels.CouponsResponse getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code) throws FDKServerResponseError, FDKException {
        return this.getCoupons(pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code, new HashMap<>());
    }

    public CartPlatformModels.CouponsResponse getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponsResponse> response = null;
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
    public Paginator<CartPlatformModels.CouponsResponse> getCouponsPagination(
        Integer pageSize,
        Boolean isArchived,
        String title,
        Boolean isPublic,
        Boolean isDisplay,
        String typeSlug,
        String code
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.CouponsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.CouponsResponse callback = this.getCoupons(
                
                 
                 
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

    public CartPlatformModels.TagsViewResponse getCouponTags() throws FDKServerResponseError, FDKException {
        return this.getCouponTags(new HashMap<>());
    }

    public CartPlatformModels.TagsViewResponse getCouponTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.TagsViewResponse> response = null;
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

    public CartPlatformModels.TagsViewResponse getPromotionTags() throws FDKServerResponseError, FDKException {
        return this.getPromotionTags(new HashMap<>());
    }

    public CartPlatformModels.TagsViewResponse getPromotionTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.TagsViewResponse> response = null;
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

    public CartPlatformModels.CouponDetailResponse updateCoupon(String id, CartPlatformModels.CouponUpdate body) throws FDKServerResponseError, FDKException {
        return this.updateCoupon(id, body, new HashMap<>());
    }

    public CartPlatformModels.CouponDetailResponse updateCoupon(String id, CartPlatformModels.CouponUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponDetailResponse> response = null;
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

    public CartPlatformModels.PromotionsResponse getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId) throws FDKServerResponseError, FDKException {
        return this.getPromotions(pageNo, pageSize, q, isActive, promoGroup, promotionType, fpPanel, promotionId, new HashMap<>());
    }

    public CartPlatformModels.PromotionsResponse getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionsResponse> response = null;
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
    public Paginator<CartPlatformModels.PromotionsResponse> getPromotionsPagination(
        Integer pageSize,
        String q,
        Boolean isActive,
        String promoGroup,
        String promotionType,
        String fpPanel,
        String promotionId
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.PromotionsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.PromotionsResponse callback = this.getPromotions(
                
                 
                 
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

    public CartPlatformModels.ActivePromosResponse getPromosCouponConfig(String entityType, Boolean isHidden) throws FDKServerResponseError, FDKException {
        return this.getPromosCouponConfig(entityType, isHidden, new HashMap<>());
    }

    public CartPlatformModels.ActivePromosResponse getPromosCouponConfig(String entityType, Boolean isHidden, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.ActivePromosResponse> response = null;
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

    public CartPlatformModels.CartMetaConfigDetailResponse getCartMetaConfig(String cartMetaId) throws FDKServerResponseError, FDKException {
        return this.getCartMetaConfig(cartMetaId, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigDetailResponse getCartMetaConfig(String cartMetaId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigDetailResponse> response = null;
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

    public CartPlatformModels.CartMetaConfigListResponse getCartMetaConfigs() throws FDKServerResponseError, FDKException {
        return this.getCartMetaConfigs(new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigListResponse getCartMetaConfigs(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigListResponse> response = null;
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

    public CartPlatformModels.CartMetaConfigAddResponse createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body) throws FDKServerResponseError, FDKException {
        return this.createCartMetaConfig(body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigAddResponse createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigAddResponse> response = null;
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

    public CartPlatformModels.AddPriceAdjustmentResponse addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body) throws FDKServerResponseError, FDKException {
        return this.addPriceAdjustment(body, new HashMap<>());
    }

    public CartPlatformModels.AddPriceAdjustmentResponse addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddPriceAdjustmentResponse> response = null;
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

    public CartPlatformModels.PriceAdjustmentResponse getPriceAdjustments(String cartId) throws FDKServerResponseError, FDKException {
        return this.getPriceAdjustments(cartId, new HashMap<>());
    }

    public CartPlatformModels.PriceAdjustmentResponse getPriceAdjustments(String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PriceAdjustmentResponse> response = null;
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

    public CartPlatformModels.UpdatePriceAdjustmentResponse updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body) throws FDKServerResponseError, FDKException {
        return this.updatePriceAdjustment(id, body, new HashMap<>());
    }

    public CartPlatformModels.UpdatePriceAdjustmentResponse updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdatePriceAdjustmentResponse> response = null;
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

    public CartPlatformModels.OpenapiCartDetailsResponse fetchAndvalidateCartItems(CartPlatformModels.OpenapiCartDetailsRequest body) throws FDKServerResponseError, FDKException {
        return this.fetchAndvalidateCartItems(body, new HashMap<>());
    }

    public CartPlatformModels.OpenapiCartDetailsResponse fetchAndvalidateCartItems(CartPlatformModels.OpenapiCartDetailsRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenapiCartDetailsResponse> response = null;
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

    public CartPlatformModels.OpenApiCartServiceabilityResponse checkCartServiceability(CartPlatformModels.OpenApiCartServiceabilityRequest body) throws FDKServerResponseError, FDKException {
        return this.checkCartServiceability(body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCartServiceabilityResponse checkCartServiceability(CartPlatformModels.OpenApiCartServiceabilityRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCartServiceabilityResponse> response = null;
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

    public CartPlatformModels.OpenApiCheckoutResponse checkoutCart(CartPlatformModels.OpenApiPlatformCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.checkoutCart(body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCheckoutResponse checkoutCart(CartPlatformModels.OpenApiPlatformCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCheckoutResponse> response = null;
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

    public CartPlatformModels.AbandonedCartResponse getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCart(pageNo, pageSize, fromDate, toDate, anonymousCart, lastId, sortOn, new HashMap<>());
    }

    public CartPlatformModels.AbandonedCartResponse getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AbandonedCartResponse> response = null;
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
    public Paginator<CartPlatformModels.AbandonedCartResponse> getAbandonedCartPagination(
        Integer pageSize,
        String fromDate,
        String toDate,
        Boolean anonymousCart,
        String lastId,
        String sortOn
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CartPlatformModels.AbandonedCartResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CartPlatformModels.AbandonedCartResponse callback = this.getAbandonedCart(
                
                 
                 
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

    public CartPlatformModels.CartDetailResponse getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCartDetails(id, i, b, c, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.AddCartDetailResponse addItems(String cartId, Boolean b, CartPlatformModels.AddCartRequest body) throws FDKServerResponseError, FDKException {
        return this.addItems(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResponse addItems(String cartId, Boolean b, CartPlatformModels.AddCartRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResponse> response = null;
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

    public CartPlatformModels.UpdateCartDetailResponse updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartRequest body) throws FDKServerResponseError, FDKException {
        return this.updateCart(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResponse updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResponse> response = null;
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

    public CartPlatformModels.OverrideCheckoutResponse overrideCart(CartPlatformModels.OverrideCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.overrideCart(body, new HashMap<>());
    }

    public CartPlatformModels.OverrideCheckoutResponse overrideCart(CartPlatformModels.OverrideCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OverrideCheckoutResponse> response = null;
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

    public CartPlatformModels.GetShareCartLinkResponse getCartShareLink(CartPlatformModels.GetShareCartLinkRequest body) throws FDKServerResponseError, FDKException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartPlatformModels.GetShareCartLinkResponse getCartShareLink(CartPlatformModels.GetShareCartLinkRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetShareCartLinkResponse> response = null;
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

    public CartPlatformModels.SharedCartResponse getCartSharedItems(String token) throws FDKServerResponseError, FDKException {
        return this.getCartSharedItems(token, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResponse getCartSharedItems(String token, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResponse> response = null;
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

    public CartPlatformModels.SharedCartResponse updateCartWithSharedItems(String token, String action, String cartId) throws FDKServerResponseError, FDKException {
        return this.updateCartWithSharedItems(token, action, cartId, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResponse updateCartWithSharedItems(String token, String action, String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResponse> response = null;
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

    public CartPlatformModels.MultiCartResponse getCartList(String fromDate, String toDate, String filterOn) throws FDKServerResponseError, FDKException {
        return this.getCartList(fromDate, toDate, filterOn, new HashMap<>());
    }

    public CartPlatformModels.MultiCartResponse getCartList(String fromDate, String toDate, String filterOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.MultiCartResponse> response = null;
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

    public CartPlatformModels.UserCartMappingResponse updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body) throws FDKServerResponseError, FDKException {
        return this.updateCartUser(id, body, new HashMap<>());
    }

    public CartPlatformModels.UserCartMappingResponse updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UserCartMappingResponse> response = null;
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

    public CartPlatformModels.CartItemCountResponse getItemCount(String id, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.getItemCount(id, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartItemCountResponse getItemCount(String id, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartItemCountResponse> response = null;
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

    public CartPlatformModels.AddCartDetailResponse platformAddItems(Boolean i, Boolean b, Boolean buyNow, String id, String cartType, CartPlatformModels.PlatformAddCartRequest body) throws FDKServerResponseError, FDKException {
        return this.platformAddItems(i, b, buyNow, id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResponse platformAddItems(Boolean i, Boolean b, Boolean buyNow, String id, String cartType, CartPlatformModels.PlatformAddCartRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse getCart(String id, String userId, Boolean i, Boolean b, Double assignCardId, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.getCart(id, userId, i, b, assignCardId, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse getCart(String id, String userId, Boolean i, Boolean b, Double assignCardId, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.UpdateCartDetailResponse platformUpdateCart(String id, Boolean i, String orderType, Boolean b, Boolean buyNow, String cartType, CartPlatformModels.PlatformUpdateCartRequest body) throws FDKServerResponseError, FDKException {
        return this.platformUpdateCart(id, i, orderType, b, buyNow, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResponse platformUpdateCart(String id, Boolean i, String orderType, Boolean b, Boolean buyNow, String cartType, CartPlatformModels.PlatformUpdateCartRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResponse> response = null;
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

    public CartPlatformModels.DeleteCartDetailResponse deleteCart(String id, String cartType, CartPlatformModels.DeleteCartRequest body) throws FDKServerResponseError, FDKException {
        return this.deleteCart(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.DeleteCartDetailResponse deleteCart(String id, String cartType, CartPlatformModels.DeleteCartRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteCartDetailResponse> response = null;
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

    public CartPlatformModels.GetCouponResponse getAppCoupons(String id, Boolean buyNow, String slug, String storeId) throws FDKServerResponseError, FDKException {
        return this.getAppCoupons(id, buyNow, slug, storeId, new HashMap<>());
    }

    public CartPlatformModels.GetCouponResponse getAppCoupons(String id, Boolean buyNow, String slug, String storeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetCouponResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponRequest body) throws FDKServerResponseError, FDKException {
        return this.applyCoupon(i, b, p, id, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse removeCoupon(String uid, Boolean buyNow, String cartType) throws FDKServerResponseError, FDKException {
        return this.removeCoupon(uid, buyNow, cartType, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse removeCoupon(String uid, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.SaveAddressResponse addAddress(CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.addAddress(body, new HashMap<>());
    }

    public CartPlatformModels.SaveAddressResponse addAddress(CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SaveAddressResponse> response = null;
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

    public CartPlatformModels.PlatformGetAddressesResponse getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws FDKServerResponseError, FDKException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartPlatformModels.PlatformGetAddressesResponse getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformGetAddressesResponse> response = null;
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

    public CartPlatformModels.UpdateAddressResponse updateAddress(String id, CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.updateAddress(id, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateAddressResponse updateAddress(String id, CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateAddressResponse> response = null;
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

    public CartPlatformModels.DeleteAddressResponse removeAddress(String id, String userId) throws FDKServerResponseError, FDKException {
        return this.removeAddress(id, userId, new HashMap<>());
    }

    public CartPlatformModels.DeleteAddressResponse removeAddress(String id, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteAddressResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddressRequest body) throws FDKServerResponseError, FDKException {
        return this.selectAddress(cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddressRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.PlatformCartShipmentsResponse getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType) throws FDKServerResponseError, FDKException {
        return this.getShipments(pickAtStoreUid, orderingStoreId, i, p, id, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResponse getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResponse> response = null;
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

    public CartPlatformModels.PlatformCartShipmentsResponse updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentRequest body) throws FDKServerResponseError, FDKException {
        return this.updateShipments(i, p, id, addressId, areaCode, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResponse updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResponse> response = null;
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

    public CartPlatformModels.CartMetaResponse updateCartMeta(String id, Boolean buyNow, String userId, CartPlatformModels.PlatformCartMetaRequest body) throws FDKServerResponseError, FDKException {
        return this.updateCartMeta(id, buyNow, userId, body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaResponse updateCartMeta(String id, Boolean buyNow, String userId, CartPlatformModels.PlatformCartMetaRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaResponse> response = null;
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

    public CartPlatformModels.CartCheckoutResponse platformCheckoutCart(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailRequest body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCart(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutResponse platformCheckoutCart(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutResponse> response = null;
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

    public CartPlatformModels.CartDeliveryModesResponse getAvailableDeliveryModes(String areaCode, String id) throws FDKServerResponseError, FDKException {
        return this.getAvailableDeliveryModes(areaCode, id, new HashMap<>());
    }

    public CartPlatformModels.CartDeliveryModesResponse getAvailableDeliveryModes(String areaCode, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDeliveryModesResponse> response = null;
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

    public CartPlatformModels.StoreDetailsResponse getStoreAddressByUid(Integer storeUid) throws FDKServerResponseError, FDKException {
        return this.getStoreAddressByUid(storeUid, new HashMap<>());
    }

    public CartPlatformModels.StoreDetailsResponse getStoreAddressByUid(Integer storeUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.StoreDetailsResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse selectPaymentMode(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequest body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentMode(id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse selectPaymentMode(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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

    public CartPlatformModels.CartCheckoutResponse platformCheckoutCartV2(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailV2Request body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCartV2(id, cartType, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutResponse platformCheckoutCartV2(String id, String cartType, CartPlatformModels.PlatformCartCheckoutDetailV2Request body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutResponse> response = null;
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

    public CartPlatformModels.CartDetailResponse selectPaymentModeV2(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentModeV2(id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResponse selectPaymentModeV2(String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResponse> response = null;
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