package com.sdk.application.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartApplicationApiList {

    @GET 
    Call<CartApplicationModels.CartDetailResult> getCart(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @Query("assign_card_id") Integer assignCardId, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.AddCartDetailResult> addItems(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Query("order_type") String orderType, @Body CartApplicationModels.AddCartCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateCartDetailResult> updateCart(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.UpdateCartCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH 
    Call<CartApplicationModels.UpdateCartDetailResult> updateCartBreakup(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.UpdateCartBreakup payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.DeleteCartDetailResult> deleteCart(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCountResult> getItemCount(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetCouponResult> getCoupons(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("product_slug") String productSlug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> applyCoupon(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.ApplyCoupon payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.CartDetailResult> removeCoupon(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.BulkPriceResult> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId, @Query("article_id") String articleId, @Query("uid") Integer uid, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> applyLoyaltyPoints(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.RedeemLoyaltyPoints payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetAddressesResult> getAddresses(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SaveAddressResult> addAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateAddressResult> updateAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.DeleteAddressResult> removeAddress(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> selectAddress(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartApplicationModels.SelectCartAddressCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartDetailResult> selectPaymentMode(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.UpdateCartPaymentCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @Query("iin") String iin, @Query("network") String network, @Query("type") String type, @Query("card_id") String cardId, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartShipmentsResult> getShipments(@Url String url1, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResult> checkoutCart(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartMetaResult> updateCartMeta(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartMetaCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.GetShareCartLinkResult> getCartShareLink(@Url String url1, @Body CartApplicationModels.GetShareCartLinkCreation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.SharedCartResult> getCartSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SharedCartResult> updateCartWithSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionOffersResult> getPromotionOffers(@Url String url1, @Query("slug") String slug, @Query("page_size") Integer pageSize, @Query("promotion_group") String promotionGroup, @Query("store_id") Integer storeId, @Query("cart_type") String cartType, @Query("promotion_type") String promotionType, @Query("cart_id") String cartId, @Query("auto_apply") Boolean autoApply, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug, @Query("store_id") String storeId, @Query("promotion_id") String promotionId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionPaymentOffersResult> getPromotionPaymentOffers(@Url String url1, @Query("id") String id, @Query("uid") Integer uid, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResult> checkoutCartV2(@Url String url1, @Header("x-ordering-source") CartApplicationModels.OrderingSource xOrderingSource, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailV2Creation payload, @HeaderMap Map<String, String> requestHeaders);
}