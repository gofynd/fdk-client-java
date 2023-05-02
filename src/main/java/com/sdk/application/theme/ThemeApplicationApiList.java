package com.sdk.application.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ThemeApplicationApiList {
    
    
    @GET 
    Call<ThemeApplicationModels.AllAvailablePageSchema> getAllPages(@Url String url1);
    
    @GET 
    Call<ThemeApplicationModels.AvailablePageSchema> getPage(@Url String url1);
    
    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getAppliedTheme(@Url String url1);
    
    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getThemeForPreview(@Url String url1);
    
    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getAppliedThemeV2(@Url String url1);
    
    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getThemeForPreviewV2(@Url String url1);
}