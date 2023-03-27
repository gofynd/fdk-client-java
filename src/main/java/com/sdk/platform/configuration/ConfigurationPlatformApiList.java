package com.sdk.platform.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ConfigurationPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<ConfigurationPlatformModels.MobileAppConfiguration> getBuildConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("platform_type") String  platformType );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<ConfigurationPlatformModels.MobileAppConfiguration> updateBuildConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("platform_type") String  platformType ,@Body ConfigurationPlatformModels.MobileAppConfigRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    Call<ConfigurationPlatformModels.BuildVersionHistory> getPreviousVersions(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("platform_type") String  platformType );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeatureResponse> getAppFeatures(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeature> updateAppFeatures(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.AppFeatureRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> getAppBasicDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> updateAppBasicDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.ApplicationDetail payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> getAppContactInfo(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> updateAppContactInfo(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.ApplicationInformation payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponse> getAppApiTokens(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponse> updateAppApiTokens(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.TokenResponse payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    Call<ConfigurationPlatformModels.CompaniesResponse> getAppCompanies(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("uid") Integer  uid ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    Call<ConfigurationPlatformModels.StoresResponse> getAppStores(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> getInventoryConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> updateInventoryConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.ApplicationInventory payload);
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> partiallyUpdateInventoryConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.AppInventoryPartialUpdate payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> getAppCurrencyConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> updateAppCurrencyConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.AppSupportedCurrency payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    Call<ConfigurationPlatformModels.AppCurrencyResponse> getAppSupportedCurrency(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStoresByFilter(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,@Body ConfigurationPlatformModels.FilterOrderingStoreRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<ConfigurationPlatformModels.DeploymentMeta> updateOrderingStoreConfig(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.OrderingStoreConfig payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    Call<ConfigurationPlatformModels.OrderingStoresResponse> getStaffOrderingStores(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.DomainsResponse> getDomains(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.Domain> addDomain(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.DomainAddRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> removeDomainById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    Call<ConfigurationPlatformModels.DomainsResponse> changeDomainType(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.UpdateDomainTypeRequest payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    Call<ConfigurationPlatformModels.DomainStatusResponse> getDomainStatus(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ConfigurationPlatformModels.DomainStatusRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.CreateAppResponse> createApplication(@Path("company_id")  String companyId ,@Body ConfigurationPlatformModels.CreateApplicationRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.ApplicationsResponse> getApplications(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,  @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.Application> getApplicationById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.CurrenciesResponse> getCurrencies(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponse> getDomainAvailibility(@Path("company_id")  String companyId ,@Body ConfigurationPlatformModels.DomainSuggestionsRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration/{id}")
    Call<ConfigurationPlatformModels.Integration> getIntegrationById(@Path("company_id")  String companyId , @Path("id") Integer  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/available")
    Call<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> getAvailableOptIns(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/selected/{level}/{uid}")
    Call<ConfigurationPlatformModels.GetIntegrationsOptInsResponse> getSelectedOptIns(@Path("company_id")  String companyId , @Path("level") String  level , @Path("uid") Integer  uid , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    Call<ConfigurationPlatformModels.IntegrationConfigResponse> getIntegrationLevelConfig(@Path("company_id")  String companyId , @Path("id") String  id , @Path("level") String  level , @Query("opted") Boolean  opted ,  @Query("check_permission") Boolean  checkPermission );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    Call<ConfigurationPlatformModels.IntegrationLevel> updateLevelIntegration(@Path("company_id")  String companyId , @Path("id") String  id , @Path("level") String  level ,@Body ConfigurationPlatformModels.UpdateIntegrationLevelRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    Call<ConfigurationPlatformModels.IntegrationLevel> getIntegrationByLevelId(@Path("company_id")  String companyId , @Path("id") String  id , @Path("level") String  level , @Path("uid") Integer  uid );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    Call<ConfigurationPlatformModels.IntegrationLevel> updateLevelUidIntegration(@Path("company_id")  String companyId , @Path("id") String  id , @Path("level") String  level , @Path("uid") Integer  uid ,@Body ConfigurationPlatformModels.IntegrationLevel payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    Call<ConfigurationPlatformModels.OptedStoreIntegration> getLevelActiveIntegrations(@Path("company_id")  String companyId , @Path("id") String  id , @Path("level") String  level , @Path("uid") Integer  uid , @Query("permission") String  permission );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    Call<ConfigurationPlatformModels.BrandsByCompanyResponse> getBrandsByCompany(@Path("company_id")  String companyId , @Query("q") String  q );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    Call<ConfigurationPlatformModels.CompanyByBrandsResponse> getCompanyByBrands(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,@Body ConfigurationPlatformModels.CompanyByBrandsRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/stores-by-brands")
    Call<ConfigurationPlatformModels.StoreByBrandsResponse> getStoreByBrands(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize ,@Body ConfigurationPlatformModels.StoreByBrandsRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/")
    Call<ConfigurationPlatformModels.OtherSellerApplications> getOtherSellerApplications(@Path("company_id")  String companyId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    Call<ConfigurationPlatformModels.OptedApplicationResponse> getOtherSellerApplicationById(@Path("company_id")  String companyId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> optOutFromApplication(@Path("company_id")  String companyId , @Path("id") String  id ,@Body ConfigurationPlatformModels.OptOutInventory payload);
    
}