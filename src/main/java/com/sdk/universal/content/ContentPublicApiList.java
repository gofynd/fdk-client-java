package com.sdk.universal.content;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ContentPublicApiList {

    @GET ("/service/public/content/basic-details")
    Call<ContentPublicModels.BasicDetailsPayloadSchema> getBasicDetails(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/menu")
    Call<ContentPublicModels.MenusSchema> getMenuContent(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/menu/{type}")
    Call<ContentPublicModels.MenuTypeSchema> getMenuContentByType(@Path("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/custom-pages/{slug}")
    Call<ContentPublicModels.CustomPageBySlugSchema> getCustomPage(@Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/footer")
    Call<ContentPublicModels.FooterSchema> getFooterContent(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/home-page")
    Call<ContentPublicModels.HomePageContentSchema> getHomePageContent(@Query("page_type") String pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/navbar")
    Call<ContentPublicModels.NavbarSchema> getNavbar(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/pricing-banner")
    Call<ContentPublicModels.PricingBannerSchema> getPricingBanner(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/tags")
    Call<ContentPublicModels.TagsSchema> getAllTags(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/credentials/{entity_type}")
    Call<ContentPublicModels.CredentialsSchema> getCredentialsByEntity(@Path("entity_type") String entityType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/sdk-readme")
    Call<ContentPublicModels.SDKLinksResponseSchema> getSDKDocumentation(@HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/public/content/sdk-readme/{type}")
    Call<ContentPublicModels.SDKbyTypeResponseSchema> getSDKDocumentationByType(@Path("type") String type, @HeaderMap Map<String, String> requestHeaders);
}