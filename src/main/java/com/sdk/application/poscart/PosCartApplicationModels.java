
package com.sdk.application.poscart;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class PosCartApplicationModels{


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
    
    
    
    
    @JsonProperty("item_price_details")
    private Object itemPriceDetails;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_slug")
    private String itemSlug;
    
    
    
    
    @JsonProperty("item_brand_name")
    private String itemBrandName;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("parent_item_identifier")
    private String parentItemIdentifier;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
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
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
    
    @JsonProperty("matched_buy_rules")
    private List<String> matchedBuyRules;
    
    
    
    
    @JsonProperty("offer")
    private Object offer;
    
    
    
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
    
    
    
    
    @JsonProperty("applied_free_articles")
    private List<AppliedFreeArticles> appliedFreeArticles;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRulesApp> discountRules;
    
    
    
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
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
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
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    @JsonProperty("gift_card")
    private Double giftCard;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
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
    
    
    
    
    @JsonProperty("discount_single_quantity")
    private Double discountSingleQuantity;
    
    
    
    
    @JsonProperty("discount_total_quantity")
    private Double discountTotalQuantity;
    
    
    
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
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
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
    Model: StoreInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreInfo{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
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
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
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
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("store")
    private StoreInfo store;
    
    
    
    
    @JsonProperty("is_gift_visible")
    private Boolean isGiftVisible;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("gift_card")
    private Object giftCard;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    @JsonProperty("cart_item_meta")
    private Object cartItemMeta;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
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
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    @JsonProperty("available_sizes")
    private List<ProductAvailabilitySize> availableSizes;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
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
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
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
    private String value;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Tags teaserTag;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("coupon")
    private CouponDetails coupon;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("moq")
    private Object moq;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
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
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("applied_promo_details")
    private List<AppliedPromotion> appliedPromoDetails;
    
    
    
    
    @JsonProperty("pan_config")
    private Object panConfig;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
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
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private List<HashMap<String,String>> parentItemIdentifiers;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
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
    
    
    
    
    @JsonProperty("new_cart")
    private Boolean newCart;
    
    
    
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
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
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
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("is_applicable")
    private Boolean isApplicable;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
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
    
    
    
    
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
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
    Model: OfferPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OfferPrice{
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("bulk_effective")
    private Double bulkEffective;
    
    
    
    
    @JsonProperty("marked")
    private Integer marked;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("effective")
    private Integer effective;
    
    
    
}


/*
    Model: OfferItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OfferItem{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("best")
    private Boolean best;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("margin")
    private Integer margin;
    
    
    
    
    @JsonProperty("price")
    private OfferPrice price;
    
    
    
    
    @JsonProperty("auto_applied")
    private Boolean autoApplied;
    
    
    
}


/*
    Model: OfferSeller
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OfferSeller{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: BulkPriceOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkPriceOffer{
    
    
    
    
    @JsonProperty("offers")
    private List<OfferItem> offers;
    
    
    
    
    @JsonProperty("seller")
    private OfferSeller seller;
    
    
    
}


/*
    Model: BulkPriceResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkPriceResponse{
    
    
    
    
    @JsonProperty("data")
    private List<BulkPriceOffer> data;
    
    
    
}


/*
    Model: RewardPointRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardPointRequest{
    
    
    
    
    @JsonProperty("points")
    private Boolean points;
    
    
    
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
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: Address
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Address{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("google_map_point")
    private Object googleMapPoint;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("created_by_user_id")
    private String createdByUserId;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
}


/*
    Model: GetAddressesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAddressesResponse{
    
    
    
    
    @JsonProperty("address")
    private List<Address> address;
    
    
    
    
    @JsonProperty("pii_masking")
    private Boolean piiMasking;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
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
    
    
    
    
    @JsonProperty("is_updated")
    private Boolean isUpdated;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
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
    
    
    
    
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: SelectCartAddressRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelectCartAddressRequest{
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_message_en")
    private String displayMessageEn;
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
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
    
    
    
    
    @JsonProperty("coupon_validity")
    private CouponValidity couponValidity;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ShipmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentResponse{
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("promise")
    private ShipmentPromise promise;
    
    
    
}


/*
    Model: CartShipmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartShipmentsResponse{
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentResponse> shipments;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("error")
    private Boolean error;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
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
    Model: CartCheckoutCustomMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCheckoutCustomMeta{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
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
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
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
    Model: CartPosCheckoutDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartPosCheckoutDetailRequest{
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<CartCheckoutCustomMeta> customMeta;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("store_emps")
    private List<Object> storeEmps;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("delivery_charge_order_value")
    private Integer deliveryChargeOrderValue;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("cod_message")
    private String codMessage;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    @JsonProperty("cod_available")
    private Boolean codAvailable;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("app_intercept_url")
    private String appInterceptUrl;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart")
    private CheckCart cart;
    
    
    
}


/*
    Model: GiftDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GiftDetail{
    
    
    
    
    @JsonProperty("is_gift_applied")
    private Boolean isGiftApplied;
    
    
    
    
    @JsonProperty("gift_message")
    private String giftMessage;
    
    
    
}


/*
    Model: ArticleGiftDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleGiftDetail{
    
    
    
    
    @JsonProperty("article_id")
    private GiftDetail articleId;
    
    
    
}


/*
    Model: CartMetaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartMetaRequest{
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("gift_details")
    private ArticleGiftDetail giftDetails;
    
    
    
    
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
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
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
    
    
    
    
    @JsonProperty("source")
    private Object source;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("shared_cart_details")
    private SharedCartDetails sharedCartDetails;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
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




}