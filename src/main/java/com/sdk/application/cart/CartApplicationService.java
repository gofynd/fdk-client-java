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
        relativeUrls.put("getItemCountV2","/service/application/cart/v2.0/basic".substring(1));
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
        relativeUrls.put("updateCartMeta","/service/application/cart/v1.0/meta".substring(1));
        relativeUrls.put("getCartShareLink","/service/application/cart/v1.0/share-cart".substring(1));
        relativeUrls.put("getCartSharedItems","/service/application/cart/v1.0/share-cart/{token}".substring(1));
        relativeUrls.put("updateCartWithSharedItems","/service/application/cart/v1.0/share-cart/{token}/{action}".substring(1));
        relativeUrls.put("getPromotionOffers","/service/application/cart/v1.0/available-promotions".substring(1));
        relativeUrls.put("getLadderOffers","/service/application/cart/v1.0/available-ladder-prices".substring(1));
        relativeUrls.put("getShipments","/service/application/cart/v1.0/shipment".substring(1));
        relativeUrls.put("checkoutCart","/service/application/cart/v1.0/checkout".substring(1));
        relativeUrls.put("checkoutCartV2","/service/application/cart/v2.0/checkout".substring(1));
        relativeUrls.put("getPaymentPromotionOffers","/service/application/cart/v1.0/available-payment-offers".substring(1));
        relativeUrls.put("getCartMetaConfigs","/service/application/cart/v1.0/cart/configuration".substring(1));
        relativeUrls.put("getCartMetaConfig","/service/application/cart/v1.0/cart/configuration/{cart_meta_id}".substring(1));
        relativeUrls.put("addItemsv2","/service/application/cart/v2.0/detail".substring(1)); 

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

    public CartApplicationModels.CartDetailResult getCart(String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow, String cartType, String orderType) throws IOException {
        return this.getCart(id, i, b, c, assignCardId, areaCode, buyNow, cartType, orderType, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult getCart(String id, Boolean i, Boolean b, Boolean c, Integer assignCardId, String areaCode, Boolean buyNow, String cartType, String orderType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCart");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.getCart(fullUrl, id, i, b, c, assignCardId, areaCode, buyNow, cartType, orderType, requestHeaders).execute();
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
    

    public CartApplicationModels.AddCartDetailResult addItems(Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, String cartType, String orderType, CartApplicationModels.AddCartPayload body) throws IOException {
        return this.addItems(i, b, areaCode, buyNow, id, cartType, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.AddCartDetailResult addItems(Boolean i, Boolean b, String areaCode, Boolean buyNow, String id, String cartType, String orderType, CartApplicationModels.AddCartPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addItems");

        Response<CartApplicationModels.AddCartDetailResult> response = cartApplicationApiList.addItems(fullUrl, i, b, areaCode, buyNow, id, cartType, orderType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.UpdateCartDetailResult updateCart(String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, String cartType, String orderType, CartApplicationModels.UpdateCartPayload body) throws IOException {
        return this.updateCart(id, i, b, areaCode, buyNow, cartType, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.UpdateCartDetailResult updateCart(String id, Boolean i, Boolean b, String areaCode, Boolean buyNow, String cartType, String orderType, CartApplicationModels.UpdateCartPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCart");

        Response<CartApplicationModels.UpdateCartDetailResult> response = cartApplicationApiList.updateCart(fullUrl, id, i, b, areaCode, buyNow, cartType, orderType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.DeleteCartDetailResult deleteCart(String id, String cartType, CartApplicationModels.DeleteCartPayload body) throws IOException {
        return this.deleteCart(id, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.DeleteCartDetailResult deleteCart(String id, String cartType, CartApplicationModels.DeleteCartPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteCart");

        Response<CartApplicationModels.DeleteCartDetailResult> response = cartApplicationApiList.deleteCart(fullUrl, id, cartType, body, requestHeaders).execute();
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
    

    public CartApplicationModels.CartItemCountResultV2 getItemCountV2(String id, Boolean buyNow) throws IOException {
        return this.getItemCountV2(id, buyNow, new HashMap<>());
    }

    public CartApplicationModels.CartItemCountResultV2 getItemCountV2(String id, Boolean buyNow, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getItemCountV2");

        Response<CartApplicationModels.CartItemCountResultV2> response = cartApplicationApiList.getItemCountV2(fullUrl, id, buyNow, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetCouponResult getCoupons(String id, Boolean buyNow, String slug, String storeId) throws IOException {
        return this.getCoupons(id, buyNow, slug, storeId, new HashMap<>());
    }

    public CartApplicationModels.GetCouponResult getCoupons(String id, Boolean buyNow, String slug, String storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCoupons");

        Response<CartApplicationModels.GetCouponResult> response = cartApplicationApiList.getCoupons(fullUrl, id, buyNow, slug, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, String cartType, CartApplicationModels.ApplyCouponPayload body) throws IOException {
        return this.applyCoupon(i, b, p, id, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult applyCoupon(Boolean i, Boolean b, Boolean p, String id, Boolean buyNow, String cartType, CartApplicationModels.ApplyCouponPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyCoupon");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.applyCoupon(fullUrl, i, b, p, id, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult removeCoupon(String id, Boolean buyNow, String cartType) throws IOException {
        return this.removeCoupon(id, buyNow, cartType, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult removeCoupon(String id, Boolean buyNow, String cartType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("removeCoupon");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.removeCoupon(fullUrl, id, buyNow, cartType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.BulkPriceResult getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug, String cartType) throws IOException {
        return this.getBulkDiscountOffers(itemId, articleId, uid, slug, cartType, new HashMap<>());
    }

    public CartApplicationModels.BulkPriceResult getBulkDiscountOffers(Integer itemId, String articleId, Integer uid, String slug, String cartType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBulkDiscountOffers");

        Response<CartApplicationModels.BulkPriceResult> response = cartApplicationApiList.getBulkDiscountOffers(fullUrl, itemId, articleId, uid, slug, cartType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult applyRewardPoints(String id, Boolean i, Boolean b, Boolean buyNow, String cartType, CartApplicationModels.RewardPointPayload body) throws IOException {
        return this.applyRewardPoints(id, i, b, buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult applyRewardPoints(String id, Boolean i, Boolean b, Boolean buyNow, String cartType, CartApplicationModels.RewardPointPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("applyRewardPoints");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.applyRewardPoints(fullUrl, id, i, b, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetAddressesResult getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws IOException {
        return this.getAddresses(cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartApplicationModels.GetAddressesResult getAddresses(String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAddresses");

        Response<CartApplicationModels.GetAddressesResult> response = cartApplicationApiList.getAddresses(fullUrl, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, requestHeaders).execute();
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
    

    public CartApplicationModels.Address getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId) throws IOException {
        return this.getAddressById(id, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, new HashMap<>());
    }

    public CartApplicationModels.Address getAddressById(String id, String cartId, Boolean buyNow, String mobileNo, String checkoutMode, String tags, Boolean isDefault, String userId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAddressById");
        fullUrl = fullUrl.replace("{" + "id" + "}",id.toString());

        Response<CartApplicationModels.Address> response = cartApplicationApiList.getAddressById(fullUrl, cartId, buyNow, mobileNo, checkoutMode, tags, isDefault, userId, requestHeaders).execute();
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
    

    public CartApplicationModels.CartDetailResult selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressPayload body) throws IOException {
        return this.selectAddress(cartId, buyNow, i, b, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult selectAddress(String cartId, Boolean buyNow, Boolean i, Boolean b, CartApplicationModels.SelectCartAddressPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectAddress");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.selectAddress(fullUrl, cartId, buyNow, i, b, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartDetailResult selectPaymentMode(String id, Boolean buyNow, String orderType, CartApplicationModels.UpdateCartPaymentPayload body) throws IOException {
        return this.selectPaymentMode(id, buyNow, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.CartDetailResult selectPaymentMode(String id, Boolean buyNow, String orderType, CartApplicationModels.UpdateCartPaymentPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("selectPaymentMode");

        Response<CartApplicationModels.CartDetailResult> response = cartApplicationApiList.selectPaymentMode(fullUrl, id, buyNow, orderType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType) throws IOException {
        return this.validateCouponForPayment(id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, new HashMap<>());
    }

    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id, Boolean buyNow, String addressId, String paymentMode, String paymentIdentifier, String aggregatorName, String merchantCode, String iin, String network, String type, String cardId, String cartType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("validateCouponForPayment");

        Response<CartApplicationModels.PaymentCouponValidate> response = cartApplicationApiList.validateCouponForPayment(fullUrl, id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode, iin, network, type, cardId, cartType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartMetaResult updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaPayload body) throws IOException {
        return this.updateCartMeta(id, buyNow, body, new HashMap<>());
    }

    public CartApplicationModels.CartMetaResult updateCartMeta(String id, Boolean buyNow, CartApplicationModels.CartMetaPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartMeta");

        Response<CartApplicationModels.CartMetaResult> response = cartApplicationApiList.updateCartMeta(fullUrl, id, buyNow, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.GetShareCartLinkResult getCartShareLink(CartApplicationModels.GetShareCartLinkPayload body) throws IOException {
        return this.getCartShareLink(body, new HashMap<>());
    }

    public CartApplicationModels.GetShareCartLinkResult getCartShareLink(CartApplicationModels.GetShareCartLinkPayload body, Map<String, String> requestHeaders) throws IOException {
     
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
    

    public CartApplicationModels.SharedCartResult updateCartWithSharedItems(String token, String action, String cartId) throws IOException {
        return this.updateCartWithSharedItems(token, action, cartId, new HashMap<>());
    }

    public CartApplicationModels.SharedCartResult updateCartWithSharedItems(String token, String action, String cartId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        fullUrl = fullUrl.replace("{" + "token" + "}",token.toString());
        fullUrl = fullUrl.replace("{" + "action" + "}",action.toString());

        Response<CartApplicationModels.SharedCartResult> response = cartApplicationApiList.updateCartWithSharedItems(fullUrl, cartId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PromotionOffersResult getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId) throws IOException {
        return this.getPromotionOffers(slug, pageSize, promotionGroup, storeId, new HashMap<>());
    }

    public CartApplicationModels.PromotionOffersResult getPromotionOffers(String slug, Integer pageSize, String promotionGroup, Integer storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPromotionOffers");

        Response<CartApplicationModels.PromotionOffersResult> response = cartApplicationApiList.getPromotionOffers(fullUrl, slug, pageSize, promotionGroup, storeId, requestHeaders).execute();
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
    

    public CartApplicationModels.CartShipmentsResult getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType) throws IOException {
        return this.getShipments(pickAtStoreUid, orderingStoreId, i, p, id, buyNow, addressId, areaCode, orderType, new HashMap<>());
    }

    public CartApplicationModels.CartShipmentsResult getShipments(Integer pickAtStoreUid, Integer orderingStoreId, Boolean i, Boolean p, String id, Boolean buyNow, String addressId, String areaCode, String orderType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getShipments");

        Response<CartApplicationModels.CartShipmentsResult> response = cartApplicationApiList.getShipments(fullUrl, pickAtStoreUid, orderingStoreId, i, p, id, buyNow, addressId, areaCode, orderType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResult checkoutCart(Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailPayload body) throws IOException {
        return this.checkoutCart(buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResult checkoutCart(Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCart");

        Response<CartApplicationModels.CartCheckoutResult> response = cartApplicationApiList.checkoutCart(fullUrl, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartCheckoutResult checkoutCartV2(Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailV2Payload body) throws IOException {
        return this.checkoutCartV2(buyNow, cartType, body, new HashMap<>());
    }

    public CartApplicationModels.CartCheckoutResult checkoutCartV2(Boolean buyNow, String cartType, CartApplicationModels.CartCheckoutDetailV2Payload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("checkoutCartV2");

        Response<CartApplicationModels.CartCheckoutResult> response = cartApplicationApiList.checkoutCartV2(fullUrl, buyNow, cartType, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.PromotionPaymentOffersResult getPaymentPromotionOffers(String id, Integer uid) throws IOException {
        return this.getPaymentPromotionOffers(id, uid, new HashMap<>());
    }

    public CartApplicationModels.PromotionPaymentOffersResult getPaymentPromotionOffers(String id, Integer uid, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPaymentPromotionOffers");

        Response<CartApplicationModels.PromotionPaymentOffersResult> response = cartApplicationApiList.getPaymentPromotionOffers(fullUrl, id, uid, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartMetaConfigListResult getCartMetaConfigs() throws IOException {
        return this.getCartMetaConfigs(new HashMap<>());
    }

    public CartApplicationModels.CartMetaConfigListResult getCartMetaConfigs(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartMetaConfigs");

        Response<CartApplicationModels.CartMetaConfigListResult> response = cartApplicationApiList.getCartMetaConfigs(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.CartConfigDetailResult getCartMetaConfig(String cartMetaId, Boolean isBankOffer) throws IOException {
        return this.getCartMetaConfig(cartMetaId, isBankOffer, new HashMap<>());
    }

    public CartApplicationModels.CartConfigDetailResult getCartMetaConfig(String cartMetaId, Boolean isBankOffer, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCartMetaConfig");
        fullUrl = fullUrl.replace("{" + "cart_meta_id" + "}",cartMetaId.toString());

        Response<CartApplicationModels.CartConfigDetailResult> response = cartApplicationApiList.getCartMetaConfig(fullUrl, isBankOffer, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CartApplicationModels.AddCartDetailResultV2 addItemsv2(Boolean buyNow, String id, String cartType, String orderType, CartApplicationModels.AddCartPayload body) throws IOException {
        return this.addItemsv2(buyNow, id, cartType, orderType, body, new HashMap<>());
    }

    public CartApplicationModels.AddCartDetailResultV2 addItemsv2(Boolean buyNow, String id, String cartType, String orderType, CartApplicationModels.AddCartPayload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addItemsv2");

        Response<CartApplicationModels.AddCartDetailResultV2> response = cartApplicationApiList.addItemsv2(fullUrl, buyNow, id, cartType, orderType, body, requestHeaders).execute();
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