package com.sdk.platform.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ConfigurationPlatformApiList {

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<ConfigurationPlatformModels.MobileAppConfiguration> getBuildConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("platform_type") String platformType, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<ConfigurationPlatformModels.MobileAppConfiguration> updateBuildConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("platform_type") String platformType, @Body ConfigurationPlatformModels.MobileAppConfigRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    Call<ConfigurationPlatformModels.BuildVersionHistory> getPreviousVersions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("platform_type") String platformType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeatureResponseSchema> getAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeature> updateAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppFeatureRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeature> modifyAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppFeatureRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> getAppBasicDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> updateAppBasicDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.ApplicationDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> getAppContactInfo(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> updateAppContactInfo(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.ApplicationInformation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponseSchema> getAppApiTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponseSchema> updateAppApiTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.TokenResponseSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    Call<ConfigurationPlatformModels.CompaniesResponseSchema> getAppCompanies(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("uid") Integer uid, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    Call<ConfigurationPlatformModels.StoresResponseSchema> getAppStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> getInventoryConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> updateInventoryConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.ApplicationInventory payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.ApplicationInventory> partiallyUpdateInventoryConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppInventoryPartialUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> getAppCurrencyConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> updateAppCurrencyConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppSupportedCurrency payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    Call<ConfigurationPlatformModels.AppCurrencyResponseSchema> getAppSupportedCurrency(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStoresByFilter(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.FilterOrderingStoreRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<ConfigurationPlatformModels.DeploymentMeta> updateOrderingStoreConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.OrderingStoreConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<ConfigurationPlatformModels.OrderingStoreConfig> getOrderingStoreConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    Call<ConfigurationPlatformModels.OrderingStoresResponseSchema> getStaffOrderingStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> getOrderingStoreCookie(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.OrderingStoreSelectRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> removeOrderingStoreCookie(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.DomainsResponseSchema> getDomains(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.Domain> addDomain(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainAddRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> removeDomainById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    Call<ConfigurationPlatformModels.DomainsResponseSchema> changeDomainType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UpdateDomainTypeRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    Call<ConfigurationPlatformModels.DomainStatusResponseSchema> getDomainStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainStatusRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.CreateAppResponseSchema> createApplication(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.CreateApplicationRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.ApplicationsResponseSchema> getApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.ApplicationById> getApplicationById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.CurrenciesResponseSchema> getCurrencies(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponseSchema> getDomainAvailibility(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.DomainSuggestionsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    Call<ConfigurationPlatformModels.BrandsByCompanyResponseSchema> getBrandsByCompany(@Path("company_id") String companyId, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    Call<ConfigurationPlatformModels.CompanyByBrandsResponseSchema> getCompanyByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.CompanyByBrandsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/inventory/stores-by-brands")
    Call<ConfigurationPlatformModels.StoreByBrandsResponseSchema> getStoreByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.StoreByBrandsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    Call<ConfigurationPlatformModels.OtherSellerApplications> getOtherSellerApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    Call<ConfigurationPlatformModels.OptedApplicationResponseSchema> getOtherSellerApplicationById(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> optOutFromApplication(@Path("company_id") String companyId, @Path("id") String id, @Body ConfigurationPlatformModels.OptOutInventory payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/currency-exchange")
    Call<ConfigurationPlatformModels.CurrencyExchangeResponseV2> getCurrencyExchangeRates(@Path("company_id") String companyId, @Query("currency_code") String currencyCode, @Query("exchange_currency_code") String exchangeCurrencyCode, @Query("exchange_country_code") String exchangeCountryCode, @HeaderMap Map<String, String> requestHeaders);
}