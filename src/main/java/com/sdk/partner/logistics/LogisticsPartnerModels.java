

package com.sdk.partner.logistics;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class LogisticsPartnerModels{


/*
    Model: CourierPartnerSchemeModelSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeModelSchema{

    

    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("volumetric_weight")
    private ArithmeticOperations volumetricWeight;
    
    
    
    
    @JsonProperty("transport_type")
    private String transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("delivery_type")
    private String deliveryType;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("status_updates")
    private String statusUpdates;
    
    
    
    
    @JsonProperty("ndr_attempts")
    private Integer ndrAttempts;
    
    
    
    
    @JsonProperty("qc_shipment_item_quantity")
    private Integer qcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("non_qc_shipment_item_quantity")
    private Integer nonQcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("feature")
    private CourierPartnerSchemeFeatures feature;
    
    
    
    
    @JsonProperty("default_forward_pickup_cutoff")
    private String defaultForwardPickupCutoff;
    
    
    
    
    @JsonProperty("default_reverse_pickup_cutoff")
    private String defaultReversePickupCutoff;
    
    
    
    
    @JsonProperty("default_cutoff_timezone")
    private String defaultCutoffTimezone;
    
    
    
    
    @JsonProperty("default_tat")
    private CourierPartnerSchemeDefaultTat defaultTat;
    
    
    
}


/*
    Model: BulkRegionServiceabilityTatDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatDetails{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: BulkRegionServiceabilityTatResultItemData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatResultItemData{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("failed_records")
    private List<HashMap<String,Object>> failedRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
}


/*
    Model: CommonErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonErrorResult{

    

    
    
    
    
    @JsonProperty("error")
    private List<Error> error;
    
    
    
}


/*
    Model: BulkFailureResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkFailureResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<Error> error;
    
    
    
}


/*
    Model: FailureResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FailureResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<Error> error;
    
    
    
}


/*
    Model: BulkRegionServiceabilityTatResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<BulkRegionServiceabilityTatResultItemData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: RegionTatItemResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionTatItemResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<RegionTatResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: RegionServiceabilityItemResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionServiceabilityItemResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<RegionServiceabilityResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ServiceabilityDetailsResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityDetailsResult{

    

    
    
    
    
    @JsonProperty("pickup_cutoff")
    private String pickupCutoff;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("city_code")
    private String cityCode;
    
    
    
    
    @JsonProperty("sector_code")
    private String sectorCode;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_mile")
    private Boolean firstMile;
    
    
    
    
    @JsonProperty("last_mile")
    private Boolean lastMile;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("prepaid_limit")
    private Double prepaidLimit;
    
    
    
    
    @JsonProperty("doorstep_return")
    private Boolean doorstepReturn;
    
    
    
    
    @JsonProperty("doorstep_qc")
    private Boolean doorstepQc;
    
    
    
    
    @JsonProperty("forward_pickup_cutoff")
    private String forwardPickupCutoff;
    
    
    
    
    @JsonProperty("reverse_pickup_cutoff")
    private String reversePickupCutoff;
    
    
    
    
    @JsonProperty("hand_to_hand_exchange")
    private Boolean handToHandExchange;
    
    
    
    
    @JsonProperty("holiday_list")
    private List<String> holidayList;
    
    
    
    
    @JsonProperty("reverse_pickup")
    private Boolean reversePickup;
    
    
    
    
    @JsonProperty("installation")
    private Boolean installation;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: ServiceabilityDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityDetails{

    

    
    
    
    
    @JsonProperty("first_mile")
    private Boolean firstMile;
    
    
    
    
    @JsonProperty("last_mile")
    private Boolean lastMile;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("doorstep_return")
    private Boolean doorstepReturn;
    
    
    
    
    @JsonProperty("doorstep_qc")
    private Boolean doorstepQc;
    
    
    
    
    @JsonProperty("forward_pickup_cutoff")
    private String forwardPickupCutoff;
    
    
    
    
    @JsonProperty("reverse_pickup_cutoff")
    private String reversePickupCutoff;
    
    
    
    
    @JsonProperty("hand_to_hand_exchange")
    private Boolean handToHandExchange;
    
    
    
    
    @JsonProperty("holiday_list")
    private List<String> holidayList;
    
    
    
    
    @JsonProperty("installation")
    private Boolean installation;
    
    
    
    
    @JsonProperty("pickup_cutoff")
    private String pickupCutoff;
    
    
    
}


/*
    Model: RegionServiceabilityResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionServiceabilityResult{

    

    
    
    
    
    @JsonProperty("pickup_cutoff")
    private String pickupCutoff;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("city_code")
    private String cityCode;
    
    
    
    
    @JsonProperty("sector_code")
    private String sectorCode;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_mile")
    private Boolean firstMile;
    
    
    
    
    @JsonProperty("last_mile")
    private Boolean lastMile;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("prepaid_limit")
    private Double prepaidLimit;
    
    
    
    
    @JsonProperty("doorstep_return")
    private Boolean doorstepReturn;
    
    
    
    
    @JsonProperty("doorstep_qc")
    private Boolean doorstepQc;
    
    
    
    
    @JsonProperty("reverse_pickup")
    private Boolean reversePickup;
    
    
    
    
    @JsonProperty("forward_pickup_cutoff")
    private String forwardPickupCutoff;
    
    
    
    
    @JsonProperty("reverse_pickup_cutoff")
    private String reversePickupCutoff;
    
    
    
    
    @JsonProperty("hand_to_hand_exchange")
    private Boolean handToHandExchange;
    
    
    
    
    @JsonProperty("holiday_list")
    private List<String> holidayList;
    
    
    
    
    @JsonProperty("installation")
    private Boolean installation;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: RegionServiceabilityDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionServiceabilityDetails{

    

    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("city_code")
    private String cityCode;
    
    
    
    
    @JsonProperty("sector_code")
    private String sectorCode;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_mile")
    private Boolean firstMile;
    
    
    
    
    @JsonProperty("last_mile")
    private Boolean lastMile;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("doorstep_return")
    private Boolean doorstepReturn;
    
    
    
    
    @JsonProperty("doorstep_qc")
    private Boolean doorstepQc;
    
    
    
    
    @JsonProperty("forward_pickup_cutoff")
    private String forwardPickupCutoff;
    
    
    
    
    @JsonProperty("pickup_cutoff")
    private String pickupCutoff;
    
    
    
    
    @JsonProperty("reverse_pickup_cutoff")
    private String reversePickupCutoff;
    
    
    
    
    @JsonProperty("hand_to_hand_exchange")
    private Boolean handToHandExchange;
    
    
    
    
    @JsonProperty("prepaid_limit")
    private Double prepaidLimit;
    
    
    
    
    @JsonProperty("holiday_list")
    private List<String> holidayList;
    
    
    
    
    @JsonProperty("installation")
    private Boolean installation;
    
    
    
}


/*
    Model: RegionTatDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionTatDetails{

    

    
    
    
    
    @JsonProperty("max_delivery_time")
    private Integer maxDeliveryTime;
    
    
    
    
    @JsonProperty("min_delivery_time")
    private Integer minDeliveryTime;
    
    
    
    
    @JsonProperty("from_country_code")
    private String fromCountryCode;
    
    
    
    
    @JsonProperty("from_state_code")
    private String fromStateCode;
    
    
    
    
    @JsonProperty("from_city_code")
    private String fromCityCode;
    
    
    
    
    @JsonProperty("from_sector_code")
    private String fromSectorCode;
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("to_country_code")
    private String toCountryCode;
    
    
    
    
    @JsonProperty("to_state_code")
    private String toStateCode;
    
    
    
    
    @JsonProperty("to_city_code")
    private String toCityCode;
    
    
    
    
    @JsonProperty("to_sector_code")
    private String toSectorCode;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("forward")
    private TATDetails forward;
    
    
    
    
    @JsonProperty("reverse")
    private TATDetails reverse;
    
    
    
}


/*
    Model: RegionTatResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionTatResult{

    

    
    
    
    
    @JsonProperty("min_delivery_time")
    private Integer minDeliveryTime;
    
    
    
    
    @JsonProperty("max_delivery_time")
    private Integer maxDeliveryTime;
    
    
    
    
    @JsonProperty("from_country_code")
    private String fromCountryCode;
    
    
    
    
    @JsonProperty("from_state_code")
    private String fromStateCode;
    
    
    
    
    @JsonProperty("from_city_code")
    private String fromCityCode;
    
    
    
    
    @JsonProperty("from_sector_code")
    private String fromSectorCode;
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("to_country_code")
    private String toCountryCode;
    
    
    
    
    @JsonProperty("to_state_code")
    private String toStateCode;
    
    
    
    
    @JsonProperty("to_city_code")
    private String toCityCode;
    
    
    
    
    @JsonProperty("to_sector_code")
    private String toSectorCode;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("forward")
    private TATDetails forward;
    
    
    
    
    @JsonProperty("reverse")
    private TATDetails reverse;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: BulkRegionJobDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionJobDetails{

    

    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
}


/*
    Model: BulkRegionResultItemData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionResultItemData{

    

    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("failed_records")
    private List<HashMap<String,Object>> failedRecords;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("error_file_path")
    private String errorFilePath;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: BulkRegionResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<BulkRegionResultItemData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CourierAccountDetailsBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccountDetailsBody{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("is_own_account")
    private Boolean isOwnAccount;
    
    
    
}


/*
    Model: CompanyCourierPartnerAccountListResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyCourierPartnerAccountListResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<CourierAccountResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CourierAccountResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccountResult{

    

    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("is_own_account")
    private Boolean isOwnAccount;
    
    
    
    
    @JsonProperty("scheme_rules")
    private CourierPartnerSchemeModel schemeRules;
    
    
    
}


/*
    Model: CourierPartnerSchemeDetailsModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeDetailsModel{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("default_forward_pickup_cutoff")
    private String defaultForwardPickupCutoff;
    
    
    
    
    @JsonProperty("default_reverse_pickup_cutoff")
    private String defaultReversePickupCutoff;
    
    
    
    
    @JsonProperty("default_cutoff_timezone")
    private String defaultCutoffTimezone;
    
    
    
    
    @JsonProperty("default_tat")
    private CourierPartnerSchemeDefaultTat defaultTat;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("volumetric_weight")
    private ArithmeticOperations volumetricWeight;
    
    
    
    
    @JsonProperty("transport_type")
    private String transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("delivery_type")
    private String deliveryType;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("status_updates")
    private String statusUpdates;
    
    
    
    
    @JsonProperty("ndr_attempts")
    private Integer ndrAttempts;
    
    
    
    
    @JsonProperty("qc_shipment_item_quantity")
    private Integer qcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("non_qc_shipment_item_quantity")
    private Integer nonQcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("feature")
    private CourierPartnerSchemeFeatures feature;
    
    
    
}


/*
    Model: CourierPartnerPutSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerPutSchema{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("volumetric_weight")
    private ArithmeticOperations volumetricWeight;
    
    
    
    
    @JsonProperty("transport_type")
    private String transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("delivery_type")
    private String deliveryType;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("status_updates")
    private String statusUpdates;
    
    
    
    
    @JsonProperty("ndr_attempts")
    private Integer ndrAttempts;
    
    
    
    
    @JsonProperty("qc_shipment_item_quantity")
    private Integer qcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("non_qc_shipment_item_quantity")
    private Integer nonQcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("feature")
    private CourierPartnerSchemeFeatures feature;
    
    
    
    
    @JsonProperty("default_forward_pickup_cutoff")
    private String defaultForwardPickupCutoff;
    
    
    
    
    @JsonProperty("default_reverse_pickup_cutoff")
    private String defaultReversePickupCutoff;
    
    
    
    
    @JsonProperty("default_cutoff_timezone")
    private String defaultCutoffTimezone;
    
    
    
    
    @JsonProperty("default_tat")
    private CourierPartnerSchemeDefaultTat defaultTat;
    
    
    
}


/*
    Model: CourierPartnerSchemeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeList{

    

    
    
    
    
    @JsonProperty("items")
    private List<CourierPartnerSchemeModelSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CourierPartnerSchemeUpdateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeUpdateDetails{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("volumetric_weight")
    private ArithmeticOperations volumetricWeight;
    
    
    
    
    @JsonProperty("transport_type")
    private String transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("delivery_type")
    private String deliveryType;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("status_updates")
    private String statusUpdates;
    
    
    
    
    @JsonProperty("ndr_attempts")
    private Integer ndrAttempts;
    
    
    
    
    @JsonProperty("qc_shipment_item_quantity")
    private Integer qcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("non_qc_shipment_item_quantity")
    private Integer nonQcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("feature")
    private CourierPartnerSchemeFeatures feature;
    
    
    
    
    @JsonProperty("default_forward_pickup_cutoff")
    private String defaultForwardPickupCutoff;
    
    
    
    
    @JsonProperty("default_reverse_pickup_cutoff")
    private String defaultReversePickupCutoff;
    
    
    
    
    @JsonProperty("default_cutoff_timezone")
    private String defaultCutoffTimezone;
    
    
    
    
    @JsonProperty("default_tat")
    private CourierPartnerSchemeDefaultTat defaultTat;
    
    
    
}


/*
    Model: GetCountries
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountries{

    

    
    
    
    
    @JsonProperty("items")
    private List<GetCountriesItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: TATUpdateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATUpdateDetails{

    

    
    
    
    
    @JsonProperty("max_delivery_time")
    private Integer maxDeliveryTime;
    
    
    
    
    @JsonProperty("min_delivery_time")
    private Integer minDeliveryTime;
    
    
    
    
    @JsonProperty("forward")
    private TATDetails forward;
    
    
    
    
    @JsonProperty("reverse")
    private TATDetails reverse;
    
    
    
}


/*
    Model: StandardError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StandardError{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ValidationErrors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidationErrors{

    

    
    
    
    
    @JsonProperty("errors")
    private List<ValidationError> errors;
    
    
    
}


/*
    Model: CreatedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedBy{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: ModifiedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ModifiedBy{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: ArithmeticOperations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArithmeticOperations{

    

    
    
    
    
    @JsonProperty("lt")
    private Integer lt;
    
    
    
    
    @JsonProperty("gt")
    private Integer gt;
    
    
    
    
    @JsonProperty("lte")
    private Integer lte;
    
    
    
    
    @JsonProperty("gte")
    private Integer gte;
    
    
    
}


/*
    Model: CourierPartnerSchemeFeatures
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeFeatures{

    

    
    
    
    
    @JsonProperty("doorstep_qc")
    private Boolean doorstepQc;
    
    
    
    
    @JsonProperty("qr")
    private Boolean qr;
    
    
    
    
    @JsonProperty("mps")
    private Boolean mps;
    
    
    
    
    @JsonProperty("ndr")
    private Boolean ndr;
    
    
    
    
    @JsonProperty("ndr_attempts")
    private Integer ndrAttempts;
    
    
    
    
    @JsonProperty("dangerous_goods")
    private Boolean dangerousGoods;
    
    
    
    
    @JsonProperty("fragile_goods")
    private Boolean fragileGoods;
    
    
    
    
    @JsonProperty("restricted_goods")
    private Boolean restrictedGoods;
    
    
    
    
    @JsonProperty("cold_storage_goods")
    private Boolean coldStorageGoods;
    
    
    
    
    @JsonProperty("doorstep_exchange")
    private Boolean doorstepExchange;
    
    
    
    
    @JsonProperty("doorstep_return")
    private Boolean doorstepReturn;
    
    
    
    
    @JsonProperty("product_installation")
    private Boolean productInstallation;
    
    
    
    
    @JsonProperty("openbox_delivery")
    private Boolean openboxDelivery;
    
    
    
    
    @JsonProperty("status_updates")
    private String statusUpdates;
    
    
    
    
    @JsonProperty("multi_pick_single_drop")
    private Boolean multiPickSingleDrop;
    
    
    
    
    @JsonProperty("single_pick_multi_drop")
    private Boolean singlePickMultiDrop;
    
    
    
    
    @JsonProperty("multi_pick_multi_drop")
    private Boolean multiPickMultiDrop;
    
    
    
    
    @JsonProperty("ewaybill")
    private Boolean ewaybill;
    
    
    
    
    @JsonProperty("qc_shipment_item_quantity")
    private Integer qcShipmentItemQuantity;
    
    
    
    
    @JsonProperty("non_qc_shipment_item_quantity")
    private Integer nonQcShipmentItemQuantity;
    
    
    
}


/*
    Model: CourierPartnerSchemeDefaultTat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeDefaultTat{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("tat")
    private CourierPartnerSchemeTat tat;
    
    
    
}


/*
    Model: CourierPartnerSchemeTat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeTat{

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
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

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: TATDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATDetails{

    

    
    
    
    
    @JsonProperty("max_delivery_time")
    private Integer maxDeliveryTime;
    
    
    
    
    @JsonProperty("min_delivery_time")
    private Integer minDeliveryTime;
    
    
    
}


/*
    Model: CourierPartnerSchemeModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeModel{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("volumetric_weight")
    private ArithmeticOperations volumetricWeight;
    
    
    
    
    @JsonProperty("transport_type")
    private String transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("delivery_type")
    private String deliveryType;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("feature")
    private CourierPartnerSchemeFeatures feature;
    
    
    
}


/*
    Model: GetCountriesItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountriesItems{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("timezones")
    private List<String> timezones;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<HierarchyItems> hierarchy;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyObject currency;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("has_next_hierarchy")
    private Boolean hasNextHierarchy;
    
    
    
}


/*
    Model: HierarchyItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HierarchyItems{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: CurrencyObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrencyObject{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
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