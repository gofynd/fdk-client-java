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
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/page/{page_value}/default")
    Call<ThemePlatformModels.AvailablePageSchema> getDefaultPageDetails(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("page_value") String  pageValue );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<ThemePlatformModels.ThemesListingResponseSchema> getThemeLibrary(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<ThemePlatformModels.ThemesSchema> addToThemeLibrary(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.AddThemeRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/apply")
    Call<ThemePlatformModels.ThemesSchema> applyTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.AddThemeRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    Call<ThemePlatformModels.UpgradableThemeSchema> isUpgradable(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    Call<ThemePlatformModels.ThemesSchema> upgradeTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    Call<ThemePlatformModels.ThemesListingResponseSchema> getPublicThemes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    Call<ThemePlatformModels.ThemesSchema> createTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.ThemesSchema payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    Call<ThemePlatformModels.ThemesSchema> getAppliedTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    Call<ThemePlatformModels.FontsSchema> getFonts(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> getThemeById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> updateTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.ThemesSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.ThemesSchema> deleteTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    Call<ThemePlatformModels.ThemesSchema> getThemeForPreview(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    Call<ThemePlatformModels.ThemesSchema> publishTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    Call<ThemePlatformModels.ThemesSchema> unpublishTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    Call<ThemePlatformModels.ThemesSchema> archiveTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    Call<ThemePlatformModels.ThemesSchema> unarchiveTheme(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @HEAD ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    Call<Object> getThemeLastModified(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/themes")
    Call<List<ThemePlatformModels.ThemeSchema>> getCompanyLevelThemes(@Path("company_id")  String companyId );
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}")
    Call<ThemePlatformModels.ThemeSchema> addMarketplaceThemeToCompany(@Path("company_id")  String companyId ,@Body ThemePlatformModels.ThemeReq payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/{theme_id}")
    Call<ThemePlatformModels.ThemeSchema> deleteCompanyTheme(@Path("company_id")  String companyId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/themes")
    Call<List<ThemePlatformModels.AllThemesApplicationResponseV2>> getApplicationThemesV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/fonts")
    Call<ThemePlatformModels.FontsSchema> getFontsV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/application_themes_count")
    Call<Object> getApplicationThemesCountV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> getApplicationThemeByIdV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> updateThemeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.UpdateThemeRequestBodyV2 payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> deleteThemeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    Call<ThemePlatformModels.ApplyThemeResponseV2> addThemeToApplicationV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ThemePlatformModels.ApplyThemeRequestV2 payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}")
    Call<ThemePlatformModels.ApplyThemeResponseV2> getAppliedThemeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/name")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> updateThemeNameV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId ,@Body ThemePlatformModels.UpdateThemeNameRequestBodyV2 payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/apply")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> applyThemeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/duplicate")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> duplicateThemeV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> getThemePreviewByIdV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @HEAD ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/polling")
    Call<Object> getThemeLastModifiedV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    Call<ThemePlatformModels.ThemeUpgradableResponseV2> checkThemeUpgradableV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/theme/v2.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    Call<ThemePlatformModels.AllThemesApplicationResponseV2> upgradeApplicationV2(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("theme_id") String  themeId );
    
}