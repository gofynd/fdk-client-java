
package com.sdk.platform.logistic;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;


public class LogisticPlatformModels{


/*
    Model: ApplicationServiceabilityConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationServiceabilityConfig {
    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
}

/*
    Model: ServiceabilityErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityErrorResponse {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ApplicationServiceabilityConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationServiceabilityConfigResponse {
    
    
    
    
    @JsonProperty("data")
    private ApplicationServiceabilityConfig data;
    
    
    
    
    @JsonProperty("error")
    private ServiceabilityErrorResponse error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: EntityRegionView_Request
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityRegionView_Request {
    
    
    
    
    @JsonProperty("sub_type")
    private List<String> subType;
    
    
    
    
    @JsonProperty("parent_id")
    private List<String> parentId;
    
    
    
    
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
public static class EntityRegionView_Items {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
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
public static class EntityRegionView_page {
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class EntityRegionView_Error {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: EntityRegionView_Response
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityRegionView_Response {
    
    
    
    
    @JsonProperty("data")
    private List<EntityRegionView_Items> data;
    
    
    
    
    @JsonProperty("page")
    private EntityRegionView_page page;
    
    
    
    
    @JsonProperty("error")
    private EntityRegionView_Error error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class ListViewChannels {
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
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
public static class ListViewProduct {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
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
public static class ListViewItems {
    
    
    
    
    @JsonProperty("channels")
    private ListViewChannels channels;
    
    
    
    
    @JsonProperty("product")
    private ListViewProduct product;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("pincodes_count")
    private Integer pincodesCount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
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
public static class ZoneDataItem {
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
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
public static class ListViewSummary {
    
    
    
    
    @JsonProperty("total_pincodes_served")
    private Integer totalPincodesServed;
    
    
    
    
    @JsonProperty("total_zones")
    private Integer totalZones;
    
    
    
    
    @JsonProperty("total_active_zones")
    private Integer totalActiveZones;
    
    
    
    
}

/*
    Model: ListViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListViewResponse {
    
    
    
    
    @JsonProperty("items")
    private List<ListViewItems> items;
    
    
    
    
    @JsonProperty("page")
    private List<ZoneDataItem> page;
    
    
    
    
    @JsonProperty("summary")
    private List<ListViewSummary> summary;
    
    
    
    
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
public static class CompanyStoreView_PageItems {
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: CompanyStoreView_Response
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyStoreView_Response {
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("page")
    private List<CompanyStoreView_PageItems> page;
    
    
    
    
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
public static class GetZoneDataViewChannels {
    
    
    
    
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
public static class ZoneProductTypes {
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
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
public static class ZoneMappingType {
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private List<String> pincode;
    
    
    
    
    @JsonProperty("state")
    private List<String> state;
    
    
    
    
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
public static class UpdateZoneData {
    
    
    
    
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
    Model: ZoneUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneUpdateRequest {
    
    
    
    
    @JsonProperty("data")
    private UpdateZoneData data;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ZoneSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneSuccessResponse {
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class GetZoneDataViewItems {
    
    
    
    
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
    
    
    
    
    @JsonProperty("pincodes_count")
    private Integer pincodesCount;
    
    
    
    
}

/*
    Model: GetSingleZoneDataViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSingleZoneDataViewResponse {
    
    
    
    
    @JsonProperty("data")
    private GetZoneDataViewItems data;
    
    
    
    
}

/*
    Model: CreateZoneData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateZoneData {
    
    
    
    
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
    Model: ZoneRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneRequest {
    
    
    
    
    @JsonProperty("data")
    private CreateZoneData data;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ZoneResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneResponse {
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
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
public static class GetZoneFromPincodeViewRequest {
    
    
    
    
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
public static class GetZoneFromPincodeViewResponse {
    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("zones")
    private List<String> zones;
    
    
    
    
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
public static class Dp {
    
    
    
    
    @JsonProperty("rvp_priority")
    private Integer rvpPriority;
    
    
    
    
    @JsonProperty("lm_priority")
    private Integer lmPriority;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("operations")
    private List<String> operations;
    
    
    
    
    @JsonProperty("fm_priority")
    private Integer fmPriority;
    
    
    
    
    @JsonProperty("external_account_id")
    private String externalAccountId;
    
    
    
    
    @JsonProperty("transport_mode")
    private String transportMode;
    
    
    
    
    @JsonProperty("area_code")
    private Integer areaCode;
    
    
    
    
    @JsonProperty("internal_account_id")
    private String internalAccountId;
    
    
    
    
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
public static class LogisticsResponse {
    
    
    
    
    @JsonProperty("dp")
    private Dp dp;
    
    
    
    
    @JsonProperty("override")
    private Boolean override;
    
    
    
    
}

/*
    Model: ModifiedByResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ModifiedByResponse {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: ContactNumberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactNumberResponse {
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
}

/*
    Model: WarningsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WarningsResponse {
    
    
    
    
    @JsonProperty("store_address")
    private String storeAddress;
    
    
    
    
}

/*
    Model: DocumentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentsResponse {
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ProductReturnConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductReturnConfigResponse {
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
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
public static class OpeningClosing {
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
}

/*
    Model: TimmingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TimmingResponse {
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("opening")
    private OpeningClosing opening;
    
    
    
    
    @JsonProperty("closing")
    private OpeningClosing closing;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
}

/*
    Model: EwayBillResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EwayBillResponse {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: EinvoiceResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EinvoiceResponse {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: GstCredentialsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GstCredentialsResponse {
    
    
    
    
    @JsonProperty("e_waybill")
    private EwayBillResponse eWaybill;
    
    
    
    
    @JsonProperty("e_invoice")
    private EinvoiceResponse eInvoice;
    
    
    
    
}

/*
    Model: AddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddressResponse {
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
}

/*
    Model: IntegrationTypeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationTypeResponse {
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
    
}

/*
    Model: CreatedByResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedByResponse {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
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
public static class MobileNo {
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
}

/*
    Model: ManagerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManagerResponse {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mobile_no")
    private MobileNo mobileNo;
    
    
    
    
}

/*
    Model: ItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemResponse {
    
    
    
    
    @JsonProperty("logistics")
    private LogisticsResponse logistics;
    
    
    
    
    @JsonProperty("verified_by")
    private ModifiedByResponse verifiedBy;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<ContactNumberResponse> contactNumbers;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("warnings")
    private WarningsResponse warnings;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("documents")
    private List<DocumentsResponse> documents;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigResponse productReturnConfig;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("timing")
    private List<TimmingResponse> timing;
    
    
    
    
    @JsonProperty("gst_credentials")
    private GstCredentialsResponse gstCredentials;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("address")
    private AddressResponse address;
    
    
    
    
    @JsonProperty("integration_type")
    private IntegrationTypeResponse integrationType;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedByResponse createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedByResponse modifiedBy;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("manager")
    private ManagerResponse manager;
    
    
    
    
}

/*
    Model: ServiceabilityPageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ServiceabilityPageResponse {
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: GetStoresViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetStoresViewResponse {
    
    
    
    
    @JsonProperty("items")
    private List<ItemResponse> items;
    
    
    
    
    @JsonProperty("page")
    private ServiceabilityPageResponse page;
    
    
    
    
}





}