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
    Call<CatalogApplicationModels.ProductsComparisonResponseSchema> getProductComparisonBySlugs(@Url String url1, @Query("slug") List<String> slug, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductCompareResponseSchema> getSimilarComparisonProductBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductFrequentlyComparedSimilarResponseSchema> getComparedFrequentlyProductBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductVariantsResponseSchema> getProductVariantsBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductStockStatusResponseSchema> getProductStockByIds(@Url String url1, @Query("item_id") Integer itemId, @Query("alu") String alu, @Query("sku_code") String skuCode, @Query("ean") String ean, @Query("upc") String upc, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductStockPolling> getProductStockForTimeByIds(@Url String url1, @Query("timestamp") String timestamp, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductListingResponseSchema> getProducts(@Url String url1, @Query("q") String q, @Query("f") String f, @Query("filters") Boolean filters, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.BrandListingResponseSchema> getBrands(@Url String url1, @Query("department") String department, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.BrandDetailResponseSchema> getBrandDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CategoryListingResponseSchema> getCategories(@Url String url1, @Query("department") String department, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CategoryMetaResponseSchema> getCategoryDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.HomeListingResponseSchema> getHomeProducts(@Url String url1, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.DepartmentResponseSchema> getDepartments(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.AutoCompleteResponseSchema> getSearchResults(@Url String url1, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.GetCollectionListingResponseSchema> getCollections(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tag") List<String> tag, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductListingResponseSchema> getCollectionItemsBySlug(@Url String url1, @Query("f") String f, @Query("q") String q, @Query("filters") Boolean filters, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.CollectionDetailResponseSchema> getCollectionDetailBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.GetFollowListingResponseSchema> getFollowedListing(@Url String url1, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<CatalogApplicationModels.FollowPostResponseSchema> unfollowById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CatalogApplicationModels.FollowPostResponseSchema> followById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.FollowerCountResponseSchema> getFollowerCountById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.FollowIdsResponseSchema> getFollowIds(@Url String url1, @Query("collection_type") String collectionType, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.StoreListingResponseSchema> getStores(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("city") String city, @Query("range") Integer range, @Query("latitude") Double latitude, @Query("longitude") Double longitude, @Query("tags") String tags, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ApplicationStoreListing> getInStockLocations(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("city") String city, @Query("range") Integer range, @Query("latitude") Double latitude, @Query("longitude") Double longitude, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.StoreDetails> getLocationDetailsById(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductBundle> getProductBundlesBySlug(@Url String url1, @Query("slug") String slug, @Query("id") Integer id, @Query("size") String size, @Query("seller_id") Integer sellerId, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<CatalogApplicationModels.ProductSizePriceResponseV1> getProductPriceBySlug(@Url String url1, @Body CatalogApplicationModels.ProductSizePriceV1RequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<CatalogApplicationModels.ProductSizeSellersResponseV4> getProductSellersBySlug(@Url String url1, @Query("pincode") String pincode, @Query("strategy") String strategy, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);
}