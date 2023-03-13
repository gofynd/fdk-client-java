
package com.sdk.application.cart;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;


public class CartApplicationModels{


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
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
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
    Model: DiscountRulesApp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRulesApp{
    
    
    
    
    @JsonProperty("matched_buy_rules")
    private List<String> matchedBuyRules;
    
    
    
    
    @JsonProperty("raw_offer")
    private Object rawOffer;
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
    
    @JsonProperty("offer")
    private Object offer;
    
    
    
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
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
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
    
    
    
    
    @JsonProperty("item_slug")
    private String itemSlug;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_price_details")
    private Object itemPriceDetails;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
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
    
    
    
    
    @JsonProperty("parent_item_identifier")
    private String parentItemIdentifier;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
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
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRulesApp> discountRules;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("applied_free_articles")
    private List<AppliedFreeArticles> appliedFreeArticles;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
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
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
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
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
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
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
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
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("store")
    private BaseInfo store;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
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
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    Model: ProductImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductImage{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
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
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
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
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
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
    Model: CouponBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponBreakup{
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
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
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
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
    Model: CartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDetailResponse{
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
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
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("coupon_type")
    private String couponType;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("is_applicable")
    private Boolean isApplicable;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
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
    
    
    
    
    @JsonProperty("effective")
    private Integer effective;
    
    
    
    
    @JsonProperty("bulk_effective")
    private Double bulkEffective;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("marked")
    private Integer marked;
    
    
    
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
    
    
    
    
    @JsonProperty("margin")
    private Integer margin;
    
    
    
    
    @JsonProperty("best")
    private Boolean best;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("auto_applied")
    private Boolean autoApplied;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("price")
    private OfferPrice price;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("created_by_user_id")
    private String createdByUserId;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("google_map_point")
    private Object googleMapPoint;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
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
    Model: SelectCartAddressRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelectCartAddressRequest{
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
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
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_message_en")
    private String displayMessageEn;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("coupon_validity")
    private CouponValidity couponValidity;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("promise")
    private ShipmentPromise promise;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("error")
    private Boolean error;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentResponse> shipments;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
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
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
}


/*
    Model: CartCheckoutDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCheckoutDetailRequest{
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<CartCheckoutCustomMeta> customMeta;
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("store_emps")
    private List<Object> storeEmps;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("delivery_charge_order_value")
    private Integer deliveryChargeOrderValue;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    @JsonProperty("cod_message")
    private String codMessage;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
    @JsonProperty("cod_available")
    private Boolean codAvailable;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
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
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("app_intercept_url")
    private String appInterceptUrl;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("cart")
    private CheckCart cart;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("source")
    private Object source;
    
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("shared_cart_details")
    private SharedCartDetails sharedCartDetails;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
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
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_price_details")
    private Object itemPriceDetails;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("item_brand_name")
    private String itemBrandName;
    
    
    
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
    
    
    
    
    @JsonProperty("discount_rules")
    private List<Object> discountRules;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("buy_rules")
    private Object buyRules;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("free_gift_items")
    private List<FreeGiftItems> freeGiftItems;
    
    
    
    
    @JsonProperty("valid_till")
    private String validTill;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    Model: OperationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OperationErrorResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: LadderPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LadderPrice{
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("effective")
    private Integer effective;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("offer_price")
    private Double offerPrice;
    
    
    
    
    @JsonProperty("marked")
    private Integer marked;
    
    
    
}


/*
    Model: LadderOfferItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LadderOfferItem{
    
    
    
    
    @JsonProperty("margin")
    private Integer margin;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("price")
    private LadderPrice price;
    
    
    
}


/*
    Model: LadderPriceOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LadderPriceOffer{
    
    
    
    
    @JsonProperty("discount_rules")
    private List<Object> discountRules;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("buy_rules")
    private Object buyRules;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("free_gift_items")
    private List<FreeGiftItems> freeGiftItems;
    
    
    
    
    @JsonProperty("valid_till")
    private String validTill;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("offer_prices")
    private List<LadderOfferItem> offerPrices;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: CurrencyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrencyInfo{
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LadderPriceOffers
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LadderPriceOffers{
    
    
    
    
    @JsonProperty("available_offers")
    private List<LadderPriceOffer> availableOffers;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyInfo currency;
    
    
    
}






}