



##### [Back to Platform docs](./README.md)

## Serviceability Methods
Logistics Configuration API's allows you to configure zone, application logistics and many more useful features. 

Default
* [getZones](#getzones)
* [createZone](#createzone)
* [updateZoneById](#updatezonebyid)
* [getZoneById](#getzonebyid)
* [getAllStores](#getallstores)
* [getOptimalLocations](#getoptimallocations)
* [updatePincodeMopView](#updatepincodemopview)
* [updatePincodeBulkView](#updatepincodebulkview)
* [updatePincodeCoDListing](#updatepincodecodlisting)
* [updatePincodeAuditHistory](#updatepincodeaudithistory)
* [createCourierPartnerAccount](#createcourierpartneraccount)
* [getCourierPartnerAccounts](#getcourierpartneraccounts)
* [updateCourierPartnerAccount](#updatecourierpartneraccount)
* [getCourierPartnerAccount](#getcourierpartneraccount)
* [updateCourierRule](#updatecourierrule)
* [getCourierPartnerRule](#getcourierpartnerrule)
* [createCourierPartnerRule](#createcourierpartnerrule)
* [getCourierPartnerRules](#getcourierpartnerrules)
* [updateCompanyConfiguration](#updatecompanyconfiguration)
* [getCompanyConfiguration](#getcompanyconfiguration)
* [updateApplicationConfiguration](#updateapplicationconfiguration)
* [getApplicationConfiguration](#getapplicationconfiguration)
* [bulkTat](#bulktat)
* [getBulkTat](#getbulktat)
* [patchApplicationServiceabilitySelfShipment](#patchapplicationserviceabilityselfshipment)
* [getApplicationServiceabilitySelfShipment](#getapplicationserviceabilityselfshipment)
* [getApplicationConfig](#getapplicationconfig)
* [insertApplicationConfig](#insertapplicationconfig)
* [updateStoreRulesConfig](#updatestorerulesconfig)
* [getStoreRules](#getstorerules)
* [createStoreRules](#createstorerules)
* [getStoreRule](#getstorerule)
* [updateStoreRules](#updatestorerules)
* [bulkServiceability](#bulkserviceability)
* [getBulkServiceability](#getbulkserviceability)
* [getServiceability](#getserviceability)
* [updateServiceability](#updateserviceability)
* [createPackageMaterial](#createpackagematerial)
* [getPackageMaterialList](#getpackagemateriallist)
* [createPackageMaterialRule](#createpackagematerialrule)
* [getPackageMaterialRules](#getpackagematerialrules)
* [updatePackageMaterialRule](#updatepackagematerialrule)
* [getPackageMaterialRule](#getpackagematerialrule)
* [updatePackageMaterials](#updatepackagematerials)
* [getPackageMaterials](#getpackagematerials)
* [updateCourierPartnerRulePriority](#updatecourierpartnerrulepriority)




## Methods with example and description



### getZones
Shows zones defined at the company level




```java
platformClient.serviceability.getZones( pageNo,  pageSize,  isActive,  channelId,  q,  country,  state,  city,  pincode,  sector) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| isActive | Boolean? | no | Status of Zone (either active or inactive) |   
| channelId | String? | no | Zones filtered by an application |   
| q | String? | no | search with name as a free text |   
| country | String? | no | ISO2 code of the country |   
| state | String? | no | State name |   
| city | String? | no | City name |   
| pincode | String? | no | Pincode value to search zones |   
| sector | String? | no | Sector value to search zones |  



Return the list of zones that are defined at the company level.

*Returned Response:*




[ListViewResponse](#ListViewResponse)

Zone List of application in descending order of their last modified date.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Zone Listing with q=zone</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "company2 zone",
        "slug": "company2-zone",
        "company_id": 2,
        "is_active": true,
        "channels": [
          {
            "channel_id": "64c22ef872985245a6334afa",
            "channel_type": "application"
          }
        ],
        "zone_id": "64c3a0926ea670363c8e2e3d",
        "stores_count": 2,
        "regions_count": 4242
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### createZone
Creates a new Zone




```java
platformClient.serviceability.createZone(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [CreateZoneData](#CreateZoneData) | yes | Request body |


Creates a new zone with the specified mapping. A zone enables serviceability based on given regions. By creating a zone and including specific regions, you can ensure that the stores associated with the zone are serviceable for those added regions. This functionality is particularly useful when you need to ensure serviceability for multiple regions by grouping them into a single zone.

*Returned Response:*




[ZoneResponse](#ZoneResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "status_code": 200,
  "zone_id": "64809f27f2b8f575d5cb9c56"
}
```
</details>









---


### updateZoneById
Update details of a Zone




```java
platformClient.serviceability.updateZoneById( zoneId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  
| body | [UpdateZoneData](#UpdateZoneData) | yes | Request body |


Updates the region, application, store mapping and other details in the Zone.

*Returned Response:*




[ZoneSuccessResponse](#ZoneSuccessResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getZoneById
Get details of the Zone




```java
platformClient.serviceability.getZoneById( zoneId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  



Returns the region, application, store mapping and other details in the Zone.

*Returned Response:*




[GetZoneByIdSchema](#GetZoneByIdSchema)

Get details of the Zone




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Gujarat Zone</i></summary>

```json
{
  "value": {
    "name": "Test Zone",
    "slug": "test-zone",
    "is_active": false,
    "channels": [
      {
        "channel_id": "64aed475db2cfb5b8a9f623d",
        "channel_type": "application"
      },
      {
        "channel_id": "64ba6650932a416fb67557fa",
        "channel_type": "application"
      }
    ],
    "product": {
      "type": "all",
      "tags": []
    },
    "store_ids": [
      2,
      1462,
      3470,
      3471,
      3475,
      3742,
      3748,
      3751,
      3752,
      3753
    ],
    "region_type": "non-pincode",
    "mapping": [
      {
        "country": "64aec5a93a079bd328537835",
        "regions": [
          "64aec5a93a079bd328537838"
        ]
      }
    ],
    "zone_id": "64d22858f8aafe61d79f07ea",
    "stores_count": 10,
    "display_name_mapping": {
      "64aec5a93a079bd328537835": "India",
      "64aec5a93a079bd328537838": "GUJARAT"
    }
  }
}
```
</details>

</details>









---


### getAllStores
GET stores data




```java
platformClient.serviceability.getAllStores() {
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


### getOptimalLocations
Get serviceable store of the item




```java
platformClient.serviceability.getOptimalLocations(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [ReAssignStoreRequest](#ReAssignStoreRequest) | yes | Request body |


This API returns serviceable store of the item.

*Returned Response:*




[ReAssignStoreResponse](#ReAssignStoreResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeMopView
PincodeView update of MOP.




```java
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeMopView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [PincodeMopData](#PincodeMopData) | yes | Request body |


This API updates Pincode method of payment.

*Returned Response:*




[PincodeMOPresponse](#PincodeMOPresponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeBulkView
Bulk Update of pincode in the application.




```java
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeBulkView(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [PincodeMopBulkData](#PincodeMopBulkData) | yes | Request body |


This API constructs bulk write operations to update the MOP data for each pincode in the payload.

*Returned Response:*




[PincodeBulkViewResponse](#PincodeBulkViewResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "batch_id": "string",
  "s3_url": "string"
}
```
</details>









---


### updatePincodeCoDListing
Pincode count view of application.




```java
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeCoDListing(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [PincodeCodStatusListingRequest](#PincodeCodStatusListingRequest) | yes | Request body |


This API returns count of active pincode.

*Returned Response:*




[PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePincodeAuditHistory
Auditlog configuration of application.




```java
platformClient.application("<APPLICATION_ID>").serviceability.updatePincodeAuditHistory(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [PincodeMopUpdateAuditHistoryRequest](#PincodeMopUpdateAuditHistoryRequest) | yes | Request body |


This API returns Audit logs of Pincode.

*Returned Response:*




[PincodeMopUpdateAuditHistoryResponseData](#PincodeMopUpdateAuditHistoryResponseData)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerAccount
Creation of Courier Account




```java
platformClient.serviceability.createCourierPartnerAccount(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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
platformClient.serviceability.getCourierPartnerAccounts( pageNo,  pageSize,  stage,  paymentMode,  transportType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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
platformClient.serviceability.updateCourierPartnerAccount( accountId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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
platformClient.serviceability.getCourierPartnerAccount( accountId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
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


### updateCourierRule
Updating of Courier Rule.




```java
platformClient.application("<APPLICATION_ID>").serviceability.updateCourierRule( ruleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | Unique Identifier of sales channel |   
| ruleId | String | yes | A `rule_id` is a unique identifier for a particular Dp. |  
| body | [CourierPartnerRule](#CourierPartnerRule) | yes | Request body |


This API updates and returns Courier Rule.

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerRule
Fetch of Courier Rule.




```java
platformClient.application("<APPLICATION_ID>").serviceability.getCourierPartnerRule( ruleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | Unique Identifier of sales channel |   
| ruleId | String | yes | A `rule_id` is a unique identifier for a rule. |  



This API returns Courier Rule.

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createCourierPartnerRule
Create Courier Rules.




```java
platformClient.application("<APPLICATION_ID>").serviceability.createCourierPartnerRule(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | Unique Identifier of sales channel |  
| body | [CourierPartnerRule](#CourierPartnerRule) | yes | Request body |


Creates Courier Rules with rule configuration and dp priority

*Returned Response:*




[CourierPartnerRule](#CourierPartnerRule)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCourierPartnerRules
Fetch Courier Rules List




```java
platformClient.application("<APPLICATION_ID>").serviceability.getCourierPartnerRules( pageNo,  pageSize,  status) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | Unique Identifier of sales channel |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| status | String? | no | Filter rules based on rule status |  



This API returns Courier Rules List

*Returned Response:*




[CourierPartnerRulesListResponse](#CourierPartnerRulesListResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCompanyConfiguration
Apply Courier Rule to company.




```java
platformClient.serviceability.updateCompanyConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  
| body | [CompanyConfig](#CompanyConfig) | yes | Request body |


Apply Courier Rule to company with rules priority

*Returned Response:*




[CompanyConfig](#CompanyConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getCompanyConfiguration
Get All Courier Rules applied to company.




```java
platformClient.serviceability.getCompanyConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |  



This API returns all Courier Rules applied for company.

*Returned Response:*




[CompanyConfig](#CompanyConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateApplicationConfiguration
Apply configuration to an application




```java
platformClient.application("<APPLICATION_ID>").serviceability.updateApplicationConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier of company. |   
| applicationId | String | yes | A `application_id` is a unique identifier of sales channel. |  
| body | [ApplicationConfig](#ApplicationConfig) | yes | Request body |


Apply configuration to application to set DP rules and Zone configuration

*Returned Response:*




[ApplicationConfig](#ApplicationConfig)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getApplicationConfiguration
Get All Courier Rules applied to application




```java
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier of company. |   
| applicationId | String | yes | A `application_id` is a unique identifier of a sales channel. |  



This API returns all the Courier Rules applied to an application

*Returned Response:*




[ApplicationConfig](#ApplicationConfig)

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
platformClient.serviceability.bulkTat( extensionId,  schemeId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
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
platformClient.serviceability.getBulkTat( extensionId,  schemeId,  pageNo,  pageSize,  batchId,  action,  status,  country,  region,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
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


### patchApplicationServiceabilitySelfShipment
Self-ship configuration of application.




```java
platformClient.application("<APPLICATION_ID>").serviceability.patchApplicationServiceabilitySelfShipment(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [SelfShipResponse](#SelfShipResponse) | yes | Request body |


This API updates Self-ship configuration of the application.

*Returned Response:*




[ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "is_active": true,
    "tat": 3
  },
  "success": true,
  "error": {
    "type": "",
    "value": "",
    "message": ""
  }
}
```
</details>









---


### getApplicationServiceabilitySelfShipment
Self-ship configuration of application.




```java
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationServiceabilitySelfShipment() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This API returns Self-ship configuration of the application.

*Returned Response:*




[ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

Response Data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "is_active": true,
    "tat": 3
  },
  "success": true,
  "error": {
    "type": "",
    "value": "",
    "message": ""
  }
}
```
</details>









---


### getApplicationConfig
Get Application Configuration




```java
platformClient.application("<APPLICATION_ID>").serviceability.getApplicationConfig() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |  



Get Application Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### insertApplicationConfig
Insert Application Configuration




```java
platformClient.application("<APPLICATION_ID>").serviceability.insertApplicationConfig(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |  
| body | [StoreRuleConfigData](#StoreRuleConfigData) | yes | Request body |


Insert Application Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateStoreRulesConfig
Update Store Rule Configuration




```java
platformClient.application("<APPLICATION_ID>").serviceability.updateStoreRulesConfig(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |  
| body | [StoreRuleConfigData](#StoreRuleConfigData) | yes | Request body |


Update Store Rule Configuration

*Returned Response:*




[StoreRuleConfigData](#StoreRuleConfigData)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStoreRules
Get Multiple Store Rules




```java
platformClient.application("<APPLICATION_ID>").serviceability.getStoreRules( pageNo,  pageSize,  status) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| status | String? | no |  |  



Get Multiple Store Rules

*Returned Response:*




[GetStoreRulesApiResponse](#GetStoreRulesApiResponse)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createStoreRules
Create Store Rule




```java
platformClient.application("<APPLICATION_ID>").serviceability.createStoreRules(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |  
| body | [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema) | yes | Request body |


Create Store Rule

*Returned Response:*




[StoreRuleResponseSchema](#StoreRuleResponseSchema)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStoreRule
Get Single Store Rule




```java
platformClient.application("<APPLICATION_ID>").serviceability.getStoreRule( ruleUid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |   
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular rule object. |  



Get Single Store Rule

*Returned Response:*




[StoreRuleDataSchema](#StoreRuleDataSchema)

Successful Response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateStoreRules
Update Store Rule




```java
platformClient.application("<APPLICATION_ID>").serviceability.updateStoreRules( ruleUid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |   
| ruleUid | String | yes | A `rule_uid` is a unique identifier for a particular rule object. |  
| body | [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema) | yes | Request body |


Update Store Rule

*Returned Response:*




[StoreRuleUpdateResponseSchema](#StoreRuleUpdateResponseSchema)

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
platformClient.serviceability.bulkServiceability( extensionId,  schemeId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
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
platformClient.serviceability.getBulkServiceability( extensionId,  schemeId,  pageNo,  pageSize,  batchId,  action,  status,  country,  region,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
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


### getServiceability
Get Serviceability of a region




```java
platformClient.serviceability.getServiceability( extensionId,  schemeId,  regionId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| regionId | String | yes | Unique identifier of a region |  



Get Serviceability of a region

*Returned Response:*




[ServiceabilityModel](#ServiceabilityModel)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateServiceability
Serviceability Update for a region




```java
platformClient.serviceability.updateServiceability( extensionId,  schemeId,  regionId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| extensionId | String | yes | Unique Identifier of CP Extension |   
| schemeId | String | yes | Unique identifier of a scheme |   
| regionId | String | yes | Unique identifier of a region |  
| body | [ServiceabilityModel](#ServiceabilityModel) | yes | Request body |


Serviceability Update for a region

*Returned Response:*




[ServiceabilityModel](#ServiceabilityModel)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createPackageMaterial
Upsert of PackageMaterial in database.




```java
platformClient.serviceability.createPackageMaterial(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller. |  
| body | [PackageMaterial](#PackageMaterial) | yes | Request body |


This API returns response of upsert of PackageMaterial in mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterial</i></summary>

```json
{
  "value": {
    "id": "64b8526e5ca47d41582b9fa1",
    "name": "Package1",
    "item_id": 1234,
    "company_id": 1,
    "length": 1,
    "height": 1,
    "width": 1,
    "weight": 1,
    "error_rate": 0,
    "store_ids": [
      1,
      9,
      5
    ],
    "rules": [
      {
        "rule_id": "64b4337a0c607fbfbcd0156b",
        "quantity": {
          "min": 1,
          "max": 2
        },
        "weight": 100
      }
    ],
    "channels": [
      {
        "id": "64b4337a0c607fbfbcd0190b",
        "type": "application"
      }
    ],
    "media": [
      "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
    ],
    "package_type": "box",
    "size": "small",
    "status": "active",
    "track_inventory": false,
    "max_weight": 100,
    "package_vol_weight": 100,
    "auto_calculate": true
  }
}
```
</details>

</details>









---


### getPackageMaterialList
Fetching of PackageMaterials from database.




```java
platformClient.serviceability.getPackageMaterialList( pageNo,  pageSize,  q,  size,  packageType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| q | String? | no | perform regex search on items matching name for given value |   
| size | String? | no | filters items based on given size |   
| packageType | String? | no | filters items based on given package_type |  



This API returns response of PackageMaterials from mongo database.

*Returned Response:*




[PackageMaterialList](#PackageMaterialList)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterialList</i></summary>

```json
{
  "value": {
    "items": [
      {
        "id": "64b8526e5ca47d41582b9fa1",
        "name": "Package1",
        "item_id": 1234,
        "company_id": 1,
        "length": 1,
        "height": 1,
        "width": 1,
        "weight": 1,
        "error_rate": 0,
        "store_ids": [
          1,
          9,
          5
        ],
        "rules": [
          {
            "rule_id": "64b4337a0c607fbfbcd0156b",
            "quantity": {
              "min": 1,
              "max": 2
            },
            "weight": 100
          }
        ],
        "channels": [
          {
            "id": "64b4337a0c607fbfbcd0190b",
            "type": "application"
          }
        ],
        "media": [
          "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
        ],
        "package_type": "box",
        "size": "small",
        "status": "active",
        "track_inventory": true,
        "max_weight": 100,
        "package_vol_weight": 100,
        "auto_calculate": true
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### createPackageMaterialRule
Upsert of Package Material Rule in database.




```java
platformClient.serviceability.createPackageMaterialRule(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller. |  
| body | [PackageRule](#PackageRule) | yes | Request body |


This API returns response of upsert of Package Material Rule in mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### getPackageMaterialRules
Fetching of Package Material Rules from database.




```java
platformClient.serviceability.getPackageMaterialRules( pageNo,  pageSize,  isActive) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | index of the item to start returning with |   
| pageSize | Integer? | no | determines the items to be displayed in a page |   
| isActive | String? | no | filters items based on given is_active |  



This API returns response of Package Materials Rules from mongo database.

*Returned Response:*




[PackageMaterialRuleList](#PackageMaterialRuleList)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterialRuleList</i></summary>

```json
{
  "value": {
    "items": [
      {
        "id": "64b4337a0c607fbfbcd0156b",
        "company_id": 1,
        "name": "Rule For Dev Contract",
        "category_id": {
          "includes": [
            1,
            2
          ]
        },
        "product_tag": {
          "includes": [
            "abc",
            "xyz"
          ]
        },
        "product_id": {
          "includes": [
            1,
            2
          ]
        },
        "type": "package",
        "is_active": true
      }
    ],
    "page": {
      "type": "number",
      "size": 1,
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### updatePackageMaterialRule
Fetching of Package Material Rules into database.




```java
platformClient.serviceability.updatePackageMaterialRule( ruleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller. |   
| ruleId | String | yes | A `package_material_rule_id` is a unique identifier for a Package Material Rule |  
| body | [PackageRule](#PackageRule) | yes | Request body |


This API updates Package Material Rules into mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### getPackageMaterialRule
Fetching of Package Material from database.




```java
platformClient.serviceability.getPackageMaterialRule( ruleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| ruleId | String | yes | A `package_material_rule_id` is a unique identifier for a Package Material Rule |  



This API returns response of Package Material from mongo database.

*Returned Response:*




[PackageRuleResponse](#PackageRuleResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageRule</i></summary>

```json
{
  "value": {
    "id": "64b4337a0c607fbfbcd0156b",
    "company_id": 1,
    "name": "Rule For Dev Contract",
    "category_id": {
      "includes": [
        1,
        2
      ]
    },
    "product_tag": {
      "includes": [
        "abc",
        "xyz"
      ]
    },
    "product_id": {
      "includes": [
        1,
        2
      ]
    },
    "type": "package",
    "is_active": true
  }
}
```
</details>

</details>









---


### updatePackageMaterials
Update Package Material to database.




```java
platformClient.serviceability.updatePackageMaterials( packageMaterialId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller. |   
| packageMaterialId | String | yes | A `package_material_id` is a unique identifier for a Package Material |  
| body | [PackageMaterial](#PackageMaterial) | yes | Request body |


This API updates Package Materials from into mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; PackageMaterial</i></summary>

```json
{
  "value": {
    "id": "64b8526e5ca47d41582b9fa1",
    "name": "Package1",
    "item_id": 1234,
    "company_id": 1,
    "length": 1,
    "height": 1,
    "width": 1,
    "weight": 1,
    "error_rate": 0,
    "store_ids": [
      1,
      9,
      5
    ],
    "rules": [
      {
        "rule_id": "64b4337a0c607fbfbcd0156b",
        "quantity": {
          "min": 1,
          "max": 2
        },
        "weight": 100
      }
    ],
    "channels": [
      {
        "id": "64b4337a0c607fbfbcd0190b",
        "type": "application"
      }
    ],
    "media": [
      "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/sandeepmaale/products/pictures/bundle/free/original/LOc5XW0cc-Logo.png"
    ],
    "package_type": "box",
    "size": "small",
    "status": "active",
    "track_inventory": false,
    "max_weight": 100,
    "package_vol_weight": 100,
    "auto_calculate": true
  }
}
```
</details>

</details>









---


### getPackageMaterials
Fetching of Package Material from database.




```java
platformClient.serviceability.getPackageMaterials( packageMaterialId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| packageMaterialId | String | yes | A `package_material_id` is a unique identifier for a Package Material |  



This API returns response of Package Material from mongo database.

*Returned Response:*




[PackageMaterialResponse](#PackageMaterialResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateCourierPartnerRulePriority
Updates Courier Partner Rules Priority for a sales channel




```java
platformClient.application("<APPLICATION_ID>").serviceability.updateCourierPartnerRulePriority(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular sale channel. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular application channel. |  
| body | [RulePriorityRequest](#RulePriorityRequest) | yes | Request body |


Updates Courier Partner Rules Priority for a sales channel

*Returned Response:*




[RulePriorityResponse](#RulePriorityResponse)

Response status_code




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---




### Schemas

 
 
 #### [UpdateZoneConfigRequest](#UpdateZoneConfigRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String? |  yes  |  |

---


 
 
 #### [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | value | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | serviceabilityType | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ApplicationServiceabilityConfigResponse](#ApplicationServiceabilityConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | data | [ApplicationServiceabilityConfig](#ApplicationServiceabilityConfig)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [EntityRegionView_Request](#EntityRegionView_Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | ArrayList<String> |  no  |  |
 | parentId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [EntityRegionView_Error](#EntityRegionView_Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [EntityRegionView_page](#EntityRegionView_page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [getAppRegionZonesResponse](#getAppRegionZonesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[PageSchema](#PageSchema)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [PageSchema](#PageSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [EntityRegionView_Items](#EntityRegionView_Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | subType | String |  no  |  |
 | uid | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [EntityRegionView_Response](#EntityRegionView_Response)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [EntityRegionView_Error](#EntityRegionView_Error) |  no  |  |
 | page | [EntityRegionView_page](#EntityRegionView_page) |  no  |  |
 | data | ArrayList<[EntityRegionView_Items](#EntityRegionView_Items)> |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ListViewSummary](#ListViewSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalZones | Integer |  no  |  |
 | totalPincodesServed | Integer |  no  |  |
 | totalActiveZones | Integer |  no  |  |

---


 
 
 #### [ZoneDataItem](#ZoneDataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewProduct](#ListViewProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ListViewChannels](#ListViewChannels)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channelId | String |  no  |  |
 | channelType | String |  no  |  |

---


 
 
 #### [ListViewItems](#ListViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | storesCount | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | regionsCount | Integer |  no  |  |
 | companyId | Integer |  no  |  |
 | channels | ArrayList<[ListViewChannels](#ListViewChannels)> |  no  |  |

---


 
 
 #### [ListViewResponse](#ListViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ZoneDataItem](#ZoneDataItem) |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [CompanyStoreView_PageItems](#CompanyStoreView_PageItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |

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
 | channelId | String |  no  |  |
 | channelType | String |  no  |  |

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
 | country | String |  no  |  |
 | pincode | ArrayList<String>? |  yes  |  |
 | state | ArrayList<String>? |  yes  |  |

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
 | statusCode | Integer |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneDataViewItems](#GetZoneDataViewItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String? |  yes  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Integer |  no  |  |

---


 
 
 #### [GetSingleZoneDataViewResponse](#GetSingleZoneDataViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [GetZoneDataViewItems](#GetZoneDataViewItems) |  no  |  |

---


 
 
 #### [GetZoneByIdSchema](#GetZoneByIdSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | product | [ZoneProductTypes](#ZoneProductTypes) |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |
 | storesCount | Integer |  no  |  |

---


 
 
 #### [CreateZoneData](#CreateZoneData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | channels | ArrayList<[GetZoneDataViewChannels](#GetZoneDataViewChannels)> |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | regionType | String |  no  |  |
 | mapping | ArrayList<[ZoneMappingType](#ZoneMappingType)> |  no  |  |
 | assignmentPreference | String? |  yes  |  |

---


 
 
 #### [ZoneResponse](#ZoneResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | Integer |  no  |  |
 | zoneId | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewRequest](#GetZoneFromPincodeViewRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [Zone](#Zone)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | zoneId | String |  no  |  |
 | type | String |  no  |  |
 | name | String |  no  |  |
 | tags | ArrayList<String> |  no  |  |
 | slug | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | assignmentPreference | String |  no  |  |

---


 
 
 #### [GetZoneFromPincodeViewResponse](#GetZoneFromPincodeViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String |  no  |  |
 | zones | ArrayList<[Zone](#Zone)> |  no  |  |

---


 
 
 #### [GetZoneFromApplicationIdViewResponse](#GetZoneFromApplicationIdViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | ArrayList<[ZoneDataItem](#ZoneDataItem)> |  no  |  |
 | items | ArrayList<[ListViewItems](#ListViewItems)> |  no  |  |

---


 
 
 #### [ServiceabilityPageResponse](#ServiceabilityPageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | size | Integer? |  yes  |  |
 | current | Integer? |  yes  |  |

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
 | email | String? |  yes  |  |
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ModifiedByResponse](#ModifiedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [IntegrationTypeResponse](#IntegrationTypeResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String? |  yes  |  |
 | order | String? |  yes  |  |

---


 
 
 #### [ProductReturnConfigResponse](#ProductReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [ContactNumberResponse](#ContactNumberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | number | String? |  yes  |  |
 | countryCode | Integer? |  yes  |  |

---


 
 
 #### [AddressResponse](#AddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | address2 | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | state | String? |  yes  |  |
 | country | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | longitude | Double? |  yes  |  |

---


 
 
 #### [CreatedByResponse](#CreatedByResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

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


 
 
 #### [WarningsResponse](#WarningsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeAddress | String? |  yes  |  |

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
 | open | Boolean? |  yes  |  |
 | weekday | String? |  yes  |  |
 | closing | [OpeningClosing](#OpeningClosing)? |  yes  |  |
 | opening | [OpeningClosing](#OpeningClosing)? |  yes  |  |

---


 
 
 #### [DocumentsResponse](#DocumentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | legalName | String? |  yes  |  |
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [Dp](#Dp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fmPriority | Integer? |  yes  |  |
 | rvpPriority | Integer? |  yes  |  |
 | lmPriority | Integer? |  yes  |  |
 | internalAccountId | String? |  yes  |  |
 | areaCode | Integer? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | operations | ArrayList<String>? |  yes  |  |
 | externalAccountId | String? |  yes  |  |
 | transportMode | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |

---


 
 
 #### [LogisticsResponse](#LogisticsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | override | Boolean? |  yes  |  |
 | dp | [Dp](#Dp)? |  yes  |  |

---


 
 
 #### [ItemResponse](#ItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | manager | [ManagerResponse](#ManagerResponse)? |  yes  |  |
 | modifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | integrationType | [IntegrationTypeResponse](#IntegrationTypeResponse)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigResponse](#ProductReturnConfigResponse)? |  yes  |  |
 | contactNumbers | ArrayList<[ContactNumberResponse](#ContactNumberResponse)>? |  yes  |  |
 | verifiedBy | [ModifiedByResponse](#ModifiedByResponse)? |  yes  |  |
 | stage | String? |  yes  |  |
 | address | [AddressResponse](#AddressResponse)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [CreatedByResponse](#CreatedByResponse)? |  yes  |  |
 | gstCredentials | [GstCredentialsResponse](#GstCredentialsResponse)? |  yes  |  |
 | displayName | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | code | String? |  yes  |  |
 | warnings | [WarningsResponse](#WarningsResponse)? |  yes  |  |
 | name | String? |  yes  |  |
 | timing | ArrayList<[TimmingResponse](#TimmingResponse)>? |  yes  |  |
 | documents | ArrayList<[DocumentsResponse](#DocumentsResponse)>? |  yes  |  |
 | storeType | String? |  yes  |  |
 | subType | String? |  yes  |  |
 | company | Integer? |  yes  |  |
 | cls | String? |  yes  |  |
 | logistics | [LogisticsResponse](#LogisticsResponse)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetStoresViewResponse](#GetStoresViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ServiceabilityPageResponse](#ServiceabilityPageResponse) |  no  |  |
 | items | ArrayList<[ItemResponse](#ItemResponse)>? |  yes  |  |

---


 
 
 #### [ReAssignStoreRequest](#ReAssignStoreRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toPincode | String |  no  |  |
 | identifier | String |  no  |  |
 | configuration | HashMap<String,Object> |  no  |  |
 | ignoredLocations | ArrayList<String> |  no  |  |
 | articles | ArrayList<HashMap<String,Object>> |  no  |  |

---


 
 
 #### [ReAssignStoreResponse](#ReAssignStoreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | toPincode | String |  no  |  |
 | success | Boolean |  no  |  |
 | error | HashMap<String,Object> |  no  |  |
 | articles | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [PincodeMopData](#PincodeMopData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincodes | ArrayList<Integer> |  no  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [PincodeMopUpdateResponse](#PincodeMopUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Integer |  no  |  |
 | channelId | String |  no  |  |
 | country | String |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [PincodeMOPresponse](#PincodeMOPresponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | statusCode | Integer |  no  |  |
 | batchId | String |  no  |  |
 | country | String |  no  |  |
 | action | String |  no  |  |
 | pincodes | ArrayList<Integer>? |  yes  |  |
 | updatedPincodes | ArrayList<[PincodeMopUpdateResponse](#PincodeMopUpdateResponse)>? |  yes  |  |

---


 
 
 #### [CommonError](#CommonError)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statusCode | String? |  yes  |  |
 | error | Object? |  yes  |  |
 | success | String? |  yes  |  |

---


 
 
 #### [PincodeMopBulkData](#PincodeMopBulkData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | s3Url | String |  no  |  |

---


 
 
 #### [PincodeBulkViewResponse](#PincodeBulkViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | s3Url | String |  no  |  |

---


 
 
 #### [PincodeCodStatusListingRequest](#PincodeCodStatusListingRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | current | Integer? |  yes  |  |
 | pageSize | Integer? |  yes  |  |

---


 
 
 #### [PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | data | ArrayList<[PincodeCodStatusListingResponse](#PincodeCodStatusListingResponse)> |  no  |  |
 | success | Boolean |  no  |  |
 | errors | ArrayList<[Error](#Error)>? |  yes  |  |
 | page | [PincodeCodStatusListingPage](#PincodeCodStatusListingPage) |  no  |  |
 | summary | [PincodeCodStatusListingSummary](#PincodeCodStatusListingSummary) |  no  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [PincodeCodStatusListingPage](#PincodeCodStatusListingPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [PincodeCodStatusListingSummary](#PincodeCodStatusListingSummary)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalActivePincodes | Integer |  no  |  |
 | totalInactivePincodes | Integer |  no  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryRequest](#PincodeMopUpdateAuditHistoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String |  no  |  |
 | fileName | String? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryPaging](#PincodeMopUpdateAuditHistoryPaging)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | size | Integer? |  yes  |  |
 | current | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryResponse](#PincodeMopUpdateAuditHistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |
 | entityType | String? |  yes  |  |
 | errorFileS3Url | String? |  yes  |  |
 | s3Url | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | updatedBy | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [PincodeMopUpdateAuditHistoryResponseData](#PincodeMopUpdateAuditHistoryResponseData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String? |  yes  |  |
 | page | [PincodeMopUpdateAuditHistoryPaging](#PincodeMopUpdateAuditHistoryPaging) |  no  |  |
 | data | ArrayList<[PincodeMopUpdateAuditHistoryResponse](#PincodeMopUpdateAuditHistoryResponse)> |  no  |  |

---


 
 
 #### [ArithmeticOperations](#ArithmeticOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lt | Integer? |  yes  |  |
 | gt | Integer? |  yes  |  |
 | lte | Integer? |  yes  |  |
 | gte | Integer? |  yes  |  |

---


 
 
 #### [SchemeRulesFeatures](#SchemeRulesFeatures)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | qualityCheck | Boolean? |  yes  |  |
 | quickResponseCode | Boolean? |  yes  |  |
 | eWaybill | Boolean? |  yes  |  |
 | multiPartShipments | Boolean? |  yes  |  |
 | flammable | Boolean? |  yes  |  |
 | hazmat | Boolean? |  yes  |  |
 | batteryOperated | Boolean? |  yes  |  |

---


 
 
 #### [SchemeRules](#SchemeRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | weight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | transportType | ArrayList<String>? |  yes  |  |
 | region | String? |  yes  |  |
 | paymentMode | ArrayList<String>? |  yes  |  |
 | feature | [SchemeRulesFeatures](#SchemeRulesFeatures)? |  yes  |  |

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


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | message | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [CourierPartnerAccountFailureResponse](#CourierPartnerAccountFailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | Integer |  no  |  |
 | itemTotal | Integer |  no  |  |
 | hasPrevious | Boolean |  no  |  |
 | type | String |  no  |  |
 | current | Integer |  no  |  |
 | hasNext | Boolean |  no  |  |

---


 
 
 #### [CourierPartnerList](#CourierPartnerList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | accountId | String |  no  |  |
 | name | String |  no  |  |
 | isSelfShip | Boolean |  no  |  |

---


 
 
 #### [LocationRuleValues](#LocationRuleValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | subType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | parentId | String? |  yes  |  |
 | parentIds | ArrayList<String>? |  yes  |  |

---


 
 
 #### [LocationRule](#LocationRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | includes | ArrayList<[LocationRuleValues](#LocationRuleValues)>? |  yes  |  |

---


 
 
 #### [StringComparisonOperations](#StringComparisonOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [IntComparisonOperations](#IntComparisonOperations)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [CourierPartnerRuleConditions](#CourierPartnerRuleConditions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | forward | [LocationRule](#LocationRule)? |  yes  |  |
 | reverse | [LocationRule](#LocationRule)? |  yes  |  |
 | paymentMode | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | categoryIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | productIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | productTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | zoneIds | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | departmentIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | brandIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | orderPlaceDate | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | storeIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | storeType | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | storeTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | shipmentWeight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | shipmentCost | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | shipmentVolumetricWeight | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |

---


 
 
 #### [CourierPartnerRule](#CourierPartnerRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | cpList | ArrayList<[CourierPartnerList](#CourierPartnerList)>? |  yes  |  |
 | name | String |  no  |  |
 | conditions | [CourierPartnerRuleConditions](#CourierPartnerRuleConditions) |  no  |  |
 | sort | ArrayList<String> |  no  |  |

---


 
 
 #### [FailureResponse](#FailureResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | error | ArrayList<[ErrorResponse](#ErrorResponse)> |  no  |  |

---


 
 
 #### [CourierPartnerRulesListResponse](#CourierPartnerRulesListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CourierPartnerRule](#CourierPartnerRule)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [CompanyConfig](#CompanyConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String> |  no  |  |
 | sort | ArrayList<String> |  no  |  |
 | logisticsAsActual | Boolean? |  yes  |  |

---


 
 
 #### [ZoneConfig](#ZoneConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | serviceabilityType | String? |  yes  |  |

---


 
 
 #### [ApplicationConfig](#ApplicationConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | zones | [ZoneConfig](#ZoneConfig)? |  yes  |  |

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


 
 
 #### [SelfShipResponse](#SelfShipResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | tat | Double |  no  |  |

---


 
 
 #### [ApplicationSelfShipConfig](#ApplicationSelfShipConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | selfShip | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ApplicationSelfShipConfigResponse](#ApplicationSelfShipConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | [ServiceabilityErrorResponse](#ServiceabilityErrorResponse)? |  yes  |  |
 | data | [ApplicationSelfShipConfig](#ApplicationSelfShipConfig)? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [StoreRuleConfigData](#StoreRuleConfigData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleIds | ArrayList<String>? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CustomerRadiusSchema](#CustomerRadiusSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String |  no  |  |
 | lt | Integer? |  yes  |  |
 | lte | Integer? |  yes  |  |
 | gt | Integer? |  yes  |  |
 | gte | Integer? |  yes  |  |

---


 
 
 #### [StoreRuleConditionSchema](#StoreRuleConditionSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departmentIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | categoryIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | brandIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | toLocation | [LocationRule](#LocationRule)? |  yes  |  |
 | customerRadius | [CustomerRadiusSchema](#CustomerRadiusSchema)? |  yes  |  |
 | storeType | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | productTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | productIds | [IntComparisonOperations](#IntComparisonOperations)? |  yes  |  |
 | storeTags | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |
 | orderPlaceDate | [ArithmeticOperations](#ArithmeticOperations)? |  yes  |  |
 | zoneIds | [StringComparisonOperations](#StringComparisonOperations)? |  yes  |  |

---


 
 
 #### [StoreRuleDataSchema](#StoreRuleDataSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [StorePrioritySchema](#StorePrioritySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [GetStoreRulesApiResponse](#GetStoreRulesApiResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[StoreRuleDataSchema](#StoreRuleDataSchema)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CreateStoreRuleRequestSchema](#CreateStoreRuleRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |

---


 
 
 #### [StoreRuleResponseSchema](#StoreRuleResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [StoreRuleUpdateResponseSchema](#StoreRuleUpdateResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |
 | typeBasedPriority | ArrayList<String>? |  yes  |  |
 | tagBasedPriority | ArrayList<String>? |  yes  |  |
 | storePriority | ArrayList<[StorePrioritySchema](#StorePrioritySchema)>? |  yes  |  |
 | sort | ArrayList<String>? |  yes  |  |
 | conditions | [StoreRuleConditionSchema](#StoreRuleConditionSchema)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | applicationId | String? |  yes  |  |

---


 
 
 #### [ServiceabilityModel](#ServiceabilityModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lmCodLimit | Integer |  no  |  |
 | isQc | Boolean |  no  |  |
 | pickupCutoff | String |  no  |  |
 | routeCode | String |  no  |  |
 | isFirstMile | Boolean |  no  |  |
 | isReturn | Boolean |  no  |  |
 | isInstallation | Boolean |  no  |  |
 | isLastMile | Boolean |  no  |  |

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


 
 
 #### [CourierPartnerSchemeModel](#CourierPartnerSchemeModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | extensionId | String |  no  |  |
 | schemeId | String |  no  |  |
 | weight | [ArithmeticOperations](#ArithmeticOperations) |  no  |  |
 | transportType | String |  no  |  |
 | region | String |  no  |  |
 | deliveryType | String |  no  |  |
 | paymentMode | ArrayList<String> |  no  |  |
 | stage | String |  no  |  |
 | feature | [CourierPartnerSchemeFeatures](#CourierPartnerSchemeFeatures) |  no  |  |

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


 
 
 #### [CompanyCourierPartnerAccountListResponse](#CompanyCourierPartnerAccountListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CourierAccountResponse](#CourierAccountResponse)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [PackageMaterial](#PackageMaterial)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | width | Double |  no  |  |
 | height | Double |  no  |  |
 | length | Double |  no  |  |
 | rules | ArrayList<[PackageMaterialRule](#PackageMaterialRule)>? |  yes  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | weight | Double |  no  |  |
 | errorRate | Double |  no  |  |
 | packageType | String |  no  |  |
 | size | String |  no  |  |
 | media | ArrayList<String>? |  yes  |  |
 | channels | ArrayList<[Channel](#Channel)> |  no  |  |
 | trackInventory | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | maxWeight | Double? |  yes  |  |
 | packageVolWeight | Double? |  yes  |  |
 | autoCalculate | Boolean? |  yes  |  |

---


 
 
 #### [PackageMaterialResponse](#PackageMaterialResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | id | String? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | width | Double |  no  |  |
 | height | Double |  no  |  |
 | length | Double |  no  |  |
 | rules | ArrayList<[PackageMaterialRule](#PackageMaterialRule)>? |  yes  |  |
 | storeIds | ArrayList<Integer> |  no  |  |
 | weight | Double |  no  |  |
 | errorRate | Double |  no  |  |
 | packageType | String |  no  |  |
 | size | String |  no  |  |
 | media | ArrayList<String>? |  yes  |  |
 | channels | ArrayList<[Channel](#Channel)> |  no  |  |
 | trackInventory | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | maxWeight | Double? |  yes  |  |
 | packageVolWeight | Double? |  yes  |  |
 | autoCalculate | Boolean? |  yes  |  |

---


 
 
 #### [PackageMaterialRule](#PackageMaterialRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleId | String? |  yes  |  |
 | quantity | [PackageMaterialRuleQuantity](#PackageMaterialRuleQuantity)? |  yes  |  |
 | weight | Integer? |  yes  |  |

---


 
 
 #### [PackageRule](#PackageRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | companyId | Integer |  no  |  |
 | type | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | productTag | [PackageRuleProductTag](#PackageRuleProductTag)? |  yes  |  |
 | productId | [PackageRuleProduct](#PackageRuleProduct)? |  yes  |  |
 | categoryId | [PackageRuleCategory](#PackageRuleCategory)? |  yes  |  |

---


 
 
 #### [PackageRuleResponse](#PackageRuleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | name | String |  no  |  |
 | companyId | Integer |  no  |  |
 | type | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | productTag | [PackageRuleProductTag](#PackageRuleProductTag)? |  yes  |  |
 | productId | [PackageRuleProduct](#PackageRuleProduct)? |  yes  |  |
 | categoryId | [PackageRuleCategory](#PackageRuleCategory)? |  yes  |  |

---


 
 
 #### [Channel](#Channel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [PackageMaterialRuleList](#PackageMaterialRuleList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [PackageRuleResponse](#PackageRuleResponse)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PackageMaterialList](#PackageMaterialList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [PackageMaterialResponse](#PackageMaterialResponse)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PackageRuleProduct](#PackageRuleProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [PackageRuleProductTag](#PackageRuleProductTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PackageRuleCategory](#PackageRuleCategory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | includes | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [PackageMaterialRuleQuantity](#PackageMaterialRuleQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Integer? |  yes  |  |
 | max | Integer? |  yes  |  |

---


 
 
 #### [RulePriorityRequest](#RulePriorityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleId | String |  no  |  |
 | priority | Integer |  no  |  |

---


 
 
 #### [RulePriorityResponse](#RulePriorityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---



