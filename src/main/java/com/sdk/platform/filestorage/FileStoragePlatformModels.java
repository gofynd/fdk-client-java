

package com.sdk.platform.filestorage;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class FileStoragePlatformModels{


/*
    Model: FailedBrowseFilesResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FailedBrowseFilesResult{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CDN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CDN{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("absolute_url")
    private String absoluteUrl;
    
    
    
    
    @JsonProperty("relative_url")
    private String relativeUrl;
    
    
    
}


/*
    Model: Upload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Upload{

    

    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: FileUpload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUpload{

    

    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: FileUploadStart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUploadStart{

    

    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,Object> params;
    
    
    
}


/*
    Model: CreatedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedBy{

    

    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
}


/*
    Model: FileUploadComplete
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUploadComplete{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
}


/*
    Model: ProxyFileAccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProxyFileAccess{

    

    
    
    
    
    @JsonProperty("data")
    private HashMap<String,Object> data;
    
    
    
    
    @JsonProperty("support")
    private HashMap<String,Object> support;
    
    
    
}


/*
    Model: DestinationNamespace
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DestinationNamespace{

    

    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
}


/*
    Model: CopyFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CopyFiles{

    

    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
    @JsonProperty("destination")
    private DestinationNamespace destination;
    
    
    
}


/*
    Model: Urls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Urls{

    

    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("signed_url")
    private String signedUrl;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
}


/*
    Model: SignUrlResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignUrlResult{

    

    
    
    
    
    @JsonProperty("urls")
    private List<Urls> urls;
    
    
    
}


/*
    Model: SignUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignUrl{

    

    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
}


/*
    Model: PdfConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfig{

    

    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("default_template")
    private Boolean defaultTemplate;
    
    
    
}


/*
    Model: PdfConfigSuccessData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfigSuccessData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: PdfConfigSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfigSuccess{

    

    
    
    
    
    @JsonProperty("data")
    private List<PdfConfigSuccessData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PdfConfigSaveSuccessData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfigSaveSuccessData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: PdfConfigSaveSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfigSaveSuccess{

    

    
    
    
    
    @JsonProperty("data")
    private PdfConfigSaveSuccessData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentReceiptRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptRequestBody{

    

    
    
    
    
    @JsonProperty("payload")
    private PaymentReceiptPayload payload;
    
    
    
    
    @JsonProperty("meta")
    private PaymentReceiptMeta meta;
    
    
    
}


/*
    Model: PaymentReceiptOrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptOrderDetails{

    

    
    
    
    
    @JsonProperty("jiomart_order_id")
    private String jiomartOrderId;
    
    
    
    
    @JsonProperty("total_items")
    private Double totalItems;
    
    
    
    
    @JsonProperty("final_amount")
    private Double finalAmount;
    
    
    
    
    @JsonProperty("final_amount_in_words")
    private String finalAmountInWords;
    
    
    
    
    @JsonProperty("order_created_date")
    private String orderCreatedDate;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
    @JsonProperty("prm_id")
    private String prmId;
    
    
    
    
    @JsonProperty("receipt_no")
    private String receiptNo;
    
    
    
    
    @JsonProperty("taxes")
    private PaymentReceiptTaxes taxes;
    
    
    
}


/*
    Model: PaymentReceiptCustomerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptCustomerDetails{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("mobile_number")
    private String mobileNumber;
    
    
    
}


/*
    Model: PaymentReceiptPayments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptPayments{

    

    
    
    
    
    @JsonProperty("payment_desc")
    private String paymentDesc;
    
    
    
    
    @JsonProperty("txn_date")
    private String txnDate;
    
    
    
}


/*
    Model: PaymentReceiptFormat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptFormat{

    

    
    
    
    
    @JsonProperty("payment_receipt")
    private List<String> paymentReceipt;
    
    
    
}


/*
    Model: PaymentReceiptService
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptService{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: PaymentReceiptTaxes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptTaxes{

    

    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pancard")
    private String pancard;
    
    
    
}


/*
    Model: PaymentReceiptPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptPayload{

    

    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("order_detail")
    private PaymentReceiptOrderDetails orderDetail;
    
    
    
    
    @JsonProperty("customer_detail")
    private PaymentReceiptCustomerDetails customerDetail;
    
    
    
    
    @JsonProperty("payments")
    private List<PaymentReceiptPayments> payments;
    
    
    
}


/*
    Model: PaymentReceiptMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentReceiptMeta{

    

    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("event")
    private HashMap<String,Object> event;
    
    
    
    
    @JsonProperty("organizaton_id")
    private String organizatonId;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("application_id")
    private List<String> applicationId;
    
    
    
    
    @JsonProperty("format")
    private PaymentReceiptFormat format;
    
    
    
    
    @JsonProperty("trace_id")
    private List<String> traceId;
    
    
    
    
    @JsonProperty("created_timestamp")
    private Double createdTimestamp;
    
    
    
    
    @JsonProperty("service")
    private PaymentReceiptService service;
    
    
    
    
    @JsonProperty("event_trace_info")
    private HashMap<String,Object> eventTraceInfo;
    
    
    
    
    @JsonProperty("trace")
    private String trace;
    
    
    
}


/*
    Model: ExtensionSlug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExtensionSlug{

    

    
    
    
    
    @JsonProperty("extension_slug")
    private String extensionSlug;
    
    
    
}




}