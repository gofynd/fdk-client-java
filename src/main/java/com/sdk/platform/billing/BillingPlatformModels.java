

package com.sdk.platform.billing;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class BillingPlatformModels{


/*
    Model: CompanyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyInfo{

    

    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("address_details")
    private AddressDetails addressDetails;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("cin")
    private String cin;
    
    
    
}


/*
    Model: AddressDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddressDetails{

    

    
    
    
    
    @JsonProperty("address_line_1")
    private String addressLine1;
    
    
    
    
    @JsonProperty("address_line_2")
    private String addressLine2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
}


/*
    Model: InvoiceData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceData{

    

    
    
    
    
    @JsonProperty("invoice")
    private InvoiceDetailsData invoice;
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
    
    @JsonProperty("shopsense_details")
    private CompanyInfo shopsenseDetails;
    
    
    
}


/*
    Model: InvoiceDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsData{

    

    
    
    
    
    @JsonProperty("attemp")
    private Double attemp;
    
    
    
    
    @JsonProperty("documents")
    private Object documents;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("period")
    private Period period;
    
    
    
    
    @JsonProperty("client")
    private Client client;
    
    
    
    
    @JsonProperty("discount")
    private Object discount;
    
    
    
    
    @JsonProperty("taxation")
    private Object taxation;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("status_trail")
    private List<StatusTrail> statusTrail;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("old_settlement")
    private Double oldSettlement;
    
    
    
    
    @JsonProperty("credit_balance")
    private Double creditBalance;
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    @JsonProperty("attempt")
    private Double attempt;
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    @JsonProperty("credit_note_amount")
    private Double creditNoteAmount;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: Client
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Client{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
}


/*
    Model: Period
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Period{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: StatusTrail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusTrail{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: PaymentCollectRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCollectRes{

    

    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
}


/*
    Model: SubscriptionChargeRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionChargeRes{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("product_suit_id")
    private String productSuitId;
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("line_items")
    private List<Object> lineItems;
    
    
    
}


/*
    Model: PostDowngradeRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostDowngradeRes{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private DowngradeRes data;
    
    
    
}


/*
    Model: DowngradeRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DowngradeRes{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("activated")
    private Boolean activated;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("request_user_id")
    private String requestUserId;
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
}


/*
    Model: PaymentStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("webhook_response")
    private List<Object> webhookResponse;
    
    
    
    
    @JsonProperty("aggregator_status")
    private String aggregatorStatus;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
}


/*
    Model: PaymentStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusResponse{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private PaymentStatusData data;
    
    
    
}


/*
    Model: BadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequest{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ResourceNotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourceNotFound{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("code")
    private Object code;
    
    
    
    
    @JsonProperty("success")
    private Object success;
    
    
    
}


/*
    Model: InternalServerError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalServerError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: CheckValidityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckValidityResponse{

    

    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
}


/*
    Model: PlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanRecurring{

    

    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_count")
    private Double intervalCount;
    
    
    
}


/*
    Model: PlanMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanMeta{

    

    
    
    
    
    @JsonProperty("seller_status")
    private String sellerStatus;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("plan_platform_display_name")
    private String planPlatformDisplayName;
    
    
    
}


/*
    Model: Plan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Plan{

    

    
    
    
    
    @JsonProperty("fee_components")
    private List<Object> feeComponents;
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Double trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("taxation")
    private Taxation taxation;
    
    
    
    
    @JsonProperty("one_time_fees")
    private OneTimeFees oneTimeFees;
    
    
    
    
    @JsonProperty("credit_line")
    private CreditLine creditLine;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("company_ids")
    private List<Object> companyIds;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("meta")
    private PlanMeta meta;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
}


/*
    Model: SubscriptionTrialPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionTrialPeriod{

    

    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
}


/*
    Model: EntityChargePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityChargePrice{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
}


/*
    Model: OneTimeChargeItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OneTimeChargeItem{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
}


/*
    Model: CreateOneTimeCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOneTimeCharge{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("charge")
    private OneTimeChargeItem charge;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
}


/*
    Model: ChargeRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeRecurring{

    

    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_time")
    private Double intervalTime;
    
    
    
}


/*
    Model: ChargeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeDetails{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("charge_type")
    private String chargeType;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    @JsonProperty("recurring")
    private ChargeRecurring recurring;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("billing_date")
    private String billingDate;
    
    
    
    
    @JsonProperty("current_period")
    private SubscriptionTrialPeriod currentPeriod;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: OneTimeChargeEntity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OneTimeChargeEntity{

    

    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("charge_type")
    private String chargeType;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("billing_date")
    private String billingDate;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
}


/*
    Model: CreateOneTimeChargeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOneTimeChargeResponse{

    

    
    
    
    
    @JsonProperty("charge")
    private Charge charge;
    
    
    
    
    @JsonProperty("confirm_url")
    private String confirmUrl;
    
    
    
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

    

    
    
    
    
    @JsonProperty("final_charge")
    private OneTimeChargeEntity finalCharge;
    
    
    
}


/*
    Model: InvoiceDetailsStatusTrail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsStatusTrail{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
}


/*
    Model: InvoiceItemsPlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPlanRecurring{

    

    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_count")
    private Integer intervalCount;
    
    
    
}


/*
    Model: InvoiceItemsPlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPlan{

    

    
    
    
    
    @JsonProperty("recurring")
    private InvoiceItemsPlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Integer trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: InvoiceItemsPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPeriod{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: InvoiceItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItems{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("plan")
    private InvoiceItemsPlan plan;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("period")
    private InvoiceItemsPeriod period;
    
    
    
    
    @JsonProperty("unit_amount")
    private Double unitAmount;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: InvoicesDataClient
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataClient{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
}


/*
    Model: InvoicesDataPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataPeriod{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: InvoicesDataPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataPaymentMethod{

    

    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
}


/*
    Model: InvoicesData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("documents")
    private Object documents;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("old_settlement")
    private Double oldSettlement;
    
    
    
    
    @JsonProperty("credit_balance")
    private Double creditBalance;
    
    
    
    
    @JsonProperty("discount")
    private Object discount;
    
    
    
    
    @JsonProperty("taxation")
    private Object taxation;
    
    
    
    
    @JsonProperty("credit_note_amount")
    private Double creditNoteAmount;
    
    
    
    
    @JsonProperty("client")
    private InvoicesDataClient client;
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    @JsonProperty("attemp")
    private Integer attemp;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    @JsonProperty("period")
    private InvoicesDataPeriod period;
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("status_trail")
    private List<InvoiceDetailsStatusTrail> statusTrail;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("hash_identifier")
    private String hashIdentifier;
    
    
    
    
    @JsonProperty("payment_method")
    private InvoicesDataPaymentMethod paymentMethod;
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
}


/*
    Model: Invoices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Invoices{

    

    
    
    
    
    @JsonProperty("data")
    private List<InvoicesData> data;
    
    
    
    
    @JsonProperty("start")
    private Integer start;
    
    
    
    
    @JsonProperty("end")
    private Integer end;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
}


/*
    Model: Phone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Phone{

    

    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("phone_country_code")
    private String phoneCountryCode;
    
    
    
}


/*
    Model: SubscriptionBillingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionBillingAddress{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    @JsonProperty("postal_code")
    private String postalCode;
    
    
    
}


/*
    Model: SubscriptionCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCustomer{

    

    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("documents")
    private Object documents;
    
    
    
    
    @JsonProperty("consent")
    private Boolean consent;
    
    
    
    
    @JsonProperty("comms")
    private Boolean comms;
    
    
    
    
    @JsonProperty("credit_balance")
    private Integer creditBalance;
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
}


/*
    Model: SubscriptionCustomerCreate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCustomerCreate{

    

    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: SubscriptionCurrentPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCurrentPeriod{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: SubscriptionPauseCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionPauseCollection{

    

    
    
    
    
    @JsonProperty("behavior")
    private String behavior;
    
    
    
    
    @JsonProperty("resume_at")
    private String resumeAt;
    
    
    
}


/*
    Model: SubscriptionTrial
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionTrial{

    

    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: SubscriptionInvoiceSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionInvoiceSettings{

    

    
    
    
    
    @JsonProperty("generation")
    private Boolean generation;
    
    
    
    
    @JsonProperty("charging")
    private Boolean charging;
    
    
    
}


/*
    Model: Subscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Subscription{

    

    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("current_period")
    private SubscriptionCurrentPeriod currentPeriod;
    
    
    
    
    @JsonProperty("pause_collection")
    private SubscriptionPauseCollection pauseCollection;
    
    
    
    
    @JsonProperty("trial")
    private SubscriptionTrial trial;
    
    
    
    
    @JsonProperty("invoice_settings")
    private SubscriptionInvoiceSettings invoiceSettings;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cancel_at_period_end")
    private Boolean cancelAtPeriodEnd;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("plan_data")
    private Plan planData;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("latest_invoice")
    private String latestInvoice;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("freezed")
    private Boolean freezed;
    
    
    
    
    @JsonProperty("cancel_at")
    private String cancelAt;
    
    
    
    
    @JsonProperty("canceled_at")
    private String canceledAt;
    
    
    
}


/*
    Model: SubscriptionStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionStatus{

    

    
    
    
    
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    
    
    
    
    @JsonProperty("subscription")
    private Subscription subscription;
    
    
    
    
    @JsonProperty("latest_invoice")
    private InvoicesData latestInvoice;
    
    
    
    
    @JsonProperty("next_plan")
    private Plan nextPlan;
    
    
    
    
    @JsonProperty("current_subscriptions")
    private List<Subscription> currentSubscriptions;
    
    
    
    
    @JsonProperty("mandate_amount")
    private Double mandateAmount;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SubscriptionLimitApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitApplication{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("hard_limit")
    private Integer hardLimit;
    
    
    
    
    @JsonProperty("soft_limit")
    private Integer softLimit;
    
    
    
}


/*
    Model: SubscriptionLimitMarketplace
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitMarketplace{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SubscriptionLimitOtherPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitOtherPlatform{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SubscriptionLimitTeam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitTeam{

    

    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
}


/*
    Model: SubscriptionLimitProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitProducts{

    

    
    
    
    
    @JsonProperty("bulk")
    private Boolean bulk;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
}


/*
    Model: SubscriptionLimitExtensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitExtensions{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
}


/*
    Model: SubscriptionLimitIntegrations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitIntegrations{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
}


/*
    Model: SubscriptionLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimit{

    

    
    
    
    
    @JsonProperty("application")
    private SubscriptionLimitApplication application;
    
    
    
    
    @JsonProperty("marketplace")
    private SubscriptionLimitMarketplace marketplace;
    
    
    
    
    @JsonProperty("other_platform")
    private SubscriptionLimitOtherPlatform otherPlatform;
    
    
    
    
    @JsonProperty("team")
    private SubscriptionLimitTeam team;
    
    
    
    
    @JsonProperty("products")
    private SubscriptionLimitProducts products;
    
    
    
    
    @JsonProperty("extensions")
    private SubscriptionLimitExtensions extensions;
    
    
    
    
    @JsonProperty("integrations")
    private SubscriptionLimitIntegrations integrations;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
}


/*
    Model: IntentReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentReq{

    

    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
}


/*
    Model: PutIntentReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PutIntentReq{

    

    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("setup_intent_id")
    private String setupIntentId;
    
    
    
    
    @JsonProperty("payment_method_id")
    private String paymentMethodId;
    
    
    
    
    @JsonProperty("set_default")
    private Boolean setDefault;
    
    
    
}


/*
    Model: SubscriptionActivateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionActivateReq{

    

    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: SubscriptionActivateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionActivateRes{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
}


/*
    Model: CancelSubscriptionReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelSubscriptionReq{

    

    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
}


/*
    Model: CancelSubscriptionRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelSubscriptionRes{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
}


/*
    Model: PlanStatusUpdateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanStatusUpdateReq{

    

    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("seller_status")
    private String sellerStatus;
    
    
    
}


/*
    Model: SunscribePlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SunscribePlan{

    

    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("collection_type")
    private String collectionType;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
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

    

    
    
    
    
    @JsonProperty("subscribe")
    private Boolean subscribe;
    
    
    
    
    @JsonProperty("is_custom_plan")
    private Boolean isCustomPlan;
    
    
    
    
    @JsonProperty("is_plan_upgrade")
    private Boolean isPlanUpgrade;
    
    
    
}


/*
    Model: SubscribePlanRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscribePlanRes{

    

    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
}


/*
    Model: EntityDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityDetail{

    

    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("item")
    private Subscription item;
    
    
    
}


/*
    Model: PaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptions{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("aggregator_id")
    private String aggregatorId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: VerifyPaymentReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyPaymentReq{

    

    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("razorpay_order_id")
    private String razorpayOrderId;
    
    
    
    
    @JsonProperty("razorpay_signature")
    private String razorpaySignature;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("provider_type")
    private String providerType;
    
    
    
}


/*
    Model: Documents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Documents{

    

    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("gst")
    private String gst;
    
    
    
}


/*
    Model: BillingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BillingAddress{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    @JsonProperty("postal_code")
    private String postalCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Currency{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: BusinessCountryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessCountryInfo{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("currency")
    private Currency currency;
    
    
    
    
    @JsonProperty("timezone")
    private String timezone;
    
    
    
}


/*
    Model: SubscriberData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberData{

    

    
    
    
    
    @JsonProperty("pg_user_exists")
    private Boolean pgUserExists;
    
    
    
    
    @JsonProperty("id")
    private Object id;
    
    
    
    
    @JsonProperty("pg_customer_id")
    private String pgCustomerId;
    
    
    
    
    @JsonProperty("default_payment_method")
    private String defaultPaymentMethod;
    
    
    
}


/*
    Model: Subscriber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Subscriber{

    

    
    
    
    
    @JsonProperty("documents")
    private Documents documents;
    
    
    
    
    @JsonProperty("phone")
    private Object phone;
    
    
    
    
    @JsonProperty("billing_address")
    private BillingAddress billingAddress;
    
    
    
    
    @JsonProperty("consent")
    private Boolean consent;
    
    
    
    
    @JsonProperty("comms")
    private Boolean comms;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("credit_balance")
    private Integer creditBalance;
    
    
    
    
    @JsonProperty("data")
    private SubscriberData data;
    
    
    
}


/*
    Model: Author
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Author{

    

    
    
    
    
    @JsonProperty("modified_by_details")
    private Object modifiedByDetails;
    
    
    
}


/*
    Model: EndingBalance
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EndingBalance{

    

    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("old_entry_ref")
    private String oldEntryRef;
    
    
    
}


/*
    Model: PaymentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentData{

    

    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
}


/*
    Model: CreditTransaction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditTransaction{

    

    
    
    
    
    @JsonProperty("entity")
    private Object entity;
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_test")
    private Object isTest;
    
    
    
    
    @JsonProperty("ending_balance")
    private EndingBalance endingBalance;
    
    
    
    
    @JsonProperty("payment")
    private PaymentData payment;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: VerifyPaymentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyPaymentData{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("subscriber")
    private Subscriber subscriber;
    
    
    
    
    @JsonProperty("credit_transaction")
    private CreditTransaction creditTransaction;
    
    
    
}


/*
    Model: VerifyPaymentRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyPaymentRes{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private VerifyPaymentData data;
    
    
    
}


/*
    Model: DefaultMerchants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultMerchants{

    

    
    
    
    
    @JsonProperty("stripe")
    private String stripe;
    
    
    
}


/*
    Model: GlobalSettingsPayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSettingsPayment{

    

    
    
    
    
    @JsonProperty("default_merchants")
    private DefaultMerchants defaultMerchants;
    
    
    
}


/*
    Model: GlobalSettingsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSettingsData{

    

    
    
    
    
    @JsonProperty("payment")
    private GlobalSettingsPayment payment;
    
    
    
    
    @JsonProperty("freeze_panel")
    private Boolean freezePanel;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: GlobalSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSettings{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private GlobalSettingsData data;
    
    
    
}


/*
    Model: MethodChecks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MethodChecks{

    

    
    
    
    
    @JsonProperty("address_line1_check")
    private String addressLine1Check;
    
    
    
    
    @JsonProperty("address_postal_code_check")
    private String addressPostalCodeCheck;
    
    
    
    
    @JsonProperty("cvc_check")
    private String cvcCheck;
    
    
    
}


/*
    Model: MethodNetworks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MethodNetworks{

    

    
    
    
    
    @JsonProperty("available")
    private List<String> available;
    
    
    
    
    @JsonProperty("preferred")
    private String preferred;
    
    
    
}


/*
    Model: MethodSecureUsage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MethodSecureUsage{

    

    
    
    
    
    @JsonProperty("supported")
    private Boolean supported;
    
    
    
}


/*
    Model: MethodDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MethodDetails{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("mandate_available")
    private Boolean mandateAvailable;
    
    
    
    
    @JsonProperty("mandate_amount")
    private Double mandateAmount;
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("data")
    private SubscriptionMethodData data;
    
    
    
}


/*
    Model: SubscriptionMethodData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionMethodData{

    

    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("checks")
    private MethodChecks checks;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("exp_month")
    private Double expMonth;
    
    
    
    
    @JsonProperty("exp_year")
    private Double expYear;
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    @JsonProperty("funding")
    private String funding;
    
    
    
    
    @JsonProperty("generated_from")
    private String generatedFrom;
    
    
    
    
    @JsonProperty("last4")
    private String last4;
    
    
    
    
    @JsonProperty("networks")
    private MethodNetworks networks;
    
    
    
    
    @JsonProperty("three_d_secure_usage")
    private MethodSecureUsage threeDSecureUsage;
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: SubscriptionMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionMethods{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<MethodDetails> data;
    
    
    
}


/*
    Model: ConfigPublicKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigPublicKey{

    

    
    
    
    
    @JsonProperty("public_key")
    private String publicKey;
    
    
    
}


/*
    Model: ConfigRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigRes{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("config")
    private ConfigPublicKey config;
    
    
    
}


/*
    Model: PlanChangeData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanChangeData{

    

    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("credit_note_amount")
    private Double creditNoteAmount;
    
    
    
    
    @JsonProperty("settlement")
    private Double settlement;
    
    
    
    
    @JsonProperty("taxable_amount")
    private Double taxableAmount;
    
    
    
    
    @JsonProperty("gst_amount")
    private Double gstAmount;
    
    
    
    
    @JsonProperty("gross_total")
    private Double grossTotal;
    
    
    
    
    @JsonProperty("gst")
    private Double gst;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
}


/*
    Model: PlanChangeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanChangeDetails{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private PlanChangeData data;
    
    
    
}


/*
    Model: TransactionMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransactionMeta{

    

    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
}


/*
    Model: PaymentTransactionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentTransactionDetails{

    

    
    
    
    
    @JsonProperty("aggregator")
    private Object aggregator;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("collection_type")
    private String collectionType;
    
    
    
    
    @JsonProperty("meta")
    private TransactionMeta meta;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: PaymentItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentItems{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: GetPaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentOptions{

    

    
    
    
    
    @JsonProperty("payment_options")
    private List<PaymentItems> paymentOptions;
    
    
    
}


/*
    Model: TopupReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TopupReq{

    

    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("provider_type")
    private String providerType;
    
    
    
}


/*
    Model: SetupMandateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupMandateReq{

    

    
    
    
    
    @JsonProperty("intent_id")
    private String intentId;
    
    
    
    
    @JsonProperty("payment_method_id")
    private String paymentMethodId;
    
    
    
}


/*
    Model: SetupPaymentReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupPaymentReq{

    

    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
}


/*
    Model: SubscriptionRenewReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionRenewReq{

    

    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("collection_type")
    private String collectionType;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("meta")
    private RenewMeta meta;
    
    
    
}


/*
    Model: RenewMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RenewMeta{

    

    
    
    
    
    @JsonProperty("invoice_payment")
    private Boolean invoicePayment;
    
    
    
    
    @JsonProperty("renew")
    private Boolean renew;
    
    
    
}


/*
    Model: SubscriptionMethodsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionMethodsReq{

    

    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("setup_intent_id")
    private String setupIntentId;
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
    @JsonProperty("set_default")
    private Boolean setDefault;
    
    
    
}


/*
    Model: CreditTransactionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditTransactionResponse{

    

    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("pages")
    private Integer pages;
    
    
    
    
    @JsonProperty("items")
    private List<CreditTransaction> items;
    
    
    
}


/*
    Model: DowngradePlanReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DowngradePlanReq{

    

    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
}


/*
    Model: Taxation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Taxation{

    

    
    
    
    
    @JsonProperty("gst")
    private Double gst;
    
    
    
}


/*
    Model: OneTimeFees
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OneTimeFees{

    

    
    
    
    
    @JsonProperty("developement")
    private Integer developement;
    
    
    
    
    @JsonProperty("marketing")
    private Integer marketing;
    
    
    
}


/*
    Model: CreditLine
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditLine{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: StatusMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusMessage{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: PaymentCollectReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCollectReq{

    

    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("credit_balance")
    private Boolean creditBalance;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
}


/*
    Model: SubscriptionRenewResMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionRenewResMeta{

    

    
    
    
    
    @JsonProperty("invoice_payment")
    private Boolean invoicePayment;
    
    
    
    
    @JsonProperty("renew")
    private Boolean renew;
    
    
    
}


/*
    Model: SubscriptionRenewRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionRenewRes{

    

    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("meta")
    private SubscriptionRenewResMeta meta;
    
    
    
}


/*
    Model: SetupIntentRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupIntentRes{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private SetupIntentData data;
    
    
    
}


/*
    Model: SetupIntentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupIntentData{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("client_secret")
    private String clientSecret;
    
    
    
    
    @JsonProperty("customer")
    private Object customer;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: SetupPayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupPayment{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("customer")
    private Object customer;
    
    
    
    
    @JsonProperty("client_secret")
    private String clientSecret;
    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
    @JsonProperty("mandate")
    private String mandate;
    
    
    
    
    @JsonProperty("payment_method_options")
    private PaymentMethodOptions paymentMethodOptions;
    
    
    
}


/*
    Model: PaymentMethodOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethodOptions{

    

    
    
    
    
    @JsonProperty("card")
    private Card card;
    
    
    
}


/*
    Model: Card
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Card{

    

    
    
    
    
    @JsonProperty("mandate_options")
    private MandateOptions mandateOptions;
    
    
    
}


/*
    Model: MandateOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MandateOptions{

    

    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
}


/*
    Model: Message
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Message{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: TopupRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TopupRes{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
}


/*
    Model: CancelTopupReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelTopupReq{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: CancelTopupRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelTopupRes{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
    
    @JsonProperty("aggregator_status")
    private String aggregatorStatus;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
}


/*
    Model: DefaultReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultReq{

    

    
    
    
    
    @JsonProperty("payment_method_id")
    private String paymentMethodId;
    
    
    
}




}