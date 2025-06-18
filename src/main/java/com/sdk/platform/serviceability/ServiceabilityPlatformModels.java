

package com.sdk.platform.serviceability;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ServiceabilityPlatformModels{


/*
    Model: BulkRegionServiceabilityTatRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatRequestSchema{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: BulkRegionServiceabilityTatResponseItemData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatResponseItemData{

    

    
    
    
    
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
    private List<Object> failedRecords;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
}


/*
    Model: BulkRegionServiceabilityTatResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionServiceabilityTatResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<BulkRegionServiceabilityTatResponseItemData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CourierPartnerSchemeUpdateRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeUpdateRequestSchema{

    

    
    
    
    
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
    Model: ZoneBulkErrorResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkErrorResponseSchema{

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: ZoneBulkValidationRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkValidationRequestSchema{

    

    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("product_type")
    private String productType;
    
    
    
}


/*
    Model: BulkZoneOverrideResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkZoneOverrideResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: ZoneBulkImportResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkImportResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("product_type")
    private String productType;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private HashMap<String,Object> updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: ZoneOverrideSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneOverrideSchema{

    

    
    
    
    
    @JsonProperty("allow_override")
    private Boolean allowOverride;
    
    
    
}


/*
    Model: BulkZoneOverrideSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkZoneOverrideSchema{

    

    
    
    
    
    @JsonProperty("allow_override")
    private Boolean allowOverride;
    
    
    
    
    @JsonProperty("overridding_correction_file_url")
    private String overriddingCorrectionFileUrl;
    
    
    
}


/*
    Model: ZoneBulkValidationResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkValidationResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: ZoneBulkValidationStatusResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkValidationStatusResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("product_type")
    private String productType;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private HashMap<String,Object> updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: ZoneOverrideResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneOverrideResponseSchema{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("allow_override")
    private Boolean allowOverride;
    
    
    
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


/*
    Model: ZoneOverrideStatusResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneOverrideStatusResponseSchema{

    

    
    
    
    
    @JsonProperty("overriding_process_status")
    private String overridingProcessStatus;
    
    
    
}


/*
    Model: OverrideStatusSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OverrideStatusSchema{

    

    
    
    
    
    @JsonProperty("overriding_process_status")
    private String overridingProcessStatus;
    
    
    
}


/*
    Model: BulkZoneOverrideStatusSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkZoneOverrideStatusSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<OverrideStatusSchema> items;
    
    
    
}


/*
    Model: GetExportPriceZoneHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetExportPriceZoneHistory{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: PriceBulkGeoAreaExportRequestPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceBulkGeoAreaExportRequestPayload{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: GetBulkPriceZoneHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBulkPriceZoneHistory{

    

    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
    
    @JsonProperty("items")
    private List<BulkPriceZoneItem> items;
    
    
    
}


/*
    Model: Pagination
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Pagination{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
}


/*
    Model: BulkPriceZoneItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkPriceZoneItem{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: PriceBulkGeoAreaPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceBulkGeoAreaPayload{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
}


/*
    Model: RuleConditionIntegerDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleConditionIntegerDetail{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("stage")
    private Boolean stage;
    
    
    
}


/*
    Model: RuleConditionStringDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleConditionStringDetail{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("stage")
    private Boolean stage;
    
    
    
}


/*
    Model: RuleResponseIntegerDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleResponseIntegerDetail{

    

    
    
    
    
    @JsonProperty("includes")
    private List<RuleConditionIntegerDetail> includes;
    
    
    
}


/*
    Model: RuleResponseStringDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleResponseStringDetail{

    

    
    
    
    
    @JsonProperty("includes")
    private List<RuleConditionStringDetail> includes;
    
    
    
}


/*
    Model: CourierPartnerRuleResponseDetailConditions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleResponseDetailConditions{

    

    
    
    
    
    @JsonProperty("forward")
    private LocationRule forward;
    
    
    
    
    @JsonProperty("reverse")
    private LocationRule reverse;
    
    
    
    
    @JsonProperty("payment_mode")
    private StringComparisonOperations paymentMode;
    
    
    
    
    @JsonProperty("category_ids")
    private RuleResponseIntegerDetail categoryIds;
    
    
    
    
    @JsonProperty("product_ids")
    private RuleResponseIntegerDetail productIds;
    
    
    
    
    @JsonProperty("product_tags")
    private StringComparisonOperations productTags;
    
    
    
    
    @JsonProperty("zone_ids")
    private RuleResponseStringDetail zoneIds;
    
    
    
    
    @JsonProperty("department_ids")
    private RuleResponseIntegerDetail departmentIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private RuleResponseIntegerDetail brandIds;
    
    
    
    
    @JsonProperty("order_place_date")
    private ArithmeticOperationsV2 orderPlaceDate;
    
    
    
    
    @JsonProperty("store_ids")
    private RuleResponseIntegerDetail storeIds;
    
    
    
    
    @JsonProperty("store_type")
    private StringComparisonOperations storeType;
    
    
    
    
    @JsonProperty("store_tags")
    private StringComparisonOperations storeTags;
    
    
    
    
    @JsonProperty("shipment_weight")
    private ArithmeticOperations shipmentWeight;
    
    
    
    
    @JsonProperty("shipment_cost")
    private ArithmeticOperations shipmentCost;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private ArithmeticOperations shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("company_ids")
    private RuleResponseIntegerDetail companyIds;
    
    
    
    
    @JsonProperty("promise_types")
    private StringComparisonOperations promiseTypes;
    
    
    
}


/*
    Model: CourierPartnerRuleResponseDetailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleResponseDetailSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cp_list")
    private List<CourierPartnerList> cpList;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("conditions")
    private CourierPartnerRuleResponseDetailConditions conditions;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("shipment_adjustment_type")
    private String shipmentAdjustmentType;
    
    
    
}


/*
    Model: StoreLocationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreLocationDetail{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("parent_id")
    private String parentId;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
}


/*
    Model: StoreRuleLocationDetailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleLocationDetailSchema{

    

    
    
    
    
    @JsonProperty("includes")
    private List<StoreLocationDetail> includes;
    
    
    
}


/*
    Model: StoreRuleConditionDetailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleConditionDetailSchema{

    

    
    
    
    
    @JsonProperty("department_ids")
    private RuleResponseIntegerDetail departmentIds;
    
    
    
    
    @JsonProperty("category_ids")
    private RuleResponseIntegerDetail categoryIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private RuleResponseIntegerDetail brandIds;
    
    
    
    
    @JsonProperty("to_location")
    private StoreRuleLocationDetailSchema toLocation;
    
    
    
    
    @JsonProperty("customer_radius")
    private CustomerRadiusSchema customerRadius;
    
    
    
    
    @JsonProperty("store_type")
    private StringComparisonOperations storeType;
    
    
    
    
    @JsonProperty("product_tags")
    private StringComparisonOperations productTags;
    
    
    
    
    @JsonProperty("product_ids")
    private RuleResponseIntegerDetail productIds;
    
    
    
    
    @JsonProperty("store_tags")
    private StringComparisonOperations storeTags;
    
    
    
    
    @JsonProperty("order_place_date")
    private ArithmeticOperationsV2 orderPlaceDate;
    
    
    
    
    @JsonProperty("zone_ids")
    private RuleResponseStringDetail zoneIds;
    
    
    
    
    @JsonProperty("company_ids")
    private RuleResponseIntegerDetail companyIds;
    
    
    
}


/*
    Model: StoreRuleDataDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleDataDetailsSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionDetailSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
}


/*
    Model: OptimalLocationArticlesResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationArticlesResponseSchema{

    

    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("is_primary_item")
    private Boolean isPrimaryItem;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("ignore_locations")
    private List<Integer> ignoreLocations;
    
    
    
    
    @JsonProperty("assign_locations")
    private List<Integer> assignLocations;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("mto_quantity")
    private Integer mtoQuantity;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: OptimalLocationAssignedStoresResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationAssignedStoresResponseSchema{

    

    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("articles")
    private List<OptimalLocationArticlesResponseSchema> articles;
    
    
    
}


/*
    Model: OptimalLocationsResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationsResponseSchema{

    

    
    
    
    
    @JsonProperty("assigned_stores")
    private List<OptimalLocationAssignedStoresResponseSchema> assignedStores;
    
    
    
    
    @JsonProperty("faulty_articles")
    private List<ErrorResponseSchema> faultyArticles;
    
    
    
}


/*
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignment{

    

    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
}


/*
    Model: OptimalLocationsArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationsArticles{

    

    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("is_primary_item")
    private Boolean isPrimaryItem;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    @JsonProperty("ignore_locations")
    private List<Integer> ignoreLocations;
    
    
    
    
    @JsonProperty("assign_locations")
    private List<Integer> assignLocations;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
}


/*
    Model: ServiceabilityLocation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityLocation{

    

    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
}


/*
    Model: LocationDetailsServiceability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDetailsServiceability{

    

    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("location")
    private ServiceabilityLocation location;
    
    
    
}


/*
    Model: OptimlLocationsRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimlLocationsRequestSchema{

    

    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("channel_identifier")
    private String channelIdentifier;
    
    
    
    
    @JsonProperty("to_serviceability")
    private LocationDetailsServiceability toServiceability;
    
    
    
    
    @JsonProperty("articles")
    private List<OptimalLocationsArticles> articles;
    
    
    
}


/*
    Model: ErrorResponseV3
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseV3{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private ErrorObject error;
    
    
    
}


/*
    Model: ErrorObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorObject{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ValidateAddressRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateAddressRequestSchema{

    

    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
}


/*
    Model: CountryObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryObject{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("timezones")
    private List<String> timezones;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<CountryHierarchy> hierarchy;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyObject currency;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    private List<CountryObject> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    Model: CountryHierarchy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryHierarchy{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: GetCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountry{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("timezones")
    private List<String> timezones;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<CountryHierarchy> hierarchy;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyObject currency;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("fields")
    private GetCountryFields fields;
    
    
    
}


/*
    Model: GetCountryFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountryFields{

    

    
    
    
    
    @JsonProperty("address")
    private List<GetCountryFieldsAddress> address;
    
    
    
    
    @JsonProperty("serviceability_fields")
    private List<String> serviceabilityFields;
    
    
    
    
    @JsonProperty("address_template")
    private GetCountryFieldsAddressTemplate addressTemplate;
    
    
    
}


/*
    Model: GetCountryFieldsAddressTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountryFieldsAddressTemplate{

    

    
    
    
    
    @JsonProperty("checkout_form")
    private String checkoutForm;
    
    
    
    
    @JsonProperty("store_os_form")
    private String storeOsForm;
    
    
    
    
    @JsonProperty("default_display")
    private String defaultDisplay;
    
    
    
}


/*
    Model: FieldValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FieldValidation{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("regex")
    private FieldValidationRegex regex;
    
    
    
}


/*
    Model: FieldValidationRegex
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FieldValidationRegex{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("length")
    private LengthValidation length;
    
    
    
}


/*
    Model: LengthValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LengthValidation{

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: GetOneOrAllQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOneOrAllQuery{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
}


/*
    Model: GetOneOrAllPath
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOneOrAllPath{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: GetOneOrAllParams
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOneOrAllParams{

    

    
    
    
    
    @JsonProperty("path")
    private GetOneOrAllPath path;
    
    
    
    
    @JsonProperty("query")
    private GetOneOrAllQuery query;
    
    
    
}


/*
    Model: GetOneOrAll
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOneOrAll{

    

    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    @JsonProperty("params")
    private GetOneOrAllParams params;
    
    
    
}


/*
    Model: GetCountryFieldsAddressValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountryFieldsAddressValues{

    

    
    
    
    
    @JsonProperty("get_one")
    private GetOneOrAll getOne;
    
    
    
    
    @JsonProperty("get_all")
    private GetOneOrAll getAll;
    
    
    
}


/*
    Model: GetCountryFieldsAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountryFieldsAddress{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("edit")
    private Boolean edit;
    
    
    
    
    @JsonProperty("input")
    private String input;
    
    
    
    
    @JsonProperty("validation")
    private FieldValidation validation;
    
    
    
    
    @JsonProperty("values")
    private GetCountryFieldsAddressValues values;
    
    
    
    
    @JsonProperty("error_text")
    private String errorText;
    
    
    
}


/*
    Model: PincodeLatLongData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeLatLongData{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
}


/*
    Model: Localities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Localities{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("lat_long")
    private PincodeLatLongData latLong;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("currency")
    private HashMap<String,Object> currency;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("hierarchy")
    private HashMap<String,Object> hierarchy;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
}


/*
    Model: GetLocalities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocalities{

    

    
    
    
    
    @JsonProperty("items")
    private List<Localities> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: LocalityParent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalityParent{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("serviceability")
    private HashMap<String,Object> serviceability;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("currency")
    private HashMap<String,Object> currency;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("hierarchy")
    private HashMap<String,Object> hierarchy;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
}


/*
    Model: GetLocality
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocality{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
}


/*
    Model: ApplicationConfigPutResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPutResponseSchema{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: PromiseType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseType{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: BuyboxRuleConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyboxRuleConfig{

    

    
    
    
    
    @JsonProperty("store_type_priority")
    private List<String> storeTypePriority;
    
    
    
    
    @JsonProperty("store_tag_priority")
    private List<String> storeTagPriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
}


/*
    Model: CourierPartnerConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerConfig{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
}


/*
    Model: ZoneConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneConfig{

    

    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("active_count")
    private Integer activeCount;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
}


/*
    Model: ApplicationConfigGetResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigGetResponseSchema{

    

    
    
    
    
    @JsonProperty("zones")
    private ZoneConfig zones;
    
    
    
    
    @JsonProperty("courier_partner_config")
    private CourierPartnerConfig courierPartnerConfig;
    
    
    
    
    @JsonProperty("buybox_rule_config")
    private BuyboxRuleConfig buyboxRuleConfig;
    
    
    
    
    @JsonProperty("promise_config")
    private PromiseConfig promiseConfig;
    
    
    
    
    @JsonProperty("promise_types")
    private List<PromiseType> promiseTypes;
    
    
    
}


/*
    Model: ApplicationConfigPutRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPutRequestSchema{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
}


/*
    Model: InstallCourierPartnerItemsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InstallCourierPartnerItemsSchema{

    

    
    
    
    
    @JsonProperty("base_url")
    private String baseUrl;
    
    
    
    
    @JsonProperty("callbacks")
    private HashMap<String,Object> callbacks;
    
    
    
    
    @JsonProperty("contact_email")
    private String contactEmail;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("developed_by_name")
    private String developedByName;
    
    
    
    
    @JsonProperty("ext_version")
    private String extVersion;
    
    
    
    
    @JsonProperty("extention_type")
    private String extentionType;
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    
    
    
    
    @JsonProperty("is_installed")
    private Boolean isInstalled;
    
    
    
    
    @JsonProperty("launch_type")
    private String launchType;
    
    
    
    
    @JsonProperty("logo")
    private HashMap<String,Object> logo;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("partner")
    private HashMap<String,Object> partner;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("whitelisted_urls")
    private List<String> whitelistedUrls;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: InstallCourierPartnerResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InstallCourierPartnerResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<InstallCourierPartnerItemsSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ServiceabilityErrorResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityErrorResponseSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ApplicationServiceabilityConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationServiceabilityConfig{

    

    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
}


/*
    Model: EntityRegionView_Error
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityRegionView_Error{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: EntityRegionView_page
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityRegionView_page{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
}


/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSchema{

    

    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: EntityRegionView_Items
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityRegionView_Items{

    

    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ListViewSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewSummary{

    

    
    
    
    
    @JsonProperty("total_zones")
    private Integer totalZones;
    
    
    
    
    @JsonProperty("total_pincodes_served")
    private Integer totalPincodesServed;
    
    
    
    
    @JsonProperty("total_active_zones")
    private Integer totalActiveZones;
    
    
    
}


/*
    Model: ProductSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
}


/*
    Model: ProductDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailsSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<DetailsSchema> values;
    
    
    
}


/*
    Model: StoresSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoresSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
}


/*
    Model: StoresDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoresDetailsSchema{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<StoreValueDetailsSchema> values;
    
    
    
}


/*
    Model: DetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DetailsSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: StoreValueDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreValueDetailsSchema{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
}


/*
    Model: SummarySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SummarySchema{

    

    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
    
    @JsonProperty("products_count")
    private Integer productsCount;
    
    
    
    
    @JsonProperty("regions")
    private List<RegionSchema> regions;
    
    
    
}


/*
    Model: RegionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ServiceabilityDeleteErrorResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityDeleteErrorResponseSchema{

    

    
    
    
    
    @JsonProperty("error")
    private List<ServiceabilityErrorResponseSchema> error;
    
    
    
}


/*
    Model: ListViewResponseV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewResponseV2{

    

    
    
    
    
    @JsonProperty("items")
    private List<ListViewItemsV2> items;
    
    
    
    
    @JsonProperty("page")
    private ZoneDataItem page;
    
    
    
}


/*
    Model: ListViewItemsV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewItemsV2{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<GeoArea> geoAreas;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("stores")
    private ListViewProductV2 stores;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("is_public_opted")
    private Boolean isPublicOpted;
    
    
    
    
    @JsonProperty("product")
    private ListViewProductV2 product;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("summary")
    private Summary summary;
    
    
    
}


/*
    Model: SummaryRegions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SummaryRegions{

    

    
    
    
    
    @JsonProperty("regions")
    private List<RegionSchema> regions;
    
    
    
}


/*
    Model: Summary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Summary{

    

    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
    
    @JsonProperty("products_count")
    private Integer productsCount;
    
    
    
    
    @JsonProperty("regions")
    private List<RegionSchema> regions;
    
    
    
}


/*
    Model: GeoArea
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoArea{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ListViewProductV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewProductV2{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
}


/*
    Model: ZoneDataItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneDataItem{

    

    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ListViewProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewProduct{

    

    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ListViewChannels
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewChannels{

    

    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
}


/*
    Model: ListViewItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewItems{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("regions_count")
    private Integer regionsCount;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("channels")
    private List<ListViewChannels> channels;
    
    
    
}


/*
    Model: CompanyStoreView_PageItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyStoreView_PageItems{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
}


/*
    Model: GetZoneDataViewChannels
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneDataViewChannels{

    

    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
}


/*
    Model: ZoneProductTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneProductTypes{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: ZoneMappingType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneMappingType{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private List<String> pincode;
    
    
    
    
    @JsonProperty("state")
    private List<String> state;
    
    
    
}


/*
    Model: UpdateZoneDataV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateZoneDataV2{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
}


/*
    Model: ZoneUpdateSuccessResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneUpdateSuccessResponseSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("summary")
    private Summary summary;
    
    
    
}


/*
    Model: ZoneDeleteSuccessResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneDeleteSuccessResponseSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: UpdateZoneData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateZoneData{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("channels")
    private List<GetZoneDataViewChannels> channels;
    
    
    
    
    @JsonProperty("product")
    private ZoneProductTypes product;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("mapping")
    private List<ZoneMappingType> mapping;
    
    
    
    
    @JsonProperty("assignment_preference")
    private String assignmentPreference;
    
    
    
}


/*
    Model: GetZoneDataViewItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneDataViewItems{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("channels")
    private List<GetZoneDataViewChannels> channels;
    
    
    
    
    @JsonProperty("product")
    private ZoneProductTypes product;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("mapping")
    private List<ZoneMappingType> mapping;
    
    
    
    
    @JsonProperty("assignment_preference")
    private String assignmentPreference;
    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
}


/*
    Model: GetZoneByIdSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneByIdSchema{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("overlapping_file_url")
    private String overlappingFileUrl;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("overlapping_zone_names")
    private List<String> overlappingZoneNames;
    
    
    
}


/*
    Model: GetZoneByIdDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneByIdDetailsSchema{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("product")
    private ProductDetailsSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresDetailsSchema stores;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("overlapping_file_url")
    private String overlappingFileUrl;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<GeoAreaDetailsSchema> geoAreas;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("overlapping_zone_names")
    private List<String> overlappingZoneNames;
    
    
    
}


/*
    Model: GeoAreaDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaDetailsSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CreateZoneV2Data
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateZoneV2Data{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("stores")
    private ZoneStores stores;
    
    
    
    
    @JsonProperty("product")
    private ZoneProduct product;
    
    
    
}


/*
    Model: ZoneBulkExport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkExport{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: GetZoneBulkExport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneBulkExport{

    

    
    
    
    
    @JsonProperty("items")
    private List<ZoneBulkItem> items;
    
    
    
}


/*
    Model: ZoneBulkItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneBulkItem{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: CreateBulkZoneData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateBulkZoneData{

    

    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("product_type")
    private String productType;
    
    
    
}


/*
    Model: ZoneStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneStores{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
}


/*
    Model: ZoneProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneProduct{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
}


/*
    Model: ZoneResponseV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneResponseV2{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("access_level")
    private String accessLevel;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_public_opted")
    private Boolean isPublicOpted;
    
    
    
    
    @JsonProperty("is_opted")
    private Boolean isOpted;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("stores")
    private ListViewProductV2 stores;
    
    
    
    
    @JsonProperty("product")
    private ListViewProductV2 product;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("summary")
    private SummaryRegions summary;
    
    
    
}


/*
    Model: CreateBulkZoneResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateBulkZoneResponseSchema{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
}


/*
    Model: GetBulkZoneHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBulkZoneHistory{

    

    
    
    
    
    @JsonProperty("items")
    private List<BulkZoneItems> items;
    
    
    
    
    @JsonProperty("page")
    private PageV2 page;
    
    
    
}


/*
    Model: BulkZoneItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkZoneItems{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: PageV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageV2{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("current")
    private Double current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Double itemTotal;
    
    
    
}


/*
    Model: BulkCreateZoneExport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkCreateZoneExport{

    

    
    
    
    
    @JsonProperty("placeholder")
    private String placeholder;
    
    
    
}


/*
    Model: Zone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Zone{

    

    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("assignment_preference")
    private String assignmentPreference;
    
    
    
}


/*
    Model: MobileNo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileNo{

    

    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
}


/*
    Model: OpeningClosing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpeningClosing{

    

    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
}


/*
    Model: Dp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dp{

    

    
    
    
    
    @JsonProperty("fm_priority")
    private Integer fmPriority;
    
    
    
    
    @JsonProperty("rvp_priority")
    private Integer rvpPriority;
    
    
    
    
    @JsonProperty("lm_priority")
    private Integer lmPriority;
    
    
    
    
    @JsonProperty("internal_account_id")
    private String internalAccountId;
    
    
    
    
    @JsonProperty("area_code")
    private Integer areaCode;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("operations")
    private List<String> operations;
    
    
    
    
    @JsonProperty("external_account_id")
    private String externalAccountId;
    
    
    
    
    @JsonProperty("transport_mode")
    private String transportMode;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
}


/*
    Model: ServiceabilityZoneErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityZoneErrorResult{

    

    
    
    
    
    @JsonProperty("error")
    private List<ServiceabilityErrorResponseSchema> error;
    
    
    
}


/*
    Model: ServiceabilityZoneNonMarketplaceErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityZoneNonMarketplaceErrorResult{

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: PincodeMopData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopData{

    

    
    
    
    
    @JsonProperty("pincodes")
    private List<Integer> pincodes;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
}


/*
    Model: PincodeMopUpdateResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateResponseSchema{

    

    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: PincodeMOPresponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMOPresponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("pincodes")
    private List<Integer> pincodes;
    
    
    
    
    @JsonProperty("updated_pincodes")
    private List<PincodeMopUpdateResponseSchema> updatedPincodes;
    
    
    
}


/*
    Model: CommonError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonError{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponseSchema> error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: MoPCommonError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MoPCommonError{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponseSchema> error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PincodeMopBulkData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopBulkData{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("s3_url")
    private String s3Url;
    
    
    
}


/*
    Model: PincodeBulkViewResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeBulkViewResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("s3_url")
    private String s3Url;
    
    
    
}


/*
    Model: PincodeCodStatusListingRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingRequestSchema{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: PincodeCodDataSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodDataSchema{

    

    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
}


/*
    Model: PincodeCodStatusListingResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingResponseSchema{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeCodDataSchema> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("errors")
    private List<Error> errors;
    
    
    
    
    @JsonProperty("page")
    private PincodeCodStatusListingPage page;
    
    
    
    
    @JsonProperty("summary")
    private PincodeCodStatusListingSummary summary;
    
    
    
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
    Model: PincodeCodStatusListingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingPage{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
}


/*
    Model: PincodeCodStatusListingSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingSummary{

    

    
    
    
    
    @JsonProperty("total_active_pincodes")
    private Integer totalActivePincodes;
    
    
    
    
    @JsonProperty("total_inactive_pincodes")
    private Integer totalInactivePincodes;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryRequestSchema{

    

    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryPaging
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryPaging{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("error_file_s3_url")
    private String errorFileS3Url;
    
    
    
    
    @JsonProperty("s3_url")
    private String s3Url;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryResponseData{

    

    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("page")
    private PincodeMopUpdateAuditHistoryPaging page;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeMopUpdateAuditHistoryResponseSchema> data;
    
    
    
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
    Model: SchemeRulesFeatures
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemeRulesFeatures{

    

    
    
    
    
    @JsonProperty("quality_check")
    private Boolean qualityCheck;
    
    
    
    
    @JsonProperty("quick_response_code")
    private Boolean quickResponseCode;
    
    
    
    
    @JsonProperty("e_waybill")
    private Boolean eWaybill;
    
    
    
    
    @JsonProperty("multi_part_shipments")
    private Boolean multiPartShipments;
    
    
    
    
    @JsonProperty("flammable")
    private Boolean flammable;
    
    
    
    
    @JsonProperty("hazmat")
    private Boolean hazmat;
    
    
    
    
    @JsonProperty("battery_operated")
    private Boolean batteryOperated;
    
    
    
}


/*
    Model: SchemeRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SchemeRules{

    

    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
    @JsonProperty("transport_type")
    private List<String> transportType;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("payment_mode")
    private List<String> paymentMode;
    
    
    
    
    @JsonProperty("feature")
    private SchemeRulesFeatures feature;
    
    
    
}


/*
    Model: CourierAccount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccount{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("scheme_rules")
    private HashMap<String,Object> schemeRules;
    
    
    
}


/*
    Model: BulkGeoAreaDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkGeoAreaDetails{

    

    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: BulkGeoAreaResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkGeoAreaResult{

    

    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
}


/*
    Model: PriceGeoAreaExportResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceGeoAreaExportResult{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: BulkGeoAreaGetResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkGeoAreaGetResponseSchema{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
}


/*
    Model: GeoAreaBulkCreationResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaBulkCreationResult{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: GeoAreaBulkExportResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaBulkExportResult{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: GeoAreaRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaRequestBody{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("areas")
    private List<Area> areas;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
}


/*
    Model: GeoAreaErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaErrorResult{

    

    
    
    
    
    @JsonProperty("error")
    private List<GeoAreaResponseDetail> error;
    
    
    
}


/*
    Model: ErrorResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseItem{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error_name")
    private String errorName;
    
    
    
    
    @JsonProperty("error_code")
    private Integer errorCode;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("conflicting_areas")
    private List<ConflictingArea> conflictingAreas;
    
    
    
}


/*
    Model: ConflictingArea
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConflictingArea{

    

    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: GeoAreaResponseDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaResponseDetail{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ErrorResponseDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseDetail{

    

    
    
    
    
    @JsonProperty("items")
    private List<ErrorResponseItem> items;
    
    
    
}


/*
    Model: GeoAreaResponseBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaResponseBody{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("areas")
    private List<Area> areas;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
}


/*
    Model: GeoAreaPutResponseBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaPutResponseBody{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("areas")
    private List<Area> areas;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("upload_type")
    private String uploadType;
    
    
    
}


/*
    Model: Area
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Area{

    

    
    
    
    
    @JsonProperty("regions")
    private List<String> regions;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
}


/*
    Model: Region
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Region{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
}


/*
    Model: RegionV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegionV2{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
}


/*
    Model: Country
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Country{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: AreaExpanded
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AreaExpanded{

    

    
    
    
    
    @JsonProperty("country")
    private Country country;
    
    
    
    
    @JsonProperty("regions")
    private List<Region> regions;
    
    
    
}


/*
    Model: AreaExpandedV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AreaExpandedV2{

    

    
    
    
    
    @JsonProperty("country")
    private Country country;
    
    
    
    
    @JsonProperty("regions")
    private List<RegionV2> regions;
    
    
    
}


/*
    Model: GeoAreaResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaResponseSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("areas")
    private List<AreaExpanded> areas;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
}


/*
    Model: GeoAreaGetResponseBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaGetResponseBody{

    

    
    
    
    
    @JsonProperty("items")
    private List<GeoAreaItemResponseSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page2 page;
    
    
    
}


/*
    Model: GeoAreaItemResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaItemResponseSchema{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("geoarea_id")
    private String geoareaId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("region_type")
    private String regionType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("areas")
    private List<AreaExpandedV2> areas;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
}


/*
    Model: ErrorResponseV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseV2{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: ErrorResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseSchema{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: PackageMaterialNotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialNotFound{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PackageMaterialsErrorResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialsErrorResponseSchema{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: CourierPartnerAccountFailureResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerAccountFailureResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponseSchema> error;
    
    
    
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
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
}


/*
    Model: Page2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page2{

    

    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: CourierPartnerList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerList{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("scheme_rules")
    private HashMap<String,Object> schemeRules;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: LocationRuleValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationRuleValues{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
}


/*
    Model: LocationRuleValuesV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationRuleValuesV2{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
}


/*
    Model: LocationRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationRule{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("includes")
    private List<LocationRuleValues> includes;
    
    
    
}


/*
    Model: LocationRuleV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationRuleV2{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("includes")
    private List<LocationRuleValuesV2> includes;
    
    
    
}


/*
    Model: StringComparisonOperations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StringComparisonOperations{

    

    
    
    
    
    @JsonProperty("includes")
    private List<String> includes;
    
    
    
}


/*
    Model: IntComparisonOperations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntComparisonOperations{

    

    
    
    
    
    @JsonProperty("includes")
    private List<Integer> includes;
    
    
    
}


/*
    Model: CourierPartnerRuleConditions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleConditions{

    

    
    
    
    
    @JsonProperty("forward")
    private LocationRule forward;
    
    
    
    
    @JsonProperty("reverse")
    private LocationRule reverse;
    
    
    
    
    @JsonProperty("payment_mode")
    private StringComparisonOperations paymentMode;
    
    
    
    
    @JsonProperty("category_ids")
    private IntComparisonOperations categoryIds;
    
    
    
    
    @JsonProperty("product_ids")
    private IntComparisonOperations productIds;
    
    
    
    
    @JsonProperty("product_tags")
    private StringComparisonOperations productTags;
    
    
    
    
    @JsonProperty("zone_ids")
    private StringComparisonOperations zoneIds;
    
    
    
    
    @JsonProperty("department_ids")
    private IntComparisonOperations departmentIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private IntComparisonOperations brandIds;
    
    
    
    
    @JsonProperty("order_place_date")
    private ArithmeticOperationsV2 orderPlaceDate;
    
    
    
    
    @JsonProperty("store_ids")
    private IntComparisonOperations storeIds;
    
    
    
    
    @JsonProperty("store_type")
    private StringComparisonOperations storeType;
    
    
    
    
    @JsonProperty("store_tags")
    private StringComparisonOperations storeTags;
    
    
    
    
    @JsonProperty("shipment_weight")
    private ArithmeticOperations shipmentWeight;
    
    
    
    
    @JsonProperty("shipment_cost")
    private ArithmeticOperations shipmentCost;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private ArithmeticOperations shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("company_ids")
    private IntComparisonOperations companyIds;
    
    
    
    
    @JsonProperty("promise_types")
    private StringComparisonOperations promiseTypes;
    
    
    
}


/*
    Model: CourierPartnerRuleResponseConditions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleResponseConditions{

    

    
    
    
    
    @JsonProperty("forward")
    private LocationRule forward;
    
    
    
    
    @JsonProperty("reverse")
    private LocationRule reverse;
    
    
    
    
    @JsonProperty("payment_mode")
    private StringComparisonOperations paymentMode;
    
    
    
    
    @JsonProperty("category_ids")
    private IntComparisonOperations categoryIds;
    
    
    
    
    @JsonProperty("product_ids")
    private IntComparisonOperations productIds;
    
    
    
    
    @JsonProperty("product_tags")
    private StringComparisonOperations productTags;
    
    
    
    
    @JsonProperty("zone_ids")
    private StringComparisonOperations zoneIds;
    
    
    
    
    @JsonProperty("department_ids")
    private IntComparisonOperations departmentIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private IntComparisonOperations brandIds;
    
    
    
    
    @JsonProperty("order_place_date")
    private ArithmeticOperationsV2 orderPlaceDate;
    
    
    
    
    @JsonProperty("store_ids")
    private IntComparisonOperations storeIds;
    
    
    
    
    @JsonProperty("store_type")
    private StringComparisonOperations storeType;
    
    
    
    
    @JsonProperty("store_tags")
    private StringComparisonOperations storeTags;
    
    
    
    
    @JsonProperty("shipment_weight")
    private ArithmeticOperations shipmentWeight;
    
    
    
    
    @JsonProperty("shipment_cost")
    private ArithmeticOperations shipmentCost;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private ArithmeticOperations shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("company_ids")
    private IntComparisonOperations companyIds;
    
    
    
    
    @JsonProperty("promise_types")
    private StringComparisonOperations promiseTypes;
    
    
    
}


/*
    Model: CourierPartnerRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRule{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cp_list")
    private List<CourierPartnerList> cpList;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("conditions")
    private CourierPartnerRuleConditions conditions;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("shipment_adjustment_type")
    private String shipmentAdjustmentType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CourierPartnerRuleResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleResponseSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cp_list")
    private List<CourierPartnerList> cpList;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("conditions")
    private CourierPartnerRuleResponseConditions conditions;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("shipment_adjustment_type")
    private String shipmentAdjustmentType;
    
    
    
}


/*
    Model: FailureResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FailureResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponseSchema> error;
    
    
    
}


/*
    Model: CourierPartnerRulesListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRulesListResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<CourierPartnerRuleResponseSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CompanyConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyConfig{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("logistics_as_actual")
    private String logisticsAsActual;
    
    
    
}


/*
    Model: StorePromiseAttributeConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePromiseAttributeConfig{

    

    
    
    
    
    @JsonProperty("is_operational_timing_enabled")
    private Boolean isOperationalTimingEnabled;
    
    
    
    
    @JsonProperty("is_order_acceptance_timing_enabled")
    private Boolean isOrderAcceptanceTimingEnabled;
    
    
    
    
    @JsonProperty("is_average_processing_time")
    private Boolean isAverageProcessingTime;
    
    
    
    
    @JsonProperty("is_holiday_enabled")
    private Boolean isHolidayEnabled;
    
    
    
}


/*
    Model: DeliveryServiceAttributeConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryServiceAttributeConfig{

    

    
    
    
    
    @JsonProperty("is_pickup_cutoff_time_enabled")
    private Boolean isPickupCutoffTimeEnabled;
    
    
    
    
    @JsonProperty("is_service_tat_enabled")
    private Boolean isServiceTatEnabled;
    
    
    
    
    @JsonProperty("is_holiday_enabled")
    private Boolean isHolidayEnabled;
    
    
    
}


/*
    Model: BufferField
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BufferField{

    

    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: PromiseConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseConfig{

    

    
    
    
    
    @JsonProperty("store_attributes")
    private StorePromiseAttributeConfig storeAttributes;
    
    
    
    
    @JsonProperty("delivery_service_attributes")
    private DeliveryServiceAttributeConfig deliveryServiceAttributes;
    
    
    
    
    @JsonProperty("buffer_field")
    private BufferField bufferField;
    
    
    
}


/*
    Model: ApplicationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfig{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("zones")
    private ZoneConfig zones;
    
    
    
    
    @JsonProperty("buybox_rule_config")
    private BuyboxRuleConfig buyboxRuleConfig;
    
    
    
    
    @JsonProperty("promise_types")
    private List<PromiseType> promiseTypes;
    
    
    
    
    @JsonProperty("promise_config")
    private PromiseConfig promiseConfig;
    
    
    
}


/*
    Model: ApplicationConfigPatchRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPatchRequestSchema{

    

    
    
    
    
    @JsonProperty("courier_partner_config")
    private CourierPartnerConfig courierPartnerConfig;
    
    
    
    
    @JsonProperty("buybox_rule_config")
    private BuyboxRuleConfig buyboxRuleConfig;
    
    
    
    
    @JsonProperty("promise_config")
    private PromiseConfig promiseConfig;
    
    
    
}


/*
    Model: ApplicationConfigPatchResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPatchResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BulkRegionJobSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionJobSchema{

    

    
    
    
    
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
    Model: BulkRegionResponseItemData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionResponseItemData{

    

    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
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
    
    
    
}


/*
    Model: BulkRegionResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<BulkRegionResponseItemData> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: SelfShipResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelfShipResponseSchema{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tat")
    private Double tat;
    
    
    
}


/*
    Model: ApplicationSelfShipConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationSelfShipConfig{

    

    
    
    
    
    @JsonProperty("self_ship")
    private HashMap<String,Object> selfShip;
    
    
    
}


/*
    Model: StoreRuleConfigData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleConfigData{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
}


/*
    Model: CustomerRadiusSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerRadiusSchema{

    

    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("lt")
    private Integer lt;
    
    
    
    
    @JsonProperty("lte")
    private Integer lte;
    
    
    
    
    @JsonProperty("gt")
    private Integer gt;
    
    
    
    
    @JsonProperty("gte")
    private Integer gte;
    
    
    
}


/*
    Model: StoreRuleConditionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleConditionSchema{

    

    
    
    
    
    @JsonProperty("department_ids")
    private IntComparisonOperations departmentIds;
    
    
    
    
    @JsonProperty("category_ids")
    private IntComparisonOperations categoryIds;
    
    
    
    
    @JsonProperty("brand_ids")
    private IntComparisonOperations brandIds;
    
    
    
    
    @JsonProperty("to_location")
    private LocationRuleV2 toLocation;
    
    
    
    
    @JsonProperty("customer_radius")
    private CustomerRadiusSchema customerRadius;
    
    
    
    
    @JsonProperty("store_type")
    private StringComparisonOperations storeType;
    
    
    
    
    @JsonProperty("product_tags")
    private StringComparisonOperations productTags;
    
    
    
    
    @JsonProperty("product_ids")
    private IntComparisonOperations productIds;
    
    
    
    
    @JsonProperty("store_tags")
    private StringComparisonOperations storeTags;
    
    
    
    
    @JsonProperty("order_place_date")
    private ArithmeticOperationsV2 orderPlaceDate;
    
    
    
    
    @JsonProperty("zone_ids")
    private StringComparisonOperations zoneIds;
    
    
    
}


/*
    Model: StoreRuleDataSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleDataSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: StorePrioritySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePrioritySchema{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: GetStoreRulesApiResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetStoreRulesApiResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<StoreRuleDataSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CreateStoreRuleRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateStoreRuleRequestSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
}


/*
    Model: StoreRuleResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleResponseSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: StoreRuleUpdateResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleUpdateResponseSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("type_based_priority")
    private List<String> typeBasedPriority;
    
    
    
    
    @JsonProperty("tag_based_priority")
    private List<String> tagBasedPriority;
    
    
    
    
    @JsonProperty("store_priority")
    private List<StorePrioritySchema> storePriority;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
}


/*
    Model: ServiceabilityModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityModel{

    

    
    
    
    
    @JsonProperty("lm_cod_limit")
    private Integer lmCodLimit;
    
    
    
    
    @JsonProperty("is_qc")
    private Boolean isQc;
    
    
    
    
    @JsonProperty("pickup_cutoff")
    private String pickupCutoff;
    
    
    
    
    @JsonProperty("route_code")
    private String routeCode;
    
    
    
    
    @JsonProperty("is_first_mile")
    private Boolean isFirstMile;
    
    
    
    
    @JsonProperty("is_return")
    private Boolean isReturn;
    
    
    
    
    @JsonProperty("is_installation")
    private Boolean isInstallation;
    
    
    
    
    @JsonProperty("is_last_mile")
    private Boolean isLastMile;
    
    
    
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
    
    
    
}


/*
    Model: CourierAccountSchemeResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccountSchemeResponseSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperations weight;
    
    
    
    
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
    Model: CourierAccountResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccountResponseSchema{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("scheme_rules")
    private CourierAccountSchemeResponseSchema schemeRules;
    
    
    
}


/*
    Model: CompanyCourierPartnerAccountListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyCourierPartnerAccountListResponseSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<CourierAccountResponseSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PackageMaterial
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterial{

    

    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("item_id")
    private Double itemId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("weight")
    private Double weight;
    
    
    
    
    @JsonProperty("auto_calculate")
    private Boolean autoCalculate;
    
    
    
    
    @JsonProperty("max_weight")
    private Double maxWeight;
    
    
    
    
    @JsonProperty("package_vol_weight")
    private Double packageVolWeight;
    
    
    
    
    @JsonProperty("error_rate")
    private Double errorRate;
    
    
    
    
    @JsonProperty("channels")
    private List<Channel> channels;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("rules")
    private List<PackageMaterialRule> rules;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("mp_stores")
    private List<PackageMpStores> mpStores;
    
    
    
    
    @JsonProperty("media")
    private List<String> media;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: CourierPartnerRuleDeleteResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleDeleteResponseSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: StoreRuleDeleteResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleDeleteResponseSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PackageMaterialDeleteResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialDeleteResponseSchema{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PackageMaterialResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialResponseSchema{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("rules")
    private List<PackageMaterialRule> rules;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("weight")
    private Double weight;
    
    
    
    
    @JsonProperty("error_rate")
    private Double errorRate;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("media")
    private List<String> media;
    
    
    
    
    @JsonProperty("channels")
    private List<Channel> channels;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("max_weight")
    private Double maxWeight;
    
    
    
    
    @JsonProperty("package_vol_weight")
    private Double packageVolWeight;
    
    
    
    
    @JsonProperty("auto_calculate")
    private Boolean autoCalculate;
    
    
    
    
    @JsonProperty("mp_stores")
    private List<PackageMpStores> mpStores;
    
    
    
}


/*
    Model: PackageMaterialRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialRule{

    

    
    
    
    
    @JsonProperty("rule_id")
    private String ruleId;
    
    
    
    
    @JsonProperty("quantity")
    private PackageMaterialRuleQuantity quantity;
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: PackageMpStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMpStores{

    

    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("store_data")
    private Object storeData;
    
    
    
}


/*
    Model: PackageRuleRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleRequestSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("category_id")
    private PackageRuleCategory categoryId;
    
    
    
    
    @JsonProperty("product_id")
    private PackageRuleProduct productId;
    
    
    
    
    @JsonProperty("product_tag")
    private PackageRuleProductTag productTag;
    
    
    
    
    @JsonProperty("department_id")
    private PackageRuleDepartmentId departmentId;
    
    
    
    
    @JsonProperty("product_attributes")
    private PackageRuleProductAttributes productAttributes;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: PackageRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRule{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("rules")
    private List<PackageMaterialRule> rules;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("weight")
    private Double weight;
    
    
    
    
    @JsonProperty("error_rate")
    private Double errorRate;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("media")
    private List<String> media;
    
    
    
    
    @JsonProperty("channels")
    private List<Channel> channels;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("max_weight")
    private Double maxWeight;
    
    
    
    
    @JsonProperty("package_vol_weight")
    private Double packageVolWeight;
    
    
    
    
    @JsonProperty("auto_calculate")
    private Boolean autoCalculate;
    
    
    
    
    @JsonProperty("mp_stores")
    private List<PackageMpStores> mpStores;
    
    
    
}


/*
    Model: PackageRuleResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleResult{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("product_id")
    private PackageRuleProduct productId;
    
    
    
    
    @JsonProperty("category_id")
    private PackageRuleCategory categoryId;
    
    
    
    
    @JsonProperty("department_id")
    private PackageRuleDepartmentId departmentId;
    
    
    
    
    @JsonProperty("product_tag")
    private PackageRuleProductTag productTag;
    
    
    
    
    @JsonProperty("product_attributes")
    private PackageRuleProductAttributes productAttributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: Channel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Channel{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: PackageMaterialRuleList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialRuleList{

    

    
    
    
    
    @JsonProperty("items")
    private List<PackageRuleResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PackageMaterialList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialList{

    

    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PackageRuleProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleProduct{

    

    
    
    
    
    @JsonProperty("includes")
    private List<Integer> includes;
    
    
    
}


/*
    Model: PackageRuleProductTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleProductTag{

    

    
    
    
    
    @JsonProperty("includes")
    private List<String> includes;
    
    
    
}


/*
    Model: PackageRuleCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleCategory{

    

    
    
    
    
    @JsonProperty("includes")
    private List<Integer> includes;
    
    
    
}


/*
    Model: PackageRuleProductAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleProductAttributes{

    

    
    
    
    
    @JsonProperty("includes")
    private List<HashMap<String,Object>> includes;
    
    
    
}


/*
    Model: PackageRuleDepartmentId
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleDepartmentId{

    

    
    
    
    
    @JsonProperty("includes")
    private List<Integer> includes;
    
    
    
}


/*
    Model: PackageMaterialRuleQuantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialRuleQuantity{

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: RulePriorityRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RulePriorityRequestSchema{

    

    
    
    
    
    @JsonProperty("rule_id")
    private String ruleId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: RulePriorityResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RulePriorityResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CompanySelfShip
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanySelfShip{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tat")
    private Double tat;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ArithmeticOperationsV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArithmeticOperationsV2{

    

    
    
    
    
    @JsonProperty("lt")
    private String lt;
    
    
    
    
    @JsonProperty("gt")
    private String gt;
    
    
    
    
    @JsonProperty("lte")
    private String lte;
    
    
    
    
    @JsonProperty("gte")
    private String gte;
    
    
    
}


/*
    Model: CompanyConfigurationShema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyConfigurationShema{

    

    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
}




}