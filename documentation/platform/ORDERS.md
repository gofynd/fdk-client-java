



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
client.orders.getShipmentList( lane,  searchType,  searchId,  fromDate,  toDate,  dpIds,  orderingCompanyId,  stores,  salesChannel,  requestByExt,  isPrioritySort) {
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
client.orders.getOrders( lane,  searchType,  searchValue,  fromDate,  toDate,  dpIds,  stores,  salesChannel,  isPrioritySort) {
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

 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | awbNo | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | country | String? |  yes  |  |
 | name | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | pincode | String |  no  |  |
 | phone | String |  no  |  |
 | country | String |  no  |  |
 | storeName | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | code | String |  no  |  |
 | state | String |  no  |  |
 | id | String |  no  |  |
 | contactPerson | String |  no  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | gstinCode | String? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | journeyType | String |  no  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | paymentMode | String |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | bags | HashMap<String,Object> |  no  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | index | Integer |  no  |  |
 | displayName | String |  no  |  |
 | totalShipments | Integer |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |
 | nextState | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String |  no  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [FulFillingStore](#FulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String |  no  |  |
 | l3Category | Integer |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | l3CategoryName | String |  no  |  |
 | canReturn | Boolean |  no  |  |
 | departmentId | Integer |  no  |  |
 | image | ArrayList<String>? |  yes  |  |
 | code | String |  no  |  |
 | canCancel | Boolean |  no  |  |
 | color | String? |  yes  |  |
 | name | String |  no  |  |
 | id | Integer |  no  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstinCode | String |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | discount | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | cashback | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannel | String |  no  |  |
 | item | [Item](#Item)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | itemQuantity | Integer |  no  |  |
 | totalShipmentBags | Integer |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | status | HashMap<String,Object> |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String |  no  |  |
 | uid | Integer |  no  |  |
 | email | String |  no  |  |
 | lastName | String |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | gender | String |  no  |  |
 | firstName | String |  no  |  |
 | avisUserId | String |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opsStatus | String |  no  |  |
 | hexCode | String |  no  |  |
 | title | String |  no  |  |
 | actualStatus | String |  no  |  |
 | status | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalBagsCount | Integer |  no  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | fulfillingStore | [FulFillingStore](#FulFillingStore)? |  yes  |  |
 | sla | HashMap<String,Object>? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | shipmentCreatedAt | Integer |  no  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | application | HashMap<String,Object>? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | createdAt | String |  no  |  |
 | fulfillingCentre | String |  no  |  |
 | totalShipmentsInOrder | Integer |  no  |  |
 | channel | HashMap<String,Object>? |  yes  |  |
 | id | String |  no  |  |

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
 | type | String |  no  |  |
 | text | String |  no  |  |
 | value | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | appliedFilters | HashMap<String,Object>? |  yes  |  |
 | page | HashMap<String,Object>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | discount | String? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | totalItems | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | rtdDone | String |  no  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ErrorSchemaDataSet](#ErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Integer? |  yes  |  |
 | discount | Integer? |  yes  |  |
 | couponValue | String? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | refundAmount | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | shipmentStatus | HashMap<String,Object> |  no  |  |
 | priceEffective | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | totalItems | Integer |  no  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | totalBags | Integer |  no  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | shipmentId | String |  no  |  |

---


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Integer |  no  |  |
 | gender | String? |  yes  |  |
 | name | String |  no  |  |
 | email | String? |  yes  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderCreatedTime | String |  no  |  |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |
 | orderId | String |  no  |  |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orders | ArrayList<[OrderDataSet](#OrderDataSet)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [OrderErrorSchemaDataSet](#OrderErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---



