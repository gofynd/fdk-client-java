
package com.sdk.application.catalog;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class CatalogApplicationModels{


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
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("alt")
    private String alt;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
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
    private Object title;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    Model: ProductBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBrand{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
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
    
    
    
    
    @JsonProperty("unit")
    private Object unit;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
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
    Model: ProductDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetail{
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("category_map")
    private ProductCategoryMap categoryMap;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
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
    Model: ColumnHeader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ColumnHeader{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("convertable")
    private Boolean convertable;
    
    
    
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
    
    
    
    
    @JsonProperty("col_1")
    private ColumnHeader col1;
    
    
    
    
    @JsonProperty("col_2")
    private ColumnHeader col2;
    
    
    
    
    @JsonProperty("col_6")
    private ColumnHeader col6;
    
    
    
    
    @JsonProperty("col_4")
    private ColumnHeader col4;
    
    
    
    
    @JsonProperty("col_5")
    private ColumnHeader col5;
    
    
    
    
    @JsonProperty("col_3")
    private ColumnHeader col3;
    
    
    
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
    
    
    
    
    @JsonProperty("col_1")
    private String col1;
    
    
    
    
    @JsonProperty("col_2")
    private String col2;
    
    
    
    
    @JsonProperty("col_6")
    private String col6;
    
    
    
    
    @JsonProperty("col_4")
    private String col4;
    
    
    
    
    @JsonProperty("col_5")
    private String col5;
    
    
    
    
    @JsonProperty("col_3")
    private String col3;
    
    
    
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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("headers")
    private ColumnHeaders headers;
    
    
    
    
    @JsonProperty("size_tip")
    private String sizeTip;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("sizes")
    private List<SizeChartValues> sizes;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
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
    Model: Dimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimension{
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
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
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("dimension")
    private Dimension dimension;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("seller_identifiers")
    private List<String> sellerIdentifiers;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
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
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("size_chart")
    private SizeChart sizeChart;
    
    
    
    
    @JsonProperty("stores")
    private ProductSizeStores stores;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("sizes")
    private List<ProductSize> sizes;
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("color_name")
    private String colorName;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductVariantItemResponse> items;
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
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
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetail{
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
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
    Model: Seller
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Seller{
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("store")
    private StoreDetail store;
    
    
    
    
    @JsonProperty("price")
    private ProductStockPrice price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("company")
    private CompanyDetail company;
    
    
    
    
    @JsonProperty("seller")
    private Seller seller;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductStockStatusItem> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
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
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("category_map")
    private ProductCategoryMap categoryMap;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<CustomMetaFields> customMeta;
    
    
    
    
    @JsonProperty("identifiers")
    private List<String> identifiers;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariantListingResponse> variants;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
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
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
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
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
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
    
    
    
    
    @JsonProperty("portrait")
    private Media portrait;
    
    
    
    
    @JsonProperty("landscape")
    private Media landscape;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<BrandItem> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
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
    
    
    
    
    @JsonProperty("portrait")
    private Media portrait;
    
    
    
    
    @JsonProperty("landscape")
    private Media landscape;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private CategoryBanner banners;
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<CategoryItems> items;
    
    
    
    
    @JsonProperty("department")
    private String department;
    
    
    
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
    Model: CategoryListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryListingResponse{
    
    
    
    
    @JsonProperty("data")
    private List<DepartmentCategoryTree> data;
    
    
    
    
    @JsonProperty("departments")
    private List<DepartmentIdentifier> departments;
    
    
    
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
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
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
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("collections")
    private List<Integer> collections;
    
    
    
    
    @JsonProperty("products")
    private List<Integer> products;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
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
    
    
    
    
    @JsonProperty("lat_long")
    private LatLong latLong;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Store> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Object logo;
    
    
    
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
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
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
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<AppStore> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
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
    
    
    
    
    @JsonProperty("closing")
    private Time closing;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("opening")
    private Time opening;
    
    
    
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
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
    
    @JsonProperty("timing")
    private List<StoreTiming> timing;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
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
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
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
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
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
    
    
    
    
    @JsonProperty("template_tag")
    private Object templateTag;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("media")
    private List<Object> media;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private Object groupedAttributes;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private Integer hsnCode;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("images")
    private List<Object> images;
    
    
    
    
    @JsonProperty("highlights")
    private List<Object> highlights;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("image_nature")
    private Object imageNature;
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private Object display;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
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
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("price")
    private ProductGroupPrice price;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("product_details")
    private ProductDetails productDetails;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
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
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("products")
    private List<ProductInGroup> products;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("choice")
    private Object choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<Object> pageVisibility;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
    @JsonProperty("logo")
    private Object logo;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
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
    Model: StrategyWiseListingSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StrategyWiseListingSchemaV3{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("distance")
    private Integer distance;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("tat")
    private Integer tat;
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
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
    Model: ProductStockUnitPriceV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductStockUnitPriceV3{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    Model: ReturnConfigSchemaV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfigSchemaV3{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
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
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
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
    Model: SellerV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerV3{
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<StrategyWiseListingSchemaV3> strategyWiseListing;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("price")
    private ProductStockPriceV3 price;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignmentV3 articleAssignment;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("seller_count")
    private Integer sellerCount;
    
    
    
    
    @JsonProperty("long_lat")
    private List<Double> longLat;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductStockUnitPriceV3 pricePerUnit;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<SellerGroupAttributes> groupedAttributes;
    
    
    
    
    @JsonProperty("marketplace_attributes")
    private List<MarketPlaceSttributesSchemaV3> marketplaceAttributes;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigSchemaV3 returnConfig;
    
    
    
    
    @JsonProperty("special_badge")
    private String specialBadge;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("store")
    private StoreV3 store;
    
    
    
    
    @JsonProperty("set")
    private ProductSetV3 set;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("seller")
    private SellerV3 seller;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("price_per_piece")
    private ProductStockPriceV3 pricePerPiece;
    
    
    
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
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductSizePriceResponseV3> items;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSizeSellerFilterSchemaV3> sortOn;
    
    
    
}




}