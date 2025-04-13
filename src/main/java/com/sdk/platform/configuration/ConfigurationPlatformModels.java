

package com.sdk.platform.configuration;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class ConfigurationPlatformModels{


/*
    Model: ApplicationInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationInventory{

    

    
    
    
    
    @JsonProperty("inventory")
    private AppInventoryConfig inventory;
    
    
    
    
    @JsonProperty("authentication")
    private AuthenticationConfig authentication;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    @JsonProperty("order")
    private AppOrderConfig order;
    
    
    
    
    @JsonProperty("logistics")
    private AppLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("pii_masking")
    private PiiMasking piiMasking;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("business")
    private String business;
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
    @JsonProperty("communication")
    private CommunicationConfig communication;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
}


/*
    Model: PiiMasking
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PiiMasking{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: OwnerAppInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OwnerAppInventoryConfig{

    

    
    
    
    
    @JsonProperty("pricing_strategy")
    private PricingStrategy pricingStrategy;
    
    
    
}


/*
    Model: OwnerAppConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OwnerAppConfig{

    

    
    
    
    
    @JsonProperty("inventory")
    private OwnerAppInventoryConfig inventory;
    
    
    
}


/*
    Model: AppInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryConfig{

    

    
    
    
    
    @JsonProperty("brand")
    private InventoryBrand brand;
    
    
    
    
    @JsonProperty("store")
    private InventoryStore store;
    
    
    
    
    @JsonProperty("category")
    private InventoryCategory category;
    
    
    
    
    @JsonProperty("price")
    private InventoryPrice price;
    
    
    
    
    @JsonProperty("discount")
    private InventoryDiscount discount;
    
    
    
    
    @JsonProperty("pricing_strategy")
    private PricingStrategy pricingStrategy;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("only_verified_products")
    private Boolean onlyVerifiedProducts;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("exclude_category")
    private List<Integer> excludeCategory;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("company_store")
    private List<Integer> companyStore;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("enable_zone_overlapping")
    private Boolean enableZoneOverlapping;
    
    
    
    
    @JsonProperty("sort_popular_first")
    private Boolean sortPopularFirst;
    
    
    
}


/*
    Model: InventoryBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBrand{

    

    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: InventoryStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStore{

    

    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
    
    @JsonProperty("rules")
    private List<AppStoreRules> rules;
    
    
    
}


/*
    Model: AppStoreRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppStoreRules{

    

    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: InventoryCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryCategory{

    

    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("categories")
    private List<Integer> categories;
    
    
    
}


/*
    Model: InventoryPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPrice{

    

    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
}


/*
    Model: InventoryDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryDiscount{

    

    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
}


/*
    Model: AuthenticationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthenticationConfig{

    

    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
}


/*
    Model: ArticleAssignmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentConfig{

    

    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRules rules;
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
    @JsonProperty("enforced_stores")
    private List<Integer> enforcedStores;
    
    
    
}


/*
    Model: ArticleAssignmentRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentRules{

    

    
    
    
    
    @JsonProperty("store_priority")
    private StorePriority storePriority;
    
    
    
}


/*
    Model: StorePriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePriority{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("storetype_order")
    private List<Integer> storetypeOrder;
    
    
    
}


/*
    Model: AppCartConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCartConfig{

    

    
    
    
    
    @JsonProperty("delivery_charges")
    private DeliveryCharges deliveryCharges;
    
    
    
    
    @JsonProperty("international_delivery_charges")
    private InternationalDeliveryCharges internationalDeliveryCharges;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("max_cart_items")
    private Integer maxCartItems;
    
    
    
    
    @JsonProperty("min_cart_value")
    private Double minCartValue;
    
    
    
    
    @JsonProperty("bulk_coupons")
    private Boolean bulkCoupons;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
    @JsonProperty("pan_card")
    private PanCardConfig panCard;
    
    
    
}


/*
    Model: InternationalDeliveryCharges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternationalDeliveryCharges{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("charges")
    private List<Charges> charges;
    
    
    
}


/*
    Model: DeliveryCharges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryCharges{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("charges")
    private List<Charges> charges;
    
    
    
}


/*
    Model: Charges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Charges{

    

    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
    @JsonProperty("charges")
    private Double charges;
    
    
    
}


/*
    Model: AppPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppPaymentConfig{

    

    
    
    
    
    @JsonProperty("callback_url")
    private CallbackUrl callbackUrl;
    
    
    
    
    @JsonProperty("methods")
    private Methods methods;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("cod_amount_limit")
    private Double codAmountLimit;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("anonymous_cod")
    private Boolean anonymousCod;
    
    
    
    
    @JsonProperty("user_cod_limit")
    private Double userCodLimit;
    
    
    
}


/*
    Model: CallbackUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CallbackUrl{

    

    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("web")
    private String web;
    
    
    
}


/*
    Model: Methods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Methods{

    

    
    
    
    
    @JsonProperty("pl")
    private PaymentModeConfig pl;
    
    
    
    
    @JsonProperty("card")
    private PaymentModeConfig card;
    
    
    
    
    @JsonProperty("nb")
    private PaymentModeConfig nb;
    
    
    
    
    @JsonProperty("wl")
    private PaymentModeConfig wl;
    
    
    
    
    @JsonProperty("ps")
    private PaymentModeConfig ps;
    
    
    
    
    @JsonProperty("upi")
    private PaymentModeConfig upi;
    
    
    
    
    @JsonProperty("qr")
    private PaymentModeConfig qr;
    
    
    
    
    @JsonProperty("cod")
    private PaymentModeConfig cod;
    
    
    
    
    @JsonProperty("pp")
    private PaymentModeConfig pp;
    
    
    
    
    @JsonProperty("jp")
    private PaymentModeConfig jp;
    
    
    
    
    @JsonProperty("pac")
    private PaymentModeConfig pac;
    
    
    
    
    @JsonProperty("fc")
    private PaymentModeConfig fc;
    
    
    
    
    @JsonProperty("jiopp")
    private PaymentModeConfig jiopp;
    
    
    
    
    @JsonProperty("stripepg")
    private PaymentModeConfig stripepg;
    
    
    
    
    @JsonProperty("juspaypg")
    private PaymentModeConfig juspaypg;
    
    
    
    
    @JsonProperty("payubizpg")
    private PaymentModeConfig payubizpg;
    
    
    
    
    @JsonProperty("payumoneypg")
    private PaymentModeConfig payumoneypg;
    
    
    
    
    @JsonProperty("rupifipg")
    private PaymentModeConfig rupifipg;
    
    
    
    
    @JsonProperty("simpl")
    private PaymentModeConfig simpl;
    
    
    
}


/*
    Model: PaymentModeConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: PaymentSelectionLock
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSelectionLock{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
}


/*
    Model: AppOrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppOrderConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("force_reassignment")
    private Boolean forceReassignment;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AppLogisticsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppLogisticsConfig{

    

    
    
    
    
    @JsonProperty("logistics_by_seller")
    private Boolean logisticsBySeller;
    
    
    
    
    @JsonProperty("serviceability_check")
    private Boolean serviceabilityCheck;
    
    
    
    
    @JsonProperty("same_day_delivery")
    private Boolean sameDayDelivery;
    
    
    
    
    @JsonProperty("dp_assignment")
    private Boolean dpAssignment;
    
    
    
}


/*
    Model: LoyaltyPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoyaltyPointsConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
}


/*
    Model: AppInventoryPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryPartialUpdate{

    

    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
    @JsonProperty("communication")
    private CommunicationConfig communication;
    
    
    
}


/*
    Model: BrandCompanyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandCompanyInfo{

    

    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: CompanyByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyByBrandsRequest{

    

    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
}


/*
    Model: CompanyByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyByBrandsResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<BrandCompanyInfo> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: StoreByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreByBrandsRequest{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
}


/*
    Model: StoreByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreByBrandsResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<BrandStoreInfo> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: BrandStoreInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandStoreInfo{

    

    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("store_address")
    private OptedStoreAddress storeAddress;
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
}


/*
    Model: CompanyBrandInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandInfo{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("brand_logo_url")
    private String brandLogoUrl;
    
    
    
    
    @JsonProperty("brand_banner_url")
    private String brandBannerUrl;
    
    
    
    
    @JsonProperty("brand_banner_portrait_url")
    private String brandBannerPortraitUrl;
    
    
    
}


/*
    Model: BrandsByCompanyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandsByCompanyResponse{

    

    
    
    
    
    @JsonProperty("brands")
    private List<CompanyBrandInfo> brands;
    
    
    
}


/*
    Model: ValidationFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidationFailedResponse{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private List<Object> errors;
    
    
    
}


/*
    Model: NotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotFound{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CommunicationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommunicationConfig{

    

    
    
    
    
    @JsonProperty("email")
    private CommsConfig email;
    
    
    
    
    @JsonProperty("sms")
    private CommsConfig sms;
    
    
    
    
    @JsonProperty("voice")
    private CommsConfig voice;
    
    
    
}


/*
    Model: CommsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommsConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: PanCardConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PanCardConfig{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("cod_threshold_amount")
    private Double codThresholdAmount;
    
    
    
    
    @JsonProperty("online_threshold_amount")
    private Double onlineThresholdAmount;
    
    
    
}


/*
    Model: CreateApplicationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateApplicationRequest{

    

    
    
    
    
    @JsonProperty("app")
    private App app;
    
    
    
    
    @JsonProperty("configuration")
    private ApplicationInventory configuration;
    
    
    
    
    @JsonProperty("domain")
    private AppDomain domain;
    
    
    
}


/*
    Model: CreateAppResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAppResponse{

    

    
    
    
    
    @JsonProperty("app")
    private Application app;
    
    
    
    
    @JsonProperty("configuration")
    private ApplicationInventory configuration;
    
    
    
}


/*
    Model: ApplicationsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationsResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<Application> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: MobileAppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileAppConfiguration{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
}


/*
    Model: LandingImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingImage{

    

    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: SplashImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SplashImage{

    

    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: MobileAppConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileAppConfigRequest{

    

    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: BuildVersionHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuildVersionHistory{

    

    
    
    
    
    @JsonProperty("versions")
    private List<BuildVersion> versions;
    
    
    
    
    @JsonProperty("latest_available_version_name")
    private String latestAvailableVersionName;
    
    
    
}


/*
    Model: BuildVersion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuildVersion{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    @JsonProperty("build_status")
    private String buildStatus;
    
    
    
    
    @JsonProperty("version_name")
    private String versionName;
    
    
    
    
    @JsonProperty("version_code")
    private Integer versionCode;
    
    
    
    
    @JsonProperty("download_url")
    private LandingImage downloadUrl;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: AppSupportedCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppSupportedCurrency{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("supported_currency")
    private List<String> supportedCurrency;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: DefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultCurrency{

    

    
    
    
    
    @JsonProperty("ref")
    private String ref;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: DomainAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainAdd{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("txt_records")
    private List<String> txtRecords;
    
    
    
}


/*
    Model: DomainAddRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainAddRequest{

    

    
    
    
    
    @JsonProperty("domain")
    private DomainAdd domain;
    
    
    
}


/*
    Model: Domain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Domain{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
    
    @JsonProperty("is_predefined")
    private Boolean isPredefined;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DomainsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainsResponse{

    

    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
}


/*
    Model: UpdateDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDomain{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
}


/*
    Model: UpdateDomainTypeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDomainTypeRequest{

    

    
    
    
    
    @JsonProperty("domain")
    private UpdateDomain domain;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
}


/*
    Model: DomainStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatusRequest{

    

    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
}


/*
    Model: DomainStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatus{

    

    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: DomainStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatusResponse{

    

    
    
    
    
    @JsonProperty("connected")
    private Boolean connected;
    
    
    
    
    @JsonProperty("status")
    private List<DomainStatus> status;
    
    
    
}


/*
    Model: DomainSuggestionsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestionsRequest{

    

    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
}


/*
    Model: DomainSuggestion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestion{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("unsupported")
    private Boolean unsupported;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: DomainSuggestionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestionsResponse{

    

    
    
    
    
    @JsonProperty("domains")
    private List<DomainSuggestion> domains;
    
    
    
}


/*
    Model: SuccessMessageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessMessageResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: GetIntegrationsOptInsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetIntegrationsOptInsResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<IntegrationOptIn> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: IntegrationOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationOptIn{

    

    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    @JsonProperty("constants")
    private String constants;
    
    
    
    
    @JsonProperty("companies")
    private List<String> companies;
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("hidden")
    private Boolean hidden;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: Validators
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validators{

    

    
    
    
    
    @JsonProperty("company")
    private CompanyValidator company;
    
    
    
    
    @JsonProperty("store")
    private StoreValidator store;
    
    
    
    
    @JsonProperty("inventory")
    private InventoryValidator inventory;
    
    
    
    
    @JsonProperty("order")
    private OrderValidator order;
    
    
    
}


/*
    Model: CompanyValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyValidator{

    

    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
}


/*
    Model: JsonSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JsonSchema{

    

    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tooltip")
    private String tooltip;
    
    
    
}


/*
    Model: StoreValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreValidator{

    

    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
}


/*
    Model: InventoryValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryValidator{

    

    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
}


/*
    Model: OrderValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderValidator{

    

    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
}


/*
    Model: IntegrationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationMeta{

    

    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: Integration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Integration{

    

    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    @JsonProperty("constants")
    private Object constants;
    
    
    
    
    @JsonProperty("companies")
    private List<String> companies;
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("hidden")
    private Boolean hidden;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: IntegrationConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationConfigResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
}


/*
    Model: IntegrationLevel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationLevel{

    

    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<Object> permissions;
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: UpdateIntegrationLevelRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateIntegrationLevelRequest{

    

    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
}


/*
    Model: OptedStoreIntegration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStoreIntegration{

    

    
    
    
    
    @JsonProperty("other_opted")
    private Boolean otherOpted;
    
    
    
    
    @JsonProperty("other_integration")
    private IntegrationOptIn otherIntegration;
    
    
    
    
    @JsonProperty("other_entity")
    private OtherEntity otherEntity;
    
    
    
}


/*
    Model: OtherEntity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherEntity{

    

    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("data")
    private OtherEntityData data;
    
    
    
    
    @JsonProperty("meta")
    private List<Object> meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: LastPatch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LastPatch{

    

    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: OtherEntityData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherEntityData{

    

    
    
    
    
    @JsonProperty("article_identifier")
    private String articleIdentifier;
    
    
    
}


/*
    Model: App
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class App{

    

    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("desc")
    private String desc;
    
    
    
}


/*
    Model: InventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryConfig{

    

    
    
    
    
    @JsonProperty("brand")
    private InventoryBrandRule brand;
    
    
    
    
    @JsonProperty("store")
    private InventoryStoreRule store;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("only_verified_products")
    private Boolean onlyVerifiedProducts;
    
    
    
    
    @JsonProperty("pricing_strategy")
    private PricingStrategy pricingStrategy;
    
    
    
}


/*
    Model: AppInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventory{

    

    
    
    
    
    @JsonProperty("inventory")
    private InventoryConfig inventory;
    
    
    
    
    @JsonProperty("payment")
    private InventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("article_assignment")
    private InventoryArticleAssignment articleAssignment;
    
    
    
}


/*
    Model: AppDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppDomain{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CompaniesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompaniesResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<AppInventoryCompanies> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: AppInventoryCompanies
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryCompanies{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
}


/*
    Model: StoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoresResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<AppInventoryStores> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ListStoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListStoreResponse{

    

    
    
    
    
    @JsonProperty("stores")
    private List<AppInventoryStores> stores;
    
    
    
}


/*
    Model: ArrayStoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArrayStoreResponse{

    

    
    
    
    
    @JsonProperty("data")
    private List<AppInventoryStores> data;
    
    
    
}


/*
    Model: AppInventoryStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryStores{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("address")
    private HashMap<String,Object> address;
    
    
    
    
    @JsonProperty("integration_type")
    private HashMap<String,Object> integrationType;
    
    
    
}


/*
    Model: FilterOrderingStoreRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterOrderingStoreRequest{

    

    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("q")
    private String q;
    
    
    
}


/*
    Model: DeploymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeploymentMeta{

    

    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: OrderingStoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoreConfig{

    

    
    
    
    
    @JsonProperty("deployment_meta")
    private DeploymentMeta deploymentMeta;
    
    
    
}


/*
    Model: OrderingStoreSelectRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoreSelectRequest{

    

    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreSelect orderingStore;
    
    
    
}


/*
    Model: OrderingStoreSelect
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoreSelect{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: OtherSellerCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerCompany{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: OtherSellerApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerApplication{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("company")
    private OtherSellerCompany company;
    
    
    
    
    @JsonProperty("opt_type")
    private String optType;
    
    
    
}


/*
    Model: OtherSellerApplications
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerApplications{

    

    
    
    
    
    @JsonProperty("items")
    private List<OtherSellerApplication> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: OptedApplicationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedApplicationResponse{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
    
    @JsonProperty("opted_inventory")
    private OptedInventory optedInventory;
    
    
    
    
    @JsonProperty("opt_out_inventory")
    private OptOutInventory optOutInventory;
    
    
    
}


/*
    Model: OptedCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedCompany{

    

    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: OptedInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedInventory{

    

    
    
    
    
    @JsonProperty("opt_type")
    private OptType optType;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
}


/*
    Model: OptType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptType{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: OptedStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStore{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: OptOutInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptOutInventory{

    

    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    @JsonProperty("company")
    private List<Integer> company;
    
    
    
}


/*
    Model: TokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TokenResponse{

    

    
    
    
    
    @JsonProperty("tokens")
    private Tokens tokens;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: Tokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tokens{

    

    
    
    
    
    @JsonProperty("firebase")
    private Firebase firebase;
    
    
    
    
    @JsonProperty("moengage")
    private Moengage moengage;
    
    
    
    
    @JsonProperty("segment")
    private Segment segment;
    
    
    
    
    @JsonProperty("gtm")
    private Gtm gtm;
    
    
    
    
    @JsonProperty("freshchat")
    private Freshchat freshchat;
    
    
    
    
    @JsonProperty("safetynet")
    private Safetynet safetynet;
    
    
    
    
    @JsonProperty("fynd_rewards")
    private FyndRewards fyndRewards;
    
    
    
    
    @JsonProperty("google_map")
    private GoogleMap googleMap;
    
    
    
}


/*
    Model: Firebase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Firebase{

    

    
    
    
    
    @JsonProperty("credentials")
    private Credentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: Credentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Credentials{

    

    
    
    
    
    @JsonProperty("ios")
    private Ios ios;
    
    
    
    
    @JsonProperty("android")
    private Android android;
    
    
    
    
    @JsonProperty("project_id")
    @Getter(AccessLevel.NONE)
    private String projectId_b64;

    public String getProject_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.projectId_b64));
    }
    
    
    
    
    @JsonProperty("gcm_sender_id")
    @Getter(AccessLevel.NONE)
    private String gcmSenderId_b64;

    public String getGcm_sender_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.gcmSenderId_b64));
    }
    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Ios
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ios{

    

    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Android
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Android{

    

    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Moengage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Moengage{

    

    
    
    
    
    @JsonProperty("credentials")
    private MoengageCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: MoengageCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MoengageCredentials{

    

    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: Segment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Segment{

    

    
    
    
    
    @JsonProperty("credentials")
    private SegmentCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SegmentCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SegmentCredentials{

    

    
    
    
    
    @JsonProperty("write_key")
    @Getter(AccessLevel.NONE)
    private String writeKey_b64;

    public String getWrite_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.writeKey_b64));
    }
    
    
    
}


/*
    Model: Gtm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Gtm{

    

    
    
    
    
    @JsonProperty("credentials")
    private GtmCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: GtmCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GtmCredentials{

    

    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Freshchat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Freshchat{

    

    
    
    
    
    @JsonProperty("credentials")
    private FreshchatCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: FreshchatCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreshchatCredentials{

    

    
    
    
    
    @JsonProperty("app_id")
    @Getter(AccessLevel.NONE)
    private String appId_b64;

    public String getApp_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.appId_b64));
    }
    
    
    
    
    @JsonProperty("app_key")
    @Getter(AccessLevel.NONE)
    private String appKey_b64;

    public String getApp_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.appKey_b64));
    }
    
    
    
    
    @JsonProperty("web_token")
    @Getter(AccessLevel.NONE)
    private String webToken_b64;

    public String getWeb_token_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.webToken_b64));
    }
    
    
    
}


/*
    Model: Safetynet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Safetynet{

    

    
    
    
    
    @JsonProperty("credentials")
    private SafetynetCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SafetynetCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SafetynetCredentials{

    

    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: FyndRewards
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndRewards{

    

    
    
    
    
    @JsonProperty("credentials")
    private FyndRewardsCredentials credentials;
    
    
    
}


/*
    Model: FyndRewardsCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndRewardsCredentials{

    

    
    
    
    
    @JsonProperty("public_key")
    @Getter(AccessLevel.NONE)
    private String publicKey_b64;

    public String getPublic_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.publicKey_b64));
    }
    
    
    
    
    @JsonProperty("private_key")
    @Getter(AccessLevel.NONE)
    private String privateKey_b64;

    public String getPrivate_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.privateKey_b64));
    }
    
    
    
}


/*
    Model: GoogleMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GoogleMap{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("credentials")
    private GoogleMapCredentials credentials;
    
    
    
}


/*
    Model: GoogleMapCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GoogleMapCredentials{

    

    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: RewardPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardPointsConfig{

    

    
    
    
    
    @JsonProperty("credit")
    private Credit credit;
    
    
    
    
    @JsonProperty("debit")
    private Debit debit;
    
    
    
}


/*
    Model: Credit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Credit{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: Debit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Debit{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    @JsonProperty("strategy_channel")
    private String strategyChannel;
    
    
    
}


/*
    Model: ProductDetailFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailFeature{

    

    
    
    
    
    @JsonProperty("similar")
    private List<String> similar;
    
    
    
    
    @JsonProperty("seller_selection")
    private Boolean sellerSelection;
    
    
    
    
    @JsonProperty("update_product_meta")
    private Boolean updateProductMeta;
    
    
    
    
    @JsonProperty("request_product")
    private Boolean requestProduct;
    
    
    
}


/*
    Model: LaunchPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LaunchPage{

    

    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
}


/*
    Model: LandingPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPageFeature{

    

    
    
    
    
    @JsonProperty("launch_page")
    private LaunchPage launchPage;
    
    
    
    
    @JsonProperty("continue_as_guest")
    private Boolean continueAsGuest;
    
    
    
    
    @JsonProperty("login_btn_text")
    private String loginBtnText;
    
    
    
    
    @JsonProperty("show_domain_textbox")
    private Boolean showDomainTextbox;
    
    
    
    
    @JsonProperty("show_register_btn")
    private Boolean showRegisterBtn;
    
    
    
}


/*
    Model: ListingPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListingPageFeature{

    

    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
}


/*
    Model: RegistrationPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegistrationPageFeature{

    

    
    
    
    
    @JsonProperty("ask_store_address")
    private Boolean askStoreAddress;
    
    
    
}


/*
    Model: AppFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeature{

    

    
    
    
    
    @JsonProperty("product_detail")
    private ProductDetailFeature productDetail;
    
    
    
    
    @JsonProperty("landing_page")
    private LandingPageFeature landingPage;
    
    
    
    
    @JsonProperty("registration_page")
    private RegistrationPageFeature registrationPage;
    
    
    
    
    @JsonProperty("home_page")
    private HomePageFeature homePage;
    
    
    
    
    @JsonProperty("common")
    private CommonFeature common;
    
    
    
    
    @JsonProperty("cart")
    private CartFeature cart;
    
    
    
    
    @JsonProperty("qr")
    private QrFeature qr;
    
    
    
    
    @JsonProperty("pcr")
    private PcrFeature pcr;
    
    
    
    
    @JsonProperty("order")
    private OrderFeature order;
    
    
    
    
    @JsonProperty("buybox")
    private BuyboxFeature buybox;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("pricing_strategy")
    private PricingStrategy pricingStrategy;
    
    
    
}


/*
    Model: HomePageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HomePageFeature{

    

    
    
    
    
    @JsonProperty("order_processing")
    private Boolean orderProcessing;
    
    
    
}


/*
    Model: CommonFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonFeature{

    

    
    
    
    
    @JsonProperty("communication_optin_dialog")
    private CommunicationOptinDialogFeature communicationOptinDialog;
    
    
    
    
    @JsonProperty("deployment_store_selection")
    private DeploymentStoreSelectionFeature deploymentStoreSelection;
    
    
    
    
    @JsonProperty("listing_price")
    private ListingPriceFeature listingPrice;
    
    
    
    
    @JsonProperty("listing_page")
    private ListingPageFeature listingPage;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyFeature currency;
    
    
    
    
    @JsonProperty("revenue_engine")
    private RevenueEngineFeature revenueEngine;
    
    
    
    
    @JsonProperty("feedback")
    private FeedbackFeature feedback;
    
    
    
    
    @JsonProperty("compare_products")
    private CompareProductsFeature compareProducts;
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    @JsonProperty("international_shipping")
    private InternationalShipping internationalShipping;
    
    
    
}


/*
    Model: InternationalShipping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternationalShipping{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CommunicationOptinDialogFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommunicationOptinDialogFeature{

    

    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
}


/*
    Model: DeploymentStoreSelectionFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeploymentStoreSelectionFeature{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ListingPriceFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListingPriceFeature{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
}


/*
    Model: CurrencyFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrencyFeature{

    

    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("default_currency")
    private String defaultCurrency;
    
    
    
}


/*
    Model: RevenueEngineFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RevenueEngineFeature{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: FeedbackFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FeedbackFeature{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CompareProductsFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompareProductsFeature{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CartFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartFeature{

    

    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    @JsonProperty("google_map")
    private Boolean googleMap;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
}


/*
    Model: QrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QrFeature{

    

    
    
    
    
    @JsonProperty("application")
    private Boolean application;
    
    
    
    
    @JsonProperty("products")
    private Boolean products;
    
    
    
    
    @JsonProperty("collections")
    private Boolean collections;
    
    
    
}


/*
    Model: PcrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PcrFeature{

    

    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
}


/*
    Model: OrderFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderFeature{

    

    
    
    
    
    @JsonProperty("buy_again")
    private Boolean buyAgain;
    
    
    
}


/*
    Model: BuyboxFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyboxFeature{

    

    
    
    
    
    @JsonProperty("show_name")
    private Boolean showName;
    
    
    
    
    @JsonProperty("enable_selection")
    private Boolean enableSelection;
    
    
    
    
    @JsonProperty("is_seller_buybox_enabled")
    private Boolean isSellerBuyboxEnabled;
    
    
    
}


/*
    Model: AppFeatureRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeatureRequest{

    

    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
}


/*
    Model: AppFeatureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeatureResponse{

    

    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
}


/*
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Currency{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("country_name")
    private String countryName;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: ApplicationWebsite
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationWebsite{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
}


/*
    Model: ApplicationCors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCors{

    

    
    
    
    
    @JsonProperty("domains")
    private List<String> domains;
    
    
    
}


/*
    Model: ApplicationAuth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationAuth{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: ApplicationRedirections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationRedirections{

    

    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ApplicationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationMeta{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: SecureUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SecureUrl{

    

    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: Application
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Application{

    

    
    
    
    
    @JsonProperty("website")
    private ApplicationWebsite website;
    
    
    
    
    @JsonProperty("cors")
    private ApplicationCors cors;
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("cache_ttl")
    private Integer cacheTtl;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("redirections")
    private List<ApplicationRedirections> redirections;
    
    
    
    
    @JsonProperty("meta")
    private List<ApplicationMeta> meta;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    @JsonProperty("app_type")
    private String appType;
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("tokens")
    private List<TokenSchema> tokens;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
}


/*
    Model: TokenSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TokenSchema{

    

    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_by")
    private HashMap<String,Object> createdBy;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: InvalidPayloadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidPayloadRequest{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("domain")
    private Object domain;
    
    
    
}


/*
    Model: InventoryBrandRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBrandRule{

    

    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: PricingStrategy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PricingStrategy{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: StoreCriteriaRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreCriteriaRule{

    

    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: InventoryStoreRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStoreRule{

    

    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("rules")
    private List<StoreCriteriaRule> rules;
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
}


/*
    Model: InventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPaymentConfig{

    

    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: StorePriorityRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePriorityRule{

    

    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("storetype_order")
    private List<String> storetypeOrder;
    
    
    
}


/*
    Model: ArticleAssignmentRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentRule{

    

    
    
    
    
    @JsonProperty("store_priority")
    private StorePriorityRule storePriority;
    
    
    
}


/*
    Model: InventoryArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryArticleAssignment{

    

    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRule rules;
    
    
    
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
    Model: ApplicationInformation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationInformation{

    

    
    
    
    
    @JsonProperty("address")
    private InformationAddress address;
    
    
    
    
    @JsonProperty("support")
    private InformationSupport support;
    
    
    
    
    @JsonProperty("social_links")
    private SocialLinks socialLinks;
    
    
    
    
    @JsonProperty("links")
    private List<Links> links;
    
    
    
    
    @JsonProperty("copyright_text")
    private String copyrightText;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("business_highlights")
    private List<BusinessHighlights> businessHighlights;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: InformationAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationAddress{

    

    
    
    
    
    @JsonProperty("loc")
    private InformationLoc loc;
    
    
    
    
    @JsonProperty("address_line")
    private List<String> addressLine;
    
    
    
    
    @JsonProperty("phone")
    private List<InformationPhone> phone;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
}


/*
    Model: InformationPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationPhone{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
}


/*
    Model: InformationLoc
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationLoc{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("coordinates")
    private List<Integer> coordinates;
    
    
    
}


/*
    Model: InformationSupport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationSupport{

    

    
    
    
    
    @JsonProperty("phone")
    private List<InformationSupportPhone> phone;
    
    
    
    
    @JsonProperty("email")
    private List<InformationSupportEmail> email;
    
    
    
    
    @JsonProperty("timing")
    private String timing;
    
    
    
}


/*
    Model: InformationSupportPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationSupportPhone{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: InformationSupportEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationSupportEmail{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: SocialLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SocialLinks{

    

    
    
    
    
    @JsonProperty("facebook")
    private FacebookLink facebook;
    
    
    
    
    @JsonProperty("instagram")
    private InstagramLink instagram;
    
    
    
    
    @JsonProperty("twitter")
    private TwitterLink twitter;
    
    
    
    
    @JsonProperty("pinterest")
    private PinterestLink pinterest;
    
    
    
    
    @JsonProperty("google_plus")
    private GooglePlusLink googlePlus;
    
    
    
    
    @JsonProperty("youtube")
    private YoutubeLink youtube;
    
    
    
    
    @JsonProperty("linked_in")
    private LinkedInLink linkedIn;
    
    
    
    
    @JsonProperty("vimeo")
    private VimeoLink vimeo;
    
    
    
    
    @JsonProperty("blog_link")
    private BlogLink blogLink;
    
    
    
}


/*
    Model: FacebookLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FacebookLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: InstagramLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InstagramLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: TwitterLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TwitterLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: PinterestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PinterestLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: GooglePlusLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GooglePlusLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: YoutubeLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class YoutubeLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: LinkedInLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LinkedInLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: VimeoLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VimeoLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: BlogLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogLink{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: Links
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Links{

    

    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: BusinessHighlights
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessHighlights{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
}


/*
    Model: ApplicationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationDetail{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: CurrenciesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrenciesResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<Currency> items;
    
    
    
}


/*
    Model: AppCurrencyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCurrencyResponse{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("supported_currency")
    private List<Currency> supportedCurrency;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
}


/*
    Model: StoreLatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreLatLong{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
}


/*
    Model: OptedStoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStoreAddress{

    

    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("lat_long")
    private StoreLatLong latLong;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
}


/*
    Model: OrderingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStore{

    

    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: OrderingStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStores{

    

    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: UpdateDiealog
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDiealog{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
}


/*
    Model: PlatformVersionRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformVersionRequest{

    

    
    
    
    
    @JsonProperty("app_code_name")
    private String appCodeName;
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("force_version")
    private String forceVersion;
    
    
    
    
    @JsonProperty("latest_version")
    private String latestVersion;
    
    
    
    
    @JsonProperty("is_app_blocked")
    private Boolean isAppBlocked;
    
    
    
    
    @JsonProperty("update_dialog")
    private UpdateDiealog updateDialog;
    
    
    
}


/*
    Model: PlatformVersion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformVersion{

    

    
    
    
    
    @JsonProperty("app_code_name")
    private String appCodeName;
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("force_version")
    private String forceVersion;
    
    
    
    
    @JsonProperty("latest_version")
    private String latestVersion;
    
    
    
    
    @JsonProperty("is_app_blocked")
    private Boolean isAppBlocked;
    
    
    
    
    @JsonProperty("update_dialog")
    private UpdateDiealog updateDialog;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("__v")
    private Double v;
    
    
    
}


/*
    Model: OrderingStoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoresResponse{

    

    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
}


/*
    Model: LocationDefaultLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDefaultLanguage{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LocationDefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDefaultCurrency{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LocationCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationCountry{

    

    
    
    
    
    @JsonProperty("capital")
    private String capital;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("parent")
    private String parent;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("default_currency")
    private LocationDefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("default_language")
    private LocationDefaultLanguage defaultLanguage;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
}


/*
    Model: Locations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Locations{

    

    
    
    
    
    @JsonProperty("items")
    private List<LocationCountry> items;
    
    
    
}


/*
    Model: UrlRedirectionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UrlRedirectionResponse{

    

    
    
    
    
    @JsonProperty("redirections")
    private List<UrlRedirection> redirections;
    
    
    
}


/*
    Model: UrlRedirectionRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UrlRedirectionRequest{

    

    
    
    
    
    @JsonProperty("redirection")
    private UrlRedirection redirection;
    
    
    
}


/*
    Model: UrlRedirection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UrlRedirection{

    

    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: StoreForConfigurationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreForConfigurationRequest{

    

    
    
    
    
    @JsonProperty("conf")
    private List<AppStoreRules> conf;
    
    
    
}


/*
    Model: DomainOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainOptionsResponse{

    

    
    
    
    
    @JsonProperty("domain_types")
    private List<DomainType> domainTypes;
    
    
    
    
    @JsonProperty("network_ips")
    private List<String> networkIps;
    
    
    
    
    @JsonProperty("network_cnames")
    private List<String> networkCnames;
    
    
    
}


/*
    Model: DomainType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainType{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("values")
    private List<DomainValue> values;
    
    
    
}


/*
    Model: DomainValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainValue{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
}


/*
    Model: StoreRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreRequest{

    

    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
}


/*
    Model: StoreResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreResponse{

    

    
    
    
    
    @JsonProperty("data")
    private List<Integer> data;
    
    
    
}




}