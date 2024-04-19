package com.sdk.platform.companyprofile;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class CompanyProfilePlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CompanyProfilePlatformApiList companyprofilePlatformApiList;

    public CompanyProfilePlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.companyprofilePlatformApiList = generateCompanyProfilePlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CompanyProfilePlatformApiList generateCompanyProfilePlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CompanyProfilePlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.GetCompanyProfileSerializerResponse cbsOnboardGet() throws FDKServerResponseError, FDKException {
        return this.cbsOnboardGet(new HashMap<>());
    }

    public CompanyProfilePlatformModels.GetCompanyProfileSerializerResponse cbsOnboardGet(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.GetCompanyProfileSerializerResponse> response = null;
            try {
                response = companyprofilePlatformApiList.cbsOnboardGet(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse updateCompany(CompanyProfilePlatformModels.UpdateCompany body) throws FDKServerResponseError, FDKException {
        return this.updateCompany(body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse updateCompany(CompanyProfilePlatformModels.UpdateCompany body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.updateCompany(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.MetricsSerializer getCompanyMetrics() throws FDKServerResponseError, FDKException {
        return this.getCompanyMetrics(new HashMap<>());
    }

    public CompanyProfilePlatformModels.MetricsSerializer getCompanyMetrics(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.MetricsSerializer> response = null;
            try {
                response = companyprofilePlatformApiList.getCompanyMetrics(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.GetBrandResponseSerializer getBrand(String brandId) throws FDKServerResponseError, FDKException {
        return this.getBrand(brandId, new HashMap<>());
    }

    public CompanyProfilePlatformModels.GetBrandResponseSerializer getBrand(String brandId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.GetBrandResponseSerializer> response = null;
            try {
                response = companyprofilePlatformApiList.getBrand(this.companyId, brandId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse editBrand(String brandId, CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer body) throws FDKServerResponseError, FDKException {
        return this.editBrand(brandId, body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse editBrand(String brandId, CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.editBrand(this.companyId, brandId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse createBrand(CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer body) throws FDKServerResponseError, FDKException {
        return this.createBrand(body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse createBrand(CompanyProfilePlatformModels.CreateUpdateBrandRequestSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.createBrand(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.CompanyBrandListSerializer getBrands(Integer pageNo, Integer pageSize, String q) throws FDKServerResponseError, FDKException {
        return this.getBrands(pageNo, pageSize, q, new HashMap<>());
    }

    public CompanyProfilePlatformModels.CompanyBrandListSerializer getBrands(Integer pageNo, Integer pageSize, String q, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.CompanyBrandListSerializer> response = null;
            try {
                response = companyprofilePlatformApiList.getBrands(this.companyId, pageNo, pageSize, q, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    * Summary: get paginator for getBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CompanyProfilePlatformModels.CompanyBrandListSerializer> getBrandsPagination(
        Integer pageSize ,
        String q 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CompanyProfilePlatformModels.CompanyBrandListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CompanyProfilePlatformModels.CompanyBrandListSerializer callback = this.getBrands(
                
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse createCompanyBrandMapping(CompanyProfilePlatformModels.CompanyBrandPostRequestSerializer body) throws FDKServerResponseError, FDKException {
        return this.createCompanyBrandMapping(body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse createCompanyBrandMapping(CompanyProfilePlatformModels.CompanyBrandPostRequestSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.createCompanyBrandMapping(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.LocationListSerializer getLocations(String storeType, String q, String stage, Integer pageNo, Integer pageSize, List<Integer> locationIds) throws FDKServerResponseError, FDKException {
        return this.getLocations(storeType, q, stage, pageNo, pageSize, locationIds, new HashMap<>());
    }

    public CompanyProfilePlatformModels.LocationListSerializer getLocations(String storeType, String q, String stage, Integer pageNo, Integer pageSize, List<Integer> locationIds, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.LocationListSerializer> response = null;
            try {
                response = companyprofilePlatformApiList.getLocations(this.companyId, storeType, q, stage, pageNo, pageSize, locationIds, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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
    * Summary: get paginator for getLocations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CompanyProfilePlatformModels.LocationListSerializer> getLocationsPagination(
        String storeType ,
        String q ,
        String stage ,
        Integer pageSize ,
        List<Integer> locationIds 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CompanyProfilePlatformModels.LocationListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CompanyProfilePlatformModels.LocationListSerializer callback = this.getLocations(
                
                 
                 storeType,
                 q,
                 stage,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
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
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse createLocation(CompanyProfilePlatformModels.LocationSerializer body) throws FDKServerResponseError, FDKException {
        return this.createLocation(body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse createLocation(CompanyProfilePlatformModels.LocationSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.createLocation(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.GetLocationSerializer getLocationDetail(String locationId) throws FDKServerResponseError, FDKException {
        return this.getLocationDetail(locationId, new HashMap<>());
    }

    public CompanyProfilePlatformModels.GetLocationSerializer getLocationDetail(String locationId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.GetLocationSerializer> response = null;
            try {
                response = companyprofilePlatformApiList.getLocationDetail(this.companyId, locationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse updateLocation(String locationId, CompanyProfilePlatformModels.LocationSerializer body) throws FDKServerResponseError, FDKException {
        return this.updateLocation(locationId, body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse updateLocation(String locationId, CompanyProfilePlatformModels.LocationSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.updateLocation(this.companyId, locationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.ProfileSuccessResponse createLocationBulk(CompanyProfilePlatformModels.BulkLocationSerializer body) throws FDKServerResponseError, FDKException {
        return this.createLocationBulk(body, new HashMap<>());
    }

    public CompanyProfilePlatformModels.ProfileSuccessResponse createLocationBulk(CompanyProfilePlatformModels.BulkLocationSerializer body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.ProfileSuccessResponse> response = null;
            try {
                response = companyprofilePlatformApiList.createLocationBulk(this.companyId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CompanyProfilePlatformModels.StoreTagsResponseSchema getLocationTags() throws FDKServerResponseError, FDKException {
        return this.getLocationTags(new HashMap<>());
    }

    public CompanyProfilePlatformModels.StoreTagsResponseSchema getLocationTags(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CompanyProfilePlatformModels.StoreTagsResponseSchema> response = null;
            try {
                response = companyprofilePlatformApiList.getLocationTags(this.companyId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
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

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}