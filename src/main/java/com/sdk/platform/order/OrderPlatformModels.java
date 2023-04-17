
package com.sdk.platform.order;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class OrderPlatformModels{


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
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
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
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
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
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
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
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("item_quantity")
    private Integer itemQuantity;
    
    
    
    
    @JsonProperty("gst")
    private GSTDetailsData gst;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("total_shipment_bags")
    private Integer totalShipmentBags;
    
    
    
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
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("avis_user_id")
    private String avisUserId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("is_anonymous_user")
    private Boolean isAnonymousUser;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("hex_code")
    private String hexCode;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("ops_status")
    private String opsStatus;
    
    
    
    
    @JsonProperty("actual_status")
    private String actualStatus;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
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
    
    
    
    
    @JsonProperty("sla")
    private Object sla;
    
    
    
    
    @JsonProperty("bags")
    private List<BagUnit> bags;
    
    
    
    
    @JsonProperty("fulfilling_centre")
    private String fulfillingCentre;
    
    
    
    
    @JsonProperty("payment_mode_info")
    private PaymentModeInfo paymentModeInfo;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("shipment_created_at")
    private String shipmentCreatedAt;
    
    
    
    
    @JsonProperty("channel")
    private Object channel;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private ShipmentItemFulFillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("total_bags_count")
    private Integer totalBagsCount;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("application")
    private Object application;
    
    
    
    
    @JsonProperty("total_shipments_in_order")
    private Integer totalShipmentsInOrder;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<FilterInfoOption> options;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<ShipmentItem> items;
    
    
    
    
    @JsonProperty("filters")
    private List<FiltersInfo> filters;
    
    
    
    
    @JsonProperty("applied_filters")
    private Object appliedFilters;
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    Model: BagStateMapper
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagStateMapper{
    
    
    
    
    @JsonProperty("bs_id")
    private Integer bsId;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    
    
    
    
    @JsonProperty("app_state_name")
    private String appStateName;
    
    
    
    
    @JsonProperty("app_facing")
    private Boolean appFacing;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
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
    
    
    
    
    @JsonProperty("forward")
    private Boolean forward;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("bsh_id")
    private Integer bshId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
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
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
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
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("company_gst")
    private String companyGst;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_contact")
    private ContactDetails companyContact;
    
    
    
    
    @JsonProperty("company_cin")
    private String companyCin;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("ordering_channel_logo")
    private Object orderingChannelLogo;
    
    
    
    
    @JsonProperty("cod_charges")
    private String codCharges;
    
    
    
    
    @JsonProperty("order_value")
    private String orderValue;
    
    
    
    
    @JsonProperty("tax_details")
    private Object taxDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("eway_bill_id")
    private String ewayBillId;
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("awb_no")
    private String awbNo;
    
    
    
    
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
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("longitude")
    private Integer longitude;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("latitude")
    private Integer latitude;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
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
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("current_status_id")
    private Integer currentStatusId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
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
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
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
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("refund_credit")
    private Integer refundCredit;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Integer deliveryCharge;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Integer taxCollectedAtSource;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Integer amountPaidRoundoff;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
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
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRules> discountRules;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
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
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
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
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("allow_force_return")
    private Boolean allowForceReturn;
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
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
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("current_status")
    private CurrentStatus currentStatus;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGST gstDetails;
    
    
    
    
    @JsonProperty("financial_breakup")
    private FinancialBreakup financialBreakup;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<AppliedPromos> appliedPromos;
    
    
    
    
    @JsonProperty("brand")
    private OrderBrandName brand;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("article")
    private OrderBagArticle article;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("bag_configs")
    private BagConfigs bagConfigs;
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_a4")
    private String invoiceA4;
    
    
    
    
    @JsonProperty("delivery_challan_a4")
    private String deliveryChallanA4;
    
    
    
    
    @JsonProperty("label_a6")
    private String labelA6;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("b2b")
    private String b2B;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("invoice_a6")
    private String invoiceA6;
    
    
    
    
    @JsonProperty("label_a4")
    private String labelA4;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("invoice_pos")
    private String invoicePos;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("label_pos")
    private String labelPos;
    
    
    
    
    @JsonProperty("po_invoice")
    private String poInvoice;
    
    
    
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
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("is_priority")
    private Boolean isPriority;
    
    
    
    
    @JsonProperty("order_item_id")
    private String orderItemId;
    
    
    
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
    Model: BuyerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyerDetails{
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("ajio_site_id")
    private String ajioSiteId;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("credit_note")
    private Object creditNote;
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
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
    
    
    
    
    @JsonProperty("lock_message")
    private String lockMessage;
    
    
    
    
    @JsonProperty("locked")
    private Boolean locked;
    
    
    
    
    @JsonProperty("mto")
    private Boolean mto;
    
    
    
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
    
    
    
    
    @JsonProperty("return_awb_number")
    private String returnAwbNumber;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
    
    @JsonProperty("auto_trigger_dp_assignment_acf")
    private Boolean autoTriggerDpAssignmentAcf;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("bag_weight")
    private Object bagWeight;
    
    
    
    
    @JsonProperty("debug_info")
    private DebugInfo debugInfo;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("timestamp")
    private ShipmentTimeStamp timestamp;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("return_affiliate_order_id")
    private String returnAffiliateOrderId;
    
    
    
    
    @JsonProperty("return_store_node")
    private Integer returnStoreNode;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("same_store_available")
    private Boolean sameStoreAvailable;
    
    
    
    
    @JsonProperty("external")
    private Object external;
    
    
    
    
    @JsonProperty("b2c_buyer_details")
    private Object b2CBuyerDetails;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("return_affiliate_shipment_id")
    private String returnAffiliateShipmentId;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private BuyerDetails b2BBuyerDetails;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("store_invoice_updated_date")
    private String storeInvoiceUpdatedDate;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("forward_affiliate_order_id")
    private String forwardAffiliateOrderId;
    
    
    
    
    @JsonProperty("return_details")
    private Object returnDetails;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("forward_affiliate_shipment_id")
    private String forwardAffiliateShipmentId;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("einvoice_info")
    private EinvoiceInfo einvoiceInfo;
    
    
    
    
    @JsonProperty("ewaybill_info")
    private Object ewaybillInfo;
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("lock_data")
    private LockData lockData;
    
    
    
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
    
    
    
    
    @JsonProperty("company_affiliate_tag")
    private String companyAffiliateTag;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("pdf_links")
    private PDFLinks pdfLinks;
    
    
    
    
    @JsonProperty("ad_id")
    private String adId;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("shipment_meta")
    private ShipmentMeta shipmentMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("label_url")
    private String labelUrl;
    
    
    
    
    @JsonProperty("store_invoice_id")
    private String storeInvoiceId;
    
    
    
    
    @JsonProperty("updated_date")
    private String updatedDate;
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
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
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Integer length;
    
    
    
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
    Model: UserDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetailsData{
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("bag_list")
    private List<String> bagList;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
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
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("ordering_store_id")
    private Integer orderingStoreId;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
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
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("platform_logo")
    private String platformLogo;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("company_details")
    private CompanyDetails companyDetails;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private Boolean enableDpTracking;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceInfo invoice;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("forward_shipment_id")
    private String forwardShipmentId;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreDetails orderingStore;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
    Model: TransactionData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionData{
    
    
    
    
    @JsonProperty("unique_reference_number")
    private String uniqueReferenceNumber;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("terminal_id")
    private String terminalId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("amount_paid")
    private String amountPaid;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
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
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("staff_id")
    private Integer staffId;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
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
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("company_logo")
    private String companyLogo;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_type")
    private String paymentType;
    
    
    
    
    @JsonProperty("platform_user_details")
    private PlatformUserDetails platformUserDetails;
    
    
    
    
    @JsonProperty("staff")
    private Object staff;
    
    
    
    
    @JsonProperty("order_platform")
    private String orderPlatform;
    
    
    
    
    @JsonProperty("order_child_entities")
    private List<String> orderChildEntities;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("order_tags")
    private List<Object> orderTags;
    
    
    
    
    @JsonProperty("customer_note")
    private String customerNote;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("mongo_cart_id")
    private Integer mongoCartId;
    
    
    
    
    @JsonProperty("transaction_data")
    private TransactionData transactionData;
    
    
    
    
    @JsonProperty("billing_staff_details")
    private BillingStaffDetails billingStaffDetails;
    
    
    
    
    @JsonProperty("files")
    private List<Object> files;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    @JsonProperty("employee_id")
    private Integer employeeId;
    
    
    
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
    
    
    
    
    @JsonProperty("pan_no")
    private String panNo;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
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
    
    
    
    
    @JsonProperty("meta")
    private OrderMeta meta;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("tax_details")
    private TaxDetails taxDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("actions")
    private List<Object> actions;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<SubLane> options;
    
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
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
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("channel")
    private PlatformChannel channel;
    
    
    
    
    @JsonProperty("total_order_value")
    private Double totalOrderValue;
    
    
    
    
    @JsonProperty("user_info")
    private UserDataInfo userInfo;
    
    
    
    
    @JsonProperty("breakup_values")
    private List<PlatformBreakupValues> breakupValues;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("items")
    private List<PlatformOrderItems> items;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<Options> options;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
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
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("last_location_recieved_at")
    private String lastLocationRecievedAt;
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
    
    @JsonProperty("raw_status")
    private String rawStatus;
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
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
    Model: Success
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Success{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("report_requested_at")
    private String reportRequestedAt;
    
    
    
    
    @JsonProperty("s3_key")
    private String s3Key;
    
    
    
    
    @JsonProperty("report_created_at")
    private String reportCreatedAt;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("report_type")
    private String reportType;
    
    
    
    
    @JsonProperty("request_details")
    private Object requestDetails;
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
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
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("error")
    private List<NestedErrorSchemaDataSet> error;
    
    
    
}


/*
    Model: BulkInvoicingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInvoicingResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BulkInvoiceLabelResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInvoiceLabelResponse{
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("invoice_status")
    private String invoiceStatus;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("label")
    private Object label;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("do_invoice_label_generated")
    private Boolean doInvoiceLabelGenerated;
    
    
    
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
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("cdn")
    private URL cdn;
    
    
    
    
    @JsonProperty("upload")
    private FileUploadResponse upload;
    
    
    
}


/*
    Model: bulkListingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class bulkListingData{
    
    
    
    
    @JsonProperty("failed_shipments")
    private List<Object> failedShipments;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("processing_shipments")
    private List<String> processingShipments;
    
    
    
    
    @JsonProperty("excel_url")
    private String excelUrl;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("successful_shipments")
    private List<Object> successfulShipments;
    
    
    
    
    @JsonProperty("successful")
    private Integer successful;
    
    
    
    
    @JsonProperty("processing")
    private Integer processing;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
}


/*
    Model: BulkListingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListingPage{
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: BulkListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListingResponse{
    
    
    
    
    @JsonProperty("data")
    private List<bulkListingData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("page")
    private BulkListingPage page;
    
    
    
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
    
    
    
    
    @JsonProperty("reasons")
    private List<Reason> reasons;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BulkActionPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionPayload{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: BulkActionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: BulkActionDetailsDataField
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionDetailsDataField{
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("successful_shipments_count")
    private Integer successfulShipmentsCount;
    
    
    
    
    @JsonProperty("processing_shipments_count")
    private Integer processingShipmentsCount;
    
    
    
    
    @JsonProperty("total_shipments_count")
    private Integer totalShipmentsCount;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("successful_shipment_ids")
    private List<String> successfulShipmentIds;
    
    
    
    
    @JsonProperty("failed_shipments_count")
    private Integer failedShipmentsCount;
    
    
    
}


/*
    Model: BulkActionDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionDetailsResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
    
    @JsonProperty("data")
    private List<BulkActionDetailsDataField> data;
    
    
    
    
    @JsonProperty("uploaded_by")
    private String uploadedBy;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("error")
    private List<String> error;
    
    
    
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
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("marketer_name")
    private String marketerName;
    
    
    
    
    @JsonProperty("gender")
    private List<String> gender;
    
    
    
    
    @JsonProperty("primary_material")
    private String primaryMaterial;
    
    
    
    
    @JsonProperty("essential")
    private String essential;
    
    
    
    
    @JsonProperty("marketer_address")
    private String marketerAddress;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("primary_color_hex")
    private String primaryColorHex;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("webstore_product_url")
    private String webstoreProductUrl;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("l2_category_id")
    private Integer l2CategoryId;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("attributes")
    private Attributes attributes;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("l1_category_id")
    private Integer l1CategoryId;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
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
    private Object deliveryDate;
    
    
    
    
    @JsonProperty("order_created")
    private String orderCreated;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
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
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
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
    
    
    
    
    @JsonProperty("is_virtual_invoice")
    private Boolean isVirtualInvoice;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("credit_note_expiry_days")
    private Integer creditNoteExpiryDays;
    
    
    
    
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("script_last_ran")
    private String scriptLastRan;
    
    
    
    
    @JsonProperty("credit_note_allowed")
    private Boolean creditNoteAllowed;
    
    
    
    
    @JsonProperty("pickup_location")
    private String pickupLocation;
    
    
    
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
    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("esp_modified")
    private Object espModified;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("child_details")
    private Object childDetails;
    
    
    
    
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("a_set")
    private Object aSet;
    
    
    
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
    
    
    
    
    @JsonProperty("item_base_price")
    private Double itemBasePrice;
    
    
    
    
    @JsonProperty("po_tax_amount")
    private Double poTaxAmount;
    
    
    
    
    @JsonProperty("po_line_amount")
    private Double poLineAmount;
    
    
    
    
    @JsonProperty("docker_number")
    private String dockerNumber;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("total_gst_percentage")
    private Double totalGstPercentage;
    
    
    
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
    Model: StoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreAddress{
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
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
    
    
    
    
    @JsonProperty("ds_type")
    private String dsType;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
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
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
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
    Model: StoreEinvoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreEinvoice{
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
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
    
    
    
    
    @JsonProperty("e_waybill")
    private StoreEwaybill eWaybill;
    
    
    
    
    @JsonProperty("e_invoice")
    private StoreEinvoice eInvoice;
    
    
    
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
    
    
    
    
    @JsonProperty("timing")
    private List<Object> timing;
    
    
    
    
    @JsonProperty("ewaybill_portal_details")
    private Object ewaybillPortalDetails;
    
    
    
    
    @JsonProperty("documents")
    private StoreDocuments documents;
    
    
    
    
    @JsonProperty("additional_contact_details")
    private Object additionalContactDetails;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("product_return_config")
    private Object productReturnConfig;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("einvoice_portal_details")
    private EInvoicePortalDetails einvoicePortalDetails;
    
    
    
    
    @JsonProperty("gst_credentials")
    private StoreGstCredentials gstCredentials;
    
    
    
    
    @JsonProperty("gst_number")
    private String gstNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("alohomora_user_id")
    private Integer alohomoraUserId;
    
    
    
    
    @JsonProperty("store_address_json")
    private StoreAddress storeAddressJson;
    
    
    
    
    @JsonProperty("mall_name")
    private String mallName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("packaging_material_count")
    private Integer packagingMaterialCount;
    
    
    
    
    @JsonProperty("mall_area")
    private String mallArea;
    
    
    
    
    @JsonProperty("store_active_from")
    private String storeActiveFrom;
    
    
    
    
    @JsonProperty("vat_no")
    private String vatNo;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("login_username")
    private String loginUsername;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("parent_store_id")
    private Integer parentStoreId;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("brand_id")
    private Object brandId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_enabled_for_recon")
    private Boolean isEnabledForRecon;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("meta")
    private StoreMeta meta;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("brand_store_tags")
    private List<String> brandStoreTags;
    
    
    
    
    @JsonProperty("s_id")
    private String sId;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
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
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    @JsonProperty("original_bag_list")
    private List<Integer> originalBagList;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("bag_update_time")
    private Double bagUpdateTime;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("bag_status_history")
    private BagStatusHistory bagStatusHistory;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("restore_promos")
    private Object restorePromos;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGSTDetails gstDetails;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("article_details")
    private ArticleDetails articleDetails;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<Object> appliedPromos;
    
    
    
    
    @JsonProperty("b_id")
    private Integer bId;
    
    
    
    
    @JsonProperty("qc_required")
    private Object qcRequired;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("b_type")
    private String bType;
    
    
    
    
    @JsonProperty("no_of_bags_order")
    private Integer noOfBagsOrder;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("status")
    private BagReturnableCancelableStatus status;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("restore_coupon")
    private Boolean restoreCoupon;
    
    
    
    
    @JsonProperty("ordering_store")
    private Store orderingStore;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
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
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<BagDetailsPlatformResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page1 page;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
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
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
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
    
    
    
    
    @JsonProperty("is_locked")
    private Boolean isLocked;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("is_bag_locked")
    private Boolean isBagLocked;
    
    
    
    
    @JsonProperty("is_shipment_locked")
    private Boolean isShipmentLocked;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
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
    
    
    
    
    @JsonProperty("from_datetime")
    private String fromDatetime;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("platform_id")
    private String platformId;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("to_datetime")
    private String toDatetime;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
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
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
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
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
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
    
    
    
    
    @JsonProperty("data_updates")
    private DataUpdates dataUpdates;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("reasons")
    private ReasonsData reasons;
    
    
    
    
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
    
    
    
    
    @JsonProperty("exclude_bags_next_state")
    private String excludeBagsNextState;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsRequest> shipments;
    
    
    
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
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesRequest> statuses;
    
    
    
    
    @JsonProperty("task")
    private Boolean task;
    
    
    
    
    @JsonProperty("unlock_before_transition")
    private Boolean unlockBeforeTransition;
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
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
    
    
    
    
    @JsonProperty("final_state")
    private Object finalState;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
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
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
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
    Model: AffiliateInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryConfig{
    
    
    
    
    @JsonProperty("order")
    private AffiliateInventoryOrderConfig order;
    
    
    
    
    @JsonProperty("payment")
    private AffiliateInventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("logistics")
    private AffiliateInventoryLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("article_assignment")
    private AffiliateInventoryArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryStoreConfig inventory;
    
    
    
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
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("meta")
    private List<AffiliateAppConfigMeta> meta;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
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
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config")
    private AffiliateConfig config;
    
    
    
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
    
    
    
    
    @JsonProperty("bag_end_state")
    private String bagEndState;
    
    
    
    
    @JsonProperty("store_lookup")
    private String storeLookup;
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("create_user")
    private Boolean createUser;
    
    
    
    
    @JsonProperty("article_lookup")
    private String articleLookup;
    
    
    
    
    @JsonProperty("affiliate_store_id_mapping")
    private List<AffiliateStoreIdMapping> affiliateStoreIdMapping;
    
    
    
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
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("weight")
    private Object weight;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("dimension")
    private Object dimension;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
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
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("location_details")
    private LocationDetails locationDetails;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
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
    Model: OrderUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderUser{
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
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
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
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
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("unit_price")
    private Double unitPrice;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("fynd_store_id")
    private String fyndStoreId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("pdf_links")
    private MarketPlacePdf pdfLinks;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private Object affiliateMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("order_priority")
    private OrderPriority orderPriority;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("shipping_address")
    private OrderUser shippingAddress;
    
    
    
    
    @JsonProperty("billing_address")
    private OrderUser billingAddress;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("user")
    private UserData user;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("bags")
    private List<AffiliateBag> bags;
    
    
    
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
    
    
    
    
    @JsonProperty("order_config")
    private OrderConfig orderConfig;
    
    
    
    
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("l3_detail")
    private String l3Detail;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("l2_detail")
    private String l2Detail;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("l1_detail")
    private String l1Detail;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("ticket_url")
    private String ticketUrl;
    
    
    
    
    @JsonProperty("createdat")
    private String createdat;
    
    
    
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
    
    
    
    
    @JsonProperty("line_number")
    private String lineNumber;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    Model: SmsDataPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsDataPayload{
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private Integer shipmentId;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private SmsDataPayload data;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
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
    
    
    
    
    @JsonProperty("kafka_emission_status")
    private Integer kafkaEmissionStatus;
    
    
    
    
    @JsonProperty("state_manager_used")
    private String stateManagerUsed;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("meta")
    private Meta1 meta;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("remarks")
    private String remarks;
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
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
    Model: OrderStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatusData{
    
    
    
    
    @JsonProperty("shipment_details")
    private List<ShipmentDetail> shipmentDetails;
    
    
    
    
    @JsonProperty("order_details")
    private OrderDetails orderDetails;
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("qc_required")
    private String qcRequired;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
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
    Model: Tax
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tax{
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
    
    @JsonProperty("breakup")
    private List<Object> breakup;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("external_line_id")
    private String externalLineId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("custom_messasge")
    private String customMessasge;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_pickup_slot")
    private Object customerPickupSlot;
    
    
    
    
    @JsonProperty("confirm_by_date")
    private String confirmByDate;
    
    
    
    
    @JsonProperty("dispatch_by_date")
    private String dispatchByDate;
    
    
    
    
    @JsonProperty("pack_by_date")
    private String packByDate;
    
    
    
    
    @JsonProperty("dispatch_after_date")
    private String dispatchAfterDate;
    
    
    
    
    @JsonProperty("dp_pickup_slot")
    private Object dpPickupSlot;
    
    
    
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
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    
    
    
    
    @JsonProperty("external_shipment_id")
    private String externalShipmentId;
    
    
    
    
    @JsonProperty("processing_dates")
    private ProcessingDates processingDates;
    
    
    
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
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
    @JsonProperty("transaction_data")
    private Object transactionData;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
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
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("slot")
    private List<Object> slot;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("geo_location")
    private Object geoLocation;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("shipping_type")
    private String shippingType;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
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
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("b2b_gstin_number")
    private String b2BGstinNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    
    
    
    
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    @JsonProperty("payment_info")
    private PaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
    
    
    
    
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    
    
    
    
    @JsonProperty("external_creation_date")
    private String externalCreationDate;
    
    
    
    
    @JsonProperty("currency_info")
    private Object currencyInfo;
    
    
    
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
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("info")
    private Object info;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
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
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethods> paymentMethods;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
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
    
    
    
    
    @JsonProperty("lock_states")
    private List<String> lockStates;
    
    
    
    
    @JsonProperty("shipment_assignment")
    private String shipmentAssignment;
    
    
    
    
    @JsonProperty("location_reassignment")
    private Boolean locationReassignment;
    
    
    
    
    @JsonProperty("dp_configuration")
    private DpConfiguration dpConfiguration;
    
    
    
    
    @JsonProperty("logo_url")
    private Object logoUrl;
    
    
    
    
    @JsonProperty("payment_info")
    private CreateChannelPaymentInfo paymentInfo;
    
    
    
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
    
    
    
    
    @JsonProperty("acknowledged")
    private Boolean acknowledged;
    
    
    
    
    @JsonProperty("is_upserted")
    private Boolean isUpserted;
    
    
    
    
    @JsonProperty("is_inserted")
    private Boolean isInserted;
    
    
    
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
    
    
    
    
    @JsonProperty("order_details")
    private List<FyndOrderIdList> orderDetails;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
}




}