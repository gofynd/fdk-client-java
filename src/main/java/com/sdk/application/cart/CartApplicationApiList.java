package com.sdk.application.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartApplicationApiList {

    @GET 
    Call<CartApplicationModels.CartDetailResponse> getCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @Query("assign_card_id") Integer assignCardId, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.AddCartDetailResponse> addItems(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Body CartApplicationModels.AddCartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateCartDetailResponse> updateCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.UpdateCartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.DeleteCartDetailResponse> deleteCart(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCountResponse> getItemCount(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetCouponResponse> getCoupons(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("slug") String slug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponse> applyCoupon(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.ApplyCouponRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.CartDetailResponse> removeCoupon(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId, @Query("article_id") String articleId, @Query("uid") Integer uid, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponse> applyRewardPoints(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.RewardPointRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetAddressesResponse> getAddresses(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SaveAddressResponse> addAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateAddressResponse> updateAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.DeleteAddressResponse> removeAddress(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponse> selectAddress(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartApplicationModels.SelectCartAddressRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartDetailResponse> selectPaymentMode(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.UpdateCartPaymentRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @Query("iin") String iin, @Query("network") String network, @Query("type") String type, @Query("card_id") String cardId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartShipmentsResponse> getShipments(@Url String url1, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResponse> checkoutCart(@Url String url1, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartCheckoutDetailRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartMetaResponse> updateCartMeta(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartMetaRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Url String url1, @Body CartApplicationModels.GetShareCartLinkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.SharedCartResponse> getCartSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionOffersResponse> getPromotionOffers(@Url String url1, @Query("slug") String slug, @Query("page_size") Integer pageSize, @Query("promotion_group") String promotionGroup, @Query("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug, @Query("store_id") String storeId, @Query("promotion_id") String promotionId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResponse> checkoutCartV2(@Url String url1, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartCheckoutDetailV2Request payload, @HeaderMap Map<String, String> requestHeaders);
}