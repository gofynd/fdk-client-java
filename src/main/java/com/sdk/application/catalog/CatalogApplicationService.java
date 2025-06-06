package com.sdk.application.catalog;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class CatalogApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CatalogApplicationApiList catalogApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public CatalogApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.catalogApplicationApiList = generateCatalogApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getProductDetailBySlug","/service/application/catalog/v1.0/products/{slug}/".substring(1));
        relativeUrls.put("getProductSizesBySlug","/service/application/catalog/v1.0/products/{slug}/sizes/".substring(1));
        relativeUrls.put("getProductComparisonBySlugs","/service/application/catalog/v1.0/products/compare/".substring(1));
        relativeUrls.put("getSimilarComparisonProductBySlug","/service/application/catalog/v1.0/products/{slug}/similar/compare/".substring(1));
        relativeUrls.put("getComparedFrequentlyProductBySlug","/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/".substring(1));
        relativeUrls.put("getProductVariantsBySlug","/service/application/catalog/v1.0/products/{slug}/variants/".substring(1));
        relativeUrls.put("getProductStockByIds","/service/application/catalog/v1.0/products/stock-status/".substring(1));
        relativeUrls.put("getProductStockForTimeByIds","/service/application/catalog/v1.0/products/stock-status/poll/".substring(1));
        relativeUrls.put("getProducts","/service/application/catalog/v1.0/products/".substring(1));
        relativeUrls.put("getBrands","/service/application/catalog/v1.0/brands/".substring(1));
        relativeUrls.put("getBrandDetailBySlug","/service/application/catalog/v1.0/brands/{slug}/".substring(1));
        relativeUrls.put("getCategories","/service/application/catalog/v1.0/categories/".substring(1));
        relativeUrls.put("getCategoryDetailBySlug","/service/application/catalog/v1.0/categories/{slug}/".substring(1));
        relativeUrls.put("getHomeProducts","/service/application/catalog/v1.0/home/listing/".substring(1));
        relativeUrls.put("getDepartments","/service/application/catalog/v1.0/departments/".substring(1));
        relativeUrls.put("getSearchResults","/service/application/catalog/v1.0/auto-complete/".substring(1));
        relativeUrls.put("getCollections","/service/application/catalog/v1.0/collections/".substring(1));
        relativeUrls.put("getCollectionItemsBySlug","/service/application/catalog/v1.0/collections/{slug}/items/".substring(1));
        relativeUrls.put("getCollectionDetailBySlug","/service/application/catalog/v1.0/collections/{slug}/".substring(1));
        relativeUrls.put("getFollowedListing","/service/application/catalog/v1.0/follow/{collection_type}/".substring(1));
        relativeUrls.put("unfollowById","/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/".substring(1));
        relativeUrls.put("followById","/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/".substring(1));
        relativeUrls.put("getFollowerCountById","/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/".substring(1));
        relativeUrls.put("getFollowIds","/service/application/catalog/v1.0/follow/ids/".substring(1));
        relativeUrls.put("getStores","/service/application/catalog/v1.0/locations/".substring(1));
        relativeUrls.put("getInStockLocations","/service/application/catalog/v1.0/in-stock/locations/".substring(1));
        relativeUrls.put("getLocationDetailsById","/service/application/catalog/v1.0/locations/{location_id}/".substring(1));
        relativeUrls.put("getProductBundlesBySlug","/service/application/catalog/v1.0/product-grouping/".substring(1));
        relativeUrls.put("getProductPriceBySlug","/service/application/catalog/v3.0/products/{slug}/sizes/{size}/price/".substring(1));
        relativeUrls.put("getProductsServiceability","/service/application/catalog/v1.0/products/serviceability".substring(1));
        relativeUrls.put("getProductSellersBySlug","/service/application/catalog/v3.0/products/{slug}/sizes/{size}/sellers/".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private CatalogApplicationApiList generateCatalogApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CatalogApplicationApiList.class, interceptorList, cookieStore);
    }

    public CatalogApplicationModels.ProductDetail getProductDetailBySlug(String slug) throws IOException {
        return this.getProductDetailBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.ProductDetail getProductDetailBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductDetailBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductDetail> response = catalogApplicationApiList.getProductDetailBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductSizes getProductSizesBySlug(String slug, Integer storeId) throws IOException {
        return this.getProductSizesBySlug(slug, storeId, new HashMap<>());
    }

    public CatalogApplicationModels.ProductSizes getProductSizesBySlug(String slug, Integer storeId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductSizesBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductSizes> response = catalogApplicationApiList.getProductSizesBySlug(fullUrl, storeId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductsComparisonResponse getProductComparisonBySlugs(List<String> slug) throws IOException {
        return this.getProductComparisonBySlugs(slug, new HashMap<>());
    }

    public CatalogApplicationModels.ProductsComparisonResponse getProductComparisonBySlugs(List<String> slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductComparisonBySlugs");

        Response<CatalogApplicationModels.ProductsComparisonResponse> response = catalogApplicationApiList.getProductComparisonBySlugs(fullUrl, slug, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductCompareResponse getSimilarComparisonProductBySlug(String slug) throws IOException {
        return this.getSimilarComparisonProductBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.ProductCompareResponse getSimilarComparisonProductBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSimilarComparisonProductBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductCompareResponse> response = catalogApplicationApiList.getSimilarComparisonProductBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductFrequentlyComparedSimilarResponse getComparedFrequentlyProductBySlug(String slug) throws IOException {
        return this.getComparedFrequentlyProductBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.ProductFrequentlyComparedSimilarResponse getComparedFrequentlyProductBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getComparedFrequentlyProductBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductFrequentlyComparedSimilarResponse> response = catalogApplicationApiList.getComparedFrequentlyProductBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductVariantsResponse getProductVariantsBySlug(String slug) throws IOException {
        return this.getProductVariantsBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.ProductVariantsResponse getProductVariantsBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductVariantsBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductVariantsResponse> response = catalogApplicationApiList.getProductVariantsBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductStockStatusResponse getProductStockByIds(String itemId, String alu, String skuCode, String ean, String upc) throws IOException {
        return this.getProductStockByIds(itemId, alu, skuCode, ean, upc, new HashMap<>());
    }

    public CatalogApplicationModels.ProductStockStatusResponse getProductStockByIds(String itemId, String alu, String skuCode, String ean, String upc, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductStockByIds");

        Response<CatalogApplicationModels.ProductStockStatusResponse> response = catalogApplicationApiList.getProductStockByIds(fullUrl, itemId, alu, skuCode, ean, upc, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductStockPolling getProductStockForTimeByIds(String timestamp, Integer pageSize, String pageId) throws IOException {
        return this.getProductStockForTimeByIds(timestamp, pageSize, pageId, new HashMap<>());
    }

    public CatalogApplicationModels.ProductStockPolling getProductStockForTimeByIds(String timestamp, Integer pageSize, String pageId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductStockForTimeByIds");

        Response<CatalogApplicationModels.ProductStockPolling> response = catalogApplicationApiList.getProductStockForTimeByIds(fullUrl, timestamp, pageSize, pageId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getProductStockForTimeByIds
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.ProductStockPolling> getProductStockForTimeByIdsPagination(
        
        String timestamp,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.ProductStockPolling> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.ProductStockPolling callback = this.getProductStockForTimeByIds(
                
                 timestamp,
                 paginator.getPageSize()
                ,
                 paginator.getNextId()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.ProductListingResponse getProducts(String q, String f, Boolean filters, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType) throws IOException {
        return this.getProducts(q, f, filters, sortOn, pageId, pageSize, pageNo, pageType, new HashMap<>());
    }

    public CatalogApplicationModels.ProductListingResponse getProducts(String q, String f, Boolean filters, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProducts");

        Response<CatalogApplicationModels.ProductListingResponse> response = catalogApplicationApiList.getProducts(fullUrl, q, f, filters, sortOn, pageId, pageSize, pageNo, pageType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.ProductListingResponse> getProductsPagination(
        
        String q,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.ProductListingResponse callback = this.getProducts(
                
                 q,
                 f,
                 filters,
                 sortOn,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getPageNo()
                ,
                 paginator.getPageType()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.BrandListingResponse getBrands(String department, Integer pageNo, Integer pageSize) throws IOException {
        return this.getBrands(department, pageNo, pageSize, new HashMap<>());
    }

    public CatalogApplicationModels.BrandListingResponse getBrands(String department, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBrands");

        Response<CatalogApplicationModels.BrandListingResponse> response = catalogApplicationApiList.getBrands(fullUrl, department, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.BrandListingResponse> getBrandsPagination(
        
        String department,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.BrandListingResponse callback = this.getBrands(
                
                 department,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.BrandDetailResponse getBrandDetailBySlug(String slug) throws IOException {
        return this.getBrandDetailBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.BrandDetailResponse getBrandDetailBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBrandDetailBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.BrandDetailResponse> response = catalogApplicationApiList.getBrandDetailBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.CategoryListingResponse getCategories(String department) throws IOException {
        return this.getCategories(department, new HashMap<>());
    }

    public CatalogApplicationModels.CategoryListingResponse getCategories(String department, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCategories");

        Response<CatalogApplicationModels.CategoryListingResponse> response = catalogApplicationApiList.getCategories(fullUrl, department, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.CategoryMetaResponse getCategoryDetailBySlug(String slug) throws IOException {
        return this.getCategoryDetailBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.CategoryMetaResponse getCategoryDetailBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCategoryDetailBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.CategoryMetaResponse> response = catalogApplicationApiList.getCategoryDetailBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.HomeListingResponse getHomeProducts(String sortOn, String pageId, Integer pageSize) throws IOException {
        return this.getHomeProducts(sortOn, pageId, pageSize, new HashMap<>());
    }

    public CatalogApplicationModels.HomeListingResponse getHomeProducts(String sortOn, String pageId, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getHomeProducts");

        Response<CatalogApplicationModels.HomeListingResponse> response = catalogApplicationApiList.getHomeProducts(fullUrl, sortOn, pageId, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getHomeProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.HomeListingResponse> getHomeProductsPagination(
        
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.HomeListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.HomeListingResponse callback = this.getHomeProducts(
                
                 sortOn,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.DepartmentResponse getDepartments() throws IOException {
        return this.getDepartments(new HashMap<>());
    }

    public CatalogApplicationModels.DepartmentResponse getDepartments(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getDepartments");

        Response<CatalogApplicationModels.DepartmentResponse> response = catalogApplicationApiList.getDepartments(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.AutoCompleteResponse getSearchResults(String q) throws IOException {
        return this.getSearchResults(q, new HashMap<>());
    }

    public CatalogApplicationModels.AutoCompleteResponse getSearchResults(String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSearchResults");

        Response<CatalogApplicationModels.AutoCompleteResponse> response = catalogApplicationApiList.getSearchResults(fullUrl, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.GetCollectionListingResponse getCollections(Integer pageNo, Integer pageSize, List<String> tag, String q) throws IOException {
        return this.getCollections(pageNo, pageSize, tag, q, new HashMap<>());
    }

    public CatalogApplicationModels.GetCollectionListingResponse getCollections(Integer pageNo, Integer pageSize, List<String> tag, String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCollections");

        Response<CatalogApplicationModels.GetCollectionListingResponse> response = catalogApplicationApiList.getCollections(fullUrl, pageNo, pageSize, tag, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getCollections
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.GetCollectionListingResponse> getCollectionsPagination(
        
        Integer pageSize,
        List<String> tag,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.GetCollectionListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.GetCollectionListingResponse callback = this.getCollections(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 tag,
                 q
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.ProductListingResponse getCollectionItemsBySlug(String slug, String f, String q, Boolean filters, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType) throws IOException {
        return this.getCollectionItemsBySlug(slug, f, q, filters, sortOn, pageId, pageSize, pageNo, pageType, new HashMap<>());
    }

    public CatalogApplicationModels.ProductListingResponse getCollectionItemsBySlug(String slug, String f, String q, Boolean filters, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCollectionItemsBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.ProductListingResponse> response = catalogApplicationApiList.getCollectionItemsBySlug(fullUrl, f, q, filters, sortOn, pageId, pageSize, pageNo, pageType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getCollectionItemsBySlug
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.ProductListingResponse> getCollectionItemsBySlugPagination(
        
        String slug,
        String f,
        String q,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.ProductListingResponse callback = this.getCollectionItemsBySlug(
                
                 slug,
                 f,
                 q,
                 filters,
                 sortOn,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getPageNo()
                ,
                 paginator.getPageType()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.CollectionDetailResponse getCollectionDetailBySlug(String slug) throws IOException {
        return this.getCollectionDetailBySlug(slug, new HashMap<>());
    }

    public CatalogApplicationModels.CollectionDetailResponse getCollectionDetailBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCollectionDetailBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<CatalogApplicationModels.CollectionDetailResponse> response = catalogApplicationApiList.getCollectionDetailBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.GetFollowListingResponse getFollowedListing(String collectionType, String pageId, Integer pageSize) throws IOException {
        return this.getFollowedListing(collectionType, pageId, pageSize, new HashMap<>());
    }

    public CatalogApplicationModels.GetFollowListingResponse getFollowedListing(String collectionType, String pageId, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFollowedListing");
        fullUrl = fullUrl.replace("{" + "collection_type" + "}",collectionType.toString());

        Response<CatalogApplicationModels.GetFollowListingResponse> response = catalogApplicationApiList.getFollowedListing(fullUrl, pageId, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getFollowedListing
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.GetFollowListingResponse> getFollowedListingPagination(
        
        String collectionType,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.GetFollowListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.GetFollowListingResponse callback = this.getFollowedListing(
                
                 collectionType,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.FollowPostResponse unfollowById(String collectionType, String collectionId) throws IOException {
        return this.unfollowById(collectionType, collectionId, new HashMap<>());
    }

    public CatalogApplicationModels.FollowPostResponse unfollowById(String collectionType, String collectionId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("unfollowById");
        fullUrl = fullUrl.replace("{" + "collection_type" + "}",collectionType.toString());
        fullUrl = fullUrl.replace("{" + "collection_id" + "}",collectionId.toString());

        Response<CatalogApplicationModels.FollowPostResponse> response = catalogApplicationApiList.unfollowById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.FollowPostResponse followById(String collectionType, String collectionId) throws IOException {
        return this.followById(collectionType, collectionId, new HashMap<>());
    }

    public CatalogApplicationModels.FollowPostResponse followById(String collectionType, String collectionId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("followById");
        fullUrl = fullUrl.replace("{" + "collection_type" + "}",collectionType.toString());
        fullUrl = fullUrl.replace("{" + "collection_id" + "}",collectionId.toString());

        Response<CatalogApplicationModels.FollowPostResponse> response = catalogApplicationApiList.followById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.FollowerCountResponse getFollowerCountById(String collectionType, String collectionId) throws IOException {
        return this.getFollowerCountById(collectionType, collectionId, new HashMap<>());
    }

    public CatalogApplicationModels.FollowerCountResponse getFollowerCountById(String collectionType, String collectionId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFollowerCountById");
        fullUrl = fullUrl.replace("{" + "collection_type" + "}",collectionType.toString());
        fullUrl = fullUrl.replace("{" + "collection_id" + "}",collectionId.toString());

        Response<CatalogApplicationModels.FollowerCountResponse> response = catalogApplicationApiList.getFollowerCountById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.FollowIdsResponse getFollowIds(String collectionType) throws IOException {
        return this.getFollowIds(collectionType, new HashMap<>());
    }

    public CatalogApplicationModels.FollowIdsResponse getFollowIds(String collectionType, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFollowIds");

        Response<CatalogApplicationModels.FollowIdsResponse> response = catalogApplicationApiList.getFollowIds(fullUrl, collectionType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.StoreListingResponse getStores(Integer pageNo, Integer pageSize, String q, String city, Integer range, Double latitude, Double longitude, String tags) throws IOException {
        return this.getStores(pageNo, pageSize, q, city, range, latitude, longitude, tags, new HashMap<>());
    }

    public CatalogApplicationModels.StoreListingResponse getStores(Integer pageNo, Integer pageSize, String q, String city, Integer range, Double latitude, Double longitude, String tags, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getStores");

        Response<CatalogApplicationModels.StoreListingResponse> response = catalogApplicationApiList.getStores(fullUrl, pageNo, pageSize, q, city, range, latitude, longitude, tags, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.StoreListingResponse> getStoresPagination(
        
        Integer pageSize,
        String q,
        String city,
        Integer range,
        Double latitude,
        Double longitude,
        String tags
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.StoreListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.StoreListingResponse callback = this.getStores(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 city,
                 range,
                 latitude,
                 longitude,
                 tags
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.ApplicationStoreListing getInStockLocations(Integer pageNo, Integer pageSize, String q, String city, Integer range, Double latitude, Double longitude) throws IOException {
        return this.getInStockLocations(pageNo, pageSize, q, city, range, latitude, longitude, new HashMap<>());
    }

    public CatalogApplicationModels.ApplicationStoreListing getInStockLocations(Integer pageNo, Integer pageSize, String q, String city, Integer range, Double latitude, Double longitude, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getInStockLocations");

        Response<CatalogApplicationModels.ApplicationStoreListing> response = catalogApplicationApiList.getInStockLocations(fullUrl, pageNo, pageSize, q, city, range, latitude, longitude, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getInStockLocations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.ApplicationStoreListing> getInStockLocationsPagination(
        
        Integer pageSize,
        String q,
        String city,
        Integer range,
        Double latitude,
        Double longitude
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.ApplicationStoreListing> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.ApplicationStoreListing callback = this.getInStockLocations(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 city,
                 range,
                 latitude,
                 longitude
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
    

    public CatalogApplicationModels.StoreDetails getLocationDetailsById(Integer locationId) throws IOException {
        return this.getLocationDetailsById(locationId, new HashMap<>());
    }

    public CatalogApplicationModels.StoreDetails getLocationDetailsById(Integer locationId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLocationDetailsById");
        fullUrl = fullUrl.replace("{" + "location_id" + "}",locationId.toString());

        Response<CatalogApplicationModels.StoreDetails> response = catalogApplicationApiList.getLocationDetailsById(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductBundle getProductBundlesBySlug(String slug, String id) throws IOException {
        return this.getProductBundlesBySlug(slug, id, new HashMap<>());
    }

    public CatalogApplicationModels.ProductBundle getProductBundlesBySlug(String slug, String id, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductBundlesBySlug");

        Response<CatalogApplicationModels.ProductBundle> response = catalogApplicationApiList.getProductBundlesBySlug(fullUrl, slug, id, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductSizePriceResponseV3 getProductPriceBySlug(String slug, String size, Integer storeId, Integer moq) throws IOException {
        return this.getProductPriceBySlug(slug, size, storeId, moq, new HashMap<>());
    }

    public CatalogApplicationModels.ProductSizePriceResponseV3 getProductPriceBySlug(String slug, String size, Integer storeId, Integer moq, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductPriceBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());
        fullUrl = fullUrl.replace("{" + "size" + "}",size.toString());

        Response<CatalogApplicationModels.ProductSizePriceResponseV3> response = catalogApplicationApiList.getProductPriceBySlug(fullUrl, storeId, moq, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductSizePriceServiceabilityResponse getProductsServiceability(CatalogApplicationModels.ProductSizePriceServiceabilityRequest body) throws IOException {
        return this.getProductsServiceability(body, new HashMap<>());
    }

    public CatalogApplicationModels.ProductSizePriceServiceabilityResponse getProductsServiceability(CatalogApplicationModels.ProductSizePriceServiceabilityRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductsServiceability");

        Response<CatalogApplicationModels.ProductSizePriceServiceabilityResponse> response = catalogApplicationApiList.getProductsServiceability(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public CatalogApplicationModels.ProductSizeSellersResponseV3 getProductSellersBySlug(String slug, String size, String strategy, Integer pageNo, Integer pageSize) throws IOException {
        return this.getProductSellersBySlug(slug, size, strategy, pageNo, pageSize, new HashMap<>());
    }

    public CatalogApplicationModels.ProductSizeSellersResponseV3 getProductSellersBySlug(String slug, String size, String strategy, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getProductSellersBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());
        fullUrl = fullUrl.replace("{" + "size" + "}",size.toString());

        Response<CatalogApplicationModels.ProductSizeSellersResponseV3> response = catalogApplicationApiList.getProductSellersBySlug(fullUrl, strategy, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    /**
    * Summary: get paginator for getProductSellersBySlug
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogApplicationModels.ProductSizeSellersResponseV3> getProductSellersBySlugPagination(
        
        String slug,
        String size,
        String strategy,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogApplicationModels.ProductSizeSellersResponseV3> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogApplicationModels.ProductSizeSellersResponseV3 callback = this.getProductSellersBySlug(
                
                 slug,
                 size,
                 strategy,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator;
    }
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}