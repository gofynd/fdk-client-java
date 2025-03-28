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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CategoryResponseSchema listCategories(String level, Integer department, String q, Integer pageNo, Integer pageSize, List<Integer> uids) throws FDKServerResponseError, FDKException {
        return this.listCategories(level, department, q, pageNo, pageSize, uids, new HashMap<>());
    }

    public CatalogPlatformModels.CategoryResponseSchema listCategories(String level, Integer department, String q, Integer pageNo, Integer pageSize, List<Integer> uids, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CategoryResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.listCategories(this.companyId, level, department, q, pageNo, pageSize, uids, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SingleCategoryResponseSchema getCategoryData(String uid) throws FDKServerResponseError, FDKException {
        return this.getCategoryData(uid, new HashMap<>());
    }

    public CatalogPlatformModels.SingleCategoryResponseSchema getCategoryData(String uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SingleCategoryResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CrossSellingResponseSchema getSellerInsights(String sellerAppId) throws FDKServerResponseError, FDKException {
        return this.getSellerInsights(sellerAppId, new HashMap<>());
    }

    public CatalogPlatformModels.CrossSellingResponseSchema getSellerInsights(String sellerAppId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CrossSellingResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.DepartmentsResponseSchema listDepartmentsData(Integer pageNo, String itemType, Integer pageSize, String name, String search, Boolean isActive, List<Integer> uids) throws FDKServerResponseError, FDKException {
        return this.listDepartmentsData(pageNo, itemType, pageSize, name, search, isActive, uids, new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentsResponseSchema listDepartmentsData(Integer pageNo, String itemType, Integer pageSize, String name, String search, Boolean isActive, List<Integer> uids, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.listDepartmentsData(this.companyId, pageNo, itemType, pageSize, name, search, isActive, uids, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.DepartmentsResponseSchema getDepartmentData(String uid) throws FDKServerResponseError, FDKException {
        return this.getDepartmentData(uid, new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentsResponseSchema getDepartmentData(String uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentsResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetInventoriesResponseSchema getInventories(Integer itemId, String size, Integer pageNo, Integer pageSize, String pageId, String pageType, String q, Boolean sellable, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, Integer minSellable, Integer maxSellable, String fromDate, String toDate, String sizeIdentifier) throws FDKServerResponseError, FDKException {
        return this.getInventories(itemId, size, pageNo, pageSize, pageId, pageType, q, sellable, storeIds, brandIds, sellerIdentifiers, minSellable, maxSellable, fromDate, toDate, sizeIdentifier, new HashMap<>());
    }

    public CatalogPlatformModels.GetInventoriesResponseSchema getInventories(Integer itemId, String size, Integer pageNo, Integer pageSize, String pageId, String pageType, String q, Boolean sellable, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, Integer minSellable, Integer maxSellable, String fromDate, String toDate, String sizeIdentifier, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetInventoriesResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getInventories(this.companyId, itemId, size, pageNo, pageSize, pageId, pageType, q, sellable, storeIds, brandIds, sellerIdentifiers, minSellable, maxSellable, fromDate, toDate, sizeIdentifier, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getInventoryBulkUploadHistory(pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkInventoryGet> response = null;
            try {
                response = catalogPlatformApiList.getInventoryBulkUploadHistory(this.companyId, pageNo, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryBulkResponseSchema createBulkInventoryJob(CatalogPlatformModels.InventoryBulkJob body) throws FDKServerResponseError, FDKException {
        return this.createBulkInventoryJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryBulkResponseSchema createBulkInventoryJob(CatalogPlatformModels.InventoryBulkJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryBulkResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema deleteBulkInventoryJob(String batchId) throws FDKServerResponseError, FDKException {
        return this.deleteBulkInventoryJob(batchId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema deleteBulkInventoryJob(String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema createBulkInventory(String batchId, CatalogPlatformModels.InventoryBulkRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createBulkInventory(batchId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema createBulkInventory(String batchId, CatalogPlatformModels.InventoryBulkRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportResponseSchema createInventoryExportJob(CatalogPlatformModels.InventoryExportRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createInventoryExportJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportResponseSchema createInventoryExportJob(CatalogPlatformModels.InventoryExportRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportJobResponseSchema getInventoryExport() throws FDKServerResponseError, FDKException {
        return this.getInventoryExport(new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportJobResponseSchema getInventoryExport(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportJobResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.PatchProductDownloadsResponseSchema patchProductExportDetail(String jobId, CatalogPlatformModels.ExportPatchRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.patchProductExportDetail(jobId, body, new HashMap<>());
    }

    public CatalogPlatformModels.PatchProductDownloadsResponseSchema patchProductExportDetail(String jobId, CatalogPlatformModels.ExportPatchRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.PatchProductDownloadsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.patchProductExportDetail(this.companyId, jobId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductDownloadsResponseSchema getProductExportDetail(String jobId) throws FDKServerResponseError, FDKException {
        return this.getProductExportDetail(jobId, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductDownloadsResponseSchema getProductExportDetail(String jobId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductDownloadsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getProductExportDetail(this.companyId, jobId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.EditInventoryDownloadsResponseSchema patchInventoryExportDetail(String jobId, CatalogPlatformModels.ExportPatchRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.patchInventoryExportDetail(jobId, body, new HashMap<>());
    }

    public CatalogPlatformModels.EditInventoryDownloadsResponseSchema patchInventoryExportDetail(String jobId, CatalogPlatformModels.ExportPatchRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.EditInventoryDownloadsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.patchInventoryExportDetail(this.companyId, jobId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.EditInventoryDownloadsResponseSchema getInventoryExportDetail(String jobId) throws FDKServerResponseError, FDKException {
        return this.getInventoryExportDetail(jobId, new HashMap<>());
    }

    public CatalogPlatformModels.EditInventoryDownloadsResponseSchema getInventoryExportDetail(String jobId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.EditInventoryDownloadsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getInventoryExportDetail(this.companyId, jobId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryConfig exportInventoryConfig(String filter) throws FDKServerResponseError, FDKException {
        return this.exportInventoryConfig(filter, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryConfig exportInventoryConfig(String filter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryConfig> response = null;
            try {
                response = catalogPlatformApiList.exportInventoryConfig(this.companyId, filter, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String downloadInventoryTemplateView(String type) throws FDKServerResponseError, FDKException {
        return this.downloadInventoryTemplateView(type, new HashMap<>());
    }

    public String downloadInventoryTemplateView(String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
                response = catalogPlatformApiList.downloadInventoryTemplateView(this.companyId, type, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryValidationResponseSchema validateProductTemplateSchema(String itemType, Boolean bulk) throws FDKServerResponseError, FDKException {
        return this.validateProductTemplateSchema(itemType, bulk, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryValidationResponseSchema validateProductTemplateSchema(String itemType, Boolean bulk, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryValidationResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.validateProductTemplateSchema(this.companyId, itemType, bulk, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductAttributesResponseSchema getProductAttributes(String category, Boolean filter) throws FDKServerResponseError, FDKException {
        return this.getProductAttributes(category, filter, new HashMap<>());
    }

    public CatalogPlatformModels.ProductAttributesResponseSchema getProductAttributes(String category, Boolean filter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductAttributesResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleCreateResponseSchema createProductBundle(CatalogPlatformModels.ProductBundleRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createProductBundle(body, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleCreateResponseSchema createProductBundle(CatalogPlatformModels.ProductBundleRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleCreateResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleListingResponseSchema getProductBundle(String q, List<String> slug, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductBundle(q, slug, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleListingResponseSchema getProductBundle(String q, List<String> slug, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleListingResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getProductBundle(this.companyId, q, slug, pageNo, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleResponseSchema getProductBundleDetail(String id) throws FDKServerResponseError, FDKException {
        return this.getProductBundleDetail(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleResponseSchema getProductBundleDetail(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductBundleCreateResponseSchema updateProductBundle(String id, CatalogPlatformModels.ProductBundleUpdateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateProductBundle(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductBundleCreateResponseSchema updateProductBundle(String id, CatalogPlatformModels.ProductBundleUpdateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductBundleCreateResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.BulkAssetResponseSchema getProductAssetsInBulk(Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductAssetsInBulk(pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.BulkAssetResponseSchema getProductAssetsInBulk(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BulkAssetResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema createProductAssetsInBulk(CatalogPlatformModels.ProductBulkAssets body) throws FDKServerResponseError, FDKException {
        return this.createProductAssetsInBulk(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema createProductAssetsInBulk(CatalogPlatformModels.ProductBulkAssets body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductBulkRequestSchemaList getProductBulkUploadHistory(String search, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductBulkUploadHistory(search, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductBulkRequestSchemaList getProductBulkUploadHistory(String search, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductBulkRequestSchemaList> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductBulkResponseSchema createBulkProductUploadJob(CatalogPlatformModels.BulkProductUploadJob body) throws FDKServerResponseError, FDKException {
        return this.createBulkProductUploadJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.ProductBulkResponseSchema createBulkProductUploadJob(CatalogPlatformModels.BulkProductUploadJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductBulkResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema deleteProductBulkJob(String batchId) throws FDKServerResponseError, FDKException {
        return this.deleteProductBulkJob(batchId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema deleteProductBulkJob(String batchId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema createProductsInBulk(String batchId, CatalogPlatformModels.BulkProductRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createProductsInBulk(batchId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema createProductsInBulk(String batchId, CatalogPlatformModels.BulkProductRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.HSNCodesResponseSchema listHSNCodes() throws FDKServerResponseError, FDKException {
        return this.listHSNCodes(new HashMap<>());
    }

    public CatalogPlatformModels.HSNCodesResponseSchema listHSNCodes(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HSNCodesResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductTagsViewResponseSchema getProductTags() throws FDKServerResponseError, FDKException {
        return this.getProductTags(new HashMap<>());
    }

    public CatalogPlatformModels.ProductTagsViewResponseSchema getProductTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductTagsViewResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.TemplatesResponseSchema listProductTemplate(String department) throws FDKServerResponseError, FDKException {
        return this.listProductTemplate(department, new HashMap<>());
    }

    public CatalogPlatformModels.TemplatesResponseSchema listProductTemplate(String department, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.TemplatesResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProdcutTemplateCategoriesResponseSchema listProductTemplateCategories(String departments, String itemType, Double pageSize, Double pageNo, Double q) throws FDKServerResponseError, FDKException {
        return this.listProductTemplateCategories(departments, itemType, pageSize, pageNo, q, new HashMap<>());
    }

    public CatalogPlatformModels.ProdcutTemplateCategoriesResponseSchema listProductTemplateCategories(String departments, String itemType, Double pageSize, Double pageNo, Double q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProdcutTemplateCategoriesResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.listProductTemplateCategories(this.companyId, departments, itemType, pageSize, pageNo, q, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.TemplatesValidationResponseSchema validateProductTemplate(String slug, String itemType, Boolean bulk) throws FDKServerResponseError, FDKException {
        return this.validateProductTemplate(slug, itemType, bulk, new HashMap<>());
    }

    public CatalogPlatformModels.TemplatesValidationResponseSchema validateProductTemplate(String slug, String itemType, Boolean bulk, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.TemplatesValidationResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.TemplatesGlobalValidationResponseSchema validateProductGlobalTemplate(String itemType, Boolean bulk) throws FDKServerResponseError, FDKException {
        return this.validateProductGlobalTemplate(itemType, bulk, new HashMap<>());
    }

    public CatalogPlatformModels.TemplatesGlobalValidationResponseSchema validateProductGlobalTemplate(String itemType, Boolean bulk, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.TemplatesGlobalValidationResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.validateProductGlobalTemplate(this.companyId, itemType, bulk, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ValidateProduct getProductValidation(String type, String slug) throws FDKServerResponseError, FDKException {
        return this.getProductValidation(type, slug, new HashMap<>());
    }

    public CatalogPlatformModels.ValidateProduct getProductValidation(String type, String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ValidateProduct> response = null;
            try {
                response = catalogPlatformApiList.getProductValidation(this.companyId, type, slug, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated getInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds) throws FDKServerResponseError, FDKException {
        return this.getInventoryBySizeIdentifier(itemId, sizeIdentifier, pageNo, pageSize, q, locationIds, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated getInventoryBySizeIdentifier(Integer itemId, String sizeIdentifier, Integer pageNo, Integer pageSize, String q, List<Integer> locationIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.Product getProductSize(String itemCode, Integer itemId, Integer brandUid, Integer uid) throws FDKServerResponseError, FDKException {
        return this.getProductSize(itemCode, itemId, brandUid, uid, new HashMap<>());
    }

    public CatalogPlatformModels.Product getProductSize(String itemCode, Integer itemId, Integer brandUid, Integer uid, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.Product> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductSizeDeleteResponseSchema deleteSize(Integer itemId, String size) throws FDKServerResponseError, FDKException {
        return this.deleteSize(itemId, size, new HashMap<>());
    }

    public CatalogPlatformModels.ProductSizeDeleteResponseSchema deleteSize(Integer itemId, String size, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductSizeDeleteResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductVariantsResponseSchema getVariantsOfProducts(Integer itemId, String variantType, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getVariantsOfProducts(itemId, variantType, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductVariantsResponseSchema getVariantsOfProducts(Integer itemId, String variantType, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductVariantsResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CompanyVerificationResponseSchema getCompanyVerification(String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getCompanyVerification(q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.CompanyVerificationResponseSchema getCompanyVerification(String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CompanyVerificationResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getCompanyVerification(this.companyId, q, pageNo, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductVerificationModel getProductVerificationDetails(Integer itemId) throws FDKServerResponseError, FDKException {
        return this.getProductVerificationDetails(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.ProductVerificationModel getProductVerificationDetails(Integer itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductVerificationModel> response = null;
            try {
                response = catalogPlatformApiList.getProductVerificationDetails(this.companyId, itemId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.VariantTypesResponseSchema getVariantTypes(String templateTag) throws FDKServerResponseError, FDKException {
        return this.getVariantTypes(templateTag, new HashMap<>());
    }

    public CatalogPlatformModels.VariantTypesResponseSchema getVariantTypes(String templateTag, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.VariantTypesResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getVariantTypes(this.companyId, templateTag, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema createSizeGuide(CatalogPlatformModels.ValidateSizeGuide body) throws FDKServerResponseError, FDKException {
        return this.createSizeGuide(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema createSizeGuide(CatalogPlatformModels.ValidateSizeGuide body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ListSizeGuide getSizeGuides(Boolean active, String q, Integer brandId, String tag, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getSizeGuides(active, q, brandId, tag, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ListSizeGuide getSizeGuides(Boolean active, String q, Integer brandId, String tag, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ListSizeGuide> response = null;
            try {
                response = catalogPlatformApiList.getSizeGuides(this.companyId, active, q, brandId, tag, pageNo, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SizeGuideResponseSchema getSizeGuide(String id) throws FDKServerResponseError, FDKException {
        return this.getSizeGuide(id, new HashMap<>());
    }

    public CatalogPlatformModels.SizeGuideResponseSchema getSizeGuide(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SizeGuideResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getSizeGuide(id, this.companyId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema updateSizeGuide(String id, CatalogPlatformModels.ValidateSizeGuide body) throws FDKServerResponseError, FDKException {
        return this.updateSizeGuide(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema updateSizeGuide(String id, CatalogPlatformModels.ValidateSizeGuide body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponseSchema updateInventories(CatalogPlatformModels.InventoryV2RequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateInventories(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponseSchema updateInventories(CatalogPlatformModels.InventoryV2RequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportJobListResponseSchema listInventoryExport(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.listInventoryExport(status, fromDate, toDate, q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportJobListResponseSchema listInventoryExport(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportJobListResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryExportResponseSchema createInventoryExport(CatalogPlatformModels.InventoryCreateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createInventoryExport(body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryExportResponseSchema createInventoryExport(CatalogPlatformModels.InventoryCreateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryExportResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductListingResponseV2Schema getProducts(List<Integer> brandIds, Boolean multiSize, List<Integer> categoryIds, List<Integer> itemIds, List<Integer> departmentIds, List<String> itemCode, String name, String slug, List<String> allIdentifiers, String q, List<String> tags, Integer pageNo, Integer pageSize, String pageType, String sortOn, String pageId) throws FDKServerResponseError, FDKException {
        return this.getProducts(brandIds, multiSize, categoryIds, itemIds, departmentIds, itemCode, name, slug, allIdentifiers, q, tags, pageNo, pageSize, pageType, sortOn, pageId, new HashMap<>());
    }

    public CatalogPlatformModels.ProductListingResponseV2Schema getProducts(List<Integer> brandIds, Boolean multiSize, List<Integer> categoryIds, List<Integer> itemIds, List<Integer> departmentIds, List<String> itemCode, String name, String slug, List<String> allIdentifiers, String q, List<String> tags, Integer pageNo, Integer pageSize, String pageType, String sortOn, String pageId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductListingResponseV2Schema> response = null;
            try {
                response = catalogPlatformApiList.getProducts(this.companyId, brandIds, multiSize, categoryIds, itemIds, departmentIds, itemCode, name, slug, allIdentifiers, q, tags, pageNo, pageSize, pageType, sortOn, pageId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponse1Schema createProduct(CatalogPlatformModels.ProductCreateUpdateSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.createProduct(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema createProduct(CatalogPlatformModels.ProductCreateUpdateSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductBulkResponseSchema uploadBulkProducts(String department, String productType, CatalogPlatformModels.BulkProductJob body) throws FDKServerResponseError, FDKException {
        return this.uploadBulkProducts(department, productType, body, new HashMap<>());
    }

    public CatalogPlatformModels.ProductBulkResponseSchema uploadBulkProducts(String department, String productType, CatalogPlatformModels.BulkProductJob body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductBulkResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.ProductDownloadsResponseSchema getProductExportJobs(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductExportJobs(status, fromDate, toDate, q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductDownloadsResponseSchema getProductExportJobs(String status, String fromDate, String toDate, String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductDownloadsResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CreateProductDownloadsResponseSchema createProductExportJob(CatalogPlatformModels.ProductTemplateDownloadsExport body) throws FDKServerResponseError, FDKException {
        return this.createProductExportJob(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateProductDownloadsResponseSchema createProductExportJob(CatalogPlatformModels.ProductTemplateDownloadsExport body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateProductDownloadsResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SingleProductResponseSchema getProduct(Integer itemId, Integer brandUid, String itemCode) throws FDKServerResponseError, FDKException {
        return this.getProduct(itemId, brandUid, itemCode, new HashMap<>());
    }

    public CatalogPlatformModels.SingleProductResponseSchema getProduct(Integer itemId, Integer brandUid, String itemCode, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SingleProductResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema editProduct(Integer itemId, CatalogPlatformModels.ProductCreateUpdateSchemaV2 body) throws FDKServerResponseError, FDKException {
        return this.editProduct(itemId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema editProduct(Integer itemId, CatalogPlatformModels.ProductCreateUpdateSchemaV2 body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.SuccessResponseSchema deleteProduct(Integer itemId) throws FDKServerResponseError, FDKException {
        return this.deleteProduct(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema deleteProduct(Integer itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponseSchema deleteRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryV2RequestSchema body) throws FDKServerResponseError, FDKException {
        return this.deleteRealtimeInventory(itemId, sellerIdentifier, body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponseSchema deleteRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryV2RequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.InventoryUpdateResponseSchema updateRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryV2RequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateRealtimeInventory(itemId, sellerIdentifier, body, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryUpdateResponseSchema updateRealtimeInventory(Integer itemId, String sellerIdentifier, CatalogPlatformModels.InventoryV2RequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryUpdateResponseSchema> response = null;
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.GetProductTemplateSlugResponseSchema getProductTemplateBySlug(String slug) throws FDKServerResponseError, FDKException {
        return this.getProductTemplateBySlug(slug, new HashMap<>());
    }

    public CatalogPlatformModels.GetProductTemplateSlugResponseSchema getProductTemplateBySlug(String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetProductTemplateSlugResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getProductTemplateBySlug(this.companyId, slug, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.UpdateMarketplaceOptinResponseSchema updateMarketplaceOptin(String marketplace, CatalogPlatformModels.UpdateMarketplaceOptinRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateMarketplaceOptin(marketplace, body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateMarketplaceOptinResponseSchema updateMarketplaceOptin(String marketplace, CatalogPlatformModels.UpdateMarketplaceOptinRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateMarketplaceOptinResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.updateMarketplaceOptin(this.companyId, marketplace, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CreateMarketplaceOptinResponseSchema createMarketplaceOptin(String marketplace, CatalogPlatformModels.CreateMarketplaceOptinRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createMarketplaceOptin(marketplace, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateMarketplaceOptinResponseSchema createMarketplaceOptin(String marketplace, CatalogPlatformModels.CreateMarketplaceOptinRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateMarketplaceOptinResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.createMarketplaceOptin(this.companyId, marketplace, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.CompanyDRIListResponseSchema getCompanyBrandsDRI(Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getCompanyBrandsDRI(pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.CompanyDRIListResponseSchema getCompanyBrandsDRI(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CompanyDRIListResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getCompanyBrandsDRI(this.companyId, pageNo, pageSize, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPlatformModels.StoreTagsResponseSchema getLocationTags() throws FDKServerResponseError, FDKException {
        return this.getLocationTags(new HashMap<>());
    }

    public CatalogPlatformModels.StoreTagsResponseSchema getLocationTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.StoreTagsResponseSchema> response = null;
            try {
                response = catalogPlatformApiList.getLocationTags(this.companyId, requestHeaders).execute();
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

    public CatalogPlatformModels.CatalogInsightResponseSchema getCatalogInsights(String brand) throws FDKServerResponseError, FDKException {
        return this.getCatalogInsights(brand, new HashMap<>());
    }

    public CatalogPlatformModels.CatalogInsightResponseSchema getCatalogInsights(String brand, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CatalogInsightResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppBrand(Integer brandUid, CatalogPlatformModels.ApplicationBrandJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppBrand(brandUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppBrand(Integer brandUid, CatalogPlatformModels.ApplicationBrandJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.BrandListingResponseSchema getApplicationBrands(String department, Integer pageNo, Integer pageSize, String q, List<Integer> brandId) throws FDKServerResponseError, FDKException {
        return this.getApplicationBrands(department, pageNo, pageSize, q, brandId, new HashMap<>());
    }

    public CatalogPlatformModels.BrandListingResponseSchema getApplicationBrands(String department, Integer pageNo, Integer pageSize, String q, List<Integer> brandId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BrandListingResponseSchema> response = null;
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
    public Paginator<CatalogPlatformModels.BrandListingResponseSchema> getApplicationBrandsPagination(
        String department,
        Integer pageSize,
        String q,
        List<Integer> brandId
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.BrandListingResponseSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.BrandListingResponseSchema callback = this.getApplicationBrands(
                
                 
                 
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

    public CatalogPlatformModels.CategoryListingResponseSchema getCategories(String department) throws FDKServerResponseError, FDKException {
        return this.getCategories(department, new HashMap<>());
    }

    public CatalogPlatformModels.CategoryListingResponseSchema getCategories(String department, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CategoryListingResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppCategory(Integer categoryUid, CatalogPlatformModels.ApplicationCategoryJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppCategory(categoryUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppCategory(Integer categoryUid, CatalogPlatformModels.ApplicationCategoryJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.CollectionCreateResponseSchema createCollection(CatalogPlatformModels.CreateCollection body) throws FDKServerResponseError, FDKException {
        return this.createCollection(body, new HashMap<>());
    }

    public CatalogPlatformModels.CollectionCreateResponseSchema createCollection(CatalogPlatformModels.CreateCollection body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CollectionCreateResponseSchema> response = null;
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

    public CatalogPlatformModels.GetCollectionListingResponseSchema getAllCollections(String q, String scheduleStatus, String type, List<String> tag, Boolean isActive, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAllCollections(q, scheduleStatus, type, tag, isActive, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionListingResponseSchema getAllCollections(String q, String scheduleStatus, String type, List<String> tag, Boolean isActive, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionListingResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAllCollections(this.companyId, this.applicationId, q, scheduleStatus, type, tag, isActive, pageNo, pageSize, requestHeaders).execute();
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

    public CatalogPlatformModels.GetQueryFiltersValuesResponseSchema getApplicationFilterValues(String filterKey, String c, String collectionId, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationFilterValues(filterKey, c, collectionId, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersValuesResponseSchema getApplicationFilterValues(String filterKey, String c, String collectionId, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersValuesResponseSchema> response = null;
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

    public CatalogPlatformModels.GetQueryFiltersKeysResponseSchema getApplicationFilterKeys(String c) throws FDKServerResponseError, FDKException {
        return this.getApplicationFilterKeys(c, new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersKeysResponseSchema getApplicationFilterKeys(String c, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersKeysResponseSchema> response = null;
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

    public CatalogPlatformModels.GetQueryFiltersResponseSchema getQueryFilters() throws FDKServerResponseError, FDKException {
        return this.getQueryFilters(new HashMap<>());
    }

    public CatalogPlatformModels.GetQueryFiltersResponseSchema getQueryFilters(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetQueryFiltersResponseSchema> response = null;
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

    public CatalogPlatformModels.GetCollectionItemsResponseSchema getCollectionItems(String id, String sortOn, Integer pageSize, Integer pageNo, Boolean isPinned, String q, Boolean isExcluded) throws FDKServerResponseError, FDKException {
        return this.getCollectionItems(id, sortOn, pageSize, pageNo, isPinned, q, isExcluded, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionItemsResponseSchema getCollectionItems(String id, String sortOn, Integer pageSize, Integer pageNo, Boolean isPinned, String q, Boolean isExcluded, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionItemsResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getCollectionItems(this.companyId, this.applicationId, id, sortOn, pageSize, pageNo, isPinned, q, isExcluded, requestHeaders).execute();
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

    public CatalogPlatformModels.CommonResponseSchemaCollection clearCollectionItemsPriority(String id) throws FDKServerResponseError, FDKException {
        return this.clearCollectionItemsPriority(id, new HashMap<>());
    }

    public CatalogPlatformModels.CommonResponseSchemaCollection clearCollectionItemsPriority(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CommonResponseSchemaCollection> response = null;
            try {
            response = catalogPlatformApiList.clearCollectionItemsPriority(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.GetCollectionDetailResponseSchema getCollectionDetail(String slug) throws FDKServerResponseError, FDKException {
        return this.getCollectionDetail(slug, new HashMap<>());
    }

    public CatalogPlatformModels.GetCollectionDetailResponseSchema getCollectionDetail(String slug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetCollectionDetailResponseSchema> response = null;
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

    public CatalogPlatformModels.ApplicationDepartmentListingResponseSchema getApplicationDepartmentListing(Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getApplicationDepartmentListing(pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationDepartmentListingResponseSchema getApplicationDepartmentListing(Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationDepartmentListingResponseSchema> response = null;
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
    public Paginator<CatalogPlatformModels.ApplicationDepartmentListingResponseSchema> getApplicationDepartmentListingPagination(
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationDepartmentListingResponseSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationDepartmentListingResponseSchema callback = this.getApplicationDepartmentListing(
                
                 
                 
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppDepartment(Integer departmentUid, CatalogPlatformModels.ApplicationDepartmentJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppDepartment(departmentUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppDepartment(Integer departmentUid, CatalogPlatformModels.ApplicationDepartmentJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.FilterResponseSchema getConfigurationsFilterMetadata(String filter) throws FDKServerResponseError, FDKException {
        return this.getConfigurationsFilterMetadata(filter, new HashMap<>());
    }

    public CatalogPlatformModels.FilterResponseSchema getConfigurationsFilterMetadata(String filter, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.FilterResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getConfigurationsFilterMetadata(this.companyId, this.applicationId, filter, requestHeaders).execute();
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

    public CatalogPlatformModels.DepartmentResponseSchema getDepartments() throws FDKServerResponseError, FDKException {
        return this.getDepartments(new HashMap<>());
    }

    public CatalogPlatformModels.DepartmentResponseSchema getDepartments(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DepartmentResponseSchema> response = null;
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

    public CatalogPlatformModels.InventoryStockResponseSchema getAppInventory(List<Integer> itemIds, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, String timestamp, Integer pageSize, String pageId, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate) throws FDKServerResponseError, FDKException {
        return this.getAppInventory(itemIds, storeIds, brandIds, sellerIdentifiers, timestamp, pageSize, pageId, qtyGt, qtyLt, qtyType, fromDate, toDate, new HashMap<>());
    }

    public CatalogPlatformModels.InventoryStockResponseSchema getAppInventory(List<Integer> itemIds, List<Integer> storeIds, List<Integer> brandIds, List<String> sellerIdentifiers, String timestamp, Integer pageSize, String pageId, Integer qtyGt, Integer qtyLt, String qtyType, String fromDate, String toDate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.InventoryStockResponseSchema> response = null;
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

    public CatalogPlatformModels.LocationListSchema getAppLocations(String storeType, List<Integer> uid, String q, String stage, Integer pageNo, Integer pageSize, List<String> tags, List<String> storeTypes, List<Integer> companyUids) throws FDKServerResponseError, FDKException {
        return this.getAppLocations(storeType, uid, q, stage, pageNo, pageSize, tags, storeTypes, companyUids, new HashMap<>());
    }

    public CatalogPlatformModels.LocationListSchema getAppLocations(String storeType, List<Integer> uid, String q, String stage, Integer pageNo, Integer pageSize, List<String> tags, List<String> storeTypes, List<Integer> companyUids, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.LocationListSchema> response = null;
            try {
            response = catalogPlatformApiList.getAppLocations(this.companyId, this.applicationId, storeType, uid, q, stage, pageNo, pageSize, tags, storeTypes, companyUids, requestHeaders).execute();
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
    public Paginator<CatalogPlatformModels.LocationListSchema> getAppLocationsPagination(
        String storeType,
        List<Integer> uid,
        String q,
        String stage,
        Integer pageSize,
        List<String> tags,
        List<String> storeTypes,
        List<Integer> companyUids
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.LocationListSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.LocationListSchema callback = this.getAppLocations(
                
                 
                 
                 storeType,
                 uid,
                 q,
                 stage,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 tags,
                 storeTypes,
                 companyUids
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

    public CatalogPlatformModels.OwnerAppItemResponseSchema getAppProduct(Integer itemId) throws FDKServerResponseError, FDKException {
        return this.getAppProduct(itemId, new HashMap<>());
    }

    public CatalogPlatformModels.OwnerAppItemResponseSchema getAppProduct(Integer itemId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.OwnerAppItemResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppProduct(Integer itemId, CatalogPlatformModels.ApplicationItemMeta body) throws FDKServerResponseError, FDKException {
        return this.updateAppProduct(itemId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppProduct(Integer itemId, CatalogPlatformModels.ApplicationItemMeta body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.ApplicationProductListingResponseSchema getApplicationProducts(String q, String f, String c, Boolean filters, Boolean isDependent, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, List<String> itemIds) throws FDKServerResponseError, FDKException {
        return this.getApplicationProducts(q, f, c, filters, isDependent, sortOn, pageId, pageSize, pageNo, pageType, itemIds, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationProductListingResponseSchema getApplicationProducts(String q, String f, String c, Boolean filters, Boolean isDependent, String sortOn, String pageId, Integer pageSize, Integer pageNo, String pageType, List<String> itemIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationProductListingResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getApplicationProducts(this.companyId, this.applicationId, q, f, c, filters, isDependent, sortOn, pageId, pageSize, pageNo, pageType, itemIds, requestHeaders).execute();
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
    * Summary: get paginator for getApplicationProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CatalogPlatformModels.ApplicationProductListingResponseSchema> getApplicationProductsPagination(
        String q,
        String f,
        String c,
        Boolean filters,
        Boolean isDependent,
        String sortOn,
        Integer pageSize,
        List<String> itemIds
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CatalogPlatformModels.ApplicationProductListingResponseSchema> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            CatalogPlatformModels.ApplicationProductListingResponseSchema callback = this.getApplicationProducts(
                
                 
                 
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

    public CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated getDiscountedInventoryBySizeIdentifier(Integer itemId, Integer sizeIdentifier, Integer pageNo, Integer pageSize, List<Integer> locationIds) throws FDKServerResponseError, FDKException {
        return this.getDiscountedInventoryBySizeIdentifier(itemId, sizeIdentifier, pageNo, pageSize, locationIds, new HashMap<>());
    }

    public CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated getDiscountedInventoryBySizeIdentifier(Integer itemId, Integer sizeIdentifier, Integer pageNo, Integer pageSize, List<Integer> locationIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ApplicationInventorySellerIdentifierResponsePaginated> response = null;
            try {
            response = catalogPlatformApiList.getDiscountedInventoryBySizeIdentifier(this.companyId, this.applicationId, itemId, sizeIdentifier, pageNo, pageSize, locationIds, requestHeaders).execute();
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

    public CatalogPlatformModels.RawProductListingResponseSchema getAppProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> departmentIds, List<String> tags, List<Integer> itemIds, Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getAppProducts(brandIds, categoryIds, departmentIds, tags, itemIds, pageNo, pageSize, q, new HashMap<>());
    }

    public CatalogPlatformModels.RawProductListingResponseSchema getAppProducts(List<Integer> brandIds, List<Integer> categoryIds, List<Integer> departmentIds, List<String> tags, List<Integer> itemIds, Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.RawProductListingResponseSchema> response = null;
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

    public CatalogPlatformModels.AppReturnConfigResponseSchema getAppReturnConfiguration() throws FDKServerResponseError, FDKException {
        return this.getAppReturnConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.AppReturnConfigResponseSchema getAppReturnConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppReturnConfigResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema createAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.createAppReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema createAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.updateAppReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppReturnConfiguration(CatalogPlatformModels.CreateUpdateAppReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.SuccessResponseSchema deleteAppCategoryReturnConfiguration(CatalogPlatformModels.DeleteAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.deleteAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema deleteAppCategoryReturnConfiguration(CatalogPlatformModels.DeleteAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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

    public CatalogPlatformModels.BaseAppCategoryReturnConfigResponseSchema getAppCategoryReturnConfig(String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAppCategoryReturnConfig(q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.BaseAppCategoryReturnConfigResponseSchema getAppCategoryReturnConfig(String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.BaseAppCategoryReturnConfigResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema createAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.createAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema createAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.SuccessResponseSchema updateAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body) throws FDKServerResponseError, FDKException {
        return this.updateAppCategoryReturnConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseSchema updateAppCategoryReturnConfiguration(CatalogPlatformModels.BaseAppCategoryReturnConfig body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseSchema> response = null;
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

    public CatalogPlatformModels.CreateAutocompleteWordsResponseSchema createCustomAutocompleteRule(CatalogPlatformModels.CreateAutocompleteKeyword body) throws FDKServerResponseError, FDKException {
        return this.createCustomAutocompleteRule(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAutocompleteWordsResponseSchema createCustomAutocompleteRule(CatalogPlatformModels.CreateAutocompleteKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAutocompleteWordsResponseSchema> response = null;
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

    public CatalogPlatformModels.GetAutocompleteWordsResponseSchema getAutocompleteConfig(Integer pageNo, Integer pageSize, String q, Boolean isActive) throws FDKServerResponseError, FDKException {
        return this.getAutocompleteConfig(pageNo, pageSize, q, isActive, new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsResponseSchema getAutocompleteConfig(Integer pageNo, Integer pageSize, String q, Boolean isActive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAutocompleteConfig(this.companyId, this.applicationId, pageNo, pageSize, q, isActive, requestHeaders).execute();
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

    public CatalogPlatformModels.GetAutocompleteWordsData getAutocompleteKeywordDetail(String id) throws FDKServerResponseError, FDKException {
        return this.getAutocompleteKeywordDetail(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsData getAutocompleteKeywordDetail(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsData> response = null;
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

    public CatalogPlatformModels.GetAutocompleteWordsData updateAutocompleteKeyword(String id, CatalogPlatformModels.CreateAutocompleteKeyword body) throws FDKServerResponseError, FDKException {
        return this.updateAutocompleteKeyword(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.GetAutocompleteWordsData updateAutocompleteKeyword(String id, CatalogPlatformModels.CreateAutocompleteKeyword body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAutocompleteWordsData> response = null;
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

    public CatalogPlatformModels.DeleteResponseSchema deleteAutocompleteKeyword(String id) throws FDKServerResponseError, FDKException {
        return this.deleteAutocompleteKeyword(id, new HashMap<>());
    }

    public CatalogPlatformModels.DeleteResponseSchema deleteAutocompleteKeyword(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteResponseSchema> response = null;
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

    public CatalogPlatformModels.CreateSearchRerankResponseSchema createSearchRerank(CatalogPlatformModels.CreateSearchRerankRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createSearchRerank(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateSearchRerankResponseSchema createSearchRerank(CatalogPlatformModels.CreateSearchRerankRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateSearchRerankResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createSearchRerank(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.GetSearchRerankResponseSchema getSearchRerank() throws FDKServerResponseError, FDKException {
        return this.getSearchRerank(new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchRerankResponseSchema getSearchRerank(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchRerankResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getSearchRerank(this.companyId, this.applicationId, requestHeaders).execute();
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

    public CatalogPlatformModels.GetSearchRerankDetailResponseSchema getSearchRerankDetail(String id) throws FDKServerResponseError, FDKException {
        return this.getSearchRerankDetail(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchRerankDetailResponseSchema getSearchRerankDetail(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchRerankDetailResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getSearchRerankDetail(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.UpdateSearchRerankResponseSchema updateSearchRerankConfiguration(String id, CatalogPlatformModels.UpdateSearchRerankRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateSearchRerankConfiguration(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateSearchRerankResponseSchema updateSearchRerankConfiguration(String id, CatalogPlatformModels.UpdateSearchRerankRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateSearchRerankResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.updateSearchRerankConfiguration(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.DeleteSearchRerankConfigurationResponseSchema deleteSearchRerankConfiguration(String id) throws FDKServerResponseError, FDKException {
        return this.deleteSearchRerankConfiguration(id, new HashMap<>());
    }

    public CatalogPlatformModels.DeleteSearchRerankConfigurationResponseSchema deleteSearchRerankConfiguration(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteSearchRerankConfigurationResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.deleteSearchRerankConfiguration(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateSearchConfigurationResponseSchema createSearchConfiguration(CatalogPlatformModels.CreateSearchConfigurationRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createSearchConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateSearchConfigurationResponseSchema createSearchConfiguration(CatalogPlatformModels.CreateSearchConfigurationRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateSearchConfigurationResponseSchema> response = null;
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

    public CatalogPlatformModels.GetSearchConfigurationResponseSchema getSearchConfiguration() throws FDKServerResponseError, FDKException {
        return this.getSearchConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchConfigurationResponseSchema getSearchConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchConfigurationResponseSchema> response = null;
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

    public CatalogPlatformModels.UpdateSearchConfigurationResponseSchema updateSearchConfiguration(CatalogPlatformModels.UpdateSearchConfigurationRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateSearchConfiguration(body, new HashMap<>());
    }

    public CatalogPlatformModels.UpdateSearchConfigurationResponseSchema updateSearchConfiguration(CatalogPlatformModels.UpdateSearchConfigurationRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.UpdateSearchConfigurationResponseSchema> response = null;
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

    public CatalogPlatformModels.DeleteSearchConfigurationResponseSchema deleteSearchConfiguration() throws FDKServerResponseError, FDKException {
        return this.deleteSearchConfiguration(new HashMap<>());
    }

    public CatalogPlatformModels.DeleteSearchConfigurationResponseSchema deleteSearchConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteSearchConfigurationResponseSchema> response = null;
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

    public CatalogPlatformModels.GetSearchWordsResponseSchema getAllSearchKeyword(Integer pageNo, Integer pageSize, String q, Boolean isActive) throws FDKServerResponseError, FDKException {
        return this.getAllSearchKeyword(pageNo, pageSize, q, isActive, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsResponseSchema getAllSearchKeyword(Integer pageNo, Integer pageSize, String q, Boolean isActive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAllSearchKeyword(this.companyId, this.applicationId, pageNo, pageSize, q, isActive, requestHeaders).execute();
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

    public CatalogPlatformModels.GetSearchWordsData getSearchKeywords(String id) throws FDKServerResponseError, FDKException {
        return this.getSearchKeywords(id, new HashMap<>());
    }

    public CatalogPlatformModels.GetSearchWordsData getSearchKeywords(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetSearchWordsData> response = null;
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

    public CatalogPlatformModels.DeleteResponseSchema deleteSearchKeywords(String id) throws FDKServerResponseError, FDKException {
        return this.deleteSearchKeywords(id, new HashMap<>());
    }

    public CatalogPlatformModels.DeleteResponseSchema deleteSearchKeywords(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.DeleteResponseSchema> response = null;
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

    public CatalogPlatformModels.SuccessResponse1Schema updateAppLocation(Integer storeUid, CatalogPlatformModels.ApplicationStoreJson body) throws FDKServerResponseError, FDKException {
        return this.updateAppLocation(storeUid, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponse1Schema updateAppLocation(Integer storeUid, CatalogPlatformModels.ApplicationStoreJson body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponse1Schema> response = null;
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

    public CatalogPlatformModels.ConfigSuccessResponseSchema updateAllowSingle(CatalogPlatformModels.AllowSingleRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateAllowSingle(body, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponseSchema updateAllowSingle(CatalogPlatformModels.AllowSingleRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponseSchema> response = null;
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

    public CatalogPlatformModels.ConfigSuccessResponseSchema updateDefaultSort(CatalogPlatformModels.DefaultKeyRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateDefaultSort(body, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponseSchema updateDefaultSort(CatalogPlatformModels.DefaultKeyRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponseSchema> response = null;
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

    public CatalogPlatformModels.AppConfigurationsFilterResponseSchema createListingConfiguration(String configType, CatalogPlatformModels.AppConfigurationsFilter body) throws FDKServerResponseError, FDKException {
        return this.createListingConfiguration(configType, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationsFilterResponseSchema createListingConfiguration(String configType, CatalogPlatformModels.AppConfigurationsFilter body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationsFilterResponseSchema> response = null;
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

    public CatalogPlatformModels.GetListingConfigResponseSchema getListingConfigurations(String configType, Integer pageNo, Integer pageSize, String search, List<Integer> uids) throws FDKServerResponseError, FDKException {
        return this.getListingConfigurations(configType, pageNo, pageSize, search, uids, new HashMap<>());
    }

    public CatalogPlatformModels.GetListingConfigResponseSchema getListingConfigurations(String configType, Integer pageNo, Integer pageSize, String search, List<Integer> uids, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetListingConfigResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getListingConfigurations(this.companyId, this.applicationId, configType, pageNo, pageSize, search, uids, requestHeaders).execute();
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

    public CatalogPlatformModels.AppConfigurationDetail createGroupConfiguration(String configType, CatalogPlatformModels.AppConfigurationCreateDetail body) throws FDKServerResponseError, FDKException {
        return this.createGroupConfiguration(configType, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationDetail createGroupConfiguration(String configType, CatalogPlatformModels.AppConfigurationCreateDetail body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
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

    public CatalogPlatformModels.GetConfigResponseSchema getGroupConfigurations(String configType, Integer pageNo, Integer pageSize, String search, String templateSlug) throws FDKServerResponseError, FDKException {
        return this.getGroupConfigurations(configType, pageNo, pageSize, search, templateSlug, new HashMap<>());
    }

    public CatalogPlatformModels.GetConfigResponseSchema getGroupConfigurations(String configType, Integer pageNo, Integer pageSize, String search, String templateSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetConfigResponseSchema> response = null;
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

    public Object deleteGroupConfiguration(String configType, String groupSlug) throws FDKServerResponseError, FDKException {
        return this.deleteGroupConfiguration(configType, groupSlug, new HashMap<>());
    }

    public Object deleteGroupConfiguration(String configType, String groupSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
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

    public CatalogPlatformModels.AppConfigurationsFilterResponseSchema updateListingConfiguration(String configType, String configId, CatalogPlatformModels.AppConfigurationsFilterResponseSchema body) throws FDKServerResponseError, FDKException {
        return this.updateListingConfiguration(configType, configId, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppConfigurationsFilterResponseSchema updateListingConfiguration(String configType, String configId, CatalogPlatformModels.AppConfigurationsFilterResponseSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppConfigurationsFilterResponseSchema> response = null;
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

    public CatalogPlatformModels.ConfigSuccessResponseSchema deleteListingConfiguration(String configType, String configId) throws FDKServerResponseError, FDKException {
        return this.deleteListingConfiguration(configType, configId, new HashMap<>());
    }

    public CatalogPlatformModels.ConfigSuccessResponseSchema deleteListingConfiguration(String configType, String configId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ConfigSuccessResponseSchema> response = null;
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

    public CatalogPlatformModels.GetConfigMetadataResponseSchema getConfigurationMetadata(String configType, String templateSlug) throws FDKServerResponseError, FDKException {
        return this.getConfigurationMetadata(configType, templateSlug, new HashMap<>());
    }

    public CatalogPlatformModels.GetConfigMetadataResponseSchema getConfigurationMetadata(String configType, String templateSlug, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetConfigMetadataResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getConfigurationMetadata(this.companyId, this.applicationId, configType, templateSlug, requestHeaders).execute();
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

    public CatalogPlatformModels.AutocompleteUpsertResponseSchema createAutocompleteSettings(CatalogPlatformModels.AutocompleteRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createAutocompleteSettings(body, new HashMap<>());
    }

    public CatalogPlatformModels.AutocompleteUpsertResponseSchema createAutocompleteSettings(CatalogPlatformModels.AutocompleteRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AutocompleteUpsertResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createAutocompleteSettings(this.applicationId, this.companyId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.AutocompleteResponseSchema getAutocompleteSettings() throws FDKServerResponseError, FDKException {
        return this.getAutocompleteSettings(new HashMap<>());
    }

    public CatalogPlatformModels.AutocompleteResponseSchema getAutocompleteSettings(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AutocompleteResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAutocompleteSettings(this.applicationId, this.companyId, requestHeaders).execute();
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

    public CatalogPlatformModels.AutocompleteUpsertResponseSchema updateAutocompleteSettings(String id, CatalogPlatformModels.AutocompleteRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateAutocompleteSettings(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.AutocompleteUpsertResponseSchema updateAutocompleteSettings(String id, CatalogPlatformModels.AutocompleteRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AutocompleteUpsertResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.updateAutocompleteSettings(this.applicationId, this.companyId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.AutocompletePreviewResponseSchema getAutocompletePreview(String q, Integer categorySuggestion, Integer brandSuggestion, Integer collectionSuggestion, Integer productSuggestion, Integer querySuggestion) throws FDKServerResponseError, FDKException {
        return this.getAutocompletePreview(q, categorySuggestion, brandSuggestion, collectionSuggestion, productSuggestion, querySuggestion, new HashMap<>());
    }

    public CatalogPlatformModels.AutocompletePreviewResponseSchema getAutocompletePreview(String q, Integer categorySuggestion, Integer brandSuggestion, Integer collectionSuggestion, Integer productSuggestion, Integer querySuggestion, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AutocompletePreviewResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAutocompletePreview(this.applicationId, this.companyId, q, categorySuggestion, brandSuggestion, collectionSuggestion, productSuggestion, querySuggestion, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRulePinAction(String merchandisingRuleId, CatalogPlatformModels.PinRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createMerchandisingRulePinAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRulePinAction(String merchandisingRuleId, CatalogPlatformModels.PinRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.createMerchandisingRulePinAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRulePinAction(String merchandisingRuleId, CatalogPlatformModels.PinRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateMerchandisingRulePinAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRulePinAction(String merchandisingRuleId, CatalogPlatformModels.PinRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.updateMerchandisingRulePinAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.PinResponseSchema getMerchandisingRulePinAction(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingRulePinAction(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.PinResponseSchema getMerchandisingRulePinAction(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.PinResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingRulePinAction(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleHideAction(String merchandisingRuleId, CatalogPlatformModels.HideRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createMerchandisingRuleHideAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleHideAction(String merchandisingRuleId, CatalogPlatformModels.HideRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.createMerchandisingRuleHideAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleHideAction(String merchandisingRuleId, CatalogPlatformModels.HideRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateMerchandisingRuleHideAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleHideAction(String merchandisingRuleId, CatalogPlatformModels.HideRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.updateMerchandisingRuleHideAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.HideResponseSchema getMerchandisingRuleHideAction(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingRuleHideAction(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.HideResponseSchema getMerchandisingRuleHideAction(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.HideResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingRuleHideAction(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleBoostAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body) throws FDKServerResponseError, FDKException {
        return this.createMerchandisingRuleBoostAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleBoostAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.createMerchandisingRuleBoostAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleBoostAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body) throws FDKServerResponseError, FDKException {
        return this.updateMerchandisingRuleBoostAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleBoostAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.updateMerchandisingRuleBoostAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.GetMerchandisingRuleBoostAction getMerchandisingRuleBoostAction(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingRuleBoostAction(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.GetMerchandisingRuleBoostAction getMerchandisingRuleBoostAction(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetMerchandisingRuleBoostAction> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingRuleBoostAction(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleBuryAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body) throws FDKServerResponseError, FDKException {
        return this.createMerchandisingRuleBuryAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising createMerchandisingRuleBuryAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.createMerchandisingRuleBuryAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleBuryAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body) throws FDKServerResponseError, FDKException {
        return this.updateMerchandisingRuleBuryAction(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleBuryAction(String merchandisingRuleId, CatalogPlatformModels.PostMerchandisingRuleBoostAction body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.updateMerchandisingRuleBuryAction(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.GetMerchandisingRuleBuryAction getMerchandisingRuleBuryAction(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingRuleBuryAction(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.GetMerchandisingRuleBuryAction getMerchandisingRuleBuryAction(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetMerchandisingRuleBuryAction> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingRuleBuryAction(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.MerchandiseQueryResponseSchema createMerchandisingRuleQuery(CatalogPlatformModels.MerchandisingRuleQueryPost body) throws FDKServerResponseError, FDKException {
        return this.createMerchandisingRuleQuery(body, new HashMap<>());
    }

    public CatalogPlatformModels.MerchandiseQueryResponseSchema createMerchandisingRuleQuery(CatalogPlatformModels.MerchandisingRuleQueryPost body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.MerchandiseQueryResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createMerchandisingRuleQuery(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SearchResponseSchema getMerchandisingQuery(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingQuery(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.SearchResponseSchema getMerchandisingQuery(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SearchResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingQuery(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleQuery(String merchandisingRuleId, CatalogPlatformModels.MerchandisingRuleQueryPost body) throws FDKServerResponseError, FDKException {
        return this.updateMerchandisingRuleQuery(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising updateMerchandisingRuleQuery(String merchandisingRuleId, CatalogPlatformModels.MerchandisingRuleQueryPost body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.updateMerchandisingRuleQuery(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising saveMerchandisingRules(String merchandisingRuleId, CatalogPlatformModels.MerchandisingRuleSave body) throws FDKServerResponseError, FDKException {
        return this.saveMerchandisingRules(merchandisingRuleId, body, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising saveMerchandisingRules(String merchandisingRuleId, CatalogPlatformModels.MerchandisingRuleSave body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.saveMerchandisingRules(this.companyId, this.applicationId, merchandisingRuleId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising deleteMerchandisingRule(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.deleteMerchandisingRule(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising deleteMerchandisingRule(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.deleteMerchandisingRule(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.MerchandisingRulesList getMerchandisingRules(String pageId, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getMerchandisingRules(pageId, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.MerchandisingRulesList getMerchandisingRules(String pageId, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.MerchandisingRulesList> response = null;
            try {
            response = catalogPlatformApiList.getMerchandisingRules(this.companyId, this.applicationId, pageId, pageSize, requestHeaders).execute();
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

    public CatalogPlatformModels.SuccessResponseMerchandising deleteMerchandisingRulesPreview(String merchandisingRuleId) throws FDKServerResponseError, FDKException {
        return this.deleteMerchandisingRulesPreview(merchandisingRuleId, new HashMap<>());
    }

    public CatalogPlatformModels.SuccessResponseMerchandising deleteMerchandisingRulesPreview(String merchandisingRuleId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SuccessResponseMerchandising> response = null;
            try {
            response = catalogPlatformApiList.deleteMerchandisingRulesPreview(this.companyId, this.applicationId, merchandisingRuleId, requestHeaders).execute();
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

    public CatalogPlatformModels.ProductListingResponseSchema getLivePreview(String merchandisingRuleId, String searchKeyword) throws FDKServerResponseError, FDKException {
        return this.getLivePreview(merchandisingRuleId, searchKeyword, new HashMap<>());
    }

    public CatalogPlatformModels.ProductListingResponseSchema getLivePreview(String merchandisingRuleId, String searchKeyword, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductListingResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getLivePreview(this.companyId, this.applicationId, merchandisingRuleId, searchKeyword, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryResponseSchema createAppPriceFactory(CatalogPlatformModels.CreateAppPriceFactoryRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createAppPriceFactory(body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryResponseSchema createAppPriceFactory(CatalogPlatformModels.CreateAppPriceFactoryRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createAppPriceFactory(this.companyId, this.applicationId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.GetAppPriceFactoryResponseSchema getAppPriceFactories(Boolean isActive, String factoryTypeId, String code, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAppPriceFactories(isActive, factoryTypeId, code, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.GetAppPriceFactoryResponseSchema getAppPriceFactories(Boolean isActive, String factoryTypeId, String code, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.GetAppPriceFactoryResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAppPriceFactories(this.companyId, this.applicationId, isActive, factoryTypeId, code, pageNo, pageSize, requestHeaders).execute();
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

    public CatalogPlatformModels.AppPriceFactory getAppPriceFactory(String id) throws FDKServerResponseError, FDKException {
        return this.getAppPriceFactory(id, new HashMap<>());
    }

    public CatalogPlatformModels.AppPriceFactory getAppPriceFactory(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppPriceFactory> response = null;
            try {
            response = catalogPlatformApiList.getAppPriceFactory(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.AppPriceFactory editAppPriceFactory(String id, CatalogPlatformModels.EditAppPriceFactoryRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.editAppPriceFactory(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.AppPriceFactory editAppPriceFactory(String id, CatalogPlatformModels.EditAppPriceFactoryRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppPriceFactory> response = null;
            try {
            response = catalogPlatformApiList.editAppPriceFactory(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreatePriceFactoryProductResponseSchema addProductsInPriceFactoryByZoneId(String id, CatalogPlatformModels.CreatePriceFactoryProductRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.addProductsInPriceFactoryByZoneId(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreatePriceFactoryProductResponseSchema addProductsInPriceFactoryByZoneId(String id, CatalogPlatformModels.CreatePriceFactoryProductRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreatePriceFactoryProductResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.addProductsInPriceFactoryByZoneId(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductsResponseSchema getProductsInPriceFactoryByZoneId(String id, String zoneId, Double itemId, String q, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getProductsInPriceFactoryByZoneId(id, zoneId, itemId, q, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductsResponseSchema getProductsInPriceFactoryByZoneId(String id, String zoneId, Double itemId, String q, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductsResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getProductsInPriceFactoryByZoneId(this.companyId, this.applicationId, id, zoneId, itemId, q, pageNo, pageSize, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema createProductPriceFactoryBulkJob(String id, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createProductPriceFactoryBulkJob(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema createProductPriceFactoryBulkJob(String id, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createProductPriceFactoryBulkJob(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobPollResponseSchema pollProductPriceFactoryBulkJob(String id, String jobId) throws FDKServerResponseError, FDKException {
        return this.pollProductPriceFactoryBulkJob(id, jobId, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobPollResponseSchema pollProductPriceFactoryBulkJob(String id, String jobId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobPollResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.pollProductPriceFactoryBulkJob(this.companyId, this.applicationId, id, jobId, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobValidateResponseSchema validateProductPriceFactoryBulkJob(String id, String jobId, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.validateProductPriceFactoryBulkJob(id, jobId, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobValidateResponseSchema validateProductPriceFactoryBulkJob(String id, String jobId, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobValidateResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.validateProductPriceFactoryBulkJob(this.companyId, this.applicationId, id, jobId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema processProductPriceFactoryBulkJob(String id, String jobId, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.processProductPriceFactoryBulkJob(id, jobId, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema processProductPriceFactoryBulkJob(String id, String jobId, CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductBulkJobResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.processProductPriceFactoryBulkJob(this.companyId, this.applicationId, id, jobId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductExportJobResponseSchema exportProductsInPriceFactory(String id, CatalogPlatformModels.CreateAppPriceFactoryProductExportJobRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.exportProductsInPriceFactory(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductExportJobResponseSchema exportProductsInPriceFactory(String id, CatalogPlatformModels.CreateAppPriceFactoryProductExportJobRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductExportJobResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.exportProductsInPriceFactory(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.CreateAppPriceFactoryProductExportJobPollResponseSchema pollPriceFactoryJobs(String id, String startDate, String endDate, List<String> stage, Boolean isActive, String q, List<String> type) throws FDKServerResponseError, FDKException {
        return this.pollPriceFactoryJobs(id, startDate, endDate, stage, isActive, q, type, new HashMap<>());
    }

    public CatalogPlatformModels.CreateAppPriceFactoryProductExportJobPollResponseSchema pollPriceFactoryJobs(String id, String startDate, String endDate, List<String> stage, Boolean isActive, String q, List<String> type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.CreateAppPriceFactoryProductExportJobPollResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.pollPriceFactoryJobs(this.companyId, this.applicationId, id, startDate, endDate, stage, isActive, q, type, requestHeaders).execute();
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

    public CatalogPlatformModels.ProductPrices getAppProductPrices(List<Integer> itemIds, List<String> factoryTypeIds, Integer pageNo, Integer pageSize) throws FDKServerResponseError, FDKException {
        return this.getAppProductPrices(itemIds, factoryTypeIds, pageNo, pageSize, new HashMap<>());
    }

    public CatalogPlatformModels.ProductPrices getAppProductPrices(List<Integer> itemIds, List<String> factoryTypeIds, Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.ProductPrices> response = null;
            try {
            response = catalogPlatformApiList.getAppProductPrices(this.companyId, this.applicationId, itemIds, factoryTypeIds, pageNo, pageSize, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymListResponseSchema getSynonyms(String id, String name, String type) throws FDKServerResponseError, FDKException {
        return this.getSynonyms(id, name, type, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymListResponseSchema getSynonyms(String id, String name, String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymListResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getSynonyms(this.companyId, this.applicationId, id, name, type, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymCreateResponseSchema createSynonyms(CatalogPlatformModels.SynonymCreateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.createSynonyms(body, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymCreateResponseSchema createSynonyms(CatalogPlatformModels.SynonymCreateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymCreateResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.createSynonyms(this.applicationId, this.companyId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymUpdateResponseSchema updateSynonyms(String id, CatalogPlatformModels.SynonymCreateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.updateSynonyms(id, body, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymUpdateResponseSchema updateSynonyms(String id, CatalogPlatformModels.SynonymCreateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymUpdateResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.updateSynonyms(this.companyId, this.applicationId, id, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymDeleteResponseSchemaSchema deleteSynonym(String id) throws FDKServerResponseError, FDKException {
        return this.deleteSynonym(id, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymDeleteResponseSchemaSchema deleteSynonym(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymDeleteResponseSchemaSchema> response = null;
            try {
            response = catalogPlatformApiList.deleteSynonym(this.companyId, this.applicationId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymExportResponseSchema exportSynonyms() throws FDKServerResponseError, FDKException {
        return this.exportSynonyms(new HashMap<>());
    }

    public CatalogPlatformModels.SynonymExportResponseSchema exportSynonyms(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymExportResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.exportSynonyms(this.applicationId, this.companyId, requestHeaders).execute();
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

    public String sampleBulkSynonymsFile(String type) throws FDKServerResponseError, FDKException {
        return this.sampleBulkSynonymsFile(type, new HashMap<>());
    }

    public String sampleBulkSynonymsFile(String type, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<String> response = null;
            try {
            response = catalogPlatformApiList.sampleBulkSynonymsFile(this.applicationId, this.companyId, type, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymUploadResponseSchema uploadSynonyms(CatalogPlatformModels.SynonymUploadRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.uploadSynonyms(body, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymUploadResponseSchema uploadSynonyms(CatalogPlatformModels.SynonymUploadRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymUploadResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.uploadSynonyms(this.applicationId, this.companyId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymBulkValidateResponseSchema validateBulkSynonyms(CatalogPlatformModels.SynonymBulkValidateRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.validateBulkSynonyms(body, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymBulkValidateResponseSchema validateBulkSynonyms(CatalogPlatformModels.SynonymBulkValidateRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymBulkValidateResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.validateBulkSynonyms(this.applicationId, this.companyId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymBulkProcessResponseSchema processBulkSynonyms(CatalogPlatformModels.SynonymBulkProcessRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.processBulkSynonyms(body, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymBulkProcessResponseSchema processBulkSynonyms(CatalogPlatformModels.SynonymBulkProcessRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymBulkProcessResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.processBulkSynonyms(this.applicationId, this.companyId, body, requestHeaders).execute();
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

    public CatalogPlatformModels.SynonymBulkPollResponseSchema pollBulkSynonyms(String id) throws FDKServerResponseError, FDKException {
        return this.pollBulkSynonyms(id, new HashMap<>());
    }

    public CatalogPlatformModels.SynonymBulkPollResponseSchema pollBulkSynonyms(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.SynonymBulkPollResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.pollBulkSynonyms(this.applicationId, this.companyId, id, requestHeaders).execute();
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

    public CatalogPlatformModels.AppPriceByIdResponseSchema getAppPriceById(Integer itemId, List<Integer> storeIds, List<String> factoryTypeIds, Integer sellerId) throws FDKServerResponseError, FDKException {
        return this.getAppPriceById(itemId, storeIds, factoryTypeIds, sellerId, new HashMap<>());
    }

    public CatalogPlatformModels.AppPriceByIdResponseSchema getAppPriceById(Integer itemId, List<Integer> storeIds, List<String> factoryTypeIds, Integer sellerId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CatalogPlatformModels.AppPriceByIdResponseSchema> response = null;
            try {
            response = catalogPlatformApiList.getAppPriceById(this.applicationId, this.companyId, itemId, storeIds, factoryTypeIds, sellerId, requestHeaders).execute();
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