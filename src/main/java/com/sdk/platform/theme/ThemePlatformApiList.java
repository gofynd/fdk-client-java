package com.sdk.platform.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ThemePlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AllAvailablePageSchema> getAllPages(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AvailablePageSchema> createPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.AvailablePageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePlatformModels.AllAvailablePageSchema> updateMultiplePages(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.AllAvailablePageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePlatformModels.AvailablePageSchema> getPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId , @Path("page_value") String  pageValue );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePlatformModels.AvailablePageSchema> updatePage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId , @Path("page_value") String  pageValue ,@Body ThemePlatformModels.AvailablePageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePlatformModels.AvailablePageSchema> deletePage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId , @Path("page_value") String  pageValue );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<ThemePlatformModels.DummyResponse> getThemeLibrary(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<ThemePlatformModels.DummyResponse> addToThemeLibrary(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.AddThemeRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    Call<ThemePlatformModels.DummyResponse> getPublicThemes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    Call<ThemePlatformModels.FontsSchema> getFonts(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    Call<ThemePlatformModels.DummyResponse> publishTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    Call<ThemePlatformModels.DummyResponse> unpublishTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    Call<ThemePlatformModels.DummyResponse> archiveTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    Call<ThemePlatformModels.DummyResponse> unarchiveTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    Call<List<ThemePlatformModels.CompanyThemeSchema>> getCompanyLevelThemes(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    Call<ThemePlatformModels.CompanyThemeSchema> addMarketplaceThemeToCompany(@Path("company_id")  String companyId ,@Body ThemePlatformModels.ThemeReq payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    Call<ThemePlatformModels.CompanyThemeSchema> deleteCompanyTheme(@Path("company_id")  String companyId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    Call<List<ThemePlatformModels.ThemesSchema>> getApplicationThemes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    Call<Object> getApplicationThemesCount(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> getThemeById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> updateTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.UpdateThemeRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> deleteTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/")
    Call<ThemePlatformModels.ThemesSchema> addThemeToApplication(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.CompanyThemeSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    Call<ThemePlatformModels.ThemesSchema> updateThemeName(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.UpdateThemeNameRequestBody payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    Call<ThemePlatformModels.ThemesSchema> applyTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    Call<ThemePlatformModels.ThemesSchema> duplicateTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    Call<ThemePlatformModels.ThemesSchema> getAppliedTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    Call<ThemePlatformModels.ThemesSchema> getThemeForPreview(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @HEAD ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    Call<Object> getThemeLastModified(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    Call<ThemePlatformModels.ThemeUpgradableResponse> isUpgradable(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    Call<ThemePlatformModels.ThemesSchema> upgradeTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
}