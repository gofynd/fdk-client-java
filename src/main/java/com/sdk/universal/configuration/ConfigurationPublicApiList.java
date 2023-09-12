package com.sdk.universal.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ConfigurationPublicApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    Call<ConfigurationPublicModels.ApplicationResponse> searchApplication(@Header("authorization") String authorization , @Query("query") String query );
    
    @GET ("/service/common/configuration/v1.0/location")
    Call<ConfigurationPublicModels.Locations> getLocations(@Query("location_type") String locationType , @Query("id") String id );
    
}