

package com.sdk.platform.payment;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class PaymentPlatformModels{


/*
    Model: AggregatorToken
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorToken{

    

    
    
    
    
    @JsonProperty("payment_mode_id")
    private Integer paymentModeId;
    
    
    
    
    @JsonProperty("sub_payment_mode_code")
    private String subPaymentModeCode;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
}


/*
    Model: PaymentGatewayConfigDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigDetails{

    

    
    
    
    
    @JsonProperty("aggregators")
    private List<Object> aggregators;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("excluded_fields")
    private List<String> excludedFields;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("display_fields")
    private List<String> displayFields;
    
    
    
}


/*
    Model: ErrorCodeDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorCodeDescription{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentGatewayConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfig{

    

    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
}


/*
    Model: PaymentGatewayConfigCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigCreation{

    

    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("aggregator_name")
    private PaymentGatewayConfig aggregatorName;
    
    
    
}


/*
    Model: PaymentGatewayToBeReviewed
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayToBeReviewed{

    

    
    
    
    
    @JsonProperty("aggregator")
    private List<String> aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ErrorCodeAndDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorCodeAndDescription{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: HttpErrorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorDetails{

    

    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: IntentAppErrorList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentAppErrorList{

    

    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: ProductCODData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCODData{

    

    
    
    
    
    @JsonProperty("items")
    private HashMap<String,Object> items;
    
    
    
    
    @JsonProperty("cod_charges")
    private CODChargesLimitsDetails codCharges;
    
    
    
}


/*
    Model: CODChargesLimitsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CODChargesLimitsDetails{

    

    
    
    
    
    @JsonProperty("max_cart_value")
    private Double maxCartValue;
    
    
    
    
    @JsonProperty("min_cart_value")
    private Double minCartValue;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
}


/*
    Model: PaymentModeLogo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeLogo{

    

    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
}


/*
    Model: IntentApp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentApp{

    

    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
}


/*
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeList{

    

    
    
    
    
    @JsonProperty("remaining_limit")
    private Double remainingLimit;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("cod_limit_per_order")
    private Double codLimitPerOrder;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("intent_app_error_dict_list")
    private List<IntentAppErrorList> intentAppErrorDictList;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("product_cod_data")
    private ProductCODData productCodData;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("intent_app")
    private List<IntentApp> intentApp;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("compliant_with_tokenisation_guidelines")
    private Boolean compliantWithTokenisationGuidelines;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    @JsonProperty("payment_confirmation_elements")
    private List<PaymentConfirmationElement> paymentConfirmationElements;
    
    
    
}


/*
    Model: PaymentConfirmationElement
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationElement{

    

    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    @JsonProperty("display_label")
    private String displayLabel;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: RootPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RootPaymentMode{

    

    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("save_card")
    private Boolean saveCard;
    
    
    
    
    @JsonProperty("is_pay_by_card_pl")
    private Boolean isPayByCardPl;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
}


/*
    Model: PaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptions{

    

    
    
    
    
    @JsonProperty("payment_option")
    private List<RootPaymentMode> paymentOption;
    
    
    
}


/*
    Model: AggregatorRoute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorRoute{

    

    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("payment_flow_data")
    private HashMap<String,Object> paymentFlowData;
    
    
    
    
    @JsonProperty("payment_flow")
    private String paymentFlow;
    
    
    
    
    @JsonProperty("api_link")
    private String apiLink;
    
    
    
}


/*
    Model: PaymentDefaultSelection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentDefaultSelection{

    

    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("skip")
    private Boolean skip;
    
    
    
}


/*
    Model: PaymentFlow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentFlow{

    

    
    
    
    
    @JsonProperty("bqr_razorpay")
    private AggregatorRoute bqrRazorpay;
    
    
    
    
    @JsonProperty("fynd")
    private AggregatorRoute fynd;
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorRoute razorpay;
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorRoute juspay;
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorRoute simpl;
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorRoute ccavenue;
    
    
    
    
    @JsonProperty("payubiz")
    private AggregatorRoute payubiz;
    
    
    
}


/*
    Model: PaymentOptionAndFlow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionAndFlow{

    

    
    
    
    
    @JsonProperty("payment_option")
    private List<RootPaymentMode> paymentOption;
    
    
    
    
    @JsonProperty("payment_flows")
    private PaymentFlow paymentFlows;
    
    
    
    
    @JsonProperty("payment_default_selection")
    private PaymentDefaultSelection paymentDefaultSelection;
    
    
    
}


/*
    Model: AdvanceObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AdvanceObject{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("time_unit")
    private String timeUnit;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("prepayment_type")
    private String prepaymentType;
    
    
    
    
    @JsonProperty("prepayment_value")
    private Double prepaymentValue;
    
    
    
    
    @JsonProperty("cancellation_type")
    private String cancellationType;
    
    
    
    
    @JsonProperty("refund_time_limit")
    private Double refundTimeLimit;
    
    
    
    
    @JsonProperty("all_prepayment_type")
    private List<String> allPrepaymentType;
    
    
    
    
    @JsonProperty("allow_custom_advance_amount")
    private Boolean allowCustomAdvanceAmount;
    
    
    
}


/*
    Model: SplitObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SplitObject{

    

    
    
    
    
    @JsonProperty("total_number_of_splits")
    private Double totalNumberOfSplits;
    
    
    
    
    @JsonProperty("splits_remaining")
    private Double splitsRemaining;
    
    
    
    
    @JsonProperty("amount_remaining")
    private Double amountRemaining;
    
    
    
}


/*
    Model: AdvancePaymentObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AdvancePaymentObject{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_priority")
    private Double displayPriority;
    
    
    
    
    @JsonProperty("payment_mode_id")
    private Double paymentModeId;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("split")
    private SplitObject split;
    
    
    
    
    @JsonProperty("advance")
    private AdvanceObject advance;
    
    
    
}


/*
    Model: PaymentModeRouteDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeRouteDetails{

    

    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptionAndFlow paymentOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_breakup")
    private HashMap<String,Object> paymentBreakup;
    
    
    
    
    @JsonProperty("advance_payment")
    private List<AdvancePaymentObject> advancePayment;
    
    
    
}


/*
    Model: PaymentOptionsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionsDetails{

    

    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptions paymentOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_breakup")
    private HashMap<String,Object> paymentBreakup;
    
    
    
}


/*
    Model: PayoutCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutCustomer{

    

    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: PayoutMoreAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutMoreAttributes{

    

    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
}


/*
    Model: PayoutAggregator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutAggregator{

    

    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("aggregator_fund_id")
    private Integer aggregatorFundId;
    
    
    
    
    @JsonProperty("payout_details_id")
    private Integer payoutDetailsId;
    
    
    
}


/*
    Model: Payout
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Payout{

    

    
    
    
    
    @JsonProperty("customers")
    private PayoutCustomer customers;
    
    
    
    
    @JsonProperty("more_attributes")
    private PayoutMoreAttributes moreAttributes;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("payouts_aggregators")
    private List<PayoutAggregator> payoutsAggregators;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
}


/*
    Model: PayoutsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutsDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<Payout> items;
    
    
    
}


/*
    Model: PayoutBankDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutBankDetails{

    

    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
}


/*
    Model: PayoutCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutCreation{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("users")
    private HashMap<String,Object> users;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("bank_details")
    private PayoutBankDetails bankDetails;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
}


/*
    Model: PayoutDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutDetails{

    

    
    
    
    
    @JsonProperty("payment_status")
    private String paymentStatus;
    
    
    
    
    @JsonProperty("users")
    private HashMap<String,Object> users;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("bank_details")
    private HashMap<String,Object> bankDetails;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("payouts")
    private HashMap<String,Object> payouts;
    
    
    
}


/*
    Model: UpdatePayoutDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutDetails{

    

    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: UpdatePayoutCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutCreation{

    

    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
}


/*
    Model: DeletePayoutDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeletePayoutDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SubscriptionPaymentMethodDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionPaymentMethodDetails{

    

    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DeleteSubscriptionPaymentMethodDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteSubscriptionPaymentMethodDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SubscriptionConfigDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionConfigDetails{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("config")
    private HashMap<String,Object> config;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentCreation{

    

    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentDetails{

    

    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RefundAccountDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundAccountDetails{

    

    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: NotFoundResourceError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotFoundResourceError{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BankDetailsForOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BankDetailsForOTP{

    

    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("upi")
    private String upi;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsOTPCreation{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("details")
    private BankDetailsForOTP details;
    
    
    
}


/*
    Model: IfscCodeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IfscCodeDetails{

    

    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
}


/*
    Model: OrderBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryDetails{

    

    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: OrderBeneficiaryFetchResults
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryFetchResults{

    

    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
}


/*
    Model: MultiTenderPaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMeta{

    

    
    
    
    
    @JsonProperty("extra_meta")
    private HashMap<String,Object> extraMeta;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_gateway_slug")
    private String paymentGatewaySlug;
    
    
    
}


/*
    Model: MultiTenderPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMethod{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
}


/*
    Model: PaymentConfirmationCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationCreation{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
}


/*
    Model: PaymentConfirmationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationDetails{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CODdata
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CODdata{

    

    
    
    
    
    @JsonProperty("remaining_limit")
    private Integer remainingLimit;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("usages")
    private Integer usages;
    
    
    
}


/*
    Model: CODLimitConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CODLimitConfig{

    

    
    
    
    
    @JsonProperty("storefront")
    private Double storefront;
    
    
    
    
    @JsonProperty("pos")
    private Double pos;
    
    
    
}


/*
    Model: CODPaymentLimitConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CODPaymentLimitConfig{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("usages")
    private Double usages;
    
    
    
    
    @JsonProperty("user_id")
    private Integer userId;
    
    
    
    
    @JsonProperty("merchant_user_id")
    private String merchantUserId;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Integer remainingLimit;
    
    
    
    
    @JsonProperty("limit")
    private CODLimitConfig limit;
    
    
    
}


/*
    Model: GetUserBULimitResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetUserBULimitResponseSchema{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("config")
    private CODPaymentLimitConfig config;
    
    
    
}


/*
    Model: GetUserCODLimitDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetUserCODLimitDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<GetUserBULimitResponseSchema> items;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SetCODForUserCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetCODForUserCreation{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("mobileno")
    private String mobileno;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("merchant_user_id")
    private String merchantUserId;
    
    
    
}


/*
    Model: SetCODOptionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetCODOptionDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentInitializationCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInitializationCreation{

    

    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
}


/*
    Model: PaymentInitializationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInitializationDetails{

    

    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("upi_poll_url")
    private String upiPollUrl;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
}


/*
    Model: PaymentStatusUpdateCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusUpdateCreation{

    

    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;
    
    
    
}


/*
    Model: PaymentStatusUpdateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusUpdateDetails{

    

    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("retry")
    private Boolean retry;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
}


/*
    Model: ResendOrCancelPaymentCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendOrCancelPaymentCreation{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("request_type")
    private String requestType;
    
    
    
}


/*
    Model: LinkStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LinkStatus{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_payment_done")
    private Boolean isPaymentDone;
    
    
    
}


/*
    Model: ResendOrCancelPaymentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendOrCancelPaymentDetails{

    

    
    
    
    
    @JsonProperty("data")
    private LinkStatus data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentStatusBulkHandlerCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusBulkHandlerCreation{

    

    
    
    
    
    @JsonProperty("merchant_order_id")
    private List<String> merchantOrderId;
    
    
    
}


/*
    Model: PaymentObjectList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentObjectList{

    

    
    
    
    
    @JsonProperty("user_object")
    private HashMap<String,Object> userObject;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("collected_by")
    private String collectedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("refund_object")
    private HashMap<String,Object> refundObject;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("aggregator_payment_object")
    private HashMap<String,Object> aggregatorPaymentObject;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("refunded_by")
    private String refundedBy;
    
    
    
    
    @JsonProperty("amount_in_paisa")
    private String amountInPaisa;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("payment_mode_identifier")
    private String paymentModeIdentifier;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("all_status")
    private List<String> allStatus;
    
    
    
}


/*
    Model: PaymentStatusObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusObject{

    

    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("payment_object_list")
    private List<PaymentObjectList> paymentObjectList;
    
    
    
}


/*
    Model: PaymentStatusBulkHandlerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusBulkHandlerDetails{

    

    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("data")
    private List<PaymentStatusObject> data;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
}


/*
    Model: GetOauthUrlDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOauthUrlDetails{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RevokeOAuthToken
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RevokeOAuthToken{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ValidateCustomerCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerCreation{

    

    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    @JsonProperty("delivery_address")
    private HashMap<String,Object> deliveryAddress;
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private Integer transactionAmountInPaise;
    
    
    
    
    @JsonProperty("order_items")
    private List<Object> orderItems;
    
    
    
    
    @JsonProperty("merchant_params")
    private HashMap<String,Object> merchantParams;
    
    
    
    
    @JsonProperty("billing_address")
    private HashMap<String,Object> billingAddress;
    
    
    
}


/*
    Model: ValidateCustomerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: GetPaymentLinkDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentLinkDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
    
    @JsonProperty("payment_link_current_status")
    private String paymentLinkCurrentStatus;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ErrorDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorDescription{

    

    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("payment_transaction_id")
    private String paymentTransactionId;
    
    
    
    
    @JsonProperty("invalid_id")
    private Boolean invalidId;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("cancelled")
    private Boolean cancelled;
    
    
    
}


/*
    Model: ErrorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private ErrorDescription error;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CreatePaymentLinkMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLinkMeta{

    

    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("amount")
    private String amount;
    
    
    
    
    @JsonProperty("assign_card_id")
    private String assignCardId;
    
    
    
}


/*
    Model: CreatePaymentLinkCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLinkCreation{

    

    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("meta")
    private CreatePaymentLinkMeta meta;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("success_redirection_url")
    private String successRedirectionUrl;
    
    
    
    
    @JsonProperty("failure_redirection_url")
    private String failureRedirectionUrl;
    
    
    
    
    @JsonProperty("send_communication")
    private Boolean sendCommunication;
    
    
    
}


/*
    Model: CreatePaymentLinkDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLinkDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
}


/*
    Model: PollingPaymentLinkDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PollingPaymentLinkDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("http_status")
    private Integer httpStatus;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
}


/*
    Model: CancelOrResendPaymentLinkCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelOrResendPaymentLinkCreation{

    

    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
}


/*
    Model: ResendPaymentLinkDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendPaymentLinkDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CancelPaymentLinkDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelPaymentLinkDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: Code
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Code{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: PaymentCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCode{

    

    
    
    
    
    @JsonProperty("networks")
    private String networks;
    
    
    
    
    @JsonProperty("codes")
    private Code codes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("types")
    private String types;
    
    
    
}


/*
    Model: GetPaymentCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentCode{

    

    
    
    
    
    @JsonProperty("method_code")
    private PaymentCode methodCode;
    
    
    
}


/*
    Model: GetPaymentCodeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentCodeDetails{

    

    
    
    
    
    @JsonProperty("data")
    private GetPaymentCode data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PlatformPaymentModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformPaymentModeDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("device")
    private String device;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("items")
    private List<PaymentModeItems> items;
    
    
    
}


/*
    Model: PaymentModeItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeItems{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("short_code")
    private String shortCode;
    
    
    
    
    @JsonProperty("logos")
    private LogoSet logos;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("sub_payment_mode")
    private List<SubPaymentMode> subPaymentMode;
    
    
    
    
    @JsonProperty("is_active_at_pg")
    private Boolean isActiveAtPg;
    
    
    
    
    @JsonProperty("fulfillment_options")
    private HashMap<String,Object> fulfillmentOptions;
    
    
    
}


/*
    Model: SubPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubPaymentMode{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("logos")
    private LogoSet logos;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active_at_pg")
    private Boolean isActiveAtPg;
    
    
    
}


/*
    Model: LogoSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogoSet{

    

    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
}


/*
    Model: PlatformLogoSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformLogoSet{

    

    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
}


/*
    Model: PlatformConfigPaymentModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformConfigPaymentModeDetails{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("device")
    private String device;
    
    
    
    
    @JsonProperty("fulfillment_options")
    private HashMap<String,Object> fulfillmentOptions;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("items")
    private List<PlatformPaymentModeItem> items;
    
    
    
}


/*
    Model: PlatformPaymentModeItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformPaymentModeItem{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("short_code")
    private String shortCode;
    
    
    
    
    @JsonProperty("logos")
    private PlatformLogoSet logos;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_active_at_pg")
    private Boolean isActiveAtPg;
    
    
    
    
    @JsonProperty("sub_payment_mode")
    private List<PlatformSubPaymentMode> subPaymentMode;
    
    
    
}


/*
    Model: PlatformSubPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformSubPaymentMode{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_active_at_pg")
    private Boolean isActiveAtPg;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("logos")
    private PlatformLogoSet logos;
    
    
    
}


/*
    Model: MerchnatPaymentModeCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchnatPaymentModeCreation{

    

    
    
    
    
    @JsonProperty("offline")
    private HashMap<String,Object> offline;
    
    
    
    
    @JsonProperty("online")
    private HashMap<String,Object> online;
    
    
    
}


/*
    Model: SkuDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SkuDetails{

    

    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("sku_id")
    private String skuId;
    
    
    
    
    @JsonProperty("sku_name")
    private String skuName;
    
    
    
}


/*
    Model: AppliedOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedOffer{

    

    
    
    
    
    @JsonProperty("is_mop")
    private Boolean isMop;
    
    
    
    
    @JsonProperty("offer_type")
    private String offerType;
    
    
    
    
    @JsonProperty("offer_id")
    private String offerId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("sku_details")
    private List<SkuDetails> skuDetails;
    
    
    
}


/*
    Model: OrderDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetail{

    

    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("aggregator_order_details")
    private HashMap<String,Object> aggregatorOrderDetails;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("applied_offers")
    private List<AppliedOffer> appliedOffers;
    
    
    
}


/*
    Model: AddressDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddressDetail{

    

    
    
    
    
    @JsonProperty("google_map_point")
    private HashMap<String,Object> googleMapPoint;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("country_iso_code")
    private String countryIsoCode;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("geo_location")
    private HashMap<String,Object> geoLocation;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("g_address_id")
    private String gAddressId;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
}


/*
    Model: ReasonDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReasonDetail{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: PaymentSessionDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSessionDetail{

    

    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("success_url")
    private String successUrl;
    
    
    
    
    @JsonProperty("shipping_address")
    private AddressDetail shippingAddress;
    
    
    
    
    @JsonProperty("amount_captured")
    private Integer amountCaptured;
    
    
    
    
    @JsonProperty("amount_refunded")
    private Integer amountRefunded;
    
    
    
    
    @JsonProperty("aggregator_customer_id")
    private String aggregatorCustomerId;
    
    
    
    
    @JsonProperty("cancel_url")
    private String cancelUrl;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("created")
    private String created;
    
    
    
    
    @JsonProperty("g_user_id")
    private String gUserId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_locale")
    private String merchantLocale;
    
    
    
    
    @JsonProperty("locale")
    private String locale;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("billing_address")
    private AddressDetail billingAddress;
    
    
    
    
    @JsonProperty("captured")
    private Boolean captured;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("reason")
    private ReasonDetail reason;
    
    
    
}


/*
    Model: PaymentSessionCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSessionCreation{

    

    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("order_details")
    private OrderDetail orderDetails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("payment_details")
    private List<PaymentSessionDetail> paymentDetails;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
    
    @JsonProperty("checksum")
    private String checksum;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: PaymentSessionPutDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSessionPutDetails{

    

    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("platform_transaction_details")
    private List<Object> platformTransactionDetails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
}


/*
    Model: RefundSessionDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundSessionDetail{

    

    
    
    
    
    @JsonProperty("refund_utr")
    private String refundUtr;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created")
    private String created;
    
    
    
    
    @JsonProperty("source_transfer_reversal")
    private String sourceTransferReversal;
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    @JsonProperty("pg_refund_id")
    private String pgRefundId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("transfer_reversal")
    private String transferReversal;
    
    
    
    
    @JsonProperty("balance_transaction")
    private String balanceTransaction;
    
    
    
}


/*
    Model: RefundSessionCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundSessionCreation{

    

    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("payment_details")
    private PaymentSessionDetail paymentDetails;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
    
    @JsonProperty("refund_details")
    private List<RefundSessionDetail> refundDetails;
    
    
    
    
    @JsonProperty("error")
    private ErrorDescription error;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("checksum")
    private String checksum;
    
    
    
}


/*
    Model: RefundSessionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundSessionDetails{

    

    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("platform_refund_details")
    private List<Object> platformRefundDetails;
    
    
    
    
    @JsonProperty("total_refund_amount")
    private Integer totalRefundAmount;
    
    
    
}


/*
    Model: PaymentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentDetails{

    

    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("amount_refunded")
    private Integer amountRefunded;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("merchant_locale")
    private String merchantLocale;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("success_url")
    private String successUrl;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("captured")
    private Boolean captured;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("g_user_id")
    private String gUserId;
    
    
    
    
    @JsonProperty("locale")
    private String locale;
    
    
    
    
    @JsonProperty("cancel_url")
    private String cancelUrl;
    
    
    
    
    @JsonProperty("created")
    private String created;
    
    
    
    
    @JsonProperty("amount_captured")
    private Integer amountCaptured;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("aggregator_customer_id")
    private String aggregatorCustomerId;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
}


/*
    Model: CartDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDetails{

    

    
    
    
    
    @JsonProperty("items")
    private HashMap<String,Object> items;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("custom_cart_meta")
    private HashMap<String,Object> customCartMeta;
    
    
    
}


/*
    Model: RefundDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundDetails{

    

    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created")
    private String created;
    
    
    
    
    @JsonProperty("refund_utr")
    private String refundUtr;
    
    
    
}


/*
    Model: PaymentSessionFetchDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSessionFetchDetails{

    

    
    
    
    
    @JsonProperty("payment_details")
    private Object paymentDetails;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
    
    @JsonProperty("gid")
    private String gid;
    
    
    
    
    @JsonProperty("cart_details")
    private CartDetails cartDetails;
    
    
    
    
    @JsonProperty("refund_details")
    private List<RefundDetails> refundDetails;
    
    
    
}


/*
    Model: RefundSourcesPriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundSourcesPriority{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: RefundPriorityDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundPriorityDetails{

    

    
    
    
    
    @JsonProperty("configuration")
    private String configuration;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("apportion")
    private Boolean apportion;
    
    
    
    
    @JsonProperty("refund_sources_priority")
    private List<RefundSourcesPriority> refundSourcesPriority;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: RefundPriorityCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundPriorityCreation{

    

    
    
    
    
    @JsonProperty("apportion")
    private Boolean apportion;
    
    
    
    
    @JsonProperty("refund_sources_priority")
    private List<RefundSourcesPriority> refundSourcesPriority;
    
    
    
}


/*
    Model: MerchantPaymentModeCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MerchantPaymentModeCreation{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("device")
    private HashMap<String,Object> device;
    
    
    
}


/*
    Model: FromConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FromConfig{

    

    
    
    
    
    @JsonProperty("device")
    private String device;
    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
}


/*
    Model: ToConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ToConfig{

    

    
    
    
    
    @JsonProperty("device")
    private List<Object> device;
    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
}


/*
    Model: PlatformPaymentModeCopyConfigCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformPaymentModeCopyConfigCreation{

    

    
    
    
    
    @JsonProperty("from_config")
    private FromConfig fromConfig;
    
    
    
    
    @JsonProperty("to_config")
    private ToConfig toConfig;
    
    
    
}


/*
    Model: PaymentMethodsMetaOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethodsMetaOrder{

    

    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
}


/*
    Model: PaymentOrderMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOrderMethods{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("payment")
    private String payment;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("meta")
    private PaymentMethodsMetaOrder meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PaymentOrderCreation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOrderCreation{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentOrderMethods> paymentMethods;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
}


/*
    Model: PaymentOrderData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOrderData{

    

    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
}


/*
    Model: PaymentOrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOrderDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("data")
    private PaymentOrderData data;
    
    
    
}


/*
    Model: AggregatorVersionItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorVersionItemSchema{

    

    
    
    
    
    @JsonProperty("is_equal_to")
    private String isEqualTo;
    
    
    
    
    @JsonProperty("is_less_than")
    private String isLessThan;
    
    
    
    
    @JsonProperty("is_greater_than")
    private String isGreaterThan;
    
    
    
}


/*
    Model: AggregatorVersionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorVersionDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private AggregatorVersionItemSchema items;
    
    
    
}


/*
    Model: AggregatorVersionRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorVersionRequestSchema{

    

    
    
    
    
    @JsonProperty("is_equal_to")
    private String isEqualTo;
    
    
    
    
    @JsonProperty("is_less_than")
    private String isLessThan;
    
    
    
    
    @JsonProperty("is_greater_than")
    private String isGreaterThan;
    
    
    
}


/*
    Model: PatchAggregatorControl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PatchAggregatorControl{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("device")
    private String device;
    
    
    
    
    @JsonProperty("version")
    private AggregatorVersionRequestSchema version;
    
    
    
}


/*
    Model: PaymentModeCustomConfigSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeCustomConfigSchema{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("custom_config")
    private PaymentCustomConfigDetailsSchema customConfig;
    
    
    
}


/*
    Model: PaymentCustomConfigDetailsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigDetailsSchema{

    

    
    
    
    
    @JsonProperty("customer")
    private PaymentCustomConfigCustomerSchema customer;
    
    
    
    
    @JsonProperty("payment_mode")
    private PaymentCustomConfigModeSchema paymentMode;
    
    
    
    
    @JsonProperty("min_order_value")
    private Double minOrderValue;
    
    
    
}


/*
    Model: PaymentCustomConfigCustomerSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigCustomerSchema{

    

    
    
    
    
    @JsonProperty("restriction")
    private String restriction;
    
    
    
    
    @JsonProperty("groups")
    private List<Integer> groups;
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
}


/*
    Model: PaymentCustomConfigModeSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigModeSchema{

    

    
    
    
    
    @JsonProperty("available")
    private Boolean available;
    
    
    
    
    @JsonProperty("pre_order")
    private List<String> preOrder;
    
    
    
    
    @JsonProperty("post_order")
    private List<String> postOrder;
    
    
    
}


/*
    Model: PaymentCustomConfigDetailsRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigDetailsRequestSchema{

    

    
    
    
    
    @JsonProperty("customer")
    private PaymentCustomConfigCustomerRequestSchema customer;
    
    
    
    
    @JsonProperty("payment_mode")
    private PaymentCustomConfigModeSchema paymentMode;
    
    
    
    
    @JsonProperty("min_order_value")
    private Double minOrderValue;
    
    
    
}


/*
    Model: PaymentCustomConfigCustomerRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigCustomerRequestSchema{

    

    
    
    
    
    @JsonProperty("restriction")
    private String restriction;
    
    
    
    
    @JsonProperty("groups")
    private List<Integer> groups;
    
    
    
}


/*
    Model: PaymentCustomConfigRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigRequestSchema{

    

    
    
    
    
    @JsonProperty("business_unit")
    private String businessUnit;
    
    
    
    
    @JsonProperty("items")
    private List<PaymentCustomConfigDetailsRequestSchema> items;
    
    
    
}


/*
    Model: PaymentCustomConfigResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCustomConfigResponseSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<PaymentModeCustomConfigSchema> items;
    
    
    
}


/*
    Model: CustomerValidationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerValidationSchema{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("transaction_amount")
    private Double transactionAmount;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: UserCreditSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCreditSchema{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
}


/*
    Model: CreditAccountSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditAccountSummary{

    

    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("redeemable_balance")
    private UserCreditSchema redeemableBalance;
    
    
    
    
    @JsonProperty("available_balance")
    private UserCreditSchema availableBalance;
    
    
    
    
    @JsonProperty("amount_on_hold")
    private List<UserCreditSchema> amountOnHold;
    
    
    
}


/*
    Model: ValidateCustomerCreditSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerCreditSchema{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_eligible")
    private Boolean isEligible;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("account")
    private CreditAccountSummary account;
    
    
    
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




}