package com.sdk.application.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CartApplicationApiList {

    @GET 
    Call<CartApplicationModels.CartDetailResult> getCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("c") Boolean c, @Query("assign_card_id") Integer assignCardId, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.AddCartDetailResult> addItems(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.AddCartPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateCartDetailResult> updateCart(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("area_code") String areaCode, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.UpdateCartPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.DeleteCartDetailResult> deleteCart(@Url String url1, @Query("id") String id, @Query("cart_type") String cartType, @Body CartApplicationModels.DeleteCartPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCountResult> getItemCount(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartItemCountResultV2> getItemCountV2(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetCouponResult> getCoupons(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("slug") String slug, @Query("store_id") String storeId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> applyCoupon(@Url String url1, @Query("i") Boolean i, @Query("b") Boolean b, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.ApplyCouponPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.CartDetailResult> removeCoupon(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.BulkPriceResult> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId, @Query("article_id") String articleId, @Query("uid") Integer uid, @Query("slug") String slug, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> applyRewardPoints(@Url String url1, @Query("id") String id, @Query("i") Boolean i, @Query("b") Boolean b, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.RewardPointPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.GetAddressesResult> getAddresses(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SaveAddressResult> addAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("mobile_no") String mobileNo, @Query("checkout_mode") String checkoutMode, @Query("tags") String tags, @Query("is_default") Boolean isDefault, @Query("user_id") String userId, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.UpdateAddressResult> updateAddress(@Url String url1, @Body CartApplicationModels.Address payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CartApplicationModels.DeleteAddressResult> removeAddress(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartDetailResult> selectAddress(@Url String url1, @Query("cart_id") String cartId, @Query("buy_now") Boolean buyNow, @Query("i") Boolean i, @Query("b") Boolean b, @Body CartApplicationModels.SelectCartAddressPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartDetailResult> selectPaymentMode(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("order_type") String orderType, @Body CartApplicationModels.UpdateCartPaymentPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("payment_mode") String paymentMode, @Query("payment_identifier") String paymentIdentifier, @Query("aggregator_name") String aggregatorName, @Query("merchant_code") String merchantCode, @Query("iin") String iin, @Query("network") String network, @Query("type") String type, @Query("card_id") String cardId, @Query("cart_type") String cartType, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<CartApplicationModels.CartMetaResult> updateCartMeta(@Url String url1, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Body CartApplicationModels.CartMetaPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.GetShareCartLinkResult> getCartShareLink(@Url String url1, @Body CartApplicationModels.GetShareCartLinkPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.SharedCartResult> getCartSharedItems(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.SharedCartResult> updateCartWithSharedItems(@Url String url1, @Query("cart_id") String cartId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionOffersResult> getPromotionOffers(@Url String url1, @Query("slug") String slug, @Query("page_size") Integer pageSize, @Query("promotion_group") String promotionGroup, @Query("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug, @Query("store_id") String storeId, @Query("promotion_id") String promotionId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartShipmentsResult> getShipments(@Url String url1, @Query("pick_at_store_uid") Integer pickAtStoreUid, @Query("ordering_store_id") Integer orderingStoreId, @Query("i") Boolean i, @Query("p") Boolean p, @Query("id") String id, @Query("buy_now") Boolean buyNow, @Query("address_id") String addressId, @Query("area_code") String areaCode, @Query("order_type") String orderType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResult> checkoutCart(@Url String url1, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.CartCheckoutResult> checkoutCartV2(@Url String url1, @Query("buy_now") Boolean buyNow, @Query("cart_type") String cartType, @Body CartApplicationModels.CartCheckoutDetailV2Payload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.PromotionPaymentOffersResult> getPaymentPromotionOffers(@Url String url1, @Query("id") String id, @Query("uid") Integer uid, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartMetaConfigListResult> getCartMetaConfigs(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CartApplicationModels.CartConfigDetailResult> getCartMetaConfig(@Url String url1, @Query("is_bank_offer") Boolean isBankOffer, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CartApplicationModels.AddCartDetailResultV2> addItemsv2(@Url String url1, @Query("buy_now") Boolean buyNow, @Query("id") String id, @Query("cart_type") String cartType, @Query("order_type") String orderType, @Body CartApplicationModels.AddCartPayload payload, @HeaderMap Map<String, String> requestHeaders);
}