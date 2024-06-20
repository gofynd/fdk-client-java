

package com.sdk.universal.billing;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class BillingPublicModels{


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
    
    
    
    
    @JsonProperty("aggregate_usage")
    private String aggregateUsage;
    
    
    
    
    @JsonProperty("usage_type")
    private String usageType;
    
    
    
}


/*
    Model: DetailList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DetailList{

    

    
    
    
    
    @JsonProperty("plans")
    private List<PlanDetails> plans;
    
    
    
    
    @JsonProperty("component_groups")
    private List<String> componentGroups;
    
    
    
}


/*
    Model: PlanTaxation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanTaxation{

    

    
    
    
    
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
    Model: PlanMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanMeta{

    

    
    
    
    
    @JsonProperty("plan_platform_display_name")
    private String planPlatformDisplayName;
    
    
    
}


/*
    Model: FeatureConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FeatureConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("hard_limit")
    private Integer hardLimit;
    
    
    
    
    @JsonProperty("soft_limit")
    private Integer softLimit;
    
    
    
}


/*
    Model: PlanConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanConfig{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("processing_type")
    private String processingType;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("feature_config")
    private FeatureConfig featureConfig;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("component_id")
    private String componentId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("billing_scheme")
    private String billingScheme;
    
    
    
    
    @JsonProperty("bill_type")
    private String billType;
    
    
    
    
    @JsonProperty("price_ui_type")
    private String priceUiType;
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    @JsonProperty("transform_quantity")
    private TransformQuantity transformQuantity;
    
    
    
    
    @JsonProperty("free_tier")
    private FreeTier freeTier;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("unit_amount")
    private Integer unitAmount;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price_type")
    private String priceType;
    
    
    
    
    @JsonProperty("tiers")
    private List<Object> tiers;
    
    
    
}


/*
    Model: FreeTier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreeTier{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
}


/*
    Model: TransformQuantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformQuantity{

    

    
    
    
    
    @JsonProperty("divide_by")
    private Integer divideBy;
    
    
    
    
    @JsonProperty("round")
    private String round;
    
    
    
}


/*
    Model: ComponentsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ComponentsSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("links")
    private Object links;
    
    
    
    
    @JsonProperty("config")
    private PlanConfig config;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
}


/*
    Model: PlanDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanDetails{

    

    
    
    
    
    @JsonProperty("approved_by")
    private String approvedBy;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("company_ids")
    private List<String> companyIds;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
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
    private PlanTaxation taxation;
    
    
    
    
    @JsonProperty("one_time_fees")
    private OneTimeFees oneTimeFees;
    
    
    
    
    @JsonProperty("credit_line")
    private CreditLine creditLine;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("meta")
    private PlanMeta meta;
    
    
    
    
    @JsonProperty("components")
    private List<ComponentsSchema> components;
    
    
    
}


/*
    Model: Recurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Recurring{

    

    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_count")
    private Integer intervalCount;
    
    
    
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
    Model: PlanList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanList{

    

    
    
    
    
    @JsonProperty("approved_by")
    private String approvedBy;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("recurring")
    private Recurring recurring;
    
    
    
    
    @JsonProperty("taxation")
    private Taxation taxation;
    
    
    
    
    @JsonProperty("one_time_fees")
    private OneTimeFees oneTimeFees;
    
    
    
    
    @JsonProperty("credit_line")
    private CreditLine creditLine;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Integer trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<Object> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("company_ids")
    private List<String> companyIds;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}




}