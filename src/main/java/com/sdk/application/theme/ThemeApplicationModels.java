

package com.sdk.application.theme;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ThemeApplicationModels{


/*
    Model: AllAvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllAvailablePageSchema{

    

    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
}


/*
    Model: AvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSchema{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sections")
    private List<AvailablePageSchemaSections> sections;
    
    
    
    
    @JsonProperty("sections_meta")
    private List<AvailablePageSectionMetaAttributes> sectionsMeta;
    
    
    
    
    @JsonProperty("theme")
    private String theme;
    
    
    
    
    @JsonProperty("seo")
    private AvailablePageSeo seo;
    
    
    
    
    @JsonProperty("props")
    private List<Object> props;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: AvailablePageSectionMetaAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSectionMetaAttributes{

    

    
    
    
    
    @JsonProperty("attributes")
    private HashMap<String,Object> attributes;
    
    
    
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
    Model: AvailablePageSeo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSeo{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("canonical_url")
    private String canonicalUrl;
    
    
    
    
    @JsonProperty("meta_tags")
    private List<SEOMetaItem> metaTags;
    
    
    
    
    @JsonProperty("sitemap")
    private SEOSitemap sitemap;
    
    
    
    
    @JsonProperty("breadcrumb")
    private List<SEObreadcrumb> breadcrumb;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: AvailablePageSchemaSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSchemaSections{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("props")
    private HashMap<String,Object> props;
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    @JsonProperty("preset")
    private HashMap<String,Object> preset;
    
    
    
    
    @JsonProperty("predicate")
    private AvailablePagePredicate predicate;
    
    
    
    
    @JsonProperty("__source")
    private SectionSource source;
    
    
    
    
    @JsonProperty("assets")
    private SectionAssets assets;
    
    
    
}


/*
    Model: SectionAssets
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionAssets{

    

    
    
    
    
    @JsonProperty("js")
    private String js;
    
    
    
    
    @JsonProperty("css")
    private String css;
    
    
    
}


/*
    Model: SectionSource
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionSource{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("bundle_name")
    private String bundleName;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: AvailablePagePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePagePredicate{

    

    
    
    
    
    @JsonProperty("screen")
    private AvailablePageScreenPredicate screen;
    
    
    
    
    @JsonProperty("user")
    private AvailablePageUserPredicate user;
    
    
    
    
    @JsonProperty("route")
    private AvailablePageRoutePredicate route;
    
    
    
    
    @JsonProperty("schedule")
    private AvailablePageSchedulePredicate schedule;
    
    
    
    
    @JsonProperty("platform")
    private AvailablePagePlatformPredicate platform;
    
    
    
    
    @JsonProperty("zones")
    private List<String> zones;
    
    
    
}


/*
    Model: AvailablePageScreenPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageScreenPredicate{

    

    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    @JsonProperty("desktop")
    private Boolean desktop;
    
    
    
    
    @JsonProperty("tablet")
    private Boolean tablet;
    
    
    
}


/*
    Model: AvailablePageUserPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageUserPredicate{

    

    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
}


/*
    Model: AvailablePageRoutePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageRoutePredicate{

    

    
    
    
    
    @JsonProperty("selected")
    private String selected;
    
    
    
    
    @JsonProperty("exact_url")
    private String exactUrl;
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,Object> query;
    
    
    
}


/*
    Model: AvailablePageSchedulePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSchedulePredicate{

    

    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: ThemesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemesSchema{

    

    
    
    
    
    @JsonProperty("font")
    private Font font;
    
    
    
    
    @JsonProperty("config")
    private Config config;
    
    
    
    
    @JsonProperty("applied")
    private Boolean applied;
    
    
    
    
    @JsonProperty("is_private")
    private Boolean isPrivate;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("marketplace_theme_id")
    private String marketplaceThemeId;
    
    
    
    
    @JsonProperty("meta")
    private ThemeMeta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_theme_id")
    private String templateThemeId;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("styles")
    private HashMap<String,Object> styles;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("assets")
    private Assets assets;
    
    
    
    
    @JsonProperty("available_sections")
    private List<SectionItem> availableSections;
    
    
    
    
    @JsonProperty("theme_type")
    private String themeType;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
}


/*
    Model: Font
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Font{

    

    
    
    
    
    @JsonProperty("variants")
    private FontVariants variants;
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
}


/*
    Model: FontVariants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FontVariants{

    

    
    
    
    
    @JsonProperty("light")
    private FontVariant light;
    
    
    
    
    @JsonProperty("regular")
    private FontVariant regular;
    
    
    
    
    @JsonProperty("medium")
    private FontVariant medium;
    
    
    
    
    @JsonProperty("semi_bold")
    private FontVariant semiBold;
    
    
    
    
    @JsonProperty("bold")
    private FontVariant bold;
    
    
    
}


/*
    Model: FontVariant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FontVariant{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: Config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Config{

    

    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("list")
    private List<ThemeConfiguration> list;
    
    
    
    
    @JsonProperty("global_schema")
    private GlobalSchema globalSchema;
    
    
    
    
    @JsonProperty("preset")
    private Preset preset;
    
    
    
}


/*
    Model: ThemeConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemeConfiguration{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("global_config")
    private HashMap<String,Object> globalConfig;
    
    
    
    
    @JsonProperty("page")
    private List<String> page;
    
    
    
}


/*
    Model: CustomConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomConfig{

    

    
    
    
    
    @JsonProperty("props")
    private CustomProps props;
    
    
    
}


/*
    Model: CustomProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomProps{

    

    
    
    
    
    @JsonProperty("header_bg_color")
    private String headerBgColor;
    
    
    
    
    @JsonProperty("header_text_color")
    private String headerTextColor;
    
    
    
    
    @JsonProperty("header_border_color")
    private String headerBorderColor;
    
    
    
    
    @JsonProperty("header_icon_color")
    private String headerIconColor;
    
    
    
    
    @JsonProperty("header_cart_notification_bg_color")
    private String headerCartNotificationBgColor;
    
    
    
    
    @JsonProperty("header_cart_notification_text_color")
    private String headerCartNotificationTextColor;
    
    
    
    
    @JsonProperty("header_nav_hover_color")
    private String headerNavHoverColor;
    
    
    
    
    @JsonProperty("button_primary_color")
    private String buttonPrimaryColor;
    
    
    
    
    @JsonProperty("button_primary_label_color")
    private String buttonPrimaryLabelColor;
    
    
    
    
    @JsonProperty("button_add_to_cart_color")
    private String buttonAddToCartColor;
    
    
    
    
    @JsonProperty("button_add_to_cart_label_color")
    private String buttonAddToCartLabelColor;
    
    
    
    
    @JsonProperty("button_secondary_color")
    private String buttonSecondaryColor;
    
    
    
    
    @JsonProperty("button_secondary_label_color")
    private String buttonSecondaryLabelColor;
    
    
    
    
    @JsonProperty("button_tertiary_color")
    private String buttonTertiaryColor;
    
    
    
    
    @JsonProperty("button_tertiary_label_color")
    private String buttonTertiaryLabelColor;
    
    
    
    
    @JsonProperty("button_tertiary_hover_color")
    private String buttonTertiaryHoverColor;
    
    
    
    
    @JsonProperty("button_tertiary_hover_text_color")
    private String buttonTertiaryHoverTextColor;
    
    
    
    
    @JsonProperty("text_heading_link_color")
    private String textHeadingLinkColor;
    
    
    
    
    @JsonProperty("text_body_color")
    private String textBodyColor;
    
    
    
    
    @JsonProperty("text_price_color")
    private String textPriceColor;
    
    
    
    
    @JsonProperty("text_sale_price_color")
    private String textSalePriceColor;
    
    
    
    
    @JsonProperty("text_strikethrough_price_color")
    private String textStrikethroughPriceColor;
    
    
    
    
    @JsonProperty("text_discount_color")
    private String textDiscountColor;
    
    
    
    
    @JsonProperty("footer_bg_color")
    private String footerBgColor;
    
    
    
    
    @JsonProperty("footer_text_color")
    private String footerTextColor;
    
    
    
    
    @JsonProperty("footer_border_color")
    private String footerBorderColor;
    
    
    
    
    @JsonProperty("footer_nav_hover_color")
    private String footerNavHoverColor;
    
    
    
    
    @JsonProperty("disable_cart")
    private Boolean disableCart;
    
    
    
    
    @JsonProperty("is_menu_below_logo")
    private Boolean isMenuBelowLogo;
    
    
    
    
    @JsonProperty("menu_position")
    private String menuPosition;
    
    
    
}


/*
    Model: GeneralSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneralSetting{

    

    
    
    
    
    @JsonProperty("theme")
    private ThemeSetting theme;
    
    
    
    
    @JsonProperty("text")
    private TextSetting text;
    
    
    
    
    @JsonProperty("button")
    private ButtonSetting button;
    
    
    
    
    @JsonProperty("sale_discount")
    private SaleDiscountSetting saleDiscount;
    
    
    
    
    @JsonProperty("header")
    private HeaderSetting header;
    
    
    
    
    @JsonProperty("footer")
    private FooterSetting footer;
    
    
    
}


/*
    Model: AdvanceSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AdvanceSetting{

    

    
    
    
    
    @JsonProperty("overlay_popup")
    private OverlayPopupSetting overlayPopup;
    
    
    
    
    @JsonProperty("divider_stroke_highlight")
    private DividerStrokeHighlightSetting dividerStrokeHighlight;
    
    
    
    
    @JsonProperty("user_alerts")
    private UserAlertsSetting userAlerts;
    
    
    
}


/*
    Model: UserAlertsSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserAlertsSetting{

    

    
    
    
    
    @JsonProperty("success_background")
    private String successBackground;
    
    
    
    
    @JsonProperty("success_text")
    private String successText;
    
    
    
    
    @JsonProperty("error_background")
    private String errorBackground;
    
    
    
    
    @JsonProperty("error_text")
    private String errorText;
    
    
    
    
    @JsonProperty("info_background")
    private String infoBackground;
    
    
    
    
    @JsonProperty("info_text")
    private String infoText;
    
    
    
}


/*
    Model: ThemeSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemeSetting{

    

    
    
    
    
    @JsonProperty("page_background")
    private String pageBackground;
    
    
    
    
    @JsonProperty("theme_accent")
    private String themeAccent;
    
    
    
}


/*
    Model: TextSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TextSetting{

    

    
    
    
    
    @JsonProperty("text_heading")
    private String textHeading;
    
    
    
    
    @JsonProperty("text_body")
    private String textBody;
    
    
    
    
    @JsonProperty("text_label")
    private String textLabel;
    
    
    
    
    @JsonProperty("text_secondary")
    private String textSecondary;
    
    
    
}


/*
    Model: ButtonSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ButtonSetting{

    

    
    
    
    
    @JsonProperty("button_primary")
    private String buttonPrimary;
    
    
    
    
    @JsonProperty("button_secondary")
    private String buttonSecondary;
    
    
    
    
    @JsonProperty("button_link")
    private String buttonLink;
    
    
    
}


/*
    Model: SaleDiscountSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaleDiscountSetting{

    

    
    
    
    
    @JsonProperty("sale_badge_background")
    private String saleBadgeBackground;
    
    
    
    
    @JsonProperty("sale_badge_text")
    private String saleBadgeText;
    
    
    
    
    @JsonProperty("sale_discount_text")
    private String saleDiscountText;
    
    
    
    
    @JsonProperty("sale_timer")
    private String saleTimer;
    
    
    
}


/*
    Model: HeaderSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HeaderSetting{

    

    
    
    
    
    @JsonProperty("header_background")
    private String headerBackground;
    
    
    
    
    @JsonProperty("header_nav")
    private String headerNav;
    
    
    
    
    @JsonProperty("header_icon")
    private String headerIcon;
    
    
    
}


/*
    Model: FooterSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FooterSetting{

    

    
    
    
    
    @JsonProperty("footer_background")
    private String footerBackground;
    
    
    
    
    @JsonProperty("footer_bottom_background")
    private String footerBottomBackground;
    
    
    
    
    @JsonProperty("footer_heading_text")
    private String footerHeadingText;
    
    
    
    
    @JsonProperty("footer_body_text")
    private String footerBodyText;
    
    
    
    
    @JsonProperty("footer_icon")
    private String footerIcon;
    
    
    
}


/*
    Model: OverlayPopupSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverlayPopupSetting{

    

    
    
    
    
    @JsonProperty("dialog_backgroung")
    private String dialogBackgroung;
    
    
    
    
    @JsonProperty("overlay")
    private String overlay;
    
    
    
}


/*
    Model: DividerStrokeHighlightSetting
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DividerStrokeHighlightSetting{

    

    
    
    
    
    @JsonProperty("divider_strokes")
    private String dividerStrokes;
    
    
    
    
    @JsonProperty("highlight")
    private String highlight;
    
    
    
}


/*
    Model: StaticConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StaticConfig{

    

    
    
    
    
    @JsonProperty("props")
    private StaticProps props;
    
    
    
}


/*
    Model: StaticProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StaticProps{

    

    
    
    
    
    @JsonProperty("colors")
    private Colors colors;
    
    
    
    
    @JsonProperty("auth")
    private AuthConfig auth;
    
    
    
    
    @JsonProperty("palette")
    private PaletteConfig palette;
    
    
    
}


/*
    Model: Colors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Colors{

    

    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("secondary_color")
    private String secondaryColor;
    
    
    
    
    @JsonProperty("accent_color")
    private String accentColor;
    
    
    
    
    @JsonProperty("link_color")
    private String linkColor;
    
    
    
    
    @JsonProperty("button_secondary_color")
    private String buttonSecondaryColor;
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
}


/*
    Model: AuthConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthConfig{

    

    
    
    
    
    @JsonProperty("show_header_auth")
    private Boolean showHeaderAuth;
    
    
    
    
    @JsonProperty("show_footer_auth")
    private Boolean showFooterAuth;
    
    
    
}


/*
    Model: PaletteConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaletteConfig{

    

    
    
    
    
    @JsonProperty("general_setting")
    private GeneralSetting generalSetting;
    
    
    
    
    @JsonProperty("advance_setting")
    private AdvanceSetting advanceSetting;
    
    
    
}


/*
    Model: ThemeMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemeMeta{

    

    
    
    
    
    @JsonProperty("payment")
    private ThemePayment payment;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("industry")
    private List<String> industry;
    
    
    
    
    @JsonProperty("release")
    private Release release;
    
    
    
    
    @JsonProperty("images")
    private Images images;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ThemePayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemePayment{

    

    
    
    
    
    @JsonProperty("is_paid")
    private Boolean isPaid;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
}


/*
    Model: Release
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Release{

    

    
    
    
    
    @JsonProperty("notes")
    private String notes;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
}


/*
    Model: Images
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Images{

    

    
    
    
    
    @JsonProperty("desktop")
    private String desktop;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: Assets
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Assets{

    

    
    
    
    
    @JsonProperty("umd_js")
    private UMDJs umdJs;
    
    
    
    
    @JsonProperty("common_js")
    private CommonJS commonJs;
    
    
    
    
    @JsonProperty("css")
    private CSS css;
    
    
    
}


/*
    Model: UMDJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UMDJs{

    

    
    
    
    
    @JsonProperty("links")
    private List<String> links;
    
    
    
}


/*
    Model: CommonJS
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonJS{

    

    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: CSS
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CSS{

    

    
    
    
    
    @JsonProperty("links")
    private List<String> links;
    
    
    
}


/*
    Model: SectionItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionItem{

    

    
    
    
    
    @JsonProperty("props")
    private List<Object> props;
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
}


/*
    Model: GlobalSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSchema{

    

    
    
    
    
    @JsonProperty("props")
    private List<Prop> props;
    
    
    
}


/*
    Model: Prop
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Prop{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
}


/*
    Model: Preset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Preset{

    

    
    
    
    
    @JsonProperty("pages")
    private List<Page> pages;
    
    
    
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

    

    
    
    
    
    @JsonProperty("sections")
    private List<Section> sections;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: SectionProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionProps{

    

    
    
    
    
    @JsonProperty("title")
    private TextProp title;
    
    
    
    
    @JsonProperty("item_margin")
    private TextProp itemMargin;
    
    
    
    
    @JsonProperty("autoplay")
    private CheckboxProp autoplay;
    
    
    
    
    @JsonProperty("slide_interval")
    private RangeProp slideInterval;
    
    
    
}


/*
    Model: SectionPreset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SectionPreset{

    

    
    
    
    
    @JsonProperty("blocks")
    private List<Block> blocks;
    
    
    
}


/*
    Model: ImagePickerProp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ImagePickerProp{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: UrlProp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UrlProp{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: BlockProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlockProps{

    

    
    
    
    
    @JsonProperty("image")
    private ImagePickerProp image;
    
    
    
    
    @JsonProperty("slide_link")
    private UrlProp slideLink;
    
    
    
}


/*
    Model: TextProp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TextProp{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CheckboxProp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckboxProp{

    

    
    
    
    
    @JsonProperty("value")
    private Boolean value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: RangeProp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RangeProp{

    

    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Section
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Section{

    

    
    
    
    
    @JsonProperty("blocks")
    private List<Block> blocks;
    
    
    
    
    @JsonProperty("predicate")
    private Predicate predicate;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("props")
    private SectionProps props;
    
    
    
    
    @JsonProperty("preset")
    private SectionPreset preset;
    
    
    
}


/*
    Model: Block
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Block{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("props")
    private BlockProps props;
    
    
    
}


/*
    Model: Predicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Predicate{

    

    
    
    
    
    @JsonProperty("screen")
    private Screen screen;
    
    
    
    
    @JsonProperty("user")
    private ThemeUserSchema user;
    
    
    
    
    @JsonProperty("route")
    private Route route;
    
    
    
}


/*
    Model: Screen
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Screen{

    

    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    @JsonProperty("desktop")
    private Boolean desktop;
    
    
    
    
    @JsonProperty("tablet")
    private Boolean tablet;
    
    
    
}


/*
    Model: ThemeUserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemeUserSchema{

    

    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
}


/*
    Model: Route
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Route{

    

    
    
    
    
    @JsonProperty("selected")
    private String selected;
    
    
    
    
    @JsonProperty("exact_url")
    private String exactUrl;
    
    
    
}


/*
    Model: AvailablePagePlatformPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePagePlatformPredicate{

    

    
    
    
    
    @JsonProperty("ios")
    private Boolean ios;
    
    
    
    
    @JsonProperty("android")
    private Boolean android;
    
    
    
    
    @JsonProperty("web")
    private Boolean web;
    
    
    
}


/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlitzkriegInternalServerErrorSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BlitzkriegApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlitzkriegApiErrorSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
        Enum: PageType
        Used By: Theme
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