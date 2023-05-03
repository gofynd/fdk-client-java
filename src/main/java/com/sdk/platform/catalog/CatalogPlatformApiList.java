package com.sdk.platform.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CatalogPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.GetSearchWordsDetailResponse> getSearchKeywords(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.GetSearchWordsData> updateSearchKeywords(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CatalogPlatformModels.CreateSearchKeyword payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<CatalogPlatformModels.DeleteResponse> deleteSearchKeywords(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<CatalogPlatformModels.GetSearchWordsResponse> getAllSearchKeyword(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<CatalogPlatformModels.GetSearchWordsData> createCustomKeyword(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.CreateSearchKeyword payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponse> getAutocompleteKeywordDetail(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponse> updateAutocompleteKeyword(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CatalogPlatformModels.CreateAutocompleteKeyword payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<CatalogPlatformModels.DeleteResponse> deleteAutocompleteKeyword(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<CatalogPlatformModels.GetAutocompleteWordsResponse> getAutocompleteConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<CatalogPlatformModels.CreateAutocompleteWordsResponse> createCustomAutocompleteRule(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.CreateAutocompleteKeyword payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    Call<CatalogPlatformModels.GetProductBundleListingResponse> getProductBundle(@Path("company_id")  String companyId , @Query("q") String  q ,  @Query("slug") List<String>  slug );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    Call<CatalogPlatformModels.GetProductBundleCreateResponse> createProductBundle(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.ProductBundleRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    Call<CatalogPlatformModels.GetProductBundleResponse> getProductBundleDetail(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    Call<CatalogPlatformModels.GetProductBundleCreateResponse> updateProductBundle(@Path("company_id")  String companyId , @Path("id") String  id ,@Body CatalogPlatformModels.ProductBundleUpdateRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.ListSizeGuide> getSizeGuides(@Path("company_id")  String companyId , @Query("active") Boolean  active ,  @Query("q") String  q ,  @Query("tag") String  tag ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<CatalogPlatformModels.SuccessResponse> createSizeGuide(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.ValidateSizeGuide payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<CatalogPlatformModels.SizeGuideResponse> getSizeGuide(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<CatalogPlatformModels.SuccessResponse> updateSizeGuide(@Path("company_id")  String companyId , @Path("id") String  id ,@Body CatalogPlatformModels.ValidateSizeGuide payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    Call<CatalogPlatformModels.OwnerAppItemResponse> getAppProduct(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("item_id") String  itemId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponse1> updateAppProduct(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("item_id") String  itemId ,@Body CatalogPlatformModels.ApplicationItemMeta payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/metadata/")
    Call<CatalogPlatformModels.GetConfigMetadataResponse> getConfigurationMetadata(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Query("template_slug") String  templateSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.GetConfigResponse> getGroupConfigurations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("search") String  search ,  @Query("template_slug") String  templateSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups")
    Call<CatalogPlatformModels.AppConfigurationDetail> createGroupConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType ,@Body CatalogPlatformModels.AppConfigurationDetail payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<CatalogPlatformModels.AppConfigurationDetail> updateGroupConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Path("group_slug") String  groupSlug ,@Body CatalogPlatformModels.AppConfigurationDetail payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/groups/{group_slug}")
    Call<CatalogPlatformModels.ConfigSuccessResponse> deleteGroupConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Path("group_slug") String  groupSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    Call<CatalogPlatformModels.GetConfigResponse> getListingConfigurations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("search") String  search );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/")
    Call<CatalogPlatformModels.AppConfigurationsSort> createListingConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType ,@Body CatalogPlatformModels.AppConfigurationsSort payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    Call<CatalogPlatformModels.AppConfigurationsSort> updateListingConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Path("config_id") String  configId ,@Body CatalogPlatformModels.AppConfigurationsSort payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/{config_type}/item/{config_id}/")
    Call<CatalogPlatformModels.ConfigSuccessResponse> deleteListingConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("config_type") String  configType , @Path("config_id") String  configId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/filter/allow_single")
    Call<CatalogPlatformModels.ConfigSuccessResponse> updateAllowSingle(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.AllowSingleRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/application/{application_id}/product-configuration/sort/default_key")
    Call<CatalogPlatformModels.ConfigSuccessResponse> updateDefaultSort(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.DefaultKeyRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    Call<CatalogPlatformModels.GetCatalogConfigurationMetaData> getCatalogConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> getConfigurations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationProductListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.AppConfiguration payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<CatalogPlatformModels.GetAppCatalogEntityConfiguration> getConfigurationByType(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("type") String  type );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<CatalogPlatformModels.GetAppCatalogConfiguration> createConfigurationByType(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("type") String  type ,@Body CatalogPlatformModels.AppConfiguration payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    Call<CatalogPlatformModels.GetCollectionQueryOptionResponse> getQueryFilters(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<CatalogPlatformModels.GetCollectionListingResponse> getAllCollections(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("q") String  q ,  @Query("schedule_status") String  scheduleStatus ,  @Query("type") String  type ,  @Query("tags") List<String>  tags ,  @Query("is_active") Boolean  isActive ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<CatalogPlatformModels.CollectionCreateResponse> createCollection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body CatalogPlatformModels.CreateCollection payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    Call<CatalogPlatformModels.CollectionDetailResponse> getCollectionDetail(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<CatalogPlatformModels.UpdateCollection> updateCollection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CatalogPlatformModels.UpdateCollection payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<CatalogPlatformModels.DeleteResponse> deleteCollection(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    Call<CatalogPlatformModels.GetCollectionItemsResponse> getCollectionItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id , @Query("sort_on") String  sortOn ,  @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    Call<CatalogPlatformModels.UpdatedResponse> addCollectionItems(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body CatalogPlatformModels.CollectionItemUpdate payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    Call<CatalogPlatformModels.CatalogInsightResponse> getCatalogInsights(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("brand") String  brand );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    Call<CatalogPlatformModels.CrossSellingResponse> getSellerInsights(@Path("company_id")  String companyId , @Path("seller_app_id") String  sellerAppId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/{marketplace}/optin/")
    Call<CatalogPlatformModels.UpdatedResponse> createMarketplaceOptin(@Path("company_id")  String companyId , @Path("marketplace") String  marketplace ,@Body CatalogPlatformModels.OptInPostRequest payload);
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    Call<CatalogPlatformModels.GetOptInPlatform> getMarketplaceOptinDetail(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    Call<CatalogPlatformModels.OptinCompanyDetail> getCompanyDetail(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    Call<CatalogPlatformModels.OptinCompanyBrandDetailsView> getCompanyBrandDetail(@Path("company_id")  String companyId , @Query("is_active") Boolean  isActive ,  @Query("q") String  q ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("marketplace") String  marketplace );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    Call<CatalogPlatformModels.OptinCompanyMetrics> getCompanyMetrics(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    Call<CatalogPlatformModels.OptinStoreDetails> getStoreDetail(@Path("company_id")  String companyId , @Query("q") String  q ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    Call<CatalogPlatformModels.GenderDetail> getGenderAttribute(@Path("company_id")  String companyId , @Path("attribute_slug") String  attributeSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    Call<CatalogPlatformModels.ProdcutTemplateCategoriesResponse> listProductTemplateCategories(@Path("company_id")  String companyId , @Query("departments") String  departments ,  @Query("item_type") String  itemType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    Call<CatalogPlatformModels.DepartmentsResponse> listDepartmentsData(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("item_type") String  itemType ,  @Query("page_size") Integer  pageSize ,  @Query("name") String  name ,  @Query("search") String  search ,  @Query("is_active") Boolean  isActive );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    Call<CatalogPlatformModels.DepartmentCreateResponse> createDepartments(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.DepartmentCreateUpdate payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    Call<CatalogPlatformModels.DepartmentsResponse> getDepartmentData(@Path("company_id")  String companyId , @Path("uid") String  uid );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    Call<CatalogPlatformModels.DepartmentModel> updateDepartment(@Path("company_id")  String companyId , @Path("uid") String  uid ,@Body CatalogPlatformModels.DepartmentCreateUpdate payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    Call<CatalogPlatformModels.TemplatesResponse> listProductTemplate(@Path("company_id")  String companyId , @Query("department") String  department );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    Call<CatalogPlatformModels.TemplatesValidationResponse> validateProductTemplate(@Path("company_id")  String companyId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    Call<String> downloadProductTemplateViews(@Path("company_id")  String companyId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    Call<String> downloadInventoryTemplateView(@Path("company_id")  String companyId , @Query("item_type") String  itemType );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    Call<CatalogPlatformModels.InventoryValidationResponse> validateProductTemplateSchema(@Path("company_id")  String companyId , @Query("item_type") String  itemType );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    Call<CatalogPlatformModels.HSNCodesResponse> listHSNCodes(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponse> listProductTemplateExportDetails(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponse> getProductExportJobs(@Path("company_id")  String companyId , @Query("status") String  status ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("q") String  q );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/downloads/")
    Call<CatalogPlatformModels.ProductDownloadsResponse> createProductExportJob(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.ProductTemplateDownloadsExport payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    Call<CatalogPlatformModels.ProductConfigurationDownloads> listTemplateBrandTypeValues(@Path("company_id")  String companyId , @Query("filter") String  filter ,  @Query("template_tag") String  templateTag ,  @Query("item_type") String  itemType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    Call<CatalogPlatformModels.CategoryResponse> listCategories(@Path("company_id")  String companyId , @Query("level") String  level ,  @Query("departments") String  departments ,  @Query("q") String  q ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    Call<CatalogPlatformModels.CategoryCreateResponse> createCategories(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.CategoryRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    Call<CatalogPlatformModels.SingleCategoryResponse> getCategoryData(@Path("company_id")  String companyId , @Path("uid") String  uid );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    Call<CatalogPlatformModels.CategoryUpdateResponse> updateCategory(@Path("company_id")  String companyId , @Path("uid") String  uid ,@Body CatalogPlatformModels.CategoryRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    Call<CatalogPlatformModels.ProductListingResponseV2> getProducts(@Path("company_id")  String companyId , @Query("brand_ids") List<Integer>  brandIds ,  @Query("category_ids") List<Integer>  categoryIds ,  @Query("item_ids") List<Integer>  itemIds ,  @Query("department_ids") List<Integer>  departmentIds ,  @Query("item_code") List<String>  itemCode ,  @Query("q") String  q ,  @Query("tags") List<String>  tags ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/")
    Call<CatalogPlatformModels.SuccessResponse> createProduct(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.ProductCreateUpdateSchemaV2 payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/variants/{variant_type}")
    Call<CatalogPlatformModels.ProductVariantsResponse> getVariantsOfProducts(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("variant_type") String  variantType , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/")
    Call<CatalogPlatformModels.ProductAttributesResponse> getProductAttributes(@Path("company_id")  String companyId , @Query("category") String  category ,  @Query("filter") Boolean  filter );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SingleProductResponse> getProduct(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Query("brand_uid") Integer  brandUid ,  @Query("item_code") String  itemCode );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponse> editProduct(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId ,@Body CatalogPlatformModels.ProductCreateUpdateSchemaV2 payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/")
    Call<CatalogPlatformModels.SuccessResponse> deleteProduct(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/all_sizes")
    Call<CatalogPlatformModels.GetAllSizes> allSizes(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    Call<CatalogPlatformModels.ValidateProduct> getProductValidation(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    Call<CatalogPlatformModels.ProductListingResponse> getProductSize(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Query("item_code") String  itemCode ,  @Query("brand_uid") Integer  brandUid ,  @Query("uid") Integer  uid );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.ProductBulkRequestList> getProductBulkUploadHistory(@Path("company_id")  String companyId , @Query("search") String  search ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.BulkResponse> createBulkProductUploadJob(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.BulkJob payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/bulk")
    Call<CatalogPlatformModels.BulkResponse> uploadBulkProducts(@Path("company_id")  String companyId , @Query("department") String  department ,  @Query("product_type") String  productType ,@Body CatalogPlatformModels.BulkJob payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> createProductsInBulk(@Path("company_id")  String companyId , @Path("batch_id") String  batchId ,@Body CatalogPlatformModels.BulkProductRequest payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<CatalogPlatformModels.SuccessResponse> deleteProductBulkJob(@Path("company_id")  String companyId , @Path("batch_id") Integer  batchId );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    Call<CatalogPlatformModels.ProductTagsViewResponse> getProductTags(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<CatalogPlatformModels.BulkAssetResponse> getProductAssetsInBulk(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<CatalogPlatformModels.SuccessResponse> createProductAssetsInBulk(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.ProductBulkAssets payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.ProductSizeDeleteResponse> deleteSize(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("size") String  size );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.InventoryResponsePaginated> getInventoryBySize(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("size") String  size , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("sellable") Boolean  sellable );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<CatalogPlatformModels.SuccessResponse> addInventory(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("size") String  size ,@Body CatalogPlatformModels.InventoryRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getInventoryBySizeIdentifier(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("size_identifier") String  sizeIdentifier , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("location_ids") List<Integer>  locationIds );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventories")
    Call<CatalogPlatformModels.GetInventoriesResponse> getInventories(@Path("company_id")  String companyId , @Query("item_id") String  itemId ,  @Query("size") String  size ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("sellable") Boolean  sellable ,  @Query("store_ids") List<Integer>  storeIds ,  @Query("size_identifier") String  sizeIdentifier );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{item_id}/inventory/{size_identifier}")
    Call<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getDiscountedInventoryBySizeIdentifier(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("item_id") Integer  itemId , @Path("size_identifier") String  sizeIdentifier , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("location_ids") List<Integer>  locationIds );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/location/{location_id}/")
    Call<CatalogPlatformModels.SuccessResponse> deleteInventory(@Path("company_id")  String companyId , @Path("size") String  size , @Path("item_id") Integer  itemId , @Path("location_id") Double  locationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<CatalogPlatformModels.BulkInventoryGet> getInventoryBulkUploadHistory(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<CatalogPlatformModels.BulkResponse> createBulkInventoryJob(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.BulkJob payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<CatalogPlatformModels.SuccessResponse> createBulkInventory(@Path("company_id")  String companyId , @Path("batch_id") String  batchId ,@Body CatalogPlatformModels.InventoryBulkRequest payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<CatalogPlatformModels.SuccessResponse> deleteBulkInventoryJob(@Path("company_id")  String companyId , @Path("batch_id") String  batchId );
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportJob> getInventoryExport(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportResponse> createInventoryExportJob(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.InventoryExportRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportJobListResponse> listInventoryExport(@Path("company_id")  String companyId , @Query("status") String  status ,  @Query("from_date") String  fromDate ,  @Query("to_date") String  toDate ,  @Query("q") String  q );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/download/")
    Call<CatalogPlatformModels.InventoryExportResponse> createInventoryExport(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.InventoryCreateRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    Call<CatalogPlatformModels.InventoryConfig> exportInventoryConfig(@Path("company_id")  String companyId , @Query("filter_type") String  filterType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    Call<CatalogPlatformModels.InventoryUpdateResponse> updateRealtimeInventory(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("seller_identifier") String  sellerIdentifier ,@Body CatalogPlatformModels.InventoryRequestSchemaV2 payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/catalog/v2.0/company/{company_id}/products/{item_id}/inventory/{seller_identifier}/")
    Call<CatalogPlatformModels.InventoryUpdateResponse> deleteRealtimeInventory(@Path("company_id")  String companyId , @Path("item_id") Integer  itemId , @Path("seller_identifier") String  sellerIdentifier ,@Body CatalogPlatformModels.InventoryRequestSchemaV2 payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v2.0/company/{company_id}/inventory/")
    Call<CatalogPlatformModels.InventoryUpdateResponse> updateInventories(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.InventoryRequestSchemaV2 payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<CatalogPlatformModels.HsnCode> getHsnCode(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<CatalogPlatformModels.HsnCode> updateHsnCode(@Path("company_id")  String companyId , @Path("id") String  id ,@Body CatalogPlatformModels.HsnUpsert payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    Call<CatalogPlatformModels.BulkHsnResponse> bulkHsnCode(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.BulkHsnUpsert payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/")
    Call<CatalogPlatformModels.HsnCodesListingResponseSchemaV2> getAllProductHsnCodes(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("type") String  type );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v2.0/company/{company_id}/hsn/{reporting_hsn}")
    Call<CatalogPlatformModels.HSNDataInsertV2> getSingleProductHSNCode(@Path("reporting_hsn") String  reportingHsn , @Path("company_id")  String companyId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    Call<CatalogPlatformModels.BrandListingResponse> getApplicationBrands(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("department") String  department ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q ,  @Query("brand_id") List<Integer>  brandId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    Call<CatalogPlatformModels.DepartmentResponse> getDepartments(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    Call<CatalogPlatformModels.CategoryListingResponse> getCategories(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("department") String  department );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    Call<CatalogPlatformModels.ApplicationProductListingResponse> getAppicationProducts(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("q") String  q ,  @Query("f") String  f ,  @Query("c") String  c ,  @Query("filters") Boolean  filters ,  @Query("is_dependent") Boolean  isDependent ,  @Query("sort_on") String  sortOn ,  @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo ,  @Query("page_type") String  pageType ,  @Query("item_ids") List<Integer>  itemIds );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    Call<CatalogPlatformModels.ProductDetail> getProductDetailBySlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    Call<CatalogPlatformModels.ProductListingResponse> getAppProducts(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("brand_ids") List<Integer>  brandIds ,  @Query("category_ids") List<Integer>  categoryIds ,  @Query("department_ids") List<Integer>  departmentIds ,  @Query("tags") List<String>  tags ,  @Query("is_dependent") Boolean  isDependent ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/inventory/")
    Call<CatalogPlatformModels.InventoryStockResponse> getAppInventory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("item_ids") List<Integer>  itemIds ,  @Query("store_ids") List<Integer>  storeIds ,  @Query("brand_ids") List<Integer>  brandIds ,  @Query("seller_identifiers") List<String>  sellerIdentifiers ,  @Query("timestamp") String  timestamp ,  @Query("page_size") Integer  pageSize ,  @Query("page_id") String  pageId );
    
    
    
    
    
    
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    Call<CatalogPlatformModels.StoreAssignResponse> getOptimalLocations(@Path("company_id")  String companyId ,@Body CatalogPlatformModels.AssignStore payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/locations")
    Call<CatalogPlatformModels.LocationListSerializer> getAppLocations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("store_type") String  storeType ,  @Query("uid") List<Integer>  uid ,  @Query("q") String  q ,  @Query("stage") String  stage ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand")
    Call<CatalogPlatformModels.BrandListingResponse> getApplicationBrandListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brand/{brand_uid}")
    Call<CatalogPlatformModels.SuccessResponse1> updateAppBrand(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("brand_uid") String  brandUid ,@Body CatalogPlatformModels.ApplicationBrandJson payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category")
    Call<CatalogPlatformModels.BrandListingResponse> getApplicationCategoryListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("department_id") Integer  departmentId ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/category/{category_uid}")
    Call<CatalogPlatformModels.SuccessResponse1> updateAppCategory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("category_uid") String  categoryUid ,@Body CatalogPlatformModels.ApplicationCategoryJson payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department")
    Call<CatalogPlatformModels.ApplicationDepartmentListingResponse> getApplicationDepartmentListing(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/department/{department_uid}")
    Call<CatalogPlatformModels.SuccessResponse1> updateAppDepartment(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("department_uid") String  departmentUid ,@Body CatalogPlatformModels.ApplicationDepartmentJson payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/store/{store_uid}")
    Call<CatalogPlatformModels.SuccessResponse1> updateAppLocation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("store_uid") String  storeUid ,@Body CatalogPlatformModels.ApplicationStoreJson payload);
    
}