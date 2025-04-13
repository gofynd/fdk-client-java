package com.sdk.application.order;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface OrderApplicationApiList {

    @GET 
    Call<OrderApplicationModels.ShipmentRefundSummaryResponse> getShipmentRefundSummary(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.RefundOptionsSchemaResponse> getRefundOptions(@Url String url1, @Query("bag_ids") String bagIds, @Query("state") String state, @Query("optin_app_id") String optinAppId, @Query("optin_company_id") Integer optinCompanyId, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.OrderList> getOrders(@Url String url1, @Query("status") Integer status, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("custom_meta") String customMeta, @HeaderMap Map<String, String> requestHeaders);

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
    Call<OrderApplicationModels.CustomerDetailsResponse> getCustomerDetailsByShipmentId(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<OrderApplicationModels.SendOtpToCustomerResponse> sendOtpToShipmentCustomer(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<OrderApplicationModels.VerifyOtpResponse> verifyOtpShipmentCustomer(@Url String url1, @Body OrderApplicationModels.VerifyOtp payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentBagReasons> getShipmentBagReasons(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<OrderApplicationModels.ShipmentReasons> getShipmentReasons(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<OrderApplicationModels.ShipmentApplicationStatusResponse> updateShipmentStatus(@Url String url1, @Body OrderApplicationModels.UpdateShipmentStatusRequest payload, @HeaderMap Map<String, String> requestHeaders);
}