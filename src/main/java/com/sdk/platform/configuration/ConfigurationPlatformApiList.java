package com.sdk.platform.configuration;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ConfigurationPlatformApiList {

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeatureResponse> getAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeature> updateAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppFeatureRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<ConfigurationPlatformModels.AppFeature> modifyAppFeatures(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.AppFeatureRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> getAppBasicDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<ConfigurationPlatformModels.ApplicationDetail> updateAppBasicDetails(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.ApplicationDetail payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> getAppContactInfo(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<ConfigurationPlatformModels.ApplicationInformation> updateAppContactInfo(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.ApplicationInformation payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponse> getAppApiTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<ConfigurationPlatformModels.TokenResponse> updateAppApiTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.TokenResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    Call<ConfigurationPlatformModels.CompaniesResponse> getAppCompanies(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("uid") Integer uid, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    Call<ConfigurationPlatformModels.StoresResponse> getAppStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

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
    Call<ConfigurationPlatformModels.AppCurrencyResponse> getAppSupportedCurrency(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStoresByFilter(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.FilterOrderingStoreRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<ConfigurationPlatformModels.DeploymentMeta> updateOrderingStoreConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.OrderingStoreConfig payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<ConfigurationPlatformModels.OrderingStoreConfig> getOrderingStoreConfig(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    Call<ConfigurationPlatformModels.OrderingStoresResponse> getStaffOrderingStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> getOrderingStoreCookie(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.OrderingStoreSelectRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/select")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> removeOrderingStoreCookie(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores/{store_id}")
    Call<ConfigurationPlatformModels.OrderingStore> getStoreDetailById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("store_id") Integer storeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/application/{application_id}/ordering-store/stores")
    Call<ConfigurationPlatformModels.OrderingStores> getOrderingStores(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.DomainsResponse> getDomains(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<ConfigurationPlatformModels.Domain> addDomain(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainAddRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{domain_id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> removeDomainById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("domain_id") String domainId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    Call<ConfigurationPlatformModels.DomainsResponse> changeDomainType(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UpdateDomainTypeRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    Call<ConfigurationPlatformModels.DomainStatusResponse> getDomainStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainStatusRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.CreateAppResponse> createApplication(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.CreateApplicationRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<ConfigurationPlatformModels.ApplicationsResponse> getApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.Application> getApplicationById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<ConfigurationPlatformModels.Application> updateApplication(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.Application payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.CurrenciesResponse> getCurrencies(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<ConfigurationPlatformModels.Currency> createCurrency(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.Currency payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    Call<ConfigurationPlatformModels.Currency> getCurrency(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/currencies/{id}")
    Call<ConfigurationPlatformModels.Currency> updateCurrency(@Path("company_id") String companyId, @Path("id") String id, @Body ConfigurationPlatformModels.Currency payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponse> getDomainAvailibility(@Path("company_id") String companyId, @Body ConfigurationPlatformModels.DomainSuggestionsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/suggestions")
    Call<ConfigurationPlatformModels.DomainSuggestionsResponse> getApplicationDomainAvailibility(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.DomainSuggestionsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    Call<ConfigurationPlatformModels.BrandsByCompanyResponse> getBrandsByCompany(@Path("company_id") String companyId, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    Call<ConfigurationPlatformModels.CompanyByBrandsResponse> getCompanyByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.CompanyByBrandsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v2.0/company/{company_id}/inventory/stores-by-brands")
    Call<ConfigurationPlatformModels.StoreByBrandsResponse> getStoreByBrands(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Body ConfigurationPlatformModels.StoreByBrandsRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications")
    Call<ConfigurationPlatformModels.OtherSellerApplications> getOtherSellerApplications(@Path("company_id") String companyId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}")
    Call<ConfigurationPlatformModels.OptedApplicationResponse> getOtherSellerApplicationById(@Path("company_id") String companyId, @Path("app_id") String appId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{app_id}/opt_out")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> optOutFromApplication(@Path("company_id") String companyId, @Path("app_id") String appId, @Body ConfigurationPlatformModels.OptOutInventory payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/version")
    Call<ConfigurationPlatformModels.PlatformVersion> updateApplicationVersion(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.PlatformVersionRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens")
    Call<ConfigurationPlatformModels.Application> createTokens(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/tokens/{token}")
    Call<ConfigurationPlatformModels.Application> deleteToken(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("token") String token, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/locations")
    Call<ConfigurationPlatformModels.Locations> getLocations(@Path("company_id") String companyId, @Query("location_type") String locationType, @Query("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    Call<ConfigurationPlatformModels.UrlRedirectionResponse> getUrlRedirections(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection")
    Call<ConfigurationPlatformModels.UrlRedirection> createUrlRedirection(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UrlRedirectionRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.UrlRedirection> getUrlRedirection(@Path("company_id") String companyId, @Path("redirection_domain_id") String redirectionDomainId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.UrlRedirection> updateUrlRedirection(@Path("redirection_domain_id") String redirectionDomainId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ConfigurationPlatformModels.UrlRedirection payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/url-redirection/{redirection_domain_id}")
    Call<ConfigurationPlatformModels.SuccessMessageResponse> deleteUrlRedirection(@Path("redirection_domain_id") String redirectionDomainId, @Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/company/{company}")
    Call<ConfigurationPlatformModels.ListStoreResponse> getStoresForACompany(@Path("company_id") String companyId, @Path("company") Integer company, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/configuration/v2.0/company/{company_id}/domain/options")
    Call<ConfigurationPlatformModels.DomainOptionsResponse> getDomainOptions(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);
}