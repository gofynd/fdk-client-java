package com.sdk.platform.configuration;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.PlatformConfig;







public class ConfigurationPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ConfigurationPlatformApiList configurationPlatformApiList;

    public ConfigurationPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.configurationPlatformApiList = generateConfigurationPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ConfigurationPlatformApiList generateConfigurationPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ConfigurationPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.CreateAppResponse createApplication(ConfigurationPlatformModels.CreateApplicationRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.CreateAppResponse> response = null;
            try {
                response = configurationPlatformApiList.createApplication(this.companyId , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationsResponse getApplications(Integer pageNo , Integer pageSize , String q ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationsResponse> response = null;
            try {
                response = configurationPlatformApiList.getApplications(this.companyId ,pageNo , pageSize , q ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getApplications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.ApplicationsResponse> getApplicationsPagination(
        Integer pageSize ,
        String q 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.ApplicationsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.ApplicationsResponse callback = this.getApplications(
                
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.CurrenciesResponse getCurrencies() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.CurrenciesResponse> response = null;
            try {
                response = configurationPlatformApiList.getCurrencies(this.companyId ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.DomainSuggestionsResponse getDomainAvailibility(ConfigurationPlatformModels.DomainSuggestionsRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.DomainSuggestionsResponse> response = null;
            try {
                response = configurationPlatformApiList.getDomainAvailibility(this.companyId , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.Integration getIntegrationById(Integer id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.Integration> response = null;
            try {
                response = configurationPlatformApiList.getIntegrationById(this.companyId , id  ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.GetIntegrationsOptInsResponse getAvailableOptIns(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> response = null;
            try {
                response = configurationPlatformApiList.getAvailableOptIns(this.companyId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAvailableOptIns
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> getAvailableOptInsPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.GetIntegrationsOptInsResponse callback = this.getAvailableOptIns(
                
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.GetIntegrationsOptInsResponse getSelectedOptIns(String level , Integer uid , Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> response = null;
            try {
                response = configurationPlatformApiList.getSelectedOptIns(this.companyId , level  , uid  ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSelectedOptIns
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> getSelectedOptInsPagination(
        String level ,
        Integer uid ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.GetIntegrationsOptInsResponse callback = this.getSelectedOptIns(
                
                 
                 level,
                 uid,
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.IntegrationConfigResponse getIntegrationLevelConfig(String id , String level , Boolean opted , Boolean checkPermission ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.IntegrationConfigResponse> response = null;
            try {
                response = configurationPlatformApiList.getIntegrationLevelConfig(this.companyId , id  , level  ,opted , checkPermission ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.IntegrationLevel updateLevelIntegration(String id , String level ,ConfigurationPlatformModels.UpdateIntegrationLevelRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.IntegrationLevel> response = null;
            try {
                response = configurationPlatformApiList.updateLevelIntegration(this.companyId , id  , level  , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.IntegrationLevel getIntegrationByLevelId(String id , String level , Integer uid ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.IntegrationLevel> response = null;
            try {
                response = configurationPlatformApiList.getIntegrationByLevelId(this.companyId , id  , level  , uid  ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.IntegrationLevel updateLevelUidIntegration(String id , String level , Integer uid ,ConfigurationPlatformModels.IntegrationLevel body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.IntegrationLevel> response = null;
            try {
                response = configurationPlatformApiList.updateLevelUidIntegration(this.companyId , id  , level  , uid  , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.OptedStoreIntegration getLevelActiveIntegrations(String id , String level , Integer uid , String permission ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.OptedStoreIntegration> response = null;
            try {
                response = configurationPlatformApiList.getLevelActiveIntegrations(this.companyId , id  , level  , uid  ,permission ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.BrandsByCompanyResponse getBrandsByCompany(String q ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.BrandsByCompanyResponse> response = null;
            try {
                response = configurationPlatformApiList.getBrandsByCompany(this.companyId ,q ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.CompanyByBrandsResponse getCompanyByBrands(Integer pageNo , Integer pageSize ,ConfigurationPlatformModels.CompanyByBrandsRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.CompanyByBrandsResponse> response = null;
            try {
                response = configurationPlatformApiList.getCompanyByBrands(this.companyId ,pageNo , pageSize , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCompanyByBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.CompanyByBrandsResponse> getCompanyByBrandsPagination(
        Integer pageSize ,
        
        ConfigurationPlatformModels.CompanyByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.CompanyByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.CompanyByBrandsResponse callback = this.getCompanyByBrands(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.StoreByBrandsResponse getStoreByBrands(Integer pageNo , Integer pageSize ,ConfigurationPlatformModels.StoreByBrandsRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.StoreByBrandsResponse> response = null;
            try {
                response = configurationPlatformApiList.getStoreByBrands(this.companyId ,pageNo , pageSize , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStoreByBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.StoreByBrandsResponse> getStoreByBrandsPagination(
        Integer pageSize ,
        
        ConfigurationPlatformModels.StoreByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.StoreByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.StoreByBrandsResponse callback = this.getStoreByBrands(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.OtherSellerApplications getOtherSellerApplications(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.OtherSellerApplications> response = null;
            try {
                response = configurationPlatformApiList.getOtherSellerApplications(this.companyId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOtherSellerApplications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.OtherSellerApplications> getOtherSellerApplicationsPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.OtherSellerApplications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.OtherSellerApplications callback = this.getOtherSellerApplications(
                
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.OptedApplicationResponse getOtherSellerApplicationById(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.OptedApplicationResponse> response = null;
            try {
                response = configurationPlatformApiList.getOtherSellerApplicationById(this.companyId , id  ).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.SuccessMessageResponse optOutFromApplication(String id ,ConfigurationPlatformModels.OptOutInventory body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.SuccessMessageResponse> response = null;
            try {
                response = configurationPlatformApiList.optOutFromApplication(this.companyId , id  , body).execute();
                if (!response.isSuccessful()) {
                    throw new FDKException(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.MobileAppConfiguration getBuildConfig(String platformType ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.MobileAppConfiguration> response = null;
            try {
            response = configurationPlatformApiList.getBuildConfig(this.companyId , this.applicationId , platformType ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.MobileAppConfiguration updateBuildConfig(String platformType ,ConfigurationPlatformModels.MobileAppConfigRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.MobileAppConfiguration> response = null;
            try {
            response = configurationPlatformApiList.updateBuildConfig(this.companyId , this.applicationId , platformType , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.BuildVersionHistory getPreviousVersions(String platformType ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.BuildVersionHistory> response = null;
            try {
            response = configurationPlatformApiList.getPreviousVersions(this.companyId , this.applicationId , platformType ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.AppFeatureResponse getAppFeatures() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.AppFeatureResponse> response = null;
            try {
            response = configurationPlatformApiList.getAppFeatures(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.AppFeature updateAppFeatures(ConfigurationPlatformModels.AppFeatureRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.AppFeature> response = null;
            try {
            response = configurationPlatformApiList.updateAppFeatures(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationDetail getAppBasicDetails() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationDetail> response = null;
            try {
            response = configurationPlatformApiList.getAppBasicDetails(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationDetail updateAppBasicDetails(ConfigurationPlatformModels.ApplicationDetail body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationDetail> response = null;
            try {
            response = configurationPlatformApiList.updateAppBasicDetails(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationInformation getAppContactInfo() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationInformation> response = null;
            try {
            response = configurationPlatformApiList.getAppContactInfo(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationInformation updateAppContactInfo(ConfigurationPlatformModels.ApplicationInformation body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationInformation> response = null;
            try {
            response = configurationPlatformApiList.updateAppContactInfo(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.TokenResponse getAppApiTokens() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.TokenResponse> response = null;
            try {
            response = configurationPlatformApiList.getAppApiTokens(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.TokenResponse updateAppApiTokens(ConfigurationPlatformModels.TokenResponse body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.TokenResponse> response = null;
            try {
            response = configurationPlatformApiList.updateAppApiTokens(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.CompaniesResponse getAppCompanies(Integer uid , Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.CompaniesResponse> response = null;
            try {
            response = configurationPlatformApiList.getAppCompanies(this.companyId , this.applicationId ,uid , pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppCompanies
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.CompaniesResponse> getAppCompaniesPagination(
        Integer uid,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.CompaniesResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.CompaniesResponse callback = this.getAppCompanies(
                
                 
                 
                 uid,
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.StoresResponse getAppStores(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.StoresResponse> response = null;
            try {
            response = configurationPlatformApiList.getAppStores(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.StoresResponse> getAppStoresPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.StoresResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.StoresResponse callback = this.getAppStores(
                
                 
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationInventory getInventoryConfig() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationInventory> response = null;
            try {
            response = configurationPlatformApiList.getInventoryConfig(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationInventory updateInventoryConfig(ConfigurationPlatformModels.ApplicationInventory body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationInventory> response = null;
            try {
            response = configurationPlatformApiList.updateInventoryConfig(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.ApplicationInventory partiallyUpdateInventoryConfig(ConfigurationPlatformModels.AppInventoryPartialUpdate body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.ApplicationInventory> response = null;
            try {
            response = configurationPlatformApiList.partiallyUpdateInventoryConfig(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.AppSupportedCurrency getAppCurrencyConfig() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.AppSupportedCurrency> response = null;
            try {
            response = configurationPlatformApiList.getAppCurrencyConfig(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.AppSupportedCurrency updateAppCurrencyConfig(ConfigurationPlatformModels.AppSupportedCurrency body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.AppSupportedCurrency> response = null;
            try {
            response = configurationPlatformApiList.updateAppCurrencyConfig(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.AppCurrencyResponse getAppSupportedCurrency() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.AppCurrencyResponse> response = null;
            try {
            response = configurationPlatformApiList.getAppSupportedCurrency(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.OrderingStores getOrderingStoresByFilter(Integer pageNo , Integer pageSize ,ConfigurationPlatformModels.FilterOrderingStoreRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.OrderingStores> response = null;
            try {
            response = configurationPlatformApiList.getOrderingStoresByFilter(this.companyId , this.applicationId ,pageNo , pageSize , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrderingStoresByFilter
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.OrderingStores> getOrderingStoresByFilterPagination(
        Integer pageSize,
        
        ConfigurationPlatformModels.FilterOrderingStoreRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.OrderingStores callback = this.getOrderingStoresByFilter(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.DeploymentMeta updateOrderingStoreConfig(ConfigurationPlatformModels.OrderingStoreConfig body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.DeploymentMeta> response = null;
            try {
            response = configurationPlatformApiList.updateOrderingStoreConfig(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.OrderingStoresResponse getStaffOrderingStores(Integer pageNo , Integer pageSize , String q ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.OrderingStoresResponse> response = null;
            try {
            response = configurationPlatformApiList.getStaffOrderingStores(this.companyId , this.applicationId ,pageNo , pageSize , q ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStaffOrderingStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ConfigurationPlatformModels.OrderingStoresResponse> getStaffOrderingStoresPagination(
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ConfigurationPlatformModels.OrderingStoresResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ConfigurationPlatformModels.OrderingStoresResponse callback = this.getStaffOrderingStores(
                
                 
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.DomainsResponse getDomains() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.DomainsResponse> response = null;
            try {
            response = configurationPlatformApiList.getDomains(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.Domain addDomain(ConfigurationPlatformModels.DomainAddRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.Domain> response = null;
            try {
            response = configurationPlatformApiList.addDomain(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.SuccessMessageResponse removeDomainById(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.SuccessMessageResponse> response = null;
            try {
            response = configurationPlatformApiList.removeDomainById(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.DomainsResponse changeDomainType(ConfigurationPlatformModels.UpdateDomainTypeRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.DomainsResponse> response = null;
            try {
            response = configurationPlatformApiList.changeDomainType(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.DomainStatusResponse getDomainStatus(ConfigurationPlatformModels.DomainStatusRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.DomainStatusResponse> response = null;
            try {
            response = configurationPlatformApiList.getDomainStatus(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ConfigurationPlatformModels.Application getApplicationById() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ConfigurationPlatformModels.Application> response = null;
            try {
            response = configurationPlatformApiList.getApplicationById(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
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