



##### [Back to Platform docs](./README.md)

## Logistic Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 
* [getApplicationServiceability](#getapplicationserviceability)
* [getEntityRegionView](#getentityregionview)
* [getListView](#getlistview)
* [getCompanyStoreView](#getcompanystoreview)
* [getZoneDataView](#getzonedataview)
* [updateZoneControllerView](#updatezonecontrollerview)
* [insertZoneControllerView](#insertzonecontrollerview)
* [upsertZoneControllerView](#upsertzonecontrollerview)
* [getStore](#getstore)
* [getAllStores](#getallstores)



## Methods with example and description


### getApplicationServiceability
Zone configuration of application.




```java
client.application("<APPLICATION_ID>").logistic.getApplicationServiceability() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This API returns serviceability config of the application.

*Returned Response:*




[ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "error": {
    "type": null,
    "value": null,
    "message": null
  },
  "success": true,
  "data": {
    "channel_id": "5d656121a81320c2e6ee2a72",
    "channel_type": "application",
    "serviceability_type": "all"
  }
}
```
</details>









---


### getEntityRegionView
Get country and state list




```java
client.logistic.getEntityRegionView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [EntityRegionView_Request](#EntityRegionView_Request) | yes | Request body |


This API returns response for Entity Region View.

*Returned Response:*




[EntityRegionView_Response](#EntityRegionView_Response)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getListView
Zone List of application.




```java
client.logistic.getListView( pageNumber,  pageSize,  name,  isActive,  channelIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNumber | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| name | String? | no | Name of particular zone in the seller account |   
| isActive | Boolean? | no | status of  zone whether active or inactive |   
| channelIds | String? | no | zones associated with the given channel ids' |  



This API returns Zone List View of the application.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCompanyStoreView
Company Store View of application.




```java
client.logistic.getCompanyStoreView() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |  



This API returns Company Store View of the application.

*Returned Response:*




[CompanyStoreView_Response](#CompanyStoreView_Response)

Get Company Store View Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneDataView
Zone Data View of application.




```java
client.logistic.getZoneDataView( zoneId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  



This API returns Zone Data View of the application.

*Returned Response:*




[GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

Get Application Zone Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateZoneControllerView
Updation of zone collections in database.




```java
client.logistic.updateZoneControllerView( zoneId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [ZoneUpdateRequest](#ZoneUpdateRequest) | yes | Request body |


This API returns response of updation of zone in mongo database.

*Returned Response:*




[ZoneSuccessResponse](#ZoneSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### insertZoneControllerView
Insertion of zone in database.




```java
client.logistic.insertZoneControllerView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [ZoneRequest](#ZoneRequest) | yes | Request body |


This API returns response of insertion of zone in mongo database.<br>Correction- `zone_id` in the path must be removed.<br> path is `/service/platform/logistics-internal/v1.0/company/{company_id}/zone/`

*Returned Response:*




[ZoneResponse](#ZoneResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertZoneControllerView
GET zone from the Pincode.




```java
client.application("<APPLICATION_ID>").logistic.upsertZoneControllerView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` contains a specific ID of a company. |   
| applicationId | String | yes | A `application_id` contains a unique ID. |  
| body | [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest) | yes | Request body |


This API returns zone from the Pincode View.

*Returned Response:*




[GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStore
GET stores data




```java
client.logistic.getStore( storeUid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| storeUid | Integer | yes | A `store_uid` contains a specific ID of a store. |  



This API returns stores data.

*Returned Response:*




[GetStoresViewResponse](#GetStoresViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; items</i></summary>

```json
[
  {
    "uid": 2,
    "_cls": "Store",
    "address": {
      "city": "MUMBAI",
      "country": "INDIA",
      "address2": "",
      "address1": "POLARIS 2ND FLOOR, ANDHERI",
      "landmark": "",
      "state": "MAHARASHTRA",
      "pincode": 400001,
      "longitude": 72.8776559,
      "latitude": 19.0759837
    },
    "code": "HS-a0c85",
    "company_id": 2,
    "contact_numbers": [
      {
        "country_code": 91,
        "number": "9096686804"
      }
    ],
    "created_by": {
      "user_id": "605e8e86493f54a9ccaa47be",
      "username": "parvezshaikh_gofynd_com_07710"
    },
    "created_on": "2021-08-07T06:21:25.293000",
    "display_name": "Test",
    "documents": [
      {
        "type": "gst",
        "verified": true,
        "value": "27AALCA0442L1ZM",
        "legal_name": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED"
      }
    ],
    "gst_credentials": {
      "e_waybill": {
        "enabled": false
      },
      "e_invoice": {
        "enabled": false
      }
    },
    "integration_type": {
      "order": "pulse",
      "inventory": "pulse"
    },
    "logistics": {
      "dp": {
        "1": {
          "fm_priority": 1,
          "lm_priority": 1,
          "rvp_priority": 1,
          "payment_mode": "all",
          "operations": [
            "inter_city"
          ],
          "area_code": null,
          "assign_dp_from_sb": true,
          "transport_mode": "air",
          "external_account_id": null,
          "internal_account_id": "1"
        },
        "19": {
          "fm_priority": 2,
          "lm_priority": 2,
          "rvp_priority": 2,
          "payment_mode": "all",
          "operations": "inter_city",
          "area_code": null,
          "assign_dp_from_sb": true,
          "transport_mode": "air",
          "external_account_id": null,
          "internal_account_id": "19"
        }
      },
      "override": false
    },
    "manager": {
      "name": "Parvez Shaikh",
      "mobile_no": {
        "country_code": 91,
        "number": "9096686804"
      },
      "email": "parvezshaikh@gofynd.com"
    },
    "modified_by": {
      "user_id": "38ac93a8a5495305fc794e76",
      "username": "919594495254_32111"
    },
    "modified_on": "2021-08-17T14:18:10.788000",
    "name": "Test",
    "notification_emails": [
      "parvezshaikh@gofynd.com"
    ],
    "product_return_config": {
      "on_same_store": true
    },
    "stage": "verified",
    "store_type": "high_street",
    "sub_type": "store",
    "timing": [
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "monday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "tuesday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "wednesday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "thursday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "friday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "saturday"
      },
      {
        "open": true,
        "opening": {
          "hour": 11,
          "minute": 0
        },
        "closing": {
          "hour": 21,
          "minute": 30
        },
        "weekday": "sunday"
      }
    ],
    "verified_by": {
      "user_id": "0",
      "username": "Silverbolt"
    },
    "verified_on": "2022-03-23T13:35:46.869000",
    "warnings": {
      "store_address": "Address: Address seems to be inappropriate this might affect the delivery."
    },
    "_custom_json": {},
    "company": 2
  }
]
```
</details>

<details>
<summary><i>&nbsp; page</i></summary>

```json
{
  "type": "number",
  "size": 2,
  "current": 1,
  "has_next": true,
  "item_total": 3276
}
```
</details>

</details>









---


### getAllStores
GET stores data




```java
client.logistic.getAllStores() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  



This API returns stores data.

*Returned Response:*




[GetStoresViewResponse](#GetStoresViewResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |
 | serviceabilityType | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | [ServiceabilityrErrorResponse](#ServiceabilityrErrorResponse)? |  yes  |  |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentId | ArrayList<String>? |  yes  |  |
 | subType | ArrayList<String> |  no  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | subType | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalActiveZones | Integer |  no  |  |
 | totalPincodesServed | Integer |  no  |  |
 | totalZones | Integer |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewChannels](#ListViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storesCount | Integer |  no  |  |
 | companyId | Integer |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | channels | [ListViewChannels](#ListViewChannels) |  no  |  |
 | zoneId | String |  no  |  |
 | pincodesCount | Integer |  no  |  |
 | product | [ListViewProduct](#ListViewProduct) |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | summary | ArrayList<[ListViewSummary](#ListViewSummary)> |  no  |  |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CompanyStoreView_Response](#CompanyStoreView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[CompanyStoreView_PageItems](#CompanyStoreView_PageItems)> |  no  |  |
 | items | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [GetZoneDataViewChannels](#GetZoneDataViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelType | String |  no  |  |
 | channelId | String |  no  |  |

---


 
 
 #### [ZoneProductTypes](#ZoneProductTypes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |

---


 
 
 #### [ZoneMappingType](#ZoneMappingType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | ArrayList<String>? |  yes  |  |
 | country | String |  no  |  |
 | state | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetZoneDataViewItems](#GetZoneDataViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Integer |  no  |  |
 | pincodesCount | Integer |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

---


 
 
 #### [UpdateZoneData](#UpdateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |

---


 
 
 #### [ZoneUpdateRequest](#ZoneUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | data | [UpdateZoneData](#UpdateZoneData) |  no  |  |

---


 
 
 #### [ZoneSuccessResponse](#ZoneSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | statusCode | Integer |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |

---


 
 
 #### [ZoneRequest](#ZoneRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | data | [CreateZoneData](#CreateZoneData) |  no  |  |

---


 
 
 #### [ZoneResponse](#ZoneResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | zoneId | String |  no  |  |
 | statusCode | Integer |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zones | ArrayList<String> |  no  |  |
 | serviceabilityType | String |  no  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | size | Integer? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [EwayBillResponse](#EwayBillResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [EinvoiceResponse](#EinvoiceResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [GstCredentialsResponse](#GstCredentialsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eWaybill | [EwayBillResponse](#EwayBillResponse)? |  yes  |  |
 | eInvoice | [EinvoiceResponse](#EinvoiceResponse)? |  yes  |  |

---


 
 
 #### [OpeningClosing](#OpeningClosing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Integer? |  yes  |  |
 | hour | Integer? |  yes  |  |

---


 
 
 #### [TimmingResponse](#TimmingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | closing | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | open | Boolean? |  yes  |  |
 | weekday | String? |  yes  |  |
 | opening | [OpeningClosing](#OpeningClosing)? |  yes  |  |

---


 
 
 #### [AddressResponse](#AddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | longitude | Double? |  yes  |  |
 | address1 | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | city | String? |  yes  |  |
 | country | String? |  yes  |  |
 | state | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | landmark | String? |  yes  |  |

---


 
 
 #### [CreatedByResponse](#CreatedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [ModifiedByResponse](#ModifiedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [DocumentsResponse](#DocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |
 | legalName | String? |  yes  |  |

---


 
 
 #### [ContactNumberResponse](#ContactNumberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Integer? |  yes  |  |

---


 
 
 #### [MobileNo](#MobileNo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Integer? |  yes  |  |

---


 
 
 #### [ManagerResponse](#ManagerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |

---


 
 
 #### [WarningsResponse](#WarningsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeAddress | String? |  yes  |  |

---


 
 
 #### [Dp](#Dp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | operations | ArrayList<String>? |  yes  |  |
 | fmPriority | Integer? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | lmPriority | Integer? |  yes  |  |
 | areaCode | Integer? |  yes  |  |
 | transportMode | String? |  yes  |  |
 | externalAccountId | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | rvpPriority | Integer? |  yes  |  |
 | internalAccountId | String? |  yes  |  |

---


 
 
 #### [LogisticsResponse](#LogisticsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | override | Boolean? |  yes  |  |
 | dp | [Dp](#Dp)? |  yes  |  |

---


 
 
 #### [IntegrationTypeResponse](#IntegrationTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String? |  yes  |  |
 | inventory | String? |  yes  |  |

---


 
 
 #### [ProductReturnConfigResponse](#ProductReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [ItemResponse](#ItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstCredentials | [GstCredentialsResponse](#GstCredentialsResponse)? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | stage | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | timing | ArrayList<[TimmingResponse](#TimmingResponse)>? |  yes  |  |
 | address | [AddressResponse](#AddressResponse)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | createdBy | [CreatedByResponse](#CreatedByResponse)? |  yes  |  |
 | verifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | documents | ArrayList<[DocumentsResponse](#DocumentsResponse)>? |  yes  |  |
 | code | String? |  yes  |  |
 | contactNumbers | ArrayList<[ContactNumberResponse](#ContactNumberResponse)>? |  yes  |  |
 | cls | String? |  yes  |  |
 | modifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | company | Integer? |  yes  |  |
 | storeType | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | name | String? |  yes  |  |
 | manager | [ManagerResponse](#ManagerResponse)? |  yes  |  |
 | warnings | [WarningsResponse](#WarningsResponse)? |  yes  |  |
 | logistics | [LogisticsResponse](#LogisticsResponse)? |  yes  |  |
 | subType | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | integrationType | [IntegrationTypeResponse](#IntegrationTypeResponse)? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigResponse](#ProductReturnConfigResponse)? |  yes  |  |

---


 
 
 #### [GetStoresViewResponse](#GetStoresViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [PageResponse](#PageResponse) |  no  |  |
 | items | ArrayList<[ItemResponse](#ItemResponse)>? |  yes  |  |

---


