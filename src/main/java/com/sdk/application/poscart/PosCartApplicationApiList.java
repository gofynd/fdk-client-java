package com.sdk.application.poscart;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PosCartApplicationApiList {
    
    
    @GET 
    Call<PosCartApplicationModels.CartDetailResponse> getCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId , @Query("area_code") String areaCode , @Query("buy_now") Boolean buyNow );
    
    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<PosCartApplicationModels.AddCartDetailResponse> addItems(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.AddCartRequest payload );
    
    @PUT 
    Call<PosCartApplicationModels.UpdateCartDetailResponse> updateCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.UpdateCartRequest payload );
    
    @GET 
    Call<PosCartApplicationModels.CartItemCountResponse> getItemCount(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @GET 
    Call<PosCartApplicationModels.GetCouponResponse> getCoupons(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @POST 
    Call<PosCartApplicationModels.CartDetailResponse> applyCoupon(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.ApplyCouponRequest payload );
    
    @DELETE 
    Call<PosCartApplicationModels.CartDetailResponse> removeCoupon(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow );
    
    @GET 
    Call<PosCartApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST 
    Call<PosCartApplicationModels.CartDetailResponse> applyRewardPoints(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.RewardPointRequestSchema payload );
    
    @GET 
    Call<PosCartApplicationModels.GetAddressesResponse> getAddresses(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST 
    Call<PosCartApplicationModels.SaveAddressResponse> addAddress(@Url String url1 , @Body PosCartApplicationModels.Address payload );
    
    @GET 
    Call<PosCartApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT 
    Call<PosCartApplicationModels.UpdateAddressResponse> updateAddress(@Url String url1 , @Body PosCartApplicationModels.Address payload );
    
    @DELETE 
    Call<PosCartApplicationModels.DeleteAddressResponse> removeAddress(@Url String url1);
    
    @POST 
    Call<PosCartApplicationModels.CartDetailResponse> selectAddress(@Url String url1, @Query("cart_id") String cartId , @Query("buy_now") Boolean buyNow , @Query("i") Boolean i , @Query("b") Boolean b  , @Body PosCartApplicationModels.SelectCartAddressRequest payload );
    
    @PUT 
    Call<PosCartApplicationModels.CartDetailResponse> selectPaymentMode(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.UpdateCartPaymentRequest payload );
    
    @GET 
    Call<PosCartApplicationModels.PaymentCouponValidateSchema> validateCouponForPayment(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET 
    Call<PosCartApplicationModels.CartShipmentsResponse> getShipments(@Url String url1, @Query("pick_at_store_uid") Integer pickAtStoreUid , @Query("ordering_store_id") Integer orderingStoreId , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode , @Query("order_type") String orderType );
    
    @PUT 
    Call<PosCartApplicationModels.CartShipmentsResponse> updateShipments(@Url String url1, @Query("i") Boolean i , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode , @Query("order_type") String orderType  , @Body PosCartApplicationModels.UpdateCartShipmentRequest payload );
    
    @POST 
    Call<PosCartApplicationModels.CartCheckoutResponseSchema> checkoutCart(@Url String url1, @Query("id") String id  , @Body PosCartApplicationModels.CartPosCheckoutDetailRequest payload );
    
    @PUT 
    Call<PosCartApplicationModels.CartMetaResponse> updateCartMeta(@Url String url1, @Query("id") String id , @Query("buy_now") Boolean buyNow  , @Body PosCartApplicationModels.CartMetaRequest payload );
    
    @GET 
    Call<PosCartApplicationModels.CartDeliveryModesResponse> getAvailableDeliveryModes(@Url String url1, @Query("area_code") String areaCode , @Query("id") String id );
    
    @GET 
    Call<PosCartApplicationModels.StoreDetailsResponse> getStoreAddressByUid(@Url String url1, @Query("store_uid") Integer storeUid );
    
    @POST 
    Call<PosCartApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Url String url1 , @Body PosCartApplicationModels.GetShareCartLinkRequest payload );
    
    @GET 
    Call<PosCartApplicationModels.SharedCartResponse> getCartSharedItems(@Url String url1);
    
    @POST 
    Call<PosCartApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Url String url1);
}