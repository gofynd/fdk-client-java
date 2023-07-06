
package com.sdk.platform.finance;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class FinancePlatformModels{


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
    
    
    
    
    @JsonProperty("company")
    private List<String> company;
    
    
    
    
    @JsonProperty("channel")
    private List<String> channel;
    
    
    
    
    @JsonProperty("brand")
    private List<String> brand;
    
    
    
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
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("channel")
    private String channel;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
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
    
    
    
    
    @JsonProperty("filters")
    private GenerateReportFilters filters;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportMeta meta;
    
    
    
}


/*
    Model: GenerateReportRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportRequest{
    
    
    
    
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
    Model: GenerateReportJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportJson{
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<List<String>> items;
    
    
    
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
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("pagesize")
    private Integer pagesize;
    
    
    
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
    
    
    
    
    @JsonProperty("filters")
    private GenerateReportFilters filters;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("type_of_request")
    private String typeOfRequest;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportMeta meta;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<DownloadReportItems> items;
    
    
    
    
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
    
    
    
    
    @JsonProperty("table_name")
    private String tableName;
    
    
    
    
    @JsonProperty("filters")
    private GetEngineFilters filters;
    
    
    
    
    @JsonProperty("project")
    private List<String> project;
    
    
    
}


/*
    Model: GetEngineRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetEngineRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
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
    Model: GetReasonRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReasonRequest{
    
    
    
    
    @JsonProperty("data")
    private GetReason data;
    
    
    
}


/*
    Model: GetDocs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDocs{
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("docs")
    private List<Object> docs;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private GetDocs data;
    
    
    
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
    Model: GetReportListRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetReportListRequest{
    
    
    
    
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
    Model: GetAffiliateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAffiliateResponse{
    
    
    
    
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
    Model: DownloadCreditDebitNoteRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadCreditDebitNoteRequest{
    
    
    
    
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
    Model: PaymentProcessPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentProcessPayload{
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("total_amount")
    private String totalAmount;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("transaction_type")
    private String transactionType;
    
    
    
    
    @JsonProperty("source_reference")
    private String sourceReference;
    
    
    
    
    @JsonProperty("amount")
    private String amount;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: PaymentProcessRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentProcessRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("redirect_url")
    private String redirectUrl;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private String sellerId;
    
    
    
    
    @JsonProperty("end_end")
    private String endEnd;
    
    
    
    
    @JsonProperty("pagesize")
    private Integer pagesize;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("start_end")
    private String startEnd;
    
    
    
}


/*
    Model: CreditlineDataPlatformRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditlineDataPlatformRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("show_mr")
    private Boolean showMr;
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
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
    Model: IsCreditlinePlatformRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IsCreditlinePlatformRequest{
    
    
    
    
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
    Model: InvoiceTypeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypeRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    
    
    
    
    @JsonProperty("company_id")
    private List<String> companyId;
    
    
    
    
    @JsonProperty("invoice_type")
    private List<String> invoiceType;
    
    
    
    
    @JsonProperty("payment_status")
    private List<String> paymentStatus;
    
    
    
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
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("filters")
    private InoviceListingPayloadDataFilters filters;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
}


/*
    Model: InvoiceListingRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceListingRequest{
    
    
    
    
    @JsonProperty("data")
    private InvoiceListingPayloadData data;
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("is_downloadable")
    private Boolean isDownloadable;
    
    
    
    
    @JsonProperty("invoice_date")
    private String invoiceDate;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("amount")
    private String amount;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("period")
    private String period;
    
    
    
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
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("total_unpaid_amount")
    private Double totalUnpaidAmount;
    
    
    
    
    @JsonProperty("total_unpaid_invoice_count")
    private Integer totalUnpaidInvoiceCount;
    
    
    
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
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InvoiceListingResponseItems> items;
    
    
    
    
    @JsonProperty("unpaid_invoice_data")
    private UnpaidInvoiceDataItems unpaidInvoiceData;
    
    
    
    
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
    Model: InvoicePdfRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePdfRequest{
    
    
    
    
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
    Model: AsCnRefundData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AsCnRefundData{
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("toggle_edit_required")
    private Boolean toggleEditRequired;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
}


/*
    Model: AsCnRefundRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AsCnRefundRequest{
    
    
    
    
    @JsonProperty("data")
    private AsCnRefundData data;
    
    
    
}


/*
    Model: AsCnRefundResponseData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AsCnRefundResponseData{
    
    
    
    
    @JsonProperty("is_first_time_user")
    private Boolean isFirstTimeUser;
    
    
    
}


/*
    Model: AsCnRefundResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AsCnRefundResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private AsCnRefundResponseData data;
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_events")
    private CreditNoteConfigNotificationEvents notificationEvents;
    
    
    
    
    @JsonProperty("currency_type")
    private String currencyType;
    
    
    
    
    @JsonProperty("source_channel")
    private List<String> sourceChannel;
    
    
    
    
    @JsonProperty("sales_channel_name")
    private String salesChannelName;
    
    
    
    
    @JsonProperty("ordering_channel")
    private List<String> orderingChannel;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("validity")
    private Integer validity;
    
    
    
    
    @JsonProperty("slug_values")
    private List<String> slugValues;
    
    
    
}


/*
    Model: CreateSellerCreditNoteConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSellerCreditNoteConfigRequest{
    
    
    
    
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
    Model: DeleteConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteConfigRequest{
    
    
    
    
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
    Model: ChannelDisplayName
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChannelDisplayName{
    
    
    
    
    @JsonProperty("platform_pos")
    private String platformPos;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private ChannelDisplayName data;
    
    
    
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
    Model: GetPdfUrlViewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetPdfUrlViewRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("cn_reference_number")
    private String cnReferenceNumber;
    
    
    
    
    @JsonProperty("s3_pdf_link")
    private String s3PdfLink;
    
    
    
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
    Model: CreditNoteDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreditNoteDetailsRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("channel_of_issuance")
    private String channelOfIssuance;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("date_issued")
    private String dateIssued;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("expiry_date")
    private String expiryDate;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("staff_id")
    private String staffId;
    
    
    
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
    
    
    
    
    @JsonProperty("amount_debited")
    private Integer amountDebited;
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("staff_id")
    private String staffId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
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
    
    
    
    
    @JsonProperty("cn_details")
    private List<CnDetails> cnDetails;
    
    
    
    
    @JsonProperty("cn_amount")
    private Integer cnAmount;
    
    
    
    
    @JsonProperty("cn_reference_number")
    private String cnReferenceNumber;
    
    
    
    
    @JsonProperty("cn_status")
    private String cnStatus;
    
    
    
    
    @JsonProperty("remaining_cn_amount")
    private Integer remainingCnAmount;
    
    
    
    
    @JsonProperty("available_cn_balance")
    private Integer availableCnBalance;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
    
    @JsonProperty("redemption_details")
    private List<RedemptionDetails> redemptionDetails;
    
    
    
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
    Model: GetCustomerCreditBalanceRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCustomerCreditBalanceRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("total_credited_balance")
    private Integer totalCreditedBalance;
    
    
    
    
    @JsonProperty("customer_mobile_number")
    private String customerMobileNumber;
    
    
    
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
    Model: GetCnConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCnConfigRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("source_channel")
    private List<String> sourceChannel;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
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
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("notification_events")
    private CreditNoteConfigNotificationEvents notificationEvents;
    
    
    
    
    @JsonProperty("currency_type")
    private String currencyType;
    
    
    
    
    @JsonProperty("redemption_ordering_channel")
    private List<String> redemptionOrderingChannel;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("validity")
    private Integer validity;
    
    
    
    
    @JsonProperty("meta")
    private GetCnConfigResponseMeta meta;
    
    
    
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
    
    
    
    
    @JsonProperty("channel_of_issuance")
    private List<String> channelOfIssuance;
    
    
    
    
    @JsonProperty("utilisation")
    private List<String> utilisation;
    
    
    
    
    @JsonProperty("ordering_channel")
    private List<String> orderingChannel;
    
    
    
    
    @JsonProperty("store_id")
    private List<Integer> storeId;
    
    
    
    
    @JsonProperty("staff_id")
    private List<String> staffId;
    
    
    
    
    @JsonProperty("types_of_transaction")
    private List<String> typesOfTransaction;
    
    
    
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
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("filters")
    private CnGenerateReportFilters filters;
    
    
    
    
    @JsonProperty("search_type")
    private String searchType;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("pagesize")
    private Integer pagesize;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("meta")
    private GenerateReportFilters meta;
    
    
    
}


/*
    Model: GenerateReportCustomerCnRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateReportCustomerCnRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("invoice_number")
    private String invoiceNumber;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("total_amount")
    private Integer totalAmount;
    
    
    
    
    @JsonProperty("date_issued")
    private String dateIssued;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("expiry_date")
    private String expiryDate;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("credit_note_number")
    private String creditNoteNumber;
    
    
    
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
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("allowed_filters")
    private List<String> allowedFilters;
    
    
    
    
    @JsonProperty("item_count")
    private Integer itemCount;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("primary_headers")
    private List<String> primaryHeaders;
    
    
    
    
    @JsonProperty("row_header_display_order")
    private Object rowHeaderDisplayOrder;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CnGenerateReportItems> items;
    
    
    
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
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("search_type")
    private String searchType;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("pagesize")
    private Integer pagesize;
    
    
    
    
    @JsonProperty("status")
    private List<String> status;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
}


/*
    Model: DownloadReportCustomerCnRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadReportCustomerCnRequest{
    
    
    
    
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
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    @JsonProperty("requested_by")
    private String requestedBy;
    
    
    
    
    @JsonProperty("msg")
    private String msg;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("report_config_id")
    private String reportConfigId;
    
    
    
    
    @JsonProperty("request_dict")
    private Object requestDict;
    
    
    
    
    @JsonProperty("download_link")
    private String downloadLink;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
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
    
    
    
    
    @JsonProperty("data")
    private List<DownloadReportResponseData> data;
    
    
    
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
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("options")
    private List<Object> options;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
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
    
    
    
    
    @JsonProperty("options")
    private List<Object> options;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("placeholder_text")
    private String placeholderText;
    
    
    
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
    
    
    
    
    @JsonProperty("search")
    private GetReportingFilters search;
    
    
    
    
    @JsonProperty("filters")
    private List<GetReportingNestedFilters> filters;
    
    
    
    
    @JsonProperty("status")
    private GetReportingFilters status;
    
    
    
}




}