package com.sdk.application.cart;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class CartApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CartApplicationApiList cartApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public CartApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.cartApplicationApiList = generateCartApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getCart","/service/application/cart/v1.0/detail".substring(1));
        relativeUrls.put("getCartLastModified","/service/application/cart/v1.0/detail".substring(1));
        relativeUrls.put("addItems","/service/application/cart/v1.0/detail".substring(1));
        relativeUrls.put("updateCart","/service/application/cart/v1.0/detail".substring(1));
        relativeUrls.put("deleteCart","/service/application/cart/v1.0/cart_archive".substring(1));
        relativeUrls.put("getItemCount","/service/application/cart/v1.0/basic".substring(1));
        relativeUrls.put("getCoupons","/service/application/cart/v1.0/coupon".substring(1));
        relativeUrls.put("applyCoupon","/service/application/cart/v1.0/coupon".substring(1));
        relativeUrls.put("removeCoupon","/service/application/cart/v1.0/coupon".substring(1));
        relativeUrls.put("getBulkDiscountOffers","/service/application/cart/v1.0/bulk-price".substring(1));
        relativeUrls.put("applyRewardPoints","/service/application/cart/v1.0/redeem/points/".substring(1));
        relativeUrls.put("getAddresses","/service/application/cart/v1.0/address".substring(1));
        relativeUrls.put("addAddress","/service/application/cart/v1.0/address".substring(1));
        relativeUrls.put("getAddressById","/service/application/cart/v1.0/address/{id}".substring(1));
        relativeUrls.put("updateAddress","/service/application/cart/v1.0/address/{id}".substring(1));
        relativeUrls.put("removeAddress","/service/application/cart/v1.0/address/{id}".substring(1));
        relativeUrls.put("selectAddress","/service/application/cart/v1.0/select-address".substring(1));
        relativeUrls.put("selectPaymentMode","/service/application/cart/v1.0/payment".substring(1));
        relativeUrls.put("validateCouponForPayment","/service/application/cart/v1.0/payment/validate/".substring(1));
        relativeUrls.put("getShipments","/service/application/cart/v1.0/shipment".substring(1));
        relativeUrls.put("checkoutCart","/service/application/cart/v1.0/checkout".substring(1));
        relativeUrls.put("updateCartMeta","/service/application/cart/v1.0/meta".substring(1));
        relativeUrls.put("getCartShareLink","/service/application/cart/v1.0/share-cart".substring(1));
        relativeUrls.put("getCartSharedItems","/service/application/cart/v1.0/share-cart/{token}".substring(1));
        relativeUrls.put("updateCartWithSharedItems","/service/application/cart/v1.0/share-cart/{token}/{action}".substring(1));
        relativeUrls.put("getPromotionOffers","/service/application/cart/v1.0/available-promotions".substring(1));
        relativeUrls.put("getLadderOffers","/service/application/cart/v1.0/available-ladder-prices".substring(1));
        relativeUrls.put("checkoutCartV2","/service/application/cart/v2.0/checkout".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private CartApplicationApiList generateCartApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CartApplicationApiList.class, interceptorList, cookieStore);
    }

    public CartApplicationModels.CartDetailResponse getCart(String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow) throws IOException {
        return this.getCart(id, i, b, c, assignCardId, areaCode, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse getCart(String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCart");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.getCart(fullUrl, id, i, b, c, assignCardId, areaCode, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public Object getCartLastModified(String id) throws IOException {
        return this.getCartLastModified(id, new HashMap<>());
    }

    public Object getCartLastModified(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartLastModified");

        Response<Object> response = cartApplicationApiList.getCartLastModified(fullUrl, id, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.AddCartDetailResponse addItems(Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, CartApplicationModels.AddCartRequest body) throws IOException {
        return this.addItems(i, b, areaCode, buyNow, id, body, new HashMap<>());
    }

    public CartApplicationModels.AddCartDetailResponse addItems(Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, CartApplicationModels.AddCartRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addItems");

        Response<CartApplicationModels.AddCartDetailResponse> response = cartApplicationApiList.addItems(fullUrl, i, b, areaCode, buyNow, id, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.UpdateCartDetailResponse updateCart(String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, CartApplicationModels.UpdateCartRequest body) throws IOException {
        return this.updateCart(id, i, b, areaCode, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateCartDetailResponse updateCart(String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, CartApplicationModels.UpdateCartRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCart");

        Response<CartApplicationModels.UpdateCartDetailResponse> response = cartApplicationApiList.updateCart(fullUrl, id, i, b, areaCode, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.DeleteCartDetailResponse deleteCart(String id) throws IOException {
        return this.deleteCart(id, new HashMap<>());
    }

    public CartApplicationModels.DeleteCartDetailResponse deleteCart(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteCart");

        Response<CartApplicationModels.DeleteCartDetailResponse> response = cartApplicationApiList.deleteCart(fullUrl, id, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartItemCountResponse getItemCount(String id, Boolean buyNow) throws IOException {
        return this.getItemCount(id, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartItemCountResponse getItemCount(String id, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getItemCount");

        Response<CartApplicationModels.CartItemCountResponse> response = cartApplicationApiList.getItemCount(fullUrl, id, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetCouponResponse getCoupons(String id, Boolean buyNow, String slug, String storeId) throws IOException {
        return this.getCoupons(id, buyNow, slug, storeId, new HashMap<>());
    }

    public CartApplicationModels.GetCouponResponse getCoupons(String id, Boolean buyNow, String slug, String storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCoupons");

        Response<CartApplicationModels.GetCouponResponse> response = cartApplicationApiList.getCoupons(fullUrl, id, buyNow, slug, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResponse applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartApplicationModels.ApplyCouponRequest body) throws IOException {
        return this.applyCoupon(i, b, p, id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, CartApplicationModels.ApplyCouponRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyCoupon");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.applyCoupon(fullUrl, i, b, p, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResponse removeCoupon(String id, Boolean buyNow) throws IOException {
        return this.removeCoupon(id, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse removeCoupon(String id, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeCoupon");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.removeCoupon(fullUrl, id, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug) throws IOException {
        return this.getBulkDiscountOffers(itemId, articleId, uid, slug, new HashMap<>());
    }

    public CartApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBulkDiscountOffers");

        Response<CartApplicationModels.BulkPriceResponse> response = cartApplicationApiList.getBulkDiscountOffers(fullUrl, itemId, articleId, uid, slug, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResponse applyRewardPoints(String id, Boolean i, Boolean b, Boolean buyNow, CartApplicationModels.RewardPointRequest body) throws IOException {
        return this.applyRewardPoints(id, i, b, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse applyRewardPoints(String id, Boolean i, Boolean b, Boolean buyNow, CartApplicationModels.RewardPointRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyRewardPoints");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.applyRewardPoints(fullUrl, id, i, b, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetAddressesResponse getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault) throws IOException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, new HashMap<>());
    }

    public CartApplicationModels.GetAddressesResponse getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAddresses");

        Response<CartApplicationModels.GetAddressesResponse> response = cartApplicationApiList.getAddresses(fullUrl, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SaveAddressResponse addAddress(CartApplicationModels.Address body) throws IOException {
        return this.addAddress(body, new HashMap<>());
    }

    public CartApplicationModels.SaveAddressResponse addAddress(CartApplicationModels.Address body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addAddress");

        Response<CartApplicationModels.SaveAddressResponse> response = cartApplicationApiList.addAddress(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.Address getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault) throws IOException {
        return this.getAddressById(id, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, new HashMap<>());
    }

    public CartApplicationModels.Address getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAddressById");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.Address> response = cartApplicationApiList.getAddressById(fullUrl, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.UpdateAddressResponse updateAddress(String id, CartApplicationModels.Address body) throws IOException {
        return this.updateAddress(id, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateAddressResponse updateAddress(String id, CartApplicationModels.Address body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateAddress");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.UpdateAddressResponse> response = cartApplicationApiList.updateAddress(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.DeleteAddressResponse removeAddress(String id) throws IOException {
        return this.removeAddress(id, new HashMap<>());
    }

    public CartApplicationModels.DeleteAddressResponse removeAddress(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeAddress");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.DeleteAddressResponse> response = cartApplicationApiList.removeAddress(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResponse selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressRequest body) throws IOException {
        return this.selectAddress(cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectAddress");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.selectAddress(fullUrl, cartId, buyNow, i, b, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResponse selectPaymentMode(String id, Boolean buyNow, CartApplicationModels.UpdateCartPaymentRequest body) throws IOException {
        return this.selectPaymentMode(id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResponse selectPaymentMode(String id, Boolean buyNow, CartApplicationModels.UpdateCartPaymentRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectPaymentMode");

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.selectPaymentMode(fullUrl, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId) throws IOException {
        return this.validateCouponForPayment(id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, new HashMap<>());
    }

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateCouponForPayment");

        Response<CartApplicationModels.PaymentCouponValidate> response = cartApplicationApiList.validateCouponForPayment(fullUrl, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartShipmentsResponse getShipments(Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType) throws IOException {
        return this.getShipments(p, id, buyNow, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartApplicationModels.CartShipmentsResponse getShipments(Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getShipments");

        Response<CartApplicationModels.CartShipmentsResponse> response = cartApplicationApiList.getShipments(fullUrl, p, id, buyNow, addressId, areaCode, orderType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResponse checkoutCart(Boolean buyNow, CartApplicationModels.CartCheckoutDetailRequest body) throws IOException {
        return this.checkoutCart(buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResponse checkoutCart(Boolean buyNow, CartApplicationModels.CartCheckoutDetailRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCart");

        Response<CartApplicationModels.CartCheckoutResponse> response = cartApplicationApiList.checkoutCart(fullUrl, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartMetaResponse updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaRequest body) throws IOException {
        return this.updateCartMeta(id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartMetaResponse updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartMeta");

        Response<CartApplicationModels.CartMetaResponse> response = cartApplicationApiList.updateCartMeta(fullUrl, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetShareCartLinkResponse getCartShareLink(CartApplicationModels.GetShareCartLinkRequest body) throws IOException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartApplicationModels.GetShareCartLinkResponse getCartShareLink(CartApplicationModels.GetShareCartLinkRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartShareLink");

        Response<CartApplicationModels.GetShareCartLinkResponse> response = cartApplicationApiList.getCartShareLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SharedCartResponse getCartSharedItems(String token) throws IOException {
        return this.getCartSharedItems(token, new HashMap<>());
    }

    public CartApplicationModels.SharedCartResponse getCartSharedItems(String token, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartSharedItems");
        fullUrl = fullUrl.replace("{" + "token" + "}",token.toString());

        Response<CartApplicationModels.SharedCartResponse> response = cartApplicationApiList.getCartSharedItems(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SharedCartResponse updateCartWithSharedItems(String token, String action) throws IOException {
        return this.updateCartWithSharedItems(token, action, new HashMap<>());
    }

    public CartApplicationModels.SharedCartResponse updateCartWithSharedItems(String token, String action, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        fullUrl = fullUrl.replace("{" + "token" + "}",token.toString());
        fullUrl = fullUrl.replace("{" + "action" + "}",action.toString());

        Response<CartApplicationModels.SharedCartResponse> response = cartApplicationApiList.updateCartWithSharedItems(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PromotionOffersResponse getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId) throws IOException {
        return this.getPromotionOffers(slug, pageSize, promotionGroup, storeId, new HashMap<>());
    }

    public CartApplicationModels.PromotionOffersResponse getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPromotionOffers");

        Response<CartApplicationModels.PromotionOffersResponse> response = cartApplicationApiList.getPromotionOffers(fullUrl, slug, pageSize, promotionGroup, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.LadderPriceOffers getLadderOffers(String slug, String storeId, String promotionId, Integer pageSize) throws IOException {
        return this.getLadderOffers(slug, storeId, promotionId, pageSize, new HashMap<>());
    }

    public CartApplicationModels.LadderPriceOffers getLadderOffers(String slug, String storeId, String promotionId, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLadderOffers");

        Response<CartApplicationModels.LadderPriceOffers> response = cartApplicationApiList.getLadderOffers(fullUrl, slug, storeId, promotionId, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResponse checkoutCartV2(Boolean buyNow, CartApplicationModels.CartCheckoutDetailV2Request body) throws IOException {
        return this.checkoutCartV2(buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResponse checkoutCartV2(Boolean buyNow, CartApplicationModels.CartCheckoutDetailV2Request body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCartV2");

        Response<CartApplicationModels.CartCheckoutResponse> response = cartApplicationApiList.checkoutCartV2(fullUrl, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}