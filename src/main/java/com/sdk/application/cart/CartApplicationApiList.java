package com.sdk.application.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartApplicationApiList {

    @GET 
    Call<CartApplicationModels.CartDetailResponseObject> getCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @Query("assign_card_id") Integer assignCardId, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.AddCartDetailResponseObject> addItems(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.AddCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateCartDetailResponseObject> updateCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.UpdateCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.DeleteCartDetail> deleteCart(@Url String url1, @Query("id") String id, @Query("cart_type") String cartType, @Body CartApplicationModels.DeleteCartRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCount> getItemCount(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCountResponseV2> getItemCountV2(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetCouponResponseObject> getCoupons(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("slug") String slug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponseObject> applyCoupon(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.ApplyCouponRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.CartDetailResponseObject> removeCoupon(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.BulkPriceResponseObject> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId, @Query("article_id") String articleId, @Query("uid") Integer uid, @Query("slug") String slug, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponseObject> applyRewardPoints(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.RewardPointRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetAddressesResponseObject> getAddresses(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SaveAddressResponseObject> addAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateAddress> updateAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.DeleteAddressResponseObject> removeAddress(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResponseObject> selectAddress(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartApplicationModels.SelectCartAddressRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartDetailResponseObject> selectPaymentMode(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartApplicationModels.UpdateCartPaymentRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @Query("iin") String iin, @Query("network") String network, @Query("type") String type, @Query("card_id") String cardId, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartMetaResponseObject> updateCartMeta(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartMetaRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.GetShareCartLinkResponseObject> getCartShareLink(@Url String url1, @Body CartApplicationModels.GetShareCartLinkRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.SharedCartResponseObject> getCartSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SharedCartResponseObject> updateCartWithSharedItems(@Url String url1, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionOffersResponseObject> getPromotionOffers(@Url String url1, @Query("slug") String slug, @Query("page_size") Integer pageSize, @Query("promotion_group") String promotionGroup, @Query("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug, @Query("store_id") String storeId, @Query("promotion_id") String promotionId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartShipments> getShipments(@Url String url1, @Query("pick_at_store_uid") Integer pickAtStoreUid, @Query("ordering_store_id") Integer orderingStoreId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResponseObject> checkoutCart(@Url String url1, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailRequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResponseObject> checkoutCartV2(@Url String url1, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailV2RequestObject payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionPaymentOffersResponseObject> getPaymentPromotionOffers(@Url String url1, @Query("id") String id, @Query("uid") Integer uid, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartMetaConfigListResponseObject> getCartMetaConfigs(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartConfigDetailResponseObject> getCartMetaConfig(@Url String url1, @HeaderMap Map<String, String> requestHeaders);
}