

package com.sdk.partner.webhook;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WebhookPartnerModels{


/*
    Model: KafkaConfigValidateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaConfigValidateResponse{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: KafkaConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaConfigResponse{

    

    
    
    
    
    @JsonProperty("id")
    private Double id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("client_id")
    private String clientId;
    
    
    
    
    @JsonProperty("brokers")
    private List<String> brokers;
    
    
    
    
    @JsonProperty("ssl_enabled")
    private Boolean sslEnabled;
    
    
    
    
    @JsonProperty("sasl_enabled")
    private Boolean saslEnabled;
    
    
    
    
    @JsonProperty("sasl_configuration")
    private HashMap<String,Object> saslConfiguration;
    
    
    
    
    @JsonProperty("ssl_configuration")
    private HashMap<String,Object> sslConfiguration;
    
    
    
    
    @JsonProperty("connection_timeout")
    private Double connectionTimeout;
    
    
    
    
    @JsonProperty("authentication_timeout")
    private Double authenticationTimeout;
    
    
    
    
    @JsonProperty("request_timeout")
    private Double requestTimeout;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("association")
    private HashMap<String,Object> association;
    
    
    
}


/*
    Model: KafkaConfigUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaConfigUpdateRequest{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("client_id")
    private String clientId;
    
    
    
    
    @JsonProperty("brokers")
    private List<String> brokers;
    
    
    
    
    @JsonProperty("ssl_enabled")
    private Boolean sslEnabled;
    
    
    
    
    @JsonProperty("sasl_enabled")
    private Boolean saslEnabled;
    
    
    
    
    @JsonProperty("sasl_configuration")
    private HashMap<String,Object> saslConfiguration;
    
    
    
    
    @JsonProperty("ssl_configuration")
    private HashMap<String,Object> sslConfiguration;
    
    
    
    
    @JsonProperty("connection_timeout")
    private Double connectionTimeout;
    
    
    
    
    @JsonProperty("authentication_timeout")
    private Double authenticationTimeout;
    
    
    
    
    @JsonProperty("request_timeout")
    private Double requestTimeout;
    
    
    
    
    @JsonProperty("id")
    private Double id;
    
    
    
}


/*
    Model: KafkaConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaConfigRequest{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("client_id")
    private String clientId;
    
    
    
    
    @JsonProperty("brokers")
    private List<String> brokers;
    
    
    
    
    @JsonProperty("ssl_enabled")
    private Boolean sslEnabled;
    
    
    
    
    @JsonProperty("sasl_enabled")
    private Boolean saslEnabled;
    
    
    
    
    @JsonProperty("sasl_configuration")
    private HashMap<String,Object> saslConfiguration;
    
    
    
    
    @JsonProperty("ssl_configuration")
    private HashMap<String,Object> sslConfiguration;
    
    
    
    
    @JsonProperty("connection_timeout")
    private Double connectionTimeout;
    
    
    
    
    @JsonProperty("authentication_timeout")
    private Double authenticationTimeout;
    
    
    
    
    @JsonProperty("request_timeout")
    private Double requestTimeout;
    
    
    
}


/*
    Model: UpdateSubscriberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateSubscriberResponse{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: UpdateSubscriberRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateSubscriberRequest{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: Association
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Association{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private List<String> applicationId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
}


/*
    Model: AuthMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthMeta{

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
}


/*
    Model: SubscriberEventMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberEventMapping{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("event_id")
    private Integer eventId;
    
    
    
    
    @JsonProperty("subscriber_id")
    private Integer subscriberId;
    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: EventConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigResponse{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("event_schema")
    private HashMap<String,Object> eventSchema;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("subscriber_event_mapping")
    private SubscriberEventMapping subscriberEventMapping;
    
    
    
}


/*
    Model: SubscriberConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfigResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<ItemSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: InvalidEventsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidEventsRequest{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
}


/*
    Model: InvalidEventsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidEventsResponse{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("count")
    private Double count;
    
    
    
}


/*
    Model: DownloadReponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReponse{

    

    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
}


/*
    Model: HistoryFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryFilters{

    

    
    
    
    
    @JsonProperty("events")
    private List<String> events;
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("subscribers")
    private List<Integer> subscribers;
    
    
    
}


/*
    Model: Url
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Url{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CdnObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CdnObject{

    

    
    
    
    
    @JsonProperty("urls")
    private List<Url> urls;
    
    
    
}


/*
    Model: UploadServiceObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadServiceObject{

    

    
    
    
    
    @JsonProperty("cdn")
    private CdnObject cdn;
    
    
    
}


/*
    Model: HistoryAssociation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryAssociation{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("subscriber_ids")
    private List<Integer> subscriberIds;
    
    
    
}


/*
    Model: HistoryItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryItems{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("association")
    private HistoryAssociation association;
    
    
    
    
    @JsonProperty("filters")
    private HistoryFilters filters;
    
    
    
    
    @JsonProperty("filename")
    private String filename;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("upload_service_response")
    private UploadServiceObject uploadServiceResponse;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: HistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<HistoryItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: HistoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryPayload{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: CancelDownloadResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelDownloadResponse{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("result")
    private String result;
    
    
    
}


/*
    Model: FilterReportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterReportResponse{

    

    
    
    
    
    @JsonProperty("filter_name")
    private String filterName;
    
    
    
    
    @JsonProperty("values")
    private List<HashMap<String,Object>> values;
    
    
    
}


/*
    Model: DeliveryTsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryTsResponse{

    

    
    
    
    
    @JsonProperty("delivery_ts")
    private List<DeliveryTsSchema> deliveryTs;
    
    
    
}


/*
    Model: DeliveryTsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryTsSchema{

    

    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("failed")
    private Double failed;
    
    
    
    
    @JsonProperty("removed_webhooks")
    private Double removedWebhooks;
    
    
    
    
    @JsonProperty("success")
    private Double success;
    
    
    
}


/*
    Model: DeliveryDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryDetailsRequest{

    

    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("page_no")
    private Double pageNo;
    
    
    
    
    @JsonProperty("page_size")
    private Double pageSize;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("event")
    private List<EventDeliveryDetailSchema> event;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: EventDeliveryDetailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventDeliveryDetailSchema{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
}


/*
    Model: DeliveryDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryDetailsResponse{

    

    
    
    
    
    @JsonProperty("rows")
    private List<EventProcessReportObject> rows;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: EventProcessReportObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventProcessReportObject{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("response_code")
    private Integer responseCode;
    
    
    
    
    @JsonProperty("response_message")
    private String responseMessage;
    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("attempt")
    private Integer attempt;
    
    
    
    
    @JsonProperty("last_attempted_on")
    private Integer lastAttemptedOn;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("response_time")
    private Integer responseTime;
    
    
    
    
    @JsonProperty("message_id")
    private String messageId;
    
    
    
    
    @JsonProperty("event_trace_id")
    private String eventTraceId;
    
    
    
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
    Model: DeliveryEventLevelSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryEventLevelSchema{

    

    
    
    
    
    @JsonProperty("event")
    private String event;
    
    
    
    
    @JsonProperty("success")
    private Double success;
    
    
    
    
    @JsonProperty("failed")
    private Double failed;
    
    
    
    
    @JsonProperty("failed_percentage")
    private Double failedPercentage;
    
    
    
    
    @JsonProperty("removed_webhooks")
    private Double removedWebhooks;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("response_time")
    private Double responseTime;
    
    
    
}


/*
    Model: DeliverySummaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliverySummaryResponse{

    

    
    
    
    
    @JsonProperty("delivery_event_level")
    private List<DeliveryEventLevelSchema> deliveryEventLevel;
    
    
    
    
    @JsonProperty("delivery_summary")
    private DeliverySummarySchema deliverySummary;
    
    
    
}


/*
    Model: DeliverySummarySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliverySummarySchema{

    

    
    
    
    
    @JsonProperty("success")
    private Double success;
    
    
    
    
    @JsonProperty("response_time")
    private Double responseTime;
    
    
    
    
    @JsonProperty("failed_percentage")
    private Double failedPercentage;
    
    
    
    
    @JsonProperty("removed_webhooks")
    private Double removedWebhooks;
    
    
    
}


/*
    Model: ItemSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemSchema{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfigResponse> eventConfigs;
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
}




}