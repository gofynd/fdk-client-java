package com.sdk.application.content;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class ContentApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ContentApplicationApiList contentApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public ContentApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.contentApplicationApiList = generateContentApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("getAnnouncements","/service/application/content/v1.0/announcements".substring(1));
        relativeUrls.put("getBlog","/service/application/content/v1.0/blogs/{slug}".substring(1));
        relativeUrls.put("getBlogs","/service/application/content/v1.0/blogs".substring(1));
        relativeUrls.put("getDataLoaders","/service/application/content/v1.0/data-loader".substring(1));
        relativeUrls.put("getFaqs","/service/application/content/v1.0/faq".substring(1));
        relativeUrls.put("getFaqCategories","/service/application/content/v1.0/faq/categories".substring(1));
        relativeUrls.put("getFaqBySlug","/service/application/content/v1.0/faq/{slug}".substring(1));
        relativeUrls.put("getFaqCategoryBySlug","/service/application/content/v1.0/faq/category/{slug}".substring(1));
        relativeUrls.put("getFaqsByCategorySlug","/service/application/content/v1.0/faq/category/{slug}/faqs".substring(1));
        relativeUrls.put("getLandingPage","/service/application/content/v1.0/landing-page".substring(1));
        relativeUrls.put("getLegalInformation","/service/application/content/v1.0/legal".substring(1));
        relativeUrls.put("getNavigations","/service/application/content/v2.0/navigations".substring(1));
        relativeUrls.put("getSEOConfiguration","/service/application/content/v1.0/seo".substring(1));
        relativeUrls.put("getSEOMarkupSchemas","/service/application/content/v1.0/seo/schema".substring(1));
        relativeUrls.put("getDefaultSitemapConfig","/service/application/content/v1.0/seo/sitemap/default".substring(1));
        relativeUrls.put("getSitemaps","/service/application/content/v1.0/seo/sitemaps".substring(1));
        relativeUrls.put("getSitemap","/service/application/content/v1.0/seo/sitemaps/{name}".substring(1));
        relativeUrls.put("getSupportInformation","/service/application/content/v1.0/support".substring(1));
        relativeUrls.put("getTags","/service/application/content/v1.0/tags".substring(1));
        relativeUrls.put("getPages","/service/application/content/v2.0/pages".substring(1));
        relativeUrls.put("getPage","/service/application/content/v2.0/pages/{slug}".substring(1));
        relativeUrls.put("getCustomObjectBySlug","/service/application/content/v2.0/customobjects/definition/{definition_slug}/entries/{slug}".substring(1));
        relativeUrls.put("getCustomFieldsByResourceId","/service/application/content/v2.0/customfields/resource/{resource}/{resource_slug}".substring(1));
        relativeUrls.put("getWellKnownUrl","/service/application/content/v1.0/well-known/{slug}".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private ContentApplicationApiList generateContentApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ContentApplicationApiList.class, interceptorList, cookieStore);
    }

    public ContentApplicationModels.AnnouncementsResponseSchema getAnnouncements() throws IOException {
        return this.getAnnouncements(new HashMap<>());
    }

    public ContentApplicationModels.AnnouncementsResponseSchema getAnnouncements(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getAnnouncements");

        Response<ContentApplicationModels.AnnouncementsResponseSchema> response = contentApplicationApiList.getAnnouncements(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.BlogSchema getBlog(String slug, String rootId) throws IOException {
        return this.getBlog(slug, rootId, new HashMap<>());
    }

    public ContentApplicationModels.BlogSchema getBlog(String slug, String rootId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBlog");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.BlogSchema> response = contentApplicationApiList.getBlog(fullUrl, rootId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.BlogGetResponseSchema getBlogs(Integer pageNo, Integer pageSize, String tags, String search) throws IOException {
        return this.getBlogs(pageNo, pageSize, tags, search, new HashMap<>());
    }

    public ContentApplicationModels.BlogGetResponseSchema getBlogs(Integer pageNo, Integer pageSize, String tags, String search, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getBlogs");

        Response<ContentApplicationModels.BlogGetResponseSchema> response = contentApplicationApiList.getBlogs(fullUrl, pageNo, pageSize, tags, search, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.DataLoadersSchema getDataLoaders() throws IOException {
        return this.getDataLoaders(new HashMap<>());
    }

    public ContentApplicationModels.DataLoadersSchema getDataLoaders(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getDataLoaders");

        Response<ContentApplicationModels.DataLoadersSchema> response = contentApplicationApiList.getDataLoaders(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.FaqResponseSchema getFaqs() throws IOException {
        return this.getFaqs(new HashMap<>());
    }

    public ContentApplicationModels.FaqResponseSchema getFaqs(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFaqs");

        Response<ContentApplicationModels.FaqResponseSchema> response = contentApplicationApiList.getFaqs(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.GetFaqCategoriesSchema getFaqCategories() throws IOException {
        return this.getFaqCategories(new HashMap<>());
    }

    public ContentApplicationModels.GetFaqCategoriesSchema getFaqCategories(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFaqCategories");

        Response<ContentApplicationModels.GetFaqCategoriesSchema> response = contentApplicationApiList.getFaqCategories(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.FaqSchema getFaqBySlug(String slug) throws IOException {
        return this.getFaqBySlug(slug, new HashMap<>());
    }

    public ContentApplicationModels.FaqSchema getFaqBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFaqBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.FaqSchema> response = contentApplicationApiList.getFaqBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlug(String slug) throws IOException {
        return this.getFaqCategoryBySlug(slug, new HashMap<>());
    }

    public ContentApplicationModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFaqCategoryBySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.GetFaqCategoryBySlugSchema> response = contentApplicationApiList.getFaqCategoryBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.GetFaqSchema getFaqsByCategorySlug(String slug) throws IOException {
        return this.getFaqsByCategorySlug(slug, new HashMap<>());
    }

    public ContentApplicationModels.GetFaqSchema getFaqsByCategorySlug(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getFaqsByCategorySlug");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.GetFaqSchema> response = contentApplicationApiList.getFaqsByCategorySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.LandingPageSchema getLandingPage() throws IOException {
        return this.getLandingPage(new HashMap<>());
    }

    public ContentApplicationModels.LandingPageSchema getLandingPage(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLandingPage");

        Response<ContentApplicationModels.LandingPageSchema> response = contentApplicationApiList.getLandingPage(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.ApplicationLegal getLegalInformation() throws IOException {
        return this.getLegalInformation(new HashMap<>());
    }

    public ContentApplicationModels.ApplicationLegal getLegalInformation(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLegalInformation");

        Response<ContentApplicationModels.ApplicationLegal> response = contentApplicationApiList.getLegalInformation(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.NavigationGetResponseSchema getNavigations(Integer pageNo, Integer pageSize) throws IOException {
        return this.getNavigations(pageNo, pageSize, new HashMap<>());
    }

    public ContentApplicationModels.NavigationGetResponseSchema getNavigations(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getNavigations");

        Response<ContentApplicationModels.NavigationGetResponseSchema> response = contentApplicationApiList.getNavigations(fullUrl, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.SeoComponent getSEOConfiguration() throws IOException {
        return this.getSEOConfiguration(new HashMap<>());
    }

    public ContentApplicationModels.SeoComponent getSEOConfiguration(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSEOConfiguration");

        Response<ContentApplicationModels.SeoComponent> response = contentApplicationApiList.getSEOConfiguration(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.SeoSchemaComponent getSEOMarkupSchemas(String pageType, Boolean active) throws IOException {
        return this.getSEOMarkupSchemas(pageType, active, new HashMap<>());
    }

    public ContentApplicationModels.SeoSchemaComponent getSEOMarkupSchemas(String pageType, Boolean active, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSEOMarkupSchemas");

        Response<ContentApplicationModels.SeoSchemaComponent> response = contentApplicationApiList.getSEOMarkupSchemas(fullUrl, pageType, active, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.DefaultSitemapConfig getDefaultSitemapConfig() throws IOException {
        return this.getDefaultSitemapConfig(new HashMap<>());
    }

    public ContentApplicationModels.DefaultSitemapConfig getDefaultSitemapConfig(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getDefaultSitemapConfig");

        Response<ContentApplicationModels.DefaultSitemapConfig> response = contentApplicationApiList.getDefaultSitemapConfig(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.SitemapConfigurationList getSitemaps(String pageNo, String pageSize, Boolean isActive, String name) throws IOException {
        return this.getSitemaps(pageNo, pageSize, isActive, name, new HashMap<>());
    }

    public ContentApplicationModels.SitemapConfigurationList getSitemaps(String pageNo, String pageSize, Boolean isActive, String name, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSitemaps");

        Response<ContentApplicationModels.SitemapConfigurationList> response = contentApplicationApiList.getSitemaps(fullUrl, pageNo, pageSize, isActive, name, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.SitemapConfig getSitemap(String name) throws IOException {
        return this.getSitemap(name, new HashMap<>());
    }

    public ContentApplicationModels.SitemapConfig getSitemap(String name, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSitemap");
        fullUrl = fullUrl.replace("{" + "name" + "}",name.toString());

        Response<ContentApplicationModels.SitemapConfig> response = contentApplicationApiList.getSitemap(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.Support getSupportInformation() throws IOException {
        return this.getSupportInformation(new HashMap<>());
    }

    public ContentApplicationModels.Support getSupportInformation(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getSupportInformation");

        Response<ContentApplicationModels.Support> response = contentApplicationApiList.getSupportInformation(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.TagsSchema getTags() throws IOException {
        return this.getTags(new HashMap<>());
    }

    public ContentApplicationModels.TagsSchema getTags(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getTags");

        Response<ContentApplicationModels.TagsSchema> response = contentApplicationApiList.getTags(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.PageGetResponseSchema getPages(Integer pageNo, Integer pageSize) throws IOException {
        return this.getPages(pageNo, pageSize, new HashMap<>());
    }

    public ContentApplicationModels.PageGetResponseSchema getPages(Integer pageNo, Integer pageSize, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPages");

        Response<ContentApplicationModels.PageGetResponseSchema> response = contentApplicationApiList.getPages(fullUrl, pageNo, pageSize, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.PageSchema getPage(String slug, String rootId) throws IOException {
        return this.getPage(slug, rootId, new HashMap<>());
    }

    public ContentApplicationModels.PageSchema getPage(String slug, String rootId, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPage");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.PageSchema> response = contentApplicationApiList.getPage(fullUrl, rootId, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.CustomObjectByIdSchema getCustomObjectBySlug(String definitionSlug, String slug) throws IOException {
        return this.getCustomObjectBySlug(definitionSlug, slug, new HashMap<>());
    }

    public ContentApplicationModels.CustomObjectByIdSchema getCustomObjectBySlug(String definitionSlug, String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCustomObjectBySlug");
        fullUrl = fullUrl.replace("{" + "definition_slug" + "}",definitionSlug.toString());
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.CustomObjectByIdSchema> response = contentApplicationApiList.getCustomObjectBySlug(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.CustomFieldsResponseByResourceIdSchema getCustomFieldsByResourceId(String resource, String resourceSlug) throws IOException {
        return this.getCustomFieldsByResourceId(resource, resourceSlug, new HashMap<>());
    }

    public ContentApplicationModels.CustomFieldsResponseByResourceIdSchema getCustomFieldsByResourceId(String resource, String resourceSlug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getCustomFieldsByResourceId");
        fullUrl = fullUrl.replace("{" + "resource" + "}",resource.toString());
        fullUrl = fullUrl.replace("{" + "resource_slug" + "}",resourceSlug.toString());

        Response<ContentApplicationModels.CustomFieldsResponseByResourceIdSchema> response = contentApplicationApiList.getCustomFieldsByResourceId(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public ContentApplicationModels.WellKnownResponseSchema getWellKnownUrl(String slug) throws IOException {
        return this.getWellKnownUrl(slug, new HashMap<>());
    }

    public ContentApplicationModels.WellKnownResponseSchema getWellKnownUrl(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getWellKnownUrl");
        fullUrl = fullUrl.replace("{" + "slug" + "}",slug.toString());

        Response<ContentApplicationModels.WellKnownResponseSchema> response = contentApplicationApiList.getWellKnownUrl(fullUrl, requestHeaders).execute();
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