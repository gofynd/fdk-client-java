package com.sdk.platform.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CatalogPlatformApiList {

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    Call<CatalogPlatformModels.CatalogInsightResponseSchema> getCatalogInsights(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("brand") String brand, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    Call<CatalogPlatformModels.ApplicationBrandListingSchema> getApplicationBrandListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppBrand(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("brand_uid") Integer brandUid, @Body CatalogPlatformModels.ApplicationBrandJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    Call<CatalogPlatformModels.BrandListingResponseSchema> getApplicationBrands(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department") String department, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("brand_id") List<Integer> brandId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    Call<CatalogPlatformModels.CategoryListingResponseSchema> getCategories(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department") String department, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    Call<CatalogPlatformModels.ApplicationCategoryListingSchema> getApplicationCategoryListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("department_id") Integer departmentId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppCategory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("category_uid") String categoryUid, @Body CatalogPlatformModels.ApplicationCategoryJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<CatalogPlatformModels.GetCollectionListingResponseSchema> getAllCollections(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("schedule_status") String scheduleStatus, @Query("type") String type, @Query("tags") List<String> tags, @Query("is_active") Boolean isActive, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<CatalogPlatformModels.CollectionCreateResponseSchema> createCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("schedule_status") String scheduleStatus, @Query("type") String type, @Query("tags") List<String> tags, @Query("is_active") Boolean isActive, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body CatalogPlatformModels.CreateCollection payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/{filter_key}/values")
    Call<CatalogPlatformModels.GetQueryFiltersValuesResponseSchema> getApplicationFilterValues(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("filter_key") String filterKey, @Query("c") String c, @Query("collection_id") String collectionId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/filter-options/keys")
    Call<CatalogPlatformModels.GetQueryFiltersKeysResponseSchema> getApplicationFilterKeys(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("c") String c, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    Call<CatalogPlatformModels.GetQueryFiltersResponseSchema> getQueryFilters(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<CatalogPlatformModels.CommonResponseSchemaCollection> deleteCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<CatalogPlatformModels.UpdateCollection> updateCollection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.UpdateCollection payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    Call<CatalogPlatformModels.CommonResponseSchemaCollection> addCollectionItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CollectionItemUpdateSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/collections/{collection_id}/items/")
    Call<CatalogPlatformModels.GetCollectionItemsResponseSchemaV2> getCollectionItems(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("collection_id") String collectionId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    Call<CatalogPlatformModels.GetCollectionDetailResponseSchema> getCollectionDetail(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    Call<CatalogPlatformModels.ApplicationDepartmentListingResponseSchema> getApplicationDepartmentListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppDepartment(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("department_uid") Integer departmentUid, @Body CatalogPlatformModels.ApplicationDepartmentJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    Call<CatalogPlatformModels.DepartmentResponseSchema> getDepartments(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    Call<CatalogPlatformModels.InventoryStockResponseSchema> getAppInventory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("item_ids") List<Integer> itemIds, @Query("store_ids") List<Integer> storeIds, @Query("brand_ids") List<Integer> brandIds, @Query("seller_identifiers") List<String> sellerIdentifiers, @Query("timestamp") String timestamp, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @Query("qty_gt") Integer qtyGt, @Query("qty_lt") Integer qtyLt, @Query("qty_type") String qtyType, @Query("from_date") String fromDate, @Query("to_date") String toDate, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/locations")
    Call<CatalogPlatformModels.LocationListSchema> getAppLocations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("store_type") String storeType, @Query("uid") List<Integer> uid, @Query("q") String q, @Query("stage") String stage, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tags") List<String> tags, @Query("store_types") List<String> storeTypes, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> getConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationProductListing(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.AppConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    Call<CatalogPlatformModels.GetCatalogConfigurationMetaData> getCatalogConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<CatalogPlatformModels.GetAppCatalogEntityConfiguration> getConfigurationByType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("type") String type, @Query("include_inactive") Boolean includeInactive, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationByType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("type") String type, @Body CatalogPlatformModels.AppConfiguration payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    Call<CatalogPlatformModels.OwnerAppItemResponseSchema> getAppProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") String itemId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.ApplicationItemMeta payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    Call<CatalogPlatformModels.ApplicationProductListingResponseSchema> getApplicationProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("f") String f, @Query("c") String c, @Query("filters") Boolean filters, @Query("is_dependent") Boolean isDependent, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @Query("page_type") String pageType, @Query("item_ids") List<String> itemIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated> getDiscountedInventoryBySizeIdentifier(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("item_id") Integer itemId, @Path("size_identifier") Integer sizeIdentifier, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("location_ids") List<Integer> locationIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    Call<CatalogPlatformModels.ProductDetail> getProductDetailBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    Call<CatalogPlatformModels.RawProductListingResponseSchema> getAppProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("brand_ids") List<Integer> brandIds, @Query("category_ids") List<Integer> categoryIds, @Query("department_ids") List<Integer> departmentIds, @Query("tags") List<String> tags, @Query("item_ids") List<Integer> itemIds, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/price")
    Call<CatalogPlatformModels.AppProductPricesSchema> getAppProductPrices(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("item_ids") List<Integer> itemIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.AppReturnConfigResponseSchema> getAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.SuccessResponseObject> createAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateUpdateAppReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateUpdateAppReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponseSchema> deleteAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.DeleteAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.BaseAppCategoryReturnConfigResponseSchema> getAppCategoryReturnConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponseObject> createAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.BaseAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/return-config/categories")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateAppCategoryReturnConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.BaseAppCategoryReturnConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponseSchema> getAutocompleteConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<CatalogPlatformModels.CreateAutocompleteWordsResponseSchema> createCustomAutocompleteRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateAutocompleteKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.DeleteResponseSchema> deleteAutocompleteKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponseSchema> getAutocompleteKeywordDetail(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponseSchema> updateAutocompleteKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateAutocompleteKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    Call<CatalogPlatformModels.DeleteSearchConfigurationResponseSchema> deleteSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    Call<CatalogPlatformModels.GetSearchConfigurationResponseSchema> getSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    Call<CatalogPlatformModels.CreateSearchConfigurationResponseSchema> createSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateSearchConfigurationRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/configuration/")
    Call<CatalogPlatformModels.UpdateSearchConfigurationResponseSchema> updateSearchConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.UpdateSearchConfigurationRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<CatalogPlatformModels.GetSearchWordsResponseSchema> getAllSearchKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<CatalogPlatformModels.GetSearchWordsData> createCustomKeyword(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreateSearchKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.DeleteResponseSchema> deleteSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.GetSearchWordsDetailResponseSchema> getSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.GetSearchWordsData> updateSearchKeywords(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body CatalogPlatformModels.CreateSearchKeyword payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    Call<CatalogPlatformModels.SuccessResponseObject> updateAppLocation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("store_uid") Integer storeUid, @Body CatalogPlatformModels.ApplicationStoreJson payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    Call<CatalogPlatformModels.CategoryResponseSchema> listCategories(@Path("company_id") String companyId, @Query("level") List<Integer> level, @Query("department") Integer department, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("uids") List<Integer> uids, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    Call<CatalogPlatformModels.SingleCategoryResponseSchema> getCategoryData(@Path("company_id") String companyId, @Path("uid") String uid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    Call<CatalogPlatformModels.CrossSellingResponseSchema> getSellerInsights(@Path("company_id") String companyId, @Path("seller_app_id") String sellerAppId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    Call<CatalogPlatformModels.DepartmentsResponseSchema> listDepartmentsData(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("item_type") String itemType, @Query("page_size") Integer pageSize, @Query("name") String name, @Query("search") String search, @Query("is_active") Boolean isActive, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    Call<CatalogPlatformModels.DepartmentsResponseSchema> getDepartmentData(@Path("company_id") String companyId, @Path("uid") String uid, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    Call<CatalogPlatformModels.ProductConfigurationDownloads> listTemplateBrandTypeValues(@Path("company_id") String companyId, @Query("filter") String filter, @Query("template_tag") String templateTag, @Query("item_type") String itemType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    Call<CatalogPlatformModels.BulkHsnResponseSchema> bulkHsnCode(@Path("company_id") String companyId, @Body CatalogPlatformModels.BulkHsnUpsert payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<CatalogPlatformModels.HsnCode> getHsnCode(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<CatalogPlatformModels.HsnCode> updateHsnCode(@Path("company_id") String companyId, @Path("id") String id, @Body CatalogPlatformModels.HsnUpsert payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    Call<CatalogPlatformModels.GetInventoriesResponseSchema> getInventories(@Path("company_id") String companyId, @Query("item_id") String itemId, @Query("size") String size, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("page_id") String pageId, @Query("page_type") String pageType, @Query("q") String q, @Query("sellable") Boolean sellable, @Query("store_ids") List<Integer> storeIds, @Query("brand_ids") List<Integer> brandIds, @Query("seller_identifiers") List<String> sellerIdentifiers, @Query("qty_gt") Integer qtyGt, @Query("qty_lt") Integer qtyLt, @Query("qty_type") String qtyType, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("size_identifier") String sizeIdentifier, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<CatalogPlatformModels.BulkInventoryGet> getInventoryBulkUploadHistory(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search") String search, @Query("start_date") String startDate, @Query("end_date") String endDate, @Query("stage") String stage, @Query("tags") String tags, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<CatalogPlatformModels.BulkResponseSchema> createBulkInventoryJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.BulkInventoryJob payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> deleteBulkInventoryJob(@Path("company_id") String companyId, @Path("batch_id") String batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> createBulkInventory(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Body CatalogPlatformModels.InventoryBulkRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportJob> getInventoryExport(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportResponseSchema> createInventoryExportJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryExportRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    Call<CatalogPlatformModels.InventoryConfig> exportInventoryConfig(@Path("company_id") String companyId, @Query("filter_type") String filterType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    Call<String> downloadInventoryTemplateView(@Path("company_id") String companyId, @Query("schema_type") String schemaType, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    Call<CatalogPlatformModels.InventoryValidationResponseSchema> validateProductTemplateSchema(@Path("company_id") String companyId, @Query("item_type") String itemType, @Query("schema_type") String schemaType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    Call<CatalogPlatformModels.GetOptInPlatform> getMarketplaceOptinDetail(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    Call<CatalogPlatformModels.OptinCompanyBrandDetailsView> getCompanyBrandDetail(@Path("company_id") String companyId, @Query("is_active") Boolean isActive, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("marketplace") String marketplace, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/company-details/")
    Call<CatalogPlatformModels.OptinCompanyDetail> getCompanyDetail(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    Call<CatalogPlatformModels.OptinCompanyMetrics> getCompanyMetrics(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/marketplaces/location-details/")
    Call<CatalogPlatformModels.OptinStoreDetails> getStoreDetail(@Path("company_id") String companyId, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    Call<CatalogPlatformModels.ProductAttributesResponseSchema> getProductAttributes(@Path("company_id") String companyId, @Query("category") String category, @Query("filter") Boolean filter, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    Call<CatalogPlatformModels.AttributeDetail> getAttribute(@Path("company_id") String companyId, @Path("attribute_slug") String attributeSlug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<CatalogPlatformModels.BulkAssetResponseSchema> getProductAssetsInBulk(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<CatalogPlatformModels.SuccessResponseSchema> createProductAssetsInBulk(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductBulkAssets payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.ProductBulkRequestList> getProductBulkUploadHistory(@Path("company_id") String companyId, @Query("search") String search, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.BulkResponseSchema> createBulkProductUploadJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.BulkJob payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> deleteProductBulkJob(@Path("company_id") String companyId, @Path("batch_id") Integer batchId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> createProductsInBulk(@Path("company_id") String companyId, @Path("batch_id") String batchId, @Body CatalogPlatformModels.BulkProductRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponseSchema> listProductTemplateExportDetails(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    Call<CatalogPlatformModels.HSNCodesResponseSchema> listHSNCodes(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    Call<CatalogPlatformModels.ProductTagsViewResponseSchema> getProductTags(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    Call<CatalogPlatformModels.TemplatesResponseSchema> listProductTemplate(@Path("company_id") String companyId, @Query("department") String department, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    Call<CatalogPlatformModels.ProdcutTemplateCategoriesResponseSchema> listProductTemplateCategories(@Path("company_id") String companyId, @Query("departments") String departments, @Query("item_type") String itemType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    Call<String> downloadProductTemplateViews(@Path("company_id") String companyId, @Path("slug") String slug, @Query("item_type") String itemType, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    Call<CatalogPlatformModels.TemplatesValidationResponseSchema> validateProductTemplate(@Path("company_id") String companyId, @Path("slug") String slug, @Query("item_type") String itemType, @Query("bulk") Boolean bulk, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/validation/schema/")
    Call<CatalogPlatformModels.TemplatesGlobalValidationResponseSchema> validateProductGlobalTemplate(@Path("company_id") String companyId, @Query("item_type") String itemType, @Query("bulk") Boolean bulk, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    Call<CatalogPlatformModels.ValidateProduct> getProductValidation(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getInventoryBySizeIdentifier(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size_identifier") String sizeIdentifier, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("location_ids") List<Integer> locationIds, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    Call<CatalogPlatformModels.ProductListingResponseSchema> getProductSize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Query("item_code") String itemCode, @Query("brand_uid") Integer brandUid, @Query("uid") Integer uid, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.ProductSizeDeleteResponseSchema> deleteSize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size") String size, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.InventoryResponsePaginated> getInventoryBySize(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size") String size, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("sellable") Boolean sellable, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.SuccessResponseSchema> addInventory(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("size") String size, @Body CatalogPlatformModels.InventoryRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    Call<CatalogPlatformModels.ProductVariantsResponseSchema> getVariantsOfProducts(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("variant_type") String variantType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.ListSizeGuide> getSizeGuides(@Path("company_id") String companyId, @Query("active") Boolean active, @Query("q") String q, @Query("tag") String tag, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("brand_id") Integer brandId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.SuccessResponseSchema> createSizeGuide(@Path("company_id") String companyId, @Body CatalogPlatformModels.ValidateSizeGuide payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<CatalogPlatformModels.SizeGuideResponseSchema> getSizeGuide(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> updateSizeGuide(@Path("company_id") String companyId, @Path("id") String id, @Body CatalogPlatformModels.ValidateSizeGuide payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    Call<CatalogPlatformModels.ConfigSuccessResponseSchema> updateAllowSingle(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.AllowSingleRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    Call<CatalogPlatformModels.ConfigSuccessResponseSchema> updateDefaultSort(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.DefaultKeyRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    Call<CatalogPlatformModels.GetConfigResponseSchema> getListingConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    Call<CatalogPlatformModels.AppConfigurationsSort> createListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body CatalogPlatformModels.AppConfigurationsSort payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.GetConfigResponseSchema> getGroupConfigurations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("search") String search, @Query("template_slug") String templateSlug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.AppConfigurationDetail> createGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Body CatalogPlatformModels.AppConfigurationDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<CatalogPlatformModels.ConfigSuccessResponseSchema> deleteGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("group_slug") String groupSlug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<CatalogPlatformModels.AppConfigurationDetail> updateGroupConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("group_slug") String groupSlug, @Body CatalogPlatformModels.AppConfigurationDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    Call<CatalogPlatformModels.ConfigSuccessResponseSchema> deleteListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("config_id") String configId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    Call<CatalogPlatformModels.AppConfigurationsSort> updateListingConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Path("config_id") String configId, @Body CatalogPlatformModels.AppConfigurationsSort payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    Call<CatalogPlatformModels.GetConfigMetadataResponseSchema> getConfigurationMetadata(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("config_type") String configType, @Query("template_slug") String templateSlug, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    Call<CatalogPlatformModels.HsnCodesListingResponseSchemaV2> getAllProductHsnCodes(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    Call<CatalogPlatformModels.HSNDataInsertV2> getSingleProductHSNCode(@Path("reporting_hsn") String reportingHsn, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    Call<CatalogPlatformModels.InventoryUpdateResponseSchema> updateInventories(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportJobListResponseSchema> listInventoryExport(@Path("company_id") String companyId, @Query("status") String status, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportResponseSchema> createInventoryExport(@Path("company_id") String companyId, @Body CatalogPlatformModels.InventoryCreateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    Call<CatalogPlatformModels.ProductListingResponseV2> getProducts(@Path("company_id") String companyId, @Query("brand_ids") List<Integer> brandIds, @Query("category_ids") List<Integer> categoryIds, @Query("item_ids") List<Integer> itemIds, @Query("department_ids") List<Integer> departmentIds, @Query("item_code") List<String> itemCode, @Query("name") String name, @Query("slug") String slug, @Query("all_identifiers") List<String> allIdentifiers, @Query("q") String q, @Query("tags") List<String> tags, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("page_type") String pageType, @Query("sort_on") String sortOn, @Query("page_id") String pageId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v3.0/company/{company_id}/products/")
    Call<CatalogPlatformModels.SuccessResponseObject> createProduct(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductCreateSchemaV3 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v3.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponseSchema> createProductExportJob(@Path("company_id") String companyId, @Body CatalogPlatformModels.ProductTemplateDownloadsExport payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponseSchema> getProductExportJobs(@Path("company_id") String companyId, @Query("status") String status, @Query("from_date") String fromDate, @Query("to_date") String toDate, @Query("q") String q, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v3.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> editProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.ProductUpdateSchemaV3 payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v3.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> partialUpdateProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.ProductPatchSchemaV3 payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponseSchema> deleteProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SingleProductResponseSchema> getProduct(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Query("brand_uid") Integer brandUid, @Query("item_code") String itemCode, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    Call<CatalogPlatformModels.GetAllSizes> allSizes(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    Call<CatalogPlatformModels.InventoryUpdateResponseSchema> deleteRealtimeInventory(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}")
    Call<CatalogPlatformModels.InventoryUpdateResponseSchema> updateRealtimeInventory(@Path("company_id") String companyId, @Path("item_id") Integer itemId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.InventoryRequestSchemaV2 payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/store/{store_id}/identifier/{seller_identifier}/price")
    Call<CatalogPlatformModels.LocationPriceQuantitySuccessResponseSchema> updateLocationPrice(@Path("company_id") String companyId, @Path("store_id") Integer storeId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.LocationPriceRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/store/{store_id}/identifier/{seller_identifier}/quantity")
    Call<CatalogPlatformModels.LocationPriceQuantitySuccessResponseSchema> updateLocationQuantity(@Path("company_id") String companyId, @Path("store_id") Integer storeId, @Path("seller_identifier") String sellerIdentifier, @Body CatalogPlatformModels.LocationQuantityRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/channel")
    Call<CatalogPlatformModels.GetAllMarketplaces> getMarketplaces(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace_slug}/opt-in")
    Call<CatalogPlatformModels.UpdateMarketplaceOptinResponseSchema> updateMarketplaceOptin(@Path("company_id") String companyId, @Path("marketplace_slug") String marketplaceSlug, @Body CatalogPlatformModels.UpdateMarketplaceOptinRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/channel/{marketplace_slug}/opt-in")
    Call<CatalogPlatformModels.CreateMarketplaceOptinResponseSchema> createMarketplaceOptin(@Path("company_id") String companyId, @Path("marketplace_slug") String marketplaceSlug, @Body CatalogPlatformModels.OptInPostRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/versions")
    Call<CatalogPlatformModels.CreateTax> createTax(@Path("company_id") String companyId, @Body CatalogPlatformModels.CreateTaxRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules")
    Call<CatalogPlatformModels.TaxRules> getAllTaxRules(@Path("company_id") String companyId, @Query("q") String q, @Query("statuses") String statuses, @Query("page") Integer page, @Query("limit") Integer limit, @Query("version_status") String versionStatus, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}")
    Call<CatalogPlatformModels.TaxRule> updateTaxRule(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body CatalogPlatformModels.UpdateTaxRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}")
    Call<Object> deleteTaxRule(@Path("rule_id") String ruleId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}/versions")
    Call<CatalogPlatformModels.TaxRuleVersion> getTaxVersionDetails(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Query("version_status") String versionStatus, @Query("q") String q, @Query("limit") String limit, @Query("page") String page, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}/versions")
    Call<CatalogPlatformModels.TaxVersion> createTaxVersion(@Path("company_id") String companyId, @Path("rule_id") String ruleId, @Body CatalogPlatformModels.CreateTaxVersionRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}/versions/{version_id}")
    Call<Object> deleteTaxVersion(@Path("rule_id") String ruleId, @Path("version_id") String versionId, @Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/taxes/rules/{rule_id}/versions/{version_id}")
    Call<CatalogPlatformModels.TaxVersion> updateTaxVersion(@Path("rule_id") String ruleId, @Path("version_id") String versionId, @Path("company_id") String companyId, @Body CatalogPlatformModels.UpdateTaxVersionRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/taxes/hscodes")
    Call<CatalogPlatformModels.HSCodes> getHsCodes(@Path("company_id") String companyId, @Query("page") Integer page, @Query("limit") Integer limit, @Query("type") CatalogPlatformModels.HsTypeEnum type, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/taxes/hscodes")
    Call<CatalogPlatformModels.HSCodeItem> createHsCode(@Path("company_id") String companyId, @Body CatalogPlatformModels.HSCodeItem payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/user/{user_id}/products/follow")
    Call<CatalogPlatformModels.FollowedProducts> getFollowedProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("user_id") String userId, @Query("page_id") String pageId, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/taxes/component-names")
    Call<CatalogPlatformModels.TaxComponentName> createTaxComponentName(@Path("company_id") String companyId, @Body CatalogPlatformModels.CreateTaxComponentNameRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/taxes/component-names")
    Call<CatalogPlatformModels.GetTaxComponents> getTaxComponentNames(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/user/{user_id}/products/{item_id}/follow")
    Call<CatalogPlatformModels.FollowProduct> followProductById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("user_id") String userId, @Path("item_id") String itemId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/user/{user_id}/products/{item_id}/follow")
    Call<CatalogPlatformModels.FollowProduct> unfollowProductById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("user_id") String userId, @Path("item_id") String itemId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/list")
    Call<CatalogPlatformModels.PriceFactoryListResponseSchema> getPriceFactories(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price")
    Call<CatalogPlatformModels.SuccessResponseSchema> createPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body CatalogPlatformModels.CreatePriceFactoryConfigSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}")
    Call<CatalogPlatformModels.PriceFactoryConfigSchema> getPriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updatePriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @Body CatalogPlatformModels.UpdatePriceFactoryConfigSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> deletePriceFactory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}/products")
    Call<CatalogPlatformModels.PriceFactoryProductListResponseSchema> getPriceFactoryProducts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @Query("brand_ids") List<Integer> brandIds, @Query("category_ids") List<Integer> categoryIds, @Query("seller_identifier") String sellerIdentifier, @Query("item_code") String itemCode, @Query("slug") String slug, @Query("name") String name, @Query("active") Boolean active, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}/products/{item_id}")
    Call<CatalogPlatformModels.PriceFactoryProductResponseSchema> getPriceFactoryProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @Path("item_id") Integer itemId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/price/{price_factory_id}/products/{item_id}")
    Call<CatalogPlatformModels.SuccessResponseSchema> updatePriceFactoryProduct(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("price_factory_id") String priceFactoryId, @Path("item_id") Integer itemId, @Body CatalogPlatformModels.UpsertPriceFactoryProductSchema payload, @HeaderMap Map<String, String> requestHeaders);
}