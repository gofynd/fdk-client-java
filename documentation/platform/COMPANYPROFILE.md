



##### [Back to Platform docs](./README.md)

## CompanyProfile Methods

* [cbsOnboardGet](#cbsonboardget)
* [updateCompany](#updatecompany)
* [getCompanyMetrics](#getcompanymetrics)
* [getBrand](#getbrand)
* [editBrand](#editbrand)
* [createBrand](#createbrand)
* [getBrands](#getbrands)
* [createCompanyBrandMapping](#createcompanybrandmapping)
* [getLocations](#getlocations)
* [createLocation](#createlocation)
* [getLocationDetail](#getlocationdetail)
* [updateLocation](#updatelocation)
* [createLocationBulk](#createlocationbulk)
* [getCompanyRestrictedCategoryInfo](#getcompanyrestrictedcategoryinfo)
* [getCompanyRestrictedCategoryInfoOfOneType](#getcompanyrestrictedcategoryinfoofonetype)
* [createCompanyRestrictedCategoryDocument](#createcompanyrestrictedcategorydocument)
* [updateCompanyRestrictedCategoryDocument](#updatecompanyrestrictedcategorydocument)



## Methods with example and description


### cbsOnboardGet
Get company profile




```java
client.companyprofile.cbsOnboardGet() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company profile of the seller account.

*Returned Response:*




[GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

Company profile object. See example below or refer `GetCompanyProfileSerializerResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "documents": [
    {
      "verified": true,
      "legal_name": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED",
      "value": "AALCA0442L",
      "type": "pan"
    }
  ],
  "created_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "business_info": "I sell",
  "franchise_enabled": true,
  "company_type": "mbo",
  "warnings": {},
  "business_details": {
    "website": {
      "url": "https://www.google.com"
    }
  },
  "addresses": [
    {
      "country": "India",
      "longitude": 72.8231511,
      "state": "Maharashtra",
      "address1": "A/204, Sai Vandan, Tulinj Road. Nallasopara East, ",
      "country_code": "IN",
      "latitude": 19.4232024,
      "pincode": 401209,
      "address_type": "office",
      "city": "Mumbai"
    },
    {
      "country": "India",
      "longitude": 72.8231511,
      "state": "Maharashtra",
      "address1": "A/204, Sai Vandan, Tulinj Road. Nallasopara East, ",
      "country_code": "IN",
      "latitude": 19.4232024,
      "pincode": 401209,
      "address_type": "registered",
      "city": "Mumbai"
    }
  ],
  "modified_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "notification_emails": [
    "gaurangpatel@gofynd.com"
  ],
  "business_type": "huf",
  "name": "Cache Company",
  "stage": "verified",
  "uid": 1,
  "business_country_info": {
    "country": "India",
    "country_code": "IN"
  }
}
```
</details>









---


### updateCompany
Edit company profile




```java
client.companyprofile.updateCompany(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  
| body | [UpdateCompany](#UpdateCompany) | yes | Request body |


This API allows to edit the company profile of the seller account.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success message




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getCompanyMetrics
Get company metrics




```java
client.companyprofile.getCompanyMetrics() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the company metrics, i.e. the status of its brand and stores. Also its allows to view the number of products, company documents & store documents which are verified and unverified.

*Returned Response:*




[MetricsSerializer](#MetricsSerializer)

Metrics response object. See example below or refer `MetricsSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "stage": "complete",
  "store": {
    "verified": 1,
    "pending": 1
  },
  "brand": {
    "verified": 1,
    "pending": 1
  },
  "product": {
    "verified": 0,
    "pending": 0
  },
  "company_documents": {
    "verified": 1,
    "pending": 0
  },
  "store_documents": {
    "verified": 0,
    "pending": 2
  }
}
```
</details>









---


### getBrand
Get a single brand.




```java
client.companyprofile.getBrand( brandId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company associated to brand that is to be viewed. |   
| brandId | String | yes | Id of the brand to be viewed. |  



This API helps to get data associated to a particular brand.

*Returned Response:*




[GetBrandResponseSerializer](#GetBrandResponseSerializer)

Brand object. See example below or refer `GetBrandResponseSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "company_name": "Test company",
  "modified_on": "2022-06-15T08:43:47.587000",
  "_locale_language": {},
  "slug_key": "company-brand-test-final",
  "banner": {
    "landscape": "http://cdn4.gofynd.com/media/banner/brand/original/7020_f9e91f7d501c4f2985c09bd196ed304d.jpg",
    "portrait": "http://cdn4.gofynd.com/media/banner_portrait/brand/original/7021_16fc50205c40477daf419b64ec64c64c.jpg"
  },
  "name": "company-brand-test-final",
  "warnings": {},
  "modified_by": {
    "user_id": "61bb02b3e4a82983f7236aa0",
    "username": "rajamishra_gofynd_com_02316"
  },
  "description": "Test brand",
  "created_on": "2022-06-15T08:43:46.203000",
  "company_id": 1,
  "created_by": {
    "user_id": "61bb02b3e4a82983f7236aa0",
    "username": "rajamishra_gofynd_com_02316"
  },
  "stage": "unverified",
  "uid": 2766,
  "mode": "live",
  "documents": [
    {
      "url": "https://hdn-1.addsale.com/x0/brands/pictures/portrait-banner/original/IYs5oSlUZ-Portrait-Banner.jpeg",
      "type": "test"
    }
  ],
  "logo": "http://cdn4.gofynd.com/media/logo/brand/original/4597_40d1ce44d61940d4829a3c54951bd9ee.jpg",
  "synonyms": [
    "xyz"
  ]
}
```
</details>









---


### editBrand
Edit a brand.




```java
client.companyprofile.editBrand( brandId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company associated to brand that is to be viewed. |   
| brandId | String | yes | Id of the brand to be viewed. |  
| body | [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer) | yes | Request body |


This API allows to edit meta of a brand.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### createBrand
Create a Brand.




```java
client.companyprofile.createBrand(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company. |  
| body | [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer) | yes | Request body |


This API allows to create a brand associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getBrands
Get brands associated to a company




```java
client.companyprofile.getBrands( pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| q | String? | no | Search term for name. |  



This API helps to get view brands associated to a particular company.

*Returned Response:*




[CompanyBrandListSerializer](#CompanyBrandListSerializer)

Brand object. See example below or refer `CompanyBrandListSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "brand": {
        "stage": "complete",
        "uid": 2,
        "banner": {
          "portrait": "http://cdn4.gofynd.com/media/banner_portrait/brand/original/7021_16fc50205c40477daf419b64ec64c64c.jpg",
          "landscape": "http://cdn4.gofynd.com/media/banner/brand/original/7020_f9e91f7d501c4f2985c09bd196ed304d.jpg"
        },
        "modified_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "slug_key": "test-post",
        "synonyms": [
          "xyz"
        ],
        "created_on": "2021-02-25T15:21:57.666000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T15:21:57.666000+00:00",
        "name": "test_post",
        "logo": "http://cdn4.gofynd.com/media/logo/brand/original/4597_40d1ce44d61940d4829a3c54951bd9ee.jpg"
      },
      "stage": "complete",
      "uid": 2,
      "documents": [
        {
          "url": "https://hdn-1.addsale.com/x0/brands/pictures/square-logo/original/dHudsm4Bc-Logo.png",
          "verified": true,
          "document_type": "authorization_letter"
        }
      ],
      "modified_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      },
      "company": {
        "business_type": "huf",
        "stage": "complete",
        "uid": 1,
        "addresses": [
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "office"
          },
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "registered"
          }
        ],
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "company_type": "mbo",
        "created_on": "2021-02-25T15:21:51.526000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T17:44:55.722000+00:00",
        "name": "Cache Company"
      },
      "created_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      }
    }
  ],
  "page": {
    "current": 1,
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_count": 1
  }
}
```
</details>









---


### createCompanyBrandMapping
Create a company brand mapping.




```java
client.companyprofile.createCompanyBrandMapping(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company inside which the brand is to be mapped. |  
| body | [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer) | yes | Request body |


This API allows to create a company brand mapping, for a already existing brand in the system.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true
}
```
</details>









---


### getLocations
Get list of locations




```java
client.companyprofile.getLocations( storeType,  q,  stage,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company whose locations are to fetched |   
| storeType | String? | no | Helps to sort the location list on the basis of location type. |   
| q | String? | no | Query that is to be searched. |   
| stage | String? | no | to filter companies on basis of verified or unverified companies. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the locations associated to a company.

*Returned Response:*




[LocationListSerializer](#LocationListSerializer)

Company profile object. See example below or refer `LocationListSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "company": {
        "business_type": "huf",
        "stage": "complete",
        "uid": 1,
        "addresses": [
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "office"
          },
          {
            "city": "Mumbai Suburban",
            "latitude": 19.058461,
            "longitude": 72.871395,
            "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
            "country_code": "IN",
            "state": "Maharashtra",
            "country": "India",
            "pincode": 400070,
            "address_type": "registered"
          }
        ],
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "company_type": "mbo",
        "created_on": "2021-02-25T15:21:51.526000+00:00",
        "created_by": {
          "user_id": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-25T17:44:55.722000+00:00",
        "name": "Cache Company"
      },
      "address": {
        "city": "MUMBAI",
        "latitude": 19.4232024,
        "longitude": 72.8231511,
        "address1": "A/204, SAI VANDAN, NARAYAN NAGAR, TULINJ ROAD",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 401209
      },
      "timing": [
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "monday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "tuesday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "wednesday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "thursday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "friday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "saturday"
        },
        {
          "closing": {
            "minute": 0,
            "hour": 22
          },
          "opening": {
            "minute": 0,
            "hour": 11
          },
          "open": true,
          "weekday": "sunday"
        }
      ],
      "documents": [],
      "display_name": "new store",
      "manager": {
        "name": "Yrf",
        "mobile_no": {
          "country_code": 91,
          "number": "83456774567"
        },
        "email": "gbp@jkl.com"
      },
      "code": "code2",
      "product_return_config": {
        "on_same_store": true
      },
      "created_on": "2021-02-25T15:22:04.913000+00:00",
      "created_by": {
        "user_id": "123",
        "username": "917827311650_22960"
      },
      "name": "location2",
      "gst_credentials": {
        "e_invoice": {
          "enabled": false
        }
      },
      "store_type": "high_street",
      "contact_numbers": [
        {
          "country_code": 91,
          "number": "7208229698"
        }
      ],
      "stage": "complete",
      "uid": 2,
      "notification_emails": []
    }
  ],
  "page": {
    "current": 1,
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_count": 1
  }
}
```
</details>









---


### createLocation
Create a location associated to a company.




```java
client.companyprofile.createLocation(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company inside which the location is to be created. |  
| body | [LocationSerializer](#LocationSerializer) | yes | Request body |


This API allows to edit a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### getLocationDetail
Get details of a specific location.




```java
client.companyprofile.getLocationDetail( locationId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company inside which the location lies. |   
| locationId | String | yes | Id of the location which you want to view. |  



This API helps to get data associated to a specific location.

*Returned Response:*




[GetLocationSerializer](#GetLocationSerializer)

Brand object. See example below or refer `GetLocationSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "verified_on": "2021-02-25T15:22:07.140000+00:00",
  "company": {
    "business_type": "huf",
    "stage": "complete",
    "uid": 1,
    "addresses": [
      {
        "city": "Mumbai Suburban",
        "latitude": 19.058461,
        "longitude": 72.871395,
        "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
        "country_code": "IN",
        "state": "Maharashtra",
        "country": "India",
        "pincode": 400070,
        "address_type": "office"
      },
      {
        "city": "Mumbai Suburban",
        "latitude": 19.058461,
        "longitude": 72.871395,
        "address1": "Chunabhatti Phatak, Maharashtra Nagar, Maharashtra Nagar, ",
        "country_code": "IN",
        "state": "Maharashtra",
        "country": "India",
        "pincode": 400070,
        "address_type": "registered"
      }
    ],
    "modified_by": {
      "user_id": "-1",
      "username": "silverbolt"
    },
    "company_type": "mbo",
    "created_by": {
      "user_id": "123",
      "username": "917827311650_22960"
    },
    "name": "Cache Company"
  },
  "address": {
    "city": "MUMBAI",
    "landmark": "",
    "latitude": 19.4232024,
    "longitude": 72.8231511,
    "address2": "",
    "address1": "A/204, SAI VANDAN, NARAYAN NAGAR, TULINJ ROAD",
    "state": "MAHARASHTRA",
    "country": "INDIA",
    "pincode": 401209
  },
  "timing": [
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "monday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "tuesday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "wednesday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "thursday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "friday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "saturday"
    },
    {
      "closing": {
        "minute": 0,
        "hour": 22
      },
      "opening": {
        "minute": 0,
        "hour": 11
      },
      "open": true,
      "weekday": "sunday"
    }
  ],
  "documents": [],
  "warnings": {},
  "display_name": "new store",
  "manager": {
    "name": "Yrf",
    "mobile_no": {
      "country_code": 91,
      "number": "83456774567"
    },
    "email": "gbp@jkl.com"
  },
  "code": "store1",
  "product_return_config": {
    "on_same_store": true
  },
  "modified_by": {
    "user_id": "-1",
    "username": "silverbolt"
  },
  "created_by": {
    "user_id": "123",
    "username": "917827311650_22960"
  },
  "name": "edited_store",
  "gst_credentials": {
    "e_invoice": {
      "enabled": false
    }
  },
  "verified_by": {
    "user_id": "-1",
    "username": "silverbolt"
  },
  "store_type": "high_street",
  "contact_numbers": [
    {
      "country_code": 91,
      "number": "7208229698"
    }
  ],
  "stage": "verified",
  "uid": 1,
  "integration_type": {
    "inventory": "pulse",
    "order": "pulse"
  },
  "notification_emails": [],
  "fulfilment_type": "DFC"
}
```
</details>









---


### updateLocation
Edit a location asscoiated to a company.




```java
client.companyprofile.updateLocation( locationId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company inside which the location is to be created. |   
| locationId | String | yes | Id of the location which you want to edit. |  
| body | [LocationSerializer](#LocationSerializer) | yes | Request body |


This API allows to edit a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 1,
  "success": true
}
```
</details>









---


### createLocationBulk
Create a location asscoiated to a company in bulk.




```java
client.companyprofile.createLocationBulk(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company inside which the location is to be created. |  
| body | [BulkLocationSerializer](#BulkLocationSerializer) | yes | Request body |


This API allows to create a location associated to a company.

*Returned Response:*




[ProfileSuccessResponse](#ProfileSuccessResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "10 stores inserted",
  "success": true
}
```
</details>









---


### getCompanyRestrictedCategoryInfo
Get restricted category info




```java
client.companyprofile.getCompanyRestrictedCategoryInfo() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the restricted category info, i.e. the status of its stores and its restricted category info.

*Returned Response:*




[RestrictedCategoryMetricsResponseSerializer](#RestrictedCategoryMetricsResponseSerializer)

Metrics response object. See example below or refer `MetricsSerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "food": {
    "unverified": 1,
    "correction": 0
  }
}
```
</details>









---


### getCompanyRestrictedCategoryInfoOfOneType
Get restricted category info




```java
client.companyprofile.getCompanyRestrictedCategoryInfoOfOneType() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to view the restricted category info, i.e. the status of its stores and its restricted category info for one type of restrcited category such as food.

*Returned Response:*




[RestrictedCategoryListResponseSerializer](#RestrictedCategoryListResponseSerializer)

Metrics response object. See example below or refer `RestrictedCategorySerializer` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "store_name": "Archies Ltd",
  "store_type": "warehouse",
  "store_code": null,
  "company_id": 1,
  "category_type": "food",
  "store_id": 1,
  "documents": [
    {
      "uid": 1,
      "files": [
        {
          "url": "",
          "type": "declaration",
          "name": ""
        }
      ],
      "document_type": "fssai",
      "value": "1234567890",
      "stage": "verified",
      "issue_date": "2022-06-10T05:16:43.312000",
      "expiry_date": "2022-06-10T05:16:43.312000",
      "primary": true,
      "days_left": -5,
      "alert_type": "error"
    }
  ]
}
```
</details>









---


### createCompanyRestrictedCategoryDocument
Create restricted category info




```java
client.companyprofile.createCompanyRestrictedCategoryDocument() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



This API allows to create restricted category document for the given company

*Returned Response:*




[SuccessResponseSerializer](#SuccessResponseSerializer)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Success!!!"
}
```
</details>









---


### updateCompanyRestrictedCategoryDocument
Update restricted category info




```java
client.companyprofile.updateCompanyRestrictedCategoryDocument( documentId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| documentId | String | yes | A `document_id` is a unique identifier for a particular restricted category document. |  



This API allows to update restricted category document for the given company

*Returned Response:*




[SuccessResponseSerializer](#SuccessResponseSerializer)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Success!!!"
}
```
</details>









---



### Schemas

 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [SellerPhoneNumber](#SellerPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Integer |  no  |  |
 | number | String |  no  |  |

---


 
 
 #### [ContactDetails](#ContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |
 | emails | ArrayList<String>? |  yes  |  |

---


 
 
 #### [Website](#Website)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |

---


 
 
 #### [BusinessDetails](#BusinessDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | website | [Website](#Website)? |  yes  |  |

---


 
 
 #### [BusinessCountryInfo](#BusinessCountryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [CompanyTaxesSerializer](#CompanyTaxesSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effectiveDate | String? |  yes  |  |
 | enable | Boolean? |  yes  |  |
 | rate | Double? |  yes  |  |

---


 
 
 #### [GetAddressSerializer](#GetAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  |  |
 | country | String |  no  |  |
 | longitude | Double |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | countryCode | String? |  yes  |  |
 | address1 | String |  no  |  |
 | addressType | String? |  yes  |  |
 | pincode | Integer |  no  |  |
 | address2 | String? |  yes  |  |
 | landmark | String? |  yes  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean? |  yes  |  |
 | value | String |  no  |  |
 | legalName | String? |  yes  |  |
 | type | String |  no  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [GetCompanyProfileSerializerResponse](#GetCompanyProfileSerializerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aboutBusiness | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | uid | Integer |  no  |  |
 | franchiseEnabled | Boolean? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | name | String? |  yes  |  |
 | businessType | String |  no  |  |
 | suppressions | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | companyType | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | contactDetails | [ContactDetails](#ContactDetails)? |  yes  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails)? |  yes  |  |
 | businessCountryInfo | [BusinessCountryInfo](#BusinessCountryInfo)? |  yes  |  |
 | taxes | ArrayList<[CompanyTaxesSerializer](#CompanyTaxesSerializer)>? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | storeName | String? |  yes  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | annualTurnover | String? |  yes  |  |
 | code | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | businessInfo | String? |  yes  |  |
 | sellGstExemptedProducts | Boolean? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | corrections | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | message | String? |  yes  |  |
 | status | Integer? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | latitude | Double |  no  |  |
 | country | String |  no  |  |
 | longitude | Double |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | countryCode | String? |  yes  |  |
 | address1 | String |  no  |  |
 | addressType | String |  no  |  |
 | pincode | Integer |  no  |  |
 | address2 | String? |  yes  |  |
 | landmark | String? |  yes  |  |

---


 
 
 #### [UpdateCompany](#UpdateCompany)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aboutBusiness | String? |  yes  |  |
 | franchiseEnabled | Boolean? |  yes  |  |
 | websiteUrl | String? |  yes  |  |
 | businessType | String? |  yes  |  |
 | name | String? |  yes  |  |
 | companyType | String? |  yes  |  |
 | contactDetails | [ContactDetails](#ContactDetails)? |  yes  |  |
 | compositeTaxation | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | businessDetails | [BusinessDetails](#BusinessDetails)? |  yes  |  |
 | taxes | ArrayList<[CompanyTaxesSerializer](#CompanyTaxesSerializer)>? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | storeName | String? |  yes  |  |
 | addresses | ArrayList<[CreateUpdateAddressSerializer](#CreateUpdateAddressSerializer)>? |  yes  |  |
 | annualTurnover | String? |  yes  |  |
 | code | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | businessInfo | String? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |

---


 
 
 #### [ProfileSuccessResponse](#ProfileSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [DocumentsObj](#DocumentsObj)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Integer? |  yes  |  |
 | pending | Integer? |  yes  |  |

---


 
 
 #### [MetricsSerializer](#MetricsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | storeDocuments | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | brand | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | stage | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | store | [DocumentsObj](#DocumentsObj)? |  yes  |  |
 | companyDocuments | [DocumentsObj](#DocumentsObj)? |  yes  |  |

---


 
 
 #### [BrandBannerSerializer](#BrandBannerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | String |  no  |  |
 | portrait | String |  no  |  |

---


 
 
 #### [BrandDocumentsSerializer](#BrandDocumentsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [GetBrandResponseSerializer](#GetBrandResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandOwner | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | ownerId | Integer? |  yes  |  |
 | name | String |  no  |  |
 | description | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | slugKey | String? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer)? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | logo | String? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | corrections | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | documents | ArrayList<[BrandDocumentsSerializer](#BrandDocumentsSerializer)>? |  yes  |  |

---


 
 
 #### [BrandDocumentSerializer](#BrandDocumentSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [CreateUpdateBrandRequestSerializer](#CreateUpdateBrandRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | brandTier | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | banner | [BrandBannerSerializer](#BrandBannerSerializer) |  no  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | name | String |  no  |  |
 | documents | ArrayList<[BrandDocumentSerializer](#BrandDocumentSerializer)>? |  yes  |  |

---


 
 
 #### [CompanySocialAccounts](#CompanySocialAccounts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [CompanyDetails](#CompanyDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | websiteUrl | String? |  yes  |  |
 | socials | ArrayList<[CompanySocialAccounts](#CompanySocialAccounts)>? |  yes  |  |

---


 
 
 #### [CompanySerializer](#CompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyType | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | businessCountryInfo | [BusinessCountryInfo](#BusinessCountryInfo)? |  yes  |  |
 | stage | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | marketChannels | ArrayList<String>? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | businessType | String |  no  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | details | [CompanyDetails](#CompanyDetails)? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |

---


 
 
 #### [CompanyBrandDocumentsResponseSerializer](#CompanyBrandDocumentsResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [CompanyBrandSerializer](#CompanyBrandSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | brand | [GetBrandResponseSerializer](#GetBrandResponseSerializer)? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | stage | String? |  yes  |  |
 | company | [CompanySerializer](#CompanySerializer)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | corrections | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | documents | ArrayList<[CompanyBrandDocumentsResponseSerializer](#CompanyBrandDocumentsResponseSerializer)>? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasPrevious | Boolean? |  yes  |  |
 | size | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | current | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | type | String |  no  |  |
 | itemTotal | Integer? |  yes  |  |

---


 
 
 #### [CompanyBrandListSerializer](#CompanyBrandListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyBrandSerializer](#CompanyBrandSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CompanyBrandDocumentsSerializer](#CompanyBrandDocumentsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [CompanyBrandPostRequestSerializer](#CompanyBrandPostRequestSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<Integer> |  no  |  |
 | company | Integer |  no  |  |
 | uid | Integer? |  yes  |  |
 | documents | ArrayList<[CompanyBrandDocumentsSerializer](#CompanyBrandDocumentsSerializer)>? |  yes  |  |

---


 
 
 #### [LocationIntegrationType](#LocationIntegrationType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String? |  yes  |  |
 | inventory | String? |  yes  |  |

---


 
 
 #### [GetCompanySerializer](#GetCompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyType | String? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | stage | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | businessType | String? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |

---


 
 
 #### [Storeholiday](#Storeholiday)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | endDate | String |  no  |  |
 | type | String |  no  |  |
 | year | Integer |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | startDate | String |  no  |  |

---


 
 
 #### [Deactivation](#Deactivation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  |  |
 | reason | ArrayList<String>? |  yes  |  |

---


 
 
 #### [LocationManagerSerializer](#LocationManagerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | name | String? |  yes  |  |
 | mobileNo | [SellerPhoneNumber](#SellerPhoneNumber) |  no  |  |

---


 
 
 #### [LocationTimingSerializer](#LocationTimingSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minute | Integer? |  yes  |  |
 | hour | Integer? |  yes  |  |

---


 
 
 #### [LocationDayWiseSerializer](#LocationDayWiseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | weekday | String |  no  |  |
 | open | Boolean |  no  |  |
 | opening | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |
 | closing | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |

---


 
 
 #### [InvoiceCredSerializer](#InvoiceCredSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |
 | password | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eWaybill | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |
 | eInvoice | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |

---


 
 
 #### [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeUid | Integer? |  yes  |  |
 | onSameStore | Boolean? |  yes  |  |

---


 
 
 #### [Correction](#Correction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonCode | String? |  yes  |  |
 | desc | String? |  yes  |  |

---


 
 
 #### [GetLocationSerializer](#GetLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfilmentType | String? |  yes  |  |
 | integrationType | [LocationIntegrationType](#LocationIntegrationType)? |  yes  |  |
 | stage | String? |  yes  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer)? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | holiday | ArrayList<[Storeholiday](#Storeholiday)>? |  yes  |  |
 | verifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | deactivateReason | [Deactivation](#Deactivation)? |  yes  |  |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | storeType | String? |  yes  |  |
 | inventories | Integer? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)>? |  yes  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)? |  yes  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer) |  no  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | code | String |  no  |  |
 | modifiedOn | String? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | phoneNumber | String |  no  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | deactivationTime | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)? |  yes  |  |
 | corrections | ArrayList<[Correction](#Correction)>? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | addverbReferenceCode | String? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |

---


 
 
 #### [LocationListSerializer](#LocationListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetLocationSerializer](#GetLocationSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Storeholiday1](#Storeholiday1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | endDate | String |  no  |  |
 | type | String |  no  |  |
 | year | Integer |  no  |  |
 | slug | String |  no  |  |
 | name | String |  no  |  |
 | startDate | String |  no  |  |

---


 
 
 #### [LocationSerializer](#LocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfilmentType | String |  no  |  |
 | stage | String? |  yes  |  |
 | company | Integer |  no  |  |
 | uid | Integer? |  yes  |  |
 | holiday | ArrayList<[Storeholiday1](#Storeholiday1)>? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |
 | name | String |  no  |  |
 | displayName | String |  no  |  |
 | storeType | String? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)>? |  yes  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)? |  yes  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer) |  no  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | code | String |  no  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)? |  yes  |  |
 | addverbReferenceCode | String? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |

---


 
 
 #### [BulkLocationSerializer](#BulkLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[LocationSerializer](#LocationSerializer)>? |  yes  |  |

---


 
 
 #### [DocumentObject](#DocumentObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unverified | Integer? |  yes  |  |
 | correctionRequested | Integer? |  yes  |  |

---


 
 
 #### [RestrictedCategoryMetricsResponseSerializer](#RestrictedCategoryMetricsResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | drug | [DocumentObject](#DocumentObject)? |  yes  |  |
 | food | [DocumentObject](#DocumentObject)? |  yes  |  |

---


 
 
 #### [StageReasonResponse](#StageReasonResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | desc | String? |  yes  |  |
 | reasonCode | String? |  yes  |  |

---


 
 
 #### [RestrictedCategoryFiles](#RestrictedCategoryFiles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | url | String |  no  |  |

---


 
 
 #### [RestrictedCategoryResponseInfoSerializer](#RestrictedCategoryResponseInfoSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | primary | Boolean? |  yes  |  |
 | categoryType | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | id | String? |  yes  |  |
 | documentType | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | stageReason | ArrayList<[StageReasonResponse](#StageReasonResponse)>? |  yes  |  |
 | issueDate | String? |  yes  |  |
 | expiryDate | String? |  yes  |  |
 | documents | ArrayList<[RestrictedCategoryFiles](#RestrictedCategoryFiles)>? |  yes  |  |

---


 
 
 #### [RestrictedCategoryResponseSerializer](#RestrictedCategoryResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfilmentType | String? |  yes  |  |
 | storeType | String |  no  |  |
 | code | String |  no  |  |
 | uid | Integer |  no  |  |
 | name | String |  no  |  |
 | restrictedCategories | ArrayList<[RestrictedCategoryResponseInfoSerializer](#RestrictedCategoryResponseInfoSerializer)> |  no  |  |

---


 
 
 #### [RestrictedCategoryListResponseSerializer](#RestrictedCategoryListResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[RestrictedCategoryResponseSerializer](#RestrictedCategoryResponseSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | declarationTemplate | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [SuccessResponseSerializer](#SuccessResponseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---



