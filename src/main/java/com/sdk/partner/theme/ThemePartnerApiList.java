


package com.sdk.partner.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ThemePartnerApiList {
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AllAvailablePageSchema> getAllPages(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId );
    
    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AvailablePageSchema> createPage(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId ,@Body ThemePartnerModels.AvailablePageSchema payload);
    
    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<ThemePartnerModels.AllAvailablePageSchema> updateMultiplePages(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId ,@Body ThemePartnerModels.AllAvailablePageSchema payload);
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> getPage(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue , @Path("organization_id") String organizationId );
    
    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> updatePage(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue , @Path("organization_id") String organizationId ,@Body ThemePartnerModels.AvailablePageSchema payload);
    
    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<ThemePartnerModels.AvailablePageSchema> deletePage(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue , @Path("organization_id") String organizationId );
    
    @GET ("/service/partner/theme/v2.0/organization/{organization_id}/company/{company_id}/application/{application_id}/themes")
    Call<List<ThemePartnerModels.ThemesSchema>> getApplicationThemes(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("organization_id") String organizationId );
    
    @GET ("/service/partner/theme/v2.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> getThemeById(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId );
    
    @PUT ("/service/partner/theme/v2.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> updateTheme(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId ,@Body ThemePartnerModels.UpdateThemeRequestBody payload);
    
    @DELETE ("/service/partner/theme/v2.0/organization/{organization_id}/company/{company_id}/application/{application_id}/{theme_id}")
    Call<ThemePartnerModels.ThemesSchema> deleteTheme(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("organization_id") String organizationId );
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/themes")
    Call<ThemePartnerModels.MarketplaceThemeSchema> getOrganizationThemes(@Path("organization_id") String organizationId , @Query("status") String status , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> getOrganizationThemeDetails(@Path("organization_id") String organizationId , @Path("theme_id") String themeId );
    
    @PATCH ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> updateDraftTheme(@Path("organization_id") String organizationId , @Path("theme_id") String themeId ,@Body ThemePartnerModels.MarketplaceTheme payload);
    
    @PUT ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> submitOrganizationTheme(@Path("organization_id") String organizationId , @Path("theme_id") String themeId ,@Body ThemePartnerModels.MarketplaceTheme payload);
    
    @DELETE ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}")
    Call<ThemePartnerModels.MarketplaceTheme> deleteOrganizationTheme(@Path("organization_id") String organizationId , @Path("theme_id") String themeId );
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/{slug_name}/latest")
    Call<List<ThemePartnerModels.MarketplaceTheme>> getLatestVersionOfThemeBySlug(@Path("organization_id") String organizationId , @Path("slug_name") String slugName );
    
    @POST ("/service/partner/theme/v1.0/organization/{organization_id}/theme")
    Call<ThemePartnerModels.MarketplaceTheme> createNewThemeInOrganization(@Path("organization_id") String organizationId , @Query("slug") String slug ,@Body ThemePartnerModels.MarketplaceTheme payload);
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_id}/reasons")
    Call<ThemePartnerModels.ThemeRejectionReasons> getThemeRejectionReasons(@Path("organization_id") String organizationId , @Path("theme_id") String themeId );
    
    @GET ("/service/partner/theme/v1.0/organization/{organization_id}/theme/{theme_slug}/versions")
    Call<ThemePartnerModels.MarketplaceThemeSchema> getThemeVersions(@Path("organization_id") String organizationId , @Path("theme_slug") String themeSlug , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
}
