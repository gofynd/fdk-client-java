package com.sdk.platform.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ThemePlatformApiList {

    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AllAvailablePageSchema> getAllPages(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AvailablePageSchema> createPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Body ThemePlatformModels.AvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AllAvailablePageSchema> updateMultiplePages(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Body ThemePlatformModels.AllAvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePlatformModels.AvailablePageSchema> getPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePlatformModels.AvailablePageSchema> deletePage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}/{socket_id}")
    Call<ThemePlatformModels.AvailablePageSchema> updatePage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @Path("socket_id") String socketId, @Body ThemePlatformModels.AvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    Call<ThemePlatformModels.FontsSchema> getFonts(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    Call<List<ThemePlatformModels.CompanyThemeSchema>> getCompanyLevelThemes(@Path("company_id") String companyId, @Query("search_text") String searchText, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/private_themes")
    Call<List<ThemePlatformModels.CompanyPrivateTheme>> getCompanyLevelPrivateThemes(@Path("company_id") String companyId, @Query("search_text") String searchText, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    Call<ThemePlatformModels.CompanyThemeSchema> addMarketplaceThemeToCompany(@Path("company_id") String companyId, @Body ThemePlatformModels.ThemeReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    Call<ThemePlatformModels.CompanyThemeSchema> deleteCompanyTheme(@Path("company_id") String companyId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    Call<List<ThemePlatformModels.ThemesSchema>> getApplicationThemes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    Call<Object> getApplicationThemesCount(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> getThemeById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> updateTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Body ThemePlatformModels.UpdateThemeRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> deleteTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/")
    Call<ThemePlatformModels.ThemesSchema> addThemeToApplication(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ThemePlatformModels.ThemeReq payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    Call<ThemePlatformModels.ThemesSchema> updateThemeName(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Body ThemePlatformModels.UpdateThemeNameRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    Call<ThemePlatformModels.ThemesSchema> applyTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    Call<ThemePlatformModels.ThemesSchema> duplicateTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    Call<ThemePlatformModels.ThemesSchema> getAppliedTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    Call<ThemePlatformModels.ThemesSchema> getThemeForPreview(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @HEAD ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    Call<Object> getThemeLastModified(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    Call<ThemePlatformModels.ThemeUpgradable> isUpgradable(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    Call<ThemePlatformModels.ThemesSchema> upgradeTheme(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/extension-section")
    Call<List<ThemePlatformModels.GetExtensionSectionRes>> getExtensionSections(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("type") String type, @Query("company_mode") String companyMode, @HeaderMap Map<String, String> requestHeaders);
}