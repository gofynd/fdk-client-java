



##### [Back to Admin docs](./README.md)

## Catalog Methods
Catalog - Administrator Front API's API's allows you to access list of products, prices, seller details, similar features, variants and many more useful features. 
* [listCategories](#listcategories)
* [createCategories](#createcategories)
* [getCategoryData](#getcategorydata)
* [updateCategory](#updatecategory)
* [getDepartment](#getdepartment)
* [updateDepartment](#updatedepartment)
* [listDepartments](#listdepartments)
* [createDepartment](#createdepartment)
* [getFilterAttributesPriority](#getfilterattributespriority)
* [setFilterAttributesPriority](#setfilterattributespriority)
* [getAttributeGroupsPriority](#getattributegroupspriority)
* [setAttributeGroupsPriority](#setattributegroupspriority)
* [getProductAttributeGroup](#getproductattributegroup)
* [updateProductAttributeGroup](#updateproductattributegroup)
* [listProductAttributesGroups](#listproductattributesgroups)
* [createProductAttributeGroup](#createproductattributegroup)
* [listProductAttributes](#listproductattributes)
* [createProductAttribute](#createproductattribute)
* [getProductAttribute](#getproductattribute)
* [updateProductAttribute](#updateproductattribute)
* [listVariants](#listvariants)
* [createVariant](#createvariant)
* [getVariantByUID](#getvariantbyuid)
* [updateVariant](#updatevariant)
* [listProductTemplate](#listproducttemplate)
* [getProductTemplateList](#getproducttemplatelist)
* [deleteProductTemplate](#deleteproducttemplate)
* [updateProductTemplate](#updateproducttemplate)
* [getProductTemplate](#getproducttemplate)
* [downloadProductTemplateViews](#downloadproducttemplateviews)
* [validateProductTemplate](#validateproducttemplate)
* [getProducts](#getproducts)
* [createProduct](#createproduct)
* [getProduct](#getproduct)
* [deleteProduct](#deleteproduct)
* [editProduct](#editproduct)
* [verifyCompany](#verifycompany)
* [listProductVerification](#listproductverification)
* [getProductVerificationDetails](#getproductverificationdetails)
* [verifyProduct](#verifyproduct)
* [getSizeGuides](#getsizeguides)
* [createSizeGuide](#createsizeguide)
* [getSizeGuide](#getsizeguide)
* [updateSizeGuide](#updatesizeguide)
* [getAppProducts](#getappproducts)
* [listBulkImportJobs](#listbulkimportjobs)
* [createBulkImportJob](#createbulkimportjob)
* [getBulkImportJob](#getbulkimportjob)
* [updateBulkImportJob](#updatebulkimportjob)
* [listBulkExportJobs](#listbulkexportjobs)
* [createBulkExportJob](#createbulkexportjob)
* [getBulkExportJob](#getbulkexportjob)
* [updateBulkExportJob](#updatebulkexportjob)
* [getImportValidationSchema](#getimportvalidationschema)
* [downloadImportFile](#downloadimportfile)
* [getAllHsnCodes](#getallhsncodes)
* [createHsnCodev2](#createhsncodev2)
* [getSingleHSNCode](#getsinglehsncode)
* [updateHsnCode](#updatehsncode)



## Methods with example and description


### listCategories
Get product categories list




```java
catalog.listCategories( level,  department,  q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| level | String? | no | Get category for multiple levels |   
| department | Integer? | no | Get category for multiple departments filtered |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets meta associated to product categories.

*Returned Response:*




[CategoryResponse](#CategoryResponse)

Category Meta. See example below or refer `CategoryResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "page": {
    "current": 1,
    "size": 58,
    "has_previous": false,
    "has_next": true,
    "item_total": 574
  },
  "items": [
    {
      "name": "Air Conditioners",
      "media": {
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png",
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/_7GDi3tyi-.png"
      },
      "marketplaces": {},
      "tryouts": [],
      "is_active": true,
      "created_by": {
        "username": "917972410891_48194",
        "user_id": "5646"
      },
      "uid": 22330,
      "slug": "air-conditioners",
      "priority": 1,
      "synonyms": [],
      "modified_by": {
        "username": "917972410891_48194",
        "user_id": "5646"
      },
      "level": 3,
      "hierarchy": [
        {
          "l1": 1,
          "department": 1,
          "l2": 22329
        }
      ],
      "created_on": "2021-04-02T15:43:59.410000Z",
      "departments": [
        1
      ],
      "modified_on": "2021-04-02T15:43:59.410000Z",
      "id": "60673bbf7896da00017885ad"
    },
    {
      "name": "Home Appliances",
      "media": {
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png",
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/_7GDi3tyi-.png"
      },
      "is_active": true,
      "created_by": {
        "username": "917972410891_48194",
        "user_id": "5646"
      },
      "uid": 22329,
      "slug": "home-appliances",
      "priority": 1,
      "synonyms": [],
      "modified_by": {
        "username": "917972410891_48194",
        "user_id": "5646"
      },
      "level": 2,
      "hierarchy": [],
      "created_on": "2021-04-02T15:42:55.405000Z",
      "departments": [
        1
      ],
      "modified_on": "2021-04-02T15:42:55.405000Z",
      "id": "60673b7f7896da00017885ac"
    },
    {
      "created_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "slug": "dummy-category-level-2",
      "level": 2,
      "uid": 22323,
      "is_active": true,
      "media": {
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png",
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png"
      },
      "name": "Dummy category level 2 by fahim",
      "modified_on": "2021-03-04T15:43:50.495000Z",
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
      },
      "synonyms": [
        "skin",
        "care",
        "asdasd"
      ],
      "created_on": "2021-01-14T05:28:02.148000Z",
      "priority": 123456,
      "hierarchy": [],
      "departments": [
        21
      ],
      "id": "5fffd662e64eb40001fc8a42"
    },
    {
      "synonyms": [],
      "marketplaces": {},
      "created_on": "2021-02-25T00:00:47.589000Z",
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
      },
      "media": {
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png"
      },
      "modified_on": "2021-03-04T15:39:52.108000Z",
      "hierarchy": [
        {
          "l2": 22323,
          "l1": 22322,
          "department": 21
        }
      ],
      "name": "Dummy level 4",
      "is_active": true,
      "slug": "dummy-level-4",
      "departments": [
        21
      ],
      "level": 3,
      "tryouts": [],
      "uid": 22325,
      "priority": 986532,
      "created_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "id": "60369b57d23031d14be92c18"
    },
    {
      "created_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "slug": "dummy-level-3",
      "level": 3,
      "uid": 22324,
      "is_active": true,
      "media": {
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png"
      },
      "name": "Dummy level 3 by fahim",
      "tryouts": [
        "Lipstick",
        "Eyeliner"
      ],
      "modified_on": "2021-03-04T15:39:46.246000Z",
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
      },
      "synonyms": [],
      "marketplaces": {},
      "created_on": "2021-01-14T05:28:59.852000Z",
      "priority": 986532,
      "hierarchy": [
        {
          "l2": 22323,
          "l1": 22322,
          "department": 21
        },
        {
          "l2": 3732,
          "l1": 3672,
          "department": 4
        },
        {
          "l2": 730,
          "l1": 595,
          "department": 2
        }
      ],
      "departments": [
        2,
        4,
        21
      ],
      "id": "5fffd69be64eb40001fc8a65"
    },
    {
      "uid": 3151,
      "departments": [
        4
      ],
      "is_active": true,
      "level": 1,
      "media": {
        "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/YHIeoQ_fruit___vegetable_logo.jpg16aab608-a78a-458f-b60b-524525f27dec/YHIeoQ_fruit___vegetable_logo.jpg",
        "portrait": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
        "landscape": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg"
      },
      "name": "Gourmet & World Food",
      "priority": 123,
      "slug": "gourmet-world-food",
      "synonyms": [
        "gourmet & world food",
        "food",
        "gourmet"
      ],
      "created_on": "2016-04-09T06:44:35Z",
      "hierarchy": [],
      "modified_by": {
        "username": "917753852478_51632",
        "uid": "5677"
      },
      "modified_on": "2021-03-03T09:35:50.415000Z",
      "id": "5fabab8ea18a1284b97ff6c4"
    },
    {
      "modified_by": {
        "username": "917753852478_51632",
        "uid": "5677"
      },
      "marketplaces": {},
      "hierarchy": [
        {
          "l1": 595,
          "l2": 714,
          "department": 2
        },
        {
          "l1": 2,
          "l2": 4,
          "department": 1
        }
      ],
      "created_on": "2021-03-03T06:30:08.342000Z",
      "created_by": {
        "username": "917753852478_51632",
        "uid": "5677"
      },
      "level": 3,
      "name": "Test Category kaf",
      "media": {
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/VKqwRngFh-.png"
      },
      "tryouts": [
        "Lipstick",
        "Blush"
      ],
      "is_active": true,
      "slug": "test-category-kaf",
      "uid": 22328,
      "synonyms": [
        "test",
        "category"
      ],
      "priority": 23,
      "departments": [
        1,
        2
      ],
      "modified_on": "2021-03-03T08:34:47.999000Z",
      "id": "603f2cf0aac0360001c00731"
    },
    {
      "level": 3,
      "departments": [
        1
      ],
      "is_active": false,
      "created_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "created_on": "2021-02-25T09:26:53.123000Z",
      "tryouts": [],
      "slug": "smart-cell",
      "marketplaces": {},
      "priority": 5,
      "media": {
        "portrait": "http://cdn4.gofynd.com/media/logo/department/original/13239_660c6f5b2b8d458789de4552d241ea1b.jpg",
        "landscape": "https://hdn-1.fynd.com/media/banner/category/original/16128_380bed8bff064a0b981041df65e0d8b3.jpg",
        "logo": "http://d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png"
      },
      "modified_on": "2021-02-25T09:26:53.123000Z",
      "synonyms": [],
      "uid": 22327,
      "hierarchy": [
        {
          "l1": 2,
          "l2": 3,
          "department": 1
        }
      ],
      "name": "Smart Cell",
      "modified_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "id": "60372005d230311fe9e51f0b"
    },
    {
      "is_active": true,
      "hierarchy": [
        {
          "department": 21,
          "l1": 22322,
          "l2": 22323
        }
      ],
      "slug": "dummy-level-98",
      "priority": 986532,
      "uid": 22326,
      "departments": [
        21
      ],
      "created_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "modified_on": "2021-02-25T00:09:35.026000Z",
      "marketplaces": {},
      "tryouts": [],
      "synonyms": [],
      "media": {
        "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/0wCdjxWpI-.png",
        "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/S1axCMOJ4-.png",
        "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/EfCt9iXx8-http/d3p8ifzkmzds37.cloudfront.net/media/logo/department/original/15870_c287d3c2431a432bb0e49363ef6b82bc.png.jpeg"
      },
      "level": 3,
      "name": "Dummy level 98",
      "created_on": "2021-02-25T00:09:35.026000Z",
      "modified_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "id": "60369d67d2303111b8924dcf"
    },
    {
      "uid": 315,
      "created_on": "2016-04-09T06:44:35Z",
      "departments": [
        2,
        3
      ],
      "hierarchy": [
        {
          "l1": 65,
          "l2": 66,
          "department": 2
        },
        {
          "l1": 442,
          "l2": 26,
          "department": 2
        },
        {
          "l1": 442,
          "l2": 26,
          "department": 3
        }
      ],
      "is_active": true,
      "level": 3,
      "marketplaces": {},
      "media": {
        "landscape": "https://hdn-1.fynd.com/media/banner/category/original/19961_f042f1f4a90f4e828b6d77d6dbea264d.jpg",
        "logo": "https://hdn-1.fynd.com/media/logo/category/original/81ef023d375044e9b9daa66b81ec411f.jpg",
        "portrait": "https://hdn-1.fynd.com/media/banner_portrait/category/original/19960_c679d51cb1bd4ca99f00f9050aa647a4.jpg"
      },
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
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
      "id": "5fdba984642de8d93efb0d71"
    }
  ]
}
```
</details>









---


### createCategories
Create product categories




```java
catalog.createCategories(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CategoryRequestBody](#CategoryRequestBody) | yes | Request body |


This API lets user create product categories

*Returned Response:*




[CategoryCreateResponse](#CategoryCreateResponse)

Category Meta. See example below or refer `CategoryCreateResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "Success",
  "uid": 0
}
```
</details>









---


### getCategoryData
Get product category by uid




```java
catalog.getCategoryData( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | Category unique id |  



This API gets meta associated to product categories.

*Returned Response:*




[SingleCategoryResponse](#SingleCategoryResponse)

Get Data for one category. See example below or refer `CategoryResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "name": "Air Conditioners",
    "media": {
      "portrait": "https://hdn-1.addsale.com/x0/category/pictures/portrait-banner/original/_4p7Kz9Yp-banner.png",
      "landscape": "https://hdn-1.addsale.com/x0/category/pictures/landscape-banner/original/nsi0nJ6gX-landscape.png",
      "logo": "https://hdn-1.addsale.com/x0/category/pictures/square-logo/original/zTgh1zslj-.png"
    },
    "marketplaces": {},
    "tryouts": [],
    "is_active": true,
    "created_by": {
      "username": "917972410891_48194",
      "user_id": "5646"
    },
    "uid": 22330,
    "slug": "air-conditioners",
    "priority": 1,
    "synonyms": [],
    "modified_by": {
      "username": "nikhilmhatre_gofynd_com_97636",
      "user_id": "16"
    },
    "level": 3,
    "hierarchy": [
      {
        "l1": 1,
        "department": 1,
        "l2": 22329
      }
    ],
    "created_on": "2021-04-02T15:43:59.410000Z",
    "departments": [
      1
    ],
    "modified_on": "2021-04-13T13:57:56.443000Z",
    "id": "60673bbf7896da00017885ad"
  }
}
```
</details>









---


### updateCategory
Update product categories




```java
catalog.updateCategory( uid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | Category unique id |  
| body | [CategoryRequestBody](#CategoryRequestBody) | yes | Request body |


Update a product category using this apu

*Returned Response:*




[CategoryUpdateResponse](#CategoryUpdateResponse)

Category Meta. See example below or refer `CategoryUpdateResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getDepartment
Get specific departments details by passing in unique id of the department.




```java
catalog.getDepartment( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | A `uid` is a unique identifier of a department. |  



Allows you to get department data, by uid.

*Returned Response:*




[DepartmentsResponse](#DepartmentsResponse)

Departments Data. See example below or refer `DepartmentsResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "page": {},
  "items": [
    {
      "uid": 5,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "created_on": "2020-07-01T05:33:39.325000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpgc7d0c15c-c1ff-47eb-8423-6e2df51f2ddf/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpg",
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
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
      "id": "5efc2033623d390001782238"
    },
    {
      "uid": 2,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "0"
      },
      "created_on": "2020-05-19T06:53:37.629000Z",
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
      "id": "5ec3827156a7200001c9aeea"
    },
    {
      "uid": 4,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "fahimsakri_gofynd_com_44938",
        "user_id": "10"
      },
      "created_on": "2020-06-29T10:59:33.620000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:08:02.675000Z",
      "name": "Groceries",
      "platforms": {},
      "priority_order": 10,
      "slug": "groceries",
      "synonyms": [],
      "tags": [],
      "id": "5ef9c9959b04f00001e40dba"
    },
    {
      "uid": 1,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "0"
      },
      "created_on": "2020-05-18T16:14:41.689000Z",
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
      "id": "5ec2b471661a4100019fca0d"
    },
    {
      "uid": 3,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "created_on": "2020-05-27T12:04:19.111000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/landscape-banner/original/g2plam_logo_Jio.pngeeb392ca-3958-46a0-9f13-23c205b596f7/g2plam_logo_Jio.png",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:07:46.060000Z",
      "name": "Industrial Supplies",
      "platforms": {},
      "priority_order": 111,
      "slug": "industrial-supplies",
      "synonyms": [],
      "tags": [],
      "id": "5ece5743cd1bae0001440427"
    },
    {
      "uid": 6,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "abhinavsrivastava_gofynd_com_05674",
        "user_id": "13"
      },
      "created_on": "2020-07-06T07:56:01.508000Z",
      "is_active": false,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/wTcfEi_crysis_-_1.jpg14580947-a659-486d-b2d3-d2ca025b1cac/wTcfEi_crysis_-_1.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:08:12.576000Z",
      "name": "Clothing",
      "platforms": {},
      "priority_order": 1,
      "slug": "clothing",
      "synonyms": [],
      "tags": [],
      "id": "5f02d9116b0ae500018923dd"
    },
    {
      "uid": 8,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:04:33.604000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/RxTsd8_0DEFAULT-LOGO.jpg000ccfc1-2f79-4426-9ac3-de2468c2fcb9/RxTsd8_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:44:01.234000Z",
      "name": "Kids",
      "platforms": {},
      "priority_order": 3,
      "slug": "kids",
      "synonyms": [],
      "tags": [],
      "id": "5f2a762131c66700018cdc47"
    },
    {
      "uid": 9,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:44:46.632000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/tKkDB8_0DEFAULT-LOGO.jpg1c324d4d-f667-4af8-8d98-37205d34e3b5/tKkDB8_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:07:35.231000Z",
      "name": "Women's Fashion",
      "platforms": {},
      "priority_order": 2,
      "slug": "women-s-fashion",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7f8e31c66700018cdc49"
    },
    {
      "uid": 10,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:45:12.075000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/oLoxiL_0DEFAULT-LOGO.jpgbd050200-700a-4a3e-9da6-e6b78fbee943/oLoxiL_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:48:01.660000Z",
      "name": "Beauty & Personal Care",
      "platforms": {},
      "priority_order": 4,
      "slug": "beauty-personal-care",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7fa831c66700018cdc4a"
    },
    {
      "uid": 11,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:45:39.797000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/vQv4ot_0DEFAULT-LOGO.jpg701cb5af-2024-4abf-ae5d-b68bc1a3cd43/vQv4ot_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T11:38:57.599000Z",
      "name": "Home & Living",
      "platforms": {},
      "priority_order": 5,
      "slug": "home-living",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7fc331c66700018cdc4b"
    },
    {
      "uid": 14,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:48:42.347000Z",
      "is_active": false,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/hTobjV_0DEFAULT-LOGO.jpga020159c-7fe7-4c1c-a11a-4be61a60da9f/hTobjV_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:48:42.347000Z",
      "name": "Baby Care & Kids Essentials",
      "platforms": {},
      "priority_order": 7,
      "slug": "baby-care-kids-essentials",
      "synonyms": [],
      "tags": [],
      "id": "5f2a807a31c66700018cdc4e"
    },
    {
      "_cls": "Department",
      "created_on": "2021-01-13T10:12:33.002000Z",
      "modified_on": "2021-01-13T13:50:55.415000Z",
      "created_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "modified_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "uid": 21,
      "name": "Skin care products",
      "slug": "skin-care-produts",
      "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/rNz8grLys-.png",
      "tags": [],
      "is_active": true,
      "priority_order": 10235,
      "platforms": {},
      "synonyms": [
        "skin",
        "care"
      ],
      "_custom_json": {},
      "id": "5ffec79192813f0001eb6560"
    }
  ]
}
```
</details>









---


### updateDepartment
Update the department by their uid.




```java
catalog.updateDepartment( uid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | String | yes | A `uid` is a unique identifier of a department. |  
| body | [DepartmentCreateUpdate](#DepartmentCreateUpdate) | yes | Request body |


Update the department by their uid using this API.

*Returned Response:*




[DepartmentModel](#DepartmentModel)

Success Response. See example below or refer `DepartmentCreateResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_active": true,
  "name": "Fashion",
  "slug": "fashion",
  "priority_order": 1,
  "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/xKDsQBbu4-department.png",
  "synonyms": [
    "fashion",
    "mensfashion"
  ],
  "uid": 2,
  "modified_by": {
    "username": "31315573458_05620",
    "user_id": "f5b6a546565146sdfg584c342"
  },
  "modified_on": "2022-08-09T15:44:02.540740"
}
```
</details>









---


### listDepartments
List all Departments.




```java
catalog.listDepartments( pageNo,  pageSize,  name,  search,  isActive) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| name | String? | no | Can search departments by passing name. |   
| search | String? | no | Can search departments by passing name of the department in search parameter. |   
| isActive | Boolean? | no | Can query for departments based on whether they are active or inactive. |  



Allows you to list all departments, also can search using name and filter active and incative departments, and item type.

*Returned Response:*




[DepartmentsResponse](#DepartmentsResponse)

List of departments data. See example below or refer `DepartmentsResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "page": {
    "current": 1,
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_total": 12
  },
  "items": [
    {
      "uid": 5,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "created_on": "2020-07-01T05:33:39.325000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpgc7d0c15c-c1ff-47eb-8423-6e2df51f2ddf/BSQ9Gk_123522-best-starry-sky-wallpaper-1920x1200-ipad-pro.jpg",
      "modified_by": {
        "username": "917753852478_51632",
        "user_id": "5677"
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
      "id": "5efc2033623d390001782238"
    },
    {
      "uid": 2,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "0"
      },
      "created_on": "2020-05-19T06:53:37.629000Z",
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
      "id": "5ec3827156a7200001c9aeea"
    },
    {
      "uid": 4,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "fahimsakri_gofynd_com_44938",
        "user_id": "10"
      },
      "created_on": "2020-06-29T10:59:33.620000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpgc73cc22f-b5ee-4fd4-a585-8ada35762d68/ywPVrU_preview_a637ca6e4da6e38f03eb0d650ac5d6ba.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:08:02.675000Z",
      "name": "Groceries",
      "platforms": {},
      "priority_order": 10,
      "slug": "groceries",
      "synonyms": [],
      "tags": [],
      "id": "5ef9c9959b04f00001e40dba"
    },
    {
      "uid": 1,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "app@fynd.com",
        "user_id": "0"
      },
      "created_on": "2020-05-18T16:14:41.689000Z",
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
      "id": "5ec2b471661a4100019fca0d"
    },
    {
      "uid": 3,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "created_on": "2020-05-27T12:04:19.111000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/landscape-banner/original/g2plam_logo_Jio.pngeeb392ca-3958-46a0-9f13-23c205b596f7/g2plam_logo_Jio.png",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:07:46.060000Z",
      "name": "Industrial Supplies",
      "platforms": {},
      "priority_order": 111,
      "slug": "industrial-supplies",
      "synonyms": [],
      "tags": [],
      "id": "5ece5743cd1bae0001440427"
    },
    {
      "uid": 6,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "abhinavsrivastava_gofynd_com_05674",
        "user_id": "13"
      },
      "created_on": "2020-07-06T07:56:01.508000Z",
      "is_active": false,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/wTcfEi_crysis_-_1.jpg14580947-a659-486d-b2d3-d2ca025b1cac/wTcfEi_crysis_-_1.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:08:12.576000Z",
      "name": "Clothing",
      "platforms": {},
      "priority_order": 1,
      "slug": "clothing",
      "synonyms": [],
      "tags": [],
      "id": "5f02d9116b0ae500018923dd"
    },
    {
      "uid": 8,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:04:33.604000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/RxTsd8_0DEFAULT-LOGO.jpg000ccfc1-2f79-4426-9ac3-de2468c2fcb9/RxTsd8_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:44:01.234000Z",
      "name": "Kids",
      "platforms": {},
      "priority_order": 3,
      "slug": "kids",
      "synonyms": [],
      "tags": [],
      "id": "5f2a762131c66700018cdc47"
    },
    {
      "uid": 9,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:44:46.632000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/tKkDB8_0DEFAULT-LOGO.jpg1c324d4d-f667-4af8-8d98-37205d34e3b5/tKkDB8_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T18:07:35.231000Z",
      "name": "Women's Fashion",
      "platforms": {},
      "priority_order": 2,
      "slug": "women-s-fashion",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7f8e31c66700018cdc49"
    },
    {
      "uid": 10,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:45:12.075000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/oLoxiL_0DEFAULT-LOGO.jpgbd050200-700a-4a3e-9da6-e6b78fbee943/oLoxiL_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:48:01.660000Z",
      "name": "Beauty & Personal Care",
      "platforms": {},
      "priority_order": 4,
      "slug": "beauty-personal-care",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7fa831c66700018cdc4a"
    },
    {
      "uid": 11,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:45:39.797000Z",
      "is_active": true,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/vQv4ot_0DEFAULT-LOGO.jpg701cb5af-2024-4abf-ae5d-b68bc1a3cd43/vQv4ot_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "918793638893_86554",
        "user_id": "3"
      },
      "modified_on": "2020-08-06T11:38:57.599000Z",
      "name": "Home & Living",
      "platforms": {},
      "priority_order": 5,
      "slug": "home-living",
      "synonyms": [],
      "tags": [],
      "id": "5f2a7fc331c66700018cdc4b"
    },
    {
      "uid": 14,
      "_cls": "Department",
      "_custom_json": {},
      "created_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "created_on": "2020-08-05T09:48:42.347000Z",
      "is_active": false,
      "logo": "https://hdn-1.addsale.com/x0/seller/pictures/logo/original/hTobjV_0DEFAULT-LOGO.jpga020159c-7fe7-4c1c-a11a-4be61a60da9f/hTobjV_0DEFAULT-LOGO.jpg",
      "modified_by": {
        "username": "asavarijadhav_gofynd_com_99880",
        "user_id": "5634"
      },
      "modified_on": "2020-08-05T09:48:42.347000Z",
      "name": "Baby Care & Kids Essentials",
      "platforms": {},
      "priority_order": 7,
      "slug": "baby-care-kids-essentials",
      "synonyms": [],
      "tags": [],
      "id": "5f2a807a31c66700018cdc4e"
    },
    {
      "_cls": "Department",
      "created_on": "2021-01-13T10:12:33.002000Z",
      "modified_on": "2021-01-13T13:50:55.415000Z",
      "created_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "modified_by": {
        "username": "919821012599_75351",
        "user_id": "5721"
      },
      "uid": 21,
      "name": "Skin care products",
      "slug": "skin-care-produts",
      "logo": "https://hdn-1.addsale.com/x0/department/pictures/square-logo/original/rNz8grLys-.png",
      "tags": [],
      "is_active": true,
      "priority_order": 10235,
      "platforms": {},
      "synonyms": [
        "skin",
        "care"
      ],
      "_custom_json": {},
      "id": "5ffec79192813f0001eb6560"
    }
  ]
}
```
</details>









---


### createDepartment
Create the department.




```java
catalog.createDepartment(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DepartmentCreateUpdate](#DepartmentCreateUpdate) | yes | Request body |


Create departments using the API.

*Returned Response:*




[DepartmentCreateResponse](#DepartmentCreateResponse)

Success Response. See example below or refer `DepartmentCreateResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "Success",
  "uid": 2
}
```
</details>









---


### getFilterAttributesPriority
Get the existing sequence of filters




```java
catalog.getFilterAttributesPriority() {
  //use response
}
```




This API lets user get the existing sequence of filters

*Returned Response:*




[ShuffleAttributesResponse](#ShuffleAttributesResponse)

Success Response. See example below or refer `ShuffleAttributesResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Success!!!",
  "data": {
    "sequence": [
      "occasion",
      "gender",
      "care_instructions",
      "primary_color",
      "pallet",
      "primary_material",
      "dietary-preference",
      "import-month-and-year",
      "marketer-address",
      "best-before",
      "marketer-name",
      "color",
      "product_fit",
      "clasp_type",
      "spf",
      "hair_type",
      "fragrance_type",
      "sole-material",
      "dial_shape",
      "strap_type",
      "movement_type",
      "pattern",
      "closure_type",
      "toe_type",
      "arch_type",
      "stone_type",
      "sleeve_length",
      "neck_type",
      "socks_length",
      "boot_length",
      "denim_type",
      "bottomwear_length",
      "topwear_length",
      "lens_material",
      "test-multi-string",
      "mg",
      "test-attribute",
      "filtercollection",
      "categories",
      "testattributesbcp",
      "testing-done",
      "testing-happening",
      "testestestest",
      "swadesh-attribute"
    ],
    "attribute_details": [
      {
        "slug": "occasion",
        "name": "Occasion"
      },
      {
        "slug": "gender",
        "name": "Gender"
      },
      {
        "slug": "care_instructions",
        "name": "Care Instructions"
      },
      {
        "slug": "primary_color",
        "name": "Primary Colour"
      },
      {
        "slug": "pallet",
        "name": "Pallet"
      },
      {
        "slug": "primary_material",
        "name": "Primary Material"
      },
      {
        "slug": "dietary-preference",
        "name": "Dietary Preference"
      },
      {
        "slug": "import-month-and-year",
        "name": "Import Month & Year"
      },
      {
        "slug": "marketer-address",
        "name": "Marketer Address"
      },
      {
        "slug": "best-before",
        "name": "Best Before"
      },
      {
        "slug": "marketer-name",
        "name": "Marketer Name"
      },
      {
        "slug": "color",
        "name": "Colour"
      },
      {
        "slug": "product_fit",
        "name": "Product Fit"
      },
      {
        "slug": "clasp_type",
        "name": "Clasp Type"
      },
      {
        "slug": "spf",
        "name": "SPF"
      },
      {
        "slug": "hair_type",
        "name": "Hair Type"
      },
      {
        "slug": "fragrance_type",
        "name": "Fragrance Type"
      },
      {
        "slug": "sole-material",
        "name": "Sole Material"
      },
      {
        "slug": "dial_shape",
        "name": "Dial Shape"
      },
      {
        "slug": "strap_type",
        "name": "Strap Type"
      },
      {
        "slug": "movement_type",
        "name": "Movement Type"
      },
      {
        "slug": "pattern",
        "name": "Pattern"
      },
      {
        "slug": "closure_type",
        "name": "Closure Type"
      },
      {
        "slug": "toe_type",
        "name": "Toe Type"
      },
      {
        "slug": "arch_type",
        "name": "Arch Type"
      },
      {
        "slug": "stone_type",
        "name": "Stone Type"
      },
      {
        "slug": "sleeve_length",
        "name": "Sleeve Length"
      },
      {
        "slug": "neck_type",
        "name": "Neck Type"
      },
      {
        "slug": "socks_length",
        "name": "Socks Length"
      },
      {
        "slug": "boot_length",
        "name": "Boot Length"
      },
      {
        "slug": "denim_type",
        "name": "Denim Type"
      },
      {
        "slug": "bottomwear_length",
        "name": "Bottomwear Length"
      },
      {
        "slug": "topwear_length",
        "name": "Topwear Length"
      },
      {
        "slug": "lens_material",
        "name": "Lens Material"
      },
      {
        "slug": "test-multi-string",
        "name": "Test-multi-string"
      },
      {
        "slug": "mg",
        "name": "MG"
      },
      {
        "slug": "test-attribute",
        "name": "Test Attribute"
      },
      {
        "slug": "filtercollection",
        "name": "FilterCollection"
      },
      {
        "slug": "categories",
        "name": "Categories"
      },
      {
        "slug": "testattributesbcp",
        "name": "TestAttributesBCP"
      },
      {
        "slug": "testing-done",
        "name": "testing done"
      },
      {
        "slug": "testing-happening",
        "name": "testing happening"
      },
      {
        "slug": "testestestest",
        "name": "testestestest"
      },
      {
        "slug": "swadesh-attribute",
        "name": "swadesh attribute"
      }
    ]
  }
}
```
</details>









---


### setFilterAttributesPriority
Sets the filters priority in the given sequence




```java
catalog.setFilterAttributesPriority(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ShuffleAttributeFilter](#ShuffleAttributeFilter) | yes | Request body |


This API lets user set the filters priority in the given sequence

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Success Response. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### getAttributeGroupsPriority
Get the existing sequence of attribute groups




```java
catalog.getAttributeGroupsPriority( groupType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupType | String | yes | The `group_type` is a unique identifier for each type of product attributes group like ['details', 'comparisons']. |  



This API lets user get the existing sequence of attribute groups

*Returned Response:*




[ShuffleAttributeGroupsResponse](#ShuffleAttributeGroupsResponse)

Success Response. See example below or refer `ShuffleAttributeGroupsResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Success!!!",
  "data": {
    "sequence": [
      "automobile-temp-attr-group",
      "general-information"
    ]
  }
}
```
</details>









---


### setAttributeGroupsPriority
Sets the attribute groups priority in the given sequence




```java
catalog.setAttributeGroupsPriority( groupType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupType | String | yes | The `group_type` is a unique identifier for each type of product attributes group like ['details', 'comparisons']. |  
| body | [ShuffleAttributeFilter](#ShuffleAttributeFilter) | yes | Request body |


This API lets user set the attribute groups priority in the given sequence

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Success Response. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### getProductAttributeGroup
Get the data of product attributes groups by slug.




```java
catalog.getProductAttributeGroup( slug,  ca,  department,  variant,  sort,  sortOn,  q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | The `slug` is a unique identifier for each product attributes group. |   
| ca | Boolean? | no | Set this to true to get the constant attributes in the response |   
| department | String? | no | Get attributes for the selected department |   
| variant | String? | no | Get attributes with the variant filter |   
| sort | String? | no | Sort the order of the attributes list |   
| sortOn | String? | no | Sort the list on a specific field in the attributes response |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets the get the data of product attributes groups by slug.

*Returned Response:*




[AttributeGroupsResponse](#AttributeGroupsResponse)

Attribute Group Data. See example below or refer `AttributeGroupsResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "modified_on": "2022-10-09T01:34:18.989000",
    "created_on": "2021-08-06T07:23:58.710000",
    "_id": "610ce38e1e29b90001c0da09",
    "details": {
      "display": true,
      "attributes": [
        "iron",
        "iron-template2",
        "attr-3"
      ],
      "template_slugs": [
        "iron"
      ],
      "priority": 2
    },
    "name": "automobile-temp-attr-group",
    "created_by": {
      "user_id": "7575578fcf99de24085573b2",
      "username": "abhinavojha_gofynd_com_60598"
    },
    "uid": 30,
    "slug": "automobile-temp-attr-group",
    "type": "details",
    "modified_by": {
      "user_id": "f5b6a54b394b4ad89784c342",
      "username": "917995805578_05620"
    },
    "attribute_details": [
      {
        "filters": {
          "indexing": false
        },
        "created_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "created_on": "2021-08-06T07:21:13.747000",
        "_id": "610ce2e91e29b90001c0da08",
        "details": {
          "display_type": "text"
        },
        "name": "attr-3",
        "slug": "attr-3",
        "variant": false,
        "schema": {
          "allowed_values": [],
          "format": "upper case",
          "range": {
            "min": 1
          },
          "type": "str",
          "mandatory": false,
          "multi": false
        },
        "modified_on": "2021-08-06T07:21:13.747000",
        "modified_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "is_nested": true,
        "departments": [
          "automobile-department"
        ],
        "description": "attr-3"
      },
      {
        "filters": {
          "priority": 59,
          "indexing": true
        },
        "logo": "https://hdn-1.addsale.com/addsale/products/pictures/attribute/logo/original/KRdsL-DZg-iron.png",
        "created_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "created_on": "2021-08-06T07:13:53.963000",
        "_id": "610ce1311e29b90001c0da05",
        "details": {
          "display_type": "text"
        },
        "name": "iron_attribute",
        "slug": "iron",
        "variant": true,
        "schema": {
          "allowed_values": [
            "Sunroof",
            "Hinge",
            "Door latch"
          ],
          "format": "upper case",
          "range": {
            "min": 1
          },
          "type": "str",
          "mandatory": true,
          "multi": true
        },
        "modified_on": "2021-08-06T07:17:27.743000",
        "modified_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "is_nested": true,
        "enabled_for_end_consumer": true,
        "departments": [
          "automobile-department"
        ],
        "description": "iron_attribute"
      },
      {
        "filters": {
          "priority": 60,
          "indexing": true
        },
        "logo": "https://hdn-1.addsale.com/addsale/products/pictures/attribute/logo/original/KRdsL-DZg-iron.png",
        "created_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "created_on": "2021-08-06T07:19:24.850000",
        "_id": "610ce27c1e29b90001c0da07",
        "details": {
          "display_type": "text"
        },
        "name": "iron-template2",
        "slug": "iron-template2",
        "variant": true,
        "schema": {
          "allowed_values": [
            "red"
          ],
          "format": "upper case",
          "range": {
            "min": 1
          },
          "type": "str",
          "mandatory": true,
          "multi": false
        },
        "modified_on": "2021-08-06T07:19:24.850000",
        "modified_by": {
          "user_id": "7575578fcf99de24085573b2",
          "username": "abhinavojha_gofynd_com_60598"
        },
        "is_nested": true,
        "enabled_for_end_consumer": true,
        "departments": [
          "automobile-department"
        ],
        "description": "iron-template2"
      },
      [
        {
          "name": "Country of Origin",
          "schema": {
            "allowed_values": [
              "Christmas Island",
              "Cameroon",
              "Guinea",
              "Guinea-Bissau",
              "Netherlands The",
              "Australia",
              "Niue",
              "Panama",
              "Philippines",
              "Malaysia",
              "Equatorial Guinea",
              "Falkland Islands",
              "Gabon",
              "Grenada",
              "Kazakhstan",
              "Liberia",
              "Oman",
              "Costa Rica",
              "Gambia The",
              "Kenya",
              "Luxembourg",
              "Samoa",
              "Nigeria",
              "Pitcairn Island",
              "El Salvador",
              "Greece",
              "Guyana",
              "Haiti",
              "Honduras",
              "Madagascar",
              "Montserrat",
              "Mauritius",
              "Namibia",
              "Papua new Guinea",
              "Paraguay",
              "Montenegro",
              "Armenia",
              "Fiji Islands",
              "Estonia",
              "Faroe Islands",
              "Finland",
              "Korea South",
              "Martinique",
              "Japan",
              "Guadeloupe",
              "Guernsey and Alderney",
              "Korea North",
              "Romania",
              "Libya",
              "Rwanda",
              "Georgia",
              "Heard and McDonald Islands",
              "Israel",
              "Italy",
              "Latvia",
              "Lesotho",
              "Mali",
              "Portugal",
              "Saint Kitts And Nevis",
              "Nauru",
              "Andorra",
              "Belize",
              "Cocos (Keeling) Islands",
              "Croatia (Hrvatska)",
              "Suriname",
              "Solomon Islands",
              "Zimbabwe",
              "Wallis And Futuna Islands",
              "Ukraine",
              "Uzbekistan",
              "Turkey",
              "Tuvalu",
              "San Marino",
              "France",
              "Marshall Islands",
              "Senegal",
              "Thailand",
              "South Africa",
              "Uganda",
              "Trinidad And Tobago",
              "Germany",
              "Guatemala",
              "Greenland",
              "Hong Kong S.A.R.",
              "Indonesia",
              "Malawi",
              "Maldives",
              "Mayotte",
              "Nepal",
              "Moldova",
              "French Guiana",
              "Serbia",
              "Venezuela",
              "Uruguay",
              "Egypt",
              "United Arab Emirates",
              "Eritrea",
              "Ethiopia",
              "French Southern Territories",
              "Gibraltar",
              "Mongolia",
              "Liechtenstein",
              "New Zealand",
              "Qatar",
              "Palau",
              "Tokelau",
              "United States",
              "United States Minor Outlying Islands",
              "Yemen",
              "Sweden",
              "Virgin Islands (US)",
              "Ireland",
              "South Georgia",
              "Switzerland",
              "Vatican City State (Holy See)",
              "Seychelles",
              "Togo",
              "Sao Tome and Principe",
              "Taiwan",
              "Vietnam",
              "Sri Lanka",
              "South Sudan",
              "Sudan",
              "Syria",
              "Spain",
              "Zambia",
              "Vanuatu",
              "Sierra Leone",
              "Slovenia",
              "Svalbard And Jan Mayen Islands",
              "Tajikistan",
              "Man (Isle of)",
              "Tunisia",
              "Singapore",
              "Kuwait",
              "Saint Helena",
              "Russia",
              "Tonga",
              "Western Sahara",
              "Anguilla",
              "Bangladesh",
              "Central African Republic",
              "Congo The Democratic Republic Of The",
              "Belgium",
              "Antigua And Barbuda",
              "Cayman Islands",
              "Burundi",
              "Aruba",
              "Belarus",
              "Bhutan",
              "Austria",
              "Azerbaijan",
              "Bermuda",
              "Bolivia",
              "British Indian Ocean Territory",
              "Brunei",
              "Bulgaria",
              "Cambodia",
              "Bosnia and Herzegovina",
              "Bouvet Island",
              "Czech Republic",
              "China",
              "Congo",
              "Albania",
              "Aland Islands",
              "Bahamas The",
              "Chad",
              "Benin",
              "American Samoa",
              "Bahrain",
              "Djibouti",
              "Cyprus",
              "Myanmar",
              "Mexico",
              "Norfolk Island",
              "Norway",
              "Saint-Barthelemy",
              "Brazil",
              "Cape Verde",
              "Chile",
              "Dominica",
              "Ecuador",
              "Cuba",
              "Comoros",
              "Burkina Faso",
              "Cote D'Ivoire (Ivory Coast)",
              "Denmark",
              "Dominican Republic",
              "East Timor",
              "Afghanistan",
              "Angola",
              "Antarctica",
              "Algeria",
              "Barbados",
              "Canada",
              "Cook Islands",
              "Argentina",
              "Botswana",
              "Colombia",
              "Lebanon",
              "Guam",
              "Macedonia",
              "Palestinian Territory Occupied",
              "Micronesia",
              "Laos",
              "Pakistan",
              "Poland",
              "Saint Pierre and Miquelon",
              "Saint-Martin (French part)",
              "Somalia",
              "Hungary",
              "French Polynesia",
              "Iceland",
              "Iraq",
              "Mauritania",
              "Jersey",
              "Saudi Arabia",
              "Slovakia",
              "Tanzania",
              "Turkmenistan",
              "Virgin Islands (British)",
              "Kiribati",
              "Mozambique",
              "Northern Mariana Islands",
              "Saint Lucia",
              "Jamaica",
              "Morocco",
              "Netherlands Antilles",
              "Nicaragua",
              "Lithuania",
              "Jordan",
              "Saint Vincent And The Grenadines",
              "Niger",
              "Ghana",
              "Iran",
              "Kyrgyzstan",
              "New Caledonia",
              "Monaco",
              "Peru",
              "Puerto Rico",
              "Reunion",
              "Turks And Caicos Islands",
              "United Kingdom",
              "Macau S.A.R.",
              "Malta",
              "India",
              "Swaziland"
            ],
            "type": "str",
            "mandatory": true
          },
          "description": "The name of the country where the product was manufactured. Example: India",
          "slug": "country_of_origin",
          "details": {
            "displayType": "text",
            "display_type": "text"
          }
        },
        {
          "name": "Trader Type",
          "schema": {
            "allowed_values": [
              "Importer",
              "Packer",
              "Manufacturer",
              "Marketer"
            ],
            "type": "str",
            "mandatory": false
          },
          "description": "Trader Type",
          "slug": "trader_type",
          "details": {
            "displayType": "text",
            "display_type": "text"
          }
        },
        {
          "name": "Trader Name",
          "schema": {
            "type": "str",
            "mandatory": false
          },
          "description": "Trader Name",
          "slug": "trader_name",
          "details": {
            "displayType": "text",
            "display_type": "text"
          }
        },
        {
          "name": "Trader Address",
          "schema": {
            "type": "str",
            "mandatory": false
          },
          "description": "Trader Address",
          "slug": "trader_address",
          "details": {
            "displayType": "text",
            "display_type": "text"
          }
        },
        {
          "name": "Item Code",
          "schema": {
            "type": "str",
            "mandatory": true
          },
          "description": "Item Code",
          "slug": "item_code",
          "details": {
            "displayType": "text",
            "display_type": "text"
          }
        }
      ]
    ]
  }
}
```
</details>









---


### updateProductAttributeGroup
Update the data of product a attributes group.




```java
catalog.updateProductAttributeGroup( slug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | The `slug` is a unique identifier for each product attributes group. |  
| body | [AttributeMasterGroupModel](#AttributeMasterGroupModel) | yes | Request body |


This API updates the data of product a attributes group.

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Success Response Data. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### listProductAttributesGroups
Get the list of product attributes groups




```java
catalog.listProductAttributesGroups( ca,  department,  variant,  sort,  sortOn,  q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ca | Boolean? | no | Set this to true to get the constant attributes in the response |   
| department | String? | no | Get attributes for the selected department |   
| variant | String? | no | Get attributes with the variant filter |   
| sort | String? | no | Sort the order of the attributes list |   
| sortOn | String? | no | Sort the list on a specific field in the attributes response |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets the list of product attributes groups

*Returned Response:*




[AttributeGroupListResponse](#AttributeGroupListResponse)

Attibutes Group Data. See example below or refer `AttributeGroupListResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "modified_on": "2022-09-23T12:07:30.015000",
      "type": "details",
      "modified_by": {
        "username": "aniljainapur_fynd_external_com_24734",
        "user_id": "03daec7fa374375c329dd040"
      },
      "_id": "632da05345d068951002d7c4",
      "created_by": {
        "username": "aniljainapur_fynd_external_com_24734",
        "user_id": "03daec7fa374375c329dd040"
      },
      "slug": "group1amj",
      "uid": 31,
      "created_on": "2022-09-23T12:02:27.679000",
      "details": {
        "template_slugs": [
          "food-and-beverages",
          "southeast2282022197767",
          "test-template"
        ],
        "attributes": [
          "package_contents",
          "storage_type",
          "ingredients"
        ],
        "priority": 3,
        "display": true
      },
      "name": "group_1_amj"
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 1,
    "has_previous": false,
    "has_next": false,
    "item_total": 24
  }
}
```
</details>









---


### createProductAttributeGroup
Create product attribute group.




```java
catalog.createProductAttributeGroup(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [AttributeMasterGroupModel](#AttributeMasterGroupModel) | yes | Request body |


This API create a product attribute group.

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Attribute Data. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### listProductAttributes
Get the list of product attributes




```java
catalog.listProductAttributes( ca,  department,  variant,  sort,  sortOn,  q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ca | Boolean? | no | Set this to true to get the constant attributes in the response |   
| department | String? | no | Get attributes for the selected department |   
| variant | String? | no | Get attributes with the variant filter |   
| sort | String? | no | Sort the order of the attributes list |   
| sortOn | String? | no | Sort the list on a specific field in the attributes response |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API gets the list of product attributes.

*Returned Response:*




[AttributeMasterResponse](#AttributeMasterResponse)

Attibute Data. See example below or refer `AttributeMasterResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "departments": [
        "industrial-supplies",
        "toys"
      ],
      "slug": "is_flammable",
      "tags": [],
      "filters": {
        "indexing": false
      },
      "is_nested": true,
      "modified_by": {
        "username": "manojpatidar_gofynd_com_86609",
        "user_id": "ad35b88a78d5753be6f59c4b"
      },
      "description": "Testing updates",
      "schema": {
        "type": "str",
        "mandatory": false,
        "multi": false,
        "format": "",
        "range": {
          "min": 1
        },
        "allowed_values": []
      },
      "details": {
        "display_type": "text"
      },
      "synonyms": {},
      "enabled_for_end_consumer": true,
      "name": "is_flammable",
      "_id": "5ef2472e0087fa001ce990ba",
      "modified_on": "2022-12-20T11:32:52.102000",
      "variant": false
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 357,
    "has_previous": false,
    "has_next": true,
    "item_total": 357
  }
}
```
</details>









---


### createProductAttribute
Create product attribute




```java
catalog.createProductAttribute(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [AttributeMasterModel](#AttributeMasterModel) | yes | Request body |


This API create a product attribute

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Attribute Data. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### getProductAttribute
Get the data of product a attributes




```java
catalog.getProductAttribute( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | The `slug` is a unique identifier for each product attribute. |  



This API gets the get the data of product a attributes

*Returned Response:*




[AttributeMasterModel](#AttributeMasterModel)

Attribute Data. See example below or refer `AttributeMasterResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "variant": false,
  "slug": "swatch-attr-2",
  "is_nested": true,
  "_id": "633fca40e84e91e0262456d7",
  "filters": {
    "indexing": false
  },
  "details": {
    "display_type": "text"
  },
  "description": "Testing swatch attribute",
  "modified_on": "2022-10-07T06:42:08.286000",
  "created_on": "2022-10-07T06:42:08.286000",
  "modified_by": {
    "user_id": "fffac759abfde839d8d2bc2d",
    "username": "mohammedansari_fynd_external_com_91689"
  },
  "name": "Swatch-attr-2",
  "departments": [
    "men",
    "fashion"
  ],
  "schema": {
    "allowed_values": [],
    "range": {
      "min": 1
    },
    "multi": false,
    "format": "",
    "type": "str",
    "mandatory": false
  },
  "created_by": {
    "user_id": "fffac759abfde839d8d2bc2d",
    "username": "mohammedansari_fynd_external_com_91689"
  }
}
```
</details>









---


### updateProductAttribute
Update the data of product a attributes




```java
catalog.updateProductAttribute( slug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | The `slug` is a unique identifier for each product attribute. |  
| body | [AttributeMasterModel](#AttributeMasterModel) | yes | Request body |


This API gets the update the data of product a attributes

*Returned Response:*




[ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

Success Response Data. See example below or refer `ShuffleAttributesSuccessResponse` for details




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


### listVariants
List all Variants.




```java
catalog.listVariants( ca,  department,  variant,  sort,  sortOn,  q,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| ca | Boolean? | no | Set this to true to get the constant attributes in the response |   
| department | String? | no | Get attributes for the selected department |   
| variant | String? | no | Get attributes with the variant filter |   
| sort | String? | no | Sort the order of the attributes list |   
| sortOn | String? | no | Sort the list on a specific field in the attributes response |   
| q | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



Allows you to list all variants.

*Returned Response:*




[VariantsListResponse](#VariantsListResponse)

List of variants data. See example below or refer `VariantsResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "created_on": "2020-01-16 15:17:19.025000",
      "priority": 2,
      "display_type": [
        "t",
        "e",
        "x",
        "t"
      ],
      "modified_by": {
        "username": "silverbolt",
        "user_id": "0"
      },
      "display": "Memory",
      "key": "storage",
      "departments": [
        "electronics"
      ],
      "is_active": true,
      "uid": 4,
      "modified_on": "2020-07-14 13:58:56.142000",
      "created_by": {
        "username": "nikhilmhatre_gofynd_com_28085_23175373"
      }
    }
  ],
  "page": {
    "current": 1,
    "total": 1,
    "has_previous": false,
    "has_next": false,
    "total_item_count": 24
  }
}
```
</details>









---


### createVariant
Create a variant.




```java
catalog.createVariant(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [VariantAttributesModel](#VariantAttributesModel) | yes | Request body |


Create variant using the API.

*Returned Response:*




[VariantCreateUpdateResponse](#VariantCreateUpdateResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 10
}
```
</details>









---


### getVariantByUID
Get variant details by UID.




```java
catalog.getVariantByUID( uid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | Integer | yes | A `uid` is a unique identifier for a particular variant. |  



Allows you to get the details of the variant.

*Returned Response:*




[VariantDetailResponse](#VariantDetailResponse)

List of variants data. See example below or refer `VariantDetailResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": {
    "display_type": "color",
    "key": "memory_details",
    "display": "Additional Colorsasd",
    "modified_by": {
      "username": "pranavmestry_gofynd_com_37191",
      "user_id": "ac3b5d4f6eadcae059c9f44b"
    },
    "created_by": {
      "username": "tergeo",
      "user_id": "0"
    },
    "modified_on": "2022-09-21 07:30:12.933000",
    "is_active": true,
    "uid": 2,
    "departments": [
      "electronics",
      "fashion",
      "automobile-sept22",
      "mens-fashions-jul2"
    ],
    "priority": 1,
    "created_on": "2019-06-08 04:34:16.736000"
  }
}
```
</details>









---


### updateVariant
Update a variant by UID.




```java
catalog.updateVariant( uid, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| uid | Integer | yes | A `uid` is a unique identifier for a particular variant. |  
| body | [VariantAttributesModel](#VariantAttributesModel) | yes | Request body |


Update a variant using the API.

*Returned Response:*




[VariantCreateUpdateResponse](#VariantCreateUpdateResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "uid": 10
}
```
</details>









---


### listProductTemplate
List all Templates.




```java
catalog.listProductTemplate( department,  sort,  search,  pageNo,  pageSize,  slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| department | String? | no | A `department` is the name of a particular department. |   
| sort | String? | no | Sort the order of the attributes list |   
| search | String? | no | Get multiple categories filtered by search string |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| slug | String? | no | The `slug` is a unique identifier for each product templates group. |  



Allows you to list all product templates, also can filter by department

*Returned Response:*




[TemplatesResponse](#TemplatesResponse)

List of product templates. See example below or refer `TemplatesResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "page": {
    "current": 1,
    "type": "number",
    "size": 56,
    "has_previous": false,
    "has_next": true,
    "item_total": 56
  },
  "items": [
    {
      "is_expirable": false,
      "created_by": {
        "username": "meetshah_gofynd_com_94272",
        "user_id": "054bb99f009aece85a3fa087"
      },
      "created_on": "2022-10-06T07:51:08.105000",
      "slug": "test-variant-template",
      "departments": [
        "test-variant-attribute",
        "test-varinant-2"
      ],
      "is_active": true,
      "name": "test-variant-template",
      "modified_by": {
        "username": "917995805578_05620",
        "user_id": "f5b6a54b394b4ad89784c342"
      },
      "modified_on": "2022-10-06T17:42:24.315000",
      "is_physical": true,
      "is_archived": false,
      "categories": [
        "test-variant-l3"
      ],
      "attributes": [
        "test-variant-field",
        "test-variant-field-2",
        "variant-field-3"
      ],
      "logo": "https://hdn-1.addsale.com/addsale/products/pictures/template/logo/original/1UZtJvzM0-test-variant-template.png",
      "id": "633e88ec76ff74c90d39e2a8"
    }
  ]
}
```
</details>









---


### getProductTemplateList
List all Templates.




```java
catalog.getProductTemplateList( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `slug` is a unique identifier for a particular product template. |  



Allows you to list all product templates, also can filter by department

*Returned Response:*




[TemplatesResponse](#TemplatesResponse)

List of product templates. See example below or refer `TemplatesResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "page": {
    "current": 1,
    "type": "number",
    "size": 56,
    "has_previous": false,
    "has_next": true,
    "item_total": 56
  },
  "items": [
    {
      "is_expirable": false,
      "created_by": {
        "username": "meetshah_gofynd_com_94272",
        "user_id": "054bb99f009aece85a3fa087"
      },
      "created_on": "2022-10-06T07:51:08.105000",
      "slug": "test-variant-template",
      "departments": [
        "test-variant-attribute",
        "test-varinant-2"
      ],
      "is_active": true,
      "name": "test-variant-template",
      "modified_by": {
        "username": "917995805578_05620",
        "user_id": "f5b6a54b394b4ad89784c342"
      },
      "modified_on": "2022-10-06T17:42:24.315000",
      "is_physical": true,
      "is_archived": false,
      "categories": [
        "test-variant-l3"
      ],
      "attributes": [
        "test-variant-field",
        "test-variant-field-2",
        "variant-field-3"
      ],
      "logo": "https://hdn-1.addsale.com/addsale/products/pictures/template/logo/original/1UZtJvzM0-test-variant-template.png",
      "id": "633e88ec76ff74c90d39e2a8"
    }
  ]
}
```
</details>









---


### deleteProductTemplate
Delete a Product Template by slug.




```java
catalog.deleteProductTemplate( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `slug` is a unique identifier for a particular product template. |  



Delete a Product Template by slug.

*Returned Response:*




[SuccessSingleResponse](#SuccessSingleResponse)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "Success"
}
```
</details>









---


### updateProductTemplate
Update a Product Template by Slug.




```java
catalog.updateProductTemplate( slug, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `uid` is a unique identifier for a particular product template. |  
| body | [ProductTemplateModel](#ProductTemplateModel) | yes | Request body |


Update a Product Template by slug using the API.

*Returned Response:*




[ProductTemplateModel](#ProductTemplateModel)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "slug": "test-variant-template",
  "departments": [
    "test-variant-attribute",
    "test-varinant-2"
  ],
  "is_active": true,
  "name": "test-variant-template",
  "is_archived": false,
  "categories": [
    "test-variant-l3"
  ],
  "attributes": [
    "test-variant-field",
    "test-variant-field-2",
    "variant-field-3"
  ],
  "logo": "https://hdn-1.addsale.com/addsale/products/pictures/template/logo/original/1UZtJvzM0-test-variant-template.png"
}
```
</details>









---


### getProductTemplate
Get Product Template by Slug.




```java
catalog.getProductTemplate( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `slug` is a unique identifier for a particular product template. |  



Get Product Template by slug using the API.

*Returned Response:*




[ProductTemplateModel](#ProductTemplateModel)

Returns a success response




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "slug": "test-variant-template",
  "departments": [
    "test-variant-attribute",
    "test-varinant-2"
  ],
  "is_active": true,
  "name": "test-variant-template",
  "is_archived": false,
  "categories": [
    "test-variant-l3"
  ],
  "attributes": [
    "test-variant-field",
    "test-variant-field-2",
    "variant-field-3"
  ],
  "logo": "https://hdn-1.addsale.com/addsale/products/pictures/template/logo/original/1UZtJvzM0-test-variant-template.png"
}
```
</details>









---


### downloadProductTemplateViews
Download Product Template View




```java
client.catalog.downloadProductTemplateViews( slug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `slug` is a unique identifier for a particular template. |   
| companyId | String | yes | A `company_id` is a unique identifier for a particular seller account. |  



Allows you to download product template data

*Returned Response:*




[String](#String)

CSV File of product template data. See example below or refer `TemplatesResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### validateProductTemplate
Validate Product Template Schema




```java
client.catalog.validateProductTemplate( slug,  itemType,  bulk) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| slug | String | yes | A `slug` is a unique identifier for a particular template. |   
| companyId | String | yes | A `company_id` is a unique identifier for a particular company. |   
| itemType | String? | no | Item type of the product template. |   
| bulk | Boolean? | no | A `bulk` parameter is a filter to get all the product templates for bulk. |  



Allows you to list all product templates validation values for all the fields present in the database

*Returned Response:*




[TemplatesValidationResponse](#TemplatesValidationResponse)

List of fields and validation values fro each. See example below or refer `TemplatesValidationResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
null
```
</details>









---


### getProducts
Get product list




```java
client.catalog.getProducts( brandIds,  categoryIds,  itemIds,  departmentIds,  itemCode,  q,  tags,  pageNo,  pageSize) {
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




[ProductListingResponse](#ProductListingResponse)

Product Meta. See example below for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "name": "TV Set",
      "description": "Tv",
      "country_of_origin": "India",
      "currency": "INR",
      "short_description": "",
      "is_set": true,
      "item_code": "TVSET111",
      "brand_uid": 1,
      "template_tag": "television",
      "highlights": [
        "42 Inch"
      ],
      "slug": "tv-set",
      "_custom_json": {},
      "l3_mapping": [
        "electronics>qled_television"
      ],
      "image_nature": "standard",
      "departments": [
        1
      ],
      "created_on": 1599024995,
      "created_by": {
        "username": "919049753052_37528",
        "user_id": "5"
      },
      "modified_on": 1627642010,
      "modified_by": {
        "username": "xxxxxxxxxx",
        "user_id": "xxxxxxxxxxx"
      },
      "stage": "verified",
      "uid": 7501547,
      "verified_by": {
        "username": "Silverbolt",
        "user_id": "0"
      },
      "verified_on": "2020-07-23T04:20:43.810000Z",
      "all_sizes": [
        {
          "item_code": "TVSET111",
          "brand_uid": 1,
          "seller_identifier": "HGS272727272",
          "identifiers": [
            {
              "gtin_type": "ean",
              "gtin_value": "HGS272727272",
              "primary": true
            }
          ],
          "company_id": 1,
          "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)",
          "marked_price": 35000
        }
      ],
      "category_slug": "qled-television",
      "is_image_less_product": false,
      "media": [
        {
          "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png",
          "type": "image"
        }
      ],
      "variants": {},
      "product_publish": {
        "is_set": false,
        "product_online_date": 1626965521
      },
      "is_dependent": false,
      "is_physical": true,
      "item_type": "set",
      "category_uid": 1,
      "custom_order": {
        "manufacturing_time": 2,
        "is_custom_order": true,
        "manufacturing_time_unit": "days"
      },
      "multi_size": true,
      "no_of_boxes": 1,
      "product_group_tag": [],
      "size_guide": "slim-fit-shirts-for-men",
      "tags": [],
      "teaser_tag": {},
      "synonyms": [],
      "hsn_code": "11111111",
      "return_config": {
        "unit": "days",
        "returnable": false,
        "time": 0
      },
      "all_company_ids": [
        1
      ],
      "all_identifiers": [
        "19WE100"
      ],
      "trader": {
        "address": "sdfdsfsdf",
        "name": "asdasd"
      },
      "trader_type": "Packer",
      "verification_status": "pending",
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
      "id": "5f4f2f6371a5970001f13655",
      "brand": {
        "name": "Apple",
        "logo": {
          "aspect_ratio": "1:1",
          "aspect_ratio_f": 1,
          "url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png",
          "secure_url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png"
        },
        "uid": 13
      },
      "images": [
        {
          "aspect_ratio": "16:25",
          "aspect_ratio_f": 0.64,
          "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png",
          "secure_url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png"
        }
      ],
      "price": {
        "marked": {
          "min": 35000,
          "max": 35000
        },
        "effective": {
          "min": 25000,
          "max": 25000
        }
      }
    }
  ],
  "page": {
    "type": "number",
    "current": 1,
    "size": 1,
    "item_total": 1,
    "has_previous": false,
    "has_next": false
  }
}
```
</details>









---


### createProduct
Create a product.




```java
client.catalog.createProduct(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company associated to product that is to be viewed. |  
| body | [ProductCreateUpdate](#ProductCreateUpdate) | yes | Request body |


This API allows to create product.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

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


### getProduct
Get a single product.




```java
client.catalog.getProduct( itemCode,  itemId,  brandUid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| itemCode | String? | no | Item code of the product. |   
| companyId | Integer | yes | Company Id of the product. |   
| itemId | Integer | yes | Item Id of the product. |   
| brandUid | Integer? | no | Brand Id of the product. |  



This API helps to get data associated to a particular product.

*Returned Response:*




[Product](#Product)

Product object. See example below or refer `product.utils.format_product_response` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "template_tag": "industrial-supplies",
    "brand_uid": 1486,
    "currency": "INR",
    "item_code": "TP_FS_01",
    "slug": "printed-fyndstore-packaging-tape-4inch-x-6-meter-length-pack-of-2-49d7343fc677",
    "name": "Printed Fyndstore Packaging Tape (4inch X 6 Meter length) - Pack of 2",
    "hsn_code": "48190000",
    "country_of_origin": "India",
    "description": "FyndStore 4 inch Printed BOPP Tapes ",
    "is_set": true,
    "is_active": true,
    "departments": [
      11
    ],
    "uid": 1282497,
    "category_slug": "printed-tape",
    "company_id": 884,
    "media": [
      {
        "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/TPFS01/IMG20200624130956.jpg",
        "type": "image"
      }
    ],
    "variants": {},
    "is_dependent": false,
    "item_type": "set",
    "multi_size": true,
    "product_publish": {
      "is_set": false,
      "product_online_date": "2020-09-10T15:16:12.322000Z"
    },
    "id": "5f5a433c74f3f400017cdaa0",
    "brand": {
      "name": "RollUp",
      "logo": {
        "aspect_ratio": "1:1",
        "aspect_ratio_f": 1,
        "url": "https://hdn-1.fynd.com/brands/pictures/square-logo/50x0/mPBaWqGRnjR-RMOnlpdMPKm-yjn5mua63gfmzdpombb1.png",
        "secure_url": "https://hdn-1.fynd.com/brands/pictures/square-logo/50x0/mPBaWqGRnjR-RMOnlpdMPKm-yjn5mua63gfmzdpombb1.png"
      },
      "uid": 1486
    },
    "return_config": {
      "returnable": true,
      "time": 30,
      "unit": "days"
    },
    "sizes": [
      {
        "item_dimensions_unit_of_measure": "cm",
        "item_weight": 0.15,
        "set": {
          "quantity": 1,
          "size_distribution": {
            "sizes": [
              {
                "pieces": 1,
                "size": "OS"
              }
            ]
          }
        },
        "item_height": 10.16,
        "item_width": 10.16,
        "price_effective": 999,
        "size": "OS",
        "seller_identifier": "TP_FS_01",
        "brand_uid": 1486,
        "price": 1000,
        "item_weight_unit_of_measure": "gram",
        "currency": "INR",
        "item_length": 10.16,
        "item_code": "TP_FS_01",
        "company_id": 884,
        "is_set": true,
        "track_inventory": true,
        "identifiers": [
          {
            "gtin_value": "TP_FS_01",
            "primary": true,
            "gtin_type": "sku_code"
          }
        ],
        "price_transfer": 0,
        "id": "5f5a433c74f3f400017cdaa1",
        "store_count": 1
      }
    ],
    "attributes": {
      "style": "TPFS01",
      "color": "White",
      "pallet": 1,
      "l3_mapping": [
        "industrial_supplies>printed_tape"
      ],
      "image_nature": "standard",
      "created_on": "2020-09-10T15:16:12.322000Z",
      "created_by": {
        "username": "sumitdafda_gofynd_com_68387",
        "user_id": "23108029",
        "company_id": 884
      },
      "modified_on": "2020-09-24T04:51:00.229000Z",
      "modified_by": {
        "username": "sumitdafda_gofynd_com_68387",
        "user_id": "23108029",
        "company_id": 884
      },
      "stage": "verified",
      "verified_by": {
        "username": "sumitdafda_gofynd_com_68387",
        "user_id": "23108029",
        "company_id": 884
      },
      "verified_on": 1600923060,
      "is_image_less_product": false,
      "other_available_sizes": []
    }
  }
}
```
</details>









---


### deleteProduct
Delete a product.




```java
client.catalog.deleteProduct( itemId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Company Id of the company associated to product that is to be deleted. |   
| itemId | Integer | yes | Id of the product to be updated. |  



This API allows to delete product.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

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


### editProduct
Edit a product.




```java
client.catalog.editProduct( itemId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company associated to product that is to be viewed. |   
| itemId | Integer | yes | Id of the product to be updated. |  
| body | [ProductCreateUpdate](#ProductCreateUpdate) | yes | Request body |


This API allows to edit product.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

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


### verifyCompany
Verify a company.




```java
client.catalog.verifyCompany( q,  opted,  pageNo,  pageSize,  status,  brandIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a seller account. |   
| q | String? | no | A `q` parameter is used to search the company by its name. |   
| opted | Boolean? | no | A `opted` parameter is a filter to get all the opted companies. |   
| pageNo | Boolean? | no | A `page_no` parameter is a number of the page requested. |   
| pageSize | Boolean? | no | A `page_size` is the no of items per page. |   
| status | Boolean? | no | A `status` parameter is to filter the companies by their status ['pending', 'verified', 'rejected']. |   
| brandIds | Integer? | no | A `brand_ids` parameter is a filter to get all the companies with the brand_ids. |  



Verify a company.

*Returned Response:*




[CompanyVerificationResponse](#CompanyVerificationResponse)

List of variants data. See example below or refer `CompanyVerificationResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "name": "auto_company_6920221331602",
      "uid": 13430,
      "stats": {}
    },
    {
      "name": "auto_company_6920221331717",
      "uid": 13431,
      "stats": {}
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 1643,
    "has_previous": false,
    "has_next": true,
    "item_total": 3286
  }
}
```
</details>









---


### listProductVerification
List all Product Verification for a company.




```java
client.catalog.listProductVerification( q,  opted,  pageNo,  pageSize,  status,  brandIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | A `company_id` is a unique identifier for a seller account. |   
| q | String? | no | A `q` parameter is used to search the company by its name. |   
| opted | Boolean? | no | A `opted` parameter is a filter to get all the opted companies. |   
| pageNo | Boolean? | no | A `page_no` parameter is a number of the page requested. |   
| pageSize | Boolean? | no | A `page_size` is the no of items per page. |   
| status | Boolean? | no | A `status` parameter is to filter the companies by their status ['pending', 'verified', 'rejected']. |   
| brandIds | Integer? | no | A `brand_ids` parameter is a filter to get all the companies with the brand_ids. |  



List all Product Verification for a company.

*Returned Response:*




[ProductVerificaionResponse](#ProductVerificaionResponse)

List of variants data. See example below or refer `ProductVerificaionResponse` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "remark": "",
      "product": {
        "item_code": "JHGT-8732",
        "name": "Product - 1",
        "brand_uid": 2,
        "slug": "product---1-rl9o_bdhb",
        "template_tag": "bags",
        "uid": 75672254,
        "media": []
      },
      "status": "pending",
      "modified_by": {
        "super_user": false,
        "username": "shivamtomar_gofynd_com_58898",
        "user_id": "ac8ad3826e279222cde2b6c7"
      },
      "created_by": {
        "super_user": false,
        "username": "rajamishra_gofynd_com_94675",
        "user_id": "43c7609d3a236d3c6ccadf2c"
      },
      "modified_on": "2022-10-06T16:29:01.011000",
      "brand_uid": 2,
      "slug": "product---1-rl9o_bdhb",
      "item_code": "JHGT-8732",
      "rejected_fields": {},
      "item_id": 75672254,
      "_id": "633e986dc674690d374b90c1",
      "company_ids": [
        1
      ],
      "created_on": "2022-10-06T08:57:17.114000",
      "id": "633e986dc674690d374b90c1"
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 5342,
    "has_previous": false,
    "has_next": true,
    "item_total": 5342
  }
}
```
</details>









---


### getProductVerificationDetails
Get the verification detail of a product




```java
client.catalog.getProductVerificationDetails( itemId,  id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a seller account. |   
| itemId | Integer | yes | A `item_id` is a unique identifier for a specific product. |   
| id | Integer | yes | An `_id` is a unique identifier for a specific product. |  



Get the verification detail of a product

*Returned Response:*




[ProductVerificationModel](#ProductVerificationModel)

Product verification data. See example below or refer `ProductVerificationModelSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "633e986dc674690d374b90c1",
  "created_by": {
    "username": "rajamishra_gofynd_com_94675",
    "super_user": false,
    "user_id": "43c7609d3a236d3c6ccadf2c"
  },
  "status": "pending",
  "item_code": "JHGT-8732",
  "created_on": "2022-10-06T08:57:17.114000Z",
  "modified_by": {
    "username": "shivamtomar_gofynd_com_58898",
    "super_user": false,
    "user_id": "ac8ad3826e279222cde2b6c7"
  },
  "company_ids": [
    1
  ],
  "remark": "",
  "brand_uid": 2,
  "item_id": 75672254,
  "modified_on": "2022-10-06T16:29:01.011000Z",
  "rejected_fields": {},
  "slug": "product---1-rl9o_bdhb",
  "id": "633e986dc674690d374b90c1",
  "next_product": {
    "remark": "",
    "product": {
      "template_tag": "clothing",
      "name": "Grey Tapered Jeans Test test edit MK1",
      "media": [
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/1.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/2.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/3.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/4.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/5.jpg",
          "type": "image"
        }
      ]
    },
    "status": "pending",
    "modified_by": {
      "super_user": false,
      "username": "shivamgupta_gofynd_com_65285",
      "user_id": "baedb8e9354283b52d073f8a"
    },
    "created_by": {
      "username": "silverbolt",
      "user_id": "0"
    },
    "modified_on": "2022-10-06T05:54:11.941000",
    "brand_uid": 1,
    "slug": "being-human-grey-tapered-jeans-2",
    "item_code": "BHDC6007@GREY",
    "rejected_fields": {},
    "item_id": 2223,
    "_id": "611a0df9a323ed9bf696060c",
    "company_ids": [
      1,
      46,
      61
    ],
    "created_on": "2021-08-16T07:04:25.492000",
    "id": "611a0df9a323ed9bf696060c"
  }
}
```
</details>









---


### verifyProduct
Verify the Product.




```java
client.catalog.verifyProduct( itemId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | A `company_id` is a unique identifier for a seller account. |   
| itemId | Integer | yes | A `item_id` is a unique identifier for a specific product. |  
| body | [ProductVerification](#ProductVerification) | yes | Request body |


Verify the Product.

*Returned Response:*




[ProductVerificationModel](#ProductVerificationModel)

Product verification data. See example below or refer `ProductVerificationModelSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "633e986dc674690d374b90c1",
  "created_by": {
    "username": "rajamishra_gofynd_com_94675",
    "super_user": false,
    "user_id": "43c7609d3a236d3c6ccadf2c"
  },
  "status": "pending",
  "item_code": "JHGT-8732",
  "created_on": "2022-10-06T08:57:17.114000Z",
  "modified_by": {
    "username": "shivamtomar_gofynd_com_58898",
    "super_user": false,
    "user_id": "ac8ad3826e279222cde2b6c7"
  },
  "company_ids": [
    1
  ],
  "remark": "",
  "brand_uid": 2,
  "item_id": 75672254,
  "modified_on": "2022-10-06T16:29:01.011000Z",
  "rejected_fields": {},
  "slug": "product---1-rl9o_bdhb",
  "id": "633e986dc674690d374b90c1",
  "next_product": {
    "remark": "",
    "product": {
      "template_tag": "clothing",
      "name": "Grey Tapered Jeans Test test edit MK1",
      "media": [
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/1.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/2.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/3.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/4.jpg",
          "type": "image"
        },
        {
          "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/1_BHDC6007@GREY/5.jpg",
          "type": "image"
        }
      ]
    },
    "status": "pending",
    "modified_by": {
      "super_user": false,
      "username": "shivamgupta_gofynd_com_65285",
      "user_id": "baedb8e9354283b52d073f8a"
    },
    "created_by": {
      "username": "silverbolt",
      "user_id": "0"
    },
    "modified_on": "2022-10-06T05:54:11.941000",
    "brand_uid": 1,
    "slug": "being-human-grey-tapered-jeans-2",
    "item_code": "BHDC6007@GREY",
    "rejected_fields": {},
    "item_id": 2223,
    "_id": "611a0df9a323ed9bf696060c",
    "company_ids": [
      1,
      46,
      61
    ],
    "created_on": "2021-08-16T07:04:25.492000",
    "id": "611a0df9a323ed9bf696060c"
  }
}
```
</details>









---


### getSizeGuides
Get list of size guides




```java
client.catalog.getSizeGuides( active,  q,  tag,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Id of the company for which the size guides are to be fetched. |   
| active | Boolean? | no | filter size guide on basis of active, in-active |   
| q | String? | no | Query that is to be searched. |   
| tag | String? | no | to filter size guide on basis of tag. |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |  



This API allows to view all the size guides associated to the seller.

*Returned Response:*




[ListSizeGuide](#ListSizeGuide)

Size guide object. See example below or refer `ListSizeGuide` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "modified_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "active": true,
      "id": "60364384f08385bee776f83d",
      "title": "Demo SG",
      "modified_on": "2021-02-24T17:46:04.146000Z",
      "brand_id": 2,
      "created_by": {
        "username": "silverbolt",
        "user_id": "-1"
      },
      "subtitle": "I am demo",
      "company_id": 12,
      "created_on": "2021-02-24T17:46:04.146000Z",
      "guide": {
        "meta": {
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
          ],
          "unit": "cm",
          "headers": {
            "col_1": {
              "value": "Head",
              "convertable": false
            },
            "col_2": {
              "value": "Shoulder",
              "convertable": true
            }
          }
        }
      },
      "tag": "demo",
      "name": "Demo"
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


### createSizeGuide
Create a size guide.




```java
catalog.createSizeGuide(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ValidateSizeGuide](#ValidateSizeGuide) | yes | Request body |


This API allows to create a size guide associated to a brand.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

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


### getSizeGuide
Get a single size guide.




```java
catalog.getSizeGuide( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | Id of the size guide to be viewed. |  



This API helps to get data associated to a size guide.

*Returned Response:*




[SizeGuideResponse](#SizeGuideResponse)

Brand object. See example below or refer `SizeGuideResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "active": true,
  "brand_id": 1,
  "created_on": "2021-02-24T17:46:04.146000Z",
  "modified_on": "2021-02-25T15:19:30.822000Z",
  "created_by": {
    "username": "silverbolt",
    "user_id": "-1"
  },
  "modified_by": {
    "username": "917827311650_22960",
    "user_id": "123"
  },
  "name": "edited size guide",
  "company_id": 1,
  "guide": {
    "meta": {
      "headers": {
        "col_1": {
          "value": "Head",
          "convertable": false
        },
        "col_2": {
          "value": "Shoulder",
          "convertable": true
        }
      },
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
      ],
      "unit": "cm"
    }
  },
  "tag": "demo",
  "title": "Demo SG",
  "subtitle": "I am demo",
  "id": "60364384f08385bee776f83d"
}
```
</details>









---


### updateSizeGuide
Edit a size guide.




```java
catalog.updateSizeGuide( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| id | String | yes | Mongo id of the size guide to be edited |  
| body | [ValidateSizeGuide](#ValidateSizeGuide) | yes | Request body |


This API allows to edit a size guide.

*Returned Response:*




[SuccessResponse](#SuccessResponse)

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


### getAppProducts
Get application-wise products.




```java
catalog.getAppProducts( brandIds,  categoryIds,  departmentIds,  tags,  pageNo,  pageSize,  q) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| applicationId | String | yes | A `application_id` is a unique identifier for a particular sale channel. |   
| brandIds | List<Integer>? | no | Get multiple products filtered by Brand Ids |   
| categoryIds | List<Integer>? | no | Get multiple products filtered by Category Ids |   
| departmentIds | List<Integer>? | no | Get multiple products filtered by Department Ids |   
| tags | List<String>? | no | Get multiple products filtered by tags |   
| pageNo | Integer? | no | The page number to navigate through the given set of results |   
| pageSize | Integer? | no | Number of items to retrieve in each page. Default is 10. |   
| q | String? | no | Search with Item Code, Name, Slug or Identifier. |  



Products are the core resource of an application. Products can be associated by categories, collections, brands and more. If successful, returns a Product resource in the response body specified in `ApplicationProductListingResponseDatabasePowered`

*Returned Response:*




[ProductListingResponse](#ProductListingResponse)

The Product object. See example below or refer `ApplicationProductListingResponseDatabasePowered` for details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "name": "TV Set",
      "description": "Tv",
      "country_of_origin": "India",
      "currency": "INR",
      "short_description": "",
      "is_set": true,
      "item_code": "TVSET111",
      "brand_uid": 1,
      "template_tag": "television",
      "highlights": [
        "42 Inch"
      ],
      "slug": "tv-set",
      "_custom_json": {},
      "l3_mapping": [
        "electronics>qled_television"
      ],
      "image_nature": "standard",
      "departments": [
        1
      ],
      "created_on": 1599024995,
      "created_by": {
        "username": "919049753052_37528",
        "user_id": "5"
      },
      "modified_on": 1627642010,
      "modified_by": {
        "username": "xxxxxxxxxx",
        "user_id": "xxxxxxxxxxx"
      },
      "stage": "verified",
      "uid": 7501547,
      "verified_by": {
        "username": "Silverbolt",
        "user_id": "0"
      },
      "verified_on": 1626965521,
      "all_sizes": [
        {
          "item_code": "TVSET111",
          "brand_uid": 1,
          "seller_identifier": "HGS272727272",
          "identifiers": [
            {
              "gtin_type": "ean",
              "gtin_value": "HGS272727272",
              "primary": true
            }
          ],
          "company_id": 1,
          "size": "XXLX23, MX11, LX67, XLX45 (146 PCS)",
          "marked_price": 35000
        }
      ],
      "category_slug": "qled-television",
      "is_image_less_product": false,
      "media": [
        {
          "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png",
          "type": "image"
        }
      ],
      "variants": {},
      "product_publish": {
        "is_set": false,
        "product_online_date": 1627642009
      },
      "is_dependent": false,
      "is_physical": true,
      "item_type": "set",
      "category_uid": 1,
      "custom_order": {
        "manufacturing_time": 2,
        "is_custom_order": true,
        "manufacturing_time_unit": "days"
      },
      "multi_size": true,
      "no_of_boxes": 1,
      "product_group_tag": [],
      "size_guide": "slim-fit-shirts-for-men",
      "tags": [],
      "teaser_tag": {},
      "synonyms": [],
      "hsn_code": "11111111",
      "return_config": {
        "unit": "days",
        "returnable": false,
        "time": 0
      },
      "all_company_ids": [
        1
      ],
      "all_identifiers": [
        "19WE100"
      ],
      "trader": {
        "address": "sdfdsfsdf",
        "name": "asdasd"
      },
      "trader_type": "Packer",
      "verification_status": "pending",
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
      "id": "5f4f2f6371a5970001f13655",
      "brand": {
        "name": "Apple",
        "logo": {
          "aspect_ratio": "1:1",
          "aspect_ratio_f": 1,
          "url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png",
          "secure_url": "https://hdn-1.jiox0.de/jioecomm/seller/pictures/logo/50x0/apple-7f951c/logo_apple.png"
        },
        "uid": 13
      },
      "images": [
        {
          "aspect_ratio": "16:25",
          "aspect_ratio_f": 0.64,
          "url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png",
          "secure_url": "https://hdn-1.addsale.com/x0/products/pictures/item/free/135x0/dcizgsG_Y-Tv-Set.png"
        }
      ],
      "price": {
        "marked": {
          "min": 35000,
          "max": 35000
        },
        "effective": {
          "min": 25000,
          "max": 25000
        }
      }
    }
  ],
  "page": {
    "type": "number",
    "current": 1,
    "size": 1,
    "item_total": 1,
    "has_previous": false,
    "has_next": false
  }
}
```
</details>









---


### listBulkImportJobs
Bulk Import.




```java
catalog.listBulkImportJobs( jobType,  search,  stage,  startDate,  endDate,  pageNo,  pageSize,  total) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |   
| search | String? | no | Can search item by passing name of that in search parameter. |   
| stage | String? | no | Can search based on their stage |   
| startDate | String? | no | getting items from specific start date |   
| endDate | String? | no | get items from specific end date |   
| pageNo | Integer? | no | The page number to navigate through the given set of results, default is 1. |   
| pageSize | Integer? | no | Number of items to retrieve in each page, default is 12. |   
| total | Integer? | no | Total number of items required in response |  



Bulk Import using the API.

*Returned Response:*




[BulkImportResponse](#BulkImportResponse)

Success Response. See example below or refer Object for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "tracking_url": "http://localhost:6000",
      "created_by": {
        "username": "manojpatidar_gofynd_com_86609",
        "user_id": "ad35b88a78d5753be6f59c4b"
      },
      "stage": "in-progress",
      "job_type": "attribute",
      "stats": {
        "total": 100000,
        "succeed": 0,
        "cancelled": 0,
        "failed": 0
      },
      "failed_records": [],
      "created_on": "2022-11-30T12:57:33.698000Z",
      "cancelled_records": [],
      "modified_by": {
        "username": "manojpatidar_gofynd_com_86609",
        "user_id": "ad35b88a78d5753be6f59c4b"
      },
      "file_type": "excel",
      "modified_on": "2022-11-30T12:57:33.698000Z",
      "is_active": true,
      "id": "638705ec331c1ef28858f78a"
    }
  ],
  "page": {
    "type": "number",
    "current": 1,
    "size": 1,
    "item_total": 1,
    "has_previous": false,
    "has_next": false
  }
}
```
</details>









---


### createBulkImportJob
Create a bulk import job for specific job type.




```java
catalog.createBulkImportJob( jobType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |  
| body | [BulkImportCreateRequest](#BulkImportCreateRequest) | yes | Request body |


Create a bulk import job for specific job type.

*Returned Response:*




[BulkImportJobModel](#BulkImportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_type": "attribute",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "modified_on": "2022-11-30T13:22:53.419092",
  "stage": "in-progress",
  "cancelled_records": [],
  "is_active": true,
  "failed_records": [],
  "tracking_url": "http://localhost:6000",
  "file_type": "excel",
  "created_on": "2022-11-30T13:22:53.419092",
  "stats": {
    "total": 100000,
    "failed": 0,
    "succeed": 0,
    "cancelled": 0
  },
  "batch_id": "63870bd527f2950659b6ab0e"
}
```
</details>









---


### getBulkImportJob
Get bulk import job details for given job id.




```java
catalog.getBulkImportJob( jobType,  jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |   
| jobId | String | yes | Job id for which the data will be returned. |  



Get bulk import job details for given job id.

*Returned Response:*




[BulkImportJobModel](#BulkImportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_type": "attribute",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "modified_on": "2022-11-30T13:22:53.419092",
  "stage": "in-progress",
  "cancelled_records": [],
  "is_active": true,
  "failed_records": [],
  "tracking_url": "http://localhost:6000",
  "file_type": "excel",
  "created_on": "2022-11-30T13:22:53.419092",
  "stats": {
    "total": 100000,
    "failed": 0,
    "succeed": 0,
    "cancelled": 0
  },
  "batch_id": "63870bd527f2950659b6ab0e"
}
```
</details>









---


### updateBulkImportJob
Update bulk import job details for given job id.




```java
catalog.updateBulkImportJob( jobType,  jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |   
| jobId | String | yes | Job id for which the data will be updated. |  



Update bulk import job details for given job id.

*Returned Response:*




[BulkImportJobModel](#BulkImportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "job_type": "attribute",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "modified_on": "2022-11-30T13:22:53.419092",
  "stage": "in-progress",
  "cancelled_records": [],
  "is_active": true,
  "failed_records": [],
  "tracking_url": "http://localhost:6000",
  "file_type": "excel",
  "created_on": "2022-11-30T13:22:53.419092",
  "stats": {
    "total": 100000,
    "failed": 0,
    "succeed": 0,
    "cancelled": 0
  },
  "batch_id": "63870bd527f2950659b6ab0e"
}
```
</details>









---


### listBulkExportJobs
Bulk Export.




```java
catalog.listBulkExportJobs( jobType,  search,  stage,  startDate,  endDate,  pageNo,  pageSize,  total) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |   
| search | String? | no | Can search item by passing name of that in search parameter. |   
| stage | String? | no | Can search based on their stage |   
| startDate | String? | no | getting items from specific start date |   
| endDate | String? | no | get items from specific end date |   
| pageNo | Integer? | no | The page number to navigate through the given set of results, default is 1. |   
| pageSize | Integer? | no | Number of items to retrieve in each page, default is 12. |   
| total | Integer? | no | Total number of items required in response |  



Bulk Export using the API.

*Returned Response:*




[BulkExportResponse](#BulkExportResponse)

Success Response. See example below or refer Object for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "modified_on": "2022-11-30T15:23:37.263000Z",
      "modified_by": {
        "user_id": "ad35b88a78d5753be6f59c4b",
        "username": "manojpatidar_gofynd_com_86609"
      },
      "stage": "in-progress",
      "job_type": "attribute",
      "file_type": "excel",
      "tracking_url": "http://localhost:6000",
      "created_by": {
        "user_id": "ad35b88a78d5753be6f59c4b",
        "username": "manojpatidar_gofynd_com_86609"
      },
      "created_on": "2022-11-30T15:23:37.263000Z",
      "is_active": true,
      "id": "63872823f30e794e9639e213"
    }
  ],
  "page": {
    "type": "number",
    "current": 1,
    "size": 1,
    "item_total": 1,
    "has_previous": false,
    "has_next": false
  }
}
```
</details>









---


### createBulkExportJob
Create a bulk export job for specific job type.




```java
catalog.createBulkExportJob( jobType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier for an entity. |  
| body | [BulkExportRequestCreate](#BulkExportRequestCreate) | yes | Request body |


Create a bulk export job for specific job type.

*Returned Response:*




[BulkExportJobModel](#BulkExportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "modified_on": "2022-11-30T15:23:37.263584",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "stage": "in-progress",
  "job_type": "attribute",
  "file_type": "excel",
  "tracking_url": "http://localhost:6000",
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_on": "2022-11-30T15:23:37.263584",
  "is_active": true,
  "batch_id": "63872823f30e794e9639e213"
}
```
</details>









---


### getBulkExportJob
Get bulk export job details for given job id.




```java
catalog.getBulkExportJob( jobType,  jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier for an entity. |   
| jobId | String | yes | Job id for which the data will be returned. |  



Get bulk export job details for given job id.

*Returned Response:*




[BulkExportJobModel](#BulkExportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "modified_on": "2022-11-30T15:23:37.263584",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "stage": "in-progress",
  "job_type": "attribute",
  "file_type": "excel",
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_on": "2022-11-30T15:23:37.263584",
  "is_active": true,
  "id": "63872823f30e794e9639e213"
}
```
</details>









---


### updateBulkExportJob
Update bulk export job details for given job id.




```java
catalog.updateBulkExportJob( jobType,  jobId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier for an entity. |   
| jobId | String | yes | Job id for which the data will be update. |  



Update bulk export job details for given job id.

*Returned Response:*




[BulkExportJobModel](#BulkExportJobModel)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "modified_on": "2022-11-30T15:23:37.263584",
  "modified_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "stage": "in-progress",
  "job_type": "attribute",
  "file_type": "excel",
  "created_by": {
    "user_id": "ad35b88a78d5753be6f59c4b",
    "username": "manojpatidar_gofynd_com_86609"
  },
  "created_on": "2022-11-30T15:23:37.263584",
  "is_active": true,
  "id": "63872823f30e794e9639e213"
}
```
</details>









---


### getImportValidationSchema
Return validation schema for specific job type.




```java
catalog.getImportValidationSchema( jobType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |  



Return validation schema for specific job type.

*Returned Response:*




[BulkImportValidation](#BulkImportValidation)

Success Response. See example below or refer for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "schema": {
    "title": "DepartmentValidationSchema",
    "type": "object",
    "properties": {
      "data": {
        "title": "Data",
        "description": "department data",
        "type": "array",
        "items": {
          "$ref": "#/definitions/_Department"
        }
      }
    },
    "required": [
      "data"
    ],
    "definitions": {
      "_Department": {
        "title": "_Department",
        "type": "object",
        "properties": {
          "name": {
            "title": "Name",
            "description": "name of the deplartment.",
            "type": "string"
          },
          "slug": {
            "title": "Slug",
            "description": "slug of the department.",
            "type": "string"
          },
          "logo": {
            "title": "Logo",
            "description": "url of logo for department.",
            "minLength": 1,
            "maxLength": 2083,
            "format": "uri",
            "type": "string"
          }
        },
        "required": [
          "name",
          "slug",
          "logo"
        ]
      }
    }
  }
}
```
</details>









---


### downloadImportFile
Downlload a sample file for specific job type and file type.




```java
catalog.downloadImportFile( jobType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| jobType | String | yes | A `job_type` is a unique identifier. |  



Downlload a sample file for specific job type and file type.

*Returned Response:*




[String](#String)

CSV File of different job type data.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAllHsnCodes
Hsn Code List.




```java
catalog.getAllHsnCodes( pageNo,  pageSize,  q,  type) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Integer? | no | page no |   
| pageSize | Integer? | no | page size |   
| q | String? | no | search using hsn code, description, reporting_hsn |   
| type | String? | no | search using type |  



Hsn Code List.

*Returned Response:*




[HsnCodesListingResponseSchemaV2](#HsnCodesListingResponseSchemaV2)

List of all HSN Codes. See example below or refer `HsnCodesListingResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "tax_on_esp": true,
      "id": "619e17925e3d3ea77d6fe8cf",
      "hs2_code": "26",
      "modified_on": "2021-11-25T06:37:00.880000Z",
      "description": "final test updated",
      "tax_on_mrp": false,
      "slabs": [
        {
          "threshold": 100,
          "effective_date": "2021-11-18T10:00:31.798000+00:00",
          "tax": 10
        },
        {
          "threshold": 200,
          "effective_date": "2022-11-18T10:00:31.798000+00:00",
          "tax": 20
        }
      ],
      "hsn_code": "123fght3",
      "uid": "123fgh43-1"
    }
  ],
  "page": {
    "current": 1,
    "type": "number",
    "size": 8,
    "has_previous": false,
    "has_next": true,
    "item_total": 8
  }
}
```
</details>









---


### createHsnCodev2
Create Hsn Code.




```java
catalog.createHsnCodev2(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [HSNDataV2](#HSNDataV2) | yes | Request body |


Create Hsn Code.

*Returned Response:*




[HsnCodeCreateUpdateResponseSchemaV2](#HsnCodeCreateUpdateResponseSchemaV2)

See example below for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "country_code": "IN",
  "type": "goods",
  "modified_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "hsn_code": "89787179",
  "taxes": [
    {
      "effective_date": "2022-02-11T15:00:00",
      "cess": 23,
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
  "reporting_hsn": "89787179H27",
  "created_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "description": "Data for HSN Code",
  "id": "6216fd5316586b6295f3be76"
}
```
</details>









---


### getSingleHSNCode
Hsn Code List.




```java
catalog.getSingleHSNCode( reportingHsn) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| reportingHsn | String | yes | reporting_hsn |  



Hsn Code List.

*Returned Response:*




[HSNDataInsertV2](#HSNDataInsertV2)

Get specific HSN details. See example below or refer `HsnCodesListingResponseSchema` for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "description": "Data for HSN Code",
  "created_on": "2022-02-24T09:14:03Z",
  "created_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "modified_on": "2022-02-24T09:14:03Z",
  "reporting_hsn": "89787179H29",
  "modified_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "country_code": "IN",
  "taxes": [
    {
      "effective_date": "2022-02-11T15:00:00",
      "rate": 5,
      "threshold": 10000,
      "cess": 23
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
  "type": "goods",
  "hsn_code": "89787179",
  "id": "6216ff0378da3f906fc82544"
}
```
</details>









---


### updateHsnCode
update Hsn Code.




```java
catalog.updateHsnCode( reportingHsn, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| reportingHsn | String | yes | reporting hsn to update the data |  
| body | [HSNDataV2](#HSNDataV2) | yes | Request body |


update Hsn Code.

*Returned Response:*




[HsnCodeCreateUpdateResponseSchemaV2](#HsnCodeCreateUpdateResponseSchemaV2)

See example below for details




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "country_code": "IN",
  "type": "goods",
  "modified_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "hsn_code": "89787179",
  "taxes": [
    {
      "effective_date": "2022-02-11T15:00:00",
      "cess": 23,
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
  "reporting_hsn": "89787179H27",
  "created_by": {
    "username": "silverbolt",
    "user_id": -1
  },
  "description": "Data for HSN Code",
  "id": "6216fd5316586b6295f3be76"
}
```
</details>









---



### Schemas

 
 
 #### [Media](#Media)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | landscape | String |  no  |  |
 | logo | String |  no  |  |
 | portrait | String |  no  |  |

---


 
 
 #### [Hierarchy](#Hierarchy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | department | Integer |  no  |  |
 | l1 | Integer |  no  |  |
 | l2 | Integer |  no  |  |

---


 
 
 #### [CategoryMappingValues](#CategoryMappingValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | catalogId | Integer? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [CategoryMapping](#CategoryMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | google | [CategoryMappingValues](#CategoryMappingValues)? |  yes  |  |
 | ajio | [CategoryMappingValues](#CategoryMappingValues)? |  yes  |  |
 | facebook | [CategoryMappingValues](#CategoryMappingValues)? |  yes  |  |

---


 
 
 #### [Category](#Category)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tryouts | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<Integer> |  no  |  |
 | media | [Media](#Media)? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)>? |  yes  |  |
 | name | String |  no  |  |
 | createdOn | String? |  yes  |  |
 | marketplaces | [CategoryMapping](#CategoryMapping)? |  yes  |  |
 | slug | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | level | Integer |  no  |  |
 | modifiedOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | type | String |  no  |  |
 | itemTotal | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | current | Integer? |  yes  |  |
 | size | Integer? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [CategoryResponse](#CategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Category](#Category)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | code | String? |  yes  |  |
 | status | Integer? |  yes  |  |
 | error | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CategoryRequestBody](#CategoryRequestBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tryouts | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<Integer> |  no  |  |
 | media | [Media](#Media)? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | hierarchy | ArrayList<[Hierarchy](#Hierarchy)>? |  yes  |  |
 | name | String |  no  |  |
 | marketplaces | [CategoryMapping](#CategoryMapping)? |  yes  |  |
 | slug | String? |  yes  |  |
 | isActive | Boolean |  no  |  |
 | level | Integer |  no  |  |

---


 
 
 #### [CategoryCreateResponse](#CategoryCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [SingleCategoryResponse](#SingleCategoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [Category](#Category)? |  yes  |  |

---


 
 
 #### [CategoryUpdateResponse](#CategoryUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [UserSerializer](#UserSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | contact | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [GetDepartment](#GetDepartment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorityOrder | Integer? |  yes  |  |
 | createdBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | slug | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | search | String? |  yes  |  |
 | modifiedBy | [UserSerializer](#UserSerializer)? |  yes  |  |
 | itemType | String? |  yes  |  |
 | pageNo | Integer? |  yes  |  |
 | logo | String? |  yes  |  |
 | pageSize | Integer? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [DepartmentsResponse](#DepartmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetDepartment](#GetDepartment)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [DepartmentErrorResponse](#DepartmentErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | code | String? |  yes  |  |
 | status | Integer? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DepartmentCreateUpdate](#DepartmentCreateUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorityOrder | Integer |  no  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | name | String |  no  |  |
 | cls | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |
 | platforms | HashMap<String,Object>? |  yes  |  |
 | logo | String |  no  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [UserDetail](#UserDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superUser | Boolean? |  yes  |  |
 | contact | String? |  yes  |  |
 | userId | String |  no  |  |
 | username | String |  no  |  |

---


 
 
 #### [DepartmentModel](#DepartmentModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorityOrder | Integer |  no  |  |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | synonyms | ArrayList<String>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | name | String |  no  |  |
 | slug | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | cls | String? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | logo | String |  no  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [DepartmentCreateErrorResponse](#DepartmentCreateErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String? |  yes  |  |

---


 
 
 #### [DepartmentCreateResponse](#DepartmentCreateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [AttributeDetailsResponse](#AttributeDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | slug | String? |  yes  |  |

---


 
 
 #### [ShuffleAttributeDataResponse](#ShuffleAttributeDataResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributeDetails | ArrayList<[AttributeDetailsResponse](#AttributeDetailsResponse)>? |  yes  |  |
 | sequence | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ShuffleAttributesResponse](#ShuffleAttributesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [ShuffleAttributeDataResponse](#ShuffleAttributeDataResponse)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ShuffleAttributeFilter](#ShuffleAttributeFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sequence | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ShuffleAttributesSuccessResponse](#ShuffleAttributesSuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ShuffleAttributeGroupsResponse](#ShuffleAttributeGroupsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | [ShuffleAttributeFilter](#ShuffleAttributeFilter)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [AttributeMasterGroupComparisons](#AttributeMasterGroupComparisons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |
 | display | Boolean? |  yes  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [AttributeMasterGroupDetails](#AttributeMasterGroupDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |
 | display | Boolean? |  yes  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [AttributeMasterGroupModel](#AttributeMasterGroupModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | comparisons | [AttributeMasterGroupComparisons](#AttributeMasterGroupComparisons)? |  yes  |  |
 | type | String? |  yes  |  |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | details | [AttributeMasterGroupDetails](#AttributeMasterGroupDetails)? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [AttributeGroupsResponse](#AttributeGroupsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [AttributeMasterGroupModel](#AttributeMasterGroupModel)? |  yes  |  |

---


 
 
 #### [AttributeListDetails](#AttributeListDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | templateSlugs | ArrayList<String>? |  yes  |  |
 | display | Boolean? |  yes  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [UserSerializer1](#UserSerializer1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [AttributeGroupListModel](#AttributeGroupListModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | type | String? |  yes  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | details | [AttributeListDetails](#AttributeListDetails) |  no  |  |
 | modifiedOn | [UserSerializer1](#UserSerializer1)? |  yes  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [AttributeGroupListResponse](#AttributeGroupListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AttributeGroupListModel](#AttributeGroupListModel)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [AttributeMasterFilter](#AttributeMasterFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dependsOn | ArrayList<String>? |  yes  |  |
 | indexing | Boolean |  no  |  |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [AttributeSchemaRange](#AttributeSchemaRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | min | Integer? |  yes  |  |
 | max | Integer? |  yes  |  |

---


 
 
 #### [AttributeMaster](#AttributeMaster)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | format | String? |  yes  |  |
 | type | String |  no  |  |
 | allowedValues | ArrayList<String>? |  yes  |  |
 | range | [AttributeSchemaRange](#AttributeSchemaRange)? |  yes  |  |
 | multi | Boolean? |  yes  |  |
 | mandatory | Boolean? |  yes  |  |

---


 
 
 #### [AttributeMasterDetails](#AttributeMasterDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayType | String |  no  |  |

---


 
 
 #### [AttributeMasterModel](#AttributeMasterModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Object? |  yes  |  |
 | isNested | Boolean? |  yes  |  |
 | createdOn | String |  no  |  |
 | enabledForEndConsumer | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | suggestion | String? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | filters | [AttributeMasterFilter](#AttributeMasterFilter) |  no  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | synonyms | HashMap<String,Object>? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | schema | [AttributeMaster](#AttributeMaster) |  no  |  |
 | details | [AttributeMasterDetails](#AttributeMasterDetails) |  no  |  |
 | variant | Boolean? |  yes  |  |
 | rawKey | String? |  yes  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | unit | String? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | logo | String? |  yes  |  |
 | departments | ArrayList<String> |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | slug | String |  no  |  |

---


 
 
 #### [AttributeMasterResponse](#AttributeMasterResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AttributeMasterModel](#AttributeMasterModel)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [UserSerializer2](#UserSerializer2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contact | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [SwatchImageConfig](#SwatchImageConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maintainAspectRatio | Boolean? |  yes  |  |
 | minHeight | Integer? |  yes  |  |
 | aspectRatio | String? |  yes  |  |
 | maxSize | Integer? |  yes  |  |
 | maxHeight | Integer? |  yes  |  |
 | maxWidth | Integer? |  yes  |  |
 | minWidth | Integer? |  yes  |  |
 | fileType | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GetVariantAttributesSerializer](#GetVariantAttributesSerializer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | templates | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | createdBy | [UserSerializer2](#UserSerializer2)? |  yes  |  |
 | display | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | key | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | [UserSerializer2](#UserSerializer2)? |  yes  |  |
 | imageConfig | [SwatchImageConfig](#SwatchImageConfig)? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | displayType | ArrayList<String>? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [Pagination](#Pagination)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalItemCount | Integer |  no  |  |
 | nextPageId | String? |  yes  |  |
 | hasNext | Boolean |  no  |  |
 | hasPrevious | Boolean |  no  |  |

---


 
 
 #### [VariantsListResponse](#VariantsListResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[GetVariantAttributesSerializer](#GetVariantAttributesSerializer)>? |  yes  |  |
 | page | [Pagination](#Pagination) |  no  |  |

---


 
 
 #### [VariantAttributesModel](#VariantAttributesModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | templates | ArrayList<String>? |  yes  |  |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | display | String? |  yes  |  |
 | cls | String? |  yes  |  |
 | key | String? |  yes  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | imageConfig | [SwatchImageConfig](#SwatchImageConfig)? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | displayType | ArrayList<String>? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [VariantCreateUpdateResponse](#VariantCreateUpdateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [VariantDetailResponse](#VariantDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [GetVariantAttributesSerializer](#GetVariantAttributesSerializer)? |  yes  |  |

---


 
 
 #### [ProductTemplate](#ProductTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | isExpirable | Boolean |  no  |  |
 | description | String? |  yes  |  |
 | isPhysical | Boolean |  no  |  |
 | name | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | slug | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | tag | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |

---


 
 
 #### [TemplatesResponse](#TemplatesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | [ProductTemplate](#ProductTemplate)? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PTErrorResponse](#PTErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | code | String? |  yes  |  |
 | status | Integer? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [SuccessSingleResponse](#SuccessSingleResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | Integer? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ProductTemplateModel](#ProductTemplateModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Object? |  yes  |  |
 | createdOn | String |  no  |  |
 | name | String? |  yes  |  |
 | modifiedOn | String |  no  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | attributes | ArrayList<String>? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | isPhysical | Boolean |  no  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | logo | String? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | slug | String |  no  |  |
 | tag | String? |  yes  |  |

---


 
 
 #### [Properties](#Properties)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | variants | HashMap<String,Object>? |  yes  |  |
 | itemCode | HashMap<String,Object>? |  yes  |  |
 | name | HashMap<String,Object>? |  yes  |  |
 | categorySlug | HashMap<String,Object>? |  yes  |  |
 | productGroupTag | HashMap<String,Object>? |  yes  |  |
 | sizeGuide | HashMap<String,Object>? |  yes  |  |
 | currency | HashMap<String,Object>? |  yes  |  |
 | isActive | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | brandUid | HashMap<String,Object>? |  yes  |  |
 | sizes | HashMap<String,Object>? |  yes  |  |
 | productPublish | HashMap<String,Object>? |  yes  |  |
 | hsnCode | HashMap<String,Object>? |  yes  |  |
 | media | HashMap<String,Object>? |  yes  |  |
 | noOfBoxes | HashMap<String,Object>? |  yes  |  |
 | countryOfOrigin | HashMap<String,Object>? |  yes  |  |
 | returnConfig | HashMap<String,Object>? |  yes  |  |
 | command | HashMap<String,Object>? |  yes  |  |
 | shortDescription | HashMap<String,Object>? |  yes  |  |
 | tags | HashMap<String,Object>? |  yes  |  |
 | description | HashMap<String,Object>? |  yes  |  |
 | traderType | HashMap<String,Object>? |  yes  |  |
 | multiSize | HashMap<String,Object>? |  yes  |  |
 | slug | HashMap<String,Object>? |  yes  |  |
 | highlights | HashMap<String,Object>? |  yes  |  |
 | trader | HashMap<String,Object>? |  yes  |  |
 | isDependent | HashMap<String,Object>? |  yes  |  |
 | itemType | HashMap<String,Object>? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [GlobalValidation](#GlobalValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | required | ArrayList<String>? |  yes  |  |
 | type | String? |  yes  |  |
 | definitions | HashMap<String,Object>? |  yes  |  |
 | description | String? |  yes  |  |
 | title | String? |  yes  |  |
 | properties | [Properties](#Properties)? |  yes  |  |

---


 
 
 #### [TemplateValidationData](#TemplateValidationData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | templateValidation | HashMap<String,Object>? |  yes  |  |
 | globalValidation | [GlobalValidation](#GlobalValidation)? |  yes  |  |

---


 
 
 #### [TemplateDetails](#TemplateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | attributes | ArrayList<String>? |  yes  |  |
 | departments | ArrayList<String>? |  yes  |  |
 | isArchived | Boolean? |  yes  |  |
 | isExpirable | Boolean |  no  |  |
 | description | String? |  yes  |  |
 | isPhysical | Boolean |  no  |  |
 | name | String? |  yes  |  |
 | slug | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | tag | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | categories | ArrayList<String>? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [TemplatesValidationResponse](#TemplatesValidationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [TemplateValidationData](#TemplateValidationData)? |  yes  |  |
 | templateDetails | [TemplateDetails](#TemplateDetails)? |  yes  |  |

---


 
 
 #### [Logo](#Logo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | aspectRatioF | Integer? |  yes  |  |
 | aspectRatio | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | [Logo](#Logo)? |  yes  |  |
 | name | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [ProductPublished](#ProductPublished)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productOnlineDate | Integer? |  yes  |  |
 | isSet | Boolean? |  yes  |  |

---


 
 
 #### [Media1](#Media1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |
 | type | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [VerifiedBy](#VerifiedBy)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [ReturnConfigResponse](#ReturnConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  |  |
 | time | Integer? |  yes  |  |
 | returnable | Boolean? |  yes  |  |

---


 
 
 #### [Image](#Image)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | aspectRatioF | Double? |  yes  |  |
 | aspectRatio | String? |  yes  |  |
 | secureUrl | String? |  yes  |  |

---


 
 
 #### [NetQuantityResponse](#NetQuantityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  |  |
 | value | Double? |  yes  |  |

---


 
 
 #### [Trader](#Trader)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [Product](#Product)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | variants | HashMap<String,Object>? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | name | String? |  yes  |  |
 | brand | [Brand](#Brand)? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | categorySlug | String? |  yes  |  |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | moq | HashMap<String,Object>? |  yes  |  |
 | currency | String? |  yes  |  |
 | verifiedOn | String? |  yes  |  |
 | pending | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | brandUid | Integer? |  yes  |  |
 | category | HashMap<String,Object>? |  yes  |  |
 | teaserTag | HashMap<String,Object>? |  yes  |  |
 | sizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |
 | productPublish | [ProductPublished](#ProductPublished)? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | media | ArrayList<[Media1](#Media1)>? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | taxIdentifier | HashMap<String,Object>? |  yes  |  |
 | isExpirable | Boolean? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | isPhysical | Boolean? |  yes  |  |
 | countryOfOrigin | String? |  yes  |  |
 | allCompanyIds | ArrayList<Integer>? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | verifiedBy | [VerifiedBy](#VerifiedBy)? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | returnConfig | [ReturnConfigResponse](#ReturnConfigResponse)? |  yes  |  |
 | id | String? |  yes  |  |
 | shortDescription | String? |  yes  |  |
 | allSizes | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | imageNature | String? |  yes  |  |
 | departments | ArrayList<Integer>? |  yes  |  |
 | color | String? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | stage | String? |  yes  |  |
 | description | String? |  yes  |  |
 | l3Mapping | ArrayList<String>? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | slug | String? |  yes  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | templateTag | String? |  yes  |  |
 | itemType | String? |  yes  |  |
 | categoryUid | Integer? |  yes  |  |
 | images | ArrayList<[Image](#Image)>? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | netQuantity | [NetQuantityResponse](#NetQuantityResponse)? |  yes  |  |
 | trader | ArrayList<[Trader](#Trader)>? |  yes  |  |
 | allIdentifiers | ArrayList<String>? |  yes  |  |

---


 
 
 #### [ProductListingResponse](#ProductListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[Product](#Product)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [TeaserTag](#TeaserTag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tag | String? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [TaxIdentifier](#TaxIdentifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hsnCode | String? |  yes  |  |
 | reportingHsn | String? |  yes  |  |
 | hsnCodeId | String? |  yes  |  |

---


 
 
 #### [ProductPublish](#ProductPublish)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productOnlineDate | String? |  yes  |  |
 | isSet | Boolean? |  yes  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String |  no  |  |
 | time | Integer |  no  |  |
 | returnable | Boolean |  no  |  |

---


 
 
 #### [CustomOrder](#CustomOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manufacturingTimeUnit | String? |  yes  |  |
 | isCustomOrder | Boolean? |  yes  |  |
 | manufacturingTime | Integer? |  yes  |  |

---


 
 
 #### [NetQuantity](#NetQuantity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | unit | String? |  yes  |  |
 | value | Double? |  yes  |  |

---


 
 
 #### [ProductCreateUpdate](#ProductCreateUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | variants | HashMap<String,Object>? |  yes  |  |
 | itemCode | String |  no  |  |
 | name | String |  no  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | categorySlug | String |  no  |  |
 | isImageLessProduct | Boolean? |  yes  |  |
 | productGroupTag | ArrayList<String>? |  yes  |  |
 | sizeGuide | String? |  yes  |  |
 | currency | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | bulkJobId | String? |  yes  |  |
 | brandUid | Integer |  no  |  |
 | teaserTag | [TeaserTag](#TeaserTag)? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | taxIdentifier | [TaxIdentifier](#TaxIdentifier) |  no  |  |
 | isSet | Boolean? |  yes  |  |
 | media | ArrayList<[Media1](#Media1)>? |  yes  |  |
 | noOfBoxes | Integer? |  yes  |  |
 | productPublish | [ProductPublish](#ProductPublish)? |  yes  |  |
 | action | String? |  yes  |  |
 | countryOfOrigin | String |  no  |  |
 | changeRequestId | Object? |  yes  |  |
 | returnConfig | [ReturnConfig](#ReturnConfig) |  no  |  |
 | shortDescription | String? |  yes  |  |
 | departments | ArrayList<Integer> |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | description | String? |  yes  |  |
 | multiSize | Boolean? |  yes  |  |
 | slug | String |  no  |  |
 | variantMedia | HashMap<String,Object>? |  yes  |  |
 | highlights | ArrayList<String>? |  yes  |  |
 | variantGroup | HashMap<String,Object>? |  yes  |  |
 | templateTag | String |  no  |  |
 | trader | ArrayList<[Trader](#Trader)> |  no  |  |
 | requester | String? |  yes  |  |
 | isDependent | Boolean? |  yes  |  |
 | customOrder | [CustomOrder](#CustomOrder)? |  yes  |  |
 | companyId | Integer |  no  |  |
 | itemType | String |  no  |  |
 | netQuantity | [NetQuantity](#NetQuantity)? |  yes  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [CompanyVerificationStats](#CompanyVerificationStats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rejected | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |
 | verified | Integer? |  yes  |  |
 | pending | Integer? |  yes  |  |

---


 
 
 #### [CompanyVerification](#CompanyVerification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | uid | Integer |  no  |  |
 | status | [CompanyVerificationStats](#CompanyVerificationStats)? |  yes  |  |

---


 
 
 #### [BasePage](#BasePage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | type | String |  no  |  |
 | itemTotal | Integer? |  yes  |  |
 | nextId | String? |  yes  |  |
 | size | Integer? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [CompanyVerificationResponse](#CompanyVerificationResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CompanyVerification](#CompanyVerification)>? |  yes  |  |
 | page | [BasePage](#BasePage)? |  yes  |  |

---


 
 
 #### [ProductVerificationModel](#ProductVerificationModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | product | HashMap<String,Object>? |  yes  |  |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | companyIds | ArrayList<Integer> |  no  |  |
 | itemId | Integer |  no  |  |
 | rejectedFields | HashMap<String,Object>? |  yes  |  |
 | itemCode | String |  no  |  |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | slug | String |  no  |  |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | remark | String? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | status | String |  no  |  |
 | brandUid | Integer |  no  |  |
 | modifiedOn | String |  no  |  |

---


 
 
 #### [ProductVerificaionResponse](#ProductVerificaionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ProductVerificationModel](#ProductVerificationModel)>? |  yes  |  |
 | page | [BasePage](#BasePage)? |  yes  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | username | String? |  yes  |  |

---


 
 
 #### [ProductVerification](#ProductVerification)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyIds | ArrayList<Integer> |  no  |  |
 | createdBy | [UserInfo](#UserInfo) |  no  |  |
 | itemId | Integer |  no  |  |
 | rejectedFields | HashMap<String,Object>? |  yes  |  |
 | itemCode | String |  no  |  |
 | createdOn | String |  no  |  |
 | slug | String |  no  |  |
 | remark | String? |  yes  |  |
 | modifiedBy | [UserInfo](#UserInfo) |  no  |  |
 | status | String |  no  |  |
 | brandUid | Integer |  no  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [ListSizeGuide](#ListSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | page | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | values | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | unit | String? |  yes  |  |
 | headers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Guide](#Guide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | [Meta](#Meta)? |  yes  |  |

---


 
 
 #### [ValidateSizeGuide](#ValidateSizeGuide)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | description | String? |  yes  |  |
 | name | String |  no  |  |
 | createdOn | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | guide | [Guide](#Guide)? |  yes  |  |
 | title | String |  no  |  |
 | brandId | Integer? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | image | String? |  yes  |  |
 | tag | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [SizeGuideResponse](#SizeGuideResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | name | String? |  yes  |  |
 | active | Boolean? |  yes  |  |
 | guide | HashMap<String,Object>? |  yes  |  |
 | brandId | Integer? |  yes  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | title | String? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | tag | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [BulkJobsStats](#BulkJobsStats)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | total | Integer |  no  | It contains the count of total records to be uploaded. |
 | failed | Integer? |  yes  | It contains the count of failed records. |
 | cancelled | Integer? |  yes  | It contains the count of cancelled records. |
 | succeed | Integer? |  yes  | It contains the count of successfull records. |

---


 
 
 #### [BulkImportJobModel](#BulkImportJobModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stats | [BulkJobsStats](#BulkJobsStats) |  no  | It contains the stats of job. |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | stage | String? |  yes  | Field to track the current stage of job. |
 | completedOn | String? |  yes  | Date of completion of the job. |
 | jobType | String |  no  | It contains the name of entity for the job. |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | trackingUrl | String |  no  | It contains url of the uploaded file. |
 | isActive | Boolean? |  yes  | Field to track whether the job is active or not. |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  | User email to get notification post completion of the job. |
 | modifiedOn | String |  no  |  |
 | cancelledRecords | ArrayList<HashMap<String,Object>>? |  yes  | It contains all the canceled records with specific message. |
 | failedRecords | ArrayList<HashMap<String,Object>>? |  yes  | It contains all the failed records with specific errors. |
 | fileType | String |  no  | It contains the type of file. |

---


 
 
 #### [PageRequest](#PageRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pageNo | Integer? |  yes  |  |
 | pageSize | Integer? |  yes  |  |

---


 
 
 #### [BulkImportResponse](#BulkImportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkImportJobModel](#BulkImportJobModel)>? |  yes  |  |
 | page | [PageRequest](#PageRequest)? |  yes  |  |

---


 
 
 #### [BulkImportCreateRequest](#BulkImportCreateRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalCount | Integer |  no  | Total no of records for import. |
 | jobType | String |  no  | It contains the name of entity for the job. |
 | trackingUrl | String |  no  | It contains url of the uploaded file. |
 | notificationEmails | ArrayList<String>? |  yes  | User email to get notification post completion of the job. |
 | fileType | String |  no  | It contains the type of file. |

---


 
 
 #### [BulkExportJobModel](#BulkExportJobModel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Object? |  yes  |  |
 | createdBy | [UserDetail](#UserDetail)? |  yes  |  |
 | stage | String? |  yes  | Field to track the current stage of job. |
 | completedOn | String? |  yes  | Date of completion of the job. |
 | jobType | String |  no  | It contains the name of entity for the job. |
 | createdOn | String |  no  |  |
 | verifiedOn | String? |  yes  |  |
 | isActive | Boolean? |  yes  | Field to track whether the job is active or not. |
 | verifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | modifiedBy | [UserDetail](#UserDetail)? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  | User email to get notification post completion of the job. |
 | modifiedOn | String |  no  |  |
 | filters | HashMap<String,Object>? |  yes  | It contains the filters to apply while exporting the data. |
 | fileType | String |  no  | It contains the type of file. |

---


 
 
 #### [BulkExportResponse](#BulkExportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[BulkExportJobModel](#BulkExportJobModel)>? |  yes  |  |
 | page | [PageRequest](#PageRequest)? |  yes  |  |

---


 
 
 #### [BulkExportRequestCreate](#BulkExportRequestCreate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | completedOn | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | filters | HashMap<String,Object>? |  yes  |  |
 | fileType | String |  no  |  |

---


 
 
 #### [BulkImportValidation](#BulkImportValidation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | schema | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [TaxSlab](#TaxSlab)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rate | Double |  no  |  |
 | threshold | Double |  no  |  |
 | cess | Double? |  yes  |  |
 | effectiveDate | String |  no  |  |

---


 
 
 #### [HSNDataInsertV2](#HSNDataInsertV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | countryCode | String |  no  |  |
 | type | String |  no  |  |
 | hsnCode | String |  no  |  |
 | description | String |  no  |  |
 | createdOn | String? |  yes  |  |
 | taxes | ArrayList<[TaxSlab](#TaxSlab)> |  no  |  |
 | reportingHsn | String |  no  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | hsnCodeId | String? |  yes  |  |

---


 
 
 #### [PageResponse](#PageResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | itemTotal | Integer? |  yes  |  |
 | current | String? |  yes  |  |
 | size | Integer? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [HsnCodesListingResponseSchemaV2](#HsnCodesListingResponseSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[HSNDataInsertV2](#HSNDataInsertV2)>? |  yes  |  |
 | page | [PageResponse](#PageResponse)? |  yes  |  |

---


 
 
 #### [HSNDataV2](#HSNDataV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | type | String |  no  |  |
 | hsnCode | String |  no  |  |
 | description | String |  no  |  |
 | taxes | ArrayList<[TaxSlab](#TaxSlab)> |  no  |  |

---


 
 
 #### [HsnCodeCreateUpdateResponseSchemaV2](#HsnCodeCreateUpdateResponseSchemaV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | HashMap<String,Object>? |  yes  |  |
 | countryCode | String |  no  |  |
 | type | String |  no  |  |
 | hsnCode | String |  no  |  |
 | description | String |  no  |  |
 | taxes | ArrayList<[TaxSlab](#TaxSlab)> |  no  |  |
 | reportingHsn | String |  no  |  |
 | modifiedBy | HashMap<String,Object>? |  yes  |  |

---


