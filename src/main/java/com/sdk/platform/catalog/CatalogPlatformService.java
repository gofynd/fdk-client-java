package com.sdk.platform.catalog;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class CatalogPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CatalogPlatformApiList catalogPlatformApiList;

    public CatalogPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.catalogPlatformApiList = generateCatalogPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CatalogPlatformApiList generateCatalogPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CatalogPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CategoryResponse listCategories(String level, Integer department, String q, Integer pageNo, Integer pageSize, List<Integer> uids, String slug) throws FDKServerResponseError, FDKException {
        return this.listCategories(level, department, q, pageNo, pageSize, uids, slug, new HashMap<>());
    }

    public CatalogPlatformModels.CategoryResponse listCategories(String level, Integer department, String q, Integer pageNo, Integer pageSize, List<Integer> uids, String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CategoryResponse> response = null;
            try {
                response = catalogPlatformApiList.listCategories(this.companyId, level, department, q, pageNo, pageSize, uids, slug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for listCategories
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.CategoryResponse> listCategoriesPagination(
        String level ,
        Integer department ,
        String q ,
        Integer pageSize ,
        List<Integer> uids ,
        String slug 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.CategoryResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.CategoryResponse callback = this.listCategories(
                
                 
                 level,
                 department,
                 q,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 uids,
                 slug
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SingleCategoryResponse getCategoryData(String uid) throws FDKServerResponseError, FDKException {
        return this.getCategoryData(uid, new HashMap<>());
    }

    public CatalogPlatformModels.SingleCategoryResponse getCategoryData(String uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SingleCategoryResponse> response = null;
            try {
                response = catalogPlatformApiList.getCategoryData(this.companyId, uid, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CrossSellingResponse getSellerInsights(String sellerAppId) throws FDKServerResponseError, FDKException {
        return this.getSellerInsights(sellerAppId, new HashMap<>());
    }

    public CatalogPlatformModels.CrossSellingResponse getSellerInsights(String sellerAppId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CrossSellingResponse> response = null;
            try {
                response = catalogPlatformApiList.getSellerInsights(this.companyId, sellerAppId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.DepartmentsResponse listDepartmentsData(Integer pageNo, String itemType, Integer pageSize, String name, String search, Boolean isActive, String slug) throws FDKServerResponseError, FDKException {
        return this.listDepartmentsData(pageNo, itemType, pageSize, name, search, isActive, slug, new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentsResponse listDepartmentsData(Integer pageNo, String itemType, Integer pageSize, String name, String search, Boolean isActive, String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentsResponse> response = null;
            try {
                response = catalogPlatformApiList.listDepartmentsData(this.companyId, pageNo, itemType, pageSize, name, search, isActive, slug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for listDepartmentsData
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.DepartmentsResponse> listDepartmentsDataPagination(
        String itemType ,
        Integer pageSize ,
        String name ,
        String search ,
        Boolean isActive ,
        String slug 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.DepartmentsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.DepartmentsResponse callback = this.listDepartmentsData(
                
                 
                 paginator.getPageNo()
                ,
                 itemType,
                 paginator.getPageSize()
                ,
                 name,
                 search,
                 isActive,
                 slug
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.DepartmentsResponse getDepartmentData(String uid) throws FDKServerResponseError, FDKException {
        return this.getDepartmentData(uid, new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentsResponse getDepartmentData(String uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentsResponse> response = null;
            try {
                response = catalogPlatformApiList.getDepartmentData(this.companyId, uid, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductConfigurationDownloads listTemplateBrandTypeValues(String filter, String templateTag, String itemType) throws FDKServerResponseError, FDKException {
        return this.listTemplateBrandTypeValues(filter, templateTag, itemType, new HashMap<>());
    }

    public CatalogPlatformModels.ProductConfigurationDownloads listTemplateBrandTypeValues(String filter, String templateTag, String itemType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductConfigurationDownloads> response = null;
            try {
                response = catalogPlatformApiList.listTemplateBrandTypeValues(this.companyId, filter, templateTag, itemType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkHsnResponse bulkHsnCode(CatalogPlatformModels.BulkHsnUpsert body) throws FDKServerResponseError, FDKException {
        return this.bulkHsnCode(body, new HashMap<>());
    }

    public CatalogPlatformModels.BulkHsnResponse bulkHsnCode(CatalogPlatformModels.BulkHsnUpsert body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkHsnResponse> response = null;
            try {
                response = catalogPlatformApiList.bulkHsnCode(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HsnCode getHsnCode(String id) throws FDKServerResponseError, FDKException {
        return this.getHsnCode(id, new HashMap<>());
    }

    public CatalogPlatformModels.HsnCode getHsnCode(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HsnCode> response = null;
            try {
                response = catalogPlatformApiList.getHsnCode(this.companyId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HsnCode updateHsnCode(String id, CatalogPlatformModels.HsnUpsert body) throws FDKServerResponseError, FDKException {
        return this.updateHsnCode(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.HsnCode updateHsnCode(String id, CatalogPlatformModels.HsnUpsert body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HsnCode> response = null;
            try {
                response = catalogPlatformApiList.updateHsnCode(this.companyId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetInventoriesResponse getInventories(String itemId, String size, Integer pageNo, Integer pageSize, String pageId, String pageType, String q, Boolean sellable, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate, String sizeIdentifier) throws FDKServerResponseError, FDKException {
        return this.getInventories(itemId, size, pageNo, pageSize, pageId, pageType, q, sellable, storeIds, brandIds, sellerIdentifiers, qtyGt, qtyLt, qtyType, fromDate, toDate, sizeIdentifier, new HashMap<>());
    }

    public CatalogPlatformModels.GetInventoriesResponse getInventories(String itemId, String size, Integer pageNo, Integer pageSize, String pageId, String pageType, String q, Boolean sellable, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate, String sizeIdentifier, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetInventoriesResponse> response = null;
            try {
                response = catalogPlatformApiList.getInventories(this.companyId, itemId, size, pageNo, pageSize, pageId, pageType, q, sellable, storeIds, brandIds, sellerIdentifiers, qtyGt, qtyLt, qtyType, fromDate, toDate, sizeIdentifier, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getInventories
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.GetInventoriesResponse> getInventoriesPagination(
        String itemId ,
        String size ,
        Integer pageSize ,
        String q ,
        Boolean sellable ,
        List<Integer> storeIds ,
        List<Integer> brandIds ,
        List<String> sellerIdentifiers ,
        Integer qtyGt ,
        Integer qtyLt ,
        String qtyType ,
        String fromDate ,
        String toDate ,
        String sizeIdentifier 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.GetInventoriesResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.GetInventoriesResponse callback = this.getInventories(
                
                 
                 itemId,
                 size,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getNextId()
                ,
                 paginator.getPageType()
                ,
                 q,
                 sellable,
                 storeIds,
                 brandIds,
                 sellerIdentifiers,
                 qtyGt,
                 qtyLt,
                 qtyType,
                 fromDate,
                 toDate,
                 sizeIdentifier
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer pageNo, Integer pageSize, String search) throws FDKServerResponseError, FDKException {
        return this.getInventoryBulkUploadHistory(pageNo, pageSize, search, new HashMap<>());
    }

    public CatalogPlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer pageNo, Integer pageSize, String search, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkInventoryGet> response = null;
            try {
                response = catalogPlatformApiList.getInventoryBulkUploadHistory(this.companyId, pageNo, pageSize, search, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getInventoryBulkUploadHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.BulkInventoryGet> getInventoryBulkUploadHistoryPagination(
        Integer pageSize ,
        String search 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.BulkInventoryGet> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.BulkInventoryGet callback = this.getInventoryBulkUploadHistory(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 search
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkResponse createBulkInventoryJob(CatalogPlatformModels.BulkJob body) throws FDKServerResponseError, FDKException {
        return this.createBulkInventoryJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.BulkResponse createBulkInventoryJob(CatalogPlatformModels.BulkJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkResponse> response = null;
            try {
                response = catalogPlatformApiList.createBulkInventoryJob(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse deleteBulkInventoryJob(String batchId) throws FDKServerResponseError, FDKException {
        return this.deleteBulkInventoryJob(batchId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse deleteBulkInventoryJob(String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.deleteBulkInventoryJob(this.companyId, batchId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse createBulkInventory(String batchId, CatalogPlatformModels.InventoryBulkRequest body) throws FDKServerResponseError, FDKException {
        return this.createBulkInventory(batchId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse createBulkInventory(String batchId, CatalogPlatformModels.InventoryBulkRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.createBulkInventory(this.companyId, batchId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportJob getInventoryExport() throws FDKServerResponseError, FDKException {
        return this.getInventoryExport(new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportJob getInventoryExport(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportJob> response = null;
            try {
                response = catalogPlatformApiList.getInventoryExport(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportResponse createInventoryExportJob(CatalogPlatformModels.InventoryExportRequest body) throws FDKServerResponseError, FDKException {
        return this.createInventoryExportJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportResponse createInventoryExportJob(CatalogPlatformModels.InventoryExportRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportResponse> response = null;
            try {
                response = catalogPlatformApiList.createInventoryExportJob(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryConfig exportInventoryConfig(String filterType) throws FDKServerResponseError, FDKException {
        return this.exportInventoryConfig(filterType, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryConfig exportInventoryConfig(String filterType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryConfig> response = null;
            try {
                response = catalogPlatformApiList.exportInventoryConfig(this.companyId, filterType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String downloadInventoryTemplateView(String itemType) throws FDKServerResponseError, FDKException {
        return this.downloadInventoryTemplateView(itemType, new HashMap<>());
    }

    public String downloadInventoryTemplateView(String itemType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
                response = catalogPlatformApiList.downloadInventoryTemplateView(this.companyId, itemType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryValidationResponse validateProductTemplateSchema(String itemType) throws FDKServerResponseError, FDKException {
        return this.validateProductTemplateSchema(itemType, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryValidationResponse validateProductTemplateSchema(String itemType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryValidationResponse> response = null;
            try {
                response = catalogPlatformApiList.validateProductTemplateSchema(this.companyId, itemType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.StoreAssignResponse getOptimalLocations(CatalogPlatformModels.AssignStore body) throws FDKServerResponseError, FDKException {
        return this.getOptimalLocations(body, new HashMap<>());
    }

    public CatalogPlatformModels.StoreAssignResponse getOptimalLocations(CatalogPlatformModels.AssignStore body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.StoreAssignResponse> response = null;
            try {
                response = catalogPlatformApiList.getOptimalLocations(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetOptInPlatform getMarketplaceOptinDetail() throws FDKServerResponseError, FDKException {
        return this.getMarketplaceOptinDetail(new HashMap<>());
    }

    public CatalogPlatformModels.GetOptInPlatform getMarketplaceOptinDetail(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetOptInPlatform> response = null;
            try {
                response = catalogPlatformApiList.getMarketplaceOptinDetail(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.OptinCompanyBrandDetailsView getCompanyBrandDetail(Boolean isActive, String q, Integer pageNo, Integer pageSize, String marketplace) throws FDKServerResponseError, FDKException {
        return this.getCompanyBrandDetail(isActive, q, pageNo, pageSize, marketplace, new HashMap<>());
    }

    public CatalogPlatformModels.OptinCompanyBrandDetailsView getCompanyBrandDetail(Boolean isActive, String q, Integer pageNo, Integer pageSize, String marketplace, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OptinCompanyBrandDetailsView> response = null;
            try {
                response = catalogPlatformApiList.getCompanyBrandDetail(this.companyId, isActive, q, pageNo, pageSize, marketplace, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.OptinCompanyDetail getCompanyDetail() throws FDKServerResponseError, FDKException {
        return this.getCompanyDetail(new HashMap<>());
    }

    public CatalogPlatformModels.OptinCompanyDetail getCompanyDetail(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OptinCompanyDetail> response = null;
            try {
                response = catalogPlatformApiList.getCompanyDetail(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.OptinCompanyMetrics getCompanyMetrics() throws FDKServerResponseError, FDKException {
        return this.getCompanyMetrics(new HashMap<>());
    }

    public CatalogPlatformModels.OptinCompanyMetrics getCompanyMetrics(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OptinCompanyMetrics> response = null;
            try {
                response = catalogPlatformApiList.getCompanyMetrics(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.OptinStoreDetails getStoreDetail(String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getStoreDetail(q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.OptinStoreDetails getStoreDetail(String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OptinStoreDetails> response = null;
            try {
                response = catalogPlatformApiList.getStoreDetail(this.companyId, q, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStoreDetail
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.OptinStoreDetails> getStoreDetailPagination(
        String q ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.OptinStoreDetails> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.OptinStoreDetails callback = this.getStoreDetail(
                
                 
                 q,
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductAttributesResponse getProductAttributes(String category, Boolean filter) throws FDKServerResponseError, FDKException {
        return this.getProductAttributes(category, filter, new HashMap<>());
    }

    public CatalogPlatformModels.ProductAttributesResponse getProductAttributes(String category, Boolean filter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductAttributesResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductAttributes(this.companyId, category, filter, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.AttributeDetail getAttribute(String attributeSlug) throws FDKServerResponseError, FDKException {
        return this.getAttribute(attributeSlug, new HashMap<>());
    }

    public CatalogPlatformModels.AttributeDetail getAttribute(String attributeSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AttributeDetail> response = null;
            try {
                response = catalogPlatformApiList.getAttribute(this.companyId, attributeSlug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleListingResponse getProductBundle(String q, List<String> slug) throws FDKServerResponseError, FDKException {
        return this.getProductBundle(q, slug, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleListingResponse getProductBundle(String q, List<String> slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleListingResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductBundle(this.companyId, q, slug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleCreateResponse createProductBundle(CatalogPlatformModels.ProductBundleRequest body) throws FDKServerResponseError, FDKException {
        return this.createProductBundle(body, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleCreateResponse createProductBundle(CatalogPlatformModels.ProductBundleRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleCreateResponse> response = null;
            try {
                response = catalogPlatformApiList.createProductBundle(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleResponse getProductBundleDetail(String id) throws FDKServerResponseError, FDKException {
        return this.getProductBundleDetail(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleResponse getProductBundleDetail(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductBundleDetail(this.companyId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleCreateResponse updateProductBundle(String id, CatalogPlatformModels.ProductBundleUpdateRequest body) throws FDKServerResponseError, FDKException {
        return this.updateProductBundle(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleCreateResponse updateProductBundle(String id, CatalogPlatformModels.ProductBundleUpdateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleCreateResponse> response = null;
            try {
                response = catalogPlatformApiList.updateProductBundle(this.companyId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkAssetResponse getProductAssetsInBulk(Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductAssetsInBulk(pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.BulkAssetResponse getProductAssetsInBulk(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkAssetResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductAssetsInBulk(this.companyId, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProductAssetsInBulk
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.BulkAssetResponse> getProductAssetsInBulkPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.BulkAssetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.BulkAssetResponse callback = this.getProductAssetsInBulk(
                
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse createProductAssetsInBulk(CatalogPlatformModels.ProductBulkAssets body) throws FDKServerResponseError, FDKException {
        return this.createProductAssetsInBulk(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse createProductAssetsInBulk(CatalogPlatformModels.ProductBulkAssets body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.createProductAssetsInBulk(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductBulkRequestList getProductBulkUploadHistory(String search, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductBulkUploadHistory(search, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductBulkRequestList getProductBulkUploadHistory(String search, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductBulkRequestList> response = null;
            try {
                response = catalogPlatformApiList.getProductBulkUploadHistory(this.companyId, search, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProductBulkUploadHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ProductBulkRequestList> getProductBulkUploadHistoryPagination(
        String search ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ProductBulkRequestList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ProductBulkRequestList callback = this.getProductBulkUploadHistory(
                
                 
                 search,
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkResponse createBulkProductUploadJob(CatalogPlatformModels.BulkJob body) throws FDKServerResponseError, FDKException {
        return this.createBulkProductUploadJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.BulkResponse createBulkProductUploadJob(CatalogPlatformModels.BulkJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkResponse> response = null;
            try {
                response = catalogPlatformApiList.createBulkProductUploadJob(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse deleteProductBulkJob(Integer batchId) throws FDKServerResponseError, FDKException {
        return this.deleteProductBulkJob(batchId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse deleteProductBulkJob(Integer batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.deleteProductBulkJob(this.companyId, batchId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse createProductsInBulk(String batchId, CatalogPlatformModels.BulkProductRequest body) throws FDKServerResponseError, FDKException {
        return this.createProductsInBulk(batchId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse createProductsInBulk(String batchId, CatalogPlatformModels.BulkProductRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.createProductsInBulk(this.companyId, batchId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductDownloadsResponse listProductTemplateExportDetails() throws FDKServerResponseError, FDKException {
        return this.listProductTemplateExportDetails(new HashMap<>());
    }

    public CatalogPlatformModels.ProductDownloadsResponse listProductTemplateExportDetails(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductDownloadsResponse> response = null;
            try {
                response = catalogPlatformApiList.listProductTemplateExportDetails(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HSNCodesResponse listHSNCodes() throws FDKServerResponseError, FDKException {
        return this.listHSNCodes(new HashMap<>());
    }

    public CatalogPlatformModels.HSNCodesResponse listHSNCodes(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HSNCodesResponse> response = null;
            try {
                response = catalogPlatformApiList.listHSNCodes(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductTagsViewResponse getProductTags() throws FDKServerResponseError, FDKException {
        return this.getProductTags(new HashMap<>());
    }

    public CatalogPlatformModels.ProductTagsViewResponse getProductTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductTagsViewResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductTags(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.TemplatesResponse listProductTemplate(String department) throws FDKServerResponseError, FDKException {
        return this.listProductTemplate(department, new HashMap<>());
    }

    public CatalogPlatformModels.TemplatesResponse listProductTemplate(String department, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.TemplatesResponse> response = null;
            try {
                response = catalogPlatformApiList.listProductTemplate(this.companyId, department, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProdcutTemplateCategoriesResponse listProductTemplateCategories(String departments, String itemType) throws FDKServerResponseError, FDKException {
        return this.listProductTemplateCategories(departments, itemType, new HashMap<>());
    }

    public CatalogPlatformModels.ProdcutTemplateCategoriesResponse listProductTemplateCategories(String departments, String itemType, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProdcutTemplateCategoriesResponse> response = null;
            try {
                response = catalogPlatformApiList.listProductTemplateCategories(this.companyId, departments, itemType, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String downloadProductTemplateViews(String slug, String itemType, String type) throws FDKServerResponseError, FDKException {
        return this.downloadProductTemplateViews(slug, itemType, type, new HashMap<>());
    }

    public String downloadProductTemplateViews(String slug, String itemType, String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
                response = catalogPlatformApiList.downloadProductTemplateViews(this.companyId, slug, itemType, type, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.TemplatesValidationResponse validateProductTemplate(String slug, String itemType, Boolean bulk) throws FDKServerResponseError, FDKException {
        return this.validateProductTemplate(slug, itemType, bulk, new HashMap<>());
    }

    public CatalogPlatformModels.TemplatesValidationResponse validateProductTemplate(String slug, String itemType, Boolean bulk, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.TemplatesValidationResponse> response = null;
            try {
                response = catalogPlatformApiList.validateProductTemplate(this.companyId, slug, itemType, bulk, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ValidateProduct getProductValidation() throws FDKServerResponseError, FDKException {
        return this.getProductValidation(new HashMap<>());
    }

    public CatalogPlatformModels.ValidateProduct getProductValidation(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ValidateProduct> response = null;
            try {
                response = catalogPlatformApiList.getProductValidation(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventorySellerIdentifierResponsePaginated getInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds) throws FDKServerResponseError, FDKException {
        return this.getInventoryBySizeIdentifier(itemId, sizeIdentifier, pageNo, pageSize, q, locationIds, new HashMap<>());
    }

    public CatalogPlatformModels.InventorySellerIdentifierResponsePaginated getInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> response = null;
            try {
                response = catalogPlatformApiList.getInventoryBySizeIdentifier(this.companyId, itemId, sizeIdentifier, pageNo, pageSize, q, locationIds, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getInventoryBySizeIdentifier
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getInventoryBySizeIdentifierPagination(
        Integer itemId ,
        String sizeIdentifier ,
        Integer pageSize ,
        String q ,
        List<Integer> locationIds 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.InventorySellerIdentifierResponsePaginated callback = this.getInventoryBySizeIdentifier(
                
                 
                 itemId,
                 sizeIdentifier,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 locationIds
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductListingResponse getProductSize(String itemCode, Integer itemId, Integer brandUid, Integer uid) throws FDKServerResponseError, FDKException {
        return this.getProductSize(itemCode, itemId, brandUid, uid, new HashMap<>());
    }

    public CatalogPlatformModels.ProductListingResponse getProductSize(String itemCode, Integer itemId, Integer brandUid, Integer uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductListingResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductSize(this.companyId, itemId, itemCode, brandUid, uid, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductSizeDeleteResponse deleteSize(Integer itemId, String size) throws FDKServerResponseError, FDKException {
        return this.deleteSize(itemId, size, new HashMap<>());
    }

    public CatalogPlatformModels.ProductSizeDeleteResponse deleteSize(Integer itemId, String size, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductSizeDeleteResponse> response = null;
            try {
                response = catalogPlatformApiList.deleteSize(this.companyId, itemId, size, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryResponsePaginated getInventoryBySize(Integer itemId, String size, Integer pageNo, Integer pageSize, String q, Boolean sellable) throws FDKServerResponseError, FDKException {
        return this.getInventoryBySize(itemId, size, pageNo, pageSize, q, sellable, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryResponsePaginated getInventoryBySize(Integer itemId, String size, Integer pageNo, Integer pageSize, String q, Boolean sellable, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryResponsePaginated> response = null;
            try {
                response = catalogPlatformApiList.getInventoryBySize(this.companyId, itemId, size, pageNo, pageSize, q, sellable, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getInventoryBySize
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.InventoryResponsePaginated> getInventoryBySizePagination(
        Integer itemId ,
        String size ,
        Integer pageSize ,
        String q ,
        Boolean sellable 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.InventoryResponsePaginated> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.InventoryResponsePaginated callback = this.getInventoryBySize(
                
                 
                 itemId,
                 size,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 sellable
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse addInventory(Integer itemId, String size, CatalogPlatformModels.InventoryRequest body) throws FDKServerResponseError, FDKException {
        return this.addInventory(itemId, size, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse addInventory(Integer itemId, String size, CatalogPlatformModels.InventoryRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.addInventory(this.companyId, itemId, size, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductVariantsResponse getVariantsOfProducts(Integer itemId, String variantType, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getVariantsOfProducts(itemId, variantType, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductVariantsResponse getVariantsOfProducts(Integer itemId, String variantType, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductVariantsResponse> response = null;
            try {
                response = catalogPlatformApiList.getVariantsOfProducts(this.companyId, itemId, variantType, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getVariantsOfProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ProductVariantsResponse> getVariantsOfProductsPagination(
        Integer itemId ,
        String variantType ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ProductVariantsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ProductVariantsResponse callback = this.getVariantsOfProducts(
                
                 
                 itemId,
                 variantType,
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ListSizeGuide getSizeGuides(Boolean active, String q, String tag, Integer pageNo, Integer pageSize, Integer brandId) throws FDKServerResponseError, FDKException {
        return this.getSizeGuides(active, q, tag, pageNo, pageSize, brandId, new HashMap<>());
    }

    public CatalogPlatformModels.ListSizeGuide getSizeGuides(Boolean active, String q, String tag, Integer pageNo, Integer pageSize, Integer brandId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ListSizeGuide> response = null;
            try {
                response = catalogPlatformApiList.getSizeGuides(this.companyId, active, q, tag, pageNo, pageSize, brandId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse createSizeGuide(CatalogPlatformModels.ValidateSizeGuide body) throws FDKServerResponseError, FDKException {
        return this.createSizeGuide(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse createSizeGuide(CatalogPlatformModels.ValidateSizeGuide body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.createSizeGuide(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SizeGuideResponse getSizeGuide(String id) throws FDKServerResponseError, FDKException {
        return this.getSizeGuide(id, new HashMap<>());
    }

    public CatalogPlatformModels.SizeGuideResponse getSizeGuide(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SizeGuideResponse> response = null;
            try {
                response = catalogPlatformApiList.getSizeGuide(this.companyId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse updateSizeGuide(String id, CatalogPlatformModels.ValidateSizeGuide body) throws FDKServerResponseError, FDKException {
        return this.updateSizeGuide(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse updateSizeGuide(String id, CatalogPlatformModels.ValidateSizeGuide body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.updateSizeGuide(this.companyId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HsnCodesListingResponseSchemaV2 getAllProductHsnCodes(Integer pageNo, Integer pageSize, String q, String type) throws FDKServerResponseError, FDKException {
        return this.getAllProductHsnCodes(pageNo, pageSize, q, type, new HashMap<>());
    }

    public CatalogPlatformModels.HsnCodesListingResponseSchemaV2 getAllProductHsnCodes(Integer pageNo, Integer pageSize, String q, String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HsnCodesListingResponseSchemaV2> response = null;
            try {
                response = catalogPlatformApiList.getAllProductHsnCodes(this.companyId, pageNo, pageSize, q, type, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HSNDataInsertV2 getSingleProductHSNCode(String reportingHsn) throws FDKServerResponseError, FDKException {
        return this.getSingleProductHSNCode(reportingHsn, new HashMap<>());
    }

    public CatalogPlatformModels.HSNDataInsertV2 getSingleProductHSNCode(String reportingHsn, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HSNDataInsertV2> response = null;
            try {
                response = catalogPlatformApiList.getSingleProductHSNCode(reportingHsn, this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponse updateInventories(CatalogPlatformModels.InventoryRequestSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.updateInventories(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponse updateInventories(CatalogPlatformModels.InventoryRequestSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponse> response = null;
            try {
                response = catalogPlatformApiList.updateInventories(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportJobListResponse listInventoryExport(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.listInventoryExport(status, fromDate, toDate, q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportJobListResponse listInventoryExport(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportJobListResponse> response = null;
            try {
                response = catalogPlatformApiList.listInventoryExport(this.companyId, status, fromDate, toDate, q, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportResponse createInventoryExport(CatalogPlatformModels.InventoryCreateRequest body) throws FDKServerResponseError, FDKException {
        return this.createInventoryExport(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportResponse createInventoryExport(CatalogPlatformModels.InventoryCreateRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportResponse> response = null;
            try {
                response = catalogPlatformApiList.createInventoryExport(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductListingResponseV2 getProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> itemIds, List<Integer> departmentIds, List<String> itemCode, String name, String slug, List<String> allIdentifiers, String q, List<String> tags, Integer pageNo, Integer pageSize, String pageType, String sortOn, String pageId) throws FDKServerResponseError, FDKException {
        return this.getProducts(brandIds, categoryIds, itemIds, departmentIds, itemCode, name, slug, allIdentifiers, q, tags, pageNo, pageSize, pageType, sortOn, pageId, new HashMap<>());
    }

    public CatalogPlatformModels.ProductListingResponseV2 getProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> itemIds, List<Integer> departmentIds, List<String> itemCode, String name, String slug, List<String> allIdentifiers, String q, List<String> tags, Integer pageNo, Integer pageSize, String pageType, String sortOn, String pageId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductListingResponseV2> response = null;
            try {
                response = catalogPlatformApiList.getProducts(this.companyId, brandIds, categoryIds, itemIds, departmentIds, itemCode, name, slug, allIdentifiers, q, tags, pageNo, pageSize, pageType, sortOn, pageId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ProductListingResponseV2> getProductsPagination(
        List<Integer> brandIds ,
        List<Integer> categoryIds ,
        List<Integer> itemIds ,
        List<Integer> departmentIds ,
        List<String> itemCode ,
        String name ,
        String slug ,
        List<String> allIdentifiers ,
        String q ,
        List<String> tags ,
        Integer pageSize ,
        String sortOn 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ProductListingResponseV2> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ProductListingResponseV2 callback = this.getProducts(
                
                 
                 brandIds,
                 categoryIds,
                 itemIds,
                 departmentIds,
                 itemCode,
                 name,
                 slug,
                 allIdentifiers,
                 q,
                 tags,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getPageType()
                ,
                 sortOn,
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseObject createProduct(CatalogPlatformModels.ProductCreateUpdateSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.createProduct(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject createProduct(CatalogPlatformModels.ProductCreateUpdateSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
                response = catalogPlatformApiList.createProduct(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkResponse uploadBulkProducts(String department, String productType, CatalogPlatformModels.BulkProductJob body) throws FDKServerResponseError, FDKException {
        return this.uploadBulkProducts(department, productType, body, new HashMap<>());
    }

    public CatalogPlatformModels.BulkResponse uploadBulkProducts(String department, String productType, CatalogPlatformModels.BulkProductJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkResponse> response = null;
            try {
                response = catalogPlatformApiList.uploadBulkProducts(this.companyId, department, productType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductDownloadsResponse getProductExportJobs(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductExportJobs(status, fromDate, toDate, q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductDownloadsResponse getProductExportJobs(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductDownloadsResponse> response = null;
            try {
                response = catalogPlatformApiList.getProductExportJobs(this.companyId, status, fromDate, toDate, q, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductDownloadsResponse createProductExportJob(CatalogPlatformModels.ProductTemplateDownloadsExport body) throws FDKServerResponseError, FDKException {
        return this.createProductExportJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.ProductDownloadsResponse createProductExportJob(CatalogPlatformModels.ProductTemplateDownloadsExport body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductDownloadsResponse> response = null;
            try {
                response = catalogPlatformApiList.createProductExportJob(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse deleteProduct(Integer itemId) throws FDKServerResponseError, FDKException {
        return this.deleteProduct(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse deleteProduct(Integer itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.deleteProduct(this.companyId, itemId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SingleProductResponse getProduct(Integer itemId, Integer brandUid, String itemCode) throws FDKServerResponseError, FDKException {
        return this.getProduct(itemId, brandUid, itemCode, new HashMap<>());
    }

    public CatalogPlatformModels.SingleProductResponse getProduct(Integer itemId, Integer brandUid, String itemCode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SingleProductResponse> response = null;
            try {
                response = catalogPlatformApiList.getProduct(this.companyId, itemId, brandUid, itemCode, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse editProduct(Integer itemId, CatalogPlatformModels.ProductCreateUpdateSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.editProduct(itemId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse editProduct(Integer itemId, CatalogPlatformModels.ProductCreateUpdateSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
                response = catalogPlatformApiList.editProduct(this.companyId, itemId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetAllSizes allSizes(Integer itemId) throws FDKServerResponseError, FDKException {
        return this.allSizes(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.GetAllSizes allSizes(Integer itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAllSizes> response = null;
            try {
                response = catalogPlatformApiList.allSizes(this.companyId, itemId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponse deleteRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryRequestSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.deleteRealtimeInventory(itemId, sellerIdentifier, body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponse deleteRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryRequestSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponse> response = null;
            try {
                response = catalogPlatformApiList.deleteRealtimeInventory(this.companyId, itemId, sellerIdentifier, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponse updateRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryRequestSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.updateRealtimeInventory(itemId, sellerIdentifier, body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponse updateRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryRequestSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponse> response = null;
            try {
                response = catalogPlatformApiList.updateRealtimeInventory(this.companyId, itemId, sellerIdentifier, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetAllMarketplaces getMarketplaces() throws FDKServerResponseError, FDKException {
        return this.getMarketplaces(new HashMap<>());
    }

    public CatalogPlatformModels.GetAllMarketplaces getMarketplaces(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAllMarketplaces> response = null;
            try {
                response = catalogPlatformApiList.getMarketplaces(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.UpdateMarketplaceOptinResponse updateMarketplaceOptin(String marketplaceSlug, CatalogPlatformModels.UpdateMarketplaceOptinRequest body) throws FDKServerResponseError, FDKException {
        return this.updateMarketplaceOptin(marketplaceSlug, body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateMarketplaceOptinResponse updateMarketplaceOptin(String marketplaceSlug, CatalogPlatformModels.UpdateMarketplaceOptinRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateMarketplaceOptinResponse> response = null;
            try {
                response = catalogPlatformApiList.updateMarketplaceOptin(this.companyId, marketplaceSlug, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CreateMarketplaceOptinResponse createMarketplaceOptin(String marketplaceSlug, CatalogPlatformModels.OptInPostRequest body) throws FDKServerResponseError, FDKException {
        return this.createMarketplaceOptin(marketplaceSlug, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateMarketplaceOptinResponse createMarketplaceOptin(String marketplaceSlug, CatalogPlatformModels.OptInPostRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateMarketplaceOptinResponse> response = null;
            try {
                response = catalogPlatformApiList.createMarketplaceOptin(this.companyId, marketplaceSlug, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public CatalogPlatformModels.CatalogInsightResponse getCatalogInsights(String brand) throws FDKServerResponseError, FDKException {
        return this.getCatalogInsights(brand, new HashMap<>());
    }

    public CatalogPlatformModels.CatalogInsightResponse getCatalogInsights(String brand, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CatalogInsightResponse> response = null;
            try {
            response = catalogPlatformApiList.getCatalogInsights(this.companyId, this.applicationId, brand, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ApplicationBrandListingSchema getApplicationBrandListing(Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationBrandListing(pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationBrandListingSchema getApplicationBrandListing(Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationBrandListingSchema> response = null;
            try {
            response = catalogPlatformApiList.getApplicationBrandListing(this.companyId, this.applicationId, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getApplicationBrandListing
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ApplicationBrandListingSchema> getApplicationBrandListingPagination(
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationBrandListingSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationBrandListingSchema callback = this.getApplicationBrandListing(
                
                 
                 
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

    public CatalogPlatformModels.SuccessResponseObject updateAppBrand(Integer brandUid, CatalogPlatformModels.ApplicationBrandJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppBrand(brandUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppBrand(Integer brandUid, CatalogPlatformModels.ApplicationBrandJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppBrand(this.companyId, this.applicationId, brandUid, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.BrandListingResponse getApplicationBrands(String department, Integer pageNo, Integer pageSize, String q, List<Integer> brandId) throws FDKServerResponseError, FDKException {
        return this.getApplicationBrands(department, pageNo, pageSize, q, brandId, new HashMap<>());
    }

    public CatalogPlatformModels.BrandListingResponse getApplicationBrands(String department, Integer pageNo, Integer pageSize, String q, List<Integer> brandId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BrandListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getApplicationBrands(this.companyId, this.applicationId, department, pageNo, pageSize, q, brandId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getApplicationBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.BrandListingResponse> getApplicationBrandsPagination(
        String department,
        Integer pageSize,
        String q,
        List<Integer> brandId
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.BrandListingResponse callback = this.getApplicationBrands(
                
                 
                 
                 department,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 brandId
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

    public CatalogPlatformModels.CategoryListingResponse getCategories(String department) throws FDKServerResponseError, FDKException {
        return this.getCategories(department, new HashMap<>());
    }

    public CatalogPlatformModels.CategoryListingResponse getCategories(String department, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CategoryListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getCategories(this.companyId, this.applicationId, department, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ApplicationCategoryListingSchema getApplicationCategoryListing(Integer departmentId, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationCategoryListing(departmentId, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationCategoryListingSchema getApplicationCategoryListing(Integer departmentId, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationCategoryListingSchema> response = null;
            try {
            response = catalogPlatformApiList.getApplicationCategoryListing(this.companyId, this.applicationId, departmentId, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getApplicationCategoryListing
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ApplicationCategoryListingSchema> getApplicationCategoryListingPagination(
        Integer departmentId,
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationCategoryListingSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationCategoryListingSchema callback = this.getApplicationCategoryListing(
                
                 
                 
                 departmentId,
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

    public CatalogPlatformModels.SuccessResponseObject updateAppCategory(String categoryUid, CatalogPlatformModels.ApplicationCategoryJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppCategory(categoryUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppCategory(String categoryUid, CatalogPlatformModels.ApplicationCategoryJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppCategory(this.companyId, this.applicationId, categoryUid, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetCollectionListingResponse getAllCollections(String q, String scheduleStatus, String type, List<String> tags, Boolean isActive, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAllCollections(q, scheduleStatus, type, tags, isActive, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionListingResponse getAllCollections(String q, String scheduleStatus, String type, List<String> tags, Boolean isActive, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getAllCollections(this.companyId, this.applicationId, q, scheduleStatus, type, tags, isActive, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAllCollections
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.GetCollectionListingResponse> getAllCollectionsPagination(
        String q,
        String scheduleStatus,
        String type,
        List<String> tags,
        Boolean isActive,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.GetCollectionListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.GetCollectionListingResponse callback = this.getAllCollections(
                
                 
                 
                 q,
                 scheduleStatus,
                 type,
                 tags,
                 isActive,
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

    public CatalogPlatformModels.CollectionCreateResponse createCollection(CatalogPlatformModels.CreateCollection body) throws FDKServerResponseError, FDKException {
        return this.createCollection(body, new HashMap<>());
    }

    public CatalogPlatformModels.CollectionCreateResponse createCollection(CatalogPlatformModels.CreateCollection body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CollectionCreateResponse> response = null;
            try {
            response = catalogPlatformApiList.createCollection(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetQueryFiltersValuesResponse getApplicationFilterValues(String filterKey, String c, String collectionId, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationFilterValues(filterKey, c, collectionId, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersValuesResponse getApplicationFilterValues(String filterKey, String c, String collectionId, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersValuesResponse> response = null;
            try {
            response = catalogPlatformApiList.getApplicationFilterValues(this.companyId, this.applicationId, filterKey, c, collectionId, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetQueryFiltersKeysResponse getApplicationFilterKeys(String c) throws FDKServerResponseError, FDKException {
        return this.getApplicationFilterKeys(c, new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersKeysResponse getApplicationFilterKeys(String c, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersKeysResponse> response = null;
            try {
            response = catalogPlatformApiList.getApplicationFilterKeys(this.companyId, this.applicationId, c, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetQueryFiltersResponse getQueryFilters() throws FDKServerResponseError, FDKException {
        return this.getQueryFilters(new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersResponse getQueryFilters(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersResponse> response = null;
            try {
            response = catalogPlatformApiList.getQueryFilters(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.CommonResponseSchemaCollection deleteCollection(String id) throws FDKServerResponseError, FDKException {
        return this.deleteCollection(id, new HashMap<>());
    }

    public CatalogPlatformModels.CommonResponseSchemaCollection deleteCollection(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CommonResponseSchemaCollection> response = null;
            try {
            response = catalogPlatformApiList.deleteCollection(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.UpdateCollection updateCollection(String id, CatalogPlatformModels.UpdateCollection body) throws FDKServerResponseError, FDKException {
        return this.updateCollection(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateCollection updateCollection(String id, CatalogPlatformModels.UpdateCollection body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateCollection> response = null;
            try {
            response = catalogPlatformApiList.updateCollection(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetCollectionItemsResponse getCollectionItems(String id, String sortOn, String pageId, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getCollectionItems(id, sortOn, pageId, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionItemsResponse getCollectionItems(String id, String sortOn, String pageId, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionItemsResponse> response = null;
            try {
            response = catalogPlatformApiList.getCollectionItems(this.companyId, this.applicationId, id, sortOn, pageId, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.CommonResponseSchemaCollection addCollectionItems(String id, CatalogPlatformModels.CollectionItemUpdateSchema body) throws FDKServerResponseError, FDKException {
        return this.addCollectionItems(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.CommonResponseSchemaCollection addCollectionItems(String id, CatalogPlatformModels.CollectionItemUpdateSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CommonResponseSchemaCollection> response = null;
            try {
            response = catalogPlatformApiList.addCollectionItems(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetCollectionDetailResponse getCollectionDetail(String slug) throws FDKServerResponseError, FDKException {
        return this.getCollectionDetail(slug, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionDetailResponse getCollectionDetail(String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionDetailResponse> response = null;
            try {
            response = catalogPlatformApiList.getCollectionDetail(this.companyId, this.applicationId, slug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ApplicationDepartmentListingResponse getApplicationDepartmentListing(Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationDepartmentListing(pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationDepartmentListingResponse getApplicationDepartmentListing(Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationDepartmentListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getApplicationDepartmentListing(this.companyId, this.applicationId, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getApplicationDepartmentListing
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ApplicationDepartmentListingResponse> getApplicationDepartmentListingPagination(
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationDepartmentListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationDepartmentListingResponse callback = this.getApplicationDepartmentListing(
                
                 
                 
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

    public CatalogPlatformModels.SuccessResponseObject updateAppDepartment(String departmentUid, CatalogPlatformModels.ApplicationDepartmentJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppDepartment(departmentUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppDepartment(String departmentUid, CatalogPlatformModels.ApplicationDepartmentJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppDepartment(this.companyId, this.applicationId, departmentUid, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.DepartmentResponse getDepartments() throws FDKServerResponseError, FDKException {
        return this.getDepartments(new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentResponse getDepartments(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentResponse> response = null;
            try {
            response = catalogPlatformApiList.getDepartments(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.InventoryStockResponse getAppInventory(List<Integer> itemIds, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, String timestamp, Integer pageSize, String pageId, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate) throws FDKServerResponseError, FDKException {
        return this.getAppInventory(itemIds, storeIds, brandIds, sellerIdentifiers, timestamp, pageSize, pageId, qtyGt, qtyLt, qtyType, fromDate, toDate, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryStockResponse getAppInventory(List<Integer> itemIds, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, String timestamp, Integer pageSize, String pageId, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryStockResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppInventory(this.companyId, this.applicationId, itemIds, storeIds, brandIds, sellerIdentifiers, timestamp, pageSize, pageId, qtyGt, qtyLt, qtyType, fromDate, toDate, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.LocationListSerializer getAppLocations(String storeType, List<Integer> uid, String q, String stage, Integer pageNo, Integer pageSize, List<String> tags, List<String> storeTypes) throws FDKServerResponseError, FDKException {
        return this.getAppLocations(storeType, uid, q, stage, pageNo, pageSize, tags, storeTypes, new HashMap<>());
    }

    public CatalogPlatformModels.LocationListSerializer getAppLocations(String storeType, List<Integer> uid, String q, String stage, Integer pageNo, Integer pageSize, List<String> tags, List<String> storeTypes, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.LocationListSerializer> response = null;
            try {
            response = catalogPlatformApiList.getAppLocations(this.companyId, this.applicationId, storeType, uid, q, stage, pageNo, pageSize, tags, storeTypes, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAppLocations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.LocationListSerializer> getAppLocationsPagination(
        String storeType,
        List<Integer> uid,
        String q,
        String stage,
        Integer pageSize,
        List<String> tags,
        List<String> storeTypes
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.LocationListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.LocationListSerializer callback = this.getAppLocations(
                
                 
                 
                 storeType,
                 uid,
                 q,
                 stage,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 tags,
                 storeTypes
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

    public CatalogPlatformModels.GetAppCatalogConfiguration getConfigurations() throws FDKServerResponseError, FDKException {
        return this.getConfigurations(new HashMap<>());
    }

    public CatalogPlatformModels.GetAppCatalogConfiguration getConfigurations(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAppCatalogConfiguration> response = null;
            try {
            response = catalogPlatformApiList.getConfigurations(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAppCatalogConfiguration createConfigurationProductListing(CatalogPlatformModels.AppConfiguration body) throws FDKServerResponseError, FDKException {
        return this.createConfigurationProductListing(body, new HashMap<>());
    }

    public CatalogPlatformModels.GetAppCatalogConfiguration createConfigurationProductListing(CatalogPlatformModels.AppConfiguration body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAppCatalogConfiguration> response = null;
            try {
            response = catalogPlatformApiList.createConfigurationProductListing(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetCatalogConfigurationMetaData getCatalogConfiguration() throws FDKServerResponseError, FDKException {
        return this.getCatalogConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.GetCatalogConfigurationMetaData getCatalogConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCatalogConfigurationMetaData> response = null;
            try {
            response = catalogPlatformApiList.getCatalogConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAppCatalogEntityConfiguration getConfigurationByType(String type) throws FDKServerResponseError, FDKException {
        return this.getConfigurationByType(type, new HashMap<>());
    }

    public CatalogPlatformModels.GetAppCatalogEntityConfiguration getConfigurationByType(String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAppCatalogEntityConfiguration> response = null;
            try {
            response = catalogPlatformApiList.getConfigurationByType(this.companyId, this.applicationId, type, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAppCatalogConfiguration createConfigurationByType(String type, CatalogPlatformModels.AppConfiguration body) throws FDKServerResponseError, FDKException {
        return this.createConfigurationByType(type, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetAppCatalogConfiguration createConfigurationByType(String type, CatalogPlatformModels.AppConfiguration body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAppCatalogConfiguration> response = null;
            try {
            response = catalogPlatformApiList.createConfigurationByType(this.companyId, this.applicationId, type, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.OwnerAppItemResponse getAppProduct(String itemId) throws FDKServerResponseError, FDKException {
        return this.getAppProduct(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.OwnerAppItemResponse getAppProduct(String itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OwnerAppItemResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppProduct(this.companyId, this.applicationId, itemId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppProduct(String itemId, CatalogPlatformModels.ApplicationItemMeta body) throws FDKServerResponseError, FDKException {
        return this.updateAppProduct(itemId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppProduct(String itemId, CatalogPlatformModels.ApplicationItemMeta body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppProduct(this.companyId, this.applicationId, itemId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ApplicationProductListingResponse getAppicationProducts(String q, String f, String c, Boolean filters, Boolean isDependent, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, List<Integer> itemIds) throws FDKServerResponseError, FDKException {
        return this.getAppicationProducts(q, f, c, filters, isDependent, sortOn, pageId, pageSize, pageNo, pageType, itemIds, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationProductListingResponse getAppicationProducts(String q, String f, String c, Boolean filters, Boolean isDependent, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, List<Integer> itemIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationProductListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppicationProducts(this.companyId, this.applicationId, q, f, c, filters, isDependent, sortOn, pageId, pageSize, pageNo, pageType, itemIds, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAppicationProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ApplicationProductListingResponse> getAppicationProductsPagination(
        String q,
        String f,
        String c,
        Boolean filters,
        Boolean isDependent,
        String sortOn,
        Integer pageSize,
        List<Integer> itemIds
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationProductListingResponse callback = this.getAppicationProducts(
                
                 
                 
                 q,
                 f,
                 c,
                 filters,
                 isDependent,
                 sortOn,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getPageNo()
                ,
                 paginator.getPageType()
                ,
                 itemIds
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

    public CatalogPlatformModels.InventorySellerIdentifierResponsePaginated getDiscountedInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds) throws FDKServerResponseError, FDKException {
        return this.getDiscountedInventoryBySizeIdentifier(itemId, sizeIdentifier, pageNo, pageSize, q, locationIds, new HashMap<>());
    }

    public CatalogPlatformModels.InventorySellerIdentifierResponsePaginated getDiscountedInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> response = null;
            try {
            response = catalogPlatformApiList.getDiscountedInventoryBySizeIdentifier(this.companyId, this.applicationId, itemId, sizeIdentifier, pageNo, pageSize, q, locationIds, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getDiscountedInventoryBySizeIdentifier
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> getDiscountedInventoryBySizeIdentifierPagination(
        Integer itemId,
        String sizeIdentifier,
        Integer pageSize,
        String q,
        List<Integer> locationIds
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.InventorySellerIdentifierResponsePaginated> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.InventorySellerIdentifierResponsePaginated callback = this.getDiscountedInventoryBySizeIdentifier(
                
                 
                 
                 itemId,
                 sizeIdentifier,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 locationIds
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

    public CatalogPlatformModels.ProductDetail getProductDetailBySlug(String slug) throws FDKServerResponseError, FDKException {
        return this.getProductDetailBySlug(slug, new HashMap<>());
    }

    public CatalogPlatformModels.ProductDetail getProductDetailBySlug(String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductDetail> response = null;
            try {
            response = catalogPlatformApiList.getProductDetailBySlug(this.companyId, this.applicationId, slug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.RawProductListingResponse getAppProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> departmentIds, List<String> tags, List<Integer> itemIds, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getAppProducts(brandIds, categoryIds, departmentIds, tags, itemIds, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.RawProductListingResponse getAppProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> departmentIds, List<String> tags, List<Integer> itemIds, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.RawProductListingResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppProducts(this.companyId, this.applicationId, brandIds, categoryIds, departmentIds, tags, itemIds, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAppProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.RawProductListingResponse> getAppProductsPagination(
        List<Integer> brandIds,
        List<Integer> categoryIds,
        List<Integer> departmentIds,
        List<String> tags,
        List<Integer> itemIds,
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.RawProductListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.RawProductListingResponse callback = this.getAppProducts(
                
                 
                 
                 brandIds,
                 categoryIds,
                 departmentIds,
                 tags,
                 itemIds,
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

    public CatalogPlatformModels.AppReturnConfigResponse getAppReturnConfiguration() throws FDKServerResponseError, FDKException {
        return this.getAppReturnConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.AppReturnConfigResponse getAppReturnConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppReturnConfigResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppReturnConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponseObject createAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.createAppReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject createAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.createAppReturnConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.updateAppReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppReturnConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponse deleteAppCategoryReturnConfiguration(CatalogPlatformModels.DeleteAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.deleteAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse deleteAppCategoryReturnConfiguration(CatalogPlatformModels.DeleteAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteAppCategoryReturnConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.BaseAppCategoryReturnConfigResponse getAppCategoryReturnConfig(String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAppCategoryReturnConfig(q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.BaseAppCategoryReturnConfigResponse getAppCategoryReturnConfig(String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BaseAppCategoryReturnConfigResponse> response = null;
            try {
            response = catalogPlatformApiList.getAppCategoryReturnConfig(this.companyId, this.applicationId, q, pageNo, pageSize, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponseObject createAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.createAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject createAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.createAppCategoryReturnConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponse updateAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.updateAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse updateAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.updateAppCategoryReturnConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse getAutocompleteConfig() throws FDKServerResponseError, FDKException {
        return this.getAutocompleteConfig(new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse getAutocompleteConfig(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsResponse> response = null;
            try {
            response = catalogPlatformApiList.getAutocompleteConfig(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.CreateAutocompleteWordsResponse createCustomAutocompleteRule(CatalogPlatformModels.CreateAutocompleteKeyword body) throws FDKServerResponseError, FDKException {
        return this.createCustomAutocompleteRule(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAutocompleteWordsResponse createCustomAutocompleteRule(CatalogPlatformModels.CreateAutocompleteKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAutocompleteWordsResponse> response = null;
            try {
            response = catalogPlatformApiList.createCustomAutocompleteRule(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.DeleteResponse deleteAutocompleteKeyword(String id) throws FDKServerResponseError, FDKException {
        return this.deleteAutocompleteKeyword(id, new HashMap<>());
    }

    public CatalogPlatformModels.DeleteResponse deleteAutocompleteKeyword(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteAutocompleteKeyword(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse getAutocompleteKeywordDetail(String id) throws FDKServerResponseError, FDKException {
        return this.getAutocompleteKeywordDetail(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse getAutocompleteKeywordDetail(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsResponse> response = null;
            try {
            response = catalogPlatformApiList.getAutocompleteKeywordDetail(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse updateAutocompleteKeyword(String id, CatalogPlatformModels.CreateAutocompleteKeyword body) throws FDKServerResponseError, FDKException {
        return this.updateAutocompleteKeyword(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponse updateAutocompleteKeyword(String id, CatalogPlatformModels.CreateAutocompleteKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsResponse> response = null;
            try {
            response = catalogPlatformApiList.updateAutocompleteKeyword(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.DeleteSearchConfigurationResponse deleteSearchConfiguration() throws FDKServerResponseError, FDKException {
        return this.deleteSearchConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.DeleteSearchConfigurationResponse deleteSearchConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteSearchConfigurationResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteSearchConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetSearchConfigurationResponse getSearchConfiguration() throws FDKServerResponseError, FDKException {
        return this.getSearchConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchConfigurationResponse getSearchConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchConfigurationResponse> response = null;
            try {
            response = catalogPlatformApiList.getSearchConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.CreateSearchConfigurationResponse createSearchConfiguration(CatalogPlatformModels.CreateSearchConfigurationRequest body) throws FDKServerResponseError, FDKException {
        return this.createSearchConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateSearchConfigurationResponse createSearchConfiguration(CatalogPlatformModels.CreateSearchConfigurationRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateSearchConfigurationResponse> response = null;
            try {
            response = catalogPlatformApiList.createSearchConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.UpdateSearchConfigurationResponse updateSearchConfiguration(CatalogPlatformModels.UpdateSearchConfigurationRequest body) throws FDKServerResponseError, FDKException {
        return this.updateSearchConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateSearchConfigurationResponse updateSearchConfiguration(CatalogPlatformModels.UpdateSearchConfigurationRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateSearchConfigurationResponse> response = null;
            try {
            response = catalogPlatformApiList.updateSearchConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetSearchWordsResponse getAllSearchKeyword() throws FDKServerResponseError, FDKException {
        return this.getAllSearchKeyword(new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsResponse getAllSearchKeyword(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsResponse> response = null;
            try {
            response = catalogPlatformApiList.getAllSearchKeyword(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetSearchWordsData createCustomKeyword(CatalogPlatformModels.CreateSearchKeyword body) throws FDKServerResponseError, FDKException {
        return this.createCustomKeyword(body, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsData createCustomKeyword(CatalogPlatformModels.CreateSearchKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsData> response = null;
            try {
            response = catalogPlatformApiList.createCustomKeyword(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.DeleteResponse deleteSearchKeywords(String id) throws FDKServerResponseError, FDKException {
        return this.deleteSearchKeywords(id, new HashMap<>());
    }

    public CatalogPlatformModels.DeleteResponse deleteSearchKeywords(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteSearchKeywords(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetSearchWordsDetailResponse getSearchKeywords(String id) throws FDKServerResponseError, FDKException {
        return this.getSearchKeywords(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsDetailResponse getSearchKeywords(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsDetailResponse> response = null;
            try {
            response = catalogPlatformApiList.getSearchKeywords(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetSearchWordsData updateSearchKeywords(String id, CatalogPlatformModels.CreateSearchKeyword body) throws FDKServerResponseError, FDKException {
        return this.updateSearchKeywords(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsData updateSearchKeywords(String id, CatalogPlatformModels.CreateSearchKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsData> response = null;
            try {
            response = catalogPlatformApiList.updateSearchKeywords(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppLocation(String storeUid, CatalogPlatformModels.ApplicationStoreJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppLocation(storeUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseObject updateAppLocation(String storeUid, CatalogPlatformModels.ApplicationStoreJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseObject> response = null;
            try {
            response = catalogPlatformApiList.updateAppLocation(this.companyId, this.applicationId, storeUid, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ConfigSuccessResponse updateAllowSingle(CatalogPlatformModels.AllowSingleRequest body) throws FDKServerResponseError, FDKException {
        return this.updateAllowSingle(body, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponse updateAllowSingle(CatalogPlatformModels.AllowSingleRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.updateAllowSingle(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ConfigSuccessResponse updateDefaultSort(CatalogPlatformModels.DefaultKeyRequest body) throws FDKServerResponseError, FDKException {
        return this.updateDefaultSort(body, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponse updateDefaultSort(CatalogPlatformModels.DefaultKeyRequest body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.updateDefaultSort(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetConfigResponse getListingConfigurations(String configType, Integer pageNo, Integer pageSize, String search) throws FDKServerResponseError, FDKException {
        return this.getListingConfigurations(configType, pageNo, pageSize, search, new HashMap<>());
    }

    public CatalogPlatformModels.GetConfigResponse getListingConfigurations(String configType, Integer pageNo, Integer pageSize, String search, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetConfigResponse> response = null;
            try {
            response = catalogPlatformApiList.getListingConfigurations(this.companyId, this.applicationId, configType, pageNo, pageSize, search, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.AppConfigurationsSort createListingConfiguration(String configType, CatalogPlatformModels.AppConfigurationsSort body) throws FDKServerResponseError, FDKException {
        return this.createListingConfiguration(configType, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationsSort createListingConfiguration(String configType, CatalogPlatformModels.AppConfigurationsSort body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationsSort> response = null;
            try {
            response = catalogPlatformApiList.createListingConfiguration(this.companyId, this.applicationId, configType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetConfigResponse getGroupConfigurations(String configType, Integer pageNo, Integer pageSize, String search, String templateSlug) throws FDKServerResponseError, FDKException {
        return this.getGroupConfigurations(configType, pageNo, pageSize, search, templateSlug, new HashMap<>());
    }

    public CatalogPlatformModels.GetConfigResponse getGroupConfigurations(String configType, Integer pageNo, Integer pageSize, String search, String templateSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetConfigResponse> response = null;
            try {
            response = catalogPlatformApiList.getGroupConfigurations(this.companyId, this.applicationId, configType, pageNo, pageSize, search, templateSlug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.AppConfigurationDetail createGroupConfiguration(String configType, CatalogPlatformModels.AppConfigurationDetail body) throws FDKServerResponseError, FDKException {
        return this.createGroupConfiguration(configType, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationDetail createGroupConfiguration(String configType, CatalogPlatformModels.AppConfigurationDetail body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationDetail> response = null;
            try {
            response = catalogPlatformApiList.createGroupConfiguration(this.companyId, this.applicationId, configType, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ConfigSuccessResponse deleteGroupConfiguration(String configType, String groupSlug) throws FDKServerResponseError, FDKException {
        return this.deleteGroupConfiguration(configType, groupSlug, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponse deleteGroupConfiguration(String configType, String groupSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteGroupConfiguration(this.companyId, this.applicationId, configType, groupSlug, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.AppConfigurationDetail updateGroupConfiguration(String configType, String groupSlug, CatalogPlatformModels.AppConfigurationDetail body) throws FDKServerResponseError, FDKException {
        return this.updateGroupConfiguration(configType, groupSlug, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationDetail updateGroupConfiguration(String configType, String groupSlug, CatalogPlatformModels.AppConfigurationDetail body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationDetail> response = null;
            try {
            response = catalogPlatformApiList.updateGroupConfiguration(this.companyId, this.applicationId, configType, groupSlug, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.ConfigSuccessResponse deleteListingConfiguration(String configType, String configId) throws FDKServerResponseError, FDKException {
        return this.deleteListingConfiguration(configType, configId, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponse deleteListingConfiguration(String configType, String configId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponse> response = null;
            try {
            response = catalogPlatformApiList.deleteListingConfiguration(this.companyId, this.applicationId, configType, configId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.AppConfigurationsSort updateListingConfiguration(String configType, String configId, CatalogPlatformModels.AppConfigurationsSort body) throws FDKServerResponseError, FDKException {
        return this.updateListingConfiguration(configType, configId, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationsSort updateListingConfiguration(String configType, String configId, CatalogPlatformModels.AppConfigurationsSort body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationsSort> response = null;
            try {
            response = catalogPlatformApiList.updateListingConfiguration(this.companyId, this.applicationId, configType, configId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CatalogPlatformModels.GetConfigMetadataResponse getConfigurationMetadata(String configType, String templateSlug, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getConfigurationMetadata(configType, templateSlug, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.GetConfigMetadataResponse getConfigurationMetadata(String configType, String templateSlug, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetConfigMetadataResponse> response = null;
            try {
            response = catalogPlatformApiList.getConfigurationMetadata(this.companyId, this.applicationId, configType, templateSlug, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}