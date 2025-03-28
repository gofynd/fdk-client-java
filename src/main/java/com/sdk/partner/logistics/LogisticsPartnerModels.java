

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
    Model: ErrorResponseV1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponseV1{

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


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
    Model: BulkRegionJobSerializerSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRegionJobSerializerSchema{

    

    
    
    
    
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
    Model: CourierAccountSchemeResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CourierAccountSchemeResponseSchema{

    

    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("scheme_id")
    private String schemeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("weight")
    private ArithmeticOperationsV2 weight;
    
    
    
    
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
    private ArithmeticOperationsV2 weight;
    
    
    
    
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
    private Integer lt;
    
    
    
    
    @JsonProperty("gt")
    private Integer gt;
    
    
    
    
    @JsonProperty("lte")
    private Integer lte;
    
    
    
    
    @JsonProperty("gte")
    private Integer gte;
    
    
    
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
    private ArithmeticOperationsV2 weight;
    
    
    
    
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




}