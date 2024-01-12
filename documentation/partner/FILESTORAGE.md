



##### [Back to Partner docs](./README.md)

## FileStorage Methods
This service provides functionality to manage assets and generate pdf. You can upload the assets, get the cdn link for the assets, proxy the assets and many more things.


Default
* [startUpload](#startupload)
* [completeUpload](#completeupload)
* [browse](#browse)




## Methods with example and description



### startUpload
This operation initiates upload and returns storage link which is valid for 30 Minutes. You can use that storage link to make subsequent upload request with file buffer or blob.




```java
partnerClient.filestorage.startUpload( namespace,  organizationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | Segregation of different types of files(products, orders, logistics etc), Required for validating the data of the file being uploaded, decides where exactly the file will be stored inside the storage bucket. |   
| organizationId | String | yes |  |  
| body | [StartRequest](#StartRequest) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[StartResponse](#StartResponse)

Success. Returns a response containing relaving and absolute_url of storage service




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "file_name": "shirt.png",
    "file_path": "/path/qwertyuiop-shirt.png",
    "content_type": "image/png",
    "method": "PUT",
    "namespace": "products-item-images",
    "operation": "putObject",
    "tags": [
      "clothing",
      "shirt"
    ],
    "size": 9999,
    "cdn": {
      "url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png",
      "absolute_url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png",
      "relative_url": "products/pictures/free/original/qwertyuiop-shirt.png"
    },
    "upload": {
      "expiry": 5000,
      "url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png?AWSAccessKeyId=xxx&Content-Type=image%2Fpng&Expires=5000&Signature=xxx&x-amz-acl=public-read"
    }
  }
}
```
</details>

</details>









---


### completeUpload
This will complete the upload process. After successfully uploading file, you can call this operation to complete the upload process.




```java
partnerClient.filestorage.completeUpload( namespace,  organizationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | Segregation of different types of files(products, orders, logistics etc), Required for validating the data of the file being uploaded, decides where exactly the file will be stored inside the storage bucket. |   
| organizationId | String | yes |  |  
| body | [StartResponse](#StartResponse) | yes | Request body |


Uploads an arbitrarily sized buffer or blob.

It has three Major Steps:
* Start
* Upload
* Complete

### Start
Initiates the assets upload using `startUpload`.
It returns the storage link in response.

### Upload
Use the storage link to upload a file (Buffer or Blob) to the File Storage.
Make a `PUT` request on storage link received from `startUpload` api with file (Buffer or Blob) as a request body.

### Complete
After successfully upload, call `completeUpload` api to complete the upload process.
This operation will return the url for the uploaded file.


*Returned Response:*




[CompleteResponse](#CompleteResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true,
    "_id": "xxxxxxxxxxxxxxxxxxxxxx",
    "file_name": "shirt.png",
    "file_path": "/path/qwertyuiop-shirt.png",
    "content_type": "image/png",
    "namespace": "products-item-images",
    "operation": "putObject",
    "tags": [
      "clothing",
      "shirt"
    ],
    "size": 9999,
    "cdn": {
      "url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png",
      "absolute_url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png",
      "relative_url": "products/pictures/free/original/qwertyuiop-shirt.png"
    },
    "upload": {
      "expiry": 5000,
      "url": "https://xxx.xxx.xxx/products/pictures/free/original/qwertyuiop-shirt.png?AWSAccessKeyId=xxx&Content-Type=image%2Fpng&Expires=5000&Signature=xxx&x-amz-acl=public-read"
    },
    "created_on": "2020-02-03T09:50:04.240Z",
    "modified_on": "2020-02-03T09:50:04.240Z"
  }
}
```
</details>

</details>









---


### browse
Browse Files




```java
partnerClient.filestorage.browse( namespace,  organizationId,  page,  limit) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| namespace | String | yes | Segregation of different types of files(products, orders, logistics etc), Required for validating the data of the file being uploaded, decides where exactly the file will be stored inside the storage bucket. |   
| organizationId | String | yes |  |   
| applicationId | String | yes |  |   
| companyId | Integer | yes |  |   
| page | Integer? | no | page no |   
| limit | Integer? | no | Limit |  



Browse Files

*Returned Response:*




[Object](#Object)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "64e1e6fe0153e1a6d3e101f4",
        "file_name": "logo.png",
        "file_path": "/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png",
        "success": true,
        "namespace": "brand-square-logo",
        "content_type": "image/png",
        "size": 3298,
        "operation": "putObject",
        "tags": [],
        "cdn": {
          "url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png",
          "absolute_url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png",
          "relative_url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png"
        },
        "upload": {
          "url": "https://fynd-staging-assets.s3-accelerate.amazonaws.com/addsale/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png?Content-Type=image%2Fpng&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=%2F20230820%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230820T101213Z&X-Amz-Expires=1800&X-Amz-Signature=04915b14aec15712abdea3c340d5dc43729e7c982a4994650488c0150c22b0ae&X-Amz-SignedHeaders=host%3Bx-amz-acl&x-amz-acl=public-read",
          "expiry": 1800
        },
        "created_by": {
          "username": "fp_sdet_gofynd_com_65071"
        },
        "company_id": 6520,
        "bucket_key": "addsale/brands/pictures/square-logo/original/uY0P_ZtIz-logo.png",
        "createdAt": "2023-08-20T10:12:14.118Z",
        "updatedAt": "2023-08-20T10:12:14.118Z",
        "__v": 0
      }
    ],
    "page": {
      "current": 1,
      "has_previous": false,
      "has_next": true,
      "item_total": 481,
      "type": "number"
    }
  }
}
```
</details>

</details>









---




### Schemas

 
 
 #### [CDN](#CDN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | absoluteUrl | String |  no  |  |
 | relativeUrl | String |  no  |  |

---


 
 
 #### [Upload](#Upload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Integer |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [StartResponse](#StartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileName | String |  no  |  |
 | filePath | String |  no  |  |
 | contentType | String |  no  |  |
 | method | String? |  yes  |  |
 | namespace | String |  no  |  |
 | operation | String |  no  |  |
 | size | Integer |  no  |  |
 | upload | [Upload](#Upload) |  no  |  |
 | cdn | [CDN](#CDN) |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |

---


 
 
 #### [StartRequest](#StartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileName | String |  no  |  |
 | contentType | String |  no  |  |
 | size | Integer |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | params | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreatedBy](#CreatedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |

---


 
 
 #### [CompleteResponse](#CompleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | fileName | String |  no  |  |
 | filePath | String |  no  |  |
 | contentType | String |  no  |  |
 | namespace | String |  no  |  |
 | operation | String |  no  |  |
 | size | Integer |  no  |  |
 | upload | [Upload](#Upload) |  no  |  |
 | cdn | [CDN](#CDN) |  no  |  |
 | success | Boolean |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | createdOn | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |

---


 
 
 #### [FailedResponse](#FailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---



