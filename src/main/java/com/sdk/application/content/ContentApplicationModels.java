

package com.sdk.application.content;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ContentApplicationModels{


/*
    Model: ApplicationLegal
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLegal{

    

    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("tnc")
    private String tnc;
    
    
    
    
    @JsonProperty("policy")
    private String policy;
    
    
    
    
    @JsonProperty("shipping")
    private String shipping;
    
    
    
    
    @JsonProperty("returns")
    private String returns;
    
    
    
    
    @JsonProperty("faq")
    private List<ApplicationLegalFAQ> faq;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: ApplicationLegalFAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLegalFAQ{

    

    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
}


/*
    Model: SeoComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoComponent{

    

    
    
    
    
    @JsonProperty("seo")
    private SeoSchema seo;
    
    
    
}


/*
    Model: ValidationError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidationError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("field")
    private String field;
    
    
    
}


/*
    Model: SeoSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoSchema{

    

    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("robots_txt")
    private String robotsTxt;
    
    
    
    
    @JsonProperty("sitemap_enabled")
    private Boolean sitemapEnabled;
    
    
    
    
    @JsonProperty("additonal_sitemap")
    private String additonalSitemap;
    
    
    
    
    @JsonProperty("cannonical_enabled")
    private Boolean cannonicalEnabled;
    
    
    
    
    @JsonProperty("custom_meta_tags")
    private List<CustomMetaTag> customMetaTags;
    
    
    
    
    @JsonProperty("details")
    private Detail details;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
}


/*
    Model: CustomMetaTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomMetaTag{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: Detail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Detail{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("image_url")
    private String imageUrl;
    
    
    
}


/*
    Model: SeoSchemaComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoSchemaComponent{

    

    
    
    
    
    @JsonProperty("items")
    private List<SEOSchemaMarkupTemplate> items;
    
    
    
}


/*
    Model: SEOSchemaMarkupTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOSchemaMarkupTemplate{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("schema")
    private String schema;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
}


/*
    Model: ScheduleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ScheduleSchema{

    

    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
}


/*
    Model: NextSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NextSchedule{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: AnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementSchema{

    

    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    @JsonProperty("schedule")
    private ScheduleStartSchema schedule;
    
    
    
}


/*
    Model: ScheduleStartSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ScheduleStartSchema{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: BlogGetDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogGetDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<BlogSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("filters")
    private BlogFilters filters;
    
    
    
}


/*
    Model: BlogFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogFilters{

    

    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: ResourceContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourceContent{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: Asset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Asset{

    

    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: Author
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Author{

    

    
    
    
    
    @JsonProperty("designation")
    private String designation;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: BlogSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("publish_date")
    private String publishDate;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("summary")
    private String summary;
    
    
    
}


/*
    Model: SEO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEO{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("image")
    private SEOImage image;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("meta_tags")
    private List<SEOMetaItem> metaTags;
    
    
    
    
    @JsonProperty("sitemap")
    private SEOSitemap sitemap;
    
    
    
    
    @JsonProperty("breadcrumb")
    private List<SEObreadcrumb> breadcrumb;
    
    
    
    
    @JsonProperty("canonical_url")
    private String canonicalUrl;
    
    
    
}


/*
    Model: SEOImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOImage{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: SEOMetaItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOMetaItem{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("items")
    private List<SEOMetaItems> items;
    
    
    
}


/*
    Model: SEOMetaItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOMetaItems{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: SEOSitemap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOSitemap{

    

    
    
    
    
    @JsonProperty("priority")
    private Double priority;
    
    
    
    
    @JsonProperty("frequency")
    private String frequency;
    
    
    
}


/*
    Model: SEObreadcrumb
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEObreadcrumb{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
}


/*
    Model: DateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DateMeta{

    

    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
}


/*
    Model: LocaleLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocaleLanguage{

    

    
    
    
    
    @JsonProperty("hi")
    private Language hi;
    
    
    
    
    @JsonProperty("ar")
    private Language ar;
    
    
    
    
    @JsonProperty("en_us")
    private Language enUs;
    
    
    
}


/*
    Model: Language
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Language{

    

    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Action{

    
    
    public static Action convertUrlToAction(String url) {
        if (url != null) {
            String path = Utility.trimChar(url);
            HashMap<String, List<String>> query = Utility.getQuery(path);
            String pathname = null;
            try {
                pathname = Utility.validURL(path) ? new URL(path).getPath() : path.split("\\?")[0];

            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            Map<PageType, Constant.NavigatorPage> allNavigators = new HashMap(Objects.requireNonNull(Constant.getNavigators(PageType.class)));

            Map<String, PageType> typeLink = new HashMap<>();

            for (Map.Entry<PageType, Constant.NavigatorPage> entry : allNavigators.entrySet()) {
                PageType nav = entry.getKey();
                Constant.NavigatorPage navInfo = entry.getValue();
                String link = navInfo.getLink().toString();
                List<Constant.NavigatorPageParam> params = navInfo.getParams();

                typeLink.put(link, nav);

                if (params != null) {
                    for (Constant.NavigatorPageParam param : params) {
                        if (!param.isRequired()) {
                            String modifiedLink = link.substring(0, link.indexOf(param.getKey().toString()) - 1);
                            typeLink.put(modifiedLink, nav);
                        }
                    }
                }
            }

            List<String> allLinks = new ArrayList<>(typeLink.keySet());
            allLinks.sort((a, b) -> b.length() - a.length());

            Map<String, Object> bestMatchingLink = Utility.findBestMatchingLink(allLinks, pathname);
            String closestMatchingNavLink = null;
            for (String pageType : typeLink.keySet()) {
                if (Utility.trimChar(pageType).equals(bestMatchingLink.get("value"))) {
                    closestMatchingNavLink = pageType;
                    break;
                }
            }

            PageType closestMatchingNavKey = typeLink.get(closestMatchingNavLink);

            if(closestMatchingNavKey == null){
                closestMatchingNavKey = PageType.home;
            }

            // if it is custom theme link url should be in query object, also we will grab our main link from this url field in convertActionToUrl
            if (closestMatchingNavLink.equals("/c/")) {
                ActionPage actionPage = new ActionPage();
                actionPage.setType(closestMatchingNavKey);
                List<String> urlValues = new ArrayList<>();
                String baseUrl = url.split("\\?")[0];
                urlValues.add(baseUrl);
                query.put("url", urlValues);
                actionPage.setQuery(query);
                actionPage.setParams(bestMatchingLink.containsKey("params") ? (HashMap<String, List<String>>) bestMatchingLink.get("params") : new HashMap<>());
            }

            ActionPage actionPage = new ActionPage();
            actionPage.setType(closestMatchingNavKey);
            actionPage.setQuery(query);
            actionPage.setParams(bestMatchingLink.containsKey("params") ? (HashMap<String, List<String>>) bestMatchingLink.get("params") : new HashMap<>());

            Action action = new Action();
            action.setType("page");
            action.setPage(actionPage);

            return action;
        } else {
            Action action = new Action();
            action.setType("page");
            
            ActionPage actionPage = new ActionPage();
            actionPage.setType(PageType.home);

            action.setPage(new ActionPage());
            return action;
        }
    }

    public static String convertActionToUrl(Action action) {
        if (action != null && action.getPage() != null && action.getPage().getType() != null) {
            switch (action.getType()) {
                case "page": {
                    Constant.NavigatorPage item = Constant.getNavigators(PageType.class).get(action.page.type);
                    if (item != null) {
                        if(action.getPage().getType().toString().equals("custom")){
                            item.setLink(action.getPage().getQuery().get("url").get(0));
                            action.getPage().getQuery().remove("url");
                        }
                        // Get param
                        item.setLink(Utility.generateUrlWithParams(item, action.page.params));
//                        item.put("link", Utility.generateUrlWithParams(item, action.getPage().getParams()));
                        // Get query
                        if (action.getPage().getQuery() != null && !action.getPage().getQuery().isEmpty()) {
                            item.setLink(item.getLink() + "/?" + Utility.transformRequestOptions(action.getPage().getQuery()));
                        }
                        return item.getLink();
                    }
                    return "";
                }
                case "popup": {
                    break;
                }
            }
        }
        return "";
    }

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
}


/*
    Model: NavigationReference
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationReference{

    

    
    
    
    
    @JsonProperty("acl")
    private List<String> acl;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_locale_language")
    private LocaleLanguage localeLanguage;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("sort_order")
    private Integer sortOrder;
    
    
    
    
    @JsonProperty("sub_navigation")
    private List<NavigationReference> subNavigation;
    
    
    
}


/*
    Model: AnnouncementsResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementsResponseSchema{

    

    
    
    
    
    @JsonProperty("announcements")
    private HashMap<String,List<AnnouncementSchema>> announcements;
    
    
    
    
    @JsonProperty("refresh_rate")
    private Integer refreshRate;
    
    
    
    
    @JsonProperty("refresh_pages")
    private List<String> refreshPages;
    
    
    
}


/*
    Model: FaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FaqResponseSchema{

    

    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
}


/*
    Model: DataLoaderSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("__source")
    private DataLoaderSourceSchema source;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: DataLoaderSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderSourceSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: DataLoadersSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoadersSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<DataLoaderSchema> items;
    
    
    
}


/*
    Model: ContentAPIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContentAPIError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Double status;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: CommonError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategorySchema{

    

    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("children")
    private List<String> children;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
}


/*
    Model: ChildrenSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChildrenSchema{

    

    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: FAQCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FAQCategorySchema{

    

    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("children")
    private List<ChildrenSchema> children;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
}


/*
    Model: FaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FaqSchema{

    

    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: GetFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqSchema{

    

    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
}


/*
    Model: GetFaqCategoriesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqCategoriesSchema{

    

    
    
    
    
    @JsonProperty("categories")
    private List<CategorySchema> categories;
    
    
    
}


/*
    Model: GetFaqCategoryBySlugSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqCategoryBySlugSchema{

    

    
    
    
    
    @JsonProperty("category")
    private FAQCategorySchema category;
    
    
    
}


/*
    Model: Page
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page{

    

    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: LandingPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPageSchema{

    

    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
}


/*
    Model: NavigationGetDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationGetDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: Orientation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Orientation{

    

    
    
    
    
    @JsonProperty("portrait")
    private List<String> portrait;
    
    
    
    
    @JsonProperty("landscape")
    private List<String> landscape;
    
    
    
}


/*
    Model: NavigationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    @JsonProperty("version")
    private Double version;
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
}


/*
    Model: PageGetDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageGetDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<PageSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("component_ids")
    private List<String> componentIds;
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    @JsonProperty("content_path")
    private String contentPath;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("page_meta")
    private List<Object> pageMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("visibility")
    private HashMap<String,Object> visibility;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
}


/*
    Model: CreatedBySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedBySchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: Support
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Support{

    

    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("contact")
    private ContactSchema contact;
    
    
    
}


/*
    Model: PhoneProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneProperties{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("phone_type")
    private String phoneType;
    
    
    
}


/*
    Model: PhoneSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneSchema{

    

    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneProperties> phone;
    
    
    
}


/*
    Model: EmailProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProperties{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: EmailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailSchema{

    

    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("email")
    private List<EmailProperties> email;
    
    
    
}


/*
    Model: ContactSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactSchema{

    

    
    
    
    
    @JsonProperty("phone")
    private PhoneSchema phone;
    
    
    
    
    @JsonProperty("email")
    private EmailSchema email;
    
    
    
}


/*
    Model: TagsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagsSchema{

    

    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("tags")
    private List<TagSchema> tags;
    
    
    
}


/*
    Model: TagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("attributes")
    private HashMap<String,Object> attributes;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("pages")
    private List<Object> pages;
    
    
    
    
    @JsonProperty("__source")
    private TagSourceSchema source;
    
    
    
}


/*
    Model: TagSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagSourceSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: CustomObjectFieldValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectFieldValue{

    

    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: CustomObjectListItemDefinationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectListItemDefinationSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CustomObjectFieldSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectFieldSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("value")
    private List<CustomObjectFieldValue> value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("definition_id")
    private String definitionId;
    
    
    
}


/*
    Model: CustomObjectByIdSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectByIdSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("definition")
    private CustomObjectListItemDefinationSchema definition;
    
    
    
    
    @JsonProperty("references")
    private List<Object> references;
    
    
    
    
    @JsonProperty("fields")
    private List<CustomObjectFieldSchema> fields;
    
    
    
}


/*
    Model: CustomFieldValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomFieldValue{

    

    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: CustomFieldSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomFieldSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("resource")
    private String resource;
    
    
    
    
    @JsonProperty("value")
    private List<CustomFieldValue> value;
    
    
    
    
    @JsonProperty("resource_id")
    private String resourceId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("multi_value")
    private Boolean multiValue;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("definition_id")
    private String definitionId;
    
    
    
    
    @JsonProperty("has_invalid_values")
    private Boolean hasInvalidValues;
    
    
    
    
    @JsonProperty("invalid_value_errors")
    private List<Object> invalidValueErrors;
    
    
    
    
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
}


/*
    Model: CustomFieldsResponseByResourceIdSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomFieldsResponseByResourceIdSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<CustomFieldSchema> items;
    
    
    
}


/*
    Model: CustomObjectListItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectListItemSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("definition_id")
    private String definitionId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("definition")
    private CustomObjectListItemDefinationSchema definition;
    
    
    
    
    @JsonProperty("references")
    private Integer references;
    
    
    
}


/*
    Model: CustomObjectsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomObjectsSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<CustomObjectListItemSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionPage{

    

    
    
    
    
    @JsonProperty("params")
    private HashMap<String,List<String>> params;
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,List<String>> query;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private PageType type;
    
    
    
}


/*
    Model: TranslateUiLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TranslateUiLabel{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("template_theme_id")
    private String templateThemeId;
    
    
    
    
    @JsonProperty("theme_id")
    private String themeId;
    
    
    
    
    @JsonProperty("locale")
    private String locale;
    
    
    
    
    @JsonProperty("resource")
    private HashMap<String,Object> resource;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("template")
    private Boolean template;
    
    
    
}


/*
    Model: TranslateUiLabelsPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TranslateUiLabelsPage{

    

    
    
    
    
    @JsonProperty("items")
    private List<TranslateUiLabel> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: Error
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Error{

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: ResourceTranslations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourceTranslations{

    

    
    
    
    
    @JsonProperty("resource_id")
    private String resourceId;
    
    
    
    
    @JsonProperty("value")
    private HashMap<String,Object> value;
    
    
    
}


/*
    Model: StandardError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StandardError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ApplicationLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLanguage{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("locale")
    private String locale;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("direction")
    private String direction;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
}


/*
    Model: ResourcePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourcePayload{

    

    
    
    
    
    @JsonProperty("payload")
    private List<HashMap<String,Object>> payload;
    
    
    
}




    
    /*
        Enum: PageType
        Used By: Content
    */
    @Getter
    public enum PageType {

        
        aboutUs("about-us"), 
        
        addresses("addresses"), 
        
        blog("blog"), 
        
        brands("brands"), 
        
        cards("cards"), 
        
        cart("cart"), 
        
        categories("categories"), 
        
        brand("brand"), 
        
        category("category"), 
        
        collection("collection"), 
        
        collections("collections"), 
        
        custom("custom"), 
        
        contactUs("contact-us"), 
        
        external("external"), 
        
        faq("faq"), 
        
        freshchat("freshchat"), 
        
        home("home"), 
        
        notificationSettings("notification-settings"), 
        
        orders("orders"), 
        
        page("page"), 
        
        policy("policy"), 
        
        product("product"), 
        
        productRequest("product-request"), 
        
        products("products"), 
        
        profile("profile"), 
        
        profileOrderShipment("profile-order-shipment"), 
        
        profileBasic("profile-basic"), 
        
        profileCompany("profile-company"), 
        
        profileEmails("profile-emails"), 
        
        profilePhones("profile-phones"), 
        
        rateUs("rate-us"), 
        
        referEarn("refer-earn"), 
        
        settings("settings"), 
        
        sharedCart("shared-cart"), 
        
        tnc("tnc"), 
        
        trackOrder("track-order"), 
        
        wishlist("wishlist"), 
        
        sections("sections"), 
        
        form("form"), 
        
        cartDelivery("cart-delivery"), 
        
        cartPayment("cart-payment"), 
        
        cartReview("cart-review"), 
        
        login("login"), 
        
        register("register"), 
        
        shippingPolicy("shipping-policy"), 
        
        returnPolicy("return-policy"), 
        
        orderStatus("order-status"), 
        
        locateUs("locate-us");
        

        private String priority;
        PageType(String priority) {
            this.priority = priority;
        }

        @JsonValue
        public String getPriority() {
            return priority;
        }

    }


}