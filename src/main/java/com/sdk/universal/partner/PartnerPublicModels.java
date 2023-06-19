
package com.sdk.universal.partner;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class PartnerPublicModels{


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
    Model: CategoryCommon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryCommon{
    
    
    
    
    @JsonProperty("category_l1")
    private List<CategoryL1> categoryL1;
    
    
    
    
    @JsonProperty("category_l2")
    private List<CategoryL2> categoryL2;
    
    
    
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
    Model: ExtensionUsingSlug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionUsingSlug{
    
    
    
    
    @JsonProperty("category")
    private CategoryCommon category;
    
    
    
    
    @JsonProperty("contact_info")
    private ContactInfo contactInfo;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("details")
    private Details details;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("is_coming_soon")
    private Boolean isComingSoon;
    
    
    
    
    @JsonProperty("listing_info")
    private ListingInfo listingInfo;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("organization")
    private Organization organization;
    
    
    
    
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
    Model: OrganizationList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrganizationList{
    
    
    
    
    @JsonProperty("items")
    private List<Organization> items;
    
    
    
    
    @JsonProperty("page")
    private Pagination page;
    
    
    
}


/*
    Model: Organization
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Organization{
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("details")
    private String details;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
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
    
    
    
    
    @JsonProperty("keywords")
    private List<String> keywords;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("tagline")
    private String tagline;
    
    
    
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
    Model: Details
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Details{
    
    
    
    
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
    
    
    
    
    @JsonProperty("trial_days")
    private Double trialDays;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("recurring")
    private Recurring recurring;
    
    
    
}


/*
    Model: Recurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Recurring{
    
    
    
    
    @JsonProperty("recurring_time")
    private Double recurringTime;
    
    
    
    
    @JsonProperty("yearly_amount")
    private Double yearlyAmount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("is_of")
    private Double isOf;
    
    
    
    
    @JsonProperty("item_total")
    private Double itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}




}