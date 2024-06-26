

package com.sdk.platform.finance;

import com.fasterxml.jackson.annotation.*;
import com.sdk.common.Constant;
import com.sdk.common.Utility;
import lombok.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class FinancePlatformModels{


/*
    Model: OrederFreezeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrederFreezeResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("oms_freeze")
    private Boolean omsFreeze;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: GenerateReportMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportMeta{

    

    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("channel")
    private String channel;
    
    
    
}


/*
    Model: GenerateReportFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportFilters{

    

    
    
    
    
    @JsonProperty("brand")
    private List<String> brand;
    
    
    
    
    @JsonProperty("company")
    private List<String> company;
    
    
    
    
    @JsonProperty("channel")
    private List<String> channel;
    
    
    
}


/*
    Model: GenerateReportPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportPlatform{

    

    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportMeta meta;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("filters")
    private GenerateReportFilters filters;
    
    
    
}


/*
    Model: GenerateReportReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportReq{

    

    
    
    
    
    @JsonProperty("data")
    private GenerateReportPlatform data;
    
    
    
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
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Currency{

    

    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: GenerateReportJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportJson{

    

    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("items")
    private List<List<String>> items;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
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

    

    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private ErrorMeta meta;
    
    
    
}


/*
    Model: ErrorMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorMeta{

    

    
    
    
    
    @JsonProperty("columns_errors")
    private List<ErrorMetaItems> columnsErrors;
    
    
    
}


/*
    Model: ErrorMetaItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorMetaItems{

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DownloadReport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReport{

    

    
    
    
    
    @JsonProperty("data")
    private DownloadReportData data;
    
    
    
}


/*
    Model: DownloadReportData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportData{

    

    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
}


/*
    Model: DownloadReportItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportItems{

    

    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportMeta meta;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("filters")
    private GenerateReportFilters filters;
    
    
    
    
    @JsonProperty("type_of_request")
    private String typeOfRequest;
    
    
    
}


/*
    Model: DownloadReportList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportList{

    

    
    
    
    
    @JsonProperty("items")
    private List<DownloadReportItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
}


/*
    Model: GetEngineFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetEngineFilters{

    

    
    
    
    
    @JsonProperty("config_field")
    private String configField;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
}


/*
    Model: GetEngineData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetEngineData{

    

    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("filters")
    private GetEngineFilters filters;
    
    
    
    
    @JsonProperty("project")
    private List<String> project;
    
    
    
    
    @JsonProperty("table_name")
    private String tableName;
    
    
    
    
    @JsonProperty("search")
    private Object search;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("order_by")
    private String orderBy;
    
    
    
}


/*
    Model: GetEngineReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetEngineReq{

    

    
    
    
    
    @JsonProperty("data")
    private GetEngineData data;
    
    
    
}


/*
    Model: GetEngineResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetEngineResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
}


/*
    Model: GetReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReason{

    

    
    
    
    
    @JsonProperty("reason_type")
    private String reasonType;
    
    
    
}


/*
    Model: GetReasonReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReasonReq{

    

    
    
    
    
    @JsonProperty("data")
    private GetReason data;
    
    
    
}


/*
    Model: ReasonItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReasonItem{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: GetReasonResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReasonResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("item_list")
    private List<ReasonItem> itemList;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: GetReportListData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportListData{

    

    
    
    
    
    @JsonProperty("role_name")
    private String roleName;
    
    
    
    
    @JsonProperty("listing_enabled")
    private Boolean listingEnabled;
    
    
    
}


/*
    Model: GetReportListReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportListReq{

    

    
    
    
    
    @JsonProperty("data")
    private GetReportListData data;
    
    
    
}


/*
    Model: GetAffiliate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAffiliate{

    

    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: GetReportListResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportListResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<ReportItem> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
}


/*
    Model: ReportItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReportItem{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("allowed_filters")
    private List<String> allowedFilters;
    
    
    
    
    @JsonProperty("config_meta")
    private Object configMeta;
    
    
    
    
    @JsonProperty("report_type")
    private String reportType;
    
    
    
    
    @JsonProperty("display_date")
    private String displayDate;
    
    
    
}


/*
    Model: GetAffiliateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAffiliateResponse{

    

    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("docs")
    private List<Object> docs;
    
    
    
}


/*
    Model: DownloadCreditDebitNote
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadCreditDebitNote{

    

    
    
    
    
    @JsonProperty("note_id")
    private List<String> noteId;
    
    
    
}


/*
    Model: DownloadCreditDebitNoteReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadCreditDebitNoteReq{

    

    
    
    
    
    @JsonProperty("data")
    private DownloadCreditDebitNote data;
    
    
    
}


/*
    Model: DownloadCreditDebitNoteResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadCreditDebitNoteResponseData{

    

    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_s3_url")
    private String pdfS3Url;
    
    
    
}


/*
    Model: DownloadCreditDebitNoteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadCreditDebitNoteResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<DownloadCreditDebitNoteResponseData> data;
    
    
    
}


/*
    Model: InvoiceBillingItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceBillingItem{

    

    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
}


/*
    Model: PaymentProcessPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentProcessPayload{

    

    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("transaction_type")
    private String transactionType;
    
    
    
    
    @JsonProperty("source_reference")
    private String sourceReference;
    
    
    
    
    @JsonProperty("total_amount")
    private Double totalAmount;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("invoice_billing_items")
    private List<InvoiceBillingItem> invoiceBillingItems;
    
    
    
}


/*
    Model: PaymentProcessReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentProcessReq{

    

    
    
    
    
    @JsonProperty("data")
    private PaymentProcessPayload data;
    
    
    
}


/*
    Model: PaymentProcessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentProcessResponse{

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
}


/*
    Model: CreditlineDataPlatformPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditlineDataPlatformPayload{

    

    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: CreditlineDataPlatformReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditlineDataPlatformReq{

    

    
    
    
    
    @JsonProperty("data")
    private CreditlineDataPlatformPayload data;
    
    
    
}


/*
    Model: CreditlineDataPlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditlineDataPlatformResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("show_mr")
    private Boolean showMr;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
}


/*
    Model: IsCreditlinePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCreditlinePayload{

    

    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
}


/*
    Model: IsCreditlinePlatformReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCreditlinePlatformReq{

    

    
    
    
    
    @JsonProperty("data")
    private IsCreditlinePayload data;
    
    
    
}


/*
    Model: IsCreditlinePlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCreditlinePlatformResponse{

    

    
    
    
    
    @JsonProperty("is_creditline_opted")
    private Boolean isCreditlineOpted;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
}


/*
    Model: InvoiceTypePayloadData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypePayloadData{

    

    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: InvoiceTypeReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypeReq{

    

    
    
    
    
    @JsonProperty("data")
    private InvoiceTypePayloadData data;
    
    
    
}


/*
    Model: InvoiceTypeResponseItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypeResponseItems{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: InvoiceTypeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypeResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("invoice_type_list")
    private List<InvoiceTypeResponseItems> invoiceTypeList;
    
    
    
    
    @JsonProperty("payment_status_list")
    private List<InvoiceTypeResponseItems> paymentStatusList;
    
    
    
}


/*
    Model: InoviceListingPayloadDataFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InoviceListingPayloadDataFilters{

    

    
    
    
    
    @JsonProperty("payment_status")
    private List<String> paymentStatus;
    
    
    
    
    @JsonProperty("invoice_type")
    private List<String> invoiceType;
    
    
    
    
    @JsonProperty("company_id")
    private List<String> companyId;
    
    
    
}


/*
    Model: InvoiceListingPayloadData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceListingPayloadData{

    

    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("filters")
    private InoviceListingPayloadDataFilters filters;
    
    
    
}


/*
    Model: InvoiceListingReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceListingReq{

    

    
    
    
    
    @JsonProperty("data")
    private InvoiceListingPayloadData data;
    
    
    
}


/*
    Model: UnpaidInvoiceDataItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnpaidInvoiceDataItems{

    

    
    
    
    
    @JsonProperty("total_unpaid_invoice_count")
    private Integer totalUnpaidInvoiceCount;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("total_unpaid_amount")
    private Double totalUnpaidAmount;
    
    
    
}


/*
    Model: InvoiceListingResponseItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceListingResponseItems{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("invoice_date")
    private String invoiceDate;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("period")
    private String period;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("is_downloadable")
    private Boolean isDownloadable;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("currency")
    private Currency currency;
    
    
    
}


/*
    Model: InvoiceListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceListingResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("unpaid_invoice_data")
    private UnpaidInvoiceDataItems unpaidInvoiceData;
    
    
    
    
    @JsonProperty("items")
    private List<InvoiceListingResponseItems> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
}


/*
    Model: InvoicePdfPayloadData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePdfPayloadData{

    

    
    
    
    
    @JsonProperty("invoice_number")
    private List<String> invoiceNumber;
    
    
    
}


/*
    Model: InvoicePdfReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePdfReq{

    

    
    
    
    
    @JsonProperty("data")
    private InvoicePdfPayloadData data;
    
    
    
}


/*
    Model: InvoicePdfResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePdfResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private List<String> data;
    
    
    
    
    @JsonProperty("error")
    private List<String> error;
    
    
    
}


/*
    Model: IsCnRefundMethodData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCnRefundMethodData{

    

    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("toggle_edit_required")
    private Boolean toggleEditRequired;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
}


/*
    Model: IsCnRefundMethodReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCnRefundMethodReq{

    

    
    
    
    
    @JsonProperty("data")
    private IsCnRefundMethodData data;
    
    
    
}


/*
    Model: IsCnRefundMethodResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCnRefundMethodResponseData{

    

    
    
    
    
    @JsonProperty("is_first_time_user")
    private Boolean isFirstTimeUser;
    
    
    
}


/*
    Model: IsCnRefundMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCnRefundMethodResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private IsCnRefundMethodResponseData data;
    
    
    
}


/*
    Model: CreditNoteConfigNotificationEvents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditNoteConfigNotificationEvents{

    

    
    
    
    
    @JsonProperty("expiration_reminder_to_customer")
    private Integer expirationReminderToCustomer;
    
    
    
}


/*
    Model: CreateSellerCreditNoteConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSellerCreditNoteConfig{

    

    
    
    
    
    @JsonProperty("is_cn_as_refund_method")
    private Boolean isCnAsRefundMethod;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("source_channel")
    private List<String> sourceChannel;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_events")
    private CreditNoteConfigNotificationEvents notificationEvents;
    
    
    
    
    @JsonProperty("sales_channel_name")
    private String salesChannelName;
    
    
    
    
    @JsonProperty("ordering_channel")
    private List<String> orderingChannel;
    
    
    
    
    @JsonProperty("validity")
    private Integer validity;
    
    
    
    
    @JsonProperty("currency_type")
    private String currencyType;
    
    
    
    
    @JsonProperty("slug_values")
    private List<String> slugValues;
    
    
    
}


/*
    Model: CreateSellerCreditNoteConfigReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSellerCreditNoteConfigReq{

    

    
    
    
    
    @JsonProperty("data")
    private CreateSellerCreditNoteConfig data;
    
    
    
}


/*
    Model: CreateSellerCreditNoteConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSellerCreditNoteConfigResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DeleteConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteConfig{

    

    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("slug_values")
    private List<String> slugValues;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
}


/*
    Model: DeleteConfigReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteConfigReq{

    

    
    
    
    
    @JsonProperty("data")
    private DeleteConfig data;
    
    
    
}


/*
    Model: DeleteConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteConfigResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ChannelDisplayNameItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChannelDisplayNameItems{

    

    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: ChannelDisplayNameResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChannelDisplayNameResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("items")
    private List<ChannelDisplayNameItems> items;
    
    
    
}


/*
    Model: CnReferenceNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnReferenceNumber{

    

    
    
    
    
    @JsonProperty("cn_reference_number")
    private String cnReferenceNumber;
    
    
    
}


/*
    Model: GetPdfUrlViewReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPdfUrlViewReq{

    

    
    
    
    
    @JsonProperty("data")
    private CnReferenceNumber data;
    
    
    
}


/*
    Model: GetPdfUrlViewResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPdfUrlViewResponseData{

    

    
    
    
    
    @JsonProperty("s3_pdf_link")
    private String s3PdfLink;
    
    
    
    
    @JsonProperty("cn_reference_number")
    private String cnReferenceNumber;
    
    
    
}


/*
    Model: GetPdfUrlViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPdfUrlViewResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private GetPdfUrlViewResponseData data;
    
    
    
}


/*
    Model: CreditNoteDetailsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditNoteDetailsReq{

    

    
    
    
    
    @JsonProperty("data")
    private CnReferenceNumber data;
    
    
    
}


/*
    Model: CnDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnDetails{

    

    
    
    
    
    @JsonProperty("staff_id")
    private String staffId;
    
    
    
    
    @JsonProperty("expiry_date")
    private String expiryDate;
    
    
    
    
    @JsonProperty("channel_of_issuance")
    private String channelOfIssuance;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("date_issued")
    private String dateIssued;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
}


/*
    Model: RedemptionDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedemptionDetails{

    

    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("staff_id")
    private String staffId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("amount_debited")
    private Integer amountDebited;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
}


/*
    Model: CreditNoteDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditNoteDetails{

    

    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("current_amount_used")
    private Double currentAmountUsed;
    
    
    
    
    @JsonProperty("cn_status")
    private String cnStatus;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
    
    @JsonProperty("cn_reference_number")
    private String cnReferenceNumber;
    
    
    
    
    @JsonProperty("cn_details")
    private CnDetails cnDetails;
    
    
    
    
    @JsonProperty("redemption_details")
    private List<RedemptionDetails> redemptionDetails;
    
    
    
    
    @JsonProperty("remaining_cn_amount")
    private Integer remainingCnAmount;
    
    
    
    
    @JsonProperty("available_cn_balance")
    private Integer availableCnBalance;
    
    
    
    
    @JsonProperty("cn_amount")
    private Integer cnAmount;
    
    
    
}


/*
    Model: CreditNoteDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditNoteDetailsResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private CreditNoteDetails data;
    
    
    
}


/*
    Model: GetCustomerCreditBalance
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCustomerCreditBalance{

    

    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
}


/*
    Model: GetCustomerCreditBalanceReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCustomerCreditBalanceReq{

    

    
    
    
    
    @JsonProperty("data")
    private GetCustomerCreditBalance data;
    
    
    
}


/*
    Model: GetCustomerCreditBalanceResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCustomerCreditBalanceResponseData{

    

    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
    
    @JsonProperty("total_credited_balance")
    private Integer totalCreditedBalance;
    
    
    
}


/*
    Model: GetCustomerCreditBalanceResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCustomerCreditBalanceResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private GetCustomerCreditBalanceResponseData data;
    
    
    
}


/*
    Model: GetCnConfigReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCnConfigReq{

    

    
    
    
    
    @JsonProperty("data")
    private DeleteConfig data;
    
    
    
}


/*
    Model: GetCnConfigResponseMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCnConfigResponseMeta{

    

    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("source_channel")
    private List<String> sourceChannel;
    
    
    
}


/*
    Model: GetCnConfigResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCnConfigResponseData{

    

    
    
    
    
    @JsonProperty("is_cn_as_refund_method")
    private Boolean isCnAsRefundMethod;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_events")
    private CreditNoteConfigNotificationEvents notificationEvents;
    
    
    
    
    @JsonProperty("validity")
    private Integer validity;
    
    
    
    
    @JsonProperty("redemption_ordering_channel")
    private List<String> redemptionOrderingChannel;
    
    
    
    
    @JsonProperty("currency_type")
    private String currencyType;
    
    
    
}


/*
    Model: GetCnConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCnConfigResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private GetCnConfigResponseData data;
    
    
    
}


/*
    Model: CnGenerateReportFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnGenerateReportFilters{

    

    
    
    
    
    @JsonProperty("staff_id")
    private List<String> staffId;
    
    
    
    
    @JsonProperty("channel_of_issuance")
    private List<String> channelOfIssuance;
    
    
    
    
    @JsonProperty("utilisation")
    private List<String> utilisation;
    
    
    
    
    @JsonProperty("ordering_channel")
    private List<String> orderingChannel;
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
    
    @JsonProperty("type_of_transaction")
    private List<String> typeOfTransaction;
    
    
    
    
    @JsonProperty("issuance_channel")
    private List<String> issuanceChannel;
    
    
    
}


/*
    Model: CnGenerateReport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnGenerateReport{

    

    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("filters")
    private CnGenerateReportFilters filters;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportFilters meta;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("search_type")
    private String searchType;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
}


/*
    Model: GenerateReportCustomerCnReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportCustomerCnReq{

    

    
    
    
    
    @JsonProperty("data")
    private CnGenerateReport data;
    
    
    
}


/*
    Model: CnGenerateReportItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnGenerateReportItems{

    

    
    
    
    
    @JsonProperty("expiry_date")
    private String expiryDate;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("date_issued")
    private String dateIssued;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("credit_note_number")
    private String creditNoteNumber;
    
    
    
}


/*
    Model: GenerateReportCustomerCnResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportCustomerCnResponseData{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<CnGenerateReportItems> items;
    
    
    
    
    @JsonProperty("row_header_display_order")
    private Object rowHeaderDisplayOrder;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("primary_headers")
    private List<String> primaryHeaders;
    
    
    
    
    @JsonProperty("allowed_filters")
    private List<String> allowedFilters;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
}


/*
    Model: GenerateReportCustomerCnResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportCustomerCnResponse{

    

    
    
    
    
    @JsonProperty("data")
    private GenerateReportCustomerCnResponseData data;
    
    
    
}


/*
    Model: CnDownloadReport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CnDownloadReport{

    

    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("search_type")
    private String searchType;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
}


/*
    Model: DownloadReportCustomerCnReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportCustomerCnReq{

    

    
    
    
    
    @JsonProperty("data")
    private CnDownloadReport data;
    
    
    
}


/*
    Model: DownloadReportResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportResponseData{

    

    
    
    
    
    @JsonProperty("report_config_id")
    private String reportConfigId;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    @JsonProperty("requested_by")
    private String requestedBy;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("request_dict")
    private Object requestDict;
    
    
    
    
    @JsonProperty("download_link")
    private String downloadLink;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
}


/*
    Model: DownloadReportCustomerCnResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportCustomerCnResponse{

    

    
    
    
    
    @JsonProperty("items")
    private List<DownloadReportResponseData> items;
    
    
    
    
    @JsonProperty("data")
    private List<DownloadReportResponseData> data;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: GetReportingFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportingFilters{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("options")
    private List<Object> options;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: GetReportingNestedFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportingNestedFilters{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<Object> options;
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("placeholder_text")
    private String placeholderText;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: GetReportingFiltersReasonOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportingFiltersReasonOptions{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("placeholder_text")
    private String placeholderText;
    
    
    
}


/*
    Model: GetReportingFiltersReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportingFiltersReason{

    

    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("options")
    private List<GetReportingFiltersReasonOptions> options;
    
    
    
}


/*
    Model: GetReportingFiltersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportingFiltersResponse{

    

    
    
    
    
    @JsonProperty("reason")
    private GetReportingFiltersReason reason;
    
    
    
    
    @JsonProperty("search")
    private GetReportingFilters search;
    
    
    
    
    @JsonProperty("filters")
    private List<GetReportingNestedFilters> filters;
    
    
    
    
    @JsonProperty("status")
    private GetReportingFilters status;
    
    
    
}


/*
    Model: InvoicePaymentOptionsPayloadData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsPayloadData{

    

    
    
    
    
    @JsonProperty("invoice_numbers")
    private List<String> invoiceNumbers;
    
    
    
}


/*
    Model: InvoicePaymentOptionsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsReq{

    

    
    
    
    
    @JsonProperty("data")
    private InvoicePaymentOptionsPayloadData data;
    
    
    
}


/*
    Model: InvoicePaymentOptionsResponsePayableAmounts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsResponsePayableAmounts{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("amount_key")
    private String amountKey;
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
}


/*
    Model: InvoicePaymentOptionsResponseDeductedAmounts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsResponseDeductedAmounts{

    

    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    @JsonProperty("amount_key")
    private String amountKey;
    
    
    
    
    @JsonProperty("is_payable")
    private Boolean isPayable;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
}


/*
    Model: InvoicePaymentOptionsResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsResponseData{

    

    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("display_amounts")
    private List<InvoicePaymentOptionsResponsePayableAmounts> displayAmounts;
    
    
    
    
    @JsonProperty("total_amount")
    private Object totalAmount;
    
    
    
    
    @JsonProperty("deducted_amounts")
    private Object deductedAmounts;
    
    
    
    
    @JsonProperty("payable_amounts")
    private List<InvoicePaymentOptionsResponsePayableAmounts> payableAmounts;
    
    
    
    
    @JsonProperty("currency")
    private Currency currency;
    
    
    
}


/*
    Model: InvoicePaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentOptionsResponse{

    

    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("data")
    private List<InvoicePaymentOptionsResponseData> data;
    
    
    
    
    @JsonProperty("total_payable_amount")
    private Double totalPayableAmount;
    
    
    
    
    @JsonProperty("invoice_count")
    private Integer invoiceCount;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: PaymentDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentDetail{

    

    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: PaidInvoicePaymentDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaidInvoicePaymentDetail{

    

    
    
    
    
    @JsonProperty("payment_details")
    private List<PaymentDetail> paymentDetails;
    
    
    
    
    @JsonProperty("date_of_payment")
    private String dateOfPayment;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
}


/*
    Model: InvoicePaymentDetailsResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentDetailsResponseData{

    

    
    
    
    
    @JsonProperty("paid_invoice_payment_details")
    private List<PaidInvoicePaymentDetail> paidInvoicePaymentDetails;
    
    
    
    
    @JsonProperty("failed_attempts_details")
    private List<Object> failedAttemptsDetails;
    
    
    
}


/*
    Model: InvoicePaymentDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentDetailsResponse{

    

    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("data")
    private InvoicePaymentDetailsResponseData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("payment_details_visible")
    private Boolean paymentDetailsVisible;
    
    
    
}


/*
    Model: InvoiceActivityLogsResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceActivityLogsResponseData{

    

    
    
    
    
    @JsonProperty("performed_by")
    private String performedBy;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("is_resolved")
    private Boolean isResolved;
    
    
    
    
    @JsonProperty("retry_attempts")
    private Double retryAttempts;
    
    
    
    
    @JsonProperty("max_retry_attempts")
    private Double maxRetryAttempts;
    
    
    
}


/*
    Model: InvoiceActivityLogsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceActivityLogsResponse{

    

    
    
    
    
    @JsonProperty("data")
    private List<InvoiceActivityLogsResponseData> data;
    
    
    
}


/*
    Model: InvoiceActivityLogError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceActivityLogError{

    

    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
}


/*
    Model: UnlockCreditNoteRequestData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlockCreditNoteRequestData{

    

    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("locked_credit_notes")
    private List<String> lockedCreditNotes;
    
    
    
    
    @JsonProperty("unlock_reason")
    private String unlockReason;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: UnlockCreditNoteReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlockCreditNoteReq{

    

    
    
    
    
    @JsonProperty("data")
    private UnlockCreditNoteRequestData data;
    
    
    
}


/*
    Model: UnlockCreditNoteResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlockCreditNoteResponseData{

    

    
    
    
    
    @JsonProperty("is_cn_unlocked")
    private Boolean isCnUnlocked;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: UnlockCreditNoteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnlockCreditNoteResponse{

    

    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private UnlockCreditNoteResponseData data;
    
    
    
}




}