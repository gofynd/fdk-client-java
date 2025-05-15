package com.sdk.application.content;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ContentApplicationApiList {

    @GET 
    Call<ContentApplicationModels.AnnouncementsResponseSchema> getAnnouncements(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.BlogSchema> getBlog(@Url String url1, @Query("root_id") String rootId, @Query("preview") Boolean preview, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.BlogGetDetails> getBlogs(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tags") String tags, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.DataLoadersSchema> getDataLoaders(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.FaqResponseSchema> getFaqs(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.GetFaqCategoriesSchema> getFaqCategories(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.FaqSchema> getFaqBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.GetFaqSchema> getFaqsByCategorySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.LandingPageSchema> getLandingPage(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.ApplicationLegal> getLegalInformation(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.NavigationGetDetails> getNavigations(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SeoComponent> getSEOConfiguration(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SeoSchemaComponent> getSEOMarkupSchemas(@Url String url1, @Query("page_type") String pageType, @Query("active") Boolean active, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.DefaultSitemapConfig> getDefaultSitemapConfig(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SitemapConfigurationList> getSitemaps(@Url String url1, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SitemapConfig> getSitemap(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SlideshowGetDetails> getSlideshows(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.SlideshowSchema> getSlideshow(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.Support> getSupportInformation(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.TagsSchema> getTags(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.PageSchema> getPage(@Url String url1, @Query("root_id") String rootId, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.PageGetDetails> getPages(@Url String url1, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.CustomObjectByIdSchema> getCustomObjectBySlug(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<ContentApplicationModels.CustomFieldsResponseByResourceIdSchema> getCustomFieldsByResourceId(@Url String url1, @HeaderMap Map<String, String> requestHeaders);
}