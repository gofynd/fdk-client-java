

package com.sdk.universal.content;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ContentPublicModels{


/*
    Model: BasicDetailsPayloadSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BasicDetailsPayloadSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("favicon_url")
    private String faviconUrl;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("meta_title")
    private String metaTitle;
    
    
    
    
    @JsonProperty("meta_description")
    private String metaDescription;
    
    
    
    
    @JsonProperty("meta_image")
    private String metaImage;
    
    
    
    
    @JsonProperty("whats_new")
    private List<WhatsNew> whatsNew;
    
    
    
    
    @JsonProperty("features")
    private List<Features> features;
    
    
    
    
    @JsonProperty("authentication")
    private HashMap<String,Object> authentication;
    
    
    
    
    @JsonProperty("business_account")
    private BusinessAccount businessAccount;
    
    
    
    
    @JsonProperty("seller_support")
    private SellerSupport sellerSupport;
    
    
    
    
    @JsonProperty("copyright")
    private String copyright;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("documentation_url")
    private String documentationUrl;
    
    
    
    
    @JsonProperty("faq_url")
    private String faqUrl;
    
    
    
    
    @JsonProperty("facebook_url")
    private String facebookUrl;
    
    
    
    
    @JsonProperty("instagram_url")
    private String instagramUrl;
    
    
    
    
    @JsonProperty("privacy_url")
    private String privacyUrl;
    
    
    
    
    @JsonProperty("twitter_url")
    private String twitterUrl;
    
    
    
    
    @JsonProperty("termsofservice_url")
    private String termsofserviceUrl;
    
    
    
}


/*
    Model: WhatsNew
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WhatsNew{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: Features
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Features{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("list")
    private List<String> list;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
}


/*
    Model: BusinessAccount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessAccount{

    

    
    
    
    
    @JsonProperty("is_limit")
    private Boolean isLimit;
    
    
    
    
    @JsonProperty("threshold")
    private Integer threshold;
    
    
    
}


/*
    Model: SellerSupport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerSupport{

    

    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
}


/*
    Model: MenuSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MenuSchema{

    

    
    
    
    
    @JsonProperty("sales_channel")
    private SalesChannelSchema salesChannel;
    
    
    
    
    @JsonProperty("other_seller")
    private OtherSellerSchema otherSeller;
    
    
    
    
    @JsonProperty("footer_content")
    private FooterContentSchema footerContent;
    
    
    
    
    @JsonProperty("can_create_business_account")
    private Boolean canCreateBusinessAccount;
    
    
    
    
    @JsonProperty("company_level")
    private List<CompanyLevelMenuItemSchema> companyLevel;
    
    
    
    
    @JsonProperty("application_level")
    private List<ApplicationLevelMenuItemSchema> applicationLevel;
    
    
    
}


/*
    Model: MenusSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MenusSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("desktop")
    private MenuTypeSchema desktop;
    
    
    
    
    @JsonProperty("mobile")
    private MenuTypeSchema mobile;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: MenuTypeSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MenuTypeSchema{

    

    
    
    
    
    @JsonProperty("menu")
    private MenuSchema menu;
    
    
    
}


/*
    Model: CompanyLevelMenuItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyLevelMenuItemSchema{

    

    
    
    
    
    @JsonProperty("visible_on")
    private VisibleOnSchema visibleOn;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("is_disabled")
    private Boolean isDisabled;
    
    
    
    
    @JsonProperty("child")
    private List<CompanyLevelMenuItemSchema> child;
    
    
    
}


/*
    Model: ApplicationLevelMenuItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLevelMenuItemSchema{

    

    
    
    
    
    @JsonProperty("visible_on")
    private VisibleOnSchema visibleOn;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("is_disabled")
    private Boolean isDisabled;
    
    
    
    
    @JsonProperty("child")
    private List<ApplicationLevelMenuItemSchema> child;
    
    
    
}


/*
    Model: VisibleOnSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VisibleOnSchema{

    

    
    
    
    
    @JsonProperty("web")
    private Boolean web;
    
    
    
    
    @JsonProperty("ios")
    private Boolean ios;
    
    
    
    
    @JsonProperty("android")
    private Boolean android;
    
    
    
}


/*
    Model: SalesChannelSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SalesChannelSchema{

    

    
    
    
    
    @JsonProperty("can_add")
    private Boolean canAdd;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: OtherSellerSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerSchema{

    

    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: FooterContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FooterContentSchema{

    

    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("line_one")
    private String lineOne;
    
    
    
    
    @JsonProperty("line_two")
    private String lineTwo;
    
    
    
}


/*
    Model: AnalyticsTagsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnalyticsTagsSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
    
    @JsonProperty("body_code")
    private String bodyCode;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("header_code")
    private String headerCode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CustomPageBySlugSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomPageBySlugSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("content")
    private List<ItemSchema> content;
    
    
    
    
    @JsonProperty("seo")
    private CreateCustomPageSeoSchema seo;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private CreatedBySchema modifiedBy;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: ItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: CreateCustomPageSeoSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateCustomPageSeoSchema{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: RawHtmlContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RawHtmlContentSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: FooterSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FooterSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("content")
    private List<RawHtmlContentSchema> content;
    
    
    
    
    @JsonProperty("footer_meta")
    private List<Object> footerMeta;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private CreatedBySchema modifiedBy;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: HomePageContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HomePageContentSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: NavItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavItemSchema{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("href")
    private String href;
    
    
    
}


/*
    Model: NavbarSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavbarSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("items")
    private List<NavItemSchema> items;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
    
    @JsonProperty("modified_by")
    private CreatedBySchema modifiedBy;
    
    
    
}


/*
    Model: MediaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MediaSchema{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("alt")
    private String alt;
    
    
    
    
    @JsonProperty("anchor_link")
    private String anchorLink;
    
    
    
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

    

    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: PricingBannerSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PricingBannerSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("web_banner")
    private MediaSchema webBanner;
    
    
    
    
    @JsonProperty("mobile_banner")
    private MediaSchema mobileBanner;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private CreatedBySchema modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
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

    

    
    
    
    
    @JsonProperty("items")
    private List<CustomItemSchema> items;
    
    
    
    
    @JsonProperty("page")
    private PageSchema page;
    
    
    
}


/*
    Model: CustomItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomItemSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("created_by")
    private UserSchema createdBy;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
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

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Double current;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("item_total")
    private Double itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: UserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSchema{

    

    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: CredentialSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CredentialSchema{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_enable")
    private Boolean isEnable;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: ConfigurationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationSchema{

    

    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
}


/*
    Model: CredentialsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CredentialsSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<CredentialSchema> items;
    
    
    
}


/*
    Model: SDKLinksResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SDKLinksResponseSchema{

    

    
    
    
    
    @JsonProperty("readmes")
    private List<SDKLinkObjectSchema> readmes;
    
    
    
}


/*
    Model: SDKLinkObjectSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SDKLinkObjectSchema{

    

    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("repo")
    private String repo;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: SDKbyTypeResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SDKbyTypeResponseSchema{

    

    
    
    
    
    @JsonProperty("readme_content")
    private String readmeContent;
    
    
    
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




}