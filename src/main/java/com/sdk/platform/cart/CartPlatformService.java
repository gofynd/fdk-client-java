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

    public CartPlatformModels.CouponsResult getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code, String createdBy, String reviewedBy, String approvedStartTime, String approvedEndTime, String reviewStartTime, String reviewEndTime, String status) throws FDKServerResponseError, FDKException {
        return this.getCoupons(pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code, createdBy, reviewedBy, approvedStartTime, approvedEndTime, reviewStartTime, reviewEndTime, status, new HashMap<>());
    }

    public CartPlatformModels.CouponsResult getCoupons(Integer pageNo, Integer pageSize, Boolean isArchived, String title, Boolean isPublic, Boolean isDisplay, String typeSlug, String code, String createdBy, String reviewedBy, String approvedStartTime, String approvedEndTime, String reviewStartTime, String reviewEndTime, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponsResult> response = null;
            try {
            response = cartPlatformApiList.getCoupons(this.companyId, this.applicationId, pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code, createdBy, reviewedBy, approvedStartTime, approvedEndTime, reviewStartTime, reviewEndTime, status, requestHeaders).execute();
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

    public CartPlatformModels.CouponCreateResult createCoupon(CartPlatformModels.CouponAdd body) throws FDKServerResponseError, FDKException {
        return this.createCoupon(body, new HashMap<>());
    }

    public CartPlatformModels.CouponCreateResult createCoupon(CartPlatformModels.CouponAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponCreateResult> response = null;
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

    public CartPlatformModels.CouponCreateResult updateCoupon(String id, CartPlatformModels.CouponUpdate body) throws FDKServerResponseError, FDKException {
        return this.updateCoupon(id, body, new HashMap<>());
    }

    public CartPlatformModels.CouponCreateResult updateCoupon(String id, CartPlatformModels.CouponUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CouponCreateResult> response = null;
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

    public CartPlatformModels.SuccessMessage deleteCoupon(String id) throws FDKServerResponseError, FDKException {
        return this.deleteCoupon(id, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage deleteCoupon(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.deleteCoupon(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CartPlatformModels.PromotionsResult getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId, String createdBy, String reviewedBy, String approvedStartTime, String approvedEndTime, String reviewStartTime, String reviewEndTime, String status) throws FDKServerResponseError, FDKException {
        return this.getPromotions(pageNo, pageSize, q, isActive, promoGroup, promotionType, fpPanel, promotionId, createdBy, reviewedBy, approvedStartTime, approvedEndTime, reviewStartTime, reviewEndTime, status, new HashMap<>());
    }

    public CartPlatformModels.PromotionsResult getPromotions(Integer pageNo, Integer pageSize, String q, Boolean isActive, String promoGroup, String promotionType, String fpPanel, String promotionId, String createdBy, String reviewedBy, String approvedStartTime, String approvedEndTime, String reviewStartTime, String reviewEndTime, String status, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionsResult> response = null;
            try {
            response = cartPlatformApiList.getPromotions(this.companyId, this.applicationId, pageNo, pageSize, q, isActive, promoGroup, promotionType, fpPanel, promotionId, createdBy, reviewedBy, approvedStartTime, approvedEndTime, reviewStartTime, reviewEndTime, status, requestHeaders).execute();
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

    public CartPlatformModels.SuccessMessage deletePromotion(String id) throws FDKServerResponseError, FDKException {
        return this.deletePromotion(id, new HashMap<>());
    }

    public CartPlatformModels.SuccessMessage deletePromotion(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SuccessMessage> response = null;
            try {
            response = cartPlatformApiList.deletePromotion(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CartPlatformModels.ActivePromosResult getPromosCouponConfig(String entityType, Boolean isHidden) throws FDKServerResponseError, FDKException {
        return this.getPromosCouponConfig(entityType, isHidden, new HashMap<>());
    }

    public CartPlatformModels.ActivePromosResult getPromosCouponConfig(String entityType, Boolean isHidden, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.ActivePromosResult> response = null;
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

    public CartPlatformModels.PromotionOffersDetails getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, String cartType, String promotionType, String cartId, Boolean autoApply) throws FDKServerResponseError, FDKException {
        return this.getPromotionOffers(slug, pageSize, promotionGroup, storeId, cartType, promotionType, cartId, autoApply, new HashMap<>());
    }

    public CartPlatformModels.PromotionOffersDetails getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, String cartType, String promotionType, String cartId, Boolean autoApply, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionOffersDetails> response = null;
            try {
            response = cartPlatformApiList.getPromotionOffers(this.companyId, this.applicationId, slug, pageSize, promotionGroup, storeId, cartType, promotionType, cartId, autoApply, requestHeaders).execute();
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

    public CartPlatformModels.PromotionPaymentOffersDetails getPromotionPaymentOffers(String id, Integer uid) throws FDKServerResponseError, FDKException {
        return this.getPromotionPaymentOffers(id, uid, new HashMap<>());
    }

    public CartPlatformModels.PromotionPaymentOffersDetails getPromotionPaymentOffers(String id, Integer uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PromotionPaymentOffersDetails> response = null;
            try {
            response = cartPlatformApiList.getPromotionPaymentOffers(this.companyId, this.applicationId, id, uid, requestHeaders).execute();
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

    public CartPlatformModels.CartMetaConfigAdd fetchCartMetaConfig() throws FDKServerResponseError, FDKException {
        return this.fetchCartMetaConfig(new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigAdd fetchCartMetaConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigAdd> response = null;
            try {
            response = cartPlatformApiList.fetchCartMetaConfig(this.companyId, this.applicationId, requestHeaders).execute();
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

    public CartPlatformModels.CartMetaConfigAdd createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body) throws FDKServerResponseError, FDKException {
        return this.createCartMetaConfig(body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaConfigAdd createCartMetaConfig(CartPlatformModels.CartMetaConfigAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaConfigAdd> response = null;
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

    public CartPlatformModels.GetPriceAdjustmentResult updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body) throws FDKServerResponseError, FDKException {
        return this.updatePriceAdjustment(id, body, new HashMap<>());
    }

    public CartPlatformModels.GetPriceAdjustmentResult updatePriceAdjustment(String id, CartPlatformModels.PriceAdjustmentUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetPriceAdjustmentResult> response = null;
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

    public CartPlatformModels.GetPriceAdjustmentResult addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body) throws FDKServerResponseError, FDKException {
        return this.addPriceAdjustment(body, new HashMap<>());
    }

    public CartPlatformModels.GetPriceAdjustmentResult addPriceAdjustment(CartPlatformModels.PriceAdjustmentAdd body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetPriceAdjustmentResult> response = null;
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

    public CartPlatformModels.GetPriceAdjustmentResult getPriceAdjustments(String cartId) throws FDKServerResponseError, FDKException {
        return this.getPriceAdjustments(cartId, new HashMap<>());
    }

    public CartPlatformModels.GetPriceAdjustmentResult getPriceAdjustments(String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetPriceAdjustmentResult> response = null;
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

    public CartPlatformModels.OpenapiCartDetailsResult fetchAndvalidateCartItems(String xOrderingSource, CartPlatformModels.OpenapiCartDetailsCreation body) throws FDKServerResponseError, FDKException {
        return this.fetchAndvalidateCartItems(xOrderingSource, body, new HashMap<>());
    }

    public CartPlatformModels.OpenapiCartDetailsResult fetchAndvalidateCartItems(String xOrderingSource, CartPlatformModels.OpenapiCartDetailsCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenapiCartDetailsResult> response = null;
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

    public CartPlatformModels.OpenApiCartServiceabilityResult checkCartServiceability(String xOrderingSource, CartPlatformModels.OpenApiCartServiceabilityCreation body) throws FDKServerResponseError, FDKException {
        return this.checkCartServiceability(xOrderingSource, body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCartServiceabilityResult checkCartServiceability(String xOrderingSource, CartPlatformModels.OpenApiCartServiceabilityCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCartServiceabilityResult> response = null;
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

    public CartPlatformModels.OpenApiCheckoutResult checkoutCart(String xOrderingSource, CartPlatformModels.OpenApiPlatformCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.checkoutCart(xOrderingSource, body, new HashMap<>());
    }

    public CartPlatformModels.OpenApiCheckoutResult checkoutCart(String xOrderingSource, CartPlatformModels.OpenApiPlatformCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OpenApiCheckoutResult> response = null;
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

    public CartPlatformModels.AbandonedCartResult getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCart(pageNo, pageSize, fromDate, toDate, anonymousCart, lastId, sortOn, new HashMap<>());
    }

    public CartPlatformModels.AbandonedCartResult getAbandonedCart(Integer pageNo, Integer pageSize, String fromDate, String toDate, Boolean anonymousCart, String lastId, String sortOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AbandonedCartResult> response = null;
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

    public CartPlatformModels.CartDetailResult getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c) throws FDKServerResponseError, FDKException {
        return this.getAbandonedCartDetails(id, i, b, c, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult getAbandonedCartDetails(String id, Boolean i, Boolean b, Boolean c, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
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

    public CartPlatformModels.AddCartDetailResult addItems(String cartId, Boolean b, CartPlatformModels.AddCartCreation body) throws FDKServerResponseError, FDKException {
        return this.addItems(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResult addItems(String cartId, Boolean b, CartPlatformModels.AddCartCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResult> response = null;
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

    public CartPlatformModels.UpdateCartDetailResult updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartCreation body) throws FDKServerResponseError, FDKException {
        return this.updateCart(cartId, b, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResult updateCart(String cartId, Boolean b, CartPlatformModels.UpdateCartCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResult> response = null;
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

    public Object getCouponOptionValues() throws FDKServerResponseError, FDKException {
        return this.getCouponOptionValues(new HashMap<>());
    }

    public Object getCouponOptionValues(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
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

    public CartPlatformModels.OverrideCheckoutResult overrideCart(String xOrderingSource, CartPlatformModels.OverrideCheckoutReq body) throws FDKServerResponseError, FDKException {
        return this.overrideCart(xOrderingSource, body, new HashMap<>());
    }

    public CartPlatformModels.OverrideCheckoutResult overrideCart(String xOrderingSource, CartPlatformModels.OverrideCheckoutReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.OverrideCheckoutResult> response = null;
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

    public CartPlatformModels.GetShareCartLinkResult getCartShareLink(CartPlatformModels.GetShareCartLinkCreation body) throws FDKServerResponseError, FDKException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartPlatformModels.GetShareCartLinkResult getCartShareLink(CartPlatformModels.GetShareCartLinkCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetShareCartLinkResult> response = null;
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

    public CartPlatformModels.SharedCartResult getCartSharedItems(String token) throws FDKServerResponseError, FDKException {
        return this.getCartSharedItems(token, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResult getCartSharedItems(String token, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResult> response = null;
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

    public CartPlatformModels.SharedCartResult updateCartWithSharedItems(String token, String action, String cartId) throws FDKServerResponseError, FDKException {
        return this.updateCartWithSharedItems(token, action, cartId, new HashMap<>());
    }

    public CartPlatformModels.SharedCartResult updateCartWithSharedItems(String token, String action, String cartId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SharedCartResult> response = null;
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

    public CartPlatformModels.MultiCartResult getCartList(String fromDate, String toDate, String filterOn) throws FDKServerResponseError, FDKException {
        return this.getCartList(fromDate, toDate, filterOn, new HashMap<>());
    }

    public CartPlatformModels.MultiCartResult getCartList(String fromDate, String toDate, String filterOn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.MultiCartResult> response = null;
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

    public CartPlatformModels.UserCartMappingResult updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body) throws FDKServerResponseError, FDKException {
        return this.updateCartUser(id, body, new HashMap<>());
    }

    public CartPlatformModels.UserCartMappingResult updateCartUser(String id, CartPlatformModels.UpdateUserCartMapping body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UserCartMappingResult> response = null;
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

    public CartPlatformModels.CartDetailResult getCart(String xOrderingSource, String id, String userId, String orderType, Boolean i, Boolean b, Integer assignCardId, Boolean buyNow) throws FDKServerResponseError, FDKException {
        return this.getCart(xOrderingSource, id, userId, orderType, i, b, assignCardId, buyNow, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult getCart(String xOrderingSource, String id, String userId, String orderType, Boolean i, Boolean b, Integer assignCardId, Boolean buyNow, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
            try {
            response = cartPlatformApiList.getCart(this.companyId, this.applicationId, id, userId, orderType, i, b, assignCardId, buyNow, requestHeaders).execute();
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

    public CartPlatformModels.AddCartDetailResult platformAddItems(String xOrderingSource, Boolean i, Boolean b, Boolean buyNow, String orderType, String id, CartPlatformModels.PlatformAddCartDetails body) throws FDKServerResponseError, FDKException {
        return this.platformAddItems(xOrderingSource, i, b, buyNow, orderType, id, body, new HashMap<>());
    }

    public CartPlatformModels.AddCartDetailResult platformAddItems(String xOrderingSource, Boolean i, Boolean b, Boolean buyNow, String orderType, String id, CartPlatformModels.PlatformAddCartDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.AddCartDetailResult> response = null;
            try {
            response = cartPlatformApiList.platformAddItems(this.companyId, this.applicationId, i, b, buyNow, orderType, id, body, requestHeaders).execute();
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

    public CartPlatformModels.UpdateCartDetailResult platformUpdateCart(String xOrderingSource, String id, Boolean i, String orderType, Boolean b, Boolean buyNow, CartPlatformModels.PlatformUpdateCartDetails body) throws FDKServerResponseError, FDKException {
        return this.platformUpdateCart(xOrderingSource, id, i, orderType, b, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateCartDetailResult platformUpdateCart(String xOrderingSource, String id, Boolean i, String orderType, Boolean b, Boolean buyNow, CartPlatformModels.PlatformUpdateCartDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateCartDetailResult> response = null;
            try {
            response = cartPlatformApiList.platformUpdateCart(this.companyId, this.applicationId, id, i, orderType, b, buyNow, body, requestHeaders).execute();
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

    public CartPlatformModels.DeleteCartDetailResult deleteCart(String id, CartPlatformModels.DeleteCartDetails body) throws FDKServerResponseError, FDKException {
        return this.deleteCart(id, body, new HashMap<>());
    }

    public CartPlatformModels.DeleteCartDetailResult deleteCart(String id, CartPlatformModels.DeleteCartDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteCartDetailResult> response = null;
            try {
            response = cartPlatformApiList.deleteCart(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CartPlatformModels.CartItemCountResult getItemCount(String id, Boolean buyNow) throws FDKServerResponseError, FDKException {
        return this.getItemCount(id, buyNow, new HashMap<>());
    }

    public CartPlatformModels.CartItemCountResult getItemCount(String id, Boolean buyNow, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartItemCountResult> response = null;
            try {
            response = cartPlatformApiList.getItemCount(this.companyId, this.applicationId, id, buyNow, requestHeaders).execute();
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

    public CartPlatformModels.GetCouponResult getAppCoupons(String id, Boolean buyNow, String slug, String storeId) throws FDKServerResponseError, FDKException {
        return this.getAppCoupons(id, buyNow, slug, storeId, new HashMap<>());
    }

    public CartPlatformModels.GetCouponResult getAppCoupons(String id, Boolean buyNow, String slug, String storeId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.GetCouponResult> response = null;
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

    public CartPlatformModels.CartDetailResult applyCoupon(String xOrderingSource, Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponDetails body) throws FDKServerResponseError, FDKException {
        return this.applyCoupon(xOrderingSource, i, b, p, id, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult applyCoupon(String xOrderingSource, Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartPlatformModels.ApplyCouponDetails body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
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

    public CartPlatformModels.CartDetailResult removeCoupon(String xOrderingSource, String uid, Boolean buyNow) throws FDKServerResponseError, FDKException {
        return this.removeCoupon(xOrderingSource, uid, buyNow, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult removeCoupon(String xOrderingSource, String uid, Boolean buyNow, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
            try {
            response = cartPlatformApiList.removeCoupon(this.companyId, this.applicationId, uid, buyNow, requestHeaders).execute();
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

    public CartPlatformModels.PlatformGetAddressesDetails getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws FDKServerResponseError, FDKException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartPlatformModels.PlatformGetAddressesDetails getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformGetAddressesDetails> response = null;
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

    public CartPlatformModels.SaveAddressDetails addAddress(CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.addAddress(body, new HashMap<>());
    }

    public CartPlatformModels.SaveAddressDetails addAddress(CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.SaveAddressDetails> response = null;
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

    public CartPlatformModels.UpdateAddressDetails updateAddress(String id, CartPlatformModels.PlatformAddress body) throws FDKServerResponseError, FDKException {
        return this.updateAddress(id, body, new HashMap<>());
    }

    public CartPlatformModels.UpdateAddressDetails updateAddress(String id, CartPlatformModels.PlatformAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.UpdateAddressDetails> response = null;
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

    public CartPlatformModels.DeleteAddressResult removeAddress(String id, String userId) throws FDKServerResponseError, FDKException {
        return this.removeAddress(id, userId, new HashMap<>());
    }

    public CartPlatformModels.DeleteAddressResult removeAddress(String id, String userId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.DeleteAddressResult> response = null;
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

    public CartPlatformModels.CartDetailResult selectAddress(String xOrderingSource, String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddress body) throws FDKServerResponseError, FDKException {
        return this.selectAddress(xOrderingSource, cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult selectAddress(String xOrderingSource, String cartId, Boolean buyNow, Boolean i, Boolean b, CartPlatformModels.PlatformSelectCartAddress body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
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

    public CartPlatformModels.PlatformCartShipmentsResult getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType) throws FDKServerResponseError, FDKException {
        return this.getShipments(pickAtStoreUid, orderingStoreId, i, p, id, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResult getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResult> response = null;
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

    public CartPlatformModels.PlatformCartShipmentsResult updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentCreation body) throws FDKServerResponseError, FDKException {
        return this.updateShipments(i, p, id, addressId, areaCode, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.PlatformCartShipmentsResult updateShipments(Boolean i, Boolean p, String id, String addressId, String areaCode, String orderType, CartPlatformModels.UpdateCartShipmentCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PlatformCartShipmentsResult> response = null;
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

    public CartPlatformModels.CartMetaDetails updateCartMeta(String id, Boolean buyNow, CartPlatformModels.PlatformCartMetaCreation body) throws FDKServerResponseError, FDKException {
        return this.updateCartMeta(id, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.CartMetaDetails updateCartMeta(String id, Boolean buyNow, CartPlatformModels.PlatformCartMetaCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartMetaDetails> response = null;
            try {
            response = cartPlatformApiList.updateCartMeta(this.companyId, this.applicationId, id, buyNow, body, requestHeaders).execute();
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

    public CartPlatformModels.CartCheckoutResult platformCheckoutCart(String xOrderingSource, String id, CartPlatformModels.PlatformCartCheckoutDetailCreation body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCart(xOrderingSource, id, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutResult platformCheckoutCart(String xOrderingSource, String id, CartPlatformModels.PlatformCartCheckoutDetailCreation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutResult> response = null;
            try {
            response = cartPlatformApiList.platformCheckoutCart(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CartPlatformModels.CartDeliveryModesDetails getAvailableDeliveryModes(String areaCode, String id) throws FDKServerResponseError, FDKException {
        return this.getAvailableDeliveryModes(areaCode, id, new HashMap<>());
    }

    public CartPlatformModels.CartDeliveryModesDetails getAvailableDeliveryModes(String areaCode, String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDeliveryModesDetails> response = null;
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

    public CartPlatformModels.StoreDetails getStoreAddressByUid(Integer storeUid) throws FDKServerResponseError, FDKException {
        return this.getStoreAddressByUid(storeUid, new HashMap<>());
    }

    public CartPlatformModels.StoreDetails getStoreAddressByUid(Integer storeUid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.StoreDetails> response = null;
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

    public CartPlatformModels.CartDetailResult selectPaymentMode(String xOrderingSource, String id, Boolean buyNow, String orderType, CartPlatformModels.CartPaymentUpdate body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentMode(xOrderingSource, id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult selectPaymentMode(String xOrderingSource, String id, Boolean buyNow, String orderType, CartPlatformModels.CartPaymentUpdate body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
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

    public CartPlatformModels.PaymentCouponValidate validateCouponForPayment(String xOrderingSource, String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode) throws FDKServerResponseError, FDKException {
        return this.validateCouponForPayment(xOrderingSource, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, new HashMap<>());
    }

    public CartPlatformModels.PaymentCouponValidate validateCouponForPayment(String xOrderingSource, String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.PaymentCouponValidate> response = null;
            try {
            response = cartPlatformApiList.validateCouponForPayment(this.companyId, this.applicationId, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, requestHeaders).execute();
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

    public CartPlatformModels.CartCheckoutDetails platformCheckoutCartV2(String xOrderingSource, String id, CartPlatformModels.PlatformCartCheckoutDetailV2Creation body) throws FDKServerResponseError, FDKException {
        return this.platformCheckoutCartV2(xOrderingSource, id, body, new HashMap<>());
    }

    public CartPlatformModels.CartCheckoutDetails platformCheckoutCartV2(String xOrderingSource, String id, CartPlatformModels.PlatformCartCheckoutDetailV2Creation body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartCheckoutDetails> response = null;
            try {
            response = cartPlatformApiList.platformCheckoutCartV2(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CartPlatformModels.CartDetailResult selectPaymentModeV2(String xOrderingSource, String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body) throws FDKServerResponseError, FDKException {
        return this.selectPaymentModeV2(xOrderingSource, id, buyNow, orderType, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult selectPaymentModeV2(String xOrderingSource, String id, Boolean buyNow, String orderType, CartPlatformModels.UpdateCartPaymentRequestV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
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

    public CartPlatformModels.CartDetailResult applyLoyaltyPoints(String xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, CartPlatformModels.RedeemLoyaltyPoints body) throws FDKServerResponseError, FDKException {
        return this.applyLoyaltyPoints(xOrderingSource, id, i, b, buyNow, body, new HashMap<>());
    }

    public CartPlatformModels.CartDetailResult applyLoyaltyPoints(String xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, CartPlatformModels.RedeemLoyaltyPoints body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CartPlatformModels.CartDetailResult> response = null;
            try {
            response = cartPlatformApiList.applyLoyaltyPoints(this.companyId, this.applicationId, id, i, b, buyNow, body, requestHeaders).execute();
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