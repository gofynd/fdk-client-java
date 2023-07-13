
package com.sdk.platform.partner;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class PartnerPlatformModels{


/*
    Model: ExtensionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionResponse{
    
    
    
    
    @JsonProperty("items")
    private List<ExtensionListItems> items;
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
}


/*
    Model: ExtensionListItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionListItems{
    
    
    
    
    @JsonProperty("base_url")
    private String baseUrl;
    
    
    
    
    @JsonProperty("callbacks")
    private Callback callbacks;
    
    
    
    
    @JsonProperty("contact_email")
    private String contactEmail;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("developed_by_name")
    private String developedByName;
    
    
    
    
    @JsonProperty("ext_version")
    private String extVersion;
    
    
    
    
    @JsonProperty("extention_type")
    private String extentionType;
    
    
    
    
    @JsonProperty("is_application_level")
    private Boolean isApplicationLevel;
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("is_saleschannel")
    private Boolean isSaleschannel;
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("whitelisted_urls")
    private List<String> whitelistedUrls;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: ExtensionCommon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionCommon{
    
    
    
    
    @JsonProperty("base_url")
    private String baseUrl;
    
    
    
    
    @JsonProperty("callbacks")
    private Callback callbacks;
    
    
    
    
    @JsonProperty("contact_email")
    private String contactEmail;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("developed_by_name")
    private String developedByName;
    
    
    
    
    @JsonProperty("ext_version")
    private String extVersion;
    
    
    
    
    @JsonProperty("extention_type")
    private String extentionType;
    
    
    
    
    @JsonProperty("is_application_level")
    private Boolean isApplicationLevel;
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("is_saleschannel")
    private Boolean isSaleschannel;
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
}


/*
    Model: ExtensionList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionList{
    
    
    
    
    @JsonProperty("items")
    private List<ExtensionItems> items;
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
}


/*
    Model: ExtensionItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionItems{
    
    
    
    
    @JsonProperty("base_url")
    private String baseUrl;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("developed_by_name")
    private String developedByName;
    
    
    
    
    @JsonProperty("ext_version")
    private String extVersion;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("extention_type")
    private String extentionType;
    
    
    
    
    @JsonProperty("installed")
    private Boolean installed;
    
    
    
    
    @JsonProperty("is_saleschannel")
    private Boolean isSaleschannel;
    
    
    
    
    @JsonProperty("launch_url")
    private String launchUrl;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo")
    private Logo logo;
    
    
    
    
    @JsonProperty("scope")
    private List<Scope> scope;
    
    
    
}


/*
    Model: Scope
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Scope{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("current")
    private Double current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Double itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ExtensionSuggestionList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionSuggestionList{
    
    
    
    
    @JsonProperty("items")
    private List<ExtensionSuggestion> items;
    
    
    
}


/*
    Model: OrganizationBasicInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationBasicInfo{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: ExtensionSuggestion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionSuggestion{
    
    
    
    
    @JsonProperty("listing_info")
    private ListingInfo listingInfo;
    
    
    
    
    @JsonProperty("organization")
    private OrganizationBasicInfo organization;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("plans")
    private List<Plan> plans;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: Plan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Plan{
    
    
    
    
    @JsonProperty("additional_charges")
    private String additionalCharges;
    
    
    
    
    @JsonProperty("features")
    private String features;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
}


/*
    Model: ListingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListingInfo{
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tagline")
    private String tagline;
    
    
    
    
    @JsonProperty("keywords")
    private List<String> keywords;
    
    
    
}


/*
    Model: Callback
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Callback{
    
    
    
    
    @JsonProperty("auth")
    private String auth;
    
    
    
    
    @JsonProperty("auto_install")
    private String autoInstall;
    
    
    
    
    @JsonProperty("install")
    private String install;
    
    
    
    
    @JsonProperty("setup")
    private String setup;
    
    
    
    
    @JsonProperty("uninstall")
    private String uninstall;
    
    
    
}


/*
    Model: Logo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Logo{
    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
}


/*
    Model: Category
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Category{
    
    
    
    
    @JsonProperty("category_l1")
    private List<CategoryL1> categoryL1;
    
    
    
    
    @JsonProperty("category_l2")
    private List<CategoryL2> categoryL2;
    
    
    
}


/*
    Model: CommingSoon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommingSoon{
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("upvote_count")
    private Double upvoteCount;
    
    
    
}


/*
    Model: ContactInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactInfo{
    
    
    
    
    @JsonProperty("support")
    private Support support;
    
    
    
}


/*
    Model: Benefits
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Benefits{
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: Screenshots
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Screenshots{
    
    
    
    
    @JsonProperty("desktop")
    private List<String> desktop;
    
    
    
    
    @JsonProperty("mobile")
    private List<String> mobile;
    
    
    
}


/*
    Model: ExtensionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionDetails{
    
    
    
    
    @JsonProperty("benefits")
    private List<Benefits> benefits;
    
    
    
    
    @JsonProperty("demo_url")
    private String demoUrl;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("integration")
    private List<String> integration;
    
    
    
    
    @JsonProperty("video_url")
    private List<Object> videoUrl;
    
    
    
    
    @JsonProperty("youtube")
    private List<String> youtube;
    
    
    
    
    @JsonProperty("screenshots")
    private Screenshots screenshots;
    
    
    
}


/*
    Model: Plans
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Plans{
    
    
    
    
    @JsonProperty("additional_charges")
    private String additionalCharges;
    
    
    
    
    @JsonProperty("features")
    private String features;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: PublicExtension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PublicExtension{
    
    
    
    
    @JsonProperty("category")
    private Category category;
    
    
    
    
    @JsonProperty("coming_soon")
    private CommingSoon comingSoon;
    
    
    
    
    @JsonProperty("contact_info")
    private ContactInfo contactInfo;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("details")
    private ExtensionDetails details;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("listing_info")
    private ListingInfo listingInfo;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("organization")
    private OrganizationBasicInfo organization;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("plan_type")
    private String planType;
    
    
    
    
    @JsonProperty("plans")
    private List<Plans> plans;
    
    
    
    
    @JsonProperty("plans_url")
    private String plansUrl;
    
    
    
    
    @JsonProperty("review_instructions")
    private String reviewInstructions;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CategoryL1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryL1{
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("level")
    private Double level;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CategoryL2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryL2{
    
    
    
    
    @JsonProperty("parent")
    private String parent;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("level")
    private Double level;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: Support
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Support{
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("faq_url")
    private String faqUrl;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("privacy_policy_url")
    private String privacyPolicyUrl;
    
    
    
    
    @JsonProperty("website_url")
    private String websiteUrl;
    
    
    
}


/*
    Model: Price
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Price{
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: UninstallExtension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UninstallExtension{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SubscriptionRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionRequest{
    
    
    
    
    @JsonProperty("approved")
    private String approved;
    
    
    
    
    @JsonProperty("client_id")
    private String clientId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("credit_balance")
    private String creditBalance;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: SubscriptionRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionRes{
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
}


/*
    Model: PartnerInviteDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PartnerInviteDetails{
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("approved_permissions")
    private ApprovedPermissions approvedPermissions;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("organization_name")
    private String organizationName;
    
    
    
    
    @JsonProperty("request_status")
    private String requestStatus;
    
    
    
    
    @JsonProperty("requested_permissions")
    private RequestedPermissions requestedPermissions;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: ApprovedPermissions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApprovedPermissions{
    
    
    
    
    @JsonProperty("application_role")
    private List<String> applicationRole;
    
    
    
    
    @JsonProperty("company_permissions")
    private List<String> companyPermissions;
    
    
    
    
    @JsonProperty("company_role")
    private List<String> companyRole;
    
    
    
}


/*
    Model: RequestedPermissions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RequestedPermissions{
    
    
    
    
    @JsonProperty("application_permissions")
    private List<String> applicationPermissions;
    
    
    
    
    @JsonProperty("application_role")
    private List<String> applicationRole;
    
    
    
    
    @JsonProperty("company_permissions")
    private List<String> companyPermissions;
    
    
    
    
    @JsonProperty("company_role")
    private List<String> companyRole;
    
    
    
}


/*
    Model: ModifyPartnerReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ModifyPartnerReq{
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("approved_permissions")
    private ApprovedPermissionsInfo approvedPermissions;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("organization_name")
    private String organizationName;
    
    
    
    
    @JsonProperty("request_status")
    private String requestStatus;
    
    
    
    
    @JsonProperty("requested_permissions")
    private RequestedPermissions requestedPermissions;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: ApprovedPermissionsInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApprovedPermissionsInfo{
    
    
    
    
    @JsonProperty("application_permissions")
    private HashMap<String,ApplicationPermissions> applicationPermissions;
    
    
    
    
    @JsonProperty("company_permissions")
    private List<String> companyPermissions;
    
    
    
}


/*
    Model: ApplicationPermissions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationPermissions{
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("roles")
    private List<String> roles;
    
    
    
}


/*
    Model: PartnerRequestList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PartnerRequestList{
    
    
    
    
    @JsonProperty("items")
    private PartnerList items;
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
}


/*
    Model: PartnerList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PartnerList{
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("approved_permissions")
    private ApprovedPermissionsInfo approvedPermissions;
    
    
    
    
    @JsonProperty("approver_id")
    private String approverId;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("organization_id")
    private String organizationId;
    
    
    
    
    @JsonProperty("organization_name")
    private String organizationName;
    
    
    
    
    @JsonProperty("request_status")
    private String requestStatus;
    
    
    
    
    @JsonProperty("requested_permissions")
    private RequestedPermissions requestedPermissions;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: SetupProductRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetupProductRes{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("next_step")
    private Double nextStep;
    
    
    
    
    @JsonProperty("cli_wait_time")
    private Double cliWaitTime;
    
    
    
}


/*
    Model: AddProxyReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProxyReq{
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
}


/*
    Model: AddProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProxyResponse{
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: getProxyPathRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class getProxyPathRes{
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
    
    @JsonProperty("items")
    private List<AddProxyResponse> items;
    
    
    
}


/*
    Model: RemoveProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RemoveProxyResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: APIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class APIError{
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}




}