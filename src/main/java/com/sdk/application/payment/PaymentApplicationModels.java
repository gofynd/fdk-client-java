

package com.sdk.application.payment;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class PaymentApplicationModels{


/*
    Model: AggregatorConfigDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorConfigDetail{

    

    
    
    
    
    @JsonProperty("sdk")
    private Boolean sdk;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    @JsonProperty("pin")
    private String pin;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("merchant_key")
    private String merchantKey;
    
    
    
    
    @JsonProperty("verify_api")
    private String verifyApi;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("merchant_id")
    private Object merchantId;
    
    
    
    
    @JsonProperty("api_domain")
    private String apiDomain;
    
    
    
    
    @JsonProperty("webhook_username")
    private String webhookUsername;
    
    
    
    
    @JsonProperty("webhook_password")
    private String webhookPassword;
    
    
    
    
    @JsonProperty("signature_key")
    private String signatureKey;
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
    
    @JsonProperty("checkout_formpost_url")
    private String checkoutFormpostUrl;
    
    
    
    
    @JsonProperty("refund_api_domain")
    private String refundApiDomain;
    
    
    
    
    @JsonProperty("non_trxn_url")
    private String nonTrxnUrl;
    
    
    
    
    @JsonProperty("trxn_url")
    private String trxnUrl;
    
    
    
    
    @JsonProperty("webhook_secret")
    private String webhookSecret;
    
    
    
    
    @JsonProperty("is_sub_fynd_account")
    private String isSubFyndAccount;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
    @JsonProperty("secret_key")
    private String secretKey;
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
}


/*
    Model: AggregatorsConfigDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorsConfigDetail{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorConfigDetail razorpay;
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorConfigDetail juspay;
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorConfigDetail simpl;
    
    
    
    
    @JsonProperty("payumoney")
    private AggregatorConfigDetail payumoney;
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorConfigDetail rupifi;
    
    
    
    
    @JsonProperty("mswipe")
    private AggregatorConfigDetail mswipe;
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorConfigDetail stripe;
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorConfigDetail ccavenue;
    
    
    
    
    @JsonProperty("ajiodhan")
    private AggregatorConfigDetail ajiodhan;
    
    
    
    
    @JsonProperty("potlee")
    private AggregatorConfigDetail potlee;
    
    
    
    
    @JsonProperty("qr_refund_jiopay")
    private AggregatorConfigDetail qrRefundJiopay;
    
    
    
    
    @JsonProperty("offerxone")
    private AggregatorConfigDetail offerxone;
    
    
    
    
    @JsonProperty("env")
    private String env;
    
    
    
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

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: HttpErrorCodeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorCodeDetails{

    

    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentErrorCodeAndMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentErrorCodeAndMessage{

    

    
    
    
    
    @JsonProperty("error")
    private PaymentError error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_msg")
    private String errorMsg;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PaymentOptionErrorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionErrorDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private List<String> error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentPOSOptionErrorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentPOSOptionErrorDetails{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private PaymentError error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: OrderErrorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderErrorDetails{

    

    
    
    
    
    @JsonProperty("data")
    private ErrorDetails data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentError{

    

    
    
    
    
    @JsonProperty("order_id")
    private List<String> orderId;
    
    
    
    
    @JsonProperty("order_type")
    private List<String> orderType;
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private List<String> transactionAmountInPaise;
    
    
    
}


/*
    Model: AttachCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachCard{

    

    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("refresh")
    private Boolean refresh;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("name_on_card")
    private String nameOnCard;
    
    
    
}


/*
    Model: AttachCardsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachCardsDetails{

    

    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
}


/*
    Model: CardPaymentGateway
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardPaymentGateway{

    

    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
}


/*
    Model: ActiveCardPaymentGatewayDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActiveCardPaymentGatewayDetails{

    

    
    
    
    
    @JsonProperty("cards")
    private CardPaymentGateway cards;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: Card
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Card{

    

    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("compliant_with_tokenisation_guidelines")
    private Boolean compliantWithTokenisationGuidelines;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
}


/*
    Model: ListCardsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListCardsDetails{

    

    
    
    
    
    @JsonProperty("data")
    private List<Card> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DeleteCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteCard{

    

    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
}


/*
    Model: DeleteCardsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteCardsDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
}


/*
    Model: ValidateCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomer{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private Integer transactionAmountInPaise;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("billing_address")
    private HashMap<String,Object> billingAddress;
    
    
    
    
    @JsonProperty("order_items")
    private List<Object> orderItems;
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    @JsonProperty("merchant_params")
    private HashMap<String,Object> merchantParams;
    
    
    
    
    @JsonProperty("delivery_address")
    private HashMap<String,Object> deliveryAddress;
    
    
    
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

    

    
    
    
    
    @JsonProperty("data")
    private ValidateCustomerInfo data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private ValidateCustomerInfo error;
    
    
    
}


/*
    Model: ValidateCustomerInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerInfo{

    

    
    
    
    
    @JsonProperty("data")
    private ValidateCustomerData data;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("api_version")
    private Integer apiVersion;
    
    
    
}


/*
    Model: ValidateCustomerData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateCustomerData{

    

    
    
    
    
    @JsonProperty("approved")
    private Boolean approved;
    
    
    
    
    @JsonProperty("button_text")
    private String buttonText;
    
    
    
    
    @JsonProperty("first_transaction")
    private Boolean firstTransaction;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
    
    @JsonProperty("total_credited_balance")
    private Double totalCreditedBalance;
    
    
    
    
    @JsonProperty("is_cn_locked")
    private Boolean isCnLocked;
    
    
    
    
    @JsonProperty("total_locked_amount")
    private Double totalLockedAmount;
    
    
    
    
    @JsonProperty("allowed_redemption_amount")
    private Double allowedRedemptionAmount;
    
    
    
}


/*
    Model: ChargeCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeCustomer{

    

    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("transaction_token")
    private String transactionToken;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
}


/*
    Model: ChargeCustomerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeCustomerDetails{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("cart_id")
    private List<String> cartId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("delivery_address_id")
    private String deliveryAddressId;
    
    
    
}


/*
    Model: PaymentInitialization
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInitialization{

    

    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("unique_link_id")
    private String uniqueLinkId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("upi_poll_url")
    private String upiPollUrl;
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    @JsonProperty("unique_link_id")
    private String uniqueLinkId;
    
    
    
    
    @JsonProperty("status_code")
    private String statusCode;
    
    
    
}


/*
    Model: PaymentStatusUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentStatusUpdate{

    

    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("merchant_transaction_id")
    private String merchantTransactionId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("unique_link_id")
    private String uniqueLinkId;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("merchant_url")
    private String merchantUrl;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("retry")
    private Boolean retry;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
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

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
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

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
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
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeList{

    

    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("collect_flow")
    private Boolean collectFlow;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("wallet_name")
    private String walletName;
    
    
    
    
    @JsonProperty("wallet_code")
    private String walletCode;
    
    
    
    
    @JsonProperty("wallet_id")
    private Integer walletId;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("bank_code")
    private String bankCode;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
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
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("save_card")
    private Boolean saveCard;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    @JsonProperty("payment_mode_id")
    private Integer paymentModeId;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("version")
    private Version version;
    
    
    
}


/*
    Model: PaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfig{

    

    
    
    
    
    @JsonProperty("redirect")
    private Boolean redirect;
    
    
    
    
    @JsonProperty("final_payment_action_url")
    private String finalPaymentActionUrl;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("action_url")
    private String actionUrl;
    
    
    
}


/*
    Model: GatewayData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GatewayData{

    

    
    
    
    
    @JsonProperty("route")
    private String route;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("is_customer_validation_required")
    private Boolean isCustomerValidationRequired;
    
    
    
    
    @JsonProperty("cust_validation_url")
    private String custValidationUrl;
    
    
    
    
    @JsonProperty("sdk")
    private SDKDetails sdk;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
    @JsonProperty("user_email")
    private String userEmail;
    
    
    
    
    @JsonProperty("user_phone")
    private String userPhone;
    
    
    
}


/*
    Model: SDKDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SDKDetails{

    

    
    
    
    
    @JsonProperty("config")
    private SDKConfig config;
    
    
    
    
    @JsonProperty("data")
    private UserData data;
    
    
    
}


/*
    Model: SDKConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SDKConfig{

    

    
    
    
    
    @JsonProperty("redirect")
    private Boolean redirect;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("action_url")
    private String actionUrl;
    
    
    
}


/*
    Model: UserData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserData{

    

    
    
    
    
    @JsonProperty("user_phone")
    private String userPhone;
    
    
    
    
    @JsonProperty("user_email")
    private String userEmail;
    
    
    
}


/*
    Model: PaymentFlowData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentFlowData{

    

    
    
    
    
    @JsonProperty("is_customer_validation_required")
    private Boolean isCustomerValidationRequired;
    
    
    
    
    @JsonProperty("cust_validation_url")
    private String custValidationUrl;
    
    
    
    
    @JsonProperty("config")
    private PaymentConfig config;
    
    
    
    
    @JsonProperty("data")
    private GatewayData data;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
}


/*
    Model: AggregatorRouteData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorRouteData{

    

    
    
    
    
    @JsonProperty("gateway")
    private GatewayData gateway;
    
    
    
    
    @JsonProperty("payment_flow_data")
    private PaymentFlowData paymentFlowData;
    
    
    
    
    @JsonProperty("data")
    private GatewayData data;
    
    
    
    
    @JsonProperty("payment_flow")
    private String paymentFlow;
    
    
    
    
    @JsonProperty("api_link")
    private String apiLink;
    
    
    
    
    @JsonProperty("route")
    private String route;
    
    
    
    
    @JsonProperty("entity")
    private String entity;
    
    
    
    
    @JsonProperty("is_customer_validation_required")
    private Boolean isCustomerValidationRequired;
    
    
    
    
    @JsonProperty("cust_validation_url")
    private String custValidationUrl;
    
    
    
    
    @JsonProperty("sdk")
    private SDKDetails sdk;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
    @JsonProperty("user_email")
    private String userEmail;
    
    
    
    
    @JsonProperty("user_phone")
    private String userPhone;
    
    
    
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
    private AggregatorRouteData data;
    
    
    
    
    @JsonProperty("payment_flow_data")
    private HashMap<String,Object> paymentFlowData;
    
    
    
    
    @JsonProperty("payment_flow")
    private String paymentFlow;
    
    
    
    
    @JsonProperty("api_link")
    private String apiLink;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
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
    
    
    
    
    @JsonProperty("epaylater")
    private AggregatorRoute epaylater;
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorRoute razorpay;
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorRoute juspay;
    
    
    
    
    @JsonProperty("ajiodhan")
    private AggregatorRoute ajiodhan;
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorRoute simpl;
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorRoute rupifi;
    
    
    
    
    @JsonProperty("mswipe")
    private AggregatorRoute mswipe;
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorRoute stripe;
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorRoute ccavenue;
    
    
    
    
    @JsonProperty("payubiz")
    private AggregatorRoute payubiz;
    
    
    
    
    @JsonProperty("jiopay")
    private AggregatorRoute jiopay;
    
    
    
    
    @JsonProperty("jio")
    private AggregatorRoute jio;
    
    
    
    
    @JsonProperty("payumoney")
    private AggregatorRoute payumoney;
    
    
    
    
    @JsonProperty("openapi")
    private AggregatorRoute openapi;
    
    
    
    
    @JsonProperty("potlee")
    private AggregatorRoute potlee;
    
    
    
    
    @JsonProperty("upi_razorpay")
    private AggregatorRoute upiRazorpay;
    
    
    
    
    @JsonProperty("creditnote")
    private AggregatorRoute creditnote;
    
    
    
    
    @JsonProperty("pinelabs")
    private AggregatorRoute pinelabs;
    
    
    
    
    @JsonProperty("checkout")
    private AggregatorRoute checkout;
    
    
    
    
    @JsonProperty("cashfree")
    private AggregatorRoute cashfree;
    
    
    
    
    @JsonProperty("jio_extension")
    private AggregatorRoute jioExtension;
    
    
    
    
    @JsonProperty("offerxone")
    private AggregatorRoute offerxone;
    
    
    
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
    
    
    
    
    @JsonProperty("all_cancellation_type")
    private List<String> allCancellationType;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("version")
    private Version version;
    
    
    
    
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
    Model: WalletLinkRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletLinkRequestSchema{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("wallet_code")
    private String walletCode;
    
    
    
}


/*
    Model: WalletVerifyRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletVerifyRequestSchema{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("link_token")
    private String linkToken;
    
    
    
    
    @JsonProperty("otp")
    private Integer otp;
    
    
    
}


/*
    Model: WalletDelinkRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletDelinkRequestSchema{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("wallet_code")
    private String walletCode;
    
    
    
    
    @JsonProperty("wallet_id")
    private String walletId;
    
    
    
}


/*
    Model: WalletResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletResponseSchema{

    

    
    
    
    
    @JsonProperty("data")
    private WalletResponseData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: WalletResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletResponseData{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("link_token")
    private String linkToken;
    
    
    
}


/*
    Model: RupifiBannerData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RupifiBannerData{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("kyc_url")
    private String kycUrl;
    
    
    
}


/*
    Model: RupifiBannerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RupifiBannerDetails{

    

    
    
    
    
    @JsonProperty("data")
    private RupifiBannerData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: EpaylaterBannerData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EpaylaterBannerData{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("display")
    private Boolean display;
    
    
    
}


/*
    Model: EpaylaterBannerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EpaylaterBannerDetails{

    

    
    
    
    
    @JsonProperty("data")
    private EpaylaterBannerData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ResendOrCancelPayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResendOrCancelPayment{

    

    
    
    
    
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
    Model: RenderHTML
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RenderHTML{

    

    
    
    
    
    @JsonProperty("returntype")
    private String returntype;
    
    
    
    
    @JsonProperty("base64_html")
    private String base64Html;
    
    
    
}


/*
    Model: RenderHTMLDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RenderHTMLDetails{

    

    
    
    
    
    @JsonProperty("html")
    private String html;
    
    
    
}


/*
    Model: ValidateVPA
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateVPA{

    

    
    
    
    
    @JsonProperty("upi_vpa")
    private String upiVpa;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: ValidateUPI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateUPI{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("upi_vpa")
    private String upiVpa;
    
    
    
}


/*
    Model: ValidateVPADetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateVPADetails{

    

    
    
    
    
    @JsonProperty("data")
    private ValidateUPI data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CardDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardDetails{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("bank_code")
    private String bankCode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("card_exp_year")
    private String cardExpYear;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("card_sub_type")
    private String cardSubType;
    
    
    
    
    @JsonProperty("is_domestic_card")
    private Boolean isDomesticCard;
    
    
    
    
    @JsonProperty("name_on_card")
    private String nameOnCard;
    
    
    
    
    @JsonProperty("card_exp_month")
    private String cardExpMonth;
    
    
    
    
    @JsonProperty("extended_card_type")
    private String extendedCardType;
    
    
    
    
    @JsonProperty("card_object")
    private String cardObject;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("bank")
    private String bank;
    
    
    
}


/*
    Model: CardDetailsFetchedDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardDetailsFetchedDetails{

    

    
    
    
    
    @JsonProperty("data")
    private CardDetails data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: TransferItemsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransferItemsDetails{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("logo_large")
    private String logoLarge;
    
    
    
    
    @JsonProperty("logo_small")
    private String logoSmall;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: TransferModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransferModeDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<TransferItemsDetails> items;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: TransferModeFetchDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransferModeFetchDetails{

    

    
    
    
    
    @JsonProperty("data")
    private List<TransferModeDetails> data;
    
    
    
}


/*
    Model: UpdateRefundTransferMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateRefundTransferMode{

    

    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
}


/*
    Model: RefundTransferModeUpdateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundTransferModeUpdateDetails{

    

    
    
    
    
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

    

    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("aggregator_id")
    private String aggregatorId;
    
    
    
    
    @JsonProperty("is_verified")
    private Boolean isVerified;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("txn_id")
    private String txnId;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("default_beneficiary")
    private Boolean defaultBeneficiary;
    
    
    
}


/*
    Model: OrderBeneficiaryFetchDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryFetchDetails{

    

    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    @JsonProperty("bank")
    private List<OrderBeneficiaryDetails> bank;
    
    
    
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

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    Model: ErrorCodeDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorCodeDescription{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryViaOtpVerification{

    

    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("hash_key")
    private String hashKey;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryViaOtpVerificationDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: WrongOtpError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WrongOtpError{

    

    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BeneficiaryModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BeneficiaryModeDetails{

    

    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
}


/*
    Model: AddBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetails{

    

    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("delights")
    private Boolean delights;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("details")
    private BeneficiaryModeDetails details;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private RefundData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: RefundData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundData{

    

    
    
    
    
    @JsonProperty("bene_name_mismatch")
    private Boolean beneNameMismatch;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("subcode")
    private String subcode;
    
    
    
    
    @JsonProperty("hash_key")
    private String hashKey;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("request_id")
    private Integer requestId;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsOTPDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<BankDetailsForOTP> data;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
}


/*
    Model: PostAddBeneficiaryDetailsOTPDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostAddBeneficiaryDetailsOTPDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private PostBankDetailsForOTP data;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
}


/*
    Model: PostBankDetailsForOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostBankDetailsForOTP{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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

    

    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsOTP{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("request_hash")
    private String requestHash;
    
    
    
    
    @JsonProperty("details")
    private BankDetailsForOTP details;
    
    
    
}


/*
    Model: WalletOtp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletOtp{

    

    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: WalletOtpDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletOtpDetails{

    

    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SetDefaultBeneficiary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetDefaultBeneficiary{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("merchant_shipment_id")
    private String merchantShipmentId;
    
    
    
}


/*
    Model: SetDefaultBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetDefaultBeneficiaryDetails{

    

    
    
    
    
    @JsonProperty("is_beneficiary_set")
    private Boolean isBeneficiarySet;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RefundOrderBen
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOrderBen{

    

    
    
    
    
    @JsonProperty("order_ids")
    private List<String> orderIds;
    
    
    
}


/*
    Model: RefundOrderBenDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOrderBenDetails{

    

    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("payment_link_current_status")
    private String paymentLinkCurrentStatus;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("error")
    private ErrorDescription error;
    
    
    
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
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("merchant_name")
    private String merchantName;
    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("cancelled")
    private Boolean cancelled;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("invalid_id")
    private Boolean invalidId;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    Model: PollingPaymentLinkError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PollingPaymentLinkError{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
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
    
    
    
    
    @JsonProperty("assign_card_id")
    private String assignCardId;
    
    
    
    
    @JsonProperty("amount")
    private String amount;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
}


/*
    Model: CreatePaymentLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatePaymentLink{

    

    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("meta")
    private CreatePaymentLinkMeta meta;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("country_phone_code")
    private String countryPhoneCode;
    
    
    
    
    @JsonProperty("success_redirection_url")
    private String successRedirectionUrl;
    
    
    
    
    @JsonProperty("failure_redirection_url")
    private String failureRedirectionUrl;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("payment_link_url")
    private String paymentLinkUrl;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
}


/*
    Model: CancelOrResendPaymentLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelOrResendPaymentLink{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("polling_timeout")
    private Integer pollingTimeout;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private PaymentLinkError error;
    
    
    
}


/*
    Model: PaymentLinkError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentLinkError{

    

    
    
    
    
    @JsonProperty("cancelled")
    private Boolean cancelled;
    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("http_status")
    private Integer httpStatus;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
}


/*
    Model: PaymentMethodsMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethodsMeta{

    

    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
}


/*
    Model: CreateOrderUserPaymentMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderUserPaymentMethods{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("meta")
    private PaymentMethodsMeta meta;
    
    
    
}


/*
    Model: CreateOrderUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderUser{

    

    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("payment_link_id")
    private String paymentLinkId;
    
    
    
    
    @JsonProperty("payment_methods")
    private CreateOrderUserPaymentMethods paymentMethods;
    
    
    
    
    @JsonProperty("failure_callback_url")
    private String failureCallbackUrl;
    
    
    
    
    @JsonProperty("success_callback_url")
    private String successCallbackUrl;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: CreateOrderUserData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderUserData{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("base64_html")
    private String base64Html;
    
    
    
}


/*
    Model: CreateOrderUserDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderUserDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private CreateOrderUserData data;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
}


/*
    Model: BalanceDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BalanceDetails{

    

    
    
    
    
    @JsonProperty("formatted_value")
    private String formattedValue;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
}


/*
    Model: CreditSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditSummary{

    

    
    
    
    
    @JsonProperty("total_due_amount")
    private BalanceDetails totalDueAmount;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("limit")
    private BalanceDetails limit;
    
    
    
    
    @JsonProperty("credit_line_id")
    private String creditLineId;
    
    
    
    
    @JsonProperty("amount_available")
    private BalanceDetails amountAvailable;
    
    
    
    
    @JsonProperty("due_amount")
    private BalanceDetails dueAmount;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("balance")
    private BalanceDetails balance;
    
    
    
    
    @JsonProperty("status_message")
    private String statusMessage;
    
    
    
    
    @JsonProperty("repayment_url")
    private String repaymentUrl;
    
    
    
    
    @JsonProperty("soa_url")
    private String soaUrl;
    
    
    
    
    @JsonProperty("is_eligible_for_txn")
    private Boolean isEligibleForTxn;
    
    
    
    
    @JsonProperty("merchant_customer_ref_id")
    private String merchantCustomerRefId;
    
    
    
    
    @JsonProperty("buyer_status")
    private String buyerStatus;
    
    
    
    
    @JsonProperty("activation_url")
    private String activationUrl;
    
    
    
}


/*
    Model: CustomerCreditSummaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerCreditSummaryDetails{

    

    
    
    
    
    @JsonProperty("data")
    private CreditSummary data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: RedirectURL
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedirectURL{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("extra")
    private String extra;
    
    
    
}


/*
    Model: RedirectToAggregatorDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedirectToAggregatorDetails{

    

    
    
    
    
    @JsonProperty("data")
    private RedirectURL data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CreditDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditDetail{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("is_registered")
    private Boolean isRegistered;
    
    
    
    
    @JsonProperty("signup_url")
    private String signupUrl;
    
    
    
    
    @JsonProperty("available_credit")
    private Double availableCredit;
    
    
    
}


/*
    Model: CheckCreditDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckCreditDetails{

    

    
    
    
    
    @JsonProperty("data")
    private CreditDetail data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: KYCAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KYCAddress{

    

    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("addressline2")
    private String addressline2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("ownership_type")
    private String ownershipType;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("land_mark")
    private String landMark;
    
    
    
    
    @JsonProperty("addressline1")
    private String addressline1;
    
    
    
}


/*
    Model: UserPersonalInfoInDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserPersonalInfoInDetails{

    

    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("voter_id")
    private String voterId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("passport")
    private String passport;
    
    
    
    
    @JsonProperty("fathers_name")
    private String fathersName;
    
    
    
    
    @JsonProperty("mothers_name")
    private String mothersName;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("driving_license")
    private String drivingLicense;
    
    
    
    
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    
    
    
    
    @JsonProperty("address_as_per_id")
    private KYCAddress addressAsPerId;
    
    
    
    
    @JsonProperty("mobile_verified")
    private Boolean mobileVerified;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: MarketplaceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MarketplaceInfo{

    

    
    
    
    
    @JsonProperty("date_of_joining")
    private String dateOfJoining;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("membership_id")
    private String membershipId;
    
    
    
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

    

    
    
    
    
    @JsonProperty("business_ownership_type")
    private String businessOwnershipType;
    
    
    
    
    @JsonProperty("vintage")
    private String vintage;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("shop_and_establishment")
    private HashMap<String,Object> shopAndEstablishment;
    
    
    
    
    @JsonProperty("fssai")
    private String fssai;
    
    
    
    
    @JsonProperty("fda")
    private String fda;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private KYCAddress address;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
}


/*
    Model: DeviceDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeviceDetails{

    

    
    
    
    
    @JsonProperty("identification_number")
    private String identificationNumber;
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    @JsonProperty("device_model")
    private String deviceModel;
    
    
    
    
    @JsonProperty("device_make")
    private String deviceMake;
    
    
    
    
    @JsonProperty("device_type")
    private String deviceType;
    
    
    
    
    @JsonProperty("os")
    private String os;
    
    
    
    
    @JsonProperty("os_version")
    private String osVersion;
    
    
    
}


/*
    Model: CustomerOnboarding
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerOnboarding{

    

    
    
    
    
    @JsonProperty("personal_info")
    private UserPersonalInfoInDetails personalInfo;
    
    
    
    
    @JsonProperty("mcc")
    private String mcc;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("marketplace_info")
    private MarketplaceInfo marketplaceInfo;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("business_info")
    private BusinessDetails businessInfo;
    
    
    
    
    @JsonProperty("device")
    private DeviceDetails device;
    
    
    
}


/*
    Model: OnboardSummary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OnboardSummary{

    

    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("session")
    private HashMap<String,Object> session;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("status_remark")
    private String statusRemark;
    
    
    
    
    @JsonProperty("is_eligible_for_txn")
    private Boolean isEligibleForTxn;
    
    
    
    
    @JsonProperty("merchant_customer_ref_id")
    private String merchantCustomerRefId;
    
    
    
    
    @JsonProperty("activation_url")
    private String activationUrl;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CustomerOnboardingDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerOnboardingDetails{

    

    
    
    
    
    @JsonProperty("data")
    private OnboardSummary data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: OutstandingOrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingOrderDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PaidOrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaidOrderDetails{

    

    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DeleteBeneficiary
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteBeneficiary{

    

    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
}


/*
    Model: DeleteRefundAccountDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteRefundAccountDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: RefundOptionsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionsDetails{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: RefundOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptions{

    

    
    
    
    
    @JsonProperty("items")
    private RefundOptionsDetails items;
    
    
    
    
    @JsonProperty("offline_refund_collect_type")
    private List<String> offlineRefundCollectType;
    
    
    
}


/*
    Model: OfflineRefundOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OfflineRefundOptions{

    

    
    
    
    
    @JsonProperty("items")
    private RefundOptionsDetails items;
    
    
    
    
    @JsonProperty("payment_modes")
    private List<String> paymentModes;
    
    
    
    
    @JsonProperty("offline_refund_collect_type")
    private List<String> offlineRefundCollectType;
    
    
    
}


/*
    Model: RefundOptionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionDetails{

    

    
    
    
    
    @JsonProperty("offline_refund_options")
    private OfflineRefundOptions offlineRefundOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("refund_options")
    private RefundOptions refundOptions;
    
    
    
}


/*
    Model: SelectedRefundOptionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SelectedRefundOptionDetails{

    

    
    
    
    
    @JsonProperty("transfer_mode")
    private HashMap<String,Object> transferMode;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("beneficiary_details")
    private HashMap<String,Object> beneficiaryDetails;
    
    
    
}


/*
    Model: WalletBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletBeneficiaryDetails{

    

    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("wallet_address")
    private String walletAddress;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
}


/*
    Model: UpiBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpiBeneficiaryDetails{

    

    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("vpa_address")
    private String vpaAddress;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
}


/*
    Model: BeneficiaryRefundOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BeneficiaryRefundOptions{

    

    
    
    
    
    @JsonProperty("bank")
    private List<OrderBeneficiaryDetails> bank;
    
    
    
    
    @JsonProperty("wallet")
    private WalletBeneficiaryDetails wallet;
    
    
    
    
    @JsonProperty("upi")
    private UpiBeneficiaryDetails upi;
    
    
    
}


/*
    Model: OrderBeneficiaryDetailsSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryDetailsSchemaV2{

    

    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    @JsonProperty("data")
    private BeneficiaryRefundOptions data;
    
    
    
    
    @JsonProperty("limit")
    private RefundOptionsLimit limit;
    
    
    
}


/*
    Model: RefundOptionsLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionsLimit{

    

    
    
    
    
    @JsonProperty("bank")
    private Integer bank;
    
    
    
    
    @JsonProperty("wallet")
    private Integer wallet;
    
    
    
    
    @JsonProperty("upi")
    private Integer upi;
    
    
    
}


/*
    Model: ValidateValidateAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateValidateAddress{

    

    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("upi_vpa")
    private String upiVpa;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: VPADetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VPADetails{

    

    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("upi_vpa")
    private String upiVpa;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
}


/*
    Model: ValidateValidateAddressDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateValidateAddressDetails{

    

    
    
    
    
    @JsonProperty("upi")
    private VPADetails upi;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("ifsc")
    private HashMap<String,Object> ifsc;
    
    
    
    
    @JsonProperty("vpa")
    private VPADetails vpa;
    
    
    
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

    

    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("payment_extra_identifiers")
    private HashMap<String,Object> paymentExtraIdentifiers;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
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
    Model: PaymentOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOrder{

    

    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentOrderMethods> paymentMethods;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("customer_details")
    private CustomerDetails customerDetails;
    
    
    
}


/*
    Model: CustomerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerDetails{

    

    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
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

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("bank")
    private String bank;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
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

    

    
    
    
    
    @JsonProperty("payment_confirm_url")
    private String paymentConfirmUrl;
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("data")
    private PaymentOrderData data;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ShipmentRefundRequestMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentRefundRequestMeta{

    

    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("utr")
    private String utr;
    
    
    
    
    @JsonProperty("notes")
    private String notes;
    
    
    
    
    @JsonProperty("billing_employee_code")
    private String billingEmployeeCode;
    
    
    
}


/*
    Model: ShipmentRefund
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentRefund{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
    @JsonProperty("meta")
    private ShipmentRefundRequestMeta meta;
    
    
    
}


/*
    Model: ShipmentRefundDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentRefundDetail{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
}


/*
    Model: ShipmentRefundDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentRefundDetails{

    

    
    
    
    
    @JsonProperty("data")
    private ShipmentRefundDetail data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("refund_options")
    private String refundOptions;
    
    
    
    
    @JsonProperty("refund_options_priority")
    private RefundOptionsPriority refundOptionsPriority;
    
    
    
    
    @JsonProperty("offline_refund_options_priority")
    private RefundOptionsPriority offlineRefundOptionsPriority;
    
    
    
}


/*
    Model: RefundOptionsPriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionsPriority{

    

    
    
    
    
    @JsonProperty("payment_modes")
    private List<String> paymentModes;
    
    
    
    
    @JsonProperty("items")
    private List<RefundItem> items;
    
    
    
    
    @JsonProperty("payment_gateways")
    private List<String> paymentGateways;
    
    
    
    
    @JsonProperty("offline_refund_collect_type")
    private List<String> offlineRefundCollectType;
    
    
    
}


/*
    Model: RefundItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundItem{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: Version
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Version{

    

    
    
    
    
    @JsonProperty("razorpay")
    private List<VersionDetails> razorpay;
    
    
    
    
    @JsonProperty("rupifi")
    private List<VersionDetails> rupifi;
    
    
    
    
    @JsonProperty("jio")
    private List<VersionDetails> jio;
    
    
    
    
    @JsonProperty("stripe")
    private List<VersionDetails> stripe;
    
    
    
    
    @JsonProperty("payumoney")
    private List<VersionDetails> payumoney;
    
    
    
    
    @JsonProperty("jiopay")
    private List<VersionDetails> jiopay;
    
    
    
    
    @JsonProperty("fynd")
    private List<VersionDetails> fynd;
    
    
    
    
    @JsonProperty("potlee")
    private List<VersionDetails> potlee;
    
    
    
    
    @JsonProperty("juspay")
    private List<VersionDetails> juspay;
    
    
    
    
    @JsonProperty("simpl")
    private List<VersionDetails> simpl;
    
    
    
    
    @JsonProperty("checkout")
    private List<VersionDetails> checkout;
    
    
    
}


/*
    Model: VersionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VersionDetails{

    

    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
}


/*
    Model: RefundErrorCodeAndMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundErrorCodeAndMessage{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private IFSCErrorData data;
    
    
    
    
    @JsonProperty("error")
    private EDCError error;
    
    
    
    
    @JsonProperty("errors")
    private EDCError errors;
    
    
    
}


/*
    Model: IFSCErrorData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IFSCErrorData{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("subcode")
    private String subcode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: EDCError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EDCError{

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RefundOptionErrorCodeAndMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionErrorCodeAndMessage{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private RefundOptionMessage message;
    
    
    
    
    @JsonProperty("error")
    private RefundOptionError error;
    
    
    
}


/*
    Model: RefundOptionMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionMessage{

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("description")
    private RefundOptionError description;
    
    
    
    
    @JsonProperty("shipment_id")
    private List<String> shipmentId;
    
    
    
    
    @JsonProperty("order_id")
    private List<String> orderId;
    
    
    
}


/*
    Model: RefundOptionError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundOptionError{

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("shipment_id")
    private List<String> shipmentId;
    
    
    
    
    @JsonProperty("order_id")
    private List<String> orderId;
    
    
    
    
    @JsonProperty("merchant_user_id")
    private List<String> merchantUserId;
    
    
    
    
    @JsonProperty("description")
    private RefundOptionError description;
    
    
    
}


/*
    Model: CardData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardData{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
}


/*
    Model: Account
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Account{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("routing_number")
    private String routingNumber;
    
    
    
    
    @JsonProperty("account_number")
    private String accountNumber;
    
    
    
}


/*
    Model: CartData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("articles")
    private List<Article> articles;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("shipment")
    private HashMap<String,Object> shipment;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("cart_value")
    private Integer cartValue;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_archive")
    private Boolean isArchive;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("coupon_value")
    private Integer couponValue;
    
    
    
    
    @JsonProperty("fc_index_map")
    private List<Integer> fcIndexMap;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    @JsonProperty("applied_coupon_id")
    private String appliedCouponId;
    
    
    
    
    @JsonProperty("original_cart_value")
    private Integer originalCartValue;
    
    
    
    
    @JsonProperty("bulk_coupon_discount")
    private Integer bulkCouponDiscount;
    
    
    
    
    @JsonProperty("fynd_credits_auto_applied")
    private Boolean fyndCreditsAutoApplied;
    
    
    
}


/*
    Model: Article
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Article{

    

    
    
    
    
    @JsonProperty("set")
    private HashMap<String,Object> set;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("c_name")
    private String cName;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("s_city")
    private String sCity;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("fragile")
    private Boolean fragile;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("raw_meta")
    private HashMap<String,Object> rawMeta;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("dimension")
    private Dimension dimension;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("old_price")
    private Integer oldPrice;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("gst_amount")
    private Integer gstAmount;
    
    
    
    
    @JsonProperty("identifier")
    private HashMap<String,Object> identifier;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("unit_price")
    private Integer unitPrice;
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("bulk_margin")
    private Integer bulkMargin;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("custom_meta")
    private HashMap<String,Object> customMeta;
    
    
    
    
    @JsonProperty("article_code")
    private String articleCode;
    
    
    
    
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("bulk_discount")
    private Integer bulkDiscount;
    
    
    
    
    @JsonProperty("store_pincode")
    private Integer storePincode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Integer valueOfGood;
    
    
    
    
    @JsonProperty("last_update_at")
    private String lastUpdateAt;
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("valid_inventory")
    private Boolean validInventory;
    
    
    
    
    @JsonProperty("bulk_coupon_code")
    private String bulkCouponCode;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("referral_credits")
    private Integer referralCredits;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
    @JsonProperty("coupon_article_count")
    private Integer couponArticleCount;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("article_assign_status")
    private Boolean articleAssignStatus;
    
    
    
    
    @JsonProperty("quantity_assign_status")
    private Boolean quantityAssignStatus;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Integer couponEffectiveDiscount;
    
    
    
}


/*
    Model: Weight
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Weight{

    

    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: Dimension
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimension{

    

    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
    @JsonProperty("length")
    private Integer length;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: Manufacturer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Manufacturer{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
}


/*
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignment{

    

    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
}


/*
    Model: CartUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartUser{

    

    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("is_authenticated")
    private Boolean isAuthenticated;
    
    
    
}


/*
    Model: Affiliate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Affiliate{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("config")
    private HashMap<String,Object> config;
    
    
    
}


/*
    Model: Address
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Address{

    

    
    
    
    
    @JsonProperty("street")
    private String street;
    
    
    
    
    @JsonProperty("zip")
    private String zip;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("delivery_address_id")
    private Integer deliveryAddressId;
    
    
    
}


/*
    Model: PaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethod{

    

    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: CardReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardReq{

    

    
    
    
    
    @JsonProperty("cart")
    private CartData cart;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("user")
    private CartUser user;
    
    
    
    
    @JsonProperty("coupon")
    private HashMap<String,Object> coupon;
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("billing_address")
    private Address billingAddress;
    
    
    
    
    @JsonProperty("delivery_address")
    private Address deliveryAddress;
    
    
    
    
    @JsonProperty("redemption_rules")
    private HashMap<String,Object> redemptionRules;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private HashMap<String,Object> pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("coupon_id")
    private String couponId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("cart_value")
    private Integer cartValue;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
    @JsonProperty("cashback_id")
    private String cashbackId;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("employee_id")
    private String employeeId;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("ordering_store")
    private String orderingStore;
    
    
    
}


/*
    Model: UpdateAggregatorCardReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateAggregatorCardReq{

    

    
    
    
    
    @JsonProperty("refresh")
    private Boolean refresh;
    
    
    
}


/*
    Model: UpdateAggregatorCardDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateAggregatorCardDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cards")
    private AggregatorCard cards;
    
    
    
}


/*
    Model: AggregatorCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorCard{

    

    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
}


/*
    Model: UpdateCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCard{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
}


/*
    Model: PaymentCallbackDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentCallbackDetails{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: PaymentConfirmation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmation{

    

    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
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
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
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
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
}


/*
    Model: CardOutageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CardOutageData{

    

    
    
    
    
    @JsonProperty("severity")
    private String severity;
    
    
    
    
    @JsonProperty("issuer_code")
    private String issuerCode;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("network")
    private String network;
    
    
    
}


/*
    Model: IntentUpiOutageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentUpiOutageData{

    

    
    
    
    
    @JsonProperty("severity")
    private String severity;
    
    
    
    
    @JsonProperty("psp")
    private String psp;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
}


/*
    Model: CollectUpiOutageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectUpiOutageData{

    

    
    
    
    
    @JsonProperty("severity")
    private String severity;
    
    
    
    
    @JsonProperty("vpa_handle")
    private String vpaHandle;
    
    
    
}


/*
    Model: NetBankingOutageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NetBankingOutageData{

    

    
    
    
    
    @JsonProperty("severity")
    private String severity;
    
    
    
    
    @JsonProperty("bank_code")
    private String bankCode;
    
    
    
}


/*
    Model: SeverityMessages
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeverityMessages{

    

    
    
    
    
    @JsonProperty("high")
    private String high;
    
    
    
    
    @JsonProperty("medium")
    private String medium;
    
    
    
}


/*
    Model: OutageData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutageData{

    

    
    
    
    
    @JsonProperty("card")
    private List<CardOutageData> card;
    
    
    
    
    @JsonProperty("intentupi")
    private List<IntentUpiOutageData> intentupi;
    
    
    
    
    @JsonProperty("collectupi")
    private List<CollectUpiOutageData> collectupi;
    
    
    
    
    @JsonProperty("netbanking")
    private List<NetBankingOutageData> netbanking;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("severity_messages")
    private SeverityMessages severityMessages;
    
    
    
}


/*
    Model: PaymentOutageResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOutageResponseData{

    

    
    
    
    
    @JsonProperty("data")
    private OutageData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: HttpErrorCodeAndMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorCodeAndMessage{

    

    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}




}