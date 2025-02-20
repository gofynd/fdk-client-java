

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
    Model: BadRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestSchema{

    

    
    
    
    
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
    private Integer code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    private HashMap<String,Object> metadata;
    
    
    
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
    private HashMap<String,Object> meta;
    
    
    
    
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
    private HashMap<String,Object> metadata;
    
    
    
    
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
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
}


/*
    Model: CreateOneTimeChargeResponseSchemas
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOneTimeChargeResponseSchemas{

    

    
    
    
    
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
    Model: EntityChargeRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityChargeRecurring{

    

    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
}


/*
    Model: ChargeLineItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeLineItem{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    @JsonProperty("recurring")
    private EntityChargeRecurring recurring;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("metadata")
    private HashMap<String,Object> metadata;
    
    
    
}


/*
    Model: CreateSubscriptionCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSubscriptionCharge{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("line_items")
    private List<ChargeLineItem> lineItems;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
}


/*
    Model: EntityChargeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityChargeDetails{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
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
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: EntitySubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitySubscription{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("line_items")
    private List<EntityChargeDetails> lineItems;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
}


/*
    Model: CreateSubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSubscription{

    

    
    
    
    
    @JsonProperty("subscription")
    private EntitySubscription subscription;
    
    
    
    
    @JsonProperty("confirm_url")
    private String confirmUrl;
    
    
    
}




}