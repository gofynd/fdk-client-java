
package com.sdk.application.logistic;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class LogisticApplicationModels{


/*
    Model: PincodeMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMetaResponse{
    
    
    
    
    @JsonProperty("internal_zone_id")
    private Integer internalZoneId;
    
    
    
    
    @JsonProperty("zone")
    private String zone;
    
    
    
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
    
    
    
    
    @JsonProperty("coordinates")
    private List<String> coordinates;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CountryMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryMetaResponse{
    
    
    
    
    @JsonProperty("isd_code")
    private String isdCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: PincodeParentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeParentsResponse{
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PincodeErrorSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeErrorSchemaResponse{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: PincodeDataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeDataResponse{
    
    
    
    
    @JsonProperty("meta")
    private PincodeMetaResponse meta;
    
    
    
    
    @JsonProperty("lat_long")
    private PincodeLatLongData latLong;
    
    
    
    
    @JsonProperty("meta_code")
    private CountryMetaResponse metaCode;
    
    
    
    
    @JsonProperty("parents")
    private List<PincodeParentsResponse> parents;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("error")
    private PincodeErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PincodeApiResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeApiResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeDataResponse> data;
    
    
    
    
    @JsonProperty("error")
    private PincodeErrorSchemaResponse error;
    
    
    
}


/*
    Model: TATCategoryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATCategoryRequest{
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: TATArticlesRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATArticlesRequest{
    
    
    
    
    @JsonProperty("category")
    private TATCategoryRequest category;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
}


/*
    Model: TATLocationDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATLocationDetailsRequest{
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("articles")
    private List<TATArticlesRequest> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
}


/*
    Model: TATViewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATViewRequest{
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("location_details")
    private List<TATLocationDetailsRequest> locationDetails;
    
    
    
}


/*
    Model: TATFormattedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATFormattedResponse{
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
}


/*
    Model: TATTimestampResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATTimestampResponse{
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
}


/*
    Model: TATPromiseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATPromiseResponse{
    
    
    
    
    @JsonProperty("formatted")
    private TATFormattedResponse formatted;
    
    
    
    
    @JsonProperty("timestamp")
    private TATTimestampResponse timestamp;
    
    
    
}


/*
    Model: TATErrorSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATErrorSchemaResponse{
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: TATArticlesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATArticlesResponse{
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("promise")
    private TATPromiseResponse promise;
    
    
    
    
    @JsonProperty("_manufacturing_time_seconds")
    private Integer manufacturingTimeSeconds;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("is_cod_available")
    private Boolean isCodAvailable;
    
    
    
    
    @JsonProperty("error")
    private TATErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("category")
    private TATCategoryRequest category;
    
    
    
}


/*
    Model: TATLocationDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATLocationDetailsResponse{
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("articles")
    private List<TATArticlesResponse> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
}


/*
    Model: TATViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TATViewResponse{
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("is_cod_available")
    private Boolean isCodAvailable;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("request_uuid")
    private String requestUuid;
    
    
    
    
    @JsonProperty("location_details")
    private List<TATLocationDetailsResponse> locationDetails;
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
    
    @JsonProperty("error")
    private TATErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("to_city")
    private String toCity;
    
    
    
}


/*
    Model: DP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DP{
    
    
    
    
    @JsonProperty("fm_priority")
    private Integer fmPriority;
    
    
    
    
    @JsonProperty("lm_priority")
    private Integer lmPriority;
    
    
    
    
    @JsonProperty("rvp_priority")
    private Integer rvpPriority;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("operations")
    private List<String> operations;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("internal_account_id")
    private String internalAccountId;
    
    
    
    
    @JsonProperty("external_account_id")
    private String externalAccountId;
    
    
    
    
    @JsonProperty("transport_mode")
    private String transportMode;
    
    
    
}


/*
    Model: LogisticsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogisticsResponse{
    
    
    
    
    @JsonProperty("dp")
    private HashMap<String,DP> dp;
    
    
    
}


/*
    Model: CountryEntityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryEntityResponse{
    
    
    
    
    @JsonProperty("meta")
    private CountryMetaResponse meta;
    
    
    
    
    @JsonProperty("logistics")
    private LogisticsResponse logistics;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("parent_id")
    private String parentId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CountryListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CountryListResponse{
    
    
    
    
    @JsonProperty("results")
    private List<CountryEntityResponse> results;
    
    
    
}


/*
    Model: GetZoneFromPincodeViewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneFromPincodeViewRequest{
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
}


/*
    Model: GetZoneFromPincodeViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneFromPincodeViewResponse{
    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("zones")
    private List<String> zones;
    
    
    
}


/*
    Model: ReAssignStoreRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReAssignStoreRequest{
    
    
    
    
    @JsonProperty("ignored_locations")
    private List<String> ignoredLocations;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("configuration")
    private Object configuration;
    
    
    
}


/*
    Model: ReAssignStoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReAssignStoreResponse{
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
}




}