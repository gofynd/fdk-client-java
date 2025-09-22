package com.sdk.application.theme;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ThemeApplicationApiList {

    @GET 
    Call<ThemeApplicationModels.AllAvailablePageSchema> getAllPages(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ThemeApplicationModels.AvailablePageSchema> getPage(@Url String url1, @Query("filters") String filters, @Query("section_preview_hash") String sectionPreviewHash, @Query("company") Integer company, @Query("url_params") String urlParams, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getAppliedTheme(@Url String url1, @Query("filters") Boolean filters, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ThemeApplicationModels.ThemesSchema> getThemeForPreview(@Url String url1, @Query("filters") Boolean filters, @HeaderMap Map<String, String> requestHeaders);
}