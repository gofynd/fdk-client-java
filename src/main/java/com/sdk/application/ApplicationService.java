package com.sdk.application;

import com.sdk.common.*;
import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

public class ApplicationService {



@Getter
 public class CatalogService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CatalogApiList catalogApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    CatalogService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.catalogApiList = generateCatalogApiList(this.applicationConfig.getPersistentCookieStore());

           
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
            
                    relativeUrls.put("getProductPriceBySlug","/service/application/catalog/v2.0/products/{slug}/sizes/{size}/price/".substring(1));
            
                    relativeUrls.put("getProductSellersBySlug","/service/application/catalog/v2.0/products/{slug}/sizes/{size}/sellers/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private CatalogApiList generateCatalogApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CatalogApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.ProductDetail getProductDetailBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductDetailBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductDetail> response = catalogApiList.getProductDetailBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizes getProductSizesBySlug(String slug , Integer storeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductSizesBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductSizes> response = catalogApiList.getProductSizesBySlug(fullUrl  ,storeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductsComparisonResponse getProductComparisonBySlugs(List<String> slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductComparisonBySlugs");
        

        Response<ApplicationModels.ProductsComparisonResponse> response = catalogApiList.getProductComparisonBySlugs(fullUrl  ,slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductCompareResponse getSimilarComparisonProductBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getSimilarComparisonProductBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductCompareResponse> response = catalogApiList.getSimilarComparisonProductBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductFrequentlyComparedSimilarResponse getComparedFrequentlyProductBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getComparedFrequentlyProductBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductFrequentlyComparedSimilarResponse> response = catalogApiList.getComparedFrequentlyProductBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductVariantsResponse getProductVariantsBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductVariantsBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductVariantsResponse> response = catalogApiList.getProductVariantsBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductStockStatusResponse getProductStockByIds(String itemId , String alu , String skuCode , String ean , String upc ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductStockByIds");
        

        Response<ApplicationModels.ProductStockStatusResponse> response = catalogApiList.getProductStockByIds(fullUrl  ,itemId, alu, skuCode, ean, upc).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductStockPolling getProductStockForTimeByIds(String timestamp , Integer pageSize , String pageId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductStockForTimeByIds");
        

        Response<ApplicationModels.ProductStockPolling> response = catalogApiList.getProductStockForTimeByIds(fullUrl  ,timestamp, pageSize, pageId).execute();
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
    public Paginator<ApplicationModels.ProductStockPolling> getProductStockForTimeByIdsPagination(
        
        String timestamp,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductStockPolling> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductStockPolling callback = this.getProductStockForTimeByIds(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.ProductListingResponse getProducts(String q , String f , Boolean filters , String sortOn , String pageId , Integer pageSize , Integer pageNo , String pageType ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProducts");
        

        Response<ApplicationModels.ProductListingResponse> response = catalogApiList.getProducts(fullUrl  ,q, f, filters, sortOn, pageId, pageSize, pageNo, pageType).execute();
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
    public Paginator<ApplicationModels.ProductListingResponse> getProductsPagination(
        
        String q,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductListingResponse callback = this.getProducts(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.BrandListingResponse getBrands(String department , Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBrands");
        

        Response<ApplicationModels.BrandListingResponse> response = catalogApiList.getBrands(fullUrl  ,department, pageNo, pageSize).execute();
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
    public Paginator<ApplicationModels.BrandListingResponse> getBrandsPagination(
        
        String department,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.BrandListingResponse callback = this.getBrands(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.BrandDetailResponse getBrandDetailBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBrandDetailBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.BrandDetailResponse> response = catalogApiList.getBrandDetailBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CategoryListingResponse getCategories(String department ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCategories");
        

        Response<ApplicationModels.CategoryListingResponse> response = catalogApiList.getCategories(fullUrl  ,department).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CategoryMetaResponse getCategoryDetailBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCategoryDetailBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.CategoryMetaResponse> response = catalogApiList.getCategoryDetailBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.HomeListingResponse getHomeProducts(String sortOn , String pageId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getHomeProducts");
        

        Response<ApplicationModels.HomeListingResponse> response = catalogApiList.getHomeProducts(fullUrl  ,sortOn, pageId, pageSize).execute();
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
    public Paginator<ApplicationModels.HomeListingResponse> getHomeProductsPagination(
        
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.HomeListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.HomeListingResponse callback = this.getHomeProducts(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.DepartmentResponse getDepartments() throws IOException {
     
      String fullUrl = relativeUrls.get("getDepartments");
        

        Response<ApplicationModels.DepartmentResponse> response = catalogApiList.getDepartments(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AutoCompleteResponse getSearchResults(String q ) throws IOException {
     
      String fullUrl = relativeUrls.get("getSearchResults");
        

        Response<ApplicationModels.AutoCompleteResponse> response = catalogApiList.getSearchResults(fullUrl  ,q).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCollectionListingResponse getCollections(Integer pageNo , Integer pageSize , List<String> tag ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCollections");
        

        Response<ApplicationModels.GetCollectionListingResponse> response = catalogApiList.getCollections(fullUrl  ,pageNo, pageSize, tag).execute();
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
    public Paginator<ApplicationModels.GetCollectionListingResponse> getCollectionsPagination(
        
        Integer pageSize,
        List<String> tag
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.GetCollectionListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.GetCollectionListingResponse callback = this.getCollections(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 tag
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    public ApplicationModels.ProductListingResponse getCollectionItemsBySlug(String slug , String f , Boolean filters , String sortOn , String pageId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCollectionItemsBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.ProductListingResponse> response = catalogApiList.getCollectionItemsBySlug(fullUrl  ,f, filters, sortOn, pageId, pageSize).execute();
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
    public Paginator<ApplicationModels.ProductListingResponse> getCollectionItemsBySlugPagination(
        
        String slug,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductListingResponse callback = this.getCollectionItemsBySlug(
                
                 slug,
                 f,
                 filters,
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
    return paginator ;
    }
    
    
    public ApplicationModels.CollectionDetailResponse getCollectionDetailBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCollectionDetailBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.CollectionDetailResponse> response = catalogApiList.getCollectionDetailBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFollowListingResponse getFollowedListing(String collectionType , String pageId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFollowedListing");
        
        fullUrl = fullUrl.replace("{" + "collection_type" +"}",collectionType.toString());
        

        Response<ApplicationModels.GetFollowListingResponse> response = catalogApiList.getFollowedListing(fullUrl  ,pageId, pageSize).execute();
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
    public Paginator<ApplicationModels.GetFollowListingResponse> getFollowedListingPagination(
        
        String collectionType,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.GetFollowListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.GetFollowListingResponse callback = this.getFollowedListing(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.FollowPostResponse unfollowById(String collectionType , String collectionId ) throws IOException {
     
      String fullUrl = relativeUrls.get("unfollowById");
        
        fullUrl = fullUrl.replace("{" + "collection_type" +"}",collectionType.toString());
        
        fullUrl = fullUrl.replace("{" + "collection_id" +"}",collectionId.toString());
        

        Response<ApplicationModels.FollowPostResponse> response = catalogApiList.unfollowById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowPostResponse followById(String collectionType , String collectionId ) throws IOException {
     
      String fullUrl = relativeUrls.get("followById");
        
        fullUrl = fullUrl.replace("{" + "collection_type" +"}",collectionType.toString());
        
        fullUrl = fullUrl.replace("{" + "collection_id" +"}",collectionId.toString());
        

        Response<ApplicationModels.FollowPostResponse> response = catalogApiList.followById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowerCountResponse getFollowerCountById(String collectionType , String collectionId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFollowerCountById");
        
        fullUrl = fullUrl.replace("{" + "collection_type" +"}",collectionType.toString());
        
        fullUrl = fullUrl.replace("{" + "collection_id" +"}",collectionId.toString());
        

        Response<ApplicationModels.FollowerCountResponse> response = catalogApiList.getFollowerCountById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowIdsResponse getFollowIds(String collectionType ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFollowIds");
        

        Response<ApplicationModels.FollowIdsResponse> response = catalogApiList.getFollowIds(fullUrl  ,collectionType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.StoreListingResponse getStores(Integer pageNo , Integer pageSize , String q , String city , Integer range , Double latitude , Double longitude ) throws IOException {
     
      String fullUrl = relativeUrls.get("getStores");
        

        Response<ApplicationModels.StoreListingResponse> response = catalogApiList.getStores(fullUrl  ,pageNo, pageSize, q, city, range, latitude, longitude).execute();
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
    public Paginator<ApplicationModels.StoreListingResponse> getStoresPagination(
        
        Integer pageSize,
        String q,
        String city,
        Integer range,
        Double latitude,
        Double longitude
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.StoreListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.StoreListingResponse callback = this.getStores(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.ApplicationStoreListing getInStockLocations(Integer pageNo , Integer pageSize , String q , String city , Integer range , Double latitude , Double longitude ) throws IOException {
     
      String fullUrl = relativeUrls.get("getInStockLocations");
        

        Response<ApplicationModels.ApplicationStoreListing> response = catalogApiList.getInStockLocations(fullUrl  ,pageNo, pageSize, q, city, range, latitude, longitude).execute();
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
    public Paginator<ApplicationModels.ApplicationStoreListing> getInStockLocationsPagination(
        
        Integer pageSize,
        String q,
        String city,
        Integer range,
        Double latitude,
        Double longitude
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ApplicationStoreListing> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ApplicationStoreListing callback = this.getInStockLocations(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.StoreDetails getLocationDetailsById(Integer locationId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getLocationDetailsById");
        
        fullUrl = fullUrl.replace("{" + "location_id" +"}",locationId.toString());
        

        Response<ApplicationModels.StoreDetails> response = catalogApiList.getLocationDetailsById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductBundle getProductBundlesBySlug(String slug , String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductBundlesBySlug");
        

        Response<ApplicationModels.ProductBundle> response = catalogApiList.getProductBundlesBySlug(fullUrl  ,slug, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizePriceResponseV2 getProductPriceBySlug(String slug , String size , Integer storeId , String pincode , Integer moq ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductPriceBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        
        fullUrl = fullUrl.replace("{" + "size" +"}",size.toString());
        

        Response<ApplicationModels.ProductSizePriceResponseV2> response = catalogApiList.getProductPriceBySlug(fullUrl  ,storeId, pincode, moq).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizeSellersResponseV2 getProductSellersBySlug(String slug , String size , String pincode , String strategy , Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductSellersBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        
        fullUrl = fullUrl.replace("{" + "size" +"}",size.toString());
        

        Response<ApplicationModels.ProductSizeSellersResponseV2> response = catalogApiList.getProductSellersBySlug(fullUrl  ,pincode, strategy, pageNo, pageSize).execute();
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
    public Paginator<ApplicationModels.ProductSizeSellersResponseV2> getProductSellersBySlugPagination(
        
        String slug,
        String size,
        String pincode,
        String strategy,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductSizeSellersResponseV2> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductSizeSellersResponseV2 callback = this.getProductSellersBySlug(
                
                 slug,
                 size,
                 pincode,
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
    return paginator ;
    }
      
}



@Getter
 public class CartService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CartApiList cartApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    CartService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.cartApiList = generateCartApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getCart","/service/application/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getCartLastModified","/service/application/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("addItems","/service/application/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("updateCart","/service/application/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getItemCount","/service/application/cart/v1.0/basic".substring(1));
            
                    relativeUrls.put("getCoupons","/service/application/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("applyCoupon","/service/application/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("removeCoupon","/service/application/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("getBulkDiscountOffers","/service/application/cart/v1.0/bulk-price".substring(1));
            
                    relativeUrls.put("applyRewardPoints","/service/application/cart/v1.0/redeem/points/".substring(1));
            
                    relativeUrls.put("getAddresses","/service/application/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("addAddress","/service/application/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("getAddressById","/service/application/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("updateAddress","/service/application/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("removeAddress","/service/application/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("selectAddress","/service/application/cart/v1.0/select-address".substring(1));
            
                    relativeUrls.put("selectPaymentMode","/service/application/cart/v1.0/payment".substring(1));
            
                    relativeUrls.put("validateCouponForPayment","/service/application/cart/v1.0/payment/validate/".substring(1));
            
                    relativeUrls.put("getShipments","/service/application/cart/v1.0/shipment".substring(1));
            
                    relativeUrls.put("checkoutCart","/service/application/cart/v1.0/checkout".substring(1));
            
                    relativeUrls.put("updateCartMeta","/service/application/cart/v1.0/meta".substring(1));
            
                    relativeUrls.put("getCartShareLink","/service/application/cart/v1.0/share-cart".substring(1));
            
                    relativeUrls.put("getCartSharedItems","/service/application/cart/v1.0/share-cart/{token}".substring(1));
            
                    relativeUrls.put("updateCartWithSharedItems","/service/application/cart/v1.0/share-cart/{token}/{action}".substring(1));
            
                    relativeUrls.put("getPromotionOffers","/service/application/cart/v1.0/available-promotions".substring(1));
            
                    relativeUrls.put("getLadderOffers","/service/application/cart/v1.0/available-ladder-prices".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private CartApiList generateCartApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CartApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.CartDetailResponse getCart(String id , Boolean i , Boolean b , Integer assignCardId , String areaCode , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCart");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.getCart(fullUrl  ,id, i, b, assignCardId, areaCode, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object getCartLastModified(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartLastModified");
        

        Response<Object> response = cartApiList.getCartLastModified(fullUrl  ,id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddCartDetailResponse addItems(Boolean i , Boolean b , String areaCode , Boolean buyNow ,ApplicationModels.AddCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addItems");
        

        Response<ApplicationModels.AddCartDetailResponse> response = cartApiList.addItems(fullUrl  ,i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateCartDetailResponse updateCart(String id , Boolean i , Boolean b , String areaCode , Boolean buyNow ,ApplicationModels.UpdateCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCart");
        

        Response<ApplicationModels.UpdateCartDetailResponse> response = cartApiList.updateCart(fullUrl  ,id, i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartItemCountResponse getItemCount(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getItemCount");
        

        Response<ApplicationModels.CartItemCountResponse> response = cartApiList.getItemCount(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCouponResponse getCoupons(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCoupons");
        

        Response<ApplicationModels.GetCouponResponse> response = cartApiList.getCoupons(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse applyCoupon(Boolean i , Boolean b , Boolean p , String id , Boolean buyNow ,ApplicationModels.ApplyCouponRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyCoupon");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.applyCoupon(fullUrl  ,i, b, p, id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse removeCoupon(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeCoupon");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.removeCoupon(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBulkDiscountOffers");
        

        Response<ApplicationModels.BulkPriceResponse> response = cartApiList.getBulkDiscountOffers(fullUrl  ,itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse applyRewardPoints(String id , Boolean i , Boolean b , Boolean buyNow ,ApplicationModels.RewardPointRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyRewardPoints");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.applyRewardPoints(fullUrl  ,id, i, b, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetAddressesResponse getAddresses(String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddresses");
        

        Response<ApplicationModels.GetAddressesResponse> response = cartApiList.getAddresses(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SaveAddressResponse addAddress(ApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("addAddress");
        

        Response<ApplicationModels.SaveAddressResponse> response = cartApiList.addAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Address getAddressById(String id , String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddressById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.Address> response = cartApiList.getAddressById(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateAddressResponse updateAddress(String id ,ApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.UpdateAddressResponse> response = cartApiList.updateAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.DeleteAddressResponse removeAddress(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.DeleteAddressResponse> response = cartApiList.removeAddress(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse selectAddress(String cartId , Boolean buyNow , Boolean i , Boolean b ,ApplicationModels.SelectCartAddressRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectAddress");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.selectAddress(fullUrl  ,cartId, buyNow, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse selectPaymentMode(String id , Boolean buyNow ,ApplicationModels.UpdateCartPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectPaymentMode");
        

        Response<ApplicationModels.CartDetailResponse> response = cartApiList.selectPaymentMode(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentCouponValidate validateCouponForPayment(String id , Boolean buyNow , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("validateCouponForPayment");
        

        Response<ApplicationModels.PaymentCouponValidate> response = cartApiList.validateCouponForPayment(fullUrl  ,id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse getShipments(Boolean p , String id , Boolean buyNow , String addressId , String areaCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipments");
        

        Response<ApplicationModels.CartShipmentsResponse> response = cartApiList.getShipments(fullUrl  ,p, id, buyNow, addressId, areaCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartCheckoutResponse checkoutCart(Boolean buyNow ,ApplicationModels.CartCheckoutDetailRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkoutCart");
        

        Response<ApplicationModels.CartCheckoutResponse> response = cartApiList.checkoutCart(fullUrl  ,buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartMetaResponse updateCartMeta(String id , Boolean buyNow ,ApplicationModels.CartMetaRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartMeta");
        

        Response<ApplicationModels.CartMetaResponse> response = cartApiList.updateCartMeta(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetShareCartLinkResponse getCartShareLink(ApplicationModels.GetShareCartLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartShareLink");
        

        Response<ApplicationModels.GetShareCartLinkResponse> response = cartApiList.getCartShareLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        

        Response<ApplicationModels.SharedCartResponse> response = cartApiList.getCartSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        
        fullUrl = fullUrl.replace("{" + "action" +"}",action.toString());
        

        Response<ApplicationModels.SharedCartResponse> response = cartApiList.updateCartWithSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PromotionOffersResponse getPromotionOffers(String slug , Integer pageSize , String promotionGroup ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPromotionOffers");
        

        Response<ApplicationModels.PromotionOffersResponse> response = cartApiList.getPromotionOffers(fullUrl  ,slug, pageSize, promotionGroup).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LadderPriceOffers getLadderOffers(String slug , String storeId , String promotionId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getLadderOffers");
        

        Response<ApplicationModels.LadderPriceOffers> response = cartApiList.getLadderOffers(fullUrl  ,slug, storeId, promotionId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class CommonService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommonApiList commonApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    CommonService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.commonApiList = generateCommonApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("searchApplication","/service/common/configuration/v1.0/application/search-application".substring(1));
            
                    relativeUrls.put("getLocations","/service/common/configuration/v1.0/location".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private CommonApiList generateCommonApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CommonApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.ApplicationResponse searchApplication(String authorization , String query ) throws IOException {
     
      String fullUrl = relativeUrls.get("searchApplication");
        

        Response<ApplicationModels.ApplicationResponse> response = commonApiList.searchApplication(fullUrl  ,authorization, query).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Locations getLocations(String locationType , String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getLocations");
        

        Response<ApplicationModels.Locations> response = commonApiList.getLocations(fullUrl  ,locationType, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class LeadService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LeadApiList leadApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    LeadService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.leadApiList = generateLeadApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getTicket","/service/application/lead/v1.0/ticket/{id}".substring(1));
            
                    relativeUrls.put("createHistory","/service/application/lead/v1.0/ticket/{id}/history".substring(1));
            
                    relativeUrls.put("createTicket","/service/application/lead/v1.0/ticket/".substring(1));
            
                    relativeUrls.put("getCustomForm","/service/application/lead/v1.0/form/{slug}".substring(1));
            
                    relativeUrls.put("submitCustomForm","/service/application/lead/v1.0/form/{slug}/submit".substring(1));
            
                    relativeUrls.put("getParticipantsInsideVideoRoom","/service/application/lead/v1.0/video/room/{unique_name}/participants".substring(1));
            
                    relativeUrls.put("getTokenForVideoRoom","/service/application/lead/v1.0/video/room/{unique_name}/token".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private LeadApiList generateLeadApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LeadApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.Ticket getTicket(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getTicket");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.Ticket> response = leadApiList.getTicket(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TicketHistory createHistory(String id ,ApplicationModels.TicketHistoryPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("createHistory");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.TicketHistory> response = leadApiList.createHistory(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Ticket createTicket(ApplicationModels.AddTicketPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("createTicket");
        

        Response<ApplicationModels.Ticket> response = leadApiList.createTicket(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CustomForm getCustomForm(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCustomForm");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.CustomForm> response = leadApiList.getCustomForm(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SubmitCustomFormResponse submitCustomForm(String slug ,ApplicationModels.CustomFormSubmissionPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("submitCustomForm");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.SubmitCustomFormResponse> response = leadApiList.submitCustomForm(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetParticipantsInsideVideoRoomResponse getParticipantsInsideVideoRoom(String uniqueName ) throws IOException {
     
      String fullUrl = relativeUrls.get("getParticipantsInsideVideoRoom");
        
        fullUrl = fullUrl.replace("{" + "unique_name" +"}",uniqueName.toString());
        

        Response<ApplicationModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getParticipantsInsideVideoRoom(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String uniqueName ) throws IOException {
     
      String fullUrl = relativeUrls.get("getTokenForVideoRoom");
        
        fullUrl = fullUrl.replace("{" + "unique_name" +"}",uniqueName.toString());
        

        Response<ApplicationModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ThemeService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ThemeApiList themeApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    ThemeService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.themeApiList = generateThemeApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getAllPages","/service/application/theme/v1.0/{theme_id}/page".substring(1));
            
                    relativeUrls.put("getPage","/service/application/theme/v1.0/{theme_id}/{page_value}".substring(1));
            
                    relativeUrls.put("getAppliedTheme","/service/application/theme/v1.0/applied-theme".substring(1));
            
                    relativeUrls.put("getThemeForPreview","/service/application/theme/v1.0/{theme_id}/preview".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ThemeApiList generateThemeApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ThemeApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.AllAvailablePageSchema getAllPages(String themeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAllPages");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        

        Response<ApplicationModels.AllAvailablePageSchema> response = themeApiList.getAllPages(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AvailablePageSchema getPage(String themeId , String pageValue ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPage");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        
        fullUrl = fullUrl.replace("{" + "page_value" +"}",pageValue.toString());
        

        Response<ApplicationModels.AvailablePageSchema> response = themeApiList.getPage(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ThemesSchema getAppliedTheme() throws IOException {
     
      String fullUrl = relativeUrls.get("getAppliedTheme");
        

        Response<ApplicationModels.ThemesSchema> response = themeApiList.getAppliedTheme(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ThemesSchema getThemeForPreview(String themeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getThemeForPreview");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        

        Response<ApplicationModels.ThemesSchema> response = themeApiList.getThemeForPreview(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class UserService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private UserApiList userApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    UserService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.userApiList = generateUserApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("loginWithFacebook","/service/application/user/authentication/v1.0/login/facebook-token".substring(1));
            
                    relativeUrls.put("loginWithGoogle","/service/application/user/authentication/v1.0/login/google-token".substring(1));
            
                    relativeUrls.put("loginWithGoogleAndroid","/service/application/user/authentication/v1.0/login/google-android".substring(1));
            
                    relativeUrls.put("loginWithGoogleIOS","/service/application/user/authentication/v1.0/login/google-ios".substring(1));
            
                    relativeUrls.put("loginWithAppleIOS","/service/application/user/authentication/v1.0/login/apple-ios".substring(1));
            
                    relativeUrls.put("loginWithOTP","/service/application/user/authentication/v1.0/login/otp".substring(1));
            
                    relativeUrls.put("loginWithEmailAndPassword","/service/application/user/authentication/v1.0/login/password".substring(1));
            
                    relativeUrls.put("sendResetPasswordEmail","/service/application/user/authentication/v1.0/login/password/reset".substring(1));
            
                    relativeUrls.put("sendResetPasswordMobile","/service/application/user/authentication/v1.0/login/password/mobile/reset".substring(1));
            
                    relativeUrls.put("forgotPassword","/service/application/user/authentication/v1.0/login/password/reset/forgot".substring(1));
            
                    relativeUrls.put("sendResetToken","/service/application/user/authentication/v1.0/login/password/reset/token".substring(1));
            
                    relativeUrls.put("loginWithToken","/service/application/user/authentication/v1.0/login/token".substring(1));
            
                    relativeUrls.put("registerWithForm","/service/application/user/authentication/v1.0/register/form".substring(1));
            
                    relativeUrls.put("verifyEmail","/service/application/user/authentication/v1.0/verify/email".substring(1));
            
                    relativeUrls.put("verifyMobile","/service/application/user/authentication/v1.0/verify/mobile".substring(1));
            
                    relativeUrls.put("hasPassword","/service/application/user/authentication/v1.0/has-password".substring(1));
            
                    relativeUrls.put("updatePassword","/service/application/user/authentication/v1.0/password".substring(1));
            
                    relativeUrls.put("deleteUser","/service/application/user/authentication/v1.0/delete".substring(1));
            
                    relativeUrls.put("logout","/service/application/user/authentication/v1.0/logout".substring(1));
            
                    relativeUrls.put("sendOTPOnMobile","/service/application/user/authentication/v1.0/otp/mobile/send".substring(1));
            
                    relativeUrls.put("verifyMobileOTP","/service/application/user/authentication/v1.0/otp/mobile/verify".substring(1));
            
                    relativeUrls.put("sendOTPOnEmail","/service/application/user/authentication/v1.0/otp/email/send".substring(1));
            
                    relativeUrls.put("verifyEmailOTP","/service/application/user/authentication/v1.0/otp/email/verify".substring(1));
            
                    relativeUrls.put("getLoggedInUser","/service/application/user/authentication/v1.0/session".substring(1));
            
                    relativeUrls.put("getListOfActiveSessions","/service/application/user/authentication/v1.0/sessions".substring(1));
            
                    relativeUrls.put("getPlatformConfig","/service/application/user/platform/v1.0/config".substring(1));
            
                    relativeUrls.put("updateProfile","/service/application/user/profile/v1.0/detail".substring(1));
            
                    relativeUrls.put("addMobileNumber","/service/application/user/profile/v1.0/mobile".substring(1));
            
                    relativeUrls.put("deleteMobileNumber","/service/application/user/profile/v1.0/mobile".substring(1));
            
                    relativeUrls.put("setMobileNumberAsPrimary","/service/application/user/profile/v1.0/mobile/primary".substring(1));
            
                    relativeUrls.put("sendVerificationLinkToMobile","/service/application/user/profile/v1.0/mobile/link/send".substring(1));
            
                    relativeUrls.put("addEmail","/service/application/user/profile/v1.0/email".substring(1));
            
                    relativeUrls.put("deleteEmail","/service/application/user/profile/v1.0/email".substring(1));
            
                    relativeUrls.put("setEmailAsPrimary","/service/application/user/profile/v1.0/email/primary".substring(1));
            
                    relativeUrls.put("sendVerificationLinkToEmail","/service/application/user/profile/v1.0/email/link/send".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private UserApiList generateUserApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),UserApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.AuthSuccess loginWithFacebook(String platform ,ApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithFacebook");
        

        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithFacebook(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogle(String platform ,ApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogle");
        

        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogle(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogleAndroid(String platform ,ApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogleAndroid");
        

        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogleAndroid(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogleIOS(String platform ,ApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogleIOS");
        

        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogleIOS(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithAppleIOS(String platform ,ApplicationModels.OAuthRequestAppleSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithAppleIOS");
        

        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithAppleIOS(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendOtpResponse loginWithOTP(String platform ,ApplicationModels.SendOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithOTP");
        

        Response<ApplicationModels.SendOtpResponse> response = userApiList.loginWithOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess loginWithEmailAndPassword(ApplicationModels.PasswordLoginRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithEmailAndPassword");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.loginWithEmailAndPassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResetPasswordSuccess sendResetPasswordEmail(String platform ,ApplicationModels.SendResetPasswordEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetPasswordEmail");
        

        Response<ApplicationModels.ResetPasswordSuccess> response = userApiList.sendResetPasswordEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResetPasswordSuccess sendResetPasswordMobile(String platform ,ApplicationModels.SendResetPasswordMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetPasswordMobile");
        

        Response<ApplicationModels.ResetPasswordSuccess> response = userApiList.sendResetPasswordMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess forgotPassword(ApplicationModels.ForgotPasswordRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("forgotPassword");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.forgotPassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResetPasswordSuccess sendResetToken(ApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetToken");
        

        Response<ApplicationModels.ResetPasswordSuccess> response = userApiList.sendResetToken(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess loginWithToken(ApplicationModels.TokenRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithToken");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.loginWithToken(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RegisterFormSuccess registerWithForm(String platform ,ApplicationModels.FormRegisterRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("registerWithForm");
        

        Response<ApplicationModels.RegisterFormSuccess> response = userApiList.registerWithForm(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess verifyEmail(ApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyEmail");
        

        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.verifyEmail(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess verifyMobile(ApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyMobile");
        

        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.verifyMobile(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.HasPasswordSuccess hasPassword() throws IOException {
     
      String fullUrl = relativeUrls.get("hasPassword");
        

        Response<ApplicationModels.HasPasswordSuccess> response = userApiList.hasPassword(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess updatePassword(ApplicationModels.UpdatePasswordRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("updatePassword");
        

        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.updatePassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.DeleteUserSuccess deleteUser(ApplicationModels.DeleteApplicationUserRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteUser");
        

        Response<ApplicationModels.DeleteUserSuccess> response = userApiList.deleteUser(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LogoutSuccess logout() throws IOException {
     
      String fullUrl = relativeUrls.get("logout");
        

        Response<ApplicationModels.LogoutSuccess> response = userApiList.logout(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OtpSuccess sendOTPOnMobile(String platform ,ApplicationModels.SendMobileOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOTPOnMobile");
        

        Response<ApplicationModels.OtpSuccess> response = userApiList.sendOTPOnMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyOtpSuccess verifyMobileOTP(String platform ,ApplicationModels.VerifyOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyMobileOTP");
        

        Response<ApplicationModels.VerifyOtpSuccess> response = userApiList.verifyMobileOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.EmailOtpSuccess sendOTPOnEmail(String platform ,ApplicationModels.SendEmailOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOTPOnEmail");
        

        Response<ApplicationModels.EmailOtpSuccess> response = userApiList.sendOTPOnEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyOtpSuccess verifyEmailOTP(String platform ,ApplicationModels.VerifyEmailOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyEmailOTP");
        

        Response<ApplicationModels.VerifyOtpSuccess> response = userApiList.verifyEmailOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UserObjectSchema getLoggedInUser() throws IOException {
     
      String fullUrl = relativeUrls.get("getLoggedInUser");
        

        Response<ApplicationModels.UserObjectSchema> response = userApiList.getLoggedInUser(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SessionListSuccess getListOfActiveSessions() throws IOException {
     
      String fullUrl = relativeUrls.get("getListOfActiveSessions");
        

        Response<ApplicationModels.SessionListSuccess> response = userApiList.getListOfActiveSessions(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PlatformSchema getPlatformConfig(String name ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPlatformConfig");
        

        Response<ApplicationModels.PlatformSchema> response = userApiList.getPlatformConfig(fullUrl  ,name).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProfileEditSuccess updateProfile(String platform ,ApplicationModels.EditProfileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateProfile");
        

        Response<ApplicationModels.ProfileEditSuccess> response = userApiList.updateProfile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyMobileOTPSuccess addMobileNumber(String platform ,ApplicationModels.EditMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("addMobileNumber");
        

        Response<ApplicationModels.VerifyMobileOTPSuccess> response = userApiList.addMobileNumber(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess deleteMobileNumber(String platform , Boolean active , Boolean primary , Boolean verified , String countryCode , String phone ) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteMobileNumber");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.deleteMobileNumber(fullUrl  ,platform, active, primary, verified, countryCode, phone).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess setMobileNumberAsPrimary(ApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("setMobileNumberAsPrimary");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.setMobileNumberAsPrimary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendMobileVerifyLinkSuccess sendVerificationLinkToMobile(String platform ,ApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendVerificationLinkToMobile");
        

        Response<ApplicationModels.SendMobileVerifyLinkSuccess> response = userApiList.sendVerificationLinkToMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailOTPSuccess addEmail(String platform ,ApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("addEmail");
        

        Response<ApplicationModels.VerifyEmailOTPSuccess> response = userApiList.addEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess deleteEmail(String platform , Boolean active , Boolean primary , Boolean verified , String email ) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteEmail");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.deleteEmail(fullUrl  ,platform, active, primary, verified, email).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess setEmailAsPrimary(ApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("setEmailAsPrimary");
        

        Response<ApplicationModels.LoginSuccess> response = userApiList.setEmailAsPrimary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendEmailVerifyLinkSuccess sendVerificationLinkToEmail(String platform ,ApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendVerificationLinkToEmail");
        

        Response<ApplicationModels.SendEmailVerifyLinkSuccess> response = userApiList.sendVerificationLinkToEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ContentService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ContentApiList contentApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    ContentService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.contentApiList = generateContentApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getAnnouncements","/service/application/content/v1.0/announcements".substring(1));
            
                    relativeUrls.put("getBlog","/service/application/content/v1.0/blogs/{slug}".substring(1));
            
                    relativeUrls.put("getBlogs","/service/application/content/v1.0/blogs/".substring(1));
            
                    relativeUrls.put("getDataLoaders","/service/application/content/v1.0/data-loader".substring(1));
            
                    relativeUrls.put("getFaqs","/service/application/content/v1.0/faq".substring(1));
            
                    relativeUrls.put("getFaqCategories","/service/application/content/v1.0/faq/categories".substring(1));
            
                    relativeUrls.put("getFaqBySlug","/service/application/content/v1.0/faq/{slug}".substring(1));
            
                    relativeUrls.put("getFaqCategoryBySlug","/service/application/content/v1.0/faq/category/{slug}".substring(1));
            
                    relativeUrls.put("getFaqsByCategorySlug","/service/application/content/v1.0/faq/category/{slug}/faqs".substring(1));
            
                    relativeUrls.put("getLandingPage","/service/application/content/v1.0/landing-page".substring(1));
            
                    relativeUrls.put("getLegalInformation","/service/application/content/v1.0/legal".substring(1));
            
                    relativeUrls.put("getNavigations","/service/application/content/v1.0/navigations/".substring(1));
            
                    relativeUrls.put("getSEOConfiguration","/service/application/content/v1.0/seo".substring(1));
            
                    relativeUrls.put("getSlideshows","/service/application/content/v1.0/slideshow/".substring(1));
            
                    relativeUrls.put("getSlideshow","/service/application/content/v1.0/slideshow/{slug}".substring(1));
            
                    relativeUrls.put("getSupportInformation","/service/application/content/v1.0/support".substring(1));
            
                    relativeUrls.put("getTags","/service/application/content/v1.0/tags".substring(1));
            
                    relativeUrls.put("getPage","/service/application/content/v2.0/pages/{slug}".substring(1));
            
                    relativeUrls.put("getPages","/service/application/content/v2.0/pages/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ContentApiList generateContentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ContentApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.AnnouncementsResponseSchema getAnnouncements() throws IOException {
     
      String fullUrl = relativeUrls.get("getAnnouncements");
        

        Response<ApplicationModels.AnnouncementsResponseSchema> response = contentApiList.getAnnouncements(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BlogSchema getBlog(String slug , String rootId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBlog");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.BlogSchema> response = contentApiList.getBlog(fullUrl  ,rootId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BlogGetResponse getBlogs(Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBlogs");
        

        Response<ApplicationModels.BlogGetResponse> response = contentApiList.getBlogs(fullUrl  ,pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBlogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.BlogGetResponse> getBlogsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.BlogGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.BlogGetResponse callback = this.getBlogs(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.DataLoadersSchema getDataLoaders() throws IOException {
     
      String fullUrl = relativeUrls.get("getDataLoaders");
        

        Response<ApplicationModels.DataLoadersSchema> response = contentApiList.getDataLoaders(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FaqResponseSchema getFaqs() throws IOException {
     
      String fullUrl = relativeUrls.get("getFaqs");
        

        Response<ApplicationModels.FaqResponseSchema> response = contentApiList.getFaqs(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqCategoriesSchema getFaqCategories() throws IOException {
     
      String fullUrl = relativeUrls.get("getFaqCategories");
        

        Response<ApplicationModels.GetFaqCategoriesSchema> response = contentApiList.getFaqCategories(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FaqSchema getFaqBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFaqBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.FaqSchema> response = contentApiList.getFaqBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFaqCategoryBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.GetFaqCategoryBySlugSchema> response = contentApiList.getFaqCategoryBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqSchema getFaqsByCategorySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getFaqsByCategorySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.GetFaqSchema> response = contentApiList.getFaqsByCategorySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LandingPageSchema getLandingPage() throws IOException {
     
      String fullUrl = relativeUrls.get("getLandingPage");
        

        Response<ApplicationModels.LandingPageSchema> response = contentApiList.getLandingPage(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationLegal getLegalInformation() throws IOException {
     
      String fullUrl = relativeUrls.get("getLegalInformation");
        

        Response<ApplicationModels.ApplicationLegal> response = contentApiList.getLegalInformation(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.NavigationGetResponse getNavigations(Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getNavigations");
        

        Response<ApplicationModels.NavigationGetResponse> response = contentApiList.getNavigations(fullUrl  ,pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getNavigations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.NavigationGetResponse> getNavigationsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.NavigationGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.NavigationGetResponse callback = this.getNavigations(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.SeoComponent getSEOConfiguration() throws IOException {
     
      String fullUrl = relativeUrls.get("getSEOConfiguration");
        

        Response<ApplicationModels.SeoComponent> response = contentApiList.getSEOConfiguration(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SlideshowGetResponse getSlideshows(Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getSlideshows");
        

        Response<ApplicationModels.SlideshowGetResponse> response = contentApiList.getSlideshows(fullUrl  ,pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSlideshows
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.SlideshowGetResponse> getSlideshowsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.SlideshowGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.SlideshowGetResponse callback = this.getSlideshows(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.SlideshowSchema getSlideshow(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getSlideshow");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.SlideshowSchema> response = contentApiList.getSlideshow(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Support getSupportInformation() throws IOException {
     
      String fullUrl = relativeUrls.get("getSupportInformation");
        

        Response<ApplicationModels.Support> response = contentApiList.getSupportInformation(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TagsSchema getTags() throws IOException {
     
      String fullUrl = relativeUrls.get("getTags");
        

        Response<ApplicationModels.TagsSchema> response = contentApiList.getTags(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PageSchema getPage(String slug , String rootId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPage");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.PageSchema> response = contentApiList.getPage(fullUrl  ,rootId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PageGetResponse getPages(Integer pageNo , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPages");
        

        Response<ApplicationModels.PageGetResponse> response = contentApiList.getPages(fullUrl  ,pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.PageGetResponse> getPagesPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.PageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.PageGetResponse callback = this.getPages(
                
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
    return paginator ;
    }
      
}



@Getter
 public class CommunicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationApiList communicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    CommunicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.communicationApiList = generateCommunicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
            
                    relativeUrls.put("upsertCommunicationConsent","/service/application/communication/v1.0/consent".substring(1));
            
                    relativeUrls.put("upsertAppPushtoken","/service/application/communication/v1.0/pn-token".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private CommunicationApiList generateCommunicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CommunicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.CommunicationConsent getCommunicationConsent() throws IOException {
     
      String fullUrl = relativeUrls.get("getCommunicationConsent");
        

        Response<ApplicationModels.CommunicationConsent> response = communicationApiList.getCommunicationConsent(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CommunicationConsentRes upsertCommunicationConsent(ApplicationModels.CommunicationConsentReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("upsertCommunicationConsent");
        

        Response<ApplicationModels.CommunicationConsentRes> response = communicationApiList.upsertCommunicationConsent(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PushtokenRes upsertAppPushtoken(ApplicationModels.PushtokenReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("upsertAppPushtoken");
        

        Response<ApplicationModels.PushtokenRes> response = communicationApiList.upsertAppPushtoken(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ShareService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ShareApiList shareApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    ShareService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.shareApiList = generateShareApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getApplicationQRCode","/service/application/share/v1.0/qr/".substring(1));
            
                    relativeUrls.put("getProductQRCodeBySlug","/service/application/share/v1.0/qr/products/{slug}/".substring(1));
            
                    relativeUrls.put("getCollectionQRCodeBySlug","/service/application/share/v1.0/qr/collection/{slug}/".substring(1));
            
                    relativeUrls.put("getUrlQRCode","/service/application/share/v1.0/qr/url/".substring(1));
            
                    relativeUrls.put("createShortLink","/service/application/share/v1.0/links/short-link/".substring(1));
            
                    relativeUrls.put("getShortLinkByHash","/service/application/share/v1.0/links/short-link/{hash}/".substring(1));
            
                    relativeUrls.put("getOriginalShortLinkByHash","/service/application/share/v1.0/links/short-link/{hash}/original/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ShareApiList generateShareApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ShareApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.QRCodeResp getApplicationQRCode() throws IOException {
     
      String fullUrl = relativeUrls.get("getApplicationQRCode");
        

        Response<ApplicationModels.QRCodeResp> response = shareApiList.getApplicationQRCode(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getProductQRCodeBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductQRCodeBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.QRCodeResp> response = shareApiList.getProductQRCodeBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getCollectionQRCodeBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCollectionQRCodeBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ApplicationModels.QRCodeResp> response = shareApiList.getCollectionQRCodeBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getUrlQRCode(String url ) throws IOException {
     
      String fullUrl = relativeUrls.get("getUrlQRCode");
        

        Response<ApplicationModels.QRCodeResp> response = shareApiList.getUrlQRCode(fullUrl  ,url).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes createShortLink(ApplicationModels.ShortLinkReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("createShortLink");
        

        Response<ApplicationModels.ShortLinkRes> response = shareApiList.createShortLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes getShortLinkByHash(String hash ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShortLinkByHash");
        
        fullUrl = fullUrl.replace("{" + "hash" +"}",hash.toString());
        

        Response<ApplicationModels.ShortLinkRes> response = shareApiList.getShortLinkByHash(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes getOriginalShortLinkByHash(String hash ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOriginalShortLinkByHash");
        
        fullUrl = fullUrl.replace("{" + "hash" +"}",hash.toString());
        

        Response<ApplicationModels.ShortLinkRes> response = shareApiList.getOriginalShortLinkByHash(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
public class FileStorageService extends FileStorage { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApiList filestorageApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    FileStorageService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageApiList = generateFilestorageApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("startUpload","/service/application/assets/v1.0/namespaces/{namespace}/upload/start/".substring(1));
            
                    relativeUrls.put("completeUpload","/service/application/assets/v1.0/namespaces/{namespace}/upload/complete/".substring(1));
            
                    relativeUrls.put("signUrls","/service/application/assets/v1.0/sign-urls/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private FileStorageApiList generateFilestorageApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),FileStorageApiList.class, interceptorList, cookieStore);
    }

    
    public ApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size, String namespace, File file, HashMap<String,Object> params) {
        return super.uploadMedia(fileName, contentType, size, namespace, file, this, params);
    }
    

     
    
    public ApplicationModels.StartResponse startUpload(String namespace ,ApplicationModels.StartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("startUpload");
        
        fullUrl = fullUrl.replace("{" + "namespace" +"}",namespace.toString());
        

        Response<ApplicationModels.StartResponse> response = filestorageApiList.startUpload(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CompleteResponse completeUpload(String namespace ,ApplicationModels.StartResponse body) throws IOException {
     
      String fullUrl = relativeUrls.get("completeUpload");
        
        fullUrl = fullUrl.replace("{" + "namespace" +"}",namespace.toString());
        

        Response<ApplicationModels.CompleteResponse> response = filestorageApiList.completeUpload(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SignUrlResponse signUrls(ApplicationModels.SignUrlRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("signUrls");
        

        Response<ApplicationModels.SignUrlResponse> response = filestorageApiList.signUrls(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ConfigurationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApiList configurationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    ConfigurationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApiList = generateConfigurationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getApplication","/service/application/configuration/v1.0/application".substring(1));
            
                    relativeUrls.put("getOwnerInfo","/service/application/configuration/v1.0/about".substring(1));
            
                    relativeUrls.put("getBasicDetails","/service/application/configuration/v1.0/detail".substring(1));
            
                    relativeUrls.put("getIntegrationTokens","/service/application/configuration/v1.0/token".substring(1));
            
                    relativeUrls.put("getOrderingStores","/service/application/configuration/v1.0/ordering-store/stores".substring(1));
            
                    relativeUrls.put("getStoreDetailById","/service/application/configuration/v1.0/ordering-store/stores/{store_id}".substring(1));
            
                    relativeUrls.put("getFeatures","/service/application/configuration/v1.0/feature".substring(1));
            
                    relativeUrls.put("getContactInfo","/service/application/configuration/v1.0/information".substring(1));
            
                    relativeUrls.put("getCurrencies","/service/application/configuration/v1.0/currencies".substring(1));
            
                    relativeUrls.put("getCurrencyById","/service/application/configuration/v1.0/currency/{id}".substring(1));
            
                    relativeUrls.put("getAppCurrencies","/service/application/configuration/v1.0/currency".substring(1));
            
                    relativeUrls.put("getLanguages","/service/application/configuration/v1.0/languages".substring(1));
            
                    relativeUrls.put("getOrderingStoreCookie","/service/application/configuration/v1.0/ordering-store/select".substring(1));
            
                    relativeUrls.put("removeOrderingStoreCookie","/service/application/configuration/v1.0/ordering-store/select".substring(1));
            
                    relativeUrls.put("getAppStaffList","/service/application/configuration/v1.0/staff/list".substring(1));
            
                    relativeUrls.put("getAppStaffs","/service/application/configuration/v1.0/staff".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.Application getApplication() throws IOException {
     
      String fullUrl = relativeUrls.get("getApplication");
        

        Response<ApplicationModels.Application> response = configurationApiList.getApplication(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationAboutResponse getOwnerInfo() throws IOException {
     
      String fullUrl = relativeUrls.get("getOwnerInfo");
        

        Response<ApplicationModels.ApplicationAboutResponse> response = configurationApiList.getOwnerInfo(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationDetail getBasicDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getBasicDetails");
        

        Response<ApplicationModels.ApplicationDetail> response = configurationApiList.getBasicDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppTokenResponse getIntegrationTokens() throws IOException {
     
      String fullUrl = relativeUrls.get("getIntegrationTokens");
        

        Response<ApplicationModels.AppTokenResponse> response = configurationApiList.getIntegrationTokens(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderingStores getOrderingStores(Integer pageNo , Integer pageSize , String q ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderingStores");
        

        Response<ApplicationModels.OrderingStores> response = configurationApiList.getOrderingStores(fullUrl  ,pageNo, pageSize, q).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrderingStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.OrderingStores> getOrderingStoresPagination(
        
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.OrderingStores callback = this.getOrderingStores(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    public ApplicationModels.OrderingStore getStoreDetailById(Integer storeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getStoreDetailById");
        
        fullUrl = fullUrl.replace("{" + "store_id" +"}",storeId.toString());
        

        Response<ApplicationModels.OrderingStore> response = configurationApiList.getStoreDetailById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppFeatureResponse getFeatures() throws IOException {
     
      String fullUrl = relativeUrls.get("getFeatures");
        

        Response<ApplicationModels.AppFeatureResponse> response = configurationApiList.getFeatures(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationInformation getContactInfo() throws IOException {
     
      String fullUrl = relativeUrls.get("getContactInfo");
        

        Response<ApplicationModels.ApplicationInformation> response = configurationApiList.getContactInfo(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CurrenciesResponse getCurrencies() throws IOException {
     
      String fullUrl = relativeUrls.get("getCurrencies");
        

        Response<ApplicationModels.CurrenciesResponse> response = configurationApiList.getCurrencies(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Currency getCurrencyById(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCurrencyById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.Currency> response = configurationApiList.getCurrencyById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppCurrencyResponse getAppCurrencies() throws IOException {
     
      String fullUrl = relativeUrls.get("getAppCurrencies");
        

        Response<ApplicationModels.AppCurrencyResponse> response = configurationApiList.getAppCurrencies(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LanguageResponse getLanguages() throws IOException {
     
      String fullUrl = relativeUrls.get("getLanguages");
        

        Response<ApplicationModels.LanguageResponse> response = configurationApiList.getLanguages(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SuccessMessageResponse getOrderingStoreCookie(ApplicationModels.OrderingStoreSelectRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderingStoreCookie");
        

        Response<ApplicationModels.SuccessMessageResponse> response = configurationApiList.getOrderingStoreCookie(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SuccessMessageResponse removeOrderingStoreCookie() throws IOException {
     
      String fullUrl = relativeUrls.get("removeOrderingStoreCookie");
        

        Response<ApplicationModels.SuccessMessageResponse> response = configurationApiList.removeOrderingStoreCookie(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppStaffListResponse getAppStaffList(Integer pageNo , Integer pageSize , Boolean orderIncent , Integer orderingStore , String user ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAppStaffList");
        

        Response<ApplicationModels.AppStaffListResponse> response = configurationApiList.getAppStaffList(fullUrl  ,pageNo, pageSize, orderIncent, orderingStore, user).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppStaffList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.AppStaffListResponse> getAppStaffListPagination(
        
        Integer pageSize,
        Boolean orderIncent,
        Integer orderingStore,
        String user
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.AppStaffListResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.AppStaffListResponse callback = this.getAppStaffList(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 orderIncent,
                 orderingStore,
                 user
            );
                
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    public ApplicationModels.AppStaffResponse getAppStaffs(Boolean orderIncent , Integer orderingStore , String user ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAppStaffs");
        

        Response<ApplicationModels.AppStaffResponse> response = configurationApiList.getAppStaffs(fullUrl  ,orderIncent, orderingStore, user).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class PaymentService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PaymentApiList paymentApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    PaymentService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.paymentApiList = generatePaymentApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getAggregatorsConfig","/service/application/payment/v1.0/config/aggregators/key".substring(1));
            
                    relativeUrls.put("attachCardToCustomer","/service/application/payment/v1.0/card/attach".substring(1));
            
                    relativeUrls.put("getActiveCardAggregator","/service/application/payment/v1.0/card/aggregator".substring(1));
            
                    relativeUrls.put("getActiveUserCards","/service/application/payment/v1.0/cards".substring(1));
            
                    relativeUrls.put("deleteUserCard","/service/application/payment/v1.0/card/remove".substring(1));
            
                    relativeUrls.put("verifyCustomerForPayment","/service/application/payment/v1.0/payment/customer/validation".substring(1));
            
                    relativeUrls.put("verifyAndChargePayment","/service/application/payment/v1.0/payment/confirm/charge".substring(1));
            
                    relativeUrls.put("initialisePayment","/service/application/payment/v1.0/payment/request".substring(1));
            
                    relativeUrls.put("checkAndUpdatePaymentStatus","/service/application/payment/v1.0/payment/confirm/polling".substring(1));
            
                    relativeUrls.put("getPaymentModeRoutes","/service/application/payment/v1.0/payment/options".substring(1));
            
                    relativeUrls.put("getPosPaymentModeRoutes","/service/application/payment/v1.0/payment/options/pos".substring(1));
            
                    relativeUrls.put("getRupifiBannerDetails","/service/application/payment/v1.0/rupifi/banner".substring(1));
            
                    relativeUrls.put("getEpaylaterBannerDetails","/service/application/payment/v1.0/epaylater/banner".substring(1));
            
                    relativeUrls.put("resendOrCancelPayment","/service/application/payment/v1.0/payment/resend_or_cancel".substring(1));
            
                    relativeUrls.put("renderHTML","/service/application/payment/v1.0/payment/html/render/".substring(1));
            
                    relativeUrls.put("validateVPA","/service/application/payment/v1.0/validate-vpa".substring(1));
            
                    relativeUrls.put("getActiveRefundTransferModes","/service/application/payment/v1.0/refund/transfer-mode".substring(1));
            
                    relativeUrls.put("enableOrDisableRefundTransferMode","/service/application/payment/v1.0/refund/transfer-mode".substring(1));
            
                    relativeUrls.put("getUserBeneficiariesDetail","/service/application/payment/v1.0/refund/user/beneficiary".substring(1));
            
                    relativeUrls.put("verifyIfscCode","/service/application/payment/v1.0/ifsc-code/verify".substring(1));
            
                    relativeUrls.put("getOrderBeneficiariesDetail","/service/application/payment/v1.0/refund/order/beneficiaries".substring(1));
            
                    relativeUrls.put("verifyOtpAndAddBeneficiaryForBank","/service/application/payment/v1.0/refund/verification/bank".substring(1));
            
                    relativeUrls.put("addBeneficiaryDetails","/service/application/payment/v1.0/refund/account".substring(1));
            
                    relativeUrls.put("addRefundBankAccountUsingOTP","/service/application/payment/v1.0/refund/account/otp".substring(1));
            
                    relativeUrls.put("verifyOtpAndAddBeneficiaryForWallet","/service/application/payment/v1.0/refund/verification/wallet".substring(1));
            
                    relativeUrls.put("updateDefaultBeneficiary","/service/application/payment/v1.0/refund/beneficiary/default".substring(1));
            
                    relativeUrls.put("getPaymentLink","/service/application/payment/v1.0/create-payment-link/".substring(1));
            
                    relativeUrls.put("createPaymentLink","/service/application/payment/v1.0/create-payment-link/".substring(1));
            
                    relativeUrls.put("resendPaymentLink","/service/application/payment/v1.0/resend-payment-link/".substring(1));
            
                    relativeUrls.put("cancelPaymentLink","/service/application/payment/v1.0/cancel-payment-link/".substring(1));
            
                    relativeUrls.put("getPaymentModeRoutesPaymentLink","/service/application/payment/v1.0/payment/options/link/".substring(1));
            
                    relativeUrls.put("pollingPaymentLink","/service/application/payment/v1.0/polling-payment-link/".substring(1));
            
                    relativeUrls.put("createOrderHandlerPaymentLink","/service/application/payment/v1.0/create-order/link/".substring(1));
            
                    relativeUrls.put("initialisePaymentPaymentLink","/service/application/payment/v1.0/payment/request/link/".substring(1));
            
                    relativeUrls.put("checkAndUpdatePaymentStatusPaymentLink","/service/application/payment/v1.0/payment/confirm/polling/link/".substring(1));
            
                    relativeUrls.put("customerCreditSummary","/service/application/payment/v1.0/payment/credit-summary/".substring(1));
            
                    relativeUrls.put("redirectToAggregator","/service/application/payment/v1.0/payment/redirect-to-aggregator/".substring(1));
            
                    relativeUrls.put("checkCredit","/service/application/payment/v1.0/check-credits/".substring(1));
            
                    relativeUrls.put("customerOnboard","/service/application/payment/v1.0/credit-onboard/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private PaymentApiList generatePaymentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PaymentApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.AggregatorsConfigDetailResponse getAggregatorsConfig(String xApiToken , Boolean refresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAggregatorsConfig");
        

        Response<ApplicationModels.AggregatorsConfigDetailResponse> response = paymentApiList.getAggregatorsConfig(fullUrl  ,xApiToken, refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AttachCardsResponse attachCardToCustomer(ApplicationModels.AttachCardRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("attachCardToCustomer");
        

        Response<ApplicationModels.AttachCardsResponse> response = paymentApiList.attachCardToCustomer(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ActiveCardPaymentGatewayResponse getActiveCardAggregator(Boolean refresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveCardAggregator");
        

        Response<ApplicationModels.ActiveCardPaymentGatewayResponse> response = paymentApiList.getActiveCardAggregator(fullUrl  ,refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ListCardsResponse getActiveUserCards(Boolean forceRefresh ) throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveUserCards");
        

        Response<ApplicationModels.ListCardsResponse> response = paymentApiList.getActiveUserCards(fullUrl  ,forceRefresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.DeleteCardsResponse deleteUserCard(ApplicationModels.DeletehCardRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteUserCard");
        

        Response<ApplicationModels.DeleteCardsResponse> response = paymentApiList.deleteUserCard(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ValidateCustomerResponse verifyCustomerForPayment(ApplicationModels.ValidateCustomerRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyCustomerForPayment");
        

        Response<ApplicationModels.ValidateCustomerResponse> response = paymentApiList.verifyCustomerForPayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ChargeCustomerResponse verifyAndChargePayment(ApplicationModels.ChargeCustomerRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyAndChargePayment");
        

        Response<ApplicationModels.ChargeCustomerResponse> response = paymentApiList.verifyAndChargePayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentInitializationResponse initialisePayment(ApplicationModels.PaymentInitializationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("initialisePayment");
        

        Response<ApplicationModels.PaymentInitializationResponse> response = paymentApiList.initialisePayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(ApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatus");
        

        Response<ApplicationModels.PaymentStatusUpdateResponse> response = paymentApiList.checkAndUpdatePaymentStatus(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentModeRouteResponse getPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String cardReference , String userDetails ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentModeRoutes");
        

        Response<ApplicationModels.PaymentModeRouteResponse> response = paymentApiList.getPaymentModeRoutes(fullUrl  ,amount, cartId, pincode, checkoutMode, refresh, cardReference, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentModeRouteResponse getPosPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String cardReference , String orderType , String userDetails ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPosPaymentModeRoutes");
        

        Response<ApplicationModels.PaymentModeRouteResponse> response = paymentApiList.getPosPaymentModeRoutes(fullUrl  ,amount, cartId, pincode, checkoutMode, refresh, cardReference, orderType, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RupifiBannerResponse getRupifiBannerDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getRupifiBannerDetails");
        

        Response<ApplicationModels.RupifiBannerResponse> response = paymentApiList.getRupifiBannerDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.EpaylaterBannerResponse getEpaylaterBannerDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getEpaylaterBannerDetails");
        

        Response<ApplicationModels.EpaylaterBannerResponse> response = paymentApiList.getEpaylaterBannerDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResendOrCancelPaymentResponse resendOrCancelPayment(ApplicationModels.ResendOrCancelPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("resendOrCancelPayment");
        

        Response<ApplicationModels.ResendOrCancelPaymentResponse> response = paymentApiList.resendOrCancelPayment(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.renderHTMLResponse renderHTML(ApplicationModels.renderHTMLRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("renderHTML");
        

        Response<ApplicationModels.renderHTMLResponse> response = paymentApiList.renderHTML(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ValidateVPAResponse validateVPA(ApplicationModels.ValidateVPARequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("validateVPA");
        

        Response<ApplicationModels.ValidateVPAResponse> response = paymentApiList.validateVPA(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TransferModeResponse getActiveRefundTransferModes() throws IOException {
     
      String fullUrl = relativeUrls.get("getActiveRefundTransferModes");
        

        Response<ApplicationModels.TransferModeResponse> response = paymentApiList.getActiveRefundTransferModes(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateRefundTransferModeResponse enableOrDisableRefundTransferMode(ApplicationModels.UpdateRefundTransferModeRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("enableOrDisableRefundTransferMode");
        

        Response<ApplicationModels.UpdateRefundTransferModeResponse> response = paymentApiList.enableOrDisableRefundTransferMode(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderBeneficiaryResponse getUserBeneficiariesDetail(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getUserBeneficiariesDetail");
        

        Response<ApplicationModels.OrderBeneficiaryResponse> response = paymentApiList.getUserBeneficiariesDetail(fullUrl  ,orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.IfscCodeResponse verifyIfscCode(String ifscCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyIfscCode");
        

        Response<ApplicationModels.IfscCodeResponse> response = paymentApiList.verifyIfscCode(fullUrl  ,ifscCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderBeneficiaryResponse getOrderBeneficiariesDetail(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderBeneficiariesDetail");
        

        Response<ApplicationModels.OrderBeneficiaryResponse> response = paymentApiList.getOrderBeneficiariesDetail(fullUrl  ,orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddBeneficiaryViaOtpVerificationResponse verifyOtpAndAddBeneficiaryForBank(ApplicationModels.AddBeneficiaryViaOtpVerificationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForBank");
        

        Response<ApplicationModels.AddBeneficiaryViaOtpVerificationResponse> response = paymentApiList.verifyOtpAndAddBeneficiaryForBank(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RefundAccountResponse addBeneficiaryDetails(ApplicationModels.AddBeneficiaryDetailsRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addBeneficiaryDetails");
        

        Response<ApplicationModels.RefundAccountResponse> response = paymentApiList.addBeneficiaryDetails(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RefundAccountResponse addRefundBankAccountUsingOTP(ApplicationModels.AddBeneficiaryDetailsOTPRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addRefundBankAccountUsingOTP");
        

        Response<ApplicationModels.RefundAccountResponse> response = paymentApiList.addRefundBankAccountUsingOTP(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.WalletOtpResponse verifyOtpAndAddBeneficiaryForWallet(ApplicationModels.WalletOtpRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpAndAddBeneficiaryForWallet");
        

        Response<ApplicationModels.WalletOtpResponse> response = paymentApiList.verifyOtpAndAddBeneficiaryForWallet(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SetDefaultBeneficiaryResponse updateDefaultBeneficiary(ApplicationModels.SetDefaultBeneficiaryRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateDefaultBeneficiary");
        

        Response<ApplicationModels.SetDefaultBeneficiaryResponse> response = paymentApiList.updateDefaultBeneficiary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetPaymentLinkResponse getPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentLink");
        

        Response<ApplicationModels.GetPaymentLinkResponse> response = paymentApiList.getPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CreatePaymentLinkResponse createPaymentLink(ApplicationModels.CreatePaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("createPaymentLink");
        

        Response<ApplicationModels.CreatePaymentLinkResponse> response = paymentApiList.createPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResendPaymentLinkResponse resendPaymentLink(ApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("resendPaymentLink");
        

        Response<ApplicationModels.ResendPaymentLinkResponse> response = paymentApiList.resendPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CancelPaymentLinkResponse cancelPaymentLink(ApplicationModels.CancelOrResendPaymentLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("cancelPaymentLink");
        

        Response<ApplicationModels.CancelPaymentLinkResponse> response = paymentApiList.cancelPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentModeRouteResponse getPaymentModeRoutesPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPaymentModeRoutesPaymentLink");
        

        Response<ApplicationModels.PaymentModeRouteResponse> response = paymentApiList.getPaymentModeRoutesPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PollingPaymentLinkResponse pollingPaymentLink(String paymentLinkId ) throws IOException {
     
      String fullUrl = relativeUrls.get("pollingPaymentLink");
        

        Response<ApplicationModels.PollingPaymentLinkResponse> response = paymentApiList.pollingPaymentLink(fullUrl  ,paymentLinkId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CreateOrderUserResponse createOrderHandlerPaymentLink(ApplicationModels.CreateOrderUserRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("createOrderHandlerPaymentLink");
        

        Response<ApplicationModels.CreateOrderUserResponse> response = paymentApiList.createOrderHandlerPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentInitializationResponse initialisePaymentPaymentLink(ApplicationModels.PaymentInitializationRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("initialisePaymentPaymentLink");
        

        Response<ApplicationModels.PaymentInitializationResponse> response = paymentApiList.initialisePaymentPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatusPaymentLink(ApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkAndUpdatePaymentStatusPaymentLink");
        

        Response<ApplicationModels.PaymentStatusUpdateResponse> response = paymentApiList.checkAndUpdatePaymentStatusPaymentLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CustomerCreditSummaryResponse customerCreditSummary(String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("customerCreditSummary");
        

        Response<ApplicationModels.CustomerCreditSummaryResponse> response = paymentApiList.customerCreditSummary(fullUrl  ,aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RedirectToAggregatorResponse redirectToAggregator(String source , String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("redirectToAggregator");
        

        Response<ApplicationModels.RedirectToAggregatorResponse> response = paymentApiList.redirectToAggregator(fullUrl  ,source, aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CheckCreditResponse checkCredit(String aggregator ) throws IOException {
     
      String fullUrl = relativeUrls.get("checkCredit");
        

        Response<ApplicationModels.CheckCreditResponse> response = paymentApiList.checkCredit(fullUrl  ,aggregator).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CustomerOnboardingResponse customerOnboard(ApplicationModels.CustomerOnboardingRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("customerOnboard");
        

        Response<ApplicationModels.CustomerOnboardingResponse> response = paymentApiList.customerOnboard(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class OrderService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private OrderApiList orderApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    OrderService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.orderApiList = generateOrderApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getOrders","/service/application/orders/v1.0/orders".substring(1));
            
                    relativeUrls.put("getOrderById","/service/application/orders/v1.0/orders/{order_id}".substring(1));
            
                    relativeUrls.put("getPosOrderById","/service/application/orders/v1.0/orders/pos-order/{order_id}".substring(1));
            
                    relativeUrls.put("getShipmentById","/service/application/orders/v1.0/orders/shipments/{shipment_id}".substring(1));
            
                    relativeUrls.put("getInvoiceByShipmentId","/service/application/orders/v1.0/orders/shipments/{shipment_id}/invoice".substring(1));
            
                    relativeUrls.put("trackShipment","/service/application/orders/v1.0/orders/shipments/{shipment_id}/track".substring(1));
            
                    relativeUrls.put("getCustomerDetailsByShipmentId","/service/application/orders/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details".substring(1));
            
                    relativeUrls.put("sendOtpToShipmentCustomer","/service/application/orders/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/".substring(1));
            
                    relativeUrls.put("verifyOtpShipmentCustomer","/service/application/orders/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify/".substring(1));
            
                    relativeUrls.put("getShipmentBagReasons","/service/application/orders/v1.0/orders/shipments/{shipment_id}/bags/{bag_id}/reasons".substring(1));
            
                    relativeUrls.put("getShipmentReasons","/service/application/orders/v1.0/orders/shipments/{shipment_id}/reasons".substring(1));
            
                    relativeUrls.put("updateShipmentStatus","/service/application/order-manage/v1.0/orders/shipments/{shipment_id}/status".substring(1));
            
                    relativeUrls.put("getInvoiceByShipmentId1","/service/application/document/v1.0/orders/shipments/{shipment_id}/invoice".substring(1));
            
                    relativeUrls.put("getCreditNoteByShipmentId","/service/application/document/v1.0/orders/shipments/{shipment_id}/credit-note".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private OrderApiList generateOrderApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),OrderApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.OrderList getOrders(Integer status , Integer pageNo , Integer pageSize , String fromDate , String toDate , String customMeta ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrders");
        

        Response<ApplicationModels.OrderList> response = orderApiList.getOrders(fullUrl  ,status, pageNo, pageSize, fromDate, toDate, customMeta).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderById getOrderById(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderById");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        

        Response<ApplicationModels.OrderById> response = orderApiList.getOrderById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderList getPosOrderById(String orderId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPosOrderById");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        

        Response<ApplicationModels.OrderList> response = orderApiList.getPosOrderById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentById getShipmentById(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentById");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ShipmentById> response = orderApiList.getShipmentById(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResponseGetInvoiceShipment getInvoiceByShipmentId(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getInvoiceByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ResponseGetInvoiceShipment> response = orderApiList.getInvoiceByShipmentId(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentTrack trackShipment(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("trackShipment");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ShipmentTrack> response = orderApiList.trackShipment(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CustomerDetailsResponse getCustomerDetailsByShipmentId(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCustomerDetailsByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.CustomerDetailsResponse> response = orderApiList.getCustomerDetailsByShipmentId(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendOtpToCustomerResponse sendOtpToShipmentCustomer(String orderId , String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOtpToShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.SendOtpToCustomerResponse> response = orderApiList.sendOtpToShipmentCustomer(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyOtpResponse verifyOtpShipmentCustomer(String orderId , String shipmentId ,ApplicationModels.VerifyOtp body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyOtpShipmentCustomer");
        
        fullUrl = fullUrl.replace("{" + "order_id" +"}",orderId.toString());
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.VerifyOtpResponse> response = orderApiList.verifyOtpShipmentCustomer(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentBagReasons getShipmentBagReasons(String shipmentId , String bagId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentBagReasons");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        
        fullUrl = fullUrl.replace("{" + "bag_id" +"}",bagId.toString());
        

        Response<ApplicationModels.ShipmentBagReasons> response = orderApiList.getShipmentBagReasons(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentReasons getShipmentReasons(String shipmentId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipmentReasons");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ShipmentReasons> response = orderApiList.getShipmentReasons(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentApplicationStatusResponse updateShipmentStatus(String shipmentId ,ApplicationModels.UpdateShipmentStatusRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateShipmentStatus");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ShipmentApplicationStatusResponse> response = orderApiList.updateShipmentStatus(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResponseGetInvoiceShipment1 getInvoiceByShipmentId1(String shipmentId , ApplicationModels.invoiceParameter parameters ) throws IOException {
     
      String fullUrl = relativeUrls.get("getInvoiceByShipmentId1");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ResponseGetInvoiceShipment1> response = orderApiList.getInvoiceByShipmentId1(fullUrl  ,parameters).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResponseGetInvoiceShipment1 getCreditNoteByShipmentId(String shipmentId , ApplicationModels.creditNoteParameter parameters ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCreditNoteByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<ApplicationModels.ResponseGetInvoiceShipment1> response = orderApiList.getCreditNoteByShipmentId(fullUrl  ,parameters).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class RewardsService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private RewardsApiList rewardsApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    RewardsService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.rewardsApiList = generateRewardsApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getPointsOnProduct","/service/application/rewards/v1.0/catalogue/offer/order/".substring(1));
            
                    relativeUrls.put("getOfferByName","/service/application/rewards/v1.0/offers/{name}/".substring(1));
            
                    relativeUrls.put("getOrderDiscount","/service/application/rewards/v1.0/user/offers/order-discount/".substring(1));
            
                    relativeUrls.put("getUserPoints","/service/application/rewards/v1.0/user/points/".substring(1));
            
                    relativeUrls.put("getUserPointsHistory","/service/application/rewards/v1.0/user/points/history/".substring(1));
            
                    relativeUrls.put("getUserReferralDetails","/service/application/rewards/v1.0/user/referral/".substring(1));
            
                    relativeUrls.put("redeemReferralCode","/service/application/rewards/v1.0/user/referral/redeem/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private RewardsApiList generateRewardsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),RewardsApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.CatalogueOrderResponse getPointsOnProduct(ApplicationModels.CatalogueOrderRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getPointsOnProduct");
        

        Response<ApplicationModels.CatalogueOrderResponse> response = rewardsApiList.getPointsOnProduct(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Offer getOfferByName(String name ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOfferByName");
        
        fullUrl = fullUrl.replace("{" + "name" +"}",name.toString());
        

        Response<ApplicationModels.Offer> response = rewardsApiList.getOfferByName(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderDiscountResponse getOrderDiscount(ApplicationModels.OrderDiscountRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getOrderDiscount");
        

        Response<ApplicationModels.OrderDiscountResponse> response = rewardsApiList.getOrderDiscount(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PointsResponse getUserPoints() throws IOException {
     
      String fullUrl = relativeUrls.get("getUserPoints");
        

        Response<ApplicationModels.PointsResponse> response = rewardsApiList.getUserPoints(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PointsHistoryResponse getUserPointsHistory(String pageId , Integer pageSize ) throws IOException {
     
      String fullUrl = relativeUrls.get("getUserPointsHistory");
        

        Response<ApplicationModels.PointsHistoryResponse> response = rewardsApiList.getUserPointsHistory(fullUrl  ,pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getUserPointsHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.PointsHistoryResponse> getUserPointsHistoryPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.PointsHistoryResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.PointsHistoryResponse callback = this.getUserPointsHistory(
                
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
    return paginator ;
    }
    
    
    public ApplicationModels.ReferralDetailsResponse getUserReferralDetails() throws IOException {
     
      String fullUrl = relativeUrls.get("getUserReferralDetails");
        

        Response<ApplicationModels.ReferralDetailsResponse> response = rewardsApiList.getUserReferralDetails(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RedeemReferralCodeResponse redeemReferralCode(ApplicationModels.RedeemReferralCodeRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("redeemReferralCode");
        

        Response<ApplicationModels.RedeemReferralCodeResponse> response = rewardsApiList.redeemReferralCode(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class PosCartService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PosCartApiList poscartApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    PosCartService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.poscartApiList = generatePoscartApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getCart","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getCartLastModified","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("addItems","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("updateCart","/service/application/pos/cart/v1.0/detail".substring(1));
            
                    relativeUrls.put("getItemCount","/service/application/pos/cart/v1.0/basic".substring(1));
            
                    relativeUrls.put("getCoupons","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("applyCoupon","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("removeCoupon","/service/application/pos/cart/v1.0/coupon".substring(1));
            
                    relativeUrls.put("getBulkDiscountOffers","/service/application/pos/cart/v1.0/bulk-price".substring(1));
            
                    relativeUrls.put("applyRewardPoints","/service/application/pos/cart/v1.0/redeem/points/".substring(1));
            
                    relativeUrls.put("getAddresses","/service/application/pos/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("addAddress","/service/application/pos/cart/v1.0/address".substring(1));
            
                    relativeUrls.put("getAddressById","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("updateAddress","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("removeAddress","/service/application/pos/cart/v1.0/address/{id}".substring(1));
            
                    relativeUrls.put("selectAddress","/service/application/pos/cart/v1.0/select-address".substring(1));
            
                    relativeUrls.put("selectPaymentMode","/service/application/pos/cart/v1.0/payment".substring(1));
            
                    relativeUrls.put("validateCouponForPayment","/service/application/pos/cart/v1.0/payment/validate/".substring(1));
            
                    relativeUrls.put("getShipments","/service/application/pos/cart/v1.0/shipment".substring(1));
            
                    relativeUrls.put("updateShipments","/service/application/pos/cart/v1.0/shipment".substring(1));
            
                    relativeUrls.put("checkoutCart","/service/application/pos/cart/v1.0/checkout".substring(1));
            
                    relativeUrls.put("updateCartMeta","/service/application/pos/cart/v1.0/meta".substring(1));
            
                    relativeUrls.put("getAvailableDeliveryModes","/service/application/pos/cart/v1.0/available-delivery-mode".substring(1));
            
                    relativeUrls.put("getStoreAddressByUid","/service/application/pos/cart/v1.0/store-address".substring(1));
            
                    relativeUrls.put("getCartShareLink","/service/application/pos/cart/v1.0/share-cart".substring(1));
            
                    relativeUrls.put("getCartSharedItems","/service/application/pos/cart/v1.0/share-cart/{token}".substring(1));
            
                    relativeUrls.put("updateCartWithSharedItems","/service/application/pos/cart/v1.0/share-cart/{token}/{action}".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private PosCartApiList generatePoscartApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PosCartApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.CartDetailResponse getCart(String id , Boolean i , Boolean b , Integer assignCardId , String areaCode , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCart");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.getCart(fullUrl  ,id, i, b, assignCardId, areaCode, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object getCartLastModified(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartLastModified");
        

        Response<Object> response = poscartApiList.getCartLastModified(fullUrl  ,id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddCartDetailResponse addItems(Boolean i , Boolean b , String areaCode , Boolean buyNow ,ApplicationModels.AddCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("addItems");
        

        Response<ApplicationModels.AddCartDetailResponse> response = poscartApiList.addItems(fullUrl  ,i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateCartDetailResponse updateCart(String id , Boolean i , Boolean b , String areaCode , Boolean buyNow ,ApplicationModels.UpdateCartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCart");
        

        Response<ApplicationModels.UpdateCartDetailResponse> response = poscartApiList.updateCart(fullUrl  ,id, i, b, areaCode, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartItemCountResponse getItemCount(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getItemCount");
        

        Response<ApplicationModels.CartItemCountResponse> response = poscartApiList.getItemCount(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCouponResponse getCoupons(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCoupons");
        

        Response<ApplicationModels.GetCouponResponse> response = poscartApiList.getCoupons(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse applyCoupon(Boolean i , Boolean b , Boolean p , String id , Boolean buyNow ,ApplicationModels.ApplyCouponRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyCoupon");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.applyCoupon(fullUrl  ,i, b, p, id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse removeCoupon(String id , Boolean buyNow ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeCoupon");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.removeCoupon(fullUrl  ,id, buyNow).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getBulkDiscountOffers");
        

        Response<ApplicationModels.BulkPriceResponse> response = poscartApiList.getBulkDiscountOffers(fullUrl  ,itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse applyRewardPoints(String id , Boolean i , Boolean b , Boolean buyNow ,ApplicationModels.RewardPointRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("applyRewardPoints");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.applyRewardPoints(fullUrl  ,id, i, b, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetAddressesResponse getAddresses(String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddresses");
        

        Response<ApplicationModels.GetAddressesResponse> response = poscartApiList.getAddresses(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SaveAddressResponse addAddress(ApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("addAddress");
        

        Response<ApplicationModels.SaveAddressResponse> response = poscartApiList.addAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Address getAddressById(String id , String cartId , Boolean buyNow , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAddressById");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.Address> response = poscartApiList.getAddressById(fullUrl  ,cartId, buyNow, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateAddressResponse updateAddress(String id ,ApplicationModels.Address body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.UpdateAddressResponse> response = poscartApiList.updateAddress(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.DeleteAddressResponse removeAddress(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("removeAddress");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<ApplicationModels.DeleteAddressResponse> response = poscartApiList.removeAddress(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse selectAddress(String cartId , Boolean buyNow , Boolean i , Boolean b ,ApplicationModels.SelectCartAddressRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectAddress");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.selectAddress(fullUrl  ,cartId, buyNow, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDetailResponse selectPaymentMode(String id , Boolean buyNow ,ApplicationModels.UpdateCartPaymentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("selectPaymentMode");
        

        Response<ApplicationModels.CartDetailResponse> response = poscartApiList.selectPaymentMode(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentCouponValidate validateCouponForPayment(String id , Boolean buyNow , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
     
      String fullUrl = relativeUrls.get("validateCouponForPayment");
        

        Response<ApplicationModels.PaymentCouponValidate> response = poscartApiList.validateCouponForPayment(fullUrl  ,id, buyNow, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse getShipments(Integer pickAtStoreUid , Integer orderingStoreId , Boolean p , String id , String addressId , String areaCode , String orderType ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShipments");
        

        Response<ApplicationModels.CartShipmentsResponse> response = poscartApiList.getShipments(fullUrl  ,pickAtStoreUid, orderingStoreId, p, id, addressId, areaCode, orderType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse updateShipments(Boolean i , Boolean p , String id , String addressId , String orderType ,ApplicationModels.UpdateCartShipmentRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateShipments");
        

        Response<ApplicationModels.CartShipmentsResponse> response = poscartApiList.updateShipments(fullUrl  ,i, p, id, addressId, orderType, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartCheckoutResponse checkoutCart(String id ,ApplicationModels.CartPosCheckoutDetailRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("checkoutCart");
        

        Response<ApplicationModels.CartCheckoutResponse> response = poscartApiList.checkoutCart(fullUrl  ,id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartMetaResponse updateCartMeta(String id , Boolean buyNow ,ApplicationModels.CartMetaRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartMeta");
        

        Response<ApplicationModels.CartMetaResponse> response = poscartApiList.updateCartMeta(fullUrl  ,id, buyNow, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDeliveryModesResponse getAvailableDeliveryModes(String areaCode , String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAvailableDeliveryModes");
        

        Response<ApplicationModels.CartDeliveryModesResponse> response = poscartApiList.getAvailableDeliveryModes(fullUrl  ,areaCode, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.StoreDetailsResponse getStoreAddressByUid(Integer storeUid ) throws IOException {
     
      String fullUrl = relativeUrls.get("getStoreAddressByUid");
        

        Response<ApplicationModels.StoreDetailsResponse> response = poscartApiList.getStoreAddressByUid(fullUrl  ,storeUid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetShareCartLinkResponse getCartShareLink(ApplicationModels.GetShareCartLinkRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartShareLink");
        

        Response<ApplicationModels.GetShareCartLinkResponse> response = poscartApiList.getCartShareLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCartSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        

        Response<ApplicationModels.SharedCartResponse> response = poscartApiList.getCartSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
     
      String fullUrl = relativeUrls.get("updateCartWithSharedItems");
        
        fullUrl = fullUrl.replace("{" + "token" +"}",token.toString());
        
        fullUrl = fullUrl.replace("{" + "action" +"}",action.toString());
        

        Response<ApplicationModels.SharedCartResponse> response = poscartApiList.updateCartWithSharedItems(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class LogisticService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LogisticApiList logisticApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    LogisticService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.logisticApiList = generateLogisticApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getTatProduct","/service/application/logistics/v1.0".substring(1));
            
                    relativeUrls.put("getPincodeZones","/service/application/logistics/v1.0/pincode/zones".substring(1));
            
                    relativeUrls.put("getPincodeCity","/service/application/logistics/v1.0/pincode/{pincode}".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private LogisticApiList generateLogisticApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LogisticApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ApplicationModels.GetTatProductResponse getTatProduct(ApplicationModels.GetTatProductReqBody body) throws IOException {
     
      String fullUrl = relativeUrls.get("getTatProduct");
        

        Response<ApplicationModels.GetTatProductResponse> response = logisticApiList.getTatProduct(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetPincodeZonesResponse getPincodeZones(ApplicationModels.GetPincodeZonesReqBody body) throws IOException {
     
      String fullUrl = relativeUrls.get("getPincodeZones");
        

        Response<ApplicationModels.GetPincodeZonesResponse> response = logisticApiList.getPincodeZones(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetPincodeCityResponse getPincodeCity(String pincode ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPincodeCity");
        
        fullUrl = fullUrl.replace("{" + "pincode" +"}",pincode.toString());
        

        Response<ApplicationModels.GetPincodeCityResponse> response = logisticApiList.getPincodeCity(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}