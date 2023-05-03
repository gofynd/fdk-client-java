
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
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
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("result")
    private SearchKeywordResult result;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
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
public static class GetSearchWordsData{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
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
    Model: GetSearchWordsDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsDetailResponse{
    
    
    
    
    @JsonProperty("items")
    private GetSearchWordsData items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetSearchWordsData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
    Model: AutocompleteResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteResult{
    
    
    
    
    @JsonProperty("action")
    private AutocompleteAction action;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
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
    
    
    
    
    @JsonProperty("results")
    private List<AutocompleteResult> results;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
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
public static class GetAutocompleteWordsData{
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetAutocompleteWordsData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
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
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
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
public static class GetProductBundleCreateResponse{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetProductBundleCreateResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("price")
    private Object price;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
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
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("product_details")
    private LimitedProductData productDetails;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
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
public static class GetProductBundleResponse{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("products")
    private List<GetProducts> products;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("guide")
    private Guide guide;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("guide")
    private Object guide;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
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
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("moq")
    private MOQData moq;
    
    
    
    
    @JsonProperty("seo")
    private SEOData seo;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
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
    Model: ApplicationItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemMeta{
    
    
    
    
    @JsonProperty("is_cod")
    private Boolean isCod;
    
    
    
    
    @JsonProperty("moq")
    private ApplicationItemMOQ moq;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("seo")
    private ApplicationItemSEO seo;
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<MetaFields> customMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("condition")
    private List<Object> condition;
    
    
    
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
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("next")
    private Integer next;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("template_slugs")
    private List<String> templateSlugs;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("attributes")
    private List<AttributeDetailsGroup> attributes;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
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
    
    
    
    
    @JsonProperty("filter_types")
    private List<String> filterTypes;
    
    
    
    
    @JsonProperty("units")
    private List<Object> units;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    Model: MetaDataListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingResponse{
    
    
    
    
    @JsonProperty("sort")
    private MetaDataListingSortResponse sort;
    
    
    
    
    @JsonProperty("filter")
    private MetaDataListingFilterResponse filter;
    
    
    
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
    
    
    
    
    @JsonProperty("variant")
    private Object variant;
    
    
    
    
    @JsonProperty("compare")
    private Object compare;
    
    
    
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
    
    
    
    
    @JsonProperty("listing")
    private MetaDataListingResponse listing;
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
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
public static class ConfigurationProductConfig{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    Model: ConfigurationListingSortConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingSortConfig{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("start")
    private Double start;
    
    
    
    
    @JsonProperty("end")
    private Double end;
    
    
    
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
    
    
    
    
    @JsonProperty("map")
    private Object map;
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
    @JsonProperty("map_values")
    private List<Object> mapValues;
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
    
    @JsonProperty("bucket_points")
    private List<ConfigurationBucketPoints> bucketPoints;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value_config")
    private ConfigurationListingFilterValue valueConfig;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("attribute_config")
    private List<ConfigurationListingFilterConfig> attributeConfig;
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
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
    
    
    
    
    @JsonProperty("sort")
    private ConfigurationListingSort sort;
    
    
    
    
    @JsonProperty("filter")
    private ConfigurationListingFilter filter;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
public static class EntityConfiguration{
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("listing")
    private GetCatalogConfigurationDetailsSchemaListing listing;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
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
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersValue{
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("operators")
    private List<String> operators;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("operators")
    private HashMap<String,String> operators;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
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
public static class CollectionListingFilter{
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
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
    Model: CollectionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionQuery{
    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    @JsonProperty("attribute")
    private String attribute;
    
    
    
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
    Model: GetCollectionDetailNest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionDetailNest{
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
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
public static class GetCollectionListingResponse{
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
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
    Model: CollectionSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionSchedule{
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
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
    Model: CollectionBadge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionBadge{
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo createdBy;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private BannerImage logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
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
public static class CollectionDetailResponse{
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
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
    private Action action;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
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
    private Price1 marked;
    
    
    
    
    @JsonProperty("effective")
    private Price1 effective;
    
    
    
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
    Model: ProductListingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingDetail{
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
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
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
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
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("items")
    private List<CollectionItem> items;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("sellable_count")
    private Integer sellableCount;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("total_sizes")
    private Integer totalSizes;
    
    
    
    
    @JsonProperty("available_articles")
    private Integer availableArticles;
    
    
    
    
    @JsonProperty("available_sizes")
    private Integer availableSizes;
    
    
    
    
    @JsonProperty("article_freshness")
    private Integer articleFreshness;
    
    
    
    
    @JsonProperty("total_articles")
    private Integer totalArticles;
    
    
    
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
public static class CrossSellingResponse{
    
    
    
    
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
public static class OptInPostRequest{
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<CompanyOptIn> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
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
public static class CompanyBrandDetail{
    
    
    
    
    @JsonProperty("total_article")
    private Integer totalArticle;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
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
public static class OptinCompanyBrandDetailsView{
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandDetail> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
public static class StoreDetail{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("documents")
    private List<Object> documents;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("additional_contacts")
    private List<Object> additionalContacts;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("manager")
    private Object manager;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("timing")
    private Object timing;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<StoreDetail> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("indexing")
    private Boolean indexing;
    
    
    
    
    @JsonProperty("depends_on")
    private List<String> dependsOn;
    
    
    
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
    
    
    
    
    @JsonProperty("enriched")
    private Boolean enriched;
    
    
    
    
    @JsonProperty("mandatory_details")
    private AttributeMasterMandatoryDetails mandatoryDetails;
    
    
    
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
public static class AttributeMaster{
    
    
    
    
    @JsonProperty("allowed_values")
    private List<String> allowedValues;
    
    
    
    
    @JsonProperty("range")
    private AttributeSchemaRange range;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("multi")
    private Boolean multi;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("mandatory")
    private Boolean mandatory;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("meta")
    private AttributeMasterMeta meta;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
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
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_slug")
    private String templateSlug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<CategoriesResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetDepartment> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
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
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("_cls")
    private Object cls;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("synonyms")
    private List<Object> synonyms;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private ProductTemplate items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
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
    
    
    
    
    @JsonProperty("trader_type")
    private Object traderType;
    
    
    
    
    @JsonProperty("highlights")
    private Object highlights;
    
    
    
    
    @JsonProperty("size_guide")
    private Object sizeGuide;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    @JsonProperty("multi_size")
    private Object multiSize;
    
    
    
    
    @JsonProperty("product_publish")
    private Object productPublish;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Object noOfBoxes;
    
    
    
    
    @JsonProperty("item_type")
    private Object itemType;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("trader")
    private Object trader;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("is_dependent")
    private Object isDependent;
    
    
    
    
    @JsonProperty("category_slug")
    private Object categorySlug;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
    
    @JsonProperty("hsn_code")
    private Object hsnCode;
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("media")
    private Object media;
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    @JsonProperty("brand_uid")
    private Object brandUid;
    
    
    
    
    @JsonProperty("product_group_tag")
    private Object productGroupTag;
    
    
    
    
    @JsonProperty("command")
    private Object command;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("sizes")
    private Object sizes;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("definitions")
    private Object definitions;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("properties")
    private Properties properties;
    
    
    
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
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("catalogue_types")
    private List<String> catalogueTypes;
    
    
    
    
    @JsonProperty("brands")
    private List<String> brands;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
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
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("filters")
    private ProductTemplateExportFilterRequest filters;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("multivalue")
    private Boolean multivalue;
    
    
    
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
    Model: Hierarchy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Hierarchy{
    
    
    
    
    @JsonProperty("department")
    private Integer department;
    
    
    
    
    @JsonProperty("l1")
    private Integer l1;
    
    
    
    
    @JsonProperty("l2")
    private Integer l2;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("catalog_id")
    private Integer catalogId;
    
    
    
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
    
    
    
    
    @JsonProperty("facebook")
    private CategoryMappingValues facebook;
    
    
    
    
    @JsonProperty("google")
    private CategoryMappingValues google;
    
    
    
    
    @JsonProperty("ajio")
    private CategoryMappingValues ajio;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Category> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
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
    Model: Logo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Logo{
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Integer aspectRatioF;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
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
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
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
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Double aspectRatioF;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    Model: ReturnConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfigResponse{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
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
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("verified_by")
    private VerifiedBy verifiedBy;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantityResponse netQuantity;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("all_identifiers")
    private List<String> allIdentifiers;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("all_company_ids")
    private List<Integer> allCompanyIds;
    
    
    
    
    @JsonProperty("pending")
    private String pending;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigResponse returnConfig;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductSchemaV2> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
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
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
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
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
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
    Model: ReturnConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
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
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax_identifier")
    private TaxIdentifier taxIdentifier;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish1 productPublish;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("change_request_id")
    private Object changeRequestId;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("bulk_job_id")
    private String bulkJobId;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("teaser_tag")
    private TeaserTag teaserTag;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("requester")
    private String requester;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
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
public static class AttributeMasterSerializer{
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("synonyms")
    private Object synonyms;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("variant")
    private Boolean variant;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("suggestion")
    private String suggestion;
    
    
    
    
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
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("gtin_value")
    private String gtinValue;
    
    
    
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
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private Object itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("size")
    private Object size;
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("identifiers")
    private List<ValidateIdentifier> identifiers;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
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
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("product_online_date")
    private Integer productOnlineDate;
    
    
    
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
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublished productPublish;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("verified_by")
    private VerifiedBy verifiedBy;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("variant_group")
    private Object variantGroup;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantityResponse netQuantity;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("all_identifiers")
    private List<String> allIdentifiers;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("all_company_ids")
    private List<Integer> allCompanyIds;
    
    
    
    
    @JsonProperty("pending")
    private String pending;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfigResponse returnConfig;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Product> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail1 modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("template")
    private ProductTemplate template;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail1 createdBy;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private ProductBulkRequest items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<Object> cancelledRecords;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("custom_template_tag")
    private String customTemplateTag;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_by")
    private UserCommon modifiedBy;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("retry")
    private Integer retry;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private UserCommon createdBy;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private ProductSizeDeleteDataResponse data;
    
    
    
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
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("sellable_quantity")
    private Integer sellableQuantity;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size_distribution")
    private SizeDistribution sizeDistribution;
    
    
    
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
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("gtin_value")
    private Object gtinValue;
    
    
    
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
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("size")
    private Object size;
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("identifiers")
    private List<GTIN> identifiers;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
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
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
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
    
    
    
    
    @JsonProperty("sizes")
    private List<InvSize> sizes;
    
    
    
    
    @JsonProperty("item")
    private ItemQuery item;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
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
public static class Trader1{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
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
    
    
    
    
    @JsonProperty("sellable")
    private QuantityBase sellable;
    
    
    
    
    @JsonProperty("damaged")
    private QuantityBase damaged;
    
    
    
    
    @JsonProperty("not_available")
    private QuantityBase notAvailable;
    
    
    
    
    @JsonProperty("order_committed")
    private QuantityBase orderCommitted;
    
    
    
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
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
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
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
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
    Model: ReturnConfig1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig1{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
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
    Model: InventorySellerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySellerResponse{
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse manufacturer;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("fragile")
    private Boolean fragile;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta brand;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("fynd_meta")
    private Object fyndMeta;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("fynd_article_code")
    private String fyndArticleCode;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader1> trader;
    
    
    
    
    @JsonProperty("quantities")
    private Quantities quantities;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("fynd_item_code")
    private String fyndItemCode;
    
    
    
    
    @JsonProperty("price")
    private PriceMeta price;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse dimension;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta company;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse weight;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig1 returnConfig;
    
    
    
    
    @JsonProperty("store")
    private StoreMeta store;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<InventorySellerResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
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
    
    
    
    
    @JsonProperty("sellable")
    private Quantity sellable;
    
    
    
    
    @JsonProperty("damaged")
    private Quantity damaged;
    
    
    
    
    @JsonProperty("not_available")
    private Quantity notAvailable;
    
    
    
    
    @JsonProperty("order_committed")
    private Quantity orderCommitted;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
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
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
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
    Model: ReturnConfig2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig2{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
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
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse1 manufacturer;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta1 brand;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("quantities")
    private QuantitiesArticle quantities;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader2> trader;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("price")
    private PriceArticle price;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse1 dimension;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta1 company;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse1 weight;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig2 returnConfig;
    
    
    
    
    @JsonProperty("store")
    private ArticleStoreResponse store;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetInventories> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<BulkInventoryGetItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
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
    
    
    
    
    @JsonProperty("sizes")
    private List<InventoryJobPayload> sizes;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
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
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("operators")
    private String operators;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("filters")
    private InventoryExportAdvanceOption filters;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class InventoryExportResponse{
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("stores")
    private List<String> stores;
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("brands")
    private List<String> brands;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("filters")
    private InventoryJobFilters filters;
    
    
    
    
    @JsonProperty("cancelled_by")
    private UserDetail cancelledBy;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private InventoryExportQuantityFilter quantity;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
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
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("filters")
    private InventoryExportFilter filters;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("data")
    private List<String> data;
    
    
    
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
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
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
    
    
    
    
    @JsonProperty("payload")
    private List<InventoryPayload> payload;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
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
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
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
    Model: TaxSlab
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxSlab{
    
    
    
    
    @JsonProperty("cess")
    private Double cess;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
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
public static class HSNDataInsertV2{
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("taxes")
    private List<TaxSlab> taxes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<HSNDataInsertV2> items;
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("operators")
    private Object operators;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
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
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("page")
    private InventoryPage page;
    
    
    
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
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignment{
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("query")
    private ArticleQuery query;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
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
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("channel_identifier")
    private String channelIdentifier;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("articles")
    private List<AssignStoreArticle> articles;
    
    
    
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
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
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
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("store_pincode")
    private Integer storePincode;
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<Object> strategyWiseListing;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("s_city")
    private String sCity;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment1 articleAssignment;
    
    
    
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
    Model: UserSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer1{
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
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
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
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
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
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
public static class LocationDayWiseSerializer{
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
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
public static class UserSerializer2{
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer2 verifiedBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer2 modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer2 createdBy;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("integration_type")
    private LocationIntegrationType integrationType;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<GetLocationSerializer> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ApplicationDepartment> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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