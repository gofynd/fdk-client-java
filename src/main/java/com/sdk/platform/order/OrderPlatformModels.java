
package com.sdk.platform.order;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class OrderPlatformModels{


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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("actual_status")
    private String actualStatus;
    
    
    
    
    @JsonProperty("ops_status")
    private String opsStatus;
    
    
    
    
    @JsonProperty("hex_code")
    private String hexCode;
    
    
    
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
    Model: PlatformItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformItem{
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
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
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("item_quantity")
    private Integer itemQuantity;
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("total_shipment_bags")
    private Integer totalShipmentBags;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("gst")
    private GSTDetailsData gst;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
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
    
    
    
    
    @JsonProperty("avis_user_id")
    private String avisUserId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("is_anonymous_user")
    private Boolean isAnonymousUser;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
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
    
    
    
    
    @JsonProperty("total_bags_count")
    private Integer totalBagsCount;
    
    
    
    
    @JsonProperty("channel")
    private Object channel;
    
    
    
    
    @JsonProperty("shipment_created_at")
    private String shipmentCreatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("total_shipments_in_order")
    private Integer totalShipmentsInOrder;
    
    
    
    
    @JsonProperty("fulfilling_centre")
    private String fulfillingCentre;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("payment_mode_info")
    private PaymentModeInfo paymentModeInfo;
    
    
    
    
    @JsonProperty("sla")
    private Object sla;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private ShipmentItemFulFillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("bags")
    private List<BagUnit> bags;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("application")
    private Object application;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("options")
    private List<FilterInfoOption> options;
    
    
    
    
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
    
    
    
    
    @JsonProperty("applied_filters")
    private Object appliedFilters;
    
    
    
    
    @JsonProperty("items")
    private List<ShipmentItem> items;
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
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
    Model: ShipmentPayments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentPayments{
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
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
    
    
    
    
    @JsonProperty("updated_date")
    private String updatedDate;
    
    
    
    
    @JsonProperty("store_invoice_id")
    private String storeInvoiceId;
    
    
    
    
    @JsonProperty("label_url")
    private String labelUrl;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
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
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_cin")
    private String companyCin;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("company_gst")
    private String companyGst;
    
    
    
    
    @JsonProperty("company_contact")
    private ContactDetails companyContact;
    
    
    
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
    Model: LockData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LockData{
    
    
    
    
    @JsonProperty("locked")
    private Boolean locked;
    
    
    
    
    @JsonProperty("mto")
    private Boolean mto;
    
    
    
    
    @JsonProperty("lock_message")
    private String lockMessage;
    
    
    
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
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("ajio_site_id")
    private String ajioSiteId;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
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
    Model: ShipmentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentMeta{
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("forward_affiliate_order_id")
    private String forwardAffiliateOrderId;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("return_affiliate_shipment_id")
    private String returnAffiliateShipmentId;
    
    
    
    
    @JsonProperty("ewaybill_info")
    private Object ewaybillInfo;
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
    
    @JsonProperty("store_invoice_updated_date")
    private String storeInvoiceUpdatedDate;
    
    
    
    
    @JsonProperty("return_details")
    private Object returnDetails;
    
    
    
    
    @JsonProperty("return_store_node")
    private Integer returnStoreNode;
    
    
    
    
    @JsonProperty("forward_affiliate_shipment_id")
    private String forwardAffiliateShipmentId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("lock_data")
    private LockData lockData;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("same_store_available")
    private Boolean sameStoreAvailable;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("b2c_buyer_details")
    private Object b2CBuyerDetails;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private BuyerDetails b2BBuyerDetails;
    
    
    
    
    @JsonProperty("timestamp")
    private ShipmentTimeStamp timestamp;
    
    
    
    
    @JsonProperty("debug_info")
    private DebugInfo debugInfo;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("return_awb_number")
    private String returnAwbNumber;
    
    
    
    
    @JsonProperty("return_affiliate_order_id")
    private String returnAffiliateOrderId;
    
    
    
    
    @JsonProperty("auto_trigger_dp_assignment_acf")
    private Boolean autoTriggerDpAssignmentAcf;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("bag_weight")
    private Object bagWeight;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("einvoice_info")
    private EinvoiceInfo einvoiceInfo;
    
    
    
    
    @JsonProperty("external")
    private Object external;
    
    
    
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
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("order_item_id")
    private String orderItemId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("is_priority")
    private Boolean isPriority;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_pos")
    private String invoicePos;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label_a4")
    private String labelA4;
    
    
    
    
    @JsonProperty("invoice_a6")
    private String invoiceA6;
    
    
    
    
    @JsonProperty("b2b")
    private String b2B;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("label_a6")
    private String labelA6;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("po_invoice")
    private String poInvoice;
    
    
    
    
    @JsonProperty("invoice_a4")
    private String invoiceA4;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("credit_note_url")
    private String creditNoteUrl;
    
    
    
    
    @JsonProperty("label_pos")
    private String labelPos;
    
    
    
    
    @JsonProperty("delivery_challan_a4")
    private String deliveryChallanA4;
    
    
    
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
    
    
    
    
    @JsonProperty("shipment_meta")
    private ShipmentMeta shipmentMeta;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("ad_id")
    private String adId;
    
    
    
    
    @JsonProperty("company_affiliate_tag")
    private String companyAffiliateTag;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("pdf_links")
    private PDFLinks pdfLinks;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("tax_details")
    private Object taxDetails;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("order_value")
    private String orderValue;
    
    
    
    
    @JsonProperty("ordering_channel_logo")
    private Object orderingChannelLogo;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
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
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
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
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
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
    
    
    
    
    @JsonProperty("app_facing")
    private Boolean appFacing;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_state_name")
    private String appStateName;
    
    
    
    
    @JsonProperty("bs_id")
    private Integer bsId;
    
    
    
    
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("forward")
    private Boolean forward;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("bsh_id")
    private Integer bshId;
    
    
    
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
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
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
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("longitude")
    private Integer longitude;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("latitude")
    private Integer latitude;
    
    
    
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
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRules> discountRules;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
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
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("current_status_id")
    private Integer currentStatusId;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
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
    
    
    
    
    @JsonProperty("allow_force_return")
    private Boolean allowForceReturn;
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Integer amountPaidRoundoff;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("refund_credit")
    private Integer refundCredit;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Integer deliveryCharge;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Integer taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("brand")
    private OrderBrandName brand;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGST gstDetails;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<AppliedPromos> appliedPromos;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("current_status")
    private CurrentStatus currentStatus;
    
    
    
    
    @JsonProperty("bag_configs")
    private BagConfigs bagConfigs;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("article")
    private OrderBagArticle article;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("financial_breakup")
    private FinancialBreakup financialBreakup;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
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
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("bag_list")
    private List<String> bagList;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("eway_bill_id")
    private String ewayBillId;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
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
    Model: TrackingList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrackingList{
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
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
    
    
    
    
    @JsonProperty("ordering_store_id")
    private Integer orderingStoreId;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
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
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceInfo invoice;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private Boolean enableDpTracking;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("company_details")
    private CompanyDetails companyDetails;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("platform_logo")
    private String platformLogo;
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("forward_shipment_id")
    private String forwardShipmentId;
    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreDetails orderingStore;
    
    
    
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
    
    
    
    
    @JsonProperty("platform_user_id")
    private String platformUserId;
    
    
    
    
    @JsonProperty("platform_user_first_name")
    private String platformUserFirstName;
    
    
    
    
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
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("staff_id")
    private Integer staffId;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
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
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("terminal_id")
    private String terminalId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("amount_paid")
    private String amountPaid;
    
    
    
    
    @JsonProperty("unique_reference_number")
    private String uniqueReferenceNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_note")
    private String customerNote;
    
    
    
    
    @JsonProperty("order_platform")
    private String orderPlatform;
    
    
    
    
    @JsonProperty("payment_type")
    private String paymentType;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("platform_user_details")
    private PlatformUserDetails platformUserDetails;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("staff")
    private Object staff;
    
    
    
    
    @JsonProperty("employee_id")
    private Integer employeeId;
    
    
    
    
    @JsonProperty("files")
    private List<Object> files;
    
    
    
    
    @JsonProperty("billing_staff_details")
    private BillingStaffDetails billingStaffDetails;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("order_child_entities")
    private List<String> orderChildEntities;
    
    
    
    
    @JsonProperty("transaction_data")
    private TransactionData transactionData;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("order_tags")
    private List<Object> orderTags;
    
    
    
    
    @JsonProperty("company_logo")
    private String companyLogo;
    
    
    
    
    @JsonProperty("mongo_cart_id")
    private Integer mongoCartId;
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
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
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("tax_details")
    private TaxDetails taxDetails;
    
    
    
    
    @JsonProperty("meta")
    private OrderMeta meta;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
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
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("order")
    private OrderDict order;
    
    
    
    
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
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("actions")
    private List<Object> actions;
    
    
    
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
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<SubLane> options;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
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
    Model: PlatformChannel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformChannel{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
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
    
    
    
    
    @JsonProperty("channel")
    private PlatformChannel channel;
    
    
    
    
    @JsonProperty("breakup_values")
    private List<PlatformBreakupValues> breakupValues;
    
    
    
    
    @JsonProperty("user_info")
    private UserDataInfo userInfo;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("total_order_value")
    private Double totalOrderValue;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<PlatformOrderItems> items;
    
    
    
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
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<Options> options;
    
    
    
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
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("raw_status")
    private String rawStatus;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("report_created_at")
    private String reportCreatedAt;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("report_type")
    private String reportType;
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
    
    @JsonProperty("report_requested_at")
    private String reportRequestedAt;
    
    
    
    
    @JsonProperty("s3_key")
    private String s3Key;
    
    
    
    
    @JsonProperty("request_details")
    private Object requestDetails;
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<NestedErrorSchemaDataSet> error;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
    
    @JsonProperty("do_invoice_label_generated")
    private Boolean doInvoiceLabelGenerated;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("label")
    private Object label;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("invoice_status")
    private String invoiceStatus;
    
    
    
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
    Model: FileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileResponse{
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("upload")
    private FileUploadResponse upload;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("cdn")
    private URL cdn;
    
    
    
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
    
    
    
    
    @JsonProperty("processing")
    private Integer processing;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
    
    @JsonProperty("successful_shipments")
    private List<Object> successfulShipments;
    
    
    
    
    @JsonProperty("successful")
    private Integer successful;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("processing_shipments")
    private List<String> processingShipments;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("excel_url")
    private String excelUrl;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("failed_shipments")
    private List<Object> failedShipments;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private BulkListingPage page;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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
    
    
    
    
    @JsonProperty("question_set")
    private List<QuestionSet> questionSet;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("failed_shipments_count")
    private Integer failedShipmentsCount;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("processing_shipments_count")
    private Integer processingShipmentsCount;
    
    
    
    
    @JsonProperty("successful_shipments_count")
    private Integer successfulShipmentsCount;
    
    
    
    
    @JsonProperty("successful_shipment_ids")
    private List<String> successfulShipmentIds;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("total_shipments_count")
    private Integer totalShipmentsCount;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("error")
    private List<String> error;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("uploaded_by")
    private String uploadedBy;
    
    
    
    
    @JsonProperty("data")
    private List<BulkActionDetailsDataField> data;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
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
    
    
    
    
    @JsonProperty("credit_note_allowed")
    private Boolean creditNoteAllowed;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    
    
    
    
    @JsonProperty("script_last_ran")
    private String scriptLastRan;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("pickup_location")
    private String pickupLocation;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("is_virtual_invoice")
    private Boolean isVirtualInvoice;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("credit_note_expiry_days")
    private Integer creditNoteExpiryDays;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
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
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    Model: B2BPODetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class B2BPODetails{
    
    
    
    
    @JsonProperty("po_line_amount")
    private Double poLineAmount;
    
    
    
    
    @JsonProperty("total_gst_percentage")
    private Double totalGstPercentage;
    
    
    
    
    @JsonProperty("docker_number")
    private String dockerNumber;
    
    
    
    
    @JsonProperty("item_base_price")
    private Double itemBasePrice;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
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
    Model: Weight
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Weight{
    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
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
    Model: Article
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Article{
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("child_details")
    private Object childDetails;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("a_set")
    private Object aSet;
    
    
    
    
    @JsonProperty("esp_modified")
    private Object espModified;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
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
    Model: Attributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Attributes{
    
    
    
    
    @JsonProperty("primary_color_hex")
    private String primaryColorHex;
    
    
    
    
    @JsonProperty("gender")
    private List<String> gender;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("marketer_address")
    private String marketerAddress;
    
    
    
    
    @JsonProperty("essential")
    private String essential;
    
    
    
    
    @JsonProperty("primary_material")
    private String primaryMaterial;
    
    
    
    
    @JsonProperty("marketer_name")
    private String marketerName;
    
    
    
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
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("attributes")
    private Attributes attributes;
    
    
    
    
    @JsonProperty("webstore_product_url")
    private String webstoreProductUrl;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("l2_category_id")
    private Integer l2CategoryId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("l1_category_id")
    private Integer l1CategoryId;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
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
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
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
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("ds_type")
    private String dsType;
    
    
    
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
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
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
    
    
    
    
    @JsonProperty("gst_number")
    private String gstNumber;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("ewaybill_portal_details")
    private Object ewaybillPortalDetails;
    
    
    
    
    @JsonProperty("product_return_config")
    private Object productReturnConfig;
    
    
    
    
    @JsonProperty("gst_credentials")
    private StoreGstCredentials gstCredentials;
    
    
    
    
    @JsonProperty("timing")
    private List<Object> timing;
    
    
    
    
    @JsonProperty("documents")
    private StoreDocuments documents;
    
    
    
    
    @JsonProperty("additional_contact_details")
    private Object additionalContactDetails;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("einvoice_portal_details")
    private EInvoicePortalDetails einvoicePortalDetails;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
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
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("parent_store_id")
    private Integer parentStoreId;
    
    
    
    
    @JsonProperty("alohomora_user_id")
    private Integer alohomoraUserId;
    
    
    
    
    @JsonProperty("packaging_material_count")
    private Integer packagingMaterialCount;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("store_active_from")
    private String storeActiveFrom;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("brand_id")
    private Object brandId;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_enabled_for_recon")
    private Boolean isEnabledForRecon;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("store_address_json")
    private StoreAddress storeAddressJson;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("vat_no")
    private String vatNo;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("meta")
    private StoreMeta meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("s_id")
    private String sId;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("mall_area")
    private String mallArea;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("login_username")
    private String loginUsername;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("mall_name")
    private String mallName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("brand_store_tags")
    private List<String> brandStoreTags;
    
    
    
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
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("qc_required")
    private Object qcRequired;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("b_type")
    private String bType;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGSTDetails gstDetails;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<Object> appliedPromos;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("restore_coupon")
    private Boolean restoreCoupon;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("bag_status_history")
    private BagStatusHistory bagStatusHistory;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("no_of_bags_order")
    private Integer noOfBagsOrder;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("b_id")
    private Integer bId;
    
    
    
    
    @JsonProperty("restore_promos")
    private Object restorePromos;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("status")
    private BagReturnableCancelableStatus status;
    
    
    
    
    @JsonProperty("article_details")
    private ArticleDetails articleDetails;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("original_bag_list")
    private List<Integer> originalBagList;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
    
    @JsonProperty("bag_update_time")
    private Double bagUpdateTime;
    
    
    
    
    @JsonProperty("ordering_store")
    private Store orderingStore;
    
    
    
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
    Model: Page1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page1{
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_receipt")
    private String invoiceReceipt;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("reason_ids")
    private List<Integer> reasonIds;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("set_id")
    private String setId;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
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
    
    
    
    
    @JsonProperty("entities")
    private List<Entities> entities;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("is_bag_locked")
    private Boolean isBagLocked;
    
    
    
    
    @JsonProperty("is_shipment_locked")
    private Boolean isShipmentLocked;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("original_filter")
    private OriginalFilter originalFilter;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
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
    
    
    
    
    @JsonProperty("check_response")
    private List<CheckResponse> checkResponse;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("platform_id")
    private String platformId;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("from_datetime")
    private String fromDatetime;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("to_datetime")
    private String toDatetime;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("call_id")
    private String callId;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
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
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
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
    Model: ProductsReasonsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsData{
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("reasons")
    private ReasonsData reasons;
    
    
    
    
    @JsonProperty("data_updates")
    private DataUpdates dataUpdates;
    
    
    
    
    @JsonProperty("products")
    private List<Products> products;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsRequest> shipments;
    
    
    
    
    @JsonProperty("exclude_bags_next_state")
    private String excludeBagsNextState;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
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
    
    
    
    
    @JsonProperty("task")
    private Boolean task;
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesRequest> statuses;
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
    
    @JsonProperty("lock_after_transition")
    private Boolean lockAfterTransition;
    
    
    
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
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("final_state")
    private Object finalState;
    
    
    
    
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
    Model: AffiliateInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryConfig{
    
    
    
    
    @JsonProperty("article_assignment")
    private AffiliateInventoryArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("order")
    private AffiliateInventoryOrderConfig order;
    
    
    
    
    @JsonProperty("payment")
    private AffiliateInventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryStoreConfig inventory;
    
    
    
    
    @JsonProperty("logistics")
    private AffiliateInventoryLogisticsConfig logistics;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("meta")
    private List<AffiliateAppConfigMeta> meta;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
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
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
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
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("article_lookup")
    private String articleLookup;
    
    
    
    
    @JsonProperty("create_user")
    private Boolean createUser;
    
    
    
    
    @JsonProperty("bag_end_state")
    private String bagEndState;
    
    
    
    
    @JsonProperty("affiliate_store_id_mapping")
    private List<AffiliateStoreIdMapping> affiliateStoreIdMapping;
    
    
    
    
    @JsonProperty("store_lookup")
    private String storeLookup;
    
    
    
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
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
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
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("weight")
    private Object weight;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("dimension")
    private Object dimension;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("location_details")
    private LocationDetails locationDetails;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("shipment")
    private List<ShipmentDetails> shipment;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
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
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("fynd_store_id")
    private String fyndStoreId;
    
    
    
    
    @JsonProperty("unit_price")
    private Double unitPrice;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("pdf_links")
    private MarketPlacePdf pdfLinks;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
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
    Model: OrderPriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderPriority{
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("affiliate_priority_code")
    private String affiliatePriorityCode;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("billing_address")
    private OrderUser billingAddress;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("shipment")
    private ShipmentData shipment;
    
    
    
    
    @JsonProperty("bags")
    private List<AffiliateBag> bags;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("user")
    private UserData user;
    
    
    
    
    @JsonProperty("order_priority")
    private OrderPriority orderPriority;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("shipping_address")
    private OrderUser shippingAddress;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
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
    
    
    
    
    @JsonProperty("l2_detail")
    private String l2Detail;
    
    
    
    
    @JsonProperty("l1_detail")
    private String l1Detail;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("l3_detail")
    private String l3Detail;
    
    
    
    
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
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("line_number")
    private String lineNumber;
    
    
    
    
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
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
    
    @JsonProperty("shipment_id")
    private Integer shipmentId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("remarks")
    private String remarks;
    
    
    
    
    @JsonProperty("meta")
    private Meta1 meta;
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
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
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
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
    Model: ShippingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingInfo{
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("shipping_type")
    private String shippingType;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("geo_location")
    private Object geoLocation;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("slot")
    private List<Object> slot;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
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
    Model: ProcessingDates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProcessingDates{
    
    
    
    
    @JsonProperty("pack_by_date")
    private String packByDate;
    
    
    
    
    @JsonProperty("dispatch_by_date")
    private String dispatchByDate;
    
    
    
    
    @JsonProperty("dp_pickup_slot")
    private Object dpPickupSlot;
    
    
    
    
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
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
    
    @JsonProperty("breakup")
    private List<Object> breakup;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("custom_messasge")
    private String customMessasge;
    
    
    
    
    @JsonProperty("external_line_id")
    private String externalLineId;
    
    
    
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
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    @JsonProperty("external_shipment_id")
    private String externalShipmentId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("processing_dates")
    private ProcessingDates processingDates;
    
    
    
    
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    
    
    
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
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
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
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("transaction_data")
    private Object transactionData;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
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
    Model: CreateOrderAPI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderAPI{
    
    
    
    
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
    
    
    
    
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    
    
    
    
    @JsonProperty("external_creation_date")
    private String externalCreationDate;
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("currency_info")
    private Object currencyInfo;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
    
    
    
    
    @JsonProperty("payment_info")
    private PaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("info")
    private Object info;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
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
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethods> paymentMethods;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
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
    
    
    
    
    @JsonProperty("location_reassignment")
    private Boolean locationReassignment;
    
    
    
    
    @JsonProperty("dp_configuration")
    private DpConfiguration dpConfiguration;
    
    
    
    
    @JsonProperty("payment_info")
    private CreateChannelPaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("logo_url")
    private Object logoUrl;
    
    
    
    
    @JsonProperty("lock_states")
    private List<String> lockStates;
    
    
    
    
    @JsonProperty("shipment_assignment")
    private String shipmentAssignment;
    
    
    
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
    
    
    
    
    @JsonProperty("is_upserted")
    private Boolean isUpserted;
    
    
    
    
    @JsonProperty("acknowledged")
    private Boolean acknowledged;
    
    
    
    
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
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("order_details")
    private List<FyndOrderIdList> orderDetails;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
}




}