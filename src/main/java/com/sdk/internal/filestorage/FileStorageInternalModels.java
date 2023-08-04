
package com.sdk.internal.filestorage;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class FileStorageInternalModels{


/*
    Model: GenerateShipmentRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateShipmentRequestBody{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<Object> shipmentIds;
    
    
    
    
    @JsonProperty("invoice_document_type")
    private String invoiceDocumentType;
    
    
    
    
    @JsonProperty("label_document_type")
    private String labelDocumentType;
    
    
    
    
    @JsonProperty("document")
    private List<Object> document;
    
    
    
}


/*
    Model: GenerateShipment200
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateShipment200{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
    @JsonProperty("trace_id")
    private Double traceId;
    
    
    
}


/*
    Model: GenerateShipment400
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateShipment400{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: GenerateShipment500
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateShipment500{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
}




}