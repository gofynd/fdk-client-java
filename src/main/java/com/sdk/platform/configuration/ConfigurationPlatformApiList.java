package com.sdk.platform.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ConfigurationPlatformApiList {

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store/sis_enabled")
    Call<Object> toggleStoreInStoreFeature(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store")
    Call<ConfigurationPlatformModels.StoreInStoreResponseSchema> getAllStoreInStoreEntries(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store")
    Call<ConfigurationPlatformModels.CreateStoreInStoreResponseSchema> createStoreInStoreEntry(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.CreateStoreInStoreRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store/{sis_id}")
    Call<ConfigurationPlatformModels.CreateStoreInStoreResponseSchema> getStoreInStoreEntry(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("sis_id") String sisId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store/{sis_id}")
    Call<ConfigurationPlatformModels.CreateStoreInStoreResponseSchema> updateStoreInStoreEntry(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("sis_id") String sisId, @Body ConfigurationPlatformModels.CreateStoreInStoreRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/store-in-store/{sis_id}")
    Call<Object> deleteStoreInStoreEntry(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("sis_id") String sisId, @HeaderMap Map<String, String> requestHeaders);

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

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/owner-application/{application_id}/configuration")
    Call<ConfigurationPlatformModels.OwnerAppConfig> getApplicationConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> getAppCurrencyConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> createAppCurrencyConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppSupportedCurrency payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<ConfigurationPlatformModels.AppSupportedCurrency> updateAppCurrencyConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppSupportedCurrency payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    Call<ConfigurationPlatformModels.AppCurrencyResponseSchema> getAppSupportedCurrency(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStoresByFilter(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.FilterOrderingStoreRequestSchemaSchema payload, @HeaderMap Map<String, String> requestHeaders);

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

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/{store_id}")
    Call<ConfigurationPlatformModels.OrderingStore> getStoreDetailById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.DomainsResponseSchema> getDomains(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.Domain> addDomain(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainAddRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{domain_id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> removeDomainById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("domain_id") String domainId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    Call<ConfigurationPlatformModels.DomainsResponseSchema> changeDomainType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UpdateDomainTypeRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    Call<ConfigurationPlatformModels.DomainStatusResponseSchema> getDomainStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainStatusRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.CreateAppResponseSchema> createApplication(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.CreateApplicationRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.ApplicationsResponseSchema> getApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.Application> getApplicationById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.Application> updateApplication(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.Application payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.CurrenciesResponseSchema> getCurrencies(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.Currency> createCurrency(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.Currency payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    Call<ConfigurationPlatformModels.Currency> getCurrency(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    Call<ConfigurationPlatformModels.Currency> updateCurrency(@Path("company_id") String companyId, @Path("id") String id, @Body ConfigurationPlatformModels.Currency payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponseSchema> getDomainAvailibility(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.DomainSuggestionsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponseSchema> getApplicationDomainAvailibility(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainSuggestionsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    Call<ConfigurationPlatformModels.BrandsByCompanyResponseSchema> getBrandsByCompany(@Path("company_id") String companyId, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    Call<ConfigurationPlatformModels.CompanyByBrandsResponseSchema> getCompanyByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.CompanyByBrandsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/inventory/stores-by-brands")
    Call<ConfigurationPlatformModels.StoreByBrandsResponseSchema> getStoreByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.StoreByBrandsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    Call<ConfigurationPlatformModels.OtherSellerApplications> getOtherSellerApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}")
    Call<ConfigurationPlatformModels.OptedApplicationResponseSchema> getOtherSellerApplicationById(@Path("company_id") String companyId, @Path("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}/opt_out")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> optOutFromApplication(@Path("company_id") String companyId, @Path("app_id") String appId, @Body ConfigurationPlatformModels.OptOutInventory payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/version")
    Call<ConfigurationPlatformModels.PlatformVersion> updateApplicationVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.PlatformVersionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens")
    Call<ConfigurationPlatformModels.Application> createTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens/{token}")
    Call<ConfigurationPlatformModels.Application> deleteToken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/locations")
    Call<ConfigurationPlatformModels.Locations> getLocations(@Path("company_id") String companyId, @Query("location_type") String locationType, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    Call<ConfigurationPlatformModels.UrlRedirectionResponseSchema> getUrlRedirections(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    Call<ConfigurationPlatformModels.UrlRedirection> createUrlRedirection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UrlRedirectionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.UrlRedirection> getUrlRedirection(@Path("company_id") String companyId, @Path("redirection_domain_id") String redirectionDomainId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.UrlRedirection> updateUrlRedirection(@Path("redirection_domain_id") String redirectionDomainId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UrlRedirection payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponseSchema> deleteUrlRedirection(@Path("redirection_domain_id") String redirectionDomainId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/company/{company}")
    Call<ConfigurationPlatformModels.ListStoreResponseSchemaSchema> getStoresForACompany(@Path("company_id") String companyId, @Path("company") Integer company, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/domain/options")
    Call<ConfigurationPlatformModels.DomainOptionsResponseSchema> getDomainOptions(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/currency-exchange")
    Call<ConfigurationPlatformModels.CurrencyExchangeResponseV2> getCurrencyExchangeRates(@Path("company_id") String companyId, @Query("currency_code") String currencyCode, @Query("exchange_currency_code") String exchangeCurrencyCode, @Query("exchange_country_code") String exchangeCountryCode, @HeaderMap Map<String, String> requestHeaders);
}