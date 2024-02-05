



##### [Back to Platform docs](./README.md)

## Catalog Methods
Catalog - Platform Front API's' API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features.

Default
* [getCatalogInsights](#getcataloginsights)
* [getApplicationBrandListing](#getapplicationbrandlisting)
* [updateAppBrand](#updateappbrand)
* [getApplicationBrands](#getapplicationbrands)
* [getCategories](#getcategories)
* [getApplicationCategoryListing](#getapplicationcategorylisting)
* [updateAppCategory](#updateappcategory)
* [createCollection](#createcollection)
* [getAllCollections](#getallcollections)
* [getQueryFilters](#getqueryfilters)
* [addCollectionItems](#addcollectionitems)
* [getCollectionDetail](#getcollectiondetail)
* [updateCollection](#updatecollection)
* [deleteCollection](#deletecollection)
* [getApplicationDepartmentListing](#getapplicationdepartmentlisting)
* [updateAppDepartment](#updateappdepartment)
* [getConfigurationsFilterMetadata](#getconfigurationsfiltermetadata)
* [getDepartments](#getdepartments)
* [getAppInventory](#getappinventory)
* [getAppLocations](#getapplocations)
* [getConfigurations](#getconfigurations)
* [createConfigurationProductListing](#createconfigurationproductlisting)
* [getCatalogConfiguration](#getcatalogconfiguration)
* [getConfigurationByType](#getconfigurationbytype)
* [createConfigurationByType](#createconfigurationbytype)
* [getAppProduct](#getappproduct)
* [updateAppProduct](#updateappproduct)
* [getAppicationProducts](#getappicationproducts)
* [getDiscountedInventoryBySizeIdentifier](#getdiscountedinventorybysizeidentifier)
* [getProductDetailBySlug](#getproductdetailbyslug)
* [getAppProducts](#getappproducts)
* [getAppReturnConfiguration](#getappreturnconfiguration)
* [createAppReturnConfiguration](#createappreturnconfiguration)
* [updateAppReturnConfiguration](#updateappreturnconfiguration)
* [deleteAppCategoryReturnConfiguration](#deleteappcategoryreturnconfiguration)
* [getAppCategoryReturnConfig](#getappcategoryreturnconfig)
* [createAppCategoryReturnConfiguration](#createappcategoryreturnconfiguration)
* [updateAppCategoryReturnConfiguration](#updateappcategoryreturnconfiguration)
* [createCustomAutocompleteRule](#createcustomautocompleterule)
* [getAutocompleteConfig](#getautocompleteconfig)
* [getAutocompleteKeywordDetail](#getautocompletekeyworddetail)
* [updateAutocompleteKeyword](#updateautocompletekeyword)
* [deleteAutocompleteKeyword](#deleteautocompletekeyword)
* [createSearchRerank](#createsearchrerank)
* [getSearchRerank](#getsearchrerank)
* [getSearchRerankDetail](#getsearchrerankdetail)
* [updateSearchRerankConfiguration](#updatesearchrerankconfiguration)
* [deleteSearchRerankConfiguration](#deletesearchrerankconfiguration)
* [createSearchConfiguration](#createsearchconfiguration)
* [getSearchConfiguration](#getsearchconfiguration)
* [updateSearchConfiguration](#updatesearchconfiguration)
* [deleteSearchConfiguration](#deletesearchconfiguration)
* [createCustomKeyword](#createcustomkeyword)
* [getAllSearchKeyword](#getallsearchkeyword)
* [getSearchKeywords](#getsearchkeywords)
* [updateSearchKeywords](#updatesearchkeywords)
* [deleteSearchKeywords](#deletesearchkeywords)
* [updateAppLocation](#updateapplocation)
* [createCategories](#createcategories)
* [listCategories](#listcategories)
* [getCategoryData](#getcategorydata)
* [updateCategory](#updatecategory)
* [getSellerInsights](#getsellerinsights)
* [createDepartments](#createdepartments)
* [listDepartmentsData](#listdepartmentsdata)
* [getDepartmentData](#getdepartmentdata)
* [updateDepartment](#updatedepartment)
* [listTemplateBrandTypeValues](#listtemplatebrandtypevalues)
* [bulkHsnCode](#bulkhsncode)
* [getHsnCode](#gethsncode)
* [updateHsnCode](#updatehsncode)
* [getInventories](#getinventories)
* [getInventoryBulkUploadHistory](#getinventorybulkuploadhistory)
* [createBulkInventoryJob](#createbulkinventoryjob)
* [deleteBulkInventoryJob](#deletebulkinventoryjob)
* [createBulkInventory](#createbulkinventory)
* [createInventoryExportJob](#createinventoryexportjob)
* [getInventoryExport](#getinventoryexport)
* [patchProductExportDetail](#patchproductexportdetail)
* [getProductExportDetail](#getproductexportdetail)
* [patchInventoryExportDetail](#patchinventoryexportdetail)
* [getInventoryExportDetail](#getinventoryexportdetail)
* [exportInventoryConfig](#exportinventoryconfig)
* [downloadInventoryTemplateView](#downloadinventorytemplateview)
* [validateProductTemplateSchema](#validateproducttemplateschema)
* [getOptimalLocations](#getoptimallocations)
* [getCompanyBrandDetail](#getcompanybranddetail)
* [getCompanyDetail](#getcompanydetail)
* [getCompanyMetrics](#getcompanymetrics)
* [getStoreDetail](#getstoredetail)
* [getProductAttributes](#getproductattributes)
* [getGenderAttribute](#getgenderattribute)
* [createProductBundle](#createproductbundle)
* [getProductBundle](#getproductbundle)
* [getProductBundleDetail](#getproductbundledetail)
* [updateProductBundle](#updateproductbundle)
* [getProductAssetsInBulk](#getproductassetsinbulk)
* [createProductAssetsInBulk](#createproductassetsinbulk)
* [getProductBulkUploadHistory](#getproductbulkuploadhistory)
* [createBulkProductUploadJob](#createbulkproductuploadjob)
* [deleteProductBulkJob](#deleteproductbulkjob)
* [createProductsInBulk](#createproductsinbulk)
* [listProductTemplateExportDetails](#listproducttemplateexportdetails)
* [listHSNCodes](#listhsncodes)
* [getProductTags](#getproducttags)
* [listProductTemplate](#listproducttemplate)
* [listProductTemplateCategories](#listproducttemplatecategories)
* [downloadProductTemplateViews](#downloadproducttemplateviews)
* [validateProductTemplate](#validateproducttemplate)
* [getProductValidation](#getproductvalidation)
* [getInventoryBySizeIdentifier](#getinventorybysizeidentifier)
* [getProductSize](#getproductsize)
* [deleteSize](#deletesize)
* [getInventoryBySize](#getinventorybysize)
* [getVariantsOfProducts](#getvariantsofproducts)
* [getCompanyVerification](#getcompanyverification)
* [getProductVerificationDetails](#getproductverificationdetails)
* [getVariantTypes](#getvarianttypes)
* [createSizeGuide](#createsizeguide)
* [getSizeGuides](#getsizeguides)
* [getSizeGuide](#getsizeguide)
* [updateSizeGuide](#updatesizeguide)
* [updateAllowSingle](#updateallowsingle)
* [updateDefaultSort](#updatedefaultsort)
* [createListingConfiguration](#createlistingconfiguration)
* [getListingConfigurations](#getlistingconfigurations)
* [createGroupConfiguration](#creategroupconfiguration)
* [getGroupConfigurations](#getgroupconfigurations)
* [updateGroupConfiguration](#updategroupconfiguration)
* [deleteGroupConfiguration](#deletegroupconfiguration)
* [updateListingConfiguration](#updatelistingconfiguration)
* [deleteListingConfiguration](#deletelistingconfiguration)
* [getConfigurationMetadata](#getconfigurationmetadata)
* [getAllProductHsnCodes](#getallproducthsncodes)
* [getSingleProductHSNCode](#getsingleproducthsncode)
* [updateInventories](#updateinventories)
* [listInventoryExport](#listinventoryexport)
* [createInventoryExport](#createinventoryexport)
* [getProducts](#getproducts)
* [createProduct](#createproduct)
* [uploadBulkProducts](#uploadbulkproducts)
* [getProductExportJobs](#getproductexportjobs)
* [createProductExportJob](#createproductexportjob)
* [getProduct](#getproduct)
* [editProduct](#editproduct)
* [deleteProduct](#deleteproduct)
* [allSizes](#allsizes)
* [deleteRealtimeInventory](#deleterealtimeinventory)
* [updateRealtimeInventory](#updaterealtimeinventory)
* [getProductTemplateBySlug](#getproducttemplatebyslug)
* [getMarketplaces](#getmarketplaces)
* [updateMarketplaceOptin](#updatemarketplaceoptin)
* [createMarketplaceOptin](#createmarketplaceoptin)
* [createAutocompleteSettings](#createautocompletesettings)
* [getAutocompleteSettings](#getautocompletesettings)
* [updateAutocompleteSettings](#updateautocompletesettings)
* [getAutocompletePreview](#getautocompletepreview)
* [getMerchandisingRulePinAction](#getmerchandisingrulepinaction)
* [createMerchandisingRulePinAction](#createmerchandisingrulepinaction)
* [updateMerchandisingRulePinAction](#updatemerchandisingrulepinaction)
* [getMerchandisingRuleHideAction](#getmerchandisingrulehideaction)
* [createMerchandisingRuleHideAction](#createmerchandisingrulehideaction)
* [updateMerchandisingRuleHideAction](#updatemerchandisingrulehideaction)
* [getMerchandisingRuleBoostAction](#getmerchandisingruleboostaction)
* [createMerchandisingRuleBoostAction](#createmerchandisingruleboostaction)
* [updateMerchandisingRuleBoostAction](#updatemerchandisingruleboostaction)
* [getMerchandisingRuleBuryAction](#getmerchandisingruleburyaction)
* [createMerchandisingRuleBuryAction](#createmerchandisingruleburyaction)
* [updateMerchandisingRuleBuryAction](#updatemerchandisingruleburyaction)
* [createMerchandisingRuleQuery](#createmerchandisingrulequery)
* [getMerchandisingQuery](#getmerchandisingquery)
* [updateMerchandisingRuleQuery](#updatemerchandisingrulequery)
* [getMerchandisingRules](#getmerchandisingrules)
* [getLivePreview](#getlivepreview)
* [createAppPriceFactory](#createapppricefactory)
* [getAppPriceFactories](#getapppricefactories)
* [getAppPriceFactory](#getapppricefactory)
* [editAppPriceFactory](#editapppricefactory)
* [addProductsInPriceFactoryByZoneId](#addproductsinpricefactorybyzoneid)
* [getProductsInPriceFactoryByZoneId](#getproductsinpricefactorybyzoneid)
* [updateProductPriceByZoneInPriceFactory](#updateproductpricebyzoneinpricefactory)
* [createProductPriceFactoryBulkJob](#createproductpricefactorybulkjob)
* [pollProductPriceFactoryBulkJob](#pollproductpricefactorybulkjob)
* [validateProductPriceFactoryBulkJob](#validateproductpricefactorybulkjob)
* [processProductPriceFactoryBulkJob](#processproductpricefactorybulkjob)




## Methods with example and description



### getCatalogInsights
Analytics data of catalog and inventory.




```java
platformClient.application("<APPLICATION_ID>").catalog.getCatalogInsights( brand) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| brand | String? | no | Brand slug |  



Catalog Insights api returns the count of catalog related data like products, brands, departments and categories that have been made live as per configuration of the app.

*Returned Response:*




[CatalogInsightResponse](#CatalogInsightResponse)

Response Data




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "item": {
      "count": 637707,
      "out_of_stock_count": 452806,
      "sellable_count": 184901
    }
  }
}
```
</details>

</details>









---


### getApplicationBrandListing
List all the brands for the application




```java
platformClient.application("<APPLICATION_ID>").catalog.getApplicationBrandListing( pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with brand name.Use this parameter to search brands by  brand name. |  



A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Returned Response:*




[BrandListingResponse](#BrandListingResponse)

List of Brands. See example below or refer `BrandListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "uid": 33,
        "_custom_json": {},
        "_locale_language": {},
        "brand_banner_portrait_url": "/addsale/brands/pictures/portrait-banner/original/rFcp1aFv3-Portrait-Banner.png",
        "brand_banner_url": "/addsale/brands/pictures/landscape-banner/original/-_G-K35Iz-Landsacpe-Banner.png",
        "brand_logo_url": "/addsale/brands/pictures/square-logo/original/Wj9obvYLS-Logo.jpeg",
        "created_on": "2023-07-14T05:55:22.772000",
        "description": "Puma",
        "last_updated": "2023-07-17T07:18:27.181000",
        "name": "Puma",
        "priority": 100,
        "slug_key": "puma",
        "is_active": false,
        "departments": [
          2080,
          864,
          2,
          13763,
          26213,
          4657,
          26194,
          595,
          26,
          27,
          28,
          29
        ],
        "active": true
      }
    ],
    "page": {
      "current": 1,
      "type": "number",
      "size": 16,
      "has_previous": false,
      "has_next": true,
      "item_total": 187
    }
  }
}
```
</details>

</details>









---


### updateAppBrand
Update a single custom json.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppBrand( brandUid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to brand custom json. |   
| applicationId | String | yes | application id for which the custom_json is associated. |   
| brandUid | Integer | yes | brand id for which the custom_json is associated. |  
| body | [ApplicationBrandJson](#ApplicationBrandJson) | yes | Request body |


This API helps to update data associated to a item custom meta.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




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


### getApplicationBrands
List all the brands




```java
platformClient.application("<APPLICATION_ID>").catalog.getApplicationBrands( department,  pageNo,  pageSize,  q,  brandId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | no | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with brand name.Use this parameter to search brands by  brand name. |   
| brandId | Integer? | no | Helps to sort the brands list on the basis of uid list. |  



A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Returned Response:*




[BrandListingResponse](#BrandListingResponse)

List of Brands. See example below or refer `BrandListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "action": {
          "page": {
            "query": {
              "brand": [
                "Hess-Inc"
              ]
            },
            "type": "products"
          },
          "type": "page"
        },
        "banners": {
          "portrait": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/12537_9cdfc6835e814b0986ee1643d38cf6cd.png"
          }
        },
        "en_name": "Barry, Jennings and Larson",
        "logo": {
          "type": "image",
          "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
        },
        "name": "Barry, Jennings and Larson",
        "slug": "Hess-Inc",
        "uid": 1
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1,
      "total": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getCategories
List all the categories




```java
platformClient.application("<APPLICATION_ID>").catalog.getCategories( department) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| department | String? | no | The name of the department. Use this parameter to filter products by a particular department. See below the list of available departments. You can retrieve available departments from the **v1.0/departments/** API |  



List all the categories. You can optionally pass filter the brands by the department. If successful, returns a paginated list of brands specified in `CategoryListingResponse`

*Returned Response:*




[CategoryListingResponse](#CategoryListingResponse)

List of Categories. See example below or refer `CategoryListingResponse` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "department": "Cody-Doyle",
        "items": [
          {
            "_custom_json": {},
            "action": {
              "query": {
                "department": [
                  "Jaime-Chambers"
                ],
                "l1_category": [
                  "Janet-Parker"
                ]
              },
              "type": "category",
              "url": "https://api.addsale.com/platform/content/v1/products/?l1_category=Janet-Parker&department=Jaime-Chambers"
            },
            "childs": [
              {
                "_custom_json": {},
                "action": {
                  "query": {
                    "department": [
                      "Jaime-Chambers"
                    ],
                    "l2_category": [
                      "Hannah-Lawson"
                    ]
                  },
                  "type": "category",
                  "url": "https://api.addsale.com/platform/content/v1/products/?l2_category=Hannah-Lawson&department=Jaime-Chambers"
                },
                "childs": [
                  {
                    "_custom_json": {},
                    "action": {
                      "query": {
                        "category": [
                          "Logan-Black"
                        ],
                        "department": [
                          "Jaime-Chambers"
                        ]
                      },
                      "type": "category",
                      "url": "https://api.addsale.com/platform/content/v1/products/?category=Logan-Black&department=Jaime-Chambers"
                    },
                    "childs": [],
                    "image": {
                      "aspect_ratio": "13:20",
                      "aspect_ratio_f": 0.65,
                      "url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/banner_portrait/category/resize-w:130,h:200/12064_e69e1d8b5e934d3488f0dc8663d8a158.jpg"
                    },
                    "name": "Logan Black",
                    "slug": "Logan-Black",
                    "uid": 3
                  }
                ],
                "image": {
                  "aspect_ratio": "13:20",
                  "aspect_ratio_f": 0.65,
                  "url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/banner_portrait/category/resize-w:130,h:200/12064_e69e1d8b5e934d3488f0dc8663d8a158.jpg"
                },
                "name": "Hannah Lawson",
                "slug": "Hannah-Lawson",
                "uid": 2
              }
            ],
            "image": {
              "aspect_ratio": "13:20",
              "aspect_ratio_f": 0.65,
              "url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/banner_portrait/category/resize-w:130,h:200/12064_e69e1d8b5e934d3488f0dc8663d8a158.jpg"
            },
            "name": "Janet Parker",
            "slug": "Janet-Parker",
            "uid": 1
          }
        ]
      }
    ],
    "departments": [
      {
        "slug": "Cody-Doyle",
        "uid": 1
      }
    ]
  }
}
```
</details>

</details>









---


### getApplicationCategoryListing
List all the brands for the application




```java
platformClient.application("<APPLICATION_ID>").catalog.getApplicationCategoryListing( departmentId,  pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| departmentId | Integer? | no | A `department_id` is a unique identifier for a particular department. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with brand name.Use this parameter to search brands by  brand name. |  



A brand is the name under which a product is being sold. Use this API to list all the brands. You can pass optionally filter the brands by the department. If successful, returns a paginated list of brands specified in `BrandListingResponse`

*Returned Response:*




[BrandListingResponse](#BrandListingResponse)

List of Brands. See example below or refer `BrandListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "Orlo2697726021620232141437",
        "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/category/pictures/square-logo/original/JbCOnGP1n-logo.jpeg",
        "departments": [
          93
        ],
        "attr_name": "orlo2697726021620232141437",
        "landscape_url": "/x0/category/pictures/landscape-banner/original/_BEuMoujb-dl0fHhTai-landscape.jpeg",
        "portrait_url": "/x0/category/pictures/portrait-banner/original/Gn4HdXUWo-qF26AocDt-banner.jpeg",
        "_custom_json": {},
        "priority": 16,
        "created_by": {
          "username": "wildrider",
          "user_id": "-1"
        },
        "created_on": "2023-08-03T04:47:29.932000",
        "modified_by": {
          "username": "wildrider",
          "user_id": "-1"
        },
        "modified_on": "2023-08-03T04:47:29.932000",
        "app_id": "64aed475db2cfb5b8a9f623d",
        "is_active": true,
        "uid": 3300
      }
    ],
    "page": {
      "current": 1,
      "type": "number",
      "size": 10,
      "has_previous": false,
      "has_next": true,
      "item_total": 111
    }
  }
}
```
</details>

</details>









---


### updateAppCategory
Update a single custom json.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppCategory( categoryUid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to category custom json. |   
| applicationId | String | yes | application id for which the custom_json is associated. |   
| categoryUid | Integer | yes | category id for which the custom_json is associated. |  
| body | [ApplicationCategoryJson](#ApplicationCategoryJson) | yes | Request body |


This API helps to update data associated to a item custom meta.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




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


### createCollection
Add a Collection




```java
platformClient.application("<APPLICATION_ID>").catalog.createCollection(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateCollection](#CreateCollection) | yes | Request body |


Create a collection. See `CreateCollectionRequestSchema` for the list of attributes needed to create a collection and collections/query-options for the available options to create a collection. On successful request, returns a paginated list of collections specified in `CollectionCreateResponse`

*Returned Response:*




[CollectionCreateResponse](#CollectionCreateResponse)

List of all the collections including the one you added. See example below or refer `CollectionCreateResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "uid": "6561be32276bfeb0d50091bd",
    "type": "query",
    "query": [],
    "name": "test",
    "banners": {
      "portrait": {
        "type": "image",
        "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588858137/production/applications/app_000000000000000000000001/media/collection/portrait/xzuftshmmw4yuwzb12pm.png"
      },
      "landscape": {
        "type": "image",
        "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588857999/production/applications/app_000000000000000000000001/media/collection/landscape/avm7xibo2jgk8glc4bwl.png"
      }
    },
    "logo": {
      "type": "image",
      "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588857854/production/applications/app_000000000000000000000001/media/collection/logo/w9ns7nfgv7fk45xqrpoh.png"
    },
    "published": true,
    "description": "test-description",
    "is_active": true,
    "tags": [
      "Test Collection 123"
    ],
    "slug": "testslug",
    "action": {
      "page": {
        "type": "collection",
        "query": {
          "collection": [
            "testslug"
          ]
        }
      },
      "type": "page"
    },
    "allow_facets": true,
    "allow_sort": true,
    "visible_facets_keys": [],
    "meta": {},
    "badge": {
      "color": "#ffffff",
      "text": ""
    },
    "sort_on": "latest",
    "_custom_json": {},
    "_locale_language": {},
    "seo": {
      "title": "test",
      "description": "test-description",
      "breadcrumbs": [
        {}
      ],
      "sitemap": {
        "priority": 0.5,
        "frequency": "never"
      },
      "meta_tags": []
    },
    "is_visible": true,
    "priority": 7,
    "_schedule": {
      "start": "2023-11-25T09:25:11.831Z"
    },
    "app_id": "64aed377b1fd04565d0dff30"
  }
}
```
</details>

</details>









---


### getAllCollections
List all the collections




```java
platformClient.application("<APPLICATION_ID>").catalog.getAllCollections( q,  scheduleStatus,  type,  tag,  isActive,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| q | String? | no | Get collection list filtered by q string, |   
| scheduleStatus | String? | no | Get collection list filtered by scheduled status, |   
| type | String? | no | type of the collections |   
| tag | List<String>? | no | Each response will contain next_id param, which should be sent back to make pagination work. |   
| isActive | Boolean? | no | get collections filtered by active status. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



A Collection allows you to organize your products into hierarchical groups. For example, a dress might be in the category _Clothing_, the individual product might also be in the collection _Summer_. On successful request, returns all the collections as specified in `CollectionListingSchema`

*Returned Response:*




[GetCollectionListingResponse](#GetCollectionListingResponse)

List of collections. See example below or refer `GetCollectionListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 1
    },
    "items": [
      {
        "uid": "654334521e34d02409629ea0",
        "type": "query",
        "query": [
          {
            "op": "in",
            "attribute": "department",
            "value": [
              "aaa-department",
              "aaliyah1562455915820231137333",
              "aaliyah4434813615820231146891",
              "aaliyah4486972228620231333584"
            ]
          }
        ],
        "name": "Netflix Collection alpha1",
        "banners": {
          "portrait": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/item/free/original/4es27guDG-collection-landscape-banner.webp"
          },
          "landscape": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/item/free/original/S7zmowcXS-collection-landscape-banner.webp"
          }
        },
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/misc/pictures/free-icon/original/JPLCErr18-NetflixLogo2016.jpg"
        },
        "published": true,
        "description": "Testing Handpicked Collection",
        "is_active": true,
        "tags": [
          "Netflix Collection alpha1"
        ],
        "slug": "netflix-collection-alpha1",
        "action": {
          "page": {
            "type": "collection",
            "query": {
              "collection": [
                "netflix-collection-alpha1"
              ]
            }
          },
          "type": "page"
        },
        "allow_facets": true,
        "allow_sort": true,
        "visible_facets_keys": [],
        "meta": {},
        "badge": {
          "text": "Netflix Collection alpha1",
          "color": "#ffffff"
        },
        "sort_on": "latest",
        "_custom_json": {},
        "_locale_language": {},
        "seo": {
          "breadcrumbs": [
            {}
          ],
          "sitemap": {
            "frequency": "never",
            "priority": 0.5
          },
          "meta_tags": [],
          "title": "Netflix Collection alpha1",
          "description": "Netflix Collection alpha1"
        },
        "is_visible": true,
        "priority": 1,
        "_schedule": {
          "end": "9998-01-30T23:59:00Z",
          "start": "2023-11-02T05:29:35.667000Z",
          "next_schedule": [
            {
              "start": "2023-11-02T05:29:35.667000Z",
              "end": null
            }
          ]
        }
      }
    ],
    "filters": {
      "tags": [
        {
          "name": "Netflix Collection alpha1",
          "is_selected": false,
          "display": "Netflix Collection alpha1"
        }
      ],
      "type": [
        {
          "name": "items",
          "is_selected": false,
          "display": "items"
        },
        {
          "name": "query",
          "is_selected": false,
          "display": "query"
        }
      ]
    }
  }
}
```
</details>

</details>









---


### getQueryFilters
Get query filters to configure a collection




```java
platformClient.application("<APPLICATION_ID>").catalog.getQueryFilters() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



Get query filters to configure a collection

*Returned Response:*




[GetQueryFiltersResponse](#GetQueryFiltersResponse)

The attached items of an collection. See example below or refer `GetQueryFiltersResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "filters": [
      {
        "key": {
          "display": "Department",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Department.png",
          "name": "department"
        },
        "values": [
          {
            "count": 2113,
            "display": "Men's Fashion",
            "is_selected": false,
            "logo": {
              "type": "image",
              "url": "https://hdn-1.fynd.com/media/category_tab_icons/department/Men.png"
            },
            "value": "men"
          }
        ]
      },
      {
        "key": {
          "display": "Category",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Category.png",
          "name": "category"
        },
        "values": [
          {
            "count": 968,
            "display": "T-Shirts",
            "is_selected": false,
            "logo": "https://hdn-1.fynd.com/media/logo/category/original/15442_57fdc97abfd248aaaf8841f097a4ed67.jpg",
            "value": "192"
          }
        ]
      },
      {
        "key": {
          "display": "Category L1",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Category.png",
          "name": "category"
        },
        "values": [
          {
            "count": 968,
            "display": "T-Shirts",
            "is_selected": false,
            "logo": "https://hdn-1.fynd.com/media/logo/category/original/15442_57fdc97abfd248aaaf8841f097a4ed67.jpg",
            "value": "192"
          }
        ]
      },
      {
        "key": {
          "display": "Category L2",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Category.png",
          "name": "category"
        },
        "values": [
          {
            "count": 968,
            "display": "T-Shirts",
            "is_selected": false,
            "logo": "https://hdn-1.fynd.com/media/logo/category/original/15442_57fdc97abfd248aaaf8841f097a4ed67.jpg",
            "value": "192"
          }
        ]
      },
      {
        "key": {
          "display": "Size",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Sizes.png",
          "name": "sizes"
        },
        "values": [
          {
            "count": 1438,
            "display": "S",
            "is_selected": false,
            "value": "S"
          }
        ]
      },
      {
        "key": {
          "display": "Brand",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Brand%20ID.png",
          "name": "brand"
        },
        "values": [
          {
            "count": 4263,
            "display": "Superdry",
            "is_selected": false,
            "logo": "https://hdn-1.fynd.com/media/logo/brand/original/1008_238113b8e11448f792e9bf860aac30f2.jpg",
            "value": "235"
          }
        ]
      },
      {
        "key": {
          "display": "Rating",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Rating.png",
          "name": "rating"
        },
        "values": [
          {
            "count": 3,
            "display": "5 ★",
            "is_selected": false,
            "value": "[4 TO *}"
          }
        ]
      },
      {
        "key": {
          "display": "Company",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Store%20ID%20List.png",
          "name": "company_id_list"
        },
        "values": [
          {
            "count": 4262,
            "display": "RELIANCE BRANDS LIMITED",
            "is_selected": false,
            "value": "46"
          }
        ]
      },
      {
        "key": {
          "display": "Store Ids",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Store%20ID%20List.png",
          "name": "store_id_list"
        },
        "values": [
          {
            "count": 1385,
            "display": "PHOENIX, ,PALLADIUM,  LOWER PAREL - 5410",
            "is_selected": false,
            "value": "2201"
          }
        ]
      },
      {
        "key": {
          "display": "Image",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.png",
          "name": "image_nature"
        },
        "values": [
          {
            "count": 3111,
            "display": "Good Quality",
            "is_selected": false,
            "value": "standard"
          },
          {
            "count": 1152,
            "display": "No Image",
            "is_selected": false,
            "value": "default"
          }
        ]
      },
      {
        "key": {
          "display": "Set",
          "kind": "multivalued",
          "logo": "",
          "name": "is_set"
        },
        "values": [
          {
            "count": 4263,
            "display": "No",
            "is_selected": false,
            "value": false
          }
        ]
      },
      {
        "key": {
          "display": "Product Fit",
          "kind": "multivalued",
          "logo": "",
          "name": "product_fit"
        },
        "values": [
          {
            "count": 14,
            "display": "Regular",
            "is_selected": false,
            "value": "Regular"
          }
        ]
      },
      {
        "key": {
          "display": "Primary Material",
          "kind": "multivalued",
          "logo": "",
          "name": "primary_material"
        },
        "values": [
          {
            "count": 1246,
            "display": "Cotton",
            "is_selected": false,
            "value": "Cotton"
          }
        ]
      },
      {
        "key": {
          "display": "Gender",
          "kind": "multivalued",
          "logo": "",
          "name": "gender"
        },
        "values": [
          {
            "count": 2125,
            "display": "Men",
            "is_selected": false,
            "value": "Men"
          },
          {
            "count": 1492,
            "display": "Women",
            "is_selected": false,
            "value": "Women"
          }
        ]
      },
      {
        "key": {
          "display": "Primary Colour",
          "kind": "multivalued",
          "logo": "",
          "name": "primary_color"
        },
        "values": [
          {
            "count": 1403,
            "display": "Multi",
            "is_selected": false,
            "value": "Multi"
          }
        ]
      },
      {
        "key": {
          "display": "Size Depth",
          "kind": "range",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Size%20Depth.png",
          "name": "size_depth"
        },
        "values": [
          {
            "count": 4263,
            "display": "0 - 9",
            "display_format": "{} - {}",
            "is_selected": false,
            "max": 9,
            "min": 0,
            "query_format": "[{} TO {}]",
            "selected_max": 9,
            "selected_min": 0
          }
        ]
      },
      {
        "key": {
          "display": "Price",
          "kind": "range",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Min%20price%20effective.png",
          "name": "min_price_effective"
        },
        "values": [
          {
            "count": 4263,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "is_selected": false,
            "max": 24999,
            "min": 398,
            "query_format": "[{},INR TO {},INR]",
            "selected_max": 24998.77,
            "selected_min": 398.8
          }
        ]
      },
      {
        "key": {
          "display": "Discount",
          "kind": "range",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Platform%20Discount.png",
          "name": "platform_discount"
        },
        "values": [
          {
            "count": 4263,
            "display": "0 - 50",
            "display_format": "{} - {}",
            "is_selected": false,
            "max": 50,
            "min": 0,
            "query_format": "[{} TO {}]",
            "selected_max": 50,
            "selected_min": 0
          }
        ]
      }
    ],
    "sort_on": [
      {
        "display": "Latest Products",
        "is_selected": true,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Latest%20Products.png",
        "name": "Latest Products",
        "value": "latest"
      },
      {
        "display": "Popularity",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Popularity.png",
        "name": "Popularity",
        "value": "popular"
      },
      {
        "display": "Price Low to High",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Price%20High%20to%20Low.png",
        "name": "Price Low to High",
        "value": "price_asc"
      },
      {
        "display": "Price High to Low",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Price%20High%20to%20Low.png",
        "name": "Price High to Low",
        "value": "price_dsc"
      },
      {
        "display": "Discount Low to High",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Discount%20Low%20to%20High.png",
        "name": "Discount Low to High",
        "value": "discount_asc"
      },
      {
        "display": "Discount High to Low",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Discount%20Low%20to%20High.png",
        "name": "Discount High to Low",
        "value": "discount_dsc"
      },
      {
        "display": "Rating",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Rating.png",
        "name": "Rating",
        "value": "rating_dsc"
      },
      {
        "display": "Size Depth (High to Low)",
        "is_selected": false,
        "logo": "https://hdn-1.fynd.com/global/menu-icons/Size%20Depth.png",
        "name": "Size Depth (High to Low)",
        "value": "depth_desc"
      }
    ]
  }
}
```
</details>

</details>









---


### addCollectionItems
Add items to a collection




```java
platformClient.application("<APPLICATION_ID>").catalog.addCollectionItems( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier of a collection. |  
| body | [CollectionItemUpdateSchema](#CollectionItemUpdateSchema) | yes | Request body |


Adds items to a collection specified by its `id`. See `CollectionItemRequest` for the list of attributes needed to add items to an collection.

*Returned Response:*




[CommonResponseSchemaCollection](#CommonResponseSchemaCollection)

Status object. Tells whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "items updated"
  }
}
```
</details>

</details>









---


### getCollectionDetail
Get a particular collection




```java
platformClient.application("<APPLICATION_ID>").catalog.getCollectionDetail( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String | yes | A `slug` is a human readable, URL friendly unique identifier of an object. Pass the `slug` of the collection which you want to retrieve. |  



Get the details of a collection by its `slug`. If successful, returns a Collection resource in the response body specified in `CollectionDetailResponse`

*Returned Response:*




[GetCollectionDetailResponse](#GetCollectionDetailResponse)

The Collection object. See example below or refer `GetCollectionDetailResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "uid": "65620443a7d23306c5d75df2",
    "type": "query",
    "query": [
      {
        "attribute": "category",
        "value": [
          "aaa-cat3"
        ],
        "op": "in"
      }
    ],
    "name": "test2",
    "banners": {
      "portrait": {
        "type": "image",
        "url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/item/free/original/JA1Rvx-42-collection-landscape-banner.jpeg"
      },
      "landscape": {
        "type": "image",
        "url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/item/free/original/1Sl3BF0Y4-collection-landscape-banner.jpeg"
      }
    },
    "logo": {
      "type": "image",
      "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588857854/production/applications/app_000000000000000000000001/media/collection/logo/w9ns7nfgv7fk45xqrpoh.png"
    },
    "published": true,
    "description": "test-description-2",
    "is_active": true,
    "tags": [
      "Test Collection 123"
    ],
    "slug": "testslug2",
    "action": {
      "page": {
        "type": "collection",
        "query": {
          "collection": [
            "testslug2"
          ]
        }
      },
      "type": "page"
    },
    "allow_facets": true,
    "allow_sort": true,
    "visible_facets_keys": [],
    "meta": {},
    "badge": {
      "color": "#ffffff",
      "text": ""
    },
    "sort_on": "latest",
    "_custom_json": {},
    "_locale_language": {},
    "seo": {
      "description": "test-description2",
      "meta_tags": [
        {
          "title": "test-seo2",
          "items": []
        }
      ],
      "breadcrumbs": [
        {}
      ],
      "title": "test2",
      "sitemap": {
        "priority": 0.5,
        "frequency": "never"
      }
    },
    "is_visible": true,
    "priority": 7,
    "_schedule": {
      "end": "2023-11-25T17:38:45.569000Z",
      "next_schedule": [
        {
          "start": "2023-11-25T17:38:45.569000Z",
          "end": "2023-11-25T17:38:45.569000Z"
        }
      ],
      "start": "2023-11-25T17:38:45.569000Z"
    }
  }
}
```
</details>

</details>









---


### updateCollection
Update a collection




```java
platformClient.application("<APPLICATION_ID>").catalog.updateCollection( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier of a collection. |  
| body | [UpdateCollection](#UpdateCollection) | yes | Request body |


Update a collection by it's id. On successful request, returns the updated collection

*Returned Response:*




[UpdateCollection](#UpdateCollection)

The Collection object. See example below or refer `UpdateCollectionSchema` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_custom_json": {},
    "_locale_language": {},
    "_schedule": {
      "end": null,
      "next_schedule": [
        {
          "end": null,
          "start": "2021-03-15T12:51:21.333000+00:00Z"
        }
      ],
      "start": "2021-03-15T12:51:21.333000+00:00Z"
    },
    "action": {
      "page": {
        "query": {
          "collection": [
            "new"
          ]
        },
        "type": "collection"
      },
      "type": "page"
    },
    "allow_facets": true,
    "allow_sort": true,
    "badge": {
      "color": "#ffffff",
      "text": ""
    },
    "banners": {
      "landscape": {
        "type": "image",
        "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588857999/production/applications/app_000000000000000000000001/media/collection/landscape/avm7xibo2jgk8glc4bwl.png"
      },
      "portrait": {
        "type": "image",
        "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588858137/production/applications/app_000000000000000000000001/media/collection/portrait/xzuftshmmw4yuwzb12pm.png"
      }
    },
    "description": "",
    "is_active": true,
    "logo": {
      "type": "image",
      "url": "https://res.cloudinary.com/dwzm9bysq/image/upload/v1588857854/production/applications/app_000000000000000000000001/media/collection/logo/w9ns7nfgv7fk45xqrpoh.png"
    },
    "meta": {},
    "name": "New",
    "published": true,
    "query": {},
    "seo": {
      "description": "Test description",
      "title": "Test"
    },
    "slug": "new",
    "sort_on": "depth_desc",
    "tags": [],
    "type": "query",
    "uid": "604f585a7051e30001173ac1",
    "visible_facets_keys": []
  }
}
```
</details>

</details>









---


### deleteCollection
Delete a Collection




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteCollection( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier of a collection. |  



Delete a collection by it's id. Returns an object that tells whether the collection was deleted successfully

*Returned Response:*




[CommonResponseSchemaCollection](#CommonResponseSchemaCollection)

Status object. Tells whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Collection Deleted"
  }
}
```
</details>

</details>









---


### getApplicationDepartmentListing
List all the departments for the application




```java
platformClient.application("<APPLICATION_ID>").catalog.getApplicationDepartmentListing( pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with brand name.Use this parameter to search department by name. |  



Departments are a way to categorise similar products. A product can lie in multiple departments. For example, a skirt can below to the 'Women's Fashion' Department while a handbag can lie in 'Women's Accessories' Department. Use this API to list all the application departments. If successful, returns the list of departments specified in `ApplicationDepartmentListingResponse`

*Returned Response:*




[ApplicationDepartmentListingResponse](#ApplicationDepartmentListingResponse)

List of Departments. See example below or refer `BrandListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "action": {
          "page": {
            "query": {
              "brand": [
                "Hess-Inc"
              ]
            },
            "type": "products"
          },
          "type": "page"
        },
        "app_id": "000000000000000000000001",
        "banners": {
          "portrait": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/12537_9cdfc6835e814b0986ee1643d38cf6cd.png"
          }
        },
        "en_name": "Barry, Jennings and Larson",
        "logo": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg",
        "name": "Barry, Jennings and Larson",
        "slug": "Hess-Inc",
        "uid": 1
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1,
      "total": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### updateAppDepartment
Update a single custom json.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppDepartment( departmentUid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to department custom json. |   
| applicationId | String | yes | application id for which the custom_json is associated. |   
| departmentUid | Integer | yes | department id for which the custom_json is associated. |  
| body | [ApplicationDepartmentJson](#ApplicationDepartmentJson) | yes | Request body |


This API helps to update data associated to a item custom meta.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




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


### getConfigurationsFilterMetadata
Get filter details for application




```java
platformClient.application("<APPLICATION_ID>").catalog.getConfigurationsFilterMetadata( filter) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| filter | String | yes | Filter whose values needs to be fetched. |  



configured details for catalog.

*Returned Response:*




[FilterResponse](#FilterResponse)

Get application level filter details for metadata. See example below or refer `FilterResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "values": [
      {
        "text": "standard",
        "value": "standard"
      }
    ]
  }
}
```
</details>

</details>









---


### getDepartments
List all the departments




```java
platformClient.application("<APPLICATION_ID>").catalog.getDepartments() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



Departments are a way to categorise similar products. A product can lie in multiple departments. For example, a skirt can below to the 'Women's Fashion' Department while a handbag can lie in 'Women's Accessories' Department. Use this API to list all the departments. If successful, returns the list of departments specified in `DepartmentResponse`

*Returned Response:*




[DepartmentResponse](#DepartmentResponse)

List of Departments. See example below or refer `DepartmentResponse` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Zachary Harris",
        "priority_order": 7,
        "slug": "Zachary-Harris",
        "uid": 1
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Aaron Reilly",
        "priority_order": 7,
        "slug": "Aaron-Reilly",
        "uid": 2
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Bobby Sandoval",
        "priority_order": 7,
        "slug": "Bobby-Sandoval",
        "uid": 3
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Seth Hughes",
        "priority_order": 7,
        "slug": "Seth-Hughes",
        "uid": 4
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Michelle Moore",
        "priority_order": 7,
        "slug": "Michelle-Moore",
        "uid": 5
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Annette Baldwin",
        "priority_order": 7,
        "slug": "Annette-Baldwin",
        "uid": 6
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Chris Mata",
        "priority_order": 7,
        "slug": "Chris-Mata",
        "uid": 7
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Nicole Jacobs",
        "priority_order": 7,
        "slug": "Nicole-Jacobs",
        "uid": 8
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Pamela Smith",
        "priority_order": 7,
        "slug": "Pamela-Smith",
        "uid": 9
      },
      {
        "logo": {
          "type": "image",
          "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
        },
        "name": "Nicole Simon",
        "priority_order": 7,
        "slug": "Nicole-Simon",
        "uid": 10
      }
    ]
  }
}
```
</details>

</details>









---


### getAppInventory
Get the stock of a product




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppInventory( itemIds,  storeIds,  brandIds,  sellerIdentifiers,  timestamp,  pageSize,  pageId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| itemIds | List<Integer>? | no | The Item Id of the product. |   
| storeIds | List<Integer>? | no | The Store Id of products to fetch inventory. |   
| brandIds | List<Integer>? | no | The Brand Id of products to fetch inventory. |   
| sellerIdentifiers | List<String>? | no | Unique seller_identifier of the product. |   
| timestamp | String? | no | Timestamp in UTC format (2020-07-23T10:27:50Z) |   
| pageSize | Integer? | no | The number of items to retrieve in each page. |   
| pageId | String? | no | Page ID to retrieve next set of results. |  



Retrieve the available Inventory of the products. Use this API to get the Inventory status of products with the filters of timestamp, store_ids, brand_ids, item_id - Items - Pagination

*Returned Response:*




[InventoryStockResponse](#InventoryStockResponse)

Success. Returns the article/stock of the product stock.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_custom_json": {},
        "_id": "62d809eebeed53f4e27824b0",
        "brand": {
          "id": 2586
        },
        "company": {
          "id": 3
        },
        "country_of_origin": "India",
        "created_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "date_meta": {
          "added_on_store": 1658325486,
          "created_on": 1658325486,
          "inventory_updated_on": 1658325486,
          "modified_on": 1660913492
        },
        "dimension": {
          "height": 30,
          "is_default": true,
          "length": 10,
          "unit": "cm",
          "width": 20
        },
        "discount_applied": null,
        "expiration_date": "9998-01-30T23:59:00",
        "fragile": false,
        "fynd_article_code": "LS101269_11",
        "fynd_item_code": "LS101269",
        "identifier": {
          "ean": "LSRS401269"
        },
        "is_active": true,
        "is_set": false,
        "item_id": 7523701,
        "manufacturer": {
          "address": "POLARIS, 2ND FLOOR, ANDHERI, JSNLCA, MAHARASHTRA, THANE",
          "is_default": true,
          "name": "Test 21"
        },
        "meta": {
          "service": "Inventory Job"
        },
        "modified_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": true
        },
        "price": {
          "currency": "INR",
          "effective": 3250,
          "marked": 5000,
          "transfer": 0,
          "updated_at": "2022-07-20T13:58:06.122914+00:00"
        },
        "quantities": {
          "sellable": {
            "count": 100,
            "updated_at": 1658325486
          }
        },
        "raw_meta": {
          "fynd_identifier": "624_LSRS401269"
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "LSRS401269",
        "size": "11",
        "stage": "verified",
        "store": {
          "id": 624
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 100,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Load Galli, Mumbai"
            ],
            "name": "Load Company",
            "type": "Importer"
          }
        ],
        "uid": "624_LSRS401269",
        "weight": {
          "is_default": true,
          "shipping": 40,
          "unit": "gram"
        }
      },
      {
        "_custom_json": {},
        "_id": "62d809eebeed53f4e27824b2",
        "brand": {
          "id": 2586
        },
        "company": {
          "id": 3
        },
        "country_of_origin": "India",
        "created_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "date_meta": {
          "added_on_store": 1658325486,
          "created_on": 1658325486,
          "inventory_updated_on": 1658325486,
          "modified_on": 1660913492
        },
        "dimension": {
          "height": 30,
          "is_default": true,
          "length": 10,
          "unit": "cm",
          "width": 20
        },
        "discount_applied": null,
        "expiration_date": "9998-01-30T23:59:00",
        "fragile": false,
        "fynd_article_code": "LS101163_11",
        "fynd_item_code": "LS101163",
        "identifier": {
          "ean": "LSRS401163"
        },
        "is_active": true,
        "is_set": false,
        "item_id": 7523925,
        "manufacturer": {
          "address": "POLARIS, 2ND FLOOR, ANDHERI, JSNLCA, MAHARASHTRA, THANE",
          "is_default": true,
          "name": "Test 21"
        },
        "meta": {
          "service": "Inventory Job"
        },
        "modified_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": true
        },
        "price": {
          "currency": "INR",
          "effective": 3250,
          "marked": 5000,
          "transfer": 0,
          "updated_at": "2022-07-20T13:58:06.396235+00:00"
        },
        "quantities": {
          "sellable": {
            "count": 100,
            "updated_at": 1658325486
          }
        },
        "raw_meta": {
          "fynd_identifier": "624_LSRS401163"
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "LSRS401163",
        "size": "11",
        "stage": "verified",
        "store": {
          "id": 624
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 100,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Load Galli, Mumbai"
            ],
            "name": "Load Company",
            "type": "Importer"
          }
        ],
        "uid": "624_LSRS401163",
        "weight": {
          "is_default": true,
          "shipping": 40,
          "unit": "gram"
        }
      },
      {
        "_custom_json": {},
        "_id": "62d809eebeed53f4e27824b4",
        "brand": {
          "id": 2586
        },
        "company": {
          "id": 3
        },
        "country_of_origin": "India",
        "created_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "date_meta": {
          "added_on_store": 1658325486,
          "created_on": 1658325486,
          "inventory_updated_on": 1658325486,
          "modified_on": 1660913492
        },
        "dimension": {
          "height": 30,
          "is_default": true,
          "length": 10,
          "unit": "cm",
          "width": 20
        },
        "discount_applied": null,
        "expiration_date": "9998-01-30T23:59:00",
        "fragile": false,
        "fynd_article_code": "LS101173_11",
        "fynd_item_code": "LS101173",
        "identifier": {
          "ean": "LSRS401173"
        },
        "is_active": true,
        "is_set": false,
        "item_id": 7523691,
        "manufacturer": {
          "address": "POLARIS, 2ND FLOOR, ANDHERI, JSNLCA, MAHARASHTRA, THANE",
          "is_default": true,
          "name": "Test 21"
        },
        "meta": {
          "service": "Inventory Job"
        },
        "modified_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": true
        },
        "price": {
          "currency": "INR",
          "effective": 3250,
          "marked": 5000,
          "transfer": 0,
          "updated_at": "2022-07-20T13:58:06.635248+00:00"
        },
        "quantities": {
          "sellable": {
            "count": 100,
            "updated_at": 1658325486
          }
        },
        "raw_meta": {
          "fynd_identifier": "624_LSRS401173"
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "LSRS401173",
        "size": "11",
        "stage": "verified",
        "store": {
          "id": 624
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 100,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Load Galli, Mumbai"
            ],
            "name": "Load Company",
            "type": "Importer"
          }
        ],
        "uid": "624_LSRS401173",
        "weight": {
          "is_default": true,
          "shipping": 40,
          "unit": "gram"
        }
      },
      {
        "_custom_json": {},
        "_id": "62d809eebeed53f4e27824b6",
        "brand": {
          "id": 2586
        },
        "company": {
          "id": 3
        },
        "country_of_origin": "India",
        "created_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "date_meta": {
          "added_on_store": 1658325486,
          "created_on": 1658325486,
          "inventory_updated_on": 1658325486,
          "modified_on": 1660913492
        },
        "dimension": {
          "height": 30,
          "is_default": true,
          "length": 10,
          "unit": "cm",
          "width": 20
        },
        "discount_applied": null,
        "expiration_date": "9998-01-30T23:59:00",
        "fragile": false,
        "fynd_article_code": "LS101198_11",
        "fynd_item_code": "LS101198",
        "identifier": {
          "ean": "LSRS401198"
        },
        "is_active": true,
        "is_set": false,
        "item_id": 7524280,
        "manufacturer": {
          "address": "POLARIS, 2ND FLOOR, ANDHERI, JSNLCA, MAHARASHTRA, THANE",
          "is_default": true,
          "name": "Test 21"
        },
        "meta": {
          "service": "Inventory Job"
        },
        "modified_by": {
          "user_id": "2a00eecae43d7e7f4340e7cf",
          "username": "mohitkhare_gofynd_com_12594"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": true
        },
        "price": {
          "currency": "INR",
          "effective": 3250,
          "marked": 5000,
          "transfer": 0,
          "updated_at": "2022-07-20T13:58:06.898687+00:00"
        },
        "quantities": {
          "sellable": {
            "count": 100,
            "updated_at": 1658325486
          }
        },
        "raw_meta": {
          "fynd_identifier": "624_LSRS401198"
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "LSRS401198",
        "size": "11",
        "stage": "verified",
        "store": {
          "id": 624
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 100,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Load Galli, Mumbai"
            ],
            "name": "Load Company",
            "type": "Importer"
          }
        ],
        "uid": "624_LSRS401198",
        "weight": {
          "is_default": true,
          "shipping": 40,
          "unit": "gram"
        }
      }
    ],
    "page": {
      "has_next": true,
      "has_previous": true,
      "item_total": 1714,
      "next_id": "62d809eebeed53f4e27824b6",
      "type": "cursor"
    }
  }
}
```
</details>

</details>









---


### getAppLocations
Get list of locations




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppLocations( storeType,  uid,  q,  stage,  pageNo,  pageSize,  tags,  storeTypes,  companyUids) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company whose locations are to fetched |   
| applicationId | String | yes | Id of the application whose locations are to fetched |   
| storeType | String? | no | Helps to sort the location list on the basis of location type. |   
| uid | String? | no | Helps to sort the location list on the basis of uid list. |   
| q | String? | no | Query that is to be searched. |   
| stage | String? | no | to filter companies on basis of verified or unverified companies. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 20. |   
| tags | List<String>? | no | Get locations filtered by tags. |   
| storeTypes | List<String>? | no | Get locations filtered by store types. |   
| companyUids | List<Integer>? | no | Filter stores by company IDs available in the application. |  



This API allows to view all the locations asscoiated to a application.

*Returned Response:*




[LocationListSerializer](#LocationListSerializer)

Company profile object. See example below or refer `LocationListSerializer` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "filters": [],
    "items": [
      {
        "address": {
          "address1": "POLARIS 2ND FLOOR, ANDHERI",
          "address2": "",
          "city": "MUMBAI",
          "country": "INDIA",
          "landmark": "",
          "lat_long": {
            "coordinates": [
              72.8776559,
              19.0759837
            ],
            "type": "Point"
          },
          "pincode": 400001,
          "state": "MAHARASHTRA"
        },
        "code": "",
        "company_id": 2,
        "display_name": "Test",
        "name": "Test",
        "phone_number": "",
        "store_code": "HS-a0c85",
        "store_type": "high_street",
        "uid": 2
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 3,
      "size": 3,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getConfigurations
Get configured details for catalog




```java
platformClient.application("<APPLICATION_ID>").catalog.getConfigurations() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



configured details for catalog.

*Returned Response:*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

Get application level configured catalog details. See example below or refer `GetAppCatalogConfigurationSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "app_id": "000000000000000000000001",
      "config_id": "000000000000000000000001",
      "config_type": "app",
      "listing": {
        "filter": {
          "allow_single": false,
          "attribute_config": [
            {
              "is_active": true,
              "key": "gender",
              "name": "Gender",
              "priority": 1,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {},
                "sort": "count",
                "value": ""
              }
            },
            {
              "is_active": true,
              "key": "min_price_effective",
              "name": "Price",
              "priority": 2,
              "type": "range",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "< 500": "Below Rs. 500",
                  ">= 6000": "Above Rs. 6000"
                },
                "sort": "count",
                "value": ""
              }
            },
            {
              "is_active": true,
              "key": "departments",
              "name": "Department",
              "priority": 3,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {},
                "sort": "count",
                "value": "metadata"
              }
            },
            {
              "is_active": true,
              "key": "brand_id",
              "name": "Brand",
              "priority": 4,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "5th Avenue": "A {{value}}"
                },
                "sort": "ascending",
                "value": "metadata"
              }
            },
            {
              "is_active": false,
              "key": "season",
              "name": "Season",
              "priority": 5,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "": ""
                },
                "sort": "count",
                "value": ""
              }
            },
            {
              "is_active": true,
              "key": "is_set",
              "name": "Set",
              "priority": 6,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "false": "No",
                  "true": "Yes"
                },
                "sort": "descending",
                "value": ""
              }
            },
            {
              "is_active": true,
              "key": "rating",
              "name": "Rating",
              "priority": 7,
              "type": "multivalued",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "": ""
                },
                "sort": "count",
                "value": ""
              }
            },
            {
              "is_active": true,
              "key": "size_depth",
              "name": "Size Depth",
              "priority": 8,
              "type": "range",
              "value_config": {
                "bucket_points": [],
                "condition": "OR",
                "map": {
                  "{} - {}": "{} - {}"
                },
                "sort": "count",
                "value": ""
              }
            }
          ]
        },
        "sort": {
          "config": [
            {
              "is_active": false,
              "key": "price_dsc",
              "logo": "https://hdn-1.fynd.com/global/menu-icons/Price%20High%20to%20Low.png",
              "name": "Price High to Low",
              "priority": 1
            },
            {
              "is_active": true,
              "key": "rating_dsc",
              "logo": "https://hdn-1.fynd.com/global/menu-icons/Rating.png",
              "name": "Rating",
              "priority": 2
            },
            {
              "is_active": true,
              "key": "depth_desc",
              "name": "Size Depth (High to Low)",
              "priority": 3
            },
            {
              "is_active": true,
              "key": "discount_dsc",
              "logo": "https://hdn-1.fynd.com/global/menu-icons/Discount%20Low%20to%20High.png",
              "name": "Discount High to Low",
              "priority": 4
            },
            {
              "is_active": true,
              "key": "popular",
              "logo": "https://hdn-1.fynd.com/global/menu-icons/Popularity.png",
              "name": "Popularity",
              "priority": 5
            },
            {
              "is_active": true,
              "key": "relevance",
              "name": "Relevance",
              "priority": 6
            },
            {
              "is_active": true,
              "key": "price_asc",
              "logo": "https://hdn-1.fynd.com/global/menu-icons/Price%20Low%20to%20High.png",
              "name": "Price Low to High",
              "priority": 7
            }
          ],
          "default_key": ""
        }
      },
      "product": {
        "similar": {
          "config": [
            {
              "is_active": true,
              "key": "seller",
              "priority": 1,
              "size": {
                "max": 10,
                "min": 2
              },
              "subtitle": "",
              "title": "Seller"
            },
            {
              "is_active": true,
              "key": "visual",
              "priority": 2,
              "size": {
                "max": 10,
                "min": 2
              },
              "subtitle": "",
              "title": "Visual"
            },
            {
              "is_active": true,
              "key": "brand",
              "priority": 3,
              "size": {
                "max": 10,
                "min": 2
              },
              "subtitle": "",
              "title": "Brand"
            },
            {
              "is_active": true,
              "key": "specs",
              "priority": 4,
              "size": {
                "max": 10,
                "min": 2
              },
              "subtitle": "",
              "title": "Specs"
            }
          ]
        },
        "variant": {
          "config": [
            {
              "display_type": "image",
              "is_active": true,
              "key": "color",
              "name": "Additional Colors12",
              "priority": 1,
              "size": {
                "max": 10,
                "min": 2
              }
            },
            {
              "display_type": "text",
              "is_active": true,
              "key": "storage",
              "name": "Memory",
              "priority": 2,
              "size": {
                "max": 10,
                "min": 2
              }
            },
            {
              "display_type": "image",
              "is_active": true,
              "key": "visual",
              "name": "Additional Colors",
              "priority": 3,
              "size": {
                "max": 10,
                "min": 2
              }
            },
            {
              "display_type": "text",
              "is_active": true,
              "key": "ram_storage",
              "name": "Ram_Storage",
              "priority": 4,
              "size": {
                "max": 10,
                "min": 2
              }
            },
            {
              "display_type": "color",
              "is_active": true,
              "key": "shade",
              "name": "Additional Shades",
              "priority": 5,
              "size": {
                "max": 10,
                "min": 2
              }
            },
            {
              "display_type": "text",
              "is_active": true,
              "key": "water_resistant",
              "name": "Water_Resistant",
              "priority": 6,
              "size": {
                "max": 10,
                "min": 2
              }
            }
          ]
        }
      }
    },
    "is_default": false
  }
}
```
</details>

</details>









---


### createConfigurationProductListing
Add configuration for products & listings




```java
platformClient.application("<APPLICATION_ID>").catalog.createConfigurationProductListing(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [AppConfiguration](#AppConfiguration) | yes | Request body |


Add configuration for products & listing.

*Returned Response:*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "type": "exampleType",
      "config_type": "app",
      "created_by": {
        "user_id": "exampleUserId",
        "username": "exampleUsername"
      },
      "app_id": "000000000000000000000001",
      "modified_by": {
        "username": "rohanshah@fynd.com",
        "user_id": "5e199e6998cfe1776f1385dc"
      },
      "product": {
        "variant": {
          "config": [
            {
              "key": "example_variant",
              "priority": 1,
              "name": "Example Variant",
              "size": {
                "min": 5,
                "max": 15
              },
              "display_type": "example_display_type",
              "is_active": true,
              "logo": "https://example.com/variant_logo.png"
            }
          ]
        },
        "similar": {
          "config": [
            {
              "key": "cushion-colour",
              "priority": 27,
              "size": {
                "min": 1,
                "max": 10
              },
              "subtitle": "Example Subtitle",
              "is_active": true,
              "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/misc/default-assets/original/popular.png",
              "title": "Example Title"
            }
          ]
        }
      },
      "listing": {
        "filter": {
          "allow_single": false,
          "attribute_config": [
            {
              "key": "cushion-colour",
              "type": "multivalued",
              "priority": 27,
              "name": "Cushion Colour",
              "value_config": {
                "condition": "OR",
                "map": {},
                "value": "",
                "bucket_points": [],
                "sort": "count"
              },
              "is_active": true,
              "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/misc/default-assets/original/popular.png"
            }
          ]
        },
        "sort": {
          "config": [
            {
              "key": "example_sort",
              "priority": 1,
              "name": "Example Sort",
              "is_active": true,
              "logo": "https://example.com/sort_logo.png"
            }
          ],
          "default_key": "example_sort"
        }
      },
      "config_id": "000000000000000000000001",
      "modified_on": "2023-12-04T06:35:57.161782"
    }
  }
}
```
</details>

</details>









---


### getCatalogConfiguration
Get configuration meta  details for catalog for admin panel




```java
platformClient.application("<APPLICATION_ID>").catalog.getCatalogConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



configuration meta  details for catalog.

*Returned Response:*




[GetCatalogConfigurationMetaData](#GetCatalogConfigurationMetaData)

configuration details for catalog. See example below or refer `GetCatalogConfigurationMetaDataSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "listing": {
      "sort": {
        "data": [
          {
            "key": "latest",
            "display": "Latest"
          },
          {
            "key": "popular",
            "display": "Popular"
          },
          {
            "key": "price_asc",
            "display": "Price Low to High"
          },
          {
            "key": "price_dsc",
            "display": "Price High to Low"
          },
          {
            "key": "discount_asc",
            "display": "Discount Low to High"
          },
          {
            "key": "discount_dsc",
            "display": "Discount High to Low"
          },
          {
            "key": "relevance",
            "display": "Relevance"
          },
          {
            "key": "depth_desc",
            "display": "Size Depth (High to Low)"
          }
        ]
      },
      "filter": {
        "data": [
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "brand",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "country_of_origin",
            "display": "Country Of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "image_nature",
            "display": "Image Type",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "sizes",
            "display": "Sizes",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "discount",
            "display": "Discount",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "rating",
            "display": "Rating",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "min_price_effective",
            "display": "Price",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "departments",
            "display": "Department",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "l3_category_slugs",
            "display": "Category",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "brand_slug",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "size_depth",
            "display": "Size Depth",
            "filter_types": [
              "multivalued",
              "range"
            ]
          },
          {
            "key": "is_set",
            "display": "Set",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "is_available",
            "display": "Available",
            "filter_types": [
              "singlevalued"
            ]
          }
        ],
        "values": {
          "type": [
            {
              "key": "range",
              "display": "Range Bar"
            },
            {
              "key": "intervals",
              "display": "Bucket Values"
            },
            {
              "key": "multivalued",
              "display": "Single"
            },
            {
              "key": "singlevalued",
              "display": "Single"
            }
          ],
          "sort": [
            {
              "key": "count",
              "display": "Product Count"
            },
            {
              "key": "ascending",
              "display": "Ascending"
            },
            {
              "key": "descending",
              "display": "Descending"
            }
          ]
        },
        "condition": [
          {
            "key": "OR",
            "display": "OR"
          },
          {
            "key": "AND",
            "display": "AND"
          }
        ]
      }
    },
    "product": {
      "compare": {
        "data": [
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "brand",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "country_of_origin",
            "display": "Country Of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "image_nature",
            "display": "Image Type",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "sizes",
            "display": "Sizes",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "discount",
            "display": "Discount",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "rating",
            "display": "Rating",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "min_price_effective",
            "display": "Price",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "departments",
            "display": "Department",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "l3_category_slugs",
            "display": "Category",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "brand_slug",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "size_depth",
            "display": "Size Depth",
            "filter_types": [
              "multivalued",
              "range"
            ]
          },
          {
            "key": "is_set",
            "display": "Set",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "is_available",
            "display": "Available",
            "filter_types": [
              "singlevalued"
            ]
          }
        ]
      },
      "similar": {
        "data": [
          {
            "key": "brand",
            "display": "Brand"
          },
          {
            "key": "category",
            "display": "Category"
          },
          {
            "key": "price",
            "display": "Price"
          },
          {
            "key": "specs",
            "display": "Specs"
          },
          {
            "key": "seller",
            "display": "Seller"
          },
          {
            "key": "compare",
            "display": "Most Compared"
          }
        ]
      },
      "variant": {
        "data": [
          {
            "key": "test",
            "display": "Test"
          }
        ]
      },
      "detail": {
        "data": [
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "brand",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "country_of_origin",
            "display": "Country Of Origin",
            "filter_types": [
              "multivalued"
            ],
            "units": []
          },
          {
            "key": "image_nature",
            "display": "Image Type",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "sizes",
            "display": "Sizes",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "discount",
            "display": "Discount",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "rating",
            "display": "Rating",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "min_price_effective",
            "display": "Price",
            "filter_types": [
              "range",
              "intervals",
              "multivalued"
            ]
          },
          {
            "key": "departments",
            "display": "Department",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "l3_category_slugs",
            "display": "Category",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "brand_slug",
            "display": "Brand",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "size_depth",
            "display": "Size Depth",
            "filter_types": [
              "multivalued",
              "range"
            ]
          },
          {
            "key": "is_set",
            "display": "Set",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "country_of_origin",
            "display": "Country of Origin",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "item_code",
            "display": "Item Code",
            "filter_types": [
              "multivalued"
            ]
          },
          {
            "key": "is_available",
            "display": "Available",
            "filter_types": [
              "singlevalued"
            ]
          }
        ],
        "values": {
          "display_type": [
            {
              "key": "text",
              "display": "Text"
            },
            {
              "key": "paragraph",
              "display": "Paragraph"
            },
            {
              "key": "html",
              "display": "HTML"
            }
          ]
        }
      }
    }
  }
}
```
</details>

</details>









---


### getConfigurationByType
Get configured details for catalog




```java
platformClient.application("<APPLICATION_ID>").catalog.getConfigurationByType( type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String | yes | type can be brands, categories etc. |  



configured details for catalog.

*Returned Response:*




[GetAppCatalogEntityConfiguration](#GetAppCatalogEntityConfiguration)

Get application level configured catalog details. See example below or refer `GetAppCatalogEntityConfigurationSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "listing": {
        "categories": {
          "config": [
            {
              "key": "2",
              "name": "hello2",
              "logo": "http://cdn4.gofynd.com/media/banner/category/original/12063_a5bb91bd5cb44c3c9db98c2a0e6b3d99.jpg",
              "is_active": true,
              "banners": [
                {
                  "department": 1,
                  "portrait_url": "http://cdn4.gofynd.com/media/banner/category/original/12063_a5bb91bd5cb44c3c9db98c2a0e6b3d99.jpg",
                  "landscape_url": "http://cdn4.gofynd.com/media/banner_portrait/category/original/12064_e69e1d8b5e934d3488f0dc8663d8a158.jpg"
                }
              ],
              "_custom_json": {}
            }
          ]
        }
      }
    },
    "is_default": true
  }
}
```
</details>

</details>









---


### createConfigurationByType
Add configuration for categories and brands




```java
platformClient.application("<APPLICATION_ID>").catalog.createConfigurationByType( type, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| type | String | yes | type can be brands, categories etc. |  
| body | [AppConfiguration](#AppConfiguration) | yes | Request body |


Add configuration for categories & brands.

*Returned Response:*




[GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "product": {
        "details_groups": {
          "config": [
            {
              "is_active": true,
              "template_slugs": [
                "activewear-accessories",
                "baby-care",
                "bags",
                "beauty-and-personal-care",
                "books",
                "bottomwear",
                "cable-cords-and-accessories",
                "camera-and-accessories",
                "car-and-motorbike",
                "computer-and-laptops",
                "electrical-equipments",
                "electronic-accessories",
                "ethnicwear",
                "extended-warranty",
                "fashion-accessories",
                "footwear",
                "grocery",
                "home-and-kitchen-appliances",
                "home-and-living",
                "industrial-supplies",
                "innerwear-and-sleepwear",
                "jewellery",
                "kids-accessories",
                "kids-furniture",
                "lighting-and-accessories",
                "mobiles-and-tablets",
                "office-stationery",
                "snacks-and-beverages",
                "sports-accessories",
                "sunglasses-and-frames",
                "supplementary",
                "swimwear",
                "switches-and-fuses",
                "television-and-audio-systems",
                "topwear",
                "toys-and-games",
                "video-games",
                "watches-and-wearables"
              ],
              "slug": "product-details",
              "priority": 1,
              "attributes": [
                {
                  "is_active": true,
                  "slug": "gender",
                  "priority": 78,
                  "display_type": "text",
                  "name": "Gender"
                },
                {
                  "is_active": true,
                  "slug": "color",
                  "priority": 77,
                  "display_type": "text",
                  "name": "Colour"
                },
                {
                  "is_active": true,
                  "slug": "material",
                  "priority": 7,
                  "display_type": "text",
                  "name": "Material"
                }
              ],
              "name": "Product Details"
            },
            {
              "is_active": true,
              "template_slugs": [
                "activewear-accessories",
                "baby-care",
                "bags",
                "beauty-and-personal-care",
                "books",
                "bottomwear",
                "cable-cords-and-accessories",
                "camera-and-accessories",
                "car-and-motorbike",
                "computer-and-laptops",
                "electrical-equipments",
                "electronic-accessories",
                "ethnicwear",
                "extended-warranty",
                "fashion-accessories",
                "footwear",
                "grocery",
                "home-and-kitchen-appliances",
                "home-and-living",
                "industrial-supplies",
                "innerwear-and-sleepwear",
                "jewellery",
                "kids-accessories",
                "kids-furniture",
                "lighting-and-accessories",
                "mobiles-and-tablets",
                "office-stationery",
                "snacks-and-beverages",
                "sports-accessories",
                "sunglasses-and-frames",
                "supplementary",
                "swimwear",
                "switches-and-fuses",
                "television-and-audio-systems",
                "topwear",
                "toys-and-games",
                "video-games",
                "watches-and-wearables"
              ],
              "slug": "product-identifiers",
              "priority": 2,
              "attributes": [
                {
                  "is_active": true,
                  "key": "item_code",
                  "slug": "item_code",
                  "priority": 3,
                  "display_type": "details",
                  "name": "Item Code"
                },
                {
                  "is_active": true,
                  "key": "product_identifiers",
                  "slug": "product_identifiers",
                  "priority": 11,
                  "display_type": "details",
                  "name": "Product Identifiers"
                },
                {
                  "is_active": true,
                  "key": "variant",
                  "slug": "variant",
                  "priority": 93,
                  "display_type": "details",
                  "name": "Variant"
                }
              ],
              "name": "Product Identifiers"
            },
            {
              "is_active": true,
              "template_slugs": [
                "activewear-accessories",
                "baby-care",
                "ethnicwear",
                "extended-warranty",
                "fashion-accessories",
                "footwear",
                "grocery",
                "home-and-kitchen-appliances",
                "home-and-living",
                "industrial-supplies",
                "innerwear-and-sleepwear",
                "jewellery",
                "kids-accessories",
                "kids-furniture",
                "lighting-and-accessories",
                "mobiles-and-tablets",
                "office-stationery",
                "snacks-and-beverages",
                "sports-accessories",
                "sunglasses-and-frames",
                "supplementary",
                "swimwear",
                "switches-and-fuses",
                "television-and-audio-systems",
                "topwear",
                "toys-and-games",
                "video-games",
                "watches-and-wearables"
              ],
              "slug": "general-information",
              "priority": 3,
              "attributes": [
                {
                  "is_active": true,
                  "key": "general_information",
                  "slug": "general_information",
                  "priority": 4,
                  "display_type": "text",
                  "name": "General Information"
                }
              ],
              "name": "General Information"
            }
          ]
        }
      },
      "app_id": "000000000000000000000001",
      "config_type": "details_groups",
      "listing": {},
      "modified_on": "2023-11-28T16:15:57.432632",
      "modified_by": {
        "username": "app@fynd.com",
        "user_id": "000000000000000016841367"
      },
      "created_on": "2023-11-28T16:15:57.432636",
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "000000000000000016841367"
      }
    }
  }
}
```
</details>

</details>









---


### getAppProduct
Get company application product data.




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppProduct( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| itemId | Integer | yes | product id for a particular product. |  



Products are the core resource of an application. If successful, returns a Company Application Product resource in the response body depending upon filter sent.

*Returned Response:*




[OwnerAppItemResponse](#OwnerAppItemResponse)

The Company Applicaton Product Data(MOQ/SEO).




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "alt_text": {
      "https://test-url.com/test.png": "test-alt"
    },
    "is_cod": false,
    "is_gift": false,
    "moq": {
      "increment_unit": 2,
      "maximum": 10,
      "minimum": 1
    },
    "seo": {
      "description": "test-description",
      "title": "test-title",
      "breadcrumbs": [],
      "sitemap": {},
      "meta_tags": []
    },
    "size_promotion_threshold": {
      "threshold_type": "flat",
      "threshold_value": 100
    }
  }
}
```
</details>

</details>









---


### updateAppProduct
Update a single custom meta.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppProduct( itemId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to custom meta. |   
| applicationId | String | yes | application id for which the custom_meta is associated. |   
| itemId | Integer | yes | product id for which the custom_meta is associated. |  
| body | [ApplicationItemMeta](#ApplicationItemMeta) | yes | Request body |


This API helps to update data associated to a item custom meta.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




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


### getAppicationProducts
List the products




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppicationProducts( q,  f,  c,  filters,  isDependent,  sortOn,  pageId,  pageSize,  pageNo,  pageType,  itemIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| q | String? | no | The search query. This can be a partial or complete name of a either a product, brand or category |   
| f | String? | no | The search filter parameters. All the parameter filtered from filter parameters will be passed in **f** parameter in this format. **?f=brand:voi-jeans\|\|and:::category:t-shirts\|\|shirts** |   
| c | String? | no | The search filter parameters for collection items. All the parameter filtered from filter parameters will be passed in **c** parameter in this format. **?c=brand:in:voi-jeans\|and:::category:nin:t-shirts\|shirts** |   
| filters | Boolean? | no | Pass `filters` parameter to fetch the filter details. This flag is used to fetch all filters |   
| isDependent | Boolean? | no | This query parameter is used to get the dependent products in the listing. |   
| sortOn | String? | no | The order to sort the list of products on. The supported sort parameters are popularity, price, redemption and discount in either ascending or descending order. See the supported values below. |   
| pageId | String? | no | Each response will contain **page_id** param, which should be sent back to make pagination work. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| pageNo | Integer? | no | If page_type is number then pass it to fetch page items. Default is 1. |   
| pageType | String? | no | For pagination type should be cursor or number. Default is cursor. |   
| itemIds | List<String>? | no | Item Ids of product |  



List all the products associated with a brand, collection or category in a requested sort order. The API additionally supports arbitrary search queries that may refer the name of any product, brand, category or collection. If successful, returns a paginated list of products specified in `ApplicationProductListingResponse`

*Returned Response:*




[ApplicationProductListingResponse](#ApplicationProductListingResponse)

List of Products. See example below or refer `ApplicationProductListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "filters": [
      {
        "key": {
          "display": "Department",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Department.svg",
          "name": "department"
        },
        "values": [
          {
            "count": 15,
            "display": "Debra Villarreal",
            "is_selected": false,
            "logo": {
              "type": "image",
              "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
            },
            "value": "Debra-Villarreal"
          },
          {
            "count": 15,
            "display": "Tracey Miller",
            "is_selected": false,
            "logo": {
              "type": "image",
              "url": "http://cdn4.gofynd.com/media/category_tab_icons/department/Men.png"
            },
            "value": "Tracey-Miller"
          }
        ]
      },
      {
        "key": {
          "display": "Category",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Category.svg",
          "name": "category"
        },
        "values": [
          {
            "count": 15,
            "display": "Amy Kim DDS",
            "is_selected": false,
            "logo": "http://cdn4.gofynd.com/media/banner/category/original/12063_a5bb91bd5cb44c3c9db98c2a0e6b3d99.jpg",
            "value": "3"
          }
        ]
      },
      {
        "key": {
          "display": "Gender",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Gender.svg",
          "name": "gender"
        },
        "values": [
          {
            "count": 15,
            "display": "Men",
            "is_selected": false,
            "value": "men"
          },
          {
            "count": 15,
            "display": "Women",
            "is_selected": false,
            "value": "women"
          }
        ]
      },
      {
        "key": {
          "display": "Size",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Sizes.svg",
          "name": "sizes"
        },
        "values": [
          {
            "count": 15,
            "display": "13",
            "is_selected": false,
            "value": "13"
          }
        ]
      },
      {
        "key": {
          "display": "Brand",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Brand%20ID.svg",
          "name": "brand"
        },
        "values": [
          {
            "count": 15,
            "display": "Barry, Jennings and Larson",
            "is_selected": false,
            "logo": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg",
            "value": "1"
          }
        ]
      },
      {
        "key": {
          "display": "Rating",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/Rating.svg",
          "name": "rating"
        },
        "values": [
          {
            "count": 15,
            "display": "2 - 3",
            "is_selected": false,
            "value": "[2 TO 3}"
          }
        ]
      },
      {
        "key": {
          "display": "Image",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "image_nature"
        },
        "values": [
          {
            "count": 15,
            "display": "GoodQuality",
            "is_selected": false,
            "value": "standard"
          }
        ]
      },
      {
        "key": {
          "display": "Monica Hampton",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "material"
        },
        "values": [
          {
            "count": 15,
            "display": "Neoprene",
            "is_selected": false,
            "value": "Neoprene"
          }
        ]
      },
      {
        "key": {
          "display": "John Mendoza",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "weight"
        },
        "values": [
          {
            "count": 15,
            "display": "100",
            "is_selected": false,
            "value": "100"
          }
        ]
      },
      {
        "key": {
          "display": "Kimberly Mcdaniel",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "gender"
        },
        "values": [
          {
            "count": 15,
            "display": "['Men', 'Women']",
            "is_selected": false,
            "value": "['Men', 'Women']"
          }
        ]
      },
      {
        "key": {
          "display": "Kimberly Davidson",
          "kind": "multivalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "color"
        },
        "values": [
          {
            "count": 15,
            "display": "Grey",
            "is_selected": false,
            "value": "808080"
          }
        ]
      },
      {
        "key": {
          "display": "Available",
          "kind": "singlevalued",
          "logo": "https://hdn-1.fynd.com/global/menu-icons/image%20Nature.svg",
          "name": "is_available"
        },
        "values": [
          {
            "count": 3,
            "display": "Available",
            "is_selected": false,
            "value": true
          }
        ]
      }
    ],
    "items": [
      {
        "action": {
          "page": {
            "query": {
              "slug": "benchmark-collaborative-paradigms"
            },
            "type": "product"
          },
          "type": "page"
        },
        "attributes": {
          "gender": "women",
          "material": "Neoprene",
          "primary_color": "DarkGrey",
          "primary_color_hex": "808080",
          "weight": "100"
        },
        "brand": {
          "_custom_json": {},
          "action": {
            "page": {
              "query": {
                "brand": [
                  "Hess-Inc"
                ]
              },
              "type": "products"
            },
            "type": "page"
          },
          "logo": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
          },
          "name": "Hess Inc",
          "type": "brand"
        },
        "categories": [
          {
            "_custom_json": {},
            "action": {
              "page": {
                "query": {
                  "category": [
                    "Amy-Kim-DDS"
                  ]
                },
                "type": "category"
              },
              "type": "page"
            },
            "id": 3,
            "logo": {
              "type": "image",
              "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
            },
            "name": "Amy Kim DDS",
            "uid": 3
          }
        ],
        "discount": "14% OFF",
        "is_tryout": false,
        "item_code": "ITEM_CODE_1",
        "item_type": "set",
        "medias": [
          {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/fynd_store_items/l2_category/original/2830_c5bb5fc02f414307a828c4c56483c30a.jpg"
          }
        ],
        "name": "benchmark collaborative paradigms",
        "price": {
          "effective": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1399,
            "min": 1199
          },
          "marked": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1499,
            "min": 1399
          }
        },
        "promo_meta": {
          "subtitle": "",
          "title": ""
        },
        "rating": 2.7,
        "sellable": true,
        "slug": "benchmark-collaborative-paradigms",
        "type": "product",
        "uid": 1
      },
      {
        "action": {
          "page": {
            "query": {
              "slug": "architect-granular-e-business"
            },
            "type": "product"
          },
          "type": "page"
        },
        "attributes": {
          "gender": "women",
          "material": "Neoprene",
          "primary_color": "DarkGrey",
          "primary_color_hex": "808080",
          "weight": "100"
        },
        "brand": {
          "_custom_json": {},
          "action": {
            "page": {
              "query": {
                "brand": [
                  "Hess-Inc"
                ]
              },
              "type": "products"
            },
            "type": "page"
          },
          "logo": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
          },
          "name": "Hess Inc",
          "type": "brand"
        },
        "categories": [
          {
            "_custom_json": {},
            "action": {
              "page": {
                "query": {
                  "category": [
                    "Amy-Kim-DDS"
                  ]
                },
                "type": "category"
              },
              "type": "page"
            },
            "id": 3,
            "logo": {
              "type": "image",
              "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
            },
            "name": "Amy Kim DDS",
            "uid": 3
          }
        ],
        "discount": "14% OFF",
        "is_tryout": false,
        "item_code": "ITEM_CODE_2",
        "item_type": "set",
        "medias": [
          {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/fynd_store_items/l2_category/original/2830_c5bb5fc02f414307a828c4c56483c30a.jpg"
          }
        ],
        "name": "architect granular e-business",
        "price": {
          "effective": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1399,
            "min": 1199
          },
          "marked": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1499,
            "min": 1399
          }
        },
        "promo_meta": {
          "subtitle": "",
          "title": ""
        },
        "rating": 2.7,
        "sellable": true,
        "slug": "architect-granular-e-business",
        "type": "product",
        "uid": 10
      },
      {
        "action": {
          "page": {
            "query": {
              "slug": "facilitate-enterprise-supply-chains"
            },
            "type": "product"
          },
          "type": "page"
        },
        "attributes": {
          "gender": "women",
          "material": "Neoprene",
          "primary_color": "DarkGrey",
          "primary_color_hex": "808080",
          "weight": "100"
        },
        "brand": {
          "_custom_json": {},
          "action": {
            "page": {
              "query": {
                "brand": [
                  "Hess-Inc"
                ]
              },
              "type": "products"
            },
            "type": "page"
          },
          "logo": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
          },
          "name": "Hess Inc",
          "type": "brand"
        },
        "categories": [
          {
            "_custom_json": {},
            "action": {
              "page": {
                "query": {
                  "category": [
                    "Amy-Kim-DDS"
                  ]
                },
                "type": "category"
              },
              "type": "page"
            },
            "id": 3,
            "logo": {
              "type": "image",
              "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
            },
            "name": "Amy Kim DDS",
            "uid": 3
          }
        ],
        "discount": "14% OFF",
        "is_tryout": false,
        "item_code": "ITEM_CODE_3",
        "item_type": "set",
        "medias": [
          {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/fynd_store_items/l2_category/original/2830_c5bb5fc02f414307a828c4c56483c30a.jpg"
          }
        ],
        "name": "facilitate enterprise supply-chains",
        "price": {
          "effective": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1399,
            "min": 1199
          },
          "marked": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1499,
            "min": 1399
          }
        },
        "promo_meta": {
          "subtitle": "",
          "title": ""
        },
        "rating": 2.7,
        "sellable": true,
        "slug": "facilitate-enterprise-supply-chains",
        "type": "product",
        "uid": 11
      },
      {
        "action": {
          "page": {
            "query": {
              "slug": "optimize-web-enabled-e-tailers"
            },
            "type": "product"
          },
          "type": "page"
        },
        "attributes": {
          "gender": "women",
          "material": "Neoprene",
          "primary_color": "DarkGrey",
          "primary_color_hex": "808080",
          "weight": "100"
        },
        "brand": {
          "_custom_json": {},
          "action": {
            "page": {
              "query": {
                "brand": [
                  "Hess-Inc"
                ]
              },
              "type": "products"
            },
            "type": "page"
          },
          "logo": {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
          },
          "name": "Hess Inc",
          "type": "brand"
        },
        "categories": [
          {
            "_custom_json": {},
            "action": {
              "page": {
                "query": {
                  "category": [
                    "Amy-Kim-DDS"
                  ]
                },
                "type": "category"
              },
              "type": "page"
            },
            "id": 3,
            "logo": {
              "type": "image",
              "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
            },
            "name": "Amy Kim DDS",
            "uid": 3
          }
        ],
        "discount": "14% OFF",
        "is_tryout": false,
        "item_code": "ITEM_CODE_4",
        "item_type": "set",
        "medias": [
          {
            "type": "image",
            "url": "https://hdn-1.fynd.com/media/fynd_store_items/l2_category/original/2830_c5bb5fc02f414307a828c4c56483c30a.jpg"
          }
        ],
        "name": "optimize web-enabled e-tailers",
        "price": {
          "effective": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1399,
            "min": 1199
          },
          "marked": {
            "currency_code": "INR",
            "currency_symbol": "₹",
            "max": 1499,
            "min": 1399
          }
        },
        "promo_meta": {
          "subtitle": "",
          "title": ""
        },
        "rating": 2.7,
        "sellable": true,
        "slug": "optimize-web-enabled-e-tailers",
        "type": "product",
        "uid": 12
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 15,
      "total": 2,
      "type": "number"
    },
    "sort_on": [
      {
        "display": "Latest Products.",
        "is_selected": true,
        "logo": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/360x0/56_MKT02AI060CORAL/1_1567590349681.jpg",
        "name": "Latest Products.",
        "value": "latest"
      }
    ]
  }
}
```
</details>

</details>









---


### getDiscountedInventoryBySizeIdentifier
Get Inventory for company




```java
platformClient.application("<APPLICATION_ID>").catalog.getDiscountedInventoryBySizeIdentifier( itemId,  sizeIdentifier,  pageNo,  pageSize,  locationIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| applicationId | String | yes | Uniquer Application ID. |   
| itemId | Integer | yes | Item code of the product of which size is to be get. |   
| sizeIdentifier | Integer | yes | Size Identifier (Seller Identifier or Primary Identifier) of which inventory is to get. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| locationIds | List<Integer>? | no | Search by store ids. |  



This API allows get Inventory data for particular company grouped by size and store.

*Returned Response:*




[InventorySellerIdentifierResponsePaginated](#InventorySellerIdentifierResponsePaginated)

returns a list of all inventory grouped by size and store




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 15,
          "is_default": true,
          "length": 10.5,
          "unit": "cm",
          "width": 5.2
        },
        "fragile": true,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {
          "article_id": 1
        },
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-04-06T03:30:01.487000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "st",
          "is_default": true,
          "name": "manufacturer"
        },
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 79.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "59_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 15,
          "is_default": true,
          "length": 10.5,
          "unit": "cm",
          "width": 5.2
        },
        "fragile": true,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {
          "article_id": 1
        },
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-04-06T03:29:35.291000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "st",
          "is_default": true,
          "name": "manufacturer"
        },
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 79.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "10_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 15,
          "is_default": true,
          "length": 10.5,
          "unit": "cm",
          "width": 5.2
        },
        "fragile": true,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {
          "article_id": 1
        },
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-03-17T12:35:29.992000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "st",
          "is_default": true,
          "name": "manufacturer"
        },
        "order_committed_quantity": 0,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 79.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10000000,
        "sellable_quantity": 10000000,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "11061_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "damaged_quantity": 0,
        "dimension": {
          "height": 15,
          "is_default": true,
          "length": 10.5,
          "unit": "cm",
          "width": 5.2
        },
        "fragile": true,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {
          "article_id": 1
        },
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-03-31T19:00:10.943000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "st",
          "is_default": true,
          "name": "manufacturer"
        },
        "not_available_quantity": 0,
        "order_committed_quantity": 7,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 79.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 18,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "1_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 15,
          "is_default": true,
          "length": 10.5,
          "unit": "cm",
          "width": 5.2
        },
        "fragile": true,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {
          "article_id": 1
        },
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2020-07-07T10:37:06.146000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "st",
          "is_default": true,
          "name": "manufacturer"
        },
        "order_committed_quantity": 39,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 79.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 0,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "1_rtyuidsdfv",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 5,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getProductDetailBySlug
Get a product




```java
platformClient.application("<APPLICATION_ID>").catalog.getProductDetailBySlug( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| slug | String | yes | The unique identifier of a product. i.e; `slug` of a product or `uid` of a product. You can retrieve these from the APIs that list products like **v1.0/products/** |  



Products are the core resource of an application. Products can be associated by categories, collections, brands and more. This API retrieves the product specified by the given **slug**. If successful, returns a Product resource in the response body specified in `ProductDetail`

*Returned Response:*




[ProductDetail](#ProductDetail)

The Product object. See example below or refer `ProductDetail` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "attributes": {
      "brand": "Barry, Jennings and Larson",
      "color": "DarkGrey",
      "color_hex": "808080",
      "gender": [
        "Men",
        "Women"
      ],
      "item_code": "LGLAPTOPSLEEVE5",
      "material": "Neoprene",
      "occasion": "Casual",
      "primary_color": "Grey",
      "primary_color_hex": "808080",
      "primary_material": "Others",
      "product_details": "This is a Unisex Product.",
      "product_type": "LaptopBags",
      "style_note": "Shape up your overall appeal with this stunning laptop bag. The amazing storage and great design will let you carry your laptop in style!",
      "variant": "LGLAPTOPSLEEVE5",
      "weight": 100
    },
    "brand": {
      "_custom_json": {},
      "action": {
        "page": {
          "query": {
            "brand": [
              "Hess-Inc"
            ]
          },
          "type": "products"
        },
        "type": "page"
      },
      "logo": {
        "type": "image",
        "url": "https://hdn-1.fynd.com/media/logo/brand/original/12391_0d956c6c71a4427895c15e44cba82f88.jpg"
      },
      "name": "Barry, Jennings and Larson",
      "uid": 1
    },
    "categories": [
      {
        "_custom_json": {},
        "action": {
          "page": {
            "query": {
              "category": [
                "Amy-Kim-DDS"
              ]
            },
            "type": "category"
          },
          "type": "page"
        },
        "id": 3,
        "logo": {
          "type": "image",
          "url": "https://hdn-1.fynd.com/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
        },
        "name": "Amy Kim DDS",
        "uid": 3
      }
    ],
    "color": "808080",
    "custom_order": {},
    "grouped_attributes": [
      {
        "details": [
          {
            "key": "Kimberly Davidson",
            "type": "text",
            "value": "DarkGrey"
          },
          {
            "key": "Kimberly Mcdaniel",
            "type": "text",
            "value": "Men,Women"
          },
          {
            "key": "Monica Hampton",
            "type": "text",
            "value": "Neoprene"
          },
          {
            "key": "John Mendoza",
            "type": "text",
            "value": "100 g"
          }
        ],
        "title": "Alexander Sawyer"
      }
    ],
    "has_variant": true,
    "image_nature": "standard",
    "medias": [
      {
        "type": "image",
        "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1309_LGLAPTOPSLEEVE5/1_1564735832806.jpg"
      }
    ],
    "name": "benchmark collaborative paradigms",
    "no_of_boxes": 1,
    "product_online_date": "2021-02-03T07:22:29Z",
    "rating": 2.7,
    "rating_count": 2,
    "similars": [
      "brand"
    ],
    "slug": "benchmark-collaborative-paradigms",
    "tags": [
      "Digital"
    ],
    "teaser_tag": {},
    "tryouts": [],
    "type": "product",
    "uid": 1
  }
}
```
</details>

</details>









---


### getAppProducts
Get applicationwise products




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppProducts( brandIds,  categoryIds,  departmentIds,  tags,  itemIds,  pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| brandIds | List<Integer>? | no | Get multiple products filtered by Brand Ids |   
| categoryIds | List<Integer>? | no | Get multiple products filtered by Category Ids |   
| departmentIds | List<Integer>? | no | Get multiple products filtered by Department Ids |   
| tags | List<String>? | no | Get multiple products filtered by tags |   
| itemIds | List<Integer>? | no | Get multiple products filtered by Item Ids |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| q | String? | no | Search with Item Code, Name, Slug or Identifier. |  



Products are the core resource of an application. Products can be associated by categories, collections, brands and more. If successful, returns a Product resource in the response body specified in `ApplicationProductListingResponseDatabasePowered`

*Returned Response:*




[RawProductListingResponse](#RawProductListingResponse)

The Product object. See example below or refer `ApplicationProductListingResponseDatabasePowered` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_custom_json": {},
        "all_company_ids": [
          1
        ],
        "all_identifiers": [
          "19WE100"
        ],
        "all_sizes": [
          {
            "brand_uid": 1,
            "company_id": 1,
            "identifiers": [
              {
                "gtin_type": "ean",
                "gtin_value": "HGS272727272",
                "primary": true
              }
            ],
            "item_code": "TVSET111",
            "marked_price": 35000,
            "seller_identifier": "HGS272727272",
            "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)"
          }
        ],
        "brand": {
          "logo": {
            "aspect_ratio": "1:1",
            "aspect_ratio_f": 1,
            "secure_url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png",
            "url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png"
          },
          "name": "Apple",
          "uid": 13
        },
        "brand_uid": 1,
        "category_slug": "qled-television",
        "category_uid": 1,
        "country_of_origin": "India",
        "created_by": {
          "user_id": "5",
          "username": "919049753052_37528"
        },
        "created_on": "2021-04-02T15:43:59.410000Z",
        "currency": "INR",
        "custom_order": {
          "is_custom_order": true,
          "manufacturing_time": 2,
          "manufacturing_time_unit": "days"
        },
        "departments": [
          1
        ],
        "description": "Tv",
        "highlights": [
          "42 Inch"
        ],
        "hsn_code": "11111111",
        "id": "5f4f2f6371a5970001f13655",
        "image_nature": "standard",
        "images": [
          "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyprod/wrkr/products/pictures/item/free/original/5050407896640/8hn0-cPlN0-1.jpg",
          "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyprod/wrkr/products/pictures/item/free/original/5050407896640/1ODGjR9NLY-2.jpg",
          "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyprod/wrkr/products/pictures/item/free/original/5050407896640/mJqqfEQilY-3.jpg",
          "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyprod/wrkr/products/pictures/item/free/original/5050407896640/htM1r1aHwa-4.jpg"
        ],
        "is_dependent": false,
        "is_image_less_product": false,
        "is_physical": true,
        "is_set": true,
        "item_code": "TVSET111",
        "item_type": "set",
        "l3_mapping": [
          "electronics>qled_television"
        ],
        "media": [
          {
            "type": "image",
            "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png"
          }
        ],
        "modified_by": {
          "user_id": "xxxxxxxxxxx",
          "username": "xxxxxxxxxx"
        },
        "modified_on": "2021-04-02T15:43:59.410000Z",
        "multi_size": true,
        "name": "TV Set",
        "no_of_boxes": 1,
        "price": {
          "effective": {
            "max": 25000,
            "min": 25000
          },
          "marked": {
            "max": 35000,
            "min": 35000
          }
        },
        "product_group_tag": [],
        "product_publish": {
          "is_set": false,
          "product_online_date": 1627642009
        },
        "return_config": {
          "returnable": false,
          "time": 0,
          "unit": "days"
        },
        "short_description": "",
        "size_guide": "slim-fit-shirts-for-men",
        "sizes": [
          {
            "size": "FGX33, GHX33 (66 PCS)",
            "store_count": 1
          },
          {
            "size": "XSE WE23X100 (100 PCS)",
            "store_count": 2
          },
          {
            "size": "XSEX100 (100 PCS)",
            "store_count": 3
          },
          {
            "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)",
            "store_count": 3
          }
        ],
        "slug": "tv-set",
        "stage": "verified",
        "synonyms": [],
        "tags": [],
        "teaser_tag": {},
        "template_tag": "television",
        "trader": [
          {
            "address": [
              "sdfdsfsdf"
            ],
            "name": "asdasd"
          }
        ],
        "trader_type": "Packer",
        "uid": 7501547,
        "variants": {},
        "verification_status": "pending",
        "verified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "verified_on": "2021-04-02T15:43:59.410000Z"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
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


### getAppReturnConfiguration
Get Return configuration level set for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppReturnConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



Get Product Return configuration set at an application level

*Returned Response:*




[AppReturnConfigResponse](#AppReturnConfigResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "app_id": "5d638512c9accedcd910591a",
    "category_count": 32,
    "company_id": 1,
    "created_by": {
      "user_id": "054bb99f009aece85a3fa087",
      "username": "test"
    },
    "modified_by": {
      "user_id": "054bb99f009aece85a3fa087",
      "username": "test"
    },
    "modified_on": "2023-03-28T06:05:24.026000",
    "return_config_level": "category"
  }
}
```
</details>

</details>









---


### createAppReturnConfiguration
Create Return configuration level set for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.createAppReturnConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateUpdateAppReturnConfig](#CreateUpdateAppReturnConfig) | yes | Request body |


Create Return configuration level set for an application.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

success message will tell whether the operation was successful.




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


### updateAppReturnConfiguration
Update Return configuration level set for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppReturnConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateUpdateAppReturnConfig](#CreateUpdateAppReturnConfig) | yes | Request body |


Update Return configuration level set for an application.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

success message will tell whether the operation was successful.




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


### deleteAppCategoryReturnConfiguration
Delete Category level Application Return Configuration setttings




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteAppCategoryReturnConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [DeleteAppCategoryReturnConfig](#DeleteAppCategoryReturnConfig) | yes | Request body |


Delete Category level Application Return Configuration setttings

*Returned Response:*




[SuccessResponse](#SuccessResponse)

success message will tell whether the operation was successful.




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


### getAppCategoryReturnConfig
Get all category level configuration level set for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppCategoryReturnConfig() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



Get all category level configuration level set for an application.

*Returned Response:*




[BaseAppCategoryReturnConfigResponse](#BaseAppCategoryReturnConfigResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "app_id": "5d638512c9accedcd910591a",
        "category_id": 1659,
        "logo": "https://hdn-1.addsale.com/addsale/category/pictures/square-logo/original/7hR5xHVUi0-eTdgOunCZ-.jpeg",
        "name": "MG TEST DIGITAL",
        "return_config": {
          "returnable": true,
          "time": 10,
          "unit": "days"
        }
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
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


### createAppCategoryReturnConfiguration
Create Category level Application Return Configuration setttings




```java
platformClient.application("<APPLICATION_ID>").catalog.createAppCategoryReturnConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [BaseAppCategoryReturnConfig](#BaseAppCategoryReturnConfig) | yes | Request body |


Create Category level Application Return Configuration setttings

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

success message will tell whether the operation was successful.




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


### updateAppCategoryReturnConfiguration
Update Category level Application Return Configuration setttings




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppCategoryReturnConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [BaseAppCategoryReturnConfig](#BaseAppCategoryReturnConfig) | yes | Request body |


Update Category level Application Return Configuration setttings

*Returned Response:*




[SuccessResponse](#SuccessResponse)

success message will tell whether the operation was successful.




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


### createCustomAutocompleteRule
Add a Custom Autocomplete Keywords




```java
platformClient.application("<APPLICATION_ID>").catalog.createCustomAutocompleteRule(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateAutocompleteKeyword](#CreateAutocompleteKeyword) | yes | Request body |


Create a Custom Autocomplete Keywords. See `CreateAutocompleteKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateAutocompleteKeywordSchema`

*Returned Response:*




[CreateAutocompleteWordsResponse](#CreateAutocompleteWordsResponse)

List of all the collections including the one you added. See example below or refer `CreateAutocompleteWordsResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "results": [
      {
        "logo": {
          "url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/company/10189/applications/64f9dd40a6fbe9f0dd1ef427/search/pictures/square-logo/original/N4FNal616-.webp",
          "aspect_ratio": "1:1"
        },
        "_custom_json": {},
        "display": "testfx2",
        "action": {
          "type": "page",
          "page": {
            "url": "/products/?brand=bernhard7788838818720231650253",
            "query": {
              "brand": [
                "bernhard7788838818720231650253"
              ]
            },
            "type": "products"
          }
        }
      }
    ],
    "words": [
      "testfx2"
    ],
    "is_active": true,
    "app_id": "64aed377b1fd04565d0dff30",
    "uid": "656976a53f3646dd5917849f"
  }
}
```
</details>

</details>









---


### getAutocompleteConfig
List all Autocomplete Keyword Listing




```java
platformClient.application("<APPLICATION_ID>").catalog.getAutocompleteConfig( pageNo,  pageSize,  q,  isActive) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with words name.Use this parameter to search keywords by words. |   
| isActive | Boolean? | no | Can query for keywords based on whether they are active or inactive. |  



Custom Autocomplete Keyword allows you to map conditions with keywords to give you the ultimate results

*Returned Response:*




[GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

List of custom autocomplete keywords. See example below or refer `GetAutocompleteWordsResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "app_id": "000000000000000000000001",
        "is_active": true,
        "results": [
          {
            "_custom_json": {},
            "action": {
              "page": {
                "query": {
                  "brand": [
                    "nike"
                  ]
                },
                "type": "products",
                "url": "/products/?brand=nike"
              },
              "type": "page"
            },
            "display": "Helllow",
            "logo": {
              "url": "https://hdn-1.addsale.com/addsale/company/61/applications/600a5b3fe0991a4718cdb448/company/1/application/000000000000000000000001/search/pictures/square-logo/original/n_8bvEaBw-Helllow.png"
            }
          }
        ],
        "uid": "602fa1eaa596ce349563f6c6",
        "words": [
          "dasd"
        ]
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_count": 1,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getAutocompleteKeywordDetail
Get a Autocomplete Keywords Details




```java
platformClient.application("<APPLICATION_ID>").catalog.getAutocompleteKeywordDetail( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a keywords resource in the response body specified in `GetAutocompleteWordsResponseSchema`

*Returned Response:*




[GetAutocompleteWordsData](#GetAutocompleteWordsData)

The mapping object. See example below or refer `GetAutocompleteWordsDataSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "app_id": "000000000000000000000001",
    "is_active": true,
    "results": [
      {
        "_custom_json": {},
        "action": {
          "page": {
            "query": {
              "brand": [
                "nike"
              ]
            },
            "type": "products",
            "url": "/products/?brand=nike"
          },
          "type": "page"
        },
        "display": "Helllow",
        "logo": {
          "url": "https://hdn-1.addsale.com/addsale/company/61/applications/600a5b3fe0991a4718cdb448/company/1/application/000000000000000000000001/search/pictures/square-logo/original/n_8bvEaBw-Helllow.png"
        }
      }
    ],
    "uid": "602fa1eaa596ce349563f6c6",
    "words": [
      "dasd"
    ]
  }
}
```
</details>

</details>









---


### updateAutocompleteKeyword
Create & Update Autocomplete Keyword




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAutocompleteKeyword( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  
| body | [CreateAutocompleteKeyword](#CreateAutocompleteKeyword) | yes | Request body |


Update a mapping by it's id. On successful request, returns the updated Keyword mapping

*Returned Response:*




[GetAutocompleteWordsData](#GetAutocompleteWordsData)

The Mapping object. See example below or refer `GetAutocompleteWordsDataSchema` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "is_active": true,
    "app_id": "64aed377b1fd04565d0dff30",
    "results": [
      {
        "action": {
          "type": "page",
          "page": {
            "query": {
              "brand": [
                "bernhard7788838818720231650253"
              ]
            },
            "type": "products",
            "url": "/products/?brand=bernhard7788838818720231650253"
          }
        },
        "logo": {
          "url": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/company/10189/applications/64f9dd40a6fbe9f0dd1ef427/search/pictures/square-logo/original/N4FNal616-.webp",
          "aspect_ratio": "1:1"
        },
        "_custom_json": {},
        "display": "testfx2"
      }
    ],
    "words": [
      "testfx22"
    ],
    "uid": "6569804246bf2fe018bf9d01"
  }
}
```
</details>

</details>









---


### deleteAutocompleteKeyword
Delete a Autocomplete Keywords




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteAutocompleteKeyword( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Returned Response:*




[DeleteResponse](#DeleteResponse)

Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Words Deleted"
  }
}
```
</details>

</details>









---


### createSearchRerank
Create search rerank for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.createSearchRerank(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateSearchRerankRequest](#CreateSearchRerankRequest) | yes | Request body |


This view allows you to create search rerank attributes for an application

*Returned Response:*




[CreateSearchRerankResponse](#CreateSearchRerankResponse)

List of custom search keywords. See example below or refer `CreateSearchRerankResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "words": [
      "test"
    ],
    "app_id": "64aed475db2cfb5b8a9f623d",
    "ranking": {
      "boost": [
        {
          "attribute_value": "test",
          "attribute_key": "l3_category_slugs"
        }
      ]
    },
    "is_active": true,
    "created_on": "2023-12-24T07:10:55.725539",
    "created_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    },
    "modified_on": "2023-12-24T07:10:55.725553",
    "modified_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    }
  }
}
```
</details>

</details>









---


### getSearchRerank
Get search rerank for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getSearchRerank() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This view allows you to create search rerank attributes for an application

*Returned Response:*




[GetSearchRerankResponse](#GetSearchRerankResponse)

List of custom search keywords. See example below or refer `GetSearchRerankResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 1
    },
    "items": [
      {
        "created_on": "2023-12-24T07:10:55.725000",
        "modified_on": "2023-12-24T07:10:55.725000",
        "words": [
          "test"
        ],
        "app_id": "64aed475db2cfb5b8a9f623d",
        "modified_by": {
          "username": "rohanshah@fynd.com",
          "user_id": "5e199e6998cfe1776f1385dc"
        },
        "ranking": {
          "boost": [
            {
              "attribute_value": "test",
              "attribute_key": "l3_category_slugs"
            }
          ]
        },
        "created_by": {
          "username": "rohanshah@fynd.com",
          "user_id": "5e199e6998cfe1776f1385dc"
        },
        "_id": "6587d97f00f4aedbd0d1b382",
        "is_active": true,
        "id": "6587d97f00f4aedbd0d1b382"
      }
    ]
  }
}
```
</details>

</details>









---


### getSearchRerankDetail
Get search rerank for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getSearchRerankDetail( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sales channel. |   
| id | String | yes | An `id` is the identifier for a particular search rerank configuration. channel. |  



This view allows you to retrieve search rerank attribute detail for an application

*Returned Response:*




[GetSearchRerankDetailResponse](#GetSearchRerankDetailResponse)

Create search rerank configuration. See example below or refer `GetSearchRerankDetailResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "ranking": {
      "boost": [
        {
          "attribute_key": "l3_category_slugs",
          "attribute_value": "testspec3"
        }
      ]
    },
    "is_active": true,
    "modified_by": {
      "user_id": "5e199e6998cfe1776f1385dc",
      "username": "rohanshah@fynd.com"
    },
    "created_by": {
      "user_id": "5e199e6998cfe1776f1385dc",
      "username": "rohanshah@fynd.com"
    },
    "words": [
      "testspec3"
    ],
    "app_id": "64aed475db2cfb5b8a9f623d",
    "modified_on": "2023-12-25T16:08:48.694000",
    "created_on": "2023-12-25T16:08:48.694000",
    "id": "6589a91055565ca43767b2e2"
  }
}
```
</details>

</details>









---


### updateSearchRerankConfiguration
Update search rerank for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.updateSearchRerankConfiguration( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is the identifier for a particular search rerank configuration. channel. |  
| body | [UpdateSearchRerankRequest](#UpdateSearchRerankRequest) | yes | Request body |


This view allows you to update search rerank attribute for an application

*Returned Response:*




[UpdateSearchRerankResponse](#UpdateSearchRerankResponse)

Update search rerank configuration. See example below or refer `UpdateSearchRerankResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "words": [
      "test"
    ],
    "app_id": "64aed475db2cfb5b8a9f623d",
    "ranking": {
      "boost": [
        {
          "attribute_value": "test",
          "attribute_key": "l3_category_slugs"
        }
      ]
    },
    "is_active": true,
    "created_on": "2023-12-24T07:10:55.725539",
    "created_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    },
    "modified_on": "2023-12-24T07:10:55.725553",
    "modified_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    }
  }
}
```
</details>

</details>









---


### deleteSearchRerankConfiguration
Delete search rerank configuration for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteSearchRerankConfiguration( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is the identifier for a particular search rerank configuration. channel. |  



This view allows you to delete search rerank configuration for an application

*Returned Response:*




[DeleteSearchRerankConfigurationResponse](#DeleteSearchRerankConfigurationResponse)

Status of the delete operation. See `DeleteSearchRerankConfigurationResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Ranking Config deleted"
  }
}
```
</details>

</details>









---


### createSearchConfiguration
Update search configuration for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.createSearchConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateSearchConfigurationRequest](#CreateSearchConfigurationRequest) | yes | Request body |


This view allows you to modify searchable attributes for an application

*Returned Response:*




[CreateSearchConfigurationResponse](#CreateSearchConfigurationResponse)

List of custom search keywords. See example below or refer `CreateSearchConfigurationResponse` for details




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


### getSearchConfiguration
List search configuration for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getSearchConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This view allows you to add/modify searchable attributes for an application

*Returned Response:*




[GetSearchConfigurationResponse](#GetSearchConfigurationResponse)

Search configuration for the specified application. See example below or refer `GetSearchConfigurationResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "64f6ec9c6fcd148be1ddd29c",
    "company_id": 1,
    "application_id": "64c00b72c07acacc1357503b",
    "searchable_attributes": [],
    "created_on": "2023-09-05T08:53:48.466071",
    "created_by": {
      "username": "919987119900_30638",
      "user_id": "a37523d27344c3ba7b4f982d"
    },
    "modified_on": "2023-09-05T08:53:48.466081",
    "modified_by": {
      "username": "919987119900_30638",
      "user_id": "a37523d27344c3ba7b4f982d"
    }
  }
}
```
</details>

</details>









---


### updateSearchConfiguration
Update search configuration for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.updateSearchConfiguration(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [UpdateSearchConfigurationRequest](#UpdateSearchConfigurationRequest) | yes | Request body |


This view allows you to modify searchable attributes for an application

*Returned Response:*




[UpdateSearchConfigurationResponse](#UpdateSearchConfigurationResponse)

List of custom search keywords. See example below or refer `UpdateSearchConfigurationResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "searchable_attributes": [
      {
        "name": "Department",
        "key": "department",
        "priority": 1
      }
    ]
  }
}
```
</details>

</details>









---


### deleteSearchConfiguration
Delete search configuration for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteSearchConfiguration() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  



This view allows you to reset search config for an application

*Returned Response:*




[DeleteSearchConfigurationResponse](#DeleteSearchConfigurationResponse)

Status of the delete operation. See `DeleteSearchConfigurationResponse` for details




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


### createCustomKeyword
Add a Custom Search Keywords




```java
platformClient.application("<APPLICATION_ID>").catalog.createCustomKeyword(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateSearchKeyword](#CreateSearchKeyword) | yes | Request body |


Create a Custom Search Keywords. See `CreateSearchKeywordSchema` for the list of attributes needed to create a mapping and /collections/query-options for the available options to create a rule. On successful request, returns a paginated list of collections specified in `CreateSearchKeywordSchema`

*Returned Response:*




[GetSearchWordsData](#GetSearchWordsData)

Get keyword object with id that is added. See example below or refer `GetSearchWordsDataSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "uid": "65685994b480f69f74090000",
    "words": [
      "tx"
    ],
    "app_id": "64aed377b1fd04565d0dff30",
    "is_active": true,
    "result": {
      "query": {
        "category": [
          "stefan803249891872023121772"
        ]
      },
      "sort_on": "price_asc"
    },
    "_custom_json": {}
  }
}
```
</details>

</details>









---


### getAllSearchKeyword
List all Search Custom Keyword Listing




```java
platformClient.application("<APPLICATION_ID>").catalog.getAllSearchKeyword( pageNo,  pageSize,  q,  isActive) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search query with words name.Use this parameter to search keywords by words. |   
| isActive | Boolean? | no | Can query for keywords based on whether they are active or inactive. |  



Custom Search Keyword allows you to map conditions with keywords to give you the ultimate results

*Returned Response:*




[GetSearchWordsResponse](#GetSearchWordsResponse)

List of custom search keywords. See example below or refer `GetSearchWordsResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_custom_json": {},
        "app_id": "000000000000000000000001",
        "is_active": true,
        "result": {
          "query": {
            "department": [
              "men"
            ]
          },
          "sort_on": "popular"
        },
        "uid": "602fa1e9a596ce349563f6b9",
        "words": [
          "sds"
        ]
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_count": 1,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getSearchKeywords
Get a Search Keywords Details




```java
platformClient.application("<APPLICATION_ID>").catalog.getSearchKeywords( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get the details of a words by its `id`. If successful, returns a Collection resource in the response body specified in `GetSearchWordsDetailResponseSchema`

*Returned Response:*




[GetSearchWordsData](#GetSearchWordsData)

The Collection object. See example below or refer `GetSearchWordsData` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_custom_json": {},
    "app_id": "000000000000000000000001",
    "is_active": true,
    "result": {
      "query": {
        "department": [
          "men"
        ]
      },
      "sort_on": "popular"
    },
    "uid": "602fa1e9a596ce349563f6b9",
    "words": [
      "sds"
    ]
  }
}
```
</details>

</details>









---


### updateSearchKeywords
Update Search Keyword




```java
platformClient.application("<APPLICATION_ID>").catalog.updateSearchKeywords( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  
| body | [CreateSearchKeyword](#CreateSearchKeyword) | yes | Request body |


Update Search Keyword by its id. On successful request, returns the updated collection

*Returned Response:*




[GetSearchWordsData](#GetSearchWordsData)

The Collection object. See example below or refer `GetSearchWordsDataSchema` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "uid": "65685b09d090252c51c21762",
    "words": [
      "fx"
    ],
    "app_id": "64aed377b1fd04565d0dff30",
    "is_active": true,
    "result": {
      "sort_on": "discount_dsc",
      "query": {
        "category": [
          "weldon535486841872023104970"
        ]
      }
    },
    "_custom_json": {}
  }
}
```
</details>

</details>









---


### deleteSearchKeywords
Delete a Search Keywords




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteSearchKeywords( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  



Delete a keywords by it's id. Returns an object that tells whether the keywords was deleted successfully

*Returned Response:*




[DeleteResponse](#DeleteResponse)

Status object. Tells whether the operation was successful. See example below or refer `DeleteResponse`




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Words Deleted"
  }
}
```
</details>

</details>









---


### updateAppLocation
Update a single custom json.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAppLocation( storeUid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to location custom json. |   
| applicationId | String | yes | application id for which the custom_json is associated. |   
| storeUid | Integer | yes | store id for which the custom_json is associated. |  
| body | [ApplicationStoreJson](#ApplicationStoreJson) | yes | Request body |


This API helps to update data associated to a item custom meta.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




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


### createCategories
Create product categories




```java
platformClient.catalog.createCategories(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  
| body | [CategoryRequestBody](#CategoryRequestBody) | yes | Request body |


This API lets user create product categories

*Returned Response:*




[CategoryCreateResponse](#CategoryCreateResponse)

Category Meta. See example below or refer `CategoryCreateResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Success",
    "uid": 0
  }
}
```
</details>

</details>









---


### listCategories
Get product categories list




```java
platformClient.catalog.listCategories( level,  department,  q,  pageNo,  pageSize,  uids) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| level | String? | no | Get category for multiple levels |   
| department | Integer? | no | Get category for multiple departments filtered |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| uids | List<Integer>? | no | Get multiple categories filtered by category uids. |  



This API gets meta associated to product categories.

*Returned Response:*




[CategoryResponse](#CategoryResponse)

Category Meta. See example below or refer `CategoryResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "created_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "created_on": "2021-04-02T15:43:59.410000Z",
        "departments": [
          1
        ],
        "hierarchy": [
          {
            "department": 1,
            "l1": 1,
            "l2": 22329
          }
        ],
        "id": "60673bbf7896da00017885ad",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/_7GDi3tyi-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png"
        },
        "modified_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "modified_on": "2021-04-02T15:43:59.410000Z",
        "name": "Air Conditioners",
        "priority": 1,
        "slug": "air-conditioners",
        "synonyms": [],
        "tryouts": [],
        "uid": 22330
      },
      {
        "created_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "created_on": "2021-04-02T15:42:55.405000Z",
        "departments": [
          1
        ],
        "hierarchy": [],
        "id": "60673b7f7896da00017885ac",
        "is_active": true,
        "level": 2,
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/_7GDi3tyi-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png"
        },
        "modified_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "modified_on": "2021-04-02T15:42:55.405000Z",
        "name": "Home Appliances",
        "priority": 1,
        "slug": "home-appliances",
        "synonyms": [],
        "uid": 22329
      },
      {
        "created_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "created_on": "2021-01-14T05:28:02.148000Z",
        "departments": [
          21
        ],
        "hierarchy": [],
        "id": "5fffd662e64eb40001fc8a42",
        "is_active": true,
        "level": 2,
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png"
        },
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-04T15:43:50.495000Z",
        "name": "Dummy category level 2 by fahim",
        "priority": 123456,
        "slug": "dummy-category-level-2",
        "synonyms": [
          "skin",
          "care",
          "asdasd"
        ],
        "uid": 22323
      },
      {
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-02-25T00:00:47.589000Z",
        "departments": [
          21
        ],
        "hierarchy": [
          {
            "department": 21,
            "l1": 22322,
            "l2": 22323
          }
        ],
        "id": "60369b57d23031d14be92c18",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png"
        },
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-04T15:39:52.108000Z",
        "name": "Dummy level 4",
        "priority": 986532,
        "slug": "dummy-level-4",
        "synonyms": [],
        "tryouts": [],
        "uid": 22325
      },
      {
        "created_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "created_on": "2021-01-14T05:28:59.852000Z",
        "departments": [
          2,
          4,
          21
        ],
        "hierarchy": [
          {
            "department": 21,
            "l1": 22322,
            "l2": 22323
          },
          {
            "department": 4,
            "l1": 3672,
            "l2": 3732
          },
          {
            "department": 2,
            "l1": 595,
            "l2": 730
          }
        ],
        "id": "5fffd69be64eb40001fc8a65",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png"
        },
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-04T15:39:46.246000Z",
        "name": "Dummy level 3 by fahim",
        "priority": 986532,
        "slug": "dummy-level-3",
        "synonyms": [],
        "tryouts": [
          "Lipstick",
          "Eyeliner"
        ],
        "uid": 22324
      },
      {
        "created_on": "2016-04-09T06:44:35Z",
        "departments": [
          4
        ],
        "hierarchy": [],
        "id": "5fabab8ea18a1284b97ff6c4",
        "is_active": true,
        "level": 1,
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
          "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/YHIeoQ_fruit___vegetable_logo.jpg16aab608-a78a-458f-b60b-524525f27dec/YHIeoQ_fruit___vegetable_logo.jpg",
          "portrait": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg"
        },
        "modified_by": {
          "uid": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-03T09:35:50.415000Z",
        "name": "Gourmet & World Food",
        "priority": 123,
        "slug": "gourmet-world-food",
        "synonyms": [
          "gourmet & world food",
          "food",
          "gourmet"
        ],
        "uid": 3151
      },
      {
        "created_by": {
          "uid": "5677",
          "username": "917753852478_51632"
        },
        "created_on": "2021-03-03T06:30:08.342000Z",
        "departments": [
          1,
          2
        ],
        "hierarchy": [
          {
            "department": 2,
            "l1": 595,
            "l2": 714
          },
          {
            "department": 1,
            "l1": 2,
            "l2": 4
          }
        ],
        "id": "603f2cf0aac0360001c00731",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png"
        },
        "modified_by": {
          "uid": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-03T08:34:47.999000Z",
        "name": "Test Category kaf",
        "priority": 23,
        "slug": "test-category-kaf",
        "synonyms": [
          "test",
          "category"
        ],
        "tryouts": [
          "Lipstick",
          "Blush"
        ],
        "uid": 22328
      },
      {
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-02-25T09:26:53.123000Z",
        "departments": [
          1
        ],
        "hierarchy": [
          {
            "department": 1,
            "l1": 2,
            "l2": 3
          }
        ],
        "id": "60372005d230311fe9e51f0b",
        "is_active": false,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.fynd.com/media/banner/category/original/16128_380bed8bff064a0b981041df65e0d8b3.jpg",
          "logo": "http://d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png",
          "portrait": "http://cdn4.gofynd.com/media/logo/department/original/13239_660c6f5b2b8d458789de4552d241ea1b.jpg"
        },
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-02-25T09:26:53.123000Z",
        "name": "Smart Cell",
        "priority": 5,
        "slug": "smart-cell",
        "synonyms": [],
        "tryouts": [],
        "uid": 22327
      },
      {
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-02-25T00:09:35.026000Z",
        "departments": [
          21
        ],
        "hierarchy": [
          {
            "department": 21,
            "l1": 22322,
            "l2": 22323
          }
        ],
        "id": "60369d67d2303111b8924dcf",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
          "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
          "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png"
        },
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-02-25T00:09:35.026000Z",
        "name": "Dummy level 98",
        "priority": 986532,
        "slug": "dummy-level-98",
        "synonyms": [],
        "tryouts": [],
        "uid": 22326
      },
      {
        "created_on": "2016-04-09T06:44:35Z",
        "departments": [
          2,
          3
        ],
        "hierarchy": [
          {
            "department": 2,
            "l1": 65,
            "l2": 66
          },
          {
            "department": 2,
            "l1": 442,
            "l2": 26
          },
          {
            "department": 3,
            "l1": 442,
            "l2": 26
          }
        ],
        "id": "5fdba984642de8d93efb0d71",
        "is_active": true,
        "level": 3,
        "marketplaces": {},
        "media": {
          "landscape": "https://hdn-1.fynd.com/media/banner/category/original/19961_f042f1f4a90f4e828b6d77d6dbea264d.jpg",
          "logo": "https://hdn-1.fynd.com/media/logo/category/original/81ef023d375044e9b9daa66b81ec411f.jpg",
          "portrait": "https://hdn-1.fynd.com/media/banner_portrait/category/original/19960_c679d51cb1bd4ca99f00f9050aa647a4.jpg"
        },
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-02-15T15:48:05.329000Z",
        "name": "Sports Bra",
        "priority": 281,
        "slug": "sports-bra",
        "synonyms": [
          "Sports Bra",
          "activewear bra",
          "gym bra"
        ],
        "tryouts": [],
        "uid": 315
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 574,
      "size": 58,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getCategoryData
Get product category by uid




```java
platformClient.catalog.getCategoryData( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String | yes | Category unique id |  



This API gets meta associated to product categories.

*Returned Response:*




[SingleCategoryResponse](#SingleCategoryResponse)

Get Data for one category. See example below or refer `CategoryResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "created_by": {
        "user_id": "5646",
        "username": "917972410891_48194"
      },
      "created_on": "2021-04-02T15:43:59.410000Z",
      "departments": [
        1
      ],
      "hierarchy": [
        {
          "department": 1,
          "l1": 1,
          "l2": 22329
        }
      ],
      "id": "60673bbf7896da00017885ad",
      "is_active": true,
      "level": 3,
      "marketplaces": {},
      "media": {
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/nsi0nJ6gX-landscape.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/_4p7Kz9Yp-banner.png"
      },
      "modified_by": {
        "user_id": "16",
        "username": "nikhilmhatre_gofynd_com_97636"
      },
      "modified_on": "2021-04-13T13:57:56.443000Z",
      "name": "Air Conditioners",
      "priority": 1,
      "slug": "air-conditioners",
      "synonyms": [],
      "tryouts": [],
      "uid": 22330
    }
  }
}
```
</details>

</details>









---


### updateCategory
Update product categories




```java
platformClient.catalog.updateCategory( uid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String | yes | Category unique id |  
| body | [CategoryRequestBody](#CategoryRequestBody) | yes | Request body |


Update a product category using this api

*Returned Response:*




[CategoryUpdateResponse](#CategoryUpdateResponse)

Category Meta. See example below or refer `CategoryUpdateResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Success!!!"
  }
}
```
</details>

</details>









---


### getSellerInsights
Analytics data of catalog and inventory that are being cross-selled.




```java
platformClient.catalog.getSellerInsights( sellerAppId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| sellerAppId | String | yes | Id of the seller application which is serving the invetory/catalog of the company |  



Analytics data of catalog and inventory that are being cross-selled.

*Returned Response:*




[CrossSellingResponse](#CrossSellingResponse)

Response Data




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "articles": 18,
    "products": 18
  }
}
```
</details>

</details>









---


### createDepartments
Create the department.




```java
platformClient.catalog.createDepartments(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  
| body | [DepartmentCreateUpdate](#DepartmentCreateUpdate) | yes | Request body |


Create departments using the API.

*Returned Response:*




[DepartmentCreateResponse](#DepartmentCreateResponse)

Success Response. See example below or refer `DepartmentCreateResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Success",
    "uid": 2
  }
}
```
</details>

</details>









---


### listDepartmentsData
List all Departments.




```java
platformClient.catalog.listDepartmentsData( pageNo,  itemType,  pageSize,  name,  search,  isActive,  uids) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| itemType | String? | no | A `item_type` is a type of product eg. set, standard, digital |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| name | String? | no | Can search departments by passing name. |   
| search | String? | no | Can search departments by passing name of the department in search parameter. |   
| isActive | Boolean? | no | Can query for departments based on whether they are active or inactive. |   
| uids | List<Integer>? | no | Filter department by uids. |  



Allows you to list all departments, also can search using name and filter active and incative departments, and item type.

*Returned Response:*




[DepartmentsResponse](#DepartmentsResponse)

List of departments data. See example below or refer `DepartmentsResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "created_on": "2020-07-01T05:33:39.325000Z",
        "id": "5efc2033623d390001782238",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpgc7d0c15c-c1ff-47eb-8423-6e2df51f2ddf/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpg",
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-03T15:55:25.118000Z",
        "name": "Sample Dept",
        "platforms": {},
        "priority_order": 111,
        "slug": "sample-dept",
        "synonyms": [
          "test",
          "sampe"
        ],
        "tags": [],
        "uid": 5
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "0",
          "username": "app@fynd.com"
        },
        "created_on": "2020-05-19T06:53:37.629000Z",
        "id": "5ec3827156a7200001c9aeea",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/addsale/media/logo/department/original/15974_381e2236c2a348cc851c29a5d05c66a9.png",
        "modified_by": {
          "user_id": "10",
          "username": "fahimsakri_gofynd_com_44938"
        },
        "modified_on": "2021-03-04T14:01:02.556000Z",
        "name": "Men's Fashion",
        "platforms": {
          "fynd": true,
          "fynd_store": true,
          "marketplace": true,
          "openapi": true,
          "uniket_store": true,
          "uniket_wholesale": true
        },
        "priority_order": 111,
        "slug": "men-s-fashion",
        "synonyms": [],
        "tags": [],
        "uid": 2
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "10",
          "username": "fahimsakri_gofynd_com_44938"
        },
        "created_on": "2020-06-29T10:59:33.620000Z",
        "id": "5ef9c9959b04f00001e40dba",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:08:02.675000Z",
        "name": "Groceries",
        "platforms": {},
        "priority_order": 10,
        "slug": "groceries",
        "synonyms": [],
        "tags": [],
        "uid": 4
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "0",
          "username": "app@fynd.com"
        },
        "created_on": "2020-05-18T16:14:41.689000Z",
        "id": "5ec2b471661a4100019fca0d",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/platform/pictures/free-logo/original/_G1Z2Fg1L-http:d3p8ifzkmzds37.cloudfront.netmedialogodepartmentoriginal15870_c287d3c2431a432bb0e49363ef6b82bc.png.png",
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-04T15:39:38.528000Z",
        "name": "Electronics",
        "platforms": {
          "fynd": true,
          "fynd_store": true,
          "marketplace": true,
          "openapi": true,
          "uniket_store": true,
          "uniket_wholesale": true
        },
        "priority_order": 100,
        "slug": "electronics",
        "synonyms": [],
        "tags": [],
        "uid": 1
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "created_on": "2020-05-27T12:04:19.111000Z",
        "id": "5ece5743cd1bae0001440427",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/landscape-banner/original/g2plam_logo_Jio.pngeeb392ca-3958-46a0-9f13-23c205b596f7/g2plam_logo_Jio.png",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:07:46.060000Z",
        "name": "Industrial Supplies",
        "platforms": {},
        "priority_order": 111,
        "slug": "industrial-supplies",
        "synonyms": [],
        "tags": [],
        "uid": 3
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "13",
          "username": "abhinavsrivastava_gofynd_com_05674"
        },
        "created_on": "2020-07-06T07:56:01.508000Z",
        "id": "5f02d9116b0ae500018923dd",
        "is_active": false,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/wTcfEi_crysis_-_1.jpg14580947-a659-486d-b2d3-d2ca025b1cac/wTcfEi_crysis_-_1.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:08:12.576000Z",
        "name": "Clothing",
        "platforms": {},
        "priority_order": 1,
        "slug": "clothing",
        "synonyms": [],
        "tags": [],
        "uid": 6
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:04:33.604000Z",
        "id": "5f2a762131c66700018cdc47",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/RxTsd8_0DEFAULT-LOGO.jpg000ccfc1-2f79-4426-9ac3-de2468c2fcb9/RxTsd8_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:44:01.234000Z",
        "name": "Kids",
        "platforms": {},
        "priority_order": 3,
        "slug": "kids",
        "synonyms": [],
        "tags": [],
        "uid": 8
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:44:46.632000Z",
        "id": "5f2a7f8e31c66700018cdc49",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/tKkDB8_0DEFAULT-LOGO.jpg1c324d4d-f667-4af8-8d98-37205d34e3b5/tKkDB8_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:07:35.231000Z",
        "name": "Women's Fashion",
        "platforms": {},
        "priority_order": 2,
        "slug": "women-s-fashion",
        "synonyms": [],
        "tags": [],
        "uid": 9
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:45:12.075000Z",
        "id": "5f2a7fa831c66700018cdc4a",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/oLoxiL_0DEFAULT-LOGO.jpgbd050200-700a-4a3e-9da6-e6b78fbee943/oLoxiL_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:48:01.660000Z",
        "name": "Beauty & Personal Care",
        "platforms": {},
        "priority_order": 4,
        "slug": "beauty-personal-care",
        "synonyms": [],
        "tags": [],
        "uid": 10
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:45:39.797000Z",
        "id": "5f2a7fc331c66700018cdc4b",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/vQv4ot_0DEFAULT-LOGO.jpg701cb5af-2024-4abf-ae5d-b68bc1a3cd43/vQv4ot_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T11:38:57.599000Z",
        "name": "Home & Living",
        "platforms": {},
        "priority_order": 5,
        "slug": "home-living",
        "synonyms": [],
        "tags": [],
        "uid": 11
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:48:42.347000Z",
        "id": "5f2a807a31c66700018cdc4e",
        "is_active": false,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/hTobjV_0DEFAULT-LOGO.jpga020159c-7fe7-4c1c-a11a-4be61a60da9f/hTobjV_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:48:42.347000Z",
        "name": "Baby Care & Kids Essentials",
        "platforms": {},
        "priority_order": 7,
        "slug": "baby-care-kids-essentials",
        "synonyms": [],
        "tags": [],
        "uid": 14
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "created_on": "2021-01-13T10:12:33.002000Z",
        "id": "5ffec79192813f0001eb6560",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/rNz8grLys-.png",
        "modified_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "modified_on": "2021-01-13T13:50:55.415000Z",
        "name": "Skin care products",
        "platforms": {},
        "priority_order": 10235,
        "slug": "skin-care-produts",
        "synonyms": [
          "skin",
          "care"
        ],
        "tags": [],
        "uid": 21
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 12,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getDepartmentData
Get specific departments details by passing in unique id of the department.




```java
platformClient.catalog.getDepartmentData( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String | yes | A `uid` is a unique identifier of a department. |  



Allows you to get department data, by uid.

*Returned Response:*




[DepartmentsResponse](#DepartmentsResponse)

Departments Data. See example below or refer `DepartmentsResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "created_on": "2020-07-01T05:33:39.325000Z",
        "id": "5efc2033623d390001782238",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpgc7d0c15c-c1ff-47eb-8423-6e2df51f2ddf/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpg",
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-03T15:55:25.118000Z",
        "name": "Sample Dept",
        "platforms": {},
        "priority_order": 111,
        "slug": "sample-dept",
        "synonyms": [
          "test",
          "sampe"
        ],
        "tags": [],
        "uid": 5
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "0",
          "username": "app@fynd.com"
        },
        "created_on": "2020-05-19T06:53:37.629000Z",
        "id": "5ec3827156a7200001c9aeea",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/addsale/media/logo/department/original/15974_381e2236c2a348cc851c29a5d05c66a9.png",
        "modified_by": {
          "user_id": "10",
          "username": "fahimsakri_gofynd_com_44938"
        },
        "modified_on": "2021-03-04T14:01:02.556000Z",
        "name": "Men's Fashion",
        "platforms": {
          "fynd": true,
          "fynd_store": true,
          "marketplace": true,
          "openapi": true,
          "uniket_store": true,
          "uniket_wholesale": true
        },
        "priority_order": 111,
        "slug": "men-s-fashion",
        "synonyms": [],
        "tags": [],
        "uid": 2
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "10",
          "username": "fahimsakri_gofynd_com_44938"
        },
        "created_on": "2020-06-29T10:59:33.620000Z",
        "id": "5ef9c9959b04f00001e40dba",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:08:02.675000Z",
        "name": "Groceries",
        "platforms": {},
        "priority_order": 10,
        "slug": "groceries",
        "synonyms": [],
        "tags": [],
        "uid": 4
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "0",
          "username": "app@fynd.com"
        },
        "created_on": "2020-05-18T16:14:41.689000Z",
        "id": "5ec2b471661a4100019fca0d",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/platform/pictures/free-logo/original/_G1Z2Fg1L-http:d3p8ifzkmzds37.cloudfront.netmedialogodepartmentoriginal15870_c287d3c2431a432bb0e49363ef6b82bc.png.png",
        "modified_by": {
          "user_id": "5677",
          "username": "917753852478_51632"
        },
        "modified_on": "2021-03-04T15:39:38.528000Z",
        "name": "Electronics",
        "platforms": {
          "fynd": true,
          "fynd_store": true,
          "marketplace": true,
          "openapi": true,
          "uniket_store": true,
          "uniket_wholesale": true
        },
        "priority_order": 100,
        "slug": "electronics",
        "synonyms": [],
        "tags": [],
        "uid": 1
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "created_on": "2020-05-27T12:04:19.111000Z",
        "id": "5ece5743cd1bae0001440427",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/landscape-banner/original/g2plam_logo_Jio.pngeeb392ca-3958-46a0-9f13-23c205b596f7/g2plam_logo_Jio.png",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:07:46.060000Z",
        "name": "Industrial Supplies",
        "platforms": {},
        "priority_order": 111,
        "slug": "industrial-supplies",
        "synonyms": [],
        "tags": [],
        "uid": 3
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "13",
          "username": "abhinavsrivastava_gofynd_com_05674"
        },
        "created_on": "2020-07-06T07:56:01.508000Z",
        "id": "5f02d9116b0ae500018923dd",
        "is_active": false,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/wTcfEi_crysis_-_1.jpg14580947-a659-486d-b2d3-d2ca025b1cac/wTcfEi_crysis_-_1.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:08:12.576000Z",
        "name": "Clothing",
        "platforms": {},
        "priority_order": 1,
        "slug": "clothing",
        "synonyms": [],
        "tags": [],
        "uid": 6
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:04:33.604000Z",
        "id": "5f2a762131c66700018cdc47",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/RxTsd8_0DEFAULT-LOGO.jpg000ccfc1-2f79-4426-9ac3-de2468c2fcb9/RxTsd8_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:44:01.234000Z",
        "name": "Kids",
        "platforms": {},
        "priority_order": 3,
        "slug": "kids",
        "synonyms": [],
        "tags": [],
        "uid": 8
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:44:46.632000Z",
        "id": "5f2a7f8e31c66700018cdc49",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/tKkDB8_0DEFAULT-LOGO.jpg1c324d4d-f667-4af8-8d98-37205d34e3b5/tKkDB8_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T18:07:35.231000Z",
        "name": "Women's Fashion",
        "platforms": {},
        "priority_order": 2,
        "slug": "women-s-fashion",
        "synonyms": [],
        "tags": [],
        "uid": 9
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:45:12.075000Z",
        "id": "5f2a7fa831c66700018cdc4a",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/oLoxiL_0DEFAULT-LOGO.jpgbd050200-700a-4a3e-9da6-e6b78fbee943/oLoxiL_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:48:01.660000Z",
        "name": "Beauty & Personal Care",
        "platforms": {},
        "priority_order": 4,
        "slug": "beauty-personal-care",
        "synonyms": [],
        "tags": [],
        "uid": 10
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:45:39.797000Z",
        "id": "5f2a7fc331c66700018cdc4b",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/vQv4ot_0DEFAULT-LOGO.jpg701cb5af-2024-4abf-ae5d-b68bc1a3cd43/vQv4ot_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "3",
          "username": "918793638893_86554"
        },
        "modified_on": "2020-08-06T11:38:57.599000Z",
        "name": "Home & Living",
        "platforms": {},
        "priority_order": 5,
        "slug": "home-living",
        "synonyms": [],
        "tags": [],
        "uid": 11
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "created_on": "2020-08-05T09:48:42.347000Z",
        "id": "5f2a807a31c66700018cdc4e",
        "is_active": false,
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/hTobjV_0DEFAULT-LOGO.jpga020159c-7fe7-4c1c-a11a-4be61a60da9f/hTobjV_0DEFAULT-LOGO.jpg",
        "modified_by": {
          "user_id": "5634",
          "username": "asavarijadhav_gofynd_com_99880"
        },
        "modified_on": "2020-08-05T09:48:42.347000Z",
        "name": "Baby Care & Kids Essentials",
        "platforms": {},
        "priority_order": 7,
        "slug": "baby-care-kids-essentials",
        "synonyms": [],
        "tags": [],
        "uid": 14
      },
      {
        "_cls": "Department",
        "_custom_json": {},
        "created_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "created_on": "2021-01-13T10:12:33.002000Z",
        "id": "5ffec79192813f0001eb6560",
        "is_active": true,
        "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/rNz8grLys-.png",
        "modified_by": {
          "user_id": "5721",
          "username": "919821012599_75351"
        },
        "modified_on": "2021-01-13T13:50:55.415000Z",
        "name": "Skin care products",
        "platforms": {},
        "priority_order": 10235,
        "slug": "skin-care-produts",
        "synonyms": [
          "skin",
          "care"
        ],
        "tags": [],
        "uid": 21
      }
    ],
    "page": {
      "type": ""
    }
  }
}
```
</details>

</details>









---


### updateDepartment
Update the department by their uid.




```java
platformClient.catalog.updateDepartment( uid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| uid | String | yes | A `uid` is a unique identifier of a department. |  
| body | [DepartmentCreateUpdate](#DepartmentCreateUpdate) | yes | Request body |


Update the department by their uid using this API.

*Returned Response:*




[DepartmentModel](#DepartmentModel)

Success Response. See example below or refer `DepartmentCreateResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "created_on": "2021-04-02T15:43:59.410000Z",
    "is_active": true,
    "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/xKDsQBbu4-department.png",
    "modified_by": {
      "user_id": "f5b6a546565146sdfg584c342",
      "username": "31315573458_05620"
    },
    "modified_on": "2022-08-09T15:44:02.540740",
    "name": "Fashion",
    "priority_order": 1,
    "slug": "fashion",
    "synonyms": [
      "fashion",
      "mensfashion"
    ],
    "uid": 2
  }
}
```
</details>

</details>









---


### listTemplateBrandTypeValues
Allows you to list all values for Templates, Brands or Type




```java
platformClient.catalog.listTemplateBrandTypeValues( filter,  templateTag,  itemType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| filter | String | yes | A `filter` is the unique identifier of the type of value required. |   
| templateTag | String? | no | A `template_tag` is the identifier of the type of template required. |   
| itemType | String? | no | A `item_type` is the identifier of the type of template required. |  



The filter type query parameter defines what type of data to return. The type of query returns the valid values for the same

*Returned Response:*




[ProductConfigurationDownloads](#ProductConfigurationDownloads)

See example below or refer `ProductConfigurationDownloadsSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "display": "csv",
        "value": "csv"
      },
      {
        "display": "excel",
        "value": "excel"
      }
    ],
    "multivalue": false
  }
}
```
</details>

</details>









---


### bulkHsnCode
Bulk Create or Update Hsn Code.




```java
platformClient.catalog.bulkHsnCode(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company id |  
| body | [BulkHsnUpsert](#BulkHsnUpsert) | yes | Request body |


Bulk Create or Update Hsn Code.

*Returned Response:*




[BulkHsnResponse](#BulkHsnResponse)

See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "success": true
    }
  }
}
```
</details>

</details>









---


### getHsnCode
Fetch Hsn Code.




```java
platformClient.catalog.getHsnCode( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company id |   
| id | String | yes | Unique id |  



Fetch Hsn Code.

*Returned Response:*




[HsnCode](#HsnCode)

See example below details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "threshold2": 0,
      "tax_on_mrp": false,
      "hsn_code": "xxxxxxxx",
      "tax1": 0,
      "hs2_code": "xx",
      "threshold1": 99,
      "tax_on_esp": true,
      "id": "5f32ce379780fb00015c2115",
      "modified_on": "2023-12-07 06:12:38.553000",
      "tax2": 0,
      "company_id": 1
    }
  }
}
```
</details>

</details>









---


### updateHsnCode
Update Hsn Code.




```java
platformClient.catalog.updateHsnCode( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company id |   
| id | String | yes | Unique id |  
| body | [HsnUpsert](#HsnUpsert) | yes | Request body |


Update Hsn Code.

*Returned Response:*




[UpdateHsnCode](#UpdateHsnCode)

See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "company_id": 1,
      "hs2_code": "xx",
      "hsn_code": "xxxxxxxx",
      "id": "xxxxxxxxxxxx",
      "modified_by": {
        "user_id": "0",
        "username": "narutouzumaki"
      },
      "slabs": [
        {
          "tax": 0,
          "threshold": 999999
        },
        {
          "tax": 0,
          "threshold": 0
        }
      ],
      "tax_on": "esp"
    }
  }
}
```
</details>

</details>









---


### getInventories
Get Inventory for company




```java
platformClient.catalog.getInventories( itemId,  size,  pageNo,  pageSize,  q,  sellable,  storeIds,  sizeIdentifier) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer? | no | Item code of the product of which size is to be get. |   
| size | String? | no | Size of which inventory is to get. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search with help of store code. |   
| sellable | Boolean? | no | Filter on whether product is in stock or not. |   
| storeIds | List<Integer>? | no | The Store Id of products to fetch inventory. |   
| sizeIdentifier | Integer? | no | Size Identifier (Seller Identifier or Primary Identifier) of which inventory is to get. |  



This API allows get Inventories data for particular company.

*Returned Response:*




[GetInventoriesResponse](#GetInventoriesResponse)

returns a list of all inventory grouped by size and store




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "brand": {
          "id": 355
        },
        "company": {
          "id": 46
        },
        "country_of_origin": "Malaysia",
        "created_by": {
          "user_id": "68c3800d602c0fda0dab4fea",
          "username": "abhishekbhakurlekar_gofynd_com_63787"
        },
        "date_meta": {
          "added_on_store": "2023-01-20T07:26:18.834000",
          "created_on": "2023-01-20T07:26:18.828000",
          "inventory_updated_on": "2023-01-20T07:26:18.828000",
          "modified_on": "2023-01-20T07:26:18.828000"
        },
        "dimension": {
          "height": 10,
          "length": 25,
          "unit": "cm",
          "width": 15
        },
        "expiration_date": "9998-01-30T23:59:00",
        "id": "63ca421a6fb0ce930685f46e",
        "identifier": {
          "alu": "410163085004",
          "upc": "777697046"
        },
        "is_set": false,
        "manufacturer": {
          "address": "5TH FLOOR, COURT HOUSE,LOKMANYA TILAK MARGA, DHOBI TALAOMUMBAI MAHARASHTRA, , MAHARASHTRA, MUMBAI",
          "is_default": true,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "modified_by": {
          "user_id": "68c3800d602c0fda0dab4fea",
          "username": "abhishekbhakurlekar_gofynd_com_63787"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": false
        },
        "price": {
          "currency": "INR",
          "effective": 8000,
          "marked": 8000,
          "transfer": 0
        },
        "quantities": {
          "sellable": {
            "count": 12
          }
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "410163085004",
        "size": "S",
        "stage": "verified",
        "store": {
          "name": "Khan Market",
          "store_code": "THR1",
          "store_type": "high_street",
          "uid": 10444
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 12,
        "trace_id": "inventory.bb475064-9893-11ed-88db-2efc0f0504bd",
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Brooks Brothers India Private Limited registered address is 8th Floor, Maker Tower 'E' Cuffe Parade Mumbai MH 400005 IN"
            ],
            "name": "Imported & Marketed by Brooks Brothers India Pvt.Ltd",
            "type": "Importer"
          }
        ],
        "uid": "10444_410163085004",
        "weight": {
          "shipping": 999,
          "unit": "gram"
        }
      },
      {
        "brand": {
          "id": 355
        },
        "company": {
          "id": 46
        },
        "country_of_origin": "Malaysia",
        "created_by": {
          "user_id": "68c3800d602c0fda0dab4fea",
          "username": "abhishekbhakurlekar_gofynd_com_63787"
        },
        "date_meta": {
          "added_on_store": "2023-01-16T05:25:49.491000",
          "created_on": "2023-01-16T05:25:49.482000",
          "inventory_updated_on": "2023-01-16T05:25:49.482000",
          "modified_on": "2023-01-16T05:25:49.482000"
        },
        "dimension": {
          "height": 10,
          "length": 25,
          "unit": "cm",
          "width": 15
        },
        "expiration_date": "9998-01-30T23:59:00",
        "id": "63c4dfdd11e44ffd96d600bc",
        "identifier": {
          "alu": "410163085005",
          "upc": "777697038"
        },
        "is_set": false,
        "manufacturer": {
          "address": "5TH FLOOR, COURT HOUSE,LOKMANYA TILAK MARGA, DHOBI TALAOMUMBAI MAHARASHTRA, , MAHARASHTRA, MUMBAI",
          "is_default": true,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "modified_by": {
          "user_id": "68c3800d602c0fda0dab4fea",
          "username": "abhishekbhakurlekar_gofynd_com_63787"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": false
        },
        "price": {
          "currency": "INR",
          "effective": 8000,
          "marked": 8000,
          "transfer": 0
        },
        "quantities": {
          "sellable": {
            "count": 12
          }
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "410163085005",
        "size": "M",
        "stage": "verified",
        "store": {
          "name": "Khan Market",
          "store_code": "THR1",
          "store_type": "high_street",
          "uid": 10444
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 12,
        "trace_id": "inventory.3c9a25e4-955e-11ed-8584-92a07e366903",
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Brooks Brothers India Private Limited registered address is 8th Floor, Maker Tower 'E' Cuffe Parade Mumbai MH 400005 IN"
            ],
            "name": "Imported & Marketed by Brooks Brothers India Pvt.Ltd",
            "type": "Importer"
          }
        ],
        "uid": "10444_410163085005",
        "weight": {
          "shipping": 999,
          "unit": "gram"
        }
      },
      {
        "brand": {
          "id": 355
        },
        "company": {
          "id": 46
        },
        "country_of_origin": "Malaysia",
        "created_by": {
          "user_id": "bc5fbaf5e6f4b5288e9a9a22",
          "username": "sagardhiman_gofynd_com_43846"
        },
        "date_meta": {
          "added_on_store": "2023-01-05T10:45:41.988000",
          "created_on": "2023-01-05T10:45:41.979000",
          "inventory_updated_on": "2023-01-19T10:37:00.504000",
          "modified_on": "2023-01-19T10:37:00.504000"
        },
        "dimension": {
          "height": 10,
          "length": 25,
          "unit": "cm",
          "width": 15
        },
        "expiration_date": "9998-01-30T23:59:00",
        "id": "63b6aa5558bf3ed100740c10",
        "identifier": {
          "alu": "410163085004",
          "upc": "777697046"
        },
        "is_set": false,
        "manufacturer": {
          "address": "5TH FLOOR, COURT HOUSE,LOKMANYA TILAK MARGA, DHOBI TALAOMUMBAI MAHARASHTRA, , MAHARASHTRA, MUMBAI",
          "is_default": true,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "modified_by": {
          "user_id": "68c3800d602c0fda0dab4fea",
          "username": "abhishekbhakurlekar_gofynd_com_63787"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": false
        },
        "price": {
          "currency": "INR",
          "effective": 7001,
          "marked": 8000,
          "transfer": 0
        },
        "quantities": {
          "damaged": {
            "count": 0
          },
          "not_available": {
            "count": 0
          },
          "sellable": {
            "count": 5001
          }
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "410163085004",
        "size": "S",
        "stage": "verified",
        "store": {
          "name": "Reliance 2",
          "store_code": "R591",
          "store_type": "warehouse",
          "uid": 11336
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 5001,
        "trace_id": "inventory.3485e8b4-97e5-11ed-a9d9-5eca1fff6de0",
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Brooks Brothers India Private Limited registered address is 8th Floor, Maker Tower 'E' Cuffe Parade Mumbai MH 400005 IN"
            ],
            "name": "Imported & Marketed by Brooks Brothers India Pvt.Ltd",
            "type": "Importer"
          }
        ],
        "uid": "11336_410163085004",
        "weight": {
          "shipping": 999,
          "unit": "gram"
        }
      },
      {
        "brand": {
          "id": 355
        },
        "company": {
          "id": 46
        },
        "country_of_origin": "Malaysia",
        "created_by": {
          "user_id": "5f200182ee4d3377e83330c2",
          "username": "meghanakate_gofynd_com_58351"
        },
        "date_meta": {
          "added_on_store": "2022-11-29T11:17:42.271000",
          "created_on": "2022-11-29T11:17:42.263000",
          "inventory_updated_on": "2022-11-29T11:18:35.183000",
          "modified_on": "2022-11-29T11:18:35.183000"
        },
        "dimension": {
          "height": 10,
          "length": 25,
          "unit": "cm",
          "width": 15
        },
        "expiration_date": "9998-01-30T23:59:00",
        "id": "6385ea569715e74d8a92ce88",
        "identifier": {
          "alu": "410163085001",
          "upc": "777697079"
        },
        "is_set": false,
        "manufacturer": {
          "address": "5TH FLOOR, COURT HOUSE,LOKMANYA TILAK MARGA, DHOBI TALAOMUMBAI MAHARASHTRA, , MAHARASHTRA, MUMBAI",
          "is_default": true,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "modified_by": {
          "user_id": "5f200182ee4d3377e83330c2",
          "username": "meghanakate_gofynd_com_58351"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": false
        },
        "price": {
          "currency": "INR",
          "effective": 8000,
          "marked": 8000,
          "transfer": 0
        },
        "quantities": {
          "damaged": {
            "count": 0
          },
          "not_available": {
            "count": 0
          },
          "sellable": {
            "count": 1000
          }
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "410163085001",
        "size": "XXL",
        "stage": "verified",
        "store": {
          "name": "Shopsense Retail Technologies",
          "store_code": "SRT91",
          "store_type": "warehouse",
          "uid": 11701
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 1000,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Brooks Brothers India Private Limited registered address is 8th Floor, Maker Tower 'E' Cuffe Parade Mumbai MH 400005 IN"
            ],
            "name": "Imported & Marketed by Brooks Brothers India Pvt.Ltd",
            "type": "Importer"
          }
        ],
        "uid": "11701_410163085001",
        "weight": {
          "shipping": 999,
          "unit": "gram"
        }
      },
      {
        "brand": {
          "id": 355
        },
        "company": {
          "id": 46
        },
        "country_of_origin": "Malaysia",
        "created_by": {
          "user_id": "5f200182ee4d3377e83330c2",
          "username": "meghanakate_gofynd_com_58351"
        },
        "date_meta": {
          "added_on_store": "2022-11-29T11:17:34.431000",
          "created_on": "2022-11-29T11:17:34.424000",
          "inventory_updated_on": "2022-11-29T11:18:27.331000",
          "modified_on": "2022-11-29T11:18:27.331000"
        },
        "dimension": {
          "height": 10,
          "length": 25,
          "unit": "cm",
          "width": 15
        },
        "expiration_date": "9998-01-30T23:59:00",
        "id": "6385ea4e9715e74d8a92ce86",
        "identifier": {
          "alu": "410163085003",
          "upc": "777697053"
        },
        "is_set": false,
        "manufacturer": {
          "address": "5TH FLOOR, COURT HOUSE,LOKMANYA TILAK MARGA, DHOBI TALAOMUMBAI MAHARASHTRA, , MAHARASHTRA, MUMBAI",
          "is_default": true,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "modified_by": {
          "user_id": "5f200182ee4d3377e83330c2",
          "username": "meghanakate_gofynd_com_58351"
        },
        "platforms": {
          "fynd": false,
          "uniket_wholesale": false
        },
        "price": {
          "currency": "INR",
          "effective": 8000,
          "marked": 8000,
          "transfer": 0
        },
        "quantities": {
          "damaged": {
            "count": 0
          },
          "not_available": {
            "count": 0
          },
          "sellable": {
            "count": 1000
          }
        },
        "return_config": {
          "returnable": true,
          "time": 30,
          "unit": "days"
        },
        "seller_identifier": "410163085003",
        "size": "XL",
        "stage": "verified",
        "store": {
          "name": "Shopsense Retail Technologies",
          "store_code": "SRT91",
          "store_type": "warehouse",
          "uid": 11701
        },
        "tax_identifier": {
          "hsn_code_id": "000000000000000000000001"
        },
        "total_quantity": 1000,
        "track_inventory": true,
        "trader": [
          {
            "address": [
              "Brooks Brothers India Private Limited registered address is 8th Floor, Maker Tower 'E' Cuffe Parade Mumbai MH 400005 IN"
            ],
            "name": "Imported & Marketed by Brooks Brothers India Pvt.Ltd",
            "type": "Importer"
          }
        ],
        "uid": "11701_410163085003",
        "weight": {
          "shipping": 999,
          "unit": "gram"
        }
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 5,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getInventoryBulkUploadHistory
Get a list of all bulk Inventory upload jobs.




```java
platformClient.catalog.getInventoryBulkUploadHistory( pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of of which Inventory Bulk Upload History to be obtained. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk Inventory upload jobs data.

*Returned Response:*




[BulkInventoryGet](#BulkInventoryGet)

List of bulk Inventory upload jobs. See `BulkInventoryGetSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-03-11T10:54:44.998000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/50DbgKLND-NtnL_EAVb-REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "6049f6f5723043000125a9ea",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-03-11T10:54:45.296000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-03-04T09:46:51.714000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/NtnL_EAVb-REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "6040ac8b1803830001fcc1ed",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-03-04T09:46:55.349000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-03-04T09:22:32.222000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/bmBZY9iAX-REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "6040a6d8104f110001a85061",
        "is_active": true,
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-03-04T09:22:32.222000Z",
        "stage": "terminated",
        "succeed": 0,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-03-04T09:20:29.719000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/m73yWRT3v-REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "6040a65d104f110001a85060",
        "is_active": true,
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-03-04T09:20:29.719000Z",
        "stage": "terminated",
        "succeed": 0,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-03-04T08:50:49.367000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/W9lxe19Uu-REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "60409f699b21e30001c1e6b5",
        "is_active": true,
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-03-04T08:50:49.367000Z",
        "stage": "terminated",
        "succeed": 0,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Sourabh Nilakhe",
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "created_on": "2021-02-10T10:57:57.236000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/REicn1sDv-V8ZrKdnLt-product_inventory.csv",
        "id": "6023bc35c85ca1000171e08a",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-02-10T10:57:57.571000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Sourabh Nilakhe",
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "created_on": "2021-02-10T10:57:22.535000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/Oth_LaVyI-V8ZrKdnLt-product_inventory.csv",
        "id": "6023bc12c85ca1000171e089",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-02-10T10:57:23.311000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-01-13T13:58:06.155000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/V8ZrKdnLt-product_inventory.csv",
        "id": "5ffefc6ee2db8f000183fab8",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-01-13T13:58:06.369000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-01-13T13:57:38.598000Z",
        "failed": 1,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/t3T6X2Riy-product_inventory.csv",
        "id": "5ffefc5252f31100012ea981",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-01-13T13:57:38.832000Z",
        "stage": "failed",
        "succeed": 0,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-01-13T13:57:13.639000Z",
        "failed": 1,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/NSTuhgsgq-product_inventory.csv",
        "id": "5ffefc39a0d1e20001ae118c",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-01-13T13:57:13.847000Z",
        "stage": "failed",
        "succeed": 0,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-01-12T06:37:06.167000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/cwQV-Z6gT-product_inventory.xlsx",
        "id": "5ffd4392b4c34d000170697b",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-01-12T06:37:06.307000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      },
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 1,
        "created_by": {
          "full_name": "Nikhil Mhatre",
          "user_id": "16",
          "username": "nikhilmhatre_gofynd_com_97636"
        },
        "created_on": "2021-01-12T06:36:24.292000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.addsale.com/x0/company/1/self/documents/inventory-import/free/original/gccehef2f-product_inventory.xlsx",
        "id": "5ffd4368b4c34d0001706960",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-01-12T06:36:24.535000Z",
        "stage": "completed",
        "succeed": 1,
        "total": 1
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 39,
      "size": 4,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### createBulkInventoryJob
Create a Bulk Inventory upload Job.




```java
platformClient.catalog.createBulkInventoryJob(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which Inventory to be uploaded. |  
| body | [InventoryBulkJob](#InventoryBulkJob) | yes | Request body |


This API helps to create a bulk Inventory upload job.

*Returned Response:*




[InventoryBulkResponse](#InventoryBulkResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "batch_id": "507f1f77bcf86cd799439011"
  }
}
```
</details>

</details>









---


### deleteBulkInventoryJob
Delete Bulk Inventory job.




```java
platformClient.catalog.deleteBulkInventoryJob( batchId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the company of which bulk Inventory job is to be deleted. |   
| batchId | String | yes | Batch Id of the bulk delete job. |  



This API allows to delete bulk Inventory job associated with company.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### createBulkInventory
Create products in bulk associated with given batch Id.




```java
platformClient.catalog.createBulkInventory( batchId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which Inventory is to be uploaded. |   
| batchId | String | yes | Batch Id of the bulk create job. |  
| body | [InventoryBulkRequest](#InventoryBulkRequest) | yes | Request body |


This API helps to create products in bulk push to kafka for approval/creation.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### createInventoryExportJob
Create a Inventory export Job.




```java
platformClient.catalog.createInventoryExportJob(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |  
| body | [InventoryExportRequest](#InventoryExportRequest) | yes | Request body |


This API helps to create a Inventory export job.

*Returned Response:*




[InventoryExportResponse](#InventoryExportResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "_id": "657ed134c39a2476add14169",
    "created_on": "2023-12-17T10:45:08.298503Z",
    "status": "pending",
    "modified_on": "2023-12-17T10:45:08.298521",
    "created_by": {
      "user_id": "5e199e6998cfe1776f1385dc",
      "username": "rohanshah@fynd.com"
    },
    "notification_emails": [],
    "stats": {},
    "seller_id": 10,
    "task_id": "588bd932-9cc9-11ee-8cc4-d6fb2161153f",
    "type": "excel",
    "trigger_on": "2023-12-17T10:45:08.298503Z",
    "brand": [
      19
    ],
    "store": [
      1
    ]
  }
}
```
</details>

</details>









---


### getInventoryExport
Get Inventory export history.




```java
platformClient.catalog.getInventoryExport() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |  



This API helps to get Inventory export history.

*Returned Response:*




[InventoryExportJobResponse](#InventoryExportJobResponse)

Returns a list of inventory export jobs




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "657ed134c39a2476add14169",
        "created_on": "2023-12-17T10:45:08.298000Z",
        "status": "pending",
        "modified_on": "2023-12-17T10:45:08.298000",
        "created_by": {
          "user_id": "5e199e6998cfe1776f1385dc",
          "username": "rohanshah@fynd.com"
        },
        "notification_emails": [],
        "stats": {},
        "seller_id": 10,
        "task_id": "588bd932-9cc9-11ee-8cc4-d6fb2161153f",
        "type": "excel",
        "trigger_on": "2023-12-17T10:45:08.298000Z",
        "brand": [
          19
        ],
        "store": [
          1
        ]
      }
    ]
  }
}
```
</details>

</details>









---


### patchProductExportDetail
Edit notification_emails and status of export job.




```java
platformClient.catalog.patchProductExportDetail( jobId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| jobId | String | yes | Company Id in which assets to be uploaded. |  
| body | [ExportPatchRequest](#ExportPatchRequest) | yes | Request body |


This API helps to edit notification_emails and status of export job.

*Returned Response:*




[PatchProductDownloadsResponse](#PatchProductDownloadsResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "stats": {
        "total": 1
      },
      "seller_id": 10,
      "task_id": "afcfccb2-9e31-11ee-a3ca-d6fb2161153f",
      "filters": {
        "brands": [],
        "templates": [
          "activewear-accessories"
        ],
        "catalogue_types": [
          "standard"
        ]
      },
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "000000000000000016841367"
      },
      "created_on": "2023-12-19T05:44:33.528000Z",
      "modified_on": "2023-12-19T05:44:33.528000",
      "type": "excel",
      "notification_emails": [
        "data@mail.com"
      ],
      "status": "pending"
    }
  }
}
```
</details>

</details>









---


### getProductExportDetail
Get Detail Product export detail.




```java
platformClient.catalog.getProductExportDetail( jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| jobId | String | yes | Company Id in which assets to be uploaded. |  



This API helps to get detail of Product export.

*Returned Response:*




[GetProductDownloadsResponse](#GetProductDownloadsResponse)

Returns a detail of product export jobs




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "status": "pending",
    "created_by": {
      "username": "app@fynd.com",
      "user_id": "000000000000000016841367"
    },
    "stats": {
      "total": 1
    },
    "notification_emails": [],
    "seller_id": 10,
    "filters": {
      "templates": [],
      "catalogue_types": [
        "standard"
      ],
      "brands": []
    },
    "task_id": "afcfccb2-9e31-11ee-a3ca-d6fb2161153f",
    "modified_on": "2023-12-19T05:44:33.528000",
    "_id": "65812dc1f4199a68512e69ff",
    "type": "excel",
    "created_on": "2023-12-19T05:44:33.528000Z",
    "id": "65812dc1f4199a68512e69ff"
  }
}
```
</details>

</details>









---


### patchInventoryExportDetail
Edit notification_emails and status of export job.




```java
platformClient.catalog.patchInventoryExportDetail( jobId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| jobId | String | yes | Company Id in which assets to be uploaded. |  
| body | [ExportPatchRequest](#ExportPatchRequest) | yes | Request body |


This API helps to edit notification_emails and status of export job.

*Returned Response:*




[EditInventoryDownloadsResponse](#EditInventoryDownloadsResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x5/catalog/24/fffac430-829e-11ed-8ffa-f2f2a1c4d5d1/fffac430-829e-11ed-8ffa-f2f2a1c4d5d1.zip",
      "completed_on": "2022-12-23T08:51:34.561000Z",
      "seller_id": 24,
      "task_id": "fffac430-829e-11ed-8ffa-f2f2a1c4d5d1",
      "created_on": "2022-12-23T08:51:32.942000Z",
      "modified_on": "2022-12-23T08:51:32.942000",
      "notification_emails": [
        "data@mail.com"
      ],
      "status": "success"
    }
  }
}
```
</details>

</details>









---


### getInventoryExportDetail
Get Detail Product export detail.




```java
platformClient.catalog.getInventoryExportDetail( jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| jobId | String | yes | Company Id in which assets to be uploaded. |  



This API helps to get detail of Product export.

*Returned Response:*




[EditInventoryDownloadsResponse](#EditInventoryDownloadsResponse)

Returns a detail of product export jobs




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x5/catalog/24/fffac430-829e-11ed-8ffa-f2f2a1c4d5d1/fffac430-829e-11ed-8ffa-f2f2a1c4d5d1.zip",
    "completed_on": "2022-12-23T08:51:34.561000Z",
    "seller_id": 24,
    "task_id": "fffac430-829e-11ed-8ffa-f2f2a1c4d5d1",
    "created_on": "2022-12-23T08:51:32.942000Z",
    "modified_on": "2022-12-23T08:51:32.942000",
    "_id": "63a56c14863953d1af0856a8",
    "notification_emails": [
      "data@mail.com"
    ],
    "status": "success",
    "id": "63a56c14863953d1af0856a8"
  }
}
```
</details>

</details>









---


### exportInventoryConfig
Get List of different filters for inventory export




```java
platformClient.catalog.exportInventoryConfig( filter) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| filter | String | yes | filter type from any one of ['brand', 'store', 'type'] |  



This API allows get List of different filters like brand, store, and type for inventory export.

*Returned Response:*




[InventoryConfig](#InventoryConfig)

returns filters configuration for inventory export




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "display": "csv",
        "value": "csv"
      },
      {
        "display": "excel",
        "value": "excel"
      }
    ],
    "multivalue": true
  }
}
```
</details>

</details>









---


### downloadInventoryTemplateView
Download Product Template View




```java
platformClient.catalog.downloadInventoryTemplateView( type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| type | String | yes | Type of file |  



Allows you to download product template data

*Returned Response:*




[String](#String)

CSV File of product template data.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": "XML"
}
```
</details>

</details>









---


### validateProductTemplateSchema
Validate Product Template Schema




```java
platformClient.catalog.validateProductTemplateSchema( itemType,  bulk) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| itemType | String | yes | An `item_type` defines the type of item. The default value is standard. |   
| bulk | Boolean | yes | Type of file template i.e if bulk |  



Allows you to list all product templates validation values for all the fields present in the database

*Returned Response:*




[InventoryValidationResponse](#InventoryValidationResponse)

List of fields and validation values fro each. See example below or refer `InventoryValidationResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "definitions": {
        "InventoryBaseSchema": {
          "properties": {
            "currency": {
              "title": "Currency",
              "type": "string"
            },
            "price": {
              "exclusiveMinimum": 1,
              "title": "Actual Price",
              "type": "number"
            },
            "price_effective": {
              "exclusiveMinimum": 1,
              "title": "Selling Price",
              "type": "number"
            },
            "quantity": {
              "minimum": 0,
              "title": "Quantity",
              "type": "integer"
            },
            "seller_identifier": {
              "pattern": "^[A-Za-z0-9]*$",
              "title": "Gtin Value",
              "type": "string"
            },
            "size": {
              "title": "Size",
              "type": "string"
            },
            "store_code": {
              "enum": [
                "RUOSH43",
                "S106",
                "S108",
                "TIO9",
                "talha"
              ],
              "title": "Store Code",
              "type": "string"
            }
          },
          "required": [
            "price",
            "price_effective",
            "seller_identifier",
            "quantity",
            "store_code",
            "currency",
            "size"
          ],
          "title": "InventoryBaseSchema",
          "type": "object"
        },
        "ItemQuery": {
          "properties": {
            "brand_uid": {
              "title": "Brand Uid",
              "type": "integer"
            },
            "item_code": {
              "title": "Item Code",
              "type": "integer"
            },
            "uid": {
              "title": "Uid",
              "type": "integer"
            }
          },
          "title": "ItemQuery",
          "type": "object"
        }
      },
      "properties": {
        "sizes": {
          "title": "Sizes",
          "type": "array"
        }
      },
      "required": [
        "item",
        "sizes"
      ],
      "title": "InventoryValidationResponse",
      "type": "object"
    },
    "message": "Success"
  }
}
```
</details>

</details>









---


### getOptimalLocations
Location Reassignment




```java
platformClient.catalog.getOptimalLocations(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company inside which the location is to be created. |  
| body | [AssignStore](#AssignStore) | yes | Request body |


Allows you to reassign locations

*Returned Response:*




[StoreAssignResponse](#StoreAssignResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true,
    "items": []
  }
}
```
</details>

</details>









---


### getCompanyBrandDetail
Get the Company Brand details of Optin.




```java
platformClient.catalog.getCompanyBrandDetail( isActive,  q,  pageNo,  pageSize,  marketplace) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | The company id for which the detail needs to be retrieved. |   
| isActive | Boolean? | no | The is_active status for the optin id. |   
| q | String? | no | The search value to filter the list. |   
| pageNo | Integer? | no | The number of page for the company id. |   
| pageSize | Integer? | no | Number of records that can be seen on the page for the company id. |   
| marketplace | String? | no | The marketplace platform associated with the company id. |  



Get the details of the Brands associated with the given company_id passed.

*Returned Response:*




[OptinCompanyBrandDetailsView](#OptinCompanyBrandDetailsView)

See example below or refer `OptinCompanyBrandDetailsView` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "logo": {},
        "brand_name": "company",
        "name": "company",
        "id": 1,
        "brand_id": 1,
        "company_id": 1,
        "total_article": 0
      },
      {
        "logo": {},
        "brand_name": "company",
        "name": "company",
        "id": 1,
        "brand_id": 1,
        "company_id": 1,
        "total_article": 0
      }
    ],
    "page": {
      "type": "number",
      "current": 1,
      "has_next": false,
      "item_total": 2
    }
  }
}
```
</details>

</details>









---


### getCompanyDetail
Get the Company details.




```java
platformClient.catalog.getCompanyDetail() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | The company id for which the detail needs to be retrieved. |  



Get the details of the company associated with the given company_id passed.

*Returned Response:*




[OptinCompanyDetail](#OptinCompanyDetail)

See example below or refer `OptinCompanyDetailSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "name": "New Company Ltd",
    "uid": 1,
    "business_info": "I am business",
    "business_type": "huf",
    "business_country_info": {
      "country": "India",
      "country_code": "IN"
    },
    "address": {
      "address1": "A/204, Sai Vandan, Tulinj Road. Nallasopara East, ",
      "state": "Maharashtra",
      "pincode": "400603",
      "city": "Mumbai",
      "country": "India",
      "latitude": 19.4232024,
      "longitude": 72.82315109999999,
      "country_code": "IN"
    },
    "document": {
      "type": "pan",
      "value": "CUYPP9644J",
      "legal_name": "Gaurang Bharat Patel",
      "verified": true
    },
    "brands": [
      1
    ],
    "notification_emails": [
      "gaurangpatel@gofynd.com"
    ],
    "warnings": {},
    "stage": "verified"
  }
}
```
</details>

</details>









---


### getCompanyMetrics
Get the Company metrics




```java
platformClient.catalog.getCompanyMetrics() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | The company id for which the detail needs to be retrieved. |  



Get the Company metrics associated with the company ID passed.

*Returned Response:*




[OptinCompanyMetrics](#OptinCompanyMetrics)

See example below or refer `OptinCompanyMetrics` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "company": "verified",
    "brand": 2,
    "store": 0
  }
}
```
</details>

</details>









---


### getStoreDetail
Get the Store details.




```java
platformClient.catalog.getStoreDetail( q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | The company id for which the detail needs to be retrieved. |   
| q | String? | no | The search related the store for the company id. |   
| pageNo | Integer? | no | The number of page for the company id. |   
| pageSize | Integer? | no | Number of records that can be seen on the page for the company id. |  



Get the details of the store associated with the company ID passed.

*Returned Response:*




[OptinStoreDetails](#OptinStoreDetails)

See example below or refer `OptinStoreDetailsSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "Test Store 1",
        "manager": {
          "mobile_no": {
            "number": "08104556147",
            "country_code": 91
          },
          "name": "talha",
          "email": "talha1891@gmail.com"
        },
        "_custom_json": {},
        "store_type": "warehouse",
        "stage": "verified",
        "modified_on": "2022-03-16T13:18:46.470000",
        "verified_by": {
          "username": "WheelJack",
          "user_id": "0"
        },
        "company_id": 47,
        "integration_type": {
          "order": "rbl_sap",
          "inventory": "rbl_sap"
        },
        "created_by": {
          "username": "talhakhan_gofynd_com_20256",
          "user_id": "21"
        },
        "display_name": "Test Store 1",
        "created_on": "2020-09-15T11:51:09.676000",
        "documents": [
          {
            "value": "27AADCR7395F1Z0",
            "verified": true,
            "legal_name": "RELIANCE BRANDS LIMITED",
            "type": "gst"
          }
        ],
        "timing": [
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "monday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "tuesday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "wednesday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "thursday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "friday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "saturday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          },
          {
            "closing": {
              "hour": 22,
              "minute": 0
            },
            "weekday": "sunday",
            "opening": {
              "hour": 11,
              "minute": 0
            },
            "open": true
          }
        ],
        "address": {
          "address1": "B WING GREEN VIEW SOSAITY, LOWER PAREL",
          "landmark": "",
          "address2": "FRIENDS COLONY, BABHAI NAKA, BORIVALI WEST,",
          "country": "INDIA",
          "state": "MAHARASHTRA",
          "country_code": "IN",
          "city": "MUMBAI SUBURBAN",
          "pincode": 400070
        },
        "notification_emails": [],
        "uid": 113366,
        "verified_on": "2022-07-20T09:50:12.635000",
        "modified_by": {
          "username": "radhikaluvani_gofynd_com_73095",
          "user_id": "ff2d78d2e93a0a92e9dd60f6"
        }
      }
    ],
    "page": {
      "type": "number",
      "current": 1,
      "has_next": true,
      "item_total": 2
    }
  }
}
```
</details>

</details>









---


### getProductAttributes
Get list of all the attributes by their l3_categories




```java
platformClient.catalog.getProductAttributes( category,  filter) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company for which you want to view the genders |   
| category | String | yes | It is the name of the l3 cateogry |   
| filter | Boolean? | no | If true, returns filtered values, else returns all the attributes |  



This API allows to list all the attributes by their l3_categories.

*Returned Response:*




[ProductAttributesResponse](#ProductAttributesResponse)

Size guide object. See example below or refer `ProductAttributesResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "variant": false,
        "schema": {
          "allowed_values": [],
          "type": "str",
          "mandatory": false,
          "multi": false,
          "format": "",
          "range": {
            "min": 1
          }
        },
        "details": {
          "display_type": "text"
        },
        "description": "Testing swatch attribute",
        "created_on": "2022-10-07T06:42:08.286000Z",
        "name": "test",
        "modified_on": "2023-12-07T17:37:31.358000Z",
        "departments": [
          "men",
          "fashion"
        ],
        "modified_by": {
          "username": "app@fynd.com",
          "user_id": "000000000000000016841367"
        },
        "created_by": {
          "username": "mohammedansari_fynd_external_com_91689",
          "user_id": "fffac759abfde839d8d2bc2d"
        },
        "filters": {
          "indexing": false
        },
        "slug": "test",
        "is_nested": true,
        "id": "6571b582c1b29f5738dc994f"
      }
    ]
  }
}
```
</details>

</details>









---


### getGenderAttribute
Get gender attribute details




```java
platformClient.catalog.getGenderAttribute( attributeSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company for which you want to view the genders |   
| attributeSlug | String | yes | slug of the attribute for which you want to view the genders |  



This API allows to view the gender attribute details.

*Returned Response:*




[GenderDetail](#GenderDetail)

Size guide object. See example below or refer `GenderDetailSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "name": "test",
    "modified_by": {
      "user_id": "000000000000000016841367",
      "username": "app@fynd.com"
    },
    "description": "Testing swatch attribute",
    "created_on": "2022-10-07T06:42:08.286000",
    "slug": "test",
    "is_nested": true,
    "details": {
      "display_type": "text"
    },
    "_id": "6571b582c1b29f5738dc994f",
    "filters": {
      "indexing": false
    },
    "departments": [
      "men",
      "fashion"
    ],
    "schema": {
      "range": {
        "min": 1
      },
      "mandatory": false,
      "format": "",
      "type": "str",
      "allowed_values": [],
      "multi": false
    },
    "variant": false,
    "modified_on": "2023-12-07T17:37:31.358000",
    "created_by": {
      "user_id": "fffac759abfde839d8d2bc2d",
      "username": "mohammedansari_fynd_external_com_91689"
    }
  }
}
```
</details>

</details>









---


### createProductBundle
Create Product Bundle




```java
platformClient.catalog.createProductBundle(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  
| body | [ProductBundleRequest](#ProductBundleRequest) | yes | Request body |


Create Product Bundle. See `ProductBundleRequest` for the request body parameter need to create a product bundle. On successful request, returns in `ProductBundleRequest` with id

*Returned Response:*




[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

Get bundle with id that is added. See example below or refer `GetProductBundleCreateResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "choice": "single",
    "slug": "bundlename",
    "created_on": "2023-11-30T06:47:07.688761",
    "meta": {},
    "is_active": true,
    "name": "bundlename",
    "_id": "65682febbccabf31d2e6cc9e",
    "products": [
      {
        "auto_select": false,
        "max_quantity": 1,
        "product_uid": 7582054,
        "auto_add_to_cart": false,
        "min_quantity": 1,
        "allow_remove": true
      }
    ],
    "modified_by": {
      "username": "test",
      "user_id": "492cc0ee949ef72b996a8d6e"
    },
    "company_id": 1,
    "modified_on": "2023-11-30T06:47:07.688770",
    "same_store_assignment": true,
    "page_visibility": [],
    "logo": "https://cdn.fynd.com/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/bundle/free/original/DkFGbYsDf-K1Yy48yxL-Samsung-Galaxy-A14-5G-128-GB-6-GB-RAM-Light-Green-Mobile-Phone.webp",
    "created_by": {
      "username": "test",
      "user_id": "492cc0ee949ef72b996a8d6e"
    },
    "id": "65682febbccabf31d2e6cc9e"
  }
}
```
</details>

</details>









---


### getProductBundle
List all Product Bundles




```java
platformClient.catalog.getProductBundle( q,  slug,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| q | String? | no | A search string that is searched with product bundle name. |   
| slug | List<String>? | no | slugs of bundles to be retrieved. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



Get all product bundles for a particular company

*Returned Response:*




[GetProductBundleListingResponse](#GetProductBundleListingResponse)

List of bundle configured for a company. See example below or refer `GetProductBundleListingResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "choice": "multi",
        "company_id": 1,
        "created_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "created_on": "2021-02-19 16:40:26.310007",
        "id": "602f9ca2a596ce312f5956f9",
        "is_active": true,
        "logo": "http://g.com/poo.png/",
        "meta": {},
        "modified_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-19 16:40:26.310027",
        "name": "Bag",
        "page_visibility": [
          "pdp"
        ],
        "products": [
          {
            "allow_remove": true,
            "auto_add_to_cart": false,
            "auto_select": false,
            "max_quantity": 1,
            "min_quantity": 1,
            "product_uid": 7500001
          }
        ],
        "same_store_assignment": true,
        "slug": "bag"
      },
      {
        "choice": "multi",
        "company_id": 1,
        "created_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "created_on": "2021-02-19 16:21:35.091512",
        "id": "602f9837a596ce2edf9868e2",
        "is_active": true,
        "logo": "http://g.com/poo.png/",
        "meta": {},
        "modified_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-19 16:21:35.091540",
        "name": "Bag",
        "page_visibility": [
          "pdp"
        ],
        "products": [
          {
            "allow_remove": true,
            "auto_add_to_cart": false,
            "auto_select": false,
            "max_quantity": 1,
            "min_quantity": 1,
            "product_uid": 7500001
          }
        ],
        "same_store_assignment": true,
        "slug": "bag"
      },
      {
        "choice": "multi",
        "company_id": 1,
        "created_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "created_on": "2021-02-19 16:20:24.605207",
        "id": "602f97f0a596ce2ead47cd0b",
        "is_active": true,
        "logo": "http://g.com/poo.png/",
        "meta": {},
        "modified_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-19 16:20:24.605230",
        "name": "Bag",
        "page_visibility": [
          "pdp"
        ],
        "products": [
          {
            "allow_remove": true,
            "auto_add_to_cart": false,
            "auto_select": false,
            "max_quantity": 1,
            "min_quantity": 1,
            "product_uid": 7500001
          }
        ],
        "same_store_assignment": true,
        "slug": "bag"
      },
      {
        "choice": "multi",
        "company_id": 1,
        "created_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "created_on": "2021-02-19 16:16:46.196449",
        "id": "602f9716a596ce2e415196df",
        "is_active": true,
        "logo": "http://g.com/poo.png/",
        "meta": {},
        "modified_by": {
          "uid": "123",
          "username": "917827311650_22960"
        },
        "modified_on": "2021-02-19 16:16:46.196467",
        "name": "Bag",
        "page_visibility": [
          "pdp"
        ],
        "products": [
          {
            "allow_remove": true,
            "auto_add_to_cart": false,
            "auto_select": false,
            "max_quantity": 1,
            "min_quantity": 1,
            "product_uid": 7500001
          }
        ],
        "same_store_assignment": true,
        "slug": "bag"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "total": 1,
      "total_item_count": 4,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getProductBundleDetail
Get a particular Product Bundle details




```java
platformClient.catalog.getProductBundleDetail( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to retrieve. |  



Get a particular Bundle details by its `id`. If successful, returns a Product bundle resource in the response body specified in `GetProductBundleResponse`

*Returned Response:*




[GetProductBundleResponse](#GetProductBundleResponse)

The Collection object. See example below or refer `GetProductBundleResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "choice": "multi",
    "company_id": 1,
    "logo": "http://g.com/poo.png/",
    "meta": {},
    "name": "Bag",
    "page_visibility": [
      "pdp"
    ],
    "products": [
      {
        "allow_remove": true,
        "auto_add_to_cart": false,
        "auto_select": false,
        "max_quantity": 1,
        "min_quantity": 1,
        "product_details": {
          "attributes": {
            "brand_name": "brand 2"
          },
          "country_of_origin": "India",
          "images": [
            "https://hdn-1.addsale.com/x0/media/pictures/tagged_items/original/random_code_4/FE6DUR_000000.png"
          ],
          "item_code": "760B3BFF-4905-44B8-A50E-082829E7107F",
          "name": "Some Phone",
          "slug": "slug-1",
          "uid": 7500001
        },
        "product_uid": 7500001
      }
    ],
    "same_store_assignment": true,
    "slug": "bag"
  }
}
```
</details>

</details>









---


### updateProductBundle
Update a Product Bundle




```java
platformClient.catalog.updateProductBundle( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| id | String | yes | A `id` is a unique identifier for a particular detail. Pass the `id` of the keywords which you want to delete. |  
| body | [ProductBundleUpdateRequest](#ProductBundleUpdateRequest) | yes | Request body |


Update a Product Bundle by its id. On successful request, returns the updated product bundle

*Returned Response:*




[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

The Collection object. See example below or refer `GetProductBundleCreateResponse` for details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "choice": "multi",
    "company_id": 1,
    "created_by": {
      "uid": "123",
      "username": "917827311650_22960"
    },
    "created_on": "2021-02-19 16:40:26.310007",
    "id": "602f9ca2a596ce312f5956f9",
    "is_active": true,
    "logo": "http://g.com/poo.png/",
    "meta": {},
    "modified_by": {
      "uid": "123",
      "username": "917827311650_22960"
    },
    "modified_on": "2021-02-19 16:40:26.310027",
    "name": "Bag",
    "page_visibility": [
      "pdp"
    ],
    "products": [
      {
        "allow_remove": true,
        "auto_add_to_cart": false,
        "auto_select": false,
        "max_quantity": 1,
        "min_quantity": 1,
        "product_uid": 7500001
      }
    ],
    "same_store_assignment": true,
    "slug": "bag"
  }
}
```
</details>

</details>









---


### getProductAssetsInBulk
Get a list of all bulk asset jobs.




```java
platformClient.catalog.getProductAssetsInBulk( pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the product size. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk asset jobs data associated to a particular company.

*Returned Response:*




[BulkAssetResponse](#BulkAssetResponse)

List of bulk asset jobs List. See `BulkUtil.modify_batch_response` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 61,
        "created_by": {
          "full_name": "nikhil mhatre",
          "user_id": "23175373",
          "username": "nikhilmhatre_gofynd_com_28085_23175373"
        },
        "created_on": "2021-02-25T16:45:22.425000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.fynd.com/company/61/self/documents/product-import/free/original/ZUSmmXHmZ-U8mTYx3KR-Nike-hoddie.zip",
        "id": "6037d422aa879600015c6d1d",
        "is_active": true,
        "modified_by": {
          "user_id": "23175373",
          "username": "nikhilmhatre_gofynd_com_28085_23175373"
        },
        "modified_on": "2021-02-25T16:47:24.551000Z",
        "retry": 1,
        "stage": "completed",
        "succeed": 1,
        "total": 1,
        "tracking_url": "https://api.fynd.com/common/assets/v1/asset/status/extract-zips/3296"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1,
      "size": 3,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### createProductAssetsInBulk
Create a Bulk asset upload Job.




```java
platformClient.catalog.createProductAssetsInBulk(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |  
| body | [ProductBulkAssets](#ProductBulkAssets) | yes | Request body |


This API helps to create a bulk asset upload job.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### getProductBulkUploadHistory
Get a list of all bulk product upload jobs.




```java
platformClient.catalog.getProductBulkUploadHistory( search,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of of which Product Bulk Upload History to be obtained. |   
| search | String? | no | Search string to filter the results by batch id |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This API helps to get bulk product upload jobs data.

*Returned Response:*




[ProductBulkRequestList](#ProductBulkRequestList)

List of bulk product upload jobs. See `BulkRequestGetSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "cancelled": 0,
        "cancelled_records": [],
        "company_id": 61,
        "created_by": {
          "full_name": "Anuja Yadav",
          "user_id": "23218433",
          "username": "yadavanuja039_gmail_com_82948"
        },
        "created_on": "2021-03-12T08:11:06.848000Z",
        "failed": 0,
        "failed_records": [],
        "file_path": "https://hdn-1.fynd.com/company/61/self/documents/product-import/free/original/mkX5ApRmw-sample_bulk_products_footwear.xlsx",
        "id": "604b221a73bfa20001cb00e8",
        "is_active": true,
        "modified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "modified_on": "2021-03-12T08:11:08.646000Z",
        "stage": "completed",
        "succeed": 1,
        "template": {
          "banner": "https://hdn-1.fynd.com/seller/pictures/landscape-banner/original/nFPtXR_Beauty_&_Personal_Care_L.jpgf30455a5-d265-4382-b513-65afb9240320/nFPtXR_Beauty_and_Personal_Care_L.jpg",
          "departments": [
            "men",
            "women",
            "kids",
            "fashion"
          ],
          "description": "Footwear is a garment worn on the feet to protect against environmental adversities like heat or ground textures. Example: Sports Shoes",
          "is_expirable": true,
          "is_physical": true,
          "logo": "https://hdn-1.fynd.com/seller/pictures/logo/original/9Y2UEp_ssssss.jpg7359e4c6-4c53-4dbe-a920-ef8ac658afb1/9Y2UEp_ssssss.jpg",
          "name": "Footwear",
          "slug": "footwear"
        },
        "template_tag": "footwear",
        "total": 1
      }
    ],
    "page": {
      "current": 1,
      "has_next": true,
      "has_previous": false,
      "item_total": 251,
      "size": 26,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### createBulkProductUploadJob
Create a Bulk product to upload job.




```java
platformClient.catalog.createBulkProductUploadJob(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |  
| body | [BulkProductUploadJob](#BulkProductUploadJob) | yes | Request body |


This API helps to create a bulk products upload job.

*Returned Response:*




[ProductBulkResponse](#ProductBulkResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "batch_id": "507f1f77bcf86cd799439011"
  }
}
```
</details>

</details>









---


### deleteProductBulkJob
Delete Bulk product job.




```java
platformClient.catalog.deleteProductBulkJob( batchId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the company associated to size that is to be deleted. |   
| batchId | String | yes | Batch Id of the bulk product job to be deleted. |  



This API allows to delete bulk product job associated with company.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### createProductsInBulk
Create products in bulk associated with given batch Id.




```java
platformClient.catalog.createProductsInBulk( batchId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| batchId | String | yes | Batch Id in which assets to be uploaded. |  
| body | [BulkProductRequest](#BulkProductRequest) | yes | Request body |


This API helps to create products in bulk push to kafka for approval/creation.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### listProductTemplateExportDetails
Allows you to list all product templates export list details




```java
platformClient.catalog.listProductTemplateExportDetails() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  



Can view details including trigger data, task id , etc.

*Returned Response:*




[ProductDownloadsResponse](#ProductDownloadsResponse)

List of Product Downloads Data. See example below or refer `ProductDownloadsResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "completed_on": "2020-12-23T07:23:41.031000Z",
        "created_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "data": {
          "brand": [
            "ruosh"
          ],
          "templates": [
            "mobile-phones-and-tablet"
          ],
          "type": "csv"
        },
        "id": "5fe2f077516d980001880943",
        "seller_id": 3,
        "status": "success",
        "task_id": "c4b54ace-44ef-11eb-9806-1ef9bc4a2da1",
        "template_tags": {
          "mobile-phones-and-tablet": {
            "display": "Mobile Phones & Tablet",
            "logo": "https://hdn-1.jiox0.de/jiox0/seller/pictures/logo/original/Oda39B_99946594-portable-devices-with-tablet-and-mobile-phone-vector-icon-for-apps-and-websites.jpgcc2dff44-7fae-4002-9ebe-d2b59c8bee91/Oda39B_99946594-portable-devices-with-tablet-and-mobile-phone-vector-icon-for-apps-and-websites.jpg"
          }
        },
        "trigger_on": "2020-12-23T07:23:35.302000Z",
        "url": "https://regrowth.s3.amazonaws.com/slingshot-catalogues/seller-catalog/3/c4b54ace-44ef-11eb-9806-1ef9bc4a2da1/c4b54ace-44ef-11eb-9806-1ef9bc4a2da1.zip"
      }
    ],
    "page": {}
  }
}
```
</details>

</details>









---


### listHSNCodes
List HSN Codes




```java
platformClient.catalog.listHSNCodes() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  



Allows you to list all hsn Codes

*Returned Response:*




[HSNCodesResponse](#HSNCodesResponse)

List of all HSN Codes. See example below or refer `HSNCodesResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "country_of_origin": [
        "India"
      ],
      "hsn_code": [
        "11111111"
      ]
    },
    "message": "Success"
  }
}
```
</details>

</details>









---


### getProductTags
Get a list of all tags associated with company.




```java
platformClient.catalog.getProductTags() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id for which tags to be fetched. |  



This API helps to get tags data associated to a particular company.

*Returned Response:*




[ProductTagsViewResponse](#ProductTagsViewResponse)

Tag List. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      "demo",
      "custom"
    ]
  }
}
```
</details>

</details>









---


### listProductTemplate
List all Templates




```java
platformClient.catalog.listProductTemplate( department) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| department | String | yes | A `department` is the name of a particular department. |  



Allows you to list all product templates, also can filter by department

*Returned Response:*




[TemplatesResponse](#TemplatesResponse)

List of product templates. See example below or refer `TemplatesResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 1
    },
    "items": [
      {
        "categories": [
          "hello3"
        ],
        "created_by": {
          "user_id": "000000000000000016841367",
          "username": "app@fynd.com"
        },
        "is_active": true,
        "is_expirable": false,
        "modified_by": {
          "user_id": "000000000000000016841367",
          "username": "app@fynd.com"
        },
        "slug": "platform_template",
        "is_archived": false,
        "departments": [
          "producttemplatedepartment"
        ],
        "attributes": [
          "test-variant-field",
          "test-variant-field-2",
          "variant-field-3"
        ],
        "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/products/pictures/template/logo/original/1UZtJvzM0-test-variant-template.png",
        "name": "platform_template",
        "is_physical": true,
        "id": "657063184ca273c8dece5bd2"
      }
    ]
  }
}
```
</details>

</details>









---


### listProductTemplateCategories
List Department specifiec product categories




```java
platformClient.catalog.listProductTemplateCategories( departments,  itemType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| departments | String | yes | A `department` is name of a departments whose category needs to be listed. Can specify multiple departments. |   
| itemType | String | yes | An `item_type` is the type of item, it can be `set`, `standard`, `digital`, etc. |  



Allows you to list all product categories values for the departments specified

*Returned Response:*




[ProdcutTemplateCategoriesResponse](#ProdcutTemplateCategoriesResponse)

List of all categories attached to departments specified. See example below or refer `ProdcutTemplateCategoriesResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "uid": 3,
        "name": "hello3",
        "slug": "hello3",
        "slug_key": "hello3",
        "template_slug": "test-variant-template"
      }
    ]
  }
}
```
</details>

</details>









---


### downloadProductTemplateViews
Download Product Template View




```java
platformClient.catalog.downloadProductTemplateViews( slug,  itemType,  type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String | yes | A `slug` is a unique identifier for a particular template. |   
| itemType | String? | no | An `item_type` defines the type of item. The default value is standard. |   
| type | String? | no | Format type of the sample file. The default value is excel. |  



Allows you to download product template data

*Returned Response:*




[String](#String)

CSV File of product template data. See example below or refer `TemplatesResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": "XML"
}
```
</details>

</details>









---


### validateProductTemplate
Validate Product Template Schema




```java
platformClient.catalog.validateProductTemplate( slug,  itemType,  bulk) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| slug | String | yes | A `slug` is a unique identifier for a particular template. |   
| itemType | String? | no | An `item_type` defines the type of item. The default value is standard. |   
| bulk | Boolean? | no | This specification determines the schema type to be retrieved. When set to true, it will return the schema for bulk data; when set to false, it will provide the schema for a single product. The default value is false. |  



Allows you to list all product templates validation values for all the fields present in the database

*Returned Response:*




[TemplatesValidationResponse](#TemplatesValidationResponse)

List of fields and validation values fro each. See example below or refer `TemplatesValidationResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "global_validation": {
        "properties": {},
        "required": []
      }
    },
    "template_details": {
      "attributes": [],
      "categories": [],
      "departments": [],
      "is_expirable": true,
      "is_physical": true,
      "slug": ""
    }
  }
}
```
</details>

</details>









---


### getProductValidation
Validate product/size data




```java
platformClient.catalog.getProductValidation( type,  slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Validates data against given company |   
| type | String | yes | Type of identifier to validate the product against. |   
| slug | String | yes | Type of identifier to validate the product against. |  



This API validates product data.

*Returned Response:*




[ValidateProduct](#ValidateProduct)

Validate Meta. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "valid": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; success_existing_product</i></summary>

```json
{
  "value": {
    "valid": false,
    "message": "Product already exists for given slug."
  }
}
```
</details>

</details>









---


### getInventoryBySizeIdentifier
Get Inventory for company




```java
platformClient.catalog.getInventoryBySizeIdentifier( itemId,  sizeIdentifier,  pageNo,  pageSize,  q,  locationIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Item code of the product of which size is to be get. |   
| sizeIdentifier | String | yes | Size Identifier (Seller Identifier or Primary Identifier) of which inventory is to get. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search with help of store code. |   
| locationIds | List<Integer>? | no | Search by store ids. |  



This API allows get Inventory data for particular company grouped by size and store.

*Returned Response:*




[InventorySellerIdentifierResponsePaginated](#InventorySellerIdentifierResponsePaginated)

returns a list of all inventory grouped by size and store




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 13.1,
          "is_default": true,
          "length": 1.3,
          "unit": "cm",
          "width": 23.4
        },
        "fragile": false,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {},
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-04-06T03:30:01.487000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "ab",
          "is_default": true,
          "name": "ab"
        },
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 89.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "59_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 13.1,
          "is_default": true,
          "length": 1.3,
          "unit": "cm",
          "width": 23.4
        },
        "fragile": false,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {},
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-04-06T03:29:35.291000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "ab",
          "is_default": true,
          "name": "ab"
        },
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 89.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "10_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 13.1,
          "is_default": true,
          "length": 1.3,
          "unit": "cm",
          "width": 23.4
        },
        "fragile": false,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {},
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-03-17T12:35:29.992000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "ab",
          "is_default": true,
          "name": "ab"
        },
        "order_committed_quantity": 0,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 89.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10000000,
        "sellable_quantity": 10000000,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "11061_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "damaged_quantity": 0,
        "dimension": {
          "height": 13.1,
          "is_default": true,
          "length": 1.3,
          "unit": "cm",
          "width": 23.4
        },
        "fragile": false,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {},
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2021-03-31T19:00:10.943000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "ab",
          "is_default": true,
          "name": "ab"
        },
        "not_available_quantity": 0,
        "order_committed_quantity": 7,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 89.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 18,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "1_RTYUIDSDFV",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      },
      {
        "brand": {
          "id": 1,
          "name": "ab"
        },
        "company": {
          "id": 1
        },
        "country_of_origin": "",
        "currency": "INR",
        "dimension": {
          "height": 13.1,
          "is_default": true,
          "length": 1.3,
          "unit": "cm",
          "width": 23.4
        },
        "fragile": false,
        "fynd_article_code": "",
        "fynd_item_code": "",
        "identifier": {},
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "RTYUIDSDFV",
            "primary": true
          }
        ],
        "inventory_updated_on": "2020-07-07T10:37:06.146000",
        "item_id": 7500651,
        "manufacturer": {
          "address": "ab",
          "is_default": true,
          "name": "ab"
        },
        "order_committed_quantity": 39,
        "price": {
          "currency": "USD",
          "effective": 79.99,
          "marked": 99.99,
          "transfer": 89.99
        },
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 0,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "id": 1
        },
        "total_quantity": 1,
        "uid": "1_rtyuidsdfv",
        "weight": {
          "is_default": true,
          "shipping": 1.5,
          "unit": "kg"
        }
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 5,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getProductSize
Get a single product size.




```java
platformClient.catalog.getProductSize( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the product size. |   
| itemId | Integer | yes | Item Id of the product size. |  



This API helps to get data associated to a particular product size.

*Returned Response:*




[Product](#Product)

Product object. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "all_sizes": [
      "3XL"
    ],
    "attributes": {
      "color": "Red",
      "created_by": {
        "company_id": 1181,
        "user_id": "-1",
        "username": "silverbolt"
      },
      "created_on": "2020-07-23T04:20:43.810000Z",
      "essential": "Yes",
      "gender": [
        "Men"
      ],
      "image_nature": "standard",
      "is_image_less_product": false,
      "l3_mapping": [
        "men>casual_tees",
        "women>casual_tees",
        "girls>casual_tees",
        "more>casual_tees"
      ],
      "material": "cotton",
      "meta_nature": "standard",
      "modified_by": {
        "company_id": 61,
        "user_id": "-1",
        "username": "silverbolt"
      },
      "modified_on": "2020-07-23T04:20:44.185000Z",
      "neck_type": "Round Neck",
      "pattern": "Printed",
      "primary_color": "Red",
      "primary_material": "Others",
      "product_fit": "Regular",
      "sleeve_length": "Short",
      "stage": "verified",
      "verified_by": {
        "user_id": "0",
        "username": "Silverbolt"
      },
      "verified_on": 1595478044
    },
    "brand": {
      "logo": {
        "aspect_ratio": "1:1",
        "aspect_ratio_f": 1,
        "secure_url": "https://hdn-1.fynd.com/brands/pictures/square-logo/50x0/zjt4-wU8Lk-VQYu0pcokb-r6yteuannoorjkq9f4tk.jpg",
        "url": "https://hdn-1.fynd.com/brands/pictures/square-logo/50x0/zjt4-wU8Lk-VQYu0pcokb-r6yteuannoorjkq9f4tk.jpg"
      },
      "name": "play clan",
      "uid": 85
    },
    "category_slug": "t-shirts",
    "company_id": 61,
    "country_of_origin": "India",
    "currency": "INR",
    "departments": [
      1
    ],
    "description": "",
    "highlights": null,
    "hsn_code": "61099090",
    "id": "5f19101b99ee0500011dc896",
    "images": [],
    "is_active": false,
    "is_dependent": false,
    "is_set": false,
    "item_code": "ACTESTCREATELISTING1",
    "item_type": "standard",
    "media": [],
    "multi_size": true,
    "name": "SQUADMTGIVESPACE",
    "product_publish": {
      "is_set": false,
      "product_online_date": 1595478043
    },
    "size_guide": "play-clan-men-casual-tees",
    "sizes": [
      {
        "currency": "INR",
        "identifiers": [
          {
            "gtin_type": "sku_code",
            "gtin_value": "ACTESTCREATELISTING1_3XL",
            "primary": true
          }
        ],
        "is_set": false,
        "price": 10000,
        "price_effective": 10000,
        "price_transfer": 0,
        "size": "3XL"
      }
    ],
    "slug": "play-clan-squadmtgivespace-857587-e928b0",
    "template_tag": "topwear",
    "uid": 857587
  }
}
```
</details>

</details>









---


### deleteSize
Delete a Size associated with product.




```java
platformClient.catalog.deleteSize( itemId,  size) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the company associated to size that is to be deleted. |   
| itemId | Integer | yes | Item Id of the product associated with size to be deleted. |   
| size | String | yes | size to be deleted. |  



This API allows to delete size associated with product.

*Returned Response:*




[ProductSizeDeleteResponse](#ProductSizeDeleteResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "company_id": 1,
      "item_id": 114,
      "size": "3"
    },
    "success": true
  }
}
```
</details>

</details>









---


### getInventoryBySize
Get Inventory for company




```java
platformClient.catalog.getInventoryBySize( itemId,  size,  pageNo,  pageSize,  q,  sellable) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Item code of the product of which size is to be get. |   
| size | String | yes | Size of which inventory is to get. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| q | String? | no | Search with help of store code. |   
| sellable | Boolean? | no | Filter on whether product is in stock or not. |  



This API allows get Inventory data for particular company grouped by size and store.

*Returned Response:*




[InventoryResponsePaginated](#InventoryResponsePaginated)

returns a list of all inventory grouped by size and store




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "currency": "INR",
        "identifiers": {
          "gtin_type": "sku_code",
          "gtin_value": "RTYUIDSDFV",
          "primary": true
        },
        "inventory_updated_on": "2021-04-06T03:30:01.487000",
        "item_id": 7500651,
        "price": 1234,
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "_custom_json": {},
          "address": {
            "address1": "A/204, SAI VANDAN, NARAYAN NAGAR, TULINJ ROAD",
            "address2": "",
            "city": "MUMBAI",
            "country": "INDIA",
            "landmark": "",
            "lat_long": {
              "coordinates": [
                72.8231511,
                19.4232024
              ],
              "type": "Point"
            },
            "pincode": 401209,
            "state": "MAHARASHTRA"
          },
          "integration_type": {
            "inventory": "browntape",
            "order": "browntape"
          },
          "manager": {
            "email": "a@b.com",
            "mobile_no": {
              "country_code": 91,
              "number": "2382634324"
            },
            "name": "abc"
          },
          "name": "yosss sdd dsdyo",
          "store_code": "sanic6sdfsf7",
          "uid": 59
        },
        "uid": "59_RTYUIDSDFV"
      },
      {
        "currency": "INR",
        "identifiers": {
          "gtin_type": "sku_code",
          "gtin_value": "RTYUIDSDFV",
          "primary": true
        },
        "inventory_updated_on": "2021-04-06T03:29:35.291000",
        "item_id": 7500651,
        "price": 1234,
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10,
        "sellable_quantity": 10,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "_custom_json": {},
          "address": {
            "address1": "NO",
            "address2": "",
            "city": "MUMBAI",
            "country": "INDIA",
            "lat_long": {
              "coordinates": [
                1,
                1
              ],
              "type": "Point"
            },
            "pincode": 400072,
            "state": "MAHA"
          },
          "integration_type": {
            "inventory": "browntape",
            "order": "browntape"
          },
          "manager": {
            "email": "rehman@cashkart.com",
            "mobile_no": {
              "country_code": 91,
              "number": "9167943983"
            },
            "name": "abc"
          },
          "name": "Saran Ledonne",
          "store_code": "af6198fe-2c23-4441-bbf4-e694c96e255c",
          "uid": 10
        },
        "uid": "10_RTYUIDSDFV"
      },
      {
        "currency": "INR",
        "identifiers": {
          "gtin_type": "sku_code",
          "gtin_value": "RTYUIDSDFV",
          "primary": true
        },
        "inventory_updated_on": "2021-03-17T12:35:29.992000",
        "item_id": 7500651,
        "order_committed_quantity": 0,
        "price": 1234,
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 10000000,
        "sellable_quantity": 10000000,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "_custom_json": {},
          "address": {
            "address1": "14/1, VINOBHA BHAVE NAGAR",
            "address2": "VINOBHA BHAVE NAGAR, KURLA WEST, KURLA, ",
            "city": "MUMBAI",
            "country": "INDIA",
            "lat_long": {
              "coordinates": [
                1,
                1
              ],
              "type": "Point"
            },
            "pincode": 400070,
            "state": "MAHARASHTRA"
          },
          "integration_type": {
            "inventory": "browntape",
            "order": "browntape"
          },
          "manager": {
            "email": "fahimsakri@gofynd.com",
            "mobile_no": {
              "country_code": 91,
              "number": "9594495254"
            },
            "name": "Fahim"
          },
          "name": "ABC-1-17",
          "store_code": "ABC-1-17",
          "uid": 11061
        },
        "uid": "11061_RTYUIDSDFV"
      },
      {
        "currency": "INR",
        "damaged_quantity": 0,
        "identifiers": {
          "gtin_type": "sku_code",
          "gtin_value": "RTYUIDSDFV",
          "primary": true
        },
        "inventory_updated_on": "2021-03-31T19:00:10.943000",
        "item_id": 7500651,
        "not_available_quantity": 0,
        "order_committed_quantity": 7,
        "price": 1234,
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 18,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "_custom_json": {},
          "address": {
            "address1": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED 1ST FLOOR WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR,",
            "address2": "KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTRA 400069",
            "city": "MUMBAI",
            "country": "INDIA",
            "lat_long": {
              "coordinates": [
                72.8691788,
                19.1174114
              ],
              "type": "Point"
            },
            "pincode": 400059,
            "state": "MAHARASHTRA"
          },
          "integration_type": {
            "inventory": "browntape",
            "order": "browntape"
          },
          "manager": {
            "email": "ASHISHCHANDORKAR@FYND.COM",
            "mobile_no": {
              "country_code": 91,
              "number": "8369782851"
            },
            "name": "ASHISH CHANDORKAR"
          },
          "name": "RRL01",
          "store_code": "WH_8513",
          "uid": 1
        },
        "uid": "1_RTYUIDSDFV"
      },
      {
        "currency": "INR",
        "identifiers": {
          "gtin_type": "sku_code",
          "gtin_value": "RTYUIDSDFV",
          "primary": true
        },
        "inventory_updated_on": "2020-07-07T10:37:06.146000",
        "item_id": 7500651,
        "order_committed_quantity": 39,
        "price": 1234,
        "price_effective": 1234,
        "price_transfer": 0,
        "quantity": 39,
        "sellable_quantity": 0,
        "seller_identifier": "RTYUIDSDFV",
        "size": "AAX1 (1 PCS)",
        "store": {
          "_custom_json": {},
          "address": {
            "address1": "SHOPSENSE RETAIL TECHNOLOGIES PRIVATE LIMITED 1ST FLOOR WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR,",
            "address2": "KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTRA 400069",
            "city": "MUMBAI",
            "country": "INDIA",
            "lat_long": {
              "coordinates": [
                72.8691788,
                19.1174114
              ],
              "type": "Point"
            },
            "pincode": 400059,
            "state": "MAHARASHTRA"
          },
          "integration_type": {
            "inventory": "browntape",
            "order": "browntape"
          },
          "manager": {
            "email": "ASHISHCHANDORKAR@FYND.COM",
            "mobile_no": {
              "country_code": 91,
              "number": "8369782851"
            },
            "name": "ASHISH CHANDORKAR"
          },
          "name": "RRL01",
          "store_code": "WH_8513",
          "uid": 1
        },
        "uid": "1_rtyuidsdfv"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 5,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### getVariantsOfProducts
Get product list




```java
platformClient.catalog.getVariantsOfProducts( itemId,  variantType,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Get list of products filtered by company Id |   
| itemId | Integer | yes | Get list of variants of item Id |   
| variantType | String | yes | Get multiple products filtered by variant type |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to products.

*Returned Response:*




[ProductVariantsResponse](#ProductVariantsResponse)

Product Meta. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 1,
      "size": 1,
      "type": "number"
    },
    "variants": [
      {
        "brand_uid": 401,
        "category_uid": 3938,
        "item_code": "TEST-MSA-6",
        "media": [
          {
            "type": "image",
            "url": "https://hdn-1.jiox0.de/jiox0/products/pictures/item/free/original/7cGLXZLpO-iN3Jd9uro-Wiv-7J9qC-product.png"
          }
        ],
        "name": "test-msa-6",
        "slug": "test-msa-6",
        "uid": 7526471
      }
    ]
  }
}
```
</details>

</details>









---


### getCompanyVerification
Get company verification status




```java
platformClient.catalog.getCompanyVerification( q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Get company verification details filtered by company Id |   
| q | String? | no | A `q` parameter is used to search the company by its name. |   
| pageNo | Integer? | no | A `page_no` parameter is a number of the page requested. |   
| pageSize | Integer? | no | A `page_size` is the no of items per page. |  



This API gets company verification details.

*Returned Response:*




[CompanyVerificationResponse](#CompanyVerificationResponse)

Product Meta. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "uid": 1,
    "name": "Akshay Company",
    "stats": {
      "verified": 1
    }
  }
}
```
</details>

</details>









---


### getProductVerificationDetails
Get the verification detail of a product




```java
platformClient.catalog.getProductVerificationDetails( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a seller account. |   
| itemId | Integer | yes | A `item_id` is a unique identifier for a specific product. |  



Get the verification detail of a product

*Returned Response:*




[ProductVerificationModel](#ProductVerificationModel)

Product verification data. See example below or refer `ProductVerificationModelSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "rejected_fields": {},
    "status": "verified",
    "brand_uid": 335,
    "_id": "65842100bd7817e212c71243",
    "created_on": "2023-12-21T11:27:34.657000",
    "company_ids": [
      1
    ],
    "item_code": "DELETE",
    "remark": "",
    "created_by": {
      "user_id": "000000000000000016841367",
      "username": "app@fynd.com"
    },
    "modified_on": "2023-12-21T11:27:34.657000",
    "slug": "being-human-blue-flat-front-jeans",
    "modified_by": {
      "user_id": "000000000000000016841367",
      "username": "app@fynd.com"
    },
    "item_id": 2,
    "id": "65842100bd7817e212c71243"
  }
}
```
</details>

</details>









---


### getVariantTypes
Get variant type list




```java
platformClient.catalog.getVariantTypes( templateTag) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Get list of products filtered by company Id |   
| templateTag | String | yes | The page number to navigate through the given set of results |  



This API gets meta associated to products.

*Returned Response:*




[VariantTypesResponse](#VariantTypesResponse)

Product Meta. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "name": "Additional Colorsasd",
        "key": "test",
        "type": [
          "text"
        ],
        "image_config": {}
      }
    ]
  }
}
```
</details>

</details>









---


### createSizeGuide
Create a size guide.




```java
platformClient.catalog.createSizeGuide(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a seller account. |  
| body | [ValidateSizeGuide](#ValidateSizeGuide) | yes | Request body |


This API allows to create a size guide associated to a brand.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### getSizeGuides
Get list of size guides




```java
platformClient.catalog.getSizeGuides( active,  q,  brandId,  tag,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company for which the size guides are to be fetched. |   
| active | Boolean? | no | filter size guide on basis of active, in-active |   
| q | String? | no | Query that is to be searched. |   
| brandId | Integer? | no | Brand id that is to be searched. |   
| tag | String? | no | to filter size guide on basis of tag. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the size guides associated to the seller.

*Returned Response:*




[ListSizeGuide](#ListSizeGuide)

Size guide object. See example below or refer `ListSizeGuide` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "active": true,
        "brand_id": 2,
        "company_id": 12,
        "created_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "created_on": "2021-02-24T17:46:04.146000Z",
        "guide": {
          "meta": {
            "headers": {
              "col_1": {
                "convertable": false,
                "value": "Head"
              },
              "col_2": {
                "convertable": true,
                "value": "Shoulder"
              }
            },
            "unit": "cm",
            "values": [
              {
                "col_1": "10",
                "col_2": "20"
              },
              {
                "col_1": "12",
                "col_2": "22"
              },
              {
                "col_1": "14",
                "col_2": "24"
              }
            ]
          }
        },
        "id": "60364384f08385bee776f83d",
        "modified_by": {
          "user_id": "-1",
          "username": "silverbolt"
        },
        "modified_on": "2021-02-24T17:46:04.146000Z",
        "name": "Demo",
        "subtitle": "I am demo",
        "tag": "demo",
        "title": "Demo SG"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_count": 1,
      "size": 1
    }
  }
}
```
</details>

</details>









---


### getSizeGuide
Get a single size guide.




```java
platformClient.catalog.getSizeGuide( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | Id of the size guide to be viewed. |   
| companyId | Integer | yes | Id of the company for which the size guides are to be fetched. |  



This API helps to get data associated to a size guide.

*Returned Response:*




[SizeGuideResponse](#SizeGuideResponse)

Brand object. See example below or refer `SizeGuideResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "active": true,
    "brand_id": 1,
    "company_id": 1,
    "created_by": {
      "user_id": "-1",
      "username": "silverbolt"
    },
    "created_on": "2021-02-24T17:46:04.146000Z",
    "guide": {
      "meta": {
        "headers": {
          "col_1": {
            "convertable": false,
            "value": "Head"
          },
          "col_2": {
            "convertable": true,
            "value": "Shoulder"
          }
        },
        "unit": "cm",
        "values": [
          {
            "col_1": "10",
            "col_2": "20"
          },
          {
            "col_1": "12",
            "col_2": "22"
          },
          {
            "col_1": "14",
            "col_2": "24"
          }
        ]
      }
    },
    "id": "60364384f08385bee776f83d",
    "modified_by": {
      "user_id": "123",
      "username": "917827311650_22960"
    },
    "modified_on": "2021-02-25T15:19:30.822000Z",
    "name": "edited size guide",
    "subtitle": "I am demo",
    "tag": "demo",
    "title": "Demo SG"
  }
}
```
</details>

</details>









---


### updateSizeGuide
Edit a size guide.




```java
platformClient.catalog.updateSizeGuide( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a seller account. |   
| id | String | yes | Mongo id of the size guide to be edited |  
| body | [ValidateSizeGuide](#ValidateSizeGuide) | yes | Request body |


This API allows to edit a size guide.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### updateAllowSingle
Update allow single flag for filters of the application.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAllowSingle(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [AllowSingleRequest](#AllowSingleRequest) | yes | Request body |


Update allow single flag for filters of the application.

*Returned Response:*




[ConfigSuccessResponse](#ConfigSuccessResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Successfully updated allow single."
  }
}
```
</details>

</details>









---


### updateDefaultSort
Update the default sort key configuration for the application.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateDefaultSort(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [DefaultKeyRequest](#DefaultKeyRequest) | yes | Request body |


Update the default sort key configuration for the application.

*Returned Response:*




[ConfigSuccessResponse](#ConfigSuccessResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Successfully updated default key."
  }
}
```
</details>

</details>









---


### createListingConfiguration
Add configuration for listings




```java
platformClient.application("<APPLICATION_ID>").catalog.createListingConfiguration( configType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular listing configuration type. |  
| body | [AppConfigurationsFilter](#AppConfigurationsFilter) | yes | Request body |


Add configuration for listing.

*Returned Response:*




[AppConfigurationsFilterResponse](#AppConfigurationsFilterResponse)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "is_default": false,
    "priority": 27,
    "name": "Cushion Colour",
    "value_config": {
      "value": "",
      "map": {},
      "condition": "OR",
      "sort": "count",
      "bucket_points": []
    },
    "type": "multivalued",
    "app_id": "5d63686df2a4f7806b76bb32",
    "key": "cushion-colour",
    "logo": "/misc/default-assets/original/popular.png",
    "allow_single": false,
    "is_active": true,
    "id": "656c6fb2a28ce84a37ec40cd"
  }
}
```
</details>

</details>









---


### getListingConfigurations
Get the details of the application configured configurations of listing config types.




```java
platformClient.application("<APPLICATION_ID>").catalog.getListingConfigurations( configType,  pageNo,  pageSize,  search,  uids) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is an identifier that defines a specific type of configuration. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| search | String? | no | Get configuration list filtered by `search` string. |   
| uids | List<Integer>? | no | Only for categories config type, Get configuration list filtered by `uids`. |  



Get the details of the application configured configurations of listing config types.

*Returned Response:*




[GetListingConfigResponse](#GetListingConfigResponse)

configuration details for catalog. See example below or refer `GetConfigResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "app_id": "000000000000000000000001",
        "allow_single": false,
        "id": "656cc084eeedf45364ccb4fe",
        "is_active": true,
        "key": "cushion-colour",
        "name": "Cushion Colour",
        "is_default": false,
        "priority": 27,
        "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/addsale/misc/default-assets/original/popular.png",
        "value_config": {
          "sort": "count",
          "bucket_points": [],
          "map": {},
          "condition": "OR",
          "value": ""
        },
        "type": "multivalued"
      }
    ],
    "page": {
      "current": 1,
      "next": 2,
      "has_next": true,
      "total_count": 1
    }
  }
}
```
</details>

</details>









---


### createGroupConfiguration
Create configuration for Group config types.




```java
platformClient.application("<APPLICATION_ID>").catalog.createGroupConfiguration( configType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular group configuration type. |  
| body | [AppConfigurationCreateDetail](#AppConfigurationCreateDetail) | yes | Request body |


Create configuration for Group config types.

*Returned Response:*




[AppConfigurationDetail](#AppConfigurationDetail)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "is_active": true,
    "slug": "testnew80",
    "attributes": [
      {
        "unit": "mm",
        "is_active": true,
        "slug": "length",
        "key": "length",
        "priority": 1,
        "name": "Length",
        "display_type": "text"
      }
    ],
    "priority": 6,
    "name": "testnew",
    "app_id": "5d63686df2a4f7806b76bb32",
    "is_default": false,
    "id": "656c38ecbada751dd8324c49"
  }
}
```
</details>

</details>









---


### getGroupConfigurations
Get the details of the application configured configurations of group config types.




```java
platformClient.application("<APPLICATION_ID>").catalog.getGroupConfigurations( configType,  pageNo,  pageSize,  search,  templateSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is an identifier that defines a specific type of configuration. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |   
| search | String? | no | Get configuration list filtered by `search` string. |   
| templateSlug | String? | no | Get configuration list filtered by `template_slug` string. This is for the details and comparision groups. |  



Get the details of the application configured configurations of group config types.

*Returned Response:*




[GetConfigResponse](#GetConfigResponse)

configuration details for catalog. See example below or refer `GetConfigResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "attributes": [
          {
            "key": "length",
            "name": "Length",
            "slug": "length",
            "priority": 1,
            "unit": "mm",
            "is_active": true,
            "display_type": "text"
          }
        ],
        "name": "testnew78",
        "slug": "testnew80",
        "is_default": false,
        "priority": 6,
        "app_id": "000000000000000000000001",
        "is_active": true,
        "id": "656c3ae76159b98c5da285ed"
      }
    ],
    "page": {
      "current": 1,
      "next": 2,
      "has_next": true,
      "total_count": 1
    }
  }
}
```
</details>

</details>









---


### updateGroupConfiguration
Update the group configurations for the application.




```java
platformClient.application("<APPLICATION_ID>").catalog.updateGroupConfiguration( configType,  groupSlug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular group configuration type. |   
| groupSlug | String | yes | A `group_slug` is a unique identifier of a particular configuration. |  
| body | [AppConfigurationDetail](#AppConfigurationDetail) | yes | Request body |


Update the group configurations for the application.

*Returned Response:*




[AppConfigurationDetail](#AppConfigurationDetail)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "attributes": [
      {
        "slug": "length",
        "priority": 1,
        "is_active": true,
        "name": "Length",
        "key": "length",
        "display_type": "text",
        "unit": "mm"
      }
    ],
    "slug": "testnew80",
    "priority": 90,
    "app_id": "000000000000000000000001",
    "is_active": true,
    "name": "testnew",
    "is_default": false,
    "id": "656c3941f62a832779362cf0"
  }
}
```
</details>

</details>









---


### deleteGroupConfiguration
Delete configuration of the product config type of the application.




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteGroupConfiguration( configType,  groupSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular group configuration type. |   
| groupSlug | String | yes | A `group_slug` is a unique identifier of a particular configuration. |  



Delete configuration of the product config type of the application.

*Returned Response:*




[ConfigSuccessResponse](#ConfigSuccessResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Config Item deleted successfully."
  }
}
```
</details>

</details>









---


### updateListingConfiguration
Update configuration for listings




```java
platformClient.application("<APPLICATION_ID>").catalog.updateListingConfiguration( configType,  configId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular listing configuration type. |   
| configId | String | yes | A `config_id` is a unique identifier of a particular configuration. |  
| body | [AppConfigurationsFilterResponse](#AppConfigurationsFilterResponse) | yes | Request body |


Update configuration for listing.

*Returned Response:*




[AppConfigurationsFilterResponse](#AppConfigurationsFilterResponse)

success flag will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "priority": 28,
    "allow_single": false,
    "type": "multivalued",
    "key": "cuisine",
    "app_id": "000000000000000000000001",
    "value_config": {
      "condition": "OR",
      "value": "",
      "map": {
        "small": "SMALL"
      },
      "sort": "count",
      "bucket_points": []
    },
    "is_default": false,
    "is_active": true,
    "name": "Cuisine",
    "logo": "https://hdn-1.fynd.com/products/pictures/attribute/logo/original/iG82Qjay9X-Popularity.png",
    "id": "656cc670c404d0f059e622b4"
  }
}
```
</details>

</details>









---


### deleteListingConfiguration
Delete configuration for listings




```java
platformClient.application("<APPLICATION_ID>").catalog.deleteListingConfiguration( configType,  configId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is a unique identifier for a particular listing configuration type. |   
| configId | String | yes | A `config_id` is a unique identifier of a particular configuration. |  



Delete configuration for listing.

*Returned Response:*




[ConfigSuccessResponse](#ConfigSuccessResponse)

success message will tell whether the operation was successful.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Config Item deleted successfully."
  }
}
```
</details>

</details>









---


### getConfigurationMetadata
Get configuration metadata details for catalog for admin panel




```java
platformClient.application("<APPLICATION_ID>").catalog.getConfigurationMetadata( configType,  templateSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| configType | String | yes | A `config_type` is an identifier that defines a specific type of configuration. |   
| templateSlug | String? | no | Get configuration list filtered by `template_slug` string. This is for the details and comparision groups. |  



Get the configuraion metadata details for catalog.

*Returned Response:*




[GetConfigMetadataResponse](#GetConfigMetadataResponse)

configuration details for catalog. See example below or refer `GetConfigMetadataResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": [
      {
        "key": "image_nature",
        "display": "Image Type",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "sizes",
        "display": "Sizes",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "discount",
        "display": "Discount",
        "filter_types": [
          "range",
          "intervals"
        ]
      },
      {
        "key": "min_price_effective",
        "display": "Price",
        "filter_types": [
          "range",
          "intervals"
        ]
      },
      {
        "key": "departments",
        "display": "Department",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "l3_category_names",
        "display": "Category",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "brand_slug",
        "display": "Brand",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "size_depth",
        "display": "Size Depth",
        "filter_types": [
          "multivalued",
          "range"
        ]
      },
      {
        "key": "is_set",
        "display": "Set",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "country_of_origin",
        "display": "Country of Origin",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "item_code",
        "display": "Item Code",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "is_available",
        "display": "Available",
        "filter_types": [
          "singlevalued"
        ]
      },
      {
        "key": "is_custom_order",
        "display": "Shipping",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "tags",
        "display": "Tags",
        "filter_types": [
          "multivalued"
        ]
      },
      {
        "key": "rating",
        "display": "Rating",
        "filter_types": [
          "range",
          "intervals",
          "multivalued"
        ]
      }
    ],
    "values": {
      "type": [
        {
          "key": "range",
          "display": "Range Bar"
        },
        {
          "key": "intervals",
          "display": "Bucket Values"
        },
        {
          "key": "multivalued",
          "display": "Single"
        },
        {
          "key": "singlevalued",
          "display": "Single"
        }
      ],
      "sort": [
        {
          "key": "count",
          "display": "Product Count"
        },
        {
          "key": "ascending",
          "display": "Ascending"
        },
        {
          "key": "descending",
          "display": "Descending"
        }
      ]
    },
    "condition": [
      {
        "key": "OR",
        "display": "OR"
      },
      {
        "key": "AND",
        "display": "AND"
      }
    ],
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 15
    }
  }
}
```
</details>

</details>









---


### getAllProductHsnCodes
Hsn Code List.




```java
platformClient.catalog.getAllProductHsnCodes( pageNo,  pageSize,  q,  type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Integer? | no | page no |   
| pageSize | Integer? | no | page size |   
| q | String? | no | search using hsn code, description, reporting_hsn |   
| type | String? | no | search using type |   
| companyId | Integer | yes | Company Id for which HSN codes needs to be fetched |  



Hsn Code List.

*Returned Response:*




[HsnCodesListingResponseSchemaV2](#HsnCodesListingResponseSchemaV2)

List of all HSN Codes. See example below or refer `HsnCodesListingResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "created_on": "2023-12-06T17:40:30",
        "reporting_hsn": "615717171H1",
        "hsn_code": "615717171",
        "modified_by": {
          "user_id": "000000000000000016841367",
          "username": "app@fynd.com"
        },
        "country_code": "IN",
        "modified_on": "2023-12-06T17:40:30",
        "type": "goods",
        "taxes": [
          {
            "effective_date": "2022-02-11T15:34:00",
            "rate": 5,
            "threshold": 10000,
            "cess": 23
          },
          {
            "effective_date": "2022-02-11T15:34:00",
            "rate": 12,
            "threshold": 12000
          },
          {
            "effective_date": "2022-02-12T15:34:00",
            "rate": 18,
            "threshold": 5000
          }
        ],
        "created_by": {
          "user_id": "000000000000000016841367",
          "username": "app@fynd.com"
        },
        "description": "Data for HSN Code",
        "id": "657064b686a48746c269f402",
        "hsn_code_id": "657064b686a48746c269f402"
      }
    ],
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 1
    }
  }
}
```
</details>

</details>









---


### getSingleProductHSNCode
Hsn Code List.




```java
platformClient.catalog.getSingleProductHSNCode( reportingHsn) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| reportingHsn | String | yes | reporting_hsn |   
| companyId | Integer | yes | Company Id for which HSN codes needs to be fetched |  



Hsn Code List.

*Returned Response:*




[HSNDataInsertV2](#HSNDataInsertV2)

Get specific HSN details. See example below or refer `HsnCodesListingResponseSchema` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "country_code": "IN",
    "created_by": {
      "user_id": -1,
      "username": "silverbolt"
    },
    "created_on": "2022-02-24T09:14:03Z",
    "description": "Data for HSN Code",
    "hsn_code": "89787179",
    "id": "6216ff0378da3f906fc82544",
    "modified_by": {
      "user_id": -1,
      "username": "silverbolt"
    },
    "modified_on": "2022-02-24T09:14:03Z",
    "reporting_hsn": "89787179H29",
    "taxes": [
      {
        "cess": 23,
        "effective_date": "2022-02-11T15:00:00",
        "rate": 5,
        "threshold": 10000
      },
      {
        "effective_date": "2022-02-11T15:00:00",
        "rate": 12,
        "threshold": 12000
      },
      {
        "effective_date": "2022-02-12T15:00:00",
        "rate": 18,
        "threshold": 5000
      }
    ],
    "type": "goods"
  }
}
```
</details>

</details>









---


### updateInventories
Add Inventory for particular size and store.




```java
platformClient.catalog.updateInventories(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |  
| body | [InventoryRequestSchemaV2](#InventoryRequestSchemaV2) | yes | Request body |


This API allows add Inventory for particular size and store.

*Returned Response:*




[InventoryUpdateResponse](#InventoryUpdateResponse)

Returns a success or partial success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Successful"
  }
}
```
</details>

</details>









---


### listInventoryExport
Get the history of the inventory export.




```java
platformClient.catalog.listInventoryExport( status,  fromDate,  toDate,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | It is the unique identifier of the company. |   
| status | String? | no | Status of the export job. |   
| fromDate | String? | no | Inventory export history filtered according to from_date. |   
| toDate | String? | no | Inventory export history filtered according to from_date. |   
| q | String? | no | Inventory export history filtered according to task ID. |  



This API helps you the get the history of inventory jobs depending on the filtered criteria.

*Returned Response:*




[InventoryExportJobListResponse](#InventoryExportJobListResponse)

Returns a list of inventory export jobs




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "6401bd972a2e6c3d508c9203",
        "completed_on": "2023-03-03T09:33:11.416000Z",
        "created_by": {
          "user_id": "5e199e6998cfe1776f1385dc",
          "username": "rohanshah@fynd.com"
        },
        "created_on": "2023-03-03T09:27:51.262000Z",
        "filters": {
          "brand_ids": [
            2751
          ],
          "brands": [
            "Puma"
          ],
          "store_ids": [
            3622
          ],
          "stores": [
            "Vikings Cbs"
          ]
        },
        "id": "6401bd972a2e6c3d508c9203",
        "modified_on": "2023-03-03T09:27:51.262000",
        "notification_emails": [],
        "seller_id": 577,
        "status": "success",
        "task_id": "ab469da4-b9a5-11ed-955a-d6fb21611540",
        "type": "excel",
        "url": "https://regrowth.s3.amazonaws.com/slingshot-catalogues/seller-catalog/577/ab469da4-b9a5-11ed-955a-d6fb21611540/ab469da4-b9a5-11ed-955a-d6fb21611540.zip"
      }
    ]
  }
}
```
</details>

</details>









---


### createInventoryExport
Create an inventory export job.




```java
platformClient.catalog.createInventoryExport(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |  
| body | [InventoryCreateRequest](#InventoryCreateRequest) | yes | Request body |


This API helps to create a Inventory export job.

*Returned Response:*




[InventoryExportResponse](#InventoryExportResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "created_on": "2023-12-17T12:33:13.051283",
    "filters": {
      "brand_ids": [
        19
      ],
      "store_ids": [
        1
      ]
    },
    "task_id": "71c29cd8-9cd8-11ee-b775-eafa25acbfec",
    "type": "excel",
    "seller_id": 1,
    "created_by": {
      "username": "purvashukla_gofynd_com_01172",
      "user_id": "492cc0ee949ef72b996a8d6e"
    },
    "status": "pending",
    "notification_emails": [],
    "stats": {
      "total": 1
    },
    "modified_on": "2023-12-17T12:33:13.051289",
    "id": "657eea896a9d1426aa23d303"
  }
}
```
</details>

</details>









---


### getProducts
Get product list




```java
platformClient.catalog.getProducts( brandIds,  categoryIds,  itemIds,  departmentIds,  itemCode,  q,  tags,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Get list of products filtered by company Id |   
| brandIds | List<Integer>? | no | Get multiple products filtered by Brand Ids |   
| categoryIds | List<Integer>? | no | Get multiple products filtered by Category Ids |   
| itemIds | List<Integer>? | no | Get multiple products filtered by Item Ids |   
| departmentIds | List<Integer>? | no | Get multiple products filtered by Department Ids |   
| itemCode | List<String>? | no | Get multiple products filtered by Item Code |   
| q | String? | no | Get multiple products filtered by q string |   
| tags | List<String>? | no | Get multiple products filtered by tags |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to products.

*Returned Response:*




[ProductListingResponseV2](#ProductListingResponseV2)

Product Meta. See example below for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_custom_json": {},
        "all_company_ids": [
          1
        ],
        "all_identifiers": [
          "19WE100"
        ],
        "all_sizes": [
          {
            "brand_uid": 1,
            "company_id": 1,
            "identifiers": [
              {
                "gtin_type": "ean",
                "gtin_value": "HGS272727272",
                "primary": true
              }
            ],
            "item_code": "TVSET111",
            "marked_price": 35000,
            "seller_identifier": "HGS272727272",
            "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)"
          }
        ],
        "brand": {
          "logo": {
            "aspect_ratio": "1:1",
            "aspect_ratio_f": 1,
            "secure_url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png",
            "url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png"
          },
          "name": "Apple",
          "uid": 13
        },
        "brand_uid": 1,
        "category_slug": "qled-television",
        "category_uid": 1,
        "country_of_origin": "India",
        "created_by": {
          "user_id": "5",
          "username": "919049753052_37528"
        },
        "created_on": "2021-04-02T15:43:59.410000Z",
        "currency": "INR",
        "custom_order": {
          "is_custom_order": true,
          "manufacturing_time": 2,
          "manufacturing_time_unit": "days"
        },
        "departments": [
          1
        ],
        "description": "Tv",
        "highlights": [
          "42 Inch"
        ],
        "hsn_code": "11111111",
        "id": "5f4f2f6371a5970001f13655",
        "image_nature": "standard",
        "images": [
          {
            "aspect_ratio": "16:25",
            "aspect_ratio_f": 0.64,
            "secure_url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png",
            "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png"
          }
        ],
        "is_dependent": false,
        "is_image_less_product": false,
        "is_physical": true,
        "is_set": true,
        "item_code": "TVSET111",
        "item_type": "set",
        "l3_mapping": [
          "electronics>qled_television"
        ],
        "media": [
          {
            "type": "image",
            "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png"
          }
        ],
        "modified_by": {
          "user_id": "xxxxxxxxxxx",
          "username": "xxxxxxxxxx"
        },
        "modified_on": "2021-04-02T15:43:59.410000Z",
        "multi_size": true,
        "name": "TV Set",
        "no_of_boxes": 1,
        "price": {
          "effective": {
            "max": 25000,
            "min": 25000
          },
          "marked": {
            "max": 35000,
            "min": 35000
          }
        },
        "product_group_tag": [],
        "product_publish": {
          "is_set": false,
          "product_online_date": "2021-04-02T15:43:59.410000Z"
        },
        "return_config": {
          "returnable": false,
          "time": 0,
          "unit": "days"
        },
        "short_description": "",
        "size_guide": "slim-fit-shirts-for-men",
        "sizes": [
          {
            "size": "FGX33, GHX33 (66 PCS)",
            "store_count": 1
          },
          {
            "size": "XSE WE23X100 (100 PCS)",
            "store_count": 2
          },
          {
            "size": "XSEX100 (100 PCS)",
            "store_count": 3
          },
          {
            "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)",
            "store_count": 3
          }
        ],
        "slug": "tv-set",
        "stage": "verified",
        "synonyms": [],
        "tags": [],
        "teaser_tag": {},
        "template_tag": "television",
        "trader": [
          {
            "address": [
              "sdfdsfsdf"
            ],
            "name": "asdasd"
          }
        ],
        "trader_type": "Packer",
        "uid": 7501547,
        "variants": {},
        "verification_status": "pending",
        "verified_by": {
          "user_id": "0",
          "username": "Silverbolt"
        },
        "verified_on": "2020-07-23T04:20:43.810000Z"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
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


### createProduct
Create a product.




```java
platformClient.catalog.createProduct(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |  
| body | [ProductCreateUpdateSchemaV2](#ProductCreateUpdateSchemaV2) | yes | Request body |


This API allows to create product.

*Returned Response:*




[SuccessResponse1](#SuccessResponse1)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "success": true,
    "uid": 7500000
  }
}
```
</details>

</details>









---


### uploadBulkProducts
Create a Bulk product to upload job.




```java
platformClient.catalog.uploadBulkProducts( department,  productType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id in which assets to be uploaded. |   
| department | String | yes | Department of the product to be uploaded. |   
| productType | String | yes | Product type of the product to be uploaded i.e. set, standard , digital. |  
| body | [BulkProductJob](#BulkProductJob) | yes | Request body |


This API helps to create a bulk products upload job.

*Returned Response:*




[ProductBulkResponse](#ProductBulkResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "batch_id": "507f1f77bcf86cd799439011"
  }
}
```
</details>

</details>









---


### getProductExportJobs
Allows you to list all product templates export list details




```java
platformClient.catalog.getProductExportJobs( status,  fromDate,  toDate,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |   
| status | String? | no | This is a parameter used to find all the jobs with the specified status. |   
| fromDate | String? | no | This is a parameter used to find the job from the date specified to the current date. |   
| toDate | String? | no | This is a parameter used to find the job from the from_date specified to the to_date. |   
| q | String? | no | It is a query parameter to search the export job with the task ID. |  



Can view details including trigger data, task id , etc.

*Returned Response:*




[ProductDownloadsResponse](#ProductDownloadsResponse)

List of Product Downloads Data. See example below or refer `ProductDownloadsResponse` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "completed_on": "2020-12-23T07:23:41.031000Z",
        "created_by": {
          "user_id": "5646",
          "username": "917972410891_48194"
        },
        "data": {
          "brand": [
            "ruosh"
          ],
          "templates": [
            "mobile-phones-and-tablet"
          ],
          "type": "csv"
        },
        "id": "5fe2f077516d980001880943",
        "seller_id": 3,
        "status": "success",
        "task_id": "c4b54ace-44ef-11eb-9806-1ef9bc4a2da1",
        "template_tags": {
          "mobile-phones-and-tablet": {
            "display": "Mobile Phones & Tablet",
            "logo": "https://hdn-1.jiox0.de/jiox0/seller/pictures/logo/original/Oda39B_99946594-portable-devices-with-tablet-and-mobile-phone-vector-icon-for-apps-and-websites.jpgcc2dff44-7fae-4002-9ebe-d2b59c8bee91/Oda39B_99946594-portable-devices-with-tablet-and-mobile-phone-vector-icon-for-apps-and-websites.jpg"
          }
        },
        "trigger_on": "2020-12-23T07:23:35.302000Z",
        "url": "https://regrowth.s3.amazonaws.com/slingshot-catalogues/seller-catalog/3/c4b54ace-44ef-11eb-9806-1ef9bc4a2da1/c4b54ace-44ef-11eb-9806-1ef9bc4a2da1.zip"
      }
    ],
    "page": {}
  }
}
```
</details>

</details>









---


### createProductExportJob
Create a product export job.




```java
platformClient.catalog.createProductExportJob(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular seller account. |  
| body | [ProductTemplateDownloadsExport](#ProductTemplateDownloadsExport) | yes | Request body |


This API helps to create a Inventory export job.

*Returned Response:*




[CreateProductDownloadsResponse](#CreateProductDownloadsResponse)

Returns a success response




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "_id": "6401cb6729885c34aa30b0c6",
      "created_by": {
        "user_id": "550fe8ce436ea332b9e4b4b0",
        "username": "purvashukla_gofynd_com_44895"
      },
      "created_on": "2023-03-03T10:26:47.047171Z",
      "filters": {
        "brands": [],
        "catalogue_types": [
          "standard"
        ],
        "templates": [
          "footwear"
        ]
      },
      "modified_on": "2023-03-03T10:26:47.047179",
      "notification_emails": [],
      "seller_id": 577,
      "stats": {},
      "status": "pending",
      "task_id": "e6c47f1a-b9ad-11ed-b7a0-3ef7b700888d",
      "type": "excel"
    }
  }
}
```
</details>

</details>









---


### getProduct
Get a single product.




```java
platformClient.catalog.getProduct( itemId,  brandUid,  itemCode) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the product. |   
| itemId | Integer | yes | Item Id of the product. |   
| brandUid | Integer? | no | Brand Id of the product. |   
| itemCode | String? | no | Item code of the product. |  



This API helps to get data associated to a particular product.

*Returned Response:*




[SingleProductResponse](#SingleProductResponse)

Product object. See example below or refer `product.utils.format_product_response` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "data": {
      "_custom_json": {},
      "all_company_ids": [
        835
      ],
      "all_identifiers": [
        "TEST-015434"
      ],
      "attributes": {
        "essential": "No",
        "gender": [
          "Men"
        ],
        "marketer-address": "dfg",
        "marketer-name": "gfdfd",
        "pattern": "Printed",
        "primary_color": "Black",
        "primary_material": "Cotton Blend"
      },
      "brand": {
        "logo": {
          "aspect_ratio": "1:1",
          "aspect_ratio_f": 1,
          "secure_url": "",
          "url": ""
        },
        "name": "product1",
        "uid": 3272
      },
      "brand_uid": 3272,
      "category": {
        "l1": {
          "name": "Ethnic Wear",
          "slug": "ethnic-wear",
          "uid": 443
        },
        "l2": {
          "name": "Hijabs & Abayas",
          "slug": "hijabs-abayas",
          "uid": 414
        },
        "l3": {
          "name": "Abayas",
          "slug": "abayas",
          "uid": 441
        }
      },
      "category_slug": "abayas",
      "category_uid": 441,
      "country_of_origin": "India",
      "created_by": {
        "super_user": false,
        "user_id": "757bf08ff5dd4ba95f8778cf",
        "username": "mdnehalahmed_fynd_external_com_90136"
      },
      "created_on": "2023-02-16T09:37:31.304000",
      "currency": "INR",
      "custom_order": {
        "is_custom_order": false,
        "manufacturing_time": 0,
        "manufacturing_time_unit": "days"
      },
      "departments": [
        21
      ],
      "description": "",
      "highlights": [],
      "id": "63edf95bf314486d44a6b361",
      "is_active": true,
      "is_dependent": false,
      "is_expirable": false,
      "is_image_less_product": false,
      "is_set": false,
      "item_code": "TEST-01",
      "item_type": "standard",
      "media": [
        {
          "type": "image",
          "url": "/x0/products/pictures/item/free/original/Hsw-U3Kut-Test-01.jpeg"
        }
      ],
      "modified_by": {
        "super_user": false,
        "user_id": "757bf08ff5dd4ba95f8778cf",
        "username": "mdnehalahmed_fynd_external_com_90136"
      },
      "modified_on": "2023-02-16T09:37:31.304000",
      "multi_size": false,
      "name": "Test-01",
      "net_quantity": {},
      "no_of_boxes": 1,
      "product_group_tag": [],
      "product_publish": {
        "is_set": false,
        "product_online_date": "2023-02-16T09:37:29.620000Z"
      },
      "return_config": {
        "returnable": false,
        "time": 0,
        "unit": "days"
      },
      "short_description": "",
      "size_guide": "",
      "sizes": [
        {
          "_custom_json": {},
          "brand_uid": 3272,
          "company_id": 835,
          "created_on": "2023-02-16T09:37:31.352000",
          "currency": "INR",
          "id": "63edf95bf314486d44a6b364",
          "identifiers": [
            {
              "gtin_type": "ean",
              "gtin_value": "TEST-015434",
              "primary": true
            }
          ],
          "is_set": false,
          "item_code": "TEST-01",
          "item_dimensions_unit_of_measure": "cm",
          "item_height": 10,
          "item_length": 10,
          "item_weight": 10,
          "item_weight_unit_of_measure": "gram",
          "item_width": 10,
          "modified_on": "2023-02-16T09:37:31.352000",
          "price": 10,
          "price_effective": 10,
          "price_transfer": 0,
          "seller_identifier": "TEST-015434",
          "size": "OS",
          "track_inventory": true
        }
      ],
      "slug": "test-01-7542894",
      "stage": "pending",
      "tags": [],
      "tax_identifier": {
        "hsn_code": "97211110",
        "hsn_code_id": "63d78f483c1714abdd406766",
        "reporting_hsn": "97211110H1"
      },
      "teaser_tag": {},
      "template_tag": "ethnicwear",
      "trader": [
        {
          "address": [
            "fdgh"
          ],
          "name": "fgt",
          "type": "Manufacturer"
        }
      ],
      "uid": 7542894,
      "variant_media": {},
      "variants": {}
    }
  }
}
```
</details>

</details>









---


### editProduct
Edit a product.




```java
platformClient.catalog.editProduct( itemId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Id of the product to be updated. |  
| body | [ProductCreateUpdateSchemaV2](#ProductCreateUpdateSchemaV2) | yes | Request body |


This API allows to edit product.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### deleteProduct
Delete a product.




```java
platformClient.catalog.deleteProduct( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id of the company associated to product that is to be deleted. |   
| itemId | Integer | yes | Id of the product to be updated. |  



This API allows to delete product.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

Returns a success response




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


### allSizes
All Sizes for a given Product




```java
platformClient.catalog.allSizes( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Id of the product to be updated. |  



This API allows to get  All Sizes for a given Product.

*Returned Response:*




[GetAllSizes](#GetAllSizes)

List Product Sizes. See example below or refer `AllSizes` for details




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "all_sizes": [
      {
        "identifiers": [
          {
            "gtin_type": "ean",
            "gtin_value": "74352323423",
            "primary": true
          }
        ],
        "item_dimensions_unit_of_measure": "cm",
        "item_height": 100,
        "item_length": 1000,
        "item_weight": 100,
        "item_weight_unit_of_measure": "gram",
        "item_width": 1000,
        "size": "OS"
      }
    ]
  }
}
```
</details>

</details>









---


### deleteRealtimeInventory
Add Inventory for particular size and store.




```java
platformClient.catalog.deleteRealtimeInventory( itemId,  sellerIdentifier, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Item code of the product of which size is to be get. |   
| sellerIdentifier | String | yes | Size Identifier (Seller Identifier or Primary Identifier) of which inventory is to get. |  
| body | [InventoryRequestSchemaV2](#InventoryRequestSchemaV2) | yes | Request body |


This API allows add Inventory for particular size and store.

*Returned Response:*




[InventoryUpdateResponse](#InventoryUpdateResponse)

Returns a success response




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


### updateRealtimeInventory
Add Inventory for particular size and store.




```java
platformClient.catalog.updateRealtimeInventory( itemId,  sellerIdentifier, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Item code of the product of which size is to be get. |   
| sellerIdentifier | String | yes | Size Identifier (Seller Identifier or Primary Identifier) of which inventory is to get. |  
| body | [InventoryRequestSchemaV2](#InventoryRequestSchemaV2) | yes | Request body |


This API allows add Inventory for particular size and store.

*Returned Response:*




[InventoryUpdateResponse](#InventoryUpdateResponse)

Returns a success response




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


### getProductTemplateBySlug
Update marketplace optin




```java
platformClient.catalog.getProductTemplateBySlug( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to the template. |   
| slug | String | yes | Slug of the template. |  



This API retrieves template for a given slug.

*Returned Response:*




[GetProductTemplateSlugResponse](#GetProductTemplateSlugResponse)

Update marketplace optin config.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "page": {
      "current": 1,
      "type": "number",
      "size": 1,
      "has_previous": false,
      "has_next": false,
      "item_total": 1
    },
    "items": [
      {
        "attributes": [
          "test"
        ],
        "departments": [
          "electronics",
          "fashion"
        ],
        "is_active": true,
        "tag": "test",
        "is_physical": false,
        "description": "test",
        "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/seller/pictures/logo/original/bPpx16_newplot.png120c05f3-138b-4130-9b2b-596c771d61da/bPpx16_newplot.png",
        "is_archived": false,
        "slug": "test",
        "categories": [
          "smart-cellphone"
        ],
        "is_expirable": false,
        "name": "Test",
        "id": "6587d3f3bf65f561004fabdd"
      }
    ]
  }
}
```
</details>

</details>









---


### getMarketplaces
List all marketplaces




```java
platformClient.catalog.getMarketplaces() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to the marketplace. |  



This API allows to get marketplace information.

*Returned Response:*




[GetAllMarketplaces](#GetAllMarketplaces)

List all Marketplace details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "items": [
      {
        "brand_ids": [],
        "app_id": "000000000000000000000001",
        "enabled": true,
        "created_by": {
          "username": "test@gofynd.com",
          "user_id": "ef56cde2dc3227c44bcb73fd"
        },
        "created_on": "2023-07-11T18:27:10.477000",
        "opt_level": "company",
        "company_id": 1,
        "modified_by": {
          "username": "test@gofynd.com",
          "user_id": "ef56cde2dc3227c44bcb73fd"
        },
        "store_ids": [],
        "modified_on": "2023-07-11T18:27:10.477000",
        "platform": "fynd",
        "_id": "64ad9efe8069f0f413265003"
      }
    ],
    "page": {
      "current": 1,
      "has_next": false,
      "has_previous": false,
      "item_total": 6,
      "size": 1,
      "type": "number"
    }
  }
}
```
</details>

</details>









---


### updateMarketplaceOptin
Update marketplace optin




```java
platformClient.catalog.updateMarketplaceOptin( marketplace, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to the marketplace. |   
| marketplace | String | yes | Slug of the marketplace . |  
| body | [UpdateMarketplaceOptinRequest](#UpdateMarketplaceOptinRequest) | yes | Request body |


This API allows to update marketplace optin for a company.

*Returned Response:*




[UpdateMarketplaceOptinResponse](#UpdateMarketplaceOptinResponse)

Update marketplace optin config.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "store_ids": [
      10
    ],
    "enabled": true,
    "company_id": 10,
    "platform": "fynd",
    "brand_ids": [
      1
    ],
    "opt_level": "9",
    "created_by": {
      "username": "mithalikamble_gofynd_com_92051",
      "user_id": "03b4a75fa92656a2babbbda6"
    },
    "modified_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    }
  }
}
```
</details>

</details>









---


### createMarketplaceOptin
Update marketplace optin




```java
platformClient.catalog.createMarketplaceOptin( marketplace, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of the company associated to the marketplace. |   
| marketplace | String | yes | Slug of the marketplace . |  
| body | [CreateMarketplaceOptinRequest](#CreateMarketplaceOptinRequest) | yes | Request body |


This API allows to create marketplace optin for a company.

*Returned Response:*




[CreateMarketplaceOptinResponse](#CreateMarketplaceOptinResponse)

Update marketplace optin config.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "store_ids": [
      10
    ],
    "brand_ids": [
      1
    ],
    "company_id": 10,
    "opt_level": "9",
    "platform": "test",
    "enabled": true,
    "created_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    },
    "modified_by": {
      "username": "rohanshah@fynd.com",
      "user_id": "5e199e6998cfe1776f1385dc"
    },
    "app_id": ""
  }
}
```
</details>

</details>









---


### createAutocompleteSettings
Create autocomplete settings config for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.createAutocompleteSettings(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| applicationId | Integer | yes | The company id for which the autocomplete settings is being referenced |   
| companyId | Integer | yes | The application id for which the autocomplete settings is being referenced |  
| body | [AutocompleteRequestSchema](#AutocompleteRequestSchema) | yes | Request body |


This API allows to create autocomplete settings for an application.

*Returned Response:*




[AutocompleteUpsertResponseSchema](#AutocompleteUpsertResponseSchema)

return success true/false based on create operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "id": "657884575e12e699f8187f47",
  "message": "Autocomplete settings created successfully!"
}
```
</details>









---


### getAutocompleteSettings
Get autocomplete settings config for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getAutocompleteSettings() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| applicationId | Integer | yes | The company id for which the autocomplete settings is being referenced |   
| companyId | Integer | yes | The application id for which the autocomplete settings is being referenced |  



This API allows to get autocomplete settings config for an application.

*Returned Response:*




[AutocompleteResponseSchema](#AutocompleteResponseSchema)

Object of autocomplete settings config




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "657884575e12e699f8187f47",
  "query_suggestion": [
    {
      "active": true
    },
    {
      "count": 1
    }
  ],
  "brand_suggestion": [
    {
      "active": false
    },
    {
      "count": 0
    }
  ],
  "category_suggestion": [
    {
      "active": true
    },
    {
      "count": 3
    }
  ],
  "collection_suggestion": [
    {
      "active": true
    },
    {
      "count": 5
    }
  ],
  "product_suggestion": [
    {
      "active": true
    },
    {
      "count": 1
    }
  ]
}
```
</details>









---


### updateAutocompleteSettings
Update autocomplete settings config for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.updateAutocompleteSettings( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| applicationId | Integer | yes | The company id for which the autocomplete settings is being referenced |   
| companyId | Integer | yes | The application id for which the autocomplete settings is being referenced |   
| id | String | yes | An `id` is a unique identifier for a particular autocomplete settings config. |  
| body | [AutocompleteRequestSchema](#AutocompleteRequestSchema) | yes | Request body |


This API allows to update autocomplete settings for an application.

*Returned Response:*




[AutocompleteUpsertResponseSchema](#AutocompleteUpsertResponseSchema)

return success true/false based on update operation




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "id": "657884575e12e699f8187f47",
  "message": "Autocomplete settings updated!"
}
```
</details>









---


### getAutocompletePreview
Get autocomplete suggestions as per config for an application




```java
platformClient.application("<APPLICATION_ID>").catalog.getAutocompletePreview( q,  categorySuggestion,  brandSuggestion,  collectionSuggestion,  productSuggestion,  querySuggestion) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| applicationId | Integer | yes | The company id for which the autocomplete settings is being referenced |   
| companyId | Integer | yes | The application id for which the autocomplete settings is being referenced |   
| q | String? | no | Get suggestions related to `q` string. |   
| categorySuggestion | Integer? | no | For getting related category suggestions. |   
| brandSuggestion | Integer? | no | For getting related brand suggestions. |   
| collectionSuggestion | Integer? | no | For getting collection suggestions. |   
| productSuggestion | Integer? | no | For getting product suggestions. |   
| querySuggestion | Integer? | no | For getting query suggestions. |  



This API allows to get autocomplete suggestions as per config.

*Returned Response:*




[AutocompletePreviewResponseSchema](#AutocompletePreviewResponseSchema)

return autocomplete suggestions




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getMerchandisingRulePinAction
Get Merchandising Rule's action details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingRulePinAction( merchandisingRuleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  



This allows you to get details of pin action of a merchandising rule.

*Returned Response:*




[PinResponse](#PinResponse)

List of pinned items. See example below or refer `PinResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": [
    {
      "uid": 7500094,
      "name": "Realme Techlife T100 TWS Earbuds with 28 Hours Playback, IPX5 Water Resistance, Al Noise Cancellation for",
      "position": 0
    }
  ]
}
```
</details>









---


### createMerchandisingRulePinAction
Create Merchandising Rule's action details




```java
platformClient.application("<APPLICATION_ID>").catalog.createMerchandisingRulePinAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [PinRequest](#PinRequest) | yes | Request body |


This allows you to create pin action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of pinned items. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### updateMerchandisingRulePinAction
Update Merchandising Rule's action details




```java
platformClient.application("<APPLICATION_ID>").catalog.updateMerchandisingRulePinAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [PinRequest](#PinRequest) | yes | Request body |


This allows you to update pin action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of pinned items. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### getMerchandisingRuleHideAction
Get Merchandising Rule's Hide action details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingRuleHideAction( merchandisingRuleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  



This allows you to get details of hide action of a merchandising rule.

*Returned Response:*




[HideResponse](#HideResponse)

List of hide items. See example below or refer `GetMerchandisingRuleHideAction` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": [
    {
      "uid": 1,
      "name": "facilitate value-added infrastructures"
    },
    {
      "uid": 2,
      "name": "extend back-end relationships"
    },
    {
      "uid": 3,
      "name": "incentivize cross-media portals"
    }
  ]
}
```
</details>









---


### createMerchandisingRuleHideAction
Create Merchandising Rule's Hide action details




```java
platformClient.application("<APPLICATION_ID>").catalog.createMerchandisingRuleHideAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [HideRequest](#HideRequest) | yes | Request body |


This allows you to create hide action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of hide items. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### updateMerchandisingRuleHideAction
Update Merchandising Rule's Hide action details




```java
platformClient.application("<APPLICATION_ID>").catalog.updateMerchandisingRuleHideAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [HideRequest](#HideRequest) | yes | Request body |


This allows you to update hide action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of hide items. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### getMerchandisingRuleBoostAction
Get Merchandising Rule's Boost action details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingRuleBoostAction( merchandisingRuleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  



This allows you to get details of Boost action of a merchandising rule.

*Returned Response:*




[GetMerchandisingRuleBoostAction](#GetMerchandisingRuleBoostAction)

List of Boost conditions. See example below or refer `GetMerchandisingRuleBoostAction` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": [
    {
      "attribute": "brand",
      "value": "MAC",
      "strength": 80
    },
    {
      "attribute": "name",
      "value": "Intel",
      "strength": 20
    }
  ]
}
```
</details>









---


### createMerchandisingRuleBoostAction
Create Merchandising Rule's Boost action details




```java
platformClient.application("<APPLICATION_ID>").catalog.createMerchandisingRuleBoostAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [GetMerchandisingRuleBoostAction](#GetMerchandisingRuleBoostAction) | yes | Request body |


This allows you to create Boost action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of Boost conditions. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### updateMerchandisingRuleBoostAction
Update Merchandising Rule's Boost action details




```java
platformClient.application("<APPLICATION_ID>").catalog.updateMerchandisingRuleBoostAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [GetMerchandisingRuleBoostAction](#GetMerchandisingRuleBoostAction) | yes | Request body |


This allows you to update Boost action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of Boost conditions. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### getMerchandisingRuleBuryAction
Get Merchandising Rule's Bury action details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingRuleBuryAction( merchandisingRuleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  



This allows you to get details of Bury action of a merchandising rule.

*Returned Response:*




[GetMerchandisingRuleBuryAction](#GetMerchandisingRuleBuryAction)

List of Bury conditions. See example below or refer `GetMerchandisingRuleBuryAction` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": [
    {
      "attribute": "brand",
      "value": "MAC",
      "strength": 80
    },
    {
      "attribute": "name",
      "value": "Intel",
      "strength": 20
    }
  ]
}
```
</details>









---


### createMerchandisingRuleBuryAction
Get Merchandising Rule's Bury action details




```java
platformClient.application("<APPLICATION_ID>").catalog.createMerchandisingRuleBuryAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [GetMerchandisingRuleBuryAction](#GetMerchandisingRuleBuryAction) | yes | Request body |


This allows you to create Bury action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of Bury conditions. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
null
```
</details>









---


### updateMerchandisingRuleBuryAction
Update Merchandising Rule's Bury action details




```java
platformClient.application("<APPLICATION_ID>").catalog.updateMerchandisingRuleBuryAction( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [GetMerchandisingRuleBuryAction](#GetMerchandisingRuleBuryAction) | yes | Request body |


This allows you to update Bury action of a merchandising rule.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

List of Bury conditions. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
null
```
</details>









---


### createMerchandisingRuleQuery
Create a Merchandising Rule's query




```java
platformClient.application("<APPLICATION_ID>").catalog.createMerchandisingRuleQuery(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [MerchandisingRuleQueryPost](#MerchandisingRuleQueryPost) | yes | Request body |


This allows you to Create a merchandising rule's query.

*Returned Response:*




[MerchandiseQueryResponse](#MerchandiseQueryResponse)

Update a merchandise rule's query. See example below or refer `MerchandiseQueryResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok",
  "merchandising_rule_id": "r4f34f3f"
}
```
</details>









---


### getMerchandisingQuery
Get Merchandising Rule's query details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingQuery( merchandisingRuleId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  



This allows you to get details of a merchandising rule's query.

*Returned Response:*




[SearchRequest](#SearchRequest)

Details of merchandise query. See example below or refer `SearchRequest` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "65b36fefe0b368503c28774b",
  "zone_ids": [
    1,
    2,
    3
  ],
  "query": {
    "filter": [
      {
        "attribute": "is_set",
        "value": "No"
      },
      {
        "attribute": "image_nature",
        "value": "Good Quality"
      }
    ],
    "query_condition": "search_query"
  },
  "application_id": "000000000000000000000001",
  "merchandising_rule_id": "u5hp1f2uwi",
  "status": "preview",
  "created_on": "2024-01-26T08:39:53.220095",
  "modified_on": "2024-01-26T08:39:53.220120"
}
```
</details>









---


### updateMerchandisingRuleQuery
Update a Merchandising Rule's query




```java
platformClient.application("<APPLICATION_ID>").catalog.updateMerchandisingRuleQuery( merchandisingRuleId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |  
| body | [MerchandisingRuleQueryPost](#MerchandisingRuleQueryPost) | yes | Request body |


This allows you to Update a merchandising rule's query.

*Returned Response:*




[SuccessResponseMerchandising](#SuccessResponseMerchandising)

Update a merchandise rule's query. See example below or refer `SuccessResponseMerchandising` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "ok"
}
```
</details>









---


### getMerchandisingRules
Get list of all Merchandising Rule's details




```java
platformClient.application("<APPLICATION_ID>").catalog.getMerchandisingRules( pageId,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| pageId | String? | no | Each response will contain next_id param, which should be sent back to make pagination work. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This allows you to get details of all merchandising rule's details.

*Returned Response:*




[MerchandisingRulesList](#MerchandisingRulesList)

Details of all merchandise rule's details. See example below or refer `MerchandisingRulesList` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": [
    {
      "query": {
        "_id": "65a8f6f70c18ced33f6c434e",
        "query": {
          "query_condition": "search_query",
          "query": {
            "condition": "contains",
            "search_query": "abcd",
            "synonyms": "true"
          },
          "filter": [
            {
              "attribute": "Category",
              "value": "selected"
            },
            {
              "attribute": "Department",
              "value": "kids"
            }
          ]
        },
        "is_active": true,
        "merchandising_rule_id": "xsb1w2wjxb",
        "rule_name": "Merchandising Rule Name 1",
        "status": "live",
        "zone_ids": [
          1,
          2,
          3
        ],
        "application_id": "000000000000000000000001"
      },
      "action": [
        "bury",
        "hide"
      ]
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_total": 1
  }
}
```
</details>









---


### getLivePreview
Get live preview of a Merchandising Rule




```java
platformClient.application("<APPLICATION_ID>").catalog.getLivePreview( merchandisingRuleId,  searchKeyword) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| merchandisingRuleId | String | yes | A `merchandising_rule_id` is a unique identifier for a particular merchandising rule. |   
| searchKeyword | String? | no | A sample query that can be used to get a live preview of the merchandising rule. |  



This allows you to get live preview of a merchandising rule.

*Returned Response:*




[ProductListingResponse](#ProductListingResponse)

Get live preview of a merchandise rule. See example below or refer `ProductListingResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc8c0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Cookie Box, Pack of 8",
      "pinned": true,
      "sizes": [
        "OS"
      ],
      "slug": "cookie-box-pack-of-8-7500520",
      "tags": [],
      "uid": 7500520,
      "item_code": "COOKIES051",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Allen Solly",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/brands/pictures/square-logo/original/qYk-zhgWQ-Logo.png"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "allen-solly"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "cookie-box-pack-of-8-7500520"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/allen-solly/COOKIES051/0/eMu_MHvv8f-81G00AyHv0L.jpg",
          "alt": "Cookie Box, Pack of 8"
        }
      ],
      "identifiers": [
        "COOKIES51",
        "COOKIES051"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 116,
          "max": 116,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 116,
          "max": 116,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Cookie Box, Pack of 8",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc940>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Chocobakes ChocoChip Cookies 167 g",
      "sizes": [
        "OS"
      ],
      "slug": "chocobakes-chocochip-cookies-167-g-7500481",
      "tags": [],
      "uid": 7500481,
      "item_code": "COOKIES015",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "W for Woman",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "w-for-woman"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "chocobakes-chocochip-cookies-167-g-7500481"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/w-for-woman/COOKIES015/0/A2b4cNjnob-61LrAe-7JL.jpg",
          "alt": "Chocobakes ChocoChip Cookies 167 g"
        }
      ],
      "identifiers": [
        "COOKIES15",
        "COOKIES015"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 66,
          "max": 66,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 66,
          "max": 66,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Chocobakes ChocoChip Cookies 167 g",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc140>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Oats with Almonds cookies Biscuits, 150g",
      "sizes": [
        "OS"
      ],
      "slug": "oats-with-almonds-cookies-biscuits-150g-7500517",
      "tags": [],
      "uid": 7500517,
      "item_code": "COOKIES046",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Van Heusen",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "van-heusen"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "oats-with-almonds-cookies-biscuits-150g-7500517"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/van-heusen/COOKIES046/0/-aboJbiHYa-61ewIMzO6jL.jpg",
          "alt": "Oats with Almonds cookies Biscuits, 150g"
        }
      ],
      "identifiers": [
        "COOKIES46",
        "COOKIES046"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 50,
          "max": 50,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 50,
          "max": 50,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Oats with Almonds cookies Biscuits, 150g",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc4c0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Oats Cranberry Cookies (Pack of 2 x 125g)",
      "sizes": [
        "OS"
      ],
      "slug": "oats-cranberry-cookies-pack-of-2-x-125g-7500506",
      "tags": [],
      "uid": 7500506,
      "item_code": "COOKIES059",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Biba",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "biba"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "oats-cranberry-cookies-pack-of-2-x-125g-7500506"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/biba/COOKIES059/0/V7R6AYjEyJ-811waMWHTzL.jpg",
          "alt": "Oats Cranberry Cookies (Pack of 2 x 125g)"
        }
      ],
      "identifiers": [
        "COOKIES059",
        "COOKIES59"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 189,
          "max": 189,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 189,
          "max": 189,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Oats Cranberry Cookies (Pack of 2 x 125g)",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc540>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "7 Grain Breakfast Cookies|Assorted,Pack Of 6 (330G)",
      "sizes": [
        "OS"
      ],
      "slug": "7-grain-breakfast-cookies-assorted-pack-of-6-330g-7500509",
      "tags": [],
      "uid": 7500509,
      "item_code": "COOKIES026",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Van Heusen",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "van-heusen"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "7-grain-breakfast-cookies-assorted-pack-of-6-330g-7500509"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/van-heusen/COOKIES026/0/SqZsagaLAC-61ZolESmSZL.jpg",
          "alt": "7 Grain Breakfast Cookies|Assorted,Pack Of 6 (330G)"
        }
      ],
      "identifiers": [
        "COOKIES26",
        "COOKIES026"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 291,
          "max": 291,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 291,
          "max": 291,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "7 Grain Breakfast Cookies|Assorted,Pack Of 6 (330G)",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe256bbc1c0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Max Protein Cookies – Trail Mix [Pack of 12 ] 7 Grain Breakfast Cookie loaded with Protein, Fiber and calcium, NO MAIDA, GMO FREE, NO Preservatives",
      "sizes": [
        "OS"
      ],
      "slug": "max-protein-cookies-trail-mix-pack-of-12-7-grain-breakfast-cookie-loaded-with-protein-fiber-and-calcium-no-maida-gmo-free-no-preservatives-7500501",
      "tags": [],
      "uid": 7500501,
      "item_code": "COOKIES035",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "W for Woman",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "w-for-woman"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "max-protein-cookies-trail-mix-pack-of-12-7-grain-breakfast-cookie-loaded-with-protein-fiber-and-calcium-no-maida-gmo-free-no-preservatives-7500501"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/w-for-woman/COOKIES035/0/QD-mtDSdjg-71kdPR6YUmL.jpg",
          "alt": "Max Protein Cookies – Trail Mix [Pack of 12 ] 7 Grain Breakfast Cookie loaded with Protein, Fiber and calcium, NO MAIDA, GMO FREE, NO Preservatives"
        }
      ],
      "identifiers": [
        "COOKIES035",
        "COOKIES35"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 570,
          "max": 570,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 570,
          "max": 570,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Max Protein Cookies – Trail Mix [Pack of 12 ] 7 Grain Breakfast Cookie loaded with Protein, Fiber and calcium, NO MAIDA, GMO FREE, NO Preservatives",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe25792cd40>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Choco Chip, Chocolate Cookies Loaded with Choco Chips, 357.5g",
      "sizes": [
        "OS"
      ],
      "slug": "choco-chip-chocolate-cookies-loaded-with-choco-chips-357-5g-7500529",
      "tags": [],
      "uid": 7500529,
      "item_code": "COOKIES043",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Levi's",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "levi-s"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "choco-chip-chocolate-cookies-loaded-with-choco-chips-357-5g-7500529"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/levi-s/COOKIES043/0/N4kgc6mxMa-71BoLifelZL.jpg",
          "alt": "Choco Chip, Chocolate Cookies Loaded with Choco Chips, 357.5g"
        }
      ],
      "identifiers": [
        "COOKIES043",
        "COOKIES43"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 70,
          "max": 70,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 70,
          "max": 70,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Choco Chip, Chocolate Cookies Loaded with Choco Chips, 357.5g",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe25714acc0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Choco Fills, 300g, Original Filled Cookies with Choco Crème",
      "sizes": [
        "OS"
      ],
      "slug": "choco-fills-300g-original-filled-cookies-with-choco-cr-me-7500480",
      "tags": [],
      "uid": 7500480,
      "item_code": "COOKIES013",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Levi's",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "levi-s"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "choco-fills-300g-original-filled-cookies-with-choco-cr-me-7500480"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/levi-s/COOKIES013/0/nDD3hau8cJ-81egmZT3u-L.jpg",
          "alt": "Choco Fills, 300g, Original Filled Cookies with Choco Crème"
        }
      ],
      "identifiers": [
        "COOKIES13",
        "COOKIES013"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 144,
          "max": 144,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 144,
          "max": 144,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Choco Fills, 300g, Original Filled Cookies with Choco Crème",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe257d442c0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Choco Almond Story Box | 1 Healthy Choco Almond Cookies Story Box|Nutty & Chocolatey | Family Snacks Biscuit | No Added Maida | 6 Cookies Per Box, 75 gm",
      "sizes": [
        "OS"
      ],
      "slug": "choco-almond-story-box-1-healthy-choco-almond-cookies-story-box-nutty-chocolatey-family-snacks-biscuit-no-added-maida-6-cookies-per-box-75-gm-7500516",
      "tags": [],
      "uid": 7500516,
      "item_code": "COOKIES044",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Pantaloons",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "pantaloons"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "choco-almond-story-box-1-healthy-choco-almond-cookies-story-box-nutty-chocolatey-family-snacks-biscuit-no-added-maida-6-cookies-per-box-75-gm-7500516"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/pantaloons/COOKIES044/0/Q8RrtzO3dw-61LB-ljQL.jpg",
          "alt": "Choco Almond Story Box | 1 Healthy Choco Almond Cookies Story Box|Nutty & Chocolatey | Family Snacks Biscuit | No Added Maida | 6 Cookies Per Box, 75 gm"
        }
      ],
      "identifiers": [
        "COOKIES044",
        "COOKIES44"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 94,
          "max": 94,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 94,
          "max": 94,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Choco Almond Story Box | 1 Healthy Choco Almond Cookies Story Box|Nutty & Chocolatey | Family Snacks Biscuit | No Added Maida | 6 Cookies Per Box, 75 gm",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe257140140>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Premium Dark Chocolate Cookies | Handcrafted with Butter and Rich Dark Chocolate Chunks | Eggless Cookies | Perfect Snack for Mid- Meal Cravings | Pack of 1 | 200g",
      "sizes": [
        "OS"
      ],
      "slug": "premium-dark-chocolate-cookies-handcrafted-with-butter-and-rich-dark-chocolate-chunks-eggless-cookies-perfect-snack-for-mid-meal-cravings-pack-of-1-200g-7500510",
      "tags": [],
      "uid": 7500510,
      "item_code": "COOKIES027",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Zara",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "zara"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "premium-dark-chocolate-cookies-handcrafted-with-butter-and-rich-dark-chocolate-chunks-eggless-cookies-perfect-snack-for-mid-meal-cravings-pack-of-1-200g-7500510"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/zara/COOKIES027/0/CRAXBOSA8S-618icP0ydgL.jpg",
          "alt": "Premium Dark Chocolate Cookies | Handcrafted with Butter and Rich Dark Chocolate Chunks | Eggless Cookies | Perfect Snack for Mid- Meal Cravings | Pack of 1 | 200g"
        }
      ],
      "identifiers": [
        "COOKIES027",
        "COOKIES27"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 189,
          "max": 189,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 189,
          "max": 189,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Premium Dark Chocolate Cookies | Handcrafted with Butter and Rich Dark Chocolate Chunks | Eggless Cookies | Perfect Snack for Mid- Meal Cravings | Pack of 1 | 200g",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe257140cc0>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Quadratini Chocolate Bite Size Wafer Cookies,125 GMS",
      "sizes": [
        "OS"
      ],
      "slug": "quadratini-chocolate-bite-size-wafer-cookies-125-gms-7500518",
      "tags": [],
      "uid": 7500518,
      "item_code": "COOKIES048",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "H&M (Hennes & Mauritz)",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/addsale/brands/pictures/square-logo/original/QDbYsWm5D-Logo.webp"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "h-m-hennes-mauritz"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "quadratini-chocolate-bite-size-wafer-cookies-125-gms-7500518"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/h-m-hennes-mauritz/COOKIES048/0/tvMT-gW7Ny-61834q2fz2L.jpg",
          "alt": "Quadratini Chocolate Bite Size Wafer Cookies,125 GMS"
        }
      ],
      "identifiers": [
        "COOKIES48",
        "COOKIES048"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 199,
          "max": 199,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 199,
          "max": 199,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Quadratini Chocolate Bite Size Wafer Cookies,125 GMS",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    },
    {
      "type": "product",
      "attributes": {
        "primary_color_hex": null
      },
      "categories": [
        {
          "id": 9,
          "uid": 9,
          "name": "Krystel441740523020241757150",
          "logo": {
            "type": "image",
            "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/media/banner_portrait/brand/original/540_ecba3a1af141467da8abc20500f983db.jpg"
          },
          "action": "<coroutine object Category.action_url at 0x7fe257140d40>",
          "_custom_json": {}
        }
      ],
      "_custom_meta": [],
      "sellable": true,
      "name": "Assorted Cookies, Brown Butter (Pack Of 10), 750 Gram",
      "sizes": [
        "OS"
      ],
      "slug": "assorted-cookies-brown-butter-pack-of-10-750-gram-7500476",
      "tags": [],
      "uid": 7500476,
      "item_code": "COOKIES001",
      "item_type": "standard",
      "brand": {
        "type": "brand",
        "name": "Allen Solly",
        "logo": {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/brands/pictures/square-logo/original/qYk-zhgWQ-Logo.png"
        },
        "action": {
          "page": {
            "type": "products",
            "query": {
              "brand": [
                "allen-solly"
              ]
            }
          },
          "type": "page"
        },
        "_custom_json": {}
      },
      "action": {
        "page": {
          "type": "product",
          "params": {
            "slug": [
              "assorted-cookies-brown-butter-pack-of-10-750-gram-7500476"
            ]
          }
        },
        "type": "page"
      },
      "medias": [
        {
          "type": "image",
          "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/rajatjain/products/pictures/item/free/original/allen-solly/COOKIES001/0/K7rLeuNZjn-81EgwRfgLiL.jpg",
          "alt": "Assorted Cookies, Brown Butter (Pack Of 10), 750 Gram"
        }
      ],
      "identifiers": [
        "COOKIES01",
        "COOKIES001"
      ],
      "discount": "",
      "price": {
        "marked": {
          "min": 255,
          "max": 255,
          "currency_code": "INR",
          "currency_symbol": "₹"
        },
        "effective": {
          "min": 255,
          "max": 255,
          "currency_code": "INR",
          "currency_symbol": "₹"
        }
      },
      "is_tryout": false,
      "channel": "659b8f782d483329f0f3d201",
      "_custom_json": {},
      "moq": {
        "minimum": 1,
        "increment_unit": 1
      },
      "net_quantity": {
        "unit": "nos",
        "value": 1
      },
      "seo": {
        "title": "Assorted Cookies, Brown Butter (Pack Of 10), 750 Gram",
        "description": ""
      },
      "short_description": "",
      "country_of_origin": "India",
      "variants": []
    }
  ],
  "sort_on": [
    {
      "display": "Relevance",
      "name": "Relevance",
      "logo": "https://hdn-1.fynd.com/global/menu-icons/Relevance.svg",
      "value": "relevance",
      "is_selected": true
    },
    {
      "display": "Latest Products",
      "name": "Latest Products",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/QEvUfhsfyg-Latest-Products.png",
      "value": "latest",
      "is_selected": false
    },
    {
      "display": "Popularity",
      "name": "Popularity",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/iG82Qjay9X-Popularity.png",
      "value": "popular",
      "is_selected": false
    },
    {
      "display": "Price Low to High",
      "name": "Price Low to High",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/dLUtvNwoQt-Price-High-to-Low.png",
      "value": "price_asc",
      "is_selected": false
    },
    {
      "display": "Price High to Low",
      "name": "Price High to Low",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/dLUtvNwoQt-Price-High-to-Low.png",
      "value": "price_dsc",
      "is_selected": false
    },
    {
      "display": "Discount Low to High",
      "name": "Discount Low to High",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/9VdjDVc_aR-Discount-Low-to-High.png",
      "value": "discount_asc",
      "is_selected": false
    },
    {
      "display": "Discount High to Low",
      "name": "Discount High to Low",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/9VdjDVc_aR-Discount-Low-to-High.png",
      "value": "discount_dsc",
      "is_selected": false
    },
    {
      "display": "Rating",
      "name": "Rating",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/IyaIm4EZXI-Rating.png",
      "value": "rating_dsc",
      "is_selected": false
    },
    {
      "display": "Size Depth (High to Low)",
      "name": "Size Depth (High to Low)",
      "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/sandbx/wrkr/products/pictures/attribute/logo/original/hyWWrNJ1A--Size-Depth.png",
      "value": "depth_desc",
      "is_selected": false
    }
  ],
  "page": {
    "type": "cursor",
    "next_id": "AoMIQCqRBQVAiVGGwAAAAD8HNzUwMDQ3NiE2NTliOGY3ODJkNDgzMzI5ZjBmM2QyMDEhX2FsbF8=",
    "has_previous": true,
    "has_next": true,
    "item_total": 74
  }
}
```
</details>









---


### createAppPriceFactory
Create price factory




```java
platformClient.application("<APPLICATION_ID>").catalog.createAppPriceFactory(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |  
| body | [CreateAppPriceFactoryRequest](#CreateAppPriceFactoryRequest) | yes | Request body |


This API allows to create price factory.

*Returned Response:*




[CreateAppPriceFactoryResponse](#CreateAppPriceFactoryResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "507f1f77bcf86cd799439011",
  "type": "pricezone",
  "factory_type_id": [
    "507f1f77bcf86cd799439011"
  ],
  "code": "pricezone",
  "name": "pricezone",
  "is_active": true,
  "departments": [
    123,
    24
  ]
}
```
</details>









---


### getAppPriceFactories
Get price factory




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppPriceFactories( isActive,  factoryTypeId,  code,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| isActive | Boolean? | no | gets price factory filtered by active status. |   
| factoryTypeId | String? | no | gets price factory filtered by factory_type_id. |   
| code | String? | no | gets price factory filtered by pricezone code. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This API allows to get price factories.

*Returned Response:*




[GetAppPriceFactoryResponse](#GetAppPriceFactoryResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "application_id": "507f1f77bcf86cd799439011",
      "department_ids": [
        123,
        124
      ],
      "factory_type": "pricezone",
      "factory_type_ids": [
        "507f1f77bcf86cd799439011"
      ],
      "code": "pricezone",
      "name": "pricezone",
      "is_active": true,
      "created_by": {
        "user_id": "507f1f77bcf86cd799439011",
        "username": "testuser"
      },
      "modified_by": {
        "user_id": "507f1f77bcf86cd799439011",
        "username": "testuser"
      },
      "created_on": "2021-09-23T12:00:00.000000Z",
      "modified_on": "2021-09-23T12:00:00.000000Z",
      "id": "507f1f77bcf86cd799439011"
    }
  ]
}
```
</details>









---


### getAppPriceFactory
Get price factory




```java
platformClient.application("<APPLICATION_ID>").catalog.getAppPriceFactory( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |  



This API allows to get price factory.

*Returned Response:*




[AppPriceFactory](#AppPriceFactory)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "application_id": "507f1f77bcf86cd799439011",
  "department_ids": [
    "fashion"
  ],
  "factory_type": "pricezone",
  "factory_type_ids": [
    "507f1f77bcf86cd799439011"
  ],
  "code": "pricezone",
  "name": "pricezone",
  "is_active": true,
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "id": "507f1f77bcf86cd799439011"
}
```
</details>









---


### editAppPriceFactory





```java
platformClient.application("<APPLICATION_ID>").catalog.editAppPriceFactory( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |  
| body | [EditAppPriceFactoryRequest](#EditAppPriceFactoryRequest) | yes | Request body |


This API allows to update price factory.

*Returned Response:*




[AppPriceFactory](#AppPriceFactory)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "application_id": "507f1f77bcf86cd799439011",
  "department_ids": [
    "fashion"
  ],
  "factory_type": "pricezone",
  "factory_type_ids": [
    "507f1f77bcf86cd799439011"
  ],
  "code": "pricezone",
  "name": "pricezone",
  "is_active": true,
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "id": "507f1f77bcf86cd799439011"
}
```
</details>









---


### addProductsInPriceFactoryByZoneId





```java
platformClient.application("<APPLICATION_ID>").catalog.addProductsInPriceFactoryByZoneId( id,  zoneId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |   
| zoneId | String | yes | An `zone_id` is a unique identifier for a particular price factory zone. |  
| body | [CreateAppPriceFactoryProductRequest](#CreateAppPriceFactoryProductRequest) | yes | Request body |


This API allows to add  products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductsResponse](#CreateAppPriceFactoryProductsResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "item_id": 1234,
      "name": "Test-01",
      "item_code": "TEST-01",
      "brand": "Test Brand",
      "category": "Abayas",
      "factory_type_id": [
        "507f1f77bcf86cd799439011"
      ],
      "media": [
        {
          "type": "image",
          "url": "/x0/products/pictures/item/free/original/Hsw-U3Kut-Test-01.jpeg"
        }
      ],
      "sizes": [
        {
          "seller-identifier": "qwert123",
          "size_name": "XL",
          "marked_price": 1500,
          "selling_price": 1400,
          "currency": "INR",
          "is_active": true
        }
      ],
      "company_sizes": [
        {
          "seller-identifier": "qwert123",
          "size_name": "XL",
          "marked_price": 1200,
          "selling_price": 1100,
          "currency": "INR"
        }
      ]
    }
  ]
}
```
</details>









---


### getProductsInPriceFactoryByZoneId





```java
platformClient.application("<APPLICATION_ID>").catalog.getProductsInPriceFactoryByZoneId( id,  zoneId,  itemId,  sellerIdentifier,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |   
| zoneId | String | yes | An `zone_id` is a unique identifier for a particular price factory zone. |   
| itemId | Boolean? | no | gets price factory filtered by item_id. |   
| sellerIdentifier | String? | no | gets price factory filtered by seller_identifier. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results. |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 12. |  



This API allows to get products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductsResponse](#CreateAppPriceFactoryProductsResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "item_id": 1234,
      "name": "Test-01",
      "item_code": "TEST-01",
      "brand": "Test Brand",
      "category": "Abayas",
      "factory_type_id": [
        "507f1f77bcf86cd799439011"
      ],
      "media": [
        {
          "type": "image",
          "url": "/x0/products/pictures/item/free/original/Hsw-U3Kut-Test-01.jpeg"
        }
      ],
      "sizes": [
        {
          "seller-identifier": "qwert123",
          "size_name": "XL",
          "marked_price": 1500,
          "selling_price": 1400,
          "currency": "INR",
          "is_active": true
        }
      ],
      "company_sizes": [
        {
          "seller-identifier": "qwert123",
          "size_name": "XL",
          "marked_price": 1200,
          "selling_price": 1100,
          "currency": "INR"
        }
      ]
    }
  ]
}
```
</details>









---


### updateProductPriceByZoneInPriceFactory





```java
platformClient.application("<APPLICATION_ID>").catalog.updateProductPriceByZoneInPriceFactory( id,  itemId,  zoneId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | A `id` is a unique identifier for a particular price factory. |   
| itemId | Integer | yes | A `item_id` is a unique identifier for a particular product. |   
| zoneId | String | yes | A `zone_id` is a unique identifier for a particular zone. |  
| body | [UpdateAppPriceFactoryProductRequest](#UpdateAppPriceFactoryProductRequest) | yes | Request body |


This API allows to partially update products in price factory.

*Returned Response:*




[UpdateAppPriceFactoryProductResponse](#UpdateAppPriceFactoryProductResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "item_id": 1234,
  "zone_id": "507f1f77bcf86cd799439011",
  "media": [
    {
      "type": "image",
      "url": "/x0/products/pictures/item/free/original/Hsw-U3Kut-Test-01.jpeg"
    }
  ],
  "sizes": [
    {
      "seller-identifier": "qwert123",
      "size_name": "XL",
      "marked_price": 1500,
      "selling_price": 1400,
      "currency": "INR",
      "is_active": true
    }
  ],
  "company_sizes": [
    {
      "seller-identifier": "qwert123",
      "size_name": "XL",
      "marked_price": 1200,
      "selling_price": 1100,
      "currency": "INR"
    }
  ]
}
```
</details>









---


### createProductPriceFactoryBulkJob





```java
platformClient.application("<APPLICATION_ID>").catalog.createProductPriceFactoryBulkJob( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |  
| body | [CreateAppPriceFactoryProductBulkJobRequest](#CreateAppPriceFactoryProductBulkJobRequest) | yes | Request body |


This API allows to create bulk job for adding products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductBulkJobResponse](#CreateAppPriceFactoryProductBulkJobResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_id": "507f1f77bcf86cd799439011",
  "status": "pending",
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  }
}
```
</details>









---


### pollProductPriceFactoryBulkJob





```java
platformClient.application("<APPLICATION_ID>").catalog.pollProductPriceFactoryBulkJob( id,  jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |   
| jobId | String | yes | A `job_id` is a unique identifier for a particular bulk job. |  



This API allows to poll bulk job for adding products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductBulkJobPollResponse](#CreateAppPriceFactoryProductBulkJobPollResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "pending",
  "total_records": 100,
  "success_records": 50,
  "failed_records": 50,
  "error_file": "https://s3.amazonaws.com/bucket_name/file_name",
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  }
}
```
</details>









---


### validateProductPriceFactoryBulkJob





```java
platformClient.application("<APPLICATION_ID>").catalog.validateProductPriceFactoryBulkJob( id,  jobId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |   
| jobId | String | yes | A `job_id` is a unique identifier for a particular bulk job. |  
| body | [CreateAppPriceFactoryProductBulkJobRequest](#CreateAppPriceFactoryProductBulkJobRequest) | yes | Request body |


This API allows to validate bulk job for adding products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductBulkJobResponse](#CreateAppPriceFactoryProductBulkJobResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_id": "507f1f77bcf86cd799439011",
  "status": "validating",
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  }
}
```
</details>









---


### processProductPriceFactoryBulkJob





```java
platformClient.application("<APPLICATION_ID>").catalog.processProductPriceFactoryBulkJob( id,  jobId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a particular company. |   
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| id | String | yes | An `id` is a unique identifier for a particular price factory. |   
| jobId | String | yes | A `job_id` is a unique identifier for a particular bulk job. |  
| body | [CreateAppPriceFactoryProductBulkJobRequest](#CreateAppPriceFactoryProductBulkJobRequest) | yes | Request body |


This API allows to process bulk job for adding products in price factory.

*Returned Response:*




[CreateAppPriceFactoryProductBulkJobResponse](#CreateAppPriceFactoryProductBulkJobResponse)

Success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_id": "507f1f77bcf86cd799439011",
  "status": "processing",
  "created_on": "2021-09-23T12:00:00.000000Z",
  "modified_on": "2021-09-23T12:00:00.000000Z",
  "created_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  },
  "modified_by": {
    "user_id": "507f1f77bcf86cd799439011",
    "username": "testuser"
  }
}
```
</details>









---




### Schemas

 
 
 #### [SearchRequest](#SearchRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean? |  yes  |  |
 | q | String? |  yes  |  |
 | pageNo | Integer? |  yes  |  |
 | pageSize | Integer? |  yes  |  |

---


 
 
 #### [MerchandisingRuleQuery](#MerchandisingRuleQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | condition | String? |  yes  |  |
 | searchQuery | String? |  yes  |  |
 | synonyms | String? |  yes  |  |

---


 
 
 #### [MerchandisingRulesList](#MerchandisingRulesList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ruleId | String? |  yes  |  |
 | query | [MerchandisingRuleQuery](#MerchandisingRuleQuery)? |  yes  |  |
 | actions | ArrayList<String>? |  yes  |  |
 | zones | ArrayList<String>? |  yes  |  |

---


 
 
 #### [SuccessResponseMerchandising](#SuccessResponseMerchandising)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [MerchandiseQueryResponse](#MerchandiseQueryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | merchandisingRuleId | String? |  yes  |  |

---


 
 
 #### [MerchandisingRuleQueryPost](#MerchandisingRuleQueryPost)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | queryCondition | String? |  yes  |  |
 | query | [MerchandisingRuleQuery](#MerchandisingRuleQuery)? |  yes  |  |
 | actions | ArrayList<String>? |  yes  |  |
 | zones | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PinItem](#PinItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | position | Integer? |  yes  |  |

---


 
 
 #### [PinItemRequest](#PinItemRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | String? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | position | Integer? |  yes  |  |

---


 
 
 #### [PinRequest](#PinRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | actionValue | ArrayList<[PinItemRequest](#PinItemRequest)>? |  yes  |  |

---


 
 
 #### [PinResponse](#PinResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[PinItem](#PinItem)>? |  yes  |  |

---


 
 
 #### [HideAttribute](#HideAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [HideAttributeRequest](#HideAttributeRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | String? |  yes  |  |
 | itemId | Integer? |  yes  |  |

---


 
 
 #### [HideResponse](#HideResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[HideAttribute](#HideAttribute)>? |  yes  |  |

---


 
 
 #### [HideRequest](#HideRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[HideAttributeRequest](#HideAttributeRequest)>? |  yes  |  |

---


 
 
 #### [BoostAttribute](#BoostAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attribute | String? |  yes  |  |
 | value | String? |  yes  |  |
 | strength | Integer? |  yes  |  |

---


 
 
 #### [GetMerchandisingRuleBoostAction](#GetMerchandisingRuleBoostAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[BoostAttribute](#BoostAttribute)>? |  yes  |  |

---


 
 
 #### [GetMerchandisingRuleBuryAction](#GetMerchandisingRuleBuryAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[BoostAttribute](#BoostAttribute)>? |  yes  |  |

---


 
 
 #### [Action](#Action)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ActionPage](#ActionPage)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ActionProperties](#ActionProperties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | collection | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ActionPage](#ActionPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | [ActionProperties](#ActionProperties)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [AllSizes](#AllSizes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | ArrayList<[ValidateIdentifier](#ValidateIdentifier)>? |  yes  |  |
 | itemDimensionsUnitOfMeasure | String |  no  |  |
 | itemHeight | Double |  no  |  |
 | itemLength | Double |  no  |  |
 | itemWeight | Double |  no  |  |
 | itemWeightUnitOfMeasure | String |  no  |  |
 | itemWidth | Double |  no  |  |
 | size | String |  no  |  |

---


 
 
 #### [AllowSingleRequest](#AllowSingleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowSingle | Boolean |  no  |  |

---


 
 
 #### [AppCatalogConfiguration](#AppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |
 | configId | String? |  yes  |  |
 | configType | String |  no  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the configuration. |
 | createdOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | listing | [ConfigurationListing](#ConfigurationListing)? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who modified the configuration. |
 | modifiedOn | String? |  yes  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [AppCategoryReturnConfig](#AppCategoryReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | categoryId | Integer |  no  | Unique identifier for L3 category |
 | returnConfig | [ProductReturnConfigBaseSerializer](#ProductReturnConfigBaseSerializer) |  no  | Return configuration details |

---


 
 
 #### [AppCategoryReturnConfigResponse](#AppCategoryReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  | Channel identifier |
 | categoryId | Integer? |  yes  | Unique identifer of L3 category |
 | logo | String? |  yes  |  |
 | name | String? |  yes  | Name of L3 category |
 | returnConfig | [ProductReturnConfigBaseSerializer](#ProductReturnConfigBaseSerializer)? |  yes  |  |

---


 
 
 #### [AppConfiguration](#AppConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |
 | configId | String? |  yes  |  |
 | configType | String |  no  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | listing | [ConfigurationListing](#ConfigurationListing)? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | product | [ConfigurationProduct](#ConfigurationProduct)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [AppConfigurationCreateDetail](#AppConfigurationCreateDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |
 | attributes | ArrayList<[AttributeDetailsGroup](#AttributeDetailsGroup)>? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | isDefault | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |
 | slug | String |  no  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |

---


 
 
 #### [AppConfigurationDetail](#AppConfigurationDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | attributes | ArrayList<[AttributeDetailsGroup](#AttributeDetailsGroup)>? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | isDefault | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |
 | slug | String |  no  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |

---


 
 
 #### [AppConfigurationsResponse](#AppConfigurationsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | defaultKey | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [AppConfigurationsSort](#AppConfigurationsSort)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |
 | defaultKey | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | isDefault | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |

---


 
 
 #### [ValueConfigType](#ValueConfigType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bucketPoints | ArrayList<Object>? |  yes  |  |
 | map | HashMap<String,Object>? |  yes  |  |
 | sort | String? |  yes  |  |
 | condition | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [AppConfigurationsFilter](#AppConfigurationsFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |
 | allowSingle | Boolean? |  yes  |  |
 | attributeName | String? |  yes  |  |
 | valueConfig | [ValueConfigType](#ValueConfigType)? |  yes  |  |
 | type | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | isDefault | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |

---


 
 
 #### [AppConfigurationsFilterResponse](#AppConfigurationsFilterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | allowSingle | Boolean? |  yes  |  |
 | attributeName | String? |  yes  |  |
 | valueConfig | [ValueConfigType](#ValueConfigType)? |  yes  |  |
 | type | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [ApplicationBrandJson](#ApplicationBrandJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ApplicationCategoryJson](#ApplicationCategoryJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ApplicationDepartment](#ApplicationDepartment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | appId | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [ApplicationDepartmentJson](#ApplicationDepartmentJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ApplicationDepartmentListingResponse](#ApplicationDepartmentListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ApplicationDepartment](#ApplicationDepartment)>? |  yes  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [ApplicationItemMOQ](#ApplicationItemMOQ)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | incrementUnit | Integer? |  yes  | The minimum quantity increment in which the item can be purchased. |
 | maximum | Integer? |  yes  | The maximum quantity allowed for purchase. |
 | minimum | Integer? |  yes  | The minimum quantity required for purchase. |

---


 
 
 #### [ApplicationItemMeta](#ApplicationItemMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  | Custom JSON data for the item |
 | customMeta | ArrayList<[MetaFields](#MetaFields)>? |  yes  | Custom meta fields for the item |
 | altText | HashMap<String,Object>? |  yes  | Alternative text for the item's images |
 | isCod | Boolean? |  yes  | Whether the item is available for Cash on Delivery (COD) or not |
 | isGift | Boolean? |  yes  | Whether the item is a gift or not |
 | moq | [ApplicationItemMOQ](#ApplicationItemMOQ)? |  yes  | Minimum Order Quantity information for the item |
 | seo | [ApplicationItemSEO](#ApplicationItemSEO)? |  yes  | Search Engine Optimization information for the item |
 | sizePromotionThreshold | [SizePromotionThreshold](#SizePromotionThreshold)? |  yes  | Size level promotion limitation information for item |

---


 
 
 #### [ApplicationItemSEO](#ApplicationItemSEO)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  | The SEO description of the item |
 | title | String? |  yes  | The SEO title of the item |

---


 
 
 #### [ApplicationProductListingResponse](#ApplicationProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)>? |  yes  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)>? |  yes  |  |
 | operators | [OperatorsResponse](#OperatorsResponse)? |  yes  |  |
 | page | [Page](#Page) |  no  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)>? |  yes  |  |

---


 
 
 #### [OperatorsResponse](#OperatorsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | btw | String? |  yes  |  |
 | lte | String? |  yes  |  |
 | gte | String? |  yes  |  |
 | gt | String? |  yes  |  |
 | lt | String? |  yes  |  |
 | nin | String? |  yes  |  |

---


 
 
 #### [ApplicationStoreJson](#ApplicationStoreJson)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object> |  no  |  |

---


 
 
 #### [AppReturnConfigResponse](#AppReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | appId | String? |  yes  | Channel identifier |
 | categoryCount | Integer? |  yes  | Count of L3 category return config set for application |
 | companyId | Integer? |  yes  | Unique identifer of company |
 | modifiedOn | String? |  yes  | Modification date |
 | returnConfigLevel | String? |  yes  | configuration level of return window category\|product\|no-return |

---


 
 
 #### [ArticleAssignment](#ArticleAssignment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | level | String? |  yes  |  |
 | strategy | String? |  yes  |  |

---


 
 
 #### [ArticleAssignment1](#ArticleAssignment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | level | String? |  yes  |  |
 | strategy | String? |  yes  |  |

---


 
 
 #### [ArticleQuery](#ArticleQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ignoredStores | ArrayList<Integer>? |  yes  |  |
 | itemId | Integer |  no  |  |
 | size | String |  no  |  |

---


 
 
 #### [ArticleStoreResponse](#ArticleStoreResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | storeType | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [AssignStore](#AssignStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  |  |
 | articles | ArrayList<[AssignStoreArticle](#AssignStoreArticle)> |  no  |  |
 | channelIdentifier | String? |  yes  |  |
 | channelType | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | pincode | String |  no  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [AssignStoreArticle](#AssignStoreArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articleAssignment | [ArticleAssignment](#ArticleAssignment)? |  yes  |  |
 | groupId | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | query | [ArticleQuery](#ArticleQuery)? |  yes  |  |

---


 
 
 #### [AttributeDetailsGroup](#AttributeDetailsGroup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | key | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | name | String |  no  |  |
 | priority | Integer |  no  |  |
 | slug | String? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [AttributeMaster](#AttributeMaster)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowedValues | ArrayList<String>? |  yes  |  |
 | format | String? |  yes  |  |
 | mandatory | Boolean? |  yes  |  |
 | multi | Boolean? |  yes  |  |
 | range | [AttributeSchemaRange](#AttributeSchemaRange)? |  yes  |  |
 | type | String |  no  |  |

---


 
 
 #### [AttributeMasterDetails](#AttributeMasterDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | String |  no  |  |

---


 
 
 #### [AttributeMasterFilter](#AttributeMasterFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dependsOn | ArrayList<String>? |  yes  |  |
 | indexing | Boolean |  no  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3Keys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [AttributeMasterMeta](#AttributeMasterMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enriched | Boolean? |  yes  |  |
 | mandatoryDetails | [AttributeMasterMandatoryDetails](#AttributeMasterMandatoryDetails) |  no  |  |

---


 
 
 #### [AttributeMasterSerializer](#AttributeMasterSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | departments | ArrayList<String> |  no  |  |
 | description | String? |  yes  |  |
 | details | [AttributeMasterDetails](#AttributeMasterDetails) |  no  |  |
 | enabledForEndConsumer | Boolean? |  yes  |  |
 | filters | [AttributeMasterFilter](#AttributeMasterFilter) |  no  |  |
 | isNested | Boolean? |  yes  |  |
 | logo | String? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | rawKey | String? |  yes  |  |
 | schema | [AttributeMaster](#AttributeMaster) |  no  |  |
 | slug | String |  no  |  |
 | suggestion | String? |  yes  |  |
 | synonyms | HashMap<String,Object>? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | unit | String? |  yes  |  |
 | variant | Boolean? |  yes  |  |

---


 
 
 #### [AttributeSchemaRange](#AttributeSchemaRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer? |  yes  |  |
 | min | Integer? |  yes  |  |

---


 
 
 #### [AutoCompleteMedia](#AutoCompleteMedia)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [AutocompleteAction](#AutocompleteAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [AutocompletePageAction](#AutocompletePageAction)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [AutocompletePageAction](#AutocompletePageAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | params | HashMap<String,Object>? |  yes  |  |
 | query | HashMap<String,Object>? |  yes  |  |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [AutocompleteResult](#AutocompleteResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | [AutocompleteAction](#AutocompleteAction)? |  yes  |  |
 | display | String? |  yes  |  |
 | logo | [AutoCompleteMedia](#AutoCompleteMedia)? |  yes  |  |

---


 
 
 #### [BannerImage](#BannerImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [BaseAppCategoryReturnConfig](#BaseAppCategoryReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  | Channel identifier |
 | companyId | Integer |  no  | Unique identifer of company |
 | data | ArrayList<[AppCategoryReturnConfig](#AppCategoryReturnConfig)> |  no  | Category level return config details |

---


 
 
 #### [BaseAppCategoryReturnConfigResponse](#BaseAppCategoryReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[AppCategoryReturnConfigResponse](#AppCategoryReturnConfigResponse)>? |  yes  |  |
 | page | [PageResponse1](#PageResponse1)? |  yes  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Logo](#Logo)? |  yes  |  |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [BrandLogo](#BrandLogo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [BrandItem](#BrandItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [Action](#Action)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | discount | String? |  yes  |  |
 | logo | [BrandLogo](#BrandLogo)? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [BrandListingResponse](#BrandListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BrandItem](#BrandItem)>? |  yes  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [BrandMeta](#BrandMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [BrandMeta1](#BrandMeta1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [BulkAssetResponse](#BulkAssetResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Items](#Items)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [BulkHsnDataResponse](#BulkHsnDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | Flag indicating the success status of the bulk HSN operation. |

---


 
 
 #### [BulkHsnResponse](#BulkHsnResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [BulkHsnDataResponse](#BulkHsnDataResponse)? |  yes  |  |

---


 
 
 #### [BulkHsnUpsert](#BulkHsnUpsert)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[HsnUpsert](#HsnUpsert)> |  no  |  |

---


 
 
 #### [BulkInventoryGet](#BulkInventoryGet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkInventoryGetItems](#BulkInventoryGetItems)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [BulkInventoryGetItems](#BulkInventoryGetItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancelled | Integer? |  yes  |  |
 | cancelledRecords | ArrayList<String>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | failed | Integer? |  yes  |  |
 | failedRecords | ArrayList<String>? |  yes  |  |
 | filePath | String? |  yes  |  |
 | id | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | succeed | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |

---


 
 
 #### [BulkProductUploadJob](#BulkProductUploadJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  | The ID of the company |
 | total | Integer? |  yes  | Total records to be imported |
 | succeed | Integer? |  yes  | Successfully imported records |
 | stage | String? |  yes  | The import stage |
 | filePath | String? |  yes  |  |
 | templateTag | String? |  yes  | Template tag for the import |
 | trackingUrl | String? |  yes  |  |

---


 
 
 #### [BulkProductJob](#BulkProductJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | String? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | productType | String? |  yes  |  |
 | department | String? |  yes  |  |
 | filePath | String? |  yes  |  |

---


 
 
 #### [BulkJob](#BulkJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancelled | Integer? |  yes  |  |
 | cancelledRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | companyId | Integer |  no  |  |
 | createdBy | [UserInfo1](#UserInfo1)? |  yes  | The user who created the item. |
 | createdOn | String |  no  | The date and time when the item was created. |
 | customTemplateTag | String? |  yes  |  |
 | failed | Integer? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | filePath | String? |  yes  |  |
 | isActive | Boolean? |  yes  | Whether the item is active or not. |
 | modifiedBy | String? |  yes  | The user who last modified the item. |
 | modifiedOn | String? |  yes  | The date and time when the item was last modified. |
 | stage | String? |  yes  |  |
 | succeed | Integer? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | total | Integer? |  yes  |  |
 | trackingUrl | String? |  yes  |  |

---


 
 
 #### [BulkProductRequest](#BulkProductRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | companyId | Integer |  no  |  |
 | data | ArrayList<HashMap<String,Object>> |  no  |  |
 | templateTag | String |  no  |  |

---


 
 
 #### [BulkResponse](#BulkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | createdBy | [UserInfo1](#UserInfo1)? |  yes  | The user who created the item. |
 | createdOn | String |  no  | The date and time when the item was created. |
 | isActive | Boolean? |  yes  | Whether the item is active or not. |
 | modifiedBy | String? |  yes  | The user who last modified the item. |
 | modifiedOn | String? |  yes  | The date and time when the item was last modified. |

---


 
 
 #### [CatalogInsightBrand](#CatalogInsightBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articleFreshness | Integer? |  yes  |  |
 | availableArticles | Integer? |  yes  |  |
 | availableSizes | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | totalArticles | Integer? |  yes  |  |
 | totalSizes | Integer? |  yes  |  |

---


 
 
 #### [CatalogInsightItem](#CatalogInsightItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer? |  yes  |  |
 | outOfStockCount | Integer? |  yes  |  |
 | sellableCount | Integer? |  yes  |  |

---


 
 
 #### [CatalogInsightResponse](#CatalogInsightResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandDistribution | [CatalogInsightBrand](#CatalogInsightBrand)? |  yes  |  |
 | item | [CatalogInsightItem](#CatalogInsightItem)? |  yes  |  |

---


 
 
 #### [CategoriesResponse](#CategoriesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | slugKey | String? |  yes  |  |
 | templateSlug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [Category](#Category)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  | It is the details of the user who created the category. |
 | createdOn | String? |  yes  | It is Date and time when the category was created. |
 | departments | ArrayList<Integer> |  no  | It is the list of unique department the category belongs to. |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)>? |  yes  | It is the list of category hierarchies for each department of an L3 category. |
 | id | String? |  yes  | It is the unique identifier of the category. |
 | isActive | Boolean |  no  | It is the flag indicating if the category is active. |
 | level | Integer |  no  | It is the level of category |
 | marketplaces | [CategoryMapping](#CategoryMapping)? |  yes  | It is the mapping of the category in different marketplaces. |
 | media | [Media1](#Media1)? |  yes  | It is the details of the media such as banner and logo.. |
 | modifiedBy | HashMap<String,Object>? |  yes  | It is the details of the user who last modified the category. |
 | modifiedOn | String? |  yes  | It is the date and time when the category was last modified. |
 | name | String |  no  | It is the name of the category |
 | priority | Integer? |  yes  | It is the priority of the category. |
 | slug | String? |  yes  | It is the slug of the category. |
 | synonyms | ArrayList<String>? |  yes  | It is the list of synonyms. |
 | tryouts | ArrayList<String>? |  yes  | It is the list of tryouts. |
 | uid | Integer? |  yes  | It is the unique identifier of the category. |

---


 
 
 #### [ChannelListResponse](#ChannelListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ChannelItem](#ChannelItem)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ChannelDetailResponse](#ChannelDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | validation | [ChannelValidation](#ChannelValidation)? |  yes  |  |
 | id | String? |  yes  |  |
 | description | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [ChannelItem](#ChannelItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | slug | String? |  yes  |  |
 | name | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | description | String? |  yes  |  |
 | validation | [ChannelValidation](#ChannelValidation)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [ChannelValidation](#ChannelValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product | [ProductValidation](#ProductValidation)? |  yes  |  |
 | brand | [BrandValidationItem](#BrandValidationItem)? |  yes  |  |
 | company | [CompanyValidation](#CompanyValidation)? |  yes  |  |
 | location | [LocationValidation](#LocationValidation)? |  yes  |  |

---


 
 
 #### [ProductValidation](#ProductValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gatedCategoryApplicable | Boolean? |  yes  |  |
 | imagelessProducts | Boolean? |  yes  |  |
 | stage | String? |  yes  |  |

---


 
 
 #### [BrandValidationItem](#BrandValidationItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String? |  yes  |  |
 | consentDocRequired | Boolean? |  yes  |  |

---


 
 
 #### [CompanyValidation](#CompanyValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bankAcRequired | Boolean? |  yes  |  |
 | gstRequired | Boolean? |  yes  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [LocationValidation](#LocationValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstRequired | Boolean? |  yes  |  |
 | stage | String? |  yes  |  |

---


 
 
 #### [CategoryCreateResponse](#CategoryCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | It is the message of the response from the category. |
 | uid | Integer? |  yes  | It is the unique identifier of the category. |

---


 
 
 #### [CategoryItems](#CategoryItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [Action](#Action)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | childs | ArrayList<[Child](#Child)>? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [CategoryListingResponse](#CategoryListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DepartmentCategoryTree](#DepartmentCategoryTree)>? |  yes  |  |
 | departments | ArrayList<[DepartmentIdentifier](#DepartmentIdentifier)>? |  yes  |  |

---


 
 
 #### [CategoryMapping](#CategoryMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ajio | [CategoryMappingValues](#CategoryMappingValues)? |  yes  | It is the category id mapping for ajio platform. |
 | facebook | [CategoryMappingValues](#CategoryMappingValues)? |  yes  | It is the category id mapping for facebook platform. |
 | google | [CategoryMappingValues](#CategoryMappingValues)? |  yes  | It is the category id mapping for google platform. |

---


 
 
 #### [CategoryMappingValues](#CategoryMappingValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | catalogId | Integer? |  yes  | It is the category id mapping of the respective platform with Fynd Platform. |
 | name | String |  no  | It is the name of the Category in the respective platform. |

---


 
 
 #### [CategoryRequestBody](#CategoryRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departments | ArrayList<Integer> |  no  | It is the list of unique department the category belongs to. |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)>? |  yes  | It is the list of category hierarchies for each department of an L3 category. |
 | isActive | Boolean |  no  | It is the flag indicating if the category is active. |
 | level | Integer |  no  | It is the level of category |
 | marketplaces | [CategoryMapping](#CategoryMapping)? |  yes  | It is the mapping of the category in different marketplaces. |
 | media | [Media1](#Media1)? |  yes  | It is the details of the media such as banner and logo.. |
 | name | String |  no  | It is the name of the category |
 | priority | Integer? |  yes  | It is the priority of the category. |
 | slug | String? |  yes  | It is the slug of the category. |
 | synonyms | ArrayList<String>? |  yes  | It is the list of synonyms. |
 | tryouts | ArrayList<String>? |  yes  | It is the list of tryouts. |

---


 
 
 #### [CategoryResponse](#CategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Category](#Category)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CategoryUpdateResponse](#CategoryUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | It is the message of the response from the category. |
 | success | Boolean? |  yes  | It is the flag indication the success response. |

---


 
 
 #### [Child](#Child)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | [Action](#Action)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | childs | ArrayList<[SecondLevelChild](#SecondLevelChild)>? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [CollectionBadge](#CollectionBadge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | color | String? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [CollectionBanner](#CollectionBanner)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [CollectionImage](#CollectionImage) |  no  |  |
 | portrait | [CollectionImage](#CollectionImage) |  no  |  |

---


 
 
 #### [CollectionBannerResponse](#CollectionBannerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [CollectionImageResponse](#CollectionImageResponse)? |  yes  |  |
 | portrait | [CollectionImageResponse](#CollectionImageResponse)? |  yes  |  |

---


 
 
 #### [BadgeDetail](#BadgeDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | color | String? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [CollectionCreateResponse](#CollectionCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | badge | [CollectionBadge](#CollectionBadge)? |  yes  |  |
 | banners | [CollectionBannerResponse](#CollectionBannerResponse)? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | logo | [CollectionImageResponse](#CollectionImageResponse)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | published | Boolean? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | seo | [SeoDetail](#SeoDetail)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | schedule | [CollectionSchedule](#CollectionSchedule)? |  yes  |  |
 | action | [Action](#Action)? |  yes  |  |
 | uid | String? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | appId | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | sortOn | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CollectionDetailResponse](#CollectionDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | schedule | HashMap<String,Object>? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | appId | String? |  yes  |  |
 | badge | HashMap<String,Object>? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | cron | HashMap<String,Object>? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | [Media](#Media)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | slug | String? |  yes  |  |
 | tag | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CollectionImage](#CollectionImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | url | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [CollectionImageResponse](#CollectionImageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [CollectionItem](#CollectionItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | String |  no  |  |
 | itemId | Integer |  no  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [CollectionItemUpdate](#CollectionItemUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | items | ArrayList<[CollectionItem](#CollectionItem)>? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | type | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CollectionListingFilter](#CollectionListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<[CollectionListingFilterTag](#CollectionListingFilterTag)>? |  yes  |  |
 | type | ArrayList<[CollectionListingFilterType](#CollectionListingFilterType)>? |  yes  |  |

---


 
 
 #### [CollectionListingFilterTag](#CollectionListingFilterTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | isSelected | Boolean? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [CollectionListingFilterType](#CollectionListingFilterType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | isSelected | Boolean? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [CollectionQuery](#CollectionQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attribute | String |  no  | The attribute of the collection query |
 | op | String |  no  | The operation to be performed on the attribute of the collection query |
 | value | ArrayList<String> |  no  | The value of the attribute of the collection query |

---


 
 
 #### [CollectionSchedule](#CollectionSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cron | String? |  yes  |  |
 | duration | Integer? |  yes  |  |
 | end | String? |  yes  |  |
 | nextSchedule | ArrayList<[NextSchedule](#NextSchedule)>? |  yes  |  |
 | start | String? |  yes  |  |

---


 
 
 #### [CompanyBrandDetail](#CompanyBrandDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandId | Integer? |  yes  |  |
 | brandName | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | totalArticle | Integer? |  yes  |  |
 | logo | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | id | Integer? |  yes  |  |

---


 
 
 #### [CompanyMeta](#CompanyMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer |  no  |  |

---


 
 
 #### [CompanyMeta1](#CompanyMeta1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |

---


 
 
 #### [CompanyOptIn](#CompanyOptIn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer> |  no  |  |
 | companyId | Integer |  no  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | Integer |  no  |  |
 | enabled | Boolean |  no  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | Integer |  no  |  |
 | optLevel | String |  no  |  |
 | platform | String |  no  |  |
 | storeIds | ArrayList<Integer> |  no  |  |

---


 
 
 #### [ConfigErrorResponse](#ConfigErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  |  |
 | message | String |  no  |  |

---


 
 
 #### [ConfigSuccessResponse](#ConfigSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |

---


 
 
 #### [ConfigurationBucketPoints](#ConfigurationBucketPoints)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | end | Double? |  yes  |  |
 | start | Double? |  yes  |  |

---


 
 
 #### [ConfigurationListing](#ConfigurationListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | [ConfigurationListingFilter](#ConfigurationListingFilter)? |  yes  |  |
 | sort | [ConfigurationListingSort](#ConfigurationListingSort)? |  yes  |  |

---


 
 
 #### [ConfigurationListingFilter](#ConfigurationListingFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowSingle | Boolean |  no  |  |
 | attributeConfig | ArrayList<[ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)>? |  yes  |  |

---


 
 
 #### [ConfigurationListingFilterConfig](#ConfigurationListingFilterConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |
 | type | String |  no  |  |
 | valueConfig | [ConfigurationListingFilterValue](#ConfigurationListingFilterValue)? |  yes  |  |

---


 
 
 #### [ConfigurationListingFilterValue](#ConfigurationListingFilterValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bucketPoints | ArrayList<[ConfigurationBucketPoints](#ConfigurationBucketPoints)>? |  yes  |  |
 | condition | String? |  yes  |  |
 | map | HashMap<String,Object>? |  yes  |  |
 | mapValues | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | priority | ArrayList<String>? |  yes  |  |
 | sort | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ConfigurationListingSort](#ConfigurationListingSort)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationListingSortConfig](#ConfigurationListingSortConfig)>? |  yes  |  |
 | defaultKey | String |  no  |  |

---


 
 
 #### [ConfigurationListingSortConfig](#ConfigurationListingSortConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer |  no  |  |

---


 
 
 #### [ConfigurationProduct](#ConfigurationProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | similar | [ConfigurationProductSimilar](#ConfigurationProductSimilar)? |  yes  |  |
 | variant | [ConfigurationProductVariant](#ConfigurationProductVariant)? |  yes  |  |
 | detailsGroups | [ConfigurationProductDetailsGroups](#ConfigurationProductDetailsGroups)? |  yes  |  |

---


 
 
 #### [ConfigurationProductDetailsGroups](#ConfigurationProductDetailsGroups)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductDetailsConfig](#ConfigurationProductDetailsConfig)>? |  yes  |  |

---


 
 
 #### [ConfigurationProductDetailsConfig](#ConfigurationProductDetailsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |
 | attributes | ArrayList<[ConfigurationProductDetailsAttribute](#ConfigurationProductDetailsAttribute)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [ConfigurationProductDetailsAttribute](#ConfigurationProductDetailsAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | displayType | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | key | String? |  yes  |  |

---


 
 
 #### [ConfigurationProductConfig](#ConfigurationProductConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | priority | Integer |  no  |  |
 | size | [ProductSize](#ProductSize)? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | title | String? |  yes  |  |

---


 
 
 #### [ConfigurationProductSimilar](#ConfigurationProductSimilar)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductConfig](#ConfigurationProductConfig)>? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariant](#ConfigurationProductVariant)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | ArrayList<[ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)>? |  yes  |  |

---


 
 
 #### [ConfigurationProductVariantConfig](#ConfigurationProductVariantConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | String |  no  |  |
 | isActive | Boolean |  no  |  |
 | key | String |  no  |  |
 | logo | String? |  yes  |  |
 | name | String |  no  |  |
 | priority | Integer |  no  |  |
 | size | [ProductSize](#ProductSize) |  no  |  |

---


 
 
 #### [CreateAutocompleteKeyword](#CreateAutocompleteKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | appId | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | results | ArrayList<[AutocompleteResult](#AutocompleteResult)>? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |
 | action | [AutocompleteAction](#AutocompleteAction)? |  yes  |  |

---


 
 
 #### [CreateAutocompleteWordsResponse](#CreateAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | results | ArrayList<[AutocompleteResult](#AutocompleteResult)>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | appId | String? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CreateCollection](#CreateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | schedule | [CollectionSchedule](#CollectionSchedule)? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | appId | String? |  yes  |  |
 | badge | [CollectionBadge](#CollectionBadge)? |  yes  |  |
 | banners | [CollectionBanner](#CollectionBanner) |  no  |  |
 | createdBy | [UserInfo](#UserInfo)? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | logo | [CollectionImage](#CollectionImage) |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | modifiedBy | [UserInfo](#UserInfo)? |  yes  |  |
 | name | String |  no  |  |
 | priority | Integer? |  yes  |  |
 | published | Boolean? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | seo | [SeoDetail](#SeoDetail)? |  yes  |  |
 | slug | String |  no  |  |
 | sortOn | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String |  no  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [RerankingBoostItems](#RerankingBoostItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | boost | ArrayList<[BoostItem](#BoostItem)>? |  yes  |  |

---


 
 
 #### [GetSearchRerankDetailResponse](#GetSearchRerankDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |
 | appId | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [BoostItem](#BoostItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributeKey | String? |  yes  |  |
 | attributeValue | String? |  yes  |  |

---


 
 
 #### [GetSearchRerankItemResponse](#GetSearchRerankItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |
 | appId | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  | The user who modified the search rerank. |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | The user who created the search rerank. |
 | isActive | Boolean? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [GetSearchRerankResponse](#GetSearchRerankResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetSearchRerankItemResponse](#GetSearchRerankItemResponse)>? |  yes  |  |
 | page | [PageResponse1](#PageResponse1)? |  yes  |  |

---


 
 
 #### [CreateSearchRerankResponse](#CreateSearchRerankResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String>? |  yes  |  |
 | appId | String? |  yes  |  |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | The user who created the search rerank. |
 | modifiedOn | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  | The user who modified the search rerank. |

---


 
 
 #### [UpdateSearchRerankResponse](#UpdateSearchRerankResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String>? |  yes  |  |
 | appId | String? |  yes  |  |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | The user who created the search rerank. |
 | modifiedOn | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  | The user who modified the search rerank. |

---


 
 
 #### [UpdateSearchRerankRequest](#UpdateSearchRerankRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |

---


 
 
 #### [CreateSearchRerankRequest](#CreateSearchRerankRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | words | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | applicationId | String? |  yes  |  |
 | ranking | [RerankingBoostItems](#RerankingBoostItems)? |  yes  |  |

---


 
 
 #### [CreateSearchConfigurationRequest](#CreateSearchConfigurationRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String |  no  | The application id where custom search configuration is set |
 | companyId | Integer |  no  | The company id where custom search configuration is set |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the search configuration. |
 | createdOn | String? |  yes  | The date and time when the search configuration was created. |
 | isProximityEnabled | Boolean? |  yes  | Flag indicating if proximity search is enabled for this attribute. |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who modified the search configuration. |
 | modifiedOn | String? |  yes  | The date and time when the search configuration was last modified. |
 | proximity | Integer? |  yes  | Proximity distance configuration |
 | searchableAttributes | ArrayList<[SearchableAttribute](#SearchableAttribute)>? |  yes  | The searchable attributes defined on the application. |

---


 
 
 #### [CreateSearchConfigurationResponse](#CreateSearchConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [CreateSearchKeyword](#CreateSearchKeyword)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | appId | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | result | [SearchKeywordResult](#SearchKeywordResult) |  no  |  |
 | words | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CreateUpdateAppReturnConfig](#CreateUpdateAppReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  | Channel identifier |
 | companyId | Integer |  no  | Unique identifer of company |
 | returnConfigLevel | String |  no  | Return configurtion Level category\|product\|no-return |

---


 
 
 #### [CrossSellingData](#CrossSellingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articles | Integer? |  yes  |  |
 | products | Integer? |  yes  |  |

---


 
 
 #### [CrossSellingResponse](#CrossSellingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articles | Integer? |  yes  |  |
 | products | Integer? |  yes  |  |

---


 
 
 #### [CustomOrder](#CustomOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isCustomOrder | Boolean? |  yes  |  |
 | manufacturingTime | Integer? |  yes  |  |
 | manufacturingTimeUnit | String? |  yes  |  |

---


 
 
 #### [DateMeta](#DateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addedOnStore | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | inventoryUpdatedOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [DefaultKeyRequest](#DefaultKeyRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | defaultKey | String |  no  |  |

---


 
 
 #### [DeleteAppCategoryReturnConfig](#DeleteAppCategoryReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String |  no  | Channel identifier |
 | categoryIds | ArrayList<Integer> |  no  | List of category_ids to be deleted. |
 | companyId | Integer |  no  | Unique identifer of company |

---


 
 
 #### [DeleteResponse](#DeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [DeleteSearchConfigurationResponse](#DeleteSearchConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DeleteSearchRerankConfigurationResponse](#DeleteSearchRerankConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [Department](#Department)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Media2](#Media2)? |  yes  |  |
 | name | String? |  yes  |  |
 | priorityOrder | Integer? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [DepartmentCategoryTree](#DepartmentCategoryTree)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | department | String? |  yes  |  |
 | items | ArrayList<[CategoryItems](#CategoryItems)>? |  yes  |  |

---


 
 
 #### [DepartmentCreateErrorResponse](#DepartmentCreateErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductBundleCreateErrorResponse](#ProductBundleCreateErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DepartmentCreateResponse](#DepartmentCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [DepartmentCreateUpdate](#DepartmentCreateUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cls | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | String |  no  |  |
 | name | String |  no  |  |
 | platforms | HashMap<String,Object>? |  yes  |  |
 | priorityOrder | Integer |  no  |  |
 | slug | String? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [DepartmentErrorResponse](#DepartmentErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  |  |
 | message | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | status | Integer? |  yes  |  |

---


 
 
 #### [DepartmentIdentifier](#DepartmentIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [DepartmentModel](#DepartmentModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cls | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | id | String? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  | User details of the creator of the document |
 | isActive | Boolean? |  yes  | Whether the department is currently active |
 | logo | String |  no  | The URL of the department's logo |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  | User details of the last modifier of the document |
 | name | String |  no  | The name of the department |
 | priorityOrder | Integer |  no  | The priority order of the department |
 | slug | String |  no  | The unique slug identifier for the department |
 | synonyms | ArrayList<String>? |  yes  | A list of synonyms for the department name |
 | uid | Integer |  no  | The unique ID for the department |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  | User details of the verifier of the document, if applicable |
 | verifiedOn | String? |  yes  | Timestamp of when the document was verified, if applicable |

---


 
 
 #### [DepartmentResponse](#DepartmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Department](#Department)>? |  yes  |  |

---


 
 
 #### [ValidationFailedResponse](#ValidationFailedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  | Response message for failed validation |

---


 
 
 #### [DepartmentsResponse](#DepartmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetDepartment](#GetDepartment)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [DimensionResponse](#DimensionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | height | Double |  no  | The height dimension. |
 | isDefault | Boolean |  no  | Indicates if it is the default dimension. |
 | length | Double |  no  | The length dimension. |
 | unit | String |  no  | The unit of dimension. |
 | width | Double |  no  | The width dimension. |

---


 
 
 #### [DimensionResponse1](#DimensionResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | height | Double? |  yes  |  |
 | length | Double? |  yes  |  |
 | unit | String? |  yes  |  |
 | width | Double? |  yes  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | legalName | String? |  yes  |  |
 | type | String |  no  |  |
 | url | String? |  yes  |  |
 | value | String |  no  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [EntityConfiguration](#EntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |
 | configId | String? |  yes  |  |
 | configType | String? |  yes  |  |
 | id | String? |  yes  |  |
 | listing | [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing)? |  yes  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct)? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | Double? |  yes  |  |
 | error | String? |  yes  |  |
 | message | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | status | Integer? |  yes  |  |

---


 
 
 #### [CategoryErrorResponse](#CategoryErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | error | HashMap<String,Object>? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [FilerList](#FilerList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [RawProduct](#RawProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | allCompanyIds | ArrayList<Integer>? |  yes  |  |
 | allIdentifiers | ArrayList<String>? |  yes  |  |
 | allSizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brand | [Brand](#Brand)? |  yes  |  |
 | brandUid | Integer? |  yes  |  |
 | category | HashMap<String,Object>? |  yes  |  |
 | categorySlug | String? |  yes  |  |
 | categoryUid | Integer? |  yes  |  |
 | color | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | currency | String? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | description | String? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | images | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | isPhysical | Boolean? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | l3Mapping | ArrayList<String>? |  yes  |  |
 | media | ArrayList<[Media](#Media)>? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | moq | HashMap<String,Object>? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | netQuantity | [NetQuantityResponse](#NetQuantityResponse)? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | pending | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | productPublish | [ProductPublished](#ProductPublished)? |  yes  |  |
 | returnConfig | [ReturnConfigResponse](#ReturnConfigResponse)? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | sizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | slug | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | taxIdentifier | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | trader | ArrayList<[Trader](#Trader)>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | variants | HashMap<String,Object>? |  yes  |  |
 | verifiedBy | [VerifiedBy](#VerifiedBy)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |

---


 
 
 #### [RawProductListingResponse](#RawProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[RawProduct](#RawProduct)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GTIN](#GTIN)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gtinType | String |  no  |  |
 | gtinValue | String |  no  |  |
 | primary | Boolean? |  yes  |  |

---


 
 
 #### [GenderDetail](#GenderDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  | It is Date and time when the attribute was created. |
 | modifiedOn | String? |  yes  | It is Date and time when the attribute was modified. |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | Details of the user who created the attribute. |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  | Details of the user who last modified the attribute. |
 | departments | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | details | [AttributeMasterDetails](#AttributeMasterDetails)? |  yes  |  |
 | enabledForEndConsumer | Boolean? |  yes  |  |
 | filters | [AttributeMasterFilter](#AttributeMasterFilter)? |  yes  |  |
 | id | String? |  yes  |  |
 | isNested | Boolean? |  yes  |  |
 | logo | String? |  yes  |  |
 | meta | [AttributeMasterMeta](#AttributeMasterMeta)? |  yes  |  |
 | name | String? |  yes  |  |
 | schema | [AttributeMaster](#AttributeMaster)? |  yes  |  |
 | slug | String? |  yes  |  |
 | variant | Boolean? |  yes  |  |

---


 
 
 #### [GetAddressSerializer](#GetAddressSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | city | String? |  yes  |  |
 | country | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | state | String? |  yes  |  |

---


 
 
 #### [GetAllSizes](#GetAllSizes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allSizes | ArrayList<[AllSizes](#AllSizes)>? |  yes  |  |

---


 
 
 #### [FilterResponse](#FilterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | values | ArrayList<[ValueItem](#ValueItem)>? |  yes  |  |

---


 
 
 #### [ValueItem](#ValueItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [GetAppCatalogConfiguration](#GetAppCatalogConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [AppCatalogConfiguration](#AppCatalogConfiguration)? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |

---


 
 
 #### [GetAppCatalogEntityConfiguration](#GetAppCatalogEntityConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [EntityConfiguration](#EntityConfiguration)? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |

---


 
 
 #### [GetAutocompleteWordsData](#GetAutocompleteWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | results | ArrayList<[AutocompleteResult](#AutocompleteResult)>? |  yes  |  |
 | appId | String? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [GetAutocompleteWordsResponse](#GetAutocompleteWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetAutocompleteWordsData](#GetAutocompleteWordsData)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | compare | [CompareFilter](#CompareFilter)? |  yes  |  |
 | similar | [SimilarFilter](#SimilarFilter)? |  yes  |  |
 | variant | [VariantFilter](#VariantFilter)? |  yes  |  |
 | detail | [DetailFilter](#DetailFilter)? |  yes  |  |

---


 
 
 #### [FilterItem](#FilterItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |
 | filterTypes | ArrayList<String>? |  yes  |  |
 | units | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CompareFilter](#CompareFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[FilterItem](#FilterItem)>? |  yes  |  |

---


 
 
 #### [SimilarFilter](#SimilarFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[SimilarItem](#SimilarItem)>? |  yes  |  |

---


 
 
 #### [VariantFilter](#VariantFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[VariantItem](#VariantItem)>? |  yes  |  |

---


 
 
 #### [DetailFilter](#DetailFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[FilterItem](#FilterItem)>? |  yes  |  |
 | values | [DetailFilterValues](#DetailFilterValues)? |  yes  |  |

---


 
 
 #### [DetailFilterValues](#DetailFilterValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | ArrayList<[DisplayType](#DisplayType)>? |  yes  |  |

---


 
 
 #### [DisplayType](#DisplayType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [SimilarItem](#SimilarItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [VariantItem](#VariantItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [GetCatalogConfigurationDetailsSchemaListing](#GetCatalogConfigurationDetailsSchemaListing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | HashMap<String,Object>? |  yes  |  |
 | sort | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [GetCatalogConfigurationMetaData](#GetCatalogConfigurationMetaData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | listing | [MetaDataListingResponse](#MetaDataListingResponse)? |  yes  |  |
 | product | [GetCatalogConfigurationDetailsProduct](#GetCatalogConfigurationDetailsProduct)? |  yes  |  |

---


 
 
 #### [GetCollectionDetailNest](#GetCollectionDetailNest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | schedule | HashMap<String,Object>? |  yes  |  |
 | action | [Action](#Action)? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | appId | String? |  yes  |  |
 | badge | HashMap<String,Object>? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | cron | HashMap<String,Object>? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | [Media](#Media)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | slug | String? |  yes  |  |
 | tag | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetCollectionItemsResponse](#GetCollectionItemsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)>? |  yes  |  |
 | items | ArrayList<[ProductListingDetail](#ProductListingDetail)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)>? |  yes  |  |

---


 
 
 #### [GetCollectionListingResponse](#GetCollectionListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [CollectionListingFilter](#CollectionListingFilter)? |  yes  |  |
 | items | ArrayList<[GetCollectionDetailNest](#GetCollectionDetailNest)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GetCollectionQueryOptionResponse](#GetCollectionQueryOptionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)>? |  yes  |  |
 | operators | HashMap<String,String> |  no  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)>? |  yes  |  |

---


 
 
 #### [GetCompanySerializer](#GetCompanySerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addresses | ArrayList<[GetAddressSerializer](#GetAddressSerializer)>? |  yes  |  |
 | businessType | String? |  yes  |  |
 | companyType | String? |  yes  |  |
 | createdBy | [UserSerializer2](#UserSerializer2)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedBy | [UserSerializer2](#UserSerializer2)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | rejectReason | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | verifiedBy | [UserSerializer2](#UserSerializer2)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |

---


 
 
 #### [ConditionItem](#ConditionItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [DataItem](#DataItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |
 | filterTypes | ArrayList<String>? |  yes  |  |
 | compatibleUnits | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ValueTypeItem](#ValueTypeItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [SortTypeItem](#SortTypeItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [GetConfigMetadataResponse](#GetConfigMetadataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | condition | ArrayList<[ConditionItem](#ConditionItem)>? |  yes  |  |
 | data | ArrayList<[DataItem](#DataItem)> |  no  |  |
 | values | [GetConfigMetadataValues](#GetConfigMetadataValues)? |  yes  |  |

---


 
 
 #### [GetConfigMetadataValues](#GetConfigMetadataValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | ArrayList<[ValueTypeItem](#ValueTypeItem)>? |  yes  |  |
 | sort | ArrayList<[SortTypeItem](#SortTypeItem)>? |  yes  |  |

---


 
 
 #### [AttributeType](#AttributeType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | key | String? |  yes  |  |
 | displayType | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |

---


 
 
 #### [DataType](#DataType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | attributes | ArrayList<[AttributeType](#AttributeType)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [ListingValueConfigType](#ListingValueConfigType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sort | String? |  yes  |  |
 | bucketPoints | ArrayList<Object>? |  yes  |  |
 | map | HashMap<String,Object>? |  yes  |  |
 | condition | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ListingDataType](#ListingDataType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | String? |  yes  |  |
 | allowSingle | Boolean? |  yes  |  |
 | id | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | key | String? |  yes  |  |
 | name | String? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | logo | String? |  yes  |  |
 | valueConfig | [ListingValueConfigType](#ListingValueConfigType)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [GetListingConfigResponse](#GetListingConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[ListingDataType](#ListingDataType)>? |  yes  |  |
 | page | [PageResponseType](#PageResponseType)? |  yes  |  |

---


 
 
 #### [GetConfigResponse](#GetConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[DataType](#DataType)> |  no  |  |
 | page | [PageResponseType](#PageResponseType) |  no  |  |

---


 
 
 #### [GetDepartment](#GetDepartment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [UserSerializer1](#UserSerializer1)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | itemType | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | modifiedBy | [UserSerializer1](#UserSerializer1)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | pageNo | Integer? |  yes  |  |
 | pageSize | Integer? |  yes  |  |
 | priorityOrder | Integer? |  yes  |  |
 | search | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [GetInventories](#GetInventories)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [BrandMeta1](#BrandMeta1)? |  yes  |  |
 | company | [CompanyMeta1](#CompanyMeta1)? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | createdBy | [UserSerializer1](#UserSerializer1)? |  yes  |  |
 | dateMeta | [DateMeta](#DateMeta)? |  yes  |  |
 | dimension | [DimensionResponse1](#DimensionResponse1)? |  yes  |  |
 | expirationDate | String? |  yes  |  |
 | id | String? |  yes  |  |
 | identifier | HashMap<String,Object>? |  yes  |  |
 | inventoryUpdatedOn | String? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | manufacturer | [ManufacturerResponse1](#ManufacturerResponse1)? |  yes  |  |
 | modifiedBy | [UserSerializer1](#UserSerializer1)? |  yes  |  |
 | platforms | HashMap<String,Object>? |  yes  |  |
 | price | [PriceArticle](#PriceArticle)? |  yes  |  |
 | quantities | [QuantitiesArticle](#QuantitiesArticle)? |  yes  |  |
 | returnConfig | [ReturnConfig2](#ReturnConfig2)? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | size | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | store | [ArticleStoreResponse](#ArticleStoreResponse)? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | taxIdentifier | HashMap<String,Object>? |  yes  |  |
 | totalQuantity | Integer? |  yes  |  |
 | traceId | String? |  yes  |  |
 | trackInventory | Boolean? |  yes  |  |
 | trader | ArrayList<[Trader2](#Trader2)>? |  yes  |  |
 | uid | String? |  yes  |  |
 | weight | [WeightResponse1](#WeightResponse1)? |  yes  |  |

---


 
 
 #### [GetInventoriesResponse](#GetInventoriesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetInventories](#GetInventories)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GetLocationSerializer](#GetLocationSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | address | [GetAddressSerializer](#GetAddressSerializer) |  no  |  |
 | code | String |  no  |  |
 | company | [GetCompanySerializer](#GetCompanySerializer)? |  yes  |  |
 | contactNumbers | ArrayList<[SellerPhoneNumber](#SellerPhoneNumber)>? |  yes  |  |
 | createdBy | [UserSerializer3](#UserSerializer3)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | displayName | String |  no  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | gstCredentials | [InvoiceDetailsSerializer](#InvoiceDetailsSerializer)? |  yes  |  |
 | integrationType | [LocationIntegrationType](#LocationIntegrationType)? |  yes  |  |
 | manager | [LocationManagerSerializer](#LocationManagerSerializer)? |  yes  |  |
 | modifiedBy | [UserSerializer3](#UserSerializer3)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | phoneNumber | String |  no  |  |
 | productReturnConfig | [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)? |  yes  |  |
 | stage | String? |  yes  |  |
 | storeType | String? |  yes  |  |
 | timing | ArrayList<[LocationDayWiseSerializer](#LocationDayWiseSerializer)>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | verifiedBy | [UserSerializer3](#UserSerializer3)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [GetOptInPlatform](#GetOptInPlatform)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyOptIn](#CompanyOptIn)> |  no  |  |
 | page | [Page](#Page) |  no  |  |

---


 
 
 #### [GetProductBundleCreateResponse](#GetProductBundleCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the product bundle. |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the product bundle. |
 | choice | String |  no  |  |
 | companyId | Integer? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | pageVisibility | ArrayList<String>? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)> |  no  |  |
 | sameStoreAssignment | Boolean? |  yes  |  |
 | slug | String |  no  |  |

---


 
 
 #### [GetProductBundleListingResponse](#GetProductBundleListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetProductBundleCreateResponse](#GetProductBundleCreateResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GetProductBundleResponse](#GetProductBundleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | logo | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | pageVisibility | ArrayList<String>? |  yes  |  |
 | products | ArrayList<[GetProducts](#GetProducts)>? |  yes  |  |
 | sameStoreAssignment | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |

---


 
 
 #### [GetProducts](#GetProducts)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowRemove | Boolean? |  yes  |  |
 | autoAddToCart | Boolean? |  yes  |  |
 | autoSelect | Boolean? |  yes  |  |
 | maxQuantity | Integer? |  yes  |  |
 | minQuantity | Integer? |  yes  |  |
 | price | [Price](#Price)? |  yes  |  |
 | productDetails | [LimitedProductData](#LimitedProductData)? |  yes  |  |
 | productUid | Integer? |  yes  |  |
 | sizes | ArrayList<[Size](#Size)>? |  yes  |  |

---


 
 
 #### [GetCollectionDetailResponse](#GetCollectionDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | schedule | [CollectionSchedule](#CollectionSchedule)? |  yes  |  |
 | action | HashMap<String,Object>? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | appId | String? |  yes  |  |
 | badge | [CollectionBadge](#CollectionBadge)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | logo | [Media](#Media)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | published | Boolean? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | seo | [SeoDetail](#SeoDetail)? |  yes  |  |
 | slug | String? |  yes  |  |
 | sortOn | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CommonResponseSchemaCollection](#CommonResponseSchemaCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [GetQueryFiltersResponse](#GetQueryFiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductFilters](#ProductFilters)>? |  yes  |  |
 | operators | HashMap<String,String>? |  yes  |  |
 | sortOn | ArrayList<[ProductSortOn](#ProductSortOn)>? |  yes  |  |

---


 
 
 #### [GetCollectionItemsResponseSchema](#GetCollectionItemsResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductDetailV2](#ProductDetailV2)>? |  yes  |  |
 | sortOn | ArrayList<[ProductSortOnv2](#ProductSortOnv2)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Page1](#Page1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ca | Boolean? |  yes  |  |
 | department | String? |  yes  |  |
 | pageNo | Integer? |  yes  |  |
 | pageSize | Integer? |  yes  |  |
 | q | String? |  yes  |  |
 | sort | String? |  yes  |  |
 | sortOn | String? |  yes  |  |
 | type | String? |  yes  |  |
 | variant | String? |  yes  |  |

---


 
 
 #### [CollectionItemSchemaV2](#CollectionItemSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | String |  no  |  |
 | itemId | Integer |  no  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [CollectionItemUpdateSchema](#CollectionItemUpdateSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | items | ArrayList<[CollectionItemSchemaV2](#CollectionItemSchemaV2)>? |  yes  |  |
 | query | ArrayList<[CollectionQuerySchemaV2](#CollectionQuerySchemaV2)>? |  yes  |  |
 | type | String |  no  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |
 | resetItems | Boolean? |  yes  |  |

---


 
 
 #### [CollectionQuerySchemaV2](#CollectionQuerySchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attribute | String |  no  | The attribute of the collection query |
 | op | String |  no  | The operation to be performed on the attribute of the collection query |
 | value | ArrayList<String> |  no  |  |

---


 
 
 #### [ProductDetailV2](#ProductDetailV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | [ProductBrand](#ProductBrand)? |  yes  |  |
 | isExcluded | Boolean? |  yes  |  |
 | isPinned | Boolean? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | medias | ArrayList<[Media](#Media)>? |  yes  |  |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | slug | String |  no  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [GetSearchConfigurationResponse](#GetSearchConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | The id of the search configuration. |
 | applicationId | String |  no  | The application id where custom search configuration is set |
 | companyId | Integer |  no  | The company id where custom search configuration is set |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the search configuration. |
 | createdOn | String? |  yes  | The date and time when the search configuration was created. |
 | isProximityEnabled | Boolean? |  yes  | Flag indicating if proximity search is enabled for this attribute. |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who modified the search configuration. |
 | modifiedOn | String? |  yes  | The date and time when the search configuration was last modified. |
 | proximity | Integer? |  yes  | Proximity distance configuration |
 | searchableAttributes | ArrayList<[SearchableAttribute](#SearchableAttribute)>? |  yes  | The searchable attributes defined on the application. |

---


 
 
 #### [GetSearchWordsData](#GetSearchWordsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | HashMap<String,Object>? |  yes  |  |
 | sortOn | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | appId | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | result | HashMap<String,Object>? |  yes  |  |
 | uid | String? |  yes  |  |
 | words | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetSearchWordsDetailResponse](#GetSearchWordsDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [GetSearchWordsData](#GetSearchWordsData)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GetSearchWordsResponse](#GetSearchWordsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetSearchWordsData](#GetSearchWordsData)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [GlobalValidation](#GlobalValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | definitions | HashMap<String,Object>? |  yes  |  |
 | description | String? |  yes  |  |
 | properties | [Properties](#Properties)? |  yes  |  |
 | required | ArrayList<String>? |  yes  |  |
 | title | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [Guide](#Guide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | [Meta](#Meta)? |  yes  |  |

---


 
 
 #### [HSNCodesResponse](#HSNCodesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [HSNData](#HSNData)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [HSNData](#HSNData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryOfOrigin | ArrayList<String>? |  yes  |  |
 | hsnCode | ArrayList<String>? |  yes  |  |

---


 
 
 #### [HSNDataInsertV2](#HSNDataInsertV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | ID of the HSN. |
 | countryCode | String |  no  | Country code. |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | Details of the user who created the HSN data. |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  | Details of the user who last modified the HSN data. |
 | createdOn | String? |  yes  | Date and time when the HSN data was created. |
 | description | String |  no  | Description of the HSN data. |
 | hsnCode | String |  no  | HSN code. |
 | hsnCodeId | String? |  yes  | Unique identifier of the HSN code. |
 | modifiedOn | String? |  yes  | Date and time when the HSN data was last modified. |
 | reportingHsn | String |  no  | HSN code. |
 | taxes | ArrayList<[TaxSlab](#TaxSlab)> |  no  | List of tax slabs. |
 | type | String |  no  | Type of HSN data (goods or services). |

---


 
 
 #### [Hierarchy](#Hierarchy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | department | Integer |  no  | It is the unique identifier of the department the category is mapped to. |
 | l1 | Integer |  no  | It is the unique id of the L1 category mapped to the L3 category. |
 | l2 | Integer |  no  | It is the unique id of the L2 category mapped to the L3 category. |

---


 
 
 #### [HsnCode](#HsnCode)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [HsnCodesObject](#HsnCodesObject)? |  yes  | The HSN code data. |

---


 
 
 #### [SlabObject](#SlabObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | threshold | Integer? |  yes  |  |
 | tax | Integer? |  yes  |  |

---


 
 
 #### [UpdateHsnCodesObject](#UpdateHsnCodesObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | companyId | Integer? |  yes  | The ID of the company. |
 | slabs | ArrayList<[SlabObject](#SlabObject)>? |  yes  |  |
 | hs2Code | String? |  yes  | The HS2 code. |
 | hsnCode | String? |  yes  | The HSN code. |
 | taxOn | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [UpdateHsnCode](#UpdateHsnCode)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [UpdateHsnCodesObject](#UpdateHsnCodesObject)? |  yes  | The HSN code data. |

---


 
 
 #### [HsnCodesListingResponseSchemaV2](#HsnCodesListingResponseSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[HSNDataInsertV2](#HSNDataInsertV2)>? |  yes  |  |
 | page | [PageResponse1](#PageResponse1)? |  yes  |  |

---


 
 
 #### [HsnCodesObject](#HsnCodesObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  | The ID of the company. |
 | hs2Code | String? |  yes  | The HS2 code. |
 | hsnCode | String? |  yes  | The HSN code. |
 | id | String? |  yes  | The identifier of the HSN code. |
 | modifiedOn | String? |  yes  | The date and time when the HSN code was last modified. |
 | tax1 | Double? |  yes  | The first tax rate. |
 | tax2 | Double? |  yes  | The second tax rate. |
 | taxOnEsp | Boolean? |  yes  | Flag indicating whether tax is applicable on ESP. |
 | taxOnMrp | Boolean? |  yes  | Flag indicating whether tax is applicable on MRP. |
 | threshold1 | Double? |  yes  | The threshold for the first tax rate. |
 | threshold2 | Double? |  yes  | The threshold for the second tax rate. |

---


 
 
 #### [HsnUpsert](#HsnUpsert)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer |  no  | The ID of the company. |
 | hs2Code | String |  no  | The HS2 code. |
 | hsnCode | String |  no  | The HSN code. |
 | isActive | Boolean? |  yes  | Flag indicating whether the entry is active. |
 | tax1 | Double |  no  | The first tax rate. |
 | tax2 | Double? |  yes  | The second tax rate. |
 | taxOnEsp | Boolean? |  yes  | Flag indicating whether tax is applicable on ESP. |
 | taxOnMrp | Boolean |  no  | Flag indicating whether tax is applicable on MRP. |
 | threshold1 | Double |  no  | The threshold for the first tax rate. |
 | threshold2 | Double? |  yes  | The threshold for the second tax rate. |
 | uid | Integer? |  yes  | The unique identifier. |

---


 
 
 #### [Image](#Image)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | aspectRatioF | Double? |  yes  |  |
 | secureUrl | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [ImageUrls](#ImageUrls)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | [BannerImage](#BannerImage)? |  yes  |  |
 | portrait | [BannerImage](#BannerImage)? |  yes  |  |

---


 
 
 #### [InvSize](#InvSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String |  no  | The currency used for the item price. |
 | expirationDate | String? |  yes  |  |
 | identifiers | ArrayList<[GTIN](#GTIN)> |  no  |  |
 | isSet | Boolean? |  yes  |  |
 | itemDimensionsUnitOfMeasure | String? |  yes  | The unit of measure for the item dimensions. |
 | itemHeight | Double? |  yes  | The height of the item. |
 | itemLength | Double? |  yes  | The length of the item. |
 | itemWeight | Double? |  yes  | The weight of the item. |
 | itemWeightUnitOfMeasure | String? |  yes  | The unit of measure for the item weight. |
 | itemWidth | Double? |  yes  | The width of the item. |
 | price | Double? |  yes  |  |
 | priceEffective | Double |  no  |  |
 | priceTransfer | Double? |  yes  |  |
 | quantity | Integer |  no  |  |
 | set | [InventorySet](#InventorySet)? |  yes  |  |
 | size | String |  no  |  |
 | storeCode | String |  no  |  |

---


 
 
 #### [InventoryBulkRequest](#InventoryBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String |  no  |  |
 | companyId | Integer |  no  |  |
 | sizes | ArrayList<[InventoryJobPayload](#InventoryJobPayload)> |  no  |  |
 | user | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [InventoryConfig](#InventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[FilerList](#FilerList)>? |  yes  |  |
 | multivalue | Boolean? |  yes  |  |

---


 
 
 #### [InventoryCreateRequest](#InventoryCreateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<String>? |  yes  | The list of attributes that you want to extract in the export job. |
 | filters | [InventoryExportFilter](#InventoryExportFilter) |  no  | This filters that are applied for the export of the inventory. |
 | notificationEmails | ArrayList<String>? |  yes  | The list of the emails to be notified after the completion of the job. |
 | type | String? |  yes  | The type of file that needs to be exported. |

---


 
 
 #### [InventoryExportAdvanceOption](#InventoryExportAdvanceOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | fromDate | String? |  yes  |  |
 | quantity | [InventoryExportQuantityFilter](#InventoryExportQuantityFilter)? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | toDate | String? |  yes  |  |

---


 
 
 #### [InventoryExportFilter](#InventoryExportFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  | The list of the brand ids that needs to be exported. |
 | fromDate | String? |  yes  | The modified on date from which the data needs to be exported. |
 | quantity | [InventoryExportQuantityFilter](#InventoryExportQuantityFilter)? |  yes  | The quantity range that needs to be exported. |
 | storeIds | ArrayList<Integer> |  no  | The list of the store ids that needs to be exported. |
 | toDate | String? |  yes  | The modified on date till when the data needs to be exported. |

---


 
 
 #### [InventoryExportJobResponse](#InventoryExportJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[InventoryExportItem](#InventoryExportItem)>? |  yes  |  |

---


 
 
 #### [InventoryExportItem](#InventoryExportItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | type | String? |  yes  |  |
 | stats | HashMap<String,Object>? |  yes  |  |
 | completedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | taskId | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | id | String? |  yes  |  |
 | url | String? |  yes  |  |
 | triggerOn | String? |  yes  |  |
 | brand | ArrayList<Integer>? |  yes  |  |
 | store | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [InventoryExportJob](#InventoryExportJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | completedOn | String? |  yes  | Completion datetime of the job. |
 | filters | [InventoryExportAdvanceOption](#InventoryExportAdvanceOption)? |  yes  | The filters that needs to be exported. |
 | notificationEmails | ArrayList<String>? |  yes  | The notification emails for the job. |
 | sellerId | Integer |  no  | The seller id that needs to be exported. |
 | status | String? |  yes  | The status of the job. |
 | taskId | String |  no  | The task id of the job. |
 | type | String |  no  | The type of file that needs to be exported. |
 | url | String? |  yes  | URL odf the exported file. |

---


 
 
 #### [InventoryExportJobListFilters](#InventoryExportJobListFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | brands | ArrayList<String>? |  yes  |  |
 | stores | ArrayList<String>? |  yes  |  |

---


 
 
 #### [InventoryExportJobListStats](#InventoryExportJobListStats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |

---


 
 
 #### [InventoryExportJobList](#InventoryExportJobList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | completedOn | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | filters | [InventoryExportJobListFilters](#InventoryExportJobListFilters)? |  yes  |  |
 | stats | [InventoryExportJobListStats](#InventoryExportJobListStats)? |  yes  |  |
 | type | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | url | String? |  yes  |  |
 | taskId | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [InventoryExportJobListResponse](#InventoryExportJobListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[InventoryExportJobList](#InventoryExportJobList)>? |  yes  |  |

---


 
 
 #### [InventoryExportQuantityFilter](#InventoryExportQuantityFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer? |  yes  | The maximum quantity that needs to be exported. |
 | min | Integer? |  yes  | The minimum quantity that needs to be exported. |
 | operators | String |  no  | Condition for the quantity that needs to be exported. |

---


 
 
 #### [ExportPatchRequest](#ExportPatchRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [InventoryExportRequest](#InventoryExportRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | ArrayList<Integer>? |  yes  |  |
 | store | ArrayList<Integer>? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [EditInventoryDataDownloadsResponse](#EditInventoryDataDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | completedOn | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | taskId | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [EditInventoryDownloadsResponse](#EditInventoryDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [EditInventoryDataDownloadsResponse](#EditInventoryDataDownloadsResponse)? |  yes  |  |

---


 
 
 #### [InventoryExportFiltersResponse](#InventoryExportFiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [Stats](#Stats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total | Integer? |  yes  |  |

---


 
 
 #### [InventoryExportResponse](#InventoryExportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  | The user that created the job. |
 | createdOn | String? |  yes  | Creation datetime of the job |
 | filters | [InventoryExportFiltersResponse](#InventoryExportFiltersResponse)? |  yes  |  |
 | modifiedOn | String? |  yes  | Modification date of the job |
 | notificationEmails | ArrayList<String>? |  yes  | The notification emails for the job. |
 | sellerId | Integer |  no  | The seller id that needs to be exported. |
 | status | String? |  yes  | The status of the job. |
 | taskId | String |  no  | The task id of the job. |
 | type | String? |  yes  | The type of file that needs to be exported. |
 | stats | [Stats](#Stats)? |  yes  |  |
 | id | String? |  yes  |  |
 | triggerOn | String? |  yes  |  |
 | brand | ArrayList<Integer>? |  yes  |  |
 | store | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [InventoryFailedReason](#InventoryFailedReason)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | String? |  yes  | It is the error message of the inventory error response. |
 | message | String |  no  | It is the message of the activity performed. |
 | reasonCode | Integer? |  yes  | It is the reason code of the inventory error response. |

---


 
 
 #### [InventoryJobDetailResponse](#InventoryJobDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancelledBy | [UserDetail](#UserDetail)? |  yes  | This is the user detail of the user who cancelled the job. |
 | cancelledOn | String? |  yes  | This is the timestamp of the cacellation for this job. |
 | completedOn | String? |  yes  | This is the timestamp of the completion for this job. |
 | createdBy | [UserDetail](#UserDetail)? |  yes  | This is the user detail of the user who cancelled the job. |
 | createdOn | String? |  yes  | This is the timestamp of the creation for this job. |
 | filters | [InventoryJobFilters](#InventoryJobFilters) |  no  | This is the filter criteria applied for the export job. |
 | id | String |  no  | This is the ID of the job. |
 | modifiedOn | String? |  yes  | This is the timestamp of the modification for this job. |
 | notificationEmails | ArrayList<String>? |  yes  | User email to get notification post completion of the job. |
 | sellerId | Integer |  no  | This ID of the company. |
 | status | String? |  yes  | This tells you the current status of the export job. |
 | taskId | String |  no  | This is the task id of the jobs that is used for search. |
 | type | String? |  yes  | This is the file type of the export. |
 | url | String |  no  | This is the url to download the export. |

---


 
 
 #### [InventoryJobFilters](#InventoryJobFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<String>? |  yes  | The list of all the brands selected. |
 | fromDate | String? |  yes  | The modified on date from which the data needs to be exported. |
 | quantity | [InventoryExportQuantityFilter](#InventoryExportQuantityFilter)? |  yes  | The quantity range that needs to be exported. |
 | stores | ArrayList<String>? |  yes  | The list of all the store selected. |
 | toDate | String? |  yes  | The modified on date till when the data needs to be exported. |

---


 
 
 #### [InventoryJobPayload](#InventoryJobPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  | The currency used for the item price. |
 | expirationDate | String? |  yes  | The expiration date of the item. |
 | itemDimensionsUnitOfMeasure | String? |  yes  | The unit of measure for the item dimensions. |
 | itemWeightUnitOfMeasure | String? |  yes  | The unit of measure for the item weight. |
 | price | Double? |  yes  | The price of the item. |
 | priceEffective | Double? |  yes  | The effective price of the item. |
 | priceMarked | Double? |  yes  | The marked price of the item. |
 | quantity | Integer? |  yes  | The quantity of the item. |
 | sellerIdentifier | String |  no  | The identifier of the seller. |
 | storeCode | String |  no  | The code of the store. |
 | tags | ArrayList<String>? |  yes  | The tags associated with the item. |
 | totalQuantity | Integer? |  yes  | The total quantity of the item. |
 | traceId | String? |  yes  | The trace ID of the inventory job payload. |

---


 
 
 #### [InventoryPage](#InventoryPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | itemTotal | Integer |  no  |  |
 | nextId | String? |  yes  |  |
 | type | String |  no  |  |

---


 
 
 #### [InventoryPayload](#InventoryPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expirationDate | String? |  yes  | The expiration date of the inventory item. |
 | priceEffective | Double? |  yes  | The effective price of the inventory item. |
 | priceMarked | Double? |  yes  | The marked price of the inventory item. |
 | sellerIdentifier | String |  no  | The identifier of the seller. |
 | storeId | Integer |  no  | The ID of the store. |
 | tags | ArrayList<String>? |  yes  | The tags associated with the inventory item. |
 | totalQuantity | Integer? |  yes  | The total quantity of the inventory item. |
 | traceId | String? |  yes  | The trace ID of the inventory payload. |

---


 
 
 #### [InventoryRequest](#InventoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer |  no  |  |
 | item | [ItemQuery](#ItemQuery) |  no  |  |
 | sizes | ArrayList<[InvSize](#InvSize)> |  no  |  |

---


 
 
 #### [InventoryRequestSchemaV2](#InventoryRequestSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object>? |  yes  | Additional metadata for the inventory request. |
 | payload | ArrayList<[InventoryPayload](#InventoryPayload)>? |  yes  | The list of inventory payloads. |

---


 
 
 #### [InventoryResponse](#InventoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  |  |
 | identifiers | HashMap<String,Object>? |  yes  |  |
 | inventoryUpdatedOn | String? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | price | Double? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | priceTransfer | Double? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | sellableQuantity | Integer? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | size | String? |  yes  |  |
 | store | HashMap<String,Object>? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [InventoryResponseItem](#InventoryResponseItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [InventoryPayload](#InventoryPayload)? |  yes  |  |
 | reason | [InventoryFailedReason](#InventoryFailedReason)? |  yes  |  |

---


 
 
 #### [InventoryResponsePaginated](#InventoryResponsePaginated)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[InventoryResponse](#InventoryResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [InventorySellerIdentifierResponsePaginated](#InventorySellerIdentifierResponsePaginated)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[InventorySellerResponse](#InventorySellerResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [InventorySellerResponse](#InventorySellerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  | Custom JSON data for the article. |
 | addedOnStore | String? |  yes  | The date and time when the article was added to the store. |
 | brand | [BrandMeta](#BrandMeta) |  no  | The metadata of the brand. |
 | company | [CompanyMeta](#CompanyMeta) |  no  | The metadata of the company. |
 | countryOfOrigin | String |  no  | The country of origin of the article. |
 | createdBy | String? |  yes  | The user who created the article. |
 | dimension | [DimensionResponse](#DimensionResponse) |  no  | The dimensions of the article. |
 | expirationDate | String? |  yes  | The expiration date of the article. |
 | fragile | Boolean |  no  | Indicates if the article is fragile. |
 | fyndArticleCode | String |  no  | The Fynd article code. |
 | fyndItemCode | String |  no  | The Fynd item code. |
 | fyndMeta | HashMap<String,Object>? |  yes  | The Fynd metadata of the article. |
 | identifier | HashMap<String,Object> |  no  | The identifier of the article. |
 | isActive | Boolean? |  yes  | Indicates if the article is active. |
 | isSet | Boolean? |  yes  |  |
 | itemId | Integer |  no  | The ID of the item. |
 | manufacturer | [ManufacturerResponse](#ManufacturerResponse) |  no  | The manufacturer of the article. |
 | meta | HashMap<String,Object>? |  yes  | Additional metadata for the article. |
 | modifiedBy | String? |  yes  | The user who modified the article. |
 | price | [PriceMeta](#PriceMeta) |  no  | The price metadata of the article. |
 | quantities | [Quantities](#Quantities)? |  yes  |  |
 | rawMeta | HashMap<String,Object>? |  yes  | The raw metadata of the article. |
 | returnConfig | [ReturnConfig1](#ReturnConfig1)? |  yes  | The return configuration of the article. |
 | sellerIdentifier | String |  no  | The seller identifier of the article. |
 | set | [InventorySet](#InventorySet)? |  yes  |  |
 | size | String |  no  | The size of the article. |
 | stage | String? |  yes  | The stage of the article. |
 | store | [StoreMeta](#StoreMeta) |  no  | The metadata of the store. |
 | tags | ArrayList<String>? |  yes  | The tags associated with the article. |
 | taxIdentifier | HashMap<String,Object>? |  yes  | The tax identifier of the article. |
 | totalQuantity | Integer |  no  | The total quantity of the article. |
 | traceId | String? |  yes  | The trace ID of the article. |
 | trackInventory | Boolean? |  yes  | Indicates if the inventory is tracked for the article. |
 | trader | ArrayList<[Trader1](#Trader1)>? |  yes  | The traders associated with the article. |
 | uid | String |  no  | The unique identifier of the article. |
 | weight | [WeightResponse](#WeightResponse) |  no  | The weight of the article. |

---


 
 
 #### [InventorySet](#InventorySet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | sizeDistribution | [SizeDistribution](#SizeDistribution) |  no  |  |

---


 
 
 #### [InventoryStockResponse](#InventoryStockResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | page | [InventoryPage](#InventoryPage) |  no  |  |

---


 
 
 #### [InventoryUpdateResponse](#InventoryUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[InventoryResponseItem](#InventoryResponseItem)>? |  yes  |  |
 | message | String? |  yes  | It is the success message of the inventory update. |
 | success | Boolean? |  yes  | It is the success message of the inventory update. |

---


 
 
 #### [InventoryValidationResponse](#InventoryValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Object>? |  yes  |  |
 | message | String? |  yes  |  |

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
 | eInvoice | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |
 | eWaybill | [InvoiceCredSerializer](#InvoiceCredSerializer)? |  yes  |  |

---


 
 
 #### [ItemQuery](#ItemQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandUid | Integer? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [Items](#Items)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancelled | Integer? |  yes  |  |
 | cancelledRecords | ArrayList<String>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdBy | [UserCommon](#UserCommon)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | failed | Integer? |  yes  |  |
 | failedRecords | ArrayList<String>? |  yes  |  |
 | filePath | String? |  yes  |  |
 | id | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | [UserCommon](#UserCommon)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | retry | Integer? |  yes  |  |
 | stage | String? |  yes  |  |
 | succeed | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |
 | trackingUrl | String? |  yes  |  |

---


 
 
 #### [PriceRange](#PriceRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Double? |  yes  |  |
 | max | Double? |  yes  |  |

---


 
 
 #### [ProductPriceRangeSchema](#ProductPriceRangeSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | [PriceRange](#PriceRange)? |  yes  |  |
 | marked | [PriceRange](#PriceRange)? |  yes  |  |
 | currency | String? |  yes  |  |

---


 
 
 #### [LimitedProductData](#LimitedProductData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | identifier | HashMap<String,Object>? |  yes  |  |
 | images | ArrayList<String>? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | name | String? |  yes  |  |
 | price | [ProductPriceRangeSchema](#ProductPriceRangeSchema)? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | sizes | ArrayList<String>? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [ListSizeGuide](#ListSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[SizeGuideResponse](#SizeGuideResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [LocationDayWiseSerializer](#LocationDayWiseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | closing | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |
 | open | Boolean |  no  |  |
 | opening | [LocationTimingSerializer](#LocationTimingSerializer)? |  yes  |  |
 | weekday | String |  no  |  |

---


 
 
 #### [LocationIntegrationType](#LocationIntegrationType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | String? |  yes  |  |
 | order | String? |  yes  |  |

---


 
 
 #### [LocationListSerializer](#LocationListSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | items | ArrayList<[GetLocationSerializer](#GetLocationSerializer)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [LocationManagerSerializer](#LocationManagerSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | mobileNo | [SellerPhoneNumber](#SellerPhoneNumber) |  no  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [LocationTimingSerializer](#LocationTimingSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hour | Integer? |  yes  |  |
 | minute | Integer? |  yes  |  |

---


 
 
 #### [Logo](#Logo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | aspectRatioF | Integer? |  yes  |  |
 | secureUrl | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [MOQData](#MOQData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | incrementUnit | Integer? |  yes  |  |
 | maximum | Integer? |  yes  |  |
 | minimum | Integer? |  yes  |  |

---


 
 
 #### [ManufacturerResponse](#ManufacturerResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String |  no  | The address of the manufacturer. |
 | isDefault | Boolean |  no  | Indicates if it is the default manufacturer. |
 | name | String |  no  | The name of the manufacturer. |

---


 
 
 #### [ManufacturerResponse1](#ManufacturerResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | String? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [Media](#Media)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object>? |  yes  |  |
 | type | String? |  yes  |  |
 | url | String |  no  |  |

---


 
 
 #### [Media1](#Media1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | String |  no  | It is the landscape cdn url for the category. |
 | logo | String |  no  | It is the logo cdn url for the category. |
 | portrait | String |  no  | It is the portrait cdn url for the category. |

---


 
 
 #### [Media2](#Media2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | aspectRatio | String? |  yes  |  |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | headers | [GuideHeaders](#GuideHeaders)? |  yes  |  |
 | values | ArrayList<[GuideValues](#GuideValues)>? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [GuideHeaders](#GuideHeaders)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | col1 | [Header](#Header)? |  yes  |  |
 | col2 | [Header](#Header)? |  yes  |  |

---


 
 
 #### [GuideValues](#GuideValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | col1 | String? |  yes  |  |
 | col2 | String? |  yes  |  |

---


 
 
 #### [Header](#Header)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | convertable | Boolean? |  yes  |  |

---


 
 
 #### [MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | filterTypes | ArrayList<String>? |  yes  |  |
 | key | String? |  yes  |  |
 | units | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [MetaDataListingFilterResponse](#MetaDataListingFilterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingFilterMetaResponse](#MetaDataListingFilterMetaResponse)>? |  yes  |  |

---


 
 
 #### [MetaDataListingResponse](#MetaDataListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filter | [MetaDataListingFilterResponse](#MetaDataListingFilterResponse) |  no  |  |
 | sort | [MetaDataListingSortResponse](#MetaDataListingSortResponse) |  no  |  |

---


 
 
 #### [MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | key | String? |  yes  |  |

---


 
 
 #### [MetaDataListingSortResponse](#MetaDataListingSortResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[MetaDataListingSortMetaResponse](#MetaDataListingSortMetaResponse)>? |  yes  |  |

---


 
 
 #### [MetaFields](#MetaFields)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  | The key of the metadata. Should be a non-empty string and length should not exceed 30 characters. |
 | value | String |  no  | The value of the metadata. Should be a non-empty string and length should not exceed 100 characters. |

---


 
 
 #### [NetQuantity](#NetQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  | The unit of measurement used for the net quantity of the product. |
 | value | Double? |  yes  | The value of the net quantity of the product. |

---


 
 
 #### [NetQuantityResponse](#NetQuantityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  |  |
 | value | Double? |  yes  |  |

---


 
 
 #### [NextSchedule](#NextSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | String? |  yes  |  |
 | start | String? |  yes  |  |

---


 
 
 #### [OptInPostRequest](#OptInPostRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | optLevel | String |  no  |  |
 | platform | String? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [OptinCompanyBrandDetailsView](#OptinCompanyBrandDetailsView)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyBrandDetail](#CompanyBrandDetail)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [OptinAddress](#OptinAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String? |  yes  |  |
 | state | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | city | String? |  yes  |  |
 | country | String? |  yes  |  |
 | latitude | Double? |  yes  |  |
 | longitude | Double? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [OptinDocument](#OptinDocument)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |
 | legalName | String? |  yes  |  |
 | verified | Boolean? |  yes  |  |

---


 
 
 #### [OptinBusinessCountryInfo](#OptinBusinessCountryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | countryCode | String? |  yes  |  |

---


 
 
 #### [OptinCompanyDetail](#OptinCompanyDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | businessInfo | String? |  yes  |  |
 | businessType | String? |  yes  |  |
 | businessCountryInfo | [OptinBusinessCountryInfo](#OptinBusinessCountryInfo)? |  yes  |  |
 | address | [OptinAddress](#OptinAddress)? |  yes  |  |
 | document | [OptinDocument](#OptinDocument)? |  yes  |  |
 | brands | ArrayList<Integer>? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | warnings | HashMap<String,Object>? |  yes  |  |
 | stage | String? |  yes  |  |

---


 
 
 #### [OptinCompanyMetrics](#OptinCompanyMetrics)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | Integer? |  yes  |  |
 | company | String? |  yes  |  |
 | store | Integer? |  yes  |  |

---


 
 
 #### [OptinStoreDetails](#OptinStoreDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[StoreDetail](#StoreDetail)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [OwnerAppItemResponse](#OwnerAppItemResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizePromotionThreshold | HashMap<String,Object>? |  yes  |  |
 | altText | HashMap<String,Object>? |  yes  |  |
 | isCod | Boolean? |  yes  |  |
 | isGift | Boolean? |  yes  |  |
 | moq | [MOQData](#MOQData)? |  yes  |  |
 | seo | [SEOData](#SEOData)? |  yes  |  |

---


 
 
 #### [PTErrorResponse](#PTErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  |  |
 | message | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | status | Integer? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | size | Integer? |  yes  |  |
 | type | String |  no  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | String? |  yes  | It is the current page of the page response schema. |
 | hasNext | Boolean? |  yes  | It is the bool indicates if there is a  next page. |
 | hasPrevious | Boolean? |  yes  | It is the bool indicates if there is a  previous page. |
 | itemTotal | Integer? |  yes  | It is the total number of item present for the filter. |
 | size | Integer? |  yes  | It is the size of each page. |

---


 
 
 #### [PageResponse1](#PageResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | size | Integer? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [PageResponseType](#PageResponseType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Integer |  no  |  |
 | hasNext | Boolean |  no  |  |
 | next | Integer |  no  |  |
 | totalCount | Integer |  no  |  |

---


 
 
 #### [Price](#Price)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  |  |
 | maxEffective | Double? |  yes  |  |
 | maxMarked | Double? |  yes  |  |
 | minEffective | Double? |  yes  |  |
 | minMarked | Double? |  yes  |  |

---


 
 
 #### [Price1](#Price1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyCode | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | max | Double? |  yes  |  |
 | min | Double? |  yes  |  |

---


 
 
 #### [PriceArticle](#PriceArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  |  |
 | effective | Double? |  yes  |  |
 | marked | Double? |  yes  |  |
 | tpNotes | HashMap<String,Object>? |  yes  |  |
 | transfer | Double? |  yes  |  |

---


 
 
 #### [PriceMeta](#PriceMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String |  no  | The currency used for the prices. |
 | effective | Double |  no  | The effective price. |
 | marked | Double |  no  | The marked price. |
 | tpNotes | HashMap<String,Object>? |  yes  | Additional notes for the transfer price. |
 | transfer | Double |  no  | The transfer price. |
 | updatedAt | String? |  yes  | The date and time of the last update. |

---


 
 
 #### [ProdcutTemplateCategoriesResponse](#ProdcutTemplateCategoriesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CategoriesResponse](#CategoriesResponse)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Product](#Product)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | allCompanyIds | ArrayList<Integer>? |  yes  |  |
 | allIdentifiers | ArrayList<String>? |  yes  |  |
 | allSizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brand | [Brand](#Brand)? |  yes  |  |
 | brandUid | Integer? |  yes  |  |
 | category | HashMap<String,Object>? |  yes  |  |
 | categorySlug | String? |  yes  |  |
 | categoryUid | Integer? |  yes  |  |
 | color | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | currency | String? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | description | String? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | images | ArrayList<[Image](#Image)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | isPhysical | Boolean? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | l3Mapping | ArrayList<String>? |  yes  |  |
 | media | ArrayList<[Media](#Media)>? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | moq | HashMap<String,Object>? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | netQuantity | [NetQuantityResponse](#NetQuantityResponse)? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | pending | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | productPublish | [ProductPublished](#ProductPublished)? |  yes  |  |
 | returnConfig | [ReturnConfigResponse](#ReturnConfigResponse)? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | sizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | slug | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | taxIdentifier | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | trader | ArrayList<[Trader](#Trader)>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | variants | HashMap<String,Object>? |  yes  |  |
 | verifiedBy | [VerifiedBy](#VerifiedBy)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |

---


 
 
 #### [ProductAttributesResponse](#ProductAttributesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AttributeMasterSerializer](#AttributeMasterSerializer)> |  no  |  |

---


 
 
 #### [ProductBrand](#ProductBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | logo | HashMap<String,Object>? |  yes  |  |
 | action | [PageAction](#PageAction)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductBulkAssets](#ProductBulkAssets)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | url | String |  no  |  |
 | user | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ProductBulkRequest](#ProductBulkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancelled | Integer? |  yes  |  |
 | cancelledRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdBy | [UserDetail1](#UserDetail1)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | failed | Integer? |  yes  |  |
 | failedRecords | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | filePath | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | [UserDetail1](#UserDetail1)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | succeed | Integer? |  yes  |  |
 | template | [ProductTemplate](#ProductTemplate)? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | total | Integer? |  yes  |  |

---


 
 
 #### [InventoryBulkJob](#InventoryBulkJob)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | String? |  yes  | The ID of the company. |
 | filePath | String? |  yes  | The file path of the company. |

---


 
 
 #### [ProductBulkResponse](#ProductBulkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |

---


 
 
 #### [InventoryBulkResponse](#InventoryBulkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | batchId | String? |  yes  |  |

---


 
 
 #### [ProductBulkRequestList](#ProductBulkRequestList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductBulkRequest](#ProductBulkRequest)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ProductBundleItem](#ProductBundleItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | allowRemove | Boolean? |  yes  |  |
 | autoAddToCart | Boolean? |  yes  |  |
 | autoSelect | Boolean? |  yes  |  |
 | maxQuantity | Integer |  no  |  |
 | minQuantity | Integer |  no  |  |
 | productUid | Integer |  no  |  |

---


 
 
 #### [ProductBundleRequest](#ProductBundleRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String |  no  |  |
 | companyId | String? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | pageVisibility | ArrayList<String>? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)> |  no  |  |
 | sameStoreAssignment | Boolean? |  yes  |  |
 | slug | String |  no  |  |

---


 
 
 #### [ProductBundleUpdateRequest](#ProductBundleUpdateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | choice | String |  no  |  |
 | companyId | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | pageVisibility | ArrayList<String>? |  yes  |  |
 | products | ArrayList<[ProductBundleItem](#ProductBundleItem)> |  no  |  |
 | sameStoreAssignment | Boolean? |  yes  |  |
 | slug | String |  no  |  |

---


 
 
 #### [ProductConfigurationDownloads](#ProductConfigurationDownloads)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | multivalue | Boolean? |  yes  |  |

---


 
 
 #### [ProductCreateUpdateSizesSchema](#ProductCreateUpdateSizesSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | size | String? |  yes  |  |
 | price | Double? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | priceTransfer | Double? |  yes  |  |
 | currency | String? |  yes  |  |
 | itemLength | Double? |  yes  |  |
 | itemWidth | Double? |  yes  |  |
 | itemHeight | Double? |  yes  |  |
 | itemWeight | Double? |  yes  |  |
 | itemDimensionsUnitOfMeasure | String? |  yes  |  |
 | itemWeightUnitOfMeasure | String? |  yes  |  |
 | trackInventory | Boolean? |  yes  |  |
 | identifiers | ArrayList<[GTIN](#GTIN)>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ProductCreateUpdateSchemaV2](#ProductCreateUpdateSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | String? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brandUid | Integer |  no  |  |
 | bulkJobId | String? |  yes  |  |
 | categorySlug | String |  no  |  |
 | changeRequestId | String? |  yes  |  |
 | companyId | Integer |  no  |  |
 | countryOfOrigin | String |  no  |  |
 | currency | String |  no  |  |
 | customOrder | [CustomOrder](#CustomOrder)? |  yes  |  |
 | departments | ArrayList<Integer> |  no  |  |
 | description | String? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | itemCode | String |  no  |  |
 | itemType | String |  no  |  |
 | media | ArrayList<[Media](#Media)>? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | name | String |  no  |  |
 | netQuantity | [NetQuantity](#NetQuantity)? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | productPublish | [ProductPublish1](#ProductPublish1)? |  yes  |  |
 | requester | String? |  yes  |  |
 | returnConfig | [ReturnConfig](#ReturnConfig) |  no  |  |
 | shortDescription | String? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | sizes | ArrayList<[ProductCreateUpdateSizesSchema](#ProductCreateUpdateSizesSchema)> |  no  |  |
 | slug | String |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | taxIdentifier | [TaxIdentifier](#TaxIdentifier) |  no  |  |
 | teaserTag | [TeaserTag](#TeaserTag)? |  yes  |  |
 | templateTag | String |  no  |  |
 | trader | ArrayList<[Trader](#Trader)> |  no  |  |
 | uid | Integer? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | variants | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductDetail](#ProductDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brand | [ProductBrand](#ProductBrand)? |  yes  |  |
 | color | String? |  yes  |  |
 | description | String? |  yes  |  |
 | groupedAttributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)>? |  yes  |  |
 | hasVariant | Boolean? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | medias | ArrayList<[Media](#Media)>? |  yes  |  |
 | name | String? |  yes  |  |
 | productOnlineDate | String? |  yes  |  |
 | promoMeta | HashMap<String,Object>? |  yes  |  |
 | rating | Double? |  yes  |  |
 | ratingCount | Integer? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | similars | ArrayList<String>? |  yes  |  |
 | slug | String |  no  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | tryouts | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [ProductDetailAttribute](#ProductDetailAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | details | ArrayList<[ProductDetailAttribute](#ProductDetailAttribute)>? |  yes  |  |
 | title | String? |  yes  |  |

---


 
 
 #### [PatchProductDownloadsDataResponse](#PatchProductDownloadsDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | taskId | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | url | String? |  yes  |  |
 | status | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | completedOn | String? |  yes  |  |

---


 
 
 #### [PatchProductDownloadsResponse](#PatchProductDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [PatchProductDownloadsDataResponse](#PatchProductDownloadsDataResponse)? |  yes  |  |

---


 
 
 #### [ProductDownloadFilters](#ProductDownloadFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<String> |  no  |  |
 | catalogueTypes | ArrayList<String> |  no  |  |
 | templates | ArrayList<String> |  no  |  |

---


 
 
 #### [CreateProductDownloadsDataResponse](#CreateProductDownloadsDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdOn | String? |  yes  |  |
 | type | String? |  yes  |  |
 | taskId | String? |  yes  |  |
 | filters | [ProductDownloadFilters](#ProductDownloadFilters)? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | id | String? |  yes  |  |
 | notificationEmails | ArrayList<Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | status | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | stats | [Stats](#Stats)? |  yes  |  |

---


 
 
 #### [CreateProductDownloadsResponse](#CreateProductDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [CreateProductDownloadsDataResponse](#CreateProductDownloadsDataResponse)? |  yes  |  |

---


 
 
 #### [GetProductDownloadsResponse](#GetProductDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | String? |  yes  |  |
 | url | String? |  yes  |  |
 | status | String? |  yes  |  |
 | completedOn | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | taskId | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [ProductDownloadsResponse](#ProductDownloadsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductTemplateExportResponse](#ProductTemplateExportResponse)>? |  yes  | The items of the job. |

---


 
 
 #### [ProductFilters](#ProductFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | [ProductFiltersKey](#ProductFiltersKey) |  no  |  |
 | values | ArrayList<[ProductFiltersValue](#ProductFiltersValue)> |  no  |  |

---


 
 
 #### [ProductFiltersKey](#ProductFiltersKey)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String |  no  |  |
 | kind | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | name | String |  no  |  |
 | operators | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ProductFiltersValue](#ProductFiltersValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | display | String |  no  |  |
 | displayFormat | String? |  yes  |  |
 | isSelected | Boolean |  no  |  |
 | max | Integer? |  yes  |  |
 | min | Integer? |  yes  |  |
 | queryFormat | String? |  yes  |  |
 | selectedMax | Integer? |  yes  |  |
 | selectedMin | Integer? |  yes  |  |
 | value | String |  no  |  |

---


 
 
 #### [ProductListingDetail](#ProductListingDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brand | [ProductBrand](#ProductBrand)? |  yes  |  |
 | color | String? |  yes  |  |
 | description | String? |  yes  |  |
 | discount | String? |  yes  |  |
 | groupedAttributes | ArrayList<[ProductDetailGroupedAttribute](#ProductDetailGroupedAttribute)>? |  yes  |  |
 | hasVariant | Boolean? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | medias | ArrayList<[Media](#Media)>? |  yes  |  |
 | name | String? |  yes  |  |
 | price | [ProductListingPrice](#ProductListingPrice)? |  yes  |  |
 | productOnlineDate | String? |  yes  |  |
 | promoMeta | HashMap<String,Object>? |  yes  |  |
 | rating | Double? |  yes  |  |
 | ratingCount | Integer? |  yes  |  |
 | sellable | Boolean? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | similars | ArrayList<String>? |  yes  |  |
 | slug | String |  no  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | tryouts | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | customMeta | ArrayList<String>? |  yes  |  |
 | action | [PageAction](#PageAction)? |  yes  |  |
 | isTryout | Boolean? |  yes  |  |
 | allCompanyIds | ArrayList<Integer>? |  yes  |  |
 | isCustomOrder | Boolean? |  yes  |  |
 | collections | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PageAction](#PageAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ActionObject](#ActionObject)? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ActionObject](#ActionObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | query | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductListingPrice](#ProductListingPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | [Price1](#Price1)? |  yes  |  |
 | marked | [Price1](#Price1)? |  yes  |  |

---


 
 
 #### [ProductListingResponse](#ProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Product](#Product)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ProductListingResponseV2](#ProductListingResponseV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductSchemaV2](#ProductSchemaV2)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ProductVerificationModel](#ProductVerificationModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rejectedFields | HashMap<String,Object>? |  yes  |  |
 | status | String? |  yes  |  |
 | brandUid | Integer? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | companyIds | ArrayList<Integer>? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | remark | String? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [ProductPublish](#ProductPublish)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSet | Boolean? |  yes  |  |
 | productOnlineDate | String? |  yes  |  |

---


 
 
 #### [ProductPublish1](#ProductPublish1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSet | Boolean? |  yes  |  |
 | productOnlineDate | String? |  yes  |  |

---


 
 
 #### [ProductPublished](#ProductPublished)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSet | Boolean? |  yes  |  |
 | productOnlineDate | Integer? |  yes  |  |

---


 
 
 #### [ProductReturnConfigSerializer](#ProductReturnConfigSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | onSameStore | Boolean? |  yes  |  |
 | storeUid | Integer? |  yes  |  |

---


 
 
 #### [ProductReturnConfigBaseSerializer](#ProductReturnConfigBaseSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean |  no  | Boolean Flag for item returnable |
 | time | Integer |  no  | Valid return time for an item |
 | unit | String |  no  | Unit of return config days\|hours |

---


 
 
 #### [CategorySubSchema](#CategorySubSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [CategoryProduct](#CategoryProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3 | [CategorySubSchema](#CategorySubSchema)? |  yes  |  |
 | l1 | [CategorySubSchema](#CategorySubSchema)? |  yes  |  |
 | l2 | [CategorySubSchema](#CategorySubSchema)? |  yes  |  |

---


 
 
 #### [ProductSchemaV2](#ProductSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | category | [CategoryProduct](#CategoryProduct)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | allCompanyIds | ArrayList<Integer>? |  yes  |  |
 | allIdentifiers | ArrayList<String>? |  yes  |  |
 | allSizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | brand | [Brand](#Brand)? |  yes  |  |
 | brandUid | Integer? |  yes  |  |
 | categorySlug | String? |  yes  |  |
 | categoryUid | Integer? |  yes  |  |
 | color | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | currency | String? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | description | String? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | images | ArrayList<[Image](#Image)>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | isPhysical | Boolean? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | l3Mapping | ArrayList<String>? |  yes  |  |
 | media | ArrayList<[Media](#Media)>? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | moq | HashMap<String,Object>? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | netQuantity | [NetQuantityResponse](#NetQuantityResponse)? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | pending | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | productPublish | [ProductPublish](#ProductPublish)? |  yes  |  |
 | returnConfig | [ReturnConfigResponse](#ReturnConfigResponse)? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | sizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | slug | String? |  yes  |  |
 | stage | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | taxIdentifier | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | trader | ArrayList<[Trader](#Trader)>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | variants | HashMap<String,Object>? |  yes  |  |
 | verifiedBy | [VerifiedBy](#VerifiedBy)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |

---


 
 
 #### [ProductSize](#ProductSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer |  no  |  |
 | min | Integer |  no  |  |

---


 
 
 #### [ProductSizeDeleteDataResponse](#ProductSizeDeleteDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | size | String? |  yes  |  |

---


 
 
 #### [ProductSizeDeleteResponse](#ProductSizeDeleteResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ProductSizeDeleteDataResponse](#ProductSizeDeleteDataResponse)? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ProductSortOn](#ProductSortOn)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSelected | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |
 | display | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [ProductSortOnv2](#ProductSortOnv2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isSelected | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |
 | display | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [ProductTagsViewResponse](#ProductTagsViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ProductTemplate](#ProductTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | isExpirable | Boolean |  no  |  |
 | isPhysical | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | id | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | tag | String? |  yes  |  |

---


 
 
 #### [ProductTemplateDownloadsExport](#ProductTemplateDownloadsExport)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [ProductTemplateExportFilterRequest](#ProductTemplateExportFilterRequest)? |  yes  | This is the filters of the file for the export. |
 | notificationEmails | ArrayList<String>? |  yes  | The list of the emails to be notified after the completion of the job. |
 | type | String? |  yes  | This is the type of the file for the export. |

---


 
 
 #### [ProductTemplateExportFilterRequest](#ProductTemplateExportFilterRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brands | ArrayList<String>? |  yes  | The list of the brands that needs to be exported. |
 | catalogueTypes | ArrayList<String> |  no  | The list of the type of the catalog such as set, standard and composite. |
 | fromDate | String? |  yes  | The modified on date from which the data needs to be exported. |
 | templates | ArrayList<String> |  no  | The list of the templates that needs to be exported. |
 | toDate | String? |  yes  | The modified on date till when the data needs to be exported. |

---


 
 
 #### [ProductTemplateExportResponse](#ProductTemplateExportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | triggerOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | templateTags | HashMap<String,Object>? |  yes  |  |
 | completedOn | String? |  yes  | Completion datetime of the job |
 | createdBy | [UserInfo1](#UserInfo1)? |  yes  | The user that created the job. |
 | filters | HashMap<String,Object>? |  yes  | The filters that needs to be exported. |
 | modifiedOn | String? |  yes  | Modification date of the job |
 | notificationEmails | ArrayList<String>? |  yes  | The notification emails for the job. |
 | sellerId | Integer |  no  | The seller id that needs to be exported. |
 | status | String? |  yes  | The status of the job. |
 | taskId | String |  no  | The task id of the job. |
 | type | String? |  yes  | The type of file that needs to be exported. |
 | url | String? |  yes  | The filters that needs to be exported. |

---


 
 
 #### [ProductVariants](#ProductVariants)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandUid | Integer? |  yes  |  |
 | categoryUid | Integer? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | media | ArrayList<[Media](#Media)>? |  yes  |  |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [CompanyVerificationStats](#CompanyVerificationStats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Integer? |  yes  |  |

---


 
 
 #### [CompanyVerificationResponse](#CompanyVerificationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | stats | [CompanyVerificationStats](#CompanyVerificationStats)? |  yes  |  |

---


 
 
 #### [ProductVariantsResponse](#ProductVariantsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | variants | ArrayList<[ProductVariants](#ProductVariants)>? |  yes  |  |

---


 
 
 #### [Properties](#Properties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandUid | HashMap<String,Object>? |  yes  |  |
 | categorySlug | HashMap<String,Object>? |  yes  |  |
 | command | HashMap<String,Object>? |  yes  |  |
 | countryOfOrigin | HashMap<String,Object>? |  yes  |  |
 | currency | HashMap<String,Object>? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |
 | description | HashMap<String,Object>? |  yes  |  |
 | highlights | HashMap<String,Object>? |  yes  |  |
 | hsnCode | HashMap<String,Object>? |  yes  |  |
 | isActive | HashMap<String,Object>? |  yes  |  |
 | isDependent | HashMap<String,Object>? |  yes  |  |
 | itemCode | HashMap<String,Object>? |  yes  |  |
 | itemType | HashMap<String,Object>? |  yes  |  |
 | media | HashMap<String,Object>? |  yes  |  |
 | multiSize | HashMap<String,Object>? |  yes  |  |
 | name | HashMap<String,Object>? |  yes  |  |
 | noOfBoxes | HashMap<String,Object>? |  yes  |  |
 | productGroupTag | HashMap<String,Object>? |  yes  |  |
 | productPublish | HashMap<String,Object>? |  yes  |  |
 | returnConfig | HashMap<String,Object>? |  yes  |  |
 | shortDescription | HashMap<String,Object>? |  yes  |  |
 | sizeGuide | HashMap<String,Object>? |  yes  |  |
 | sizes | HashMap<String,Object>? |  yes  |  |
 | slug | HashMap<String,Object>? |  yes  |  |
 | tags | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | trader | HashMap<String,Object>? |  yes  |  |
 | traderType | HashMap<String,Object>? |  yes  |  |
 | variants | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Quantities](#Quantities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | damaged | [QuantityBase](#QuantityBase)? |  yes  |  |
 | notAvailable | [QuantityBase](#QuantityBase)? |  yes  |  |
 | orderCommitted | [QuantityBase](#QuantityBase)? |  yes  |  |
 | sellable | [QuantityBase](#QuantityBase)? |  yes  |  |

---


 
 
 #### [QuantitiesArticle](#QuantitiesArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | damaged | [Quantity](#Quantity)? |  yes  |  |
 | notAvailable | [Quantity](#Quantity)? |  yes  |  |
 | orderCommitted | [Quantity](#Quantity)? |  yes  |  |
 | sellable | [Quantity](#Quantity)? |  yes  |  |

---


 
 
 #### [Quantity](#Quantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer? |  yes  |  |

---


 
 
 #### [QuantityBase](#QuantityBase)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | count | Integer? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean |  no  |  |
 | time | Integer? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [ReturnConfig1](#ReturnConfig1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  | Indicates if the item is returnable. |
 | time | Integer? |  yes  | The return time in days or hours. |
 | unit | String? |  yes  | The unit of return time. |

---


 
 
 #### [ReturnConfig2](#ReturnConfig2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  |  |
 | time | Integer? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [ReturnConfigResponse](#ReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  |  |
 | time | Integer? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [Sitemap](#Sitemap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority | Double? |  yes  |  |
 | frequency | String? |  yes  |  |

---


 
 
 #### [ApplicationItemSeoAction](#ApplicationItemSeoAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Object>? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ApplicationItemSeoBreadcrumbs](#ApplicationItemSeoBreadcrumbs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | action | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ApplicationItemSeoMetaTagItem](#ApplicationItemSeoMetaTagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [ApplicationItemSeoMetaTags](#ApplicationItemSeoMetaTags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | items | ArrayList<[ApplicationItemSeoMetaTagItem](#ApplicationItemSeoMetaTagItem)>? |  yes  |  |

---


 
 
 #### [Metatags](#Metatags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | items | ArrayList<[ApplicationItemSeoMetaTags](#ApplicationItemSeoMetaTags)>? |  yes  |  |

---


 
 
 #### [SizePromotionThreshold](#SizePromotionThreshold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | thresholdType | String? |  yes  |  |
 | thresholdValue | Integer? |  yes  |  |

---


 
 
 #### [SEOData](#SEOData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  |  |
 | title | String? |  yes  |  |
 | sitemap | [Sitemap](#Sitemap)? |  yes  |  |
 | breadcrumbs | ArrayList<[ApplicationItemSeoBreadcrumbs](#ApplicationItemSeoBreadcrumbs)>? |  yes  |  |
 | metaTags | ArrayList<[Metatags](#Metatags)>? |  yes  |  |
 | canonicalUrl | String? |  yes  |  |

---


 
 
 #### [SearchKeywordResult](#SearchKeywordResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | query | HashMap<String,Object> |  no  |  |
 | sortOn | String |  no  |  |

---


 
 
 #### [SearchableAttribute](#SearchableAttribute)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  | The attribute key to search on. This key matches the solr document key |
 | name | String |  no  | The name of key to search on. This is for displaying purposes on platform |
 | priority | Double |  no  | Order in which the searchable attribute should kick in. Higher the priority, higher the weight considered while searching |

---


 
 
 #### [SecondLevelChild](#SecondLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | [Action](#Action)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | childs | ArrayList<[ThirdLevelChild](#ThirdLevelChild)>? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [SellerPhoneNumber](#SellerPhoneNumber)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Integer |  no  |  |
 | number | String |  no  |  |

---


 
 
 #### [SitemapDetail](#SitemapDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority | Double? |  yes  |  |
 | frequency | String? |  yes  |  |

---


 
 
 #### [SeoDetail](#SeoDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  |  |
 | title | String? |  yes  |  |
 | sitemap | [SitemapDetail](#SitemapDetail)? |  yes  |  |
 | breadcrumbs | ArrayList<[ApplicationItemSeoBreadcrumbs](#ApplicationItemSeoBreadcrumbs)>? |  yes  |  |
 | metaTags | ArrayList<[Metatags](#Metatags)>? |  yes  |  |
 | canonicalUrl | String? |  yes  |  |

---


 
 
 #### [SetSize](#SetSize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pieces | Integer |  no  |  |
 | size | String |  no  |  |

---


 
 
 #### [SingleCategoryResponse](#SingleCategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Category](#Category)? |  yes  |  |

---


 
 
 #### [VariantTypesResponse](#VariantTypesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[VariantTypeItem](#VariantTypeItem)>? |  yes  |  |

---


 
 
 #### [VariantTypeItem](#VariantTypeItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  | Name of the item |
 | key | String? |  yes  | Key of the item |
 | type | ArrayList<String>? |  yes  | Array of item types |
 | imageConfig | HashMap<String,Object>? |  yes  | Configuration for the image |

---


 
 
 #### [SingleProductResponse](#SingleProductResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [ProductSchemaV2](#ProductSchemaV2)? |  yes  |  |

---


 
 
 #### [Size](#Size)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | isAvailable | Boolean? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [SizeDistribution](#SizeDistribution)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizes | ArrayList<[SetSize](#SetSize)> |  no  |  |

---


 
 
 #### [SizeGuideResponse](#SizeGuideResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | image | String? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the size guide. |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who modified the size guide. |
 | active | Boolean? |  yes  |  |
 | brandId | Integer? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | guide | HashMap<String,Object>? |  yes  |  |
 | id | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | tag | String? |  yes  |  |
 | title | String? |  yes  |  |

---


 
 
 #### [StoreAssignResponse](#StoreAssignResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | items | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [Time](#Time)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hour | Integer? |  yes  |  |
 | minute | Integer? |  yes  |  |

---


 
 
 #### [Timing](#Timing)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | closing | [Time](#Time)? |  yes  |  |
 | weekday | String? |  yes  |  |
 | opening | [Time](#Time)? |  yes  |  |
 | open | Boolean? |  yes  |  |

---


 
 
 #### [StoreItem](#StoreItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stage | String? |  yes  |  |
 | name | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | modifiedBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | manager | [Manager](#Manager)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | verifiedBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | integrationType | [IntegrationType](#IntegrationType)? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | address | [Address](#Address)? |  yes  |  |
 | createdBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | timing | ArrayList<[Timing](#Timing)>? |  yes  |  |
 | storeType | String? |  yes  |  |

---


 
 
 #### [UserSchemaCustom](#UserSchemaCustom)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [Manager](#Manager)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobileNo | [MobileNo](#MobileNo)? |  yes  |  |

---


 
 
 #### [MobileNo](#MobileNo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | Integer? |  yes  |  |
 | number | String? |  yes  |  |

---


 
 
 #### [IntegrationType](#IntegrationType)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | String? |  yes  |  |
 | inventory | String? |  yes  |  |

---


 
 
 #### [Address](#Address)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | city | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | country | String? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | landmark | String? |  yes  |  |
 | state | String? |  yes  |  |

---


 
 
 #### [StoreDetail](#StoreDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalContacts | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | storeType | String? |  yes  |  |
 | timing | ArrayList<[Timing](#Timing)>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | stage | String? |  yes  |  |
 | modifiedBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | manager | [Manager](#Manager)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | verifiedBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | integrationType | [IntegrationType](#IntegrationType)? |  yes  |  |
 | documents | ArrayList<[Document](#Document)>? |  yes  |  |
 | address | [Address](#Address)? |  yes  |  |
 | createdBy | [UserSchemaCustom](#UserSchemaCustom)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [StoreMeta](#StoreMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer |  no  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SuccessResponse1](#SuccessResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [TaxIdentifier](#TaxIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hsnCode | String? |  yes  |  |
 | hsnCodeId | String? |  yes  |  |
 | reportingHsn | String? |  yes  |  |

---


 
 
 #### [TaxSlab](#TaxSlab)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cess | Double? |  yes  |  |
 | effectiveDate | String |  no  |  |
 | rate | Double |  no  |  |
 | threshold | Double |  no  |  |

---


 
 
 #### [TeaserTag](#TeaserTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [TemplateDetails](#TemplateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | id | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | isExpirable | Boolean |  no  |  |
 | isPhysical | Boolean |  no  |  |
 | logo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | tag | String? |  yes  |  |

---


 
 
 #### [TemplateValidationData](#TemplateValidationData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | globalValidation | [GlobalValidation](#GlobalValidation)? |  yes  |  |
 | templateValidation | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [TemplatesResponse](#TemplatesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductTemplate](#ProductTemplate)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [TemplatesValidationResponse](#TemplatesValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [TemplateValidationData](#TemplateValidationData)? |  yes  |  |
 | templateDetails | [TemplateDetails](#TemplateDetails)? |  yes  |  |

---


 
 
 #### [ThirdLevelChild](#ThirdLevelChild)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | [Action](#Action)? |  yes  |  |
 | banners | [ImageUrls](#ImageUrls)? |  yes  |  |
 | childs | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [Trader](#Trader)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [Trader1](#Trader1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | ArrayList<String> |  no  |  |
 | name | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [Trader2](#Trader2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [UpdateCollection](#UpdateCollection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | action | [Action](#Action)? |  yes  |  |
 | uid | String? |  yes  |  |
 | appId | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | localeLanguage | HashMap<String,Object>? |  yes  |  |
 | schedule | [CollectionSchedule](#CollectionSchedule)? |  yes  |  |
 | allowFacets | Boolean? |  yes  |  |
 | allowSort | Boolean? |  yes  |  |
 | badge | [CollectionBadge](#CollectionBadge)? |  yes  |  |
 | banners | [CollectionBanner](#CollectionBanner)? |  yes  |  |
 | description | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | isVisible | Boolean? |  yes  |  |
 | logo | [CollectionImage](#CollectionImage)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | modifiedBy | String? |  yes  | User info. |
 | name | String? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | published | Boolean? |  yes  |  |
 | query | ArrayList<[CollectionQuery](#CollectionQuery)>? |  yes  |  |
 | seo | [SeoDetail](#SeoDetail)? |  yes  |  |
 | slug | String? |  yes  |  |
 | sortOn | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | visibleFacetsKeys | ArrayList<String>? |  yes  |  |

---


 
 
 #### [UpdateSearchConfigurationRequest](#UpdateSearchConfigurationRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String |  no  | The application id where custom search configuration is set |
 | companyId | Integer |  no  | The company id where custom search configuration is set |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  | The user who created the search configuration. |
 | createdOn | String? |  yes  | The date and time when the search configuration was created. |
 | isProximityEnabled | Boolean? |  yes  | Flag indicating if proximity search is enabled for this attribute. |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  | The user who modified the search configuration. |
 | modifiedOn | String? |  yes  | The date and time when the search configuration was last modified. |
 | proximity | Integer? |  yes  | Proximity distance configuration |
 | searchableAttributes | ArrayList<[SearchableAttribute](#SearchableAttribute)>? |  yes  | The searchable attributes defined on the application. |

---


 
 
 #### [UpdateSearchConfigurationResponse](#UpdateSearchConfigurationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [UpdatedResponse](#UpdatedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemsNotUpdated | ArrayList<Integer>? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [UserCommon](#UserCommon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [UserDetail](#UserDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  | The contact details of the user. |
 | superUser | Boolean? |  yes  | A flag indicating whether the user is a super user. |
 | userId | String |  no  | The user ID of the user. |
 | username | String |  no  | The username of the user. |

---


 
 
 #### [UserDetail1](#UserDetail1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fullName | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [UserInfo1](#UserInfo1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  | The email address of the user. |
 | uid | String? |  yes  | The unique ID of the user. |
 | userId | String? |  yes  | The ID of the user. |
 | username | String? |  yes  | The username of the user. |

---


 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  | The contact information of the user. |
 | userId | String? |  yes  | The unique ID of the user. |
 | username | String? |  yes  | The username of the user. |

---


 
 
 #### [UserSerializer1](#UserSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | contact | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [UserSerializer2](#UserSerializer2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [UserSerializer3](#UserSerializer3)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [ValidateIdentifier](#ValidateIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gtinType | String |  no  |  |
 | gtinValue | String |  no  |  |
 | primary | Boolean? |  yes  |  |

---


 
 
 #### [ValidateProduct](#ValidateProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valid | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ValidateSizeGuide](#ValidateSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | active | Boolean? |  yes  |  |
 | brandId | Integer? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | description | String? |  yes  |  |
 | guide | [Guide](#Guide)? |  yes  |  |
 | id | String? |  yes  |  |
 | image | String? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | subtitle | String? |  yes  |  |
 | tag | String? |  yes  |  |
 | title | String |  no  |  |

---


 
 
 #### [VerifiedBy](#VerifiedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [WeightResponse](#WeightResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean |  no  | Indicates if it is the default weight. |
 | shipping | Double |  no  | The shipping weight. |
 | unit | String |  no  | The unit of weight. |

---


 
 
 #### [WeightResponse1](#WeightResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipping | Double? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [CreatedBy](#CreatedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [Marketplaces](#Marketplaces)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | appId | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | optLevel | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | platforms | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [GetAllMarketplaces](#GetAllMarketplaces)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Marketplaces](#Marketplaces)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CreateMarketplaceOptinRequest](#CreateMarketplaceOptinRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | optLevel | Integer? |  yes  |  |
 | platform | String? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [UpdateMarketplaceOptinRequest](#UpdateMarketplaceOptinRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | optLevel | Integer? |  yes  |  |
 | platform | String? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [CreateMarketplaceOptinResponse](#CreateMarketplaceOptinResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | optLevel | String? |  yes  |  |
 | platform | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | appId | String? |  yes  |  |

---


 
 
 #### [GetProductTemplateSlugItems](#GetProductTemplateSlugItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | tag | String? |  yes  |  |
 | isPhysical | Boolean? |  yes  |  |
 | description | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [GetProductTemplateSlugResponse](#GetProductTemplateSlugResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | items | ArrayList<[GetProductTemplateSlugItems](#GetProductTemplateSlugItems)>? |  yes  |  |

---


 
 
 #### [UpdateMarketplaceOptinResponse](#UpdateMarketplaceOptinResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | appId | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |
 | optLevel | String? |  yes  |  |
 | platform | String? |  yes  |  |
 | storeIds | ArrayList<Integer>? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |

---


 
 
 #### [AutocompleteRequestSchema](#AutocompleteRequestSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | querySuggestion | HashMap<String,Object>? |  yes  |  |
 | productSuggestion | HashMap<String,Object>? |  yes  |  |
 | collectionSuggestion | HashMap<String,Object>? |  yes  |  |
 | brandSuggestion | HashMap<String,Object>? |  yes  |  |
 | categorySuggestion | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AutocompleteUpsertResponseSchema](#AutocompleteUpsertResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | id | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [AutocompleteErrorResponseSchema](#AutocompleteErrorResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [AutocompleteResponseSchema](#AutocompleteResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | querySuggestion | HashMap<String,Object>? |  yes  |  |
 | productSuggestion | HashMap<String,Object>? |  yes  |  |
 | collectionSuggestion | HashMap<String,Object>? |  yes  |  |
 | brandSuggestion | HashMap<String,Object>? |  yes  |  |
 | categorySuggestion | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductListingActionPage](#ProductListingActionPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | query | HashMap<String,Object>? |  yes  |  |
 | params | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ProductListingAction](#ProductListingAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | page | [ProductListingActionPage](#ProductListingActionPage)? |  yes  |  |

---


 
 
 #### [AutocompleteItem](#AutocompleteItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Media](#Media)? |  yes  |  |
 | display | String? |  yes  |  |
 | type | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | action | [ProductListingAction](#ProductListingAction)? |  yes  |  |

---


 
 
 #### [AutocompletePreviewResponseSchema](#AutocompletePreviewResponseSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AutocompleteItem](#AutocompleteItem)>? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryRequest](#CreateAppPriceFactoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departments | ArrayList<Integer>? |  yes  |  |
 | factoryType | String? |  yes  |  |
 | factoryTypeIds | ArrayList<String>? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryResponse](#CreateAppPriceFactoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | factoryType | String? |  yes  |  |
 | factoryTypeIds | ArrayList<String>? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [AppPriceFactory](#AppPriceFactory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | factoryType | String? |  yes  |  |
 | factoryTypeIds | ArrayList<Integer>? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [EditAppPriceFactoryRequest](#EditAppPriceFactoryRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departments | ArrayList<String>? |  yes  |  |
 | factoryType | String? |  yes  |  |
 | factoryTypeIds | ArrayList<Integer>? |  yes  |  |
 | code | String? |  yes  |  |
 | name | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [GetAppPriceFactoryResponse](#GetAppPriceFactoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AppPriceFactory](#AppPriceFactory)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProduct](#CreateAppPriceFactoryProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | Integer? |  yes  |  |
 | brand | String? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |

---


 
 
 #### [PriceFactorySizes](#PriceFactorySizes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizeName | String? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | markedPrice | Double? |  yes  |  |
 | sellingPrice | Double? |  yes  |  |
 | currency | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [CompanySizes](#CompanySizes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizeName | String? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | markedPrice | Double? |  yes  |  |
 | sellingPrice | Double? |  yes  |  |
 | currency | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductResponse](#CreateAppPriceFactoryProductResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | Integer? |  yes  |  |
 | itemName | String? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | brand | String? |  yes  |  |
 | category | String? |  yes  |  |
 | factoryTypeId | ArrayList<String>? |  yes  |  |
 | media | Object? |  yes  |  |
 | sizes | Object? |  yes  |  |
 | companySizes | Object? |  yes  |  |

---


 
 
 #### [UpdateAppPriceFactoryProductRequest](#UpdateAppPriceFactoryProductRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sizes | Object? |  yes  |  |

---


 
 
 #### [UpdateAppPriceFactoryProductResponse](#UpdateAppPriceFactoryProductResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | Integer? |  yes  |  |
 | zoneId | String? |  yes  |  |
 | media | Object? |  yes  |  |
 | companySizes | Object? |  yes  |  |
 | sizes | Object? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductRequest](#CreateAppPriceFactoryProductRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CreateAppPriceFactoryProduct](#CreateAppPriceFactoryProduct)>? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductsResponse](#CreateAppPriceFactoryProductsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CreateAppPriceFactoryProductResponse](#CreateAppPriceFactoryProductResponse)>? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductBulkJobRequest](#CreateAppPriceFactoryProductBulkJobRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filePath | String? |  yes  |  |
 | fileType | String? |  yes  |  |
 | jobType | String? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductBulkJobResponse](#CreateAppPriceFactoryProductBulkJobResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | jobId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | createdOn | Object? |  yes  |  |
 | modifiedOn | Object? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |

---


 
 
 #### [CreateAppPriceFactoryProductBulkJobPollResponse](#CreateAppPriceFactoryProductBulkJobPollResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | totalRecords | Integer? |  yes  |  |
 | successRecords | Integer? |  yes  |  |
 | failedRecords | Integer? |  yes  |  |
 | errorFile | String? |  yes  |  |
 | createdOn | Object? |  yes  |  |
 | modifiedOn | Object? |  yes  |  |
 | createdBy | [CreatedBy](#CreatedBy)? |  yes  |  |
 | modifiedBy | [CreatedBy](#CreatedBy)? |  yes  |  |

---




### Enums





 #### [PageType](#PageType)
 Type : string

 | Name | Value | Description |
 | ---- | ----- | ----------- |
 | aboutUs | about-us | Symbolic link for About Us: /about-us |
 | addresses | addresses | Symbolic link for Saved Addresses: /profile/address |
 | blog | blog | Symbolic link for Blog: /blog/:slug |
 | brands | brands | Symbolic link for Brands: /brands/:department |
 | cards | cards | Symbolic link for Saved Cards: /profile/my-cards |
 | cart | cart | Symbolic link for Cart: /cart/bag/ |
 | categories | categories | Symbolic link for Categories: /categories/:department |
 | brand | brand | Symbolic link for Brand: /brand/:slug |
 | category | category | Symbolic link for Category: /category/:slug |
 | collection | collection | Symbolic link for Collection: /collection/:slug |
 | collections | collections | Symbolic link for Collections: /collections/ |
 | contactUs | contact-us | Symbolic link for Contact Us: /contact-us/ |
 | external | external | Symbolic link for External Link: /external/ |
 | faq | faq | Symbolic link for FAQ: /faq |
 | freshchat | freshchat | Symbolic link for Chat by Freshchat: /freshchat |
 | home | home | Symbolic link for Home: / |
 | notificationSettings | notification-settings | Symbolic link for Notification Settings: /notification-settings |
 | orders | orders | Symbolic link for Orders: /profile/orders |
 | page | page | Symbolic link for Page: /page/:slug |
 | policy | policy | Symbolic link for Privacy Policy: /privacy-policy |
 | product | product | Symbolic link for Product: /product/:slug |
 | productRequest | product-request | Symbolic link for Product Request: /product-request/ |
 | products | products | Symbolic link for Products: /products/ |
 | profile | profile | Symbolic link for Profile: /profile |
 | profileOrderShipment | profile-order-shipment | Symbolic link for profile orders shipment: /profile/orders/shipment/:shipmentid |
 | profileBasic | profile-basic | Symbolic link for Basic Profile: /profile/details |
 | profileCompany | profile-company | Symbolic link for Profile Company: /profile/company |
 | profileEmails | profile-emails | Symbolic link for Profile Emails: /profile/email |
 | profilePhones | profile-phones | Symbolic link for Profile Phones: /profile/phone |
 | rateUs | rate-us | Symbolic link for Rate Us: /rate-us |
 | referEarn | refer-earn | Symbolic link for Refer & Earn: /profile/refer-earn |
 | settings | settings | Symbolic link for Settings: /setting/currency |
 | sharedCart | shared-cart | Symbolic link for Shared Cart: /shared-cart/:token |
 | tnc | tnc | Symbolic link for Terms and Conditions: /terms-and-conditions |
 | trackOrder | track-order | Symbolic link for Track Order: /order-tracking/:orderId |
 | wishlist | wishlist | Symbolic link for Wishlist: /wishlist/ |
 | sections | sections | Symbolic link for Sections: /sections/:group |
 | form | form | Symbolic link for Form: /form/:slug |
 | cartDelivery | cart-delivery | Symbolic link for Cart Delivery: /cart/delivery |
 | cartPayment | cart-payment | Symbolic link for Cart Payment Information: /cart/payment-info |
 | cartReview | cart-review | Symbolic link for Cart Order Review: /cart/order-review |
 | login | login | Symbolic link for Login: /auth/login |
 | register | register | Symbolic link for Register: /auth/register |
 | shippingPolicy | shipping-policy | Symbolic link for Shipping policy: /shipping-policy |
 | returnPolicy | return-policy | Symbolic link for Return policy: /return-policy |
 | orderStatus | order-status | Symbolic link for Order status: /cart/order-status |

---





