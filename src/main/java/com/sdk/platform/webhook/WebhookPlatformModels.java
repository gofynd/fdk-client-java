

package com.sdk.platform.webhook;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WebhookPlatformModels{


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

    

    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: Event
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Event{

    

    
    
    
    
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
    Model: RetryEventRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetryEventRequest{

    

    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("subscriber_ids")
    private List<Integer> subscriberIds;
    
    
    
    
    @JsonProperty("event")
    private List<Event> event;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: Item
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Item{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: RetryCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetryCountResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<Item> items;
    
    
    
}


/*
    Model: RetrySuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetrySuccessResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: Err
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Err{

    

    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("param")
    private String param;
    
    
    
    
    @JsonProperty("location")
    private String location;
    
    
    
}


/*
    Model: RetryFailureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetryFailureResponse{

    

    
    
    
    
    @JsonProperty("err")
    private List<Err> err;
    
    
    
}


/*
    Model: RetryStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RetryStatusResponse{

    

    
    
    
    
    @JsonProperty("total_event")
    private Integer totalEvent;
    
    
    
    
    @JsonProperty("success_count")
    private Integer successCount;
    
    
    
    
    @JsonProperty("failure_count")
    private Integer failureCount;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: EventProcessRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventProcessRequest{

    

    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("subscriber_ids")
    private List<Integer> subscriberIds;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("event")
    private List<Event> event;
    
    
    
}


/*
    Model: DownloadReportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportResponse{

    

    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
}


/*
    Model: EventProcessReports
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventProcessReports{

    

    
    
    
    
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
    
    
    
}


/*
    Model: PingWebhook
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PingWebhook{

    

    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("auth_meta")
    private Object authMeta;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
}


/*
    Model: PingWebhookResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PingWebhookResponse{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
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
    private Double id;
    
    
    
    
    @JsonProperty("event_id")
    private Double eventId;
    
    
    
    
    @JsonProperty("subscriber_id")
    private Double subscriberId;
    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
}


/*
    Model: EventConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfig{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("subscriber_event_mapping")
    private SubscriberEventMapping subscriberEventMapping;
    
    
    
    
    @JsonProperty("event_schema")
    private HashMap<String,Object> eventSchema;
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
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

    

    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfig> eventConfigs;
    
    
    
}


/*
    Model: ReportFiltersPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReportFiltersPayload{

    

    
    
    
    
    @JsonProperty("subscriber_ids")
    private List<Integer> subscriberIds;
    
    
    
}


/*
    Model: ReportFilterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReportFilterResponse{

    

    
    
    
    
    @JsonProperty("filter_name")
    private String filterName;
    
    
    
    
    @JsonProperty("values")
    private List<HashMap<String,Object>> values;
    
    
    
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

    

    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
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
    Model: CancelResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelResponse{

    

    
    
    
    
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
    Model: SubscriberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberResponse{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("status")
    private SubscriberStatus status;
    
    
    
    
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
    private List<EventConfig> eventConfigs;
    
    
    
}


/*
    Model: Events
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Events{

    

    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
}


/*
    Model: SubscriberConfigRequestV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfigRequestV2{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
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
    private SubscriberStatus status;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    @JsonProperty("events")
    private List<Events> events;
    
    
    
}


/*
    Model: SubscriberConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfig{

    

    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("status")
    private SubscriberStatus status;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
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
    private SubscriberStatus status;
    
    
    
    
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
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
}


/*
    Model: SubscriberConfigList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfigList{

    

    
    
    
    
    @JsonProperty("items")
    private List<SubscriberResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}




    
    /*
        Enum: SubscriberStatus
        Used By: Webhook
    */
    @Getter
    public enum SubscriberStatus {

        
        active("active"), 
        
        inactive("inactive");
        

        private String priority;
        SubscriberStatus(String priority) {
            this.priority = priority;
        }

        @JsonValue
        public String getPriority() {
            return priority;
        }

    }


}