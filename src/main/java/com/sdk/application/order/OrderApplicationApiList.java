package com.sdk.application.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderApplicationApiList {
    
    
    @GET 
    Call<OrderApplicationModels.OrderList> getOrders(@Url String url1, @Query("status") Integer status , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("custom_meta") String customMeta );
    
    @GET 
    Call<OrderApplicationModels.OrderById> getOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.OrderList> getPosOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentById> getShipmentById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ResponseGetInvoiceShipment> getInvoiceByShipmentId(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentTrack> trackShipment(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.CustomerDetailsResponse> getCustomerDetailsByShipmentId(@Url String url1);
    
    @POST 
    Call<OrderApplicationModels.SendOtpToCustomerResponse> sendOtpToShipmentCustomer(@Url String url1);
    
    @POST 
    Call<OrderApplicationModels.VerifyOtpResponse> verifyOtpShipmentCustomer(@Url String url1 , @Body OrderApplicationModels.VerifyOtp payload );
    
    @GET 
    Call<OrderApplicationModels.ShipmentBagReasons> getShipmentBagReasons(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentReasons> getShipmentReasons(@Url String url1);
    
    @PUT 
    Call<OrderApplicationModels.ShipmentApplicationStatusResponse> updateShipmentStatus(@Url String url1 , @Body OrderApplicationModels.UpdateShipmentStatusRequest payload );
    
    @GET 
    Call<OrderApplicationModels.ProductListResponse> getProducts(@Url String url1, @Query("status") Integer status , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("search_value") String searchValue );
}