
package com.sdk.platform.companyprofile;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class CompanyProfilePlatformModels{


/*
    Model: BusinessCountryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessCountryInfo{
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
}


/*
    Model: Website
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Website{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: BusinessDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessDetails{
    
    
    
    
    @JsonProperty("website")
    private Website website;
    
    
    
}


/*
    Model: CompanyTaxesSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyTaxesSerializer{
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
}


/*
    Model: UserSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer{
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
}


/*
    Model: GetAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAddressSerializer{
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document{
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
}


/*
    Model: SellerPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerPhoneNumber{
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
}


/*
    Model: ContactDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactDetails{
    
    
    
    
    @JsonProperty("phone")
    private List<SellerPhoneNumber> phone;
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
}


/*
    Model: GetCompanyProfileSerializerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCompanyProfileSerializerResponse{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
    @JsonProperty("taxes")
    private List<CompanyTaxesSerializer> taxes;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: CreateUpdateAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUpdateAddressSerializer{
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: CompanyTaxesSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyTaxesSerializer1{
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
}


/*
    Model: UpdateCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCompany{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("addresses")
    private List<CreateUpdateAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
    @JsonProperty("taxes")
    private List<CompanyTaxesSerializer1> taxes;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
}


/*
    Model: ProfileSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileSuccessResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: DocumentsObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentsObj{
    
    
    
    
    @JsonProperty("verified")
    private Integer verified;
    
    
    
    
    @JsonProperty("pending")
    private Integer pending;
    
    
    
}


/*
    Model: MetricsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricsSerializer{
    
    
    
    
    @JsonProperty("company_documents")
    private DocumentsObj companyDocuments;
    
    
    
    
    @JsonProperty("store")
    private DocumentsObj store;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("store_documents")
    private DocumentsObj storeDocuments;
    
    
    
    
    @JsonProperty("product")
    private DocumentsObj product;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("brand")
    private DocumentsObj brand;
    
    
    
}


/*
    Model: BrandBannerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandBannerSerializer{
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
}


/*
    Model: GetBrandResponseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBrandResponseSerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: CreateUpdateBrandRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUpdateBrandRequestSerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand_tier")
    private String brandTier;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    Model: CompanySocialAccounts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanySocialAccounts{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: CompanyDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDetails{
    
    
    
    
    @JsonProperty("socials")
    private List<CompanySocialAccounts> socials;
    
    
    
    
    @JsonProperty("website_url")
    private String websiteUrl;
    
    
    
}


/*
    Model: CompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanySerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("details")
    private CompanyDetails details;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("market_channels")
    private List<String> marketChannels;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: CompanyBrandSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandSerializer{
    
    
    
    
    @JsonProperty("brand")
    private GetBrandResponseSerializer brand;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("company")
    private CompanySerializer company;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: CompanyBrandListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandListSerializer{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandSerializer> items;
    
    
    
}


/*
    Model: CompanyBrandPostRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandPostRequestSerializer{
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: LocationTimingSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationTimingSerializer{
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
}


/*
    Model: LocationDayWiseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDayWiseSerializer{
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    @JsonProperty("opening")
    private LocationTimingSerializer opening;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
}


/*
    Model: HolidayDateSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HolidayDateSerializer{
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
}


/*
    Model: HolidaySchemaSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HolidaySchemaSerializer{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("date")
    private HolidayDateSerializer date;
    
    
    
    
    @JsonProperty("holiday_type")
    private String holidayType;
    
    
    
}


/*
    Model: InvoiceCredSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceCredSerializer{
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
}


/*
    Model: InvoiceDetailsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsSerializer{
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
}


/*
    Model: GetCompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCompanySerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: ProductReturnConfigSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductReturnConfigSerializer{
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
    @JsonProperty("store_uid")
    private Integer storeUid;
    
    
    
}


/*
    Model: LocationManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationManagerSerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: GetLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocationSerializer{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("holiday")
    private List<HolidaySchemaSerializer> holiday;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
}


/*
    Model: LocationListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationListSerializer{
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetLocationSerializer> items;
    
    
    
}


/*
    Model: AddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddressSerializer{
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: LocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationSerializer{
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("address")
    private AddressSerializer address;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("holiday")
    private List<HolidaySchemaSerializer> holiday;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
}


/*
    Model: BulkLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkLocationSerializer{
    
    
    
    
    @JsonProperty("data")
    private List<LocationSerializer> data;
    
    
    
}




}