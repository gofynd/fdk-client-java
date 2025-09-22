package com.sdk.platform.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartPlatformApiList {

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.CouponsResult> getCoupons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_archived") Boolean isArchived, @Query("title") String title, @Query("is_public") Boolean isPublic, @Query("is_display") Boolean isDisplay, @Query("type_slug") String typeSlug, @Query("code") String code, @Query("created_by") String createdBy, @Query("reviewed_by") String reviewedBy, @Query("approved_start_time") String approvedStartTime, @Query("approved_end_time") String approvedEndTime, @Query("review_start_time") String reviewStartTime, @Query("review_end_time") String reviewEndTime, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.CouponCreateResult> createCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.CouponAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.CouponUpdate> getCouponById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.CouponCreateResult> updateCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.CouponUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.SuccessMessage> updateCouponPartially(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.CouponPartialUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.SuccessMessage> deleteCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionsResult> getPromotions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @Query("promo_group") String promoGroup, @Query("promotion_type") String promotionType, @Query("fp_panel") String fpPanel, @Query("promotion_id") String promotionId, @Query("created_by") String createdBy, @Query("reviewed_by") String reviewedBy, @Query("approved_start_time") String approvedStartTime, @Query("approved_end_time") String approvedEndTime, @Query("review_start_time") String reviewStartTime, @Query("review_end_time") String reviewEndTime, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionAddResult> createPromotion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PromotionAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdateResult> getPromotionById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdateResult> updatePromotion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PromotionUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.SuccessMessage> updatePromotionPartially(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PromotionPartialUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.SuccessMessage> deletePromotion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    Call<CartPlatformModels.ActivePromosResult> getPromosCouponConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("entity_type") String entityType, @Query("is_hidden") Boolean isHidden, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-promotions")
    Call<CartPlatformModels.PromotionOffersDetails> getPromotionOffers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("slug") String slug, @Query("page_size") Integer pageSize, @Query("promotion_group") String promotionGroup, @Query("store_id") Integer storeId, @Query("cart_type") String cartType, @Query("promotion_type") String promotionType, @Query("cart_id") String cartId, @Query("auto_apply") Boolean autoApply, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-payment-offers")
    Call<CartPlatformModels.PromotionPaymentOffersDetails> getPromotionPaymentOffers(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("uid") Integer uid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    Call<CartPlatformModels.CartMetaConfigUpdate> updateCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_meta_id") String cartMetaId, @Body CartPlatformModels.CartMetaConfigUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigAdd> fetchCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigAdd> createCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.CartMetaConfigAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    Call<CartPlatformModels.GetPriceAdjustmentResult> updatePriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PriceAdjustmentUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    Call<CartPlatformModels.SuccessMessage> removePriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    Call<CartPlatformModels.GetPriceAdjustmentResult> addPriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PriceAdjustmentAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    Call<CartPlatformModels.GetPriceAdjustmentResult> getPriceAdjustments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    Call<CartPlatformModels.OpenapiCartDetailsResult> fetchAndvalidateCartItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenapiCartDetailsCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    Call<CartPlatformModels.OpenApiCartServiceabilityResult> checkCartServiceability(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenApiCartServiceabilityCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    Call<CartPlatformModels.OpenApiCheckoutResult> checkoutCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenApiPlatformCheckoutReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    Call<CartPlatformModels.AbandonedCartResult> getAbandonedCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("anonymous_cart") Boolean anonymousCart, @Query("last_id") String lastId, @Query("sort_on") String sortOn, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    Call<CartPlatformModels.CartDetailResult> getAbandonedCartDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.AddCartDetailResult> addItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_id") String cartId, @Query("b") Boolean b, @Body CartPlatformModels.AddCartCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.UpdateCartDetailResult> updateCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_id") String cartId, @Query("b") Boolean b, @Body CartPlatformModels.UpdateCartCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    Call<Object> getCouponOptionValues(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    Call<Object> getCouponCodeExists(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    Call<Object> getPromotionCodeExists(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    Call<CartPlatformModels.OverrideCheckoutResult> overrideCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OverrideCheckoutReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    Call<CartPlatformModels.GetShareCartLinkResult> getCartShareLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.GetShareCartLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    Call<CartPlatformModels.SharedCartResult> getCartSharedItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    Call<CartPlatformModels.SharedCartResult> updateCartWithSharedItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @Path("action") String action, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    Call<CartPlatformModels.MultiCartResult> getCartList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("filter_on") String filterOn, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    Call<CartPlatformModels.UserCartMappingResult> updateCartUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Body CartPlatformModels.UpdateUserCartMapping payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.CartDetailResult> getCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("user_id") String userId, @Query("order_type") String orderType, @Query("i") Boolean i, @Query("b") Boolean b, @Query("assign_card_id") Integer assignCardId, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.AddCartDetailResult> platformAddItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Query("id") String id, @Body CartPlatformModels.PlatformAddCartDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.UpdateCartDetailResult> platformUpdateCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("i") Boolean i, @Query("order_type") String orderType, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Body CartPlatformModels.PlatformUpdateCartDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    Call<CartPlatformModels.DeleteCartDetailResult> deleteCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Body CartPlatformModels.DeleteCartDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    Call<CartPlatformModels.CartItemCountResult> getItemCount(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.GetCouponResult> getAppCoupons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("slug") String slug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResult> applyCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartPlatformModels.ApplyCouponDetails payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResult> removeCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("uid") String uid, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.PlatformGetAddressesDetails> getAddresses(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.SaveAddressDetails> addAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PlatformAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.PlatformAddress> getAddressById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.UpdateAddressDetails> updateAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PlatformAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.DeleteAddressResult> removeAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    Call<CartPlatformModels.CartDetailResult> selectAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartPlatformModels.PlatformSelectCartAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResult> getShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("pick_at_store_uid") Integer pickAtStoreUid, @Query("ordering_store_id") Integer orderingStoreId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResult> updateShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @Body CartPlatformModels.UpdateCartShipmentCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    Call<CartPlatformModels.CartMetaDetails> updateCartMeta(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartPlatformModels.PlatformCartMetaCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutResult> platformCheckoutCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Body CartPlatformModels.PlatformCartCheckoutDetailCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    Call<CartPlatformModels.CartDeliveryModesDetails> getAvailableDeliveryModes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("area_code") String areaCode, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    Call<CartPlatformModels.StoreDetails> getStoreAddressByUid(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("store_uid") Integer storeUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResult> selectPaymentMode(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartPlatformModels.CartPaymentUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    Call<CartPlatformModels.PaymentCouponValidate> validateCouponForPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutDetails> platformCheckoutCartV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Body CartPlatformModels.PlatformCartCheckoutDetailV2Creation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResult> selectPaymentModeV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartPlatformModels.UpdateCartPaymentRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/redeem")
    Call<CartPlatformModels.CartDetailResult> applyLoyaltyPoints(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Body CartPlatformModels.RedeemLoyaltyPoints payload, @HeaderMap Map<String, String> requestHeaders);
}