package com.sdk.universal.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CatalogPublicApiList {

    @GET ("/service/public/catalog/v1.0/taxonomy/level/{level}")
    Call<CatalogPublicModels.TaxonomyResponseSchema> getTaxonomyByLevel(@Path("level") Integer level, @Query("l0_slug") String l0Slug, @Query("l1_slug") String l1Slug, @Query("l2_slug") String l2Slug, @Query("l3_slug") String l3Slug, @Query("limit") Double limit, @HeaderMap Map<String, String> requestHeaders);
}