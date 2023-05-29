
package com.sdk.platform.payment;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class PaymentPlatformModels{


/*
    Model: PaymentGatewayConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigResponse{
    
    
    
    
    @JsonProperty("display_fields")
    private List<String> displayFields;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("excluded_fields")
    private List<String> excludedFields;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("aggregators")
    private List<Object> aggregators;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
}


/*
    Model: PaymentGatewayConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("aggregator")
    private List<String> aggregator;
    
    
    
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
    Model: HttpErrorCodeAndResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorCodeAndResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
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
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeList{
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    @JsonProperty("compliant_with_tokenisation_guidelines")
    private Boolean compliantWithTokenisationGuidelines;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("intent_app")
    private List<IntentApp> intentApp;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("intent_app_error_dict_list")
    private List<IntentAppErrorList> intentAppErrorDictList;
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Double remainingLimit;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("cod_limit_per_order")
    private Double codLimitPerOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
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
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("save_card")
    private Boolean saveCard;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("is_pay_by_card_pl")
    private Boolean isPayByCardPl;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
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
    Model: PaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionsResponse{
    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptions paymentOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
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
    
    
    
    
    @JsonProperty("payout_details_id")
    private Integer payoutDetailsId;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("aggregator_fund_id")
    private Integer aggregatorFundId;
    
    
    
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
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
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
    
    
    
    
    @JsonProperty("more_attributes")
    private PayoutMoreAttributes moreAttributes;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("payouts_aggregators")
    private List<PayoutAggregator> payoutsAggregators;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("customers")
    private PayoutCustomer customers;
    
    
    
}


/*
    Model: PayoutsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutsResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
}


/*
    Model: PayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutRequest{
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("bank_details")
    private PayoutBankDetails bankDetails;
    
    
    
}


/*
    Model: PayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutResponse{
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("payouts")
    private Object payouts;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("payment_status")
    private String paymentStatus;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("bank_details")
    private Object bankDetails;
    
    
    
}


/*
    Model: UpdatePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: UpdatePayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutRequest{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
}


/*
    Model: DeletePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeletePayoutResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionPaymentMethodResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
}


/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteSubscriptionPaymentMethodResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SubscriptionConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionConfigResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentRequest{
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
}


/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: RefundAccountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundAccountResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsOTPRequest{
    
    
    
    
    @JsonProperty("details")
    private BankDetailsForOTP details;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: IfscCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IfscCodeResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
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
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: OrderBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
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
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
}


/*
    Model: PaymentConfirmationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationRequest{
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: PaymentConfirmationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: PlatformPaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformPaymentOptions{
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("callback_url")
    private Object callbackUrl;
    
    
    
    
    @JsonProperty("cod_amount_limit")
    private Integer codAmountLimit;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("methods")
    private Object methods;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private Object paymentSelectionLock;
    
    
    
    
    @JsonProperty("anonymous_cod")
    private Boolean anonymousCod;
    
    
    
}


/*
    Model: PlatfromPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatfromPaymentConfig{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private PlatformPaymentOptions data;
    
    
    
}


/*
    Model: UpdatePlatformPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePlatformPaymentConfig{
    
    
    
    
    @JsonProperty("cod_amount_limit")
    private Integer codAmountLimit;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private Object paymentSelectionLock;
    
    
    
    
    @JsonProperty("methods")
    private Object methods;
    
    
    
    
    @JsonProperty("anonymous_cod")
    private Boolean anonymousCod;
    
    
    
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
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Integer remainingLimit;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("usages")
    private Integer usages;
    
    
    
}


/*
    Model: GetUserCODLimitResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetUserCODLimitResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("user_cod_data")
    private CODdata userCodData;
    
    
    
}


/*
    Model: SetCODForUserRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetCODForUserRequest{
    
    
    
    
    @JsonProperty("merchant_user_id")
    private String merchantUserId;
    
    
    
    
    @JsonProperty("mobileno")
    private String mobileno;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: SetCODOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetCODOptionResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: EdcModelData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcModelData{
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("models")
    private List<String> models;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: EdcAggregatorAndModelListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcAggregatorAndModelListResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<EdcModelData> data;
    
    
    
}


/*
    Model: StatisticsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatisticsData{
    
    
    
    
    @JsonProperty("active_device_count")
    private Integer activeDeviceCount;
    
    
    
    
    @JsonProperty("inactive_device_count")
    private Integer inactiveDeviceCount;
    
    
    
}


/*
    Model: EdcDeviceStatsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDeviceStatsResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("statistics")
    private StatisticsData statistics;
    
    
    
}


/*
    Model: EdcAddRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcAddRequest{
    
    
    
    
    @JsonProperty("edc_device_serial_no")
    private String edcDeviceSerialNo;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("edc_model")
    private String edcModel;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("terminal_serial_no")
    private String terminalSerialNo;
    
    
    
}


/*
    Model: EdcDevice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDevice{
    
    
    
    
    @JsonProperty("edc_device_serial_no")
    private String edcDeviceSerialNo;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("terminal_unique_identifier")
    private String terminalUniqueIdentifier;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("edc_model")
    private String edcModel;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("merchant_store_pos_code")
    private String merchantStorePosCode;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("terminal_serial_no")
    private String terminalSerialNo;
    
    
    
}


/*
    Model: EdcDeviceAddResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDeviceAddResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private EdcDevice data;
    
    
    
}


/*
    Model: EdcDeviceDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDeviceDetailsResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private EdcDevice data;
    
    
    
}


/*
    Model: EdcUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcUpdateRequest{
    
    
    
    
    @JsonProperty("edc_device_serial_no")
    private String edcDeviceSerialNo;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("merchant_store_pos_code")
    private String merchantStorePosCode;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("edc_model")
    private String edcModel;
    
    
    
}


/*
    Model: EdcDeviceUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDeviceUpdateResponse{
    
    
    
    
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
    Model: EdcDeviceListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EdcDeviceListResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<EdcDevice> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PaymentInitializationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInitializationRequest{
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
}


/*
    Model: PaymentInitializationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInitializationResponse{
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("upi_poll_url")
    private String upiPollUrl;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
}


/*
    Model: PaymentStatusUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusUpdateRequest{
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
}


/*
    Model: PaymentStatusUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusUpdateResponse{
    
    
    
    
    @JsonProperty("retry")
    private Boolean retry;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
}


/*
    Model: ResendOrCancelPaymentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendOrCancelPaymentRequest{
    
    
    
    
    @JsonProperty("request_type")
    private String requestType;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: ResendOrCancelPaymentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendOrCancelPaymentResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private LinkStatus data;
    
    
    
}


/*
    Model: PaymentStatusBulkHandlerRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusBulkHandlerRequest{
    
    
    
    
    @JsonProperty("merchant_order_id")
    private List<String> merchantOrderId;
    
    
    
}


/*
    Model: PaymentObjectListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentObjectListSerializer{
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("refunded_by")
    private String refundedBy;
    
    
    
    
    @JsonProperty("collected_by")
    private String collectedBy;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("user_object")
    private Object userObject;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("amount_in_paisa")
    private String amountInPaisa;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("payment_mode_identifier")
    private String paymentModeIdentifier;
    
    
    
    
    @JsonProperty("refund_object")
    private Object refundObject;
    
    
    
    
    @JsonProperty("all_status")
    private List<String> allStatus;
    
    
    
    
    @JsonProperty("aggregator_payment_object")
    private Object aggregatorPaymentObject;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_object_list")
    private List<PaymentObjectListSerializer> paymentObjectList;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
}


/*
    Model: PaymentStatusBulkHandlerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusBulkHandlerResponse{
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("data")
    private List<PaymentStatusObject> data;
    
    
    
}


/*
    Model: GetOauthUrlResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOauthUrlResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ValidateCustomerRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerRequest{
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("order_items")
    private List<Object> orderItems;
    
    
    
    
    @JsonProperty("merchant_params")
    private Object merchantParams;
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private Integer transactionAmountInPaise;
    
    
    
}


/*
    Model: ValidateCustomerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: GetPaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentLinkResponse{
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("payment_link_current_status")
    private String paymentLinkCurrentStatus;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_transaction_id")
    private String paymentTransactionId;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("invalid_id")
    private Boolean invalidId;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("cancelled")
    private Boolean cancelled;
    
    
    
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
    private ErrorDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
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
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
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
    Model: CreatePaymentLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLinkRequest{
    
    
    
    
    @JsonProperty("meta")
    private CreatePaymentLinkMeta meta;
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: CreatePaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLinkResponse{
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
}


/*
    Model: PollingPaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PollingPaymentLinkResponse{
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("http_status")
    private Integer httpStatus;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
}


/*
    Model: CancelOrResendPaymentLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelOrResendPaymentLinkRequest{
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
}


/*
    Model: ResendPaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendPaymentLinkResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
}


/*
    Model: CancelPaymentLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelPaymentLinkResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
}




}