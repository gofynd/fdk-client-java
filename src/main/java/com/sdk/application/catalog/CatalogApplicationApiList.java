package com.sdk.application.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CatalogApplicationApiList {

    @GET 
    Call<CatalogApplicationModels.ProductDetail> getProductDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductSizes> getProductSizesBySlug(@Url String url1, @Query("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductsComparisonResponse> getProductComparisonBySlugs(@Url String url1, @Query("slug") List<String> slug, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductCompareResponse> getSimilarComparisonProductBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductFrequentlyComparedSimilarResponse> getComparedFrequentlyProductBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductVariantsResponse> getProductVariantsBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductStockStatusResponse> getProductStockByIds(@Url String url1, @Query("item_id") String itemId, @Query("alu") String alu, @Query("sku_code") String skuCode, @Query("ean") String ean, @Query("upc") String upc, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductStockPolling> getProductStockForTimeByIds(@Url String url1, @Query("timestamp") String timestamp, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductListingResponse> getProducts(@Url String url1, @Query("q") String q, @Query("f") String f, @Query("filters") Boolean filters, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.BrandListingResponse> getBrands(@Url String url1, @Query("department") String department, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.BrandDetailResponse> getBrandDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CategoryListingResponse> getCategories(@Url String url1, @Query("department") String department, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CategoryMetaResponse> getCategoryDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.HomeListingResponse> getHomeProducts(@Url String url1, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.DepartmentResponse> getDepartments(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.AutoCompleteResponse> getSearchResults(@Url String url1, @Query("q") String q, @Query("category_suggestion") Integer categorySuggestion, @Query("brand_suggestion") Integer brandSuggestion, @Query("collection_suggestion") Integer collectionSuggestion, @Query("product_suggestion") Integer productSuggestion, @Query("query_suggestion") Integer querySuggestion, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.GetCollectionListingResponse> getCollections(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tag") List<String> tag, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductListingResponse> getCollectionItemsBySlug(@Url String url1, @Query("f") String f, @Query("q") String q, @Query("filters") Boolean filters, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CollectionDetailResponse> getCollectionDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.GetFollowListingResponse> getFollowedListing(@Url String url1, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CatalogApplicationModels.FollowPostResponse> unfollowById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CatalogApplicationModels.FollowPostResponse> followById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.FollowerCountResponse> getFollowerCountById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.FollowIdsResponse> getFollowIds(@Url String url1, @Query("collection_type") String collectionType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.StoreListingResponse> getStores(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("city") String city, @Query("range") Integer range, @Query("latitude") Double latitude, @Query("longitude") Double longitude, @Query("tags") String tags, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ApplicationStoreListing> getInStockLocations(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("city") String city, @Query("range") Integer range, @Query("latitude") Double latitude, @Query("longitude") Double longitude, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.StoreDetails> getLocationDetailsById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductBundle> getProductBundlesBySlug(@Url String url1, @Query("slug") String slug, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductSizePriceResponseV3> getProductPriceBySlug(@Url String url1, @Query("store_id") Integer storeId, @Query("exchange_seller_identifier") String exchangeSellerIdentifier, @Query("moq") Integer moq, @Query("seller_id") Integer sellerId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductSizeSellersResponseV3> getProductSellersBySlug(@Url String url1, @Query("strategy") String strategy, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);
}