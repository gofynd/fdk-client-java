package com.sdk.application.cart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CartApplicationApiList {
    
    
    @GET 
    Call<CartApplicationModels.CartDetailResponse> getCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId , @Query("area_code") String areaCode , @Query("buy_now") Boolean buyNow );
    
    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<CartApplicationModels.AddCartDetailResponse> addItems(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode , @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.AddCartRequest payload );
    
    @PUT 
    Call<CartApplicationModels.UpdateCartDetailResponse> updateCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.UpdateCartRequest payload );
    
    @GET 
    Call<CartApplicationModels.CartItemCountResponse> getItemCount(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @GET 
    Call<CartApplicationModels.GetCouponResponse> getCoupons(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @POST 
    Call<CartApplicationModels.CartDetailResponse> applyCoupon(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.ApplyCouponRequest payload );
    
    @DELETE 
    Call<CartApplicationModels.CartDetailResponse> removeCoupon(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @GET 
    Call<CartApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST 
    Call<CartApplicationModels.CartDetailResponse> applyRewardPoints(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.RewardPointRequest payload );
    
    @GET 
    Call<CartApplicationModels.GetAddressesResponse> getAddresses(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST 
    Call<CartApplicationModels.SaveAddressResponse> addAddress(@Url String url1 , @Body CartApplicationModels.Address payload );
    
    @GET 
    Call<CartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT 
    Call<CartApplicationModels.UpdateAddressResponse> updateAddress(@Url String url1 , @Body CartApplicationModels.Address payload );
    
    @DELETE 
    Call<CartApplicationModels.DeleteAddressResponse> removeAddress(@Url String url1);
    
    @POST 
    Call<CartApplicationModels.CartDetailResponse> selectAddress(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("i") Boolean i , @Query("b") Boolean b  , @Body CartApplicationModels.SelectCartAddressRequest payload );
    
    @PUT 
    Call<CartApplicationModels.CartDetailResponse> selectPaymentMode(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.UpdateCartPaymentRequest payload );
    
    @GET 
    Call<CartApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET 
    Call<CartApplicationModels.CartShipmentsResponse> getShipments(@Url String url1, @Query("p") Boolean p , @Query("id") String id , @Query("buy_now") Boolean buyNow , @Query("address_id") String addressId , @Query("area_code") String areaCode );
    
    @POST 
    Call<CartApplicationModels.CartCheckoutResponse> checkoutCart(@Url String url1, @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.CartCheckoutDetailRequest payload );
    
    @PUT 
    Call<CartApplicationModels.CartMetaResponse> updateCartMeta(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body CartApplicationModels.CartMetaRequest payload );
    
    @POST 
    Call<CartApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Url String url1 , @Body CartApplicationModels.GetShareCartLinkRequest payload );
    
    @GET 
    Call<CartApplicationModels.SharedCartResponse> getCartSharedItems(@Url String url1);
    
    @POST 
    Call<CartApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Url String url1);
    
    @GET 
    Call<CartApplicationModels.PromotionOffersResponse> getPromotionOffers(@Url String url1, @Query("slug") String slug , @Query("page_size") Integer pageSize , @Query("promotion_group") String promotionGroup , @Query("store_id") Integer storeId );
    
    @GET 
    Call<CartApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug , @Query("store_id") String storeId , @Query("promotion_id") String promotionId , @Query("page_size") Integer pageSize );
}