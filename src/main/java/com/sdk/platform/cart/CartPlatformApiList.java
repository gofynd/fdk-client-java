package com.sdk.platform.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CartPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.CouponsResponse> getCoupons(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("is_archived") Boolean  isArchived ,  @Query("title") String  title ,  @Query("is_public") Boolean  isPublic ,  @Query("is_display") Boolean  isDisplay ,  @Query("type_slug") String  typeSlug ,  @Query("code") String  code );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.SuccessMessage> createCoupon(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.CouponAdd payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.CouponUpdate> getCouponById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.SuccessMessage> updateCoupon(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.CouponUpdate payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.SuccessMessage> updateCouponPartially(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.CouponPartialUpdate payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionsResponse> getPromotions(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("is_active") Boolean  isActive ,  @Query("promo_group") String  promoGroup ,  @Query("promotion_type") String  promotionType ,  @Query("fp_panel") String  fpPanel ,  @Query("promotion_id") String  promotionId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionAdd> createPromotion(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.PromotionAdd payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdate> getPromotionById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdate> updatePromotion(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.PromotionUpdate payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.SuccessMessage> updatePromotionPartially(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.PromotionPartialUpdate payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    Call<CartPlatformModels.OpenapiCartDetailsResponse> fetchAndvalidateCartItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenapiCartDetailsRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    Call<CartPlatformModels.OpenApiCartServiceabilityResponse> checkCartServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenApiCartServiceabilityRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    Call<CartPlatformModels.OpenApiCheckoutResponse> checkoutCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenApiPlatformCheckoutReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    Call<CartPlatformModels.OverrideCheckoutResponse> overrideCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OverrideCheckoutReq payload);
    
}