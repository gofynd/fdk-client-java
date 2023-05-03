
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
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("aggregators")
    private List<Object> aggregators;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("excluded_fields")
    private List<String> excludedFields;
    
    
    
    
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
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("aggregator_name")
    private PaymentGatewayConfig aggregatorName;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    Model: HttpErrorCodeAndResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorCodeAndResponse{
    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
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
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("intent_app")
    private List<IntentApp> intentApp;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Double remainingLimit;
    
    
    
    
    @JsonProperty("compliant_with_tokenisation_guidelines")
    private Boolean compliantWithTokenisationGuidelines;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    @JsonProperty("intent_app_error_dict_list")
    private List<IntentAppErrorList> intentAppErrorDictList;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("cod_limit_per_order")
    private Double codLimitPerOrder;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
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
    
    
    
    
    @JsonProperty("is_pay_by_card_pl")
    private Boolean isPayByCardPl;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("save_card")
    private Boolean saveCard;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
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
    Model: PayoutsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutsResponse{
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("customers")
    private Object customers;
    
    
    
    
    @JsonProperty("payouts_aggregators")
    private List<Object> payoutsAggregators;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("more_attributes")
    private Object moreAttributes;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private Object uniqueTransferNo;
    
    
    
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
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
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
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("bank_details")
    private PayoutBankDetails bankDetails;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
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
    
    
    
    
    @JsonProperty("payouts")
    private Object payouts;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("payment_status")
    private String paymentStatus;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("bank_details")
    private Object bankDetails;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
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
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
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
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
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
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
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
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("usages")
    private Integer usages;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Integer remainingLimit;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
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
    
    
    
    
    @JsonProperty("user_cod_data")
    private CODdata userCodData;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("models")
    private List<String> models;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<EdcModelData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("inactive_device_count")
    private Integer inactiveDeviceCount;
    
    
    
    
    @JsonProperty("active_device_count")
    private Integer activeDeviceCount;
    
    
    
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
    
    
    
    
    @JsonProperty("statistics")
    private StatisticsData statistics;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("terminal_serial_no")
    private String terminalSerialNo;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("edc_model")
    private String edcModel;
    
    
    
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
    
    
    
    
    @JsonProperty("terminal_serial_no")
    private String terminalSerialNo;
    
    
    
    
    @JsonProperty("merchant_store_pos_code")
    private String merchantStorePosCode;
    
    
    
    
    @JsonProperty("terminal_unique_identifier")
    private String terminalUniqueIdentifier;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("edc_model")
    private String edcModel;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private EdcDevice data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private EdcDevice data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("merchant_store_pos_code")
    private String merchantStorePosCode;
    
    
    
    
    @JsonProperty("device_tag")
    private String deviceTag;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("aggregator_id")
    private Integer aggregatorId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
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
    
    
    
    
    @JsonProperty("items")
    private List<EdcDevice> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
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
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    @JsonProperty("upi_poll_url")
    private String upiPollUrl;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
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
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
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
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("retry")
    private Boolean retry;
    
    
    
    
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
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private LinkStatus data;
    
    
    
    
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
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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
    
    
    
    
    @JsonProperty("codes")
    private Code codes;
    
    
    
    
    @JsonProperty("types")
    private String types;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("networks")
    private String networks;
    
    
    
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
    Model: GetPaymentCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPaymentCodeResponse{
    
    
    
    
    @JsonProperty("data")
    private GetPaymentCode data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}




}