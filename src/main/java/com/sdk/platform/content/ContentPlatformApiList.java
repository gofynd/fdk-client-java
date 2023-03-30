package com.sdk.platform.content;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ContentPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<ContentPlatformModels.GetAnnouncementListSchema> getAnnouncementsList(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<ContentPlatformModels.CreateAnnouncementSchema> createAnnouncement(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.AdminAnnouncementSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.AdminAnnouncementSchema> getAnnouncementById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("announcement_id") String  announcementId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> updateAnnouncement(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("announcement_id") String  announcementId ,@Body ContentPlatformModels.AdminAnnouncementSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> updateAnnouncementSchedule(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("announcement_id") String  announcementId ,@Body ContentPlatformModels.ScheduleSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<ContentPlatformModels.CreateAnnouncementSchema> deleteAnnouncement(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("announcement_id") String  announcementId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<ContentPlatformModels.BlogSchema> createBlog(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.BlogRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<ContentPlatformModels.BlogGetResponse> getBlogs(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<ContentPlatformModels.BlogSchema> updateBlog(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.BlogRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<ContentPlatformModels.BlogSchema> deleteBlog(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    Call<ContentPlatformModels.BlogSchema> getComponentById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<ContentPlatformModels.DataLoaderResponseSchema> addDataLoader(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.DataLoaderSchema payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<ContentPlatformModels.DataLoadersSchema> getDataLoaders(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<ContentPlatformModels.DataLoaderResponseSchema> deleteDataLoader(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("data_loader_id") String  dataLoaderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<ContentPlatformModels.DataLoaderResponseSchema> editDataLoader(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("data_loader_id") String  dataLoaderId ,@Body ContentPlatformModels.DataLoaderSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    Call<ContentPlatformModels.DataLoaderResponseSchema> selectDataLoader(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("data_loader_id") String  dataLoaderId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{service}/{operation_id}/reset")
    Call<ContentPlatformModels.DataLoaderResetResponseSchema> resetDataLoader(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("service") String  service , @Path("operation_id") String  operationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    Call<ContentPlatformModels.GetFaqCategoriesSchema> getFaqCategories(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    Call<ContentPlatformModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlugOrId(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id_or_slug") String  idOrSlug );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    Call<ContentPlatformModels.CreateFaqCategorySchema> createFaqCategory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.CreateFaqCategoryRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<ContentPlatformModels.CreateFaqCategorySchema> updateFaqCategory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.UpdateFaqCategoryRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<ContentPlatformModels.FaqSchema> deleteFaqCategory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    Call<ContentPlatformModels.GetFaqSchema> getFaqsByCategoryIdOrSlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id_or_slug") String  idOrSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faqs")
    Call<ContentPlatformModels.CreateFaqResponseSchema> addFaq(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("category_id") String  categoryId ,@Body ContentPlatformModels.CreateFaqSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> updateFaq(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("category_id") String  categoryId , @Path("faq_id") String  faqId ,@Body ContentPlatformModels.CreateFaqSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> deleteFaq(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("category_id") String  categoryId , @Path("faq_id") String  faqId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    Call<ContentPlatformModels.CreateFaqResponseSchema> getFaqByIdOrSlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id_or_slug") String  idOrSlug );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<ContentPlatformModels.LandingPageGetResponse> getLandingPages(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<ContentPlatformModels.LandingPageSchema> createLandingPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.LandingPageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<ContentPlatformModels.LandingPageSchema> updateLandingPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.LandingPageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<ContentPlatformModels.LandingPageSchema> deleteLandingPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<ContentPlatformModels.ApplicationLegal> getLegalInformation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<ContentPlatformModels.ApplicationLegal> updateLegalInformation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.ApplicationLegal payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<ContentPlatformModels.NavigationGetResponse> getNavigations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("device_platform") String  devicePlatform ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<ContentPlatformModels.NavigationSchema> createNavigation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.NavigationRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    Call<ContentPlatformModels.DefaultNavigationResponse> getDefaultNavigations(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    Call<ContentPlatformModels.NavigationSchema> getNavigationBySlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug , @Query("device_platform") String  devicePlatform );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<ContentPlatformModels.NavigationSchema> updateNavigation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.NavigationRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<ContentPlatformModels.NavigationSchema> deleteNavigation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    Call<ContentPlatformModels.PageMetaSchema> getPageMeta(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    Call<ContentPlatformModels.PageSpec> getPageSpec(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/preview/")
    Call<ContentPlatformModels.PageSchema> createPagePreview(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.PageRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    Call<ContentPlatformModels.PageSchema> updatePagePreview(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug ,@Body ContentPlatformModels.PagePublishRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<ContentPlatformModels.PageSchema> deletePage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<ContentPlatformModels.PathMappingSchema> addPathRedirectionRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.PathMappingSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<ContentPlatformModels.PathMappingSchema> getPathRedirectionRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_size") Integer  pageSize ,  @Query("page_no") Integer  pageNo );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<ContentPlatformModels.PathMappingSchema> getPathRedirectionRule(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("path_id") String  pathId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<ContentPlatformModels.PathMappingSchema> updatePathRedirectionRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("path_id") String  pathId ,@Body ContentPlatformModels.PathMappingSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings/{path_id}")
    Call<Object> deletePathRedirectionRules(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("path_id") String  pathId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<ContentPlatformModels.SeoComponent> getSEOConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<ContentPlatformModels.SeoSchema> updateSEOConfiguration(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.SeoComponent payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    Call<ContentPlatformModels.SlideshowGetResponse> getSlideshows(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("device_platform") String  devicePlatform ,  @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    Call<ContentPlatformModels.SlideshowSchema> createSlideshow(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.SlideshowRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    Call<ContentPlatformModels.SlideshowSchema> getSlideshowBySlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug , @Query("device_platform") String  devicePlatform );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    Call<ContentPlatformModels.SlideshowSchema> updateSlideshow(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.SlideshowRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    Call<ContentPlatformModels.SlideshowSchema> deleteSlideshow(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<ContentPlatformModels.Support> getSupportInformation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<ContentPlatformModels.Support> updateSupportInformation(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.Support payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<ContentPlatformModels.TagsSchema> updateInjectableTag(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.CreateTagRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<ContentPlatformModels.TagsSchema> deleteAllInjectableTags(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<ContentPlatformModels.TagsSchema> getInjectableTags(@Path("company_id")  String companyId , @Path("application_id")  String applicationId );
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    Call<ContentPlatformModels.TagsSchema> addInjectableTag(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.CreateTagRequestSchema payload);
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    Call<ContentPlatformModels.TagDeleteSuccessResponse> removeInjectableTag(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.RemoveHandpickedSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    Call<ContentPlatformModels.TagsSchema> editInjectableTag(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("tag_id") String  tagId ,@Body ContentPlatformModels.UpdateHandpickedSchema payload);
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<ContentPlatformModels.PageSchema> createPage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body ContentPlatformModels.PageRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<ContentPlatformModels.PageGetResponse> getPages(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<ContentPlatformModels.PageSchema> updatePage(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body ContentPlatformModels.PageSchema payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    Call<ContentPlatformModels.PageSchema> getPageBySlug(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("slug") String  slug );
    
}