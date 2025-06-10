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
        relativeUrls.put("updateCartBreakup","/service/application/cart/v1.0/detail".substring(1));
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
        relativeUrls.put("getPromotionPaymentOffers","/service/application/cart/v1.0/available-payment-offers".substring(1));
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

    public CartApplicationModels.CartDetailResult getCart(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow, String orderType) throws IOException {
        return this.getCart(xOrderingSource, id, i, b, c, assignCardId, areaCode, buyNow, orderType, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult getCart(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow, String orderType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCart");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.getCart(fullUrl, xOrderingSource, id, i, b, c, assignCardId, areaCode, buyNow, orderType, requestHeaders).execute();
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
    

    public CartApplicationModels.AddCartDetailResult addItems(CartApplicationModels.OrderingSource xOrderingSource, Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, String orderType, CartApplicationModels.AddCartCreation body) throws IOException {
        return this.addItems(xOrderingSource, i, b, areaCode, buyNow, id, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.AddCartDetailResult addItems(CartApplicationModels.OrderingSource xOrderingSource, Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, String orderType, CartApplicationModels.AddCartCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addItems");

        Response<CartApplicationModels.AddCartDetailResult> response = cartApplicationApiList.addItems(fullUrl, xOrderingSource, i, b, areaCode, buyNow, id, orderType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.UpdateCartDetailResult updateCart(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, String cartType, String orderType, CartApplicationModels.UpdateCartCreation body) throws IOException {
        return this.updateCart(xOrderingSource, id, i, b, areaCode, buyNow, cartType, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateCartDetailResult updateCart(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, String cartType, String orderType, CartApplicationModels.UpdateCartCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCart");

        Response<CartApplicationModels.UpdateCartDetailResult> response = cartApplicationApiList.updateCart(fullUrl, xOrderingSource, id, i, b, areaCode, buyNow, cartType, orderType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.UpdateCartDetailResult updateCartBreakup(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, String cartType, CartApplicationModels.UpdateCartBreakup body) throws IOException {
        return this.updateCartBreakup(xOrderingSource, id, i, b, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateCartDetailResult updateCartBreakup(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, String cartType, CartApplicationModels.UpdateCartBreakup body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartBreakup");

        Response<CartApplicationModels.UpdateCartDetailResult> response = cartApplicationApiList.updateCartBreakup(fullUrl, xOrderingSource, id, i, b, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.DeleteCartDetailResult deleteCart(String id) throws IOException {
        return this.deleteCart(id, new HashMap<>());
    }

    public CartApplicationModels.DeleteCartDetailResult deleteCart(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteCart");

        Response<CartApplicationModels.DeleteCartDetailResult> response = cartApplicationApiList.deleteCart(fullUrl, id, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartItemCountResult getItemCount(String id, Boolean buyNow) throws IOException {
        return this.getItemCount(id, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartItemCountResult getItemCount(String id, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getItemCount");

        Response<CartApplicationModels.CartItemCountResult> response = cartApplicationApiList.getItemCount(fullUrl, id, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetCouponResult getCoupons(String id, Boolean buyNow, String productSlug, String storeId) throws IOException {
        return this.getCoupons(id, buyNow, productSlug, storeId, new HashMap<>());
    }

    public CartApplicationModels.GetCouponResult getCoupons(String id, Boolean buyNow, String productSlug, String storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCoupons");

        Response<CartApplicationModels.GetCouponResult> response = cartApplicationApiList.getCoupons(fullUrl, id, buyNow, productSlug, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult applyCoupon(CartApplicationModels.OrderingSource xOrderingSource, Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, String cartType, CartApplicationModels.ApplyCoupon body) throws IOException {
        return this.applyCoupon(xOrderingSource, i, b, p, id, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult applyCoupon(CartApplicationModels.OrderingSource xOrderingSource, Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, String cartType, CartApplicationModels.ApplyCoupon body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyCoupon");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.applyCoupon(fullUrl, xOrderingSource, i, b, p, id, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult removeCoupon(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow) throws IOException {
        return this.removeCoupon(xOrderingSource, id, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult removeCoupon(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeCoupon");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.removeCoupon(fullUrl, xOrderingSource, id, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.BulkPriceResult getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug) throws IOException {
        return this.getBulkDiscountOffers(itemId, articleId, uid, slug, new HashMap<>());
    }

    public CartApplicationModels.BulkPriceResult getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBulkDiscountOffers");

        Response<CartApplicationModels.BulkPriceResult> response = cartApplicationApiList.getBulkDiscountOffers(fullUrl, itemId, articleId, uid, slug, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult applyRewardPoints(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, CartApplicationModels.RewardPointCreation body) throws IOException {
        return this.applyRewardPoints(xOrderingSource, id, i, b, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult applyRewardPoints(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean i, Boolean b, Boolean buyNow, CartApplicationModels.RewardPointCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyRewardPoints");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.applyRewardPoints(fullUrl, xOrderingSource, id, i, b, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetAddressesResult getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault) throws IOException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, new HashMap<>());
    }

    public CartApplicationModels.GetAddressesResult getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAddresses");

        Response<CartApplicationModels.GetAddressesResult> response = cartApplicationApiList.getAddresses(fullUrl, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SaveAddressResult addAddress(CartApplicationModels.Address body) throws IOException {
        return this.addAddress(body, new HashMap<>());
    }

    public CartApplicationModels.SaveAddressResult addAddress(CartApplicationModels.Address body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addAddress");

        Response<CartApplicationModels.SaveAddressResult> response = cartApplicationApiList.addAddress(fullUrl, body, requestHeaders).execute();
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
    

    public CartApplicationModels.UpdateAddressResult updateAddress(String id, CartApplicationModels.Address body) throws IOException {
        return this.updateAddress(id, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateAddressResult updateAddress(String id, CartApplicationModels.Address body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateAddress");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.UpdateAddressResult> response = cartApplicationApiList.updateAddress(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.DeleteAddressResult removeAddress(String id) throws IOException {
        return this.removeAddress(id, new HashMap<>());
    }

    public CartApplicationModels.DeleteAddressResult removeAddress(String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeAddress");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.DeleteAddressResult> response = cartApplicationApiList.removeAddress(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult selectAddress(CartApplicationModels.OrderingSource xOrderingSource, String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressCreation body) throws IOException {
        return this.selectAddress(xOrderingSource, cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult selectAddress(CartApplicationModels.OrderingSource xOrderingSource, String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectAddress");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.selectAddress(fullUrl, xOrderingSource, cartId, buyNow, i, b, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult selectPaymentMode(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow, CartApplicationModels.UpdateCartPaymentCreation body) throws IOException {
        return this.selectPaymentMode(xOrderingSource, id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult selectPaymentMode(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow, CartApplicationModels.UpdateCartPaymentCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectPaymentMode");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.selectPaymentMode(fullUrl, xOrderingSource, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType) throws IOException {
        return this.validateCouponForPayment(xOrderingSource, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, new HashMap<>());
    }

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(CartApplicationModels.OrderingSource xOrderingSource, String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateCouponForPayment");

        Response<CartApplicationModels.PaymentCouponValidate> response = cartApplicationApiList.validateCouponForPayment(fullUrl, xOrderingSource, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartShipmentsResult getShipments(Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType) throws IOException {
        return this.getShipments(p, id, buyNow, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartApplicationModels.CartShipmentsResult getShipments(Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getShipments");

        Response<CartApplicationModels.CartShipmentsResult> response = cartApplicationApiList.getShipments(fullUrl, p, id, buyNow, addressId, areaCode, orderType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResult checkoutCart(CartApplicationModels.OrderingSource xOrderingSource, Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailCreation body) throws IOException {
        return this.checkoutCart(xOrderingSource, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResult checkoutCart(CartApplicationModels.OrderingSource xOrderingSource, Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCart");

        Response<CartApplicationModels.CartCheckoutResult> response = cartApplicationApiList.checkoutCart(fullUrl, xOrderingSource, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartMetaResult updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaCreation body) throws IOException {
        return this.updateCartMeta(id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartMetaResult updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartMeta");

        Response<CartApplicationModels.CartMetaResult> response = cartApplicationApiList.updateCartMeta(fullUrl, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetShareCartLinkResult getCartShareLink(CartApplicationModels.GetShareCartLinkCreation body) throws IOException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartApplicationModels.GetShareCartLinkResult getCartShareLink(CartApplicationModels.GetShareCartLinkCreation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartShareLink");

        Response<CartApplicationModels.GetShareCartLinkResult> response = cartApplicationApiList.getCartShareLink(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SharedCartResult getCartSharedItems(String token) throws IOException {
        return this.getCartSharedItems(token, new HashMap<>());
    }

    public CartApplicationModels.SharedCartResult getCartSharedItems(String token, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartSharedItems");
        fullUrl = fullUrl.replace("{" + "token" + "}",token.toString());

        Response<CartApplicationModels.SharedCartResult> response = cartApplicationApiList.getCartSharedItems(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.SharedCartResult updateCartWithSharedItems(String token, String action) throws IOException {
        return this.updateCartWithSharedItems(token, action, new HashMap<>());
    }

    public CartApplicationModels.SharedCartResult updateCartWithSharedItems(String token, String action, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        fullUrl = fullUrl.replace("{" + "token" + "}",token.toString());
        fullUrl = fullUrl.replace("{" + "action" + "}",action.toString());

        Response<CartApplicationModels.SharedCartResult> response = cartApplicationApiList.updateCartWithSharedItems(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PromotionOffersResult getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, String cartType, String promotionType, String cartId, Boolean autoApply) throws IOException {
        return this.getPromotionOffers(slug, pageSize, promotionGroup, storeId, cartType, promotionType, cartId, autoApply, new HashMap<>());
    }

    public CartApplicationModels.PromotionOffersResult getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, String cartType, String promotionType, String cartId, Boolean autoApply, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPromotionOffers");

        Response<CartApplicationModels.PromotionOffersResult> response = cartApplicationApiList.getPromotionOffers(fullUrl, slug, pageSize, promotionGroup, storeId, cartType, promotionType, cartId, autoApply, requestHeaders).execute();
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
    

    public CartApplicationModels.PromotionPaymentOffersResult getPromotionPaymentOffers(String id, Integer uid) throws IOException {
        return this.getPromotionPaymentOffers(id, uid, new HashMap<>());
    }

    public CartApplicationModels.PromotionPaymentOffersResult getPromotionPaymentOffers(String id, Integer uid, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPromotionPaymentOffers");

        Response<CartApplicationModels.PromotionPaymentOffersResult> response = cartApplicationApiList.getPromotionPaymentOffers(fullUrl, id, uid, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResult checkoutCartV2(CartApplicationModels.OrderingSource xOrderingSource, Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailV2Creation body) throws IOException {
        return this.checkoutCartV2(xOrderingSource, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResult checkoutCartV2(CartApplicationModels.OrderingSource xOrderingSource, Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailV2Creation body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCartV2");

        Response<CartApplicationModels.CartCheckoutResult> response = cartApplicationApiList.checkoutCartV2(fullUrl, xOrderingSource, buyNow, cartType, body, requestHeaders).execute();
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