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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promo-coupons")
    Call<CartPlatformModels.ActivePromosResponse> getPromosCouponConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("entity_type") String  entityType ,  @Query("is_hidden") Boolean  isHidden );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration/{cart_meta_id}")
    Call<CartPlatformModels.CartMetaConfigUpdate> updateCartMetaConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("cart_meta_id") String  cartMetaId ,@Body CartPlatformModels.CartMetaConfigUpdate payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigAdd> fetchCartMetaConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_configuration")
    Call<CartPlatformModels.CartMetaConfigAdd> createCartMetaConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.CartMetaConfigAdd payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount/{id}")
    Call<CartPlatformModels.CartDynamicInjectionResponse> updateCartDynamicInjection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.CartDynamicInjectionUpdate payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount/{id}")
    Call<CartPlatformModels.SuccessMessage> removeCartDynamicInjection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/additional-charge-discount")
    Call<CartPlatformModels.CartDynamicInjectionResponse> createCartDynamicInjection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.CartDynamicInjectionAdd payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    Call<CartPlatformModels.OpenapiCartDetailsResponse> fetchAndvalidateCartItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenapiCartDetailsRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    Call<CartPlatformModels.OpenApiCartServiceabilityResponse> checkCartServiceability(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenApiCartServiceabilityRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    Call<CartPlatformModels.OpenApiCheckoutResponse> checkoutCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OpenApiPlatformCheckoutReq payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts")
    Call<CartPlatformModels.AbandonedCartResponse> getAbandonedCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("user_id") String  userId ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("anonymous_cart") Boolean  anonymousCart ,  @Query("last_id") String  lastId ,  @Query("sort_on") String  sortOn );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/cart/detail")
    Call<CartPlatformModels.CartDetailResponse> getAbandonedCartDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("user_id") String  userId ,  @Query("id") String  id ,  @Query("i") Boolean  i ,  @Query("b") Boolean  b );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.AddCartDetailResponse> addItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("cart_id") String  cartId , @Query("b") Boolean  b ,  @Query("user_id") String  userId ,@Body CartPlatformModels.AddCartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/abandoned/carts/{cart_id}")
    Call<CartPlatformModels.UpdateCartDetailResponse> updateCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("cart_id") String  cartId , @Query("b") Boolean  b ,  @Query("user_id") String  userId ,@Body CartPlatformModels.UpdateCartRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_options")
    Call<Object> getCouponOptionValues(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon_code_exists")
    Call<Object> getCouponCodeExists(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("code") String  code );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/promotion_code_exists")
    Call<Object> getPromotionCodeExists(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("code") String  code );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout/over-ride")
    Call<CartPlatformModels.OverrideCheckoutResponse> overrideCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.OverrideCheckoutReq payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart")
    Call<CartPlatformModels.GetShareCartLinkResponse> getCartShareLink(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.GetShareCartLinkRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}")
    Call<CartPlatformModels.SharedCartResponse> getCartSharedItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("token") String  token );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/share-cart/{token}/{action}")
    Call<CartPlatformModels.SharedCartResponse> updateCartWithSharedItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("token") String  token , @Path("action") String  action , @Query("cart_id") String  cartId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart-list")
    Call<CartPlatformModels.MultiCartResponse> getCartList(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("filter_on") String  filterOn );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/update-user")
    Call<CartPlatformModels.UserCartMappingResponse> updateCartUser(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,@Body CartPlatformModels.UpdateUserCartMapping payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.CartDetailResponse> getCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("user_id") String  userId ,  @Query("i") Boolean  i ,  @Query("b") Boolean  b ,  @Query("assign_card_id") Integer  assignCardId ,  @Query("buy_now") Boolean  buyNow );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.AddCartDetailResponse> platformAddItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("i") Boolean  i ,  @Query("b") Boolean  b ,  @Query("buy_now") Boolean  buyNow ,  @Query("id") String  id ,@Body CartPlatformModels.PlatformAddCartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<CartPlatformModels.UpdateCartDetailResponse> platformUpdateCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("i") Boolean  i ,  @Query("b") Boolean  b ,  @Query("buy_now") Boolean  buyNow ,@Body CartPlatformModels.PlatformUpdateCartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart_archive")
    Call<CartPlatformModels.DeleteCartDetailResponse> deleteCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,@Body CartPlatformModels.DeleteCartRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/basic")
    Call<CartPlatformModels.CartItemCountResponse> getItemCount(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.GetCouponResponse> getAppCoupons(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResponse> applyCoupon(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("i") Boolean  i ,  @Query("b") Boolean  b ,  @Query("p") Boolean  p ,  @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow ,@Body CartPlatformModels.ApplyCouponRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/platform-pos-coupon")
    Call<CartPlatformModels.CartDetailResponse> removeCoupon(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("uid") String  uid ,  @Query("buy_now") Boolean  buyNow );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.PlatformGetAddressesResponse> getAddresses(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("cart_id") String  cartId ,  @Query("buy_now") Boolean  buyNow ,  @Query("mobile_no") String  mobileNo ,  @Query("checkout_mode") String  checkoutMode ,  @Query("tags") String  tags ,  @Query("is_default") Boolean  isDefault ,  @Query("user_id") String  userId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address")
    Call<CartPlatformModels.SaveAddressResponse> addAddress(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CartPlatformModels.PlatformAddress payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.PlatformAddress> getAddressById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id , @Query("cart_id") String  cartId ,  @Query("buy_now") Boolean  buyNow ,  @Query("mobile_no") String  mobileNo ,  @Query("checkout_mode") String  checkoutMode ,  @Query("tags") String  tags ,  @Query("is_default") Boolean  isDefault ,  @Query("user_id") String  userId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.UpdateAddressResponse> updateAddress(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CartPlatformModels.PlatformAddress payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/address/{id}")
    Call<CartPlatformModels.DeleteAddressResponse> removeAddress(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id , @Query("user_id") String  userId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/select-address")
    Call<CartPlatformModels.CartDetailResponse> selectAddress(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("cart_id") String  cartId ,  @Query("buy_now") Boolean  buyNow ,  @Query("i") Boolean  i ,  @Query("b") Boolean  b ,@Body CartPlatformModels.PlatformSelectCartAddressRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResponse> getShipments(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("pick_at_store_uid") Integer  pickAtStoreUid ,  @Query("ordering_store_id") Integer  orderingStoreId ,  @Query("i") Boolean  i ,  @Query("p") Boolean  p ,  @Query("id") String  id ,  @Query("address_id") String  addressId ,  @Query("area_code") String  areaCode ,  @Query("order_type") String  orderType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/shipment")
    Call<CartPlatformModels.PlatformCartShipmentsResponse> updateShipments(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("i") Boolean  i ,  @Query("p") Boolean  p ,  @Query("id") String  id ,  @Query("address_id") String  addressId ,  @Query("area_code") String  areaCode ,  @Query("order_type") String  orderType ,@Body CartPlatformModels.UpdateCartShipmentRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/meta")
    Call<CartPlatformModels.CartMetaResponse> updateCartMeta(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow ,@Body CartPlatformModels.PlatformCartMetaRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutResponse> platformCheckoutCart(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,@Body CartPlatformModels.PlatformCartCheckoutDetailRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/available-delivery-mode")
    Call<CartPlatformModels.CartDeliveryModesResponse> getAvailableDeliveryModes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("area_code") String  areaCode ,  @Query("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/store-address")
    Call<CartPlatformModels.StoreDetailsResponse> getStoreAddressByUid(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("store_uid") Integer  storeUid );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResponse> selectPaymentMode(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow ,@Body CartPlatformModels.UpdateCartPaymentRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/payment/validate/")
    Call<CartPlatformModels.PaymentCouponValidate> validateCouponForPayment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow ,  @Query("address_id") String  addressId ,  @Query("payment_mode") String  paymentMode ,  @Query("payment_identifier") String  paymentIdentifier ,  @Query("aggregator_name") String  aggregatorName ,  @Query("merchant_code") String  merchantCode );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/checkout")
    Call<CartPlatformModels.CartCheckoutResponse> platformCheckoutCartV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,@Body CartPlatformModels.PlatformCartCheckoutDetailV2Request payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/cart/v2.0/company/{company_id}/application/{application_id}/payment")
    Call<CartPlatformModels.CartDetailResponse> selectPaymentModeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("buy_now") Boolean  buyNow ,@Body CartPlatformModels.UpdateCartPaymentRequestV2 payload);
    
}