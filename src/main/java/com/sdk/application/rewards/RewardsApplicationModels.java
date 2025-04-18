

package com.sdk.application.rewards;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class RewardsApplicationModels{


/*
    Model: RewardsArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardsArticle{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
}


/*
    Model: CatalogueOrderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogueOrderResponse{

    

    
    
    
    
    @JsonProperty("articles")
    private List<RewardsArticle> articles;
    
    
    
}


/*
    Model: CatalogueOrderRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogueOrderRequest{

    

    
    
    
    
    @JsonProperty("articles")
    private List<RewardsArticle> articles;
    
    
    
}


/*
    Model: PointsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PointsResponse{

    

    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
}


/*
    Model: ReferralDetailsUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReferralDetailsUser{

    

    
    
    
    
    @JsonProperty("blocked")
    private Boolean blocked;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    @JsonProperty("redeemed")
    private Boolean redeemed;
    
    
    
    
    @JsonProperty("referral_code")
    private String referralCode;
    
    
    
}


/*
    Model: Offer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Offer{

    

    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rule")
    private Object rule;
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    @JsonProperty("sub_text")
    private String subText;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: Schedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Schedule{

    

    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
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

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: Asset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Asset{

    

    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: ShareMessages
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShareMessages{

    

    
    
    
    
    @JsonProperty("email")
    private Integer email;
    
    
    
    
    @JsonProperty("facebook")
    private String facebook;
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("messenger")
    private String messenger;
    
    
    
    
    @JsonProperty("sms")
    private String sms;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("twitter")
    private String twitter;
    
    
    
    
    @JsonProperty("whatsapp")
    private String whatsapp;
    
    
    
}


/*
    Model: ReferralDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReferralDetailsResponse{

    

    
    
    
    
    @JsonProperty("referral")
    private Offer referral;
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    @JsonProperty("user")
    private ReferralDetailsUser user;
    
    
    
    
    @JsonProperty("referrer_info")
    private String referrerInfo;
    
    
    
    
    @JsonProperty("terms_conditions_link")
    private String termsConditionsLink;
    
    
    
}


/*
    Model: OrderDiscountRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDiscountRequest{

    

    
    
    
    
    @JsonProperty("order_amount")
    private Double orderAmount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
}


/*
    Model: OrderDiscountRuleBucket
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDiscountRuleBucket{

    

    
    
    
    
    @JsonProperty("high")
    private Double high;
    
    
    
    
    @JsonProperty("low")
    private Double low;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
}


/*
    Model: DiscountProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountProperties{

    

    
    
    
    
    @JsonProperty("absolute")
    private Double absolute;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("display_absolute")
    private String displayAbsolute;
    
    
    
    
    @JsonProperty("display_percent")
    private String displayPercent;
    
    
    
    
    @JsonProperty("percent")
    private Double percent;
    
    
    
}


/*
    Model: OrderDiscountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDiscountResponse{

    

    
    
    
    
    @JsonProperty("order_amount")
    private Double orderAmount;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    @JsonProperty("discount")
    private DiscountProperties discount;
    
    
    
    
    @JsonProperty("base_discount")
    private DiscountProperties baseDiscount;
    
    
    
    
    @JsonProperty("applied_rule_bucket")
    private OrderDiscountRuleBucket appliedRuleBucket;
    
    
    
}


/*
    Model: RedeemReferralCodeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedeemReferralCodeRequest{

    

    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("referral_code")
    private String referralCode;
    
    
    
}


/*
    Model: RedeemReferralCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedeemReferralCodeResponse{

    

    
    
    
    
    @JsonProperty("redeemed")
    private Boolean redeemed;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("referrer_info")
    private String referrerInfo;
    
    
    
    
    @JsonProperty("referrer_id")
    private String referrerId;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
}


/*
    Model: PointsHistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PointsHistoryResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<PointsHistory> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PointsHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PointsHistory{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("claimed")
    private Boolean claimed;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    @JsonProperty("remaining_points")
    private Double remainingPoints;
    
    
    
    
    @JsonProperty("text_1")
    private String text1;
    
    
    
    
    @JsonProperty("text_2")
    private String text2;
    
    
    
    
    @JsonProperty("text_3")
    private String text3;
    
    
    
    
    @JsonProperty("txn_name")
    private String txnName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
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




}