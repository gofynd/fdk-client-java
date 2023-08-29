
package com.sdk.application.theme;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
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
    private Object attributes;
    
    
    
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
    private Object props;
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    @JsonProperty("preset")
    private Object preset;
    
    
    
    
    @JsonProperty("predicate")
    private AvailablePagePredicate predicate;
    
    
    
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
    private Object query;
    
    
    
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
    private Meta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_theme_id")
    private String templateThemeId;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("styles")
    private Object styles;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("assets")
    private Assets assets;
    
    
    
    
    @JsonProperty("available_sections")
    private List<SectionItem> availableSections;
    
    
    
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
    private GlobalConfig globalConfig;
    
    
    
    
    @JsonProperty("custom")
    private CustomConfig custom;
    
    
    
    
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
    Model: GlobalConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalConfig{
    
    
    
    
    @JsonProperty("statics")
    private StaticConfig statics;
    
    
    
    
    @JsonProperty("auth")
    private AuthConfig auth;
    
    
    
    
    @JsonProperty("palette")
    private PaletteConfig palette;
    
    
    
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
    Model: Meta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Meta{
    
    
    
    
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




}