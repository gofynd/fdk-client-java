
package com.sdk.platform.order;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class OrderPlatformModels{


/*
    Model: Prices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Prices{
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
}


/*
    Model: PlatformItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformItem{
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: GSTDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GSTDetailsData{
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
}


/*
    Model: BagUnit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagUnit{
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("total_shipment_bags")
    private Integer totalShipmentBags;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("item_quantity")
    private Integer itemQuantity;
    
    
    
    
    @JsonProperty("gst")
    private GSTDetailsData gst;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
}


/*
    Model: ShipmentStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentStatus{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("ops_status")
    private String opsStatus;
    
    
    
    
    @JsonProperty("actual_status")
    private String actualStatus;
    
    
    
    
    @JsonProperty("hex_code")
    private String hexCode;
    
    
    
}


/*
    Model: UserDataInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDataInfo{
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("is_anonymous_user")
    private Boolean isAnonymousUser;
    
    
    
    
    @JsonProperty("avis_user_id")
    private String avisUserId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
}


/*
    Model: ShipmentItemFulFillingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentItemFulFillingStore{
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: PaymentModeInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeInfo{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
}


/*
    Model: ShipmentItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentItem{
    
    
    
    
    @JsonProperty("bags")
    private List<BagUnit> bags;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    @JsonProperty("fulfilling_centre")
    private String fulfillingCentre;
    
    
    
    
    @JsonProperty("total_shipments_in_order")
    private Integer totalShipmentsInOrder;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("shipment_created_at")
    private String shipmentCreatedAt;
    
    
    
    
    @JsonProperty("channel")
    private Object channel;
    
    
    
    
    @JsonProperty("total_bags_count")
    private Integer totalBagsCount;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("application")
    private Object application;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private ShipmentItemFulFillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("sla")
    private Object sla;
    
    
    
    
    @JsonProperty("payment_mode_info")
    private PaymentModeInfo paymentModeInfo;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: FilterInfoOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterInfoOption{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: FiltersInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FiltersInfo{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("options")
    private List<FilterInfoOption> options;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: ShipmentInternalPlatformViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentInternalPlatformViewResponse{
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
    @JsonProperty("items")
    private List<ShipmentItem> items;
    
    
    
    
    @JsonProperty("applied_filters")
    private Object appliedFilters;
    
    
    
    
    @JsonProperty("filters")
    private List<FiltersInfo> filters;
    
    
    
}


/*
    Model: Error
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Error{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BagStateMapper
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagStateMapper{
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("bs_id")
    private Integer bsId;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_facing")
    private Boolean appFacing;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_state_name")
    private String appStateName;
    
    
    
    
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
}


/*
    Model: CurrentStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrentStatus{
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("current_status_id")
    private Integer currentStatusId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: OrderBagArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBagArticle{
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
}


/*
    Model: ItemCriterias
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemCriterias{
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
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
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriterias itemCriteria;
    
    
    
    
    @JsonProperty("cart_conditions")
    private Object cartConditions;
    
    
    
}


/*
    Model: DiscountRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRules{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
}


/*
    Model: AppliedPromos
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedPromos{
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRules> discountRules;
    
    
    
}


/*
    Model: PlatformDeliveryAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformDeliveryAddress{
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("longitude")
    private Integer longitude;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("latitude")
    private Integer latitude;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: BagGST
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagGST{
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
}


/*
    Model: BagConfigs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagConfigs{
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("allow_force_return")
    private Boolean allowForceReturn;
    
    
    
}


/*
    Model: OrderBrandName
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBrandName{
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
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
    
    
    
    
    @JsonProperty("ean")
    private String ean;
    
    
    
}


/*
    Model: FinancialBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FinancialBreakup{
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Integer amountPaidRoundoff;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Integer deliveryCharge;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Integer taxCollectedAtSource;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("refund_credit")
    private Integer refundCredit;
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
}


/*
    Model: OrderBags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBags{
    
    
    
    
    @JsonProperty("current_status")
    private CurrentStatus currentStatus;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("article")
    private OrderBagArticle article;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<AppliedPromos> appliedPromos;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGST gstDetails;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("bag_configs")
    private BagConfigs bagConfigs;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("brand")
    private OrderBrandName brand;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("financial_breakup")
    private FinancialBreakup financialBreakup;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
}


/*
    Model: ShipmentStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentStatusData{
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("bag_list")
    private List<String> bagList;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: UserDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetailsData{
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PhoneDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneDetails{
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
}


/*
    Model: ContactDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactDetails{
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneDetails> phone;
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
}


/*
    Model: CompanyDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDetails{
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_contact")
    private ContactDetails companyContact;
    
    
    
    
    @JsonProperty("company_cin")
    private String companyCin;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("company_gst")
    private String companyGst;
    
    
    
}


/*
    Model: ShipmentPayments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentPayments{
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: AffiliateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateMeta{
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("marketplace_invoice_id")
    private String marketplaceInvoiceId;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("is_priority")
    private Boolean isPriority;
    
    
    
    
    @JsonProperty("order_item_id")
    private String orderItemId;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: DebugInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DebugInfo{
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
}


/*
    Model: LockData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LockData{
    
    
    
    
    @JsonProperty("mto")
    private Boolean mto;
    
    
    
    
    @JsonProperty("locked")
    private Boolean locked;
    
    
    
    
    @JsonProperty("lock_message")
    private String lockMessage;
    
    
    
}


/*
    Model: EinvoiceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EinvoiceInfo{
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
    
    @JsonProperty("credit_note")
    private Object creditNote;
    
    
    
}


/*
    Model: Formatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Formatted{
    
    
    
    
    @JsonProperty("f_max")
    private String fMax;
    
    
    
    
    @JsonProperty("f_min")
    private String fMin;
    
    
    
}


/*
    Model: BuyerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyerDetails{
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("ajio_site_id")
    private String ajioSiteId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ShipmentTimeStamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentTimeStamp{
    
    
    
    
    @JsonProperty("t_min")
    private String tMin;
    
    
    
    
    @JsonProperty("t_max")
    private String tMax;
    
    
    
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
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("auto_trigger_dp_assignment_acf")
    private Boolean autoTriggerDpAssignmentAcf;
    
    
    
    
    @JsonProperty("b2c_buyer_details")
    private Object b2CBuyerDetails;
    
    
    
    
    @JsonProperty("debug_info")
    private DebugInfo debugInfo;
    
    
    
    
    @JsonProperty("lock_data")
    private LockData lockData;
    
    
    
    
    @JsonProperty("same_store_available")
    private Boolean sameStoreAvailable;
    
    
    
    
    @JsonProperty("return_store_node")
    private Integer returnStoreNode;
    
    
    
    
    @JsonProperty("einvoice_info")
    private EinvoiceInfo einvoiceInfo;
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("forward_affiliate_order_id")
    private String forwardAffiliateOrderId;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("external")
    private Object external;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("return_details")
    private Object returnDetails;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private BuyerDetails b2BBuyerDetails;
    
    
    
    
    @JsonProperty("forward_affiliate_shipment_id")
    private String forwardAffiliateShipmentId;
    
    
    
    
    @JsonProperty("timestamp")
    private ShipmentTimeStamp timestamp;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("store_invoice_updated_date")
    private String storeInvoiceUpdatedDate;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("return_awb_number")
    private String returnAwbNumber;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("ewaybill_info")
    private Object ewaybillInfo;
    
    
    
    
    @JsonProperty("return_affiliate_order_id")
    private String returnAffiliateOrderId;
    
    
    
    
    @JsonProperty("bag_weight")
    private Object bagWeight;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("return_affiliate_shipment_id")
    private String returnAffiliateShipmentId;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
}


/*
    Model: PDFLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PDFLinks{
    
    
    
    
    @JsonProperty("credit_note_url")
    private String creditNoteUrl;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("label_a4")
    private String labelA4;
    
    
    
    
    @JsonProperty("label_pos")
    private String labelPos;
    
    
    
    
    @JsonProperty("delivery_challan_a4")
    private String deliveryChallanA4;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("invoice_pos")
    private String invoicePos;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("invoice_a4")
    private String invoiceA4;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("invoice_a6")
    private String invoiceA6;
    
    
    
    
    @JsonProperty("b2b")
    private String b2B;
    
    
    
    
    @JsonProperty("po_invoice")
    private String poInvoice;
    
    
    
    
    @JsonProperty("label_a6")
    private String labelA6;
    
    
    
}


/*
    Model: AffiliateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateDetails{
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("company_affiliate_tag")
    private String companyAffiliateTag;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("shipment_meta")
    private ShipmentMeta shipmentMeta;
    
    
    
    
    @JsonProperty("ad_id")
    private String adId;
    
    
    
    
    @JsonProperty("pdf_links")
    private PDFLinks pdfLinks;
    
    
    
}


/*
    Model: TrackingList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrackingList{
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: OrderingStoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoreDetails{
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("ordering_store_id")
    private Integer orderingStoreId;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
}


/*
    Model: InvoiceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceInfo{
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
    
    @JsonProperty("label_url")
    private String labelUrl;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("updated_date")
    private String updatedDate;
    
    
    
    
    @JsonProperty("store_invoice_id")
    private String storeInvoiceId;
    
    
    
}


/*
    Model: DPDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPDetailsData{
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
    
    @JsonProperty("eway_bill_id")
    private String ewayBillId;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("awb_no")
    private String awbNo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: Dimensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimensions{
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("length")
    private Integer length;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
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
    
    
    
    
    @JsonProperty("dimension")
    private Dimensions dimension;
    
    
    
}


/*
    Model: FulfillingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillingStore{
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
}


/*
    Model: BagStatusHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagStatusHistory{
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("bsh_id")
    private Integer bshId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("forward")
    private Boolean forward;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: OrderDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetailsData{
    
    
    
    
    @JsonProperty("order_value")
    private String orderValue;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("tax_details")
    private Object taxDetails;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("cod_charges")
    private String codCharges;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("ordering_channel_logo")
    private Object orderingChannelLogo;
    
    
    
}


/*
    Model: PlatformShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipment{
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("company_details")
    private CompanyDetails companyDetails;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreDetails orderingStore;
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceInfo invoice;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("pdf_links")
    private Object pdfLinks;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("platform_logo")
    private String platformLogo;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private Boolean enableDpTracking;
    
    
    
    
    @JsonProperty("forward_shipment_id")
    private String forwardShipmentId;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
}


/*
    Model: ShipmentInfoResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentInfoResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
}


/*
    Model: PlatformUserDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformUserDetails{
    
    
    
    
    @JsonProperty("platform_user_last_name")
    private String platformUserLastName;
    
    
    
    
    @JsonProperty("platform_user_employee_code")
    private String platformUserEmployeeCode;
    
    
    
    
    @JsonProperty("platform_user_id")
    private String platformUserId;
    
    
    
    
    @JsonProperty("platform_user_first_name")
    private String platformUserFirstName;
    
    
    
}


/*
    Model: BillingStaffDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BillingStaffDetails{
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("staff_id")
    private Integer staffId;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
}


/*
    Model: TransactionData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionData{
    
    
    
    
    @JsonProperty("amount_paid")
    private String amountPaid;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("terminal_id")
    private String terminalId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("unique_reference_number")
    private String uniqueReferenceNumber;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
}


/*
    Model: OrderMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderMeta{
    
    
    
    
    @JsonProperty("platform_user_details")
    private PlatformUserDetails platformUserDetails;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_type")
    private String paymentType;
    
    
    
    
    @JsonProperty("billing_staff_details")
    private BillingStaffDetails billingStaffDetails;
    
    
    
    
    @JsonProperty("company_logo")
    private String companyLogo;
    
    
    
    
    @JsonProperty("employee_id")
    private Integer employeeId;
    
    
    
    
    @JsonProperty("order_child_entities")
    private List<String> orderChildEntities;
    
    
    
    
    @JsonProperty("mongo_cart_id")
    private Integer mongoCartId;
    
    
    
    
    @JsonProperty("files")
    private List<Object> files;
    
    
    
    
    @JsonProperty("order_tags")
    private List<Object> orderTags;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("staff")
    private Object staff;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("order_platform")
    private String orderPlatform;
    
    
    
    
    @JsonProperty("customer_note")
    private String customerNote;
    
    
    
    
    @JsonProperty("transaction_data")
    private TransactionData transactionData;
    
    
    
}


/*
    Model: TaxDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxDetails{
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
}


/*
    Model: OrderDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDict{
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("meta")
    private OrderMeta meta;
    
    
    
    
    @JsonProperty("tax_details")
    private TaxDetails taxDetails;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
}


/*
    Model: ShipmentDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetailsResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("order")
    private OrderDict order;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
}


/*
    Model: SubLane
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubLane{
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("actions")
    private List<Object> actions;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: SuperLane
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuperLane{
    
    
    
    
    @JsonProperty("options")
    private List<SubLane> options;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: LaneConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LaneConfigResponse{
    
    
    
    
    @JsonProperty("super_lanes")
    private List<SuperLane> superLanes;
    
    
    
}


/*
    Model: PlatformBreakupValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformBreakupValues{
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: PlatformChannel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformChannel{
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PlatformOrderItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformOrderItems{
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("total_order_value")
    private Double totalOrderValue;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("breakup_values")
    private List<PlatformBreakupValues> breakupValues;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("channel")
    private PlatformChannel channel;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("user_info")
    private UserDataInfo userInfo;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
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
    Model: OrderListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderListingResponse{
    
    
    
    
    @JsonProperty("items")
    private List<PlatformOrderItems> items;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
}


/*
    Model: PlatformTrack
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformTrack{
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("last_location_recieved_at")
    private String lastLocationRecievedAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
    
    @JsonProperty("raw_status")
    private String rawStatus;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
}


/*
    Model: PlatformShipmentTrack
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipmentTrack{
    
    
    
    
    @JsonProperty("results")
    private List<PlatformTrack> results;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: FiltersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FiltersResponse{
    
    
    
    
    @JsonProperty("advance")
    private List<Object> advance;
    
    
    
}


/*
    Model: URL
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class URL{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: FileUploadResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUploadResponse{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
}


/*
    Model: FileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileResponse{
    
    
    
    
    @JsonProperty("cdn")
    private URL cdn;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("upload")
    private FileUploadResponse upload;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
}


/*
    Model: BulkActionTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionTemplate{
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: BulkActionTemplateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionTemplateResponse{
    
    
    
    
    @JsonProperty("template_x_slug")
    private List<BulkActionTemplate> templateXSlug;
    
    
    
}


/*
    Model: QuestionSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuestionSet{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: Reason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Reason{
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("qc_type")
    private List<String> qcType;
    
    
    
    
    @JsonProperty("question_set")
    private List<QuestionSet> questionSet;
    
    
    
}


/*
    Model: PlatformShipmentReasonsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipmentReasonsResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("reasons")
    private List<Reason> reasons;
    
    
    
}


/*
    Model: BagReturnableCancelableStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagReturnableCancelableStatus{
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
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
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
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
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("esp_modified")
    private Object espModified;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("child_details")
    private Object childDetails;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("a_set")
    private Object aSet;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
}


/*
    Model: Dates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dates{
    
    
    
    
    @JsonProperty("order_created")
    private String orderCreated;
    
    
    
    
    @JsonProperty("delivery_date")
    private Object deliveryDate;
    
    
    
}


/*
    Model: ArticleDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDetails{
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
}


/*
    Model: BagGSTDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagGSTDetails{
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
}


/*
    Model: StoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreAddress{
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
}


/*
    Model: StoreEinvoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreEinvoice{
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: StoreEwaybill
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreEwaybill{
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: StoreGstCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreGstCredentials{
    
    
    
    
    @JsonProperty("e_invoice")
    private StoreEinvoice eInvoice;
    
    
    
    
    @JsonProperty("e_waybill")
    private StoreEwaybill eWaybill;
    
    
    
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
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("ds_type")
    private String dsType;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: StoreDocuments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDocuments{
    
    
    
    
    @JsonProperty("gst")
    private Document gst;
    
    
    
}


/*
    Model: EInvoicePortalDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoicePortalDetails{
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("gst_credentials")
    private StoreGstCredentials gstCredentials;
    
    
    
    
    @JsonProperty("additional_contact_details")
    private Object additionalContactDetails;
    
    
    
    
    @JsonProperty("documents")
    private StoreDocuments documents;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("product_return_config")
    private Object productReturnConfig;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("timing")
    private List<Object> timing;
    
    
    
    
    @JsonProperty("gst_number")
    private String gstNumber;
    
    
    
    
    @JsonProperty("ewaybill_portal_details")
    private Object ewaybillPortalDetails;
    
    
    
    
    @JsonProperty("einvoice_portal_details")
    private EInvoicePortalDetails einvoicePortalDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("vat_no")
    private String vatNo;
    
    
    
    
    @JsonProperty("brand_store_tags")
    private List<String> brandStoreTags;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("store_active_from")
    private String storeActiveFrom;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("store_address_json")
    private StoreAddress storeAddressJson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("alohomora_user_id")
    private Integer alohomoraUserId;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("mall_area")
    private String mallArea;
    
    
    
    
    @JsonProperty("login_username")
    private String loginUsername;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("meta")
    private StoreMeta meta;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("is_enabled_for_recon")
    private Boolean isEnabledForRecon;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("packaging_material_count")
    private Integer packagingMaterialCount;
    
    
    
    
    @JsonProperty("s_id")
    private String sId;
    
    
    
    
    @JsonProperty("brand_id")
    private Object brandId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("parent_store_id")
    private Integer parentStoreId;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("mall_name")
    private String mallName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: B2BPODetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class B2BPODetails{
    
    
    
    
    @JsonProperty("docker_number")
    private String dockerNumber;
    
    
    
    
    @JsonProperty("item_base_price")
    private Double itemBasePrice;
    
    
    
    
    @JsonProperty("total_gst_percentage")
    private Double totalGstPercentage;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("po_line_amount")
    private Double poLineAmount;
    
    
    
    
    @JsonProperty("po_tax_amount")
    private Double poTaxAmount;
    
    
    
}


/*
    Model: BagMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagMeta{
    
    
    
    
    @JsonProperty("b2b_po_details")
    private B2BPODetails b2BPoDetails;
    
    
    
}


/*
    Model: AffiliateBagDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateBagDetails{
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
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
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("pickup_location")
    private String pickupLocation;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("is_virtual_invoice")
    private Boolean isVirtualInvoice;
    
    
    
    
    @JsonProperty("credit_note_allowed")
    private Boolean creditNoteAllowed;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    
    
    
    
    @JsonProperty("credit_note_expiry_days")
    private Integer creditNoteExpiryDays;
    
    
    
    
    @JsonProperty("script_last_ran")
    private String scriptLastRan;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
}


/*
    Model: Attributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Attributes{
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("primary_color_hex")
    private String primaryColorHex;
    
    
    
    
    @JsonProperty("primary_material")
    private String primaryMaterial;
    
    
    
    
    @JsonProperty("marketer_name")
    private String marketerName;
    
    
    
    
    @JsonProperty("essential")
    private String essential;
    
    
    
    
    @JsonProperty("marketer_address")
    private String marketerAddress;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private List<String> gender;
    
    
    
}


/*
    Model: Item
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Item{
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("l1_category_id")
    private Integer l1CategoryId;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("attributes")
    private Attributes attributes;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("webstore_product_url")
    private String webstoreProductUrl;
    
    
    
    
    @JsonProperty("l2_category_id")
    private Integer l2CategoryId;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
}


/*
    Model: BagDetailsPlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagDetailsPlatformResponse{
    
    
    
    
    @JsonProperty("status")
    private BagReturnableCancelableStatus status;
    
    
    
    
    @JsonProperty("restore_coupon")
    private Boolean restoreCoupon;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<Object> appliedPromos;
    
    
    
    
    @JsonProperty("no_of_bags_order")
    private Integer noOfBagsOrder;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("b_id")
    private Integer bId;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("article_details")
    private ArticleDetails articleDetails;
    
    
    
    
    @JsonProperty("restore_promos")
    private Object restorePromos;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGSTDetails gstDetails;
    
    
    
    
    @JsonProperty("ordering_store")
    private Store orderingStore;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
    
    @JsonProperty("qc_required")
    private Object qcRequired;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("bag_update_time")
    private Double bagUpdateTime;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("original_bag_list")
    private List<Integer> originalBagList;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    @JsonProperty("b_type")
    private String bType;
    
    
    
    
    @JsonProperty("bag_status_history")
    private BagStatusHistory bagStatusHistory;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
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
    
    
    
}


/*
    Model: Page1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page1{
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
}


/*
    Model: GetBagsPlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBagsPlatformResponse{
    
    
    
    
    @JsonProperty("page")
    private Page1 page;
    
    
    
    
    @JsonProperty("items")
    private List<BagDetailsPlatformResponse> items;
    
    
    
}


/*
    Model: InvalidateShipmentCachePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCachePayload{
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
}


/*
    Model: InvalidateShipmentCacheNestedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCacheNestedResponse{
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: InvalidateShipmentCacheResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCacheResponse{
    
    
    
    
    @JsonProperty("response")
    private List<InvalidateShipmentCacheNestedResponse> response;
    
    
    
}


/*
    Model: ErrorResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponse1{
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error_trace")
    private String errorTrace;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: StoreReassign
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreReassign{
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("set_id")
    private String setId;
    
    
    
    
    @JsonProperty("reason_ids")
    private List<Integer> reasonIds;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
}


/*
    Model: StoreReassignResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreReassignResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: Entities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Entities{
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
}


/*
    Model: UpdateShipmentLockPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentLockPayload{
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("entities")
    private List<Entities> entities;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
}


/*
    Model: Bags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Bags{
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("is_locked")
    private Boolean isLocked;
    
    
    
}


/*
    Model: OriginalFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OriginalFilter{
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
}


/*
    Model: CheckResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckResponse{
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("is_shipment_locked")
    private Boolean isShipmentLocked;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("is_bag_locked")
    private Boolean isBagLocked;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("original_filter")
    private OriginalFilter originalFilter;
    
    
    
}


/*
    Model: UpdateShipmentLockResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentLockResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("check_response")
    private List<CheckResponse> checkResponse;
    
    
    
}


/*
    Model: AnnouncementResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementResponse{
    
    
    
    
    @JsonProperty("from_datetime")
    private String fromDatetime;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("to_datetime")
    private String toDatetime;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("platform_id")
    private String platformId;
    
    
    
}


/*
    Model: AnnouncementsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementsResponse{
    
    
    
    
    @JsonProperty("announcements")
    private List<AnnouncementResponse> announcements;
    
    
    
}


/*
    Model: BaseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BaseResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: Click2CallResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Click2CallResponse{
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("call_id")
    private String callId;
    
    
    
}


/*
    Model: EntityReasonData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityReasonData{
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
}


/*
    Model: EntitiesReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitiesReasons{
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
    
    @JsonProperty("data")
    private EntityReasonData data;
    
    
    
}


/*
    Model: ProductsReasonsFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsFilters{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
}


/*
    Model: ProductsReasonsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsData{
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
}


/*
    Model: ProductsReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasons{
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsReasonsFilters> filters;
    
    
    
    
    @JsonProperty("data")
    private ProductsReasonsData data;
    
    
    
}


/*
    Model: ReasonsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReasonsData{
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesReasons> entities;
    
    
    
    
    @JsonProperty("products")
    private List<ProductsReasons> products;
    
    
    
}


/*
    Model: EntitiesDataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitiesDataUpdates{
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: ProductsDataUpdatesFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsDataUpdatesFilters{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
}


/*
    Model: ProductsDataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsDataUpdates{
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsDataUpdatesFilters> filters;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: DataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataUpdates{
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesDataUpdates> entities;
    
    
    
    
    @JsonProperty("products")
    private List<ProductsDataUpdates> products;
    
    
    
}


/*
    Model: Products
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Products{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
}


/*
    Model: ShipmentsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsRequest{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("reasons")
    private ReasonsData reasons;
    
    
    
    
    @JsonProperty("data_updates")
    private DataUpdates dataUpdates;
    
    
    
    
    @JsonProperty("products")
    private List<Products> products;
    
    
    
}


/*
    Model: StatuesRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatuesRequest{
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsRequest> shipments;
    
    
    
    
    @JsonProperty("exclude_bags_next_state")
    private String excludeBagsNextState;
    
    
    
}


/*
    Model: UpdateShipmentStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentStatusRequest{
    
    
    
    
    @JsonProperty("unlock_before_transition")
    private Boolean unlockBeforeTransition;
    
    
    
    
    @JsonProperty("lock_after_transition")
    private Boolean lockAfterTransition;
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
    
    @JsonProperty("task")
    private Boolean task;
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesRequest> statuses;
    
    
    
}


/*
    Model: ShipmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsResponse{
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("final_state")
    private Object finalState;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: StatuesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatuesResponse{
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsResponse> shipments;
    
    
    
}


/*
    Model: UpdateShipmentStatusResponseBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentStatusResponseBody{
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesResponse> statuses;
    
    
    
}


/*
    Model: MarketPlacePdf
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MarketPlacePdf{
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
}


/*
    Model: AffiliateBag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateBag{
    
    
    
    
    @JsonProperty("affiliate_meta")
    private Object affiliateMeta;
    
    
    
    
    @JsonProperty("fynd_store_id")
    private String fyndStoreId;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("pdf_links")
    private MarketPlacePdf pdfLinks;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("unit_price")
    private Double unitPrice;
    
    
    
}


/*
    Model: ArticleDetails1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDetails1{
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("dimension")
    private Object dimension;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("weight")
    private Object weight;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: ShipmentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetails{
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: LocationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDetails{
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
}


/*
    Model: ShipmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentConfig{
    
    
    
    
    @JsonProperty("shipment")
    private List<ShipmentDetails> shipment;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("location_details")
    private LocationDetails locationDetails;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
}


/*
    Model: ShipmentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentData{
    
    
    
    
    @JsonProperty("shipment_data")
    private ShipmentConfig shipmentData;
    
    
    
}


/*
    Model: OrderUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderUser{
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
}


/*
    Model: OrderPriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderPriority{
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("affiliate_priority_code")
    private String affiliatePriorityCode;
    
    
    
}


/*
    Model: UserData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserData{
    
    
    
    
    @JsonProperty("shipping_user")
    private OrderUser shippingUser;
    
    
    
    
    @JsonProperty("billing_user")
    private OrderUser billingUser;
    
    
    
}


/*
    Model: OrderInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderInfo{
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("bags")
    private List<AffiliateBag> bags;
    
    
    
    
    @JsonProperty("shipment")
    private ShipmentData shipment;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("billing_address")
    private OrderUser billingAddress;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("order_priority")
    private OrderPriority orderPriority;
    
    
    
    
    @JsonProperty("shipping_address")
    private OrderUser shippingAddress;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("user")
    private UserData user;
    
    
    
}


/*
    Model: AffiliateStoreIdMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateStoreIdMapping{
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
}


/*
    Model: AffiliateAppConfigMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateAppConfigMeta{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: AffiliateAppConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateAppConfig{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("meta")
    private List<AffiliateAppConfigMeta> meta;
    
    
    
}


/*
    Model: AffiliateInventoryStoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryStoreConfig{
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
}


/*
    Model: AffiliateInventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryPaymentConfig{
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: AffiliateInventoryArticleAssignmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryArticleAssignmentConfig{
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
}


/*
    Model: AffiliateInventoryLogisticsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryLogisticsConfig{
    
    
    
    
    @JsonProperty("dp_assignment")
    private Boolean dpAssignment;
    
    
    
}


/*
    Model: AffiliateInventoryOrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryOrderConfig{
    
    
    
    
    @JsonProperty("force_reassignment")
    private Boolean forceReassignment;
    
    
    
}


/*
    Model: AffiliateInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryConfig{
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryStoreConfig inventory;
    
    
    
    
    @JsonProperty("payment")
    private AffiliateInventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("article_assignment")
    private AffiliateInventoryArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("logistics")
    private AffiliateInventoryLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("order")
    private AffiliateInventoryOrderConfig order;
    
    
    
}


/*
    Model: AffiliateConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateConfig{
    
    
    
    
    @JsonProperty("app")
    private AffiliateAppConfig app;
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryConfig inventory;
    
    
    
}


/*
    Model: Affiliate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Affiliate{
    
    
    
    
    @JsonProperty("config")
    private AffiliateConfig config;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
}


/*
    Model: OrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderConfig{
    
    
    
    
    @JsonProperty("create_user")
    private Boolean createUser;
    
    
    
    
    @JsonProperty("store_lookup")
    private String storeLookup;
    
    
    
    
    @JsonProperty("affiliate_store_id_mapping")
    private List<AffiliateStoreIdMapping> affiliateStoreIdMapping;
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("article_lookup")
    private String articleLookup;
    
    
    
    
    @JsonProperty("bag_end_state")
    private String bagEndState;
    
    
    
}


/*
    Model: CreateOrderPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderPayload{
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
    
    
    
    
    @JsonProperty("order_config")
    private OrderConfig orderConfig;
    
    
    
}


/*
    Model: CreateOrderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderResponse{
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
}


/*
    Model: DispatchManifest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DispatchManifest{
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ActionInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionInfo{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: GetActionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetActionsResponse{
    
    
    
    
    @JsonProperty("permissions")
    private ActionInfo permissions;
    
    
    
}


/*
    Model: HistoryDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryDict{
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("l2_detail")
    private String l2Detail;
    
    
    
    
    @JsonProperty("ticket_url")
    private String ticketUrl;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("l1_detail")
    private String l1Detail;
    
    
    
    
    @JsonProperty("l3_detail")
    private String l3Detail;
    
    
    
    
    @JsonProperty("createdat")
    private String createdat;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
}


/*
    Model: ShipmentHistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentHistoryResponse{
    
    
    
    
    @JsonProperty("activity_history")
    private List<HistoryDict> activityHistory;
    
    
    
}


/*
    Model: ErrorDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorDetail{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PostHistoryFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostHistoryFilters{
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("line_number")
    private String lineNumber;
    
    
    
}


/*
    Model: PostHistoryData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostHistoryData{
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PostActivityHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostActivityHistory{
    
    
    
    
    @JsonProperty("filters")
    private List<PostHistoryFilters> filters;
    
    
    
    
    @JsonProperty("data")
    private PostHistoryData data;
    
    
    
}


/*
    Model: PostHistoryDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostHistoryDict{
    
    
    
    
    @JsonProperty("activity_history")
    private PostActivityHistory activityHistory;
    
    
    
}


/*
    Model: PostShipmentHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostShipmentHistory{
    
    
    
    
    @JsonProperty("activity_history")
    private List<PostHistoryDict> activityHistory;
    
    
    
}


/*
    Model: SmsDataPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsDataPayload{
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
    
    @JsonProperty("shipment_id")
    private Integer shipmentId;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SendSmsPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendSmsPayload{
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("data")
    private SmsDataPayload data;
    
    
    
}


/*
    Model: OrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetails{
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: Meta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Meta1{
    
    
    
    
    @JsonProperty("state_manager_used")
    private String stateManagerUsed;
    
    
    
    
    @JsonProperty("kafka_emission_status")
    private Integer kafkaEmissionStatus;
    
    
    
}


/*
    Model: ShipmentDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetail{
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("remarks")
    private String remarks;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("meta")
    private Meta1 meta;
    
    
    
}


/*
    Model: OrderStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatusData{
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
    
    @JsonProperty("order_details")
    private OrderDetails orderDetails;
    
    
    
    
    @JsonProperty("shipment_details")
    private List<ShipmentDetail> shipmentDetails;
    
    
    
}


/*
    Model: OrderStatusResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatusResult{
    
    
    
    
    @JsonProperty("result")
    private List<OrderStatusData> result;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
}


/*
    Model: ManualAssignDPToShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualAssignDPToShipment{
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("qc_required")
    private String qcRequired;
    
    
    
}


/*
    Model: ManualAssignDPToShipmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualAssignDPToShipmentResponse{
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
}


/*
    Model: BillingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BillingInfo{
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
}


/*
    Model: ProcessingDates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProcessingDates{
    
    
    
    
    @JsonProperty("dp_pickup_slot")
    private Object dpPickupSlot;
    
    
    
    
    @JsonProperty("customer_pickup_slot")
    private Object customerPickupSlot;
    
    
    
    
    @JsonProperty("dispatch_after_date")
    private String dispatchAfterDate;
    
    
    
    
    @JsonProperty("confirm_by_date")
    private String confirmByDate;
    
    
    
    
    @JsonProperty("dispatch_by_date")
    private String dispatchByDate;
    
    
    
    
    @JsonProperty("pack_by_date")
    private String packByDate;
    
    
    
}


/*
    Model: Tax
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tax{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("breakup")
    private List<Object> breakup;
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
}


/*
    Model: Charge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Charge{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
}


/*
    Model: LineItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LineItem{
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("external_line_id")
    private String externalLineId;
    
    
    
    
    @JsonProperty("custom_messasge")
    private String customMessasge;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: Shipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Shipment{
    
    
    
    
    @JsonProperty("external_shipment_id")
    private String externalShipmentId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("processing_dates")
    private ProcessingDates processingDates;
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
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
    
    
    
    
    @JsonProperty("transaction_data")
    private Object transactionData;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: PaymentInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInfo{
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("primary_mode")
    private String primaryMode;
    
    
    
}


/*
    Model: ShippingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingInfo{
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("shipping_type")
    private String shippingType;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("slot")
    private List<Object> slot;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("geo_location")
    private Object geoLocation;
    
    
    
}


/*
    Model: TaxInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxInfo{
    
    
    
    
    @JsonProperty("b2b_gstin_number")
    private String b2BGstinNumber;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
}


/*
    Model: CreateOrderAPI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderAPI{
    
    
    
    
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    
    
    
    
    @JsonProperty("currency_info")
    private Object currencyInfo;
    
    
    
    
    @JsonProperty("payment_info")
    private PaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    
    
    
    
    @JsonProperty("external_creation_date")
    private String externalCreationDate;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: CreateOrderErrorReponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderErrorReponse{
    
    
    
    
    @JsonProperty("info")
    private Object info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
}


/*
    Model: DpConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpConfiguration{
    
    
    
    
    @JsonProperty("shipping_by")
    private String shippingBy;
    
    
    
}


/*
    Model: PaymentMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethods{
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
}


/*
    Model: CreateChannelPaymentInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelPaymentInfo{
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethods> paymentMethods;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: CreateChannelConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfig{
    
    
    
    
    @JsonProperty("shipment_assignment")
    private String shipmentAssignment;
    
    
    
    
    @JsonProperty("dp_configuration")
    private DpConfiguration dpConfiguration;
    
    
    
    
    @JsonProperty("location_reassignment")
    private Boolean locationReassignment;
    
    
    
    
    @JsonProperty("logo_url")
    private Object logoUrl;
    
    
    
    
    @JsonProperty("payment_info")
    private CreateChannelPaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("lock_states")
    private List<String> lockStates;
    
    
    
}


/*
    Model: CreateChannelConfigData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfigData{
    
    
    
    
    @JsonProperty("config_data")
    private CreateChannelConfig configData;
    
    
    
}


/*
    Model: CreateChannelConifgErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConifgErrorResponse{
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: CreateChannelConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfigResponse{
    
    
    
    
    @JsonProperty("is_inserted")
    private Boolean isInserted;
    
    
    
    
    @JsonProperty("is_upserted")
    private Boolean isUpserted;
    
    
    
    
    @JsonProperty("acknowledged")
    private Boolean acknowledged;
    
    
    
}


/*
    Model: UploadConsent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadConsent{
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("consent_url")
    private String consentUrl;
    
    
    
}


/*
    Model: PlatformOrderUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformOrderUpdate{
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: ResponseDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseDetail{
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: FyndOrderIdList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndOrderIdList{
    
    
    
    
    @JsonProperty("fynd_order_id")
    private List<String> fyndOrderId;
    
    
    
}


/*
    Model: OrderStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatus{
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("order_details")
    private List<FyndOrderIdList> orderDetails;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
}




}