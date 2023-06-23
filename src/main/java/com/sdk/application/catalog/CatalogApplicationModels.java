
package com.sdk.application.catalog;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class CatalogApplicationModels{


/*
    Model: ProductListingActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingActionPage{
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
}


/*
    Model: ProductListingAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingAction{
    
    
    
    
    @JsonProperty("page")
    private ProductListingActionPage page;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ApplicationItemSEO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemSEO{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: ProductDetailAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailAttribute{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ProductDetailGroupedAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailGroupedAttribute{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("details")
    private List<ProductDetailAttribute> details;
    
    
    
}


/*
    Model: Price
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Price{
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
}


/*
    Model: ProductListingPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingPrice{
    
    
    
    
    @JsonProperty("marked")
    private Price marked;
    
    
    
    
    @JsonProperty("effective")
    private Price effective;
    
    
    
}


/*
    Model: CustomMetaFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomMetaFields{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: Media
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("alt")
    private String alt;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ProductBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBrand{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
}


/*
    Model: NetQuantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NetQuantity{
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ApplicationItemMOQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemMOQ{
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
}


/*
    Model: ProductCategoryMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCategoryMap{
    
    
    
    
    @JsonProperty("l1")
    private ProductBrand l1;
    
    
    
    
    @JsonProperty("l3")
    private ProductBrand l3;
    
    
    
    
    @JsonProperty("l2")
    private ProductBrand l2;
    
    
    
}


/*
    Model: ProductDetailCustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailCustomOrder{
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
}


/*
    Model: ProductDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetail{
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("category_map")
    private ProductCategoryMap categoryMap;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("custom_order")
    private ProductDetailCustomOrder customOrder;
    
    
    
}


/*
    Model: ErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponse{
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: SizeChartValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeChartValues{
    
    
    
    
    @JsonProperty("col_5")
    private String col5;
    
    
    
    
    @JsonProperty("col_3")
    private String col3;
    
    
    
    
    @JsonProperty("col_4")
    private String col4;
    
    
    
    
    @JsonProperty("col_2")
    private String col2;
    
    
    
    
    @JsonProperty("col_1")
    private String col1;
    
    
    
    
    @JsonProperty("col_6")
    private String col6;
    
    
    
}


/*
    Model: ColumnHeader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ColumnHeader{
    
    
    
    
    @JsonProperty("convertable")
    private Boolean convertable;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: ColumnHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ColumnHeaders{
    
    
    
    
    @JsonProperty("col_5")
    private ColumnHeader col5;
    
    
    
    
    @JsonProperty("col_3")
    private ColumnHeader col3;
    
    
    
    
    @JsonProperty("col_4")
    private ColumnHeader col4;
    
    
    
    
    @JsonProperty("col_2")
    private ColumnHeader col2;
    
    
    
    
    @JsonProperty("col_1")
    private ColumnHeader col1;
    
    
    
    
    @JsonProperty("col_6")
    private ColumnHeader col6;
    
    
    
}


/*
    Model: SizeChart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeChart{
    
    
    
    
    @JsonProperty("size_tip")
    private String sizeTip;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("sizes")
    private List<SizeChartValues> sizes;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("headers")
    private ColumnHeaders headers;
    
    
    
}


/*
    Model: Weight
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Weight{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: Dimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimension{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
}


/*
    Model: ProductSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSize{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("seller_identifiers")
    private List<String> sellerIdentifiers;
    
    
    
    
    @JsonProperty("dimension")
    private Dimension dimension;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
}


/*
    Model: ProductSizeStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeStores{
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ProductSizes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizes{
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("size_chart")
    private SizeChart sizeChart;
    
    
    
    
    @JsonProperty("sizes")
    private List<ProductSize> sizes;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("stores")
    private ProductSizeStores stores;
    
    
    
}


/*
    Model: AttributeDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeDetail{
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: AttributeMetadata
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMetadata{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("details")
    private List<AttributeDetail> details;
    
    
    
}


/*
    Model: ProductsComparisonResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsComparisonResponse{
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
}


/*
    Model: ProductCompareResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCompareResponse{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
}


/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFrequentlyComparedSimilarResponse{
    
    
    
    
    @JsonProperty("similars")
    private ProductCompareResponse similars;
    
    
    
}


/*
    Model: ProductVariantItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductVariantItemResponse{
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("color_name")
    private String colorName;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: ProductVariantResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductVariantResponse{
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("items")
    private List<ProductVariantItemResponse> items;
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
}


/*
    Model: ProductVariantsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductVariantsResponse{
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariantResponse> variants;
    
    
    
}


/*
    Model: CompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDetail{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ProductStockPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockPrice{
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: Seller
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Seller{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetail{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: ProductStockStatusItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockStatusItem{
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("company")
    private CompanyDetail company;
    
    
    
    
    @JsonProperty("price")
    private ProductStockPrice price;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller")
    private Seller seller;
    
    
    
    
    @JsonProperty("store")
    private StoreDetail store;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
}


/*
    Model: ProductStockStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockStatusResponse{
    
    
    
    
    @JsonProperty("items")
    private List<ProductStockStatusItem> items;
    
    
    
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
    Model: ProductStockPolling
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockPolling{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductStockStatusItem> items;
    
    
    
}


/*
    Model: ProductSortOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSortOn{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ProductFiltersKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersKey{
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersValue{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ProductFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFilters{
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
}


/*
    Model: ProductVariantListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductVariantListingResponse{
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("items")
    private List<ProductVariantItemResponse> items;
    
    
    
}


/*
    Model: ProductListingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingDetail{
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariantListingResponse> variants;
    
    
    
    
    @JsonProperty("identifiers")
    private List<String> identifiers;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("category_map")
    private ProductCategoryMap categoryMap;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("custom_order")
    private ProductDetailCustomOrder customOrder;
    
    
    
}


/*
    Model: ProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingResponse{
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
}


/*
    Model: ImageUrls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ImageUrls{
    
    
    
    
    @JsonProperty("landscape")
    private Media landscape;
    
    
    
    
    @JsonProperty("portrait")
    private Media portrait;
    
    
    
}


/*
    Model: BrandItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandItem{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: BrandListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandListingResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<BrandItem> items;
    
    
    
}


/*
    Model: BrandDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandDetailResponse{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
}


/*
    Model: DepartmentIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentIdentifier{
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: ThirdLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThirdLevelChild{
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: SecondLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SecondLevelChild{
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: Child
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Child{
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: CategoryBanner
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryBanner{
    
    
    
    
    @JsonProperty("landscape")
    private Media landscape;
    
    
    
    
    @JsonProperty("portrait")
    private Media portrait;
    
    
    
}


/*
    Model: CategoryItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryItems{
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("banners")
    private CategoryBanner banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: DepartmentCategoryTree
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCategoryTree{
    
    
    
    
    @JsonProperty("department")
    private String department;
    
    
    
    
    @JsonProperty("items")
    private List<CategoryItems> items;
    
    
    
}


/*
    Model: CategoryListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryListingResponse{
    
    
    
    
    @JsonProperty("departments")
    private List<DepartmentIdentifier> departments;
    
    
    
    
    @JsonProperty("data")
    private List<DepartmentCategoryTree> data;
    
    
    
}


/*
    Model: CategoryMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryMetaResponse{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
}


/*
    Model: HomeListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HomeListingResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
}


/*
    Model: Department
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Department{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: DepartmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentResponse{
    
    
    
    
    @JsonProperty("items")
    private List<Department> items;
    
    
    
}


/*
    Model: AutocompleteItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteItem{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
}


/*
    Model: AutoCompleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutoCompleteResponse{
    
    
    
    
    @JsonProperty("items")
    private List<AutocompleteItem> items;
    
    
    
}


/*
    Model: CollectionListingFilterType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilterType{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CollectionListingFilterTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilterTag{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CollectionListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilter{
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
}


/*
    Model: CollectionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionQuery{
    
    
    
    
    @JsonProperty("attribute")
    private String attribute;
    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
}


/*
    Model: GetCollectionDetailNest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionDetailNest{
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
}


/*
    Model: GetCollectionListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionListingResponse{
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
}


/*
    Model: CollectionDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionDetailResponse{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
}


/*
    Model: GetFollowListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFollowListingResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
}


/*
    Model: FollowPostResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FollowPostResponse{
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: FollowerCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FollowerCountResponse{
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: FollowIdsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FollowIdsData{
    
    
    
    
    @JsonProperty("products")
    private List<Integer> products;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
    @JsonProperty("collections")
    private List<Integer> collections;
    
    
    
}


/*
    Model: FollowIdsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FollowIdsResponse{
    
    
    
    
    @JsonProperty("data")
    private FollowIdsData data;
    
    
    
}


/*
    Model: LatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LatLong{
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Store
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Store{
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("lat_long")
    private LatLong latLong;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
}


/*
    Model: StoreListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreListingResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Store> items;
    
    
    
}


/*
    Model: SellerPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerPhoneNumber{
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
}


/*
    Model: StoreManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreManagerSerializer{
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CompanyStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyStore{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: StoreDepartments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDepartments{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Object logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: StoreAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreAddressSerializer{
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
}


/*
    Model: AppStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppStore{
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
}


/*
    Model: ApplicationStoreListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationStoreListing{
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<AppStore> items;
    
    
    
}


/*
    Model: Time
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Time{
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
}


/*
    Model: StoreTiming
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreTiming{
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("closing")
    private Time closing;
    
    
    
    
    @JsonProperty("opening")
    private Time opening;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
}


/*
    Model: StoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetails{
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("timing")
    private List<StoreTiming> timing;
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
}


/*
    Model: UserDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetail{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
}


/*
    Model: ProductDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetails{
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("media")
    private List<Object> media;
    
    
    
    
    @JsonProperty("hsn_code")
    private Integer hsnCode;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private Object groupedAttributes;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
}


/*
    Model: ProductGroupPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductGroupPrice{
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: Size
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Size{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: ProductInGroup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductInGroup{
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("product_details")
    private ProductDetails productDetails;
    
    
    
    
    @JsonProperty("price")
    private ProductGroupPrice price;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
}


/*
    Model: ProductGroupingModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductGroupingModel{
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("products")
    private List<ProductInGroup> products;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
}


/*
    Model: ProductBundle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundle{
    
    
    
    
    @JsonProperty("items")
    private List<ProductGroupingModel> items;
    
    
    
}


/*
    Model: ProductStockPriceV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockPriceV3{
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
}


/*
    Model: ReturnConfigSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfigSchemaV3{
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: DetailsSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DetailsSchemaV3{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: SellerGroupAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerGroupAttributes{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("details")
    private List<DetailsSchemaV3> details;
    
    
    
}


/*
    Model: MarketPlaceSttributesSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MarketPlaceSttributesSchemaV3{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("details")
    private List<DetailsSchemaV3> details;
    
    
    
}


/*
    Model: ProductSetDistributionSizeV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSetDistributionSizeV3{
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: ProductSetDistributionV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSetDistributionV3{
    
    
    
    
    @JsonProperty("sizes")
    private List<ProductSetDistributionSizeV3> sizes;
    
    
    
}


/*
    Model: ProductSetV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSetV3{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size_distribution")
    private ProductSetDistributionV3 sizeDistribution;
    
    
    
}


/*
    Model: ProductStockUnitPriceV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockUnitPriceV3{
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: StrategyWiseListingSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StrategyWiseListingSchemaV3{
    
    
    
    
    @JsonProperty("distance")
    private Integer distance;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("tat")
    private Integer tat;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
}


/*
    Model: SellerV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerV3{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: DiscountMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountMeta{
    
    
    
    
    @JsonProperty("timer")
    private Boolean timer;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("number_of_minutes")
    private Integer numberOfMinutes;
    
    
    
}


/*
    Model: ArticleAssignmentV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentV3{
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: StoreV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreV3{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: ProductSizePriceResponseV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizePriceResponseV3{
    
    
    
    
    @JsonProperty("price_per_piece")
    private ProductStockPriceV3 pricePerPiece;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigSchemaV3 returnConfig;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<SellerGroupAttributes> groupedAttributes;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("price")
    private ProductStockPriceV3 price;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("long_lat")
    private List<Double> longLat;
    
    
    
    
    @JsonProperty("marketplace_attributes")
    private List<MarketPlaceSttributesSchemaV3> marketplaceAttributes;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("set")
    private ProductSetV3 set;
    
    
    
    
    @JsonProperty("seller_count")
    private Integer sellerCount;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductStockUnitPriceV3 pricePerUnit;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<StrategyWiseListingSchemaV3> strategyWiseListing;
    
    
    
    
    @JsonProperty("seller")
    private SellerV3 seller;
    
    
    
    
    @JsonProperty("discount_meta")
    private DiscountMeta discountMeta;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignmentV3 articleAssignment;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("special_badge")
    private String specialBadge;
    
    
    
    
    @JsonProperty("store")
    private StoreV3 store;
    
    
    
}


/*
    Model: ProductSizeSellerFilterSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeSellerFilterSchemaV3{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ProductSizeSellersResponseV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeSellersResponseV3{
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSizeSellerFilterSchemaV3> sortOn;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductSizePriceResponseV3> items;
    
    
    
}




}