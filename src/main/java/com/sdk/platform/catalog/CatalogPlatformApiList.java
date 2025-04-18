package com.sdk.platform.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CatalogPlatformApiList {

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights")
    Call<CatalogPlatformModels.CatalogInsightResponse> getCatalogInsights(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("brand") String brand, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    Call<CatalogPlatformModels.ApplicationBrandListingSchema> getApplicationBrandListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppBrand(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("brand_uid") Integer brandUid, @Body CatalogPlatformModels.ApplicationBrandJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    Call<CatalogPlatformModels.BrandListingResponse> getApplicationBrands(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department") String department, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("brand_id") List<Integer> brandId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    Call<CatalogPlatformModels.CategoryListingResponse> getCategories(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department") String department, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    Call<CatalogPlatformModels.ApplicationCategoryListingSchema> getApplicationCategoryListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department_id") Integer departmentId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppCategory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("category_uid") Integer categoryUid, @Body CatalogPlatformModels.ApplicationCategoryJson payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections")
    Call<CatalogPlatformModels.CollectionCreateResponse> createCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateCollection payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections")
    Call<CatalogPlatformModels.GetCollectionListingResponse> getAllCollections(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("schedule_status") String scheduleStatus, @Query("type") String type, @Query("tag") List<String> tag, @Query("is_active") Boolean isActive, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/{filter_key}/values")
    Call<CatalogPlatformModels.GetQueryFiltersValuesResponse> getApplicationFilterValues(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("filter_key") String filterKey, @Query("c") String c, @Query("collection_id") String collectionId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/keys")
    Call<CatalogPlatformModels.GetQueryFiltersKeysResponse> getApplicationFilterKeys(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("c") String c, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options")
    Call<CatalogPlatformModels.GetQueryFiltersResponse> getQueryFilters(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    Call<CatalogPlatformModels.GetCollectionItemsResponseSchema> getCollectionItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("sort_on") String sortOn, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("is_pinned") Boolean isPinned, @Query("q") String q, @Query("is_excluded") Boolean isExcluded, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    Call<CatalogPlatformModels.CommonResponseSchemaCollection> clearCollectionItemsPriority(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{id}/items")
    Call<CatalogPlatformModels.CommonResponseSchemaCollection> addCollectionItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CollectionItemUpdateSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}")
    Call<CatalogPlatformModels.GetCollectionDetailResponse> getCollectionDetail(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}")
    Call<CatalogPlatformModels.UpdateCollection> updateCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.UpdateCollection payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}")
    Call<CatalogPlatformModels.CommonResponseSchemaCollection> deleteCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    Call<CatalogPlatformModels.ApplicationDepartmentListingResponse> getApplicationDepartmentListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppDepartment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("department_uid") Integer departmentUid, @Body CatalogPlatformModels.ApplicationDepartmentJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/{filter}")
    Call<CatalogPlatformModels.FilterResponse> getConfigurationsFilterMetadata(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("filter") String filter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    Call<CatalogPlatformModels.DepartmentResponse> getDepartments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory")
    Call<CatalogPlatformModels.InventoryStockResponse> getAppInventory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("item_ids") List<Integer> itemIds, @Query("store_ids") List<Integer> storeIds, @Query("brand_ids") List<Integer> brandIds, @Query("seller_identifiers") List<String> sellerIdentifiers, @Query("timestamp") String timestamp, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @Query("qty_gt") Integer qtyGt, @Query("qty_lt") Integer qtyLt, @Query("qty_type") String qtyType, @Query("from_date") String fromDate, @Query("to_date") String toDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/locations")
    Call<CatalogPlatformModels.LocationListSerializer> getAppLocations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("store_type") String storeType, @Query("uid") List<Integer> uid, @Query("q") String q, @Query("stage") String stage, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tags") List<String> tags, @Query("store_types") List<String> storeTypes, @Query("company_uids") List<Integer> companyUids, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> getConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationProductListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.AppConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata")
    Call<CatalogPlatformModels.GetCatalogConfigurationMetaData> getCatalogConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}")
    Call<CatalogPlatformModels.GetAppCatalogEntityConfiguration> getConfigurationByType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationByType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("type") String type, @Body CatalogPlatformModels.AppConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}")
    Call<CatalogPlatformModels.OwnerAppItemResponse> getAppProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.ApplicationItemMeta payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    Call<CatalogPlatformModels.ApplicationProductListingResponse> getApplicationProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("f") String f, @Query("c") String c, @Query("filters") Boolean filters, @Query("is_dependent") Boolean isDependent, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @Query("item_ids") List<String> itemIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getDiscountedInventoryBySizeIdentifier(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") Integer itemId, @Path("size_identifier") Integer sizeIdentifier, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("location_ids") List<Integer> locationIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    Call<CatalogPlatformModels.ProductDetail> getProductDetailBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products")
    Call<CatalogPlatformModels.RawProductListingResponse> getAppProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("brand_ids") List<Integer> brandIds, @Query("category_ids") List<Integer> categoryIds, @Query("department_ids") List<Integer> departmentIds, @Query("tags") List<String> tags, @Query("item_ids") List<Integer> itemIds, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.AppReturnConfigResponse> getAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.SuccessResponseSchema> createAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateUpdateAppReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateUpdateAppReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponse> deleteAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.DeleteAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.BaseAppCategoryReturnConfigResponse> getAppCategoryReturnConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponseSchema> createAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.BaseAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponse> updateAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.BaseAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete")
    Call<CatalogPlatformModels.CreateAutocompleteWordsResponse> createCustomAutocompleteRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateAutocompleteKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponse> getAutocompleteConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    Call<CatalogPlatformModels.GetAutocompleteWordsData> getAutocompleteKeywordDetail(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    Call<CatalogPlatformModels.GetAutocompleteWordsData> updateAutocompleteKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateAutocompleteKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}")
    Call<CatalogPlatformModels.DeleteResponse> deleteAutocompleteKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank")
    Call<CatalogPlatformModels.CreateSearchRerankResponse> createSearchRerank(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateSearchRerankRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank")
    Call<CatalogPlatformModels.GetSearchRerankResponse> getSearchRerank(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    Call<CatalogPlatformModels.GetSearchRerankDetailResponse> getSearchRerankDetail(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    Call<CatalogPlatformModels.UpdateSearchRerankResponse> updateSearchRerankConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.UpdateSearchRerankRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/rerank/{id}")
    Call<CatalogPlatformModels.DeleteSearchRerankConfigurationResponse> deleteSearchRerankConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    Call<CatalogPlatformModels.CreateSearchConfigurationResponse> createSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateSearchConfigurationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    Call<CatalogPlatformModels.GetSearchConfigurationResponse> getSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    Call<CatalogPlatformModels.UpdateSearchConfigurationResponse> updateSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.UpdateSearchConfigurationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration")
    Call<CatalogPlatformModels.DeleteSearchConfigurationResponse> deleteSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword")
    Call<CatalogPlatformModels.GetSearchWordsData> createCustomKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateSearchKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword")
    Call<CatalogPlatformModels.GetSearchWordsResponse> getAllSearchKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("is_active") Boolean isActive, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    Call<CatalogPlatformModels.GetSearchWordsData> getSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    Call<CatalogPlatformModels.GetSearchWordsData> updateSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateSearchKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}")
    Call<CatalogPlatformModels.DeleteResponse> deleteSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppLocation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("store_uid") Integer storeUid, @Body CatalogPlatformModels.ApplicationStoreJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category")
    Call<CatalogPlatformModels.CategoryResponse> listCategories(@Path("company_id") String companyId, @Query("level") String level, @Query("department") Integer department, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("uids") List<Integer> uids, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}")
    Call<CatalogPlatformModels.SingleCategoryResponse> getCategoryData(@Path("company_id") String companyId, @Path("uid") String uid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights")
    Call<CatalogPlatformModels.CrossSellingResponse> getSellerInsights(@Path("company_id") String companyId, @Path("seller_app_id") String sellerAppId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments")
    Call<CatalogPlatformModels.DepartmentsResponse> listDepartmentsData(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("item_type") String itemType, @Query("page_size") Integer pageSize, @Query("name") String name, @Query("search") String search, @Query("is_active") Boolean isActive, @Query("uids") List<Integer> uids, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}")
    Call<CatalogPlatformModels.DepartmentsResponse> getDepartmentData(@Path("company_id") String companyId, @Path("uid") String uid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration")
    Call<CatalogPlatformModels.ProductConfigurationDownloads> listTemplateBrandTypeValues(@Path("company_id") String companyId, @Query("filter") String filter, @Query("template_tag") String templateTag, @Query("item_type") String itemType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}")
    Call<CatalogPlatformModels.HsnCode> getHsnCode(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    Call<CatalogPlatformModels.GetInventoriesResponse> getInventories(@Path("company_id") String companyId, @Query("item_id") Integer itemId, @Query("size") String size, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @Query("page_type") String pageType, @Query("q") String q, @Query("sellable") Boolean sellable, @Query("store_ids") List<Integer> storeIds, @Query("brand_ids") List<Integer> brandIds, @Query("seller_identifiers") List<String> sellerIdentifiers, @Query("min_sellable") Integer minSellable, @Query("max_sellable") Integer maxSellable, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("size_identifier") String sizeIdentifier, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk")
    Call<CatalogPlatformModels.BulkInventoryGet> getInventoryBulkUploadHistory(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk")
    Call<CatalogPlatformModels.InventoryBulkResponse> createBulkInventoryJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryBulkJob payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> deleteBulkInventoryJob(@Path("company_id") String companyId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> createBulkInventory(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Body CatalogPlatformModels.InventoryBulkRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download")
    Call<CatalogPlatformModels.InventoryExportResponse> createInventoryExportJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryExportRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download")
    Call<CatalogPlatformModels.InventoryExportJobResponse> getInventoryExport(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/{job_id}")
    Call<CatalogPlatformModels.PatchProductDownloadsResponse> patchProductExportDetail(@Path("company_id") String companyId, @Path("job_id") String jobId, @Body CatalogPlatformModels.ExportPatchRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/{job_id}")
    Call<CatalogPlatformModels.GetProductDownloadsResponse> getProductExportDetail(@Path("company_id") String companyId, @Path("job_id") String jobId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/{job_id}")
    Call<CatalogPlatformModels.EditInventoryDownloadsResponse> patchInventoryExportDetail(@Path("company_id") String companyId, @Path("job_id") String jobId, @Body CatalogPlatformModels.ExportPatchRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/{job_id}")
    Call<CatalogPlatformModels.EditInventoryDownloadsResponse> getInventoryExportDetail(@Path("company_id") String companyId, @Path("job_id") String jobId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration")
    Call<CatalogPlatformModels.InventoryConfig> exportInventoryConfig(@Path("company_id") String companyId, @Query("filter") String filter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download")
    Call<String> downloadInventoryTemplateView(@Path("company_id") String companyId, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema")
    Call<CatalogPlatformModels.InventoryValidationResponse> validateProductTemplateSchema(@Path("company_id") String companyId, @Query("item_type") String itemType, @Query("bulk") Boolean bulk, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details")
    Call<CatalogPlatformModels.OptinCompanyBrandDetailsView> getCompanyBrandDetail(@Path("company_id") String companyId, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("marketplace") String marketplace, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/company-details")
    Call<CatalogPlatformModels.OptinCompanyDetail> getCompanyDetail(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics")
    Call<CatalogPlatformModels.OptinCompanyMetrics> getCompanyMetrics(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/location-details")
    Call<CatalogPlatformModels.OptinStoreDetails> getStoreDetail(@Path("company_id") String companyId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes")
    Call<CatalogPlatformModels.ProductAttributesResponse> getProductAttributes(@Path("company_id") String companyId, @Query("category") String category, @Query("filter") Boolean filter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    Call<CatalogPlatformModels.AttributeDetail> getAttribute(@Path("company_id") String companyId, @Path("attribute_slug") String attributeSlug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle")
    Call<CatalogPlatformModels.GetProductBundleCreateResponse> createProductBundle(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductBundleRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle")
    Call<CatalogPlatformModels.GetProductBundleListingResponse> getProductBundle(@Path("company_id") String companyId, @Query("q") String q, @Query("slug") List<String> slug, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle/{id}")
    Call<CatalogPlatformModels.GetProductBundleResponse> getProductBundleDetail(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/product-bundle/{id}")
    Call<CatalogPlatformModels.GetProductBundleCreateResponse> updateProductBundle(@Path("company_id") String companyId, @Path("id") String id, @Body CatalogPlatformModels.ProductBundleUpdateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk")
    Call<CatalogPlatformModels.BulkAssetResponse> getProductAssetsInBulk(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk")
    Call<CatalogPlatformModels.SuccessResponse> createProductAssetsInBulk(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductBulkAssets payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.ProductBulkRequestList> getProductBulkUploadHistory(@Path("company_id") String companyId, @Query("search") String search, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.ProductBulkResponse> createBulkProductUploadJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.BulkProductUploadJob payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> deleteProductBulkJob(@Path("company_id") String companyId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> createProductsInBulk(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Body CatalogPlatformModels.BulkProductRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn")
    Call<CatalogPlatformModels.HSNCodesResponse> listHSNCodes(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    Call<CatalogPlatformModels.ProductTagsViewResponse> getProductTags(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates")
    Call<CatalogPlatformModels.TemplatesResponse> listProductTemplate(@Path("company_id") String companyId, @Query("department") String department, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories")
    Call<CatalogPlatformModels.ProdcutTemplateCategoriesResponse> listProductTemplateCategories(@Path("company_id") String companyId, @Query("departments") String departments, @Query("item_type") String itemType, @Query("page_size") Double pageSize, @Query("page_no") Double pageNo, @Query("q") Double q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download")
    Call<String> downloadProductTemplateViews(@Path("company_id") String companyId, @Path("slug") String slug, @Query("item_type") String itemType, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema")
    Call<CatalogPlatformModels.TemplatesValidationResponse> validateProductTemplate(@Path("company_id") String companyId, @Path("slug") String slug, @Query("item_type") String itemType, @Query("bulk") Boolean bulk, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation")
    Call<CatalogPlatformModels.ValidateProduct> getProductValidation(@Path("company_id") String companyId, @Query("type") String type, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getInventoryBySizeIdentifier(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size_identifier") String sizeIdentifier, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("location_ids") List<Integer> locationIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes")
    Call<CatalogPlatformModels.Product> getProductSize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.ProductSizeDeleteResponse> deleteSize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size") String size, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.InventoryResponsePaginated> getInventoryBySize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size") String size, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("sellable") Boolean sellable, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    Call<CatalogPlatformModels.ProductVariantsResponse> getVariantsOfProducts(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("variant_type") String variantType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/verification")
    Call<CatalogPlatformModels.CompanyVerificationResponse> getCompanyVerification(@Path("company_id") String companyId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/verification/products/{item_id}")
    Call<CatalogPlatformModels.ProductVerificationModel> getProductVerificationDetails(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/variant-types")
    Call<CatalogPlatformModels.VariantTypesResponse> getVariantTypes(@Path("company_id") String companyId, @Query("template_tag") String templateTag, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.SuccessResponse> createSizeGuide(@Path("company_id") String companyId, @Body CatalogPlatformModels.ValidateSizeGuide payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.ListSizeGuide> getSizeGuides(@Path("company_id") String companyId, @Query("active") Boolean active, @Query("q") String q, @Query("brand_id") Integer brandId, @Query("tag") String tag, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}")
    Call<CatalogPlatformModels.SizeGuideResponse> getSizeGuide(@Path("id") String id, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}")
    Call<CatalogPlatformModels.SuccessResponse> updateSizeGuide(@Path("company_id") String companyId, @Path("id") String id, @Body CatalogPlatformModels.ValidateSizeGuide payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    Call<CatalogPlatformModels.ConfigSuccessResponse> updateAllowSingle(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.AllowSingleRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    Call<CatalogPlatformModels.ConfigSuccessResponse> updateDefaultSort(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.DefaultKeyRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}")
    Call<CatalogPlatformModels.AppConfigurationsFilterResponse> createListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body CatalogPlatformModels.AppConfigurationsFilter payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}")
    Call<CatalogPlatformModels.GetListingConfigResponse> getListingConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search") String search, @Query("uids") List<Integer> uids, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.AppConfigurationDetail> createGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body CatalogPlatformModels.AppConfigurationCreateDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.GetConfigResponse> getGroupConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search") String search, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<CatalogPlatformModels.AppConfigurationDetail> updateGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("group_slug") String groupSlug, @Body CatalogPlatformModels.AppConfigurationDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<Object> deleteGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("group_slug") String groupSlug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}")
    Call<CatalogPlatformModels.AppConfigurationsFilterResponse> updateListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("config_id") String configId, @Body CatalogPlatformModels.AppConfigurationsFilterResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}")
    Call<CatalogPlatformModels.ConfigSuccessResponse> deleteListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("config_id") String configId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata")
    Call<CatalogPlatformModels.GetConfigMetadataResponse> getConfigurationMetadata(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn")
    Call<CatalogPlatformModels.HsnCodesListingResponseSchemaV2> getAllProductHsnCodes(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    Call<CatalogPlatformModels.HSNDataInsertV2> getSingleProductHSNCode(@Path("reporting_hsn") String reportingHsn, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory")
    Call<CatalogPlatformModels.InventoryUpdateResponse> updateInventories(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download")
    Call<CatalogPlatformModels.InventoryExportJobListResponse> listInventoryExport(@Path("company_id") String companyId, @Query("status") String status, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download")
    Call<CatalogPlatformModels.InventoryExportResponse> createInventoryExport(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryCreateRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products")
    Call<CatalogPlatformModels.ProductListingResponseV2> getProducts(@Path("company_id") String companyId, @Query("brand_ids") List<Integer> brandIds, @Query("multi_size") Boolean multiSize, @Query("category_ids") List<Integer> categoryIds, @Query("item_ids") List<Integer> itemIds, @Query("department_ids") List<Integer> departmentIds, @Query("item_code") List<String> itemCode, @Query("name") String name, @Query("slug") String slug, @Query("all_identifiers") List<String> allIdentifiers, @Query("q") String q, @Query("tags") List<String> tags, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("page_type") String pageType, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products")
    Call<CatalogPlatformModels.SuccessResponseSchema> createProduct(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductCreateUpdateSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.ProductBulkResponse> uploadBulkProducts(@Path("company_id") String companyId, @Query("department") String department, @Query("product_type") String productType, @Body CatalogPlatformModels.BulkProductJob payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads")
    Call<CatalogPlatformModels.ProductDownloadsResponse> getProductExportJobs(@Path("company_id") String companyId, @Query("status") String status, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads")
    Call<CatalogPlatformModels.CreateProductDownloadsResponse> createProductExportJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductTemplateDownloadsExport payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    Call<CatalogPlatformModels.SingleProductResponse> getProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Query("brand_uid") Integer brandUid, @Query("item_code") String itemCode, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    Call<CatalogPlatformModels.SuccessResponse> editProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.ProductCreateUpdateSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}")
    Call<CatalogPlatformModels.SuccessResponse> deleteProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    Call<CatalogPlatformModels.GetAllSizes> allSizes(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    Call<CatalogPlatformModels.InventoryUpdateResponse> deleteRealtimeInventory(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    Call<CatalogPlatformModels.InventoryUpdateResponse> updateRealtimeInventory(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}")
    Call<CatalogPlatformModels.GetProductTemplateSlugResponse> getProductTemplateBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/channel")
    Call<CatalogPlatformModels.GetAllMarketplaces> getMarketplaces(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace}/opt-in")
    Call<CatalogPlatformModels.UpdateMarketplaceOptinResponse> updateMarketplaceOptin(@Path("company_id") String companyId, @Path("marketplace") String marketplace, @Body CatalogPlatformModels.UpdateMarketplaceOptinRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace}/opt-in")
    Call<CatalogPlatformModels.CreateMarketplaceOptinResponse> createMarketplaceOptin(@Path("company_id") String companyId, @Path("marketplace") String marketplace, @Body CatalogPlatformModels.CreateMarketplaceOptinRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings")
    Call<CatalogPlatformModels.AutocompleteUpsertResponseSchema> createAutocompleteSettings(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body CatalogPlatformModels.AutocompleteRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings")
    Call<CatalogPlatformModels.AutocompleteResponseSchema> getAutocompleteSettings(@Path("application_id") String applicationId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/settings/{id}")
    Call<CatalogPlatformModels.AutocompleteUpsertResponseSchema> updateAutocompleteSettings(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Path("id") String id, @Body CatalogPlatformModels.AutocompleteRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/preview")
    Call<CatalogPlatformModels.AutocompletePreviewResponseSchema> getAutocompletePreview(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("q") String q, @Query("category_suggestion") Integer categorySuggestion, @Query("brand_suggestion") Integer brandSuggestion, @Query("collection_suggestion") Integer collectionSuggestion, @Query("product_suggestion") Integer productSuggestion, @Query("query_suggestion") Integer querySuggestion, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> createMerchandisingRulePinAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PinRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> updateMerchandisingRulePinAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PinRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/pin")
    Call<CatalogPlatformModels.PinResponse> getMerchandisingRulePinAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> createMerchandisingRuleHideAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.HideRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> updateMerchandisingRuleHideAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.HideRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/hide")
    Call<CatalogPlatformModels.HideResponse> getMerchandisingRuleHideAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> createMerchandisingRuleBoostAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PostMerchandisingRuleBoostAction payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> updateMerchandisingRuleBoostAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PostMerchandisingRuleBoostAction payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/boost")
    Call<CatalogPlatformModels.GetMerchandisingRuleBoostAction> getMerchandisingRuleBoostAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> createMerchandisingRuleBuryAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PostMerchandisingRuleBoostAction payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> updateMerchandisingRuleBuryAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.PostMerchandisingRuleBoostAction payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/bury")
    Call<CatalogPlatformModels.GetMerchandisingRuleBuryAction> getMerchandisingRuleBuryAction(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/query")
    Call<CatalogPlatformModels.MerchandiseQueryResponse> createMerchandisingRuleQuery(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.MerchandisingRuleQueryPost payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/query")
    Call<CatalogPlatformModels.SearchResponseSchema> getMerchandisingQuery(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/query")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> updateMerchandisingRuleQuery(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.MerchandisingRuleQueryPost payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> saveMerchandisingRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Body CatalogPlatformModels.MerchandisingRuleSave payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> deleteMerchandisingRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules")
    Call<CatalogPlatformModels.MerchandisingRulesList> getMerchandisingRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/preview")
    Call<CatalogPlatformModels.SuccessResponseMerchandising> deleteMerchandisingRulesPreview(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/merchandise/rules/{merchandising_rule_id}/preview")
    Call<CatalogPlatformModels.ProductListingResponse> getLivePreview(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("merchandising_rule_id") String merchandisingRuleId, @Query("search_keyword") String searchKeyword, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory")
    Call<CatalogPlatformModels.CreateAppPriceFactoryResponse> createAppPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateAppPriceFactoryRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory")
    Call<CatalogPlatformModels.GetAppPriceFactoryResponse> getAppPriceFactories(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("is_active") Boolean isActive, @Query("factory_type_id") String factoryTypeId, @Query("code") String code, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}")
    Call<CatalogPlatformModels.AppPriceFactory> getAppPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}")
    Call<CatalogPlatformModels.AppPriceFactory> editAppPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.EditAppPriceFactoryRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/products")
    Call<CatalogPlatformModels.CreatePriceFactoryProductResponse> addProductsInPriceFactoryByZoneId(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreatePriceFactoryProductRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/products")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductsResponse> getProductsInPriceFactoryByZoneId(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("zone_id") String zoneId, @Query("item_id") Double itemId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponse> createProductPriceFactoryBulkJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/poll/{job_id}")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobPollResponse> pollProductPriceFactoryBulkJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Path("job_id") String jobId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk/{job_id}/validate")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobValidateResponse> validateProductPriceFactoryBulkJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Path("job_id") String jobId, @Body CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/bulk/{job_id}/process")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponse> processProductPriceFactoryBulkJob(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Path("job_id") String jobId, @Body CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/export")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductExportJobResponse> exportProductsInPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateAppPriceFactoryProductExportJobRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/owner-application/{application_id}/price-factory/{id}/poll")
    Call<CatalogPlatformModels.CreateAppPriceFactoryProductExportJobPollResponse> pollPriceFactoryJobs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("stage") List<String> stage, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("type") List<String> type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-prices")
    Call<CatalogPlatformModels.ProductPrices> getAppProductPrices(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("item_ids") List<Integer> itemIds, @Query("factory_type_ids") List<String> factoryTypeIds, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonyms")
    Call<CatalogPlatformModels.SynonymListResponseSchema> getSynonyms(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @Query("name") String name, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonyms")
    Call<CatalogPlatformModels.SynonymCreateResponseSchema> createSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body CatalogPlatformModels.SynonymCreateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonym/{id}")
    Call<CatalogPlatformModels.SynonymUpdateResponseSchema> updateSynonyms(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.SynonymCreateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/synonym")
    Call<CatalogPlatformModels.SynonymDeleteResponseSchema> deleteSynonym(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/export")
    Call<CatalogPlatformModels.SynonymExportResponseSchema> exportSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/sample")
    Call<String> sampleBulkSynonymsFile(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk")
    Call<CatalogPlatformModels.SynonymUploadResponseSchema> uploadSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body CatalogPlatformModels.SynonymUploadRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/validate")
    Call<CatalogPlatformModels.SynonymBulkValidateResponseSchema> validateBulkSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body CatalogPlatformModels.SynonymBulkValidateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/bulk/process")
    Call<CatalogPlatformModels.SynonymBulkProcessResponseSchema> processBulkSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Body CatalogPlatformModels.SynonymBulkProcessRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/poll/{id}")
    Call<CatalogPlatformModels.SynonymBulkPollResponseSchema> pollBulkSynonyms(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/poc")
    Call<CatalogPlatformModels.CompanyDRIListResponseSchema> getCompanyBrandsDRI(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/location/tags")
    Call<CatalogPlatformModels.StoreTagsResponseSchema> getLocationTags(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/item/{item_id}/price")
    Call<CatalogPlatformModels.AppPriceByIdResponse> getAppPriceById(@Path("application_id") String applicationId, @Path("company_id") String companyId, @Path("item_id") Integer itemId, @Query("store_ids") List<Integer> storeIds, @Query("factory_type_ids") List<String> factoryTypeIds, @Query("seller_id") Integer sellerId, @HeaderMap Map<String, String> requestHeaders);
}