

package com.sdk.application.webhook;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class WebhookApplicationModels{


/*
    Model: ClickEventBatch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ClickEventBatch{

    

    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
}


/*
    Model: ClickEventRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ClickEventRequest{

    

    
    
    
    
    @JsonProperty("batch")
    private List<ClickEventBatch> batch;
    
    
    
}


/*
    Model: ClickEventResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ClickEventResponse{

    

    
    
    
    
    @JsonProperty("success_count")
    private Integer successCount;
    
    
    
    
    @JsonProperty("failed_count")
    private Integer failedCount;
    
    
    
    
    @JsonProperty("failed_events")
    private List<ClickEventBatch> failedEvents;
    
    
    
}




}