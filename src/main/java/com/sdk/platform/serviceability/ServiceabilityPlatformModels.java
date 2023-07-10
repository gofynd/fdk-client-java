
package com.sdk.platform.serviceability;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class ServiceabilityPlatformModels{


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
    
    
    
    
    @JsonProperty("serviceability_type")
    private String serviceabilityType;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
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
public static class ServiceabilityErrorResponse{
    
    
    
    
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
public static class ApplicationServiceabilityConfigResponse{
    
    
    
    
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
public static class EntityRegionView_Request{
    
    
    
    
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
public static class EntityRegionView_Items{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
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
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
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
public static class EntityRegionView_Response{
    
    
    
    
    @JsonProperty("data")
    private List<EntityRegionView_Items> data;
    
    
    
    
    @JsonProperty("error")
    private EntityRegionView_Error error;
    
    
    
    
    @JsonProperty("page")
    private EntityRegionView_page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("total_active_zones")
    private Integer totalActiveZones;
    
    
    
    
    @JsonProperty("total_pincodes_served")
    private Integer totalPincodesServed;
    
    
    
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
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
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
public static class ListViewItems{
    
    
    
    
    @JsonProperty("channels")
    private ListViewChannels channels;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("product")
    private ListViewProduct product;
    
    
    
    
    @JsonProperty("stores_count")
    private Integer storesCount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
    @JsonProperty("pincodes_count")
    private Integer pincodesCount;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
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
public static class ListViewResponse{
    
    
    
    
    @JsonProperty("summary")
    private List<ListViewSummary> summary;
    
    
    
    
    @JsonProperty("items")
    private List<ListViewItems> items;
    
    
    
    
    @JsonProperty("page")
    private List<ZoneDataItem> page;
    
    
    
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
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
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
public static class CompanyStoreView_Response{
    
    
    
    
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
public static class GetZoneDataViewChannels{
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("channel_id")
    private String channelId;
    
    
    
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
    
    
    
    
    @JsonProperty("state")
    private List<String> state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private List<String> pincode;
    
    
    
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
public static class GetSingleZoneDataViewResponse{
    
    
    
    
    @JsonProperty("data")
    private GetZoneDataViewItems data;
    
    
    
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
    Model: ZoneUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ZoneUpdateRequest{
    
    
    
    
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
public static class ZoneSuccessResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
public static class CreateZoneData{
    
    
    
    
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
public static class ZoneRequest{
    
    
    
    
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
public static class ZoneResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("zone_id")
    private String zoneId;
    
    
    
    
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
public static class GetZoneFromPincodeViewRequest{
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
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
    Model: GetZoneFromApplicationIdViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetZoneFromApplicationIdViewResponse{
    
    
    
    
    @JsonProperty("items")
    private List<ListViewItems> items;
    
    
    
    
    @JsonProperty("page")
    private List<ZoneDataItem> page;
    
    
    
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
public static class ContactNumberResponse{
    
    
    
    
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
public static class WarningsResponse{
    
    
    
    
    @JsonProperty("store_address")
    private String storeAddress;
    
    
    
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
public static class ModifiedByResponse{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
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
    Model: ManagerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManagerResponse{
    
    
    
    
    @JsonProperty("mobile_no")
    private MobileNo mobileNo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
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
public static class AddressResponse{
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
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
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("internal_account_id")
    private String internalAccountId;
    
    
    
    
    @JsonProperty("fm_priority")
    private Integer fmPriority;
    
    
    
    
    @JsonProperty("lm_priority")
    private Integer lmPriority;
    
    
    
    
    @JsonProperty("area_code")
    private Integer areaCode;
    
    
    
    
    @JsonProperty("rvp_priority")
    private Integer rvpPriority;
    
    
    
    
    @JsonProperty("external_account_id")
    private String externalAccountId;
    
    
    
    
    @JsonProperty("transport_mode")
    private String transportMode;
    
    
    
    
    @JsonProperty("operations")
    private List<String> operations;
    
    
    
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
    private Dp dp;
    
    
    
    
    @JsonProperty("override")
    private Boolean override;
    
    
    
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
public static class CreatedByResponse{
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
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
public static class IntegrationTypeResponse{
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
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
public static class ProductReturnConfigResponse{
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
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
public static class EwayBillResponse{
    
    
    
    
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
public static class EinvoiceResponse{
    
    
    
    
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
public static class GstCredentialsResponse{
    
    
    
    
    @JsonProperty("e_waybill")
    private EwayBillResponse eWaybill;
    
    
    
    
    @JsonProperty("e_invoice")
    private EinvoiceResponse eInvoice;
    
    
    
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
public static class DocumentsResponse{
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
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
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
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
public static class TimmingResponse{
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("closing")
    private OpeningClosing closing;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("opening")
    private OpeningClosing opening;
    
    
    
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
public static class ItemResponse{
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<ContactNumberResponse> contactNumbers;
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("warnings")
    private WarningsResponse warnings;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("verified_by")
    private ModifiedByResponse verifiedBy;
    
    
    
    
    @JsonProperty("manager")
    private ManagerResponse manager;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("address")
    private AddressResponse address;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("logistics")
    private LogisticsResponse logistics;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedByResponse createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private ModifiedByResponse modifiedBy;
    
    
    
    
    @JsonProperty("integration_type")
    private IntegrationTypeResponse integrationType;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigResponse productReturnConfig;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("gst_credentials")
    private GstCredentialsResponse gstCredentials;
    
    
    
    
    @JsonProperty("documents")
    private List<DocumentsResponse> documents;
    
    
    
    
    @JsonProperty("timing")
    private List<TimmingResponse> timing;
    
    
    
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
public static class ServiceabilityPageResponse{
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
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
public static class GetStoresViewResponse{
    
    
    
    
    @JsonProperty("items")
    private List<ItemResponse> items;
    
    
    
    
    @JsonProperty("page")
    private ServiceabilityPageResponse page;
    
    
    
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
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("ignored_locations")
    private List<String> ignoredLocations;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("configuration")
    private Object configuration;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
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
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ApplicationCompanyDpViewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCompanyDpViewRequest{
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
}


/*
    Model: ApplicationCompanyDpViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCompanyDpViewResponse{
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("courier_partner_id")
    private Integer courierPartnerId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    Model: PincodeMopUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateResponse{
    
    
    
    
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
    Model: PincodeMOPresponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMOPresponse{
    
    
    
    
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
    private List<PincodeMopUpdateResponse> updatedPincodes;
    
    
    
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
    private String statusCode;
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
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
    Model: PincodeBulkViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeBulkViewResponse{
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("s3_url")
    private String s3Url;
    
    
    
}


/*
    Model: PincodeCodStatusListingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingRequest{
    
    
    
    
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
    Model: PincodeCodStatusListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeCodStatusListingResponse{
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("data")
    private List<PincodeCodStatusListingResponse> data;
    
    
    
    
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
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryRequest{
    
    
    
    
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
    Model: PincodeMopUpdateAuditHistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PincodeMopUpdateAuditHistoryResponse{
    
    
    
    
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
    private List<PincodeMopUpdateAuditHistoryResponse> data;
    
    
    
}


/*
    Model: Dp1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dp1{
    
    
    
    
    @JsonProperty("plan_rules")
    private Object planRules;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
}


/*
    Model: CompanyDpAccountRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDpAccountRequest{
    
    
    
    
    @JsonProperty("data")
    private List<Dp1> data;
    
    
    
}


/*
    Model: CompanyDpAccountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDpAccountResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: DpAccountFailureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpAccountFailureResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponse> error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    Model: CompanyDpAccountListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDpAccountListResponse{
    
    
    
    
    @JsonProperty("items")
    private List<Dp1> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DpSchemaInRuleListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpSchemaInRuleListing{
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("plan_rules")
    private Object planRules;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
}


/*
    Model: DpRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRule{
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("dp_ids")
    private HashMap<String,DpSchemaInRuleListing> dpIds;
    
    
    
    
    @JsonProperty("conditions")
    private List<Object> conditions;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DpRuleSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRuleSuccessResponse{
    
    
    
    
    @JsonProperty("data")
    private DpRule data;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: FailureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FailureResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private List<ErrorResponse> error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DpRulesUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRulesUpdateRequest{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("dp_ids")
    private HashMap<String,Object> dpIds;
    
    
    
    
    @JsonProperty("conditions")
    private List<Object> conditions;
    
    
    
}


/*
    Model: DpRuleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRuleResponse{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("dp_ids")
    private Object dpIds;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("conditions")
    private List<String> conditions;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: DpRuleUpdateSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRuleUpdateSuccessResponse{
    
    
    
    
    @JsonProperty("data")
    private DpRuleResponse data;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DpIds
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpIds{
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: DpRuleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpRuleRequest{
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("dp_ids")
    private HashMap<String,DpIds> dpIds;
    
    
    
    
    @JsonProperty("conditions")
    private List<Object> conditions;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DpMultipleRuleSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpMultipleRuleSuccessResponse{
    
    
    
    
    @JsonProperty("items")
    private List<DpRule> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DPCompanyRuleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPCompanyRuleResponse{
    
    
    
    
    @JsonProperty("data")
    private List<DpRuleResponse> data;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DPCompanyRuleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPCompanyRuleRequest{
    
    
    
    
    @JsonProperty("rule_ids")
    private List<String> ruleIds;
    
    
    
}


/*
    Model: DPApplicationRuleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPApplicationRuleResponse{
    
    
    
    
    @JsonProperty("data")
    private List<DpRuleResponse> data;
    
    
    
    
    @JsonProperty("status_code")
    private Boolean statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DPApplicationRuleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPApplicationRuleRequest{
    
    
    
    
    @JsonProperty("shipping_rules")
    private List<String> shippingRules;
    
    
    
}


/*
    Model: SelfShipResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelfShipResponse{
    
    
    
    
    @JsonProperty("tat")
    private Double tat;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    private SelfShipResponse selfShip;
    
    
    
}


/*
    Model: ApplicationSelfShipConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationSelfShipConfigResponse{
    
    
    
    
    @JsonProperty("data")
    private ApplicationSelfShipConfig data;
    
    
    
    
    @JsonProperty("error")
    private ServiceabilityErrorResponse error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}




}