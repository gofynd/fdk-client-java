package com.sdk.application.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ConfigurationApplicationApiList {

    @GET 
    Call<ConfigurationApplicationModels.Application> getApplication(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.ApplicationAboutResponseSchema> getOwnerInfo(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.ApplicationDetail> getBasicDetails(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.AppTokenResponseSchema> getIntegrationTokens(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.OrderingStores> getOrderingStores(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.OrderingStore> getStoreDetailById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.AppFeatureResponseSchema> getFeatures(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.ApplicationInformation> getContactInfo(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.CurrenciesResponseSchema> getCurrencies(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.Currency> getCurrencyById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.AppCurrencyResponseSchema> getAppCurrencies(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.LanguageResponseSchema> getLanguages(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<ConfigurationApplicationModels.SuccessMessageResponseSchema> getOrderingStoreCookie(@Url String url1, @Body ConfigurationApplicationModels.OrderingStoreSelectRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<ConfigurationApplicationModels.SuccessMessageResponseSchema> removeOrderingStoreCookie(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.AppStaffListResponseSchema> getAppStaffList(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("order_incent") Boolean orderIncent, @Query("ordering_store") Integer orderingStore, @Query("user") String user, @Query("user_name") String userName, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ConfigurationApplicationModels.AppStaffResponseSchema> getAppStaffs(@Url String url1, @Query("order_incent") Boolean orderIncent, @Query("ordering_store") Integer orderingStore, @Query("user") String user, @HeaderMap Map<String, String> requestHeaders);
}