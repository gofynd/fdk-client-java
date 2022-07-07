



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentDetails](#getshipmentdetails)
* [getShipmentToManifest](#getshipmenttomanifest)



## Methods with example and description


### getOrderShipmentDetails





```java
client.orders.getOrderShipmentDetails( shipmentId) {
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


### getShipmentDetails





```java
client.orders.getShipmentDetails( orderId) {
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



### Schemas

 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | state | String |  no  |  |
 | phone | String |  no  |  |
 | address | String |  no  |  |
 | country | String |  no  |  |
 | email | String |  no  |  |
 | name | String |  no  |  |
 | pincode | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | gstinCode | String? |  yes  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ewayBillId | String? |  yes  |  |
 | id | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | country | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | gstTag | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentChannel | String |  no  |  |
 | state | String |  no  |  |
 | phone | String |  no  |  |
 | id | String |  no  |  |
 | contactPerson | String |  no  |  |
 | address | String |  no  |  |
 | country | String |  no  |  |
 | storeName | String |  no  |  |
 | pincode | String |  no  |  |
 | city | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | journeyType | String |  no  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | paymentMode | String |  no  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | shipmentId | String |  no  |  |
 | shipmentQuantity | Integer |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | bags | HashMap<String,Object> |  no  |  |

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


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | discount | String? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentStatus | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | rtdDone | String |  no  |  |
 | orderId | String |  no  |  |
 | shipmentId | String |  no  |  |
 | totalItems | String |  no  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


