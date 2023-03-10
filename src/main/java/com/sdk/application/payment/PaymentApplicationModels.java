
package com.sdk.application.payment;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
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
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("merchant_id")
    private String merchantId;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("merchant_key")
    private String merchantKey;
    
    
    
    
    @JsonProperty("verify_api")
    private String verifyApi;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("sdk")
    private Boolean sdk;
    
    
    
    
    @JsonProperty("pin")
    private String pin;
    
    
    
}


/*
    Model: AggregatorsConfigDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AggregatorsConfigDetailResponse{
    
    
    
    
    @JsonProperty("env")
    private String env;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorConfigDetail razorpay;
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorConfigDetail ccavenue;
    
    
    
    
    @JsonProperty("mswipe")
    private AggregatorConfigDetail mswipe;
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorConfigDetail rupifi;
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorConfigDetail juspay;
    
    
    
    
    @JsonProperty("payumoney")
    private AggregatorConfigDetail payumoney;
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorConfigDetail stripe;
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorConfigDetail simpl;
    
    
    
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
    Model: AttachCardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachCardRequest{
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("refresh")
    private Boolean refresh;
    
    
    
    
    @JsonProperty("name_on_card")
    private String nameOnCard;
    
    
    
}


/*
    Model: AttachCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttachCardsResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: ActiveCardPaymentGatewayResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActiveCardPaymentGatewayResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("cards")
    private CardPaymentGateway cards;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
}


/*
    Model: ListCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListCardsResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private List<Card> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: DeletehCardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeletehCardRequest{
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
}


/*
    Model: DeleteCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteCardsResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("merchant_params")
    private Object merchantParams;
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private Integer transactionAmountInPaise;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ChargeCustomerRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeCustomerRequest{
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("transaction_token")
    private String transactionToken;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
}


/*
    Model: ChargeCustomerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeCustomerResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_address_id")
    private String deliveryAddressId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("upi_poll_url")
    private String upiPollUrl;
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
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
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
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
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
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
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
    
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
    
    
    
    
    @JsonProperty("cod_limit")
    private Double codLimit;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("remaining_limit")
    private Double remainingLimit;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("intent_app")
    private List<IntentApp> intentApp;
    
    
    
    
    @JsonProperty("cod_limit_per_order")
    private Double codLimitPerOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("intent_app_error_dict_list")
    private List<IntentAppErrorList> intentAppErrorDictList;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
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
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
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
    
    
    
    
    @JsonProperty("payment_flow_data")
    private String paymentFlowData;
    
    
    
    
    @JsonProperty("payment_flow")
    private String paymentFlow;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("api_link")
    private String apiLink;
    
    
    
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
    
    
    
    
    @JsonProperty("epaylater")
    private AggregatorRoute epaylater;
    
    
    
    
    @JsonProperty("fynd")
    private AggregatorRoute fynd;
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorRoute razorpay;
    
    
    
    
    @JsonProperty("payubiz")
    private AggregatorRoute payubiz;
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorRoute ccavenue;
    
    
    
    
    @JsonProperty("upi_razorpay")
    private AggregatorRoute upiRazorpay;
    
    
    
    
    @JsonProperty("jiopay")
    private AggregatorRoute jiopay;
    
    
    
    
    @JsonProperty("mswipe")
    private AggregatorRoute mswipe;
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorRoute rupifi;
    
    
    
    
    @JsonProperty("bqr_razorpay")
    private AggregatorRoute bqrRazorpay;
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorRoute juspay;
    
    
    
    
    @JsonProperty("ajiodhan")
    private AggregatorRoute ajiodhan;
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorRoute stripe;
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorRoute simpl;
    
    
    
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
    Model: PaymentModeRouteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeRouteResponse{
    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptionAndFlow paymentOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("kyc_url")
    private String kycUrl;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: RupifiBannerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RupifiBannerResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("display")
    private Boolean display;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: EpaylaterBannerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EpaylaterBannerResponse{
    
    
    
    
    @JsonProperty("data")
    private EpaylaterBannerData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private LinkStatus data;
    
    
    
    
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
    
    
    
    
    @JsonProperty("logo_large")
    private String logoLarge;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo_small")
    private String logoSmall;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
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
    Model: TransferModeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransferModeResponse{
    
    
    
    
    @JsonProperty("data")
    private List<TransferModeDetails> data;
    
    
    
}


/*
    Model: UpdateRefundTransferModeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateRefundTransferModeRequest{
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
}


/*
    Model: UpdateRefundTransferModeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateRefundTransferModeResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
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
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
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
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryViaOtpVerificationRequest{
    
    
    
    
    @JsonProperty("hash_key")
    private String hashKey;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryViaOtpVerificationResponse{
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
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
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsRequest{
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("delights")
    private Boolean delights;
    
    
    
    
    @JsonProperty("details")
    private BeneficiaryModeDetails details;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
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
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
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
    Model: WalletOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletOtpRequest{
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: WalletOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WalletOtpResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private String isVerifiedFlag;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: SetDefaultBeneficiaryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetDefaultBeneficiaryRequest{
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: SetDefaultBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetDefaultBeneficiaryResponse{
    
    
    
    
    @JsonProperty("is_beneficiary_set")
    private Boolean isBeneficiarySet;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
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
    
    
    
    
    @JsonProperty("balance")
    private BalanceDetails balance;
    
    
    
    
    @JsonProperty("credit_line_id")
    private String creditLineId;
    
    
    
    
    @JsonProperty("merchant_customer_ref_id")
    private String merchantCustomerRefId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("status_message")
    private String statusMessage;
    
    
    
    
    @JsonProperty("buyer_status")
    private String buyerStatus;
    
    
    
    
    @JsonProperty("amount_available")
    private BalanceDetails amountAvailable;
    
    
    
}


/*
    Model: CustomerCreditSummaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerCreditSummaryResponse{
    
    
    
    
    @JsonProperty("data")
    private CreditSummary data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    
    
    
    
    @JsonProperty("signup_url")
    private String signupUrl;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: RedirectToAggregatorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedirectToAggregatorResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("is_registered")
    private Boolean isRegistered;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("signup_url")
    private String signupUrl;
    
    
    
}


/*
    Model: CheckCreditResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckCreditResponse{
    
    
    
    
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
    
    
    
    
    @JsonProperty("ownership_type")
    private String ownershipType;
    
    
    
    
    @JsonProperty("land_mark")
    private String landMark;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("addressline1")
    private String addressline1;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("addressline2")
    private String addressline2;
    
    
    
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
    
    
    
    
    @JsonProperty("vintage")
    private String vintage;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("fssai")
    private String fssai;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("business_ownership_type")
    private String businessOwnershipType;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("fda")
    private String fda;
    
    
    
    
    @JsonProperty("address")
    private KYCAddress address;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("shop_and_establishment")
    private Object shopAndEstablishment;
    
    
    
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
    
    
    
    
    @JsonProperty("passport")
    private String passport;
    
    
    
    
    @JsonProperty("fathers_name")
    private String fathersName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address_as_per_id")
    private KYCAddress addressAsPerId;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("driving_license")
    private String drivingLicense;
    
    
    
    
    @JsonProperty("mobile_verified")
    private Boolean mobileVerified;
    
    
    
    
    @JsonProperty("mothers_name")
    private String mothersName;
    
    
    
    
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("voter_id")
    private String voterId;
    
    
    
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
    
    
    
    
    @JsonProperty("device_type")
    private String deviceType;
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    @JsonProperty("identification_number")
    private String identificationNumber;
    
    
    
    
    @JsonProperty("os_version")
    private String osVersion;
    
    
    
    
    @JsonProperty("device_model")
    private String deviceModel;
    
    
    
    
    @JsonProperty("os")
    private String os;
    
    
    
    
    @JsonProperty("device_make")
    private String deviceMake;
    
    
    
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
    
    
    
    
    @JsonProperty("membership_id")
    private String membershipId;
    
    
    
    
    @JsonProperty("date_of_joining")
    private String dateOfJoining;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CustomerOnboardingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerOnboardingRequest{
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("business_info")
    private BusinessDetails businessInfo;
    
    
    
    
    @JsonProperty("personal_info")
    private UserPersonalInfoInDetails personalInfo;
    
    
    
    
    @JsonProperty("device")
    private DeviceDetails device;
    
    
    
    
    @JsonProperty("mcc")
    private String mcc;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("marketplace_info")
    private MarketplaceInfo marketplaceInfo;
    
    
    
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
    
    
    
    
    @JsonProperty("session")
    private Object session;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: CustomerOnboardingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerOnboardingResponse{
    
    
    
    
    @JsonProperty("data")
    private OnboardSummary data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: OutstandingOrderDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OutstandingOrderDetailsResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaidOrderDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaidOrderDetailsResponse{
    
    
    
    
    @JsonProperty("status_code")
    private Integer statusCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}






}