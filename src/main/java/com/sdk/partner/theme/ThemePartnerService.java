

package com.sdk.partner.theme;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;
import com.sdk.common.*;


@Getter
public class ThemePartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ThemePartnerApiList themePartnerApiList;

    public ThemePartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.themePartnerApiList = generateThemePartnerApiList(this.partnerConfig.getPersistentCookieStore());
    }

    private ThemePartnerApiList generateThemePartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PartnerHeaderInterceptor(partnerConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(partnerConfig.getDomain(),ThemePartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public ThemePartnerModels.AllAvailablePageSchema getAllPages(Integer companyId , String applicationId , String themeId , String organizationId ) throws IOException {
    
        Response<ThemePartnerModels.AllAvailablePageSchema> response = themePartnerApiList.getAllPages(companyId, applicationId, themeId, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.AvailablePageSchema createPage(Integer companyId , String applicationId , String themeId , String organizationId ,ThemePartnerModels.AvailablePageSchema body) throws IOException {
    
        Response<ThemePartnerModels.AvailablePageSchema> response = themePartnerApiList.createPage(companyId, applicationId, themeId, organizationId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.AllAvailablePageSchema updateMultiplePages(Integer companyId , String applicationId , String themeId , String organizationId ,ThemePartnerModels.AllAvailablePageSchema body) throws IOException {
    
        Response<ThemePartnerModels.AllAvailablePageSchema> response = themePartnerApiList.updateMultiplePages(companyId, applicationId, themeId, organizationId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.AvailablePageSchema getPage(Integer companyId , String applicationId , String themeId , String pageValue , String organizationId ) throws IOException {
    
        Response<ThemePartnerModels.AvailablePageSchema> response = themePartnerApiList.getPage(companyId, applicationId, themeId, pageValue, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.AvailablePageSchema updatePage(Integer companyId , String applicationId , String themeId , String pageValue , String organizationId ,ThemePartnerModels.AvailablePageSchema body) throws IOException {
    
        Response<ThemePartnerModels.AvailablePageSchema> response = themePartnerApiList.updatePage(companyId, applicationId, themeId, pageValue, organizationId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.AvailablePageSchema deletePage(Integer companyId , String applicationId , String themeId , String pageValue , String organizationId ) throws IOException {
    
        Response<ThemePartnerModels.AvailablePageSchema> response = themePartnerApiList.deletePage(companyId, applicationId, themeId, pageValue, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public List<ThemePartnerModels.ThemesSchema> getApplicationThemes(Integer companyId , String applicationId , String organizationId ) throws IOException {
    
        Response<List<ThemePartnerModels.ThemesSchema>> response = themePartnerApiList.getApplicationThemes(companyId, applicationId, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.ThemesSchema getThemeById(Integer companyId , String applicationId , String themeId , String organizationId ) throws IOException {
    
        Response<ThemePartnerModels.ThemesSchema> response = themePartnerApiList.getThemeById(companyId, applicationId, themeId, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.ThemesSchema updateTheme(Integer companyId , String applicationId , String themeId , String organizationId ,ThemePartnerModels.UpdateThemeRequestBody body) throws IOException {
    
        Response<ThemePartnerModels.ThemesSchema> response = themePartnerApiList.updateTheme(companyId, applicationId, themeId, organizationId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.ThemesSchema deleteTheme(Integer companyId , String applicationId , String themeId , String organizationId ) throws IOException {
    
        Response<ThemePartnerModels.ThemesSchema> response = themePartnerApiList.deleteTheme(companyId, applicationId, themeId, organizationId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceThemeSchema getOrganizationThemes(String organizationId , String status , Integer pageSize , Integer pageNo ) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceThemeSchema> response = themePartnerApiList.getOrganizationThemes(organizationId, status, pageSize, pageNo).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceTheme getOrganizationThemeDetails(String organizationId , String themeId ) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceTheme> response = themePartnerApiList.getOrganizationThemeDetails(organizationId, themeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceTheme updateDraftTheme(String organizationId , String themeId ,ThemePartnerModels.MarketplaceTheme body) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceTheme> response = themePartnerApiList.updateDraftTheme(organizationId, themeId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceTheme submitOrganizationTheme(String organizationId , String themeId ,ThemePartnerModels.MarketplaceTheme body) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceTheme> response = themePartnerApiList.submitOrganizationTheme(organizationId, themeId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceTheme deleteOrganizationTheme(String organizationId , String themeId ) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceTheme> response = themePartnerApiList.deleteOrganizationTheme(organizationId, themeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public List<ThemePartnerModels.MarketplaceTheme> getLatestVersionOfThemeBySlug(String organizationId , String slugName ) throws IOException {
    
        Response<List<ThemePartnerModels.MarketplaceTheme>> response = themePartnerApiList.getLatestVersionOfThemeBySlug(organizationId, slugName).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceTheme createNewThemeInOrganization(String organizationId , String slug ,ThemePartnerModels.MarketplaceTheme body) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceTheme> response = themePartnerApiList.createNewThemeInOrganization(organizationId, slug, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.ThemeRejectionReasons getThemeRejectionReasons(String organizationId , String themeId ) throws IOException {
    
        Response<ThemePartnerModels.ThemeRejectionReasons> response = themePartnerApiList.getThemeRejectionReasons(organizationId, themeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePartnerModels.MarketplaceThemeSchema getThemeVersions(String organizationId , String themeSlug , Integer pageSize , Integer pageNo ) throws IOException {
    
        Response<ThemePartnerModels.MarketplaceThemeSchema> response = themePartnerApiList.getThemeVersions(organizationId, themeSlug, pageSize, pageNo).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}

