package com.sdk.universal.content;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class ContentPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ContentPublicApiList contentPublicApiList;

    public ContentPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.contentPublicApiList = generateContentPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private ContentPublicApiList generateContentPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),ContentPublicApiList.class, interceptorList, cookieStore);
    }

    public ContentPublicModels.BasicDetailsPayloadSchema getBasicDetails() throws IOException {
        return this.getBasicDetails(new HashMap<>());
    }

    public ContentPublicModels.BasicDetailsPayloadSchema getBasicDetails(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.BasicDetailsPayloadSchema> response = contentPublicApiList.getBasicDetails(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.MenusSchema getMenuContent() throws IOException {
        return this.getMenuContent(new HashMap<>());
    }

    public ContentPublicModels.MenusSchema getMenuContent(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.MenusSchema> response = contentPublicApiList.getMenuContent(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.MenuTypeSchema getMenuContentByType(String type) throws IOException {
        return this.getMenuContentByType(type, new HashMap<>());
    }

    public ContentPublicModels.MenuTypeSchema getMenuContentByType(String type, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.MenuTypeSchema> response = contentPublicApiList.getMenuContentByType(type, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.AnalyticsTagsSchema getAnalyticsTags() throws IOException {
        return this.getAnalyticsTags(new HashMap<>());
    }

    public ContentPublicModels.AnalyticsTagsSchema getAnalyticsTags(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.AnalyticsTagsSchema> response = contentPublicApiList.getAnalyticsTags(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.CustomPageBySlugSchema getCustomPage(String slug) throws IOException {
        return this.getCustomPage(slug, new HashMap<>());
    }

    public ContentPublicModels.CustomPageBySlugSchema getCustomPage(String slug, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.CustomPageBySlugSchema> response = contentPublicApiList.getCustomPage(slug, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.FooterSchema getFooterContent() throws IOException {
        return this.getFooterContent(new HashMap<>());
    }

    public ContentPublicModels.FooterSchema getFooterContent(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.FooterSchema> response = contentPublicApiList.getFooterContent(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.HomePageContentSchema getHomePageContent(String pageType) throws IOException {
        return this.getHomePageContent(pageType, new HashMap<>());
    }

    public ContentPublicModels.HomePageContentSchema getHomePageContent(String pageType, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.HomePageContentSchema> response = contentPublicApiList.getHomePageContent(pageType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.NavbarSchema getNavbar() throws IOException {
        return this.getNavbar(new HashMap<>());
    }

    public ContentPublicModels.NavbarSchema getNavbar(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.NavbarSchema> response = contentPublicApiList.getNavbar(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.PricingBannerSchema getPricingBanner() throws IOException {
        return this.getPricingBanner(new HashMap<>());
    }

    public ContentPublicModels.PricingBannerSchema getPricingBanner(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.PricingBannerSchema> response = contentPublicApiList.getPricingBanner(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.TagsSchema getAllTags() throws IOException {
        return this.getAllTags(new HashMap<>());
    }

    public ContentPublicModels.TagsSchema getAllTags(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.TagsSchema> response = contentPublicApiList.getAllTags(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.CredentialsSchema getCredentialsByEntity(String entityType) throws IOException {
        return this.getCredentialsByEntity(entityType, new HashMap<>());
    }

    public ContentPublicModels.CredentialsSchema getCredentialsByEntity(String entityType, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.CredentialsSchema> response = contentPublicApiList.getCredentialsByEntity(entityType, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.SDKLinksResponseSchema getSDKDocumentation() throws IOException {
        return this.getSDKDocumentation(new HashMap<>());
    }

    public ContentPublicModels.SDKLinksResponseSchema getSDKDocumentation(Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.SDKLinksResponseSchema> response = contentPublicApiList.getSDKDocumentation(requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    public ContentPublicModels.SDKbyTypeResponseSchema getSDKDocumentationByType(String type) throws IOException {
        return this.getSDKDocumentationByType(type, new HashMap<>());
    }

    public ContentPublicModels.SDKbyTypeResponseSchema getSDKDocumentationByType(String type, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.SDKbyTypeResponseSchema> response = contentPublicApiList.getSDKDocumentationByType(type, requestHeaders).execute();
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