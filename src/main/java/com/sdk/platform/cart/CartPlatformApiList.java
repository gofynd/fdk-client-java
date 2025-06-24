package com.sdk.platform.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartPlatformApiList {

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.CouponDetailResponseObject> createCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.CouponAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<CartPlatformModels.CouponsResponseObject> getCoupons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("is_archived") Boolean isArchived, @Query("title") String title, @Query("is_public") Boolean isPublic, @Query("is_display") Boolean isDisplay, @Query("type_slug") String typeSlug, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon-tags")
    Call<CartPlatformModels.TagsViewResponseObject> getCouponTags(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-tags")
    Call<CartPlatformModels.TagsViewResponseObject> getPromotionTags(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.CouponUpdate> getCouponById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.CouponDetailResponseObject> updateCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.CouponUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<CartPlatformModels.SuccessMessage> updateCouponPartially(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.CouponPartialUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionsResponseObject> getPromotions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @Query("promo_group") String promoGroup, @Query("promotion_type") String promotionType, @Query("fp_panel") String fpPanel, @Query("promotion_id") String promotionId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion")
    Call<CartPlatformModels.PromotionAddResult> createPromotion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PromotionAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdateResult> getPromotionById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.PromotionUpdateResult> updatePromotion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PromotionUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion/{id}")
    Call<CartPlatformModels.SuccessMessage> updatePromotionPartially(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PromotionPartialUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    Call<CartPlatformModels.ActivePromosResponseObject> getPromosCouponConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("entity_type") String entityType, @Query("is_hidden") Boolean isHidden, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    Call<CartPlatformModels.CartMetaConfigDetailObject> getCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_meta_id") String cartMetaId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    Call<CartPlatformModels.CartMetaConfigUpdate> updateCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_meta_id") String cartMetaId, @Body CartPlatformModels.CartMetaConfigUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    Call<CartPlatformModels.SuccessMessage> deleteCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_meta_id") String cartMetaId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigListResponseObject> getCartMetaConfigs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigAddResponseObject> createCartMetaConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.CartMetaConfigAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    Call<CartPlatformModels.AddPriceAdjustmentResponseObject> addPriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PriceAdjustmentAdd payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment")
    Call<CartPlatformModels.PriceAdjustmentResponsObject> getPriceAdjustments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    Call<CartPlatformModels.UpdatePriceAdjustmentResponseObject> updatePriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PriceAdjustmentUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/price-adjustment/{id}")
    Call<CartPlatformModels.SuccessMessage> removePriceAdjustment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    Call<CartPlatformModels.OpenapiCartDetailsResponseObject> fetchAndvalidateCartItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenapiCartDetailsRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    Call<CartPlatformModels.OpenApiCartServiceabilityResponseObject> checkCartServiceability(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenApiCartServiceabilityRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    Call<CartPlatformModels.OpenApiCheckoutResponseObject> checkoutCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OpenApiPlatformCheckoutReq payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    Call<CartPlatformModels.AbandonedCartResponseObject> getAbandonedCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("anonymous_cart") Boolean anonymousCart, @Query("last_id") String lastId, @Query("sort_on") String sortOn, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    Call<CartPlatformModels.CartDetailResponseObject> getAbandonedCartDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.AddCartDetailResponseObject> addItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_id") String cartId, @Query("b") Boolean b, @Body CartPlatformModels.AddCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.UpdateCartDetailResponseObject> updateCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("cart_id") String cartId, @Query("b") Boolean b, @Body CartPlatformModels.UpdateCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    Call<CartPlatformModels.CouponOptions> getCouponOptionValues(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    Call<Object> getCouponCodeExists(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    Call<Object> getPromotionCodeExists(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("code") String code, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    Call<CartPlatformModels.OverrideCheckoutResponseObject> overrideCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.OverrideCheckoutReq payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    Call<CartPlatformModels.GetShareCartLinkResponseObject> getCartShareLink(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.GetShareCartLinkRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    Call<CartPlatformModels.SharedCartResponseObject> getCartSharedItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    Call<CartPlatformModels.SharedCartResponseObject> updateCartWithSharedItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @Path("action") String action, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    Call<CartPlatformModels.MultiCartResponseObject> getCartList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("filter_on") String filterOn, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    Call<CartPlatformModels.UserCartMappingResponseObject> updateCartUser(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Body CartPlatformModels.UpdateUserCartMapping payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    Call<CartPlatformModels.CartItemCountResponseObject> getItemCount(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.AddCartDetailResponseObject> platformAddItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Query("cart_type") String cartType, @Body CartPlatformModels.PlatformAddCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.CartDetailResponseObject> getCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("user_id") String userId, @Query("i") Boolean i, @Query("b") Boolean b, @Query("assign_card_id") Double assignCardId, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.UpdateCartDetailResponseObject> platformUpdateCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("i") Boolean i, @Query("order_type") String orderType, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartPlatformModels.PlatformUpdateCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    Call<CartPlatformModels.DeleteCartDetailResponseObject> deleteCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("cart_type") String cartType, @Body CartPlatformModels.DeleteCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.GetCouponResponseObject> getAppCoupons(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("slug") String slug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResponseObject> applyCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartPlatformModels.ApplyCouponRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResponseObject> removeCoupon(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("uid") String uid, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.SaveAddressResponseObject> addAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CartPlatformModels.PlatformAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.PlatformGetAddressesResponseObject> getAddresses(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.PlatformAddress> getAddressById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.UpdateAddressResponseObject> updateAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CartPlatformModels.PlatformAddress payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.DeleteAddressResponseObject> removeAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    Call<CartPlatformModels.CartDetailResponseObject> selectAddress(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartPlatformModels.PlatformSelectCartAddressRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResponseObject> getShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("pick_at_store_uid") Integer pickAtStoreUid, @Query("ordering_store_id") Integer orderingStoreId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResponseObject> updateShipments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @Body CartPlatformModels.UpdateCartShipmentRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    Call<CartPlatformModels.CartMetaResponseObject> updateCartMeta(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("user_id") String userId, @Body CartPlatformModels.PlatformCartMetaRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutResponseObject> platformCheckoutCart(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("cart_type") String cartType, @Body CartPlatformModels.PlatformCartCheckoutDetailRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    Call<CartPlatformModels.CartDeliveryModesResponseObject> getAvailableDeliveryModes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("area_code") String areaCode, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    Call<CartPlatformModels.StoreDetailsResponseObject> getStoreAddressByUid(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("store_uid") Integer storeUid, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResponseObject> selectPaymentMode(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartPlatformModels.UpdateCartPaymentRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    Call<CartPlatformModels.PaymentCouponValidate> validateCouponForPayment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @Query("iin") String iin, @Query("network") String network, @Query("type") String type, @Query("card_id") String cardId, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutResponseObject> platformCheckoutCartV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("cart_type") String cartType, @Body CartPlatformModels.PlatformCartCheckoutDetailV2RequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResponseObject> selectPaymentModeV2(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartPlatformModels.UpdateCartPaymentRequestV2 payload, @HeaderMap Map<String, String> requestHeaders);
}