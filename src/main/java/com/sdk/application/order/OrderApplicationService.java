package com.sdk.application.order;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.ApplicationConfig;







@Getter
 public class OrderApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private OrderApplicationApiList orderApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public OrderApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.orderApplicationApiList = generateOrderApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getOrders","/service/application/order/v1.0/orders".substring(1));
            
                    relativeUrls.put("getOrderById","/service/application/order/v1.0/orders/{order_id}".substring(1));
            
                    relativeUrls.put("getShipmentById","/service/application/order/v1.0/orders/shipments/{shipment_id}".substring(1));
            
                    relativeUrls.put("getShipmentReasons","/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons".substring(1));
            
                    relativeUrls.put("updateShipmentStatus","/service/application/order/v1.0/orders/shipments/{shipment_id}/status".substring(1));
            
                    relativeUrls.put("trackShipment","/service/application/order/v1.0/orders/shipments/{shipment_id}/track".substring(1));
            
                    relativeUrls.put("getPosOrderById","/service/application/order/v1.0/orders/pos-order/{order_id}".substring(1));
            
                    relativeUrls.put("getCustomerDetailsByShipmentId","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details".substring(1));
            
                    relativeUrls.put("sendOtpToShipmentCustomer","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/".substring(1));
            
                    relativeUrls.put("verifyOtpShipmentCustomer","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private OrderApplicationApiList generateOrderApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),OrderApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public OrderApplicationModels.OrderList getOrders(Integer pageNo , Integer pageSize , String fromDate , String toDate , Integer status ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrders");
        

        Response<OrderApplicationModels.OrderList> response = orderApplicationApiList.getOrders(fullUrl  ,pageNo, pageSize, fromDate, toDate, status).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.OrderById getOrderById(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderById");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        

        Response<OrderApplicationModels.OrderById> response = orderApplicationApiList.getOrderById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ShipmentById getShipmentById(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentById");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ShipmentById> response = orderApplicationApiList.getShipmentById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ShipmentReasons getShipmentReasons(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentReasons");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ShipmentReasons> response = orderApplicationApiList.getShipmentReasons(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ShipmentStatusUpdate updateShipmentStatus(String shipmentId ,OrderApplicationModels.ShipmentStatusUpdateBody body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateShipmentStatus");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ShipmentStatusUpdate> response = orderApplicationApiList.updateShipmentStatus(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ShipmentTrack trackShipment(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("trackShipment");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ShipmentTrack> response = orderApplicationApiList.trackShipment(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.PosOrderById getPosOrderById(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPosOrderById");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        

        Response<OrderApplicationModels.PosOrderById> response = orderApplicationApiList.getPosOrderById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.CustomerDetailsByShipmentId getCustomerDetailsByShipmentId(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCustomerDetailsByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.CustomerDetailsByShipmentId> response = orderApplicationApiList.getCustomerDetailsByShipmentId(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.sendOTPApplicationResponse sendOtpToShipmentCustomer(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOtpToShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.sendOTPApplicationResponse> response = orderApplicationApiList.sendOtpToShipmentCustomer(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ResponseVerifyOTPShipment verifyOtpShipmentCustomer(String orderId , String shipmentId ,OrderApplicationModels.ReqBodyVerifyOTPShipment body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ResponseVerifyOTPShipment> response = orderApplicationApiList.verifyOtpShipmentCustomer(fullUrl , body).execute();
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
