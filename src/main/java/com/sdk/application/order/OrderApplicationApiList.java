package com.sdk.application.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderApplicationApiList {
    
    
    @GET 
    Call<OrderApplicationModels.OrderList> getOrders(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("status") Integer status , @Query("custom_meta") String customMeta );
    
    @GET 
    Call<OrderApplicationModels.OrderById> getOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentById> getShipmentById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentReasons> getShipmentReasons(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentBagReasons> getShipmentBagReasons(@Url String url1);
    
    @PUT 
    Call<OrderApplicationModels.ShipmentStatusUpdate> updateShipmentStatus(@Url String url1 , @Body OrderApplicationModels.ShipmentStatusUpdateBody payload );
    
    @GET 
    Call<OrderApplicationModels.ShipmentTrack> trackShipment(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.PosOrderById> getPosOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.CustomerDetailsByShipmentId> getCustomerDetailsByShipmentId(@Url String url1);
    
    @POST 
    Call<OrderApplicationModels.sendOTPApplicationResponse> sendOtpToShipmentCustomer(@Url String url1);
    
    @POST 
    Call<OrderApplicationModels.ResponseVerifyOTPShipment> verifyOtpShipmentCustomer(@Url String url1 , @Body OrderApplicationModels.ReqBodyVerifyOTPShipment payload );
    
    @GET 
    Call<OrderApplicationModels.ResponseGetInvoiceShipment> getInvoiceByShipmentId(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ResponseGetCreditNoteShipment> getCreditNoteByShipmentId(@Url String url1);
}