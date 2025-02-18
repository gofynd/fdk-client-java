

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
    Model: SubscriberUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberUpdate{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: SubscriberUpdateResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberUpdateResult{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
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
    Model: BroadcasterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BroadcasterConfig{

    

    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
    
    @JsonProperty("queue")
    private String queue;
    
    
    
    
    @JsonProperty("event_bridge_name")
    private String eventBridgeName;
    
    
    
    
    @JsonProperty("workflow_name")
    private String workflowName;
    
    
    
    
    @JsonProperty("account_id")
    private String accountId;
    
    
    
    
    @JsonProperty("detail_type")
    private String detailType;
    
    
    
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
    
    
    
    
    @JsonProperty("filters")
    private FilterSchema filters;
    
    
    
    
    @JsonProperty("reducer")
    private HashMap<String,Object> reducer;
    
    
    
    
    @JsonProperty("broadcaster_config")
    private BroadcasterConfig broadcasterConfig;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: FilterSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterSchema{

    

    
    
    
    
    @JsonProperty("query")
    private String query;
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
    @JsonProperty("logic")
    private String logic;
    
    
    
    
    @JsonProperty("conditions")
    private List<HashMap<String,Object>> conditions;
    
    
    
}


/*
    Model: EventConfigDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigDetails{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    @JsonProperty("subscriber_event_mapping")
    private SubscriberEventMapping subscriberEventMapping;
    
    
    
}


/*
    Model: SubscriberConfigDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfigDetails{

    

    
    
    
    
    @JsonProperty("items")
    private List<ItemSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: InvalidEventsPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidEventsPayload{

    

    
    
    
    
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
    Model: InvalidEventsResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidEventsResult{

    

    
    
    
    
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
    
    
    
    
    @JsonProperty("webhook_type")
    private List<String> webhookType;
    
    
    
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
    Model: HistoryResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryResult{

    

    
    
    
    
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
    Model: CancelDownloadResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelDownloadResult{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("result")
    private String result;
    
    
    
}


/*
    Model: FilterReportResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterReportResult{

    

    
    
    
    
    @JsonProperty("filter_name")
    private String filterName;
    
    
    
    
    @JsonProperty("values")
    private List<HashMap<String,Object>> values;
    
    
    
}


/*
    Model: DeliveryTsResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryTsResult{

    

    
    
    
    
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
    Model: DeliveryDetailsPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryDetailsPayload{

    

    
    
    
    
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
    Model: DeliveryDetailsResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryDetailsResult{

    

    
    
    
    
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
    private String data;
    
    
    
    
    @JsonProperty("attempt")
    private Integer attempt;
    
    
    
    
    @JsonProperty("last_attempted_on")
    private Double lastAttemptedOn;
    
    
    
    
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
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
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
    Model: ResponseTimeTs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseTimeTs{

    

    
    
    
    
    @JsonProperty("avg_response_time_ts")
    private List<AvgResponseTime> avgResponseTimeTs;
    
    
    
}


/*
    Model: AvgResponseTime
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvgResponseTime{

    

    
    
    
    
    @JsonProperty("last_attempted_on")
    private String lastAttemptedOn;
    
    
    
    
    @JsonProperty("response_code")
    private Double responseCode;
    
    
    
    
    @JsonProperty("response_time")
    private String responseTime;
    
    
    
    
    @JsonProperty("attempt")
    private Double attempt;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
}


/*
    Model: DeliverySummaryResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliverySummaryResult{

    

    
    
    
    
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
    private HashMap<String,Object> customHeaders;
    
    
    
    
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
    private List<EventConfigDetails> eventConfigs;
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
}




}