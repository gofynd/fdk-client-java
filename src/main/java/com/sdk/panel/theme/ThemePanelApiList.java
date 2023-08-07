


package com.sdk.panel.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ThemePanelApiList {
    
    @GET ("/service/panel/theme/v1.0/marketplace/themes")
    Call<ThemePanelModels.MarketplaceThemeResponseBody> getMarketplaceThemes(@Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
    @GET ("/service/panel/theme/v1.0/marketplace/theme/{slug_name}")
    Call<ThemePanelModels.ThemeSlugResponse> getMarketplaceThemeBySlug(@Path("slug_name") String slugName );
    
    @GET ("/service/panel/theme/v1.0/marketplace/theme/{slug_name}/versions")
    Call<ThemePanelModels.ThemeAndUserDetailsResponse> getMarketplaceThemeVersions(@Path("slug_name") String slugName );
    
}
