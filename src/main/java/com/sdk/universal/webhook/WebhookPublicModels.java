

package com.sdk.universal.webhook;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WebhookPublicModels{


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
    
    
    
}


/*
    Model: EventDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventDetails{

    

    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfig> eventConfigs;
    
    
    
}


/*
    Model: EventConfigBase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigBase{

    

    
    
    
    
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
    Model: EventNotifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventNotifier{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
}


/*
    Model: EventSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSchema{

    

    
    
    
    
    @JsonProperty("payload")
    private HashMap<String,Object> payload;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: InternalTransformEvent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalTransformEvent{

    

    
    
    
    
    @JsonProperty("trace_id")
    private List<String> traceId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("created_timestamp")
    private Double createdTimestamp;
    
    
    
}


/*
    Model: TransformEventData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformEventData{

    

    
    
    
    
    @JsonProperty("event")
    private InternalTransformEvent event;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("contains")
    private List<String> contains;
    
    
    
    
    @JsonProperty("payload")
    private HashMap<String,Object> payload;
    
    
    
}


/*
    Model: TransformEventServiceMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformEventServiceMeta{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: TransformEventAssociation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformEventAssociation{

    

    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
}


/*
    Model: TransformEventPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformEventPayload{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("event_version")
    private String eventVersion;
    
    
    
    
    @JsonProperty("event")
    private EventSchema event;
    
    
    
}


/*
    Model: ValidateSchemaPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateSchemaPayload{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("event_version")
    private String eventVersion;
    
    
    
    
    @JsonProperty("event")
    private EventSchema event;
    
    
    
    
    @JsonProperty("event_schema")
    private HashMap<String,Object> eventSchema;
    
    
    
}


/*
    Model: ValidateSchemaResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateSchemaResult{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: TransformEventResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TransformEventResult{

    

    
    
    
    
    @JsonProperty("event_trace_id")
    private List<String> eventTraceId;
    
    
    
    
    @JsonProperty("data")
    private TransformEventData data;
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("service_meta")
    private TransformEventServiceMeta serviceMeta;
    
    
    
    
    @JsonProperty("association")
    private TransformEventAssociation association;
    
    
    
}




}