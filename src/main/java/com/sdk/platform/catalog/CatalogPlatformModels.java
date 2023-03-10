
package com.sdk.platform.catalog;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;


public class CatalogPlatformModels{


/*
    Model: SearchKeywordResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SearchKeywordResult {
    
    
    
    
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
public static class CreateSearchKeyword {
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("result")
    private SearchKeywordResult result;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
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
public static class GetSearchWordsData {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
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
public static class ErrorResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
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
public static class Page {
    
    
    
    
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
    Model: GetSearchWordsDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsDetailResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private GetSearchWordsData items;
    
    
    
    
}

/*
    Model: DeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
public static class GetSearchWordsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetSearchWordsData> items;
    
    
    
    
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
public static class Media {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class AutocompletePageAction {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
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
public static class AutocompleteAction {
    
    
    
    
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
public static class AutocompleteResult {
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("action")
    private AutocompleteAction action;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
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
public static class CreateAutocompleteKeyword {
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<AutocompleteResult> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
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
public static class GetAutocompleteWordsData {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
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
public static class GetAutocompleteWordsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetAutocompleteWordsData> items;
    
    
    
    
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
public static class CreateAutocompleteWordsResponse {
    
    
    
    
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
public static class ProductBundleItem {
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
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
public static class GetProductBundleCreateResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class GetProductBundleListingResponse {
    
    
    
    
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
public static class ProductBundleRequest {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class ProductBundleUpdateRequest {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class Size {
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class LimitedProductData {
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("price")
    private Object price;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
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
public static class Price {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
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
public static class GetProducts {
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("product_details")
    private LimitedProductData productDetails;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
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
public static class GetProductBundleResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("products")
    private List<GetProducts> products;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class ListSizeGuide {
    
    
    
    
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
public static class Meta {
    
    
    
    
    @JsonProperty("headers")
    private Object headers;
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
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
public static class Guide {
    
    
    
    
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
public static class ValidateSizeGuide {
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("guide")
    private Guide guide;
    
    
    
    
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
public static class SuccessResponse {
    
    
    
    
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
public static class SizeGuideResponse {
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("guide")
    private Object guide;
    
    
    
    
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
public static class SEOData {
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("title")
    private Object title;
    
    
    
    
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
public static class MOQData {
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
    
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
public static class OwnerAppItemResponse {
    
    
    
    
    @JsonProperty("seo")
    private SEOData seo;
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("moq")
    private MOQData moq;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
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
public static class ApplicationItemSEO {
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("title")
    private Object title;
    
    
    
    
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
public static class ApplicationItemMOQ {
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
    
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
public static class MetaFields {
    
    
    
    
    @JsonProperty("key")
    private Object key;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
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
public static class ApplicationItemMeta {
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<MetaFields> customMeta;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
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
public static class SuccessResponse1 {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class GetConfigMetadataResponse {
    
    
    
    
    @JsonProperty("condition")
    private List<Object> condition;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
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
public static class PageResponseType {
    
    
    
    
    @JsonProperty("next")
    private Integer next;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
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
public static class GetConfigResponse {
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("page")
    private PageResponseType page;
    
    
    
    
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
public static class ConfigErrorResponse {
    
    
    
    
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
public static class AttributeDetailsGroup {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class AppConfigurationDetail {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("attributes")
    private List<AttributeDetailsGroup> attributes;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("template_slugs")
    private List<String> templateSlugs;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
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
public static class ConfigSuccessResponse {
    
    
    
    
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
public static class AppConfigurationsSort {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
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
public static class AllowSingleRequest {
    
    
    
    
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
public static class DefaultKeyRequest {
    
    
    
    
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
public static class GetCatalogConfigurationDetailsProduct {
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    @JsonProperty("similar")
    private Object similar;
    
    
    
    
    @JsonProperty("variant")
    private Object variant;
    
    
    
    
    @JsonProperty("compare")
    private Object compare;
    
    
    
    
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
public static class MetaDataListingSortMetaResponse {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class MetaDataListingSortResponse {
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingSortMetaResponse> data;
    
    
    
    
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
public static class MetaDataListingFilterMetaResponse {
    
    
    
    
    @JsonProperty("filter_types")
    private List<String> filterTypes;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("units")
    private List<Object> units;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class MetaDataListingFilterResponse {
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingFilterMetaResponse> data;
    
    
    
    
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
public static class MetaDataListingResponse {
    
    
    
    
    @JsonProperty("sort")
    private MetaDataListingSortResponse sort;
    
    
    
    
    @JsonProperty("filter")
    private MetaDataListingFilterResponse filter;
    
    
    
    
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
public static class GetCatalogConfigurationMetaData {
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
    @JsonProperty("listing")
    private MetaDataListingResponse listing;
    
    
    
    
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
public static class ConfigurationListingSortConfig {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
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
public static class ConfigurationListingSort {
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationListingSortConfig> config;
    
    
    
    
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
public static class ConfigurationBucketPoints {
    
    
    
    
    @JsonProperty("start")
    private Double start;
    
    
    
    
    @JsonProperty("end")
    private Double end;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class ConfigurationListingFilterValue {
    
    
    
    
    @JsonProperty("map_values")
    private List<Object> mapValues;
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
    
    @JsonProperty("map")
    private Object map;
    
    
    
    
    @JsonProperty("bucket_points")
    private List<ConfigurationBucketPoints> bucketPoints;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
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
public static class ConfigurationListingFilterConfig {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("value_config")
    private ConfigurationListingFilterValue valueConfig;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class ConfigurationListingFilter {
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
    
    @JsonProperty("attribute_config")
    private List<ConfigurationListingFilterConfig> attributeConfig;
    
    
    
    
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
public static class ConfigurationListing {
    
    
    
    
    @JsonProperty("sort")
    private ConfigurationListingSort sort;
    
    
    
    
    @JsonProperty("filter")
    private ConfigurationListingFilter filter;
    
    
    
    
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
public static class ProductSize {
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
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
public static class ConfigurationProductConfig {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
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
public static class ConfigurationProductSimilar {
    
    
    
    
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
public static class ConfigurationProductVariantConfig {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
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
public static class ConfigurationProductVariant {
    
    
    
    
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
public static class ConfigurationProduct {
    
    
    
    
    @JsonProperty("similar")
    private ConfigurationProductSimilar similar;
    
    
    
    
    @JsonProperty("variant")
    private ConfigurationProductVariant variant;
    
    
    
    
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
public static class AppCatalogConfiguration {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
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
public static class GetAppCatalogConfiguration {
    
    
    
    
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
public static class AppConfiguration {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
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
public static class GetCatalogConfigurationDetailsSchemaListing {
    
    
    
    
    @JsonProperty("sort")
    private Object sort;
    
    
    
    
    @JsonProperty("filter")
    private Object filter;
    
    
    
    
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
public static class EntityConfiguration {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("listing")
    private GetCatalogConfigurationDetailsSchemaListing listing;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
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
public static class GetAppCatalogEntityConfiguration {
    
    
    
    
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
public static class ProductSortOn {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
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
public static class ProductFiltersKey {
    
    
    
    
    @JsonProperty("operators")
    private List<String> operators;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
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
public static class ProductFiltersValue {
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
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
public static class ProductFilters {
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
    
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
public static class GetCollectionQueryOptionResponse {
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("operators")
    private HashMap<String,String> operators;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
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
public static class CollectionListingFilterType {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class CollectionListingFilterTag {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class CollectionListingFilter {
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
    
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
public static class Media1 {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class CollectionQuery {
    
    
    
    
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
public static class ActionPage {
    
    
    
    
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
public static class Action {
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class BannerImage {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class ImageUrls {
    
    
    
    
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
public static class GetCollectionDetailNest {
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class GetCollectionListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
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
public static class UserInfo {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class SeoDetail {
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
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
public static class CollectionImage {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
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
public static class CollectionBadge {
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
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
public static class NextSchedule {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
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
public static class CollectionSchedule {
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
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
public static class CollectionBanner {
    
    
    
    
    @JsonProperty("portrait")
    private CollectionImage portrait;
    
    
    
    
    @JsonProperty("landscape")
    private CollectionImage landscape;
    
    
    
    
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
public static class CreateCollection {
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
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
public static class CollectionCreateResponse {
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("logo")
    private BannerImage logo;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class CollectionDetailResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
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
public static class UpdateCollection {
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
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
public static class ProductBrand {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
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
public static class Price1 {
    
    
    
    
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
public static class ProductListingPrice {
    
    
    
    
    @JsonProperty("effective")
    private Price1 effective;
    
    
    
    
    @JsonProperty("marked")
    private Price1 marked;
    
    
    
    
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
public static class ProductDetailAttribute {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
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
public static class ProductDetailGroupedAttribute {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("details")
    private List<ProductDetailAttribute> details;
    
    
    
    
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
public static class ProductListingDetail {
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
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
public static class GetCollectionItemsResponse {
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
}

/*
    Model: ItemQueryForUserCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemQueryForUserCollection {
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: CollectionItemRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionItemRequest {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("item")
    private List<ItemQueryForUserCollection> item;
    
    
    
    
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
public static class UpdatedResponse {
    
    
    
    
    @JsonProperty("items_not_updated")
    private List<Integer> itemsNotUpdated;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
public static class CatalogInsightItem {
    
    
    
    
    @JsonProperty("sellable_count")
    private Integer sellableCount;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("out_of_stock_count")
    private Integer outOfStockCount;
    
    
    
    
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
public static class CatalogInsightBrand {
    
    
    
    
    @JsonProperty("article_freshness")
    private Integer articleFreshness;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("total_articles")
    private Integer totalArticles;
    
    
    
    
    @JsonProperty("total_sizes")
    private Integer totalSizes;
    
    
    
    
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
public static class CatalogInsightResponse {
    
    
    
    
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
public static class CrossSellingData {
    
    
    
    
    @JsonProperty("articles")
    private Integer articles;
    
    
    
    
    @JsonProperty("products")
    private Integer products;
    
    
    
    
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
public static class CrossSellingResponse {
    
    
    
    
    @JsonProperty("data")
    private CrossSellingData data;
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
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
public static class OptInPostRequest {
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class CompanyOptIn {
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class GetOptInPlatform {
    
    
    
    
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
public static class OptinCompanyDetail {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
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
public static class CompanyBrandDetail {
    
    
    
    
    @JsonProperty("total_article")
    private Integer totalArticle;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class OptinCompanyBrandDetailsView {
    
    
    
    
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
public static class OptinCompanyMetrics {
    
    
    
    
    @JsonProperty("store")
    private Integer store;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("brand")
    private Integer brand;
    
    
    
    
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
public static class StoreDetail {
    
    
    
    
    @JsonProperty("timing")
    private Object timing;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("documents")
    private List<Object> documents;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("additional_contacts")
    private List<Object> additionalContacts;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("manager")
    private Object manager;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
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
public static class OptinStoreDetails {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<StoreDetail> items;
    
    
    
    
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
public static class AttributeMasterMandatoryDetails {
    
    
    
    
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
public static class AttributeMasterMeta {
    
    
    
    
    @JsonProperty("mandatory_details")
    private AttributeMasterMandatoryDetails mandatoryDetails;
    
    
    
    
    @JsonProperty("enriched")
    private Boolean enriched;
    
    
    
    
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
public static class AttributeMasterFilter {
    
    
    
    
    @JsonProperty("depends_on")
    private List<String> dependsOn;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("indexing")
    private Boolean indexing;
    
    
    
    
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
public static class AttributeMasterDetails {
    
    
    
    
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
public static class AttributeSchemaRange {
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
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
public static class AttributeMaster {
    
    
    
    
    @JsonProperty("allowed_values")
    private List<String> allowedValues;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("multi")
    private Boolean multi;
    
    
    
    
    @JsonProperty("mandatory")
    private Boolean mandatory;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("range")
    private AttributeSchemaRange range;
    
    
    
    
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
public static class GenderDetail {
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("meta")
    private AttributeMasterMeta meta;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class ProdcutTemplateCategoriesResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
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
public static class PTErrorResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
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
public static class UserSerializer {
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class GetDepartment {
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
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
public static class DepartmentsResponse {
    
    
    
    
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
public static class DepartmentErrorResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
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
public static class DepartmentCreateUpdate {
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
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
public static class DepartmentCreateResponse {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
public static class DepartmentCreateErrorResponse {
    
    
    
    
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
public static class UserDetail {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class DepartmentModel {
    
    
    
    
    @JsonProperty("_cls")
    private Object cls;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("synonyms")
    private List<Object> synonyms;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
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
public static class ProductTemplate {
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class TemplatesResponse {
    
    
    
    
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
public static class TemplateDetails {
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class Properties {
    
    
    
    
    @JsonProperty("size_guide")
    private Object sizeGuide;
    
    
    
    
    @JsonProperty("hsn_code")
    private Object hsnCode;
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("brand_uid")
    private Object brandUid;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("trader")
    private Object trader;
    
    
    
    
    @JsonProperty("product_publish")
    private Object productPublish;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Object noOfBoxes;
    
    
    
    
    @JsonProperty("trader_type")
    private Object traderType;
    
    
    
    
    @JsonProperty("product_group_tag")
    private Object productGroupTag;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("command")
    private Object command;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private Object itemType;
    
    
    
    
    @JsonProperty("media")
    private Object media;
    
    
    
    
    @JsonProperty("category_slug")
    private Object categorySlug;
    
    
    
    
    @JsonProperty("sizes")
    private Object sizes;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    @JsonProperty("highlights")
    private Object highlights;
    
    
    
    
    @JsonProperty("multi_size")
    private Object multiSize;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("is_dependent")
    private Object isDependent;
    
    
    
    
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
public static class GlobalValidation {
    
    
    
    
    @JsonProperty("definitions")
    private Object definitions;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("properties")
    private Properties properties;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
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
public static class TemplateValidationData {
    
    
    
    
    @JsonProperty("template_validation")
    private Object templateValidation;
    
    
    
    
    @JsonProperty("global_validation")
    private GlobalValidation globalValidation;
    
    
    
    
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
public static class TemplatesValidationResponse {
    
    
    
    
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
public static class InventoryValidationResponse {
    
    
    
    
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
public static class HSNData {
    
    
    
    
    @JsonProperty("hsn_code")
    private List<String> hsnCode;
    
    
    
    
    @JsonProperty("country_of_origin")
    private List<String> countryOfOrigin;
    
    
    
    
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
public static class HSNCodesResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private HSNData data;
    
    
    
    
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
public static class VerifiedBy {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: ProductDownloadItemsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadItemsData {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("templates")
    private List<String> templates;
    
    
    
    
    @JsonProperty("brand")
    private List<String> brand;
    
    
    
    
}

/*
    Model: ProductDownloadsItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadsItems {
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("created_by")
    private VerifiedBy createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("data")
    private ProductDownloadItemsData data;
    
    
    
    
    @JsonProperty("seller_id")
    private Double sellerId;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    @JsonProperty("template_tags")
    private Object templateTags;
    
    
    
    
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
public static class ProductDownloadsResponse {
    
    
    
    
    @JsonProperty("items")
    private ProductDownloadsItems items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
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
public static class ProductConfigurationDownloads {
    
    
    
    
    @JsonProperty("multivalue")
    private Boolean multivalue;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
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
public static class CategoryMappingValues {
    
    
    
    
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
public static class CategoryMapping {
    
    
    
    
    @JsonProperty("google")
    private CategoryMappingValues google;
    
    
    
    
    @JsonProperty("ajio")
    private CategoryMappingValues ajio;
    
    
    
    
    @JsonProperty("facebook")
    private CategoryMappingValues facebook;
    
    
    
    
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
public static class Media2 {
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
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
public static class Hierarchy {
    
    
    
    
    @JsonProperty("l2")
    private Integer l2;
    
    
    
    
    @JsonProperty("l1")
    private Integer l1;
    
    
    
    
    @JsonProperty("department")
    private Integer department;
    
    
    
    
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
public static class Category {
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
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
public static class CategoryResponse {
    
    
    
    
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
public static class CategoryRequestBody {
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
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
public static class CategoryCreateResponse {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
public static class CategoryUpdateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class SingleCategoryResponse {
    
    
    
    
    @JsonProperty("data")
    private Category data;
    
    
    
    
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
public static class Image {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Double aspectRatioF;
    
    
    
    
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
public static class Logo {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Integer aspectRatioF;
    
    
    
    
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
public static class Brand {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class ProductPublished {
    
    
    
    
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
public static class Product {
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublished productPublish;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
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
public static class ProductListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Product> items;
    
    
    
    
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
public static class Trader {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
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
public static class ProductPublish {
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
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
public static class TeaserTag {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
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
public static class TaxIdentifier {
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
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
public static class NetQuantity {
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("unit")
    private Object unit;
    
    
    
    
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
public static class CustomOrder {
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
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
public static class ReturnConfig {
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
}

/*
    Model: ProductCreateUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCreateUpdate {
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("change_request_id")
    private Object changeRequestId;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("teaser_tag")
    private TeaserTag teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("tax_identifier")
    private TaxIdentifier taxIdentifier;
    
    
    
    
    @JsonProperty("requester")
    private String requester;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("bulk_job_id")
    private String bulkJobId;
    
    
    
    
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
public static class ProductVariants {
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
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
public static class ProductVariantsResponse {
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariants> variants;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
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
public static class AttributeMasterSerializer {
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("variant")
    private Boolean variant;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("suggestion")
    private String suggestion;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("synonyms")
    private Object synonyms;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("raw_key")
    private String rawKey;
    
    
    
    
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
public static class ProductAttributesResponse {
    
    
    
    
    @JsonProperty("items")
    private List<AttributeMasterSerializer> items;
    
    
    
    
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
public static class ValidateProduct {
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
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
public static class UserDetail1 {
    
    
    
    
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
public static class ProductBulkRequest {
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail1 createdBy;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail1 modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("template")
    private ProductTemplate template;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
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
public static class ProductBulkRequestList {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductBulkRequest items;
    
    
    
    
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
public static class UserInfo1 {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class BulkJob {
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<Object> cancelledRecords;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("custom_template_tag")
    private String customTemplateTag;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
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
public static class BulkResponse {
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
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
public static class BulkProductRequest {
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
}

/*
    Model: NestedTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NestedTags {
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
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
public static class ProductTagsViewResponse {
    
    
    
    
    @JsonProperty("items")
    private NestedTags items;
    
    
    
    
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
public static class UserCommon {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class Items {
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("retry")
    private Integer retry;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private UserCommon createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private UserCommon modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
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
public static class BulkAssetResponse {
    
    
    
    
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
public static class ProductBulkAssets {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
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
public static class ProductSizeDeleteDataResponse {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
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
public static class ProductSizeDeleteResponse {
    
    
    
    
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
public static class InventoryResponse {
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("sellable_quantity")
    private Integer sellableQuantity;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
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
public static class InventoryResponsePaginated {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponse> items;
    
    
    
    
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
public static class GTIN {
    
    
    
    
    @JsonProperty("gtin_value")
    private Object gtinValue;
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
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
public static class SetSize {
    
    
    
    
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
public static class SizeDistribution {
    
    
    
    
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
public static class InventorySet {
    
    
    
    
    @JsonProperty("size_distribution")
    private SizeDistribution sizeDistribution;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
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
public static class InvSize {
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("identifiers")
    private List<GTIN> identifiers;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("size")
    private Object size;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
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
public static class ItemQuery {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
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
public static class InventoryRequest {
    
    
    
    
    @JsonProperty("sizes")
    private List<InvSize> sizes;
    
    
    
    
    @JsonProperty("item")
    private ItemQuery item;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class BrandMeta {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
public static class Trader1 {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
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
public static class ManufacturerResponse {
    
    
    
    
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
public static class DimensionResponse {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class PriceMeta {
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
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
public static class QuantityBase {
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
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
public static class Quantities {
    
    
    
    
    @JsonProperty("sellable")
    private QuantityBase sellable;
    
    
    
    
    @JsonProperty("order_committed")
    private QuantityBase orderCommitted;
    
    
    
    
    @JsonProperty("not_available")
    private QuantityBase notAvailable;
    
    
    
    
    @JsonProperty("damaged")
    private QuantityBase damaged;
    
    
    
    
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
public static class StoreMeta {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
public static class WeightResponse {
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class CompanyMeta {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
public static class ReturnConfig1 {
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class InventorySellerResponse {
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("fynd_article_code")
    private String fyndArticleCode;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta brand;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("fynd_item_code")
    private String fyndItemCode;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader1> trader;
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse manufacturer;
    
    
    
    
    @JsonProperty("fragile")
    private Boolean fragile;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse dimension;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("price")
    private PriceMeta price;
    
    
    
    
    @JsonProperty("quantities")
    private Quantities quantities;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("store")
    private StoreMeta store;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse weight;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta company;
    
    
    
    
    @JsonProperty("fynd_meta")
    private Object fyndMeta;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig1 returnConfig;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
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
public static class InventorySellerIdentifierResponsePaginated {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventorySellerResponse> items;
    
    
    
    
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
public static class BrandMeta1 {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
public static class ManufacturerResponse1 {
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class Trader2 {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
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
public static class DimensionResponse1 {
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class PriceArticle {
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
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
public static class Quantity {
    
    
    
    
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
public static class QuantitiesArticle {
    
    
    
    
    @JsonProperty("sellable")
    private Quantity sellable;
    
    
    
    
    @JsonProperty("order_committed")
    private Quantity orderCommitted;
    
    
    
    
    @JsonProperty("not_available")
    private Quantity notAvailable;
    
    
    
    
    @JsonProperty("damaged")
    private Quantity damaged;
    
    
    
    
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
public static class ArticleStoreResponse {
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
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
public static class DateMeta {
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
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
public static class WeightResponse1 {
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class CompanyMeta1 {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
public static class ReturnConfig2 {
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
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
public static class GetInventories {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta1 brand;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse1 manufacturer;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader2> trader;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse1 dimension;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("price")
    private PriceArticle price;
    
    
    
    
    @JsonProperty("quantities")
    private QuantitiesArticle quantities;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("store")
    private ArticleStoreResponse store;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse1 weight;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta1 company;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig2 returnConfig;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
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
public static class GetInventoriesResponse {
    
    
    
    
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
public static class BulkInventoryGetItems {
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
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
public static class BulkInventoryGet {
    
    
    
    
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
public static class InventoryJobPayload {
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
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
public static class InventoryBulkRequest {
    
    
    
    
    @JsonProperty("sizes")
    private List<InventoryJobPayload> sizes;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
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
public static class InventoryExportJob {
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("request_params")
    private Object requestParams;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
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
public static class InventoryExportRequest {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    @JsonProperty("brand")
    private List<Integer> brand;
    
    
    
    
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
public static class InventoryExportResponse {
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("request_params")
    private Object requestParams;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
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
public static class FilerList {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
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
public static class InventoryConfig {
    
    
    
    
    @JsonProperty("data")
    private List<FilerList> data;
    
    
    
    
    @JsonProperty("multivalues")
    private Boolean multivalues;
    
    
    
    
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
public static class InventoryPayload {
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
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
public static class InventoryRequestSchemaV2 {
    
    
    
    
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
public static class InventoryFailedReason {
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
public static class InventoryResponseItem {
    
    
    
    
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
public static class InventoryUpdateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponseItem> items;
    
    
    
    
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
public static class PageResponse {
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
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
public static class HsnCodesObject {
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
}

/*
    Model: HsnCodesListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesListingResponse {
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("items")
    private List<HsnCodesObject> items;
    
    
    
    
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
public static class HsnUpsert {
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
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
public static class HsnCode {
    
    
    
    
    @JsonProperty("data")
    private HsnCodesObject data;
    
    
    
    
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
public static class BulkHsnUpsert {
    
    
    
    
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
public static class BulkHsnResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class TaxSlab {
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
    @JsonProperty("cess")
    private Double cess;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
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
public static class HSNDataInsertV2 {
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("taxes")
    private List<TaxSlab> taxes;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
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
public static class HsnCodesListingResponseSchemaV2 {
    
    
    
    
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
public static class BrandItem {
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class BrandListingResponse {
    
    
    
    
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
public static class Department {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class DepartmentResponse {
    
    
    
    
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
public static class DepartmentIdentifier {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
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
public static class ThirdLevelChild {
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class SecondLevelChild {
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class Child {
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class CategoryItems {
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
public static class DepartmentCategoryTree {
    
    
    
    
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
public static class CategoryListingResponse {
    
    
    
    
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
public static class ApplicationProductListingResponse {
    
    
    
    
    @JsonProperty("operators")
    private Object operators;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
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
public static class ProductDetail {
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
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
public static class InventoryPage {
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
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
public static class InventoryStockResponse {
    
    
    
    
    @JsonProperty("page")
    private InventoryPage page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
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
public static class UserSerializer1 {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class Document {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
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
public static class GetAddressSerializer {
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
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
public static class SellerPhoneNumber {
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
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
public static class LocationManagerSerializer {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
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
public static class LocationIntegrationType {
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
    
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
public static class LocationTimingSerializer {
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
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
public static class LocationDayWiseSerializer {
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("opening")
    private LocationTimingSerializer opening;
    
    
    
    
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
public static class UserSerializer2 {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
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
public static class GetCompanySerializer {
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer2 createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer2 modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer2 verifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
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
public static class ProductReturnConfigSerializer {
    
    
    
    
    @JsonProperty("store_uid")
    private Integer storeUid;
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
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
public static class InvoiceCredSerializer {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
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
public static class InvoiceDetailsSerializer {
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
    
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
public static class GetLocationSerializer {
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    @JsonProperty("integration_type")
    private LocationIntegrationType integrationType;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
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
public static class LocationListSerializer {
    
    
    
    
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
public static class ApplicationBrandJson {
    
    
    
    
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
public static class ApplicationCategoryJson {
    
    
    
    
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
public static class ApplicationDepartment {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
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
public static class ApplicationDepartmentListingResponse {
    
    
    
    
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
public static class ApplicationDepartmentJson {
    
    
    
    
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
public static class ApplicationStoreJson {
    
    
    
    
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