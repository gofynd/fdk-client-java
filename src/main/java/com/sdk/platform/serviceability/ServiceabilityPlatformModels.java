

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
    Model: FulfillmentOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOption{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("business_unit")
    private List<BusinessUnit> businessUnit;
    
    
    
    
    @JsonProperty("fulfillment_stores")
    private FulfillmentStores fulfillmentStores;
    
    
    
    
    @JsonProperty("products")
    private FulfillmentProducts products;
    
    
    
    
    @JsonProperty("cp_schemes")
    private CourierPartnerSchemes cpSchemes;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: FulfillmentOptionProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionProducts{

    

    
    
    
    
    @JsonProperty("items")
    private FulfillmentOptionProduct items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: FulfillmentOptionStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionStores{

    

    
    
    
    
    @JsonProperty("items")
    private List<FulfillmentOptionStore> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: FulfillmentOptionBulkValidate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionBulkValidate{

    

    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("fulfillment_option_slug")
    private String fulfillmentOptionSlug;
    
    
    
    
    @JsonProperty("request")
    private FulfillmentOptionValidate request;
    
    
    
}


/*
    Model: FulfillmentOptionBulkValidateData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionBulkValidateData{

    

    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: FulfillmentOptionBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionBulk{

    

    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: FulfillmentOptionBulkData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionBulkData{

    

    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("request")
    private FulfillmentOptionValidate request;
    
    
    
    
    @JsonProperty("fulfillment_option_slug")
    private String fulfillmentOptionSlug;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
}


/*
    Model: OperationResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OperationResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SelfshipSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelfshipSchema{

    

    
    
    
    
    @JsonProperty("tat")
    private Integer tat;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ServiceabilityErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityErrorResult{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
}


/*
    Model: ZoneUpdateSuccessResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneUpdateSuccessResult{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
}


/*
    Model: ServiceabilityDeleteErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityDeleteErrorResult{

    

    
    
    
    
    @JsonProperty("error")
    private List<ServiceabilityErrorResult> error;
    
    
    
}


/*
    Model: ZoneDeleteSuccessResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneDeleteSuccessResult{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ListViewSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewSchema{

    

    
    
    
    
    @JsonProperty("items")
    private List<ListViewItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    
    
    
    
    @JsonProperty("product")
    private ProductSchema product;
    
    
    
    
    @JsonProperty("stores")
    private StoresSchema stores;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("overlapping_file_url")
    private String overlappingFileUrl;
    
    
    
    
    @JsonProperty("geo_areas")
    private List<String> geoAreas;
    
    
    
    
    @JsonProperty("overlapping_zone_names")
    private List<String> overlappingZoneNames;
    
    
    
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
    Model: CreateZoneDataSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateZoneDataSchema{

    

    
    
    
    
    @JsonProperty("fulfillment_option_slug")
    private String fulfillmentOptionSlug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
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
    private Object items;
    
    
    
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
    private Object fileUrl;
    
    
    
    
    @JsonProperty("product_type")
    private String productType;
    
    
    
}


/*
    Model: ZoneSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneSchema{

    

    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("fulfillment_option_slug")
    private String fulfillmentOptionSlug;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("company_id")
    private Object companyId;
    
    
    
    
    @JsonProperty("application_id")
    private Object applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    @JsonProperty("geo_areas")
    private Object geoAreas;
    
    
    
    
    @JsonProperty("stores")
    private Object stores;
    
    
    
    
    @JsonProperty("product")
    private Object product;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private Object stage;
    
    
    
    
    @JsonProperty("zone_id")
    private Object zoneId;
    
    
    
}


/*
    Model: CreateBulkZoneResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateBulkZoneResult{

    

    
    
    
    
    @JsonProperty("zone_id")
    private Object zoneId;
    
    
    
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
    private Object placeholder;
    
    
    
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
    Model: PincodeMOPResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMOPResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("pincodes")
    private List<Integer> pincodes;
    
    
    
    
    @JsonProperty("updated_pincodes")
    private List<PincodeMopUpdateResult> updatedPincodes;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditError{

    

    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PincodeMopBulkError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopBulkError{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    private Object error;
    
    
    
    
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
    Model: PincodeBulkViewResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeBulkViewResult{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("s3_url")
    private String s3Url;
    
    
    
}


/*
    Model: PincodeCodStatusListingDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingDetails{

    

    
    
    
    
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
    Model: PincodeCodStatusListingResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingResult{

    

    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeCodStatusItem> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("errors")
    private List<Error> errors;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("summary")
    private PincodeCodStatusListingSummary summary;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryDetails{

    

    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
}


/*
    Model: PincodeMopUpdateAuditHistoryResultData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryResultData{

    

    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("page")
    private PincodeMopUpdateAuditHistoryPaging page;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeMopUpdateAuditHistoryResult> data;
    
    
    
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
    Model: BulkGeoAreaGetResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkGeoAreaGetResult{

    

    
    
    
    
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

    

    
    
    
    
    @JsonProperty("is_polygon")
    private Boolean isPolygon;
    
    
    
    
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
    
    
    
    
    @JsonProperty("is_polygon")
    private Boolean isPolygon;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
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
    
    
    
    
    @JsonProperty("is_polygon")
    private Boolean isPolygon;
    
    
    
    
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
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("upload_type")
    private String uploadType;
    
    
    
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
    private List<GeoAreaItemResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page2 page;
    
    
    
}


/*
    Model: GeoAreaDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaDetails{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_polygon")
    private Boolean isPolygon;
    
    
    
    
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
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
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
    Model: CourierPartnerRuleResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleResult{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
    @JsonProperty("conditions")
    private CourierPartnerRuleConditions conditions;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("cp_list")
    private List<CourierPartnerRuleCPListResult> cpList;
    
    
    
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

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cp_list")
    private List<CourierPartnerList> cpList;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
    @JsonProperty("conditions")
    private CourierPartnerRuleConditions conditions;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    Model: CourierPartnerRulesListResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRulesListResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<CourierPartnerRuleResult> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ShipmentCourierPartnerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentCourierPartnerDetails{

    

    
    
    
    
    @JsonProperty("from_location")
    private ShipmentsCourierPartnersServiceability fromLocation;
    
    
    
    
    @JsonProperty("to_location")
    private ShipmentsCourierPartnersServiceability toLocation;
    
    
    
    
    @JsonProperty("shipments")
    private List<CPShipments> shipments;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
}


/*
    Model: ShipmentCourierPartnerResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentCourierPartnerResult{

    

    
    
    
    
    @JsonProperty("courier_partners")
    private List<CourierPartners> courierPartners;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentCourierPartners> shipments;
    
    
    
    
    @JsonProperty("delivery_promise")
    private CourierPartnerPromise deliveryPromise;
    
    
    
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
    Model: ApplicationConfigPatch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPatch{

    

    
    
    
    
    @JsonProperty("courier_partner_config")
    private CourierPartnerConfig courierPartnerConfig;
    
    
    
    
    @JsonProperty("buybox_rule_config")
    private BuyboxRuleConfig buyboxRuleConfig;
    
    
    
    
    @JsonProperty("promise_config")
    private PromiseConfig promiseConfig;
    
    
    
}


/*
    Model: ApplicationConfigPatchResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPatchResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
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
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
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
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: GetStoreRulesApiResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetStoreRulesApiResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<StoreRuleDataSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CreateStoreRuleDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateStoreRuleDetailsSchema{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
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
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
}


/*
    Model: StoreRuleResultSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleResultSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
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
    
    
    
    
    @JsonProperty("conditions")
    private StoreRuleConditionSchema conditions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: StoreRuleUpdateResultSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRuleUpdateResultSchema{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<Integer> manualPriority;
    
    
    
    
    @JsonProperty("meta_sort_priority")
    private HashMap<String,Object> metaSortPriority;
    
    
    
    
    @JsonProperty("meta_conditions")
    private HashMap<String,Object> metaConditions;
    
    
    
    
    @JsonProperty("filters")
    private String filters;
    
    
    
    
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
    Model: PackageMaterial
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterial{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
    Model: PackageMaterialsErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialsErrorResult{

    

    
    
    
    
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
    Model: PackageMaterialResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageMaterialResult{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
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
    Model: PackageRuleResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleResult{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("product_tag")
    private PackageRuleProductTag productTag;
    
    
    
    
    @JsonProperty("product_id")
    private PackageRuleProduct productId;
    
    
    
    
    @JsonProperty("department_id")
    private PackageRuleDepartmentId departmentId;
    
    
    
    
    @JsonProperty("product_attributes")
    private PackageRuleProductAttributes productAttributes;
    
    
    
    
    @JsonProperty("category_id")
    private PackageRuleCategory categoryId;
    
    
    
}


/*
    Model: PackagesListResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackagesListResult{

    

    
    
    
    
    @JsonProperty("items")
    private List<PackageItem> items;
    
    
    
    
    @JsonProperty("page")
    private PackagePageInfo page;
    
    
    
}


/*
    Model: PackageItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageItem{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private Double weight;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("channels")
    private List<PackageChannel> channels;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("rules")
    private List<PackageRuleSchema> rules;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("error_rate")
    private Double errorRate;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("max_weight")
    private Double maxWeight;
    
    
    
    
    @JsonProperty("media")
    private List<Object> media;
    
    
    
    
    @JsonProperty("package_vol_weight")
    private Double packageVolWeight;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("auto_calculate")
    private Boolean autoCalculate;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: RulePriorityDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RulePriorityDetails{

    

    
    
    
    
    @JsonProperty("rule_id")
    private String ruleId;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: RulePriorityResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RulePriorityResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: OptimalLocationsResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationsResult{

    

    
    
    
    
    @JsonProperty("assigned_stores")
    private List<OptimalLocationAssignedStoresResult> assignedStores;
    
    
    
    
    @JsonProperty("faulty_articles")
    private List<Error> faultyArticles;
    
    
    
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
    Model: CourierPartnerSchemeUpdateDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemeUpdateDetailsSchema{

    

    
    
    
    
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
    Model: GetCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountry{

    

    
    
    
    
    @JsonProperty("meta")
    private CountryMetaFields meta;
    
    
    
    
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
    Model: BulkImportLocalitiesDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkImportLocalitiesDetails{

    

    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
}


/*
    Model: BulkImportLocalitiesResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkImportLocalitiesResult{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BulkErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkErrorResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("total_error_count")
    private Integer totalErrorCount;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
}


/*
    Model: LocalitiesBulkExport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalitiesBulkExport{

    

    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("offset")
    private Integer offset;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: LocalitiesBulkExportFetch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalitiesBulkExportFetch{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("download_percentage")
    private Integer downloadPercentage;
    
    
    
    
    @JsonProperty("url_path")
    private String urlPath;
    
    
    
}


/*
    Model: LocalitiesErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalitiesErrorResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
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

    

    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("custom_meta")
    private HashMap<String,Object> customMeta;
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("parents")
    private LocalityParents parents;
    
    
    
}


/*
    Model: ValidateAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateAddress{

    

    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address_meta")
    private HashMap<String,Object> addressMeta;
    
    
    
    
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
    Model: ErrorResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResult{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private Error error;
    
    
    
}


/*
    Model: ApplicationConfigPut
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPut{

    

    
    
    
    
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
    Model: ApplicationConfigPutDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigPutDetail{

    

    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
    
    @JsonProperty("manual_priority")
    private List<String> manualPriority;
    
    
    
}


/*
    Model: ApplicationConfigGetResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationConfigGetResult{

    

    
    
    
    
    @JsonProperty("zones")
    private ZoneConfig zones;
    
    
    
    
    @JsonProperty("courier_partner_config")
    private CourierPartnerConfig courierPartnerConfig;
    
    
    
    
    @JsonProperty("buybox_rule_config")
    private BuyboxRuleConfig buyboxRuleConfig;
    
    
    
    
    @JsonProperty("promise_types")
    private List<PromiseType> promiseTypes;
    
    
    
    
    @JsonProperty("promise_config")
    private PromiseConfig promiseConfig;
    
    
    
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
    Model: GetLocalitiesBulkHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocalitiesBulkHistory{

    

    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<HistoryObject> items;
    
    
    
}


/*
    Model: CompanyConfigurationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyConfigurationSchema{

    

    
    
    
    
    @JsonProperty("sort")
    private List<String> sort;
    
    
    
}


/*
    Model: BusinessUnit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessUnit{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: FulfillmentStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentStores{

    

    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: FulfillmentProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentProducts{

    

    
    
    
    
    @JsonProperty("values")
    private List<Integer> values;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CourierPartnerSchemes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerSchemes{

    

    
    
    
    
    @JsonProperty("values")
    private List<CourierPartnerScheme> values;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CourierPartnerScheme
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerScheme{

    

    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("cp_ext_id")
    private String cpExtId;
    
    
    
}


/*
    Model: FulfillmentOptionProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionProduct{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("teaser_tag")
    private HashMap<String,Object> teaserTag;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("company_ids")
    private List<Integer> companyIds;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("change_request_id")
    private String changeRequestId;
    
    
    
    
    @JsonProperty("trader")
    private Trader trader;
    
    
    
    
    @JsonProperty("trader_type")
    private String traderType;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    @JsonProperty("tax_identifier")
    private TaxIdentifier taxIdentifier;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("media")
    private List<String> media;
    
    
    
    
    @JsonProperty("variant_media")
    private HashMap<String,Object> variantMedia;
    
    
    
    
    @JsonProperty("variants")
    private HashMap<String,Object> variants;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("_custom_json")
    private HashMap<String,Object> customJson;
    
    
    
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
    private Double value;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: Trader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
}


/*
    Model: ProductPublish
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublish{

    

    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
}


/*
    Model: TaxIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxIdentifier{

    

    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
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
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: CustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomOrder{

    

    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
}


/*
    Model: Size
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Size{

    

    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("size_priority")
    private Integer sizePriority;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("identifiers")
    private List<Identifier> identifiers;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
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

    

    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    @JsonProperty("gtin_value")
    private String gtinValue;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
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
    Model: FulfillmentOptionStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionStore{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("address")
    private Address address;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
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

    

    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: FulfillmentOptionValidate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillmentOptionValidate{

    

    
    
    
    
    @JsonProperty("entity_filter_type")
    private String entityFilterType;
    
    
    
    
    @JsonProperty("fulfillment_option_type")
    private String fulfillmentOptionType;
    
    
    
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
    private List<Object> values;
    
    
    
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
    
    
    
    
    @JsonProperty("geo_areas")
    private List<GeoArea> geoAreas;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("stores")
    private ListViewProduct stores;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("product")
    private ListViewProduct product;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("summary")
    private Summary summary;
    
    
    
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
    Model: ListViewProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewProduct{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
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
    private Object type;
    
    
    
    
    @JsonProperty("values")
    private Object values;
    
    
    
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
    private Object type;
    
    
    
    
    @JsonProperty("values")
    private Object values;
    
    
    
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
    private Object total;
    
    
    
    
    @JsonProperty("failed")
    private Object failed;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("action")
    private Object action;
    
    
    
    
    @JsonProperty("updated_at")
    private Object updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private Object updatedBy;
    
    
    
    
    @JsonProperty("type")
    private Object type;
    
    
    
    
    @JsonProperty("stage")
    private Object stage;
    
    
    
}


/*
    Model: PincodeMopUpdateResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateResult{

    

    
    
    
    
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
    Model: PincodeCodStatusItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusItem{

    

    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryResult{

    

    
    
    
    
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
    Model: GeoAreaItemResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeoAreaItemResult{

    

    
    
    
    
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
    private List<AreaExpanded> areas;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedBy modifiedBy;
    
    
    
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
    private ArithmeticOperations orderPlaceDate;
    
    
    
    
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
    
    
    
    
    @JsonProperty("store_customer_location")
    private StringComparisonOperations storeCustomerLocation;
    
    
    
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
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
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
    Model: CourierPartnerRuleCPListResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerRuleCPListResult{

    

    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("scheme_rules")
    private CourierPartnerSchemeDetailsModel schemeRules;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
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
    
    
    
}


/*
    Model: ShipmentsCourierPartnersServiceability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsCourierPartnersServiceability{

    

    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("sector_code")
    private String sectorCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("city_code")
    private String cityCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: CPShipments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CPShipments{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("location_id")
    private Double locationId;
    
    
    
    
    @JsonProperty("location_tags")
    private List<String> locationTags;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
    @JsonProperty("shipment_cost")
    private Double shipmentCost;
    
    
    
    
    @JsonProperty("shipment_dimension")
    private ShipmentDimension shipmentDimension;
    
    
    
    
    @JsonProperty("courier_partner_schemes")
    private List<String> courierPartnerSchemes;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("articles")
    private List<ShipmentsArticles> articles;
    
    
    
}


/*
    Model: ShipmentDimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDimension{

    

    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
}


/*
    Model: ShipmentsArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsArticles{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("sla")
    private String sla;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("weight")
    private ArticleWeight weight;
    
    
    
    
    @JsonProperty("attributes")
    private ArticleAttributes attributes;
    
    
    
    
    @JsonProperty("category_id")
    private Integer categoryId;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("dimension")
    private ArticleDimension dimension;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("mto_quantity")
    private Integer mtoQuantity;
    
    
    
    
    @JsonProperty("is_gift")
    private Boolean isGift;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("set")
    private ArticleSet set;
    
    
    
    
    @JsonProperty("set_quantity")
    private Integer setQuantity;
    
    
    
    
    @JsonProperty("delivery_slots")
    private ArticleDeliverySlots deliverySlots;
    
    
    
    
    @JsonProperty("return_reason")
    private ArticleReturnReason returnReason;
    
    
    
}


/*
    Model: ArticleWeight
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleWeight{

    

    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: ArticleAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAttributes{

    

    
    
    
    
    @JsonProperty("battery_operated")
    private String batteryOperated;
    
    
    
    
    @JsonProperty("is_flammable")
    private String isFlammable;
    
    
    
}


/*
    Model: ArticleDimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDimension{

    

    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
}


/*
    Model: ArticleSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleSet{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size_distribution")
    private ArticleSizeDistribution sizeDistribution;
    
    
    
}


/*
    Model: ArticleSizeDistribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleSizeDistribution{

    

    
    
    
    
    @JsonProperty("sizes")
    private List<SetSize> sizes;
    
    
    
}


/*
    Model: SetSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetSize{

    

    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
}


/*
    Model: ArticleDeliverySlots
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDeliverySlots{

    

    
    
    
    
    @JsonProperty("delivery_date")
    private String deliveryDate;
    
    
    
    
    @JsonProperty("min_slot")
    private String minSlot;
    
    
    
    
    @JsonProperty("max_slot")
    private String maxSlot;
    
    
    
}


/*
    Model: ArticleReturnReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleReturnReason{

    

    
    
    
    
    @JsonProperty("qc_type")
    private List<String> qcType;
    
    
    
}


/*
    Model: CourierPartners
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartners{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("delivery_promise")
    private CourierPartnerPromise deliveryPromise;
    
    
    
}


/*
    Model: CourierPartnerPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerPromise{

    

    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
    
    @JsonProperty("attributes")
    private CourierPartnerAttributes attributes;
    
    
    
}


/*
    Model: CourierPartnerAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerAttributes{

    

    
    
    
    
    @JsonProperty("tat")
    private CourierPartnerTAT tat;
    
    
    
}


/*
    Model: CourierPartnerTAT
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierPartnerTAT{

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: ShipmentCourierPartners
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentCourierPartners{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("courier_partners")
    private List<CourierPartners> courierPartners;
    
    
    
    
    @JsonProperty("delivery_promise")
    private CourierPartnerPromise deliveryPromise;
    
    
    
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
    
    
    
    
    @JsonProperty("is_all_dps_considered")
    private Boolean isAllDpsConsidered;
    
    
    
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
    private LocationRule toLocation;
    
    
    
    
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
    private DateOperations orderPlaceDate;
    
    
    
    
    @JsonProperty("zone_ids")
    private StringComparisonOperations zoneIds;
    
    
    
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
    Model: DateOperations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DateOperations{

    

    
    
    
    
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
    Model: PackageChannel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageChannel{

    

    
    
    
    
    @JsonProperty("store_filter")
    private StoreFilter storeFilter;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: StoreFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreFilter{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("ids")
    private List<Integer> ids;
    
    
    
}


/*
    Model: PackageRuleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageRuleSchema{

    

    
    
    
    
    @JsonProperty("quantity")
    private Quantity quantity;
    
    
    
    
    @JsonProperty("rule_id")
    private String ruleId;
    
    
    
    
    @JsonProperty("weight")
    private Double weight;
    
    
    
}


/*
    Model: Quantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Quantity{

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: PackagePageInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackagePageInfo{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
}


/*
    Model: OptimalLocationAssignedStoresResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationAssignedStoresResult{

    

    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("articles")
    private List<OptimalLocationArticlesResult> articles;
    
    
    
}


/*
    Model: OptimalLocationArticlesResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptimalLocationArticlesResult{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
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
    
    
    
    
    @JsonProperty("parent_uid")
    private String parentUid;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
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
    Model: CountryMetaFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryMetaFields{

    

    
    
    
    
    @JsonProperty("application_fields")
    private ApplicationFields applicationFields;
    
    
    
}


/*
    Model: ApplicationFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationFields{

    

    
    
    
    
    @JsonProperty("address")
    private List<GetCountryFieldsAddress> address;
    
    
    
    
    @JsonProperty("serviceability_fields")
    private List<String> serviceabilityFields;
    
    
    
    
    @JsonProperty("address_template")
    private GetCountryFieldsAddressTemplateApplication addressTemplate;
    
    
    
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
    Model: GetCountryFieldsAddressTemplateApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCountryFieldsAddressTemplateApplication{

    

    
    
    
    
    @JsonProperty("checkout_form")
    private String checkoutForm;
    
    
    
    
    @JsonProperty("store_os_form")
    private String storeOsForm;
    
    
    
    
    @JsonProperty("default_display")
    private String defaultDisplay;
    
    
    
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
    Model: LocalityParents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalityParents{

    

    
    
    
    
    @JsonProperty("city")
    private Object city;
    
    
    
    
    @JsonProperty("state")
    private Object state;
    
    
    
    
    @JsonProperty("country")
    private Object country;
    
    
    
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
    
    
    
    
    @JsonProperty("is_all_dps_considered")
    private Boolean isAllDpsConsidered;
    
    
    
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

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("extention_type")
    private String extentionType;
    
    
    
    
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
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: HistoryObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryObject{

    

    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("error_file_url")
    private String errorFileUrl;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("total_error_count")
    private Integer totalErrorCount;
    
    
    
}




}