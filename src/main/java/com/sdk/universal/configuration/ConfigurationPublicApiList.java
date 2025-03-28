package com.sdk.universal.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ConfigurationPublicApiList {

    @GET ("/service/public/configuration/v1.0/application/search-application")
    Call<ConfigurationPublicModels.ApplicationResponseSchema> searchApplication(@Header("authorization") String authorization, @Query("query") String query, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/configuration/v1.0/location")
    Call<ConfigurationPublicModels.Locations> getLocations(@Query("location_type") String locationType, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/public/configuration/v1.0/version")
    Call<ConfigurationPublicModels.VersionResponseSchema> checkVersionIsUpToDate(@Body ConfigurationPublicModels.VersionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);
}