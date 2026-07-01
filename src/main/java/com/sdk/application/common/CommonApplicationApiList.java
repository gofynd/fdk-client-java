package com.sdk.application.common;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CommonApplicationApiList {

    @GET 
    Call<CommonApplicationModels.ApplicationResponseSchema> searchApplication(@Url String url1, @Header("authorization") String authorization, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CommonApplicationModels.Locations> getLocations(@Url String url1, @Query("location_type") String locationType, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);
}