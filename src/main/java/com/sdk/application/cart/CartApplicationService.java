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

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

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

    

     
    
    
    public CartApplicationModels.CartDetailResponse getCart(String id , Boolean i , Boolean b , Boolean p , Integer assignCardId , String areaCode , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCart");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.getCart(fullUrl  ,id, i, b, p, assignCardId, areaCode, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public Object getCartLastModified(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartLastModified");
        

        Response<Object> response = cartApplicationApiList.getCartLastModified(fullUrl  ,id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.AddCartDetailResponse addItems(Boolean i , Boolean b , Boolean p , String areaCode , Boolean buyNow , String id ,CartApplicationModels.AddCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addItems");
        

        Response<CartApplicationModels.AddCartDetailResponse> response = cartApplicationApiList.addItems(fullUrl  ,i, b, p, areaCode, buyNow, id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.UpdateCartDetailResponse updateCart(String id , Boolean i , Boolean b , Boolean p , String areaCode , Boolean buyNow ,CartApplicationModels.UpdateCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCart");
        

        Response<CartApplicationModels.UpdateCartDetailResponse> response = cartApplicationApiList.updateCart(fullUrl  ,id, i, b, p, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.DeleteCartDetailResponse deleteCart(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteCart");
        

        Response<CartApplicationModels.DeleteCartDetailResponse> response = cartApplicationApiList.deleteCart(fullUrl  ,id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartItemCountResponse getItemCount(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getItemCount");
        

        Response<CartApplicationModels.CartItemCountResponse> response = cartApplicationApiList.getItemCount(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.GetCouponResponse getCoupons(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCoupons");
        

        Response<CartApplicationModels.GetCouponResponse> response = cartApplicationApiList.getCoupons(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartDetailResponse applyCoupon(Boolean i , Boolean b , Boolean p , String id , Boolean buyNow ,CartApplicationModels.ApplyCouponRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyCoupon");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.applyCoupon(fullUrl  ,i, b, p, id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartDetailResponse removeCoupon(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeCoupon");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.removeCoupon(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBulkDiscountOffers");
        

        Response<CartApplicationModels.BulkPriceResponse> response = cartApplicationApiList.getBulkDiscountOffers(fullUrl  ,itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartDetailResponse applyRewardPoints(String id , Boolean i , Boolean b , Boolean buyNow ,CartApplicationModels.RewardPointRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyRewardPoints");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.applyRewardPoints(fullUrl  ,id, i, b, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.GetAddressesResponse getAddresses(String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddresses");
        

        Response<CartApplicationModels.GetAddressesResponse> response = cartApplicationApiList.getAddresses(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.SaveAddressResponse addAddress(CartApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("addAddress");
        

        Response<CartApplicationModels.SaveAddressResponse> response = cartApplicationApiList.addAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.Address getAddressById(String id , String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddressById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<CartApplicationModels.Address> response = cartApplicationApiList.getAddressById(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.UpdateAddressResponse updateAddress(String id ,CartApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<CartApplicationModels.UpdateAddressResponse> response = cartApplicationApiList.updateAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.DeleteAddressResponse removeAddress(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<CartApplicationModels.DeleteAddressResponse> response = cartApplicationApiList.removeAddress(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartDetailResponse selectAddress(String cartId , Boolean buyNow , Boolean i , Boolean b ,CartApplicationModels.SelectCartAddressRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectAddress");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.selectAddress(fullUrl  ,cartId, buyNow, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartDetailResponse selectPaymentMode(String id , Boolean buyNow ,CartApplicationModels.UpdateCartPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectPaymentMode");
        

        Response<CartApplicationModels.CartDetailResponse> response = cartApplicationApiList.selectPaymentMode(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id , Boolean buyNow , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("validateCouponForPayment");
        

        Response<CartApplicationModels.PaymentCouponValidate> response = cartApplicationApiList.validateCouponForPayment(fullUrl  ,id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartShipmentsResponse getShipments(Boolean p , String id , Boolean buyNow , String addressId , String areaCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipments");
        

        Response<CartApplicationModels.CartShipmentsResponse> response = cartApplicationApiList.getShipments(fullUrl  ,p, id, buyNow, addressId, areaCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartCheckoutResponse checkoutCart(Boolean buyNow ,CartApplicationModels.CartCheckoutDetailRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkoutCart");
        

        Response<CartApplicationModels.CartCheckoutResponse> response = cartApplicationApiList.checkoutCart(fullUrl  ,buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartMetaResponse updateCartMeta(String id , Boolean buyNow ,CartApplicationModels.CartMetaRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartMeta");
        

        Response<CartApplicationModels.CartMetaResponse> response = cartApplicationApiList.updateCartMeta(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.GetShareCartLinkResponse getCartShareLink(CartApplicationModels.GetShareCartLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartShareLink");
        

        Response<CartApplicationModels.GetShareCartLinkResponse> response = cartApplicationApiList.getCartShareLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        

        Response<CartApplicationModels.SharedCartResponse> response = cartApplicationApiList.getCartSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        
        fullUrl = fullUrl.replace("{" + "action" +"}",action.toString());
        

        Response<CartApplicationModels.SharedCartResponse> response = cartApplicationApiList.updateCartWithSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.PromotionOffersResponse getPromotionOffers(String slug , Integer pageSize , String promotionGroup , Integer storeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPromotionOffers");
        

        Response<CartApplicationModels.PromotionOffersResponse> response = cartApplicationApiList.getPromotionOffers(fullUrl  ,slug, pageSize, promotionGroup, storeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.LadderPriceOffers getLadderOffers(String slug , String storeId , String promotionId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getLadderOffers");
        

        Response<CartApplicationModels.LadderPriceOffers> response = cartApplicationApiList.getLadderOffers(fullUrl  ,slug, storeId, promotionId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CartApplicationModels.CartCheckoutResponse checkoutCartV2(Boolean buyNow ,CartApplicationModels.CartCheckoutDetailV2Request body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkoutCartV2");
        

        Response<CartApplicationModels.CartCheckoutResponse> response = cartApplicationApiList.checkoutCartV2(fullUrl  ,buyNow, body).execute();
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
