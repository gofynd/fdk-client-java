



##### [Back to Partner docs](./README.md)

## Logistics Methods
Serviceability API's

Default
* [sampleFileServiceability](#samplefileserviceability)
* [getSampleFileServiceabilityStatus](#getsamplefileserviceabilitystatus)
* [bulkTat](#bulktat)
* [getBulkTat](#getbulktat)
* [bulkServiceability](#bulkserviceability)
* [getBulkServiceability](#getbulkserviceability)
* [createCourierPartnerAccount](#createcourierpartneraccount)
* [getCourierPartnerAccounts](#getcourierpartneraccounts)
* [updateCourierPartnerAccount](#updatecourierpartneraccount)
* [getCourierPartnerAccount](#getcourierpartneraccount)
* [createCourierPartnerScheme](#createcourierpartnerscheme)
* [updateCourierPartnerScheme](#updatecourierpartnerscheme)
* [getCountries](#getcountries)




## Methods with example and description



### sampleFileServiceability
Sample File Download




```java
partnerClient.logistics.sampleFileServiceability( organizationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |  
| body | [BulkRegionServiceabilityTatRequest](#BulkRegionServiceabilityTatRequest) | yes | Request body |


Sample File Download

*Returned Response:*




[BulkRegionServiceabilityTatResponseItemData](#BulkRegionServiceabilityTatResponseItemData)

Success Response Status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getSampleFileServiceabilityStatus
Get Serviceability TAT sample files generator status




```java
partnerClient.logistics.getSampleFileServiceabilityStatus( organizationId,  pageNo,  pageSize,  batchId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| batchId | String? | no | Batch id of the execution |  



Get Serviceability TAT sample file generator status

*Returned Response:*




[BulkRegionServiceabilityTatResponse](#BulkRegionServiceabilityTatResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### bulkTat
Region TAT Import or Export




```java
partnerClient.logistics.bulkTat( organizationId,  extensionId,  schemeId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |  
| body | [BulkRegionJobSerializer](#BulkRegionJobSerializer) | yes | Request body |


Region TAT Import or Export

*Returned Response:*




[BulkRegionResponseItemData](#BulkRegionResponseItemData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkTat
Get region tat bulk history




```java
partnerClient.logistics.getBulkTat( organizationId,  extensionId,  schemeId,  pageNo,  pageSize,  batchId,  action,  status,  country,  region,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| batchId | String? | no | Unique identifier of bulk job |   
| action | String? | no | import or export bulk type |   
| status | String? | no | Status of the bulk actions |   
| country | String? | no | Country for which bulk job is initiated |   
| region | String? | no | Region for which bulk job is initiated |   
| startDate | String? | no | Fetch job history after a particule date |   
| endDate | String? | no | Fetch job history before a particule date |  



Get region tat bulk history

*Returned Response:*




[BulkRegionResponse](#BulkRegionResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### bulkServiceability
Serviceability Import or Export




```java
partnerClient.logistics.bulkServiceability( organizationId,  extensionId,  schemeId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |  
| body | [BulkRegionJobSerializer](#BulkRegionJobSerializer) | yes | Request body |


Serviceability Import or Export

*Returned Response:*




[BulkRegionResponseItemData](#BulkRegionResponseItemData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkServiceability
Get Region Serviceability Bulk History




```java
partnerClient.logistics.getBulkServiceability( organizationId,  extensionId,  schemeId,  pageNo,  pageSize,  batchId,  action,  status,  country,  region,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| batchId | String? | no | Unique identifier of bulk job |   
| action | String? | no | import or export bulk type |   
| status | String? | no | Status of the bulk actions |   
| country | String? | no | Country for which bulk job is initiated |   
| region | String? | no | Region for which bulk job is initiated |   
| startDate | String? | no | Fetch job history after a particule date |   
| endDate | String? | no | Fetch job history before a particule date |  



Get Region Serviceability Bulk History

*Returned Response:*




[BulkRegionResponse](#BulkRegionResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerAccount
Creation of Courier Account




```java
partnerClient.logistics.createCourierPartnerAccount( organizationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [CourierAccount](#CourierAccount) | yes | Request body |


This API Creates a new Courier Account

*Returned Response:*




[CourierAccount](#CourierAccount)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerAccounts
Getting Courier Account list of a company.




```java
partnerClient.logistics.getCourierPartnerAccounts( organizationId,  pageNo,  pageSize,  stage,  paymentMode,  transportType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| stage | String? | no | stage of the account. enabled/disabled |   
| paymentMode | String? | no | Filters dp accounts based on payment mode |   
| transportType | String? | no | Filters dp accounts based on transport_type |  



This API returns Courier Account of a company.

*Returned Response:*




[CompanyCourierPartnerAccountListResponse](#CompanyCourierPartnerAccountListResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierPartnerAccount
Update Courier Account in database.




```java
partnerClient.logistics.updateCourierPartnerAccount( organizationId,  accountId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| accountId | String | yes | Unique ID of courier account |  
| body | [CourierAccount](#CourierAccount) | yes | Request body |


Updates Courier Account

*Returned Response:*




[CourierAccountResponse](#CourierAccountResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerAccount
Getting Courier Account of a company from database.




```java
partnerClient.logistics.getCourierPartnerAccount( organizationId,  accountId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| accountId | String | yes | Unique ID of courier account |  



This API returns response DpAccount of a company from mongo database.

*Returned Response:*




[CourierAccountResponse](#CourierAccountResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerScheme
Create Scheme for courier partner extension




```java
partnerClient.logistics.createCourierPartnerScheme( organizationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |  
| body | [CourierPartnerSchemeModel](#CourierPartnerSchemeModel) | yes | Request body |


Create Scheme for courier partner extension

*Returned Response:*




[CourierPartnerSchemeModel](#CourierPartnerSchemeModel)

Success Response Status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierPartnerScheme
Update Scheme for courier partner extension




```java
partnerClient.logistics.updateCourierPartnerScheme( organizationId,  schemeId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| schemeId | String | yes | Unique Identifier of Scheme |  
| body | [CourierPartnerSchemeUpdateRequest](#CourierPartnerSchemeUpdateRequest) | yes | Request body |


Update Scheme for courier partner extension

*Returned Response:*




[CourierPartnerSchemeUpdateRequest](#CourierPartnerSchemeUpdateRequest)

Success Response Status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCountries
Get all countries and associated data.




```java
partnerClient.logistics.getCountries( organizationId,  onboarding,  pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | Unique Identifier of Organization |   
| onboarding | Boolean? | no | Only fetch countries which allowed for onboard on Platform. |   
| pageNo | Integer? | no | page number. |   
| pageSize | Integer? | no | page size. |   
| q | String? | no | search. |  



Retrieve of all countries.

*Returned Response:*




[GetCountries](#GetCountries)

Successfully retrieved all countries with associated data.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Country List 1</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "INDIA",
        "sub_type": "country",
        "display_name": "India",
        "uid": "64c6ac280000000000000000",
        "iso2": "IN",
        "iso3": "IND",
        "timezones": [
          "Asia/Kolkata"
        ],
        "currency": "INR",
        "phone_code": "+91",
        "hierarchy": [
          {
            "display_name": "State",
            "slug": "state"
          },
          {
            "display_name": "City",
            "slug": "city"
          },
          {
            "display_name": "Pincode",
            "slug": "pincode"
          }
        ]
      },
      {
        "name": "UNITED STATES",
        "sub_type": "country",
        "uid": "66a931280000000000000000",
        "iso2": "US",
        "iso3": "USA",
        "timezones": [
          "America/St_Johns",
          "America/Halifax",
          "America/Glace_Bay",
          "America/Moncton",
          "America/Goose_Bay",
          "America/Blanc-Sablon",
          "America/Toronto",
          "America/Iqaluit",
          "America/Atikokan",
          "America/Winnipeg",
          "America/Resolute",
          "America/Rankin_Inlet",
          "America/Regina",
          "America/Swift_Current",
          "America/Edmonton",
          "America/Cambridge_Bay",
          "America/Inuvik",
          "America/Creston",
          "America/Dawson_Creek",
          "America/Fort_Nelson",
          "America/Whitehorse",
          "America/Dawson",
          "America/Vancouver"
        ],
        "currency": "USD",
        "phone_code": "+1",
        "hierarchy": [
          {
            "display_name": "State",
            "slug": "state"
          },
          {
            "display_name": "City",
            "slug": "city"
          },
          {
            "display_name": "Zipcode",
            "slug": "pincode"
          }
        ]
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 2,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

<details>
<summary><i>&nbsp; Country List 2</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "United Arab Emirates",
        "display_name": "United Arab Emirates",
        "sub_type": "country",
        "uid": "669ea5280000000000000000",
        "iso2": "AE",
        "iso3": "ARE",
        "timezones": [
          "Asia/Dubai"
        ],
        "currency": "DIR",
        "phone_code": "+971",
        "hierarchy": [
          {
            "display_name": "City",
            "slug": "city"
          },
          {
            "display_name": "Area",
            "slug": "sector"
          }
        ]
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 1,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---




### Schemas

 
 
 #### [BulkRegionServiceabilityTatRequest](#BulkRegionServiceabilityTatRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | region | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [BulkRegionServiceabilityTatResponseItemData](#BulkRegionServiceabilityTatResponseItemData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | region | String? |  yes  |  |
 | type | String? |  yes  |  |
 | batchId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | filePath | String? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | message | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [FailureResponse](#FailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [BulkRegionServiceabilityTatResponse](#BulkRegionServiceabilityTatResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkRegionServiceabilityTatResponseItemData](#BulkRegionServiceabilityTatResponseItemData)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer? |  yes  | Current page number |
 | hasNext | Boolean? |  yes  | Next page available |
 | hasPrevious | Boolean? |  yes  | Previous page available |
 | itemTotal | Integer? |  yes  | total records |
 | size | Integer? |  yes  | Current page size |

---


 
 
 #### [BulkRegionJobSerializer](#BulkRegionJobSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filePath | String? |  yes  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |
 | region | String |  no  |  |

---


 
 
 #### [BulkRegionResponseItemData](#BulkRegionResponseItemData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filePath | String |  no  |  |
 | failed | Integer? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | action | String |  no  |  |
 | batchId | String |  no  |  |
 | country | String |  no  |  |
 | success | Integer? |  yes  |  |
 | region | String |  no  |  |
 | status | String |  no  |  |
 | total | Integer? |  yes  |  |
 | errorFilePath | String? |  yes  |  |

---


 
 
 #### [BulkRegionResponse](#BulkRegionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkRegionResponseItemData](#BulkRegionResponseItemData)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CourierAccount](#CourierAccount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | accountId | String |  no  |  |
 | schemeId | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | stage | String |  no  |  |
 | isOwnAccount | Boolean |  no  |  |

---


 
 
 #### [CourierPartnerAccountFailureResponse](#CourierPartnerAccountFailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [CompanyCourierPartnerAccountListResponse](#CompanyCourierPartnerAccountListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CourierAccountResponse](#CourierAccountResponse)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CourierAccountResponse](#CourierAccountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | accountId | String |  no  |  |
 | schemeId | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |
 | stage | String |  no  |  |
 | isOwnAccount | Boolean |  no  |  |
 | schemeRules | [CourierPartnerSchemeModel](#CourierPartnerSchemeModel) |  no  |  |

---


 
 
 #### [CourierPartnerSchemeModel](#CourierPartnerSchemeModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | schemeId | String |  no  |  |
 | name | String |  no  |  |
 | weight | [ArithmeticOperations](#ArithmeticOperations) |  no  |  |
 | transportType | String |  no  |  |
 | region | String |  no  |  |
 | deliveryType | String |  no  |  |
 | paymentMode | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | feature | [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures) |  no  |  |

---


 
 
 #### [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | doorstepQc | Boolean? |  yes  |  |
 | qr | Boolean? |  yes  |  |
 | mps | Boolean? |  yes  |  |
 | ndr | Boolean? |  yes  |  |
 | ndrAttempts | Integer? |  yes  |  |
 | dangerousGoods | Boolean? |  yes  |  |
 | fragileGoods | Boolean? |  yes  |  |
 | restrictedGoods | Boolean? |  yes  |  |
 | coldStorageGoods | Boolean? |  yes  |  |
 | doorstepExchange | Boolean? |  yes  |  |
 | doorstepReturn | Boolean? |  yes  |  |
 | productInstallation | Boolean? |  yes  |  |
 | openboxDelivery | Boolean? |  yes  |  |
 | statusUpdates | String? |  yes  |  |
 | multiPickSingleDrop | Boolean? |  yes  |  |
 | singlePickMultiDrop | Boolean? |  yes  |  |
 | multiPickMultiDrop | Boolean? |  yes  |  |
 | ewaybill | Boolean? |  yes  |  |

---


 
 
 #### [ArithmeticOperations](#ArithmeticOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lt | Integer? |  yes  |  |
 | gt | Integer? |  yes  |  |
 | lte | Integer? |  yes  |  |
 | gte | Integer? |  yes  |  |

---


 
 
 #### [CourierPartnerSchemeUpdateRequest](#CourierPartnerSchemeUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | weight | [ArithmeticOperations](#ArithmeticOperations) |  no  |  |
 | transportType | String |  no  |  |
 | region | String |  no  |  |
 | deliveryType | String |  no  |  |
 | paymentMode | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | feature | [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures) |  no  |  |

---


 
 
 #### [GetCountries](#GetCountries)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetCountriesItems](#GetCountriesItems)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [GetCountriesItems](#GetCountriesItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | iso2 | String? |  yes  |  |
 | iso3 | String? |  yes  |  |
 | timezones | ArrayList<String>? |  yes  |  |
 | hierarchy | ArrayList<[HierarchyItems](#HierarchyItems)>? |  yes  |  |
 | phoneCode | String? |  yes  |  |
 | currency | String? |  yes  |  |
 | type | String? |  yes  |  |
 | latitude | String? |  yes  |  |
 | longitude | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [HierarchyItems](#HierarchyItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String? |  yes  |  |
 | slug | String? |  yes  |  |

---



