



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getLaneConfig](#getlaneconfig)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentList](#getshipmentlist)
* [getShipmentToManifest](#getshipmenttomanifest)
* [getOrders](#getorders)



## Methods with example and description


### getShipmentDetails





```java
client.orders.getShipmentDetails( shipmentId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| shipmentId | String | yes |  |  





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getLaneConfig





```java
client.orders.getLaneConfig( superLane,  groupEntity,  fromDate,  toDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| superLane | String? | no |  |   
| groupEntity | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[LaneConfigResponse](#LaneConfigResponse)

Response containing count of shipments of the given status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrderShipmentDetails





```java
client.orders.getOrderShipmentDetails( orderId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| orderId | String | yes |  |  





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentList





```java
client.orders.getShipmentList( lane,  searchType,  searchId,  fromDate,  toDate,  dpIds,  orderingCompanyId,  stores,  salesChannel,  requestByExt,  pageNo,  pageSize,  isPrioritySort) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| requestByExt | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentToManifest





```java
client.orders.getShipmentToManifest( groupEntity,  salesChannel,  dpIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| groupEntity | String | yes |  |   
| salesChannel | String? | no |  |   
| dpIds | String? | no |  |  





*Returned Response:*




[ManifestShipmentResponse](#ManifestShipmentResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrders





```java
client.orders.getOrders( lane,  searchType,  searchValue,  fromDate,  toDate,  dpIds,  stores,  salesChannel,  pageNo,  pageSize,  isPrioritySort) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[OrderListingResponse](#OrderListingResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstTag | String? |  yes  |  |
 | id | String? |  yes  |  |
 | country | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | phone | String |  no  |  |
 | email | String |  no  |  |
 | pincode | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | gstFee | Integer? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentChannel | String |  no  |  |
 | id | String |  no  |  |
 | country | String |  no  |  |
 | phone | String |  no  |  |
 | pincode | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | storeName | String |  no  |  |
 | state | String |  no  |  |
 | contactPerson | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | shipmentQuantity | Integer |  no  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | journeyType | String |  no  |  |
 | shipmentId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | bags | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |
 | value | String |  no  |  |
 | nextState | ArrayList<String>? |  yes  |  |
 | index | Integer |  no  |  |
 | totalShipments | Integer |  no  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |
 | value | String |  no  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String |  no  |  |
 | email | String |  no  |  |
 | lastName | String |  no  |  |
 | mobile | String |  no  |  |
 | uid | Integer |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | gender | String |  no  |  |
 | avisUserId | String |  no  |  |

---


 
 
 #### [FulFillingStore](#FulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opsStatus | String |  no  |  |
 | status | String |  no  |  |
 | actualStatus | String |  no  |  |
 | title | String |  no  |  |
 | hexCode | String |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundCredit | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | discount | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | cashback | Double |  no  |  |
 | codCharges | Double |  no  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstinCode | String |  no  |  |
 | gstFee | Double |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3Category | Integer |  no  |  |
 | id | Integer |  no  |  |
 | canCancel | Boolean |  no  |  |
 | image | ArrayList<String>? |  yes  |  |
 | color | String? |  yes  |  |
 | l3CategoryName | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | size | String |  no  |  |
 | canReturn | Boolean |  no  |  |
 | departmentId | Integer |  no  |  |
 | code | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalShipmentBags | Integer |  no  |  |
 | itemQuantity | Integer |  no  |  |
 | status | HashMap<String,Object> |  no  |  |
 | shipmentId | String |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | item | [Item](#Item)? |  yes  |  |
 | orderingChannel | String |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | bagId | Integer |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalBagsCount | Integer |  no  |  |
 | id | String |  no  |  |
 | fulfillingCentre | String |  no  |  |
 | channel | HashMap<String,Object>? |  yes  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | fulfillingStore | [FulFillingStore](#FulFillingStore)? |  yes  |  |
 | sla | HashMap<String,Object>? |  yes  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | totalShipmentsInOrder | Integer |  no  |  |
 | createdAt | String |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | application | HashMap<String,Object>? |  yes  |  |
 | shipmentCreatedAt | Integer |  no  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Object>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | appliedFilters | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundCredit | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | discount | String? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rtdDone | String |  no  |  |
 | shipmentId | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | totalItems | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | orderId | String |  no  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |

---


 
 
 #### [ErrorSchemaDataSet](#ErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | refundAmount | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | discount | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | couponValue | String? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalBags | Integer |  no  |  |
 | refundCredit | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | shipmentId | String |  no  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | totalItems | Integer |  no  |  |
 | shipmentStatus | HashMap<String,Object> |  no  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |

---


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gender | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobile | Integer |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |
 | orderCreatedTime | String |  no  |  |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |
 | orderId | String |  no  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | orders | ArrayList<[OrderDataSet](#OrderDataSet)>? |  yes  |  |

---


 
 
 #### [OrderErrorSchemaDataSet](#OrderErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---



