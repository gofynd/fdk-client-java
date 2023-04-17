
package com.sdk.platform.documentengine;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import java.util.*;

public class DocumentEnginePlatformModels{


/*
    Model: GenerateBulkInvoiceLabelShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkInvoiceLabelShipment{
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
}


/*
    Model: GenerateBulkInvoiceOrLabelUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkInvoiceOrLabelUrl{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("batch_id")
    private Double batchId;
    
    
    
}


/*
    Model: DocumentType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentType{
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
}


/*
    Model: BulkListBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListBadRequestResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: BulkListFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListFailedResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: SuccessResponseGenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseGenerateBulkShipment{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("job_id")
    private Double jobId;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
}


/*
    Model: SuccessResponseBulkStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseBulkStatus{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
}


/*
    Model: GenerateBulkUrlSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkUrlSuccessResponse{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
}


/*
    Model: InternalErrorResponseGenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulkShipment{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: BadRequestResponseGenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkUrl{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: InternalErrorResponseGenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulkUrl{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: GenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkShipment{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
}


/*
    Model: GenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkUrl{
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: GetBulkStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBulkStatusRequest{
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
}


/*
    Model: BadRequestResponseGenerateBulkItemParameters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkItemParameters{
    
    
    
    
    @JsonProperty("missing_property")
    private String missingProperty;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: BadRequestResponseGenerateBulkItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkItem{
    
    
    
    
    @JsonProperty("keyword")
    private String keyword;
    
    
    
    
    @JsonProperty("data_path")
    private String dataPath;
    
    
    
    
    @JsonProperty("schema_path")
    private String schemaPath;
    
    
    
    
    @JsonProperty("parameters")
    private BadRequestResponseGenerateBulkItemParameters parameters;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SuccessResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseGenerateBulk{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: BadRequestResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulk{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private List<BadRequestResponseGenerateBulkItem> errorMessage;
    
    
    
}


/*
    Model: InternalErrorResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulk{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
}


/*
    Model: ShippingToAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingToAddress{
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
}


/*
    Model: SellerAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerAddress{
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
}


/*
    Model: BoxDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BoxDetails{
    
    
    
    
    @JsonProperty("box_id")
    private String boxId;
    
    
    
    
    @JsonProperty("total_quantity")
    private String totalQuantity;
    
    
    
    
    @JsonProperty("package_count")
    private String packageCount;
    
    
    
    
    @JsonProperty("dimension")
    private String dimension;
    
    
    
    
    @JsonProperty("weight")
    private String weight;
    
    
    
}


/*
    Model: ShipmentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetails{
    
    
    
    
    @JsonProperty("shipment_no")
    private String shipmentNo;
    
    
    
    
    @JsonProperty("appointment_no")
    private String appointmentNo;
    
    
    
    
    @JsonProperty("total_sku")
    private String totalSku;
    
    
    
    
    @JsonProperty("item_qty")
    private String itemQty;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private String noOfBoxes;
    
    
    
    
    @JsonProperty("shipping_to")
    private String shippingTo;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("gstin_number")
    private String gstinNumber;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingToAddress shippingAddress;
    
    
    
    
    @JsonProperty("seller_address")
    private SellerAddress sellerAddress;
    
    
    
}


/*
    Model: GenerateBulkBoxLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkBoxLabel{
    
    
    
    
    @JsonProperty("stock_transfer_id")
    private String stockTransferId;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("box_details")
    private List<BoxDetails> boxDetails;
    
    
    
}


/*
    Model: GenerateBulkShipmentLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkShipmentLabel{
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentDetails> shipments;
    
    
    
}


/*
    Model: GenerateNoc
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateNoc{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("seller_gstin")
    private String sellerGstin;
    
    
    
    
    @JsonProperty("fc_gstin")
    private String fcGstin;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("fc_address")
    private SellerAddress fcAddress;
    
    
    
    
    @JsonProperty("seller_address")
    private SellerAddress sellerAddress;
    
    
    
}


/*
    Model: PackageDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageDetails{
    
    
    
    
    @JsonProperty("package_id")
    private String packageId;
    
    
    
    
    @JsonProperty("item_quantity")
    private String itemQuantity;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("dimension")
    private String dimension;
    
    
    
    
    @JsonProperty("weight")
    private String weight;
    
    
    
}


/*
    Model: PackageItemDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageItemDetails{
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("mrp")
    private String mrp;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("best_before_date")
    private String bestBeforeDate;
    
    
    
    
    @JsonProperty("ean")
    private String ean;
    
    
    
    
    @JsonProperty("package_details")
    private List<PackageDetails> packageDetails;
    
    
    
}


/*
    Model: GenerateBulkPackageLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkPackageLabel{
    
    
    
    
    @JsonProperty("stock_transfer_id")
    private String stockTransferId;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("item_details")
    private List<PackageItemDetails> itemDetails;
    
    
    
}


/*
    Model: SignedSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedSuccessResponse{
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
}


/*
    Model: BulkPresignedSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkPresignedSuccessResponse{
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
    
    @JsonProperty("presigned_url")
    private String presignedUrl;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
}


/*
    Model: SignedBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedBadRequestResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
}


/*
    Model: SignedFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedFailedResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
}


/*
    Model: StatusSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusSuccessResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: StatusBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusBadRequestResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
}


/*
    Model: StatusFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusFailedResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
}


/*
    Model: GenerateManifest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateManifest{
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
}


/*
    Model: GeneratePresignedManifestUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneratePresignedManifestUrl{
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: ManifestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestLink{
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
}


/*
    Model: GenerateManifestUrlSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateManifestUrlSuccessResponse{
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
}


/*
    Model: ManifestListFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestListFailedResponse{
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: InvoiceLabelPresignedRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceLabelPresignedRequestBody{
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
}




}