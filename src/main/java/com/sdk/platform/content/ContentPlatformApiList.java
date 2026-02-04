package com.sdk.platform.content;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ContentPlatformApiList {

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<ContentPlatformModels.GetAnnouncementListSchema> getAnnouncementsList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<ContentPlatformModels.CreateAnnouncementSchema> createAnnouncement(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.AdminAnnouncementSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.AdminAnnouncementSchema> getAnnouncementById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("announcement_id") String announcementId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> updateAnnouncement(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("announcement_id") String announcementId, @Body ContentPlatformModels.AdminAnnouncementSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> updateAnnouncementSchedule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("announcement_id") String announcementId, @Body ContentPlatformModels.ScheduleSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> deleteAnnouncement(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("announcement_id") String announcementId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<ContentPlatformModels.BlogSchema> createBlog(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.BlogPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<ContentPlatformModels.BlogGetDetails> getBlogs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("tags") String tags, @Query("q") String q, @Query("slug") String slug, @Query("title") String title, @Query("status") String status, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<ContentPlatformModels.BlogSchema> updateBlog(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.BlogPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<ContentPlatformModels.BlogSchema> deleteBlog(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<ContentPlatformModels.DataLoaderResponseSchema> addDataLoader(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.DataLoaderSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<ContentPlatformModels.DataLoadersSchema> getDataLoaders(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<ContentPlatformModels.DataLoaderResponseSchema> deleteDataLoader(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("data_loader_id") String dataLoaderId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<ContentPlatformModels.DataLoaderResponseSchema> editDataLoader(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("data_loader_id") String dataLoaderId, @Body ContentPlatformModels.DataLoaderSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/service/{service_name}")
    Call<ContentPlatformModels.DataLoaderResponseSchema> getDataLoadersByService(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("service_name") String serviceName, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    Call<ContentPlatformModels.DataLoaderResponseSchema> selectDataLoader(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("data_loader_id") String dataLoaderId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    Call<ContentPlatformModels.DataLoaderResetResponseSchema> resetDataLoader(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("service") String service, @Path("operation_id") String operationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    Call<ContentPlatformModels.GetFaqCategoriesSchema> getFaqCategories(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    Call<ContentPlatformModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlugOrId(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id_or_slug") String idOrSlug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    Call<ContentPlatformModels.CreateFaqCategorySchema> createFaqCategory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.CreateFaqCategoryRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<ContentPlatformModels.CreateFaqCategorySchema> updateFaqCategory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.UpdateFaqCategoryRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<ContentPlatformModels.FaqSchema> deleteFaqCategory(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    Call<ContentPlatformModels.GetFaqSchema> getFaqsByCategoryIdOrSlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id_or_slug") String idOrSlug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq")
    Call<ContentPlatformModels.CreateFaqResponseSchema> addFaq(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("category_id") String categoryId, @Body ContentPlatformModels.CreateFaqSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> updateFaq(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("category_id") String categoryId, @Path("faq_id") String faqId, @Body ContentPlatformModels.CreateFaqSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> deleteFaq(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("category_id") String categoryId, @Path("faq_id") String faqId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> getFaqByIdOrSlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id_or_slug") String idOrSlug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/generate-seo/{type}")
    Call<ContentPlatformModels.GeneratedSEOContent> generateSEOTitle(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("type") ContentPlatformModels.GenerationEntityType type, @Body ContentPlatformModels.GenerateSEOContent payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<ContentPlatformModels.LandingPageGetDetails> getLandingPages(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<ContentPlatformModels.LandingPageSchema> createLandingPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.LandingPageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<ContentPlatformModels.LandingPageSchema> updateLandingPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.LandingPageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<ContentPlatformModels.LandingPageSchema> deleteLandingPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<ContentPlatformModels.ApplicationLegal> getLegalInformation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<ContentPlatformModels.ApplicationLegal> updateLegalInformation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.ApplicationLegal payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<ContentPlatformModels.NavigationGetDetails> getNavigations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("device_platform") String devicePlatform, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<ContentPlatformModels.NavigationSchema> createNavigation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.NavigationPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    Call<ContentPlatformModels.DefaultNavigationDetails> getDefaultNavigations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    Call<ContentPlatformModels.NavigationSchema> getNavigationBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Query("device_platform") String devicePlatform, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<ContentPlatformModels.NavigationSchema> updateNavigation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.NavigationPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<ContentPlatformModels.NavigationSchema> deleteNavigation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    Call<ContentPlatformModels.PageMetaSchema> getPageMeta(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    Call<ContentPlatformModels.PageSpec> getPageSpec(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    Call<ContentPlatformModels.PageSchema> updatePagePreview(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Body ContentPlatformModels.PagePublishPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<ContentPlatformModels.PageSchema> deletePage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<ContentPlatformModels.PathMappingSchema> addPathRedirectionRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.PathMappingSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<ContentPlatformModels.PathMappingSchema> getPathRedirectionRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_size") Integer pageSize, @Query("page_no") Integer pageNo, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<ContentPlatformModels.PathMappingSchema> getPathRedirectionRule(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("path_id") String pathId, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<ContentPlatformModels.PathMappingSchema> updatePathRedirectionRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("path_id") String pathId, @Body ContentPlatformModels.PathMappingSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<Object> deletePathRedirectionRules(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("path_id") String pathId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<ContentPlatformModels.SeoComponent> getSEOConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<ContentPlatformModels.SeoSchema> updateSEOConfiguration(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.SeoComponent payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/default")
    Call<ContentPlatformModels.DefaultSchemaComponent> getDefaultSEOMarkupSchema(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_type") ContentPlatformModels.PageType pageType, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    Call<ContentPlatformModels.SeoSchemaComponent> getSEOMarkupSchemas(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("title") String title, @Query("active") String active, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema")
    Call<ContentPlatformModels.SEOSchemaMarkupTemplate> createSEOMarkupSchema(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.SEOSchemaMarkupTemplateRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    Call<ContentPlatformModels.SEOSchemaMarkupTemplate> getSEOMarkupSchema(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    Call<ContentPlatformModels.SEOSchemaMarkupTemplate> editSEOMarkupSchema(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.SEOSchemaMarkupTemplateRequestBody payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo/schema/{id}")
    Call<ContentPlatformModels.SEOSchemaMarkupTemplate> deleteSEOMarkupSchema(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<ContentPlatformModels.Support> getSupportInformation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<ContentPlatformModels.Support> updateSupportInformation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.Support payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<ContentPlatformModels.TagsSchema> updateInjectableTag(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.CreateTagRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<ContentPlatformModels.TagsSchema> getInjectableTags(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("all") Boolean all, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    Call<ContentPlatformModels.TagsSchema> addInjectableTag(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.CreateTagRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    Call<ContentPlatformModels.TagDeleteSuccessDetails> removeInjectableTag(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.RemoveHandpickedSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    Call<ContentPlatformModels.TagsSchema> editInjectableTag(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("tag_id") String tagId, @Body ContentPlatformModels.UpdateHandpickedSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/templates")
    Call<ContentPlatformModels.TagsTemplateSchema> getTagsTemplate(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    Call<ContentPlatformModels.BlogSchema> getBlogBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<ContentPlatformModels.PageSchema> createPage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.PagePayload payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<ContentPlatformModels.PageGetDetails> getPages(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<ContentPlatformModels.PageSchema> updatePage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.PageSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    Call<ContentPlatformModels.PageSchema> getPageBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/types")
    Call<ContentPlatformModels.MetafieldTypesSchema> getCustomFieldTypes(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/metafields/resources")
    Call<ContentPlatformModels.ResourcesSchema> getResources(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionsSchema> getCustomFieldDefinitions(@Path("company_id") String companyId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("resources") String resources, @Query("types") String types, @Query("search") String search, @Query("slugs") String slugs, @Query("namespaces") String namespaces, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionsSchema> getCustomFieldDefinitionByResource(@Path("company_id") String companyId, @Path("resource") String resource, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("types") String types, @Query("search") String search, @Query("slugs") String slugs, @Query("namespaces") String namespaces, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionDetailResSchema> createCustomFieldDefinition(@Path("company_id") String companyId, @Path("resource") String resource, @Body ContentPlatformModels.CustomFieldDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.MetaFieldDefinitionDetailResSchema> getCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.CustomFieldDefinitionDetailResSchema> updateCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @Body ContentPlatformModels.CustomFieldDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.CustomDataDeleteSchema> deleteCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    Call<ContentPlatformModels.CustomFieldsResponseByResourceIdSchema> getCustomFieldsByResourceSlug(@Path("company_id") String companyId, @Path("resource") String resource, @Path("resource_slug") String resourceSlug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    Call<ContentPlatformModels.CustomFieldsResponseByResourceIdSchema> updateCustomFieldByResourceSlug(@Path("company_id") String companyId, @Path("resource") String resource, @Path("resource_slug") String resourceSlug, @Body ContentPlatformModels.CustomFieldRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customfields/resource/{resource}/{resource_slug}")
    Call<ContentPlatformModels.CustomFieldsDeleteSchema> deleteCustomFieldsByResourceSlug(@Path("company_id") String companyId, @Path("resource") String resource, @Path("resource_slug") String resourceSlug, @Query("ids") String ids, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> createCustomObjectDefinition(@Path("company_id") String companyId, @Body ContentPlatformModels.CustomObjectDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition")
    Call<ContentPlatformModels.CustomObjectDefinitionsSchema> getCustomObjectDefinitions(@Path("company_id") String companyId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> getCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> updateCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectDefinitionUpdateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionDeleteResponseSchema> deleteCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries")
    Call<ContentPlatformModels.CustomObjectsSchema> getCustomObjectsBySlug(@Path("company_id") String companyId, @Path("definition_slug") String definitionSlug, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries")
    Call<ContentPlatformModels.CustomObjectSchema> createCustomObjectBySlug(@Path("company_id") String companyId, @Path("definition_slug") String definitionSlug, @Body ContentPlatformModels.CustomObjectRequestSchemaWithoutId payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomObjectBySlugSchema> getCustomObjectBySlug(@Path("company_id") String companyId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomDataDeleteSchema> deleteCustomObjectBySlug(@Path("company_id") String companyId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomObjectBySlugSchema> updateCustomObjectBySlug(@Path("company_id") String companyId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectRequestSchemaWithoutId payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/metaobjects/jobs")
    Call<ContentPlatformModels.CustomObjectBulkEntry> getJobs(@Path("company_id") String companyId, @Query("page") String page, @Query("page_size") String pageSize, @Query("action_type") String actionType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/upload")
    Call<ContentPlatformModels.CustomObjectEntryBulkUploadDetails> importCustomObjectEntriesBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectBulkSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/download")
    Call<ContentPlatformModels.CustomObjectBulkEntryInitiateDownload> exportCustomObjectEntriesBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/customobjects/definition/{slug}/bulk/sample")
    Call<String> sampleCustomObjectBulkEntryBySlug(@Path("company_id") String companyId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/types")
    Call<ContentPlatformModels.MetafieldTypesSchema> getAppCustomFieldTypes(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metafields/resources")
    Call<ContentPlatformModels.ResourcesSchema> getAppResources(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionsSchema> getAppCustomFieldDefinitions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("resources") String resources, @Query("types") String types, @Query("search") String search, @Query("slugs") String slugs, @Query("namespaces") String namespaces, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionsSchema> getAppCustomFieldDefinitionByResource(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("resource") String resource, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("types") String types, @Query("search") String search, @Query("slugs") String slugs, @Query("namespaces") String namespaces, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/definition")
    Call<ContentPlatformModels.CustomFieldDefinitionDetailResSchema> createAppCustomFieldDefinition(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("resource") String resource, @Body ContentPlatformModels.CustomFieldDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.MetaFieldDefinitionDetailResSchema> getAppCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.CustomFieldDefinitionDetailResSchema> updateAppCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @Body ContentPlatformModels.CustomFieldDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/namespace/{namespace}/definition/{slug}")
    Call<ContentPlatformModels.CustomDataDeleteSchema> deleteAppCustomFieldDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Path("resource") String resource, @Path("namespace") String namespace, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/{resource_slug}")
    Call<ContentPlatformModels.CustomFieldsResponseByResourceIdSchema> getAppCustomFieldsByResourceSlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("resource") String resource, @Path("resource_slug") String resourceSlug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customfields/resource/{resource}/{resource_slug}")
    Call<ContentPlatformModels.CustomFieldsResponseByResourceIdSchema> updateAppCustomFieldByResourceSlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("resource") String resource, @Path("resource_slug") String resourceSlug, @Body ContentPlatformModels.CustomFieldRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> createAppCustomObjectDefinition(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.CustomObjectDefinitionRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition")
    Call<ContentPlatformModels.CustomObjectDefinitionsSchema> getAppCustomObjectDefinitions(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @Query("search") String search, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> getAppCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionSlugSchema> updateAppCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectDefinitionUpdateRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}")
    Call<ContentPlatformModels.CustomObjectDefinitionDeleteResponseSchema> deleteAppCustomObjectDefinitionBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries")
    Call<ContentPlatformModels.CustomObjectsSchema> getAppCustomObjectsBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("definition_slug") String definitionSlug, @Query("page_no") String pageNo, @Query("page_size") String pageSize, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries")
    Call<ContentPlatformModels.CustomObjectSchema> createAppCustomObjectBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("definition_slug") String definitionSlug, @Body ContentPlatformModels.CustomObjectRequestSchemaWithoutId payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomObjectBySlugSchema> getAppCustomObjectBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomDataDeleteSchema> deleteAppCustomObjectBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{definition_slug}/entries/{slug}")
    Call<ContentPlatformModels.CustomObjectBySlugSchema> updateAppCustomObjectBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("definition_slug") String definitionSlug, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectRequestSchemaWithoutId payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/metaobjects/jobs")
    Call<ContentPlatformModels.CustomObjectBulkEntry> getAppJobs(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page") String page, @Query("page_size") String pageSize, @Query("action_type") String actionType, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/upload")
    Call<ContentPlatformModels.CustomObjectEntryBulkUploadDetails> importAppCustomObjectEntriesBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @Body ContentPlatformModels.CustomObjectBulkSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/download")
    Call<ContentPlatformModels.CustomObjectBulkEntryInitiateDownload> exportAppCustomObjectEntriesBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/customobjects/definition/{slug}/bulk/sample")
    Call<String> sampleAppCustomObjectBulkEntryBySlug(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/translate-ui-labels")
    Call<ContentPlatformModels.TranslateUiLabelsPage> getTranslateUILabels(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("template_theme_id") String templateThemeId, @Query("theme_id") String themeId, @Query("locale") String locale, @Query("type") String type, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/translate-ui-labels")
    Call<ContentPlatformModels.TranslateUiLabels> createTranslateUILabels(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.TranslateUiLabelsCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/translate-ui-labels/{id}")
    Call<ContentPlatformModels.TranslateUiLabels> getTranslateUILabelsById(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/translate-ui-labels/{id}")
    Call<ContentPlatformModels.TranslateUiLabels> updateTranslateUILabels(@Path("id") String id, @Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.StaticResourceUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/languages")
    Call<Object> getCompanyLanguages(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/languages")
    Call<Object> addCompanyLanguage(@Path("company_id") String companyId, @Body ContentPlatformModels.CompanyLanguageCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/languages/{locale}")
    Call<ContentPlatformModels.CompanyLanguage> updateCompanyLanguageDefault(@Path("company_id") String companyId, @Path("locale") String locale, @Body ContentPlatformModels.CompanyLanguageUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/languages/{locale}")
    Call<ContentPlatformModels.OperationResponseSchema> deleteCompanyLanguage(@Path("company_id") String companyId, @Path("locale") String locale, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/languages")
    Call<Object> getApplicationLanguages(@Path("company_id") String companyId, @Path("application_id") String applicationId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/languages")
    Call<Object> addApplicationLanguage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.ApplicationLanguageCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/languages")
    Call<Object> bulkUnPublishApplicationLanguage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.unPublishApplicationLanguage payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/languages/{locale}")
    Call<ContentPlatformModels.ApplicationLanguage> updateApplicationLanguageStatus(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("locale") String locale, @Body ContentPlatformModels.ApplicationLanguageUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/languages/{locale}")
    Call<ContentPlatformModels.OperationResponseSchema> deleteApplicationLanguage(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("locale") String locale, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/resources")
    Call<Object> getAllTranslatableResources(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/resources/{id}")
    Call<ContentPlatformModels.TranslatableResource> getTranslatableResourceById(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/resource/definitions")
    Call<Object> getAllResourceDefinitions(@Path("company_id") String companyId, @Query("translatable_resource_id") String translatableResourceId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/resource/definitions/{id}")
    Call<ContentPlatformModels.ResourceDefinition> getResourceDefinitionById(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/sections")
    Call<Object> getAllSections(@Path("company_id") String companyId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/section/{id}")
    Call<ContentPlatformModels.TranslatableSection> getSectionById(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/translatable/section/{id}/resources")
    Call<Object> getTranslatableResourcesBySectionId(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/resource/translations")
    Call<ContentPlatformModels.ResourceTranslation> getCompanyResourceTranslation(@Path("company_id") String companyId, @Query("locale") String locale, @Query("type") String type, @Query("resource_id") String resourceId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/resource/translations")
    Call<ContentPlatformModels.ResourceTranslation> createCompanyResourceTranslation(@Path("company_id") String companyId, @Body ContentPlatformModels.ResourceTranslationCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/resource/translations/{id}")
    Call<ContentPlatformModels.ResourceTranslation> updateCompanyResourceTranslation(@Path("company_id") String companyId, @Path("id") String id, @Body ContentPlatformModels.ResourceTranslationUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/resource/translations/{id}")
    Call<ContentPlatformModels.OperationResponseSchema> deleteCompanyResourceTranslation(@Path("company_id") String companyId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/resource/translations")
    Call<Object> getApplicationResourceTranslations(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("locale") String locale, @Query("type") String type, @Query("resource_id") String resourceId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/resource/translations")
    Call<ContentPlatformModels.ResourceTranslation> createApplicationResourceTranslation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.ResourceTranslationCreate payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/resource/translations/bulk")
    Call<ContentPlatformModels.ResourceTranslationBulkUpsert> upsertApplicationResourceTranslationInBulk(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Body ContentPlatformModels.ResourceTranslationList payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/resource/translations/{id}")
    Call<ContentPlatformModels.ResourceTranslation> updateApplicationResourceTranslation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @Body ContentPlatformModels.ResourceTranslationUpdate payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/resource/translations/{id}")
    Call<ContentPlatformModels.OperationResponseSchema> deleteApplicationResourceTranslation(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("id") String id, @HeaderMap Map<String, String> requestHeaders);
}