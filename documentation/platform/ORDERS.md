



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getOrderShipmentDetails](#getordershipmentdetails)



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



### Schemas

 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeName | String |  no  |  |
 | country | String |  no  |  |
 | code | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | id | String |  no  |  |
 | state | String |  no  |  |
 | pincode | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | contactPerson | String |  no  |  |
 | phone | String |  no  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | id | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | state | String |  no  |  |
 | pincode | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [ShipmentPricesData](#ShipmentPricesData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueOfGood | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | bags | HashMap<String,Object> |  no  |  |
 | journeyType | String |  no  |  |
 | paymentMode | String |  no  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentPrices | [ShipmentPricesData](#ShipmentPricesData)? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | bagStatusHistory | ArrayList<String>? |  yes  |  |
 | shipmentId | String |  no  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |

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



