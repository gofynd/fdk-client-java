

package com.sdk.platform.cart;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class CartPlatformModels{


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
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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

    

    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("iins")
    private List<String> iins;
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
    
    @JsonProperty("networks")
    private List<String> networks;
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue uses;
    
    
    
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
    Model: Restrictions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions{

    

    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    @JsonProperty("price_range")
    private PriceRange priceRange;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder postOrder;
    
    
    
    
    @JsonProperty("bulk_bundle")
    private BulkBundleRestriction bulkBundle;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("coupon_allowed")
    private Boolean couponAllowed;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction uses;
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
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

    

    
    
    
    
    @JsonProperty("app_id")
    private List<String> appId;
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
    @JsonProperty("user_registered_after")
    private String userRegisteredAfter;
    
    
    
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

    

    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
    
    @JsonProperty("txn_mode")
    private String txnMode;
    
    
    
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
    Model: CouponSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponSchedule{

    

    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
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

    

    
    
    
    
    @JsonProperty("key")
    private Double key;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("discount_qty")
    private Double discountQty;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
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
    
    
    
    
    @JsonProperty("auto")
    private DisplayMetaDict auto;
    
    
    
    
    @JsonProperty("apply")
    private DisplayMetaDict apply;
    
    
    
    
    @JsonProperty("remove")
    private DisplayMetaDict remove;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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

    

    
    
    
    
    @JsonProperty("brand_id")
    private List<Integer> brandId;
    
    
    
    
    @JsonProperty("company_id")
    private List<Integer> companyId;
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
    
    @JsonProperty("collection_id")
    private List<String> collectionId;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("category_id")
    private List<Integer> categoryId;
    
    
    
    
    @JsonProperty("article_id")
    private List<String> articleId;
    
    
    
    
    @JsonProperty("exclude_brand_id")
    private List<Integer> excludeBrandId;
    
    
    
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
    Model: RuleDefinition
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleDefinition{

    

    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_exact")
    private Boolean isExact;
    
    
    
    
    @JsonProperty("applicable_on")
    private String applicableOn;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
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

    

    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
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

    

    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("last_id")
    private String lastId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
}


/*
    Model: CouponObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponObj{

    

    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("medias")
    private List<CouponMedias> medias;
    
    
    
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

    

    
    
    
    
    @JsonProperty("items")
    private List<CouponObj> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CouponMedias
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponMedias{

    

    
    
    
    
    @JsonProperty("alt")
    private String alt;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: CouponDetailObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponDetailObj{

    

    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
}


/*
    Model: CouponDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponDetailResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private CouponDetailObj data;
    
    
    
}


/*
    Model: TagsViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagsViewResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<String> items;
    
    
    
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
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
}


/*
    Model: CartMetaConfigOperationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigOperationErrorResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
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

    

    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
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
    Model: DisplayMeta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMeta1{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("offer_label")
    private String offerLabel;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
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
    
    
    
    
    @JsonProperty("less_than_equals")
    private Double lessThanEquals;
    
    
    
    
    @JsonProperty("less_than")
    private Double lessThan;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_quantity")
    private CompareObject cartQuantity;
    
    
    
    
    @JsonProperty("available_zones")
    private List<String> availableZones;
    
    
    
    
    @JsonProperty("item_exclude_company")
    private List<Integer> itemExcludeCompany;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("item_l1_category")
    private List<Integer> itemL1Category;
    
    
    
    
    @JsonProperty("cart_total")
    private CompareObject cartTotal;
    
    
    
    
    @JsonProperty("cart_unique_item_quantity")
    private CompareObject cartUniqueItemQuantity;
    
    
    
    
    @JsonProperty("cart_unique_item_amount")
    private CompareObject cartUniqueItemAmount;
    
    
    
    
    @JsonProperty("item_exclude_id")
    private List<Integer> itemExcludeId;
    
    
    
    
    @JsonProperty("all_items")
    private Boolean allItems;
    
    
    
    
    @JsonProperty("item_exclude_l1_category")
    private List<Integer> itemExcludeL1Category;
    
    
    
    
    @JsonProperty("item_size")
    private List<String> itemSize;
    
    
    
    
    @JsonProperty("item_store")
    private List<Integer> itemStore;
    
    
    
    
    @JsonProperty("item_exclude_sku")
    private List<String> itemExcludeSku;
    
    
    
    
    @JsonProperty("item_department")
    private List<Integer> itemDepartment;
    
    
    
    
    @JsonProperty("item_exclude_store")
    private List<Integer> itemExcludeStore;
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
    
    @JsonProperty("item_exclude_department")
    private List<Integer> itemExcludeDepartment;
    
    
    
    
    @JsonProperty("item_exclude_category")
    private List<Integer> itemExcludeCategory;
    
    
    
    
    @JsonProperty("item_category")
    private List<Integer> itemCategory;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<String> buyRules;
    
    
    
    
    @JsonProperty("item_exclude_brand")
    private List<Integer> itemExcludeBrand;
    
    
    
    
    @JsonProperty("item_l2_category")
    private List<Integer> itemL2Category;
    
    
    
    
    @JsonProperty("item_company")
    private List<Integer> itemCompany;
    
    
    
    
    @JsonProperty("item_tags")
    private List<String> itemTags;
    
    
    
    
    @JsonProperty("item_exclude_l2_category")
    private List<Integer> itemExcludeL2Category;
    
    
    
    
    @JsonProperty("item_sku")
    private List<String> itemSku;
    
    
    
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

    

    
    
    
    
    @JsonProperty("max_discount_amount")
    private Double maxDiscountAmount;
    
    
    
    
    @JsonProperty("discount_price")
    private Double discountPrice;
    
    
    
    
    @JsonProperty("apportion_discount")
    private Boolean apportionDiscount;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("max_usage_per_transaction")
    private Integer maxUsagePerTransaction;
    
    
    
    
    @JsonProperty("min_offer_quantity")
    private Integer minOfferQuantity;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
    
    @JsonProperty("discount_percentage")
    private Double discountPercentage;
    
    
    
    
    @JsonProperty("max_offer_quantity")
    private Integer maxOfferQuantity;
    
    
    
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
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriteria itemCriteria;
    
    
    
    
    @JsonProperty("offer")
    private DiscountOffer offer;
    
    
    
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
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue1 uses;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
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
    Model: Restrictions1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions1{

    

    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    @JsonProperty("user_registered")
    private UserRegistered userRegistered;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder1 postOrder;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("order_quantity")
    private Integer orderQuantity;
    
    
    
    
    @JsonProperty("anonymous_users")
    private Boolean anonymousUsers;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction1 uses;
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
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

    

    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
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
    Model: PromotionListItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionListItem{

    

    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_processed")
    private Boolean isProcessed;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
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

    

    
    
    
    
    @JsonProperty("items")
    private List<PromotionListItem> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("indexed_criteria")
    private List<PromoIndexedCriteria> indexedCriteria;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: PromotionAddResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAddResult{

    

    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("is_processed")
    private Boolean isProcessed;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("indexed_criteria")
    private List<PromoIndexedCriteria> indexedCriteria;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
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

    

    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: PromotionUpdateResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionUpdateResult{

    

    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("is_processed")
    private Boolean isProcessed;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("indexed_criteria")
    private List<PromoIndexedCriteria> indexedCriteria;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: PromoIndexedCriteria
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoIndexedCriteria{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
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

    

    
    
    
    
    @JsonProperty("publish")
    private Boolean publish;
    
    
    
    
    @JsonProperty("schedule")
    private PromotionSchedule schedule;
    
    
    
}


/*
    Model: ActivePromos
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActivePromos{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("entity_slug")
    private String entitySlug;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("example")
    private String example;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("items")
    private List<ActivePromos> items;
    
    
    
}


/*
    Model: Charges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Charges{

    

    
    
    
    
    @JsonProperty("charges")
    private Integer charges;
    
    
    
    
    @JsonProperty("threshold")
    private Integer threshold;
    
    
    
}


/*
    Model: DeliveryCharges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryCharges{

    

    
    
    
    
    @JsonProperty("charges")
    private List<Charges> charges;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: OrderPlacing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderPlacing{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PanCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PanCard{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("cod_threshold_amount")
    private Integer codThresholdAmount;
    
    
    
    
    @JsonProperty("online_threshold_amount")
    private Integer onlineThresholdAmount;
    
    
    
}


/*
    Model: CartMetaConfigUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigUpdate{

    

    
    
    
    
    @JsonProperty("min_cart_value")
    private Integer minCartValue;
    
    
    
    
    @JsonProperty("max_cart_value")
    private Integer maxCartValue;
    
    
    
    
    @JsonProperty("bulk_coupons")
    private Boolean bulkCoupons;
    
    
    
    
    @JsonProperty("max_cart_items")
    private Integer maxCartItems;
    
    
    
    
    @JsonProperty("gift_display_text")
    private String giftDisplayText;
    
    
    
    
    @JsonProperty("delivery_charges")
    private DeliveryCharges deliveryCharges;
    
    
    
    
    @JsonProperty("international_delivery_charges")
    private DeliveryCharges internationalDeliveryCharges;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
    @JsonProperty("gift_pricing")
    private Double giftPricing;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_universal")
    private Boolean isUniversal;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("last_modified_by")
    private String lastModifiedBy;
    
    
    
    
    @JsonProperty("order_placing")
    private OrderPlacing orderPlacing;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("article_tags")
    private List<String> articleTags;
    
    
    
    
    @JsonProperty("allow_coupon_with_rewards")
    private Boolean allowCouponWithRewards;
    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    @JsonProperty("pan_card")
    private PanCard panCard;
    
    
    
    
    @JsonProperty("empty_cart")
    private Boolean emptyCart;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("hide_on_storefront")
    private Boolean hideOnStorefront;
    
    
    
}


/*
    Model: TimeStampIDResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TimeStampIDResponse{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("last_modified_by")
    private String lastModifiedBy;
    
    
    
}


/*
    Model: CartMetaConfigDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigDetailResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: CartMetaConfigListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigListResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<CartMetaConfigListObject> data;
    
    
    
}


/*
    Model: CartMetaConfigListObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigListObject{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: CartMetaConfigAddResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigAddResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private CartMetaConfigAdd data;
    
    
    
}


/*
    Model: CartMetaConfigAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaConfigAdd{

    

    
    
    
    
    @JsonProperty("min_cart_value")
    private Integer minCartValue;
    
    
    
    
    @JsonProperty("max_cart_value")
    private Integer maxCartValue;
    
    
    
    
    @JsonProperty("bulk_coupons")
    private Boolean bulkCoupons;
    
    
    
    
    @JsonProperty("max_cart_items")
    private Integer maxCartItems;
    
    
    
    
    @JsonProperty("gift_display_text")
    private String giftDisplayText;
    
    
    
    
    @JsonProperty("delivery_charges")
    private DeliveryCharges deliveryCharges;
    
    
    
    
    @JsonProperty("international_delivery_charges")
    private DeliveryCharges internationalDeliveryCharges;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
    @JsonProperty("gift_pricing")
    private Double giftPricing;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_universal")
    private Boolean isUniversal;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("last_modified_by")
    private String lastModifiedBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("order_placing")
    private OrderPlacing orderPlacing;
    
    
    
    
    @JsonProperty("article_tags")
    private List<String> articleTags;
    
    
    
    
    @JsonProperty("allow_coupon_with_rewards")
    private Boolean allowCouponWithRewards;
    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    @JsonProperty("pan_card")
    private PanCard panCard;
    
    
    
    
    @JsonProperty("empty_cart")
    private Boolean emptyCart;
    
    
    
    
    @JsonProperty("hide_on_storefront")
    private Boolean hideOnStorefront;
    
    
    
}


/*
    Model: Article
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Article{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: PriceAdjustmentRestrictions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustmentRestrictions{

    

    
    
    
    
    @JsonProperty("post_order")
    private PostOrder1 postOrder;
    
    
    
}


/*
    Model: Collection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Collection{

    

    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("collected_by")
    private String collectedBy;
    
    
    
}


/*
    Model: PriceAdjustmentUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustmentUpdate{

    

    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("apply_expiry")
    private String applyExpiry;
    
    
    
    
    @JsonProperty("restrictions")
    private PriceAdjustmentRestrictions restrictions;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("collection")
    private Collection collection;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allowed_refund")
    private Boolean allowedRefund;
    
    
    
    
    @JsonProperty("is_authenticated")
    private Boolean isAuthenticated;
    
    
    
    
    @JsonProperty("article_ids")
    private List<Article> articleIds;
    
    
    
    
    @JsonProperty("remove_articles")
    private Boolean removeArticles;
    
    
    
    
    @JsonProperty("auto_remove")
    private Boolean autoRemove;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("allow_refund")
    private Boolean allowRefund;
    
    
    
    
    @JsonProperty("distribution_logic")
    private Object distributionLogic;
    
    
    
}


/*
    Model: PriceAdjustment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustment{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("apply_expiry")
    private String applyExpiry;
    
    
    
    
    @JsonProperty("restrictions")
    private PriceAdjustmentRestrictions restrictions;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("collection")
    private Collection collection;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allowed_refund")
    private Boolean allowedRefund;
    
    
    
    
    @JsonProperty("is_authenticated")
    private Boolean isAuthenticated;
    
    
    
    
    @JsonProperty("article_ids")
    private List<Article> articleIds;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("remove_articles")
    private Boolean removeArticles;
    
    
    
    
    @JsonProperty("auto_remove")
    private Boolean autoRemove;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("distribution_logic")
    private Object distributionLogic;
    
    
    
}


/*
    Model: AddPriceAdjustmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddPriceAdjustmentResponse{

    

    
    
    
    
    @JsonProperty("data")
    private PriceAdjustment data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("price_adjustments")
    private List<PriceAdjustment> priceAdjustments;
    
    
    
}


/*
    Model: UpdatePriceAdjustmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePriceAdjustmentResponse{

    

    
    
    
    
    @JsonProperty("data")
    private PriceAdjustment data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PriceAdjustmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustmentResponse{

    

    
    
    
    
    @JsonProperty("data")
    private List<PriceAdjustment> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("price_adjustments")
    private List<PriceAdjustment> priceAdjustments;
    
    
    
}


/*
    Model: GetPriceAdjustmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPriceAdjustmentResponse{

    

    
    
    
    
    @JsonProperty("data")
    private List<PriceAdjustment> data;
    
    
    
}


/*
    Model: PriceAdjustmentAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustmentAdd{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("apply_expiry")
    private String applyExpiry;
    
    
    
    
    @JsonProperty("restrictions")
    private PriceAdjustmentRestrictions restrictions;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("collection")
    private Collection collection;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("allowed_refund")
    private Boolean allowedRefund;
    
    
    
    
    @JsonProperty("is_authenticated")
    private Boolean isAuthenticated;
    
    
    
    
    @JsonProperty("article_ids")
    private List<Article> articleIds;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("remove_articles")
    private Boolean removeArticles;
    
    
    
    
    @JsonProperty("auto_remove")
    private Boolean autoRemove;
    
    
    
    
    @JsonProperty("distribution_logic")
    private Object distributionLogic;
    
    
    
}


/*
    Model: DistributionRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DistributionRule{

    

    
    
    
    
    @JsonProperty("conditions")
    private Object conditions;
    
    
    
}


/*
    Model: Distribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Distribution{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("logic")
    private String logic;
    
    
    
    
    @JsonProperty("rule")
    private Object rule;
    
    
    
}


/*
    Model: DistributionLogic
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DistributionLogic{

    

    
    
    
    
    @JsonProperty("distribution_level")
    private String distributionLevel;
    
    
    
    
    @JsonProperty("distribution")
    private Object distribution;
    
    
    
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

    

    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    @JsonProperty("original")
    private Double original;
    
    
    
    
    @JsonProperty("attr")
    private String attr;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
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
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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

    

    
    
    
    
    @JsonProperty("promotion")
    private Double promotion;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    @JsonProperty("gift_card")
    private Double giftCard;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("sub_total")
    private Double subTotal;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("total_charge")
    private Double totalCharge;
    
    
    
    
    @JsonProperty("mop_total")
    private Double mopTotal;
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
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

    

    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
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
    Model: BaseInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BaseInfo{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    Model: CategoryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryInfo{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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

    

    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("l1_categories")
    private List<Double> l1Categories;
    
    
    
    
    @JsonProperty("l2_categories")
    private List<Double> l2Categories;
    
    
    
    
    @JsonProperty("l3_categories")
    private List<Double> l3Categories;
    
    
    
    
    @JsonProperty("departments")
    private List<Double> departments;
    
    
    
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
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
}


/*
    Model: ArticleAppliedPriceAdjustment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAppliedPriceAdjustment{

    

    
    
    
    
    @JsonProperty("adjusted_value")
    private Object adjustedValue;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("applied_quantity")
    private Integer appliedQuantity;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
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
    Model: StoreInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreInfo{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
}


/*
    Model: ArticleGiftCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleGiftCard{

    

    
    
    
    
    @JsonProperty("gift_price")
    private Double giftPrice;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
    @JsonProperty("is_gift_applied")
    private Boolean isGiftApplied;
    
    
    
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

    

    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    @JsonProperty("cart_item_meta")
    private Object cartItemMeta;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("is_gift_visible")
    private Boolean isGiftVisible;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("gift_card")
    private ArticleGiftCard giftCard;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("mto_quantity")
    private Integer mtoQuantity;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("store")
    private StoreInfo store;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("variants")
    private HashMap<String,Object> variants;
    
    
    
}


/*
    Model: PromoDiscountRuleOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoDiscountRuleOffer{

    

    
    
    
    
    @JsonProperty("max_offer_quantity")
    private Double maxOfferQuantity;
    
    
    
    
    @JsonProperty("discount_percentage")
    private Double discountPercentage;
    
    
    
}


/*
    Model: PromoDiscountRuleRawOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoDiscountRuleRawOffer{

    

    
    
    
    
    @JsonProperty("buy_condition")
    private String buyCondition;
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("offer")
    private PromoDiscountRuleOffer offer;
    
    
    
    
    @JsonProperty("item_criteria")
    private PromoDiscountRuleItemCriteria itemCriteria;
    
    
    
}


/*
    Model: PromoDiscountRuleItemCriteria
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoDiscountRuleItemCriteria{

    

    
    
    
    
    @JsonProperty("item_id")
    private List<Double> itemId;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<String> buyRules;
    
    
    
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

    

    
    
    
    
    @JsonProperty("offer")
    private PromoDiscountRuleOffer offer;
    
    
    
    
    @JsonProperty("raw_offer")
    private PromoDiscountRuleRawOffer rawOffer;
    
    
    
    
    @JsonProperty("item_criteria")
    private PromoDiscountRuleItemCriteria itemCriteria;
    
    
    
    
    @JsonProperty("matched_buy_rules")
    private List<String> matchedBuyRules;
    
    
    
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

    

    
    
    
    
    @JsonProperty("parent_item_identifier")
    private String parentItemIdentifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("free_gift_item_details")
    private FreeGiftItems freeGiftItemDetails;
    
    
    
}


/*
    Model: PromoBuyRuleCartConditions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoBuyRuleCartConditions{

    

    
    
    
    
    @JsonProperty("cart_quantity")
    private PromoBuyRuleCompareFieldsTypes cartQuantity;
    
    
    
    
    @JsonProperty("cart_total")
    private PromoBuyRuleCompareFieldsTypes cartTotal;
    
    
    
    
    @JsonProperty("item_id")
    private List<Double> itemId;
    
    
    
    
    @JsonProperty("item_store")
    private List<Double> itemStore;
    
    
    
    
    @JsonProperty("item_company")
    private List<Double> itemCompany;
    
    
    
    
    @JsonProperty("item_brand")
    private List<Double> itemBrand;
    
    
    
    
    @JsonProperty("item_exclude_brand")
    private List<Double> itemExcludeBrand;
    
    
    
    
    @JsonProperty("item_category")
    private List<Double> itemCategory;
    
    
    
    
    @JsonProperty("item_exclude_category")
    private List<Double> itemExcludeCategory;
    
    
    
    
    @JsonProperty("item_l1_category")
    private List<Double> itemL1Category;
    
    
    
    
    @JsonProperty("item_exclude_l1_category")
    private List<Double> itemExcludeL1Category;
    
    
    
    
    @JsonProperty("item_l2_category")
    private List<Double> itemL2Category;
    
    
    
    
    @JsonProperty("item_exclude_l2_category")
    private List<Double> itemExcludeL2Category;
    
    
    
    
    @JsonProperty("item_department")
    private List<Double> itemDepartment;
    
    
    
    
    @JsonProperty("item_exclude_id")
    private List<Double> itemExcludeId;
    
    
    
    
    @JsonProperty("available_zones")
    private List<Double> availableZones;
    
    
    
    
    @JsonProperty("product_tags")
    private List<String> productTags;
    
    
    
}


/*
    Model: PromoBuyRuleCompareFieldsTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoBuyRuleCompareFieldsTypes{

    

    
    
    
    
    @JsonProperty("greater_than_equals")
    private Double greaterThanEquals;
    
    
    
    
    @JsonProperty("greater_than")
    private Double greaterThan;
    
    
    
    
    @JsonProperty("equals")
    private Double equals;
    
    
    
    
    @JsonProperty("less_than")
    private Double lessThan;
    
    
    
    
    @JsonProperty("less_than_equals")
    private Double lessThanEquals;
    
    
    
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
    private PromoBuyRuleCartConditions cartConditions;
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
    
    @JsonProperty("all_items")
    private Boolean allItems;
    
    
    
    
    @JsonProperty("mrp_promo")
    private Boolean mrpPromo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
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

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("original_article_quantity")
    private Integer originalArticleQuantity;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRulesApp> discountRules;
    
    
    
    
    @JsonProperty("applied_free_articles")
    private List<AppliedFreeArticles> appliedFreeArticles;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("offer_label")
    private String offerLabel;
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
    @JsonProperty("promo_code")
    private String promoCode;
    
    
    
    
    @JsonProperty("free_quantity")
    private Integer freeQuantity;
    
    
    
    
    @JsonProperty("offer_description")
    private String offerDescription;
    
    
    
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
    Model: PromiseISOFormat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseISOFormat{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("iso")
    private PromiseISOFormat iso;
    
    
    
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

    

    
    
    
    
    @JsonProperty("discount_total_quantity")
    private Double discountTotalQuantity;
    
    
    
    
    @JsonProperty("discount_single_quantity")
    private Double discountSingleQuantity;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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

    

    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    @JsonProperty("selling_price")
    private Double sellingPrice;
    
    
    
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
    Model: ProductAvailabilitySize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAvailabilitySize{

    

    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
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

    

    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Long otherStoreQuantity;
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    @JsonProperty("available_sizes")
    private List<ProductAvailabilitySize> availableSizes;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
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
    Model: ParentItemIdentifiers
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ParentItemIdentifiers{

    

    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("parent_item_size")
    private String parentItemSize;
    
    
    
    
    @JsonProperty("parent_item_id")
    private String parentItemId;
    
    
    
}


/*
    Model: CartItemMOQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItemMOQ{

    

    
    
    
    
    @JsonProperty("increment_unit")
    private Double incrementUnit;
    
    
    
    
    @JsonProperty("maximum")
    private Double maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Double minimum;
    
    
    
}


/*
    Model: CartItemCustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItemCustomOrder{

    

    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Double manufacturingTime;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
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

    

    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    @JsonProperty("product_ean_id")
    private String productEanId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("coupon")
    private CouponDetails coupon;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<ArticleAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    @JsonProperty("moq")
    private CartItemMOQ moq;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("custom_order")
    private CartItemCustomOrder customOrder;
    
    
    
    
    @JsonProperty("charges")
    private List<Double> charges;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("discount_meta")
    private DiscountMeta discountMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("start_timer_in_minutes")
    private Double startTimerInMinutes;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: PriceAdjustmentApplied
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceAdjustmentApplied{

    

    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("adjusted_value")
    private Object adjustedValue;
    
    
    
    
    @JsonProperty("applied_quantity")
    private Double appliedQuantity;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<CartAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
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

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
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
    private List<CartItem> cartItems;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<CartAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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
    Model: MultiTenderPaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMeta{

    

    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("meta")
    private CartItemMeta meta;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("product_id")
    private Integer productId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
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

    

    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("cart_items")
    private List<OpenApiOrderItem> cartItems;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("employee_discount")
    private Object employeeDiscount;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("platform_order_id")
    private String platformOrderId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("order_ref_id")
    private String orderRefId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
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
    
    
    
    
    @JsonProperty("promotion")
    private Object promotion;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("bulk_coupon_discount")
    private Double bulkCouponDiscount;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Object fyndCredits;
    
    
    
    
    @JsonProperty("fc_index_map")
    private List<Integer> fcIndexMap;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Object codCharges;
    
    
    
    
    @JsonProperty("payments")
    private Object payments;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("shipments")
    private List<Object> shipments;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("is_archive")
    private Boolean isArchive;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cashback")
    private Object cashback;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Object deliveryCharges;
    
    
    
    
    @JsonProperty("merge_qty")
    private Boolean mergeQty;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("items")
    private List<AbandonedCart> items;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
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
    Model: CartCouponMedias
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCouponMedias{

    

    
    
    
    
    @JsonProperty("alt")
    private String alt;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: CartDetailCoupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDetailCoupon{

    

    
    
    
    
    @JsonProperty("cashback_amount")
    private Double cashbackAmount;
    
    
    
    
    @JsonProperty("cashback_message_primary")
    private String cashbackMessagePrimary;
    
    
    
    
    @JsonProperty("cashback_message_secondary")
    private String cashbackMessageSecondary;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("coupon_description")
    private String couponDescription;
    
    
    
    
    @JsonProperty("coupon_id")
    private String couponId;
    
    
    
    
    @JsonProperty("coupon_subtitle")
    private String couponSubtitle;
    
    
    
    
    @JsonProperty("coupon_title")
    private String couponTitle;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("maximum_discount_value")
    private Double maximumDiscountValue;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("medias")
    private List<CartCouponMedias> medias;
    
    
    
}


/*
    Model: ChargesThreshold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargesThreshold{

    

    
    
    
    
    @JsonProperty("charges")
    private Double charges;
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
}


/*
    Model: DeliveryChargesConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryChargesConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("charges")
    private List<ChargesThreshold> charges;
    
    
    
}


/*
    Model: CartCommonConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCommonConfig{

    

    
    
    
    
    @JsonProperty("delivery_charges_config")
    private DeliveryChargesConfig deliveryChargesConfig;
    
    
    
}


/*
    Model: CartAppliedPriceAdjustment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartAppliedPriceAdjustment{

    

    
    
    
    
    @JsonProperty("remove_articles")
    private Boolean removeArticles;
    
    
    
    
    @JsonProperty("adjusted_value")
    private Object adjustedValue;
    
    
    
    
    @JsonProperty("article_level_distribution")
    private Boolean articleLevelDistribution;
    
    
    
    
    @JsonProperty("auto_remove")
    private Boolean autoRemove;
    
    
    
    
    @JsonProperty("applied_articles_ids")
    private List<String> appliedArticlesIds;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("_type")
    private String type;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("restrictions")
    private Object restrictions;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CustomCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomCart{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("cart_name")
    private String cartName;
    
    
    
    
    @JsonProperty("cart_type")
    private String cartType;
    
    
    
    
    @JsonProperty("is_universal")
    private Boolean isUniversal;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<CartAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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

    

    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private List<HashMap<String,String>> parentItemIdentifiers;
    
    
    
    
    @JsonProperty("price_factory_type_id")
    private String priceFactoryTypeId;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
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
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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

    

    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("price_factory_type_id")
    private String priceFactoryTypeId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("items")
    private List<UpdateProductCart> items;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
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
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
}


/*
    Model: OverrideCartItemPromo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverrideCartItemPromo{

    

    
    
    
    
    @JsonProperty("restrictions")
    private Object restrictions;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("promo_amount")
    private String promoAmount;
    
    
    
    
    @JsonProperty("promo_desc")
    private String promoDesc;
    
    
    
    
    @JsonProperty("rwrd_tndr")
    private String rwrdTndr;
    
    
    
    
    @JsonProperty("item_list")
    private List<Object> itemList;
    
    
    
    
    @JsonProperty("parent_promo_id")
    private String parentPromoId;
    
    
    
}


/*
    Model: OverrideCartItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverrideCartItem{

    

    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("promo_list")
    private List<OverrideCartItemPromo> promoList;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
}


/*
    Model: OverrideCheckoutReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverrideCheckoutReq{

    

    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("cart_items")
    private List<OverrideCartItem> cartItems;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("shipping_address")
    private Object shippingAddress;
    
    
    
}


/*
    Model: OverrideCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverrideCheckoutResponse{

    

    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("cart")
    private Object cart;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
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

    

    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("share_url")
    private String shareUrl;
    
    
    
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

    

    
    
    
    
    @JsonProperty("source")
    private Object source;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
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
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<CartAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("shared_cart_details")
    private SharedCartDetails sharedCartDetails;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart")
    private SharedCart cart;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("item_counts")
    private Integer itemCounts;
    
    
    
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
    Model: UserCartMappingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCartMappingResponse{

    

    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("user")
    private CartMappingUserInfo user;
    
    
    
}


/*
    Model: CartMappingUserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMappingUserInfo{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("external_id")
    private String externalId;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
}


/*
    Model: PlatformAddCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformAddCartRequest{

    

    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("new_cart")
    private Boolean newCart;
    
    
    
    
    @JsonProperty("items")
    private List<AddProductCart> items;
    
    
    
}


/*
    Model: PlatformUpdateCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformUpdateCartRequest{

    

    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("items")
    private List<UpdateProductCart> items;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
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
    Model: Coupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Coupon{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("is_applicable")
    private Boolean isApplicable;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("coupon_applicable_message")
    private String couponApplicableMessage;
    
    
    
    
    @JsonProperty("is_bank_offer")
    private Boolean isBankOffer;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("coupon_amount")
    private Double couponAmount;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("medias")
    private List<CartCouponMedias> medias;
    
    
    
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

    

    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
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

    

    
    
    
    
    @JsonProperty("available_coupon_list")
    private List<Coupon> availableCouponList;
    
    
    
    
    @JsonProperty("page")
    private PageCoupon page;
    
    
    
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

    

    
    
    
    
    @JsonProperty("pincode")
    private Double pincode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("created_by_user_id")
    private String createdByUserId;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("google_map_point")
    private Object googleMapPoint;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("_custom_json")
    private AddressCustomJson customJson;
    
    
    
    
    @JsonProperty("uid")
    private Double uid;
    
    
    
    
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
}


/*
    Model: AddressCustomJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddressCustomJson{

    

    
    
    
    
    @JsonProperty("meta_data")
    private String metaData;
    
    
    
    
    @JsonProperty("meta_data_int")
    private Double metaDataInt;
    
    
    
}


/*
    Model: ValidationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidationConfig{

    

    
    
    
    
    @JsonProperty("address_max_limit")
    private Integer addressMaxLimit;
    
    
    
    
    @JsonProperty("user_address_count")
    private Integer userAddressCount;
    
    
    
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
    
    
    
    
    @JsonProperty("pii_masking")
    private Boolean piiMasking;
    
    
    
    
    @JsonProperty("validation_config")
    private ValidationConfig validationConfig;
    
    
    
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

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("address_id")
    private Object addressId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_updated")
    private Boolean isUpdated;
    
    
    
    
    @JsonProperty("address_id")
    private Object addressId;
    
    
    
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
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private String quantity;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
}


/*
    Model: ShipmentError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentError{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("promise")
    private ShipmentPromise promise;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("articles")
    private List<ShipmentArticle> articles;
    
    
    
    
    @JsonProperty("meta")
    private ShipmentMeta meta;
    
    
    
    
    @JsonProperty("logistics_meta")
    private ShipmentLogisticsMeta logisticsMeta;
    
    
    
    
    @JsonProperty("error")
    private ShipmentError error;
    
    
    
}


/*
    Model: ShipmentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentMeta{

    

    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("dimension")
    private ShipmentMetaDimension dimension;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private String assignDpFromSb;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("shipment_chargeable_weight")
    private Double shipmentChargeableWeight;
    
    
    
    
    @JsonProperty("shipping_zone")
    private String shippingZone;
    
    
    
}


/*
    Model: ShipmentMetaDimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentMetaDimension{

    

    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
}


/*
    Model: ShipmentLogisticsMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentLogisticsMeta{

    

    
    
    
    
    @JsonProperty("account_options")
    private List<ShipmentLogisticsMetaAccount> accountOptions;
    
    
    
    
    @JsonProperty("account_info")
    private Object accountInfo;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private String assignDpFromSb;
    
    
    
}


/*
    Model: ShipmentLogisticsMetaAccount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentLogisticsMetaAccount{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("fm_priority")
    private Double fmPriority;
    
    
    
    
    @JsonProperty("lm_priority")
    private Double lmPriority;
    
    
    
    
    @JsonProperty("rvp_priority")
    private Double rvpPriority;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("parent_id")
    private String parentId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private String assignDpFromSb;
    
    
    
    
    @JsonProperty("internal_account_id")
    private String internalAccountId;
    
    
    
    
    @JsonProperty("external_account_id")
    private String externalAccountId;
    
    
    
    
    @JsonProperty("f_priority")
    private Double fPriority;
    
    
    
    
    @JsonProperty("r_priority")
    private Double rPriority;
    
    
    
    
    @JsonProperty("dp_shipping_charges")
    private Double dpShippingCharges;
    
    
    
    
    @JsonProperty("qc_enabled")
    private Boolean qcEnabled;
    
    
    
    
    @JsonProperty("area_code")
    private ShipmentLogisticsMetaAccountAreaCode areaCode;
    
    
    
    
    @JsonProperty("operations")
    private List<String> operations;
    
    
    
    
    @JsonProperty("dp_tat")
    private ShipmentLogisticsMetaAccountDpTat dpTat;
    
    
    
}


/*
    Model: ShipmentLogisticsMetaAccountAreaCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentLogisticsMetaAccountAreaCode{

    

    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("destination")
    private String destination;
    
    
    
}


/*
    Model: ShipmentLogisticsMetaAccountDpTat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentLogisticsMetaAccountDpTat{

    

    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<CartAppliedPriceAdjustment> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipmentResponse> shipments;
    
    
    
    
    @JsonProperty("error")
    private Boolean error;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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

    

    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("article_uid")
    private String articleUid;
    
    
    
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

    

    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("gift_details")
    private Object giftDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("delivery_slots")
    private HashMap<String,Object> deliverySlots;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
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
    private CartMetaFieldsValidation errors;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("meta")
    private CartMetaFieldsValidation meta;
    
    
    
}


/*
    Model: CartMetaFieldsValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaFieldsValidation{

    

    
    
    
    
    @JsonProperty("pan_no")
    private List<String> panNo;
    
    
    
    
    @JsonProperty("gstin")
    private List<String> gstin;
    
    
    
    
    @JsonProperty("checkout_mode")
    private List<String> checkoutMode;
    
    
    
    
    @JsonProperty("comment")
    private List<String> comment;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private List<String> pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("gift_details")
    private List<String> giftDetails;
    
    
    
    
    @JsonProperty("staff_user_id")
    private List<String> staffUserId;
    
    
    
    
    @JsonProperty("delivery_slots")
    private List<String> deliverySlots;
    
    
    
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

    

    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
}


/*
    Model: CustomerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerDetails{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
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

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
}


/*
    Model: CartCheckoutCustomMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCheckoutCustomMeta{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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

    

    
    
    
    
    @JsonProperty("custom_meta")
    private List<CartCheckoutCustomMeta> customMeta;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("pick_at_store_uid")
    private Integer pickAtStoreUid;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("customer_details")
    private Object customerDetails;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("payment_extra_identifiers")
    private Object paymentExtraIdentifiers;
    
    
    
    
    @JsonProperty("iin")
    private String iin;
    
    
    
    
    @JsonProperty("network")
    private String network;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("common_config")
    private CartCommonConfig commonConfig;
    
    
    
    
    @JsonProperty("coupon")
    private CartDetailCoupon coupon;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("notification")
    private Object notification;
    
    
    
    
    @JsonProperty("staff_user_id")
    private String staffUserId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("custom_cart")
    private CustomCart customCart;
    
    
    
    
    @JsonProperty("price_adjustment_applied")
    private List<PriceAdjustmentApplied> priceAdjustmentApplied;
    
    
    
    
    @JsonProperty("is_pan_received")
    private Boolean isPanReceived;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private Object customCartMeta;
    
    
    
    
    @JsonProperty("cod_available")
    private Boolean codAvailable;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("cart")
    private CheckCart cart;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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

    

    
    
    
    
    @JsonProperty("pickup_stores")
    private List<Integer> pickupStores;
    
    
    
    
    @JsonProperty("available_modes")
    private List<String> availableModes;
    
    
    
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

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("store_manager_name")
    private String storeManagerName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<PickupStoreDetail> data;
    
    
    
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

    

    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
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

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("next_validation_required")
    private Boolean nextValidationRequired;
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("display_message_en")
    private String displayMessageEn;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
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

    

    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
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

    

    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("payment")
    private String payment;
    
    
    
    
    @JsonProperty("payment_meta")
    private PaymentMeta paymentMeta;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("payment_extra_identifiers")
    private Object paymentExtraIdentifiers;
    
    
    
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

    

    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("custom_meta")
    private Object customMeta;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("pick_at_store_uid")
    private Integer pickAtStoreUid;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("customer_details")
    private Object customerDetails;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("iin")
    private String iin;
    
    
    
    
    @JsonProperty("network")
    private String network;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
}


/*
    Model: PriceMinMax
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceMinMax{

    

    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
}


/*
    Model: ItemPriceDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemPriceDetails{

    

    
    
    
    
    @JsonProperty("marked")
    private PriceMinMax marked;
    
    
    
    
    @JsonProperty("effective")
    private PriceMinMax effective;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: FreeGiftItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreeGiftItems{

    

    
    
    
    
    @JsonProperty("item_slug")
    private String itemSlug;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("item_price_details")
    private ItemPriceDetails itemPriceDetails;
    
    
    
    
    @JsonProperty("item_brand_name")
    private String itemBrandName;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
}


/*
    Model: PromotionOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionOffer{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("buy_rules")
    private Object buyRules;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("valid_till")
    private String validTill;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<Object> discountRules;
    
    
    
    
    @JsonProperty("free_gift_items")
    private List<FreeGiftItems> freeGiftItems;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: PromotionOffersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionOffersResponse{

    

    
    
    
    
    @JsonProperty("available_promotions")
    private List<PromotionOffer> availablePromotions;
    
    
    
}


/*
    Model: PromotionPaymentOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionPaymentOffer{

    

    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<Object> buyRules;
    
    
    
}


/*
    Model: CouponOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptions{

    

    
    
    
    
    @JsonProperty("types")
    private CouponOptionTypes types;
    
    
    
    
    @JsonProperty("scopes")
    private CouponOptionScopes scopes;
    
    
    
    
    @JsonProperty("applicable_on")
    private CouponOptionsApplicable applicableOn;
    
    
    
    
    @JsonProperty("value_types")
    private CouponOptionsValueTypes valueTypes;
    
    
    
    
    @JsonProperty("calculate_on")
    private CouponOptionsCalculate calculateOn;
    
    
    
    
    @JsonProperty("payable_category")
    private CouponOptionsPayableCategory payableCategory;
    
    
    
    
    @JsonProperty("txn_mode")
    private CouponOptionsTxnMode txnMode;
    
    
    
    
    @JsonProperty("payable_by")
    private CouponOptionsPayableBy payableBy;
    
    
    
}


/*
    Model: CouponOptionTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionTypes{

    

    
    
    
    
    @JsonProperty("absolute")
    private String absolute;
    
    
    
    
    @JsonProperty("percentage")
    private String percentage;
    
    
    
    
    @JsonProperty("bogo")
    private String bogo;
    
    
    
    
    @JsonProperty("bundle")
    private String bundle;
    
    
    
}


/*
    Model: CouponOptionScopes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionScopes{

    

    
    
    
    
    @JsonProperty("category_id")
    private String categoryId;
    
    
    
    
    @JsonProperty("brand_id")
    private String brandId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("collection_id")
    private String collectionId;
    
    
    
    
    @JsonProperty("exclude_brand_id")
    private String excludeBrandId;
    
    
    
    
    @JsonProperty("category_department")
    private String categoryDepartment;
    
    
    
    
    @JsonProperty("l1_category_id")
    private String l1CategoryId;
    
    
    
    
    @JsonProperty("l2_category_id")
    private String l2CategoryId;
    
    
    
    
    @JsonProperty("exclude_category_id")
    private String excludeCategoryId;
    
    
    
    
    @JsonProperty("exclude_l1_category_id")
    private String excludeL1CategoryId;
    
    
    
    
    @JsonProperty("exclude_l2_category_id")
    private String excludeL2CategoryId;
    
    
    
    
    @JsonProperty("item_tags")
    private String itemTags;
    
    
    
    
    @JsonProperty("tags")
    private String tags;
    
    
    
    
    @JsonProperty("zones_id")
    private String zonesId;
    
    
    
    
    @JsonProperty("cart_type")
    private String cartType;
    
    
    
}


/*
    Model: CouponOptionsApplicable
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsApplicable{

    

    
    
    
    
    @JsonProperty("amount")
    private String amount;
    
    
    
    
    @JsonProperty("quantity")
    private String quantity;
    
    
    
}


/*
    Model: CouponOptionsValueTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsValueTypes{

    

    
    
    
    
    @JsonProperty("absolute")
    private String absolute;
    
    
    
    
    @JsonProperty("percentage")
    private String percentage;
    
    
    
    
    @JsonProperty("quantity")
    private String quantity;
    
    
    
    
    @JsonProperty("flat_price")
    private String flatPrice;
    
    
    
}


/*
    Model: CouponOptionsCalculate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsCalculate{

    

    
    
    
    
    @JsonProperty("mrp")
    private String mrp;
    
    
    
    
    @JsonProperty("esp")
    private String esp;
    
    
    
    
    @JsonProperty("tp")
    private String tp;
    
    
    
}


/*
    Model: CouponOptionsPayableCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsPayableCategory{

    

    
    
    
    
    @JsonProperty("fynd")
    private String fynd;
    
    
    
    
    @JsonProperty("seller")
    private String seller;
    
    
    
}


/*
    Model: CouponOptionsTxnMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsTxnMode{

    

    
    
    
    
    @JsonProperty("fynd_cash")
    private String fyndCash;
    
    
    
    
    @JsonProperty("cash")
    private String cash;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
}


/*
    Model: CouponOptionsPayableBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponOptionsPayableBy{

    

    
    
    
    
    @JsonProperty("fynd_marketing")
    private String fyndMarketing;
    
    
    
    
    @JsonProperty("fynd")
    private String fynd;
    
    
    
    
    @JsonProperty("fynd_store")
    private String fyndStore;
    
    
    
    
    @JsonProperty("fynd_delights")
    private String fyndDelights;
    
    
    
    
    @JsonProperty("fynd_ops")
    private String fyndOps;
    
    
    
    
    @JsonProperty("fynd_inventory")
    private String fyndInventory;
    
    
    
}


/*
    Model: SelectAddressResponseError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelectAddressResponseError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart_id")
    private Double cartId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("address")
    private AllAddressForSelectAddress address;
    
    
    
}


/*
    Model: AllAddressForSelectAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllAddressForSelectAddress{

    

    
    
    
    
    @JsonProperty("address")
    private List<PlatformAddress> address;
    
    
    
    
    @JsonProperty("pii_masking")
    private Boolean piiMasking;
    
    
    
    
    @JsonProperty("validation_config")
    private ValidationConfig validationConfig;
    
    
    
}


/*
    Model: ValidationError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidationError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("field")
    private String field;
    
    
    
}




}