

package com.sdk.panel.theme;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.panel.*;
import com.sdk.common.*;


@Getter
public class ThemePanelService {
    private PanelConfig panelConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ThemePanelApiList themePanelApiList;

    public ThemePanelService(PanelConfig panelConfig) {
        this.panelConfig = panelConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.themePanelApiList = generateThemePanelApiList(this.panelConfig.getPersistentCookieStore());
    }

    private ThemePanelApiList generateThemePanelApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PanelHeaderInterceptor(panelConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(panelConfig.getDomain(),ThemePanelApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public ThemePanelModels.MarketplaceThemeResponseBody getMarketplaceThemes(Integer pageSize , Integer pageNo ) throws IOException {
    
        Response<ThemePanelModels.MarketplaceThemeResponseBody> response = themePanelApiList.getMarketplaceThemes(pageSize, pageNo).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePanelModels.ThemeSlugResponse getMarketplaceThemeBySlug(String slugName ) throws IOException {
    
        Response<ThemePanelModels.ThemeSlugResponse> response = themePanelApiList.getMarketplaceThemeBySlug(slugName).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemePanelModels.ThemeAndUserDetailsResponse getMarketplaceThemeVersions(String slugName ) throws IOException {
    
        Response<ThemePanelModels.ThemeAndUserDetailsResponse> response = themePanelApiList.getMarketplaceThemeVersions(slugName).execute();
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

