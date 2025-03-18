

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
    Model: UpdatePdfType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePdfType{

    

    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("format")
    private List<String> format;
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
    
    @JsonProperty("schema")
    private HashMap<String,Object> schema;
    
    
    
    
    @JsonProperty("store_os")
    private Boolean storeOs;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: PdfTypeByIdDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfTypeByIdDetails{

    

    
    
    
    
    @JsonProperty("store_os")
    private Boolean storeOs;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("format")
    private List<String> format;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
}


/*
    Model: PdfConfigurationData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfConfigurationData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: UpdatedDefaultTemplateById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatedDefaultTemplateById{

    

    
    
    
    
    @JsonProperty("data")
    private PdfConfigurationData data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: UpdateTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateTemplate{

    

    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("store_os")
    private Boolean storeOs;
    
    
    
}


/*
    Model: PdfDefaultTemplateById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfDefaultTemplateById{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
}


/*
    Model: PdfTemplateCreateSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfTemplateCreateSuccess{

    

    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private PdfTemplateCreateSuccessData data;
    
    
    
}


/*
    Model: PdfTemplateCreateSuccessData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfTemplateCreateSuccessData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: CreateTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTemplate{

    

    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
}


/*
    Model: PdfDefaultTemplateSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfDefaultTemplateSuccess{

    

    
    
    
    
    @JsonProperty("data")
    private List<Document> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


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
    Model: InvoiceTypesData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypesData{

    

    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("format")
    private List<String> format;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
    
    @JsonProperty("store_os")
    private Boolean storeOs;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: InvoiceTypes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceTypes{

    

    
    
    
    
    @JsonProperty("data")
    private List<InvoiceTypesData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ConversionRate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConversionRate{

    

    
    
    
    
    @JsonProperty("base")
    private String base;
    
    
    
    
    @JsonProperty("rates")
    private HashMap<String,Object> rates;
    
    
    
    
    @JsonProperty("timestamp")
    private Double timestamp;
    
    
    
}


/*
    Model: DeliveryPartnerDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryPartnerDetail{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("awb_number_barcode")
    private String awbNumberBarcode;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("origin")
    private String origin;
    
    
    
    
    @JsonProperty("destination")
    private String destination;
    
    
    
    
    @JsonProperty("eway_bill_number")
    private String ewayBillNumber;
    
    
    
}


/*
    Model: Image
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Image{

    

    
    
    
    
    @JsonProperty("sales_channel_logo")
    private String salesChannelLogo;
    
    
    
}


/*
    Model: PaymentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentData{

    

    
    
    
    
    @JsonProperty("payment_type")
    private String paymentType;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("date")
    private String date;
    
    
    
    
    @JsonProperty("transaction_id")
    private String transactionId;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: InvoiceDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetail{

    

    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("invoice_date")
    private String invoiceDate;
    
    
    
    
    @JsonProperty("irn")
    private String irn;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("signed_qrcode")
    private String signedQrcode;
    
    
    
    
    @JsonProperty("upi_qrcode")
    private String upiQrcode;
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    @JsonProperty("marketplace_invoice_id")
    private String marketplaceInvoiceId;
    
    
    
    
    @JsonProperty("marketplace_shipment_id")
    private String marketplaceShipmentId;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
}


/*
    Model: CompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDetail{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("zip_code")
    private Double zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("pan")
    private String pan;
    
    
    
    
    @JsonProperty("phone_no")
    private String phoneNo;
    
    
    
    
    @JsonProperty("cin")
    private String cin;
    
    
    
    
    @JsonProperty("website_url")
    private String websiteUrl;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("phone")
    private HashMap<String,Object> phone;
    
    
    
    
    @JsonProperty("trn")
    private String trn;
    
    
    
    
    @JsonProperty("vat")
    private String vat;
    
    
    
    
    @JsonProperty("business_country_timezone")
    private String businessCountryTimezone;
    
    
    
    
    @JsonProperty("business_country_currency")
    private HashMap<String,Object> businessCountryCurrency;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
}


/*
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetail{

    

    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("zip_code")
    private String zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
}


/*
    Model: CustomerBillingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerBillingDetail{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone_no")
    private String phoneNo;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("zip_code")
    private String zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: CustomerShippingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerShippingDetail{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("phone_no")
    private String phoneNo;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("zip_code")
    private String zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
}


/*
    Model: ReturnDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnDetail{

    

    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("zip_code")
    private String zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
}


/*
    Model: Brand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Brand{

    

    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: Cgst
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Cgst{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("percent")
    private Double percent;
    
    
    
}


/*
    Model: Sgst
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Sgst{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("percent")
    private Double percent;
    
    
    
}


/*
    Model: Igst
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Igst{

    

    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("percent")
    private Double percent;
    
    
    
}


/*
    Model: Tax
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tax{

    

    
    
    
    
    @JsonProperty("cgst")
    private Cgst cgst;
    
    
    
    
    @JsonProperty("sgst")
    private Sgst sgst;
    
    
    
    
    @JsonProperty("igst")
    private Igst igst;
    
    
    
}


/*
    Model: ItemsProductTable
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemsProductTable{

    

    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("total_units")
    private Double totalUnits;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("mrp")
    private Double mrp;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("taxable_amount")
    private Double taxableAmount;
    
    
    
    
    @JsonProperty("total_taxable_amount")
    private Double totalTaxableAmount;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("meta")
    private HashMap<String,Object> meta;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
}


/*
    Model: ProductTable
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTable{

    

    
    
    
    
    @JsonProperty("total_items")
    private Double totalItems;
    
    
    
    
    @JsonProperty("products")
    private List<ItemsProductTable> products;
    
    
    
    
    @JsonProperty("grand_total")
    private Double grandTotal;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("delivery_charge_text")
    private String deliveryChargeText;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("fynd_discounts")
    private Double fyndDiscounts;
    
    
    
    
    @JsonProperty("total_in_words")
    private String totalInWords;
    
    
    
    
    @JsonProperty("gift_price")
    private Double giftPrice;
    
    
    
    
    @JsonProperty("total_quantity")
    private Double totalQuantity;
    
    
    
    
    @JsonProperty("sub_total")
    private Double subTotal;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("promotion")
    private Double promotion;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("reward")
    private Double reward;
    
    
    
    
    @JsonProperty("round_off")
    private Double roundOff;
    
    
    
    
    @JsonProperty("total_value_of_goods")
    private Double totalValueOfGoods;
    
    
    
}


/*
    Model: Taxes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Taxes{

    

    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("total_tax_value")
    private Double totalTaxValue;
    
    
    
}


/*
    Model: TaxTable
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxTable{

    

    
    
    
    
    @JsonProperty("taxes")
    private List<Taxes> taxes;
    
    
    
    
    @JsonProperty("total_tax")
    private Double totalTax;
    
    
    
    
    @JsonProperty("tax_in_words")
    private String taxInWords;
    
    
    
}


/*
    Model: RegisteredCompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisteredCompanyDetail{

    

    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("zip_code")
    private Double zipCode;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("display_address")
    private String displayAddress;
    
    
    
    
    @JsonProperty("sector")
    private String sector;
    
    
    
}


/*
    Model: Kwargs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Kwargs{

    

    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: ShipmentIdBarcodeGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentIdBarcodeGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private Kwargs kwargs;
    
    
    
}


/*
    Model: SignedQrcodeGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedQrcodeGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private Kwargs kwargs;
    
    
    
}


/*
    Model: KwargsUpiQrcode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KwargsUpiQrcode{

    

    
    
    
    
    @JsonProperty("qr_data")
    private String qrData;
    
    
    
    
    @JsonProperty("qr_url")
    private String qrUrl;
    
    
    
}


/*
    Model: UpiQrcodeGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpiQrcodeGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private KwargsUpiQrcode kwargs;
    
    
    
}


/*
    Model: DigitalsignatureGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DigitalsignatureGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private Kwargs kwargs;
    
    
    
}


/*
    Model: KwargsAwbNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KwargsAwbNumber{

    

    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
}


/*
    Model: AwbNumberLabelBarcodeGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AwbNumberLabelBarcodeGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private KwargsAwbNumber kwargs;
    
    
    
}


/*
    Model: AwbNumberBarcodeGenerator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AwbNumberBarcodeGenerator{

    

    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("kwargs")
    private Kwargs kwargs;
    
    
    
}


/*
    Model: MetaProperty
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaProperty{

    

    
    
    
    
    @JsonProperty("shipment_id_barcode_generator")
    private ShipmentIdBarcodeGenerator shipmentIdBarcodeGenerator;
    
    
    
    
    @JsonProperty("signed_qrcode_generator")
    private SignedQrcodeGenerator signedQrcodeGenerator;
    
    
    
    
    @JsonProperty("upi_qrcode_generator")
    private UpiQrcodeGenerator upiQrcodeGenerator;
    
    
    
    
    @JsonProperty("digitalsignature_generator")
    private DigitalsignatureGenerator digitalsignatureGenerator;
    
    
    
    
    @JsonProperty("awb_number_label_barcode_generator")
    private AwbNumberLabelBarcodeGenerator awbNumberLabelBarcodeGenerator;
    
    
    
    
    @JsonProperty("awb_number_barcode_generator")
    private AwbNumberBarcodeGenerator awbNumberBarcodeGenerator;
    
    
    
}


/*
    Model: Meta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Meta{

    

    
    
    
    
    @JsonProperty("generator")
    private MetaProperty generator;
    
    
    
}


/*
    Model: PdfPayloadDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfPayloadDetails{

    

    
    
    
    
    @JsonProperty("is_export")
    private Boolean isExport;
    
    
    
    
    @JsonProperty("is_export_shipment")
    private Boolean isExportShipment;
    
    
    
    
    @JsonProperty("app_domain_name")
    private String appDomainName;
    
    
    
    
    @JsonProperty("txn_id")
    private String txnId;
    
    
    
    
    @JsonProperty("utr")
    private String utr;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
    
    @JsonProperty("current_date")
    private String currentDate;
    
    
    
    
    @JsonProperty("total_value_of_goods")
    private Double totalValueOfGoods;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private HashMap<String,Object> b2BBuyerDetails;
    
    
    
    
    @JsonProperty("is_qwik")
    private HashMap<String,Object> isQwik;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("conversion_rate")
    private ConversionRate conversionRate;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("delivery_partner_detail")
    private DeliveryPartnerDetail deliveryPartnerDetail;
    
    
    
    
    @JsonProperty("image")
    private Image image;
    
    
    
    
    @JsonProperty("payments")
    private List<PaymentData> payments;
    
    
    
    
    @JsonProperty("invoice_detail")
    private InvoiceDetail invoiceDetail;
    
    
    
    
    @JsonProperty("company_detail")
    private CompanyDetail companyDetail;
    
    
    
    
    @JsonProperty("store_detail")
    private StoreDetail storeDetail;
    
    
    
    
    @JsonProperty("customer_billing_detail")
    private CustomerBillingDetail customerBillingDetail;
    
    
    
    
    @JsonProperty("customer_shipping_detail")
    private CustomerShippingDetail customerShippingDetail;
    
    
    
    
    @JsonProperty("return_detail")
    private ReturnDetail returnDetail;
    
    
    
    
    @JsonProperty("product_table")
    private ProductTable productTable;
    
    
    
    
    @JsonProperty("tax_table")
    private TaxTable taxTable;
    
    
    
    
    @JsonProperty("declaration_texts")
    private List<String> declarationTexts;
    
    
    
    
    @JsonProperty("registered_company_detail")
    private RegisteredCompanyDetail registeredCompanyDetail;
    
    
    
    
    @JsonProperty("disclaimer")
    private String disclaimer;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    @JsonProperty("is_self_ship")
    private Boolean isSelfShip;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("is_self_pickup")
    private Boolean isSelfPickup;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("amount_to_be_collected")
    private Double amountToBeCollected;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("waybills")
    private List<Object> waybills;
    
    
    
    
    @JsonProperty("total_items")
    private Double totalItems;
    
    
    
    
    @JsonProperty("brand_logo")
    private String brandLogo;
    
    
    
    
    @JsonProperty("shipment_id_barcode")
    private String shipmentIdBarcode;
    
    
    
    
    @JsonProperty("signed_qrcode")
    private String signedQrcode;
    
    
    
    
    @JsonProperty("upi_qrcode")
    private String upiQrcode;
    
    
    
    
    @JsonProperty("digitalsignature")
    private String digitalsignature;
    
    
    
    
    @JsonProperty("awb_number_barcode")
    private String awbNumberBarcode;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: DummyTemplateData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DummyTemplateData{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Double pdfTypeId;
    
    
    
    
    @JsonProperty("payload")
    private PdfPayloadDetails payload;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: savePdfPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class savePdfPayload{

    

    
    
    
    
    @JsonProperty("pdf_type_id")
    private Double pdfTypeId;
    
    
    
    
    @JsonProperty("payload")
    private PdfPayloadDetails payload;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: MapperDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MapperDetails{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Double pdfTypeId;
    
    
    
    
    @JsonProperty("payload")
    private PdfPayloadDetails payload;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: PdfDataItemsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PdfDataItemsDetails{

    

    
    
    
    
    @JsonProperty("data")
    private List<DummyTemplateData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
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
    Model: DeleteMapperById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteMapperById{

    

    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("default_template")
    private Boolean defaultTemplate;
    
    
    
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
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document{

    

    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pdf_type_id")
    private Integer pdfTypeId;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
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