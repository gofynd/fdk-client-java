package com.sdk.application.poscart;

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
 public class PosCartApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PosCartApplicationApiList poscartApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public PosCartApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.poscartApplicationApiList = generatePoscartApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getCart","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getCartLastModified","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("addItems","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("updateCart","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getItemCount","/service/application/pos/cart/v1.0/basic".substring(1));
            
                    relativeUrls.put("getCoupons","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("applyCoupon","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("removeCoupon","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("getBulkDiscountOffers","/service/application/pos/cart/v1.0/bulk-price".substring(1));
            
                    relativeUrls.put("applyRewardPoints","/service/application/pos/cart/v1.0/redeem/points/".substring(1));
            
                    relativeUrls.put("getAddresses","/service/application/pos/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("addAddress","/service/application/pos/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("getAddressById","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("updateAddress","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("removeAddress","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("selectAddress","/service/application/pos/cart/v1.0/select-address".substring(1));
            
                    relativeUrls.put("selectPaymentMode","/service/application/pos/cart/v1.0/payment".substring(1));
            
                    relativeUrls.put("validateCouponForPayment","/service/application/pos/cart/v1.0/payment/validate/".substring(1));
            
                    relativeUrls.put("getShipments","/service/application/pos/cart/v1.0/shipment".substring(1));
            
                    relativeUrls.put("updateShipments","/service/application/pos/cart/v1.0/shipment".substring(1));
            
                    relativeUrls.put("checkoutCart","/service/application/pos/cart/v1.0/checkout".substring(1));
            
                    relativeUrls.put("updateCartMeta","/service/application/pos/cart/v1.0/meta".substring(1));
            
                    relativeUrls.put("getAvailableDeliveryModes","/service/application/pos/cart/v1.0/available-delivery-mode".substring(1));
            
                    relativeUrls.put("getStoreAddressByUid","/service/application/pos/cart/v1.0/store-address".substring(1));
            
                    relativeUrls.put("getCartShareLink","/service/application/pos/cart/v1.0/share-cart".substring(1));
            
                    relativeUrls.put("getCartSharedItems","/service/application/pos/cart/v1.0/share-cart/{token}".substring(1));
            
                    relativeUrls.put("updateCartWithSharedItems","/service/application/pos/cart/v1.0/share-cart/{token}/{action}".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private PosCartApplicationApiList generatePoscartApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PosCartApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public PosCartApplicationModels.CartDetailResponse getCart(String id , Boolean i , Boolean b , Integer assignCardId , String areaCode , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCart");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.getCart(fullUrl  ,id, i, b, assignCardId, areaCode, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public Object getCartLastModified(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartLastModified");
        

        Response<Object> response = poscartApplicationApiList.getCartLastModified(fullUrl  ,id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.AddCartDetailResponse addItems(Boolean i , Boolean b , String areaCode , Boolean buyNow ,PosCartApplicationModels.AddCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addItems");
        

        Response<PosCartApplicationModels.AddCartDetailResponse> response = poscartApplicationApiList.addItems(fullUrl  ,i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.UpdateCartDetailResponse updateCart(String id , Boolean i , Boolean b , String areaCode , Boolean buyNow ,PosCartApplicationModels.UpdateCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCart");
        

        Response<PosCartApplicationModels.UpdateCartDetailResponse> response = poscartApplicationApiList.updateCart(fullUrl  ,id, i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartItemCountResponse getItemCount(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getItemCount");
        

        Response<PosCartApplicationModels.CartItemCountResponse> response = poscartApplicationApiList.getItemCount(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.GetCouponResponse getCoupons(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCoupons");
        

        Response<PosCartApplicationModels.GetCouponResponse> response = poscartApplicationApiList.getCoupons(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDetailResponse applyCoupon(Boolean i , Boolean b , Boolean p , String id , Boolean buyNow ,PosCartApplicationModels.ApplyCouponRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyCoupon");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.applyCoupon(fullUrl  ,i, b, p, id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDetailResponse removeCoupon(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeCoupon");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.removeCoupon(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBulkDiscountOffers");
        

        Response<PosCartApplicationModels.BulkPriceResponse> response = poscartApplicationApiList.getBulkDiscountOffers(fullUrl  ,itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDetailResponse applyRewardPoints(String id , Boolean i , Boolean b , Boolean buyNow ,PosCartApplicationModels.RewardPointRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyRewardPoints");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.applyRewardPoints(fullUrl  ,id, i, b, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.GetAddressesResponse getAddresses(String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddresses");
        

        Response<PosCartApplicationModels.GetAddressesResponse> response = poscartApplicationApiList.getAddresses(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.SaveAddressResponse addAddress(PosCartApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("addAddress");
        

        Response<PosCartApplicationModels.SaveAddressResponse> response = poscartApplicationApiList.addAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.Address getAddressById(String id , String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddressById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<PosCartApplicationModels.Address> response = poscartApplicationApiList.getAddressById(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.UpdateAddressResponse updateAddress(String id ,PosCartApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<PosCartApplicationModels.UpdateAddressResponse> response = poscartApplicationApiList.updateAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.DeleteAddressResponse removeAddress(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<PosCartApplicationModels.DeleteAddressResponse> response = poscartApplicationApiList.removeAddress(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDetailResponse selectAddress(String cartId , Boolean buyNow , Boolean i , Boolean b ,PosCartApplicationModels.SelectCartAddressRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectAddress");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.selectAddress(fullUrl  ,cartId, buyNow, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDetailResponse selectPaymentMode(String id , Boolean buyNow ,PosCartApplicationModels.UpdateCartPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectPaymentMode");
        

        Response<PosCartApplicationModels.CartDetailResponse> response = poscartApplicationApiList.selectPaymentMode(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.PaymentCouponValidate validateCouponForPayment(String id , Boolean buyNow , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("validateCouponForPayment");
        

        Response<PosCartApplicationModels.PaymentCouponValidate> response = poscartApplicationApiList.validateCouponForPayment(fullUrl  ,id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartShipmentsResponse getShipments(Integer pickAtStoreUid , Integer orderingStoreId , Boolean p , String id , String addressId , String areaCode , String orderType ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipments");
        

        Response<PosCartApplicationModels.CartShipmentsResponse> response = poscartApplicationApiList.getShipments(fullUrl  ,pickAtStoreUid, orderingStoreId, p, id, addressId, areaCode, orderType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartShipmentsResponse updateShipments(Boolean i , Boolean p , String id , String addressId , String orderType ,PosCartApplicationModels.UpdateCartShipmentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateShipments");
        

        Response<PosCartApplicationModels.CartShipmentsResponse> response = poscartApplicationApiList.updateShipments(fullUrl  ,i, p, id, addressId, orderType, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartCheckoutResponse checkoutCart(String id ,PosCartApplicationModels.CartPosCheckoutDetailRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkoutCart");
        

        Response<PosCartApplicationModels.CartCheckoutResponse> response = poscartApplicationApiList.checkoutCart(fullUrl  ,id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartMetaResponse updateCartMeta(String id , Boolean buyNow ,PosCartApplicationModels.CartMetaRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartMeta");
        

        Response<PosCartApplicationModels.CartMetaResponse> response = poscartApplicationApiList.updateCartMeta(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.CartDeliveryModesResponse getAvailableDeliveryModes(String areaCode , String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAvailableDeliveryModes");
        

        Response<PosCartApplicationModels.CartDeliveryModesResponse> response = poscartApplicationApiList.getAvailableDeliveryModes(fullUrl  ,areaCode, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.StoreDetailsResponse getStoreAddressByUid(Integer storeUid ) throws IOException {
     
      String fullUrl = relativeUrls.get("getStoreAddressByUid");
        

        Response<PosCartApplicationModels.StoreDetailsResponse> response = poscartApplicationApiList.getStoreAddressByUid(fullUrl  ,storeUid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.GetShareCartLinkResponse getCartShareLink(PosCartApplicationModels.GetShareCartLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartShareLink");
        

        Response<PosCartApplicationModels.GetShareCartLinkResponse> response = poscartApplicationApiList.getCartShareLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        

        Response<PosCartApplicationModels.SharedCartResponse> response = poscartApplicationApiList.getCartSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public PosCartApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        
        fullUrl = fullUrl.replace("{" + "action" +"}",action.toString());
        

        Response<PosCartApplicationModels.SharedCartResponse> response = poscartApplicationApiList.updateCartWithSharedItems(fullUrl ).execute();
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
