
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
    Model: Rule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Rule{
    
    
    
    
    @JsonProperty("discount_qty")
    private Double discountQty;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("key")
    private Double key;
    
    
    
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
    Model: State
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class State{
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("is_display")
    private Boolean isDisplay;
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
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
    Model: RuleDefinition
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleDefinition{
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("applicable_on")
    private String applicableOn;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("is_exact")
    private Boolean isExact;
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
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
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
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
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
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
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("networks")
    private List<String> networks;
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue uses;
    
    
    
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
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
    
    @JsonProperty("price_range")
    private PriceRange priceRange;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction uses;
    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    @JsonProperty("bulk_bundle")
    private BulkBundleRestriction bulkBundle;
    
    
    
    
    @JsonProperty("coupon_allowed")
    private Boolean couponAllowed;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
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
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("remove")
    private DisplayMetaDict remove;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("apply")
    private DisplayMetaDict apply;
    
    
    
    
    @JsonProperty("auto")
    private DisplayMetaDict auto;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
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
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private List<Integer> companyId;
    
    
    
    
    @JsonProperty("article_id")
    private List<String> articleId;
    
    
    
    
    @JsonProperty("exclude_brand_id")
    private List<Integer> excludeBrandId;
    
    
    
    
    @JsonProperty("brand_id")
    private List<Integer> brandId;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("category_id")
    private List<Integer> categoryId;
    
    
    
    
    @JsonProperty("collection_id")
    private List<String> collectionId;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
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
    Model: CouponAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAdd{
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
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
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
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
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("schedule")
    private CouponSchedule schedule;
    
    
    
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
    
    
    
    
    @JsonProperty("equals")
    private Double equals;
    
    
    
    
    @JsonProperty("greater_than")
    private Double greaterThan;
    
    
    
    
    @JsonProperty("less_than")
    private Double lessThan;
    
    
    
    
    @JsonProperty("greater_than_equals")
    private Double greaterThanEquals;
    
    
    
    
    @JsonProperty("less_than_equals")
    private Double lessThanEquals;
    
    
    
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
    
    
    
    
    @JsonProperty("cart_total")
    private CompareObject cartTotal;
    
    
    
    
    @JsonProperty("item_sku")
    private List<String> itemSku;
    
    
    
    
    @JsonProperty("all_items")
    private Boolean allItems;
    
    
    
    
    @JsonProperty("item_exclude_sku")
    private List<String> itemExcludeSku;
    
    
    
    
    @JsonProperty("item_company")
    private List<Integer> itemCompany;
    
    
    
    
    @JsonProperty("item_exclude_company")
    private List<Integer> itemExcludeCompany;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<String> buyRules;
    
    
    
    
    @JsonProperty("item_exclude_store")
    private List<Integer> itemExcludeStore;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("item_size")
    private List<String> itemSize;
    
    
    
    
    @JsonProperty("item_exclude_category")
    private List<Integer> itemExcludeCategory;
    
    
    
    
    @JsonProperty("cart_quantity")
    private CompareObject cartQuantity;
    
    
    
    
    @JsonProperty("item_exclude_brand")
    private List<Integer> itemExcludeBrand;
    
    
    
    
    @JsonProperty("item_store")
    private List<Integer> itemStore;
    
    
    
    
    @JsonProperty("item_category")
    private List<Integer> itemCategory;
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
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
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
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
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
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
    
    
    
    
    @JsonProperty("user_registered")
    private UserRegistered userRegistered;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction1 uses;
    
    
    
    
    @JsonProperty("payments")
    private List<PromotionPaymentModes> payments;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("order_quantity")
    private Integer orderQuantity;
    
    
    
    
    @JsonProperty("anonymous_users")
    private Boolean anonymousUsers;
    
    
    
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
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
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
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
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
    Model: DiscountOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountOffer{
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
    
    @JsonProperty("max_offer_quantity")
    private Integer maxOfferQuantity;
    
    
    
    
    @JsonProperty("discount_price")
    private Double discountPrice;
    
    
    
    
    @JsonProperty("max_discount_amount")
    private Double maxDiscountAmount;
    
    
    
    
    @JsonProperty("discount_percentage")
    private Double discountPercentage;
    
    
    
    
    @JsonProperty("min_offer_quantity")
    private Integer minOfferQuantity;
    
    
    
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
    
    
    
    
    @JsonProperty("buy_condition")
    private String buyCondition;
    
    
    
    
    @JsonProperty("offer")
    private DiscountOffer offer;
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriteria itemCriteria;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("pdp")
    private Boolean pdp;
    
    
    
    
    @JsonProperty("coupon_list")
    private Boolean couponList;
    
    
    
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
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
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
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
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
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
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
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("schedule")
    private PromotionSchedule schedule;
    
    
    
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
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
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
    private CartItem cartItems;
    
    
    
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
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
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
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
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
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
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
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
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
    
    
    
    
    @JsonProperty("base")
    private BasePrice base;
    
    
    
    
    @JsonProperty("converted")
    private BasePrice converted;
    
    
    
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
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
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
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
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
    
    
    
    
    @JsonProperty("base")
    private ProductPrice base;
    
    
    
    
    @JsonProperty("converted")
    private ProductPrice converted;
    
    
    
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
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
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
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
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
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
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
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership2 ownership;
    
    
    
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
    Model: CartProductInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProductInfo{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
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
    
    
    
    
    @JsonProperty("cart_items")
    private CartItem cartItems;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
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
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
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
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
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
    Model: OpenApiCartServiceabilityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCartServiceabilityResponse{
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
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
    
    
    
    
    @JsonProperty("primary_item")
    private Boolean primaryItem;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
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
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
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
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
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
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("meta")
    private CartItemMeta meta;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("product_id")
    private Integer productId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
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
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("cart_items")
    private List<OpenApiOrderItem> cartItems;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("employee_discount")
    private Object employeeDiscount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
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
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("order_ref_id")
    private String orderRefId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("promotion")
    private Object promotion;
    
    
    
    
    @JsonProperty("shipments")
    private List<Object> shipments;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("cashback")
    private Object cashback;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("fc_index_map")
    private List<Integer> fcIndexMap;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Object fyndCredits;
    
    
    
    
    @JsonProperty("cod_charges")
    private Object codCharges;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("merge_qty")
    private Boolean mergeQty;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("bulk_coupon_discount")
    private Double bulkCouponDiscount;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_archive")
    private Boolean isArchive;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Object deliveryCharges;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("payments")
    private Object payments;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
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
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
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
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
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
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}




}