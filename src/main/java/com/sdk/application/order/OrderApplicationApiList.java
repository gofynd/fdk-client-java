package com.sdk.application.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface OrderApplicationApiList {
    
    
    @GET 
    Call<OrderApplicationModels.ShipmentById> getShipmentById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.CustomerDetailsResponse> getCustomerDetailsByShipmentId(@Url String url1);
    
    @POST 
    Call<OrderApplicationModels.SendOtpToCustomerResponse> sendOtpToShipmentCustomer(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.ShipmentReasonsResponse> getShipmentReasons(@Url String url1, @Query("bag_id") String bagId );
    
    @POST 
    Call<OrderApplicationModels.VerifyOtpResponse> verifyOtpShipmentCustomer(@Url String url1 , @Body OrderApplicationModels.VerifyOtp payload );
    
    @GET 
    Call<OrderApplicationModels.OrderList> getOrders(@Url String url1, @Query("status") Integer status , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate );
    
    @GET 
    Call<OrderApplicationModels.OrderList> getOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.OrderList> getPosOrderById(@Url String url1);
    
    @GET 
    Call<OrderApplicationModels.TrackShipmentResponse> trackShipment(@Url String url1);
    
    @PUT 
    Call<OrderApplicationModels.ShipmentStatusUpdate> updateShipmentStatus(@Url String url1 , @Body OrderApplicationModels.ShipmentStatusUpdateBody payload );
}