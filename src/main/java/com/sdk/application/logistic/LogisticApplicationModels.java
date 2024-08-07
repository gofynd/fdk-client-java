

package com.sdk.application.logistic;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class LogisticApplicationModels{


/*
    Model: GetStoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetStoreResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<StoreItemResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: StoreItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreItemResponse{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
    @JsonProperty("processing_time")
    private Integer processingTime;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: ValidateAddressRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateAddressRequest{

    

    
    
    
    
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

    

    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


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

    

    
    
    
    
    @JsonProperty("zone")
    private String zone;
    
    
    
    
    @JsonProperty("internal_zone_id")
    private Integer internalZoneId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("isd_code")
    private String isdCode;
    
    
    
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
    private List<String> coordinates;
    
    
    
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

    

    
    
    
    
    @JsonProperty("parents")
    private List<PincodeParentsResponse> parents;
    
    
    
    
    @JsonProperty("meta")
    private PincodeMetaResponse meta;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("error")
    private PincodeErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("meta_code")
    private CountryMetaResponse metaCode;
    
    
    
    
    @JsonProperty("lat_long")
    private PincodeLatLongData latLong;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
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
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
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

    

    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("articles")
    private List<TATArticlesRequest> articles;
    
    
    
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

    

    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("location_details")
    private List<TATLocationDetailsRequest> locationDetails;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
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

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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

    

    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
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

    

    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
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

    

    
    
    
    
    @JsonProperty("timestamp")
    private TATTimestampResponse timestamp;
    
    
    
    
    @JsonProperty("formatted")
    private TATFormattedResponse formatted;
    
    
    
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

    

    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
    @JsonProperty("error")
    private TATErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("is_cod_available")
    private Boolean isCodAvailable;
    
    
    
    
    @JsonProperty("promise")
    private TATPromiseResponse promise;
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("category")
    private TATCategoryRequest category;
    
    
    
    
    @JsonProperty("_manufacturing_time_seconds")
    private Integer manufacturingTimeSeconds;
    
    
    
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

    

    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    @JsonProperty("articles")
    private List<TATArticlesResponse> articles;
    
    
    
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

    

    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("request_uuid")
    private String requestUuid;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private TATErrorSchemaResponse error;
    
    
    
    
    @JsonProperty("is_cod_available")
    private Boolean isCodAvailable;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
    
    @JsonProperty("to_city")
    private String toCity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("location_details")
    private List<TATLocationDetailsResponse> locationDetails;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("parent_id")
    private String parentId;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
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

    

    
    
    
    
    @JsonProperty("configuration")
    private Object configuration;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("ignored_locations")
    private List<Integer> ignoredLocations;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
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

    

    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("pystormbreaker_uuid")
    private String pystormbreakerUuid;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("assigned_stores")
    private List<Object> assignedStores;
    
    
    
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

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
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
    Model: GetOneOrAllPath
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOneOrAllPath{

    

    
    
    
    
    @JsonProperty("locality_type")
    private String localityType;
    
    
    
    
    @JsonProperty("locality_value")
    private String localityValue;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
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
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("localities")
    private List<LocalityParent> localities;
    
    
    
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




}