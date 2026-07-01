package com.sdk.platform.common;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CommonPlatformApiList {

    @GET ("/service/common/configuration/v1.0/application/search-application")
    Call<CommonPlatformModels.ApplicationResponseSchema> searchApplication(@Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/common/configuration/v1.0/location")
    Call<CommonPlatformModels.Locations> getLocations(@Query("location_type") String locationType, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);
}