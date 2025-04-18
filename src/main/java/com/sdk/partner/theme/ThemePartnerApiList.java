package com.sdk.partner.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ThemePartnerApiList {

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AllAvailablePageSchema> getAllPages(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AvailablePageSchema> createPage(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @Body ThemePartnerModels.AvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AllAvailablePageSchema> updateMultiplePages(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @Body ThemePartnerModels.AllAvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> getPage(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> updatePage(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @Path("organization_id") String organizationId, @Body ThemePartnerModels.AvailablePageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> deletePage(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("page_value") String pageValue, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/themes")
    Call<List<ThemePartnerModels.ThemesSchema>> getApplicationThemes(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> getThemeById(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> updateTheme(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @Body ThemePartnerModels.ThemesSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> deleteTheme(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("theme_id") String themeId, @Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/themes")
    Call<ThemePartnerModels.MarketplaceThemeSchema> getOrganizationThemes(@Path("organization_id") String organizationId, @Query("status") String status, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> getOrganizationThemeDetails(@Path("organization_id") String organizationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> updateDraftTheme(@Path("organization_id") String organizationId, @Path("theme_id") String themeId, @Body ThemePartnerModels.MarketplaceTheme payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> submitOrganizationTheme(@Path("organization_id") String organizationId, @Path("theme_id") String themeId, @Body ThemePartnerModels.MarketplaceTheme payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> deleteOrganizationTheme(@Path("organization_id") String organizationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/{slug_name}/latest")
    Call<List<ThemePartnerModels.MarketplaceTheme>> getLatestVersionOfThemeBySlug(@Path("organization_id") String organizationId, @Path("slug_name") String slugName, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/theme")
    Call<ThemePartnerModels.MarketplaceTheme> createNewThemeInOrganization(@Path("organization_id") String organizationId, @Query("slug") String slug, @Body ThemePartnerModels.MarketplaceTheme payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}/reasons")
    Call<ThemePartnerModels.ThemeRejectionReasons> getThemeRejectionReasons(@Path("organization_id") String organizationId, @Path("theme_id") String themeId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/extension-section/{extension_id}/draft")
    Call<ThemePartnerModels.DraftExtensionSectionResponse> createExtensionSectionDraft(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body ThemePartnerModels.ExtensionBinding payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/extension-section/{extension_id}/{bundle_name}")
    Call<ThemePartnerModels.ExtensionBinding> getExtensionbinding(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Path("bundle_name") String bundleName, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/extension-section/{extension_id}/publish")
    Call<ThemePartnerModels.PublishExtensionSectionResponse> publishExtensionSections(@Path("organization_id") String organizationId, @Path("extension_id") String extensionId, @Body ThemePartnerModels.PublishExtensionSectionRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/extension-section/{extension_section_id}/preview")
    Call<ThemePartnerModels.ExtensionPreviewResponse> applyExtensionPreview(@Path("organization_id") String organizationId, @Path("extension_section_id") String extensionSectionId, @Body ThemePartnerModels.ExtensionPreviewRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/extension-section/{extension_section_id}/preview")
    Call<ThemePartnerModels.ExtensionPreviewResponse> removeExtensionPreview(@Path("organization_id") String organizationId, @Path("extension_section_id") String extensionSectionId, @Body ThemePartnerModels.ExtensionPreviewRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_slug}/versions")
    Call<ThemePartnerModels.MarketplaceThemeSchema> getThemeVersions(@Path("organization_id") String organizationId, @Path("theme_slug") String themeSlug, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}")
    Call<ThemePartnerModels.ThemesSchema> createTheme(@Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("organization_id") String organizationId, @Body ThemePartnerModels.ThemesSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/default_theme")
    Call<ThemePartnerModels.MarketplaceTheme> getOrgnaizationDefaultTheme(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/page/{page_value}/system")
    Call<ThemePartnerModels.DefaultPageSchema> getSystemPage(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("application_id") String applicationId, @Path("page_value") String pageValue, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/applied-theme")
    Call<ThemePartnerModels.ThemesSchema> getAppliedTheme(@Path("organization_id") String organizationId, @Path("company_id") Integer companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);
}