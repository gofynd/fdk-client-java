package com.sdk.application.order;

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
            
                    relativeUrls.put("getPosOrderById","/service/application/order/v1.0/orders/pos-order/{order_id}".substring(1));
            
                    relativeUrls.put("getShipmentById","/service/application/order/v1.0/orders/shipments/{shipment_id}".substring(1));
            
                    relativeUrls.put("getInvoiceByShipmentId","/service/application/order/v1.0/orders/shipments/{shipment_id}/invoice".substring(1));
            
                    relativeUrls.put("trackShipment","/service/application/order/v1.0/orders/shipments/{shipment_id}/track".substring(1));
            
                    relativeUrls.put("getCustomerDetailsByShipmentId","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details".substring(1));
            
                    relativeUrls.put("sendOtpToShipmentCustomer","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/".substring(1));
            
                    relativeUrls.put("verifyOtpShipmentCustomer","/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify/".substring(1));
            
                    relativeUrls.put("getShipmentBagReasons","/service/application/order/v1.0/orders/shipments/{shipment_id}/bags/{bag_id}/reasons".substring(1));
            
                    relativeUrls.put("getShipmentReasons","/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons".substring(1));
            
                    relativeUrls.put("updateShipmentStatus","/service/application/order/v1.0/orders/shipments/{shipment_id}/status".substring(1));
            
                    relativeUrls.put("getProducts","/service/application/order/v1.0/products".substring(1));
             

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

    

     
    
    
    public OrderApplicationModels.OrderList getOrders(Integer status , Integer pageNo , Integer pageSize , String fromDate , String toDate , String customMeta ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrders");
        

        Response<OrderApplicationModels.OrderList> response = orderApplicationApiList.getOrders(fullUrl  ,status, pageNo, pageSize, fromDate, toDate, customMeta).execute();
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

    
    
    
    
    
    public OrderApplicationModels.OrderList getPosOrderById(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPosOrderById");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        

        Response<OrderApplicationModels.OrderList> response = orderApplicationApiList.getPosOrderById(fullUrl ).execute();
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

    
    
    
    
    
    public OrderApplicationModels.ResponseGetInvoiceShipment getInvoiceByShipmentId(String shipmentId , String documentType ) throws IOException {
     
      String fullUrl = relativeUrls.get("getInvoiceByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ResponseGetInvoiceShipment> response = orderApplicationApiList.getInvoiceByShipmentId(fullUrl  ,documentType).execute();
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

    
    
    
    
    
    public OrderApplicationModels.CustomerDetailsResponse getCustomerDetailsByShipmentId(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCustomerDetailsByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.CustomerDetailsResponse> response = orderApplicationApiList.getCustomerDetailsByShipmentId(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.SendOtpToCustomerResponse sendOtpToShipmentCustomer(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOtpToShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.SendOtpToCustomerResponse> response = orderApplicationApiList.sendOtpToShipmentCustomer(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.VerifyOtpResponse verifyOtpShipmentCustomer(String orderId , String shipmentId ,OrderApplicationModels.VerifyOtp body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.VerifyOtpResponse> response = orderApplicationApiList.verifyOtpShipmentCustomer(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId , String bagId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentBagReasons");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        
        fullUrl = fullUrl.replace("{" + "bag_id" +"}",bagId.toString());
        

        Response<OrderApplicationModels.ShipmentBagReasons> response = orderApplicationApiList.getShipmentBagReasons(fullUrl ).execute();
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

    
    
    
    
    
    public OrderApplicationModels.ShipmentApplicationStatusResponse updateShipmentStatus(String shipmentId ,OrderApplicationModels.UpdateShipmentStatusRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateShipmentStatus");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<OrderApplicationModels.ShipmentApplicationStatusResponse> response = orderApplicationApiList.updateShipmentStatus(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public OrderApplicationModels.ProductListResponse getProducts(Integer companyId , Integer status , Integer pageNo , Integer pageSize , String fromDate , String toDate , String searchValue ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProducts");
        
        fullUrl = fullUrl.replace("{" + "company_id" +"}",companyId.toString());
        

        Response<OrderApplicationModels.ProductListResponse> response = orderApplicationApiList.getProducts(fullUrl  ,status, pageNo, pageSize, fromDate, toDate, searchValue).execute();
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
