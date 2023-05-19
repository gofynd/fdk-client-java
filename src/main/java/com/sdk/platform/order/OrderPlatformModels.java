
package com.sdk.platform.order;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class OrderPlatformModels{


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
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("is_anonymous_user")
    private Boolean isAnonymousUser;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("avis_user_id")
    private String avisUserId;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("longitude")
    private Integer longitude;
    
    
    
    
    @JsonProperty("latitude")
    private Integer latitude;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
}


/*
    Model: ShipmentListingChannel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentListingChannel{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_affiliate")
    private Boolean isAffiliate;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
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
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("status_created_at")
    private String statusCreatedAt;
    
    
    
    
    @JsonProperty("current_shipment_status")
    private String currentShipmentStatus;
    
    
    
    
    @JsonProperty("shipment_status_id")
    private Integer shipmentStatusId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("bag_list")
    private List<String> bagList;
    
    
    
}


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
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("pm_price_split")
    private Double pmPriceSplit;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
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
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("brand_store_tags")
    private String brandStoreTags;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("fulfilling_store_id")
    private Integer fulfillingStoreId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
}


/*
    Model: ShipmentListingBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentListingBrand{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo_base64")
    private String logoBase64;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
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
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Integer amountPaidRoundoff;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Integer deliveryCharge;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("refund_credit")
    private Integer refundCredit;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Integer taxCollectedAtSource;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
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
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_state_name")
    private String appStateName;
    
    
    
    
    @JsonProperty("bs_id")
    private Integer bsId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("app_facing")
    private Boolean appFacing;
    
    
    
    
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("bsh_id")
    private Integer bshId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("forward")
    private Boolean forward;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
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
    
    
    
    
    @JsonProperty("delivery_date")
    private String deliveryDate;
    
    
    
    
    @JsonProperty("order_created")
    private String orderCreated;
    
    
    
}


/*
    Model: PlatformArticleAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformArticleAttributes{
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("attributes")
    private PlatformArticleAttributes attributes;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
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
    Model: Dimensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimensions{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("length")
    private Integer length;
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("esp_modified")
    private Boolean espModified;
    
    
    
    
    @JsonProperty("a_set")
    private Object aSet;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("raw_meta")
    private String rawMeta;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("child_details")
    private Object childDetails;
    
    
    
    
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("order_item_id")
    private String orderItemId;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("is_priority")
    private Boolean isPriority;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("marketplace_invoice_id")
    private String marketplaceInvoiceId;
    
    
    
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
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
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
    private BagReturnableCancelableStatus status;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("brand")
    private ShipmentListingBrand brand;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("bag_type")
    private String bagType;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("product_quantity")
    private Integer productQuantity;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("bag_expiry_date")
    private String bagExpiryDate;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("gst")
    private GSTDetailsData gst;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("can_process")
    private Boolean canProcess;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("channel")
    private ShipmentListingChannel channel;
    
    
    
    
    @JsonProperty("previous_shipment_id")
    private String previousShipmentId;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    @JsonProperty("customer_note")
    private String customerNote;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("ordering_channnel")
    private String orderingChannnel;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("shipment_created_at")
    private String shipmentCreatedAt;
    
    
    
    
    @JsonProperty("status_created_at")
    private String statusCreatedAt;
    
    
    
    
    @JsonProperty("estimated_sla_time")
    private String estimatedSlaTime;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private ShipmentItemFulFillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("bags")
    private List<BagUnit> bags;
    
    
    
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
    Model: ShipmentInternalPlatformViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentInternalPlatformViewResponse{
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<ShipmentItem> items;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    Model: OrderDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetailsData{
    
    
    
    
    @JsonProperty("cod_charges")
    private String codCharges;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("tax_details")
    private Object taxDetails;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("order_value")
    private String orderValue;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("ordering_channel_logo")
    private Object orderingChannelLogo;
    
    
    
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
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("bag_list")
    private List<String> bagList;
    
    
    
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
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneDetails> phone;
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("company_gst")
    private String companyGst;
    
    
    
    
    @JsonProperty("company_contact")
    private ContactDetails companyContact;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_cin")
    private String companyCin;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("dimension")
    private Dimensions dimension;
    
    
    
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
    
    
    
    
    @JsonProperty("b2b")
    private String b2B;
    
    
    
    
    @JsonProperty("invoice_pos")
    private String invoicePos;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("label_a4")
    private String labelA4;
    
    
    
    
    @JsonProperty("delivery_challan_a4")
    private String deliveryChallanA4;
    
    
    
    
    @JsonProperty("invoice_a6")
    private String invoiceA6;
    
    
    
    
    @JsonProperty("po_invoice")
    private String poInvoice;
    
    
    
    
    @JsonProperty("credit_note_url")
    private String creditNoteUrl;
    
    
    
    
    @JsonProperty("invoice_a4")
    private String invoiceA4;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("label_a6")
    private String labelA6;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("label_pos")
    private String labelPos;
    
    
    
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
    
    
    
    
    @JsonProperty("f_min")
    private String fMin;
    
    
    
    
    @JsonProperty("f_max")
    private String fMax;
    
    
    
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
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("ajio_site_id")
    private String ajioSiteId;
    
    
    
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
    Model: ShipmentTimeStamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentTimeStamp{
    
    
    
    
    @JsonProperty("t_max")
    private String tMax;
    
    
    
    
    @JsonProperty("t_min")
    private String tMin;
    
    
    
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
    Model: ShipmentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentMeta{
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("return_awb_number")
    private String returnAwbNumber;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("store_invoice_updated_date")
    private String storeInvoiceUpdatedDate;
    
    
    
    
    @JsonProperty("return_affiliate_shipment_id")
    private String returnAffiliateShipmentId;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private BuyerDetails b2BBuyerDetails;
    
    
    
    
    @JsonProperty("b2c_buyer_details")
    private Object b2CBuyerDetails;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("external")
    private Object external;
    
    
    
    
    @JsonProperty("debug_info")
    private DebugInfo debugInfo;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("bag_weight")
    private Object bagWeight;
    
    
    
    
    @JsonProperty("auto_trigger_dp_assignment_acf")
    private Boolean autoTriggerDpAssignmentAcf;
    
    
    
    
    @JsonProperty("same_store_available")
    private Boolean sameStoreAvailable;
    
    
    
    
    @JsonProperty("return_store_node")
    private Integer returnStoreNode;
    
    
    
    
    @JsonProperty("forward_affiliate_shipment_id")
    private String forwardAffiliateShipmentId;
    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("ewaybill_info")
    private Object ewaybillInfo;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("return_details")
    private Object returnDetails;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("timestamp")
    private ShipmentTimeStamp timestamp;
    
    
    
    
    @JsonProperty("einvoice_info")
    private EinvoiceInfo einvoiceInfo;
    
    
    
    
    @JsonProperty("lock_data")
    private LockData lockData;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("forward_affiliate_order_id")
    private String forwardAffiliateOrderId;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("return_affiliate_order_id")
    private String returnAffiliateOrderId;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("ad_id")
    private String adId;
    
    
    
    
    @JsonProperty("pdf_links")
    private PDFLinks pdfLinks;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("company_affiliate_tag")
    private String companyAffiliateTag;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("shipment_meta")
    private ShipmentMeta shipmentMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("ordering_store_id")
    private Integer orderingStoreId;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
    
    @JsonProperty("store_invoice_id")
    private String storeInvoiceId;
    
    
    
    
    @JsonProperty("updated_date")
    private String updatedDate;
    
    
    
    
    @JsonProperty("external_invoice_id")
    private String externalInvoiceId;
    
    
    
    
    @JsonProperty("label_url")
    private String labelUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
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
    
    
    
    
    @JsonProperty("awb_no")
    private String awbNo;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("eway_bill_id")
    private String ewayBillId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
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
    
    
    
    
    @JsonProperty("total_gst_percentage")
    private Double totalGstPercentage;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("po_line_amount")
    private Double poLineAmount;
    
    
    
    
    @JsonProperty("item_base_price")
    private Double itemBasePrice;
    
    
    
    
    @JsonProperty("po_tax_amount")
    private Double poTaxAmount;
    
    
    
    
    @JsonProperty("docker_number")
    private String dockerNumber;
    
    
    
}


/*
    Model: GiftCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GiftCard{
    
    
    
    
    @JsonProperty("is_gift_applied")
    private Boolean isGiftApplied;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
    @JsonProperty("gift_price")
    private Integer giftPrice;
    
    
    
    
    @JsonProperty("gift_message")
    private String giftMessage;
    
    
    
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
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("custom_message")
    private String customMessage;
    
    
    
    
    @JsonProperty("b2b_po_details")
    private B2BPODetails b2BPoDetails;
    
    
    
    
    @JsonProperty("gift_card")
    private GiftCard giftCard;
    
    
    
    
    @JsonProperty("docket_number")
    private String docketNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
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
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("current_status_id")
    private Integer currentStatusId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
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
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("allow_force_return")
    private Boolean allowForceReturn;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
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
    
    
    
    
    @JsonProperty("cart_conditions")
    private Object cartConditions;
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriterias itemCriteria;
    
    
    
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
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRules> discountRules;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
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
    Model: BagGST
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagGST{
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
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
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("brand")
    private OrderBrandName brand;
    
    
    
    
    @JsonProperty("financial_breakup")
    private FinancialBreakup financialBreakup;
    
    
    
    
    @JsonProperty("current_status")
    private CurrentStatus currentStatus;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("bag_configs")
    private BagConfigs bagConfigs;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<AppliedPromos> appliedPromos;
    
    
    
    
    @JsonProperty("article")
    private OrderBagArticle article;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGST gstDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private Boolean enableDpTracking;
    
    
    
    
    @JsonProperty("company_details")
    private CompanyDetails companyDetails;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("forward_shipment_id")
    private String forwardShipmentId;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("platform_logo")
    private String platformLogo;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreDetails orderingStore;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceInfo invoice;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("custom_message")
    private String customMessage;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("shipment_details")
    private Object shipmentDetails;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
    
    @JsonProperty("estimated_sla_time")
    private String estimatedSlaTime;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
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
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AssetByShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AssetByShipment{
    
    
    
    
    @JsonProperty("expires_in")
    private String expiresIn;
    
    
    
    
    @JsonProperty("assets")
    private HashMap<String,String> assets;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
}


/*
    Model: ResponseGetAssetShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseGetAssetShipment{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
    
    @JsonProperty("result")
    private List<AssetByShipment> result;
    
    
    
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
    Model: PlatformUserDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformUserDetails{
    
    
    
    
    @JsonProperty("platform_user_id")
    private String platformUserId;
    
    
    
    
    @JsonProperty("platform_user_first_name")
    private String platformUserFirstName;
    
    
    
    
    @JsonProperty("platform_user_last_name")
    private String platformUserLastName;
    
    
    
    
    @JsonProperty("platform_user_employee_code")
    private String platformUserEmployeeCode;
    
    
    
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
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("staff_id")
    private Integer staffId;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("unique_reference_number")
    private String uniqueReferenceNumber;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("terminal_id")
    private String terminalId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
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
    
    
    
    
    @JsonProperty("staff")
    private Object staff;
    
    
    
    
    @JsonProperty("files")
    private List<Object> files;
    
    
    
    
    @JsonProperty("platform_user_details")
    private PlatformUserDetails platformUserDetails;
    
    
    
    
    @JsonProperty("order_platform")
    private String orderPlatform;
    
    
    
    
    @JsonProperty("billing_staff_details")
    private BillingStaffDetails billingStaffDetails;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("company_logo")
    private String companyLogo;
    
    
    
    
    @JsonProperty("employee_id")
    private Integer employeeId;
    
    
    
    
    @JsonProperty("customer_note")
    private String customerNote;
    
    
    
    
    @JsonProperty("payment_type")
    private String paymentType;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("mongo_cart_id")
    private Integer mongoCartId;
    
    
    
    
    @JsonProperty("order_tags")
    private List<Object> orderTags;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("transaction_data")
    private TransactionData transactionData;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("order_child_entities")
    private List<String> orderChildEntities;
    
    
    
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
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("tax_details")
    private TaxDetails taxDetails;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("meta")
    private OrderMeta meta;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
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
    
    
    
    
    @JsonProperty("order")
    private OrderDict order;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("actions")
    private List<Object> actions;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
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
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("options")
    private List<SubLane> options;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    Model: PlatformOrderItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformOrderItems{
    
    
    
    
    @JsonProperty("channel")
    private PlatformChannel channel;
    
    
    
    
    @JsonProperty("total_order_value")
    private Double totalOrderValue;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("breakup_values")
    private List<PlatformBreakupValues> breakupValues;
    
    
    
    
    @JsonProperty("user_info")
    private UserDataInfo userInfo;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
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
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<PlatformOrderItems> items;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: Options
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Options{
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: MetricsCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricsCount{
    
    
    
    
    @JsonProperty("options")
    private List<Options> options;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: MetricCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricCountResponse{
    
    
    
    
    @JsonProperty("items")
    private List<MetricsCount> items;
    
    
    
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
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    @JsonProperty("raw_status")
    private String rawStatus;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("last_location_recieved_at")
    private String lastLocationRecievedAt;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("results")
    private List<PlatformTrack> results;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: AdvanceFilterInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AdvanceFilterInfo{
    
    
    
    
    @JsonProperty("action_centre")
    private List<FiltersInfo> actionCentre;
    
    
    
    
    @JsonProperty("filters")
    private List<FiltersInfo> filters;
    
    
    
    
    @JsonProperty("unfulfilled")
    private List<FiltersInfo> unfulfilled;
    
    
    
    
    @JsonProperty("returned")
    private List<FiltersInfo> returned;
    
    
    
    
    @JsonProperty("processed")
    private List<FiltersInfo> processed;
    
    
    
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
    
    
    
    
    @JsonProperty("advance_filter")
    private AdvanceFilterInfo advanceFilter;
    
    
    
    
    @JsonProperty("global_filter")
    private List<FiltersInfo> globalFilter;
    
    
    
}


/*
    Model: Success
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Success{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: OmsReports
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OmsReports{
    
    
    
    
    @JsonProperty("s3_key")
    private String s3Key;
    
    
    
    
    @JsonProperty("report_type")
    private String reportType;
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("request_details")
    private Object requestDetails;
    
    
    
    
    @JsonProperty("report_created_at")
    private String reportCreatedAt;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("report_requested_at")
    private String reportRequestedAt;
    
    
    
}


/*
    Model: JioCodeUpsertDataSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertDataSet{
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
}


/*
    Model: JioCodeUpsertPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertPayload{
    
    
    
    
    @JsonProperty("data")
    private List<JioCodeUpsertDataSet> data;
    
    
    
}


/*
    Model: NestedErrorSchemaDataSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NestedErrorSchemaDataSet{
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: JioCodeUpsertResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertResponse{
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<NestedErrorSchemaDataSet> error;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
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
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("cdn")
    private URL cdn;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("upload")
    private FileUploadResponse upload;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    
    
    
    
    @JsonProperty("question_set")
    private List<QuestionSet> questionSet;
    
    
    
    
    @JsonProperty("qc_type")
    private List<String> qcType;
    
    
    
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
    
    
    
    
    @JsonProperty("reasons")
    private List<Reason> reasons;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BagReturnableCancelableStatus1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagReturnableCancelableStatus1{
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
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
    Model: Brand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Brand{
    
    
    
    
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    
    
    
    
    @JsonProperty("is_virtual_invoice")
    private Boolean isVirtualInvoice;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("script_last_ran")
    private String scriptLastRan;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("pickup_location")
    private String pickupLocation;
    
    
    
    
    @JsonProperty("credit_note_expiry_days")
    private Integer creditNoteExpiryDays;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("credit_note_allowed")
    private Boolean creditNoteAllowed;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
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
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
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
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("ds_type")
    private String dsType;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
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
    Model: StoreMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreMeta{
    
    
    
    
    @JsonProperty("additional_contact_details")
    private Object additionalContactDetails;
    
    
    
    
    @JsonProperty("ewaybill_portal_details")
    private Object ewaybillPortalDetails;
    
    
    
    
    @JsonProperty("product_return_config")
    private Object productReturnConfig;
    
    
    
    
    @JsonProperty("einvoice_portal_details")
    private EInvoicePortalDetails einvoicePortalDetails;
    
    
    
    
    @JsonProperty("documents")
    private StoreDocuments documents;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("gst_credentials")
    private StoreGstCredentials gstCredentials;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("gst_number")
    private String gstNumber;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("timing")
    private List<Object> timing;
    
    
    
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
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
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
    
    
    
    
    @JsonProperty("vat_no")
    private String vatNo;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("mall_area")
    private String mallArea;
    
    
    
    
    @JsonProperty("parent_store_id")
    private Integer parentStoreId;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("meta")
    private StoreMeta meta;
    
    
    
    
    @JsonProperty("brand_id")
    private Object brandId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_enabled_for_recon")
    private Boolean isEnabledForRecon;
    
    
    
    
    @JsonProperty("mall_name")
    private String mallName;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("packaging_material_count")
    private Integer packagingMaterialCount;
    
    
    
    
    @JsonProperty("brand_store_tags")
    private List<String> brandStoreTags;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("store_active_from")
    private String storeActiveFrom;
    
    
    
    
    @JsonProperty("s_id")
    private String sId;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("login_username")
    private String loginUsername;
    
    
    
    
    @JsonProperty("alohomora_user_id")
    private Integer alohomoraUserId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("store_address_json")
    private StoreAddress storeAddressJson;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("gender")
    private List<String> gender;
    
    
    
    
    @JsonProperty("primary_color_hex")
    private String primaryColorHex;
    
    
    
    
    @JsonProperty("marketer_name")
    private String marketerName;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("marketer_address")
    private String marketerAddress;
    
    
    
    
    @JsonProperty("primary_material")
    private String primaryMaterial;
    
    
    
    
    @JsonProperty("essential")
    private String essential;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("attributes")
    private Attributes attributes;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("l1_category_id")
    private Integer l1CategoryId;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("l2_category_id")
    private Integer l2CategoryId;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("webstore_product_url")
    private String webstoreProductUrl;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("status")
    private BagReturnableCancelableStatus1 status;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("restore_coupon")
    private Boolean restoreCoupon;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("b_type")
    private String bType;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("article_details")
    private ArticleDetails articleDetails;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("bag_status_history")
    private BagStatusHistory bagStatusHistory;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("bag_update_time")
    private Double bagUpdateTime;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("ordering_store")
    private Store orderingStore;
    
    
    
    
    @JsonProperty("no_of_bags_order")
    private Integer noOfBagsOrder;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("qc_required")
    private Object qcRequired;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<Object> appliedPromos;
    
    
    
    
    @JsonProperty("restore_promos")
    private Object restorePromos;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("b_id")
    private Integer bId;
    
    
    
    
    @JsonProperty("original_bag_list")
    private List<Integer> originalBagList;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGSTDetails gstDetails;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BagsPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagsPage{
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
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
    private BagsPage page;
    
    
    
    
    @JsonProperty("items")
    private List<BagDetailsPlatformResponse> items;
    
    
    
}


/*
    Model: GeneratePosOrderReceiptResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneratePosOrderReceiptResponse{
    
    
    
    
    @JsonProperty("payment_receipt")
    private String paymentReceipt;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("invoice_receipt")
    private String invoiceReceipt;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_bag_ids")
    private List<String> affiliateBagIds;
    
    
    
    
    @JsonProperty("bag_ids")
    private List<String> bagIds;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error_trace")
    private String errorTrace;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("set_id")
    private String setId;
    
    
    
    
    @JsonProperty("reason_ids")
    private List<Integer> reasonIds;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
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
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("entities")
    private List<Entities> entities;
    
    
    
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
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("lock_status")
    private String lockStatus;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_bag_locked")
    private Boolean isBagLocked;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("original_filter")
    private OriginalFilter originalFilter;
    
    
    
    
    @JsonProperty("is_shipment_locked")
    private Boolean isShipmentLocked;
    
    
    
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
    
    
    
    
    @JsonProperty("check_response")
    private List<CheckResponse> checkResponse;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("to_datetime")
    private String toDatetime;
    
    
    
    
    @JsonProperty("platform_id")
    private String platformId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("from_datetime")
    private String fromDatetime;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
    Model: Products
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Products{
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    Model: ProductsReasonsFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsFilters{
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private ProductsReasonsData data;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsReasonsFilters> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private EntityReasonData data;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("products")
    private List<ProductsReasons> products;
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesReasons> entities;
    
    
    
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
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsDataUpdatesFilters> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("products")
    private List<ProductsDataUpdates> products;
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesDataUpdates> entities;
    
    
    
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
    
    
    
    
    @JsonProperty("products")
    private List<Products> products;
    
    
    
    
    @JsonProperty("reasons")
    private ReasonsData reasons;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("data_updates")
    private DataUpdates dataUpdates;
    
    
    
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
    
    
    
    
    @JsonProperty("lock_after_transition")
    private Boolean lockAfterTransition;
    
    
    
    
    @JsonProperty("unlock_before_transition")
    private Boolean unlockBeforeTransition;
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesRequest> statuses;
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
    
    @JsonProperty("task")
    private Boolean task;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("final_state")
    private Object finalState;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
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
    Model: ArticleDetails1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDetails1{
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("weight")
    private Object weight;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("dimension")
    private Object dimension;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
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
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
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
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
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
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("location_details")
    private LocationDetails locationDetails;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
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
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
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
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("fynd_store_id")
    private String fyndStoreId;
    
    
    
    
    @JsonProperty("pdf_links")
    private MarketPlacePdf pdfLinks;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private Object affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("unit_price")
    private Double unitPrice;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_priority_code")
    private String affiliatePriorityCode;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment")
    private ShipmentData shipment;
    
    
    
    
    @JsonProperty("shipping_address")
    private OrderUser shippingAddress;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("user")
    private UserData user;
    
    
    
    
    @JsonProperty("bags")
    private List<AffiliateBag> bags;
    
    
    
    
    @JsonProperty("order_priority")
    private OrderPriority orderPriority;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("billing_address")
    private OrderUser billingAddress;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
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
    Model: AffiliateInventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryPaymentConfig{
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
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
    
    
    
    
    @JsonProperty("article_assignment")
    private AffiliateInventoryArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("logistics")
    private AffiliateInventoryLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("order")
    private AffiliateInventoryOrderConfig order;
    
    
    
    
    @JsonProperty("payment")
    private AffiliateInventoryPaymentConfig payment;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("meta")
    private List<AffiliateAppConfigMeta> meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
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
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryConfig inventory;
    
    
    
    
    @JsonProperty("app")
    private AffiliateAppConfig app;
    
    
    
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
    Model: OrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderConfig{
    
    
    
    
    @JsonProperty("store_lookup")
    private String storeLookup;
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("create_user")
    private Boolean createUser;
    
    
    
    
    @JsonProperty("bag_end_state")
    private String bagEndState;
    
    
    
    
    @JsonProperty("affiliate_store_id_mapping")
    private List<AffiliateStoreIdMapping> affiliateStoreIdMapping;
    
    
    
    
    @JsonProperty("article_lookup")
    private String articleLookup;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
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
    Model: PostHistoryData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostHistoryData{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("line_number")
    private String lineNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private PostHistoryData data;
    
    
    
    
    @JsonProperty("filters")
    private List<PostHistoryFilters> filters;
    
    
    
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
    Model: HistoryReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryReason{
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("dislay_name")
    private String dislayName;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
}


/*
    Model: HistoryMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryMeta{
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("reason")
    private HistoryReason reason;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("recordpath")
    private String recordpath;
    
    
    
    
    @JsonProperty("receiver")
    private String receiver;
    
    
    
    
    @JsonProperty("endtime")
    private String endtime;
    
    
    
    
    @JsonProperty("call_id")
    private String callId;
    
    
    
    
    @JsonProperty("activity_type")
    private String activityType;
    
    
    
    
    @JsonProperty("status2")
    private String status2;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("activity_comment")
    private String activityComment;
    
    
    
    
    @JsonProperty("short_link")
    private String shortLink;
    
    
    
    
    @JsonProperty("billsec")
    private String billsec;
    
    
    
    
    @JsonProperty("starttime")
    private String starttime;
    
    
    
    
    @JsonProperty("callerid")
    private String callerid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("status1")
    private String status1;
    
    
    
    
    @JsonProperty("caller")
    private String caller;
    
    
    
    
    @JsonProperty("recipient")
    private String recipient;
    
    
    
    
    @JsonProperty("duration")
    private String duration;
    
    
    
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
    
    
    
    
    @JsonProperty("display_message")
    private String displayMessage;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("ticket_url")
    private String ticketUrl;
    
    
    
    
    @JsonProperty("meta")
    private HistoryMeta meta;
    
    
    
    
    @JsonProperty("l2_detail")
    private String l2Detail;
    
    
    
    
    @JsonProperty("createdat")
    private String createdat;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("l1_detail")
    private String l1Detail;
    
    
    
    
    @JsonProperty("l3_detail")
    private String l3Detail;
    
    
    
    
    @JsonProperty("assigned_agent")
    private String assignedAgent;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
    Model: SmsDataPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsDataPayload{
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private Integer shipmentId;
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private SmsDataPayload data;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Meta1 meta;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
    
    @JsonProperty("remarks")
    private String remarks;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("result")
    private List<OrderStatusData> result;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
    @JsonProperty("qc_required")
    private String qcRequired;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
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
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
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
    
    
    
    
    @JsonProperty("pack_by_date")
    private String packByDate;
    
    
    
    
    @JsonProperty("dispatch_by_date")
    private String dispatchByDate;
    
    
    
    
    @JsonProperty("customer_pickup_slot")
    private Object customerPickupSlot;
    
    
    
    
    @JsonProperty("confirm_by_date")
    private String confirmByDate;
    
    
    
    
    @JsonProperty("dispatch_after_date")
    private String dispatchAfterDate;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("custom_messasge")
    private String customMessasge;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("external_line_id")
    private String externalLineId;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
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
    
    
    
    
    @JsonProperty("processing_dates")
    private ProcessingDates processingDates;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    @JsonProperty("external_shipment_id")
    private String externalShipmentId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("transaction_data")
    private Object transactionData;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
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
    Model: ShippingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingInfo{
    
    
    
    
    @JsonProperty("geo_location")
    private Object geoLocation;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("slot")
    private List<Object> slot;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("shipping_type")
    private String shippingType;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
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
    
    
    
    
    @JsonProperty("external_creation_date")
    private String externalCreationDate;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("currency_info")
    private Object currencyInfo;
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("payment_info")
    private PaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    
    
    
    
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("info")
    private Object info;
    
    
    
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
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethods> paymentMethods;
    
    
    
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
    
    
    
    
    @JsonProperty("lock_states")
    private List<String> lockStates;
    
    
    
    
    @JsonProperty("dp_configuration")
    private DpConfiguration dpConfiguration;
    
    
    
    
    @JsonProperty("logo_url")
    private Object logoUrl;
    
    
    
    
    @JsonProperty("payment_info")
    private CreateChannelPaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("shipment_assignment")
    private String shipmentAssignment;
    
    
    
    
    @JsonProperty("location_reassignment")
    private Boolean locationReassignment;
    
    
    
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
    Model: UploadConsent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadConsent{
    
    
    
    
    @JsonProperty("consent_url")
    private String consentUrl;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
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


/*
    Model: FetchCreditBalanceRequestPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FetchCreditBalanceRequestPayload{
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
}


/*
    Model: CreditBalanceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditBalanceInfo{
    
    
    
    
    @JsonProperty("total_credited_balance")
    private String totalCreditedBalance;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
}


/*
    Model: FetchCreditBalanceResponsePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FetchCreditBalanceResponsePayload{
    
    
    
    
    @JsonProperty("data")
    private CreditBalanceInfo data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RefundModeConfigRequestPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundModeConfigRequestPayload{
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
}


/*
    Model: SingleRefundModeInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SingleRefundModeInfo{
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: RefundModeInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundModeInfo{
    
    
    
    
    @JsonProperty("refund_mode_name")
    private SingleRefundModeInfo refundModeName;
    
    
    
}


/*
    Model: RefundModeConfigResponsePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundModeConfigResponsePayload{
    
    
    
    
    @JsonProperty("data")
    private RefundModeInfo data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: AttachUserOtpData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachUserOtpData{
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: AttachUserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachUserInfo{
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: AttachOrderUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachOrderUser{
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("otp_data")
    private AttachUserOtpData otpData;
    
    
    
    
    @JsonProperty("user_info")
    private AttachUserInfo userInfo;
    
    
    
}


/*
    Model: AttachOrderUserResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachOrderUserResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SendUserMobileOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendUserMobileOTP{
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
}


/*
    Model: PointBlankOtpData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PointBlankOtpData{
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
}


/*
    Model: SendUserMobileOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendUserMobileOtpResponse{
    
    
    
    
    @JsonProperty("data")
    private PointBlankOtpData data;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: VerifyOtpData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpData{
    
    
    
    
    @JsonProperty("otp_code")
    private Integer otpCode;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: VerifyMobileOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyMobileOTP{
    
    
    
    
    @JsonProperty("otp_data")
    private VerifyOtpData otpData;
    
    
    
}


/*
    Model: EInvoiceRetryShipmentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoiceRetryShipmentData{
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("einvoice_type")
    private String einvoiceType;
    
    
    
}


/*
    Model: EInvoiceRetry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoiceRetry{
    
    
    
    
    @JsonProperty("shipments_data")
    private List<EInvoiceRetryShipmentData> shipmentsData;
    
    
    
}


/*
    Model: EinvoiceResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EinvoiceResponseData{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: EInvoiceRetryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoiceRetryResponse{
    
    
    
    
    @JsonProperty("response_data")
    private List<EinvoiceResponseData> responseData;
    
    
    
}




}