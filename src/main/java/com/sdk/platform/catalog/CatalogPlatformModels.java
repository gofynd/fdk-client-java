
package com.sdk.platform.catalog;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class CatalogPlatformModels{


/*
    Model: DeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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
    Model: GetSearchWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsData{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
}


/*
    Model: GetSearchWordsDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsDetailResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private GetSearchWordsData items;
    
    
    
}


/*
    Model: SearchKeywordResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SearchKeywordResult{
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
}


/*
    Model: CreateSearchKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSearchKeyword{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("result")
    private SearchKeywordResult result;
    
    
    
}


/*
    Model: GetSearchWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetSearchWordsData> items;
    
    
    
}


/*
    Model: GetAutocompleteWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAutocompleteWordsData{
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
}


/*
    Model: GetAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAutocompleteWordsResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetAutocompleteWordsData> items;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: AutocompletePageAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompletePageAction{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: AutocompleteAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteAction{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("page")
    private AutocompletePageAction page;
    
    
    
}


/*
    Model: AutocompleteResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteResult{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("action")
    private AutocompleteAction action;
    
    
    
}


/*
    Model: CreateAutocompleteKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAutocompleteKeyword{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<AutocompleteResult> results;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
}


/*
    Model: CreateAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAutocompleteWordsResponse{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: ProductBundleItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleItem{
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
}


/*
    Model: GetProductBundleCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleCreateResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: GetProductBundleListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleListingResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetProductBundleCreateResponse> items;
    
    
    
}


/*
    Model: ProductBundleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleRequest{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: LimitedProductData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LimitedProductData{
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("price")
    private Object price;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: GetProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProducts{
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("product_details")
    private LimitedProductData productDetails;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
}


/*
    Model: GetProductBundleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleResponse{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("products")
    private List<GetProducts> products;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
}


/*
    Model: ProductBundleUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleUpdateRequest{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
}


/*
    Model: ListSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListSizeGuide{
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
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
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
    @JsonProperty("headers")
    private Object headers;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: Guide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Guide{
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
}


/*
    Model: ValidateSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateSizeGuide{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("guide")
    private Guide guide;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: SuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SizeGuideResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeGuideResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("guide")
    private Object guide;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
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
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
}


/*
    Model: MetaFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaFields{
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("key")
    private Object key;
    
    
    
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
    Model: ApplicationItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemMeta{
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<MetaFields> customMeta;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
}


/*
    Model: SuccessResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponse1{
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: MOQData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MOQData{
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
}


/*
    Model: SEOData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOData{
    
    
    
    
    @JsonProperty("title")
    private Object title;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
}


/*
    Model: OwnerAppItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OwnerAppItemResponse{
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("moq")
    private MOQData moq;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("seo")
    private SEOData seo;
    
    
    
}


/*
    Model: GetConfigMetadataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetConfigMetadataResponse{
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
    @JsonProperty("condition")
    private List<Object> condition;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
}


/*
    Model: PageResponseType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageResponseType{
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("next")
    private Integer next;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
}


/*
    Model: GetConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetConfigResponse{
    
    
    
    
    @JsonProperty("page")
    private PageResponseType page;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
}


/*
    Model: ConfigErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigErrorResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AttributeDetailsGroup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeDetailsGroup{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
}


/*
    Model: AppConfigurationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfigurationDetail{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("attributes")
    private List<AttributeDetailsGroup> attributes;
    
    
    
    
    @JsonProperty("template_slugs")
    private List<String> templateSlugs;
    
    
    
}


/*
    Model: ConfigSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigSuccessResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AppConfigurationsSort
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfigurationsSort{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: AllowSingleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllowSingleRequest{
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
}


/*
    Model: DefaultKeyRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultKeyRequest{
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationDetailsProduct{
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    @JsonProperty("similar")
    private Object similar;
    
    
    
    
    @JsonProperty("compare")
    private Object compare;
    
    
    
    
    @JsonProperty("variant")
    private Object variant;
    
    
    
}


/*
    Model: MetaDataListingFilterMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingFilterMetaResponse{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("units")
    private List<Object> units;
    
    
    
    
    @JsonProperty("filter_types")
    private List<String> filterTypes;
    
    
    
}


/*
    Model: MetaDataListingFilterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingFilterResponse{
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingFilterMetaResponse> data;
    
    
    
}


/*
    Model: MetaDataListingSortMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingSortMetaResponse{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: MetaDataListingSortResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingSortResponse{
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingSortMetaResponse> data;
    
    
    
}


/*
    Model: MetaDataListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingResponse{
    
    
    
    
    @JsonProperty("filter")
    private MetaDataListingFilterResponse filter;
    
    
    
    
    @JsonProperty("sort")
    private MetaDataListingSortResponse sort;
    
    
    
}


/*
    Model: GetCatalogConfigurationMetaData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationMetaData{
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
    @JsonProperty("listing")
    private MetaDataListingResponse listing;
    
    
    
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
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
}


/*
    Model: ConfigurationProductConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductConfig{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
}


/*
    Model: ConfigurationProductSimilar
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductSimilar{
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductConfig> config;
    
    
    
}


/*
    Model: ConfigurationProductVariantConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductVariantConfig{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
}


/*
    Model: ConfigurationProductVariant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductVariant{
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductVariantConfig> config;
    
    
    
}


/*
    Model: ConfigurationProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProduct{
    
    
    
    
    @JsonProperty("similar")
    private ConfigurationProductSimilar similar;
    
    
    
    
    @JsonProperty("variant")
    private ConfigurationProductVariant variant;
    
    
    
}


/*
    Model: ConfigurationBucketPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationBucketPoints{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("end")
    private Double end;
    
    
    
    
    @JsonProperty("start")
    private Double start;
    
    
    
}


/*
    Model: ConfigurationListingFilterValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilterValue{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("map_values")
    private List<Object> mapValues;
    
    
    
    
    @JsonProperty("map")
    private Object map;
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
    
    @JsonProperty("bucket_points")
    private List<ConfigurationBucketPoints> bucketPoints;
    
    
    
}


/*
    Model: ConfigurationListingFilterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilterConfig{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("value_config")
    private ConfigurationListingFilterValue valueConfig;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: ConfigurationListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilter{
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
    
    @JsonProperty("attribute_config")
    private List<ConfigurationListingFilterConfig> attributeConfig;
    
    
    
}


/*
    Model: ConfigurationListingSortConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingSortConfig{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: ConfigurationListingSort
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingSort{
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationListingSortConfig> config;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
}


/*
    Model: ConfigurationListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListing{
    
    
    
    
    @JsonProperty("filter")
    private ConfigurationListingFilter filter;
    
    
    
    
    @JsonProperty("sort")
    private ConfigurationListingSort sort;
    
    
    
}


/*
    Model: AppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCatalogConfiguration{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: GetAppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAppCatalogConfiguration{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("data")
    private AppCatalogConfiguration data;
    
    
    
}


/*
    Model: AppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfiguration{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationDetailsSchemaListing{
    
    
    
    
    @JsonProperty("filter")
    private Object filter;
    
    
    
    
    @JsonProperty("sort")
    private Object sort;
    
    
    
}


/*
    Model: EntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityConfiguration{
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
    @JsonProperty("listing")
    private GetCatalogConfigurationDetailsSchemaListing listing;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
}


/*
    Model: GetAppCatalogEntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAppCatalogEntityConfiguration{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("data")
    private EntityConfiguration data;
    
    
    
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
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersValue{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("operators")
    private List<String> operators;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
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
    Model: GetCollectionQueryOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionQueryOptionResponse{
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("operators")
    private HashMap<String,String> operators;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
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
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Action{
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Media1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media1{
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: BannerImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BannerImage{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    private BannerImage landscape;
    
    
    
    
    @JsonProperty("portrait")
    private BannerImage portrait;
    
    
    
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
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
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
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
}


/*
    Model: CollectionSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionSchedule{
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
}


/*
    Model: UserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserInfo{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: CollectionBadge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionBadge{
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
}


/*
    Model: CollectionImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionImage{
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: CollectionBanner
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionBanner{
    
    
    
    
    @JsonProperty("landscape")
    private CollectionImage landscape;
    
    
    
    
    @JsonProperty("portrait")
    private CollectionImage portrait;
    
    
    
}


/*
    Model: SeoDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoDetail{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: CreateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateCollection{
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo createdBy;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
}


/*
    Model: CollectionCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionCreateResponse{
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private BannerImage logo;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: UpdateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCollection{
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
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
    Model: Price1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Price1{
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
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
    
    
    
    
    @JsonProperty("effective")
    private Price1 effective;
    
    
    
    
    @JsonProperty("marked")
    private Price1 marked;
    
    
    
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
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
}


/*
    Model: GetCollectionItemsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionItemsResponse{
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
}


/*
    Model: CollectionItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionItem{
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
}


/*
    Model: CollectionItemUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionItemUpdate{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("items")
    private List<CollectionItem> items;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
}


/*
    Model: UpdatedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatedResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items_not_updated")
    private List<Integer> itemsNotUpdated;
    
    
    
}


/*
    Model: CatalogInsightItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightItem{
    
    
    
    
    @JsonProperty("out_of_stock_count")
    private Integer outOfStockCount;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("sellable_count")
    private Integer sellableCount;
    
    
    
}


/*
    Model: CatalogInsightBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightBrand{
    
    
    
    
    @JsonProperty("total_sizes")
    private Integer totalSizes;
    
    
    
    
    @JsonProperty("total_articles")
    private Integer totalArticles;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("article_freshness")
    private Integer articleFreshness;
    
    
    
    
    @JsonProperty("available_sizes")
    private Integer availableSizes;
    
    
    
    
    @JsonProperty("available_articles")
    private Integer availableArticles;
    
    
    
}


/*
    Model: CatalogInsightResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightResponse{
    
    
    
    
    @JsonProperty("item")
    private CatalogInsightItem item;
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
}


/*
    Model: CrossSellingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CrossSellingData{
    
    
    
    
    @JsonProperty("products")
    private Integer products;
    
    
    
    
    @JsonProperty("articles")
    private Integer articles;
    
    
    
}


/*
    Model: CrossSellingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CrossSellingResponse{
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
    @JsonProperty("data")
    private CrossSellingData data;
    
    
    
}


/*
    Model: OptInPostRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptInPostRequest{
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CompanyOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyOptIn{
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
}


/*
    Model: GetOptInPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOptInPlatform{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyOptIn> items;
    
    
    
}


/*
    Model: OptinCompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyDetail{
    
    
    
    
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
    Model: CompanyBrandDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandDetail{
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("total_article")
    private Integer totalArticle;
    
    
    
}


/*
    Model: OptinCompanyBrandDetailsView
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyBrandDetailsView{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandDetail> items;
    
    
    
}


/*
    Model: OptinCompanyMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyMetrics{
    
    
    
    
    @JsonProperty("brand")
    private Integer brand;
    
    
    
    
    @JsonProperty("store")
    private Integer store;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
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
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("timing")
    private Object timing;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("documents")
    private List<Object> documents;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("manager")
    private Object manager;
    
    
    
    
    @JsonProperty("additional_contacts")
    private List<Object> additionalContacts;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: OptinStoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinStoreDetails{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<StoreDetail> items;
    
    
    
}


/*
    Model: AttributeMasterFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterFilter{
    
    
    
    
    @JsonProperty("indexing")
    private Boolean indexing;
    
    
    
    
    @JsonProperty("depends_on")
    private List<String> dependsOn;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: AttributeMasterMandatoryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterMandatoryDetails{
    
    
    
    
    @JsonProperty("l3_keys")
    private List<String> l3Keys;
    
    
    
}


/*
    Model: AttributeMasterMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterMeta{
    
    
    
    
    @JsonProperty("mandatory_details")
    private AttributeMasterMandatoryDetails mandatoryDetails;
    
    
    
    
    @JsonProperty("enriched")
    private Boolean enriched;
    
    
    
}


/*
    Model: AttributeMasterDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterDetails{
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
}


/*
    Model: AttributeSchemaRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeSchemaRange{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
}


/*
    Model: AttributeMaster
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMaster{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allowed_values")
    private List<String> allowedValues;
    
    
    
    
    @JsonProperty("multi")
    private Boolean multi;
    
    
    
    
    @JsonProperty("range")
    private AttributeSchemaRange range;
    
    
    
    
    @JsonProperty("mandatory")
    private Boolean mandatory;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
}


/*
    Model: GenderDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenderDetail{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("meta")
    private AttributeMasterMeta meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
}


/*
    Model: CategoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoriesResponse{
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_slug")
    private String templateSlug;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
}


/*
    Model: ProdcutTemplateCategoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProdcutTemplateCategoriesResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CategoriesResponse> items;
    
    
    
}


/*
    Model: PTErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PTErrorResponse{
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
}


/*
    Model: UserSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer{
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
}


/*
    Model: GetDepartment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDepartment{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: DepartmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentsResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetDepartment> items;
    
    
    
}


/*
    Model: DepartmentErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentErrorResponse{
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
}


/*
    Model: DepartmentCreateUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateUpdate{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
}


/*
    Model: DepartmentCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: DepartmentCreateErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateErrorResponse{
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
}


/*
    Model: DepartmentModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentModel{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
    @JsonProperty("logo")
    private Object logo;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("synonyms")
    private List<Object> synonyms;
    
    
    
    
    @JsonProperty("_cls")
    private Object cls;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: ProductTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTemplate{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: TemplatesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplatesResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductTemplate items;
    
    
    
}


/*
    Model: TemplateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateDetails{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
}


/*
    Model: Properties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Properties{
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    @JsonProperty("size_guide")
    private Object sizeGuide;
    
    
    
    
    @JsonProperty("is_dependent")
    private Object isDependent;
    
    
    
    
    @JsonProperty("command")
    private Object command;
    
    
    
    
    @JsonProperty("trader")
    private Object trader;
    
    
    
    
    @JsonProperty("trader_type")
    private Object traderType;
    
    
    
    
    @JsonProperty("product_group_tag")
    private Object productGroupTag;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("product_publish")
    private Object productPublish;
    
    
    
    
    @JsonProperty("multi_size")
    private Object multiSize;
    
    
    
    
    @JsonProperty("sizes")
    private Object sizes;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    @JsonProperty("category_slug")
    private Object categorySlug;
    
    
    
    
    @JsonProperty("brand_uid")
    private Object brandUid;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    @JsonProperty("hsn_code")
    private Object hsnCode;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("highlights")
    private Object highlights;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Object noOfBoxes;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("media")
    private Object media;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private Object itemType;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
}


/*
    Model: GlobalValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalValidation{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("properties")
    private Properties properties;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("definitions")
    private Object definitions;
    
    
    
}


/*
    Model: TemplateValidationData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateValidationData{
    
    
    
    
    @JsonProperty("global_validation")
    private GlobalValidation globalValidation;
    
    
    
    
    @JsonProperty("template_validation")
    private Object templateValidation;
    
    
    
}


/*
    Model: TemplatesValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplatesValidationResponse{
    
    
    
    
    @JsonProperty("template_details")
    private TemplateDetails templateDetails;
    
    
    
    
    @JsonProperty("data")
    private TemplateValidationData data;
    
    
    
}


/*
    Model: InventoryValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryValidationResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: HSNData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNData{
    
    
    
    
    @JsonProperty("country_of_origin")
    private List<String> countryOfOrigin;
    
    
    
    
    @JsonProperty("hsn_code")
    private List<String> hsnCode;
    
    
    
}


/*
    Model: HSNCodesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNCodesResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private HSNData data;
    
    
    
}


/*
    Model: UserInfo1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserInfo1{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: ProductTemplateExportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTemplateExportResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
}


/*
    Model: ProductDownloadsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadsResponse{
    
    
    
    
    @JsonProperty("items")
    private List<ProductTemplateExportResponse> items;
    
    
    
}


/*
    Model: ProductTemplateExportFilterRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTemplateExportFilterRequest{
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("catalogue_types")
    private List<String> catalogueTypes;
    
    
    
    
    @JsonProperty("brands")
    private List<String> brands;
    
    
    
    
    @JsonProperty("templates")
    private List<String> templates;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
}


/*
    Model: ProductTemplateDownloadsExport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTemplateDownloadsExport{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private ProductTemplateExportFilterRequest filters;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
}


/*
    Model: ProductConfigurationDownloads
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductConfigurationDownloads{
    
    
    
    
    @JsonProperty("multivalue")
    private Boolean multivalue;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
}


/*
    Model: Media2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media2{
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
}


/*
    Model: CategoryMappingValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryMappingValues{
    
    
    
    
    @JsonProperty("catalog_id")
    private Integer catalogId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CategoryMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryMapping{
    
    
    
    
    @JsonProperty("google")
    private CategoryMappingValues google;
    
    
    
    
    @JsonProperty("facebook")
    private CategoryMappingValues facebook;
    
    
    
    
    @JsonProperty("ajio")
    private CategoryMappingValues ajio;
    
    
    
}


/*
    Model: Hierarchy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Hierarchy{
    
    
    
    
    @JsonProperty("l1")
    private Integer l1;
    
    
    
    
    @JsonProperty("department")
    private Integer department;
    
    
    
    
    @JsonProperty("l2")
    private Integer l2;
    
    
    
}


/*
    Model: Category
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Category{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: CategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Category> items;
    
    
    
}


/*
    Model: CategoryRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryRequestBody{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
}


/*
    Model: CategoryCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryCreateResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: SingleCategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SingleCategoryResponse{
    
    
    
    
    @JsonProperty("data")
    private Category data;
    
    
    
}


/*
    Model: CategoryUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryUpdateResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: VerifiedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifiedBy{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: Trader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
}


/*
    Model: ProductPublish
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublish{
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
}


/*
    Model: Logo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Logo{
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Integer aspectRatioF;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: Brand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Brand{
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ReturnConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfigResponse{
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
}


/*
    Model: Image
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Image{
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Double aspectRatioF;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: NetQuantityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NetQuantityResponse{
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ProductSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSchemaV2{
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("all_company_ids")
    private List<Integer> allCompanyIds;
    
    
    
    
    @JsonProperty("verified_by")
    private VerifiedBy verifiedBy;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("pending")
    private String pending;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("all_identifiers")
    private List<String> allIdentifiers;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigResponse returnConfig;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantityResponse netQuantity;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
}


/*
    Model: ProductListingResponseV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingResponseV2{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductSchemaV2> items;
    
    
    
}


/*
    Model: TaxIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxIdentifier{
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
}


/*
    Model: ProductPublish1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublish1{
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
}


/*
    Model: CustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomOrder{
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
}


/*
    Model: ReturnConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig{
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
}


/*
    Model: TeaserTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TeaserTag{
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    private Object unit;
    
    
    
}


/*
    Model: ProductCreateUpdateSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCreateUpdateSchemaV2{
    
    
    
    
    @JsonProperty("change_request_id")
    private Object changeRequestId;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("tax_identifier")
    private TaxIdentifier taxIdentifier;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish1 productPublish;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("bulk_job_id")
    private String bulkJobId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("requester")
    private String requester;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("teaser_tag")
    private TeaserTag teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
}


/*
    Model: ProductVariants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductVariants{
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariants> variants;
    
    
    
}


/*
    Model: AttributeMasterSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterSerializer{
    
    
    
    
    @JsonProperty("suggestion")
    private String suggestion;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("synonyms")
    private Object synonyms;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("raw_key")
    private String rawKey;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("variant")
    private Boolean variant;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: ProductAttributesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAttributesResponse{
    
    
    
    
    @JsonProperty("items")
    private List<AttributeMasterSerializer> items;
    
    
    
}


/*
    Model: SingleProductResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SingleProductResponse{
    
    
    
    
    @JsonProperty("data")
    private ProductSchemaV2 data;
    
    
    
}


/*
    Model: ValidateIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateIdentifier{
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("gtin_value")
    private String gtinValue;
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
}


/*
    Model: AllSizes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllSizes{
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private Object itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("size")
    private Object size;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    @JsonProperty("identifiers")
    private List<ValidateIdentifier> identifiers;
    
    
    
}


/*
    Model: GetAllSizes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAllSizes{
    
    
    
    
    @JsonProperty("all_sizes")
    private List<AllSizes> allSizes;
    
    
    
}


/*
    Model: ValidateProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateProduct{
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
}


/*
    Model: ProductPublished
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublished{
    
    
    
    
    @JsonProperty("product_online_date")
    private Integer productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
}


/*
    Model: Product
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Product{
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("all_company_ids")
    private List<Integer> allCompanyIds;
    
    
    
    
    @JsonProperty("verified_by")
    private VerifiedBy verifiedBy;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublished productPublish;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("pending")
    private String pending;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("all_identifiers")
    private List<String> allIdentifiers;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigResponse returnConfig;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantityResponse netQuantity;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
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
    private List<Product> items;
    
    
    
}


/*
    Model: UserDetail1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetail1{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
}


/*
    Model: ProductBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkRequest{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail1 modifiedBy;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail1 createdBy;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("template")
    private ProductTemplate template;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: ProductBulkRequestList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkRequestList{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductBulkRequest items;
    
    
    
}


/*
    Model: BulkJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkJob{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<Object> cancelledRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("custom_template_tag")
    private String customTemplateTag;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: BulkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: BulkProductRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkProductRequest{
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
}


/*
    Model: ProductTagsViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTagsViewResponse{
    
    
    
    
    @JsonProperty("items")
    private List<String> items;
    
    
    
}


/*
    Model: UserCommon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCommon{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: Items
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Items{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("retry")
    private Integer retry;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_by")
    private UserCommon modifiedBy;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("created_by")
    private UserCommon createdBy;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: BulkAssetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkAssetResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
}


/*
    Model: ProductBulkAssets
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkAssets{
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: ProductSizeDeleteDataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeDeleteDataResponse{
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: ProductSizeDeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeDeleteResponse{
    
    
    
    
    @JsonProperty("data")
    private ProductSizeDeleteDataResponse data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: InventoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponse{
    
    
    
    
    @JsonProperty("sellable_quantity")
    private Integer sellableQuantity;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
}


/*
    Model: InventoryResponsePaginated
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponsePaginated{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponse> items;
    
    
    
}


/*
    Model: ItemQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemQuery{
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: GTIN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GTIN{
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("gtin_value")
    private Object gtinValue;
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
}


/*
    Model: SetSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetSize{
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: SizeDistribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeDistribution{
    
    
    
    
    @JsonProperty("sizes")
    private List<SetSize> sizes;
    
    
    
}


/*
    Model: InventorySet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySet{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size_distribution")
    private SizeDistribution sizeDistribution;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: InvSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvSize{
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("identifiers")
    private List<GTIN> identifiers;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("size")
    private Object size;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
}


/*
    Model: InventoryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryRequest{
    
    
    
    
    @JsonProperty("item")
    private ItemQuery item;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("sizes")
    private List<InvSize> sizes;
    
    
    
}


/*
    Model: StoreMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreMeta{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: CompanyMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyMeta{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: PriceMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceMeta{
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
}


/*
    Model: WeightResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WeightResponse{
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ManufacturerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManufacturerResponse{
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DimensionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DimensionResponse{
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
}


/*
    Model: Trader1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader1{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: BrandMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandMeta{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: QuantityBase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuantityBase{
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: Quantities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Quantities{
    
    
    
    
    @JsonProperty("order_committed")
    private QuantityBase orderCommitted;
    
    
    
    
    @JsonProperty("damaged")
    private QuantityBase damaged;
    
    
    
    
    @JsonProperty("not_available")
    private QuantityBase notAvailable;
    
    
    
    
    @JsonProperty("sellable")
    private QuantityBase sellable;
    
    
    
}


/*
    Model: ReturnConfig1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig1{
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
}


/*
    Model: InventorySellerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySellerResponse{
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("store")
    private StoreMeta store;
    
    
    
    
    @JsonProperty("fynd_article_code")
    private String fyndArticleCode;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta company;
    
    
    
    
    @JsonProperty("price")
    private PriceMeta price;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse weight;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse manufacturer;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse dimension;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader1> trader;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("fragile")
    private Boolean fragile;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta brand;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("quantities")
    private Quantities quantities;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig1 returnConfig;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("fynd_item_code")
    private String fyndItemCode;
    
    
    
    
    @JsonProperty("fynd_meta")
    private Object fyndMeta;
    
    
    
}


/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySellerIdentifierResponsePaginated{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventorySellerResponse> items;
    
    
    
}


/*
    Model: ArticleStoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleStoreResponse{
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PriceArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceArticle{
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
}


/*
    Model: CompanyMeta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyMeta1{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: WeightResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WeightResponse1{
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ManufacturerResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManufacturerResponse1{
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DimensionResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DimensionResponse1{
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: Trader2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader2{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: BrandMeta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandMeta1{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: Quantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Quantity{
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: QuantitiesArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuantitiesArticle{
    
    
    
    
    @JsonProperty("order_committed")
    private Quantity orderCommitted;
    
    
    
    
    @JsonProperty("damaged")
    private Quantity damaged;
    
    
    
    
    @JsonProperty("not_available")
    private Quantity notAvailable;
    
    
    
    
    @JsonProperty("sellable")
    private Quantity sellable;
    
    
    
}


/*
    Model: ReturnConfig2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig2{
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
}


/*
    Model: GetInventories
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetInventories{
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("store")
    private ArticleStoreResponse store;
    
    
    
    
    @JsonProperty("price")
    private PriceArticle price;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta1 company;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse1 weight;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse1 manufacturer;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse1 dimension;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader2> trader;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta1 brand;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("quantities")
    private QuantitiesArticle quantities;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig2 returnConfig;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
}


/*
    Model: GetInventoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetInventoriesResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetInventories> items;
    
    
    
}


/*
    Model: BulkInventoryGetItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInventoryGetItems{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: BulkInventoryGet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInventoryGet{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<BulkInventoryGetItems> items;
    
    
    
}


/*
    Model: InventoryJobPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryJobPayload{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
}


/*
    Model: InventoryBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBulkRequest{
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("sizes")
    private List<InventoryJobPayload> sizes;
    
    
    
}


/*
    Model: InventoryExportQuantityFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportQuantityFilter{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("operators")
    private String operators;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
}


/*
    Model: InventoryExportAdvanceOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportAdvanceOption{
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
}


/*
    Model: InventoryExportJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportJob{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private InventoryExportAdvanceOption filters;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
}


/*
    Model: InventoryExportRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportRequest{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private List<Integer> brand;
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
}


/*
    Model: InventoryExportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: InventoryJobFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryJobFilters{
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("stores")
    private List<String> stores;
    
    
    
    
    @JsonProperty("brands")
    private List<String> brands;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
}


/*
    Model: InventoryJobDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryJobDetailResponse{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private InventoryJobFilters filters;
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("cancelled_by")
    private UserDetail cancelledBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: InventoryExportJobListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportJobListResponse{
    
    
    
    
    @JsonProperty("items")
    private InventoryJobDetailResponse items;
    
    
    
}


/*
    Model: InventoryExportFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportFilter{
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
}


/*
    Model: InventoryCreateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryCreateRequest{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("data")
    private List<String> data;
    
    
    
    
    @JsonProperty("filters")
    private InventoryExportFilter filters;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
}


/*
    Model: FilerList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilerList{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: InventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryConfig{
    
    
    
    
    @JsonProperty("multivalues")
    private Boolean multivalues;
    
    
    
    
    @JsonProperty("data")
    private List<FilerList> data;
    
    
    
}


/*
    Model: InventoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPayload{
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
}


/*
    Model: InventoryRequestSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryRequestSchemaV2{
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("payload")
    private List<InventoryPayload> payload;
    
    
    
}


/*
    Model: InventoryFailedReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryFailedReason{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
}


/*
    Model: InventoryResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponseItem{
    
    
    
    
    @JsonProperty("reason")
    private InventoryFailedReason reason;
    
    
    
    
    @JsonProperty("data")
    private InventoryPayload data;
    
    
    
}


/*
    Model: InventoryUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryUpdateResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponseItem> items;
    
    
    
}


/*
    Model: HsnCodesObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesObject{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
}


/*
    Model: HsnCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCode{
    
    
    
    
    @JsonProperty("data")
    private HsnCodesObject data;
    
    
    
}


/*
    Model: HsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnUpsert{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
}


/*
    Model: BulkHsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkHsnUpsert{
    
    
    
    
    @JsonProperty("data")
    private List<HsnUpsert> data;
    
    
    
}


/*
    Model: BulkHsnResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkHsnResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageResponse{
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: TaxSlab
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxSlab{
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
    @JsonProperty("cess")
    private Double cess;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
}


/*
    Model: HSNDataInsertV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNDataInsertV2{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("taxes")
    private List<TaxSlab> taxes;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: HsnCodesListingResponseSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesListingResponseSchemaV2{
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("items")
    private List<HSNDataInsertV2> items;
    
    
    
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
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
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
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
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
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
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
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
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
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
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
    Model: ApplicationProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationProductListingResponse{
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("operators")
    private Object operators;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
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
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
}


/*
    Model: InventoryPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPage{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: InventoryStockResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStockResponse{
    
    
    
    
    @JsonProperty("page")
    private InventoryPage page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
}


/*
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignment{
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: ArticleQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleQuery{
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("ignored_stores")
    private List<Integer> ignoredStores;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: AssignStoreArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AssignStoreArticle{
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    @JsonProperty("query")
    private ArticleQuery query;
    
    
    
}


/*
    Model: AssignStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AssignStore{
    
    
    
    
    @JsonProperty("channel_identifier")
    private String channelIdentifier;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("articles")
    private List<AssignStoreArticle> articles;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
}


/*
    Model: ArticleAssignment1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignment1{
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: StoreAssignResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreAssignResponse{
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<Object> strategyWiseListing;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment1 articleAssignment;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("store_pincode")
    private Integer storePincode;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("s_city")
    private String sCity;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
}


/*
    Model: UserSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer1{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
}


/*
    Model: GetAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAddressSerializer{
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
}


/*
    Model: GetCompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCompanySerializer{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: UserSerializer2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer2{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
}


/*
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
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
    Model: LocationManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationManagerSerializer{
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: LocationTimingSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationTimingSerializer{
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
}


/*
    Model: LocationDayWiseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDayWiseSerializer{
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    @JsonProperty("opening")
    private LocationTimingSerializer opening;
    
    
    
}


/*
    Model: LocationIntegrationType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationIntegrationType{
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
}


/*
    Model: InvoiceCredSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceCredSerializer{
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
}


/*
    Model: InvoiceDetailsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsSerializer{
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
}


/*
    Model: ProductReturnConfigSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductReturnConfigSerializer{
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
    @JsonProperty("store_uid")
    private Integer storeUid;
    
    
    
}


/*
    Model: GetLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocationSerializer{
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer2 verifiedBy;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer2 createdBy;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("integration_type")
    private LocationIntegrationType integrationType;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer2 modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: LocationListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationListSerializer{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetLocationSerializer> items;
    
    
    
}


/*
    Model: ApplicationBrandJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationBrandJson{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: ApplicationCategoryJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCategoryJson{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: ApplicationDepartment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationDepartment{
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ApplicationDepartmentListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationDepartmentListingResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ApplicationDepartment> items;
    
    
    
}


/*
    Model: ApplicationDepartmentJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationDepartmentJson{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: ApplicationStoreJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationStoreJson{
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}




    
    /*
        Enum: PageType
        Used By: Catalog
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
        
        contactUs("contact-us"), 
        
        externalLink("external"), 
        
        faq("faq"), 
        
        freshchat("freshchat"), 
        
        home("home"), 
        
        notificationSettings("notification-settings"), 
        
        orders("orders"), 
        
        page("page"), 
        
        policy("policy"), 
        
        product("product"), 
        
        productReviews("product-reviews"), 
        
        addProductReview("add-product-review"), 
        
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
        
        returnPolicy("return-policy");
        

        private String priority;
        PageType(String priority) {
            this.priority = priority;
        }
    }


}