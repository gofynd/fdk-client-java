



##### [Back to Platform docs](./README.md)

## Discount Methods
Discount

Default
* [getDiscounts](#getdiscounts)
* [createDiscount](#creatediscount)
* [getDiscount](#getdiscount)
* [updateDiscount](#updatediscount)
* [upsertDiscountItems](#upsertdiscountitems)
* [validateDiscountFile](#validatediscountfile)
* [downloadDiscountFile](#downloaddiscountfile)
* [getValidationJob](#getvalidationjob)
* [cancelValidationJob](#cancelvalidationjob)
* [getDownloadJob](#getdownloadjob)
* [cancelDownloadJob](#canceldownloadjob)




## Methods with example and description



### getDiscounts
Fetch discount list.




```java
platformClient.discount.getDiscounts( view,  q,  pageNo,  pageSize,  archived,  month,  year,  type,  appIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| view | String? | no | listing or calender.  Default is listing. |   
| q | String? | no | The search query. This can be a partial or complete name of a discount. |   
| pageNo | Integer? | no | page number. Default is 1. |   
| pageSize | Integer? | no | page size. Default is 12. |   
| archived | Boolean? | no | archived. Default is false. |   
| month | Integer? | no | month. Default is current month. |   
| year | Integer? | no | year. Default is current year. |   
| type | String? | no | basic or custom. |   
| appIds | List<String>? | no | application ids. |  



Fetch discount list.

*Returned Response:*




[ListOrCalender](#ListOrCalender)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success_basic</i></summary>

```json
{
  "value": {
    "items": [
      {
        "is_active": false,
        "app_ids": [
          "646f43ee3b7f8c2847e31fb0"
        ],
        "_id": "xxxxxxxxxxxx",
        "name": "Discount Basic",
        "job_type": "app",
        "discount_type": "percentage",
        "discount_level": "application",
        "company_id": 90,
        "validity": {
          "start": "2021-04-06T08:25:34.110Z",
          "end": "2021-04-22T18:30:00.000Z"
        },
        "value": 0,
        "created_by": {
          "username": "narutouzumaki",
          "user_id": "0"
        },
        "modified_by": {
          "username": "narutouzumaki",
          "user_id": "0"
        },
        "created_on": "2021-04-06T08:10:16.609Z",
        "modified_on": "2021-04-07T08:19:12.007Z",
        "brand_ids": [
          90
        ],
        "store_ids": [
          1001
        ]
      }
    ],
    "page": {
      "current": 1,
      "item_total": 1,
      "type": "number",
      "size": 1,
      "has_previous": true,
      "has_next": false
    }
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_custom</i></summary>

```json
{
  "value": {
    "items": [
      {
        "is_active": false,
        "app_ids": [
          "646f43ee3b7f8c2847e31fb0"
        ],
        "_id": "xxxxxxxxxxxx",
        "name": "Discount",
        "job_type": "app|brand|product",
        "discount_type": "percentage",
        "discount_level": "application",
        "company_id": 90,
        "validity": {
          "start": "2021-04-06T08:25:34.110Z",
          "end": "2021-04-22T18:30:00.000Z"
        },
        "value": 0,
        "file_path": "https://xxx.xxx.xxx/file.xlsx",
        "created_by": {
          "username": "narutouzumaki",
          "user_id": "0"
        },
        "modified_by": {
          "username": "narutouzumaki",
          "user_id": "0"
        },
        "created_on": "2021-04-06T08:10:16.609Z",
        "modified_on": "2021-04-07T08:19:12.007Z",
        "brand_ids": [
          90
        ],
        "store_ids": [
          1001
        ]
      }
    ],
    "page": {
      "current": 1,
      "item_total": 1,
      "type": "number",
      "size": 1,
      "has_previous": true,
      "has_next": false
    }
  }
}
```
</details>

</details>









---


### createDiscount
Create Discount.




```java
platformClient.discount.createDiscount(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |  
| body | [CreateUpdateDiscount](#CreateUpdateDiscount) | yes | Request body |


Create Discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success_basic</i></summary>

```json
{
  "value": {
    "_id": "64a7c915c160922f34ba4f12",
    "name": "Contract Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app",
    "discount_type": "flat",
    "discount_level": "application",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2090-04-07T08:19:12.007Z",
      "end": "2090-04-10T08:19:12.007Z"
    },
    "created_on": "2021-04-06T08:19:12.007Z",
    "modified_on": "2021-04-06T08:19:12.007Z",
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_custom</i></summary>

```json
{
  "value": {
    "_id": "64a7c915c160922f34ba4f12",
    "name": "Contract Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app",
    "discount_type": "flat",
    "discount_level": "application",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2090-04-07T08:19:12.007Z",
      "end": "2090-04-10T08:19:12.007Z"
    },
    "created_on": "2021-04-06T08:19:12.007Z",
    "modified_on": "2021-04-06T08:19:12.007Z",
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

</details>









---


### getDiscount
Fetch discount.




```java
platformClient.discount.getDiscount( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | unique id. |  



Fetch discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success_basic</i></summary>

```json
{
  "value": {
    "_id": "64a7c915c160922f34ba4f12",
    "name": "Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app",
    "discount_type": "flat",
    "discount_level": "application",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2021-04-07T08:19:12.007Z",
      "end": "2021-04-10T08:19:12.007Z"
    },
    "created_on": "2021-04-06T08:19:12.007Z",
    "modified_on": "2021-04-06T08:19:12.007Z",
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_custom</i></summary>

```json
{
  "value": {
    "_id": "62c538dd6c0f710007ac6dbf",
    "name": "Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app|brand|product",
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "discount_type": "flat",
    "discount_level": "application",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2021-04-07T08:19:12.007Z",
      "end": "2021-04-10T08:19:12.007Z"
    },
    "created_on": "2021-04-06T08:19:12.007Z",
    "modified_on": "2021-04-06T08:19:12.007Z",
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

</details>









---


### updateDiscount
Update Discount.




```java
platformClient.discount.updateDiscount( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | id |  
| body | [CreateUpdateDiscount](#CreateUpdateDiscount) | yes | Request body |


Update Discount.

*Returned Response:*




[DiscountJob](#DiscountJob)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success_basic</i></summary>

```json
{
  "value": {
    "_id": "64a7c915c160922f34ba4f12",
    "name": "Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app",
    "discount_type": "flat",
    "discount_level": "application",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2021-04-07T08:19:12.007Z",
      "end": "2021-04-10T08:19:12.007Z"
    },
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_custom</i></summary>

```json
{
  "value": {
    "_id": "64a7c915c160922f34ba4f12",
    "name": "Discount Name",
    "company_id": 90,
    "is_active": true,
    "app_ids": [
      "646f43ee3b7f8c2847e31fb0"
    ],
    "job_type": "app",
    "discount_type": "flat",
    "discount_level": "application",
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "value": 10,
    "brand_ids": [
      90
    ],
    "store_ids": [
      1001
    ],
    "discount_meta": {
      "timer": true,
      "hours": 20,
      "minutes": 35
    },
    "validity": {
      "start": "2021-04-07T08:19:12.007Z",
      "end": "2021-04-10T08:19:12.007Z"
    },
    "created_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    },
    "modified_by": {
      "username": "narutouzumaki",
      "user_id": "0"
    }
  }
}
```
</details>

</details>









---


### upsertDiscountItems
Create custom discount from bulk.




```java
platformClient.discount.upsertDiscountItems( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is the unique identifier of the company. |   
| id | String | yes | Job ID of the discount. |  
| body | [BulkDiscount](#BulkDiscount) | yes | Request body |


Create custom discounts through API.

*Returned Response:*




[Object](#Object)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success_product</i></summary>

```json
{
  "value": {
    "success": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_inventory</i></summary>

```json
{
  "value": {
    "success": true
  }
}
```
</details>

</details>









---


### validateDiscountFile
Validate File.




```java
platformClient.discount.validateDiscountFile( discount, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| discount | String? | no | discount |  
| body | [FileJobRequest](#FileJobRequest) | yes | Request body |


Validate File.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "xxxxxxxxxxxx",
    "stage": "processing",
    "total": 10,
    "failed": 0,
    "company_id": 90,
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "body": {
      "is_active": false,
      "app_ids": [
        "646f43ee3b7f8c2847e31fb0"
      ],
      "_id": "xxxxxxxxxxxx",
      "name": "Discount",
      "job_type": "app|brand|product",
      "discount_type": "percentage",
      "discount_level": "application",
      "company_id": 90,
      "file_path": "https://xxx.xxx.xxx/file.xlsx",
      "validity": {
        "start": "2090-04-06T08:25:34.110Z",
        "end": "2090-04-22T18:30:00.000Z"
      },
      "value": null,
      "created_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "modified_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "created_on": "2021-04-06T08:10:16.609Z",
      "modified_on": "2021-04-07T08:19:12.007Z",
      "brand_ids": [
        90
      ],
      "store_ids": [
        1001
      ]
    },
    "type": "download",
    "file_type": "product"
  }
}
```
</details>

</details>









---


### downloadDiscountFile
Validate File.




```java
platformClient.discount.downloadDiscountFile( type, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| type | String | yes | type |  
| body | [DownloadFileJob](#DownloadFileJob) | yes | Request body |


Validate File.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "xxxxxxxxxxxx",
    "stage": "processing",
    "total": 10,
    "failed": 0,
    "company_id": 90,
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "body": {
      "is_active": false,
      "app_ids": [
        "646f43ee3b7f8c2847e31fb0"
      ],
      "_id": "xxxxxxxxxxxx",
      "name": "Discount",
      "job_type": "app",
      "discount_type": "percentage",
      "discount_level": "application",
      "company_id": 90,
      "file_path": "https://xxx.xxx.xxx/file.xlsx",
      "validity": {
        "start": "2021-04-06T08:25:34.110Z",
        "end": "2021-04-22T18:30:00.000Z"
      },
      "value": null,
      "created_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "modified_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "created_on": "2021-04-06T08:10:16.609Z",
      "modified_on": "2021-04-07T08:19:12.007Z",
      "brand_ids": [
        90
      ],
      "store_ids": [
        1001
      ]
    },
    "type": "download",
    "file_type": "product"
  }
}
```
</details>

</details>









---


### getValidationJob
Validate File Job.




```java
platformClient.discount.getValidationJob( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | id |  



Validate File Job.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "6519669e7fc0cd03ce111ab9",
    "stage": "processing",
    "total": 10,
    "failed": 0,
    "company_id": 90,
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "body": {
      "is_active": false,
      "app_ids": [
        "646f43ee3b7f8c2847e31fb0"
      ],
      "_id": "64a7c915c160922f34ba4f12",
      "name": "Discount",
      "job_type": "app",
      "discount_type": "percentage",
      "discount_level": "application",
      "company_id": 90,
      "file_path": "https://xxx.xxx.xxx/file.xlsx",
      "validity": {
        "start": "2021-04-06T08:25:34.110Z",
        "end": "2021-04-22T18:30:00.000Z"
      },
      "value": null,
      "created_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "modified_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "created_on": "2021-04-06T08:10:16.609Z",
      "modified_on": "2021-04-07T08:19:12.007Z",
      "brand_ids": [
        90
      ],
      "store_ids": [
        1001
      ]
    },
    "type": "download",
    "file_type": "product"
  }
}
```
</details>

</details>









---


### cancelValidationJob
Cancel Validation Job.




```java
platformClient.discount.cancelValidationJob( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | id |  



Cancel Validation Job.

*Returned Response:*




[CancelJobResponse](#CancelJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true
  }
}
```
</details>

</details>









---


### getDownloadJob
Download File Job.




```java
platformClient.discount.getDownloadJob( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | id |  



Download File Job.

*Returned Response:*




[FileJobResponse](#FileJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "651b00ef29aedf98f98a8cbd",
    "stage": "processing",
    "total": 10,
    "failed": 0,
    "company_id": 90,
    "file_path": "https://xxx.xxx.xxx/file.xlsx",
    "body": {
      "is_active": false,
      "app_ids": [
        "646f43ee3b7f8c2847e31fb0"
      ],
      "_id": "64a7c915c160922f34ba4f12",
      "name": "Discount",
      "job_type": "app",
      "discount_type": "percentage",
      "discount_level": "application",
      "company_id": 90,
      "file_path": "https://xxx.xxx.xxx/file.xlsx",
      "validity": {
        "start": "2021-04-06T08:25:34.110Z",
        "end": "2021-04-22T18:30:00.000Z"
      },
      "value": null,
      "created_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "modified_by": {
        "username": "narutouzumaki",
        "user_id": "0"
      },
      "created_on": "2021-04-06T08:10:16.609Z",
      "modified_on": "2021-04-07T08:19:12.007Z",
      "brand_ids": [
        90
      ],
      "store_ids": [
        1001
      ]
    },
    "type": "download",
    "file_type": "product"
  }
}
```
</details>

</details>









---


### cancelDownloadJob
Cancel Download Job.




```java
platformClient.discount.cancelDownloadJob( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company_id |   
| id | String | yes | id |  



Cancel Download Job.

*Returned Response:*




[CancelJobResponse](#CancelJobResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true
  }
}
```
</details>

</details>









---




### Schemas

 
 
 #### [ValidityObject](#ValidityObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | start | String |  no  |  |
 | end | String |  no  |  |

---


 
 
 #### [CreateUpdateDiscount](#CreateUpdateDiscount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | appIds | ArrayList<String> |  no  |  |
 | extensionIds | ArrayList<String>? |  yes  |  |
 | jobType | String |  no  |  |
 | discountType | String |  no  |  |
 | discountLevel | String |  no  |  |
 | value | Integer? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | zoneIds | ArrayList<String>? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject) |  no  |  |
 | discountMeta | [DiscountMeta](#DiscountMeta)? |  yes  |  |

---


 
 
 #### [DiscountMeta](#DiscountMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timer | Boolean |  no  | Determines whether the discount countdown is visible or not. |
 | hours | Double? |  yes  | The time in hours before the discount ends when the countdown timer should start. |
 | minutes | Double? |  yes  | The time in minutes before the discount ends when the countdown timer should start. |

---


 
 
 #### [DiscountJob](#DiscountJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | name | String |  no  |  |
 | companyId | Integer |  no  |  |
 | isActive | Boolean |  no  |  |
 | appIds | ArrayList<String>? |  yes  |  |
 | jobType | String? |  yes  |  |
 | discountType | String? |  yes  |  |
 | discountLevel | String? |  yes  |  |
 | value | Integer? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | zoneIds | ArrayList<String>? |  yes  |  |
 | discountMeta | [DiscountMeta](#DiscountMeta)? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject) |  no  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | [UserDetails](#UserDetails) |  no  |  |
 | modifiedBy | [UserDetails](#UserDetails) |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [FileJobBody](#FileJobBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | appIds | ArrayList<String>? |  yes  |  |
 | jobType | String? |  yes  |  |
 | discountType | String? |  yes  |  |
 | discountLevel | String? |  yes  |  |
 | value | Integer? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | extensionIds | ArrayList<String>? |  yes  |  |
 | zoneIds | ArrayList<String>? |  yes  |  |
 | discountMeta | [DiscountMeta](#DiscountMeta)? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserDetails](#UserDetails)? |  yes  |  |
 | modifiedBy | [UserDetails](#UserDetails)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ListOrCalender](#ListOrCalender)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[DiscountJob](#DiscountJob)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [DiscountItems](#DiscountItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCode | String? |  yes  |  |
 | brandName | String? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | discountType | String |  no  |  |
 | value | Double |  no  |  |
 | discountMeta | [DiscountMeta](#DiscountMeta)? |  yes  |  |

---


 
 
 #### [BulkDiscount](#BulkDiscount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer |  no  |  |
 | items | ArrayList<[DiscountItems](#DiscountItems)> |  no  |  |

---


 
 
 #### [FileJobResponse](#FileJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String |  no  |  |
 | total | Integer |  no  |  |
 | failed | Integer |  no  |  |
 | companyId | Integer |  no  |  |
 | body | [FileJobBody](#FileJobBody)? |  yes  |  |
 | type | String |  no  |  |
 | fileType | String? |  yes  |  |
 | id | String |  no  | A unique identifier to distinguish and identify a job. |
 | filePath | String? |  yes  |  |
 | progress | Integer? |  yes  |  |
 | extensionIds | ArrayList<String>? |  yes  |  |
 | zoneIds | ArrayList<String>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserDetails](#UserDetails)? |  yes  |  |

---


 
 
 #### [FileJobRequest](#FileJobRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | companyId | Integer |  no  |  |
 | appIds | ArrayList<String>? |  yes  |  |
 | jobType | String? |  yes  |  |
 | discountType | String? |  yes  |  |
 | discountLevel | String? |  yes  |  |
 | filePath | String? |  yes  |  |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | validity | [ValidityObject](#ValidityObject) |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DownloadFileJob](#DownloadFileJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [CancelJobResponse](#CancelJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemTotal | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Integer? |  yes  |  |
 | type | String |  no  |  |
 | size | Integer? |  yes  |  |

---


 
 
 #### [UserDetails](#UserDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String |  no  |  |
 | userId | String |  no  |  |

---


 
 
 #### [BadRequestObject](#BadRequestObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [BadRequestData](#BadRequestData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [BadRequestObjectGet](#BadRequestObjectGet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | error | String? |  yes  |  |
 | data | [BadRequestData](#BadRequestData)? |  yes  |  |

---



