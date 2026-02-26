package com.sdk.application.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface OrderApplicationApiList {

    @GET 
    Call<OrderApplicationModels.RefundOptions> getRefundModes(@Url String url1, @Query("line_numbers") List<Integer> lineNumbers, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<OrderApplicationModels.RefundOptions> getRefundModesWithPriceBreakup(@Url String url1, @Body OrderApplicationModels.RefundModeRequestData payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.OrderList> getOrders(@Url String url1, @Query("status") Integer status, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("custom_meta") String customMeta, @Query("allow_inactive") Boolean allowInactive, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.OrderById> getOrderById(@Url String url1, @Query("allow_inactive") Boolean allowInactive, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.OrderById> getPosOrderById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentById> getShipmentById(@Url String url1, @Query("allow_inactive") Boolean allowInactive, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ResponseGetInvoiceShipment> getInvoiceByShipmentId(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentTrack> trackShipment(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.CustomerDetailsResponseSchema> getCustomerDetailsByShipmentId(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<OrderApplicationModels.SendOtpToCustomerResponseSchema> sendOtpToShipmentCustomer(@Url String url1, @Query("event_type") String eventType, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<OrderApplicationModels.VerifyOtpResponseSchema> verifyOtpShipmentCustomer(@Url String url1, @Body OrderApplicationModels.VerifyOtp payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentBagReasons> getShipmentBagReasons(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentReasons> getShipmentReasons(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<OrderApplicationModels.ShipmentApplicationStatusResponseSchema> updateShipmentStatus(@Url String url1, @Body OrderApplicationModels.UpdateShipmentStatusRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<OrderApplicationModels.DeliveryReattemptSuccessResponseSchema> submitDeliveryReattemptRequest(@Url String url1, @Body OrderApplicationModels.DeliveryReattemptRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);
}