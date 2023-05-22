
package com.sdk.platform.cart;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class CartPlatformModels{


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
    Model: Ownership
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ownership{
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
}


/*
    Model: Validity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validity{
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: CouponAuthor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAuthor{
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
}


/*
    Model: DisplayMetaDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMetaDict{
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: DisplayMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMeta{
    
    
    
    
    @JsonProperty("remove")
    private DisplayMetaDict remove;
    
    
    
    
    @JsonProperty("apply")
    private DisplayMetaDict apply;
    
    
    
    
    @JsonProperty("auto")
    private DisplayMetaDict auto;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: Validation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validation{
    
    
    
    
    @JsonProperty("user_registered_after")
    private String userRegisteredAfter;
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
    @JsonProperty("app_id")
    private List<String> appId;
    
    
    
}


/*
    Model: Identifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Identifier{
    
    
    
    
    @JsonProperty("collection_id")
    private List<String> collectionId;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("email_domain")
    private List<String> emailDomain;
    
    
    
    
    @JsonProperty("category_id")
    private List<Integer> categoryId;
    
    
    
    
    @JsonProperty("exclude_brand_id")
    private List<Integer> excludeBrandId;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("company_id")
    private List<Integer> companyId;
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
    
    @JsonProperty("brand_id")
    private List<Integer> brandId;
    
    
    
    
    @JsonProperty("article_id")
    private List<String> articleId;
    
    
    
}


/*
    Model: State
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class State{
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    @JsonProperty("is_display")
    private Boolean isDisplay;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
}


/*
    Model: Rule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Rule{
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("key")
    private Double key;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("discount_qty")
    private Double discountQty;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
}


/*
    Model: CouponAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAction{
    
    
    
    
    @JsonProperty("txn_mode")
    private String txnMode;
    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
}


/*
    Model: PostOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostOrder{
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
}


/*
    Model: BulkBundleRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkBundleRestriction{
    
    
    
    
    @JsonProperty("multi_store_allowed")
    private Boolean multiStoreAllowed;
    
    
    
}


/*
    Model: UsesRemaining
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRemaining{
    
    
    
    
    @JsonProperty("user")
    private Integer user;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("app")
    private Integer app;
    
    
    
}


/*
    Model: UsesRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRestriction{
    
    
    
    
    @JsonProperty("maximum")
    private UsesRemaining maximum;
    
    
    
    
    @JsonProperty("remaining")
    private UsesRemaining remaining;
    
    
    
}


/*
    Model: PriceRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceRange{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
}


/*
    Model: PaymentAllowValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentAllowValue{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: PaymentModes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModes{
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue uses;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("networks")
    private List<String> networks;
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
}


/*
    Model: Restrictions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions{
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder postOrder;
    
    
    
    
    @JsonProperty("coupon_allowed")
    private Boolean couponAllowed;
    
    
    
    
    @JsonProperty("bulk_bundle")
    private BulkBundleRestriction bulkBundle;
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction uses;
    
    
    
    
    @JsonProperty("price_range")
    private PriceRange priceRange;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
}


/*
    Model: CouponDateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponDateMeta{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: CouponSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponSchedule{
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
}


/*
    Model: RuleDefinition
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleDefinition{
    
    
    
    
    @JsonProperty("is_exact")
    private Boolean isExact;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("applicable_on")
    private String applicableOn;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
}


/*
    Model: CouponAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAdd{
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
}


/*
    Model: CouponsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponsResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private CouponAdd items;
    
    
    
}


/*
    Model: SuccessMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessMessage{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: OperationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OperationErrorResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CouponUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponUpdate{
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
}


/*
    Model: CouponPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponPartialUpdate{
    
    
    
    
    @JsonProperty("schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
}


/*
    Model: PromotionAuthor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAuthor{
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
}


/*
    Model: PromotionSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionSchedule{
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
}


/*
    Model: Ownership1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ownership1{
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
}


/*
    Model: DisplayMeta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMeta1{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("offer_label")
    private String offerLabel;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: PromotionAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAction{
    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
}


/*
    Model: PromotionDateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionDateMeta{
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: Visibility
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Visibility{
    
    
    
    
    @JsonProperty("coupon_list")
    private Boolean couponList;
    
    
    
    
    @JsonProperty("pdp")
    private Boolean pdp;
    
    
    
}


/*
    Model: DiscountOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountOffer{
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("max_offer_quantity")
    private Integer maxOfferQuantity;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
    
    @JsonProperty("discount_percentage")
    private Double discountPercentage;
    
    
    
    
    @JsonProperty("min_offer_quantity")
    private Integer minOfferQuantity;
    
    
    
    
    @JsonProperty("max_discount_amount")
    private Double maxDiscountAmount;
    
    
    
    
    @JsonProperty("max_usage_per_transaction")
    private Integer maxUsagePerTransaction;
    
    
    
    
    @JsonProperty("discount_price")
    private Double discountPrice;
    
    
    
    
    @JsonProperty("apportion_discount")
    private Boolean apportionDiscount;
    
    
    
}


/*
    Model: CompareObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompareObject{
    
    
    
    
    @JsonProperty("greater_than")
    private Double greaterThan;
    
    
    
    
    @JsonProperty("equals")
    private Double equals;
    
    
    
    
    @JsonProperty("less_than")
    private Double lessThan;
    
    
    
    
    @JsonProperty("less_than_equals")
    private Double lessThanEquals;
    
    
    
    
    @JsonProperty("greater_than_equals")
    private Double greaterThanEquals;
    
    
    
}


/*
    Model: ItemCriteria
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemCriteria{
    
    
    
    
    @JsonProperty("item_store")
    private List<Integer> itemStore;
    
    
    
    
    @JsonProperty("item_exclude_sku")
    private List<String> itemExcludeSku;
    
    
    
    
    @JsonProperty("item_sku")
    private List<String> itemSku;
    
    
    
    
    @JsonProperty("cart_total")
    private CompareObject cartTotal;
    
    
    
    
    @JsonProperty("item_company")
    private List<Integer> itemCompany;
    
    
    
    
    @JsonProperty("item_l2_category")
    private List<Integer> itemL2Category;
    
    
    
    
    @JsonProperty("item_exclude_department")
    private List<Integer> itemExcludeDepartment;
    
    
    
    
    @JsonProperty("item_exclude_brand")
    private List<Integer> itemExcludeBrand;
    
    
    
    
    @JsonProperty("cart_unique_item_quantity")
    private CompareObject cartUniqueItemQuantity;
    
    
    
    
    @JsonProperty("available_zones")
    private List<String> availableZones;
    
    
    
    
    @JsonProperty("item_tags")
    private List<String> itemTags;
    
    
    
    
    @JsonProperty("item_exclude_l2_category")
    private List<Integer> itemExcludeL2Category;
    
    
    
    
    @JsonProperty("item_l1_category")
    private List<Integer> itemL1Category;
    
    
    
    
    @JsonProperty("item_exclude_store")
    private List<Integer> itemExcludeStore;
    
    
    
    
    @JsonProperty("product_tags")
    private List<String> productTags;
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
    
    @JsonProperty("item_exclude_category")
    private List<Integer> itemExcludeCategory;
    
    
    
    
    @JsonProperty("all_items")
    private Boolean allItems;
    
    
    
    
    @JsonProperty("item_category")
    private List<Integer> itemCategory;
    
    
    
    
    @JsonProperty("cart_unique_item_amount")
    private CompareObject cartUniqueItemAmount;
    
    
    
    
    @JsonProperty("cart_quantity")
    private CompareObject cartQuantity;
    
    
    
    
    @JsonProperty("item_exclude_id")
    private List<Integer> itemExcludeId;
    
    
    
    
    @JsonProperty("item_exclude_company")
    private List<Integer> itemExcludeCompany;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("item_department")
    private List<Integer> itemDepartment;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<String> buyRules;
    
    
    
    
    @JsonProperty("item_exclude_l1_category")
    private List<Integer> itemExcludeL1Category;
    
    
    
    
    @JsonProperty("item_size")
    private List<String> itemSize;
    
    
    
}


/*
    Model: DiscountRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRule{
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("buy_condition")
    private String buyCondition;
    
    
    
    
    @JsonProperty("offer")
    private DiscountOffer offer;
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriteria itemCriteria;
    
    
    
}


/*
    Model: PostOrder1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostOrder1{
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
}


/*
    Model: UserRegistered
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserRegistered{
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: UsesRemaining1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRemaining1{
    
    
    
    
    @JsonProperty("user")
    private Integer user;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
}


/*
    Model: UsesRestriction1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRestriction1{
    
    
    
    
    @JsonProperty("maximum")
    private UsesRemaining1 maximum;
    
    
    
    
    @JsonProperty("remaining")
    private UsesRemaining1 remaining;
    
    
    
}


/*
    Model: PaymentAllowValue1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentAllowValue1{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: PromotionPaymentModes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionPaymentModes{
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue1 uses;
    
    
    
}


/*
    Model: Restrictions1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions1{
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder1 postOrder;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("user_registered")
    private UserRegistered userRegistered;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction1 uses;
    
    
    
    
    @JsonProperty("anonymous_users")
    private Boolean anonymousUsers;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("order_quantity")
    private Integer orderQuantity;
    
    
    
    
    @JsonProperty("payments")
    private List<PromotionPaymentModes> payments;
    
    
    
}


/*
    Model: PromotionListItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionListItem{
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
}


/*
    Model: PromotionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionsResponse{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private PromotionListItem items;
    
    
    
}


/*
    Model: PromotionAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAdd{
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
}


/*
    Model: PromotionUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionUpdate{
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
}


/*
    Model: PromotionPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionPartialUpdate{
    
    
    
    
    @JsonProperty("schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
}


/*
    Model: ActivePromosResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActivePromosResponse{
    
    
    
    
    @JsonProperty("example")
    private String example;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("entity_slug")
    private String entitySlug;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: CartItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItem{
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: OpenapiCartDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenapiCartDetailsRequest{
    
    
    
    
    @JsonProperty("cart_items")
    private List<CartItem> cartItems;
    
    
    
}


/*
    Model: CouponBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponBreakup{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: LoyaltyPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoyaltyPoints{
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
}


/*
    Model: DisplayBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayBreakup{
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
}


/*
    Model: RawBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RawBreakup{
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    @JsonProperty("gift_card")
    private Double giftCard;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
}


/*
    Model: CartBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartBreakup{
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
}


/*
    Model: BaseInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BaseInfo{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: BasePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BasePrice{
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
}


/*
    Model: ArticlePriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticlePriceInfo{
    
    
    
    
    @JsonProperty("converted")
    private BasePrice converted;
    
    
    
    
    @JsonProperty("base")
    private BasePrice base;
    
    
    
}


/*
    Model: ProductArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductArticle{
    
    
    
    
    @JsonProperty("store")
    private BaseInfo store;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("cart_item_meta")
    private Object cartItemMeta;
    
    
    
    
    @JsonProperty("is_gift_visible")
    private Boolean isGiftVisible;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("gift_card")
    private Object giftCard;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
}


/*
    Model: Ownership2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ownership2{
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
}


/*
    Model: DiscountRulesApp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRulesApp{
    
    
    
    
    @JsonProperty("raw_offer")
    private Object rawOffer;
    
    
    
    
    @JsonProperty("matched_buy_rules")
    private List<String> matchedBuyRules;
    
    
    
    
    @JsonProperty("offer")
    private Object offer;
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
}


/*
    Model: FreeGiftItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreeGiftItem{
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("item_slug")
    private String itemSlug;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_brand_name")
    private String itemBrandName;
    
    
    
    
    @JsonProperty("item_price_details")
    private Object itemPriceDetails;
    
    
    
}


/*
    Model: AppliedFreeArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedFreeArticles{
    
    
    
    
    @JsonProperty("free_gift_item_details")
    private FreeGiftItem freeGiftItemDetails;
    
    
    
    
    @JsonProperty("parent_item_identifier")
    private String parentItemIdentifier;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: BuyRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyRules{
    
    
    
    
    @JsonProperty("cart_conditions")
    private Object cartConditions;
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
}


/*
    Model: AppliedPromotion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedPromotion{
    
    
    
    
    @JsonProperty("ownership")
    private Ownership2 ownership;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRulesApp> discountRules;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("applied_free_articles")
    private List<AppliedFreeArticles> appliedFreeArticles;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
}


/*
    Model: Tags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tags{
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
}


/*
    Model: CategoryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryInfo{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: ProductImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductImage{
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: ActionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionQuery{
    
    
    
    
    @JsonProperty("product_slug")
    private List<String> productSlug;
    
    
    
}


/*
    Model: ProductAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAction{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
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
    private String unit;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: CartProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProduct{
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Tags teaserTag;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: CartProductIdentifer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProductIdentifer{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
}


/*
    Model: PromoMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoMeta{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ProductPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPrice{
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
}


/*
    Model: ProductPriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPriceInfo{
    
    
    
    
    @JsonProperty("converted")
    private ProductPrice converted;
    
    
    
    
    @JsonProperty("base")
    private ProductPrice base;
    
    
    
}


/*
    Model: CouponDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponDetails{
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("discount_total_quantity")
    private Double discountTotalQuantity;
    
    
    
    
    @JsonProperty("discount_single_quantity")
    private Double discountSingleQuantity;
    
    
    
}


/*
    Model: PromiseFormatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseFormatted{
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
}


/*
    Model: PromiseTimestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseTimestamp{
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
}


/*
    Model: ShipmentPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentPromise{
    
    
    
    
    @JsonProperty("formatted")
    private PromiseFormatted formatted;
    
    
    
    
    @JsonProperty("timestamp")
    private PromiseTimestamp timestamp;
    
    
    
}


/*
    Model: ProductAvailabilitySize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAvailabilitySize{
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: ProductAvailability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAvailability{
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("available_sizes")
    private List<ProductAvailabilitySize> availableSizes;
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
}


/*
    Model: CartProductInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProductInfo{
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("coupon")
    private CouponDetails coupon;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
}


/*
    Model: OpenapiCartDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenapiCartDetailsResponse{
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
}


/*
    Model: OpenApiErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiErrorResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
}


/*
    Model: ShippingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingAddress{
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: OpenApiCartServiceabilityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCartServiceabilityRequest{
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
    @JsonProperty("cart_items")
    private List<CartItem> cartItems;
    
    
    
}


/*
    Model: OpenApiCartServiceabilityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCartServiceabilityResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
}


/*
    Model: MultiTenderPaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMeta{
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: MultiTenderPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMethod{
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
}


/*
    Model: OpenApiFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiFiles{
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: CartItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItemMeta{
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("primary_item")
    private Boolean primaryItem;
    
    
    
}


/*
    Model: OpenApiOrderItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiOrderItem{
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("meta")
    private CartItemMeta meta;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("product_id")
    private Integer productId;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: OpenApiPlatformCheckoutReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiPlatformCheckoutReq{
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("cart_items")
    private List<OpenApiOrderItem> cartItems;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("employee_discount")
    private Object employeeDiscount;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
}


/*
    Model: OpenApiCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCheckoutResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("order_ref_id")
    private String orderRefId;
    
    
    
}


/*
    Model: AbandonedCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonedCart{
    
    
    
    
    @JsonProperty("bulk_coupon_discount")
    private Double bulkCouponDiscount;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("is_archive")
    private Boolean isArchive;
    
    
    
    
    @JsonProperty("cod_charges")
    private Object codCharges;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("payments")
    private Object payments;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Object deliveryCharges;
    
    
    
    
    @JsonProperty("shipments")
    private List<Object> shipments;
    
    
    
    
    @JsonProperty("cashback")
    private Object cashback;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("fc_index_map")
    private List<Integer> fcIndexMap;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("promotion")
    private Object promotion;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Object fyndCredits;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("merge_qty")
    private Boolean mergeQty;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
}


/*
    Model: AbandonedCartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonedCartResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<AbandonedCart> items;
    
    
    
}


/*
    Model: CartCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCurrency{
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
}


/*
    Model: PaymentSelectionLock
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSelectionLock{
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
}


/*
    Model: CartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDetailResponse{
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
}


/*
    Model: AddProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProductCart{
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private List<HashMap<String,String>> parentItemIdentifiers;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
}


/*
    Model: AddCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddCartRequest{
    
    
    
    
    @JsonProperty("new_cart")
    private Boolean newCart;
    
    
    
    
    @JsonProperty("items")
    private List<AddProductCart> items;
    
    
    
}


/*
    Model: AddCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddCartDetailResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
}


/*
    Model: UpdateProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateProductCart{
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
}


/*
    Model: UpdateCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartRequest{
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("items")
    private List<UpdateProductCart> items;
    
    
    
}


/*
    Model: UpdateCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartDetailResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
}


/*
    Model: GetShareCartLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetShareCartLinkRequest{
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: GetShareCartLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetShareCartLinkResponse{
    
    
    
    
    @JsonProperty("share_url")
    private String shareUrl;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
}


/*
    Model: SharedCartDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SharedCartDetails{
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("source")
    private Object source;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: SharedCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SharedCart{
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("shared_cart_details")
    private SharedCartDetails sharedCartDetails;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
}


/*
    Model: SharedCartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SharedCartResponse{
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("cart")
    private SharedCart cart;
    
    
    
}


/*
    Model: CartList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartList{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("item_counts")
    private Integer itemCounts;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
}


/*
    Model: MultiCartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiCartResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<CartList> data;
    
    
    
}


/*
    Model: UpdateUserCartMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateUserCartMapping{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
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
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("external_id")
    private String externalId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
}


/*
    Model: UserCartMappingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCartMappingResponse{
    
    
    
    
    @JsonProperty("user")
    private UserInfo user;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
}


/*
    Model: DeleteCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteCartRequest{
    
    
    
    
    @JsonProperty("cart_id_list")
    private List<String> cartIdList;
    
    
    
}


/*
    Model: DeleteCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteCartDetailResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CartItemCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItemCountResponse{
    
    
    
    
    @JsonProperty("user_cart_items_count")
    private Integer userCartItemsCount;
    
    
    
}


/*
    Model: PageCoupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageCoupon{
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
}


/*
    Model: Coupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Coupon{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("is_applicable")
    private Boolean isApplicable;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: GetCouponResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCouponResponse{
    
    
    
    
    @JsonProperty("page")
    private PageCoupon page;
    
    
    
    
    @JsonProperty("available_coupon_list")
    private List<Coupon> availableCouponList;
    
    
    
}


/*
    Model: ApplyCouponRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplyCouponRequest{
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
}


/*
    Model: GeoLocation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoLocation{
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
}


/*
    Model: PlatformAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformAddress{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("created_by_user_id")
    private String createdByUserId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("google_map_point")
    private Object googleMapPoint;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
}


/*
    Model: PlatformGetAddressesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformGetAddressesResponse{
    
    
    
    
    @JsonProperty("address")
    private List<PlatformAddress> address;
    
    
    
}


/*
    Model: SaveAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveAddressResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: UpdateAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateAddressResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_updated")
    private Boolean isUpdated;
    
    
    
}


/*
    Model: DeleteAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteAddressResponse{
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    
    
    
}


/*
    Model: PlatformSelectCartAddressRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformSelectCartAddressRequest{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
}


/*
    Model: ShipmentArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentArticle{
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private String quantity;
    
    
    
}


/*
    Model: PlatformShipmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipmentResponse{
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("articles")
    private List<ShipmentArticle> articles;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("promise")
    private ShipmentPromise promise;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
}


/*
    Model: PlatformCartShipmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformCartShipmentsResponse{
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("error")
    private Boolean error;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipmentResponse> shipments;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
}


/*
    Model: UpdateCartShipmentItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartShipmentItem{
    
    
    
    
    @JsonProperty("article_uid")
    private String articleUid;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: UpdateCartShipmentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartShipmentRequest{
    
    
    
    
    @JsonProperty("shipments")
    private List<UpdateCartShipmentItem> shipments;
    
    
    
}


/*
    Model: PlatformCartMetaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformCartMetaRequest{
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("gift_details")
    private Object giftDetails;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
}


/*
    Model: CartMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaResponse{
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CartMetaMissingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaMissingResponse{
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
}


/*
    Model: Files
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Files{
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: StaffCheckout
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StaffCheckout{
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
}


/*
    Model: PlatformCartCheckoutDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformCartCheckoutDetailRequest{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("pick_at_store_uid")
    private Integer pickAtStoreUid;
    
    
    
}


/*
    Model: CheckCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckCart{
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
    @JsonProperty("delivery_charge_order_value")
    private Integer deliveryChargeOrderValue;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("store_emps")
    private List<Object> storeEmps;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("cod_message")
    private String codMessage;
    
    
    
    
    @JsonProperty("cod_available")
    private Boolean codAvailable;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
}


/*
    Model: CartCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCheckoutResponse{
    
    
    
    
    @JsonProperty("app_intercept_url")
    private String appInterceptUrl;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("cart")
    private CheckCart cart;
    
    
    
}


/*
    Model: CartDeliveryModesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDeliveryModesResponse{
    
    
    
    
    @JsonProperty("available_modes")
    private List<String> availableModes;
    
    
    
    
    @JsonProperty("pickup_stores")
    private List<Integer> pickupStores;
    
    
    
}


/*
    Model: PickupStoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PickupStoreDetail{
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: StoreDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetailsResponse{
    
    
    
    
    @JsonProperty("items")
    private List<PickupStoreDetail> items;
    
    
    
}


/*
    Model: UpdateCartPaymentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartPaymentRequest{
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
}


/*
    Model: CouponValidity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponValidity{
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_message_en")
    private String displayMessageEn;
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: PaymentCouponValidate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCouponValidate{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("coupon_validity")
    private CouponValidity couponValidity;
    
    
    
}


/*
    Model: PaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMeta{
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
}


/*
    Model: PaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethod{
    
    
    
    
    @JsonProperty("payment")
    private String payment;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("payment_meta")
    private PaymentMeta paymentMeta;
    
    
    
}


/*
    Model: PlatformCartCheckoutDetailV2Request
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformCartCheckoutDetailV2Request{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("custom_meta")
    private Object customMeta;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("pick_at_store_uid")
    private Integer pickAtStoreUid;
    
    
    
}


/*
    Model: UpdateCartPaymentRequestV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartPaymentRequestV2{
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
}




}