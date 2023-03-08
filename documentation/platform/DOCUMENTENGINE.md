



##### [Back to Platform docs](./README.md)

## DocumentEngine Methods
Handles financial pdf generation of Fulfilment
* [generateBulkPackageLabel](#generatebulkpackagelabel)
* [generateBulkBoxLabel](#generatebulkboxlabel)
* [generateBulkShipmentLabel](#generatebulkshipmentlabel)
* [generateNoc](#generatenoc)
* [getLabelStatus](#getlabelstatus)
* [getNocStatus](#getnocstatus)
* [getPresignedURL](#getpresignedurl)
* [getLabelPresignedURL](#getlabelpresignedurl)
* [getNocPresignedURL](#getnocpresignedurl)
* [generatePOSReceipts](#generateposreceipts)



## Methods with example and description


### generateBulkPackageLabel
Generate Labels for Packages




```java
client.documentengine.generateBulkPackageLabel(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [GenerateBulkPackageLabel](#GenerateBulkPackageLabel) | yes | Request body |


Use this API to generate label for Packages

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateBulkBoxLabel
Generate Labels for Boxes which will go inside package




```java
client.documentengine.generateBulkBoxLabel(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [GenerateBulkBoxLabel](#GenerateBulkBoxLabel) | yes | Request body |


Use this API to generate label for Boxes

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateBulkShipmentLabel
Generate Labels for Shipments which contains packaged




```java
client.documentengine.generateBulkShipmentLabel(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [GenerateBulkShipmentLabel](#GenerateBulkShipmentLabel) | yes | Request body |


Use this API to generate label for Shipments

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, Labels will be generated




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generateNoc
Generate NOC for Seller having access to a fullfillment center




```java
client.documentengine.generateNoc(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [GenerateNoc](#GenerateNoc) | yes | Request body |


Use this API to generate NOC for Seller

*Returned Response:*




[SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

Sucsess Response, NOC Pdf will be generated




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "status": true
  }
}
```
</details>

</details>









---


### getLabelStatus
Get Staus of Label generations




```java
client.documentengine.getLabelStatus( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |   
| uid | String | yes | UID given at time of generate request |  



Use this API to fetch status of PDF generation of Labels

*Returned Response:*




[StatusSuccessResponse](#StatusSuccessResponse)

Sucess Response, Status Of Label generation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getNocStatus
Get Staus of NOC generation




```java
client.documentengine.getNocStatus( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |   
| uid | String | yes | UID given at time of generate request |  



Use this API to fetch status of PDF generation of NOC

*Returned Response:*




[StatusSuccessResponse](#StatusSuccessResponse)

Sucess Response, Status Of NOC Pdf generation




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "success": true,
    "status": "created"
  }
}
```
</details>

</details>









---


### getPresignedURL
Get Presigned URL to download PDFs




```java
client.documentengine.getPresignedURL(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [InvoiceLabelPresignedRequestBody](#InvoiceLabelPresignedRequestBody) | yes | Request body |


Use this API to generate Presigned URLs for downloading PDFs

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of PDFs




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLabelPresignedURL
Get Presigned URL to download labels




```java
client.documentengine.getLabelPresignedURL( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |   
| uid | String | yes | UID given at time of generate request |  



Use this API to generate Presigned URLs for downloading labels

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of Labels




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getNocPresignedURL
Get Presigned URL to download NOC Pdf




```java
client.documentengine.getNocPresignedURL( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |   
| uid | String | yes | UID given at time of generate request |  



Use this API to generate Presigned URL for downloading NOC Pdf

*Returned Response:*




[SignedSuccessResponse](#SignedSuccessResponse)

Sucess Response, Presigned URL of NOC Pdf




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success response</i></summary>

```json
{
  "value": {
    "uid": "l27h38uy",
    "expires_in": 300,
    "url": "presigned-url"
  }
}
```
</details>

</details>









---


### generatePOSReceipts
Generate Receipts for an order




```java
client.documentengine.generatePOSReceipts(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company ID |  
| body | [GeneratePOSReceipts](#GeneratePOSReceipts) | yes | Request body |


Use this API to generate Payment Receipts and Invoice Receipts

*Returned Response:*




[SuccessResponseGeneratePOSReceipts](#SuccessResponseGeneratePOSReceipts)

Success Response, Template string will be generated for receipts




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [GenerateBulkInvoiceLabelShipment](#GenerateBulkInvoiceLabelShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Double |  no  |  |
 | fromDate | String |  no  |  |
 | toDate | String |  no  |  |
 | documentType | String |  no  |  |
 | shipmentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GenerateBulkInvoiceOrLabelUrl](#GenerateBulkInvoiceOrLabelUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String |  no  |  |
 | documentType | String |  no  |  |
 | batchId | Double |  no  |  |

---


 
 
 #### [DocumentType](#DocumentType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | String |  no  |  |
 | label | String |  no  |  |

---


 
 
 #### [BulkListBadRequestResponse](#BulkListBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [BulkListFailedResponse](#BulkListFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [SuccessResponseGenerateBulkShipment](#SuccessResponseGenerateBulkShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | jobId | Double |  no  |  |
 | traceId | String? |  yes  |  |

---


 
 
 #### [SuccessResponseBulkStatus](#SuccessResponseBulkStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | status | String |  no  |  |
 | traceId | String? |  yes  |  |

---


 
 
 #### [GenerateBulkUrlSuccessResponse](#GenerateBulkUrlSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | uid | String |  no  |  |
 | expiresIn | Double |  no  |  |
 | presignedType | String |  no  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulkShipment](#InternalErrorResponseGenerateBulkShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | String |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkUrl](#BadRequestResponseGenerateBulkUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |
 | requestId | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | stackTrace | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulkUrl](#InternalErrorResponseGenerateBulkUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [GenerateBulkShipment](#GenerateBulkShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String |  no  |  |
 | storeCode | String |  no  |  |
 | batchId | String |  no  |  |
 | documentType | String |  no  |  |

---


 
 
 #### [GenerateBulkUrl](#GenerateBulkUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiresIn | Double? |  yes  |  |
 | documentType | String |  no  |  |
 | batchId | String |  no  |  |

---


 
 
 #### [GetBulkStatusRequest](#GetBulkStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkItemParameters](#BadRequestResponseGenerateBulkItemParameters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | missingProperty | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [BadRequestResponseGenerateBulkItem](#BadRequestResponseGenerateBulkItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | keyword | String? |  yes  |  |
 | dataPath | String? |  yes  |  |
 | schemaPath | String? |  yes  |  |
 | parameters | [BadRequestResponseGenerateBulkItemParameters](#BadRequestResponseGenerateBulkItemParameters)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [SuccessResponseGenerateBulk](#SuccessResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [BadRequestResponseGenerateBulk](#BadRequestResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | errorMessage | ArrayList<[BadRequestResponseGenerateBulkItem](#BadRequestResponseGenerateBulkItem)> |  no  |  |

---


 
 
 #### [InternalErrorResponseGenerateBulk](#InternalErrorResponseGenerateBulk)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [ShippingToAddress](#ShippingToAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [SellerAddress](#SellerAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [BoxDetails](#BoxDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | boxId | String |  no  |  |
 | totalQuantity | String |  no  |  |
 | packageCount | String |  no  |  |
 | dimension | String |  no  |  |
 | weight | String |  no  |  |

---


 
 
 #### [ShipmentDetails](#ShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentNo | String |  no  |  |
 | appointmentNo | String |  no  |  |
 | totalSku | String |  no  |  |
 | itemQty | String |  no  |  |
 | noOfBoxes | String |  no  |  |
 | shippingTo | String |  no  |  |
 | sellerName | String |  no  |  |
 | gstinNumber | String |  no  |  |
 | shippingAddress | [ShippingToAddress](#ShippingToAddress) |  no  |  |
 | sellerAddress | [SellerAddress](#SellerAddress) |  no  |  |

---


 
 
 #### [GenerateBulkBoxLabel](#GenerateBulkBoxLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stockTransferId | String |  no  |  |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | templateId | Double |  no  |  |
 | boxDetails | ArrayList<[BoxDetails](#BoxDetails)> |  no  |  |

---


 
 
 #### [GenerateBulkShipmentLabel](#GenerateBulkShipmentLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | templateId | Double |  no  |  |
 | shipments | ArrayList<[ShipmentDetails](#ShipmentDetails)> |  no  |  |

---


 
 
 #### [GenerateNoc](#GenerateNoc)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | sellerGstin | String |  no  |  |
 | fcGstin | String |  no  |  |
 | templateId | Double |  no  |  |
 | fcAddress | [SellerAddress](#SellerAddress) |  no  |  |
 | sellerAddress | [SellerAddress](#SellerAddress) |  no  |  |

---


 
 
 #### [PackageDetails](#PackageDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packageId | String |  no  |  |
 | itemQuantity | String |  no  |  |
 | packageType | String |  no  |  |
 | packagingType | String |  no  |  |
 | dimension | String |  no  |  |
 | weight | String |  no  |  |

---


 
 
 #### [PackageItemDetails](#PackageItemDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jioCode | String |  no  |  |
 | itemName | String |  no  |  |
 | mrp | String |  no  |  |
 | countryOfOrigin | String |  no  |  |
 | bestBeforeDate | String |  no  |  |
 | ean | String |  no  |  |
 | packageDetails | ArrayList<[PackageDetails](#PackageDetails)> |  no  |  |

---


 
 
 #### [GenerateBulkPackageLabel](#GenerateBulkPackageLabel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stockTransferId | String |  no  |  |
 | labelType | String |  no  |  |
 | uid | String |  no  |  |
 | sellerName | String |  no  |  |
 | templateId | Double |  no  |  |
 | itemDetails | ArrayList<[PackageItemDetails](#PackageItemDetails)> |  no  |  |

---


 
 
 #### [SignedSuccessResponse](#SignedSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String? |  yes  |  |
 | url | String? |  yes  |  |
 | expiresIn | Double? |  yes  |  |

---


 
 
 #### [BulkPresignedSuccessResponse](#BulkPresignedSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | String |  no  |  |
 | batchId | String? |  yes  |  |
 | presignedType | String? |  yes  |  |
 | presignedUrl | String |  no  |  |
 | expiresIn | Double? |  yes  |  |

---


 
 
 #### [SignedBadRequestResponse](#SignedBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [SignedFailedResponse](#SignedFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [StatusSuccessResponse](#StatusSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [StatusBadRequestResponse](#StatusBadRequestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [StatusFailedResponse](#StatusFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | errorMessage | String? |  yes  |  |

---


 
 
 #### [GenerateManifest](#GenerateManifest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Double |  no  |  |
 | fromDate | String |  no  |  |
 | toDate | String |  no  |  |
 | shipmentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GeneratePresignedManifestUrl](#GeneratePresignedManifestUrl)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [ManifestLink](#ManifestLink)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | manifestId | String |  no  |  |

---


 
 
 #### [GenerateManifestUrlSuccessResponse](#GenerateManifestUrlSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | uid | String |  no  |  |
 | manifestId | String |  no  |  |
 | expiresIn | Double |  no  |  |
 | presignedType | String |  no  |  |

---


 
 
 #### [ManifestListFailedResponse](#ManifestListFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [InvoiceLabelPresignedRequestBody](#InvoiceLabelPresignedRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | documentType | String |  no  |  |
 | entityId | String |  no  |  |
 | expiresIn | Double? |  yes  |  |

---


 
 
 #### [GeneratePOSReceipts](#GeneratePOSReceipts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [OrderDict](#OrderDict) |  no  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)> |  no  |  |

---


 
 
 #### [SuccessResponseGeneratePOSReceipts](#SuccessResponseGeneratePOSReceipts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | orderId | String |  no  |  |
 | invoiceReceipt | String |  no  |  |
 | paymentReceipt | String |  no  |  |

---


 
 
 #### [BadRequestResponseGeneratePOSReceipts](#BadRequestResponseGeneratePOSReceipts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<HashMap<String,Object>> |  no  |  |

---


 
 
 #### [InternalErrorResponseGeneratePOSReceipts](#InternalErrorResponseGeneratePOSReceipts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String |  no  |  |
 | error | String |  no  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | name | String |  no  |  |
 | country | String |  no  |  |
 | state | String |  no  |  |
 | address | String |  no  |  |
 | email | String? |  yes  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [LockData](#LockData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mto | Boolean? |  yes  |  |
 | locked | Boolean? |  yes  |  |
 | lockMessage | String? |  yes  |  |

---


 
 
 #### [ShipmentTimeStamp](#ShipmentTimeStamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tMin | String? |  yes  |  |
 | tMax | String? |  yes  |  |

---


 
 
 #### [BuyerDetails](#BuyerDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ajioSiteId | String? |  yes  |  |
 | name | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | gstin | String |  no  |  |
 | address | String |  no  |  |
 | pincode | Integer |  no  |  |

---


 
 
 #### [EInvoice](#EInvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | signedQrCode | String? |  yes  |  |
 | signedInvoice | String? |  yes  |  |
 | errorCode | String? |  yes  |  |
 | acknowledgeNo | Integer? |  yes  |  |
 | errorMessage | String? |  yes  |  |
 | irn | String? |  yes  |  |
 | acknowledgeDate | String? |  yes  |  |

---


 
 
 #### [EinvoiceInfo](#EinvoiceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | creditNote | [EInvoice](#EInvoice)? |  yes  |  |
 | invoice | [EInvoice](#EInvoice)? |  yes  |  |

---


 
 
 #### [DebugInfo](#DebugInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stormbreakerUuid | String? |  yes  |  |

---


 
 
 #### [Formatted](#Formatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fMax | String? |  yes  |  |
 | fMin | String? |  yes  |  |

---


 
 
 #### [ShipmentMeta](#ShipmentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | assignDpFromSb | Boolean? |  yes  |  |
 | shipmentVolumetricWeight | Double? |  yes  |  |
 | lockData | [LockData](#LockData)? |  yes  |  |
 | shipmentWeight | Double? |  yes  |  |
 | autoTriggerDpAssignmentAcf | Boolean |  no  |  |
 | dpId | String? |  yes  |  |
 | timestamp | [ShipmentTimeStamp](#ShipmentTimeStamp)? |  yes  |  |
 | returnAffiliateShipmentId | String? |  yes  |  |
 | storeInvoiceUpdatedDate | String? |  yes  |  |
 | bagWeight | HashMap<String,Object>? |  yes  |  |
 | forwardAffiliateOrderId | String? |  yes  |  |
 | b2BBuyerDetails | [BuyerDetails](#BuyerDetails)? |  yes  |  |
 | external | HashMap<String,Object>? |  yes  |  |
 | dpSortKey | String? |  yes  |  |
 | ewaybillInfo | HashMap<String,Object>? |  yes  |  |
 | dpOptions | HashMap<String,Object>? |  yes  |  |
 | returnAwbNumber | String? |  yes  |  |
 | dpName | String? |  yes  |  |
 | poNumber | String? |  yes  |  |
 | weight | Integer |  no  |  |
 | dueDate | String? |  yes  |  |
 | sameStoreAvailable | Boolean |  no  |  |
 | packagingName | String? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |
 | einvoiceInfo | [EinvoiceInfo](#EinvoiceInfo)? |  yes  |  |
 | forwardAffiliateShipmentId | String? |  yes  |  |
 | marketplaceStoreId | String? |  yes  |  |
 | returnAffiliateOrderId | String? |  yes  |  |
 | debugInfo | [DebugInfo](#DebugInfo)? |  yes  |  |
 | awbNumber | String? |  yes  |  |
 | b2CBuyerDetails | HashMap<String,Object>? |  yes  |  |
 | orderType | String? |  yes  |  |
 | formatted | [Formatted](#Formatted)? |  yes  |  |
 | returnDetails | HashMap<String,Object>? |  yes  |  |
 | returnStoreNode | Integer? |  yes  |  |
 | boxType | String? |  yes  |  |

---


 
 
 #### [PDFLinks](#PDFLinks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | creditNoteUrl | String? |  yes  |  |
 | b2B | String? |  yes  |  |
 | invoiceA4 | String? |  yes  |  |
 | invoice | String? |  yes  |  |
 | invoiceType | String |  no  |  |
 | labelType | String |  no  |  |
 | poInvoice | String? |  yes  |  |
 | label | String? |  yes  |  |
 | labelA6 | String? |  yes  |  |
 | labelPos | String? |  yes  |  |
 | labelA4 | String? |  yes  |  |
 | invoicePos | String? |  yes  |  |
 | invoiceA6 | String? |  yes  |  |

---


 
 
 #### [AffiliateMeta](#AffiliateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponCode | String? |  yes  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | sizeLevelTotalQty | Integer? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | employeeDiscount | Double? |  yes  |  |
 | channelShipmentId | String? |  yes  |  |
 | isPriority | Boolean? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | boxType | String? |  yes  |  |
 | channelOrderId | String? |  yes  |  |
 | orderItemId | String? |  yes  |  |

---


 
 
 #### [AffiliateDetails](#AffiliateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | adId | String? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |
 | shipmentMeta | [ShipmentMeta](#ShipmentMeta) |  no  |  |
 | pdfLinks | [PDFLinks](#PDFLinks)? |  yes  |  |
 | affiliateOrderId | String |  no  |  |
 | affiliateId | String? |  yes  |  |
 | companyAffiliateTag | String? |  yes  |  |
 | affiliateStoreId | String |  no  |  |
 | affiliateMeta | [AffiliateMeta](#AffiliateMeta) |  no  |  |
 | affiliateBagId | String |  no  |  |

---


 
 
 #### [PlatformItem](#PlatformItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String? |  yes  |  |
 | color | String? |  yes  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | l3CategoryName | String? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |
 | id | Integer? |  yes  |  |
 | l3Category | Integer? |  yes  |  |
 | departmentId | Integer? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | images | ArrayList<String>? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | code | String? |  yes  |  |

---


 
 
 #### [GSTDetailsData](#GSTDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstinCode | String |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | gstFee | Double |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Double? |  yes  |  |
 | fyndCredits | Double? |  yes  |  |
 | refundCredit | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | deliveryCharge | Double? |  yes  |  |
 | valueOfGood | Double? |  yes  |  |
 | amountPaid | Double? |  yes  |  |
 | cashbackApplied | Double? |  yes  |  |
 | cashback | Double? |  yes  |  |
 | amountPaidRoundoff | Double? |  yes  |  |
 | promotionEffectiveDiscount | Double? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | priceMarked | Double? |  yes  |  |
 | taxCollectedAtSource | Double? |  yes  |  |
 | refundAmount | Double? |  yes  |  |
 | couponValue | Double? |  yes  |  |

---


 
 
 #### [BagStateMapper](#BagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | notifyCustomer | Boolean? |  yes  |  |
 | stateType | String |  no  |  |
 | appDisplayName | String? |  yes  |  |
 | journeyType | String |  no  |  |
 | appStateName | String? |  yes  |  |
 | appFacing | Boolean? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | bsId | Integer |  no  |  |

---


 
 
 #### [DPDetailsData](#DPDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | awbNo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | country | String? |  yes  |  |
 | amountHandlingCharges | Integer? |  yes  |  |
 | id | Integer? |  yes  |  |
 | dpCharges | Integer? |  yes  |  |
 | dpReturnCharges | Integer? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | ewayBillNumber | Integer? |  yes  |  |
 | pincode | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |

---


 
 
 #### [Dimensions](#Dimensions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  |  |
 | length | Integer? |  yes  |  |
 | unit | String? |  yes  |  |
 | height | Integer? |  yes  |  |
 | width | Integer? |  yes  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dimension | [Dimensions](#Dimensions)? |  yes  |  |

---


 
 
 #### [OrderingStore](#OrderingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object> |  no  |  |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | id | String |  no  |  |
 | state | String |  no  |  |
 | address | String |  no  |  |
 | code | String |  no  |  |
 | contactPerson | String |  no  |  |
 | pincode | String |  no  |  |
 | storeName | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object> |  no  |  |
 | city | String |  no  |  |
 | country | String |  no  |  |
 | id | Integer |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | state | String |  no  |  |
 | address | String |  no  |  |
 | code | String |  no  |  |
 | contactPerson | String |  no  |  |
 | fulfillmentType | String? |  yes  |  |
 | pincode | String |  no  |  |
 | storeName | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | HashMap<String,Object>? |  yes  |  |
 | uid | String? |  yes  |  |
 | returnConfig | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CurrentStatus](#CurrentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kafkaSync | Boolean? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | stateId | Integer? |  yes  |  |
 | deliveryAwbNumber | String? |  yes  |  |
 | deliveryPartnerId | Integer? |  yes  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper)? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | status | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | currentStatusId | Integer |  no  |  |
 | stateType | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hsnCode | String? |  yes  |  |
 | gstTaxPercentage | Integer? |  yes  |  |
 | brandCalculatedAmount | Double? |  yes  |  |
 | valueOfGood | Double? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | gstFee | Double? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |

---


 
 
 #### [PlatformDeliveryAddress](#PlatformDeliveryAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | longitude | Integer? |  yes  |  |
 | addressCategory | String? |  yes  |  |
 | latitude | Integer? |  yes  |  |
 | city | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | country | String? |  yes  |  |
 | area | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | contactPerson | String? |  yes  |  |
 | state | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | version | String? |  yes  |  |
 | email | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | phone | String? |  yes  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ean | String? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemName | String |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | couponEffectiveDiscount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | priceEffective | Integer |  no  |  |
 | priceMarked | Integer |  no  |  |
 | fyndCredits | Integer |  no  |  |
 | hsnCode | String |  no  |  |
 | refundCredit | Integer |  no  |  |
 | amountPaid | Double |  no  |  |
 | cashback | Integer |  no  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | cashbackApplied | Integer |  no  |  |
 | discount | Integer |  no  |  |
 | gstTag | String |  no  |  |
 | amountPaidRoundoff | Integer? |  yes  |  |
 | totalUnits | Integer |  no  |  |
 | couponValue | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | codCharges | Integer |  no  |  |
 | size | String |  no  |  |
 | identifiers | [Identifier](#Identifier) |  no  |  |
 | gstTaxPercentage | Integer |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | transferPrice | Integer |  no  |  |
 | deliveryCharge | Integer |  no  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enableTracking | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [DiscountRules](#DiscountRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Integer? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ItemCriterias](#ItemCriterias)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemBrand | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [BuyRules](#BuyRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCriteria | [ItemCriterias](#ItemCriterias)? |  yes  |  |
 | cartConditions | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AppliedPromos](#AppliedPromos)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promotionName | String? |  yes  |  |
 | promotionType | String? |  yes  |  |
 | discountRules | ArrayList<[DiscountRules](#DiscountRules)>? |  yes  |  |
 | promoId | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | buyRules | ArrayList<[BuyRules](#BuyRules)>? |  yes  |  |
 | mrpPromotion | Boolean? |  yes  |  |
 | articleQuantity | Integer? |  yes  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | String? |  yes  |  |
 | company | String |  no  |  |
 | id | Integer |  no  |  |
 | logo | String |  no  |  |
 | brandName | String |  no  |  |
 | createdOn | String |  no  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagId | Integer |  no  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | currentStatus | [CurrentStatus](#CurrentStatus)? |  yes  |  |
 | lineNumber | Integer? |  yes  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | entityType | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress)? |  yes  |  |
 | parentPromoBags | HashMap<String,Object>? |  yes  |  |
 | financialBreakup | [FinancialBreakup](#FinancialBreakup)? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | item | [PlatformItem](#PlatformItem)? |  yes  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | identifier | String? |  yes  |  |
 | appliedPromos | ArrayList<[AppliedPromos](#AppliedPromos)>? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |

---


 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | kafkaSync | Boolean? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | stateId | Integer? |  yes  |  |
 | deliveryAwbNumber | String? |  yes  |  |
 | deliveryPartnerId | Integer? |  yes  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper)? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | displayName | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | status | String |  no  |  |
 | createdAt | String? |  yes  |  |
 | reasons | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | appDisplayName | String? |  yes  |  |
 | stateType | String? |  yes  |  |
 | bshId | Integer? |  yes  |  |
 | forward | Boolean? |  yes  |  |
 | shipmentId | String? |  yes  |  |

---


 
 
 #### [InvoiceInfo](#InvoiceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeInvoiceId | String? |  yes  |  |
 | creditNoteId | String? |  yes  |  |
 | updatedDate | String? |  yes  |  |
 | labelUrl | String? |  yes  |  |
 | invoiceUrl | String? |  yes  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | time | String? |  yes  |  |
 | isPassed | Boolean? |  yes  |  |
 | text | String |  no  |  |
 | status | String |  no  |  |
 | isCurrent | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | String? |  yes  |  |
 | orderValue | String? |  yes  |  |
 | taxDetails | HashMap<String,Object>? |  yes  |  |
 | orderDate | String? |  yes  |  |
 | source | String? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | affiliateId | String? |  yes  |  |
 | orderingChannelLogo | HashMap<String,Object>? |  yes  |  |
 | orderingChannel | String? |  yes  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | status | String? |  yes  |  |
 | bagList | ArrayList<String>? |  yes  |  |
 | shipmentId | String? |  yes  |  |

---


 
 
 #### [PlatformShipment](#PlatformShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentStatus | String? |  yes  |  |
 | platformLogo | String? |  yes  |  |
 | operationalStatus | String? |  yes  |  |
 | orderingStore | [OrderingStore](#OrderingStore)? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | deliverySlot | HashMap<String,Object>? |  yes  |  |
 | affiliateDetails | [AffiliateDetails](#AffiliateDetails)? |  yes  |  |
 | invoiceId | String? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bags | ArrayList<[OrderBags](#OrderBags)>? |  yes  |  |
 | gstDetails | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | packagingType | String? |  yes  |  |
 | shipmentQuantity | Integer? |  yes  |  |
 | invoice | [InvoiceInfo](#InvoiceInfo)? |  yes  |  |
 | dpDetails | [DPDetailsData](#DPDetailsData)? |  yes  |  |
 | lockStatus | Boolean? |  yes  |  |
 | enableDpTracking | Boolean? |  yes  |  |
 | totalItems | Integer? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | customMeta | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | userAgent | String? |  yes  |  |
 | vertical | String? |  yes  |  |
 | journeyType | String? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | fulfilmentPriority | Integer? |  yes  |  |
 | coupon | HashMap<String,Object>? |  yes  |  |
 | meta | [Meta](#Meta)? |  yes  |  |
 | pickedDate | String? |  yes  |  |
 | totalBags | Integer? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [OrderMeta](#OrderMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartId | Integer? |  yes  |  |
 | orderPlatform | String? |  yes  |  |
 | mongoCartId | Integer? |  yes  |  |
 | orderingStore | Integer? |  yes  |  |
 | paymentType | String? |  yes  |  |
 | orderChildEntities | ArrayList<String>? |  yes  |  |
 | orderTags | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | files | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | orderType | String? |  yes  |  |
 | employeeId | Integer? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | customerNote | String? |  yes  |  |
 | comment | String? |  yes  |  |
 | staff | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OrderDict](#OrderDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | [OrderMeta](#OrderMeta)? |  yes  |  |
 | paymentMethods | HashMap<String,Object>? |  yes  |  |
 | taxDetails | HashMap<String,Object>? |  yes  |  |
 | orderDate | String |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | fyndOrderId | String |  no  |  |

---



